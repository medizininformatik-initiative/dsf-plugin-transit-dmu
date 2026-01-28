package de.fraunhofer.isst.health.transit.service.merge;

import de.fraunhofer.isst.health.transit.ConstantsTransit;
import dev.dsf.bpe.v1.ProcessPluginApi;
import dev.dsf.bpe.v1.activity.AbstractServiceDelegate;
import dev.dsf.bpe.v1.variables.Variables;
import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.hl7.fhir.r4.model.PrimitiveType;
import org.hl7.fhir.r4.model.QuestionnaireResponse;
import org.hl7.fhir.r4.model.StringType;

import java.util.Objects;
import java.util.stream.Stream;

public class CheckStoreDeletionQs extends AbstractServiceDelegate {
    private final ProcessPluginApi api;
    String QUESTIONNAIRES_ITEM_DUPID = "project-identifier";
    String STORE_DELETION_VARIABLE = "deleteStore";

    public CheckStoreDeletionQs(ProcessPluginApi api) {
        super(api);
        this.api = api;
    }

    @Override
    protected void doExecute(DelegateExecution execution, Variables variables) throws BpmnError, Exception {
        String projectIdentifier = variables.getString(ConstantsTransit.DUPIDENTIFIER);
        QuestionnaireResponse questionnaireResponse = variables.getLatestReceivedQuestionnaireResponse();

        if (projectIdentifierMatch(questionnaireResponse, projectIdentifier)) {
            execution.setVariable(STORE_DELETION_VARIABLE, true);
        } else {
            execution.setVariable(STORE_DELETION_VARIABLE, false);
        }
    }

    private boolean projectIdentifierMatch(QuestionnaireResponse questionnaireResponse,
                                           String expectedProjectIdentifier)
    {
        return getProjectIdentifiers(questionnaireResponse).anyMatch(foundProjectIdentifier -> expectedProjectIdentifier
                .trim().equalsIgnoreCase(foundProjectIdentifier.trim()));
    }

    private Stream<String> getProjectIdentifiers(QuestionnaireResponse questionnaireResponse)
    {
        return questionnaireResponse.getItem().stream()
                .filter(i -> QUESTIONNAIRES_ITEM_DUPID.equals(i.getLinkId()))
                .flatMap(i -> i.getAnswer().stream()).filter(a -> a.getValue() instanceof StringType)
                .map(a -> (StringType) a.getValue()).map(PrimitiveType::getValue).filter(Objects::nonNull);
    }

}
