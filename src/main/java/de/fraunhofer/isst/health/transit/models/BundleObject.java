package de.fraunhofer.isst.health.transit.models;

public class BundleObject {

    private String key;
    private String contentType;
    private String bundle;
    private String documentReference;
    private boolean hasDocumentReference = false;

    public BundleObject() {

    }

    public BundleObject(String key, String contentType, String bundle) {
        this();
        this.key = key;
        this.contentType = contentType;
        this.bundle = bundle;
    }
    public BundleObject(String key, String contentType, String bundle, String documentReference) {
        this(key, contentType, bundle);
        this.documentReference = documentReference;
        hasDocumentReference = true;
    }
    public String getKey() {
        return key;
    }

    public String getBundle() {
        return bundle;
    }

    public String getContentType() {
        return contentType;
    }
    public String getDocumentReference() {
        return documentReference;
    }

    public boolean hasDocumentReference() {
        return hasDocumentReference;
    }
}
