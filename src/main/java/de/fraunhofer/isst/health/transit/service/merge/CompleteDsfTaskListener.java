package de.fraunhofer.isst.health.transit.service.merge;

import ca.uhn.fhir.context.FhirContext;
import de.fraunhofer.isst.health.transit.ConstantsTransit;
import dev.dsf.bpe.v1.ProcessPluginApi;
import dev.dsf.bpe.v1.activity.AbstractServiceDelegate;
import dev.dsf.bpe.v1.variables.Variables;
import dev.dsf.fhir.client.FhirWebserviceClient;
import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.hl7.fhir.r4.model.QuestionnaireResponse;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CompleteDsfTaskListener extends AbstractServiceDelegate {
    private static final Logger LOGGER = Logger.getLogger(CompleteDsfTaskListener.class.getName());

    public CompleteDsfTaskListener(ProcessPluginApi api) {
        super(api);
    }

    @Override
    protected void doExecute(DelegateExecution delegateExecution, Variables variables) throws BpmnError, Exception {
        LOGGER.log(Level.INFO, "Started Camunda Implementation CompleteDsfTaskListener");

        QuestionnaireResponse questionnaireResponse =
                (QuestionnaireResponse) delegateExecution.getVariable(ConstantsTransit.QUESTIONNAIRERESPONSE);

        LOGGER.log(Level.INFO, "QuestionnaireResponse: "
                + FhirContext.forR4().newJsonParser().encodeResourceToString(questionnaireResponse));

        LOGGER.log(Level.INFO, "sendQuestionnaireResponse start");

        FhirWebserviceClient fhirWebserviceClient = api.getFhirWebserviceClientProvider().getLocalWebserviceClient();
        fhirWebserviceClient.update(questionnaireResponse);
        LOGGER.log(Level.INFO, "sendQuestionnaireResponse end");
    }
}
