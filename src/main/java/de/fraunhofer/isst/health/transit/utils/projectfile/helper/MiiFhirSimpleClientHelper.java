package de.fraunhofer.isst.health.transit.utils.projectfile.helper;

import ca.uhn.fhir.rest.api.MethodOutcome;
import ca.uhn.fhir.rest.client.api.IGenericClient;
import ca.uhn.fhir.rest.client.api.IHttpRequest;
import ca.uhn.fhir.rest.client.api.IHttpResponse;
import ca.uhn.fhir.rest.client.interceptor.CapturingInterceptor;
import de.fraunhofer.isst.health.transit.ConstantsTransit;
import de.fraunhofer.isst.health.transit.spring.config.DmsProjectFileFhirClientConfig;
import de.fraunhofer.isst.health.transit.utils.projectfile.enums.ESearchableResource;
import de.fraunhofer.isst.health.transit.utils.projectfile.mii.HTTPResponseObject;
import dev.dsf.bpe.v2.ProcessPluginApi;
import org.hl7.fhir.exceptions.FHIRFormatError;
import org.hl7.fhir.r4.model.*;

import java.util.ArrayList;
import java.util.List;

public class MiiFhirSimpleClientHelper {
    private final IGenericClient fhirClient;
    private final DmsProjectFileFhirClientConfig config;
    private final CapturingInterceptor capturingInterceptor;
    private final int notFound = 404;
    private HTTPResponseObject lastResponse;

    /**
     * This will create a new general MiiFhirClientHelper that can be used to communicate with the server
     * @param config the configuration of the server
     */
    public MiiFhirSimpleClientHelper(ProcessPluginApi api, DmsProjectFileFhirClientConfig config) {
        this.config = config;
//        FhirContext context = FhirContext.forR4();
//        if (config.getTimeOut() != 0) {
//            context.getRestfulClientFactory().setSocketTimeout(config.getTimeOut());
//        }

        this.fhirClient = api.getFhirClientProvider().getById(ConstantsTransit.PROJECT_FILE).get();

        //this.fhirClient = config.fhirClientFactory().getFhirClient().getGenericFhirClient();
        //this.fhirClient = context.newRestfulGenericClient(config.getServerUrl());

        capturingInterceptor = new CapturingInterceptor();
        fhirClient.registerInterceptor(capturingInterceptor);
    }


    /**
     * This method can be used to search for a resource of a specific type with a specific identifier value on the server
     * The identifier system is automatically added using the system value for the resource type stored
     * in the {@link de.fraunhofer.isst.health.transit.utils.projectfile.helper.MiiFhirClientHelperConfig MiiFhirClientHelperConfig}
     * @param identifier the value part of the identifier of the serched resource
     * @param resourceType the type of the searched resource
     * @return an Optional either containing the resource or nothing, if no resource of the type with the identifier was found
     */
    public HTTPResponseObject searchByIdentifier(String identifier, ESearchableResource resourceType) {

        if (identifier == null) {
            throw new IllegalArgumentException("The identifier can not be null");
        }
        if (resourceType == null) {
            throw new IllegalArgumentException("A resource type must always be provided");
        }
        try {
            Bundle bundle = new Bundle();
            switch (resourceType) {
                case TASK:
                    bundle = fhirClient.search()
                            .forResource(Task.class)
                            .where(Task.IDENTIFIER.exactly().systemAndIdentifier(config.getTaskSystem(), identifier))
                            .returnBundle(Bundle.class)
                            .execute();
                    break;
                case GROUP:
                    bundle = fhirClient.search()
                            .forResource(Group.class)
                            .where(Group.IDENTIFIER.exactly().systemAndIdentifier(config.getGroupSystem(), identifier))
                            .returnBundle(Bundle.class).execute();
                    break;
                case ENDPOINT:
                    bundle = fhirClient.search()
                            .forResource(Endpoint.class)
                            .where(Task.IDENTIFIER.exactly().systemAndIdentifier(config.getEndpointSystem(), identifier))
                            .returnBundle(Bundle.class).execute();
                    break;
                case LOCATION:
                    bundle = fhirClient.search()
                            .forResource(Location.class)
                            .where(Location.IDENTIFIER.exactly().systemAndIdentifier(config.getDizSystem(), identifier))
                            .returnBundle(Bundle.class).execute();
                    break;
                case PRACTITIONER:
                    bundle = fhirClient.search()
                            .forResource(Practitioner.class)
                            .where(Practitioner.IDENTIFIER.exactly()
                                    .systemAndIdentifier(config.getResearcherSystem(), identifier))
                            .returnBundle(Bundle.class).execute();
                    break;
                case RESEARCH_STUDY:
                    bundle = fhirClient.search()
                            .forResource(ResearchStudy.class)
                            .where(ResearchStudy.IDENTIFIER.exactly()
                                    .systemAndIdentifier(config.getResearchStudySystem(), identifier))
                            .returnBundle(Bundle.class).execute();
                    break;
                default:
                    break;
            }
            if (bundle.getEntry().isEmpty()) {
                lastResponse = new HTTPResponseObject(notFound, null, resourceType);
            } else {
                lastResponse =
                        new HTTPResponseObject(getLastResponseHTTP().getStatus(),
                                bundle.getEntryFirstRep().getResource(),
                                resourceType);
            }
        } catch (Exception e) {
            lastResponse = new HTTPResponseObject(getLastResponseHTTP().getStatus(), null, resourceType);
        }
        return lastResponse;
    }


    /**
     * This method can be used to post a transaction bundle to the server without the use of the provided java classes.
     * Ensure that each entry of the bundle also contains a request describing how the resource should be handled on the server
     * @param transactionBundle a FHIR Bundle of type transaction
     * @return a list containing an OperationOutcomes for each of the posted resources
     */
    public List<OperationOutcome> miiFhirPost(Bundle transactionBundle) {
        if (Bundle.BundleType.TRANSACTION == transactionBundle.getType()) {
            Bundle bundle = fhirClient.transaction().withBundle(transactionBundle).execute();
            List<OperationOutcome> op = new ArrayList<>();
            for (Bundle.BundleEntryComponent e : bundle.getEntry()) {
                if (e.getResponse().hasOutcome()) {
                    if (e.getResponse().getOutcome().getResourceType().equals(ResourceType.OperationOutcome)) {
                        op.add((OperationOutcome) e.getResponse().getOutcome());
                    }
                }
            }
            return op;
        } else {
            throw new FHIRFormatError("Only bundles of type transaction can be posted to the server");
        }
    }

    public MethodOutcome miiFhirPost(Resource resource) {
        if (resource.hasId()) {
           return fhirClient.update().resource(resource).execute();
        } else {
            return fhirClient.create().resource(resource).execute();
        }


    }

    public DmsProjectFileFhirClientConfig getConfig() {
        return config;
    }
    public IGenericClient getFhirClient() {
        return fhirClient;
    }
    public IHttpRequest getLastRequestHTTP() {
        return capturingInterceptor.getLastRequest();
    }
    public IHttpResponse getLastResponseHTTP() {
        return capturingInterceptor.getLastResponse();
    }
    public HTTPResponseObject getLastResponse() {
        return lastResponse;
    }
}
