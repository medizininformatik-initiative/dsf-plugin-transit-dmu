package de.fraunhofer.isst.health.transit.utils.projectfile.mii;

import java.util.List;

public class QuestionnaireResponse {
    private String id;
    private List<Object> items;
    private Questionnaire questionnaire;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Object> getItems() {
        return items;
    }

    public void setItems(List<Object> items) {
        this.items = items;
    }

    public Questionnaire getQuestionnaire() {
        return questionnaire;
    }

    public void setQuestionnaire(Questionnaire questionnaire) {
        this.questionnaire = questionnaire;
    }
}
