package de.fraunhofer.isst.health.transit.utils.projectfile.mii;

import de.fraunhofer.isst.health.transit.utils.projectfile.enums.ESearchableResource;
import org.hl7.fhir.r4.model.Resource;

public class HTTPResponseObject {
    private int statusCode;
    private Resource resource;

    private ESearchableResource expectedType;

    public HTTPResponseObject(int code, Resource resource, ESearchableResource type) {
        this.statusCode = code;
        this.resource = resource;
        this.expectedType = type;
    }
    public ESearchableResource getExpectedType() {
        return expectedType;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public Resource getResource() {
        return resource;
    }
    public boolean hasResource() {
        return resource != null;
    }
}
