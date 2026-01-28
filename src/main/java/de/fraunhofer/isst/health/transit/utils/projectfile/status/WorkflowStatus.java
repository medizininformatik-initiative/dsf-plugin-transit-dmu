package de.fraunhofer.isst.health.transit.utils.projectfile.status;

import de.fraunhofer.isst.health.transit.utils.projectfile.enums.EWorkflowCode;

public class WorkflowStatus extends Status {
    private EWorkflowCode code;

    @Override
    public String getCode() {
        return code.name();
    }

    public void setCode(EWorkflowCode code) {
        this.code = code;
    }
}
