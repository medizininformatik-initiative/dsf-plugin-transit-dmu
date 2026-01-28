package de.fraunhofer.isst.health.transit.message;

import de.medizininformatik_initiative.processes.common.util.ConstantsBase;
import dev.dsf.bpe.v1.ProcessPluginApi;
import dev.dsf.bpe.v1.activity.AbstractTaskMessageSend;
import dev.dsf.bpe.v1.variables.Variables;
import dev.dsf.fhir.client.FhirWebserviceClient;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.hl7.fhir.r4.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static de.fraunhofer.isst.health.transit.ConstantsTransit.BPMN_EXECUTION_PROJECT;
import static de.fraunhofer.isst.health.transit.ConstantsTransit.BPMN_EXECUTION_PROJECTS;

public class SendNewProject extends AbstractTaskMessageSend
{
	private static final Logger logger = LoggerFactory.getLogger(SendNewProject.class);

	public SendNewProject(ProcessPluginApi api)
	{
		super(api);
	}

	@Override
	protected Stream<Task.ParameterComponent> getAdditionalInputParameters(DelegateExecution execution,
			Variables variables)
	{

		String projectId =	(String) variables.getVariable(BPMN_EXECUTION_PROJECT);
		List<Task> tasks = variables.getResourceList(BPMN_EXECUTION_PROJECTS);

		Optional<Task> foundTask = tasks.stream()
				.filter(task -> task.getIdElement().getIdPart().equals(projectId))
				.findFirst();

		return foundTask
				.map(task -> task.getInput().stream()
						.filter(input -> {
							String code = input.getType().getCodingFirstRep().getCode();
							return !("message-name".equals(code) || "business-key".equals(code));
						})
				)
				.orElseGet(Stream::empty);

	}

	@Override
	protected IdType doSend(FhirWebserviceClient client, Task task)
	{
		return client.withMinimalReturn()
				.withRetry(ConstantsBase.DSF_CLIENT_RETRY_6_TIMES, ConstantsBase.DSF_CLIENT_RETRY_INTERVAL_5MIN)
				.create(task);
	}

	@Override
	protected void handleSendTaskError(DelegateExecution execution, Variables variables, Exception exception,
			String errorMessage)
	{
		Task task = variables.getStartTask();
		addErrorMessage(task, errorMessage);

		logger.debug("Error while executing Task message send " + this.getClass().getName(), exception);
		logger.error("Process {} has fatal error in step {} for task {}, reason: {}",
				execution.getProcessDefinitionId(), execution.getActivityInstanceId(), task.getId(),
				exception.getMessage());

		try
		{
			if (task != null)
			{
				task.setStatus(Task.TaskStatus.FAILED);
				api.getFhirWebserviceClientProvider().getLocalWebserviceClient().withMinimalReturn().update(task);
			}
			else
			{
				logger.warn("Start Task null, unable update Task with failed state");
			}
		}
		finally
		{
			execution.getProcessEngine().getRuntimeService().deleteProcessInstance(execution.getProcessInstanceId(),
					exception.getMessage());
		}
	}

}
