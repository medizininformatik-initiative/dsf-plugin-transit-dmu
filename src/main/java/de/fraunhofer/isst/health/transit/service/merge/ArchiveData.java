package de.fraunhofer.isst.health.transit.service.merge;

import ca.uhn.fhir.context.FhirContext;
import de.fraunhofer.isst.health.transit.ConstantsTransit;
import de.fraunhofer.isst.health.transit.spring.config.DmsProjectFileFhirClientConfig;
import de.fraunhofer.isst.health.transit.spring.config.TransitVariablesConfig;
import de.fraunhofer.isst.health.transit.utils.*;
import de.fraunhofer.isst.health.transit.utils.projectfile.enums.EDataUsageProjectCode;
import de.fraunhofer.isst.health.transit.utils.projectfile.enums.EEndpointPayloadMimeType;
import de.fraunhofer.isst.health.transit.utils.projectfile.helper.MiiFhirComplexClientHelper;
import de.fraunhofer.isst.health.transit.utils.projectfile.mii.DataUsageProject;
import de.fraunhofer.isst.health.transit.utils.projectfile.mii.MIIEndpoint;
import de.fraunhofer.isst.health.transit.utils.projectfile.status.DataUsageProjectStatus;
import dev.dsf.bpe.v2.ProcessPluginApi;
import dev.dsf.bpe.v2.activity.ServiceTask;
import dev.dsf.bpe.v2.error.ErrorBoundaryEvent;
import dev.dsf.bpe.v2.variables.Variables;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.Response;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.hl7.fhir.r4.model.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArchiveData implements ServiceTask {
    private static final Logger LOGGER = Logger.getLogger(ArchiveData.class.getName());
    private static final double CONVERSIONMB = 0.000001;
    private static final double OVERHEAD = 1.20;
    private static final int RETRYDELAYMINUTES = 1;
    private static final int RETRYMAXNUMBER = 15;
    private static final int TIMEOUT_S = 30;
    private static final String SERVICEPREFIX = "http://archive-";
    private static final String UPLOADENDPOINT = "/upl/";
    private static final String HEALTHENDPOINT = "/health";
    private String dupIdentifier;
    private double size;
    private String nginxUrl;
    private DmsProjectFileFhirClientConfig dmsProjectFileFhirClientConfig;
    private TransitVariablesConfig transitVariablesConfig;

    public ArchiveData(DmsProjectFileFhirClientConfig dmsProjectFileFhirClientConfig, TransitVariablesConfig transitVariablesConfig) {
        super();
        this.dmsProjectFileFhirClientConfig = dmsProjectFileFhirClientConfig;
        this.transitVariablesConfig = transitVariablesConfig;
    }

    @Override
    public void execute(ProcessPluginApi api, Variables variables) throws ErrorBoundaryEvent, Exception {
        LOGGER.info("ArchiveStore start");

        dupIdentifier = (variables.getString(ConstantsTransit.DUPIDENTIFIER)).toLowerCase(Locale.ROOT);
        Bundle collection = (Bundle) variables.getFhirResource(ConstantsTransit.COLLECTION_BUNDLE);
        nginxUrl = variables.getString(ConstantsTransit.ARCHIVEURL);

        //Change collection to Transaction
        collection.setType(Bundle.BundleType.TRANSACTION);
        for (Bundle.BundleEntryComponent component : collection.getEntry()) {
            component.getRequest()
                    .setMethod(Bundle.HTTPVerb.POST)
                    .setUrl(component.getResource().getResourceType().name());
        }

        if (!collection.getEntry().isEmpty()) {

            String path = UPLOADENDPOINT + dupIdentifier + ".json";
            String file = FhirContext.forR4().newJsonParser().encodeResourceToString(collection);
            byte[] bytes = file.getBytes(StandardCharsets.UTF_8);
            size = Math.ceil(bytes.length * CONVERSIONMB * OVERHEAD);

            //Setup Client-Builder
            ClientBuilder builder = ClientBuilder.newBuilder();
            builder = builder.readTimeout(TIMEOUT_S, TimeUnit.SECONDS).connectTimeout(TIMEOUT_S,
                    TimeUnit.SECONDS);

            //Build Client
            try (Client client = builder.build();) {

                TimeUnit.MINUTES.sleep(RETRYDELAYMINUTES);
                WebTarget available = client.target(nginxUrl + HEALTHENDPOINT);
                Response availableReq = null;
                int retry = 0;

                while (availableReq == null && retry < RETRYMAXNUMBER) {
                    try {
                        availableReq = available.request().get();
                    } catch (Exception e) {
                        retry += 1;
                        LOGGER.info("Endpoint " + nginxUrl + " not available during try " + retry + "/" + RETRYMAXNUMBER
                                + ". Retry in " + RETRYDELAYMINUTES + " minutes.");
                        TimeUnit.MINUTES.sleep(RETRYDELAYMINUTES);
                    }
                }

                if (availableReq != null && Response.Status.OK.getStatusCode() == availableReq.getStatus()) {

                    LOGGER.info("Endpoint " + nginxUrl + " available. Send archived Data for DUP " + dupIdentifier);
                    WebTarget target = client.target(nginxUrl + path);
                    Response response = target.request().put(Entity.text(file));
                    if (Response.Status.CREATED.getStatusCode() != response.getStatus()) {
                        LOGGER.log(Level.SEVERE, "Could not POST archived project " + dupIdentifier + " to: " + nginxUrl
                                + "Archiving and deletion of the FHIR-Store must happen manually");
                        variables.setBoolean(ConstantsTransit.ISARCHIVED, false);
                    } else {
                        LOGGER.log(Level.INFO, "Project " + dupIdentifier + " successfully archived at " + nginxUrl
                                + ". Deletion of FHIR-Store can proceed automatically.");
                        variables.setBoolean(ConstantsTransit.ISARCHIVED, true);
                        //Update Project File metadata with archive store URL
                        updateProjectFile(api, dupIdentifier, nginxUrl);
                    }
                    response.close();
                    availableReq.close();

                } else {
                    LOGGER.severe("File Storage for project " + dupIdentifier + " with url "
                            + nginxUrl + " could not be created automatically. "
                            + "Archiving and deletion of the FHIR-Store must happen manually");
                    variables.setBoolean(ConstantsTransit.ISARCHIVED, false);
                }

            }

        } else {
            LOGGER.info("ArchiveStore: no data found on FHIR-Store!");
        }
    }

    private void updateProjectFile(ProcessPluginApi api, String dupIdentifier, String archiveUrl) {

        LOGGER.log(Level.INFO, "Looking up DUP with identifier " + dupIdentifier);
        MiiFhirComplexClientHelper helper = new MiiFhirComplexClientHelper(api, dupIdentifier, dmsProjectFileFhirClientConfig);
        LOGGER.log(Level.INFO, "Looked up DUP with code: " + helper.getLastResponse().getStatusCode());

        DataUsageProject dataUsageProject = helper.getDataUsageProject();

        DataUsageProjectStatus status = new DataUsageProjectStatus();
        status.setLastUpdated(new DateTimeType(Calendar.getInstance().getTime()));
        status.setId(dupIdentifier);
        status.setCode(EDataUsageProjectCode.ARCHIVED);
        status.setCorrelatedTask(dataUsageProject.getTasks().get(0));

        dataUsageProject.addStatus(status);

        MIIEndpoint endpoint = helper.getDataUsageProject().getMiiEndpoint();
        endpoint.addMimeType(EEndpointPayloadMimeType.JSON);
        endpoint.setStatus(Endpoint.EndpointStatus.ACTIVE);
        endpoint.setAddress(archiveUrl);

        dataUsageProject.setProcessStatus(EDataUsageProjectCode.ARCHIVED);

        LOGGER.log(Level.INFO, FhirContext.forR4().newJsonParser().encodeResourceToString(dataUsageProject.getBundle()));
        List<OperationOutcome.OperationOutcomeIssueComponent> problems = ResultFormatter.filterForError(helper.updateToServer());

        if (!problems.isEmpty()) {
            LOGGER.log(Level.SEVERE, "Uploading projectfile failed with " + problems.size() + " errors");
            for (OperationOutcome.OperationOutcomeIssueComponent issueComponent : problems) {
                LOGGER.log(Level.SEVERE, issueComponent.getSeverity().getDisplay() + " " + issueComponent.getDetails().getText());
            }
        } else {
            LOGGER.log(Level.INFO, "Projectfile uploaded successfully");
        }
    }

}
