package de.fraunhofer.isst.health.transit.utils;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.parser.IParser;
import ca.uhn.fhir.rest.api.Constants;
import de.fraunhofer.isst.health.transit.models.InsertDataObject;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.Response;
import org.hl7.fhir.instance.model.api.IBaseResource;
import org.hl7.fhir.r4.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.SSLContext;
import java.io.*;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.concurrent.TimeUnit;

public final class WebServiceClientHelper {

    private static final Logger LOGGER = LoggerFactory.getLogger(WebServiceClientHelper.class);
    private static final FhirContext FHIR_CONTEXT = FhirContext.forR4();
    private static final int TIMEOUT_S = 180;

    private WebServiceClientHelper() { }

    public static Resource getFhirResource(String url) {
        Client client;
        ClientBuilder builder = ClientBuilder.newBuilder();

        builder = builder.readTimeout(TIMEOUT_S, TimeUnit.SECONDS).connectTimeout(TIMEOUT_S,
                TimeUnit.SECONDS);

        client = builder.build();

        WebTarget target = client.target(url);

        LOGGER.info("Sending GET-Request: {}", url);

        Response response = target.request()
                .header(Constants.HEADER_PREFER, "return=minimal")
                .accept(Constants.CT_FHIR_JSON_NEW)
                .get();

        if (Response.Status.OK.getStatusCode() == response.getStatus()) {

            LOGGER.info("GET-Response OK!");

            String jsonString = response.readEntity(String.class);

            FhirContext ctx = FhirContext.forR4();
            IParser parser = ctx.newJsonParser();

            IBaseResource baseResource = parser.parseResource(jsonString);
            Resource resource = (Resource) baseResource;
            response.close();
            client.close();

            return resource;
        } else {

            LOGGER.info("GETFhirResource with Response-Status: " + response.getStatus());
            LOGGER.info("GETFhirResource with Response-Body: " + response.readEntity(String.class));

            response.close();
            client.close();

            return null;
        }

    }

    public static <T extends Resource> Response postFhirResource(T fhirResource, String url, boolean withoutSSLContext)
            throws CertificateException, IOException, KeyStoreException, NoSuchAlgorithmException {

        Client client;
        ClientBuilder builder = ClientBuilder.newBuilder();
        SSLContext sslContext;

        builder = builder.readTimeout(TIMEOUT_S, TimeUnit.SECONDS).connectTimeout(TIMEOUT_S,
                TimeUnit.SECONDS);

        client = builder.build();

        String baseUrl;

        if (url != null && !url.endsWith("/")) {
            url = url + "/";
        }

        baseUrl = url + fhirResource.getClass().getSimpleName();

        //Bundle with Type Transaction must be posted to Fhir Root
        if (isTransactionBundle(fhirResource)) {
            assert url != null;
            baseUrl = baseUrl.substring(0, url.lastIndexOf("/"));
        }

        //LOGGER.info("Posting resource " + fhirResource.getId() + "to url " + baseUrl);
        WebTarget target = client.target(baseUrl);

        Response response;
        if (!withoutSSLContext) {
            response = target.request()
                    .header(Constants.HEADER_PREFER, "return=minimal")
                    .accept(Constants.CT_FHIR_JSON_NEW)
                    .post(Entity.entity(FHIR_CONTEXT.newJsonParser().encodeResourceToString(fhirResource),
                            Constants.CT_FHIR_JSON_NEW));
        } else {
            response = target.request()
                    .header(Constants.HEADER_PREFER, "return=minimal")
                    .accept(Constants.CT_FHIR_JSON_NEW)
                    .post(Entity.entity(FHIR_CONTEXT.newJsonParser().encodeResourceToString(fhirResource),
                            Constants.CT_FHIR_JSON_NEW));
        }

        //LOGGER.info("postFhirResource with Response-Status: " + response.getStatus());

        client.close();
        return response;
    }

    private static <T extends Resource> boolean isTransactionBundle(T fhirResource) {
        if (checkEntryResourceType(fhirResource, ResourceType.Bundle)) {
            return ((Bundle) fhirResource).getType().equals(Bundle.BundleType.TRANSACTION);
        } else {
            return false;
        }
    }

    private static boolean checkEntryResourceType(Resource resource, ResourceType checkType) {
        ResourceType resourceType = resource.getResourceType();
        return resourceType.equals(checkType);
    }

    public static void postToContainer(InsertDataObject insertDataObject) {
        LOGGER.info("Post to Container: " + insertDataObject.getFhirUrl());

        String fhirUrl = insertDataObject.getFhirUrl();
        DocumentReference documentReference =
                FHIR_CONTEXT.newJsonParser().parseResource(DocumentReference.class, insertDataObject.getDocumentReference());
        Bundle bundle = FHIR_CONTEXT.newJsonParser().parseResource(Bundle.class, insertDataObject.getBundle());

        try {

            LOGGER.info("Post DocumentReference");
            postFhirResource(documentReference, fhirUrl, true);
            LOGGER.info("Posted DocumentReference");
            if (bundle.getType().equals(Bundle.BundleType.TRANSACTION)) {
                LOGGER.info("Post Bundle");
                postFhirResource(bundle, fhirUrl, true);
                LOGGER.info("Posted Bundle");
            } else {
                LOGGER.info("Post Bundle-Entries");
                for (Bundle.BundleEntryComponent entry: bundle.getEntry()) {
                    postFhirResource(entry.getResource(), fhirUrl, true);
                }
                LOGGER.info("Posted Bundle-Entries");
            }

        } catch (CertificateException | IOException | KeyStoreException | NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

}
