package de.fraunhofer.isst.health.transit.service.merge;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.parser.IParser;
import de.fraunhofer.isst.health.transit.ConstantsTransit;
import dev.dsf.bpe.v1.ProcessPluginApi;
import dev.dsf.bpe.v1.activity.AbstractServiceDelegate;
import dev.dsf.bpe.v1.variables.Variables;
import dev.dsf.fhir.client.FhirWebserviceClient;
import org.bouncycastle.pkcs.PKCSException;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.hl7.fhir.r4.model.QuestionnaireResponse;
import org.hl7.fhir.r4.model.Resource;
import org.hl7.fhir.r4.model.StringType;
import org.hl7.fhir.r4.model.UriType;

import java.io.IOException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GetAndSendStoreUrlListener extends AbstractServiceDelegate {
    private static final Logger LOGGER = Logger.getLogger(GetAndSendStoreUrlListener.class.getName());

    public GetAndSendStoreUrlListener(ProcessPluginApi api) {
        super(api);
    }

    @Override
    protected void doExecute(DelegateExecution delegateExecution, Variables variables) throws Exception {
        String dupIdentifier = (String) delegateExecution.getVariable(ConstantsTransit.DUPIDENTIFIER);

        //Get ID of QuestionnaireResponse
        String qsId = (String) delegateExecution.getVariable(ConstantsTransit.QUESTIONNAIREID);

        //Get URL to the CollectionBundle on the FHIR-Store
        String collectionURL = (String) delegateExecution.getVariable(ConstantsTransit.COLLECTIONURL);

        QuestionnaireResponse questionnaireResponse = getQuestionnaireResponse(qsId);

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

        delegateExecution.setVariable(ConstantsTransit.QUESTIONNAIRERESPONSE, questionnaireResponse);

        LOGGER.log(Level.INFO, "QuestionnaireResponse CollectionURL: " + collectionURL);
        LOGGER.log(Level.INFO, "QuestionnaireResponse release: " + dupIdentifier);
    }

    private QuestionnaireResponse getQuestionnaireResponse(String qsId) throws CertificateException, IOException, KeyStoreException, NoSuchAlgorithmException, PKCSException {

        LOGGER.log(Level.INFO, "QuestionnaireResponse ID: " + qsId);
        FhirWebserviceClient fhirWebserviceClient = api.getFhirWebserviceClientProvider().getLocalWebserviceClient();

        Resource object =
                fhirWebserviceClient.read("QuestionnaireResponse", qsId);

        FhirContext ctx = FhirContext.forR4();
        IParser parser = ctx.newJsonParser();
        LOGGER.log(Level.INFO, "QuestionnaireResponse: " + parser.encodeResourceToString(object));

        return (QuestionnaireResponse) object;
    }

}
