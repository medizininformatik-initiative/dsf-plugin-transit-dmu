package de.fraunhofer.isst.health.transit.message;

import de.fraunhofer.isst.health.transit.ConstantsTransit;
import de.medizininformatik_initiative.processes.common.activity.RetryTaskSender;
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

import static de.fraunhofer.isst.health.transit.ConstantsTransit.BPMN_EXECUTION_PROJECT;
import static de.fraunhofer.isst.health.transit.ConstantsTransit.BPMN_EXECUTION_PROJECTS;

public class SendNewProject implements MessageSendTask
{
	private static final Logger logger = LoggerFactory.getLogger(SendNewProject.class);

	public SendNewProject()
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

        String projectId =	variables.getString(BPMN_EXECUTION_PROJECT);

        Task.ParameterComponent mergeTaskIdInput = getMergeTaskIdInput(projectId);

        return Stream.of(mergeTaskIdInput)
                .toList();
    }

    private Task.ParameterComponent getMergeTaskIdInput(String mergeId)
    {
        Task.ParameterComponent mergeTaskIdInput = new Task.ParameterComponent();
        mergeTaskIdInput.getType().addCoding().setSystem(ConstantsTransit.CODESYSTEM_DMU_TOOLS)
                .setCode(ConstantsTransit.CODESYSTEM_MERGE_TASK_ID);
        mergeTaskIdInput.setValue(new StringType(mergeId));

        return mergeTaskIdInput;
    }

}
