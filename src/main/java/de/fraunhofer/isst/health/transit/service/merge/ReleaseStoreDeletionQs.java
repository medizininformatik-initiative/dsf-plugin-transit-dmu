package de.fraunhofer.isst.health.transit.service.merge;

import dev.dsf.bpe.v1.ProcessPluginApi;
import dev.dsf.bpe.v1.activity.DefaultUserTaskListener;

public class ReleaseStoreDeletionQs extends DefaultUserTaskListener {

    private final ProcessPluginApi api;

    public ReleaseStoreDeletionQs(ProcessPluginApi api) {
        super(api);
        this.api = api;
    }


}
