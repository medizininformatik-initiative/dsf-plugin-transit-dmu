package de.fraunhofer.isst.health.transit.message;

import ca.uhn.fhir.context.FhirContext;
import de.medizininformatik_initiative.processes.common.activity.RetryTaskSender;
import de.medizininformatik_initiative.processes.common.util.ConstantsBase;
import dev.dsf.bpe.v2.ProcessPluginApi;
import dev.dsf.bpe.v2.activity.MessageSendTask;
import dev.dsf.bpe.v2.activity.task.BusinessKeyStrategies;
import dev.dsf.bpe.v2.activity.task.TaskSender;
import dev.dsf.bpe.v2.activity.values.SendTaskValues;
import dev.dsf.bpe.v2.variables.Target;
import dev.dsf.bpe.v2.variables.Variables;
import org.hl7.fhir.r4.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.stream.Stream;

import static de.fraunhofer.isst.health.transit.ConstantsTransit.*;

public class SendNewData implements MessageSendTask
{
	private static final Logger logger = LoggerFactory.getLogger(SendNewData.class);

	public SendNewData()
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

        String documentReferenceValue =	variables.getString(BPMN_EXECUTION_DATA);
        List<Resource> documentReferences = variables.getFhirResourceList(BPMN_EXECUTION_DATA_LIST);

        DocumentReference documentReference = (DocumentReference) documentReferences.stream()
                .filter(task -> task.getIdElement().getIdPart().equals(documentReferenceValue))
                .findFirst().get();


        String dizId = documentReference.getAuthorFirstRep().getIdentifier().getValue();

        Task.ParameterComponent documentReferenceParameter = new Task.ParameterComponent();
        documentReferenceParameter.getType().addCoding().setSystem(CODESYSTEM_DMU_TOOLS)
                .setCode(CODESYSTEM_DMU_VALUE_DOCUMENT_REFERENCE);
        documentReferenceParameter.setValue(new StringType(documentReferenceValue));

        Task.ParameterComponent inputDataSetReference = new Task.ParameterComponent();
        inputDataSetReference.getType().addCoding().setSystem(CODESYSTEM_DMU_TOOLS)
                .setCode(CODESYSTEM_DATA_SHARING_VALUE_DATA_SET_REFERENCE);
        inputDataSetReference.setValue(new StringType(documentReference.getContentFirstRep().getAttachment().getUrl()));

        Task.ParameterComponent inputDiz = new Task.ParameterComponent();
        inputDiz.getType().addCoding().setSystem(CODESYSTEM_DMU_TOOLS)
                .setCode(CODESYSTEM_DMU_VALUE_DIZ);
        inputDiz.setValue(new StringType(dizId));

        Task.ParameterComponent correlationKey = new Task.ParameterComponent();
        correlationKey.getType().addCoding().setSystem(DSF_TASK_CODESYSTEM_BPMNMESSAGE)
                .setCode(DSF_TASK_CORRELATION_KEY);
        correlationKey.setValue(new StringType(variables.getTarget().getCorrelationKey()));

        return Stream.of(correlationKey, documentReferenceParameter, inputDataSetReference, inputDiz).toList();
    }

    /*
	@Override
	protected IdType doSend(FhirWebserviceClient client, Task task)
	{

		// Create FHIR context for R4
		FhirContext ctx = FhirContext.forR4();
		// Serialize to JSON
		String json = ctx
				.newJsonParser()
				.setPrettyPrint(true)
				.encodeResourceToString(task);
		logger.info(json);


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
