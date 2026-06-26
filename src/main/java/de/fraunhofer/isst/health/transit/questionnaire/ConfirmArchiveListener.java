package de.fraunhofer.isst.health.transit.questionnaire;

import de.fraunhofer.isst.health.transit.ConstantsTransit;
import dev.dsf.bpe.v2.ProcessPluginApi;
import dev.dsf.bpe.v2.activity.DefaultUserTaskListener;
import dev.dsf.bpe.v2.activity.values.CreateQuestionnaireResponseValues;
import dev.dsf.bpe.v2.variables.Variables;
import org.hl7.fhir.r4.model.IdType;
import org.hl7.fhir.r4.model.QuestionnaireResponse;
import org.hl7.fhir.r4.model.StringType;
import org.hl7.fhir.r4.model.Task;

public class ConfirmArchiveListener extends DefaultUserTaskListener {

    private final boolean dmsEmailEnabled;

    public ConfirmArchiveListener(boolean dmsEmailEnabled) {
        this.dmsEmailEnabled = dmsEmailEnabled;
    }

    @Override
    protected void beforeQuestionnaireResponseCreate(ProcessPluginApi api, Variables variables,
                                                     CreateQuestionnaireResponseValues createQuestionnaireResponseValues, QuestionnaireResponse beforeCreate)
    {
        String projectIdentifier = variables.getString(ConstantsTransit.BPMN_EXECUTION_VARIABLE_PROJECT_IDENTIFIER);

        beforeCreate.getItem().stream()
                .filter(i -> ConstantsTransit.QUESTIONNAIRES_ITEM_DISPLAY.equals(i.getLinkId()))
                .filter(QuestionnaireResponse.QuestionnaireResponseItemComponent::hasText)
                .forEach(i -> replace(i, projectIdentifier));
    }

    @Override
    protected void afterQuestionnaireResponseCreate(ProcessPluginApi api, Variables variables,
                                                    CreateQuestionnaireResponseValues createQuestionnaireResponseValues, QuestionnaireResponse afterCreate)
    {

        if (dmsEmailEnabled)
        {
            Task task = variables.getStartTask();
            String absoluteId = getDsfFhirServerAbsoluteId(api, afterCreate.getIdElement());
            String projectIdentifier = variables
                    .getString(ConstantsTransit.BPMN_EXECUTION_VARIABLE_PROJECT_IDENTIFIER);

            String subject = "New user-task in process '" + ConstantsTransit.PROCESS_NAME_FULL_TRANSIT
                    + "'";
            String message = "A new user-task 'Confirm Archive URL' for data-sharing project '" + projectIdentifier
                    + "' in process '" + ConstantsTransit.PROCESS_NAME_FULL_TRANSIT + "' for Task '"
                    + api.getTaskHelper().getLocalVersionlessAbsoluteUrl(task)
                    + "' is waiting for it's completion. It can be accessed using the following link:\n" + "- "
                    + absoluteId;

            api.getMailService().send(subject, message);
        }


    }

    private void replace(QuestionnaireResponse.QuestionnaireResponseItemComponent item, String projectIdentifier
    )
    {
        String finalText = replaceText(item.getText(), projectIdentifier);
        item.setText(finalText);

        item.getAnswer().stream().filter(a -> a.getValue() instanceof StringType)
                .forEach(a -> replaceAnswerStringTypePlaceholder(a, projectIdentifier));
    }

    private void replaceAnswerStringTypePlaceholder(
            QuestionnaireResponse.QuestionnaireResponseItemAnswerComponent answer, String projectIdentifier)
    {
        if (answer.getValue() instanceof StringType)
            answer.setValue(new StringType(projectIdentifier));
    }

    private String replaceText(String toReplace, String projectIdentifier)
    {
        return toReplace
                .replace(ConstantsTransit.QUESTIONNAIRES_PLACEHOLDER_PROJECT_IDENTIFIER,
                        "\"" + projectIdentifier + "\"");
    }

    private String getDsfFhirServerAbsoluteId(ProcessPluginApi api, IdType idType)
    {
        return new IdType(api.getDsfClientProvider().getLocal().getBaseUrl(), idType.getResourceType(),
                idType.getIdPart(), idType.getVersionIdPart()).getValue();
    }

}
