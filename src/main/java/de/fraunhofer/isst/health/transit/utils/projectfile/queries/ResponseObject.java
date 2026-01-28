package de.fraunhofer.isst.health.transit.utils.projectfile.queries;

public class ResponseObject extends ResponseEndpoint {
    private String id;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }
}
