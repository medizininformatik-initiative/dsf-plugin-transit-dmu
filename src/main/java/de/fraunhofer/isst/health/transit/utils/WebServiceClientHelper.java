package de.fraunhofer.isst.health.transit.utils;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.parser.IParser;
import ca.uhn.fhir.rest.api.Constants;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.Response;
import org.hl7.fhir.instance.model.api.IBaseResource;
import org.hl7.fhir.r4.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
}
