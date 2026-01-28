package de.fraunhofer.isst.health.transit.models;

public class InsertDataObject {

    private String key;
    private String documentReference;
    private String bundle;
    private String fhirUrl;

    public InsertDataObject() {

    }

    public InsertDataObject(String key, String documentReference, String bundle, String fhirUrl) {
        this();
        this.key = key;
        this.documentReference = documentReference;
        this.bundle = bundle;
        this.fhirUrl = fhirUrl;
    }

    public String getKey() {
        return key;
    }

    public String getDocumentReference() {
        return documentReference;
    }

    public String getBundle() {
        return bundle;
    }

    public String getFhirUrl() {
        return fhirUrl;
    }
}
