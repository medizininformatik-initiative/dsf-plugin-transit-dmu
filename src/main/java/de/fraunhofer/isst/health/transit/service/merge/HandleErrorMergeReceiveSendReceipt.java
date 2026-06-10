package de.fraunhofer.isst.health.transit.service.merge;

import de.fraunhofer.isst.health.transit.ConstantsTransit;
import de.medizininformatik_initiative.processes.common.util.ConstantsBase;
import dev.dsf.bpe.v2.ProcessPluginApi;
import dev.dsf.bpe.v2.activity.ServiceTask;
import dev.dsf.bpe.v2.client.dsf.DelayStrategy;
import dev.dsf.bpe.v2.error.ErrorBoundaryEvent;
import dev.dsf.bpe.v2.variables.Variables;
import org.hl7.fhir.r4.model.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class HandleErrorMergeReceiveSendReceipt implements ServiceTask
{
	private static final Logger logger = LoggerFactory.getLogger(HandleErrorMergeReceiveSendReceipt.class);

	public HandleErrorMergeReceiveSendReceipt()	{
	    super();
    }

    @Override
    public void execute(ProcessPluginApi api, Variables variables) throws ErrorBoundaryEvent, Exception {
        Task startTask = variables.getStartTask();
        Task latestTask = variables.getLatestTask();
        String projectIdentifier = variables
                .getString(ConstantsTransit.BPMN_EXECUTION_VARIABLE_PROJECT_IDENTIFIER);
        String error = variables
                .getString(ConstantsTransit.BPMN_EXECUTION_VARIABLE_DATA_SHARING_MERGE_RECEIVE_ERROR_MESSAGE);

        sendMail(api, latestTask, projectIdentifier, error);
        failTaskIfNotStartTask(api, startTask, latestTask, variables);
    }

	private void sendMail(ProcessPluginApi api, Task latestTask, String projectIdentifier, String error)
	{
		String subject = "Error in process '" + ConstantsTransit.PROCESS_NAME_FULL_TRANSIT + "'";
		String message = "Could not send data-set status receipt for new data-set in process '"
				+ ConstantsTransit.PROCESS_NAME_FULL_TRANSIT + "' for Task with id '"
				+ latestTask.getId() + "' to organization '" + latestTask.getRequester().getIdentifier().getValue()
				+ "' for project-identifier '" + projectIdentifier + "'.\n\nError:\n"
				+ (error == null ? "Unknown" : error);

		api.getMailService().send(subject, message);
	}

	private void failTaskIfNotStartTask(ProcessPluginApi api, Task startTask, Task latestTask, Variables variables)
	{
		if (latestTask != null && startTask != latestTask)
		{
			latestTask.setStatus(Task.TaskStatus.FAILED);

            api.getDsfClientProvider().getLocal()
                    .withRetry(ConstantsBase.DSF_CLIENT_RETRY_6_TIMES,
                            DelayStrategy.constant(ConstantsBase.DSF_CLIENT_RETRY_INTERVAL_5MIN))
                    .update(latestTask);

			variables.updateTask(latestTask);
		}
	}


}
