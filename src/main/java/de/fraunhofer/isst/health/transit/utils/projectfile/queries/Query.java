package de.fraunhofer.isst.health.transit.utils.projectfile.queries;

import de.fraunhofer.isst.health.transit.utils.projectfile.enums.EQueryType;
import de.fraunhofer.isst.health.transit.utils.projectfile.status.QueryStatus;

import java.util.List;

public class Query {
    private String id;
    private EQueryType type;
    private Object query; //TODO
    private QueryStatus status;
    private List<Response> responseList;
    //TODO

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EQueryType getType() {
        return type;
    }

    public void setType(EQueryType type) {
        this.type = type;
    }


    /**
     * Will be replaced with proper type in the future.
     */
    @Deprecated(forRemoval = true)
    public Object getQuery() {
        return query;
    }

    /**
     * Will be replaced with proper type in the future.
     */
    @Deprecated(forRemoval = true)
    public void setQuery(Object query) {
        this.query = query;
    }

    public QueryStatus getStatus() {
        return status;
    }

    public void setStatus(QueryStatus status) {
        this.status = status;
    }

    public List<Response> getResponseList() {
        return responseList;
    }

    public void setResponseList(List<Response> responseList) {
        this.responseList = responseList;
    }
}
