package de.fraunhofer.isst.health.transit.models;

public class DIZLocation {

    private String identifierValue;
    private String name;

    public DIZLocation() {
    }

    public DIZLocation(String value, String name) {
        this.identifierValue = value;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public String getIdentifierValue() {
        return identifierValue;
    }

    public void setIdentifierValue(String identifierValue) {
        this.identifierValue = identifierValue;
    }

}
