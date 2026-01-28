package de.fraunhofer.isst.health.transit.utils.projectfile.enums;

public enum EEndpointPayloadMimeType {
    JSON("application/json+fhir"),
    XML("application/xml+fhir");

    private String code;
    EEndpointPayloadMimeType(String c) {
        code = c;
    }
    public String getCode() {
        return code;
    }
    }
