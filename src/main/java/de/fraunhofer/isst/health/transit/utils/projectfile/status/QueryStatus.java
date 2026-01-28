package de.fraunhofer.isst.health.transit.utils.projectfile.status;

import de.fraunhofer.isst.health.transit.utils.projectfile.enums.EQueryCode;

public class QueryStatus extends Status {
    private EQueryCode code;

    @Override
    public String getCode() {
        return code.name();
    }

    public void setCode(EQueryCode code) {
        this.code = code;
    }
}
