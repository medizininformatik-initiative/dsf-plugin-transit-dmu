package de.fraunhofer.isst.health.transit.spring.config;

import de.fraunhofer.isst.health.transit.utils.gpas.GpasManager;
import de.fraunhofer.isst.health.transit.utils.gpas.auth.GpasAuthOutInterceptor;
import de.fraunhofer.isst.health.transit.utils.gpas.auth.KeycloakAuthService;
import de.fraunhofer.isst.health.transit.utils.gpas.domain.DomainManager;
import de.fraunhofer.isst.health.transit.utils.gpas.domain.DomainManagerBeanService;
import de.fraunhofer.isst.health.transit.utils.gpas.psn.PSNManager;
import de.fraunhofer.isst.health.transit.utils.gpas.psn.PSNManagerBeanService;
import dev.dsf.bpe.v2.documentation.ProcessDocumentation;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.xml.namespace.QName;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.logging.Logger;

@Configuration
@ComponentScan(basePackages = "de.fraunhofer.isst.health.transit")
public class GpasManagerConfig
{

    private static final Logger LOGGER = Logger.getLogger(GpasManagerConfig.class.getName());
    private static final int MAX_RETRIES = 3;
    private static final long RETRY_DELAY_SECONDS = 60;
    private static final int CONNECT_TIMEOUT = 15000;
    private static final int READ_TIMEOUT = 15000;

    @ProcessDocumentation(required = true, processNames = {
            "datamanagementuniteu_transit" }, description = "The base address of the Gpas server " +
            "to read/store Pseudonyms", example = "http://foo.bar/fhir")
    @Value("${eu.datamanagementunit.transit.gpas.url:#{null}}")
    private String gpasUrl;

    @Value("${eu.datamanagementunit.transit.gpas.keycloak.enable:false}")
    private boolean keycloakEnable;

    @Value("${eu.datamanagementunit.transit.gpas.keycloak.client.id:#{null}}")
    private String keycloakClientId;

    @Value("${eu.datamanagementunit.transit.gpas.keycloak.client.secret:#{null}}")
    private String keycloakClientSecret;

    @Value("${eu.datamanagementunit.transit.gpas.keycloak.server.url:#{null}}")
    private String keycloakServerUrl;

    @Value("${eu.datamanagementunit.transit.gpas.keycloak.realm:#{null}}")
    private String keycloakRealm;

    @Autowired(required = false)
    private KeycloakAuthService keycloakAuthService;

    @Bean
    public String debugJaxWsDiscovery() {
        try {
            // 1. Can we see the CXF class?
            Class<?> implementation = Class.forName("org.apache.cxf.jaxws.spi.ProviderImpl");
            System.out.println("DEBUG: CXF Implementation Class found: " + implementation.getName());

            // 2. Can the ServiceLoader find it normally?
            boolean found = java.util.ServiceLoader.load(jakarta.xml.ws.spi.Provider.class).iterator().hasNext();
            System.out.println("DEBUG: ServiceLoader found provider: " + found);

            // 3. Can the ServiceLoader find it if we explicitly point to the Plugin ClassLoader?
            boolean foundWithCL = java.util.ServiceLoader.load(
                    jakarta.xml.ws.spi.Provider.class,
                    this.getClass().getClassLoader()
            ).iterator().hasNext();
            System.out.println("DEBUG: ServiceLoader found provider with explicit CL: " + foundWithCL);

        } catch (ClassNotFoundException e) {
            System.err.println("DEBUG: PHYSICAL CLASS MISSING! Your shading is likely wrong.");
        }
        return "debug-complete";
    }

    @Bean( destroyMethod = "shutdown" )
    public SpringBus cxf() {
        return new SpringBus();
    }

    @Bean
    public KeycloakAuthService keycloakAuthService() {
        if (!keycloakEnable) {
            LOGGER.info("GPAS Keycloak authentication is disabled");
            return null;
        }

        if (keycloakClientId == null || keycloakClientSecret == null
                || keycloakServerUrl == null || keycloakRealm == null) {
            throw new IllegalStateException(
                    "GPAS Keycloak authentication enabled but missing configuration. " +
                    "Please provide: clientId, clientSecret, serverUrl, realm");
        }

        LOGGER.info("GPAS Keycloak authentication enabled - configuring client credentials auth");
        return new KeycloakAuthService(keycloakServerUrl, keycloakRealm, keycloakClientId, keycloakClientSecret);
    }

    private void checkGpasConnection() {
        String healthUrl = gpasUrl + "/gpasService?wsdl";
        LOGGER.info("Starting GPAS health check - URL: " + healthUrl + ", timeouts: " + CONNECT_TIMEOUT + "ms");

        for (int attempt = 1; attempt <= MAX_RETRIES; attempt++) {
            LOGGER.info("GPAS health check attempt " + attempt + "/" + MAX_RETRIES + " - URL: " + healthUrl);

            try {
                URL url = new URL(healthUrl);
                LOGGER.fine("Opening connection to: " + healthUrl);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                conn.setConnectTimeout(CONNECT_TIMEOUT);
                conn.setReadTimeout(READ_TIMEOUT);
                conn.setInstanceFollowRedirects(true);
                conn.setRequestProperty("Accept", "application/xml");

                LOGGER.fine("Connection opened, getting response code...");
                int responseCode = conn.getResponseCode();
                LOGGER.fine("Response code received: " + responseCode);

                if (responseCode == 200) {
                    LOGGER.info("GPAS connection check PASSED on attempt " + attempt);
                    return;
                } else {
                    LOGGER.warning("GPAS health check returned HTTP " + responseCode + " on attempt " + attempt);
                }
            } catch (IOException e) {
                String exceptionType = e.getClass().getSimpleName();
                LOGGER.warning("GPAS health check attempt " + attempt + " failed: " + exceptionType + " - " + e.getMessage());
                if (e.getMessage() != null && e.getMessage().contains("timed out")) {
                    LOGGER.warning("Timeout occurred - check if gPAS container is accessible from DSF BPE container");
                }
            }

            if (attempt < MAX_RETRIES) {
                LOGGER.info("Waiting " + RETRY_DELAY_SECONDS + " seconds before retry...");
                try {
                    Thread.sleep(RETRY_DELAY_SECONDS * 1000);
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        }

        throw new RuntimeException("GPAS availability check failed after " + MAX_RETRIES + " attempts - URL: " + healthUrl);
    }

    public String getGpasUrl() {
        return gpasUrl;
    }

    @Bean
    public DomainManagerBeanService domainManagerBeanService() {
        checkGpasConnection();

        ClassLoader originalClassLoader = Thread.currentThread().getContextClassLoader();
        try {
            Thread.currentThread().setContextClassLoader(this.getClass().getClassLoader());
            QName serviceName = new QName("http://psn.ttp.ganimed.icmvc.emau.org/",
                    "DomainManagerBeanService");

            URL wsdlURL = URI.create(this.gpasUrl + "/DomainService?wsdl").toURL();
            DomainManagerBeanService service = new DomainManagerBeanService(wsdlURL, serviceName);

            if (keycloakAuthService != null) {
                addAuthInterceptor(service, keycloakAuthService);
            }

            return service;
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } finally {
            Thread.currentThread().setContextClassLoader(originalClassLoader);
        }
    }

    @Bean
    public PSNManagerBeanService psnManagerBeanService() {
        ClassLoader originalClassLoader = Thread.currentThread().getContextClassLoader();
        try {
            Thread.currentThread().setContextClassLoader(this.getClass().getClassLoader());
            QName serviceName = new QName("http://psn.ttp.ganimed.icmvc.emau.org/",
                    "PSNManagerBeanService");

            URL wsdlURL = URI.create(this.gpasUrl + "/gpasService?wsdl").toURL();
            PSNManagerBeanService service = new PSNManagerBeanService(wsdlURL, serviceName);

            if (keycloakAuthService != null) {
                addAuthInterceptor(service, keycloakAuthService);
            }

            return service;
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } finally {
            Thread.currentThread().setContextClassLoader(originalClassLoader);
        }
    }

    @Bean
    public DomainManager domainManagerPort(DomainManagerBeanService service) {
        var port = service.getDomainServicePort();
        if (keycloakAuthService != null) {
            Client client = ClientProxy.getClient(port);
            client.getOutInterceptors().add(new GpasAuthOutInterceptor(keycloakAuthService));
            LOGGER.info("Added auth interceptor to DomainManager port");
        }
        return port;
    }

    @Bean
    public PSNManager psnManagerPort(PSNManagerBeanService service) {
        var port = service.getGpasServicePort();
        if (keycloakAuthService != null) {
            Client client = ClientProxy.getClient(port);
            client.getOutInterceptors().add(new GpasAuthOutInterceptor(keycloakAuthService));
            LOGGER.info("Added auth interceptor to PSNManager port");
        }
        return port;
    }

    private void addAuthInterceptor(DomainManagerBeanService service, KeycloakAuthService authService) {
        var port = service.getDomainServicePort();
        Client client = ClientProxy.getClient(port);
        client.getOutInterceptors().add(new GpasAuthOutInterceptor(authService));
        LOGGER.info("Added auth interceptor to DomainManagerBeanService");
    }

    private void addAuthInterceptor(PSNManagerBeanService service, KeycloakAuthService authService) {
        var port = service.getGpasServicePort();
        Client client = ClientProxy.getClient(port);
        client.getOutInterceptors().add(new GpasAuthOutInterceptor(authService));
        LOGGER.info("Added auth interceptor to PSNManagerBeanService");
    }

    @Bean
    public GpasManager gpasManager(DomainManager ds, PSNManager ps){
        return new GpasManager(ds, ps);
    }


}
