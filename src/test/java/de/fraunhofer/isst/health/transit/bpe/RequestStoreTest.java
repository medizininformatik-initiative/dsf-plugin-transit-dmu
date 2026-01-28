package de.fraunhofer.isst.health.transit.bpe;

import de.fraunhofer.isst.health.transit.ConstantsTransit;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RequestStoreTest {

    @Test
    public void requestStore() throws IOException {
        String taskString = IOUtils.toString(getClass().getResourceAsStream("/fhir/Task/task-create-store.xml"));

        String dupIdentifier = "1234567"; //((String) delegateExecution.getVariable(ConstantsTransit.DUPIDENTIFIER)).toLowerCase(Locale.ROOT);
        String businesskey = "98765432cc1"; //((String) delegateExecution.getVariable(ConstantsTransit.DUPIDENTIFIER)).toLowerCase(Locale.ROOT);

        String pattern = "yyyy-MM-dd'T'HH:mm:ssXXX";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());

        taskString = taskString.replace("#{date}", date);
        taskString = taskString.replace("#{version}", ConstantsTransit.FHIR_STORE_VERSION);
        taskString = taskString.replace("#{requester}", ConstantsTransit.FHIR_STORE_REQUESTER);
        taskString = taskString.replace("#{recipient}", ConstantsTransit.FHIR_STORE_RECIPIENT);
        taskString = taskString.replace("#{project-identifier}", dupIdentifier);
        taskString = taskString.replace("#{business-key}", businesskey);



        System.out.println(taskString);

    }


}
