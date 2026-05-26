package de.fraunhofer.isst.health.transit.message;

import de.medizininformatik_initiative.processes.common.util.ConstantsBase;
import dev.dsf.bpe.v1.ProcessPluginApi;
import dev.dsf.bpe.v1.activity.AbstractTaskMessageSend;
import dev.dsf.bpe.v1.variables.Variables;
import dev.dsf.fhir.client.FhirWebserviceClient;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.hl7.fhir.r4.model.IdType;
import org.hl7.fhir.r4.model.StringType;
import org.hl7.fhir.r4.model.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.stream.Stream;

import static de.fraunhofer.isst.health.transit.ConstantsTransit.*;

public class SendCloseProject extends AbstractTaskMessageSend
{
	private static final Logger logger = LoggerFactory.getLogger(SendCloseProject.class);

	public SendCloseProject()
	{
		super();
	}

	@Override
	protected Stream<Task.ParameterComponent> getAdditionalInputParameters(DelegateExecution execution,
			Variables variables)
	{


		String questionnaireResponseValue =	(String) variables.getVariable(BPMN_EXECUTION_PROCESS);
		List<Task> tasks = variables.getResourceList(BPMN_EXECUTION_PROJECTS);

		Task.ParameterComponent questionnaireResponse = new Task.ParameterComponent();
		questionnaireResponse.getType().addCoding().setSystem(CODESYSTEM_DMU_TOOLS)
				.setCode(CODESYSTEM_DMU_VALUE_QUESTIONNARE_RESPONSE);
		questionnaireResponse.setValue(new StringType(questionnaireResponseValue));

		return Stream.of(questionnaireResponse);

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
