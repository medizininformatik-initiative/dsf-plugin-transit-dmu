package de.fraunhofer.isst.health.transit.service.merge;

import de.fraunhofer.isst.health.transit.ConstantsTransit;
import de.fraunhofer.isst.health.transit.spring.config.DmsProjectFileFhirClientConfig;
import de.fraunhofer.isst.health.transit.utils.ResultFormatter;
import de.fraunhofer.isst.health.transit.utils.projectfile.enums.EEndpointPayloadMimeType;
import de.fraunhofer.isst.health.transit.utils.projectfile.helper.MiiFhirComplexClientHelper;
import de.fraunhofer.isst.health.transit.utils.projectfile.mii.MIIEndpoint;
import dev.dsf.bpe.v2.ProcessPluginApi;
import dev.dsf.bpe.v2.activity.ServiceTask;
import dev.dsf.bpe.v2.error.ErrorBoundaryEvent;
import dev.dsf.bpe.v2.variables.Variables;
import org.hl7.fhir.r4.model.Endpoint;
import org.hl7.fhir.r4.model.OperationOutcome;
import org.hl7.fhir.r4.model.Task;
import org.hl7.fhir.r4.model.UrlType;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadAndSaveStoreValues implements ServiceTask {
    private static String SYSTEM = "http://datamanagementunit.eu/fhir/CodeSystem/dmu-tools";
    private static String CODE = "store-url";
    private static final Logger LOGGER = Logger.getLogger(ReadAndSaveStoreValues.class.getName());
    private DmsProjectFileFhirClientConfig dmsProjectFileFhirClientConfig;

    public ReadAndSaveStoreValues(DmsProjectFileFhirClientConfig dmsProjectFileFhirClientConfig) {
        super();
        this.dmsProjectFileFhirClientConfig = dmsProjectFileFhirClientConfig;
    }

    @Override
    public void execute(ProcessPluginApi processPluginApi, Variables variables) throws ErrorBoundaryEvent, Exception {
        String dupIdentifier = variables.getString(ConstantsTransit.DUPIDENTIFIER);

        Task storeCreatedTask = variables.getLatestTask();
        List<Task.ParameterComponent> params = storeCreatedTask.getInput();

        UrlType url;

        for (Task.ParameterComponent param : params) {
            if (!param.isEmpty() && param.getType().hasCoding(SYSTEM, CODE)) {
                url = ((UrlType) param.getValue());
                variables.setString(ConstantsTransit.FHIRSTOREURL, url.getValue());
                LOGGER.log(Level.INFO, "Looking up DUP with identifier " + dupIdentifier);
                MiiFhirComplexClientHelper helper = new MiiFhirComplexClientHelper(dupIdentifier, this.dmsProjectFileFhirClientConfig);
                LOGGER.log(Level.INFO, "Looked up DUP with code: " + helper.getLastResponse().getStatusCode());

                MIIEndpoint endpoint = helper.getDataUsageProject().getMiiEndpoint();
                endpoint.addMimeType(EEndpointPayloadMimeType.JSON);
                endpoint.setStatus(Endpoint.EndpointStatus.OFF);
                endpoint.setAddress(url.getValue());
                endpoint.addPayloadType("", "", "ResearchData");

                List<OperationOutcome.OperationOutcomeIssueComponent> problems = ResultFormatter.filterForError(helper.updateToServer());

                if (!problems.isEmpty()) {
                    LOGGER.log(Level.SEVERE, "Updating projectfile failed with " + problems.size() + " errors");
                    for (OperationOutcome.OperationOutcomeIssueComponent issueComponent : problems) {
                        LOGGER.log(Level.SEVERE, issueComponent.getSeverity().getDisplay() + " " + issueComponent.getDetails().getText());
                    }
                } else {
                    LOGGER.log(Level.INFO, "Projectfile updated successfully with Project Store URL: "+ url);
                }


                return;
            }
        }
    }

}
