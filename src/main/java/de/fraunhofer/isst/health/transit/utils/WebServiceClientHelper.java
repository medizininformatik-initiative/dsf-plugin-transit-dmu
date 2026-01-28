package de.fraunhofer.isst.health.transit.utils;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.parser.IParser;
import ca.uhn.fhir.rest.api.Constants;
import de.fraunhofer.isst.health.transit.models.InsertDataObject;
import de.rwh.utils.crypto.CertificateHelper;
import de.rwh.utils.crypto.io.CertificateReader;
import de.rwh.utils.crypto.io.PemIo;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.Response;
import org.apache.commons.io.IOUtils;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.pkcs.PKCSException;
import org.hl7.fhir.instance.model.api.IBaseResource;
import org.hl7.fhir.r4.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.SSLContext;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.concurrent.TimeUnit;

public final class WebServiceClientHelper {

    private static final Logger LOGGER = LoggerFactory.getLogger(WebServiceClientHelper.class);
//    private static final ProfileService PROFILE_SERVICE = new ProfileServiceImpl();
    private static final BouncyCastleProvider PROVIDER = new BouncyCastleProvider();
    private static final FhirContext FHIR_CONTEXT = FhirContext.forR4();
    private static final int TIMEOUT_S = 180;

    private WebServiceClientHelper() { }

    public static Resource getFhirResource(String url) throws CertificateException,
            IOException, KeyStoreException, NoSuchAlgorithmException, PKCSException {

        return getFhirResource(url, true);
    }

    public static Resource getFhirResource(String url, boolean withSSLContext) throws CertificateException,
            IOException, KeyStoreException, NoSuchAlgorithmException, PKCSException {
        Client client;
        ClientBuilder builder = ClientBuilder.newBuilder();
        SSLContext sslContext;

//        if (withSSLContext) {
//            sslContext = getSSLContext();
//            builder = builder.sslContext(sslContext);
//        }

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

    public static Binary getBinary(String url, boolean withSSLContext) throws CertificateException,
            IOException, KeyStoreException, NoSuchAlgorithmException, PKCSException {

        LOGGER.info("Started getBinary");
        LOGGER.info("getBinary URL: {}", url);

        Client client;
        ClientBuilder builder = ClientBuilder.newBuilder();
        SSLContext sslContext;

//        if (withSSLContext) {
//            sslContext = getSSLContext();
//            builder = builder.sslContext(sslContext);
//        }

        builder = builder.readTimeout(TIMEOUT_S, TimeUnit.SECONDS).connectTimeout(TIMEOUT_S,
                TimeUnit.SECONDS);

        client = builder.build();

        WebTarget target = client.target(url);

        Response response = target.request()
                .header(Constants.HEADER_PREFER, "return=minimal")
                //.accept(Constants.CT_FHIR_XML_NEW)
                .accept("application/xml")
                .get();

        LOGGER.info("Get Binary Response: " + response.getStatus());

        if (Response.Status.OK.getStatusCode() == response.getStatus()) {
            String jsonString = response.readEntity(String.class);

            FhirContext ctx = FhirContext.forR4();
            IParser parser = ctx.newXmlParser();

            Binary binary = parser.parseResource(Binary.class, jsonString);

            client.close();

            return binary;
        } else {
            client.close();

            return null;
        }

    }

    public static <T extends Resource> Response postFhirResource(T fhirResource) throws CertificateException,
            IOException, KeyStoreException, NoSuchAlgorithmException, PKCSException {

        return postFhirResource(fhirResource, null, false);
    }

    public static <T extends Resource> Response postFhirResource(T fhirResource, String url, boolean withoutSSLContext)
            throws CertificateException, IOException, KeyStoreException, NoSuchAlgorithmException, PKCSException {

        Client client;
        ClientBuilder builder = ClientBuilder.newBuilder();
        SSLContext sslContext;

//        if (!withoutSSLContext) {
//            sslContext = getSSLContext();
//            builder = builder.sslContext(sslContext);
//        }

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

        } catch (CertificateException | IOException | KeyStoreException | NoSuchAlgorithmException | PKCSException e) {
            throw new RuntimeException(e);
        }
    }

//    public static <T extends Resource> Response putFhirResource(T fhirResource) throws CertificateException,
//            IOException, KeyStoreException, NoSuchAlgorithmException, PKCSException {
//        Client client;
//        ClientBuilder builder = ClientBuilder.newBuilder();
//        SSLContext sslContext = getSSLContext();
//
//        builder = builder.sslContext(sslContext);
//
//        builder = builder.readTimeout(TIMEOUT_S, TimeUnit.SECONDS).connectTimeout(TIMEOUT_S,
//                TimeUnit.SECONDS);
//
//        client = builder.build();
//
//        String baseUrl = PROFILE_SERVICE.getDsfURL()
//                + fhirResource.getIdElement().getResourceType() //ResourceType
//                + "/" + fhirResource.getIdElement().getIdPart(); //ID
//
//        WebTarget target = client.target(baseUrl);
//
//        Response response = target.request()
//                .header(Constants.HEADER_PREFER, "return=minimal")
//                .accept(Constants.CT_FHIR_JSON_NEW)
//                .put(Entity.entity(FHIR_CONTEXT.newJsonParser().encodeResourceToString(fhirResource),
//                        Constants.CT_FHIR_JSON_NEW));
//
//        client.close();
//
//        return response;
//    }

    public static Response deleteFhirResource(String url) throws CertificateException,
            IOException, KeyStoreException, NoSuchAlgorithmException, PKCSException {
        Client client;
        ClientBuilder builder = ClientBuilder.newBuilder();
//        SSLContext sslContext = getSSLContext();

//        builder = builder.sslContext(sslContext);

        builder = builder.readTimeout(TIMEOUT_S, TimeUnit.SECONDS).connectTimeout(TIMEOUT_S,
                TimeUnit.SECONDS);

        client = builder.build();

        WebTarget target = client.target(url);

        Response response = target.request()
                .header(Constants.HEADER_PREFER, "return=minimal")
                .accept(Constants.CT_FHIR_JSON_NEW)
                .delete();

        client.close();

        return response;
    }

    private static KeyStore createKeyStore(InputStream clientCert, String privateKeyFile, char[] privateKeyPassword,
                                    char[] keyStorePassword)
            throws IOException, PKCSException, CertificateException, KeyStoreException, NoSuchAlgorithmException {
        Path privateKeyPath = Paths.get(privateKeyFile);

        if (!Files.isReadable(privateKeyPath)) {
            throw new IOException("Private key file '" + privateKeyPath + "' not readable");
        }

        X509Certificate certificate = PemIo.readX509CertificateFromPem(IOUtils.toString(clientCert, StandardCharsets.UTF_8));
        PrivateKey privateKey = PemIo.readPrivateKeyFromPem(PROVIDER, privateKeyPath, privateKeyPassword);

        String subjectCommonName = CertificateHelper.getSubjectCommonName(certificate);
        clientCert.close();

        return CertificateHelper.toJksKeyStore(privateKey, new Certificate[]{certificate}, subjectCommonName,
                keyStorePassword);
    }

    private static KeyStore createTrustStore(InputStream testCaCert)
            throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException {

        return CertificateReader.allFromCer(testCaCert);
    }

//    private static SSLContext getSSLContext() throws CertificateException, IOException, KeyStoreException,
//            NoSuchAlgorithmException, PKCSException {
//
//        LOGGER.info("creating SSLContext");
//
//        LOGGER.info("Loading clientCert");
//        InputStream clientCert = loadCertificate(PROFILE_SERVICE.getCertificatePathClient());
//        if (clientCert == null) {
//            LOGGER.warn("clientCert is NULL");
//        } else {
//            LOGGER.info("clientCert loaded");
//        }
//
//        LOGGER.info("Trimming ClientCert");
//        assert clientCert != null;
//        String tmpClient = new String(clientCert.readAllBytes());
//        tmpClient = tmpClient.trim();
//        clientCert = new ByteArrayInputStream(tmpClient.getBytes());
//        LOGGER.info("Trimmed ClientCert");
//
//        LOGGER.info("Loading testCaCert");
//        InputStream testCaCert = loadCertificate(PROFILE_SERVICE.getCertificatePathTestCa());
//        if (testCaCert == null) {
//            LOGGER.warn("testCaCert is NULL");
//        } else {
//            LOGGER.info("testCaCert loaded");
//        }
//
//        LOGGER.info("Trimming CaCert");
//        assert testCaCert != null;
//        String tmpCaCert = new String(testCaCert.readAllBytes());
//        tmpCaCert = tmpCaCert.trim();
//        testCaCert = new ByteArrayInputStream(tmpCaCert.getBytes());
//        LOGGER.info("Trimmed CaCert");
//
//        LOGGER.info("Loading clientCertPrivateKey");
//        InputStream clientCertPrivateKey = loadCertificate(PROFILE_SERVICE.getCertificatePathPrivateKey());
//        if (clientCertPrivateKey == null) {
//            LOGGER.warn("clientCertPrivateKey is NULL");
//        } else {
//            LOGGER.info("clientCertPrivateKey loaded");
//        }
//
//        LOGGER.info("Trimming ClientCertPrivateKey");
//        assert clientCertPrivateKey != null;
//        String tmpPKey = new String(clientCertPrivateKey.readAllBytes());
//        tmpPKey = tmpPKey.trim();
//        clientCertPrivateKey = new ByteArrayInputStream(tmpPKey.getBytes());
//        LOGGER.info("Trimmed ClientCertPrivateKey");
//
//        LOGGER.info("Parsing clientCertPrivateKey");
//
//
//        byte[] buffer = clientCertPrivateKey.readAllBytes();
//        Path privateKeyTmpPath = Files.createTempFile("client_certificate_private_key", ".pem");
//        File targetFile = new File(privateKeyTmpPath.toString());
//        OutputStream outStream = new FileOutputStream(targetFile);
//        outStream.write(buffer);
//        LOGGER.info("clientCertPrivateKey parsed");
//
//        LOGGER.info("Creating KeyStore");
//        char[] keyStorePassword = UUID.randomUUID().toString().toCharArray();
//        KeyStore webserviceKeyStore = createKeyStore(clientCert,
//                privateKeyTmpPath.toString(),
//                PROFILE_SERVICE.getCertifiatePassword().toCharArray(), keyStorePassword);
//        LOGGER.info("KeyStore created");
//
//        LOGGER.info("Creating TrustStore");
//        KeyStore webserviceTrustStore = createTrustStore(testCaCert);
//        LOGGER.info("TrustSore created");
//
//        LOGGER.info("Generating SSLContext");
//        SSLContext sslContext = SslConfigurator.newInstance().trustStore(webserviceTrustStore).keyStore(webserviceKeyStore)
//                .keyStorePassword(keyStorePassword).createSSLContext();
//        LOGGER.info("SSLContext generated");
//
//        targetFile.delete();
//
//        clientCert.close();
//        testCaCert.close();
//        clientCertPrivateKey.close();
//
//        return sslContext;
//    }

//    private static InputStream loadCertificate(String path) {
//        if (!path.startsWith("/")) {
//            path = "/" + path;
//        }
//
//        if (PROFILE_SERVICE.getTransitProfile().equals(ProfileServiceImpl.TRANSIT_PROFILE_KUBERNETES)) {
//            try {
//                return new FileInputStream(path);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        } else {
//            return WebServiceClientHelper.class.getResourceAsStream(path);
//        }
//    }

//    public static Task getTaskByWorkflowInstanceID(String taskId) {
//        System.setProperty("sun.net.http.allowRestrictedHeaders", "true");
//
//        Client client;
//        String baseUrl;
//
//        try {
////            SSLContext sslContext = getSSLContext();
//
//            ClientBuilder builder = ClientBuilder.newBuilder();
////            builder = builder.sslContext(sslContext);
//
//            builder = builder.readTimeout(TIMEOUT_S, TimeUnit.SECONDS).connectTimeout(TIMEOUT_S,
//                    TimeUnit.SECONDS);
//
//            client = builder.build();
//
////            baseUrl = PROFILE_SERVICE.getDsfURL();
//            //baseUrl = baseUrl.endsWith("/") ? baseUrl : baseUrl + "/";
//
//            WebTarget target = client.target(baseUrl).path(Task.class.getAnnotation(ResourceDef.class).name()
//                    + "/" + taskId);
//
//            Response response = target.request()
//                    .header(Constants.HEADER_PREFER, "handling=strict")
//                    .accept(Constants.CT_FHIR_JSON_NEW)
//                    .get();
//
//            if (Response.Status.OK.getStatusCode() == response.getStatus()) {
//                String jsonString = response.readEntity(String.class);
//
//                FhirContext ctx = FhirContext.forR4();
//                IParser parser = ctx.newJsonParser();
//                Task task = parser.parseResource(Task.class, jsonString);
//
//                client.close();
//                return task;
//            }
//
//            client.close();
//            return null;
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
    public static FhirContext getFhirContext() {
        return FHIR_CONTEXT;
    }

}
