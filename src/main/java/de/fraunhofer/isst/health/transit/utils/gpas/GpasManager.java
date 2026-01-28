package de.fraunhofer.isst.health.transit.utils.gpas;

import de.fraunhofer.isst.health.transit.utils.gpas.domain.*;
import de.fraunhofer.isst.health.transit.utils.gpas.psn.DomainIsFullExceptionException;
import de.fraunhofer.isst.health.transit.utils.gpas.psn.GetOrCreatePseudonymForListResponse;
import de.fraunhofer.isst.health.transit.utils.gpas.psn.PSNManager;
import de.fraunhofer.isst.health.transit.utils.gpas.psn.PSNManagerBeanService;

import java.util.List;
import java.util.logging.Logger;

public class GpasManager {

    private static final Logger LOGGER = Logger.getLogger(GpasManager.class.getName());
    private DomainManagerBeanService ds;
    private PSNManagerBeanService ps;
    public GpasManager(){

    }

    public GpasManager(DomainManagerBeanService ds, PSNManagerBeanService ps) {
        this.ds = ds;
        this.ps = ps;
    }

    public DomainOutDTO getDomain(String domainName) {

        LOGGER.info("Invoking addDomain...");
        try {
            DomainManager port = ds.getDomainServicePort();
            return port.getDomain(domainName);
        } catch (UnknownDomainException e) {
            LOGGER.info("Expected exception: UnknownDomainException has occurred.");
            LOGGER.info(e.toString());
        } catch (InvalidParameterExceptionException e) {
            LOGGER.info("Expected exception: InvalidParameterException has occurred.");
            LOGGER.info(e.toString());
        }

        return null;
    }

    public void createDomain(DomainInDTO domainDTO) {

        LOGGER.info("Invoking addDomain...");
        try {
            DomainManager port = ds.getDomainServicePort();
            port.addDomain(domainDTO);
        } catch (InvalidParameterExceptionException e) {
            LOGGER.info("Expected exception: InvalidParameterException has occurred.");
            LOGGER.info(e.toString());
        } catch (DomainInUseException e) {
            LOGGER.info("Expected exception: DomainInUseException has occurred.");
            LOGGER.info(e.toString());
        } catch (InvalidGeneratorException e) {
            LOGGER.info("Expected exception: InvalidGeneratorException has occurred.");
            LOGGER.info(e.toString());
        } catch (InvalidAlphabetException e) {
            LOGGER.info("Expected exception: InvalidAlphabetException has occurred.");
            LOGGER.info(e.toString());
        } catch (UnknownDomainException e) {
            LOGGER.info("Expected exception: UnknownDomainException has occurred.");
            LOGGER.info(e.toString());
        } catch (InvalidParentDomainExceptionException e) {
            LOGGER.info("Expected exception: InvalidParentDomainException has occurred.");
            LOGGER.info(e.toString());
        } catch (InvalidCheckDigitClassException e) {
            LOGGER.info("Expected exception: InvalidCheckDigitClassException has occurred.");
            LOGGER.info(e.toString());
        }
    }

    public List<GetOrCreatePseudonymForListResponse.Return.Entry> getOrCreatePseudonymForList(List<String> original,
                                                                                              String domain) {

        LOGGER.info("Invoking getOrCreatePseudonymForList...");
        try {
            PSNManager port = ps.getGpasServicePort();
            GetOrCreatePseudonymForListResponse.Return reponseList = port.getOrCreatePseudonymForList(original, domain);
            LOGGER.info("getOrCreatePseudonymForList.result=" + reponseList);
            return reponseList.getEntry();
        } catch (de.fraunhofer.isst.health.transit.utils.gpas.psn.UnknownDomainException e) {
            LOGGER.info("Expected exception: UnknownDomainException has occurred.");
            LOGGER.info(e.toString());
        } catch (de.fraunhofer.isst.health.transit.utils.gpas.psn.InvalidParameterExceptionException e) {
            LOGGER.info("Expected exception: InvalidParameterException has occurred.");
            LOGGER.info(e.toString());
        } catch (DomainIsFullExceptionException e) {
            LOGGER.info("Expected exception: DomainIsFullException has occurred.");
            LOGGER.info(e.toString());
        }
        return List.of();
    }
}
