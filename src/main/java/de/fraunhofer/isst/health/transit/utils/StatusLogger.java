package de.fraunhofer.isst.health.transit.utils;

import de.fraunhofer.isst.health.transit.spring.config.DmsProjectFileFhirClientConfig;
import de.fraunhofer.isst.health.transit.utils.projectfile.enums.EDataUsageProjectCode;
import de.fraunhofer.isst.health.transit.utils.projectfile.helper.MiiFhirComplexClientHelper;
import de.fraunhofer.isst.health.transit.utils.projectfile.mii.DataUsageProject;
import de.fraunhofer.isst.health.transit.utils.projectfile.mii.MIITask;
import de.fraunhofer.isst.health.transit.utils.projectfile.status.DataUsageProjectStatus;
import dev.dsf.bpe.v2.ProcessPluginApi;
import org.hl7.fhir.r4.model.DateTimeType;
import org.hl7.fhir.r4.model.OperationOutcome;
import org.hl7.fhir.r4.model.Task;

import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StatusLogger {
    private static final Logger LOGGER = Logger.getLogger(StatusLogger.class.getName());
    private DmsProjectFileFhirClientConfig dmsProjectFileFhirClientConfig;
    private ProcessPluginApi api;

    public StatusLogger(ProcessPluginApi api, DmsProjectFileFhirClientConfig dmsProjectFileFhirClientConfig) {
        this.dmsProjectFileFhirClientConfig = dmsProjectFileFhirClientConfig;
        this.api = api;
    }

    public void logNewStatus(String dupIdentifier, String taskIdentifier, boolean success) {

        MiiFhirComplexClientHelper helper = new MiiFhirComplexClientHelper(api, dupIdentifier, this.dmsProjectFileFhirClientConfig);
        DataUsageProject dataUsageProject = helper.getDataUsageProject();

        for (MIITask miiTask: dataUsageProject.getTasks()) {
            if (miiTask.getDsfId().equals(taskIdentifier)) {

                // TODO Something with the complex Status. We need a functioning ValueSet for it
                miiTask.getComplexStatus().setLastUpdated(new DateTimeType(Calendar.getInstance().getTime()));

                if (success) {
                    miiTask.setPrimitiveStatus(Task.TaskStatus.COMPLETED);
                    miiTask.getComplexStatus().setCode(EDataUsageProjectCode.ACTIVE);
                } else {
                    miiTask.setPrimitiveStatus(Task.TaskStatus.FAILED);
                    miiTask.getComplexStatus().setCode(EDataUsageProjectCode.CLOSED);
                }
                break;
            }
        }

        for (DataUsageProjectStatus status: dataUsageProject.getStatusList()) {
            if (status.getCorrelatedTask().getDsfId().equals(taskIdentifier)) {
                status.setLastUpdated(new DateTimeType(Calendar.getInstance().getTime()));
                if (success) {
                    status.setCode(EDataUsageProjectCode.ACTIVE);
                } else {
                    status.setCode(EDataUsageProjectCode.CLOSED);
                }
                break;
            }
        }

        List<OperationOutcome.OperationOutcomeIssueComponent> problems = ResultFormatter.filterForError(helper.updateToServer());

        if (!problems.isEmpty()) {

            LOGGER.log(Level.SEVERE, "Updating Task failed with " + problems.size() + " errors");
            for (OperationOutcome.OperationOutcomeIssueComponent issueComponent : problems) {
                LOGGER.log(Level.SEVERE, issueComponent.getSeverity().getDisplay() + " " + issueComponent.getDetails().getText());
            }

        } else {
            LOGGER.log(Level.INFO, "Task updated successfully");
        }
    }
}
