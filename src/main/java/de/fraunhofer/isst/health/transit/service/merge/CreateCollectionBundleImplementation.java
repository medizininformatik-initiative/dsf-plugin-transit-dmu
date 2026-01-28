package de.fraunhofer.isst.health.transit.service.merge;

import de.fraunhofer.isst.health.transit.ConstantsTransit;
import de.fraunhofer.isst.health.transit.spring.config.DmsProjectFileFhirClientConfig;
import de.fraunhofer.isst.health.transit.spring.config.TransitVariablesConfig;
import de.fraunhofer.isst.health.transit.utils.StoreUtils;
import de.fraunhofer.isst.health.transit.utils.WebServiceClientHelper;
import de.fraunhofer.isst.health.transit.utils.projectfile.helper.MiiFhirComplexClientHelper;
import de.fraunhofer.isst.health.transit.utils.projectfile.mii.MIIPerson;
import dev.dsf.bpe.v1.ProcessPluginApi;
import dev.dsf.bpe.v1.activity.AbstractServiceDelegate;
import dev.dsf.bpe.v1.variables.Variables;
import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.hl7.fhir.r4.model.Bundle;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

import static de.fraunhofer.isst.health.transit.ConstantsTransit.CODESYSTEM_DMU_TOOLS;
import static de.fraunhofer.isst.health.transit.ConstantsTransit.CODESYSTEM_DMU_VALUE_QUESTIONNARE_RESPONSE;

public class CreateCollectionBundleImplementation extends AbstractServiceDelegate {
	private static final Logger LOGGER = Logger.getLogger(CreateCollectionBundleImplementation.class.getName());
	private DmsProjectFileFhirClientConfig dmsProjectFileFhirClientConfig;
	private TransitVariablesConfig transitVariablesConfig;

	public CreateCollectionBundleImplementation(ProcessPluginApi api, DmsProjectFileFhirClientConfig dmsProjectFileFhirClientConfig, TransitVariablesConfig transitVariablesConfig) {
		super(api);
		this.dmsProjectFileFhirClientConfig = dmsProjectFileFhirClientConfig;
		this.transitVariablesConfig = transitVariablesConfig;
	}

	@Override
	protected void doExecute(DelegateExecution delegateExecution, Variables variables) throws BpmnError, Exception {


		String fhirStoreUrl = (String) delegateExecution.getVariable(ConstantsTransit.FHIRSTOREURL);
		LOGGER.log(Level.INFO, "Start CreateCollectionBundleImplementation for Fhir Store: "+fhirStoreUrl);

		String dupIdentifier = (String) delegateExecution.getVariable(ConstantsTransit.DUPIDENTIFIER);
		String parameter = URLEncoder.encode(fhirStoreUrl, StandardCharsets.UTF_8);

		Optional<String> questionnareResponseId = api.getTaskHelper().getFirstInputParameterStringValue(variables.getLatestTask(),
				CODESYSTEM_DMU_TOOLS, CODESYSTEM_DMU_VALUE_QUESTIONNARE_RESPONSE);

		LOGGER.log(Level.INFO, "Latest Task for extracting Questionnare Response: "+variables.getLatestTask().getId());
		LOGGER.log(Level.INFO, "Questionnare Response ID: "+questionnareResponseId.get());

		delegateExecution.setVariable(ConstantsTransit.QUESTIONNAIREID, questionnareResponseId.orElse(""));

		String collectionURL = createCollectionBundle(dupIdentifier, fhirStoreUrl, variables);

		if ("error".equalsIgnoreCase(collectionURL)) {
			LOGGER.severe("Collection could not be created");
		} else {
			LOGGER.log(Level.INFO, "Collection-URL: " + collectionURL);
		}
		delegateExecution.setVariable(ConstantsTransit.COLLECTIONURL, collectionURL);
	}

	public String createCollectionBundle(String dupIdentifier, String url, Variables variables) {
		String content;
		String returnUrl = "error";

		if (url != null && !url.endsWith("/")) {
			url = url + "/";
		}

		Bundle collectionBundle = new Bundle();
		collectionBundle.setType(Bundle.BundleType.COLLECTION);

		//Lists all resources which are checked for possible content of the Collection-Bundle
		List<String> resourceList = Arrays.asList("Condition", "Consent", "DiagnosticReport", "Immunization", "Medication",
				"MedicationAdministration", "MedicationDispense", "Observation",
				"ObservationDefinition", "OperationDefinition", "OperationOutcome", "Patient", "Person",
				"Practitioner", "Procedure", "Questionnaire", "QuestionnaireResponse", "ResearchStudy", "ResearchSubject");

		try {
			for (String s : resourceList) {
				Bundle bundle = (Bundle) WebServiceClientHelper.getFhirResource(url + s, false);
				assert bundle != null;

				List<Bundle.BundleLinkComponent> link = bundle.getLink().stream()
						.filter(e -> e.getRelation().equals("next"))
						.toList();

				//Skip merging if no resources in searchbundle
				if (!bundle.getEntry().isEmpty()) {
					//process searchbundles with multiple pages (except last page without next-link)
					while (!link.isEmpty()) {
						StoreUtils.mergeBundle(bundle, collectionBundle);
						bundle = (Bundle) WebServiceClientHelper.getFhirResource(
								link.get(0).getUrl(),
								false);

						assert bundle != null;
						link = bundle.getLink().stream()
								.filter(e -> e.getRelation().equals("next"))
								.toList();
					}

					//merge bundles (for bundles without pagination or the last page of bundles with pagination)
					StoreUtils.mergeBundle(bundle, collectionBundle);
				}
			}

			//if (collectionBundle.getEntry().size() > 0) {
			String fileName = "DataFile_" + dupIdentifier + ".json";

			variables.setResource(ConstantsTransit.COLLECTION_BUNDLE, collectionBundle);

			content = StoreUtils.getFHIRCONTEXT().newJsonParser().encodeResourceToString(collectionBundle);
			returnUrl = StoreUtils.createDownloadFile(transitVariablesConfig, fileName, content);
			LOGGER.info("Created Data-File: " + fileName);

			//} else {
			//    LOGGER.warning("Created CollectionBundle is empty!");
			//}

			MiiFhirComplexClientHelper miiFhirClientHelper = new MiiFhirComplexClientHelper(dupIdentifier,  dmsProjectFileFhirClientConfig);
			ArrayList<MIIPerson> scientists = miiFhirClientHelper.getDataUsageProject().getPersonGroup().getResearcher();

			//Create DB-Entries for Access-Control of File
			StoreUtils.setAccessList(transitVariablesConfig, dupIdentifier, fileName, scientists);

			return returnUrl;

		} catch (Exception e) {
			LOGGER.info("Could not upload Collection-Bundle: " + e.getMessage());
			return returnUrl;
		}
	}


}
