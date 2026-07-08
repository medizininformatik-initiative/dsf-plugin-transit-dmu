package de.fraunhofer.isst.health.transit.service.trigger;

import dev.dsf.bpe.v2.ProcessPluginApi;
import dev.dsf.bpe.v2.activity.ServiceTask;
import dev.dsf.bpe.v2.error.ErrorBoundaryEvent;
import dev.dsf.bpe.v2.variables.Variables;
import org.hl7.fhir.r4.model.DocumentReference;
import org.hl7.fhir.r4.model.Identifier;
import org.hl7.fhir.r4.model.Resource;
import org.hl7.fhir.r4.model.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Optional;

import static de.fraunhofer.isst.health.transit.ConstantsTransit.*;

public class SetTargetAndCorrelationKey implements ServiceTask
{
	private static final Logger logger = LoggerFactory.getLogger(SetTargetAndCorrelationKey.class);

	public SetTargetAndCorrelationKey()	{
        super();
	}

    @Override
    public void execute(ProcessPluginApi api, Variables variables) throws ErrorBoundaryEvent, Exception {
        String documentReferenceValue =	variables.getString(BPMN_EXECUTION_DATA);
        List<Resource> documentReferences = variables.getFhirResourceList(BPMN_EXECUTION_DATA_LIST);

        DocumentReference documentReference = (DocumentReference) documentReferences.stream()
                .filter(task -> task.getIdElement().getIdPart().equals(documentReferenceValue))
                .findFirst().get();

        String dizId = documentReference.getAuthorFirstRep().getIdentifier().getValue();

        logger.info("Diz Id: "+ dizId);

        List<Resource> tasks = variables.getFhirResourceList(BPMN_EXECUTION_TASK_LIST);

        String projectID = documentReference.getMasterIdentifier().getValue();
        logger.info("Project Id: "+ projectID);

        Optional<Task> matchingTask = tasks.stream()
                .map(entry -> (Task) entry)
                .filter(task -> task.getInput().stream().anyMatch(input ->
                        // Match the Coding Type
                        input.getType().hasCoding("http://medizininformatik-initiative.de/fhir/CodeSystem/data-sharing", "project-identifier") &&
                                // Match the Identifier Value
                                input.getValue() instanceof Identifier ident &&
                                projectID.equals(ident.getValue())
                ))
                .findFirst();
        if (matchingTask.isPresent())
        {
            String correlationKey = matchingTask.get().getInput().stream()
                    // filter for inputs that contain the dic-identifier extension
                    .filter(input -> input.hasExtension(EXTENSION_URL_DIC_IDENTIFIER)).filter(input ->
                    {
                        // extract the extension reference
                        var ext = input.getExtensionByUrl(EXTENSION_URL_DIC_IDENTIFIER);
                        if (ext == null || !(ext.getValue() instanceof org.hl7.fhir.r4.model.Reference ref))
                            return false;

                        // check identifier inside Reference
                        var identifier = ref.getIdentifier();
                        return identifier != null && dizId.equals(identifier.getValue());
                    })
                    // map to valueString
                    .map(input -> input.getValue().primitiveValue()).findFirst().orElse(null);

            logger.info(
                    "Processing data-set with id '{}' from organization '{}' for data-sharing project '{}' in Task with id '{}'",
                    documentReference.getId(),
                    documentReference.getAuthorFirstRep().getIdentifier().getValue(),
                    projectID,
                    matchingTask.get().getId());

            variables.setTarget(
                    variables.createTarget(api.getOrganizationProvider().getLocalOrganizationIdentifierValue().get(),
                            api.getEndpointProvider().getLocalEndpointIdentifierValue().get(),
                            api.getEndpointProvider().getLocalEndpointAddress(), correlationKey));
        }else {
            logger.info(
                    "Could not process data-set with id '{}' from organization '{}' for data-sharing project '{}'",
                    documentReference.getId(),
                    documentReference.getAuthorFirstRep().getIdentifier().getValue(),
                    projectID);

        }
    }

}
