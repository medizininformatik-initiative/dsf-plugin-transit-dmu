package de.fraunhofer.isst.health.transit.utils;

import de.fraunhofer.isst.health.transit.models.InsertDataObject;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.jboss.resteasy.client.jaxrs.internal.ResteasyClientBuilderImpl;

import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InboxManager {
    private static final Logger LOGGER = Logger.getLogger(InboxManager.class.getName());

    public void deleteNUMFromInbox(String bundleID, String inboxUrl) {
        LOGGER.log(Level.INFO, "Delete bundle with id: " + bundleID + " from inbox");

        String uri = inboxUrl + "Bundle/" + bundleID;

        ResteasyClient client = new ResteasyClientBuilderImpl().build();
        ResteasyWebTarget target = client.target(uri);
        Response delResponse = target.request().delete();
        client.close();

        if (Response.Status.OK.getStatusCode() != delResponse.getStatus()) {
            LOGGER.log(Level.SEVERE, "Could not DELETE Bundle with uri: " + bundleID + "from inbox");
        }
    }
    public void deleteMIIFromInbox(String bundleID, String documentID, String binaryID, String inboxUrl) {

        ResteasyClient client = new ResteasyClientBuilderImpl().build();
        if (!Objects.equals(bundleID, "NA")) {
            LOGGER.log(Level.INFO, "Delete bundle with id: " + bundleID + " from inbox");
            String uriBundle = inboxUrl + "Bundle/" + bundleID;
            ResteasyWebTarget targetBundle = client.target(uriBundle);
            Response delBundleResponse = targetBundle.request().delete();
            if (Response.Status.OK.getStatusCode() != delBundleResponse.getStatus()) {
                LOGGER.log(Level.SEVERE, "Could not DELETE Bundle with uri: " + bundleID + "from inbox");
            }
            delBundleResponse.close();
        }
        if (!Objects.equals(binaryID, "NA")) {
            LOGGER.log(Level.INFO, "Delete Binary with id: " + binaryID + " from inbox");
            String uriBinary = inboxUrl + "Binary/" + binaryID;
            ResteasyWebTarget targetBundle = client.target(uriBinary);
            Response delBinaryResponse = targetBundle.request().delete();
            if (Response.Status.OK.getStatusCode() != delBinaryResponse.getStatus()) {
                LOGGER.log(Level.SEVERE, "Could not DELETE Binary with uri: " + binaryID + "from inbox");
            }
            delBinaryResponse.close();
        }
        LOGGER.log(Level.INFO, "Delete DocumentReference with id: " + documentID + " from inbox");
        String uriDocument = inboxUrl + "DocumentReference/" + documentID;
        ResteasyWebTarget targetDocument = client.target(uriDocument);
        Response delDocumentResponse = targetDocument.request().delete();
        if (Response.Status.OK.getStatusCode() != delDocumentResponse.getStatus()) {
            LOGGER.log(Level.SEVERE, "Could not DELETE DocumentReference with uri: " + documentID + "from inbox");
        }
        delDocumentResponse.close();

        client.close();
    }

    public Response uploadInsertDataObject(InsertDataObject insertDataObject, String uri) {
        LOGGER.log(Level.INFO, "GetInsertDataSetURI: " + uri);

        ResteasyClient client = new ResteasyClientBuilderImpl().build();
        ResteasyWebTarget target = client.target(uri);

        Response response = target.request().post(Entity.entity(insertDataObject, MediaType.APPLICATION_JSON));

        if (Response.Status.OK.getStatusCode() != response.getStatus()) {
            LOGGER.log(Level.SEVERE, "Could not POST InsertDataObject with uri: " + uri);
            return null;
        }
        LOGGER.log(Level.SEVERE, "POST of InsertDataObject with uri: " + uri + "successful.");
        client.close();
        return response;
    }
}
