package de.fraunhofer.isst.health.transit.utils.projectfile.mii;

import java.util.List;

public class Questionnaire {
    private String id;
    private String name;
    private List<Object> items;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Object> getItems() {
        return items;
    }

    public void setItems(List<Object> items) {
        this.items = items;
    }
}
