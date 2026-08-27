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

import java.util.List;
import java.util.stream.Stream;

import static de.fraunhofer.isst.health.transit.ConstantsTransit.*;

public class SendCloseProject implements MessageSendTask
{
	//private static final Logger logger = LoggerFactory.getLogger(SendCloseProject.class);

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

        Task.ParameterComponent questionnaireResponse = new Task.ParameterComponent();
        questionnaireResponse.getType().addCoding().setSystem(CODESYSTEM_DMU_TOOLS)
                .setCode(CODESYSTEM_DMU_VALUE_QUESTIONNARE_RESPONSE);
        questionnaireResponse.setValue(new StringType(questionnaireResponseValue));

        return Stream.of(questionnaireResponse).toList();
    }
}
