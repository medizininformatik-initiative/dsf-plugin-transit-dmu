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
import org.hl7.fhir.r4.model.QuestionnaireResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static de.fraunhofer.isst.health.transit.ConstantsTransit.*;

public class CheckCloseProject extends AbstractServiceDelegate
{
	private static final Logger logger = LoggerFactory.getLogger(CheckCloseProject.class);

	public CheckCloseProject(ProcessPluginApi api)
	{
		super(api);
	}

	@Override
	protected void doExecute(DelegateExecution execution, Variables variables) throws BpmnError, Exception
	{


		String from = variables.getString(BPMN_EXECUTION_VARIABLE_FROM);

		FhirWebserviceClient fhirWebserviceClient = api.getFhirWebserviceClientProvider().getLocalWebserviceClient();
		Map<String, List<String>> parameters = new HashMap<>();
		parameters.put("questionnaire", List.of("http://medizininformatik-initiative.de/fhir/Questionnaire/release-merged-data-set"));
		parameters.put("status", List.of("in-progress"));
		parameters.put("_lastUpdated", List.of("ge" + from));
		Bundle result = fhirWebserviceClient.search(QuestionnaireResponse.class, parameters);

		logger.info("Number of process to close: " + result.getTotal());

		List<QuestionnaireResponse> tasks = result.getEntry().stream()
				.filter(entry -> entry.getResource() instanceof QuestionnaireResponse)
				.map(entry -> (QuestionnaireResponse) entry.getResource())
				.toList();
		// Extract the Task from the Bundle's entry
		List<String> taskIds = result.getEntry().stream()
				.filter(entry -> entry.getResource() instanceof QuestionnaireResponse)
				.map(entry -> entry.getResource().getIdElement().getIdPart())
				.toList();

		if (taskIds != null && !taskIds.isEmpty()){
			variables.setResourceList(BPMN_EXECUTION_CLOSE_PROCESS_LIST, tasks);
			variables.setVariable(BPMN_EXECUTION_CLOSE_PROCESS_IDS,
					TasksValues.create(new Tasks(taskIds)));
			variables.setString(BPMN_EXECUTION_CLOSE_PROCESS, "yes");
		}else{
			variables.setString(BPMN_EXECUTION_CLOSE_PROCESS, "no");		}

	}

}
