package de.fraunhofer.isst.health.transit.utils.epix;

import de.fraunhofer.isst.health.transit.utils.epix.services.*;

import java.util.logging.Logger;

public class EpixManager {
    private static final Logger LOGGER = Logger.getLogger(EpixManager.class.getName());

    private EPIXManagementService managementService;
    private EPIXService service;

    public EpixManager(EPIXManagementService managementService, EPIXService service) {
        this.managementService = managementService;
        this.service = service;
    }

    public void createDatasource(SourceDTO sourceDTO) {
        LOGGER.info("Invoking createDatasource...");

        try {
            managementService.addSource(sourceDTO);
        } catch (DuplicateEntryException_Exception e) {
            LOGGER.info("EPIX: DuplicateEntryException has occurred.");
            LOGGER.info(e.toString());
        } catch (MPIException_Exception e) {
            LOGGER.info("EPIX: MPIException has occurred.");
            LOGGER.info(e.toString());
        } catch (InvalidParameterException_Exception e) {
            LOGGER.info("EPIX: InvalidParameterException has occurred.");
            LOGGER.info(e.toString());
        }
    }

    public SourceDTO getDatasource(String sourceName) {
        LOGGER.info("Invoking getDatasource...");

        try {
            return managementService.getSource(sourceName);
        } catch (UnknownObjectException_Exception e) {
            LOGGER.info("EPIX: UnknownObjectException has occurred.");
            LOGGER.info(e.toString());
        } catch (InvalidParameterException_Exception e) {
            LOGGER.info("EPIX: InvalidParameterException has occurred.");
            LOGGER.info(e.toString());
        }

        return null;
    }

    public void createIdentifierDomain(IdentifierDomainDTO identifierDomainDTO) {
        LOGGER.info("Invoking createIdentifierDomain...");

        try {
            managementService.addIdentifierDomain(identifierDomainDTO);
        } catch (DuplicateEntryException_Exception e) {
            LOGGER.info("EPIX: DuplicateEntryException has occurred.");
            LOGGER.info(e.toString());
        } catch (MPIException_Exception e) {
            LOGGER.info("EPIX: MPIException has occurred.");
            LOGGER.info(e.toString());
        } catch (InvalidParameterException_Exception e) {
            LOGGER.info("EPIX: InvalidParameterException has occurred.");
            LOGGER.info(e.toString());
        }
    }

    public IdentifierDomainDTO getIdentifierDomain(String identifierDomainName) {
        LOGGER.info("Invoking getIdentifierDomain...");

        try {
            return managementService.getIdentifierDomain(identifierDomainName);
        } catch (UnknownObjectException_Exception e) {
            LOGGER.info("EPIX: UnknownObjectException has occurred.");
            LOGGER.info(e.toString());
        } catch (InvalidParameterException_Exception e) {
            LOGGER.info("EPIX: InvalidParameterException has occurred.");
            LOGGER.info(e.toString());
        }

        return null;
    }

    public void createDomain(DomainDTO domainDTO) {
        LOGGER.info("Invoking createDomain...");

        try {
            managementService.addDomain(domainDTO);
        } catch (DuplicateEntryException_Exception e) {
            LOGGER.info("EPIX: DuplicateEntryException has occurred.");
            LOGGER.info(e.toString());
        } catch (UnknownObjectException_Exception e) {
            LOGGER.info("EPIX: UnknownObjectException has occurred.");
            LOGGER.info(e.toString());
        } catch (MPIException_Exception e) {
            LOGGER.info("EPIX: MPIException has occurred.");
            LOGGER.info(e.toString());
        } catch (InvalidParameterException_Exception e) {
            LOGGER.info("EPIX: InvalidParameterException has occurred.");
            LOGGER.info(e.toString());
        }
    }

    public DomainDTO getDomain(String domainName) {
        LOGGER.info("Invoking getDomain...");

        try {
            managementService.getDomain(domainName);
        } catch (UnknownObjectException_Exception e) {
            LOGGER.info("EPIX: UnknownObjectException has occurred.");
            LOGGER.info(e.toString());
        } catch (InvalidParameterException_Exception e) {
            LOGGER.info("EPIX: InvalidParameterException has occurred.");
            LOGGER.info(e.toString());
        }

        return null;
    }

    public void addPerson(String domainName, IdentityInDTO identityInDTO, String sourceName, String comment) {
        LOGGER.info("Invoking addPerson...");

        try {
            service.addPerson(domainName, identityInDTO, sourceName, comment);
        } catch (UnknownObjectException_Exception e) {
            LOGGER.info("EPIX: UnknownObjectException has occurred.");
            LOGGER.info(e.toString());
        } catch (MPIException_Exception e) {
            LOGGER.info("EPIX: MPIException has occurred.");
            LOGGER.info(e.toString());
        } catch (InvalidParameterException_Exception e) {
            LOGGER.info("EPIX: InvalidParameterException has occurred.");
            LOGGER.info(e.toString());
        }
    }

    public PersonDTO getPersonByMPI(String domainName, String mpiId) {
        LOGGER.info("Invoking getPersonByMPI...");

        try {
            return service.getPersonByMPI(domainName, mpiId);
        } catch (UnknownObjectException_Exception e) {
            LOGGER.info("EPIX: UnknownObjectException has occurred.");
            LOGGER.info(e.toString());
        } catch (InvalidParameterException_Exception e) {
            LOGGER.info("EPIX: InvalidParameterException has occurred.");
            LOGGER.info(e.toString());
        }

        return null;
    }
}
