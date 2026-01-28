package de.fraunhofer.isst.health.transit.utils.projectfile.mii;

import de.fraunhofer.isst.health.transit.utils.projectfile.status.WorkflowStatus;
import java.util.List;

public class Workflow {

    //region Member

    private String id;
    private String externalWorkflowId;
    private WorkflowValueSet typ;

    private WorkflowStatus status;
    private List<Workflow> workflows;

    //endregion

    //region Getter&Setter

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getExternalWorkflowId() {
        return externalWorkflowId;
    }

    public void setExternalWorkflowId(String externalWorkflowId) {
        this.externalWorkflowId = externalWorkflowId;
    }

    public WorkflowValueSet getTyp() {
        return typ;
    }

    public void setTyp(WorkflowValueSet typ) {
        this.typ = typ;
    }

    public WorkflowStatus getStatus() {
        return status;
    }

    public void setStatus(WorkflowStatus status) {
        this.status = status;
    }

    public List<Workflow> getWorkflows() {
        return workflows;
    }

    public void setWorkflows(List<Workflow> workflows) {
        this.workflows = workflows;
    }

    //endregion
}
