package de.fraunhofer.isst.health.transit.message;

import de.medizininformatik_initiative.processes.common.activity.RetryTaskSender;
import dev.dsf.bpe.v2.ProcessPluginApi;
import dev.dsf.bpe.v2.activity.MessageSendTask;
import dev.dsf.bpe.v2.activity.task.BusinessKeyStrategies;
import dev.dsf.bpe.v2.activity.task.TaskSender;
import dev.dsf.bpe.v2.activity.values.SendTaskValues;
import dev.dsf.bpe.v2.variables.Target;
import dev.dsf.bpe.v2.variables.Variables;
import org.hl7.fhir.r4.model.StringType;
import org.hl7.fhir.r4.model.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.stream.Stream;

import static de.fraunhofer.isst.health.transit.ConstantsTransit.*;

public class SendCloseProject implements MessageSendTask
{
	private static final Logger logger = LoggerFactory.getLogger(SendCloseProject.class);

	public SendCloseProject()
	{
		super();
	}

    @Override
    public TaskSender getTaskSender(ProcessPluginApi api, Variables variables,
                                    SendTaskValues sendTaskValues) {
        return new RetryTaskSender(api, variables, sendTaskValues,
                BusinessKeyStrategies.SAME,
                (target) -> getAdditionalInputParameters(api, variables, sendTaskValues, target));
    }

    @Override
    public List<Task.ParameterComponent> getAdditionalInputParameters(ProcessPluginApi api,
                                                                      Variables variables, SendTaskValues sendTaskValues, Target target) {

        String questionnaireResponseValue =	variables.getString(BPMN_EXECUTION_PROCESS);
        List<Task> tasks = variables.getFhirResourceList(BPMN_EXECUTION_PROJECTS);

        Task.ParameterComponent questionnaireResponse = new Task.ParameterComponent();
        questionnaireResponse.getType().addCoding().setSystem(CODESYSTEM_DMU_TOOLS)
                .setCode(CODESYSTEM_DMU_VALUE_QUESTIONNARE_RESPONSE);
        questionnaireResponse.setValue(new StringType(questionnaireResponseValue));

        return Stream.of(questionnaireResponse).toList();
    }


    /*
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
    @Override
    protected IdType doSend(FhirWebserviceClient client, Task task)
    {
        return client.withMinimalReturn()
                .withRetry(ConstantsBase.DSF_CLIENT_RETRY_6_TIMES, ConstantsBase.DSF_CLIENT_RETRY_INTERVAL_5MIN)
                .create(task);
    }
     */

}
