package de.fraunhofer.isst.health.transit.service.merge;

import de.fraunhofer.isst.health.transit.ConstantsTransit;
import de.fraunhofer.isst.health.transit.spring.config.DmsProjectFileFhirClientConfig;
import de.fraunhofer.isst.health.transit.spring.config.TransitVariablesConfig;
import de.fraunhofer.isst.health.transit.utils.StoreUtils;
import de.fraunhofer.isst.health.transit.utils.WebServiceClientHelper;
import de.fraunhofer.isst.health.transit.utils.projectfile.helper.MiiFhirComplexClientHelper;
import de.fraunhofer.isst.health.transit.utils.projectfile.mii.MIIPerson;
import dev.dsf.bpe.v2.ProcessPluginApi;
import dev.dsf.bpe.v2.activity.ServiceTask;
import dev.dsf.bpe.v2.error.ErrorBoundaryEvent;
import dev.dsf.bpe.v2.variables.Variables;
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

public class CreateCollectionBundleImplementation implements ServiceTask {
	private static final Logger LOGGER = Logger.getLogger(CreateCollectionBundleImplementation.class.getName());
	private DmsProjectFileFhirClientConfig dmsProjectFileFhirClientConfig;
	private TransitVariablesConfig transitVariablesConfig;

	public CreateCollectionBundleImplementation(DmsProjectFileFhirClientConfig dmsProjectFileFhirClientConfig, TransitVariablesConfig transitVariablesConfig) {
		super();
        this.dmsProjectFileFhirClientConfig = dmsProjectFileFhirClientConfig;
		this.transitVariablesConfig = transitVariablesConfig;
	}

    @Override
    public void execute(ProcessPluginApi api, Variables variables) throws ErrorBoundaryEvent, Exception {
        String fhirStoreUrl = variables.getString(ConstantsTransit.FHIRSTOREURL);
        LOGGER.log(Level.INFO, "Start CreateCollectionBundleImplementation for Fhir Store: "+fhirStoreUrl);

        String dupIdentifier = variables.getString(ConstantsTransit.DUPIDENTIFIER);
        String parameter = URLEncoder.encode(fhirStoreUrl, StandardCharsets.UTF_8);

        Optional<String> questionnareResponseId = api.getTaskHelper().getFirstInputParameterStringValue(variables.getLatestTask(),
                CODESYSTEM_DMU_TOOLS, CODESYSTEM_DMU_VALUE_QUESTIONNARE_RESPONSE);

        LOGGER.log(Level.INFO, "Latest Task for extracting Questionnare Response: "+variables.getLatestTask().getId());
        LOGGER.log(Level.INFO, "Questionnare Response ID: "+questionnareResponseId.get());

        variables.setString(ConstantsTransit.QUESTIONNAIREID, questionnareResponseId.orElse(""));

        String collectionURL = createCollectionBundle(api, dupIdentifier, fhirStoreUrl, variables);

        if ("error".equalsIgnoreCase(collectionURL)) {
            LOGGER.severe("Collection could not be created");
        } else {
            LOGGER.log(Level.INFO, "Collection-URL: " + collectionURL);
        }
        variables.setString(ConstantsTransit.COLLECTIONURL, collectionURL);
    }

	public String createCollectionBundle(ProcessPluginApi api, String dupIdentifier, String url, Variables variables) {
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
				Bundle bundle = (Bundle) WebServiceClientHelper.getFhirResource(url + s);
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
								link.get(0).getUrl());

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

			variables.setFhirResource(ConstantsTransit.COLLECTION_BUNDLE, collectionBundle);

			content = StoreUtils.getFHIRCONTEXT().newJsonParser().encodeResourceToString(collectionBundle);
			returnUrl = StoreUtils.createDownloadFile(transitVariablesConfig, fileName, content);
			LOGGER.info("Created Data-File: " + fileName);

			//} else {
			//    LOGGER.warning("Created CollectionBundle is empty!");
			//}

			MiiFhirComplexClientHelper miiFhirClientHelper = new MiiFhirComplexClientHelper(api, dupIdentifier,  dmsProjectFileFhirClientConfig);
			ArrayList<MIIPerson> scientists = miiFhirClientHelper.getDataUsageProject().getPersonGroup().getResearcher();

			//Create DB-Entries for Access-Control of File
            if (transitVariablesConfig.getSetAccessList()) {
                StoreUtils.setAccessList(transitVariablesConfig, dupIdentifier, fileName, scientists);
            }

			return returnUrl;

		} catch (Exception e) {
			LOGGER.info("Could not upload Collection-Bundle: " + e.getMessage());
			return returnUrl;
		}
	}

}
