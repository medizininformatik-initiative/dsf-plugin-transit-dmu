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
import org.apache.commons.io.IOUtils;
import org.hl7.fhir.r4.model.Task;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SendTaskListener implements ServiceTask {
    private static final Logger LOGGER = Logger.getLogger(SendTaskListener.class.getName());

    public SendTaskListener() {
        super();
    }

    @Override
    public void execute(ProcessPluginApi api, Variables variables) throws ErrorBoundaryEvent, Exception {
        LOGGER.log(Level.INFO, "Started Camunda Implementation SendTaskListener");

        LOGGER.info("SendTask ID : " + variables.getCurrentActivityId());
        LOGGER.info("SendTask businessKey : " + variables.getBusinessKey());

        if (variables.getCurrentActivityId().equals("requestContainerCreation")) {
            requestFHIRStore(api, variables);
        } else {
            LOGGER.log(Level.SEVERE, "Unknown Message with ActivityId: " + variables.getCurrentActivityId());
        }
    }

    private void requestFHIRStore(ProcessPluginApi api, Variables variables)
            throws IOException {

        String taskString = IOUtils.toString(getClass().getResourceAsStream("/fhir/Task/task-create-store.xml"), StandardCharsets.UTF_8);
        String dupIdentifier = variables.getString(ConstantsTransit.DUPIDENTIFIER);

        String pattern = "yyyy-MM-dd'T'HH:mm:ssXXX";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());

        taskString = taskString.replace("#{date}", date);
        taskString = taskString.replace("#{version}", ConstantsTransit.FHIR_STORE_VERSION);
        taskString = taskString.replace("#{requester}", ConstantsTransit.FHIR_STORE_REQUESTER);
        taskString = taskString.replace("#{recipient}", ConstantsTransit.FHIR_STORE_RECIPIENT);
        taskString = taskString.replace("#{project-identifier}", dupIdentifier);
        taskString = taskString.replace("#{business-key}", variables.getBusinessKey());

        Task task = FhirContext.forR4().newXmlParser().parseResource(Task.class, taskString);

        DsfClient fhirWebserviceClient = api.getDsfClientProvider().getLocal();

        fhirWebserviceClient.create(task);
    }

}
