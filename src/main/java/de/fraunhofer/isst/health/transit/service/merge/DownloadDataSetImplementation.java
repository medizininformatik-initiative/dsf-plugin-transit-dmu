package de.fraunhofer.isst.health.transit.service.merge;

import ca.uhn.fhir.rest.api.SearchStyleEnum;
import ca.uhn.fhir.rest.client.api.IGenericClient;
import ca.uhn.fhir.rest.gclient.StringClientParam;
import de.fraunhofer.isst.health.transit.ConstantsTransit;
import de.fraunhofer.isst.health.transit.spring.config.DmsFhirClientConfig;
import de.fraunhofer.isst.health.transit.spring.config.DmsProjectFileFhirClientConfig;
import de.fraunhofer.isst.health.transit.spring.config.TransitVariablesConfig;
import de.fraunhofer.isst.health.transit.utils.ResultFormatter;
import de.fraunhofer.isst.health.transit.utils.projectfile.enums.EDataUsageProjectCode;
import de.fraunhofer.isst.health.transit.utils.projectfile.helper.MiiFhirComplexClientHelper;
import de.fraunhofer.isst.health.transit.utils.projectfile.mii.MIITask;
import de.fraunhofer.isst.health.transit.utils.projectfile.status.DataUsageProjectStatus;
import de.medizininformatik_initiative.processes.common.util.ConstantsBase;
import dev.dsf.bpe.v2.ProcessPluginApi;
import dev.dsf.bpe.v2.activity.ServiceTask;
import dev.dsf.bpe.v2.client.dsf.DelayStrategy;
import dev.dsf.bpe.v2.client.dsf.DsfClient;
import dev.dsf.bpe.v2.error.ErrorBoundaryEvent;
import dev.dsf.bpe.v2.variables.Variables;
import org.hl7.fhir.r4.model.*;

import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

import static de.fraunhofer.isst.health.transit.ConstantsTransit.*;

public class DownloadDataSetImplementation implements ServiceTask {

    private static final Logger LOGGER = Logger.getLogger(DownloadDataSetImplementation.class.getName());

    private DmsProjectFileFhirClientConfig dmsProjectFileFhirClientConfig;
    private TransitVariablesConfig transitVariablesConfig;
    private DmsFhirClientConfig dmsFhirClientConfig;

    public DownloadDataSetImplementation(
            DmsProjectFileFhirClientConfig dmsProjectFileFhirClientConfig,
            TransitVariablesConfig transitVariablesConfig,
            DmsFhirClientConfig dmsFhirClientConfig) {

        super();
        this.dmsProjectFileFhirClientConfig = dmsProjectFileFhirClientConfig;
        this.transitVariablesConfig = transitVariablesConfig;
        this.dmsFhirClientConfig = dmsFhirClientConfig;
    }

    @Override
    public void execute(ProcessPluginApi api, Variables variables) throws ErrorBoundaryEvent, Exception {
        LOGGER.log(Level.INFO, "Start DownloadDataSetImplementation");

        DsfClient inboxClient = api.getDsfClientProvider().getByEndpointUrl(dmsFhirClientConfig.getFhirStoreBaseUrl());

        setVariables(api, variables);

        String dizId = variables.getString(ConstantsTransit.CURRENTDIZID);

        String bundleID = variables.getString(ConstantsTransit.BUNDLEID
                + ConstantsTransit.DIZSEPERATOR
                + dizId);
        String documentID = variables.getString(ConstantsTransit.DOCUMENTID
                + ConstantsTransit.DIZSEPERATOR
                + dizId);
        String binaryID = variables.getString(ConstantsTransit.BINARYID
                + ConstantsTransit.DIZSEPERATOR
                + dizId);

        LOGGER.log(Level.INFO, "dizID: " + dizId);

        if (!Objects.equals(bundleID, "NA")) {
            LOGGER.log(Level.INFO, "bundleID: " + bundleID);
            Resource bundle = inboxClient.read(Bundle.class, bundleID);
//			String bundle = downloader.getResourceFromInbox("Bundle", bundleID);
            if (bundle != null && !bundle.isEmpty()) {
                LOGGER.log(Level.INFO, "Bundle loaded");
                variables.setFhirResource(BUNDLE, bundle);
            }
            variables.setFhirResource(BUNDLE, bundle);
        } else {
            LOGGER.log(Level.INFO, "binaryID: " + binaryID);
            Resource binary = inboxClient.read(Binary.class, binaryID);
            //String binary = downloader.getResourceFromInbox("Binary", binaryID);
            if (binary != null && !binary.isEmpty()) {
                LOGGER.log(Level.INFO, "Binary loaded");
                variables.setFhirResource(BINARY, binary);
            }
        }
        LOGGER.log(Level.INFO, "documentID: " + documentID);
        Resource documentReference = inboxClient.read(DocumentReference.class, documentID);
//		String documentReference = downloader.getResourceFromInbox("DocumentReference", documentID);
        if (documentReference != null && !documentReference.isEmpty()) {
            LOGGER.log(Level.INFO, "DocumentReference loaded");
            variables.setFhirResource(DOCUMENT_REFERENCE, documentReference);
        }

        uploadBundleTaskToProjectFile(api, variables);
    }

    private void setVariables(ProcessPluginApi api, Variables variables) {
        Task dataSetTask = variables.getLatestTask();

        String dizId = api.getTaskHelper().getFirstInputParameterStringValue(dataSetTask,
                CODESYSTEM_DMU_TOOLS, CODESYSTEM_DMU_VALUE_DIZ).get();

        variables.setString(ConstantsTransit.CURRENTDIZID, dizId);

        String documentID = api.getTaskHelper().getFirstInputParameterStringValue(dataSetTask,
                CODESYSTEM_DMU_TOOLS, CODESYSTEM_DMU_VALUE_DOCUMENT_REFERENCE).get();

        variables.setString(ConstantsTransit.DOCUMENTID
                + ConstantsTransit.DIZSEPERATOR
                + dizId, documentID);

        String dataSetReference = api.getTaskHelper().getFirstInputParameterStringValue(dataSetTask,
                CODESYSTEM_DMU_TOOLS, CODESYSTEM_DATA_SHARING_VALUE_DATA_SET_REFERENCE).get();

        if (dataSetReference.contains("Binary")) {
            variables.setString(ConstantsTransit.BUNDLEID
                            + ConstantsTransit.DIZSEPERATOR
                            + dizId,
                    "NA");
            variables.setString(ConstantsTransit.BINARYID
                            + ConstantsTransit.DIZSEPERATOR
                            + dizId,
                    dataSetReference.substring(dataSetReference.indexOf("/") + 1));
        } else if (dataSetReference.contains("Bundle")) {
            variables.setString(ConstantsTransit.BINARYID
                            + ConstantsTransit.DIZSEPERATOR
                            + dizId,
                    "NA");
            variables.setString(ConstantsTransit.BUNDLEID
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
     * @param variables the current variables
     */
    public void uploadBundleTaskToProjectFile(ProcessPluginApi api, Variables variables) {
        LOGGER.log(Level.INFO, "Starting update of projectfile");

        LOGGER.log(Level.INFO, "Storing receiveDataSet Task with businessKey: "
                + variables.getBusinessKey()
                + " to projectFile");

        String key = variables.getBusinessKey()
                + ConstantsTransit.DIZSEPERATOR
                + variables.getVariableLocal(ConstantsTransit.CURRENTDIZID);

        String dupIdentifier = variables.getString(ConstantsTransit.DUPIDENTIFIER);
        MiiFhirComplexClientHelper helper = new MiiFhirComplexClientHelper(api, dupIdentifier, this.dmsProjectFileFhirClientConfig);

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

    /*
    private DocumentReference getDocumentReference(String documentReferenceId) {

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
     */

}
