package de.fraunhofer.isst.health.transit.service.merge;

import ca.uhn.fhir.context.FhirContext;
import de.fraunhofer.isst.health.transit.ConstantsTransit;
import de.medizininformatik_initiative.processes.common.util.ConstantsBase;
import dev.dsf.bpe.v2.ProcessPluginApi;
import dev.dsf.bpe.v2.activity.ServiceTask;
import dev.dsf.bpe.v2.client.dsf.DelayStrategy;
import dev.dsf.bpe.v2.client.dsf.DsfClient;
import dev.dsf.bpe.v2.error.ErrorBoundaryEvent;
import dev.dsf.bpe.v2.variables.Variables;
import org.hl7.fhir.r4.model.QuestionnaireResponse;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CompleteDsfTaskListener implements ServiceTask {
    private static final Logger LOGGER = Logger.getLogger(CompleteDsfTaskListener.class.getName());

    public CompleteDsfTaskListener() {
        super();
    }

    @Override
    public void execute(ProcessPluginApi api, Variables variables) throws ErrorBoundaryEvent, Exception {
        LOGGER.log(Level.INFO, "Started Camunda Implementation CompleteDsfTaskListener");

        QuestionnaireResponse questionnaireResponse =
                variables.getFhirResource(ConstantsTransit.QUESTIONNAIRERESPONSE);

        LOGGER.log(Level.INFO, "QuestionnaireResponse: "
                + FhirContext.forR4().newJsonParser().encodeResourceToString(questionnaireResponse));

        LOGGER.log(Level.INFO, "sendQuestionnaireResponse start");

        DsfClient dsfClient = (DsfClient) api.getDsfClientProvider().getLocal()
                .withRetry(ConstantsBase.DSF_CLIENT_RETRY_6_TIMES,
                        DelayStrategy.constant(ConstantsBase.DSF_CLIENT_RETRY_INTERVAL_5MIN));
        dsfClient.update(questionnaireResponse);
        LOGGER.log(Level.INFO, "sendQuestionnaireResponse end");
    }
}
