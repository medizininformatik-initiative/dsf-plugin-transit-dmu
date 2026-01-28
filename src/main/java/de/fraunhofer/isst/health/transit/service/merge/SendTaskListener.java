package de.fraunhofer.isst.health.transit.service.merge;

import ca.uhn.fhir.context.FhirContext;
import de.fraunhofer.isst.health.transit.ConstantsTransit;
import dev.dsf.bpe.v1.ProcessPluginApi;
import dev.dsf.bpe.v1.activity.AbstractServiceDelegate;
import dev.dsf.bpe.v1.variables.Variables;
import dev.dsf.fhir.client.FhirWebserviceClient;
import org.apache.commons.io.IOUtils;
import org.bouncycastle.pkcs.PKCSException;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.hl7.fhir.r4.model.Task;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SendTaskListener extends AbstractServiceDelegate {
    private static final Logger LOGGER = Logger.getLogger(SendTaskListener.class.getName());

    public SendTaskListener(ProcessPluginApi api) {
        super(api);
    }

    @Override
    protected void doExecute(DelegateExecution delegateExecution, Variables variables) throws Exception {
        LOGGER.log(Level.INFO, "Started Camunda Implementation SendTaskListener");

        LOGGER.info("SendTask Name : " + delegateExecution.getCurrentActivityName());
        LOGGER.info("SendTask businessKey : " + delegateExecution.getBusinessKey());

        if (delegateExecution.getCurrentActivityId().equals("requestContainerCreation")) {
            requestFHIRStore(delegateExecution);
        } else {
            LOGGER.log(Level.SEVERE, "Unknown Message with ActivityId: " + delegateExecution.getCurrentActivityId());
        }
    }

    private void requestFHIRStore(DelegateExecution delegateExecution)
            throws IOException, CertificateException, KeyStoreException, NoSuchAlgorithmException, PKCSException {

        String taskString = IOUtils.toString(getClass().getResourceAsStream("/fhir/Task/task-create-store.xml"), StandardCharsets.UTF_8);
        String dupIdentifier = ((String) delegateExecution.getVariable(ConstantsTransit.DUPIDENTIFIER));

        String pattern = "yyyy-MM-dd'T'HH:mm:ssXXX";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());

        taskString = taskString.replace("#{date}", date);
        taskString = taskString.replace("#{version}", ConstantsTransit.FHIR_STORE_VERSION);
        taskString = taskString.replace("#{requester}", ConstantsTransit.FHIR_STORE_REQUESTER);
        taskString = taskString.replace("#{recipient}", ConstantsTransit.FHIR_STORE_RECIPIENT);
        taskString = taskString.replace("#{project-identifier}", dupIdentifier);
        taskString = taskString.replace("#{business-key}", delegateExecution.getBusinessKey());

        Task task = FhirContext.forR4().newXmlParser().parseResource(Task.class, taskString);

        FhirWebserviceClient fhirWebserviceClient = api.getFhirWebserviceClientProvider().getLocalWebserviceClient();
        fhirWebserviceClient.create(task);
    }

}
