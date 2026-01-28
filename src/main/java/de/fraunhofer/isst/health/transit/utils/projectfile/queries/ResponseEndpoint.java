package de.fraunhofer.isst.health.transit.utils.projectfile.queries;

import java.net.URL;

public class ResponseEndpoint extends Response {
    private URL reference;

    public URL getReference() {
        return reference;
    }

    public void setReference(URL reference) {
        this.reference = reference;
    }
}
