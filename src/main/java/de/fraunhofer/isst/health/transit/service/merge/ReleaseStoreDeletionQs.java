package de.fraunhofer.isst.health.transit.service.merge;

import de.fraunhofer.isst.health.transit.ConstantsTransit;
import dev.dsf.bpe.v1.ProcessPluginApi;
import dev.dsf.bpe.v1.activity.DefaultUserTaskListener;
import org.camunda.bpm.engine.delegate.DelegateTask;
import org.hl7.fhir.r4.model.IdType;
import org.hl7.fhir.r4.model.QuestionnaireResponse;
import org.hl7.fhir.r4.model.StringType;

public class ReleaseStoreDeletionQs extends DefaultUserTaskListener {

    private final ProcessPluginApi api;

    public ReleaseStoreDeletionQs(ProcessPluginApi api) {
        super(api);
        this.api = api;
    }


}
