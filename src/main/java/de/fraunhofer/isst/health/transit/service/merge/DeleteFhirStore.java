package de.fraunhofer.isst.health.transit.service.merge;

import de.fraunhofer.isst.health.transit.ConstantsTransit;
import de.medizininformatik_initiative.processes.common.util.ConstantsBase;
import dev.dsf.bpe.v1.ProcessPluginApi;
import dev.dsf.bpe.v1.activity.AbstractTaskMessageSend;
import dev.dsf.bpe.v1.variables.Variables;
import dev.dsf.fhir.client.FhirWebserviceClient;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.hl7.fhir.r4.model.IdType;
import org.hl7.fhir.r4.model.Identifier;
import org.hl7.fhir.r4.model.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.Stream;

public class DeleteFhirStore extends AbstractTaskMessageSend {
    private static final Logger logger = LoggerFactory.getLogger(DeleteFhirStore.class);

    public DeleteFhirStore(ProcessPluginApi api) {
        super(api);
    }

    @Override
    protected Stream<Task.ParameterComponent> getAdditionalInputParameters(DelegateExecution execution,
                                                                           Variables variables)
    {
        String projectIdentifier = variables
                .getString(ConstantsTransit.DUPIDENTIFIER);
        Task.ParameterComponent projectIdentifierInput = getProjectIdentifierInput(projectIdentifier);

        Stream<Task.ParameterComponent> otherInputs = Stream.of(projectIdentifierInput);

        return Stream.of(otherInputs).reduce(Stream::concat)
                .orElseThrow(() -> new RuntimeException("Could not concat streams"));
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
