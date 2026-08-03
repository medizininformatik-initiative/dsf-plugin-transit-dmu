package de.fraunhofer.isst.health.transit.utils.gpas;

import de.fraunhofer.isst.health.transit.utils.gpas.auth.GpasAuthOutInterceptor;
import de.fraunhofer.isst.health.transit.utils.gpas.auth.KeycloakAuthService;
import de.fraunhofer.isst.health.transit.utils.gpas.domain.DomainConfig;
import de.fraunhofer.isst.health.transit.utils.gpas.domain.DomainInDTO;
import de.fraunhofer.isst.health.transit.utils.gpas.domain.DomainOutDTO;
import de.fraunhofer.isst.health.transit.utils.gpas.domain.DomainManager;
import de.fraunhofer.isst.health.transit.utils.gpas.domain.DomainManagerBeanService;
import de.fraunhofer.isst.health.transit.utils.gpas.psn.PSNManager;
import de.fraunhofer.isst.health.transit.utils.gpas.psn.PSNManagerBeanService;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.junit.After;
import org.junit.Assume;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.xml.namespace.QName;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import static org.junit.Assert.*;

public class GpasManagerTest {

    private GpasManager gpasManager;
    private DomainManager domainManager;
    private final List<String> createdDomains = new ArrayList<>();

    private static Properties properties;
    private static String gpasUrl;
    private static String keycloakUrl;
    private static String keycloakRealm;

    private DomainInDTO createDomainDTO(String name) {
        DomainConfig config = new DomainConfig();
        config.setPsnLength(10);
        config.setPsnPrefix("");
        config.setPsnSuffix("");
        config.setMultiPsnDomain(false);
        config.setPsnsDeletable(true);
        config.setIncludePrefixInCheckDigitCalculation(false);
        config.setIncludeSuffixInCheckDigitCalculation(false);
        config.setMaxDetectedErrors(3);
        config.setUseLastCharAsDelimiterAfterXChars(0);
        config.setSendNotificationsWeb(false);

        DomainInDTO dto = new DomainInDTO();
        dto.setName(name);
        dto.setLabel(name + "-label");
        dto.setCheckDigitClass("org.emau.icmvc.ganimed.ttp.psn.generator.HammingCode");
        dto.setAlphabet("org.emau.icmvc.ganimed.ttp.psn.alphabets.Symbol32");
        dto.setConfig(config);
        return dto;
    }
    private static final String CLIENT_ID = "gpas-domain-admin";
    private static final String CLIENT_SECRET = "domain-admin-client-secret";

    @BeforeClass
    public static void loadProperties() throws Exception {
        properties = new Properties();
        try (InputStream is = GpasManagerTest.class.getClassLoader().getResourceAsStream("application.properties")) {
            if (is == null) {
                throw new RuntimeException("application.properties not found in classpath");
            }
            properties.load(is);
        }

        gpasUrl = properties.getProperty("eu.datamanagementunit.transit.gpas.url");
        keycloakUrl = properties.getProperty("eu.datamanagementunit.transit.gpas.keycloak.server.url");
        keycloakRealm = properties.getProperty("eu.datamanagementunit.transit.gpas.keycloak.realm");

        if (gpasUrl == null || keycloakUrl == null || keycloakRealm == null) {
            throw new RuntimeException("Required GPAS/Keycloak properties not found in application.properties");
        }
    }

    private boolean isServiceAvailable(String url) {
        try {
            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setRequestMethod("HEAD");
            conn.setConnectTimeout(3000);
            conn.setReadTimeout(3000);
            int responseCode = conn.getResponseCode();
            return responseCode < 500;
        } catch (Exception e) {
            return false;
        }
    }

    @Before
    public void setUp() throws Exception {
        Assume.assumeTrue("GPAS service not available at " + gpasUrl,
                isServiceAvailable(gpasUrl + "/DomainService?wsdl"));
        Assume.assumeTrue("Keycloak not available at " + keycloakUrl + "/realms/" + keycloakRealm,
                isServiceAvailable(keycloakUrl + "/realms/" + keycloakRealm));

        KeycloakAuthService keycloakAuthService = new KeycloakAuthService(
            keycloakUrl, keycloakRealm, CLIENT_ID, CLIENT_SECRET);

        QName domainServiceName = new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "DomainManagerBeanService");
        URL domainWsdlUrl = URI.create(gpasUrl + "/DomainService?wsdl").toURL();
        DomainManagerBeanService domainManagerBeanService = new DomainManagerBeanService(domainWsdlUrl, domainServiceName);
        domainManager = domainManagerBeanService.getDomainServicePort();

        Client domainClient = ClientProxy.getClient(domainManager);
        domainClient.getOutInterceptors().add(new GpasAuthOutInterceptor(keycloakAuthService));

        QName psnServiceName = new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "PSNManagerBeanService");
        URL psnWsdlUrl = URI.create(gpasUrl + "/gpasService?wsdl").toURL();
        PSNManagerBeanService psnManagerBeanService = new PSNManagerBeanService(psnWsdlUrl, psnServiceName);
        PSNManager psnManager = psnManagerBeanService.getGpasServicePort();

        Client psnClient = ClientProxy.getClient(psnManager);
        psnClient.getOutInterceptors().add(new GpasAuthOutInterceptor(keycloakAuthService));

        gpasManager = new GpasManager(domainManager, psnManager);
    }

    @Test
    public void testGetDomain_nonExistingDomain_returnsNull() {
        DomainOutDTO domain = gpasManager.getDomain("NonExistentDomainThatDoesNotExist12345");

        assertNull("Domain should be null for non-existent domain", domain);
    }

    @Test
    public void testGetOrCreatePseudonymForList_unknownDomain_returnsEmptyList() {
        List<String> originalIds = List.of("patient-001");

        List<de.fraunhofer.isst.health.transit.utils.gpas.psn.GetOrCreatePseudonymForListResponse.Return.Entry> results =
            gpasManager.getOrCreatePseudonymForList(originalIds, "NonExistentDomain12345");

        assertTrue("Results should be empty for unknown domain", results.isEmpty());
    }

    @Test
    public void testGpasManagerConstructor_withValidBeans_createsInstance() {
        assertNotNull("GpasManager should be created with valid beans", gpasManager);
    }

    @Test
    public void testCreateDomain_withValidDTO_createsDomain() {
        String domainName = "test-domain-" + System.currentTimeMillis();
        createdDomains.add(domainName);

        DomainInDTO dto = createDomainDTO(domainName);

        gpasManager.createDomain(dto);

        DomainOutDTO result = gpasManager.getDomain(domainName);
        assertNotNull("Domain should be created and retrievable", result);
        assertEquals("Domain name should match", domainName, result.getName());
    }

    @Test
    public void testCreateDomain_duplicateDomain_handlesGracefully() {
        String domainName = "test-domain-dup-" + System.currentTimeMillis();
        createdDomains.add(domainName);

        DomainInDTO dto = createDomainDTO(domainName);

        gpasManager.createDomain(dto);

        gpasManager.createDomain(dto);

        DomainOutDTO result = gpasManager.getDomain(domainName);
        assertNotNull("Domain should exist after duplicate create attempt", result);
    }

    @Test
    public void testCreateDomain_invalidCheckDigitClass_handlesGracefully() {
        String domainName = "test-domain-invalid-" + System.currentTimeMillis();

        DomainInDTO dto = createDomainDTO(domainName);
        dto.setCheckDigitClass("invalid.CheckDigitClass");

        gpasManager.createDomain(dto);

        DomainOutDTO result = gpasManager.getDomain(domainName);
        assertNull("Domain should not be created with invalid check digit class", result);
    }

    @After
    public void tearDown() {
        for (String domainName : createdDomains) {
            try {
                domainManager.deleteDomain(domainName);
            } catch (Exception e) {
                System.err.println("Failed to delete domain: " + domainName + " - " + e.getMessage());
            }
        }
        createdDomains.clear();
    }
}