package de.fraunhofer.isst.health.transit.service.merge;

import ca.uhn.fhir.context.FhirContext;
import de.fraunhofer.isst.health.transit.ConstantsTransit;
import de.fraunhofer.isst.health.transit.spring.config.DmsProjectFileFhirClientConfig;
import de.fraunhofer.isst.health.transit.spring.config.TransitVariablesConfig;
import de.fraunhofer.isst.health.transit.utils.Renderer;
import de.fraunhofer.isst.health.transit.utils.RepositoryManagement;
import dev.dsf.bpe.v2.ProcessPluginApi;
import dev.dsf.bpe.v2.activity.ServiceTask;
import dev.dsf.bpe.v2.error.ErrorBoundaryEvent;
import dev.dsf.bpe.v2.variables.Variables;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.Response;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.hl7.fhir.r4.model.Bundle;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class CreateArchiveStore implements ServiceTask {
    private static final Logger LOGGER = Logger.getLogger(CreateArchiveStore.class.getName());
    private static final double CONVERSIONMB = 0.000001;
    private static final double OVERHEAD = 1.20;
    private static final int RETRYDELAYMINUTES = 1;
    private static final int RETRYMAXNUMBER = 15;
    private static final int TIMEOUT_S = 30;
    private static final String SERVICEPREFIX = "http://archive-";
    private static final String HEALTHENDPOINT = "/health";
    private String dupIdentifier;
    private double size;
    private String nginxUrl;
    private DmsProjectFileFhirClientConfig dmsProjectFileFhirClientConfig;
    private TransitVariablesConfig transitVariablesConfig;

    public CreateArchiveStore(DmsProjectFileFhirClientConfig dmsProjectFileFhirClientConfig, TransitVariablesConfig transitVariablesConfig) {
        super();
        this.dmsProjectFileFhirClientConfig = dmsProjectFileFhirClientConfig;
        this.transitVariablesConfig = transitVariablesConfig;
    }

    @Override
    public void execute(ProcessPluginApi api, Variables variables) throws ErrorBoundaryEvent, Exception {
        LOGGER.info("Create Archive Store start");

        dupIdentifier = (variables.getString(ConstantsTransit.DUPIDENTIFIER)).toLowerCase(Locale.ROOT);
        Bundle collection = (Bundle) variables.getFhirResource(ConstantsTransit.COLLECTION_BUNDLE);

        nginxUrl = SERVICEPREFIX + dupIdentifier;

        String file = FhirContext.forR4().newJsonParser().encodeResourceToString(collection);
        byte[] bytes = file.getBytes(StandardCharsets.UTF_8);
        size = Math.ceil(bytes.length * CONVERSIONMB * OVERHEAD);
        file = null;

        setUpGit();

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
                    variables.setString(ConstantsTransit.ARCHIVEURL, nginxUrl);
                } catch (Exception e) {
                    retry += 1;
                    LOGGER.info("Endpoint " + nginxUrl + " not available during try " + retry + "/" + RETRYMAXNUMBER
                            + ". Retry in " + RETRYDELAYMINUTES + " minutes.");
                    TimeUnit.MINUTES.sleep(RETRYDELAYMINUTES);
                }
            }
        }
    }


    //TODO This might cause issues if two projects are archived at the exact same time and
    // one commits between the clone and push of the other
    private void setUpGit() throws IOException, GitAPIException {
        String install = Renderer.renderInstall(dupIdentifier);
        String chartAdditions = Renderer.renderChartAdditions(dupIdentifier);
        String chart = Renderer.renderChart(dupIdentifier);
        String values = Renderer.renderValues(dupIdentifier, size);
        LOGGER.info("Checking out repo with username " + transitVariablesConfig.getGitUsername());

        RepositoryManagement repositoryManagement = new RepositoryManagement(
                dupIdentifier,
                transitVariablesConfig.getGitUrl(),
                transitVariablesConfig.getGitBranch(),
                transitVariablesConfig.getGitUsername(),
                transitVariablesConfig.getGitCredentials());

        repositoryManagement.cloneInto("Repository-" + dupIdentifier);

        repositoryManagement.writeFile(
                "development/dmu/charts/archives-" + dupIdentifier + "/templates/",
                "install.yaml",
                install,
                false);

        repositoryManagement.writeFile(
                "development/dmu/charts/archives-" + dupIdentifier + "/",
                "Chart.yaml",
                chart,
                false);

        repositoryManagement.writeFile(
                "development/dmu/charts/archives-" + dupIdentifier + "/",
                "values.yaml",
                values,
                false);

        repositoryManagement.writeFile(
                "development/dmu/",
                "Chart.yaml",
                chartAdditions + "\n",
                true);

        repositoryManagement.addAll();
        repositoryManagement.commit("Added File Storage to archive project with id " + dupIdentifier);
        repositoryManagement.push();
        repositoryManagement.close();
    }

}
