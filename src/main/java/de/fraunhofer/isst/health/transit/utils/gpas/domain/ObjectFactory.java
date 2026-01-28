
package de.fraunhofer.isst.health.transit.utils.gpas.domain;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;

import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the de.fraunhofer.isst.health.transit.utils.gpas.domain package.
 * <p>An ObjectFactory allows you to programmatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName ADD_DOMAIN_QNAME = new QName("http://psn.ttp.ganimed.icmvc.emau.org/",
            "addDomain");
    private static final QName ADD_DOMAIN_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "addDomainResponse");
    private static final QName ARE_PSN_DELETABLE_QNAME = new QName("http://psn.ttp.ganimed.icmvc.emau.org/",
            "arePSNDeletable");
    private static final QName ARE_PSN_DELETABLE_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "arePSNDeletableResponse");
    private static final QName COUNT_PS_NS_QNAME = new QName("http://psn.ttp.ganimed.icmvc.emau.org/",
            "countPSNs");
    private static final QName COUNT_PS_NS_FOR_DOMAINS_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "countPSNsForDomains");
    private static final QName COUNT_PS_NS_FOR_DOMAINS_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "countPSNsForDomainsResponse");
    private static final QName COUNT_PS_NS_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "countPSNsResponse");
    private static final QName DELETE_DOMAIN_QNAME = new QName("http://psn.ttp.ganimed.icmvc.emau.org/",
            "deleteDomain");
    private static final QName DELETE_DOMAIN_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "deleteDomainResponse");
    private static final QName DELETE_DOMAIN_WITH_PS_NS_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "deleteDomainWithPSNs");
    private static final QName DELETE_DOMAIN_WITH_PS_NS_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "deleteDomainWithPSNsResponse");
    private static final QName DOMAIN_IN_DTO_QNAME = new QName("http://psn.ttp.ganimed.icmvc.emau.org/",
            "domainInDTO");
    private static final QName DOMAIN_OUT_DTO_QNAME = new QName("http://psn.ttp.ganimed.icmvc.emau.org/",
            "domainOutDTO");
    private static final QName GET_ALPHABET_QNAME = new QName("http://psn.ttp.ganimed.icmvc.emau.org/",
            "getAlphabet");
    private static final QName GET_ALPHABET_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "getAlphabetResponse");
    private static final QName GET_DOMAIN_QNAME = new QName("http://psn.ttp.ganimed.icmvc.emau.org/",
            "getDomain");
    private static final QName GET_DOMAIN_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "getDomainResponse");
    private static final QName GET_DOMAINS_FOR_PREFIX_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "getDomainsForPrefix");
    private static final QName GET_DOMAINS_FOR_PREFIX_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "getDomainsForPrefixResponse");
    private static final QName GET_DOMAINS_FOR_SUFFIX_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "getDomainsForSuffix");
    private static final QName GET_DOMAINS_FOR_SUFFIX_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "getDomainsForSuffixResponse");
    private static final QName GET_RESTRICTION_FOR_CHECK_DIGIT_CLASS_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "getRestrictionForCheckDigitClass");
    private static final QName GET_RESTRICTION_FOR_CHECK_DIGIT_CLASS_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "getRestrictionForCheckDigitClassResponse");
    private static final QName LIST_DOMAINS_QNAME = new QName("http://psn.ttp.ganimed.icmvc.emau.org/",
            "listDomains");
    private static final QName LIST_DOMAINS_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "listDomainsResponse");
    private static final QName LIST_PS_NS_QNAME = new QName("http://psn.ttp.ganimed.icmvc.emau.org/",
            "listPSNs");
    private static final QName LIST_PS_NS_FOR_DOMAINS_PAGINATED_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "listPSNsForDomainsPaginated");
    private static final QName LIST_PS_NS_FOR_DOMAINS_PAGINATED_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "listPSNsForDomainsPaginatedResponse");
    private static final QName LIST_PS_NS_PAGINATED_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "listPSNsPaginated");
    private static final QName LIST_PS_NS_PAGINATED_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "listPSNsPaginatedResponse");
    private static final QName LIST_PS_NS_RESPONSE_QNAME = new QName("http://psn.ttp.ganimed.icmvc.emau.org/",
            "listPSNsResponse");
    private static final QName PSNDTO_QNAME = new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "psndto");
    private static final QName UPDATE_DOMAIN_QNAME = new QName("http://psn.ttp.ganimed.icmvc.emau.org/",
            "updateDomain");
    private static final QName UPDATE_DOMAIN_IN_USE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "updateDomainInUse");
    private static final QName UPDATE_DOMAIN_IN_USE_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "updateDomainInUseResponse");
    private static final QName UPDATE_DOMAIN_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "updateDomainResponse");
    private static final QName UNKNOWN_DOMAIN_EXCEPTION_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "UnknownDomainException");
    private static final QName INVALID_PARAMETER_EXCEPTION_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "InvalidParameterException");
    private static final QName DOMAIN_IN_USE_EXCEPTION_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "DomainInUseException");
    private static final QName INVALID_GENERATOR_EXCEPTION_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "InvalidGeneratorException");
    private static final QName INVALID_ALPHABET_EXCEPTION_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "InvalidAlphabetException");
    private static final QName INVALID_PARENT_DOMAIN_EXCEPTION_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "InvalidParentDomainException");
    private static final QName INVALID_CHECK_DIGIT_CLASS_EXCEPTION_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "InvalidCheckDigitClassException");
    private static final QName INVALID_UPDATE_IN_USE_OPERATION_EXCEPTION_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "InvalidUpdateInUseOperationException");
    private static final QName LIST_PS_NS_RESPONSE_RETURN_QNAME = new QName("", "return");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package:
     * de.fraunhofer.isst.health.transit.utils.gpas.domain
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PaginationConfig }
     *
     * @return the new instance of {@link PaginationConfig }
     */
    public PaginationConfig createPaginationConfig() {
        return new PaginationConfig();
    }

    /**
     * Create an instance of {@link PaginationConfig.Filter }
     *
     * @return the new instance of {@link PaginationConfig.Filter }
     */
    public PaginationConfig.Filter createPaginationConfigFilter() {
        return new PaginationConfig.Filter();
    }

    /**
     * Create an instance of {@link ListPSNsResponse }
     *
     * @return the new instance of {@link ListPSNsResponse }
     */
    public ListPSNsResponse createListPSNsResponse() {
        return new ListPSNsResponse();
    }

    /**
     * Create an instance of {@link ListPSNsPaginatedResponse }
     *
     * @return the new instance of {@link ListPSNsPaginatedResponse }
     */
    public ListPSNsPaginatedResponse createListPSNsPaginatedResponse() {
        return new ListPSNsPaginatedResponse();
    }

    /**
     * Create an instance of {@link ListPSNsForDomainsPaginatedResponse }
     *
     * @return the new instance of {@link ListPSNsForDomainsPaginatedResponse }
     */
    public ListPSNsForDomainsPaginatedResponse createListPSNsForDomainsPaginatedResponse() {
        return new ListPSNsForDomainsPaginatedResponse();
    }

    /**
     * Create an instance of {@link ListDomainsResponse }
     *
     * @return the new instance of {@link ListDomainsResponse }
     */
    public ListDomainsResponse createListDomainsResponse() {
        return new ListDomainsResponse();
    }

    /**
     * Create an instance of {@link GetDomainsForSuffixResponse }
     *
     * @return the new instance of {@link GetDomainsForSuffixResponse }
     */
    public GetDomainsForSuffixResponse createGetDomainsForSuffixResponse() {
        return new GetDomainsForSuffixResponse();
    }

    /**
     * Create an instance of {@link GetDomainsForPrefixResponse }
     *
     * @return the new instance of {@link GetDomainsForPrefixResponse }
     */
    public GetDomainsForPrefixResponse createGetDomainsForPrefixResponse() {
        return new GetDomainsForPrefixResponse();
    }

    /**
     * Create an instance of {@link AddDomain }
     *
     * @return the new instance of {@link AddDomain }
     */
    public AddDomain createAddDomain() {
        return new AddDomain();
    }

    /**
     * Create an instance of {@link AddDomainResponse }
     *
     * @return the new instance of {@link AddDomainResponse }
     */
    public AddDomainResponse createAddDomainResponse() {
        return new AddDomainResponse();
    }

    /**
     * Create an instance of {@link ArePSNDeletable }
     *
     * @return the new instance of {@link ArePSNDeletable }
     */
    public ArePSNDeletable createArePSNDeletable() {
        return new ArePSNDeletable();
    }

    /**
     * Create an instance of {@link ArePSNDeletableResponse }
     *
     * @return the new instance of {@link ArePSNDeletableResponse }
     */
    public ArePSNDeletableResponse createArePSNDeletableResponse() {
        return new ArePSNDeletableResponse();
    }

    /**
     * Create an instance of {@link CountPSNs }
     *
     * @return the new instance of {@link CountPSNs }
     */
    public CountPSNs createCountPSNs() {
        return new CountPSNs();
    }

    /**
     * Create an instance of {@link CountPSNsForDomains }
     *
     * @return the new instance of {@link CountPSNsForDomains }
     */
    public CountPSNsForDomains createCountPSNsForDomains() {
        return new CountPSNsForDomains();
    }

    /**
     * Create an instance of {@link CountPSNsForDomainsResponse }
     *
     * @return the new instance of {@link CountPSNsForDomainsResponse }
     */
    public CountPSNsForDomainsResponse createCountPSNsForDomainsResponse() {
        return new CountPSNsForDomainsResponse();
    }

    /**
     * Create an instance of {@link CountPSNsResponse }
     *
     * @return the new instance of {@link CountPSNsResponse }
     */
    public CountPSNsResponse createCountPSNsResponse() {
        return new CountPSNsResponse();
    }

    /**
     * Create an instance of {@link DeleteDomain }
     *
     * @return the new instance of {@link DeleteDomain }
     */
    public DeleteDomain createDeleteDomain() {
        return new DeleteDomain();
    }

    /**
     * Create an instance of {@link DeleteDomainResponse }
     *
     * @return the new instance of {@link DeleteDomainResponse }
     */
    public DeleteDomainResponse createDeleteDomainResponse() {
        return new DeleteDomainResponse();
    }

    /**
     * Create an instance of {@link DeleteDomainWithPSNs }
     *
     * @return the new instance of {@link DeleteDomainWithPSNs }
     */
    public DeleteDomainWithPSNs createDeleteDomainWithPSNs() {
        return new DeleteDomainWithPSNs();
    }

    /**
     * Create an instance of {@link DeleteDomainWithPSNsResponse }
     *
     * @return the new instance of {@link DeleteDomainWithPSNsResponse }
     */
    public DeleteDomainWithPSNsResponse createDeleteDomainWithPSNsResponse() {
        return new DeleteDomainWithPSNsResponse();
    }

    /**
     * Create an instance of {@link DomainInDTO }
     *
     * @return the new instance of {@link DomainInDTO }
     */
    public DomainInDTO createDomainInDTO() {
        return new DomainInDTO();
    }

    /**
     * Create an instance of {@link DomainOutDTO }
     *
     * @return the new instance of {@link DomainOutDTO }
     */
    public DomainOutDTO createDomainOutDTO() {
        return new DomainOutDTO();
    }

    /**
     * Create an instance of {@link GetAlphabet }
     *
     * @return the new instance of {@link GetAlphabet }
     */
    public GetAlphabet createGetAlphabet() {
        return new GetAlphabet();
    }

    /**
     * Create an instance of {@link GetAlphabetResponse }
     *
     * @return the new instance of {@link GetAlphabetResponse }
     */
    public GetAlphabetResponse createGetAlphabetResponse() {
        return new GetAlphabetResponse();
    }

    /**
     * Create an instance of {@link GetDomain }
     *
     * @return the new instance of {@link GetDomain }
     */
    public GetDomain createGetDomain() {
        return new GetDomain();
    }

    /**
     * Create an instance of {@link GetDomainResponse }
     *
     * @return the new instance of {@link GetDomainResponse }
     */
    public GetDomainResponse createGetDomainResponse() {
        return new GetDomainResponse();
    }

    /**
     * Create an instance of {@link GetDomainsForPrefix }
     *
     * @return the new instance of {@link GetDomainsForPrefix }
     */
    public GetDomainsForPrefix createGetDomainsForPrefix() {
        return new GetDomainsForPrefix();
    }

    /**
     * Create an instance of {@link GetDomainsForSuffix }
     *
     * @return the new instance of {@link GetDomainsForSuffix }
     */
    public GetDomainsForSuffix createGetDomainsForSuffix() {
        return new GetDomainsForSuffix();
    }

    /**
     * Create an instance of {@link GetRestrictionForCheckDigitClass }
     *
     * @return the new instance of {@link GetRestrictionForCheckDigitClass }
     */
    public GetRestrictionForCheckDigitClass createGetRestrictionForCheckDigitClass() {
        return new GetRestrictionForCheckDigitClass();
    }

    /**
     * Create an instance of {@link GetRestrictionForCheckDigitClassResponse }
     *
     * @return the new instance of {@link GetRestrictionForCheckDigitClassResponse }
     */
    public GetRestrictionForCheckDigitClassResponse createGetRestrictionForCheckDigitClassResponse() {
        return new GetRestrictionForCheckDigitClassResponse();
    }

    /**
     * Create an instance of {@link ListDomains }
     *
     * @return the new instance of {@link ListDomains }
     */
    public ListDomains createListDomains() {
        return new ListDomains();
    }

    /**
     * Create an instance of {@link ListPSNs }
     *
     * @return the new instance of {@link ListPSNs }
     */
    public ListPSNs createListPSNs() {
        return new ListPSNs();
    }

    /**
     * Create an instance of {@link ListPSNsForDomainsPaginated }
     *
     * @return the new instance of {@link ListPSNsForDomainsPaginated }
     */
    public ListPSNsForDomainsPaginated createListPSNsForDomainsPaginated() {
        return new ListPSNsForDomainsPaginated();
    }

    /**
     * Create an instance of {@link ListPSNsPaginated }
     *
     * @return the new instance of {@link ListPSNsPaginated }
     */
    public ListPSNsPaginated createListPSNsPaginated() {
        return new ListPSNsPaginated();
    }

    /**
     * Create an instance of {@link Psndto }
     *
     * @return the new instance of {@link Psndto }
     */
    public Psndto createPsndto() {
        return new Psndto();
    }

    /**
     * Create an instance of {@link UpdateDomain }
     *
     * @return the new instance of {@link UpdateDomain }
     */
    public UpdateDomain createUpdateDomain() {
        return new UpdateDomain();
    }

    /**
     * Create an instance of {@link UpdateDomainInUse }
     *
     * @return the new instance of {@link UpdateDomainInUse }
     */
    public UpdateDomainInUse createUpdateDomainInUse() {
        return new UpdateDomainInUse();
    }

    /**
     * Create an instance of {@link UpdateDomainInUseResponse }
     *
     * @return the new instance of {@link UpdateDomainInUseResponse }
     */
    public UpdateDomainInUseResponse createUpdateDomainInUseResponse() {
        return new UpdateDomainInUseResponse();
    }

    /**
     * Create an instance of {@link UpdateDomainResponse }
     *
     * @return the new instance of {@link UpdateDomainResponse }
     */
    public UpdateDomainResponse createUpdateDomainResponse() {
        return new UpdateDomainResponse();
    }

    /**
     * Create an instance of {@link UnknownDomainExceptionType }
     *
     * @return the new instance of {@link UnknownDomainExceptionType }
     */
    public UnknownDomainExceptionType createUnknownDomainExceptionType() {
        return new UnknownDomainExceptionType();
    }

    /**
     * Create an instance of {@link InvalidParameterException }
     *
     * @return the new instance of {@link InvalidParameterException }
     */
    public InvalidParameterException createInvalidParameterException() {
        return new InvalidParameterException();
    }

    /**
     * Create an instance of {@link DomainInUseExceptionType }
     *
     * @return the new instance of {@link DomainInUseExceptionType }
     */
    public DomainInUseExceptionType createDomainInUseExceptionType() {
        return new DomainInUseExceptionType();
    }

    /**
     * Create an instance of {@link InvalidGeneratorExceptionType }
     *
     * @return the new instance of {@link InvalidGeneratorExceptionType }
     */
    public InvalidGeneratorExceptionType createInvalidGeneratorExceptionType() {
        return new InvalidGeneratorExceptionType();
    }

    /**
     * Create an instance of {@link InvalidAlphabetExceptionType }
     *
     * @return the new instance of {@link InvalidAlphabetExceptionType }
     */
    public InvalidAlphabetExceptionType createInvalidAlphabetExceptionType() {
        return new InvalidAlphabetExceptionType();
    }

    /**
     * Create an instance of {@link InvalidParentDomainException }
     *
     * @return the new instance of {@link InvalidParentDomainException }
     */
    public InvalidParentDomainException createInvalidParentDomainException() {
        return new InvalidParentDomainException();
    }

    /**
     * Create an instance of {@link InvalidCheckDigitClassExceptionType }
     *
     * @return the new instance of {@link InvalidCheckDigitClassExceptionType }
     */
    public InvalidCheckDigitClassExceptionType createInvalidCheckDigitClassExceptionType() {
        return new InvalidCheckDigitClassExceptionType();
    }

    /**
     * Create an instance of {@link InvalidUpdateInUseOperationException }
     *
     * @return the new instance of {@link InvalidUpdateInUseOperationException }
     */
    public InvalidUpdateInUseOperationException createInvalidUpdateInUseOperationException() {
        return new InvalidUpdateInUseOperationException();
    }

    /**
     * Create an instance of {@link DomainConfig }
     *
     * @return the new instance of {@link DomainConfig }
     */
    public DomainConfig createDomainConfig() {
        return new DomainConfig();
    }

    /**
     * Create an instance of {@link PaginationConfig.Filter.Entry }
     *
     * @return the new instance of {@link PaginationConfig.Filter.Entry }
     */
    public PaginationConfig.Filter.Entry createPaginationConfigFilterEntry() {
        return new PaginationConfig.Filter.Entry();
    }

    /**
     * Create an instance of {@link ListPSNsResponse.Return }
     *
     * @return the new instance of {@link ListPSNsResponse.Return }
     */
    public ListPSNsResponse.Return createListPSNsResponseReturn() {
        return new ListPSNsResponse.Return();
    }

    /**
     * Create an instance of {@link ListPSNsPaginatedResponse.Return }
     *
     * @return the new instance of {@link ListPSNsPaginatedResponse.Return }
     */
    public ListPSNsPaginatedResponse.Return createListPSNsPaginatedResponseReturn() {
        return new ListPSNsPaginatedResponse.Return();
    }

    /**
     * Create an instance of {@link ListPSNsForDomainsPaginatedResponse.Return }
     *
     * @return the new instance of {@link ListPSNsForDomainsPaginatedResponse.Return }
     */
    public ListPSNsForDomainsPaginatedResponse.Return createListPSNsForDomainsPaginatedResponseReturn() {
        return new ListPSNsForDomainsPaginatedResponse.Return();
    }

    /**
     * Create an instance of {@link ListDomainsResponse.Return }
     *
     * @return the new instance of {@link ListDomainsResponse.Return }
     */
    public ListDomainsResponse.Return createListDomainsResponseReturn() {
        return new ListDomainsResponse.Return();
    }

    /**
     * Create an instance of {@link GetDomainsForSuffixResponse.Return }
     *
     * @return the new instance of {@link GetDomainsForSuffixResponse.Return }
     */
    public GetDomainsForSuffixResponse.Return createGetDomainsForSuffixResponseReturn() {
        return new GetDomainsForSuffixResponse.Return();
    }

    /**
     * Create an instance of {@link GetDomainsForPrefixResponse.Return }
     *
     * @return the new instance of {@link GetDomainsForPrefixResponse.Return }
     */
    public GetDomainsForPrefixResponse.Return createGetDomainsForPrefixResponseReturn() {
        return new GetDomainsForPrefixResponse.Return();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDomain }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AddDomain }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "addDomain")
    public JAXBElement<AddDomain> createAddDomain(AddDomain value) {
        return new JAXBElement<>(ADD_DOMAIN_QNAME, AddDomain.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDomainResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AddDomainResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "addDomainResponse")
    public JAXBElement<AddDomainResponse> createAddDomainResponse(AddDomainResponse value) {
        return new JAXBElement<>(ADD_DOMAIN_RESPONSE_QNAME, AddDomainResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArePSNDeletable }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArePSNDeletable }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "arePSNDeletable")
    public JAXBElement<ArePSNDeletable> createArePSNDeletable(ArePSNDeletable value) {
        return new JAXBElement<>(ARE_PSN_DELETABLE_QNAME, ArePSNDeletable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArePSNDeletableResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ArePSNDeletableResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "arePSNDeletableResponse")
    public JAXBElement<ArePSNDeletableResponse> createArePSNDeletableResponse(ArePSNDeletableResponse value) {
        return new JAXBElement<>(ARE_PSN_DELETABLE_RESPONSE_QNAME, ArePSNDeletableResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountPSNs }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link CountPSNs }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "countPSNs")
    public JAXBElement<CountPSNs> createCountPSNs(CountPSNs value) {
        return new JAXBElement<>(COUNT_PS_NS_QNAME, CountPSNs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountPSNsForDomains }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link CountPSNsForDomains }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "countPSNsForDomains")
    public JAXBElement<CountPSNsForDomains> createCountPSNsForDomains(CountPSNsForDomains value) {
        return new JAXBElement<>(COUNT_PS_NS_FOR_DOMAINS_QNAME, CountPSNsForDomains.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountPSNsForDomainsResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link CountPSNsForDomainsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "countPSNsForDomainsResponse")
    public JAXBElement<CountPSNsForDomainsResponse> createCountPSNsForDomainsResponse(CountPSNsForDomainsResponse value) {
        return new JAXBElement<>(COUNT_PS_NS_FOR_DOMAINS_RESPONSE_QNAME, CountPSNsForDomainsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountPSNsResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link CountPSNsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "countPSNsResponse")
    public JAXBElement<CountPSNsResponse> createCountPSNsResponse(CountPSNsResponse value) {
        return new JAXBElement<>(COUNT_PS_NS_RESPONSE_QNAME, CountPSNsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDomain }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DeleteDomain }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "deleteDomain")
    public JAXBElement<DeleteDomain> createDeleteDomain(DeleteDomain value) {
        return new JAXBElement<>(DELETE_DOMAIN_QNAME, DeleteDomain.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDomainResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DeleteDomainResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "deleteDomainResponse")
    public JAXBElement<DeleteDomainResponse> createDeleteDomainResponse(DeleteDomainResponse value) {
        return new JAXBElement<>(DELETE_DOMAIN_RESPONSE_QNAME, DeleteDomainResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDomainWithPSNs }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DeleteDomainWithPSNs }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "deleteDomainWithPSNs")
    public JAXBElement<DeleteDomainWithPSNs> createDeleteDomainWithPSNs(DeleteDomainWithPSNs value) {
        return new JAXBElement<>(DELETE_DOMAIN_WITH_PS_NS_QNAME, DeleteDomainWithPSNs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDomainWithPSNsResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DeleteDomainWithPSNsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "deleteDomainWithPSNsResponse")
    public JAXBElement<DeleteDomainWithPSNsResponse> createDeleteDomainWithPSNsResponse(DeleteDomainWithPSNsResponse value) {
        return new JAXBElement<>(DELETE_DOMAIN_WITH_PS_NS_RESPONSE_QNAME, DeleteDomainWithPSNsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInDTO }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DomainInDTO }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "domainInDTO")
    public JAXBElement<DomainInDTO> createDomainInDTO(DomainInDTO value) {
        return new JAXBElement<>(DOMAIN_IN_DTO_QNAME, DomainInDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainOutDTO }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DomainOutDTO }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "domainOutDTO")
    public JAXBElement<DomainOutDTO> createDomainOutDTO(DomainOutDTO value) {
        return new JAXBElement<>(DOMAIN_OUT_DTO_QNAME, DomainOutDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAlphabet }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetAlphabet }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "getAlphabet")
    public JAXBElement<GetAlphabet> createGetAlphabet(GetAlphabet value) {
        return new JAXBElement<>(GET_ALPHABET_QNAME, GetAlphabet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAlphabetResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetAlphabetResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "getAlphabetResponse")
    public JAXBElement<GetAlphabetResponse> createGetAlphabetResponse(GetAlphabetResponse value) {
        return new JAXBElement<>(GET_ALPHABET_RESPONSE_QNAME, GetAlphabetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDomain }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetDomain }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "getDomain")
    public JAXBElement<GetDomain> createGetDomain(GetDomain value) {
        return new JAXBElement<>(GET_DOMAIN_QNAME, GetDomain.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDomainResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetDomainResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "getDomainResponse")
    public JAXBElement<GetDomainResponse> createGetDomainResponse(GetDomainResponse value) {
        return new JAXBElement<>(GET_DOMAIN_RESPONSE_QNAME, GetDomainResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDomainsForPrefix }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetDomainsForPrefix }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "getDomainsForPrefix")
    public JAXBElement<GetDomainsForPrefix> createGetDomainsForPrefix(GetDomainsForPrefix value) {
        return new JAXBElement<>(GET_DOMAINS_FOR_PREFIX_QNAME, GetDomainsForPrefix.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDomainsForPrefixResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetDomainsForPrefixResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "getDomainsForPrefixResponse")
    public JAXBElement<GetDomainsForPrefixResponse> createGetDomainsForPrefixResponse(GetDomainsForPrefixResponse value) {
        return new JAXBElement<>(GET_DOMAINS_FOR_PREFIX_RESPONSE_QNAME, GetDomainsForPrefixResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDomainsForSuffix }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetDomainsForSuffix }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "getDomainsForSuffix")
    public JAXBElement<GetDomainsForSuffix> createGetDomainsForSuffix(GetDomainsForSuffix value) {
        return new JAXBElement<>(GET_DOMAINS_FOR_SUFFIX_QNAME, GetDomainsForSuffix.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDomainsForSuffixResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetDomainsForSuffixResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "getDomainsForSuffixResponse")
    public JAXBElement<GetDomainsForSuffixResponse> createGetDomainsForSuffixResponse(GetDomainsForSuffixResponse value) {
        return new JAXBElement<>(GET_DOMAINS_FOR_SUFFIX_RESPONSE_QNAME, GetDomainsForSuffixResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRestrictionForCheckDigitClass }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetRestrictionForCheckDigitClass }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "getRestrictionForCheckDigitClass")
    public JAXBElement<GetRestrictionForCheckDigitClass> createGetRestrictionForCheckDigitClass(
            GetRestrictionForCheckDigitClass value) {
        return new JAXBElement<>(GET_RESTRICTION_FOR_CHECK_DIGIT_CLASS_QNAME, GetRestrictionForCheckDigitClass.class, null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRestrictionForCheckDigitClassResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetRestrictionForCheckDigitClassResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "getRestrictionForCheckDigitClassResponse")
    public JAXBElement<GetRestrictionForCheckDigitClassResponse> createGetRestrictionForCheckDigitClassResponse(
            GetRestrictionForCheckDigitClassResponse value) {
        return new JAXBElement<>(GET_RESTRICTION_FOR_CHECK_DIGIT_CLASS_RESPONSE_QNAME,
                GetRestrictionForCheckDigitClassResponse.class,
                null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListDomains }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ListDomains }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "listDomains")
    public JAXBElement<ListDomains> createListDomains(ListDomains value) {
        return new JAXBElement<>(LIST_DOMAINS_QNAME, ListDomains.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListDomainsResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ListDomainsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "listDomainsResponse")
    public JAXBElement<ListDomainsResponse> createListDomainsResponse(ListDomainsResponse value) {
        return new JAXBElement<>(LIST_DOMAINS_RESPONSE_QNAME, ListDomainsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListPSNs }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ListPSNs }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "listPSNs")
    public JAXBElement<ListPSNs> createListPSNs(ListPSNs value) {
        return new JAXBElement<>(LIST_PS_NS_QNAME, ListPSNs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListPSNsForDomainsPaginated }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ListPSNsForDomainsPaginated }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "listPSNsForDomainsPaginated")
    public JAXBElement<ListPSNsForDomainsPaginated> createListPSNsForDomainsPaginated(ListPSNsForDomainsPaginated value) {
        return new JAXBElement<>(LIST_PS_NS_FOR_DOMAINS_PAGINATED_QNAME, ListPSNsForDomainsPaginated.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListPSNsForDomainsPaginatedResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ListPSNsForDomainsPaginatedResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "listPSNsForDomainsPaginatedResponse")
    public JAXBElement<ListPSNsForDomainsPaginatedResponse> createListPSNsForDomainsPaginatedResponse(
            ListPSNsForDomainsPaginatedResponse value) {
        return new JAXBElement<>(LIST_PS_NS_FOR_DOMAINS_PAGINATED_RESPONSE_QNAME, ListPSNsForDomainsPaginatedResponse.class, null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListPSNsPaginated }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ListPSNsPaginated }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "listPSNsPaginated")
    public JAXBElement<ListPSNsPaginated> createListPSNsPaginated(ListPSNsPaginated value) {
        return new JAXBElement<>(LIST_PS_NS_PAGINATED_QNAME, ListPSNsPaginated.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListPSNsPaginatedResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ListPSNsPaginatedResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "listPSNsPaginatedResponse")
    public JAXBElement<ListPSNsPaginatedResponse> createListPSNsPaginatedResponse(ListPSNsPaginatedResponse value) {
        return new JAXBElement<>(LIST_PS_NS_PAGINATED_RESPONSE_QNAME, ListPSNsPaginatedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListPSNsResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ListPSNsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "listPSNsResponse")
    public JAXBElement<ListPSNsResponse> createListPSNsResponse(ListPSNsResponse value) {
        return new JAXBElement<>(LIST_PS_NS_RESPONSE_QNAME, ListPSNsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Psndto }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link Psndto }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "psndto")
    public JAXBElement<Psndto> createPsndto(Psndto value) {
        return new JAXBElement<>(PSNDTO_QNAME, Psndto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDomain }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link UpdateDomain }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "updateDomain")
    public JAXBElement<UpdateDomain> createUpdateDomain(UpdateDomain value) {
        return new JAXBElement<>(UPDATE_DOMAIN_QNAME, UpdateDomain.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDomainInUse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link UpdateDomainInUse }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "updateDomainInUse")
    public JAXBElement<UpdateDomainInUse> createUpdateDomainInUse(UpdateDomainInUse value) {
        return new JAXBElement<>(UPDATE_DOMAIN_IN_USE_QNAME, UpdateDomainInUse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDomainInUseResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link UpdateDomainInUseResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "updateDomainInUseResponse")
    public JAXBElement<UpdateDomainInUseResponse> createUpdateDomainInUseResponse(UpdateDomainInUseResponse value) {
        return new JAXBElement<>(UPDATE_DOMAIN_IN_USE_RESPONSE_QNAME, UpdateDomainInUseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDomainResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link UpdateDomainResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "updateDomainResponse")
    public JAXBElement<UpdateDomainResponse> createUpdateDomainResponse(UpdateDomainResponse value) {
        return new JAXBElement<>(UPDATE_DOMAIN_RESPONSE_QNAME, UpdateDomainResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnknownDomainExceptionType }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link UnknownDomainExceptionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "UnknownDomainException")
    public JAXBElement<UnknownDomainExceptionType> createUnknownDomainException(UnknownDomainExceptionType value) {
        return new JAXBElement<>(UNKNOWN_DOMAIN_EXCEPTION_QNAME, UnknownDomainExceptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidParameterException }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link InvalidParameterException }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "InvalidParameterException")
    public JAXBElement<InvalidParameterException> createInvalidParameterException(InvalidParameterException value) {
        return new JAXBElement<>(INVALID_PARAMETER_EXCEPTION_QNAME, InvalidParameterException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DomainInUseExceptionType }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DomainInUseExceptionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "DomainInUseException")
    public JAXBElement<DomainInUseExceptionType> createDomainInUseException(DomainInUseExceptionType value) {
        return new JAXBElement<>(DOMAIN_IN_USE_EXCEPTION_QNAME, DomainInUseExceptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidGeneratorExceptionType }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link InvalidGeneratorExceptionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "InvalidGeneratorException")
    public JAXBElement<InvalidGeneratorExceptionType> createInvalidGeneratorException(InvalidGeneratorExceptionType value) {
        return new JAXBElement<>(INVALID_GENERATOR_EXCEPTION_QNAME, InvalidGeneratorExceptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidAlphabetExceptionType }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link InvalidAlphabetExceptionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "InvalidAlphabetException")
    public JAXBElement<InvalidAlphabetExceptionType> createInvalidAlphabetException(InvalidAlphabetExceptionType value) {
        return new JAXBElement<>(INVALID_ALPHABET_EXCEPTION_QNAME, InvalidAlphabetExceptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidParentDomainException }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link InvalidParentDomainException }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "InvalidParentDomainException")
    public JAXBElement<InvalidParentDomainException> createInvalidParentDomainException(InvalidParentDomainException value) {
        return new JAXBElement<>(INVALID_PARENT_DOMAIN_EXCEPTION_QNAME, InvalidParentDomainException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidCheckDigitClassExceptionType }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link InvalidCheckDigitClassExceptionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "InvalidCheckDigitClassException")
    public JAXBElement<InvalidCheckDigitClassExceptionType> createInvalidCheckDigitClassException(
            InvalidCheckDigitClassExceptionType value) {
        return new JAXBElement<>(INVALID_CHECK_DIGIT_CLASS_EXCEPTION_QNAME, InvalidCheckDigitClassExceptionType.class,
                null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidUpdateInUseOperationException }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link InvalidUpdateInUseOperationException }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "InvalidUpdateInUseOperationException")
    public JAXBElement<InvalidUpdateInUseOperationException> createInvalidUpdateInUseOperationException(
            InvalidUpdateInUseOperationException value) {
        return new JAXBElement<>(INVALID_UPDATE_IN_USE_OPERATION_EXCEPTION_QNAME, InvalidUpdateInUseOperationException.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListPSNsResponse.Return }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ListPSNsResponse.Return }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "return", scope = ListPSNsResponse.class)
    public JAXBElement<ListPSNsResponse.Return> createListPSNsResponseReturn(ListPSNsResponse.Return value) {
        return new JAXBElement<>(LIST_PS_NS_RESPONSE_RETURN_QNAME, ListPSNsResponse.Return.class, ListPSNsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListPSNsPaginatedResponse.Return }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ListPSNsPaginatedResponse.Return }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "return", scope = ListPSNsPaginatedResponse.class)
    public JAXBElement<ListPSNsPaginatedResponse.Return> createListPSNsPaginatedResponseReturn(
            ListPSNsPaginatedResponse.Return value) {
        return new JAXBElement<>(LIST_PS_NS_RESPONSE_RETURN_QNAME, ListPSNsPaginatedResponse.Return.class,
                ListPSNsPaginatedResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListPSNsForDomainsPaginatedResponse.Return }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ListPSNsForDomainsPaginatedResponse.Return }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "return", scope = ListPSNsForDomainsPaginatedResponse.class)
    public JAXBElement<ListPSNsForDomainsPaginatedResponse.Return> createListPSNsForDomainsPaginatedResponseReturn(
            ListPSNsForDomainsPaginatedResponse.Return value) {
        return new JAXBElement<>(LIST_PS_NS_RESPONSE_RETURN_QNAME, ListPSNsForDomainsPaginatedResponse.Return.class,
                ListPSNsForDomainsPaginatedResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListDomainsResponse.Return }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link ListDomainsResponse.Return }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "return", scope = ListDomainsResponse.class)
    public JAXBElement<ListDomainsResponse.Return> createListDomainsResponseReturn(ListDomainsResponse.Return value) {
        return new JAXBElement<>(LIST_PS_NS_RESPONSE_RETURN_QNAME, ListDomainsResponse.Return.class, ListDomainsResponse.class,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDomainsForSuffixResponse.Return }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetDomainsForSuffixResponse.Return }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "return", scope = GetDomainsForSuffixResponse.class)
    public JAXBElement<GetDomainsForSuffixResponse.Return> createGetDomainsForSuffixResponseReturn(
            GetDomainsForSuffixResponse.Return value) {
        return new JAXBElement<>(LIST_PS_NS_RESPONSE_RETURN_QNAME, GetDomainsForSuffixResponse.Return.class,
                GetDomainsForSuffixResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDomainsForPrefixResponse.Return }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetDomainsForPrefixResponse.Return }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "return", scope = GetDomainsForPrefixResponse.class)
    public JAXBElement<GetDomainsForPrefixResponse.Return> createGetDomainsForPrefixResponseReturn(
            GetDomainsForPrefixResponse.Return value) {
        return new JAXBElement<>(LIST_PS_NS_RESPONSE_RETURN_QNAME, GetDomainsForPrefixResponse.Return.class,
                GetDomainsForPrefixResponse.class, value);
    }

}
