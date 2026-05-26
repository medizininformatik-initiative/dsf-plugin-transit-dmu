package de.fraunhofer.isst.health.transit.service.merge;

import de.fraunhofer.isst.health.transit.ConstantsTransit;
import dev.dsf.bpe.v1.ProcessPluginApi;
import dev.dsf.bpe.v1.activity.AbstractServiceDelegate;
import dev.dsf.bpe.v1.variables.Variables;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.hl7.fhir.r4.model.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HandleErrorMergeRelease extends AbstractServiceDelegate
{
	private static final Logger logger = LoggerFactory.getLogger(HandleErrorMergeRelease.class);

	public HandleErrorMergeRelease() {
	}

	@Override
	protected void doExecute(DelegateExecution execution, Variables variables)
	{
		Task startTask = variables.getStartTask();
		String projectIdentifier = variables
				.getString(ConstantsTransit.BPMN_EXECUTION_VARIABLE_PROJECT_IDENTIFIER);
		String error = variables
				.getString(ConstantsTransit.BPMN_EXECUTION_VARIABLE_DATA_SHARING_MERGE_RELEASE_ERROR_MESSAGE);

		sendMail(startTask, projectIdentifier, error);
	}

	private void sendMail(Task startTask, String projectIdentifier, String error)
	{
		logger.warn("{} - creating new user-task 'release-merged-data-set'", error);

		String subject = "Error in process '" + ConstantsTransit.PROCESS_NAME_FULL_TRANSIT + "'";
		String message = "Could not merge data-sets in process '"
				+ ConstantsTransit.PROCESS_NAME_FULL_TRANSIT + "' for Task with id '"
				+ startTask.getId() + "' requested from organization '"
				+ startTask.getRequester().getIdentifier().getValue() + "' for project-identifier '" + projectIdentifier
				+ "'.\n\nError:\n" + (error == null ? "Unknown" : error) + "\n\n"
				+ "Please repair the error and answer again the new user-task 'release-merged-data-set'.";

		api.getMailService().send(subject, message);
	}
}
