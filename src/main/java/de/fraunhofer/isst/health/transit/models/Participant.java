package de.fraunhofer.isst.health.transit.models;

public class Participant {

    private String identifierSystem;
    private String identifierValue;

    public Participant()  {
    }

    public Participant(String identifierSystem, String identifierValue) {
        this.identifierSystem = identifierSystem;
        this.identifierValue = identifierValue;
    }

    public String getIdentifierSystem() {
        return identifierSystem;
    }

    public void setIdentifierSystem(String identifierSystem) {
        this.identifierSystem = identifierSystem;
    }

    public String getIdentifierValue() {
        return identifierValue;
    }

    public void setIdentifierValue(String identifierValue) {
        this.identifierValue = identifierValue;
    }
}
