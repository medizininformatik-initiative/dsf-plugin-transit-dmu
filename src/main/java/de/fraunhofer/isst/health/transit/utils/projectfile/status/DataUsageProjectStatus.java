package de.fraunhofer.isst.health.transit.utils.projectfile.status;

import de.fraunhofer.isst.health.transit.utils.projectfile.enums.EDataUsageProjectCode;
import de.fraunhofer.isst.health.transit.utils.projectfile.mii.MIITask;

public class DataUsageProjectStatus extends Status {
    private EDataUsageProjectCode code;

    private MIITask correlatedTask;

    @Override
    public String getCode() {
        return code.name();
    }

    public void setCode(EDataUsageProjectCode code) {
        this.code = code;
    }
    public void setCorrelatedTask(MIITask task) {
        this.correlatedTask = task;
    }

    public MIITask getCorrelatedTask() {
        return correlatedTask;
    }
}
