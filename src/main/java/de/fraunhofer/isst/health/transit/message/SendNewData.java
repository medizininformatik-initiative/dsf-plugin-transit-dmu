package de.fraunhofer.isst.health.transit.message;

import de.medizininformatik_initiative.processes.common.activity.RetryTaskSender;
import dev.dsf.bpe.v2.ProcessPluginApi;
import dev.dsf.bpe.v2.activity.MessageSendTask;
import dev.dsf.bpe.v2.activity.task.BusinessKeyStrategies;
import dev.dsf.bpe.v2.activity.task.TaskSender;
import dev.dsf.bpe.v2.activity.values.SendTaskValues;
import dev.dsf.bpe.v2.variables.Target;
import dev.dsf.bpe.v2.variables.Variables;
import org.hl7.fhir.r4.model.*;

import java.util.List;
import java.util.stream.Stream;

import static de.fraunhofer.isst.health.transit.ConstantsTransit.*;

public class SendNewData implements MessageSendTask
{
	//private static final Logger logger = LoggerFactory.getLogger(SendNewData.class);

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

        Task.ParameterComponent inputDiz = new Task.ParameterComponent();
        inputDiz.getType().addCoding().setSystem(CODESYSTEM_DMU_TOOLS)
                .setCode(CODESYSTEM_DMU_VALUE_DIZ);
        inputDiz.setValue(new StringType(dizId));

        return Stream.of(documentReferenceParameter, inputDiz).toList();
    }
}
