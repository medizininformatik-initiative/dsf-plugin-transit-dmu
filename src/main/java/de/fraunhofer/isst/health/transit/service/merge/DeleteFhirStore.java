package de.fraunhofer.isst.health.transit.service.merge;

import de.fraunhofer.isst.health.transit.ConstantsTransit;
import de.medizininformatik_initiative.processes.common.activity.RetryTaskSender;
import de.medizininformatik_initiative.processes.common.util.ConstantsBase;
import dev.dsf.bpe.v2.ProcessPluginApi;
import dev.dsf.bpe.v2.activity.MessageSendTask;
import dev.dsf.bpe.v2.activity.task.BusinessKeyStrategies;
import dev.dsf.bpe.v2.activity.task.TaskSender;
import dev.dsf.bpe.v2.activity.values.SendTaskValues;
import dev.dsf.bpe.v2.variables.Target;
import dev.dsf.bpe.v2.variables.Variables;
import org.hl7.fhir.r4.model.Identifier;
import org.hl7.fhir.r4.model.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.stream.Stream;

public class DeleteFhirStore implements MessageSendTask {
    private static final Logger logger = LoggerFactory.getLogger(DeleteFhirStore.class);

    public DeleteFhirStore() {
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

        String projectIdentifier = variables.getString(ConstantsTransit.DUPIDENTIFIER);
        Task.ParameterComponent projectIdentifierInput = getProjectIdentifierInput(projectIdentifier);

        return Stream.of(projectIdentifierInput).toList();
    }

    private Task.ParameterComponent getProjectIdentifierInput(String projectIdentifier)
    {
        Task.ParameterComponent projectIdentifierInput = new Task.ParameterComponent();
        projectIdentifierInput.getType().addCoding().setSystem(ConstantsTransit.CODESYSTEM_DATA_SHARING)
                .setCode(ConstantsTransit.CODESYSTEM_DATA_SHARING_VALUE_PROJECT_IDENTIFIER);
        projectIdentifierInput.setValue(new Identifier().setSystem(ConstantsBase.NAMINGSYSTEM_MII_PROJECT_IDENTIFIER)
                .setValue(projectIdentifier));

        return projectIdentifierInput;
    }

    /*
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
     */

}
