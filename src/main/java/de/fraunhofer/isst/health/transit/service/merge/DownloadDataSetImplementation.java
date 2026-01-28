package de.fraunhofer.isst.health.transit.service.merge;

import ca.uhn.fhir.rest.api.SearchStyleEnum;
import ca.uhn.fhir.rest.client.api.IGenericClient;
import ca.uhn.fhir.rest.gclient.StringClientParam;
import de.fraunhofer.isst.health.transit.ConstantsTransit;
import de.fraunhofer.isst.health.transit.spring.config.DmsProjectFileFhirClientConfig;
import de.fraunhofer.isst.health.transit.spring.config.TransitVariablesConfig;
import de.fraunhofer.isst.health.transit.utils.ResultFormatter;
import de.fraunhofer.isst.health.transit.utils.projectfile.enums.EDataUsageProjectCode;
import de.fraunhofer.isst.health.transit.utils.projectfile.helper.MiiFhirComplexClientHelper;
import de.fraunhofer.isst.health.transit.utils.projectfile.mii.MIITask;
import de.fraunhofer.isst.health.transit.utils.projectfile.status.DataUsageProjectStatus;
import de.medizininformatik_initiative.processes.common.fhir.client.FhirClient;
import de.medizininformatik_initiative.processes.common.fhir.client.FhirClientFactory;
import dev.dsf.bpe.v1.ProcessPluginApi;
import dev.dsf.bpe.v1.activity.AbstractServiceDelegate;
import dev.dsf.bpe.v1.variables.Variables;
import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.hl7.fhir.r4.model.*;

import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

import static de.fraunhofer.isst.health.transit.ConstantsTransit.*;

public class DownloadDataSetImplementation extends AbstractServiceDelegate {

	private static final Logger LOGGER = Logger.getLogger(DownloadDataSetImplementation.class.getName());

	private DmsProjectFileFhirClientConfig dmsProjectFileFhirClientConfig;
	private TransitVariablesConfig transitVariablesConfig;
	private final FhirClientFactory fhirClientFactory;

	public DownloadDataSetImplementation(ProcessPluginApi api,
			DmsProjectFileFhirClientConfig dmsProjectFileFhirClientConfig,
			TransitVariablesConfig transitVariablesConfig,
			FhirClientFactory fhirClientFactory) {
		super(api);
		this.dmsProjectFileFhirClientConfig = dmsProjectFileFhirClientConfig;
		this.transitVariablesConfig = transitVariablesConfig;
		this.fhirClientFactory = fhirClientFactory;
	}

	@Override
	protected void doExecute(DelegateExecution delegateExecution, Variables variables) throws BpmnError, Exception {
		LOGGER.log(Level.INFO, "Start DownloadDataSetImplementation");

		FhirClient fhirClient = fhirClientFactory.getFhirClient();

        setVariables(delegateExecution, variables);

		String dizId = (String) delegateExecution.getVariable(ConstantsTransit.CURRENTDIZID);

		String bundleID = (String) delegateExecution.getVariable(ConstantsTransit.BUNDLEID
				+ ConstantsTransit.DIZSEPERATOR
				+ dizId);
		String documentID = (String) delegateExecution.getVariable(ConstantsTransit.DOCUMENTID
				+ ConstantsTransit.DIZSEPERATOR
				+ dizId);
		String binaryID = (String) delegateExecution.getVariable(ConstantsTransit.BINARYID
				+ ConstantsTransit.DIZSEPERATOR
				+ dizId);

		LOGGER.log(Level.INFO, "dizID: " + dizId);

		if (!Objects.equals(bundleID, "NA")) {
			LOGGER.log(Level.INFO, "bundleID: " + bundleID);
			Resource bundle = fhirClient.read(new IdType("Bundle/"+bundleID));
//			String bundle = downloader.getResourceFromInbox("Bundle", bundleID);
			if (bundle != null && !bundle.isEmpty()) {
				LOGGER.log(Level.INFO, "Bundle loaded");
				variables.setResource(BUNDLE, bundle);
			}
			variables.setResource(BUNDLE, bundle);
		} else {
			LOGGER.log(Level.INFO, "binaryID: " + binaryID);
			Resource binary = fhirClient.read(new IdType("Binary/"+binaryID));
			//String binary = downloader.getResourceFromInbox("Binary", binaryID);
			if (binary != null && !binary.isEmpty()) {
				LOGGER.log(Level.INFO, "Binary loaded");
				variables.setResource(BINARY, binary);
			}
		}
		LOGGER.log(Level.INFO, "documentID: " + documentID);
		Resource documentReference = fhirClient.read(new IdType("DocumentReference/"+documentID));
//		String documentReference = downloader.getResourceFromInbox("DocumentReference", documentID);
		if (documentReference != null && !documentReference.isEmpty()) {
			LOGGER.log(Level.INFO, "DocumentReference loaded");
			variables.setResource(DOCUMENT_REFERENCE, documentReference);
		}

		uploadBundleTaskToProjectFile(delegateExecution);


	}

	private void setVariables(DelegateExecution delegateExecution, Variables variables) {
		Task dataSetTask = variables.getLatestTask();

		String dizId = api.getTaskHelper().getFirstInputParameterStringValue(dataSetTask,
				CODESYSTEM_DMU_TOOLS, CODESYSTEM_DMU_VALUE_DIZ).get();

		delegateExecution.setVariable(ConstantsTransit.CURRENTDIZID, dizId);

		String documentID = api.getTaskHelper().getFirstInputParameterStringValue(dataSetTask,
				CODESYSTEM_DMU_TOOLS, CODESYSTEM_DMU_VALUE_DOCUMENT_REFERENCE).get();

		delegateExecution.setVariable(ConstantsTransit.DOCUMENTID
				+ ConstantsTransit.DIZSEPERATOR
				+ dizId, documentID);

		String dataSetReference = api.getTaskHelper().getFirstInputParameterStringValue(dataSetTask,
				CODESYSTEM_DMU_TOOLS, CODESYSTEM_DATA_SHARING_VALUE_DATA_SET_REFERENCE).get();

		if(dataSetReference.contains("Binary")){
			delegateExecution.setVariable(ConstantsTransit.BUNDLEID
							+ ConstantsTransit.DIZSEPERATOR
							+ dizId,
					"NA");
			delegateExecution.setVariable(ConstantsTransit.BINARYID
							+ ConstantsTransit.DIZSEPERATOR
							+ dizId,
					dataSetReference.substring(dataSetReference.indexOf("/") + 1));
		}else if (dataSetReference.contains("Bundle")){
			delegateExecution.setVariable(ConstantsTransit.BINARYID
							+ ConstantsTransit.DIZSEPERATOR
							+ dizId,
					"NA");
			delegateExecution.setVariable(ConstantsTransit.BUNDLEID
							+ ConstantsTransit.DIZSEPERATOR
							+ dizId,
					dataSetReference.substring(dataSetReference.indexOf("/") + 1));
		}


		//TODO Read documentID and write to Process-Variable
	}

	/**
	 * This method creates a new task in the projectfile, that tracks the status of this data delivery
	 * IMPORTANT: This method also retrieves the store url from the file and stores it in the DelegateExecution.
	 * If this method is no longer in use the step must be moved to a different method or the InsertDataSetImplementation
	 * must access the file directly
	 *
	 * @param delegateExecution the current execution
	 */
	public void uploadBundleTaskToProjectFile(DelegateExecution delegateExecution) {
		LOGGER.log(Level.INFO, "Starting update of projectfile");
		LOGGER.log(Level.INFO, "Storing receiveDataSet Task with businessKey: "
				+ delegateExecution.getBusinessKey()
				+ " to projectFile");

		String key = delegateExecution.getBusinessKey()
				+ ConstantsTransit.DIZSEPERATOR
				+ delegateExecution.getVariableLocal(ConstantsTransit.CURRENTDIZID);

		String dupIdentifier = (String) delegateExecution.getVariable(ConstantsTransit.DUPIDENTIFIER);
		MiiFhirComplexClientHelper helper = new MiiFhirComplexClientHelper(dupIdentifier, this.dmsProjectFileFhirClientConfig);

		MIITask miiTask = new MIITask(this.dmsProjectFileFhirClientConfig);
		miiTask.setDsfId(key);
		miiTask.setGroupId(dupIdentifier);
		miiTask.setPrimitiveStatus(Task.TaskStatus.INPROGRESS);
		miiTask.setPartOf(dupIdentifier);
		miiTask.setCode("receiveDataSet");
		miiTask.setIntent(Task.TaskIntent.ORDER);

		DataUsageProjectStatus status = new DataUsageProjectStatus();
		status.setLastUpdated(new DateTimeType(Calendar.getInstance().getTime()));
		status.setId(key);
		status.setCode(EDataUsageProjectCode.ACTIVE);
		status.setCorrelatedTask(miiTask);

		miiTask.setComplexStatus(status);

		helper.getDataUsageProject().addTask(miiTask);
		helper.getDataUsageProject().addStatus(status);

		List<OperationOutcome.OperationOutcomeIssueComponent> problems = ResultFormatter.filterForError(helper.updateToServer());

		if (!problems.isEmpty()) {
			LOGGER.log(Level.SEVERE, "Updating projectfile failed with " + problems.size() + " errors");
			for (OperationOutcome.OperationOutcomeIssueComponent issueComponent : problems) {
				LOGGER.log(Level.SEVERE, issueComponent.getSeverity().getDisplay() + " " + issueComponent.getDetails().getText());
			}
		} else {
			LOGGER.log(Level.INFO, "Projectfile updated successfully");
		}
	}

	private DocumentReference getDocumentReference(String documentReferenceId)
	{

		this.dmsProjectFileFhirClientConfig.fhirClientFactory().getFhirClient();
		IGenericClient client = this.dmsProjectFileFhirClientConfig.fhirClientFactory().getFhirClient().getGenericFhirClient();

		Bundle result = client
				.search()
				.forResource(DocumentReference.class)
				.where(new StringClientParam("_id").matchesExactly().value(documentReferenceId))
				.returnBundle(Bundle.class)
				.usingStyle(SearchStyleEnum.POST)
				.execute();

		return (DocumentReference) result.getEntryFirstRep().getResource();
	}

}
