package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;

import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.fraunhofer.isst.health.transit.utils.epix.services package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _AddContact_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "addContact");
    private static final QName _AddContactResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "addContactResponse");
    private static final QName _AddLocalIdentifierToActivePersonWithMPI_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "addLocalIdentifierToActivePersonWithMPI");
    private static final QName _AddLocalIdentifierToActivePersonWithMPIResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "addLocalIdentifierToActivePersonWithMPIResponse");
    private static final QName _AddLocalIdentifierToIdentifier_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "addLocalIdentifierToIdentifier");
    private static final QName _AddLocalIdentifierToIdentifierResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "addLocalIdentifierToIdentifierResponse");
    private static final QName _AddLocalIdentifierToMPI_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "addLocalIdentifierToMPI");
    private static final QName _AddLocalIdentifierToMPIResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "addLocalIdentifierToMPIResponse");
    private static final QName _AddPerson_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "addPerson");
    private static final QName _AddPersonResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "addPersonResponse");
    private static final QName _AssignIdentity_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "assignIdentity");
    private static final QName _AssignIdentityResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "assignIdentityResponse");
    private static final QName _CountActivePersonsForDomainFiltered_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "countActivePersonsForDomainFiltered");
    private static final QName _CountActivePersonsForDomainFilteredResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "countActivePersonsForDomainFilteredResponse");
    private static final QName _CountIdentitiesForDomainFiltered_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "countIdentitiesForDomainFiltered");
    private static final QName _CountIdentitiesForDomainFilteredResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "countIdentitiesForDomainFilteredResponse");
    private static final QName _CountPersonsForDomainFiltered_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "countPersonsForDomainFiltered");
    private static final QName _CountPersonsForDomainFilteredResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "countPersonsForDomainFilteredResponse");
    private static final QName _CountPossibleMatchesForDomain_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "countPossibleMatchesForDomain");
    private static final QName _CountPossibleMatchesForDomainFiltered_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "countPossibleMatchesForDomainFiltered");
    private static final QName _CountPossibleMatchesForDomainFilteredResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "countPossibleMatchesForDomainFilteredResponse");
    private static final QName _CountPossibleMatchesForDomainResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "countPossibleMatchesForDomainResponse");
    private static final QName _DeactivateContact_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "deactivateContact");
    private static final QName _DeactivateContactResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "deactivateContactResponse");
    private static final QName _DeactivateIdentity_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "deactivateIdentity");
    private static final QName _DeactivateIdentityResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "deactivateIdentityResponse");
    private static final QName _DeactivatePerson_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "deactivatePerson");
    private static final QName _DeactivatePersonResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "deactivatePersonResponse");
    private static final QName _DeleteContact_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "deleteContact");
    private static final QName _DeleteContactResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "deleteContactResponse");
    private static final QName _DeleteIdentity_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "deleteIdentity");
    private static final QName _DeleteIdentityResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "deleteIdentityResponse");
    private static final QName _DeletePerson_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "deletePerson");
    private static final QName _DeletePersonResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "deletePersonResponse");
    private static final QName _ExternalPossibleMatchForIdentity_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "externalPossibleMatchForIdentity");
    private static final QName _ExternalPossibleMatchForIdentityResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "externalPossibleMatchForIdentityResponse");
    private static final QName _ExternalPossibleMatchForPerson_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "externalPossibleMatchForPerson");
    private static final QName _ExternalPossibleMatchForPersonResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "externalPossibleMatchForPersonResponse");
    private static final QName _GetActivePersonByLocalIdentifier_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getActivePersonByLocalIdentifier");
    private static final QName _GetActivePersonByLocalIdentifierResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getActivePersonByLocalIdentifierResponse");
    private static final QName _GetActivePersonByMPI_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getActivePersonByMPI");
    private static final QName _GetActivePersonByMPIResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getActivePersonByMPIResponse");
    private static final QName _GetActivePersonByMultipleLocalIdentifier_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getActivePersonByMultipleLocalIdentifier");
    private static final QName _GetActivePersonByMultipleLocalIdentifierResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getActivePersonByMultipleLocalIdentifierResponse");
    private static final QName _GetActivePersonsByMPIBatch_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getActivePersonsByMPIBatch");
    private static final QName _GetActivePersonsByMPIBatchResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getActivePersonsByMPIBatchResponse");
    private static final QName _GetActivePersonsForDomain_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getActivePersonsForDomain");
    private static final QName _GetActivePersonsForDomainFiltered_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getActivePersonsForDomainFiltered");
    private static final QName _GetActivePersonsForDomainFilteredResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getActivePersonsForDomainFilteredResponse");
    private static final QName _GetActivePersonsForDomainPaginated_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getActivePersonsForDomainPaginated");
    private static final QName _GetActivePersonsForDomainPaginatedResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getActivePersonsForDomainPaginatedResponse");
    private static final QName _GetActivePersonsForDomainResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getActivePersonsForDomainResponse");
    private static final QName _GetAllIdentifierForAcivePersonWithMPI_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getAllIdentifierForAcivePersonWithMPI");
    private static final QName _GetAllIdentifierForAcivePersonWithMPIResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getAllIdentifierForAcivePersonWithMPIResponse");
    private static final QName _GetAllIdentifierForIdentifier_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getAllIdentifierForIdentifier");
    private static final QName _GetAllIdentifierForIdentifierResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getAllIdentifierForIdentifierResponse");
    private static final QName _GetAllIdentifierForMPI_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getAllIdentifierForMPI");
    private static final QName _GetAllIdentifierForMPIResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getAllIdentifierForMPIResponse");
    private static final QName _GetAllMPIFromActivePersonByMPI_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getAllMPIFromActivePersonByMPI");
    private static final QName _GetAllMPIFromActivePersonByMPIResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getAllMPIFromActivePersonByMPIResponse");
    private static final QName _GetAllMPIFromPersonByMPI_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getAllMPIFromPersonByMPI");
    private static final QName _GetAllMPIFromPersonByMPIResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getAllMPIFromPersonByMPIResponse");
    private static final QName _GetIdentitiesForDomain_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getIdentitiesForDomain");
    private static final QName _GetIdentitiesForDomainFiltered_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getIdentitiesForDomainFiltered");
    private static final QName _GetIdentitiesForDomainFilteredResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getIdentitiesForDomainFilteredResponse");
    private static final QName _GetIdentitiesForDomainPaginated_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getIdentitiesForDomainPaginated");
    private static final QName _GetIdentitiesForDomainPaginatedResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getIdentitiesForDomainPaginatedResponse");
    private static final QName _GetIdentitiesForDomainResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getIdentitiesForDomainResponse");
    private static final QName _GetMPIForIdentifier_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getMPIForIdentifier");
    private static final QName _GetMPIForIdentifierResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getMPIForIdentifierResponse");
    private static final QName _GetPersonByFirstMPI_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getPersonByFirstMPI");
    private static final QName _GetPersonByFirstMPIResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getPersonByFirstMPIResponse");
    private static final QName _GetPersonByLocalIdentifier_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getPersonByLocalIdentifier");
    private static final QName _GetPersonByLocalIdentifierResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getPersonByLocalIdentifierResponse");
    private static final QName _GetPersonByMPI_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getPersonByMPI");
    private static final QName _GetPersonByMPIResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getPersonByMPIResponse");
    private static final QName _GetPersonByMultipleLocalIdentifier_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getPersonByMultipleLocalIdentifier");
    private static final QName _GetPersonByMultipleLocalIdentifierResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getPersonByMultipleLocalIdentifierResponse");
    private static final QName _GetPersonsByFirstMPIBatch_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getPersonsByFirstMPIBatch");
    private static final QName _GetPersonsByFirstMPIBatchResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getPersonsByFirstMPIBatchResponse");
    private static final QName _GetPersonsByMPIBatch_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getPersonsByMPIBatch");
    private static final QName _GetPersonsByMPIBatchResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getPersonsByMPIBatchResponse");
    private static final QName _GetPersonsForDomain_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getPersonsForDomain");
    private static final QName _GetPersonsForDomainFiltered_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getPersonsForDomainFiltered");
    private static final QName _GetPersonsForDomainFilteredResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getPersonsForDomainFilteredResponse");
    private static final QName _GetPersonsForDomainPaginated_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getPersonsForDomainPaginated");
    private static final QName _GetPersonsForDomainPaginatedResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getPersonsForDomainPaginatedResponse");
    private static final QName _GetPersonsForDomainResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getPersonsForDomainResponse");
    private static final QName _GetPossibleMatchesForDomain_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getPossibleMatchesForDomain");
    private static final QName _GetPossibleMatchesForDomainFiltered_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getPossibleMatchesForDomainFiltered");
    private static final QName _GetPossibleMatchesForDomainFilteredResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getPossibleMatchesForDomainFilteredResponse");
    private static final QName _GetPossibleMatchesForDomainResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getPossibleMatchesForDomainResponse");
    private static final QName _GetPossibleMatchesForPerson_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getPossibleMatchesForPerson");
    private static final QName _GetPossibleMatchesForPersonResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "getPossibleMatchesForPersonResponse");
    private static final QName _MoveIdentitiesForIdentifierToPerson_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "moveIdentitiesForIdentifierToPerson");
    private static final QName _MoveIdentitiesForIdentifierToPersonResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "moveIdentitiesForIdentifierToPersonResponse");
    private static final QName _PrioritizePossibleMatch_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "prioritizePossibleMatch");
    private static final QName _PrioritizePossibleMatchResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "prioritizePossibleMatchResponse");
    private static final QName _RemoveLocalIdentifier_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "removeLocalIdentifier");
    private static final QName _RemoveLocalIdentifierResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "removeLocalIdentifierResponse");
    private static final QName _RemovePossibleMatch_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "removePossibleMatch");
    private static final QName _RemovePossibleMatchResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "removePossibleMatchResponse");
    private static final QName _RemovePossibleMatches_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "removePossibleMatches");
    private static final QName _RemovePossibleMatchesResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "removePossibleMatchesResponse");
    private static final QName _RequestMPI_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "requestMPI");
    private static final QName _RequestMPIBatch_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "requestMPIBatch");
    private static final QName _RequestMPIBatchResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "requestMPIBatchResponse");
    private static final QName _RequestMPIResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "requestMPIResponse");
    private static final QName _RequestMPIWithConfig_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "requestMPIWithConfig");
    private static final QName _RequestMPIWithConfigResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "requestMPIWithConfigResponse");
    private static final QName _SearchPersonsByPDQ_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "searchPersonsByPDQ");
    private static final QName _SearchPersonsByPDQResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "searchPersonsByPDQResponse");
    private static final QName _SetReferenceIdentity_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "setReferenceIdentity");
    private static final QName _SetReferenceIdentityResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "setReferenceIdentityResponse");
    private static final QName _UpdateActivePerson_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "updateActivePerson");
    private static final QName _UpdateActivePersonResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "updateActivePersonResponse");
    private static final QName _UpdateActivePersonWithConfig_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "updateActivePersonWithConfig");
    private static final QName _UpdateActivePersonWithConfigResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "updateActivePersonWithConfigResponse");
    private static final QName _UpdatePerson_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "updatePerson");
    private static final QName _UpdatePersonResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "updatePersonResponse");
    private static final QName _UpdatePersonWithConfig_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "updatePersonWithConfig");
    private static final QName _UpdatePersonWithConfigResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "updatePersonWithConfigResponse");
    private static final QName _UpdatePrivacy_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "updatePrivacy");
    private static final QName _UpdatePrivacyResponse_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "updatePrivacyResponse");
    private static final QName _UnknownObjectException_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "UnknownObjectException");
    private static final QName _MPIException_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "MPIException");
    private static final QName _ValidatorException_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "ValidatorException");
    private static final QName _InvalidParameterException_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "InvalidParameterException");
    private static final QName _IllegalOperationException_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "IllegalOperationException");
    private static final QName _DuplicateEntryException_QNAME = new QName("http://service.epix.ttp.icmvc.emau.org/", "DuplicateEntryException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.fraunhofer.isst.health.transit.utils.epix.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PaginationConfig }
     * 
     * @return
     *     the new instance of {@link PaginationConfig }
     */
    public PaginationConfig createPaginationConfig() {
        return new PaginationConfig();
    }

    /**
     * Create an instance of {@link PaginationConfig.PersonFilter }
     * 
     * @return
     *     the new instance of {@link PaginationConfig.PersonFilter }
     */
    public PaginationConfig.PersonFilter createPaginationConfigPersonFilter() {
        return new PaginationConfig.PersonFilter();
    }

    /**
     * Create an instance of {@link PaginationConfig.IdentityVitalStatusStrings }
     * 
     * @return
     *     the new instance of {@link PaginationConfig.IdentityVitalStatusStrings }
     */
    public PaginationConfig.IdentityVitalStatusStrings createPaginationConfigIdentityVitalStatusStrings() {
        return new PaginationConfig.IdentityVitalStatusStrings();
    }

    /**
     * Create an instance of {@link PaginationConfig.IdentityGenderStrings }
     * 
     * @return
     *     the new instance of {@link PaginationConfig.IdentityGenderStrings }
     */
    public PaginationConfig.IdentityGenderStrings createPaginationConfigIdentityGenderStrings() {
        return new PaginationConfig.IdentityGenderStrings();
    }

    /**
     * Create an instance of {@link PaginationConfig.IdentityFilter }
     * 
     * @return
     *     the new instance of {@link PaginationConfig.IdentityFilter }
     */
    public PaginationConfig.IdentityFilter createPaginationConfigIdentityFilter() {
        return new PaginationConfig.IdentityFilter();
    }

    /**
     * Create an instance of {@link RemoveLocalIdentifierResponse }
     * 
     * @return
     *     the new instance of {@link RemoveLocalIdentifierResponse }
     */
    public RemoveLocalIdentifierResponse createRemoveLocalIdentifierResponse() {
        return new RemoveLocalIdentifierResponse();
    }

    /**
     * Create an instance of {@link RemoveLocalIdentifierResponse.Return }
     * 
     * @return
     *     the new instance of {@link RemoveLocalIdentifierResponse.Return }
     */
    public RemoveLocalIdentifierResponse.Return createRemoveLocalIdentifierResponseReturn() {
        return new RemoveLocalIdentifierResponse.Return();
    }

    /**
     * Create an instance of {@link GetPersonsForDomainPaginated }
     * 
     * @return
     *     the new instance of {@link GetPersonsForDomainPaginated }
     */
    public GetPersonsForDomainPaginated createGetPersonsForDomainPaginated() {
        return new GetPersonsForDomainPaginated();
    }

    /**
     * Create an instance of {@link GetPersonsForDomainPaginated.Filter }
     * 
     * @return
     *     the new instance of {@link GetPersonsForDomainPaginated.Filter }
     */
    public GetPersonsForDomainPaginated.Filter createGetPersonsForDomainPaginatedFilter() {
        return new GetPersonsForDomainPaginated.Filter();
    }

    /**
     * Create an instance of {@link GetPersonsForDomainFiltered }
     * 
     * @return
     *     the new instance of {@link GetPersonsForDomainFiltered }
     */
    public GetPersonsForDomainFiltered createGetPersonsForDomainFiltered() {
        return new GetPersonsForDomainFiltered();
    }

    /**
     * Create an instance of {@link GetPersonsForDomainFiltered.Filter }
     * 
     * @return
     *     the new instance of {@link GetPersonsForDomainFiltered.Filter }
     */
    public GetPersonsForDomainFiltered.Filter createGetPersonsForDomainFilteredFilter() {
        return new GetPersonsForDomainFiltered.Filter();
    }

    /**
     * Create an instance of {@link GetIdentitiesForDomainPaginated }
     * 
     * @return
     *     the new instance of {@link GetIdentitiesForDomainPaginated }
     */
    public GetIdentitiesForDomainPaginated createGetIdentitiesForDomainPaginated() {
        return new GetIdentitiesForDomainPaginated();
    }

    /**
     * Create an instance of {@link GetIdentitiesForDomainPaginated.Filter }
     * 
     * @return
     *     the new instance of {@link GetIdentitiesForDomainPaginated.Filter }
     */
    public GetIdentitiesForDomainPaginated.Filter createGetIdentitiesForDomainPaginatedFilter() {
        return new GetIdentitiesForDomainPaginated.Filter();
    }

    /**
     * Create an instance of {@link GetIdentitiesForDomainFiltered }
     * 
     * @return
     *     the new instance of {@link GetIdentitiesForDomainFiltered }
     */
    public GetIdentitiesForDomainFiltered createGetIdentitiesForDomainFiltered() {
        return new GetIdentitiesForDomainFiltered();
    }

    /**
     * Create an instance of {@link GetIdentitiesForDomainFiltered.Filter }
     * 
     * @return
     *     the new instance of {@link GetIdentitiesForDomainFiltered.Filter }
     */
    public GetIdentitiesForDomainFiltered.Filter createGetIdentitiesForDomainFilteredFilter() {
        return new GetIdentitiesForDomainFiltered.Filter();
    }

    /**
     * Create an instance of {@link GetActivePersonsForDomainPaginated }
     * 
     * @return
     *     the new instance of {@link GetActivePersonsForDomainPaginated }
     */
    public GetActivePersonsForDomainPaginated createGetActivePersonsForDomainPaginated() {
        return new GetActivePersonsForDomainPaginated();
    }

    /**
     * Create an instance of {@link GetActivePersonsForDomainPaginated.Filter }
     * 
     * @return
     *     the new instance of {@link GetActivePersonsForDomainPaginated.Filter }
     */
    public GetActivePersonsForDomainPaginated.Filter createGetActivePersonsForDomainPaginatedFilter() {
        return new GetActivePersonsForDomainPaginated.Filter();
    }

    /**
     * Create an instance of {@link GetActivePersonsForDomainFiltered }
     * 
     * @return
     *     the new instance of {@link GetActivePersonsForDomainFiltered }
     */
    public GetActivePersonsForDomainFiltered createGetActivePersonsForDomainFiltered() {
        return new GetActivePersonsForDomainFiltered();
    }

    /**
     * Create an instance of {@link GetActivePersonsForDomainFiltered.Filter }
     * 
     * @return
     *     the new instance of {@link GetActivePersonsForDomainFiltered.Filter }
     */
    public GetActivePersonsForDomainFiltered.Filter createGetActivePersonsForDomainFilteredFilter() {
        return new GetActivePersonsForDomainFiltered.Filter();
    }

    /**
     * Create an instance of {@link CountPersonsForDomainFiltered }
     * 
     * @return
     *     the new instance of {@link CountPersonsForDomainFiltered }
     */
    public CountPersonsForDomainFiltered createCountPersonsForDomainFiltered() {
        return new CountPersonsForDomainFiltered();
    }

    /**
     * Create an instance of {@link CountPersonsForDomainFiltered.Filter }
     * 
     * @return
     *     the new instance of {@link CountPersonsForDomainFiltered.Filter }
     */
    public CountPersonsForDomainFiltered.Filter createCountPersonsForDomainFilteredFilter() {
        return new CountPersonsForDomainFiltered.Filter();
    }

    /**
     * Create an instance of {@link CountIdentitiesForDomainFiltered }
     * 
     * @return
     *     the new instance of {@link CountIdentitiesForDomainFiltered }
     */
    public CountIdentitiesForDomainFiltered createCountIdentitiesForDomainFiltered() {
        return new CountIdentitiesForDomainFiltered();
    }

    /**
     * Create an instance of {@link CountIdentitiesForDomainFiltered.Filter }
     * 
     * @return
     *     the new instance of {@link CountIdentitiesForDomainFiltered.Filter }
     */
    public CountIdentitiesForDomainFiltered.Filter createCountIdentitiesForDomainFilteredFilter() {
        return new CountIdentitiesForDomainFiltered.Filter();
    }

    /**
     * Create an instance of {@link CountActivePersonsForDomainFiltered }
     * 
     * @return
     *     the new instance of {@link CountActivePersonsForDomainFiltered }
     */
    public CountActivePersonsForDomainFiltered createCountActivePersonsForDomainFiltered() {
        return new CountActivePersonsForDomainFiltered();
    }

    /**
     * Create an instance of {@link CountActivePersonsForDomainFiltered.Filter }
     * 
     * @return
     *     the new instance of {@link CountActivePersonsForDomainFiltered.Filter }
     */
    public CountActivePersonsForDomainFiltered.Filter createCountActivePersonsForDomainFilteredFilter() {
        return new CountActivePersonsForDomainFiltered.Filter();
    }

    /**
     * Create an instance of {@link MpiResponseDTO }
     * 
     * @return
     *     the new instance of {@link MpiResponseDTO }
     */
    public MpiResponseDTO createMpiResponseDTO() {
        return new MpiResponseDTO();
    }

    /**
     * Create an instance of {@link MpiResponseDTO.ResponseEntries }
     * 
     * @return
     *     the new instance of {@link MpiResponseDTO.ResponseEntries }
     */
    public MpiResponseDTO.ResponseEntries createMpiResponseDTOResponseEntries() {
        return new MpiResponseDTO.ResponseEntries();
    }

    /**
     * Create an instance of {@link IdentityInDTO }
     * 
     * @return
     *     the new instance of {@link IdentityInDTO }
     */
    public IdentityInDTO createIdentityInDTO() {
        return new IdentityInDTO();
    }

    /**
     * Create an instance of {@link IdentityInBaseDTO }
     * 
     * @return
     *     the new instance of {@link IdentityInBaseDTO }
     */
    public IdentityInBaseDTO createIdentityInBaseDTO() {
        return new IdentityInBaseDTO();
    }

    /**
     * Create an instance of {@link ContactInDTO }
     * 
     * @return
     *     the new instance of {@link ContactInDTO }
     */
    public ContactInDTO createContactInDTO() {
        return new ContactInDTO();
    }

    /**
     * Create an instance of {@link IdentifierDTO }
     * 
     * @return
     *     the new instance of {@link IdentifierDTO }
     */
    public IdentifierDTO createIdentifierDTO() {
        return new IdentifierDTO();
    }

    /**
     * Create an instance of {@link IdentifierDomainDTO }
     * 
     * @return
     *     the new instance of {@link IdentifierDomainDTO }
     */
    public IdentifierDomainDTO createIdentifierDomainDTO() {
        return new IdentifierDomainDTO();
    }

    /**
     * Create an instance of {@link ResponseEntryDTO }
     * 
     * @return
     *     the new instance of {@link ResponseEntryDTO }
     */
    public ResponseEntryDTO createResponseEntryDTO() {
        return new ResponseEntryDTO();
    }

    /**
     * Create an instance of {@link PersonDTO }
     * 
     * @return
     *     the new instance of {@link PersonDTO }
     */
    public PersonDTO createPersonDTO() {
        return new PersonDTO();
    }

    /**
     * Create an instance of {@link PersonBaseDTO }
     * 
     * @return
     *     the new instance of {@link PersonBaseDTO }
     */
    public PersonBaseDTO createPersonBaseDTO() {
        return new PersonBaseDTO();
    }

    /**
     * Create an instance of {@link IdentityOutDTO }
     * 
     * @return
     *     the new instance of {@link IdentityOutDTO }
     */
    public IdentityOutDTO createIdentityOutDTO() {
        return new IdentityOutDTO();
    }

    /**
     * Create an instance of {@link IdentityOutBaseDTO }
     * 
     * @return
     *     the new instance of {@link IdentityOutBaseDTO }
     */
    public IdentityOutBaseDTO createIdentityOutBaseDTO() {
        return new IdentityOutBaseDTO();
    }

    /**
     * Create an instance of {@link ContactOutDTO }
     * 
     * @return
     *     the new instance of {@link ContactOutDTO }
     */
    public ContactOutDTO createContactOutDTO() {
        return new ContactOutDTO();
    }

    /**
     * Create an instance of {@link SourceDTO }
     * 
     * @return
     *     the new instance of {@link SourceDTO }
     */
    public SourceDTO createSourceDTO() {
        return new SourceDTO();
    }

    /**
     * Create an instance of {@link MpiRequestDTO }
     * 
     * @return
     *     the new instance of {@link MpiRequestDTO }
     */
    public MpiRequestDTO createMpiRequestDTO() {
        return new MpiRequestDTO();
    }

    /**
     * Create an instance of {@link RequestConfig }
     * 
     * @return
     *     the new instance of {@link RequestConfig }
     */
    public RequestConfig createRequestConfig() {
        return new RequestConfig();
    }

    /**
     * Create an instance of {@link PossibleMatchDTO }
     * 
     * @return
     *     the new instance of {@link PossibleMatchDTO }
     */
    public PossibleMatchDTO createPossibleMatchDTO() {
        return new PossibleMatchDTO();
    }

    /**
     * Create an instance of {@link MpiIdentityDTO }
     * 
     * @return
     *     the new instance of {@link MpiIdentityDTO }
     */
    public MpiIdentityDTO createMpiIdentityDTO() {
        return new MpiIdentityDTO();
    }

    /**
     * Create an instance of {@link PossibleMatchForMPIDTO }
     * 
     * @return
     *     the new instance of {@link PossibleMatchForMPIDTO }
     */
    public PossibleMatchForMPIDTO createPossibleMatchForMPIDTO() {
        return new PossibleMatchForMPIDTO();
    }

    /**
     * Create an instance of {@link AddContact }
     * 
     * @return
     *     the new instance of {@link AddContact }
     */
    public AddContact createAddContact() {
        return new AddContact();
    }

    /**
     * Create an instance of {@link AddContactResponse }
     * 
     * @return
     *     the new instance of {@link AddContactResponse }
     */
    public AddContactResponse createAddContactResponse() {
        return new AddContactResponse();
    }

    /**
     * Create an instance of {@link AddLocalIdentifierToActivePersonWithMPI }
     * 
     * @return
     *     the new instance of {@link AddLocalIdentifierToActivePersonWithMPI }
     */
    public AddLocalIdentifierToActivePersonWithMPI createAddLocalIdentifierToActivePersonWithMPI() {
        return new AddLocalIdentifierToActivePersonWithMPI();
    }

    /**
     * Create an instance of {@link AddLocalIdentifierToActivePersonWithMPIResponse }
     * 
     * @return
     *     the new instance of {@link AddLocalIdentifierToActivePersonWithMPIResponse }
     */
    public AddLocalIdentifierToActivePersonWithMPIResponse createAddLocalIdentifierToActivePersonWithMPIResponse() {
        return new AddLocalIdentifierToActivePersonWithMPIResponse();
    }

    /**
     * Create an instance of {@link AddLocalIdentifierToIdentifier }
     * 
     * @return
     *     the new instance of {@link AddLocalIdentifierToIdentifier }
     */
    public AddLocalIdentifierToIdentifier createAddLocalIdentifierToIdentifier() {
        return new AddLocalIdentifierToIdentifier();
    }

    /**
     * Create an instance of {@link AddLocalIdentifierToIdentifierResponse }
     * 
     * @return
     *     the new instance of {@link AddLocalIdentifierToIdentifierResponse }
     */
    public AddLocalIdentifierToIdentifierResponse createAddLocalIdentifierToIdentifierResponse() {
        return new AddLocalIdentifierToIdentifierResponse();
    }

    /**
     * Create an instance of {@link AddLocalIdentifierToMPI }
     * 
     * @return
     *     the new instance of {@link AddLocalIdentifierToMPI }
     */
    public AddLocalIdentifierToMPI createAddLocalIdentifierToMPI() {
        return new AddLocalIdentifierToMPI();
    }

    /**
     * Create an instance of {@link AddLocalIdentifierToMPIResponse }
     * 
     * @return
     *     the new instance of {@link AddLocalIdentifierToMPIResponse }
     */
    public AddLocalIdentifierToMPIResponse createAddLocalIdentifierToMPIResponse() {
        return new AddLocalIdentifierToMPIResponse();
    }

    /**
     * Create an instance of {@link AddPerson }
     * 
     * @return
     *     the new instance of {@link AddPerson }
     */
    public AddPerson createAddPerson() {
        return new AddPerson();
    }

    /**
     * Create an instance of {@link AddPersonResponse }
     * 
     * @return
     *     the new instance of {@link AddPersonResponse }
     */
    public AddPersonResponse createAddPersonResponse() {
        return new AddPersonResponse();
    }

    /**
     * Create an instance of {@link AssignIdentity }
     * 
     * @return
     *     the new instance of {@link AssignIdentity }
     */
    public AssignIdentity createAssignIdentity() {
        return new AssignIdentity();
    }

    /**
     * Create an instance of {@link AssignIdentityResponse }
     * 
     * @return
     *     the new instance of {@link AssignIdentityResponse }
     */
    public AssignIdentityResponse createAssignIdentityResponse() {
        return new AssignIdentityResponse();
    }

    /**
     * Create an instance of {@link CountActivePersonsForDomainFilteredResponse }
     * 
     * @return
     *     the new instance of {@link CountActivePersonsForDomainFilteredResponse }
     */
    public CountActivePersonsForDomainFilteredResponse createCountActivePersonsForDomainFilteredResponse() {
        return new CountActivePersonsForDomainFilteredResponse();
    }

    /**
     * Create an instance of {@link CountIdentitiesForDomainFilteredResponse }
     * 
     * @return
     *     the new instance of {@link CountIdentitiesForDomainFilteredResponse }
     */
    public CountIdentitiesForDomainFilteredResponse createCountIdentitiesForDomainFilteredResponse() {
        return new CountIdentitiesForDomainFilteredResponse();
    }

    /**
     * Create an instance of {@link CountPersonsForDomainFilteredResponse }
     * 
     * @return
     *     the new instance of {@link CountPersonsForDomainFilteredResponse }
     */
    public CountPersonsForDomainFilteredResponse createCountPersonsForDomainFilteredResponse() {
        return new CountPersonsForDomainFilteredResponse();
    }

    /**
     * Create an instance of {@link CountPossibleMatchesForDomain }
     * 
     * @return
     *     the new instance of {@link CountPossibleMatchesForDomain }
     */
    public CountPossibleMatchesForDomain createCountPossibleMatchesForDomain() {
        return new CountPossibleMatchesForDomain();
    }

    /**
     * Create an instance of {@link CountPossibleMatchesForDomainFiltered }
     * 
     * @return
     *     the new instance of {@link CountPossibleMatchesForDomainFiltered }
     */
    public CountPossibleMatchesForDomainFiltered createCountPossibleMatchesForDomainFiltered() {
        return new CountPossibleMatchesForDomainFiltered();
    }

    /**
     * Create an instance of {@link CountPossibleMatchesForDomainFilteredResponse }
     * 
     * @return
     *     the new instance of {@link CountPossibleMatchesForDomainFilteredResponse }
     */
    public CountPossibleMatchesForDomainFilteredResponse createCountPossibleMatchesForDomainFilteredResponse() {
        return new CountPossibleMatchesForDomainFilteredResponse();
    }

    /**
     * Create an instance of {@link CountPossibleMatchesForDomainResponse }
     * 
     * @return
     *     the new instance of {@link CountPossibleMatchesForDomainResponse }
     */
    public CountPossibleMatchesForDomainResponse createCountPossibleMatchesForDomainResponse() {
        return new CountPossibleMatchesForDomainResponse();
    }

    /**
     * Create an instance of {@link DeactivateContact }
     * 
     * @return
     *     the new instance of {@link DeactivateContact }
     */
    public DeactivateContact createDeactivateContact() {
        return new DeactivateContact();
    }

    /**
     * Create an instance of {@link DeactivateContactResponse }
     * 
     * @return
     *     the new instance of {@link DeactivateContactResponse }
     */
    public DeactivateContactResponse createDeactivateContactResponse() {
        return new DeactivateContactResponse();
    }

    /**
     * Create an instance of {@link DeactivateIdentity }
     * 
     * @return
     *     the new instance of {@link DeactivateIdentity }
     */
    public DeactivateIdentity createDeactivateIdentity() {
        return new DeactivateIdentity();
    }

    /**
     * Create an instance of {@link DeactivateIdentityResponse }
     * 
     * @return
     *     the new instance of {@link DeactivateIdentityResponse }
     */
    public DeactivateIdentityResponse createDeactivateIdentityResponse() {
        return new DeactivateIdentityResponse();
    }

    /**
     * Create an instance of {@link DeactivatePerson }
     * 
     * @return
     *     the new instance of {@link DeactivatePerson }
     */
    public DeactivatePerson createDeactivatePerson() {
        return new DeactivatePerson();
    }

    /**
     * Create an instance of {@link DeactivatePersonResponse }
     * 
     * @return
     *     the new instance of {@link DeactivatePersonResponse }
     */
    public DeactivatePersonResponse createDeactivatePersonResponse() {
        return new DeactivatePersonResponse();
    }

    /**
     * Create an instance of {@link DeleteContact }
     * 
     * @return
     *     the new instance of {@link DeleteContact }
     */
    public DeleteContact createDeleteContact() {
        return new DeleteContact();
    }

    /**
     * Create an instance of {@link DeleteContactResponse }
     * 
     * @return
     *     the new instance of {@link DeleteContactResponse }
     */
    public DeleteContactResponse createDeleteContactResponse() {
        return new DeleteContactResponse();
    }

    /**
     * Create an instance of {@link DeleteIdentity }
     * 
     * @return
     *     the new instance of {@link DeleteIdentity }
     */
    public DeleteIdentity createDeleteIdentity() {
        return new DeleteIdentity();
    }

    /**
     * Create an instance of {@link DeleteIdentityResponse }
     * 
     * @return
     *     the new instance of {@link DeleteIdentityResponse }
     */
    public DeleteIdentityResponse createDeleteIdentityResponse() {
        return new DeleteIdentityResponse();
    }

    /**
     * Create an instance of {@link DeletePerson }
     * 
     * @return
     *     the new instance of {@link DeletePerson }
     */
    public DeletePerson createDeletePerson() {
        return new DeletePerson();
    }

    /**
     * Create an instance of {@link DeletePersonResponse }
     * 
     * @return
     *     the new instance of {@link DeletePersonResponse }
     */
    public DeletePersonResponse createDeletePersonResponse() {
        return new DeletePersonResponse();
    }

    /**
     * Create an instance of {@link ExternalPossibleMatchForIdentity }
     * 
     * @return
     *     the new instance of {@link ExternalPossibleMatchForIdentity }
     */
    public ExternalPossibleMatchForIdentity createExternalPossibleMatchForIdentity() {
        return new ExternalPossibleMatchForIdentity();
    }

    /**
     * Create an instance of {@link ExternalPossibleMatchForIdentityResponse }
     * 
     * @return
     *     the new instance of {@link ExternalPossibleMatchForIdentityResponse }
     */
    public ExternalPossibleMatchForIdentityResponse createExternalPossibleMatchForIdentityResponse() {
        return new ExternalPossibleMatchForIdentityResponse();
    }

    /**
     * Create an instance of {@link ExternalPossibleMatchForPerson }
     * 
     * @return
     *     the new instance of {@link ExternalPossibleMatchForPerson }
     */
    public ExternalPossibleMatchForPerson createExternalPossibleMatchForPerson() {
        return new ExternalPossibleMatchForPerson();
    }

    /**
     * Create an instance of {@link ExternalPossibleMatchForPersonResponse }
     * 
     * @return
     *     the new instance of {@link ExternalPossibleMatchForPersonResponse }
     */
    public ExternalPossibleMatchForPersonResponse createExternalPossibleMatchForPersonResponse() {
        return new ExternalPossibleMatchForPersonResponse();
    }

    /**
     * Create an instance of {@link GetActivePersonByLocalIdentifier }
     * 
     * @return
     *     the new instance of {@link GetActivePersonByLocalIdentifier }
     */
    public GetActivePersonByLocalIdentifier createGetActivePersonByLocalIdentifier() {
        return new GetActivePersonByLocalIdentifier();
    }

    /**
     * Create an instance of {@link GetActivePersonByLocalIdentifierResponse }
     * 
     * @return
     *     the new instance of {@link GetActivePersonByLocalIdentifierResponse }
     */
    public GetActivePersonByLocalIdentifierResponse createGetActivePersonByLocalIdentifierResponse() {
        return new GetActivePersonByLocalIdentifierResponse();
    }

    /**
     * Create an instance of {@link GetActivePersonByMPI }
     * 
     * @return
     *     the new instance of {@link GetActivePersonByMPI }
     */
    public GetActivePersonByMPI createGetActivePersonByMPI() {
        return new GetActivePersonByMPI();
    }

    /**
     * Create an instance of {@link GetActivePersonByMPIResponse }
     * 
     * @return
     *     the new instance of {@link GetActivePersonByMPIResponse }
     */
    public GetActivePersonByMPIResponse createGetActivePersonByMPIResponse() {
        return new GetActivePersonByMPIResponse();
    }

    /**
     * Create an instance of {@link GetActivePersonByMultipleLocalIdentifier }
     * 
     * @return
     *     the new instance of {@link GetActivePersonByMultipleLocalIdentifier }
     */
    public GetActivePersonByMultipleLocalIdentifier createGetActivePersonByMultipleLocalIdentifier() {
        return new GetActivePersonByMultipleLocalIdentifier();
    }

    /**
     * Create an instance of {@link GetActivePersonByMultipleLocalIdentifierResponse }
     * 
     * @return
     *     the new instance of {@link GetActivePersonByMultipleLocalIdentifierResponse }
     */
    public GetActivePersonByMultipleLocalIdentifierResponse createGetActivePersonByMultipleLocalIdentifierResponse() {
        return new GetActivePersonByMultipleLocalIdentifierResponse();
    }

    /**
     * Create an instance of {@link GetActivePersonsByMPIBatch }
     * 
     * @return
     *     the new instance of {@link GetActivePersonsByMPIBatch }
     */
    public GetActivePersonsByMPIBatch createGetActivePersonsByMPIBatch() {
        return new GetActivePersonsByMPIBatch();
    }

    /**
     * Create an instance of {@link GetActivePersonsByMPIBatchResponse }
     * 
     * @return
     *     the new instance of {@link GetActivePersonsByMPIBatchResponse }
     */
    public GetActivePersonsByMPIBatchResponse createGetActivePersonsByMPIBatchResponse() {
        return new GetActivePersonsByMPIBatchResponse();
    }

    /**
     * Create an instance of {@link GetActivePersonsForDomain }
     * 
     * @return
     *     the new instance of {@link GetActivePersonsForDomain }
     */
    public GetActivePersonsForDomain createGetActivePersonsForDomain() {
        return new GetActivePersonsForDomain();
    }

    /**
     * Create an instance of {@link GetActivePersonsForDomainFilteredResponse }
     * 
     * @return
     *     the new instance of {@link GetActivePersonsForDomainFilteredResponse }
     */
    public GetActivePersonsForDomainFilteredResponse createGetActivePersonsForDomainFilteredResponse() {
        return new GetActivePersonsForDomainFilteredResponse();
    }

    /**
     * Create an instance of {@link GetActivePersonsForDomainPaginatedResponse }
     * 
     * @return
     *     the new instance of {@link GetActivePersonsForDomainPaginatedResponse }
     */
    public GetActivePersonsForDomainPaginatedResponse createGetActivePersonsForDomainPaginatedResponse() {
        return new GetActivePersonsForDomainPaginatedResponse();
    }

    /**
     * Create an instance of {@link GetActivePersonsForDomainResponse }
     * 
     * @return
     *     the new instance of {@link GetActivePersonsForDomainResponse }
     */
    public GetActivePersonsForDomainResponse createGetActivePersonsForDomainResponse() {
        return new GetActivePersonsForDomainResponse();
    }

    /**
     * Create an instance of {@link GetAllIdentifierForAcivePersonWithMPI }
     * 
     * @return
     *     the new instance of {@link GetAllIdentifierForAcivePersonWithMPI }
     */
    public GetAllIdentifierForAcivePersonWithMPI createGetAllIdentifierForAcivePersonWithMPI() {
        return new GetAllIdentifierForAcivePersonWithMPI();
    }

    /**
     * Create an instance of {@link GetAllIdentifierForAcivePersonWithMPIResponse }
     * 
     * @return
     *     the new instance of {@link GetAllIdentifierForAcivePersonWithMPIResponse }
     */
    public GetAllIdentifierForAcivePersonWithMPIResponse createGetAllIdentifierForAcivePersonWithMPIResponse() {
        return new GetAllIdentifierForAcivePersonWithMPIResponse();
    }

    /**
     * Create an instance of {@link GetAllIdentifierForIdentifier }
     * 
     * @return
     *     the new instance of {@link GetAllIdentifierForIdentifier }
     */
    public GetAllIdentifierForIdentifier createGetAllIdentifierForIdentifier() {
        return new GetAllIdentifierForIdentifier();
    }

    /**
     * Create an instance of {@link GetAllIdentifierForIdentifierResponse }
     * 
     * @return
     *     the new instance of {@link GetAllIdentifierForIdentifierResponse }
     */
    public GetAllIdentifierForIdentifierResponse createGetAllIdentifierForIdentifierResponse() {
        return new GetAllIdentifierForIdentifierResponse();
    }

    /**
     * Create an instance of {@link GetAllIdentifierForMPI }
     * 
     * @return
     *     the new instance of {@link GetAllIdentifierForMPI }
     */
    public GetAllIdentifierForMPI createGetAllIdentifierForMPI() {
        return new GetAllIdentifierForMPI();
    }

    /**
     * Create an instance of {@link GetAllIdentifierForMPIResponse }
     * 
     * @return
     *     the new instance of {@link GetAllIdentifierForMPIResponse }
     */
    public GetAllIdentifierForMPIResponse createGetAllIdentifierForMPIResponse() {
        return new GetAllIdentifierForMPIResponse();
    }

    /**
     * Create an instance of {@link GetAllMPIFromActivePersonByMPI }
     * 
     * @return
     *     the new instance of {@link GetAllMPIFromActivePersonByMPI }
     */
    public GetAllMPIFromActivePersonByMPI createGetAllMPIFromActivePersonByMPI() {
        return new GetAllMPIFromActivePersonByMPI();
    }

    /**
     * Create an instance of {@link GetAllMPIFromActivePersonByMPIResponse }
     * 
     * @return
     *     the new instance of {@link GetAllMPIFromActivePersonByMPIResponse }
     */
    public GetAllMPIFromActivePersonByMPIResponse createGetAllMPIFromActivePersonByMPIResponse() {
        return new GetAllMPIFromActivePersonByMPIResponse();
    }

    /**
     * Create an instance of {@link GetAllMPIFromPersonByMPI }
     * 
     * @return
     *     the new instance of {@link GetAllMPIFromPersonByMPI }
     */
    public GetAllMPIFromPersonByMPI createGetAllMPIFromPersonByMPI() {
        return new GetAllMPIFromPersonByMPI();
    }

    /**
     * Create an instance of {@link GetAllMPIFromPersonByMPIResponse }
     * 
     * @return
     *     the new instance of {@link GetAllMPIFromPersonByMPIResponse }
     */
    public GetAllMPIFromPersonByMPIResponse createGetAllMPIFromPersonByMPIResponse() {
        return new GetAllMPIFromPersonByMPIResponse();
    }

    /**
     * Create an instance of {@link GetIdentitiesForDomain }
     * 
     * @return
     *     the new instance of {@link GetIdentitiesForDomain }
     */
    public GetIdentitiesForDomain createGetIdentitiesForDomain() {
        return new GetIdentitiesForDomain();
    }

    /**
     * Create an instance of {@link GetIdentitiesForDomainFilteredResponse }
     * 
     * @return
     *     the new instance of {@link GetIdentitiesForDomainFilteredResponse }
     */
    public GetIdentitiesForDomainFilteredResponse createGetIdentitiesForDomainFilteredResponse() {
        return new GetIdentitiesForDomainFilteredResponse();
    }

    /**
     * Create an instance of {@link GetIdentitiesForDomainPaginatedResponse }
     * 
     * @return
     *     the new instance of {@link GetIdentitiesForDomainPaginatedResponse }
     */
    public GetIdentitiesForDomainPaginatedResponse createGetIdentitiesForDomainPaginatedResponse() {
        return new GetIdentitiesForDomainPaginatedResponse();
    }

    /**
     * Create an instance of {@link GetIdentitiesForDomainResponse }
     * 
     * @return
     *     the new instance of {@link GetIdentitiesForDomainResponse }
     */
    public GetIdentitiesForDomainResponse createGetIdentitiesForDomainResponse() {
        return new GetIdentitiesForDomainResponse();
    }

    /**
     * Create an instance of {@link GetMPIForIdentifier }
     * 
     * @return
     *     the new instance of {@link GetMPIForIdentifier }
     */
    public GetMPIForIdentifier createGetMPIForIdentifier() {
        return new GetMPIForIdentifier();
    }

    /**
     * Create an instance of {@link GetMPIForIdentifierResponse }
     * 
     * @return
     *     the new instance of {@link GetMPIForIdentifierResponse }
     */
    public GetMPIForIdentifierResponse createGetMPIForIdentifierResponse() {
        return new GetMPIForIdentifierResponse();
    }

    /**
     * Create an instance of {@link GetPersonByFirstMPI }
     * 
     * @return
     *     the new instance of {@link GetPersonByFirstMPI }
     */
    public GetPersonByFirstMPI createGetPersonByFirstMPI() {
        return new GetPersonByFirstMPI();
    }

    /**
     * Create an instance of {@link GetPersonByFirstMPIResponse }
     * 
     * @return
     *     the new instance of {@link GetPersonByFirstMPIResponse }
     */
    public GetPersonByFirstMPIResponse createGetPersonByFirstMPIResponse() {
        return new GetPersonByFirstMPIResponse();
    }

    /**
     * Create an instance of {@link GetPersonByLocalIdentifier }
     * 
     * @return
     *     the new instance of {@link GetPersonByLocalIdentifier }
     */
    public GetPersonByLocalIdentifier createGetPersonByLocalIdentifier() {
        return new GetPersonByLocalIdentifier();
    }

    /**
     * Create an instance of {@link GetPersonByLocalIdentifierResponse }
     * 
     * @return
     *     the new instance of {@link GetPersonByLocalIdentifierResponse }
     */
    public GetPersonByLocalIdentifierResponse createGetPersonByLocalIdentifierResponse() {
        return new GetPersonByLocalIdentifierResponse();
    }

    /**
     * Create an instance of {@link GetPersonByMPI }
     * 
     * @return
     *     the new instance of {@link GetPersonByMPI }
     */
    public GetPersonByMPI createGetPersonByMPI() {
        return new GetPersonByMPI();
    }

    /**
     * Create an instance of {@link GetPersonByMPIResponse }
     * 
     * @return
     *     the new instance of {@link GetPersonByMPIResponse }
     */
    public GetPersonByMPIResponse createGetPersonByMPIResponse() {
        return new GetPersonByMPIResponse();
    }

    /**
     * Create an instance of {@link GetPersonByMultipleLocalIdentifier }
     * 
     * @return
     *     the new instance of {@link GetPersonByMultipleLocalIdentifier }
     */
    public GetPersonByMultipleLocalIdentifier createGetPersonByMultipleLocalIdentifier() {
        return new GetPersonByMultipleLocalIdentifier();
    }

    /**
     * Create an instance of {@link GetPersonByMultipleLocalIdentifierResponse }
     * 
     * @return
     *     the new instance of {@link GetPersonByMultipleLocalIdentifierResponse }
     */
    public GetPersonByMultipleLocalIdentifierResponse createGetPersonByMultipleLocalIdentifierResponse() {
        return new GetPersonByMultipleLocalIdentifierResponse();
    }

    /**
     * Create an instance of {@link GetPersonsByFirstMPIBatch }
     * 
     * @return
     *     the new instance of {@link GetPersonsByFirstMPIBatch }
     */
    public GetPersonsByFirstMPIBatch createGetPersonsByFirstMPIBatch() {
        return new GetPersonsByFirstMPIBatch();
    }

    /**
     * Create an instance of {@link GetPersonsByFirstMPIBatchResponse }
     * 
     * @return
     *     the new instance of {@link GetPersonsByFirstMPIBatchResponse }
     */
    public GetPersonsByFirstMPIBatchResponse createGetPersonsByFirstMPIBatchResponse() {
        return new GetPersonsByFirstMPIBatchResponse();
    }

    /**
     * Create an instance of {@link GetPersonsByMPIBatch }
     * 
     * @return
     *     the new instance of {@link GetPersonsByMPIBatch }
     */
    public GetPersonsByMPIBatch createGetPersonsByMPIBatch() {
        return new GetPersonsByMPIBatch();
    }

    /**
     * Create an instance of {@link GetPersonsByMPIBatchResponse }
     * 
     * @return
     *     the new instance of {@link GetPersonsByMPIBatchResponse }
     */
    public GetPersonsByMPIBatchResponse createGetPersonsByMPIBatchResponse() {
        return new GetPersonsByMPIBatchResponse();
    }

    /**
     * Create an instance of {@link GetPersonsForDomain }
     * 
     * @return
     *     the new instance of {@link GetPersonsForDomain }
     */
    public GetPersonsForDomain createGetPersonsForDomain() {
        return new GetPersonsForDomain();
    }

    /**
     * Create an instance of {@link GetPersonsForDomainFilteredResponse }
     * 
     * @return
     *     the new instance of {@link GetPersonsForDomainFilteredResponse }
     */
    public GetPersonsForDomainFilteredResponse createGetPersonsForDomainFilteredResponse() {
        return new GetPersonsForDomainFilteredResponse();
    }

    /**
     * Create an instance of {@link GetPersonsForDomainPaginatedResponse }
     * 
     * @return
     *     the new instance of {@link GetPersonsForDomainPaginatedResponse }
     */
    public GetPersonsForDomainPaginatedResponse createGetPersonsForDomainPaginatedResponse() {
        return new GetPersonsForDomainPaginatedResponse();
    }

    /**
     * Create an instance of {@link GetPersonsForDomainResponse }
     * 
     * @return
     *     the new instance of {@link GetPersonsForDomainResponse }
     */
    public GetPersonsForDomainResponse createGetPersonsForDomainResponse() {
        return new GetPersonsForDomainResponse();
    }

    /**
     * Create an instance of {@link GetPossibleMatchesForDomain }
     * 
     * @return
     *     the new instance of {@link GetPossibleMatchesForDomain }
     */
    public GetPossibleMatchesForDomain createGetPossibleMatchesForDomain() {
        return new GetPossibleMatchesForDomain();
    }

    /**
     * Create an instance of {@link GetPossibleMatchesForDomainFiltered }
     * 
     * @return
     *     the new instance of {@link GetPossibleMatchesForDomainFiltered }
     */
    public GetPossibleMatchesForDomainFiltered createGetPossibleMatchesForDomainFiltered() {
        return new GetPossibleMatchesForDomainFiltered();
    }

    /**
     * Create an instance of {@link GetPossibleMatchesForDomainFilteredResponse }
     * 
     * @return
     *     the new instance of {@link GetPossibleMatchesForDomainFilteredResponse }
     */
    public GetPossibleMatchesForDomainFilteredResponse createGetPossibleMatchesForDomainFilteredResponse() {
        return new GetPossibleMatchesForDomainFilteredResponse();
    }

    /**
     * Create an instance of {@link GetPossibleMatchesForDomainResponse }
     * 
     * @return
     *     the new instance of {@link GetPossibleMatchesForDomainResponse }
     */
    public GetPossibleMatchesForDomainResponse createGetPossibleMatchesForDomainResponse() {
        return new GetPossibleMatchesForDomainResponse();
    }

    /**
     * Create an instance of {@link GetPossibleMatchesForPerson }
     * 
     * @return
     *     the new instance of {@link GetPossibleMatchesForPerson }
     */
    public GetPossibleMatchesForPerson createGetPossibleMatchesForPerson() {
        return new GetPossibleMatchesForPerson();
    }

    /**
     * Create an instance of {@link GetPossibleMatchesForPersonResponse }
     * 
     * @return
     *     the new instance of {@link GetPossibleMatchesForPersonResponse }
     */
    public GetPossibleMatchesForPersonResponse createGetPossibleMatchesForPersonResponse() {
        return new GetPossibleMatchesForPersonResponse();
    }

    /**
     * Create an instance of {@link MoveIdentitiesForIdentifierToPerson }
     * 
     * @return
     *     the new instance of {@link MoveIdentitiesForIdentifierToPerson }
     */
    public MoveIdentitiesForIdentifierToPerson createMoveIdentitiesForIdentifierToPerson() {
        return new MoveIdentitiesForIdentifierToPerson();
    }

    /**
     * Create an instance of {@link MoveIdentitiesForIdentifierToPersonResponse }
     * 
     * @return
     *     the new instance of {@link MoveIdentitiesForIdentifierToPersonResponse }
     */
    public MoveIdentitiesForIdentifierToPersonResponse createMoveIdentitiesForIdentifierToPersonResponse() {
        return new MoveIdentitiesForIdentifierToPersonResponse();
    }

    /**
     * Create an instance of {@link PrioritizePossibleMatch }
     * 
     * @return
     *     the new instance of {@link PrioritizePossibleMatch }
     */
    public PrioritizePossibleMatch createPrioritizePossibleMatch() {
        return new PrioritizePossibleMatch();
    }

    /**
     * Create an instance of {@link PrioritizePossibleMatchResponse }
     * 
     * @return
     *     the new instance of {@link PrioritizePossibleMatchResponse }
     */
    public PrioritizePossibleMatchResponse createPrioritizePossibleMatchResponse() {
        return new PrioritizePossibleMatchResponse();
    }

    /**
     * Create an instance of {@link RemoveLocalIdentifier }
     * 
     * @return
     *     the new instance of {@link RemoveLocalIdentifier }
     */
    public RemoveLocalIdentifier createRemoveLocalIdentifier() {
        return new RemoveLocalIdentifier();
    }

    /**
     * Create an instance of {@link RemovePossibleMatch }
     * 
     * @return
     *     the new instance of {@link RemovePossibleMatch }
     */
    public RemovePossibleMatch createRemovePossibleMatch() {
        return new RemovePossibleMatch();
    }

    /**
     * Create an instance of {@link RemovePossibleMatchResponse }
     * 
     * @return
     *     the new instance of {@link RemovePossibleMatchResponse }
     */
    public RemovePossibleMatchResponse createRemovePossibleMatchResponse() {
        return new RemovePossibleMatchResponse();
    }

    /**
     * Create an instance of {@link RemovePossibleMatches }
     * 
     * @return
     *     the new instance of {@link RemovePossibleMatches }
     */
    public RemovePossibleMatches createRemovePossibleMatches() {
        return new RemovePossibleMatches();
    }

    /**
     * Create an instance of {@link RemovePossibleMatchesResponse }
     * 
     * @return
     *     the new instance of {@link RemovePossibleMatchesResponse }
     */
    public RemovePossibleMatchesResponse createRemovePossibleMatchesResponse() {
        return new RemovePossibleMatchesResponse();
    }

    /**
     * Create an instance of {@link RequestMPI }
     * 
     * @return
     *     the new instance of {@link RequestMPI }
     */
    public RequestMPI createRequestMPI() {
        return new RequestMPI();
    }

    /**
     * Create an instance of {@link RequestMPIBatch }
     * 
     * @return
     *     the new instance of {@link RequestMPIBatch }
     */
    public RequestMPIBatch createRequestMPIBatch() {
        return new RequestMPIBatch();
    }

    /**
     * Create an instance of {@link RequestMPIBatchResponse }
     * 
     * @return
     *     the new instance of {@link RequestMPIBatchResponse }
     */
    public RequestMPIBatchResponse createRequestMPIBatchResponse() {
        return new RequestMPIBatchResponse();
    }

    /**
     * Create an instance of {@link RequestMPIResponse }
     * 
     * @return
     *     the new instance of {@link RequestMPIResponse }
     */
    public RequestMPIResponse createRequestMPIResponse() {
        return new RequestMPIResponse();
    }

    /**
     * Create an instance of {@link RequestMPIWithConfig }
     * 
     * @return
     *     the new instance of {@link RequestMPIWithConfig }
     */
    public RequestMPIWithConfig createRequestMPIWithConfig() {
        return new RequestMPIWithConfig();
    }

    /**
     * Create an instance of {@link RequestMPIWithConfigResponse }
     * 
     * @return
     *     the new instance of {@link RequestMPIWithConfigResponse }
     */
    public RequestMPIWithConfigResponse createRequestMPIWithConfigResponse() {
        return new RequestMPIWithConfigResponse();
    }

    /**
     * Create an instance of {@link SearchPersonsByPDQ }
     * 
     * @return
     *     the new instance of {@link SearchPersonsByPDQ }
     */
    public SearchPersonsByPDQ createSearchPersonsByPDQ() {
        return new SearchPersonsByPDQ();
    }

    /**
     * Create an instance of {@link SearchPersonsByPDQResponse }
     * 
     * @return
     *     the new instance of {@link SearchPersonsByPDQResponse }
     */
    public SearchPersonsByPDQResponse createSearchPersonsByPDQResponse() {
        return new SearchPersonsByPDQResponse();
    }

    /**
     * Create an instance of {@link SetReferenceIdentity }
     * 
     * @return
     *     the new instance of {@link SetReferenceIdentity }
     */
    public SetReferenceIdentity createSetReferenceIdentity() {
        return new SetReferenceIdentity();
    }

    /**
     * Create an instance of {@link SetReferenceIdentityResponse }
     * 
     * @return
     *     the new instance of {@link SetReferenceIdentityResponse }
     */
    public SetReferenceIdentityResponse createSetReferenceIdentityResponse() {
        return new SetReferenceIdentityResponse();
    }

    /**
     * Create an instance of {@link UpdateActivePerson }
     * 
     * @return
     *     the new instance of {@link UpdateActivePerson }
     */
    public UpdateActivePerson createUpdateActivePerson() {
        return new UpdateActivePerson();
    }

    /**
     * Create an instance of {@link UpdateActivePersonResponse }
     * 
     * @return
     *     the new instance of {@link UpdateActivePersonResponse }
     */
    public UpdateActivePersonResponse createUpdateActivePersonResponse() {
        return new UpdateActivePersonResponse();
    }

    /**
     * Create an instance of {@link UpdateActivePersonWithConfig }
     * 
     * @return
     *     the new instance of {@link UpdateActivePersonWithConfig }
     */
    public UpdateActivePersonWithConfig createUpdateActivePersonWithConfig() {
        return new UpdateActivePersonWithConfig();
    }

    /**
     * Create an instance of {@link UpdateActivePersonWithConfigResponse }
     * 
     * @return
     *     the new instance of {@link UpdateActivePersonWithConfigResponse }
     */
    public UpdateActivePersonWithConfigResponse createUpdateActivePersonWithConfigResponse() {
        return new UpdateActivePersonWithConfigResponse();
    }

    /**
     * Create an instance of {@link UpdatePerson }
     * 
     * @return
     *     the new instance of {@link UpdatePerson }
     */
    public UpdatePerson createUpdatePerson() {
        return new UpdatePerson();
    }

    /**
     * Create an instance of {@link UpdatePersonResponse }
     * 
     * @return
     *     the new instance of {@link UpdatePersonResponse }
     */
    public UpdatePersonResponse createUpdatePersonResponse() {
        return new UpdatePersonResponse();
    }

    /**
     * Create an instance of {@link UpdatePersonWithConfig }
     * 
     * @return
     *     the new instance of {@link UpdatePersonWithConfig }
     */
    public UpdatePersonWithConfig createUpdatePersonWithConfig() {
        return new UpdatePersonWithConfig();
    }

    /**
     * Create an instance of {@link UpdatePersonWithConfigResponse }
     * 
     * @return
     *     the new instance of {@link UpdatePersonWithConfigResponse }
     */
    public UpdatePersonWithConfigResponse createUpdatePersonWithConfigResponse() {
        return new UpdatePersonWithConfigResponse();
    }

    /**
     * Create an instance of {@link UpdatePrivacy }
     * 
     * @return
     *     the new instance of {@link UpdatePrivacy }
     */
    public UpdatePrivacy createUpdatePrivacy() {
        return new UpdatePrivacy();
    }

    /**
     * Create an instance of {@link UpdatePrivacyResponse }
     * 
     * @return
     *     the new instance of {@link UpdatePrivacyResponse }
     */
    public UpdatePrivacyResponse createUpdatePrivacyResponse() {
        return new UpdatePrivacyResponse();
    }

    /**
     * Create an instance of {@link UnknownObjectException }
     * 
     * @return
     *     the new instance of {@link UnknownObjectException }
     */
    public UnknownObjectException createUnknownObjectException() {
        return new UnknownObjectException();
    }

    /**
     * Create an instance of {@link MPIException }
     * 
     * @return
     *     the new instance of {@link MPIException }
     */
    public MPIException createMPIException() {
        return new MPIException();
    }

    /**
     * Create an instance of {@link ValidatorException }
     * 
     * @return
     *     the new instance of {@link ValidatorException }
     */
    public ValidatorException createValidatorException() {
        return new ValidatorException();
    }

    /**
     * Create an instance of {@link InvalidParameterException }
     * 
     * @return
     *     the new instance of {@link InvalidParameterException }
     */
    public InvalidParameterException createInvalidParameterException() {
        return new InvalidParameterException();
    }

    /**
     * Create an instance of {@link IllegalOperationException }
     * 
     * @return
     *     the new instance of {@link IllegalOperationException }
     */
    public IllegalOperationException createIllegalOperationException() {
        return new IllegalOperationException();
    }

    /**
     * Create an instance of {@link DuplicateEntryException }
     * 
     * @return
     *     the new instance of {@link DuplicateEntryException }
     */
    public DuplicateEntryException createDuplicateEntryException() {
        return new DuplicateEntryException();
    }

    /**
     * Create an instance of {@link SearchMask }
     * 
     * @return
     *     the new instance of {@link SearchMask }
     */
    public SearchMask createSearchMask() {
        return new SearchMask();
    }

    /**
     * Create an instance of {@link FuzzySearchParams }
     * 
     * @return
     *     the new instance of {@link FuzzySearchParams }
     */
    public FuzzySearchParams createFuzzySearchParams() {
        return new FuzzySearchParams();
    }

    /**
     * Create an instance of {@link PaginationConfig.PersonFilter.Entry }
     * 
     * @return
     *     the new instance of {@link PaginationConfig.PersonFilter.Entry }
     */
    public PaginationConfig.PersonFilter.Entry createPaginationConfigPersonFilterEntry() {
        return new PaginationConfig.PersonFilter.Entry();
    }

    /**
     * Create an instance of {@link PaginationConfig.IdentityVitalStatusStrings.Entry }
     * 
     * @return
     *     the new instance of {@link PaginationConfig.IdentityVitalStatusStrings.Entry }
     */
    public PaginationConfig.IdentityVitalStatusStrings.Entry createPaginationConfigIdentityVitalStatusStringsEntry() {
        return new PaginationConfig.IdentityVitalStatusStrings.Entry();
    }

    /**
     * Create an instance of {@link PaginationConfig.IdentityGenderStrings.Entry }
     * 
     * @return
     *     the new instance of {@link PaginationConfig.IdentityGenderStrings.Entry }
     */
    public PaginationConfig.IdentityGenderStrings.Entry createPaginationConfigIdentityGenderStringsEntry() {
        return new PaginationConfig.IdentityGenderStrings.Entry();
    }

    /**
     * Create an instance of {@link PaginationConfig.IdentityFilter.Entry }
     * 
     * @return
     *     the new instance of {@link PaginationConfig.IdentityFilter.Entry }
     */
    public PaginationConfig.IdentityFilter.Entry createPaginationConfigIdentityFilterEntry() {
        return new PaginationConfig.IdentityFilter.Entry();
    }

    /**
     * Create an instance of {@link RemoveLocalIdentifierResponse.Return.Entry }
     * 
     * @return
     *     the new instance of {@link RemoveLocalIdentifierResponse.Return.Entry }
     */
    public RemoveLocalIdentifierResponse.Return.Entry createRemoveLocalIdentifierResponseReturnEntry() {
        return new RemoveLocalIdentifierResponse.Return.Entry();
    }

    /**
     * Create an instance of {@link GetPersonsForDomainPaginated.Filter.Entry }
     * 
     * @return
     *     the new instance of {@link GetPersonsForDomainPaginated.Filter.Entry }
     */
    public GetPersonsForDomainPaginated.Filter.Entry createGetPersonsForDomainPaginatedFilterEntry() {
        return new GetPersonsForDomainPaginated.Filter.Entry();
    }

    /**
     * Create an instance of {@link GetPersonsForDomainFiltered.Filter.Entry }
     * 
     * @return
     *     the new instance of {@link GetPersonsForDomainFiltered.Filter.Entry }
     */
    public GetPersonsForDomainFiltered.Filter.Entry createGetPersonsForDomainFilteredFilterEntry() {
        return new GetPersonsForDomainFiltered.Filter.Entry();
    }

    /**
     * Create an instance of {@link GetIdentitiesForDomainPaginated.Filter.Entry }
     * 
     * @return
     *     the new instance of {@link GetIdentitiesForDomainPaginated.Filter.Entry }
     */
    public GetIdentitiesForDomainPaginated.Filter.Entry createGetIdentitiesForDomainPaginatedFilterEntry() {
        return new GetIdentitiesForDomainPaginated.Filter.Entry();
    }

    /**
     * Create an instance of {@link GetIdentitiesForDomainFiltered.Filter.Entry }
     * 
     * @return
     *     the new instance of {@link GetIdentitiesForDomainFiltered.Filter.Entry }
     */
    public GetIdentitiesForDomainFiltered.Filter.Entry createGetIdentitiesForDomainFilteredFilterEntry() {
        return new GetIdentitiesForDomainFiltered.Filter.Entry();
    }

    /**
     * Create an instance of {@link GetActivePersonsForDomainPaginated.Filter.Entry }
     * 
     * @return
     *     the new instance of {@link GetActivePersonsForDomainPaginated.Filter.Entry }
     */
    public GetActivePersonsForDomainPaginated.Filter.Entry createGetActivePersonsForDomainPaginatedFilterEntry() {
        return new GetActivePersonsForDomainPaginated.Filter.Entry();
    }

    /**
     * Create an instance of {@link GetActivePersonsForDomainFiltered.Filter.Entry }
     * 
     * @return
     *     the new instance of {@link GetActivePersonsForDomainFiltered.Filter.Entry }
     */
    public GetActivePersonsForDomainFiltered.Filter.Entry createGetActivePersonsForDomainFilteredFilterEntry() {
        return new GetActivePersonsForDomainFiltered.Filter.Entry();
    }

    /**
     * Create an instance of {@link CountPersonsForDomainFiltered.Filter.Entry }
     * 
     * @return
     *     the new instance of {@link CountPersonsForDomainFiltered.Filter.Entry }
     */
    public CountPersonsForDomainFiltered.Filter.Entry createCountPersonsForDomainFilteredFilterEntry() {
        return new CountPersonsForDomainFiltered.Filter.Entry();
    }

    /**
     * Create an instance of {@link CountIdentitiesForDomainFiltered.Filter.Entry }
     * 
     * @return
     *     the new instance of {@link CountIdentitiesForDomainFiltered.Filter.Entry }
     */
    public CountIdentitiesForDomainFiltered.Filter.Entry createCountIdentitiesForDomainFilteredFilterEntry() {
        return new CountIdentitiesForDomainFiltered.Filter.Entry();
    }

    /**
     * Create an instance of {@link CountActivePersonsForDomainFiltered.Filter.Entry }
     * 
     * @return
     *     the new instance of {@link CountActivePersonsForDomainFiltered.Filter.Entry }
     */
    public CountActivePersonsForDomainFiltered.Filter.Entry createCountActivePersonsForDomainFilteredFilterEntry() {
        return new CountActivePersonsForDomainFiltered.Filter.Entry();
    }

    /**
     * Create an instance of {@link MpiResponseDTO.ResponseEntries.Entry }
     * 
     * @return
     *     the new instance of {@link MpiResponseDTO.ResponseEntries.Entry }
     */
    public MpiResponseDTO.ResponseEntries.Entry createMpiResponseDTOResponseEntriesEntry() {
        return new MpiResponseDTO.ResponseEntries.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddContact }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddContact }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "addContact")
    public JAXBElement<AddContact> createAddContact(AddContact value) {
        return new JAXBElement<>(_AddContact_QNAME, AddContact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddContactResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddContactResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "addContactResponse")
    public JAXBElement<AddContactResponse> createAddContactResponse(AddContactResponse value) {
        return new JAXBElement<>(_AddContactResponse_QNAME, AddContactResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddLocalIdentifierToActivePersonWithMPI }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddLocalIdentifierToActivePersonWithMPI }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "addLocalIdentifierToActivePersonWithMPI")
    public JAXBElement<AddLocalIdentifierToActivePersonWithMPI> createAddLocalIdentifierToActivePersonWithMPI(AddLocalIdentifierToActivePersonWithMPI value) {
        return new JAXBElement<>(_AddLocalIdentifierToActivePersonWithMPI_QNAME, AddLocalIdentifierToActivePersonWithMPI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddLocalIdentifierToActivePersonWithMPIResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddLocalIdentifierToActivePersonWithMPIResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "addLocalIdentifierToActivePersonWithMPIResponse")
    public JAXBElement<AddLocalIdentifierToActivePersonWithMPIResponse> createAddLocalIdentifierToActivePersonWithMPIResponse(AddLocalIdentifierToActivePersonWithMPIResponse value) {
        return new JAXBElement<>(_AddLocalIdentifierToActivePersonWithMPIResponse_QNAME, AddLocalIdentifierToActivePersonWithMPIResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddLocalIdentifierToIdentifier }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddLocalIdentifierToIdentifier }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "addLocalIdentifierToIdentifier")
    public JAXBElement<AddLocalIdentifierToIdentifier> createAddLocalIdentifierToIdentifier(AddLocalIdentifierToIdentifier value) {
        return new JAXBElement<>(_AddLocalIdentifierToIdentifier_QNAME, AddLocalIdentifierToIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddLocalIdentifierToIdentifierResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddLocalIdentifierToIdentifierResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "addLocalIdentifierToIdentifierResponse")
    public JAXBElement<AddLocalIdentifierToIdentifierResponse> createAddLocalIdentifierToIdentifierResponse(AddLocalIdentifierToIdentifierResponse value) {
        return new JAXBElement<>(_AddLocalIdentifierToIdentifierResponse_QNAME, AddLocalIdentifierToIdentifierResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddLocalIdentifierToMPI }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddLocalIdentifierToMPI }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "addLocalIdentifierToMPI")
    public JAXBElement<AddLocalIdentifierToMPI> createAddLocalIdentifierToMPI(AddLocalIdentifierToMPI value) {
        return new JAXBElement<>(_AddLocalIdentifierToMPI_QNAME, AddLocalIdentifierToMPI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddLocalIdentifierToMPIResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddLocalIdentifierToMPIResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "addLocalIdentifierToMPIResponse")
    public JAXBElement<AddLocalIdentifierToMPIResponse> createAddLocalIdentifierToMPIResponse(AddLocalIdentifierToMPIResponse value) {
        return new JAXBElement<>(_AddLocalIdentifierToMPIResponse_QNAME, AddLocalIdentifierToMPIResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPerson }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddPerson }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "addPerson")
    public JAXBElement<AddPerson> createAddPerson(AddPerson value) {
        return new JAXBElement<>(_AddPerson_QNAME, AddPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPersonResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddPersonResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "addPersonResponse")
    public JAXBElement<AddPersonResponse> createAddPersonResponse(AddPersonResponse value) {
        return new JAXBElement<>(_AddPersonResponse_QNAME, AddPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignIdentity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AssignIdentity }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "assignIdentity")
    public JAXBElement<AssignIdentity> createAssignIdentity(AssignIdentity value) {
        return new JAXBElement<>(_AssignIdentity_QNAME, AssignIdentity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignIdentityResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AssignIdentityResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "assignIdentityResponse")
    public JAXBElement<AssignIdentityResponse> createAssignIdentityResponse(AssignIdentityResponse value) {
        return new JAXBElement<>(_AssignIdentityResponse_QNAME, AssignIdentityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountActivePersonsForDomainFiltered }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CountActivePersonsForDomainFiltered }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "countActivePersonsForDomainFiltered")
    public JAXBElement<CountActivePersonsForDomainFiltered> createCountActivePersonsForDomainFiltered(CountActivePersonsForDomainFiltered value) {
        return new JAXBElement<>(_CountActivePersonsForDomainFiltered_QNAME, CountActivePersonsForDomainFiltered.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountActivePersonsForDomainFilteredResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CountActivePersonsForDomainFilteredResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "countActivePersonsForDomainFilteredResponse")
    public JAXBElement<CountActivePersonsForDomainFilteredResponse> createCountActivePersonsForDomainFilteredResponse(CountActivePersonsForDomainFilteredResponse value) {
        return new JAXBElement<>(_CountActivePersonsForDomainFilteredResponse_QNAME, CountActivePersonsForDomainFilteredResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountIdentitiesForDomainFiltered }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CountIdentitiesForDomainFiltered }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "countIdentitiesForDomainFiltered")
    public JAXBElement<CountIdentitiesForDomainFiltered> createCountIdentitiesForDomainFiltered(CountIdentitiesForDomainFiltered value) {
        return new JAXBElement<>(_CountIdentitiesForDomainFiltered_QNAME, CountIdentitiesForDomainFiltered.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountIdentitiesForDomainFilteredResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CountIdentitiesForDomainFilteredResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "countIdentitiesForDomainFilteredResponse")
    public JAXBElement<CountIdentitiesForDomainFilteredResponse> createCountIdentitiesForDomainFilteredResponse(CountIdentitiesForDomainFilteredResponse value) {
        return new JAXBElement<>(_CountIdentitiesForDomainFilteredResponse_QNAME, CountIdentitiesForDomainFilteredResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountPersonsForDomainFiltered }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CountPersonsForDomainFiltered }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "countPersonsForDomainFiltered")
    public JAXBElement<CountPersonsForDomainFiltered> createCountPersonsForDomainFiltered(CountPersonsForDomainFiltered value) {
        return new JAXBElement<>(_CountPersonsForDomainFiltered_QNAME, CountPersonsForDomainFiltered.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountPersonsForDomainFilteredResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CountPersonsForDomainFilteredResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "countPersonsForDomainFilteredResponse")
    public JAXBElement<CountPersonsForDomainFilteredResponse> createCountPersonsForDomainFilteredResponse(CountPersonsForDomainFilteredResponse value) {
        return new JAXBElement<>(_CountPersonsForDomainFilteredResponse_QNAME, CountPersonsForDomainFilteredResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountPossibleMatchesForDomain }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CountPossibleMatchesForDomain }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "countPossibleMatchesForDomain")
    public JAXBElement<CountPossibleMatchesForDomain> createCountPossibleMatchesForDomain(CountPossibleMatchesForDomain value) {
        return new JAXBElement<>(_CountPossibleMatchesForDomain_QNAME, CountPossibleMatchesForDomain.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountPossibleMatchesForDomainFiltered }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CountPossibleMatchesForDomainFiltered }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "countPossibleMatchesForDomainFiltered")
    public JAXBElement<CountPossibleMatchesForDomainFiltered> createCountPossibleMatchesForDomainFiltered(CountPossibleMatchesForDomainFiltered value) {
        return new JAXBElement<>(_CountPossibleMatchesForDomainFiltered_QNAME, CountPossibleMatchesForDomainFiltered.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountPossibleMatchesForDomainFilteredResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CountPossibleMatchesForDomainFilteredResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "countPossibleMatchesForDomainFilteredResponse")
    public JAXBElement<CountPossibleMatchesForDomainFilteredResponse> createCountPossibleMatchesForDomainFilteredResponse(CountPossibleMatchesForDomainFilteredResponse value) {
        return new JAXBElement<>(_CountPossibleMatchesForDomainFilteredResponse_QNAME, CountPossibleMatchesForDomainFilteredResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountPossibleMatchesForDomainResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CountPossibleMatchesForDomainResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "countPossibleMatchesForDomainResponse")
    public JAXBElement<CountPossibleMatchesForDomainResponse> createCountPossibleMatchesForDomainResponse(CountPossibleMatchesForDomainResponse value) {
        return new JAXBElement<>(_CountPossibleMatchesForDomainResponse_QNAME, CountPossibleMatchesForDomainResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeactivateContact }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeactivateContact }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "deactivateContact")
    public JAXBElement<DeactivateContact> createDeactivateContact(DeactivateContact value) {
        return new JAXBElement<>(_DeactivateContact_QNAME, DeactivateContact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeactivateContactResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeactivateContactResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "deactivateContactResponse")
    public JAXBElement<DeactivateContactResponse> createDeactivateContactResponse(DeactivateContactResponse value) {
        return new JAXBElement<>(_DeactivateContactResponse_QNAME, DeactivateContactResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeactivateIdentity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeactivateIdentity }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "deactivateIdentity")
    public JAXBElement<DeactivateIdentity> createDeactivateIdentity(DeactivateIdentity value) {
        return new JAXBElement<>(_DeactivateIdentity_QNAME, DeactivateIdentity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeactivateIdentityResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeactivateIdentityResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "deactivateIdentityResponse")
    public JAXBElement<DeactivateIdentityResponse> createDeactivateIdentityResponse(DeactivateIdentityResponse value) {
        return new JAXBElement<>(_DeactivateIdentityResponse_QNAME, DeactivateIdentityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeactivatePerson }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeactivatePerson }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "deactivatePerson")
    public JAXBElement<DeactivatePerson> createDeactivatePerson(DeactivatePerson value) {
        return new JAXBElement<>(_DeactivatePerson_QNAME, DeactivatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeactivatePersonResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeactivatePersonResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "deactivatePersonResponse")
    public JAXBElement<DeactivatePersonResponse> createDeactivatePersonResponse(DeactivatePersonResponse value) {
        return new JAXBElement<>(_DeactivatePersonResponse_QNAME, DeactivatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteContact }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteContact }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "deleteContact")
    public JAXBElement<DeleteContact> createDeleteContact(DeleteContact value) {
        return new JAXBElement<>(_DeleteContact_QNAME, DeleteContact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteContactResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteContactResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "deleteContactResponse")
    public JAXBElement<DeleteContactResponse> createDeleteContactResponse(DeleteContactResponse value) {
        return new JAXBElement<>(_DeleteContactResponse_QNAME, DeleteContactResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteIdentity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteIdentity }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "deleteIdentity")
    public JAXBElement<DeleteIdentity> createDeleteIdentity(DeleteIdentity value) {
        return new JAXBElement<>(_DeleteIdentity_QNAME, DeleteIdentity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteIdentityResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteIdentityResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "deleteIdentityResponse")
    public JAXBElement<DeleteIdentityResponse> createDeleteIdentityResponse(DeleteIdentityResponse value) {
        return new JAXBElement<>(_DeleteIdentityResponse_QNAME, DeleteIdentityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePerson }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeletePerson }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "deletePerson")
    public JAXBElement<DeletePerson> createDeletePerson(DeletePerson value) {
        return new JAXBElement<>(_DeletePerson_QNAME, DeletePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeletePersonResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "deletePersonResponse")
    public JAXBElement<DeletePersonResponse> createDeletePersonResponse(DeletePersonResponse value) {
        return new JAXBElement<>(_DeletePersonResponse_QNAME, DeletePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExternalPossibleMatchForIdentity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExternalPossibleMatchForIdentity }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "externalPossibleMatchForIdentity")
    public JAXBElement<ExternalPossibleMatchForIdentity> createExternalPossibleMatchForIdentity(ExternalPossibleMatchForIdentity value) {
        return new JAXBElement<>(_ExternalPossibleMatchForIdentity_QNAME, ExternalPossibleMatchForIdentity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExternalPossibleMatchForIdentityResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExternalPossibleMatchForIdentityResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "externalPossibleMatchForIdentityResponse")
    public JAXBElement<ExternalPossibleMatchForIdentityResponse> createExternalPossibleMatchForIdentityResponse(ExternalPossibleMatchForIdentityResponse value) {
        return new JAXBElement<>(_ExternalPossibleMatchForIdentityResponse_QNAME, ExternalPossibleMatchForIdentityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExternalPossibleMatchForPerson }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExternalPossibleMatchForPerson }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "externalPossibleMatchForPerson")
    public JAXBElement<ExternalPossibleMatchForPerson> createExternalPossibleMatchForPerson(ExternalPossibleMatchForPerson value) {
        return new JAXBElement<>(_ExternalPossibleMatchForPerson_QNAME, ExternalPossibleMatchForPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExternalPossibleMatchForPersonResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExternalPossibleMatchForPersonResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "externalPossibleMatchForPersonResponse")
    public JAXBElement<ExternalPossibleMatchForPersonResponse> createExternalPossibleMatchForPersonResponse(ExternalPossibleMatchForPersonResponse value) {
        return new JAXBElement<>(_ExternalPossibleMatchForPersonResponse_QNAME, ExternalPossibleMatchForPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActivePersonByLocalIdentifier }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetActivePersonByLocalIdentifier }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getActivePersonByLocalIdentifier")
    public JAXBElement<GetActivePersonByLocalIdentifier> createGetActivePersonByLocalIdentifier(GetActivePersonByLocalIdentifier value) {
        return new JAXBElement<>(_GetActivePersonByLocalIdentifier_QNAME, GetActivePersonByLocalIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActivePersonByLocalIdentifierResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetActivePersonByLocalIdentifierResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getActivePersonByLocalIdentifierResponse")
    public JAXBElement<GetActivePersonByLocalIdentifierResponse> createGetActivePersonByLocalIdentifierResponse(GetActivePersonByLocalIdentifierResponse value) {
        return new JAXBElement<>(_GetActivePersonByLocalIdentifierResponse_QNAME, GetActivePersonByLocalIdentifierResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActivePersonByMPI }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetActivePersonByMPI }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getActivePersonByMPI")
    public JAXBElement<GetActivePersonByMPI> createGetActivePersonByMPI(GetActivePersonByMPI value) {
        return new JAXBElement<>(_GetActivePersonByMPI_QNAME, GetActivePersonByMPI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActivePersonByMPIResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetActivePersonByMPIResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getActivePersonByMPIResponse")
    public JAXBElement<GetActivePersonByMPIResponse> createGetActivePersonByMPIResponse(GetActivePersonByMPIResponse value) {
        return new JAXBElement<>(_GetActivePersonByMPIResponse_QNAME, GetActivePersonByMPIResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActivePersonByMultipleLocalIdentifier }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetActivePersonByMultipleLocalIdentifier }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getActivePersonByMultipleLocalIdentifier")
    public JAXBElement<GetActivePersonByMultipleLocalIdentifier> createGetActivePersonByMultipleLocalIdentifier(GetActivePersonByMultipleLocalIdentifier value) {
        return new JAXBElement<>(_GetActivePersonByMultipleLocalIdentifier_QNAME, GetActivePersonByMultipleLocalIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActivePersonByMultipleLocalIdentifierResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetActivePersonByMultipleLocalIdentifierResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getActivePersonByMultipleLocalIdentifierResponse")
    public JAXBElement<GetActivePersonByMultipleLocalIdentifierResponse> createGetActivePersonByMultipleLocalIdentifierResponse(GetActivePersonByMultipleLocalIdentifierResponse value) {
        return new JAXBElement<>(_GetActivePersonByMultipleLocalIdentifierResponse_QNAME, GetActivePersonByMultipleLocalIdentifierResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActivePersonsByMPIBatch }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetActivePersonsByMPIBatch }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getActivePersonsByMPIBatch")
    public JAXBElement<GetActivePersonsByMPIBatch> createGetActivePersonsByMPIBatch(GetActivePersonsByMPIBatch value) {
        return new JAXBElement<>(_GetActivePersonsByMPIBatch_QNAME, GetActivePersonsByMPIBatch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActivePersonsByMPIBatchResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetActivePersonsByMPIBatchResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getActivePersonsByMPIBatchResponse")
    public JAXBElement<GetActivePersonsByMPIBatchResponse> createGetActivePersonsByMPIBatchResponse(GetActivePersonsByMPIBatchResponse value) {
        return new JAXBElement<>(_GetActivePersonsByMPIBatchResponse_QNAME, GetActivePersonsByMPIBatchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActivePersonsForDomain }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetActivePersonsForDomain }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getActivePersonsForDomain")
    public JAXBElement<GetActivePersonsForDomain> createGetActivePersonsForDomain(GetActivePersonsForDomain value) {
        return new JAXBElement<>(_GetActivePersonsForDomain_QNAME, GetActivePersonsForDomain.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActivePersonsForDomainFiltered }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetActivePersonsForDomainFiltered }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getActivePersonsForDomainFiltered")
    public JAXBElement<GetActivePersonsForDomainFiltered> createGetActivePersonsForDomainFiltered(GetActivePersonsForDomainFiltered value) {
        return new JAXBElement<>(_GetActivePersonsForDomainFiltered_QNAME, GetActivePersonsForDomainFiltered.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActivePersonsForDomainFilteredResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetActivePersonsForDomainFilteredResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getActivePersonsForDomainFilteredResponse")
    public JAXBElement<GetActivePersonsForDomainFilteredResponse> createGetActivePersonsForDomainFilteredResponse(GetActivePersonsForDomainFilteredResponse value) {
        return new JAXBElement<>(_GetActivePersonsForDomainFilteredResponse_QNAME, GetActivePersonsForDomainFilteredResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActivePersonsForDomainPaginated }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetActivePersonsForDomainPaginated }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getActivePersonsForDomainPaginated")
    public JAXBElement<GetActivePersonsForDomainPaginated> createGetActivePersonsForDomainPaginated(GetActivePersonsForDomainPaginated value) {
        return new JAXBElement<>(_GetActivePersonsForDomainPaginated_QNAME, GetActivePersonsForDomainPaginated.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActivePersonsForDomainPaginatedResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetActivePersonsForDomainPaginatedResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getActivePersonsForDomainPaginatedResponse")
    public JAXBElement<GetActivePersonsForDomainPaginatedResponse> createGetActivePersonsForDomainPaginatedResponse(GetActivePersonsForDomainPaginatedResponse value) {
        return new JAXBElement<>(_GetActivePersonsForDomainPaginatedResponse_QNAME, GetActivePersonsForDomainPaginatedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActivePersonsForDomainResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetActivePersonsForDomainResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getActivePersonsForDomainResponse")
    public JAXBElement<GetActivePersonsForDomainResponse> createGetActivePersonsForDomainResponse(GetActivePersonsForDomainResponse value) {
        return new JAXBElement<>(_GetActivePersonsForDomainResponse_QNAME, GetActivePersonsForDomainResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllIdentifierForAcivePersonWithMPI }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllIdentifierForAcivePersonWithMPI }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getAllIdentifierForAcivePersonWithMPI")
    public JAXBElement<GetAllIdentifierForAcivePersonWithMPI> createGetAllIdentifierForAcivePersonWithMPI(GetAllIdentifierForAcivePersonWithMPI value) {
        return new JAXBElement<>(_GetAllIdentifierForAcivePersonWithMPI_QNAME, GetAllIdentifierForAcivePersonWithMPI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllIdentifierForAcivePersonWithMPIResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllIdentifierForAcivePersonWithMPIResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getAllIdentifierForAcivePersonWithMPIResponse")
    public JAXBElement<GetAllIdentifierForAcivePersonWithMPIResponse> createGetAllIdentifierForAcivePersonWithMPIResponse(GetAllIdentifierForAcivePersonWithMPIResponse value) {
        return new JAXBElement<>(_GetAllIdentifierForAcivePersonWithMPIResponse_QNAME, GetAllIdentifierForAcivePersonWithMPIResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllIdentifierForIdentifier }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllIdentifierForIdentifier }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getAllIdentifierForIdentifier")
    public JAXBElement<GetAllIdentifierForIdentifier> createGetAllIdentifierForIdentifier(GetAllIdentifierForIdentifier value) {
        return new JAXBElement<>(_GetAllIdentifierForIdentifier_QNAME, GetAllIdentifierForIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllIdentifierForIdentifierResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllIdentifierForIdentifierResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getAllIdentifierForIdentifierResponse")
    public JAXBElement<GetAllIdentifierForIdentifierResponse> createGetAllIdentifierForIdentifierResponse(GetAllIdentifierForIdentifierResponse value) {
        return new JAXBElement<>(_GetAllIdentifierForIdentifierResponse_QNAME, GetAllIdentifierForIdentifierResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllIdentifierForMPI }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllIdentifierForMPI }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getAllIdentifierForMPI")
    public JAXBElement<GetAllIdentifierForMPI> createGetAllIdentifierForMPI(GetAllIdentifierForMPI value) {
        return new JAXBElement<>(_GetAllIdentifierForMPI_QNAME, GetAllIdentifierForMPI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllIdentifierForMPIResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllIdentifierForMPIResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getAllIdentifierForMPIResponse")
    public JAXBElement<GetAllIdentifierForMPIResponse> createGetAllIdentifierForMPIResponse(GetAllIdentifierForMPIResponse value) {
        return new JAXBElement<>(_GetAllIdentifierForMPIResponse_QNAME, GetAllIdentifierForMPIResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMPIFromActivePersonByMPI }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllMPIFromActivePersonByMPI }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getAllMPIFromActivePersonByMPI")
    public JAXBElement<GetAllMPIFromActivePersonByMPI> createGetAllMPIFromActivePersonByMPI(GetAllMPIFromActivePersonByMPI value) {
        return new JAXBElement<>(_GetAllMPIFromActivePersonByMPI_QNAME, GetAllMPIFromActivePersonByMPI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMPIFromActivePersonByMPIResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllMPIFromActivePersonByMPIResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getAllMPIFromActivePersonByMPIResponse")
    public JAXBElement<GetAllMPIFromActivePersonByMPIResponse> createGetAllMPIFromActivePersonByMPIResponse(GetAllMPIFromActivePersonByMPIResponse value) {
        return new JAXBElement<>(_GetAllMPIFromActivePersonByMPIResponse_QNAME, GetAllMPIFromActivePersonByMPIResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMPIFromPersonByMPI }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllMPIFromPersonByMPI }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getAllMPIFromPersonByMPI")
    public JAXBElement<GetAllMPIFromPersonByMPI> createGetAllMPIFromPersonByMPI(GetAllMPIFromPersonByMPI value) {
        return new JAXBElement<>(_GetAllMPIFromPersonByMPI_QNAME, GetAllMPIFromPersonByMPI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMPIFromPersonByMPIResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllMPIFromPersonByMPIResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getAllMPIFromPersonByMPIResponse")
    public JAXBElement<GetAllMPIFromPersonByMPIResponse> createGetAllMPIFromPersonByMPIResponse(GetAllMPIFromPersonByMPIResponse value) {
        return new JAXBElement<>(_GetAllMPIFromPersonByMPIResponse_QNAME, GetAllMPIFromPersonByMPIResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdentitiesForDomain }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetIdentitiesForDomain }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getIdentitiesForDomain")
    public JAXBElement<GetIdentitiesForDomain> createGetIdentitiesForDomain(GetIdentitiesForDomain value) {
        return new JAXBElement<>(_GetIdentitiesForDomain_QNAME, GetIdentitiesForDomain.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdentitiesForDomainFiltered }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetIdentitiesForDomainFiltered }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getIdentitiesForDomainFiltered")
    public JAXBElement<GetIdentitiesForDomainFiltered> createGetIdentitiesForDomainFiltered(GetIdentitiesForDomainFiltered value) {
        return new JAXBElement<>(_GetIdentitiesForDomainFiltered_QNAME, GetIdentitiesForDomainFiltered.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdentitiesForDomainFilteredResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetIdentitiesForDomainFilteredResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getIdentitiesForDomainFilteredResponse")
    public JAXBElement<GetIdentitiesForDomainFilteredResponse> createGetIdentitiesForDomainFilteredResponse(GetIdentitiesForDomainFilteredResponse value) {
        return new JAXBElement<>(_GetIdentitiesForDomainFilteredResponse_QNAME, GetIdentitiesForDomainFilteredResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdentitiesForDomainPaginated }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetIdentitiesForDomainPaginated }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getIdentitiesForDomainPaginated")
    public JAXBElement<GetIdentitiesForDomainPaginated> createGetIdentitiesForDomainPaginated(GetIdentitiesForDomainPaginated value) {
        return new JAXBElement<>(_GetIdentitiesForDomainPaginated_QNAME, GetIdentitiesForDomainPaginated.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdentitiesForDomainPaginatedResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetIdentitiesForDomainPaginatedResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getIdentitiesForDomainPaginatedResponse")
    public JAXBElement<GetIdentitiesForDomainPaginatedResponse> createGetIdentitiesForDomainPaginatedResponse(GetIdentitiesForDomainPaginatedResponse value) {
        return new JAXBElement<>(_GetIdentitiesForDomainPaginatedResponse_QNAME, GetIdentitiesForDomainPaginatedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdentitiesForDomainResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetIdentitiesForDomainResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getIdentitiesForDomainResponse")
    public JAXBElement<GetIdentitiesForDomainResponse> createGetIdentitiesForDomainResponse(GetIdentitiesForDomainResponse value) {
        return new JAXBElement<>(_GetIdentitiesForDomainResponse_QNAME, GetIdentitiesForDomainResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMPIForIdentifier }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMPIForIdentifier }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getMPIForIdentifier")
    public JAXBElement<GetMPIForIdentifier> createGetMPIForIdentifier(GetMPIForIdentifier value) {
        return new JAXBElement<>(_GetMPIForIdentifier_QNAME, GetMPIForIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMPIForIdentifierResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMPIForIdentifierResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getMPIForIdentifierResponse")
    public JAXBElement<GetMPIForIdentifierResponse> createGetMPIForIdentifierResponse(GetMPIForIdentifierResponse value) {
        return new JAXBElement<>(_GetMPIForIdentifierResponse_QNAME, GetMPIForIdentifierResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonByFirstMPI }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPersonByFirstMPI }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getPersonByFirstMPI")
    public JAXBElement<GetPersonByFirstMPI> createGetPersonByFirstMPI(GetPersonByFirstMPI value) {
        return new JAXBElement<>(_GetPersonByFirstMPI_QNAME, GetPersonByFirstMPI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonByFirstMPIResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPersonByFirstMPIResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getPersonByFirstMPIResponse")
    public JAXBElement<GetPersonByFirstMPIResponse> createGetPersonByFirstMPIResponse(GetPersonByFirstMPIResponse value) {
        return new JAXBElement<>(_GetPersonByFirstMPIResponse_QNAME, GetPersonByFirstMPIResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonByLocalIdentifier }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPersonByLocalIdentifier }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getPersonByLocalIdentifier")
    public JAXBElement<GetPersonByLocalIdentifier> createGetPersonByLocalIdentifier(GetPersonByLocalIdentifier value) {
        return new JAXBElement<>(_GetPersonByLocalIdentifier_QNAME, GetPersonByLocalIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonByLocalIdentifierResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPersonByLocalIdentifierResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getPersonByLocalIdentifierResponse")
    public JAXBElement<GetPersonByLocalIdentifierResponse> createGetPersonByLocalIdentifierResponse(GetPersonByLocalIdentifierResponse value) {
        return new JAXBElement<>(_GetPersonByLocalIdentifierResponse_QNAME, GetPersonByLocalIdentifierResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonByMPI }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPersonByMPI }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getPersonByMPI")
    public JAXBElement<GetPersonByMPI> createGetPersonByMPI(GetPersonByMPI value) {
        return new JAXBElement<>(_GetPersonByMPI_QNAME, GetPersonByMPI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonByMPIResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPersonByMPIResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getPersonByMPIResponse")
    public JAXBElement<GetPersonByMPIResponse> createGetPersonByMPIResponse(GetPersonByMPIResponse value) {
        return new JAXBElement<>(_GetPersonByMPIResponse_QNAME, GetPersonByMPIResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonByMultipleLocalIdentifier }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPersonByMultipleLocalIdentifier }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getPersonByMultipleLocalIdentifier")
    public JAXBElement<GetPersonByMultipleLocalIdentifier> createGetPersonByMultipleLocalIdentifier(GetPersonByMultipleLocalIdentifier value) {
        return new JAXBElement<>(_GetPersonByMultipleLocalIdentifier_QNAME, GetPersonByMultipleLocalIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonByMultipleLocalIdentifierResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPersonByMultipleLocalIdentifierResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getPersonByMultipleLocalIdentifierResponse")
    public JAXBElement<GetPersonByMultipleLocalIdentifierResponse> createGetPersonByMultipleLocalIdentifierResponse(GetPersonByMultipleLocalIdentifierResponse value) {
        return new JAXBElement<>(_GetPersonByMultipleLocalIdentifierResponse_QNAME, GetPersonByMultipleLocalIdentifierResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonsByFirstMPIBatch }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPersonsByFirstMPIBatch }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getPersonsByFirstMPIBatch")
    public JAXBElement<GetPersonsByFirstMPIBatch> createGetPersonsByFirstMPIBatch(GetPersonsByFirstMPIBatch value) {
        return new JAXBElement<>(_GetPersonsByFirstMPIBatch_QNAME, GetPersonsByFirstMPIBatch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonsByFirstMPIBatchResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPersonsByFirstMPIBatchResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getPersonsByFirstMPIBatchResponse")
    public JAXBElement<GetPersonsByFirstMPIBatchResponse> createGetPersonsByFirstMPIBatchResponse(GetPersonsByFirstMPIBatchResponse value) {
        return new JAXBElement<>(_GetPersonsByFirstMPIBatchResponse_QNAME, GetPersonsByFirstMPIBatchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonsByMPIBatch }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPersonsByMPIBatch }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getPersonsByMPIBatch")
    public JAXBElement<GetPersonsByMPIBatch> createGetPersonsByMPIBatch(GetPersonsByMPIBatch value) {
        return new JAXBElement<>(_GetPersonsByMPIBatch_QNAME, GetPersonsByMPIBatch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonsByMPIBatchResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPersonsByMPIBatchResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getPersonsByMPIBatchResponse")
    public JAXBElement<GetPersonsByMPIBatchResponse> createGetPersonsByMPIBatchResponse(GetPersonsByMPIBatchResponse value) {
        return new JAXBElement<>(_GetPersonsByMPIBatchResponse_QNAME, GetPersonsByMPIBatchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonsForDomain }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPersonsForDomain }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getPersonsForDomain")
    public JAXBElement<GetPersonsForDomain> createGetPersonsForDomain(GetPersonsForDomain value) {
        return new JAXBElement<>(_GetPersonsForDomain_QNAME, GetPersonsForDomain.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonsForDomainFiltered }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPersonsForDomainFiltered }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getPersonsForDomainFiltered")
    public JAXBElement<GetPersonsForDomainFiltered> createGetPersonsForDomainFiltered(GetPersonsForDomainFiltered value) {
        return new JAXBElement<>(_GetPersonsForDomainFiltered_QNAME, GetPersonsForDomainFiltered.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonsForDomainFilteredResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPersonsForDomainFilteredResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getPersonsForDomainFilteredResponse")
    public JAXBElement<GetPersonsForDomainFilteredResponse> createGetPersonsForDomainFilteredResponse(GetPersonsForDomainFilteredResponse value) {
        return new JAXBElement<>(_GetPersonsForDomainFilteredResponse_QNAME, GetPersonsForDomainFilteredResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonsForDomainPaginated }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPersonsForDomainPaginated }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getPersonsForDomainPaginated")
    public JAXBElement<GetPersonsForDomainPaginated> createGetPersonsForDomainPaginated(GetPersonsForDomainPaginated value) {
        return new JAXBElement<>(_GetPersonsForDomainPaginated_QNAME, GetPersonsForDomainPaginated.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonsForDomainPaginatedResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPersonsForDomainPaginatedResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getPersonsForDomainPaginatedResponse")
    public JAXBElement<GetPersonsForDomainPaginatedResponse> createGetPersonsForDomainPaginatedResponse(GetPersonsForDomainPaginatedResponse value) {
        return new JAXBElement<>(_GetPersonsForDomainPaginatedResponse_QNAME, GetPersonsForDomainPaginatedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonsForDomainResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPersonsForDomainResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getPersonsForDomainResponse")
    public JAXBElement<GetPersonsForDomainResponse> createGetPersonsForDomainResponse(GetPersonsForDomainResponse value) {
        return new JAXBElement<>(_GetPersonsForDomainResponse_QNAME, GetPersonsForDomainResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPossibleMatchesForDomain }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPossibleMatchesForDomain }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getPossibleMatchesForDomain")
    public JAXBElement<GetPossibleMatchesForDomain> createGetPossibleMatchesForDomain(GetPossibleMatchesForDomain value) {
        return new JAXBElement<>(_GetPossibleMatchesForDomain_QNAME, GetPossibleMatchesForDomain.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPossibleMatchesForDomainFiltered }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPossibleMatchesForDomainFiltered }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getPossibleMatchesForDomainFiltered")
    public JAXBElement<GetPossibleMatchesForDomainFiltered> createGetPossibleMatchesForDomainFiltered(GetPossibleMatchesForDomainFiltered value) {
        return new JAXBElement<>(_GetPossibleMatchesForDomainFiltered_QNAME, GetPossibleMatchesForDomainFiltered.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPossibleMatchesForDomainFilteredResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPossibleMatchesForDomainFilteredResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getPossibleMatchesForDomainFilteredResponse")
    public JAXBElement<GetPossibleMatchesForDomainFilteredResponse> createGetPossibleMatchesForDomainFilteredResponse(GetPossibleMatchesForDomainFilteredResponse value) {
        return new JAXBElement<>(_GetPossibleMatchesForDomainFilteredResponse_QNAME, GetPossibleMatchesForDomainFilteredResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPossibleMatchesForDomainResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPossibleMatchesForDomainResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getPossibleMatchesForDomainResponse")
    public JAXBElement<GetPossibleMatchesForDomainResponse> createGetPossibleMatchesForDomainResponse(GetPossibleMatchesForDomainResponse value) {
        return new JAXBElement<>(_GetPossibleMatchesForDomainResponse_QNAME, GetPossibleMatchesForDomainResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPossibleMatchesForPerson }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPossibleMatchesForPerson }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getPossibleMatchesForPerson")
    public JAXBElement<GetPossibleMatchesForPerson> createGetPossibleMatchesForPerson(GetPossibleMatchesForPerson value) {
        return new JAXBElement<>(_GetPossibleMatchesForPerson_QNAME, GetPossibleMatchesForPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPossibleMatchesForPersonResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPossibleMatchesForPersonResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "getPossibleMatchesForPersonResponse")
    public JAXBElement<GetPossibleMatchesForPersonResponse> createGetPossibleMatchesForPersonResponse(GetPossibleMatchesForPersonResponse value) {
        return new JAXBElement<>(_GetPossibleMatchesForPersonResponse_QNAME, GetPossibleMatchesForPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveIdentitiesForIdentifierToPerson }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MoveIdentitiesForIdentifierToPerson }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "moveIdentitiesForIdentifierToPerson")
    public JAXBElement<MoveIdentitiesForIdentifierToPerson> createMoveIdentitiesForIdentifierToPerson(MoveIdentitiesForIdentifierToPerson value) {
        return new JAXBElement<>(_MoveIdentitiesForIdentifierToPerson_QNAME, MoveIdentitiesForIdentifierToPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveIdentitiesForIdentifierToPersonResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MoveIdentitiesForIdentifierToPersonResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "moveIdentitiesForIdentifierToPersonResponse")
    public JAXBElement<MoveIdentitiesForIdentifierToPersonResponse> createMoveIdentitiesForIdentifierToPersonResponse(MoveIdentitiesForIdentifierToPersonResponse value) {
        return new JAXBElement<>(_MoveIdentitiesForIdentifierToPersonResponse_QNAME, MoveIdentitiesForIdentifierToPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrioritizePossibleMatch }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PrioritizePossibleMatch }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "prioritizePossibleMatch")
    public JAXBElement<PrioritizePossibleMatch> createPrioritizePossibleMatch(PrioritizePossibleMatch value) {
        return new JAXBElement<>(_PrioritizePossibleMatch_QNAME, PrioritizePossibleMatch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrioritizePossibleMatchResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PrioritizePossibleMatchResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "prioritizePossibleMatchResponse")
    public JAXBElement<PrioritizePossibleMatchResponse> createPrioritizePossibleMatchResponse(PrioritizePossibleMatchResponse value) {
        return new JAXBElement<>(_PrioritizePossibleMatchResponse_QNAME, PrioritizePossibleMatchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveLocalIdentifier }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveLocalIdentifier }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "removeLocalIdentifier")
    public JAXBElement<RemoveLocalIdentifier> createRemoveLocalIdentifier(RemoveLocalIdentifier value) {
        return new JAXBElement<>(_RemoveLocalIdentifier_QNAME, RemoveLocalIdentifier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveLocalIdentifierResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveLocalIdentifierResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "removeLocalIdentifierResponse")
    public JAXBElement<RemoveLocalIdentifierResponse> createRemoveLocalIdentifierResponse(RemoveLocalIdentifierResponse value) {
        return new JAXBElement<>(_RemoveLocalIdentifierResponse_QNAME, RemoveLocalIdentifierResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovePossibleMatch }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemovePossibleMatch }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "removePossibleMatch")
    public JAXBElement<RemovePossibleMatch> createRemovePossibleMatch(RemovePossibleMatch value) {
        return new JAXBElement<>(_RemovePossibleMatch_QNAME, RemovePossibleMatch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovePossibleMatchResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemovePossibleMatchResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "removePossibleMatchResponse")
    public JAXBElement<RemovePossibleMatchResponse> createRemovePossibleMatchResponse(RemovePossibleMatchResponse value) {
        return new JAXBElement<>(_RemovePossibleMatchResponse_QNAME, RemovePossibleMatchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovePossibleMatches }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemovePossibleMatches }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "removePossibleMatches")
    public JAXBElement<RemovePossibleMatches> createRemovePossibleMatches(RemovePossibleMatches value) {
        return new JAXBElement<>(_RemovePossibleMatches_QNAME, RemovePossibleMatches.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovePossibleMatchesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemovePossibleMatchesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "removePossibleMatchesResponse")
    public JAXBElement<RemovePossibleMatchesResponse> createRemovePossibleMatchesResponse(RemovePossibleMatchesResponse value) {
        return new JAXBElement<>(_RemovePossibleMatchesResponse_QNAME, RemovePossibleMatchesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestMPI }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RequestMPI }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "requestMPI")
    public JAXBElement<RequestMPI> createRequestMPI(RequestMPI value) {
        return new JAXBElement<>(_RequestMPI_QNAME, RequestMPI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestMPIBatch }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RequestMPIBatch }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "requestMPIBatch")
    public JAXBElement<RequestMPIBatch> createRequestMPIBatch(RequestMPIBatch value) {
        return new JAXBElement<>(_RequestMPIBatch_QNAME, RequestMPIBatch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestMPIBatchResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RequestMPIBatchResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "requestMPIBatchResponse")
    public JAXBElement<RequestMPIBatchResponse> createRequestMPIBatchResponse(RequestMPIBatchResponse value) {
        return new JAXBElement<>(_RequestMPIBatchResponse_QNAME, RequestMPIBatchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestMPIResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RequestMPIResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "requestMPIResponse")
    public JAXBElement<RequestMPIResponse> createRequestMPIResponse(RequestMPIResponse value) {
        return new JAXBElement<>(_RequestMPIResponse_QNAME, RequestMPIResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestMPIWithConfig }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RequestMPIWithConfig }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "requestMPIWithConfig")
    public JAXBElement<RequestMPIWithConfig> createRequestMPIWithConfig(RequestMPIWithConfig value) {
        return new JAXBElement<>(_RequestMPIWithConfig_QNAME, RequestMPIWithConfig.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestMPIWithConfigResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RequestMPIWithConfigResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "requestMPIWithConfigResponse")
    public JAXBElement<RequestMPIWithConfigResponse> createRequestMPIWithConfigResponse(RequestMPIWithConfigResponse value) {
        return new JAXBElement<>(_RequestMPIWithConfigResponse_QNAME, RequestMPIWithConfigResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPersonsByPDQ }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchPersonsByPDQ }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "searchPersonsByPDQ")
    public JAXBElement<SearchPersonsByPDQ> createSearchPersonsByPDQ(SearchPersonsByPDQ value) {
        return new JAXBElement<>(_SearchPersonsByPDQ_QNAME, SearchPersonsByPDQ.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPersonsByPDQResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchPersonsByPDQResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "searchPersonsByPDQResponse")
    public JAXBElement<SearchPersonsByPDQResponse> createSearchPersonsByPDQResponse(SearchPersonsByPDQResponse value) {
        return new JAXBElement<>(_SearchPersonsByPDQResponse_QNAME, SearchPersonsByPDQResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetReferenceIdentity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetReferenceIdentity }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "setReferenceIdentity")
    public JAXBElement<SetReferenceIdentity> createSetReferenceIdentity(SetReferenceIdentity value) {
        return new JAXBElement<>(_SetReferenceIdentity_QNAME, SetReferenceIdentity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetReferenceIdentityResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetReferenceIdentityResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "setReferenceIdentityResponse")
    public JAXBElement<SetReferenceIdentityResponse> createSetReferenceIdentityResponse(SetReferenceIdentityResponse value) {
        return new JAXBElement<>(_SetReferenceIdentityResponse_QNAME, SetReferenceIdentityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateActivePerson }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateActivePerson }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "updateActivePerson")
    public JAXBElement<UpdateActivePerson> createUpdateActivePerson(UpdateActivePerson value) {
        return new JAXBElement<>(_UpdateActivePerson_QNAME, UpdateActivePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateActivePersonResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateActivePersonResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "updateActivePersonResponse")
    public JAXBElement<UpdateActivePersonResponse> createUpdateActivePersonResponse(UpdateActivePersonResponse value) {
        return new JAXBElement<>(_UpdateActivePersonResponse_QNAME, UpdateActivePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateActivePersonWithConfig }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateActivePersonWithConfig }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "updateActivePersonWithConfig")
    public JAXBElement<UpdateActivePersonWithConfig> createUpdateActivePersonWithConfig(UpdateActivePersonWithConfig value) {
        return new JAXBElement<>(_UpdateActivePersonWithConfig_QNAME, UpdateActivePersonWithConfig.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateActivePersonWithConfigResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateActivePersonWithConfigResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "updateActivePersonWithConfigResponse")
    public JAXBElement<UpdateActivePersonWithConfigResponse> createUpdateActivePersonWithConfigResponse(UpdateActivePersonWithConfigResponse value) {
        return new JAXBElement<>(_UpdateActivePersonWithConfigResponse_QNAME, UpdateActivePersonWithConfigResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePerson }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdatePerson }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "updatePerson")
    public JAXBElement<UpdatePerson> createUpdatePerson(UpdatePerson value) {
        return new JAXBElement<>(_UpdatePerson_QNAME, UpdatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "updatePersonResponse")
    public JAXBElement<UpdatePersonResponse> createUpdatePersonResponse(UpdatePersonResponse value) {
        return new JAXBElement<>(_UpdatePersonResponse_QNAME, UpdatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonWithConfig }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdatePersonWithConfig }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "updatePersonWithConfig")
    public JAXBElement<UpdatePersonWithConfig> createUpdatePersonWithConfig(UpdatePersonWithConfig value) {
        return new JAXBElement<>(_UpdatePersonWithConfig_QNAME, UpdatePersonWithConfig.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonWithConfigResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdatePersonWithConfigResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "updatePersonWithConfigResponse")
    public JAXBElement<UpdatePersonWithConfigResponse> createUpdatePersonWithConfigResponse(UpdatePersonWithConfigResponse value) {
        return new JAXBElement<>(_UpdatePersonWithConfigResponse_QNAME, UpdatePersonWithConfigResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePrivacy }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdatePrivacy }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "updatePrivacy")
    public JAXBElement<UpdatePrivacy> createUpdatePrivacy(UpdatePrivacy value) {
        return new JAXBElement<>(_UpdatePrivacy_QNAME, UpdatePrivacy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePrivacyResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdatePrivacyResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "updatePrivacyResponse")
    public JAXBElement<UpdatePrivacyResponse> createUpdatePrivacyResponse(UpdatePrivacyResponse value) {
        return new JAXBElement<>(_UpdatePrivacyResponse_QNAME, UpdatePrivacyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnknownObjectException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnknownObjectException }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "UnknownObjectException")
    public JAXBElement<UnknownObjectException> createUnknownObjectException(UnknownObjectException value) {
        return new JAXBElement<>(_UnknownObjectException_QNAME, UnknownObjectException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MPIException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MPIException }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "MPIException")
    public JAXBElement<MPIException> createMPIException(MPIException value) {
        return new JAXBElement<>(_MPIException_QNAME, MPIException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidatorException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidatorException }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "ValidatorException")
    public JAXBElement<ValidatorException> createValidatorException(ValidatorException value) {
        return new JAXBElement<>(_ValidatorException_QNAME, ValidatorException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidParameterException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InvalidParameterException }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "InvalidParameterException")
    public JAXBElement<InvalidParameterException> createInvalidParameterException(InvalidParameterException value) {
        return new JAXBElement<>(_InvalidParameterException_QNAME, InvalidParameterException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IllegalOperationException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IllegalOperationException }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "IllegalOperationException")
    public JAXBElement<IllegalOperationException> createIllegalOperationException(IllegalOperationException value) {
        return new JAXBElement<>(_IllegalOperationException_QNAME, IllegalOperationException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DuplicateEntryException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DuplicateEntryException }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.epix.ttp.icmvc.emau.org/", name = "DuplicateEntryException")
    public JAXBElement<DuplicateEntryException> createDuplicateEntryException(DuplicateEntryException value) {
        return new JAXBElement<>(_DuplicateEntryException_QNAME, DuplicateEntryException.class, null, value);
    }

}
