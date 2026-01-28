package de.fraunhofer.isst.health.transit.utils.projectfile.status;

import org.hl7.fhir.r4.model.DateTimeType;

public abstract class Status {
    private String id;
    private DateTimeType lastUpdated;

    public abstract String getCode();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DateTimeType getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(DateTimeType lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
