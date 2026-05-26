package de.fraunhofer.isst.health.transit.service.trigger;

import ca.uhn.fhir.rest.api.SearchStyleEnum;
import ca.uhn.fhir.rest.client.api.IGenericClient;
import ca.uhn.fhir.rest.gclient.StringClientParam;
import de.fraunhofer.isst.health.transit.variables.Tasks;
import de.fraunhofer.isst.health.transit.variables.TasksValues;
import de.medizininformatik_initiative.processes.common.fhir.client.FhirClientFactory;
import dev.dsf.bpe.v2.ProcessPluginApi;
import dev.dsf.bpe.v2.activity.ServiceTask;
import dev.dsf.bpe.v2.client.dsf.DsfClient;
import dev.dsf.bpe.v2.error.ErrorBoundaryEvent;
import dev.dsf.bpe.v2.variables.Variables;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.DocumentReference;
import org.hl7.fhir.r4.model.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static de.fraunhofer.isst.health.transit.ConstantsTransit.*;

public class CheckNewData implements ServiceTask
{
	private static final Logger logger = LoggerFactory.getLogger(CheckNewData.class);
	FhirClientFactory fhirClientFactory;

    public CheckNewData() {
        super();
	}

    @Override
    public void execute(ProcessPluginApi api, Variables variables) throws ErrorBoundaryEvent, Exception {
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

        DsfClient dsfClient = api.getDsfClientProvider().getLocal();
        Map<String, List<String>> parameters = new HashMap<>();
        parameters.put("_profile", List.of("http://medizininformatik-initiative.de/fhir/StructureDefinition/task-merge-data-sharing"));
        parameters.put("status", List.of("in-progress"));
        parameters.put("_sort", List.of("-_lastUpdated"));
        Bundle bundle = dsfClient.search(Task.class, parameters);

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
            variables.setFhirResourceList(BPMN_EXECUTION_DATA_LIST, documentReferences);
            variables.setFhirResourceList(BPMN_EXECUTION_TASK_LIST, tasks);
            variables.setVariable(BPMN_EXECUTION_NEW_DATA_IDS,
                    TasksValues.create(new Tasks(taskIds)));
            variables.setString(BPMN_EXECUTION_NEW_DATA, "yes");
        }else{
            variables.setString(BPMN_EXECUTION_NEW_DATA, "no");
        }
    }

}
