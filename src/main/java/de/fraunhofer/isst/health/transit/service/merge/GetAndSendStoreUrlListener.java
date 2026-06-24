package de.fraunhofer.isst.health.transit.service.merge;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.parser.IParser;
import de.fraunhofer.isst.health.transit.ConstantsTransit;
import de.medizininformatik_initiative.processes.common.util.ConstantsBase;
import dev.dsf.bpe.v2.ProcessPluginApi;
import dev.dsf.bpe.v2.activity.ServiceTask;
import dev.dsf.bpe.v2.client.dsf.DelayStrategy;
import dev.dsf.bpe.v2.client.dsf.DsfClient;
import dev.dsf.bpe.v2.error.ErrorBoundaryEvent;
import dev.dsf.bpe.v2.variables.Variables;
import org.hl7.fhir.r4.model.QuestionnaireResponse;
import org.hl7.fhir.r4.model.Resource;
import org.hl7.fhir.r4.model.StringType;
import org.hl7.fhir.r4.model.UriType;

import java.io.IOException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GetAndSendStoreUrlListener implements ServiceTask {
    private static final Logger LOGGER = Logger.getLogger(GetAndSendStoreUrlListener.class.getName());

    public GetAndSendStoreUrlListener() {
        super();
    }

    @Override
    public void execute(ProcessPluginApi api, Variables variables) throws ErrorBoundaryEvent, Exception {
        String dupIdentifier = variables.getString(ConstantsTransit.DUPIDENTIFIER);

        //Get ID of QuestionnaireResponse
        String qsId = variables.getString(ConstantsTransit.QUESTIONNAIREID);

        //Get URL to the CollectionBundle on the FHIR-Store
        String collectionURL = variables.getString(ConstantsTransit.COLLECTIONURL);

        QuestionnaireResponse questionnaireResponse = getQuestionnaireResponse(api, qsId);

        for (QuestionnaireResponse.QuestionnaireResponseItemComponent component: questionnaireResponse.getItem()) {
            switch (component.getLinkId()) {
                case "data-set-url":
                    component.getAnswerFirstRep().setValue(new UriType(collectionURL));
                    break;
                case "release":
                    component.getAnswerFirstRep().setValue(new StringType(dupIdentifier));
                    break;
                default:
                    break;
            }
        }

        questionnaireResponse.setStatus(QuestionnaireResponse.QuestionnaireResponseStatus.COMPLETED);

        variables.setFhirResource(ConstantsTransit.QUESTIONNAIRERESPONSE, questionnaireResponse);

        LOGGER.log(Level.INFO, "QuestionnaireResponse CollectionURL: " + collectionURL);
        LOGGER.log(Level.INFO, "QuestionnaireResponse release: " + dupIdentifier);
    }

    private QuestionnaireResponse getQuestionnaireResponse(ProcessPluginApi api, String qsId) {
        LOGGER.log(Level.INFO, "QuestionnaireResponse ID: " + qsId);

        DsfClient dsfClient = (DsfClient) api.getDsfClientProvider().getLocal()
                .withRetry(ConstantsBase.DSF_CLIENT_RETRY_6_TIMES,
                        DelayStrategy.constant(ConstantsBase.DSF_CLIENT_RETRY_INTERVAL_5MIN));

        Resource object =
                dsfClient.read("QuestionnaireResponse", qsId);

        FhirContext ctx = FhirContext.forR4();
        IParser parser = ctx.newJsonParser();
        LOGGER.log(Level.INFO, "QuestionnaireResponse: " + parser.encodeResourceToString(object));

        return (QuestionnaireResponse) object;
    }

}
