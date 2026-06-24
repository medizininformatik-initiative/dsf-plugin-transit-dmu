package de.fraunhofer.isst.health.transit.spring.config;

import de.fraunhofer.isst.health.transit.utils.gpas.GpasManager;
import de.fraunhofer.isst.health.transit.utils.gpas.domain.DomainManagerBeanService;
import de.fraunhofer.isst.health.transit.utils.gpas.psn.PSNManagerBeanService;
import dev.dsf.bpe.v2.documentation.ProcessDocumentation;
import org.apache.cxf.bus.spring.SpringBus;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

@Configuration
@ComponentScan(basePackages = "de.fraunhofer.isst.health.transit")
public class GpasManagerConfig
{

    @ProcessDocumentation(required = true, processNames = {
            "datamanagementuniteu_transit" }, description = "The base address of the Gpas server " +
            "to read/store Pseudonyms", example = "http://foo.bar/fhir")
    @Value("${eu.datamanagementunit.transit.gpas.url:#{null}}")
    private String gpasUrl;

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
    public DomainManagerBeanService domainManagerBeanService() {
        ClassLoader originalClassLoader = Thread.currentThread().getContextClassLoader();
        try {
            // Switch to the Plugin's ClassLoader
            Thread.currentThread().setContextClassLoader(this.getClass().getClassLoader());
            QName serviceName = new QName("http://psn.ttp.ganimed.icmvc.emau.org/",
                    "DomainManagerBeanService");

            URL wsdlURL = URI.create(this.gpasUrl + "/DomainService?wsdl").toURL();
            return new DomainManagerBeanService(wsdlURL, serviceName);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } finally {
            // Always restore the original ClassLoader
            Thread.currentThread().setContextClassLoader(originalClassLoader);
        }
    }

    @Bean
    public PSNManagerBeanService psnManagerBeanService() {
        ClassLoader originalClassLoader = Thread.currentThread().getContextClassLoader();
        try {
            // Switch to the Plugin's ClassLoader
            Thread.currentThread().setContextClassLoader(this.getClass().getClassLoader());
            QName serviceName = new QName("http://psn.ttp.ganimed.icmvc.emau.org/",
                    "PSNManagerBeanService");

            URL wsdlURL = URI.create(this.gpasUrl + "/gpasService?wsdl").toURL();
            return new PSNManagerBeanService(wsdlURL, serviceName);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } finally {
            // Always restore the original ClassLoader
            Thread.currentThread().setContextClassLoader(originalClassLoader);
        }
    }

    @Bean
    public GpasManager gpasManager(DomainManagerBeanService ds, PSNManagerBeanService ps){
        return new GpasManager(ds, ps);
    }


}
