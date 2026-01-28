package de.fraunhofer.isst.health.transit.service.trigger;

import de.fraunhofer.isst.health.transit.variables.Tasks;
import de.fraunhofer.isst.health.transit.variables.TasksValues;
import dev.dsf.bpe.v1.ProcessPluginApi;
import dev.dsf.bpe.v1.activity.AbstractServiceDelegate;
import dev.dsf.bpe.v1.variables.Variables;
import dev.dsf.fhir.client.FhirWebserviceClient;
import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static de.fraunhofer.isst.health.transit.ConstantsTransit.*;

public class CheckNewProject extends AbstractServiceDelegate
{
	private static final Logger logger = LoggerFactory.getLogger(CheckNewProject.class);

	public CheckNewProject(ProcessPluginApi api)
	{
		super(api);
	}

	@Override
	protected void doExecute(DelegateExecution execution, Variables variables) throws BpmnError, Exception
	{

		String from = variables.getString(BPMN_EXECUTION_VARIABLE_FROM);

		FhirWebserviceClient fhirWebserviceClient = api.getFhirWebserviceClientProvider().getLocalWebserviceClient();
		Map<String, List<String>> parameters = new HashMap<>();
		parameters.put("_profile", List.of("http://medizininformatik-initiative.de/fhir/StructureDefinition/task-merge-data-sharing"));
		parameters.put("status", List.of("in-progress"));
		parameters.put("_lastUpdated", List.of("ge" + from));
		Bundle result = fhirWebserviceClient.search(Task.class, parameters);

		logger.info("Number of new Projects: " + result.getTotal());

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
			logger.info("Number of Task Ids: " + taskIds.size());
			variables.setResourceList(BPMN_EXECUTION_PROJECTS, tasks);
			variables.setVariable(BPMN_EXECUTION_PROJECT_IDS,
					TasksValues.create(new Tasks(taskIds)));
			variables.setString(BPMN_EXECUTION_NEW_PROJECT, "yes");
		}else{
			variables.setString(BPMN_EXECUTION_NEW_PROJECT, "no");
		}


	}

}
