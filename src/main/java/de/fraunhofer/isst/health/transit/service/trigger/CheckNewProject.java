package de.fraunhofer.isst.health.transit.service.trigger;

import de.fraunhofer.isst.health.transit.variables.Tasks;
import de.fraunhofer.isst.health.transit.variables.TasksValues;
import dev.dsf.bpe.v2.ProcessPluginApi;
import dev.dsf.bpe.v2.activity.ServiceTask;
import dev.dsf.bpe.v2.client.dsf.DsfClient;
import dev.dsf.bpe.v2.error.ErrorBoundaryEvent;
import dev.dsf.bpe.v2.variables.Variables;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static de.fraunhofer.isst.health.transit.ConstantsTransit.*;

public class CheckNewProject implements ServiceTask
{
	private static final Logger logger = LoggerFactory.getLogger(CheckNewProject.class);

	public CheckNewProject() {
        super();
	}

    @Override
    public void execute(ProcessPluginApi api, Variables variables) throws ErrorBoundaryEvent, Exception {
        String from = variables.getString(BPMN_EXECUTION_VARIABLE_FROM);

        DsfClient dsfClient = api.getDsfClientProvider().getLocal();
        Map<String, List<String>> parameters = new HashMap<>();
        parameters.put("_profile", List.of("http://medizininformatik-initiative.de/fhir/StructureDefinition/task-merge-data-sharing"));
        parameters.put("status", List.of("in-progress"));
        parameters.put("_lastUpdated", List.of("ge" + from));
        Bundle result = dsfClient.search(Task.class, parameters);

        List<Task> tasks = result.getEntry().stream()
                .filter(entry -> entry.getResource() instanceof Task)
                .map(entry -> (Task) entry.getResource())
                .toList();
        // Extract the Task from the Bundle's entry
        List<String> taskIds = result.getEntry().stream()
                .filter(entry -> entry.getResource() instanceof Task)
                .map(entry -> entry.getResource().getIdElement().getIdPart())
                .toList();

        if (taskIds != null && !taskIds.isEmpty()){
            logger.info("Number of New Projects: " + taskIds.size());
            variables.setFhirResourceList(BPMN_EXECUTION_PROJECTS, tasks);
            variables.setVariable(BPMN_EXECUTION_PROJECT_IDS,
                    TasksValues.create(new Tasks(taskIds)));
            variables.setString(BPMN_EXECUTION_NEW_PROJECT, "yes");
        }else{
            variables.setString(BPMN_EXECUTION_NEW_PROJECT, "no");
        }
    }

}
