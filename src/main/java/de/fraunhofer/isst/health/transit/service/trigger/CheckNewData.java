package de.fraunhofer.isst.health.transit.service.trigger;

import ca.uhn.fhir.rest.api.SearchStyleEnum;
import ca.uhn.fhir.rest.client.api.IGenericClient;
import ca.uhn.fhir.rest.gclient.StringClientParam;
import de.fraunhofer.isst.health.transit.variables.Tasks;
import de.fraunhofer.isst.health.transit.variables.TasksValues;
import de.medizininformatik_initiative.processes.common.fhir.client.FhirClientFactory;
import dev.dsf.bpe.v1.ProcessPluginApi;
import dev.dsf.bpe.v1.activity.AbstractServiceDelegate;
import dev.dsf.bpe.v1.variables.Variables;
import dev.dsf.fhir.client.FhirWebserviceClient;
import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.DocumentReference;
import org.hl7.fhir.r4.model.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static de.fraunhofer.isst.health.transit.ConstantsTransit.*;

public class CheckNewData extends AbstractServiceDelegate
{
	private static final Logger logger = LoggerFactory.getLogger(CheckNewData.class);
	FhirClientFactory fhirClientFactory;
	public CheckNewData(ProcessPluginApi api, FhirClientFactory fhirClientFactory)
	{
		super(api);
		this.fhirClientFactory = fhirClientFactory;
	}

	@Override
	protected void doExecute(DelegateExecution execution, Variables variables) throws BpmnError, Exception
	{


		String from = variables.getString(BPMN_EXECUTION_VARIABLE_FROM);
		IGenericClient client = fhirClientFactory.getFhirClient().getGenericFhirClient();

		Bundle result = client
				.search()
				.forResource(DocumentReference.class)
				.where(new StringClientParam("status").matches().value("current"))
				.where(new StringClientParam("_lastUpdated").matches().value("ge" + from))
				.returnBundle(Bundle.class)
				.usingStyle(SearchStyleEnum.POST)
				.execute();

		logger.info("Number of data found: "+ result.getTotal());

		FhirWebserviceClient fhirWebserviceClient = api.getFhirWebserviceClientProvider().getLocalWebserviceClient();
		Map<String, List<String>> parameters = new HashMap<>();
		parameters.put("_profile", List.of("http://medizininformatik-initiative.de/fhir/StructureDefinition/task-merge-data-sharing"));
		parameters.put("status", List.of("in-progress"));
		parameters.put("_sort", List.of("-_lastUpdated"));
		Bundle bundle = fhirWebserviceClient.search(Task.class, parameters);

		logger.info("Number of active merge process found: "+ bundle.getTotal());

		List<Task> tasks = bundle.getEntry().stream()
				.filter(entry -> entry.getResource() instanceof Task)
				.map(entry -> (Task) entry.getResource())
				.toList();

		List<DocumentReference> documentReferences = result.getEntry().stream()
				.filter(entry -> entry.getResource() instanceof DocumentReference)
				.map(entry -> (DocumentReference) entry.getResource())
				.toList();
		// Extract the Task from the Bundle's entry
		List<String> taskIds = result.getEntry().stream()
				.filter(entry -> entry.getResource() instanceof DocumentReference)
				.map(entry -> entry.getResource().getIdElement().getIdPart())
				.toList();

		if (taskIds != null && !taskIds.isEmpty()){
			logger.info("Number of new data found: " + taskIds.size());
			variables.setResourceList(BPMN_EXECUTION_DATA_LIST, documentReferences);
			variables.setResourceList(BPMN_EXECUTION_TASK_LIST, tasks);
			variables.setVariable(BPMN_EXECUTION_NEW_DATA_IDS,
					TasksValues.create(new Tasks(taskIds)));
			variables.setString(BPMN_EXECUTION_NEW_DATA, "yes");
		}else{
			variables.setString(BPMN_EXECUTION_NEW_DATA, "no");
		}


	}

}
