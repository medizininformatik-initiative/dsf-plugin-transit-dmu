package de.fraunhofer.isst.health.transit.utils.gpas.psn;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;

import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private static final QName ANONYMISE_ALL_ENTRIES_FOR_VALUE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "anonymiseAllEntriesForValue");
    private static final QName ANONYMISE_ALL_ENTRIES_FOR_VALUE_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "anonymiseAllEntriesForValueResponse");
    private static final QName ANONYMISE_ALL_ENTRIES_FOR_VALUES_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "anonymiseAllEntriesForValues");
    private static final QName ANONYMISE_ALL_ENTRIES_FOR_VALUES_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "anonymiseAllEntriesForValuesResponse");
    private static final QName ANONYMISE_ENTRIES_QNAME = new QName("http://psn.ttp.ganimed.icmvc.emau.org/",
            "anonymiseEntries");
    private static final QName ANONYMISE_ENTRIES_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "anonymiseEntriesResponse");
    private static final QName ANONYMISE_ENTRY_QNAME = new QName("http://psn.ttp.ganimed.icmvc.emau.org/",
            "anonymiseEntry");
    private static final QName ANONYMISE_ENTRY_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "anonymiseEntryResponse");
    private static final QName ANONYMISE_PSEUDONYM_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "anonymisePseudonym");
    private static final QName ANONYMISE_PSEUDONYM_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "anonymisePseudonymResponse");
    private static final QName ANONYMISE_PSEUDONYMS_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "anonymisePseudonyms");
    private static final QName ANONYMISE_PSEUDONYMS_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "anonymisePseudonymsResponse");
    private static final QName CREATE_PSEUDONYM_FOR_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "createPseudonymFor");
    private static final QName CREATE_PSEUDONYM_FOR_LIST_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "createPseudonymForList");
    private static final QName CREATE_PSEUDONYM_FOR_LIST_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "createPseudonymForListResponse");
    private static final QName CREATE_PSEUDONYM_FOR_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "createPseudonymForResponse");
    private static final QName CREATE_PSEUDONYMS_FOR_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "createPseudonymsFor");
    private static final QName CREATE_PSEUDONYMS_FOR_LIST_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "createPseudonymsForList");
    private static final QName CREATE_PSEUDONYMS_FOR_LIST_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "createPseudonymsForListResponse");
    private static final QName CREATE_PSEUDONYMS_FOR_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "createPseudonymsForResponse");
    private static final QName DELETE_ALL_ENTRIES_FOR_VALUE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "deleteAllEntriesForValue");
    private static final QName DELETE_ALL_ENTRIES_FOR_VALUE_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "deleteAllEntriesForValueResponse");
    private static final QName DELETE_ALL_ENTRIES_FOR_VALUES_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "deleteAllEntriesForValues");
    private static final QName DELETE_ALL_ENTRIES_FOR_VALUES_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "deleteAllEntriesForValuesResponse");
    private static final QName DELETE_ENTRIES_QNAME = new QName("http://psn.ttp.ganimed.icmvc.emau.org/",
            "deleteEntries");
    private static final QName DELETE_ENTRIES_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "deleteEntriesResponse");
    private static final QName DELETE_ENTRY_QNAME = new QName("http://psn.ttp.ganimed.icmvc.emau.org/",
            "deleteEntry");
    private static final QName DELETE_ENTRY_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "deleteEntryResponse");
    private static final QName DELETE_PSEUDONYM_QNAME = new QName("http://psn.ttp.ganimed.icmvc.emau.org/",
            "deletePseudonym");
    private static final QName DELETE_PSEUDONYM_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "deletePseudonymResponse");
    private static final QName DELETE_PSEUDONYMS_QNAME = new QName("http://psn.ttp.ganimed.icmvc.emau.org/",
            "deletePseudonyms");
    private static final QName DELETE_PSEUDONYMS_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "deletePseudonymsResponse");
    private static final QName GET_OR_CREATE_PSEUDONYM_FOR_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "getOrCreatePseudonymFor");
    private static final QName GET_OR_CREATE_PSEUDONYM_FOR_LIST_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "getOrCreatePseudonymForList");
    private static final QName GET_OR_CREATE_PSEUDONYM_FOR_LIST_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "getOrCreatePseudonymForListResponse");
    private static final QName GET_OR_CREATE_PSEUDONYM_FOR_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "getOrCreatePseudonymForResponse");
    private static final QName GET_OR_CREATE_PSEUDONYMS_FOR_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "getOrCreatePseudonymsFor");
    private static final QName GET_OR_CREATE_PSEUDONYMS_FOR_LIST_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "getOrCreatePseudonymsForList");
    private static final QName GET_OR_CREATE_PSEUDONYMS_FOR_LIST_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "getOrCreatePseudonymsForListResponse");
    private static final QName GET_OR_CREATE_PSEUDONYMS_FOR_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "getOrCreatePseudonymsForResponse");
    private static final QName GET_PSN_NET_FOR_QNAME = new QName("http://psn.ttp.ganimed.icmvc.emau.org/",
            "getPSNNetFor");
    private static final QName GET_PSN_NET_FOR_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "getPSNNetForResponse");
    private static final QName GET_PSN_TREE_FOR_PSN_QNAME = new QName("http://psn.ttp.ganimed.icmvc.emau.org/",
            "getPSNTreeForPSN");
    private static final QName GET_PSN_TREE_FOR_PSN_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "getPSNTreeForPSNResponse");
    private static final QName GET_PSEUDONYM_FOR_QNAME = new QName("http://psn.ttp.ganimed.icmvc.emau.org/",
            "getPseudonymFor");
    private static final QName GET_PSEUDONYM_FOR_LIST_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "getPseudonymForList");
    private static final QName GET_PSEUDONYM_FOR_LIST_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "getPseudonymForListResponse");
    private static final QName GET_PSEUDONYM_FOR_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "getPseudonymForResponse");
    private static final QName GET_PSEUDONYM_FOR_VALUE_PREFIX_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "getPseudonymForValuePrefix");
    private static final QName GET_PSEUDONYM_FOR_VALUE_PREFIX_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "getPseudonymForValuePrefixResponse");
    private static final QName GET_PSEUDONYMS_FOR_QNAME = new QName("http://psn.ttp.ganimed.icmvc.emau.org/",
            "getPseudonymsFor");
    private static final QName GET_PSEUDONYMS_FOR_LIST_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "getPseudonymsForList");
    private static final QName GET_PSEUDONYMS_FOR_LIST_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "getPseudonymsForListResponse");
    private static final QName GET_PSEUDONYMS_FOR_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "getPseudonymsForResponse");
    private static final QName GET_PSEUDONYMS_FOR_VALUE_PREFIX_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "getPseudonymsForValuePrefix");
    private static final QName GET_PSEUDONYMS_FOR_VALUE_PREFIX_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "getPseudonymsForValuePrefixResponse");
    private static final QName GET_VALUE_FOR_QNAME = new QName("http://psn.ttp.ganimed.icmvc.emau.org/",
            "getValueFor");
    private static final QName GET_VALUE_FOR_LIST_QNAME = new QName("http://psn.ttp.ganimed.icmvc.emau.org/",
            "getValueForList");
    private static final QName GET_VALUE_FOR_LIST_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "getValueForListResponse");
    private static final QName GET_VALUE_FOR_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "getValueForResponse");
    private static final QName INSERT_PAIR_EXCEPTION_DTO_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "insertPairExceptionDTO");
    private static final QName INSERT_VALUE_PSEUDONYM_PAIR_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "insertValuePseudonymPair");
    private static final QName INSERT_VALUE_PSEUDONYM_PAIR_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "insertValuePseudonymPairResponse");
    private static final QName INSERT_VALUE_PSEUDONYM_PAIRS_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "insertValuePseudonymPairs");
    private static final QName INSERT_VALUE_PSEUDONYM_PAIRS_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "insertValuePseudonymPairsResponse");
    private static final QName IS_ANONYM_QNAME = new QName("http://psn.ttp.ganimed.icmvc.emau.org/",
            "isAnonym");
    private static final QName IS_ANONYM_RESPONSE_QNAME = new QName("http://psn.ttp.ganimed.icmvc.emau.org/",
            "isAnonymResponse");
    private static final QName IS_ANONYMISED_QNAME = new QName("http://psn.ttp.ganimed.icmvc.emau.org/",
            "isAnonymised");
    private static final QName IS_ANONYMISED_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "isAnonymisedResponse");
    private static final QName PSN_NET_DTO_QNAME = new QName("http://psn.ttp.ganimed.icmvc.emau.org/",
            "psnNetDTO");
    private static final QName PSN_NET_NODE_DTO_QNAME = new QName("http://psn.ttp.ganimed.icmvc.emau.org/",
            "psnNetNodeDTO");
    private static final QName PSN_TREE_DTO_QNAME = new QName("http://psn.ttp.ganimed.icmvc.emau.org/",
            "psnTreeDTO");
    private static final QName PSNDTO_QNAME = new QName("http://psn.ttp.ganimed.icmvc.emau.org/",
            "psndto");
    private static final QName VALIDATE_PSN_QNAME = new QName("http://psn.ttp.ganimed.icmvc.emau.org/",
            "validatePSN");
    private static final QName VALIDATE_PSN_RESPONSE_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "validatePSNResponse");
    private static final QName INVALID_PARAMETER_EXCEPTION_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "InvalidParameterException");
    private static final QName UNKNOWN_DOMAIN_EXCEPTION_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "UnknownDomainException");
    private static final QName DELETION_FORBIDDEN_EXCEPTION_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "DeletionForbiddenException");
    private static final QName UNKNOWN_VALUE_EXCEPTION_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "UnknownValueException");
    private static final QName PSN_NOT_FOUND_EXCEPTION_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "PSNNotFoundException");
    private static final QName INVALID_PSN_EXCEPTION_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "InvalidPSNException");
    private static final QName VALUE_IS_ANONYMISED_EXCEPTION_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "ValueIsAnonymisedException");
    private static final QName DOMAIN_IS_FULL_EXCEPTION_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "DomainIsFullException");
    private static final QName DB_EXCEPTION_QNAME = new QName("http://psn.ttp.ganimed.icmvc.emau.org/",
            "DBException");
    private static final QName INSERT_PAIR_EXCEPTION_QNAME =
            new QName("http://psn.ttp.ganimed.icmvc.emau.org/", "InsertPairException");
    private static final QName INSERT_VALUE_PSEUDONYM_PAIRS_RESPONSE_RETURN_QNAME = new QName("",
            "return");

    public ObjectFactory() {
    }

    public InsertValuePseudonymPairsResponse createInsertValuePseudonymPairsResponse() {
        return new InsertValuePseudonymPairsResponse();
    }

    public GetValueForListResponse createGetValueForListResponse() {
        return new GetValueForListResponse();
    }

    public GetValueForListResponse.Return createGetValueForListResponseReturn() {
        return new GetValueForListResponse.Return();
    }

    public GetPseudonymsForResponse createGetPseudonymsForResponse() {
        return new GetPseudonymsForResponse();
    }

    public GetPseudonymForValuePrefixResponse createGetPseudonymForValuePrefixResponse() {
        return new GetPseudonymForValuePrefixResponse();
    }

    public GetPseudonymForValuePrefixResponse.Return createGetPseudonymForValuePrefixResponseReturn() {
        return new GetPseudonymForValuePrefixResponse.Return();
    }

    public GetPseudonymForListResponse createGetPseudonymForListResponse() {
        return new GetPseudonymForListResponse();
    }

    public GetPseudonymForListResponse.Return createGetPseudonymForListResponseReturn() {
        return new GetPseudonymForListResponse.Return();
    }

    public GetOrCreatePseudonymsForResponse createGetOrCreatePseudonymsForResponse() {
        return new GetOrCreatePseudonymsForResponse();
    }

    public GetOrCreatePseudonymForListResponse createGetOrCreatePseudonymForListResponse() {
        return new GetOrCreatePseudonymForListResponse();
    }

    public GetOrCreatePseudonymForListResponse.Return createGetOrCreatePseudonymForListResponseReturn() {
        return new GetOrCreatePseudonymForListResponse.Return();
    }

    public DeletePseudonymsResponse createDeletePseudonymsResponse() {
        return new DeletePseudonymsResponse();
    }

    public DeletePseudonymsResponse.Return createDeletePseudonymsResponseReturn() {
        return new DeletePseudonymsResponse.Return();
    }

    public DeleteEntriesResponse createDeleteEntriesResponse() {
        return new DeleteEntriesResponse();
    }

    public DeleteEntriesResponse.Return createDeleteEntriesResponseReturn() {
        return new DeleteEntriesResponse.Return();
    }

    public DeleteAllEntriesForValuesResponse createDeleteAllEntriesForValuesResponse() {
        return new DeleteAllEntriesForValuesResponse();
    }

    public DeleteAllEntriesForValuesResponse.Return createDeleteAllEntriesForValuesResponseReturn() {
        return new DeleteAllEntriesForValuesResponse.Return();
    }

    public CreatePseudonymsForResponse createCreatePseudonymsForResponse() {
        return new CreatePseudonymsForResponse();
    }

    public CreatePseudonymForListResponse createCreatePseudonymForListResponse() {
        return new CreatePseudonymForListResponse();
    }

    public CreatePseudonymForListResponse.Return createCreatePseudonymForListResponseReturn() {
        return new CreatePseudonymForListResponse.Return();
    }

    public AnonymisePseudonymsResponse createAnonymisePseudonymsResponse() {
        return new AnonymisePseudonymsResponse();
    }

    public AnonymisePseudonymsResponse.Return createAnonymisePseudonymsResponseReturn() {
        return new AnonymisePseudonymsResponse.Return();
    }

    public AnonymiseEntriesResponse createAnonymiseEntriesResponse() {
        return new AnonymiseEntriesResponse();
    }

    public AnonymiseEntriesResponse.Return createAnonymiseEntriesResponseReturn() {
        return new AnonymiseEntriesResponse.Return();
    }

    public AnonymiseAllEntriesForValuesResponse createAnonymiseAllEntriesForValuesResponse() {
        return new AnonymiseAllEntriesForValuesResponse();
    }

    public AnonymiseAllEntriesForValuesResponse.Return createAnonymiseAllEntriesForValuesResponseReturn() {
        return new AnonymiseAllEntriesForValuesResponse.Return();
    }

    public AnonymiseAllEntriesForValue createAnonymiseAllEntriesForValue() {
        return new AnonymiseAllEntriesForValue();
    }

    public AnonymiseAllEntriesForValueResponse createAnonymiseAllEntriesForValueResponse() {
        return new AnonymiseAllEntriesForValueResponse();
    }

    public AnonymiseAllEntriesForValues createAnonymiseAllEntriesForValues() {
        return new AnonymiseAllEntriesForValues();
    }

    /**
     * Create an instance of {@link AnonymiseEntries }
     *
     * @return the new instance of {@link AnonymiseEntries }
     */
    public AnonymiseEntries createAnonymiseEntries() {
        return new AnonymiseEntries();
    }

    /**
     * Create an instance of {@link AnonymiseEntry }
     *
     * @return the new instance of {@link AnonymiseEntry }
     */
    public AnonymiseEntry createAnonymiseEntry() {
        return new AnonymiseEntry();
    }

    /**
     * Create an instance of {@link AnonymiseEntryResponse }
     *
     * @return the new instance of {@link AnonymiseEntryResponse }
     */
    public AnonymiseEntryResponse createAnonymiseEntryResponse() {
        return new AnonymiseEntryResponse();
    }

    /**
     * Create an instance of {@link AnonymisePseudonym }
     *
     * @return the new instance of {@link AnonymisePseudonym }
     */
    public AnonymisePseudonym createAnonymisePseudonym() {
        return new AnonymisePseudonym();
    }

    /**
     * Create an instance of {@link AnonymisePseudonymResponse }
     *
     * @return the new instance of {@link AnonymisePseudonymResponse }
     */
    public AnonymisePseudonymResponse createAnonymisePseudonymResponse() {
        return new AnonymisePseudonymResponse();
    }

    /**
     * Create an instance of {@link AnonymisePseudonyms }
     *
     * @return the new instance of {@link AnonymisePseudonyms }
     */
    public AnonymisePseudonyms createAnonymisePseudonyms() {
        return new AnonymisePseudonyms();
    }

    /**
     * Create an instance of {@link CreatePseudonymFor }
     *
     * @return the new instance of {@link CreatePseudonymFor }
     */
    public CreatePseudonymFor createCreatePseudonymFor() {
        return new CreatePseudonymFor();
    }

    /**
     * Create an instance of {@link CreatePseudonymForList }
     *
     * @return the new instance of {@link CreatePseudonymForList }
     */
    public CreatePseudonymForList createCreatePseudonymForList() {
        return new CreatePseudonymForList();
    }

    /**
     * Create an instance of {@link CreatePseudonymForResponse }
     *
     * @return the new instance of {@link CreatePseudonymForResponse }
     */
    public CreatePseudonymForResponse createCreatePseudonymForResponse() {
        return new CreatePseudonymForResponse();
    }

    /**
     * Create an instance of {@link CreatePseudonymsFor }
     *
     * @return the new instance of {@link CreatePseudonymsFor }
     */
    public CreatePseudonymsFor createCreatePseudonymsFor() {
        return new CreatePseudonymsFor();
    }

    /**
     * Create an instance of {@link CreatePseudonymsForList }
     *
     * @return the new instance of {@link CreatePseudonymsForList }
     */
    public CreatePseudonymsForList createCreatePseudonymsForList() {
        return new CreatePseudonymsForList();
    }

    /**
     * Create an instance of {@link CreatePseudonymsForListResponse }
     *
     * @return the new instance of {@link CreatePseudonymsForListResponse }
     */
    public CreatePseudonymsForListResponse createCreatePseudonymsForListResponse() {
        return new CreatePseudonymsForListResponse();
    }

    /**
     * Create an instance of {@link DeleteAllEntriesForValue }
     *
     * @return the new instance of {@link DeleteAllEntriesForValue }
     */
    public DeleteAllEntriesForValue createDeleteAllEntriesForValue() {
        return new DeleteAllEntriesForValue();
    }

    /**
     * Create an instance of {@link DeleteAllEntriesForValueResponse }
     *
     * @return the new instance of {@link DeleteAllEntriesForValueResponse }
     */
    public DeleteAllEntriesForValueResponse createDeleteAllEntriesForValueResponse() {
        return new DeleteAllEntriesForValueResponse();
    }

    /**
     * Create an instance of {@link DeleteAllEntriesForValues }
     *
     * @return the new instance of {@link DeleteAllEntriesForValues }
     */
    public DeleteAllEntriesForValues createDeleteAllEntriesForValues() {
        return new DeleteAllEntriesForValues();
    }

    /**
     * Create an instance of {@link DeleteEntries }
     *
     * @return the new instance of {@link DeleteEntries }
     */
    public DeleteEntries createDeleteEntries() {
        return new DeleteEntries();
    }

    /**
     * Create an instance of {@link DeleteEntry }
     *
     * @return the new instance of {@link DeleteEntry }
     */
    public DeleteEntry createDeleteEntry() {
        return new DeleteEntry();
    }

    /**
     * Create an instance of {@link DeleteEntryResponse }
     *
     * @return the new instance of {@link DeleteEntryResponse }
     */
    public DeleteEntryResponse createDeleteEntryResponse() {
        return new DeleteEntryResponse();
    }

    /**
     * Create an instance of {@link DeletePseudonym }
     *
     * @return the new instance of {@link DeletePseudonym }
     */
    public DeletePseudonym createDeletePseudonym() {
        return new DeletePseudonym();
    }

    /**
     * Create an instance of {@link DeletePseudonymResponse }
     *
     * @return the new instance of {@link DeletePseudonymResponse }
     */
    public DeletePseudonymResponse createDeletePseudonymResponse() {
        return new DeletePseudonymResponse();
    }

    /**
     * Create an instance of {@link DeletePseudonyms }
     *
     * @return the new instance of {@link DeletePseudonyms }
     */
    public DeletePseudonyms createDeletePseudonyms() {
        return new DeletePseudonyms();
    }

    /**
     * Create an instance of {@link GetOrCreatePseudonymFor }
     *
     * @return the new instance of {@link GetOrCreatePseudonymFor }
     */
    public GetOrCreatePseudonymFor createGetOrCreatePseudonymFor() {
        return new GetOrCreatePseudonymFor();
    }

    /**
     * Create an instance of {@link GetOrCreatePseudonymForList }
     *
     * @return the new instance of {@link GetOrCreatePseudonymForList }
     */
    public GetOrCreatePseudonymForList createGetOrCreatePseudonymForList() {
        return new GetOrCreatePseudonymForList();
    }

    /**
     * Create an instance of {@link GetOrCreatePseudonymForResponse }
     *
     * @return the new instance of {@link GetOrCreatePseudonymForResponse }
     */
    public GetOrCreatePseudonymForResponse createGetOrCreatePseudonymForResponse() {
        return new GetOrCreatePseudonymForResponse();
    }

    /**
     * Create an instance of {@link GetOrCreatePseudonymsFor }
     *
     * @return the new instance of {@link GetOrCreatePseudonymsFor }
     */
    public GetOrCreatePseudonymsFor createGetOrCreatePseudonymsFor() {
        return new GetOrCreatePseudonymsFor();
    }

    /**
     * Create an instance of {@link GetOrCreatePseudonymsForList }
     *
     * @return the new instance of {@link GetOrCreatePseudonymsForList }
     */
    public GetOrCreatePseudonymsForList createGetOrCreatePseudonymsForList() {
        return new GetOrCreatePseudonymsForList();
    }

    /**
     * Create an instance of {@link GetOrCreatePseudonymsForListResponse }
     *
     * @return the new instance of {@link GetOrCreatePseudonymsForListResponse }
     */
    public GetOrCreatePseudonymsForListResponse createGetOrCreatePseudonymsForListResponse() {
        return new GetOrCreatePseudonymsForListResponse();
    }

    /**
     * Create an instance of {@link GetPSNNetFor }
     *
     * @return the new instance of {@link GetPSNNetFor }
     */
    public GetPSNNetFor createGetPSNNetFor() {
        return new GetPSNNetFor();
    }

    /**
     * Create an instance of {@link GetPSNNetForResponse }
     *
     * @return the new instance of {@link GetPSNNetForResponse }
     */
    public GetPSNNetForResponse createGetPSNNetForResponse() {
        return new GetPSNNetForResponse();
    }

    /**
     * Create an instance of {@link GetPSNTreeForPSN }
     *
     * @return the new instance of {@link GetPSNTreeForPSN }
     */
    public GetPSNTreeForPSN createGetPSNTreeForPSN() {
        return new GetPSNTreeForPSN();
    }

    /**
     * Create an instance of {@link GetPSNTreeForPSNResponse }
     *
     * @return the new instance of {@link GetPSNTreeForPSNResponse }
     */
    public GetPSNTreeForPSNResponse createGetPSNTreeForPSNResponse() {
        return new GetPSNTreeForPSNResponse();
    }

    /**
     * Create an instance of {@link GetPseudonymFor }
     *
     * @return the new instance of {@link GetPseudonymFor }
     */
    public GetPseudonymFor createGetPseudonymFor() {
        return new GetPseudonymFor();
    }

    /**
     * Create an instance of {@link GetPseudonymForList }
     *
     * @return the new instance of {@link GetPseudonymForList }
     */
    public GetPseudonymForList createGetPseudonymForList() {
        return new GetPseudonymForList();
    }

    /**
     * Create an instance of {@link GetPseudonymForResponse }
     *
     * @return the new instance of {@link GetPseudonymForResponse }
     */
    public GetPseudonymForResponse createGetPseudonymForResponse() {
        return new GetPseudonymForResponse();
    }

    /**
     * Create an instance of {@link GetPseudonymForValuePrefix }
     *
     * @return the new instance of {@link GetPseudonymForValuePrefix }
     */
    public GetPseudonymForValuePrefix createGetPseudonymForValuePrefix() {
        return new GetPseudonymForValuePrefix();
    }

    /**
     * Create an instance of {@link GetPseudonymsFor }
     *
     * @return the new instance of {@link GetPseudonymsFor }
     */
    public GetPseudonymsFor createGetPseudonymsFor() {
        return new GetPseudonymsFor();
    }

    /**
     * Create an instance of {@link GetPseudonymsForList }
     *
     * @return the new instance of {@link GetPseudonymsForList }
     */
    public GetPseudonymsForList createGetPseudonymsForList() {
        return new GetPseudonymsForList();
    }

    /**
     * Create an instance of {@link GetPseudonymsForListResponse }
     *
     * @return the new instance of {@link GetPseudonymsForListResponse }
     */
    public GetPseudonymsForListResponse createGetPseudonymsForListResponse() {
        return new GetPseudonymsForListResponse();
    }

    /**
     * Create an instance of {@link GetPseudonymsForValuePrefix }
     *
     * @return the new instance of {@link GetPseudonymsForValuePrefix }
     */
    public GetPseudonymsForValuePrefix createGetPseudonymsForValuePrefix() {
        return new GetPseudonymsForValuePrefix();
    }

    /**
     * Create an instance of {@link GetPseudonymsForValuePrefixResponse }
     *
     * @return the new instance of {@link GetPseudonymsForValuePrefixResponse }
     */
    public GetPseudonymsForValuePrefixResponse createGetPseudonymsForValuePrefixResponse() {
        return new GetPseudonymsForValuePrefixResponse();
    }

    /**
     * Create an instance of {@link GetValueFor }
     *
     * @return the new instance of {@link GetValueFor }
     */
    public GetValueFor createGetValueFor() {
        return new GetValueFor();
    }

    /**
     * Create an instance of {@link GetValueForList }
     *
     * @return the new instance of {@link GetValueForList }
     */
    public GetValueForList createGetValueForList() {
        return new GetValueForList();
    }

    /**
     * Create an instance of {@link GetValueForResponse }
     *
     * @return the new instance of {@link GetValueForResponse }
     */
    public GetValueForResponse createGetValueForResponse() {
        return new GetValueForResponse();
    }

    /**
     * Create an instance of {@link InsertPairExceptionDTO }
     *
     * @return the new instance of {@link InsertPairExceptionDTO }
     */
    public InsertPairExceptionDTO createInsertPairExceptionDTO() {
        return new InsertPairExceptionDTO();
    }

    /**
     * Create an instance of {@link InsertValuePseudonymPair }
     *
     * @return the new instance of {@link InsertValuePseudonymPair }
     */
    public InsertValuePseudonymPair createInsertValuePseudonymPair() {
        return new InsertValuePseudonymPair();
    }

    /**
     * Create an instance of {@link InsertValuePseudonymPairResponse }
     *
     * @return the new instance of {@link InsertValuePseudonymPairResponse }
     */
    public InsertValuePseudonymPairResponse createInsertValuePseudonymPairResponse() {
        return new InsertValuePseudonymPairResponse();
    }

    /**
     * Create an instance of {@link InsertValuePseudonymPairs }
     *
     * @return the new instance of {@link InsertValuePseudonymPairs }
     */
    public InsertValuePseudonymPairs createInsertValuePseudonymPairs() {
        return new InsertValuePseudonymPairs();
    }

    /**
     * Create an instance of {@link IsAnonym }
     *
     * @return the new instance of {@link IsAnonym }
     */
    public IsAnonym createIsAnonym() {
        return new IsAnonym();
    }

    /**
     * Create an instance of {@link IsAnonymResponse }
     *
     * @return the new instance of {@link IsAnonymResponse }
     */
    public IsAnonymResponse createIsAnonymResponse() {
        return new IsAnonymResponse();
    }

    /**
     * Create an instance of {@link IsAnonymised }
     *
     * @return the new instance of {@link IsAnonymised }
     */
    public IsAnonymised createIsAnonymised() {
        return new IsAnonymised();
    }

    /**
     * Create an instance of {@link IsAnonymisedResponse }
     *
     * @return the new instance of {@link IsAnonymisedResponse }
     */
    public IsAnonymisedResponse createIsAnonymisedResponse() {
        return new IsAnonymisedResponse();
    }

    /**
     * Create an instance of {@link PsnNetDTO }
     *
     * @return the new instance of {@link PsnNetDTO }
     */
    public PsnNetDTO createPsnNetDTO() {
        return new PsnNetDTO();
    }

    /**
     * Create an instance of {@link PsnNetNodeDTO }
     *
     * @return the new instance of {@link PsnNetNodeDTO }
     */
    public PsnNetNodeDTO createPsnNetNodeDTO() {
        return new PsnNetNodeDTO();
    }

    /**
     * Create an instance of {@link PsnTreeDTO }
     *
     * @return the new instance of {@link PsnTreeDTO }
     */
    public PsnTreeDTO createPsnTreeDTO() {
        return new PsnTreeDTO();
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
     * Create an instance of {@link ValidatePSN }
     *
     * @return the new instance of {@link ValidatePSN }
     */
    public ValidatePSN createValidatePSN() {
        return new ValidatePSN();
    }

    /**
     * Create an instance of {@link ValidatePSNResponse }
     *
     * @return the new instance of {@link ValidatePSNResponse }
     */
    public ValidatePSNResponse createValidatePSNResponse() {
        return new ValidatePSNResponse();
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
     * Create an instance of {@link UnknownDomainExceptionType }
     *
     * @return the new instance of {@link UnknownDomainExceptionType }
     */
    public UnknownDomainExceptionType createUnknownDomainExceptionType() {
        return new UnknownDomainExceptionType();
    }

    /**
     * Create an instance of {@link DeletionForbiddenException }
     *
     * @return the new instance of {@link DeletionForbiddenException }
     */
    public DeletionForbiddenException createDeletionForbiddenException() {
        return new DeletionForbiddenException();
    }

    /**
     * Create an instance of {@link UnknownValueExceptionType }
     *
     * @return the new instance of {@link UnknownValueExceptionType }
     */
    public UnknownValueExceptionType createUnknownValueExceptionType() {
        return new UnknownValueExceptionType();
    }

    /**
     * Create an instance of {@link PSNNotFoundExceptionType }
     *
     * @return the new instance of {@link PSNNotFoundExceptionType }
     */
    public PSNNotFoundExceptionType createPSNNotFoundExceptionType() {
        return new PSNNotFoundExceptionType();
    }

    /**
     * Create an instance of {@link InvalidPSNExceptionType }
     *
     * @return the new instance of {@link InvalidPSNExceptionType }
     */
    public InvalidPSNExceptionType createInvalidPSNExceptionType() {
        return new InvalidPSNExceptionType();
    }

    /**
     * Create an instance of {@link ValueIsAnonymisedException }
     *
     * @return the new instance of {@link ValueIsAnonymisedException }
     */
    public ValueIsAnonymisedException createValueIsAnonymisedException() {
        return new ValueIsAnonymisedException();
    }

    /**
     * Create an instance of {@link DomainIsFullException }
     *
     * @return the new instance of {@link DomainIsFullException }
     */
    public DomainIsFullException createDomainIsFullException() {
        return new DomainIsFullException();
    }

    /**
     * Create an instance of {@link DBExceptionType }
     *
     * @return the new instance of {@link DBExceptionType }
     */
    public DBExceptionType createDBExceptionType() {
        return new DBExceptionType();
    }

    /**
     * Create an instance of {@link InsertPairException }
     *
     * @return the new instance of {@link InsertPairException }
     */
    public InsertPairException createInsertPairException() {
        return new InsertPairException();
    }

    /**
     * Create an instance of {@link MultiPsnMap }
     *
     * @return the new instance of {@link MultiPsnMap }
     */
    public MultiPsnMap createMultiPsnMap() {
        return new MultiPsnMap();
    }

    /**
     * Create an instance of {@link MultiPsn }
     *
     * @return the new instance of {@link MultiPsn }
     */
    public MultiPsn createMultiPsn() {
        return new MultiPsn();
    }

    /**
     * Create an instance of {@link MultiPsnList }
     *
     * @return the new instance of {@link MultiPsnList }
     */
    public MultiPsnList createMultiPsnList() {
        return new MultiPsnList();
    }

    /**
     * Create an instance of {@link Psn }
     *
     * @return the new instance of {@link Psn }
     */
    public Psn createPsn() {
        return new Psn();
    }

    /**
     * Create an instance of {@link InsertValuePseudonymPairsResponse.Return }
     *
     * @return the new instance of {@link InsertValuePseudonymPairsResponse.Return }
     */
    public InsertValuePseudonymPairsResponse.Return createInsertValuePseudonymPairsResponseReturn() {
        return new InsertValuePseudonymPairsResponse.Return();
    }

    /**
     * Create an instance of {@link GetValueForListResponse.Return.Entry }
     *
     * @return the new instance of {@link GetValueForListResponse.Return.Entry }
     */
    public GetValueForListResponse.Return.Entry createGetValueForListResponseReturnEntry() {
        return new GetValueForListResponse.Return.Entry();
    }

    /**
     * Create an instance of {@link GetPseudonymsForResponse.Return }
     *
     * @return the new instance of {@link GetPseudonymsForResponse.Return }
     */
    public GetPseudonymsForResponse.Return createGetPseudonymsForResponseReturn() {
        return new GetPseudonymsForResponse.Return();
    }

    /**
     * Create an instance of {@link GetPseudonymForValuePrefixResponse.Return.Entry }
     *
     * @return the new instance of {@link GetPseudonymForValuePrefixResponse.Return.Entry }
     */
    public GetPseudonymForValuePrefixResponse.Return.Entry createGetPseudonymForValuePrefixResponseReturnEntry() {
        return new GetPseudonymForValuePrefixResponse.Return.Entry();
    }

    /**
     * Create an instance of {@link GetPseudonymForListResponse.Return.Entry }
     *
     * @return the new instance of {@link GetPseudonymForListResponse.Return.Entry }
     */
    public GetPseudonymForListResponse.Return.Entry createGetPseudonymForListResponseReturnEntry() {
        return new GetPseudonymForListResponse.Return.Entry();
    }

    /**
     * Create an instance of {@link GetOrCreatePseudonymsForResponse.Return }
     *
     * @return the new instance of {@link GetOrCreatePseudonymsForResponse.Return }
     */
    public GetOrCreatePseudonymsForResponse.Return createGetOrCreatePseudonymsForResponseReturn() {
        return new GetOrCreatePseudonymsForResponse.Return();
    }

    /**
     * Create an instance of {@link GetOrCreatePseudonymForListResponse.Return.Entry }
     *
     * @return the new instance of {@link GetOrCreatePseudonymForListResponse.Return.Entry }
     */
    public GetOrCreatePseudonymForListResponse.Return.Entry createGetOrCreatePseudonymForListResponseReturnEntry() {
        return new GetOrCreatePseudonymForListResponse.Return.Entry();
    }

    /**
     * Create an instance of {@link DeletePseudonymsResponse.Return.Entry }
     *
     * @return the new instance of {@link DeletePseudonymsResponse.Return.Entry }
     */
    public DeletePseudonymsResponse.Return.Entry createDeletePseudonymsResponseReturnEntry() {
        return new DeletePseudonymsResponse.Return.Entry();
    }

    /**
     * Create an instance of {@link DeleteEntriesResponse.Return.Entry }
     *
     * @return the new instance of {@link DeleteEntriesResponse.Return.Entry }
     */
    public DeleteEntriesResponse.Return.Entry createDeleteEntriesResponseReturnEntry() {
        return new DeleteEntriesResponse.Return.Entry();
    }

    /**
     * Create an instance of {@link DeleteAllEntriesForValuesResponse.Return.Entry }
     *
     * @return the new instance of {@link DeleteAllEntriesForValuesResponse.Return.Entry }
     */
    public DeleteAllEntriesForValuesResponse.Return.Entry createDeleteAllEntriesForValuesResponseReturnEntry() {
        return new DeleteAllEntriesForValuesResponse.Return.Entry();
    }

    /**
     * Create an instance of {@link CreatePseudonymsForResponse.Return }
     *
     * @return the new instance of {@link CreatePseudonymsForResponse.Return }
     */
    public CreatePseudonymsForResponse.Return createCreatePseudonymsForResponseReturn() {
        return new CreatePseudonymsForResponse.Return();
    }

    /**
     * Create an instance of {@link CreatePseudonymForListResponse.Return.Entry }
     *
     * @return the new instance of {@link CreatePseudonymForListResponse.Return.Entry }
     */
    public CreatePseudonymForListResponse.Return.Entry createCreatePseudonymForListResponseReturnEntry() {
        return new CreatePseudonymForListResponse.Return.Entry();
    }

    /**
     * Create an instance of {@link AnonymisePseudonymsResponse.Return.Entry }
     *
     * @return the new instance of {@link AnonymisePseudonymsResponse.Return.Entry }
     */
    public AnonymisePseudonymsResponse.Return.Entry createAnonymisePseudonymsResponseReturnEntry() {
        return new AnonymisePseudonymsResponse.Return.Entry();
    }

    /**
     * Create an instance of {@link AnonymiseEntriesResponse.Return.Entry }
     *
     * @return the new instance of {@link AnonymiseEntriesResponse.Return.Entry }
     */
    public AnonymiseEntriesResponse.Return.Entry createAnonymiseEntriesResponseReturnEntry() {
        return new AnonymiseEntriesResponse.Return.Entry();
    }

    /**
     * Create an instance of {@link AnonymiseAllEntriesForValuesResponse.Return.Entry }
     *
     * @return the new instance of {@link AnonymiseAllEntriesForValuesResponse.Return.Entry }
     */
    public AnonymiseAllEntriesForValuesResponse.Return.Entry createAnonymiseAllEntriesForValuesResponseReturnEntry() {
        return new AnonymiseAllEntriesForValuesResponse.Return.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnonymiseAllEntriesForValue }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AnonymiseAllEntriesForValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "anonymiseAllEntriesForValue")
    public JAXBElement<AnonymiseAllEntriesForValue> createAnonymiseAllEntriesForValue(AnonymiseAllEntriesForValue value) {
        return new JAXBElement<>(ANONYMISE_ALL_ENTRIES_FOR_VALUE_QNAME, AnonymiseAllEntriesForValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnonymiseAllEntriesForValueResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AnonymiseAllEntriesForValueResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "anonymiseAllEntriesForValueResponse")
    public JAXBElement<AnonymiseAllEntriesForValueResponse> createAnonymiseAllEntriesForValueResponse(
            AnonymiseAllEntriesForValueResponse value) {
        return new JAXBElement<>(ANONYMISE_ALL_ENTRIES_FOR_VALUE_RESPONSE_QNAME, AnonymiseAllEntriesForValueResponse.class, null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnonymiseAllEntriesForValues }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AnonymiseAllEntriesForValues }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "anonymiseAllEntriesForValues")
    public JAXBElement<AnonymiseAllEntriesForValues> createAnonymiseAllEntriesForValues(AnonymiseAllEntriesForValues value) {
        return new JAXBElement<>(ANONYMISE_ALL_ENTRIES_FOR_VALUES_QNAME, AnonymiseAllEntriesForValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnonymiseAllEntriesForValuesResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AnonymiseAllEntriesForValuesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "anonymiseAllEntriesForValuesResponse")
    public JAXBElement<AnonymiseAllEntriesForValuesResponse> createAnonymiseAllEntriesForValuesResponse(
            AnonymiseAllEntriesForValuesResponse value) {
        return new JAXBElement<>(ANONYMISE_ALL_ENTRIES_FOR_VALUES_RESPONSE_QNAME, AnonymiseAllEntriesForValuesResponse.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnonymiseEntries }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AnonymiseEntries }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "anonymiseEntries")
    public JAXBElement<AnonymiseEntries> createAnonymiseEntries(AnonymiseEntries value) {
        return new JAXBElement<>(ANONYMISE_ENTRIES_QNAME, AnonymiseEntries.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnonymiseEntriesResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AnonymiseEntriesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "anonymiseEntriesResponse")
    public JAXBElement<AnonymiseEntriesResponse> createAnonymiseEntriesResponse(AnonymiseEntriesResponse value) {
        return new JAXBElement<>(ANONYMISE_ENTRIES_RESPONSE_QNAME, AnonymiseEntriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnonymiseEntry }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AnonymiseEntry }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "anonymiseEntry")
    public JAXBElement<AnonymiseEntry> createAnonymiseEntry(AnonymiseEntry value) {
        return new JAXBElement<>(ANONYMISE_ENTRY_QNAME, AnonymiseEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnonymiseEntryResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AnonymiseEntryResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "anonymiseEntryResponse")
    public JAXBElement<AnonymiseEntryResponse> createAnonymiseEntryResponse(AnonymiseEntryResponse value) {
        return new JAXBElement<>(ANONYMISE_ENTRY_RESPONSE_QNAME, AnonymiseEntryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnonymisePseudonym }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AnonymisePseudonym }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "anonymisePseudonym")
    public JAXBElement<AnonymisePseudonym> createAnonymisePseudonym(AnonymisePseudonym value) {
        return new JAXBElement<>(ANONYMISE_PSEUDONYM_QNAME, AnonymisePseudonym.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnonymisePseudonymResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AnonymisePseudonymResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "anonymisePseudonymResponse")
    public JAXBElement<AnonymisePseudonymResponse> createAnonymisePseudonymResponse(AnonymisePseudonymResponse value) {
        return new JAXBElement<>(ANONYMISE_PSEUDONYM_RESPONSE_QNAME, AnonymisePseudonymResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnonymisePseudonyms }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AnonymisePseudonyms }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "anonymisePseudonyms")
    public JAXBElement<AnonymisePseudonyms> createAnonymisePseudonyms(AnonymisePseudonyms value) {
        return new JAXBElement<>(ANONYMISE_PSEUDONYMS_QNAME, AnonymisePseudonyms.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnonymisePseudonymsResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AnonymisePseudonymsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "anonymisePseudonymsResponse")
    public JAXBElement<AnonymisePseudonymsResponse> createAnonymisePseudonymsResponse(AnonymisePseudonymsResponse value) {
        return new JAXBElement<>(ANONYMISE_PSEUDONYMS_RESPONSE_QNAME, AnonymisePseudonymsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePseudonymFor }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link CreatePseudonymFor }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "createPseudonymFor")
    public JAXBElement<CreatePseudonymFor> createCreatePseudonymFor(CreatePseudonymFor value) {
        return new JAXBElement<>(CREATE_PSEUDONYM_FOR_QNAME, CreatePseudonymFor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePseudonymForList }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link CreatePseudonymForList }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "createPseudonymForList")
    public JAXBElement<CreatePseudonymForList> createCreatePseudonymForList(CreatePseudonymForList value) {
        return new JAXBElement<>(CREATE_PSEUDONYM_FOR_LIST_QNAME, CreatePseudonymForList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePseudonymForListResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link CreatePseudonymForListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "createPseudonymForListResponse")
    public JAXBElement<CreatePseudonymForListResponse> createCreatePseudonymForListResponse(
            CreatePseudonymForListResponse value) {
        return new JAXBElement<>(CREATE_PSEUDONYM_FOR_LIST_RESPONSE_QNAME, CreatePseudonymForListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePseudonymForResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link CreatePseudonymForResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "createPseudonymForResponse")
    public JAXBElement<CreatePseudonymForResponse> createCreatePseudonymForResponse(CreatePseudonymForResponse value) {
        return new JAXBElement<>(CREATE_PSEUDONYM_FOR_RESPONSE_QNAME, CreatePseudonymForResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePseudonymsFor }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link CreatePseudonymsFor }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "createPseudonymsFor")
    public JAXBElement<CreatePseudonymsFor> createCreatePseudonymsFor(CreatePseudonymsFor value) {
        return new JAXBElement<>(CREATE_PSEUDONYMS_FOR_QNAME, CreatePseudonymsFor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePseudonymsForList }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link CreatePseudonymsForList }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "createPseudonymsForList")
    public JAXBElement<CreatePseudonymsForList> createCreatePseudonymsForList(CreatePseudonymsForList value) {
        return new JAXBElement<>(CREATE_PSEUDONYMS_FOR_LIST_QNAME, CreatePseudonymsForList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePseudonymsForListResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link CreatePseudonymsForListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "createPseudonymsForListResponse")
    public JAXBElement<CreatePseudonymsForListResponse> createCreatePseudonymsForListResponse(
            CreatePseudonymsForListResponse value) {
        return new JAXBElement<>(CREATE_PSEUDONYMS_FOR_LIST_RESPONSE_QNAME, CreatePseudonymsForListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePseudonymsForResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link CreatePseudonymsForResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "createPseudonymsForResponse")
    public JAXBElement<CreatePseudonymsForResponse> createCreatePseudonymsForResponse(CreatePseudonymsForResponse value) {
        return new JAXBElement<>(CREATE_PSEUDONYMS_FOR_RESPONSE_QNAME, CreatePseudonymsForResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAllEntriesForValue }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DeleteAllEntriesForValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "deleteAllEntriesForValue")
    public JAXBElement<DeleteAllEntriesForValue> createDeleteAllEntriesForValue(DeleteAllEntriesForValue value) {
        return new JAXBElement<>(DELETE_ALL_ENTRIES_FOR_VALUE_QNAME, DeleteAllEntriesForValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAllEntriesForValueResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DeleteAllEntriesForValueResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "deleteAllEntriesForValueResponse")
    public JAXBElement<DeleteAllEntriesForValueResponse> createDeleteAllEntriesForValueResponse(
            DeleteAllEntriesForValueResponse value) {
        return new JAXBElement<>(DELETE_ALL_ENTRIES_FOR_VALUE_RESPONSE_QNAME, DeleteAllEntriesForValueResponse.class, null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAllEntriesForValues }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DeleteAllEntriesForValues }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "deleteAllEntriesForValues")
    public JAXBElement<DeleteAllEntriesForValues> createDeleteAllEntriesForValues(DeleteAllEntriesForValues value) {
        return new JAXBElement<>(DELETE_ALL_ENTRIES_FOR_VALUES_QNAME, DeleteAllEntriesForValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAllEntriesForValuesResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DeleteAllEntriesForValuesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "deleteAllEntriesForValuesResponse")
    public JAXBElement<DeleteAllEntriesForValuesResponse> createDeleteAllEntriesForValuesResponse(
            DeleteAllEntriesForValuesResponse value) {
        return new JAXBElement<>(DELETE_ALL_ENTRIES_FOR_VALUES_RESPONSE_QNAME, DeleteAllEntriesForValuesResponse.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEntries }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DeleteEntries }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "deleteEntries")
    public JAXBElement<DeleteEntries> createDeleteEntries(DeleteEntries value) {
        return new JAXBElement<>(DELETE_ENTRIES_QNAME, DeleteEntries.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEntriesResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DeleteEntriesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "deleteEntriesResponse")
    public JAXBElement<DeleteEntriesResponse> createDeleteEntriesResponse(DeleteEntriesResponse value) {
        return new JAXBElement<>(DELETE_ENTRIES_RESPONSE_QNAME, DeleteEntriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEntry }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DeleteEntry }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "deleteEntry")
    public JAXBElement<DeleteEntry> createDeleteEntry(DeleteEntry value) {
        return new JAXBElement<>(DELETE_ENTRY_QNAME, DeleteEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEntryResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DeleteEntryResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "deleteEntryResponse")
    public JAXBElement<DeleteEntryResponse> createDeleteEntryResponse(DeleteEntryResponse value) {
        return new JAXBElement<>(DELETE_ENTRY_RESPONSE_QNAME, DeleteEntryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePseudonym }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DeletePseudonym }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "deletePseudonym")
    public JAXBElement<DeletePseudonym> createDeletePseudonym(DeletePseudonym value) {
        return new JAXBElement<>(DELETE_PSEUDONYM_QNAME, DeletePseudonym.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePseudonymResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DeletePseudonymResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "deletePseudonymResponse")
    public JAXBElement<DeletePseudonymResponse> createDeletePseudonymResponse(DeletePseudonymResponse value) {
        return new JAXBElement<>(DELETE_PSEUDONYM_RESPONSE_QNAME, DeletePseudonymResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePseudonyms }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DeletePseudonyms }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "deletePseudonyms")
    public JAXBElement<DeletePseudonyms> createDeletePseudonyms(DeletePseudonyms value) {
        return new JAXBElement<>(DELETE_PSEUDONYMS_QNAME, DeletePseudonyms.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePseudonymsResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DeletePseudonymsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "deletePseudonymsResponse")
    public JAXBElement<DeletePseudonymsResponse> createDeletePseudonymsResponse(DeletePseudonymsResponse value) {
        return new JAXBElement<>(DELETE_PSEUDONYMS_RESPONSE_QNAME, DeletePseudonymsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrCreatePseudonymFor }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetOrCreatePseudonymFor }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "getOrCreatePseudonymFor")
    public JAXBElement<GetOrCreatePseudonymFor> createGetOrCreatePseudonymFor(GetOrCreatePseudonymFor value) {
        return new JAXBElement<>(GET_OR_CREATE_PSEUDONYM_FOR_QNAME, GetOrCreatePseudonymFor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrCreatePseudonymForList }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetOrCreatePseudonymForList }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "getOrCreatePseudonymForList")
    public JAXBElement<GetOrCreatePseudonymForList> createGetOrCreatePseudonymForList(GetOrCreatePseudonymForList value) {
        return new JAXBElement<>(GET_OR_CREATE_PSEUDONYM_FOR_LIST_QNAME, GetOrCreatePseudonymForList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrCreatePseudonymForListResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetOrCreatePseudonymForListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "getOrCreatePseudonymForListResponse")
    public JAXBElement<GetOrCreatePseudonymForListResponse> createGetOrCreatePseudonymForListResponse(
            GetOrCreatePseudonymForListResponse value) {
        return new JAXBElement<>(GET_OR_CREATE_PSEUDONYM_FOR_LIST_RESPONSE_QNAME, GetOrCreatePseudonymForListResponse.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrCreatePseudonymForResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetOrCreatePseudonymForResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "getOrCreatePseudonymForResponse")
    public JAXBElement<GetOrCreatePseudonymForResponse> createGetOrCreatePseudonymForResponse(
            GetOrCreatePseudonymForResponse value) {
        return new JAXBElement<>(GET_OR_CREATE_PSEUDONYM_FOR_RESPONSE_QNAME, GetOrCreatePseudonymForResponse.class,
                null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrCreatePseudonymsFor }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetOrCreatePseudonymsFor }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "getOrCreatePseudonymsFor")
    public JAXBElement<GetOrCreatePseudonymsFor> createGetOrCreatePseudonymsFor(GetOrCreatePseudonymsFor value) {
        return new JAXBElement<>(GET_OR_CREATE_PSEUDONYMS_FOR_QNAME, GetOrCreatePseudonymsFor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrCreatePseudonymsForList }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetOrCreatePseudonymsForList }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "getOrCreatePseudonymsForList")
    public JAXBElement<GetOrCreatePseudonymsForList> createGetOrCreatePseudonymsForList(GetOrCreatePseudonymsForList value) {
        return new JAXBElement<>(GET_OR_CREATE_PSEUDONYMS_FOR_LIST_QNAME, GetOrCreatePseudonymsForList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrCreatePseudonymsForListResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetOrCreatePseudonymsForListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "getOrCreatePseudonymsForListResponse")
    public JAXBElement<GetOrCreatePseudonymsForListResponse> createGetOrCreatePseudonymsForListResponse(
            GetOrCreatePseudonymsForListResponse value) {
        return new JAXBElement<>(GET_OR_CREATE_PSEUDONYMS_FOR_LIST_RESPONSE_QNAME, GetOrCreatePseudonymsForListResponse.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrCreatePseudonymsForResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetOrCreatePseudonymsForResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "getOrCreatePseudonymsForResponse")
    public JAXBElement<GetOrCreatePseudonymsForResponse> createGetOrCreatePseudonymsForResponse(
            GetOrCreatePseudonymsForResponse value) {
        return new JAXBElement<>(GET_OR_CREATE_PSEUDONYMS_FOR_RESPONSE_QNAME, GetOrCreatePseudonymsForResponse.class, null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPSNNetFor }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetPSNNetFor }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "getPSNNetFor")
    public JAXBElement<GetPSNNetFor> createGetPSNNetFor(GetPSNNetFor value) {
        return new JAXBElement<>(GET_PSN_NET_FOR_QNAME, GetPSNNetFor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPSNNetForResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetPSNNetForResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "getPSNNetForResponse")
    public JAXBElement<GetPSNNetForResponse> createGetPSNNetForResponse(GetPSNNetForResponse value) {
        return new JAXBElement<>(GET_PSN_NET_FOR_RESPONSE_QNAME, GetPSNNetForResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPSNTreeForPSN }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetPSNTreeForPSN }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "getPSNTreeForPSN")
    public JAXBElement<GetPSNTreeForPSN> createGetPSNTreeForPSN(GetPSNTreeForPSN value) {
        return new JAXBElement<>(GET_PSN_TREE_FOR_PSN_QNAME, GetPSNTreeForPSN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPSNTreeForPSNResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetPSNTreeForPSNResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "getPSNTreeForPSNResponse")
    public JAXBElement<GetPSNTreeForPSNResponse> createGetPSNTreeForPSNResponse(GetPSNTreeForPSNResponse value) {
        return new JAXBElement<>(GET_PSN_TREE_FOR_PSN_RESPONSE_QNAME, GetPSNTreeForPSNResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPseudonymFor }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetPseudonymFor }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "getPseudonymFor")
    public JAXBElement<GetPseudonymFor> createGetPseudonymFor(GetPseudonymFor value) {
        return new JAXBElement<>(GET_PSEUDONYM_FOR_QNAME, GetPseudonymFor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPseudonymForList }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetPseudonymForList }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "getPseudonymForList")
    public JAXBElement<GetPseudonymForList> createGetPseudonymForList(GetPseudonymForList value) {
        return new JAXBElement<>(GET_PSEUDONYM_FOR_LIST_QNAME, GetPseudonymForList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPseudonymForListResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetPseudonymForListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "getPseudonymForListResponse")
    public JAXBElement<GetPseudonymForListResponse> createGetPseudonymForListResponse(GetPseudonymForListResponse value) {
        return new JAXBElement<>(GET_PSEUDONYM_FOR_LIST_RESPONSE_QNAME, GetPseudonymForListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPseudonymForResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetPseudonymForResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "getPseudonymForResponse")
    public JAXBElement<GetPseudonymForResponse> createGetPseudonymForResponse(GetPseudonymForResponse value) {
        return new JAXBElement<>(GET_PSEUDONYM_FOR_RESPONSE_QNAME, GetPseudonymForResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPseudonymForValuePrefix }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetPseudonymForValuePrefix }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "getPseudonymForValuePrefix")
    public JAXBElement<GetPseudonymForValuePrefix> createGetPseudonymForValuePrefix(GetPseudonymForValuePrefix value) {
        return new JAXBElement<>(GET_PSEUDONYM_FOR_VALUE_PREFIX_QNAME, GetPseudonymForValuePrefix.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPseudonymForValuePrefixResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetPseudonymForValuePrefixResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "getPseudonymForValuePrefixResponse")
    public JAXBElement<GetPseudonymForValuePrefixResponse> createGetPseudonymForValuePrefixResponse(
            GetPseudonymForValuePrefixResponse value) {
        return new JAXBElement<>(GET_PSEUDONYM_FOR_VALUE_PREFIX_RESPONSE_QNAME, GetPseudonymForValuePrefixResponse.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPseudonymsFor }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetPseudonymsFor }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "getPseudonymsFor")
    public JAXBElement<GetPseudonymsFor> createGetPseudonymsFor(GetPseudonymsFor value) {
        return new JAXBElement<>(GET_PSEUDONYMS_FOR_QNAME, GetPseudonymsFor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPseudonymsForList }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetPseudonymsForList }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "getPseudonymsForList")
    public JAXBElement<GetPseudonymsForList> createGetPseudonymsForList(GetPseudonymsForList value) {
        return new JAXBElement<>(GET_PSEUDONYMS_FOR_LIST_QNAME, GetPseudonymsForList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPseudonymsForListResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetPseudonymsForListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "getPseudonymsForListResponse")
    public JAXBElement<GetPseudonymsForListResponse> createGetPseudonymsForListResponse(GetPseudonymsForListResponse value) {
        return new JAXBElement<>(GET_PSEUDONYMS_FOR_LIST_RESPONSE_QNAME, GetPseudonymsForListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPseudonymsForResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetPseudonymsForResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "getPseudonymsForResponse")
    public JAXBElement<GetPseudonymsForResponse> createGetPseudonymsForResponse(GetPseudonymsForResponse value) {
        return new JAXBElement<>(GET_PSEUDONYMS_FOR_RESPONSE_QNAME, GetPseudonymsForResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPseudonymsForValuePrefix }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetPseudonymsForValuePrefix }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "getPseudonymsForValuePrefix")
    public JAXBElement<GetPseudonymsForValuePrefix> createGetPseudonymsForValuePrefix(GetPseudonymsForValuePrefix value) {
        return new JAXBElement<>(GET_PSEUDONYMS_FOR_VALUE_PREFIX_QNAME, GetPseudonymsForValuePrefix.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPseudonymsForValuePrefixResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetPseudonymsForValuePrefixResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "getPseudonymsForValuePrefixResponse")
    public JAXBElement<GetPseudonymsForValuePrefixResponse> createGetPseudonymsForValuePrefixResponse(
            GetPseudonymsForValuePrefixResponse value) {
        return new JAXBElement<>(GET_PSEUDONYMS_FOR_VALUE_PREFIX_RESPONSE_QNAME, GetPseudonymsForValuePrefixResponse.class,
                null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetValueFor }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetValueFor }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "getValueFor")
    public JAXBElement<GetValueFor> createGetValueFor(GetValueFor value) {
        return new JAXBElement<>(GET_VALUE_FOR_QNAME, GetValueFor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetValueForList }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetValueForList }{@code >}
     */
    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "getValueForList")
    public JAXBElement<GetValueForList> createGetValueForList(GetValueForList value) {
        return new JAXBElement<>(GET_VALUE_FOR_LIST_QNAME, GetValueForList.class, null, value);
    }

    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "getValueForListResponse")
    public JAXBElement<GetValueForListResponse> createGetValueForListResponse(GetValueForListResponse value) {
        return new JAXBElement<>(GET_VALUE_FOR_LIST_RESPONSE_QNAME, GetValueForListResponse.class, null, value);
    }

    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "getValueForResponse")
    public JAXBElement<GetValueForResponse> createGetValueForResponse(GetValueForResponse value) {
        return new JAXBElement<>(GET_VALUE_FOR_RESPONSE_QNAME, GetValueForResponse.class, null, value);
    }

    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "insertPairExceptionDTO")
    public JAXBElement<InsertPairExceptionDTO> createInsertPairExceptionDTO(InsertPairExceptionDTO value) {
        return new JAXBElement<>(INSERT_PAIR_EXCEPTION_DTO_QNAME, InsertPairExceptionDTO.class, null, value);
    }

    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "insertValuePseudonymPair")
    public JAXBElement<InsertValuePseudonymPair> createInsertValuePseudonymPair(InsertValuePseudonymPair value) {
        return new JAXBElement<>(INSERT_VALUE_PSEUDONYM_PAIR_QNAME, InsertValuePseudonymPair.class, null, value);
    }

    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "insertValuePseudonymPairResponse")
    public JAXBElement<InsertValuePseudonymPairResponse> createInsertValuePseudonymPairResponse(
            InsertValuePseudonymPairResponse value) {
        return new JAXBElement<>(INSERT_VALUE_PSEUDONYM_PAIR_RESPONSE_QNAME, InsertValuePseudonymPairResponse.class,
                null, value);
    }

    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "insertValuePseudonymPairs")
    public JAXBElement<InsertValuePseudonymPairs> createInsertValuePseudonymPairs(InsertValuePseudonymPairs value) {
        return new JAXBElement<>(INSERT_VALUE_PSEUDONYM_PAIRS_QNAME, InsertValuePseudonymPairs.class, null, value);
    }

    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "insertValuePseudonymPairsResponse")
    public JAXBElement<InsertValuePseudonymPairsResponse> createInsertValuePseudonymPairsResponse(
            InsertValuePseudonymPairsResponse value) {
        return new JAXBElement<>(INSERT_VALUE_PSEUDONYM_PAIRS_RESPONSE_QNAME, InsertValuePseudonymPairsResponse.class, null,
                value);
    }

    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "isAnonym")
    public JAXBElement<IsAnonym> createIsAnonym(IsAnonym value) {
        return new JAXBElement<>(IS_ANONYM_QNAME, IsAnonym.class, null, value);
    }

    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "isAnonymResponse")
    public JAXBElement<IsAnonymResponse> createIsAnonymResponse(IsAnonymResponse value) {
        return new JAXBElement<>(IS_ANONYM_RESPONSE_QNAME, IsAnonymResponse.class, null, value);
    }

    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "isAnonymised")
    public JAXBElement<IsAnonymised> createIsAnonymised(IsAnonymised value) {
        return new JAXBElement<>(IS_ANONYMISED_QNAME, IsAnonymised.class, null, value);
    }

    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "isAnonymisedResponse")
    public JAXBElement<IsAnonymisedResponse> createIsAnonymisedResponse(IsAnonymisedResponse value) {
        return new JAXBElement<>(IS_ANONYMISED_RESPONSE_QNAME, IsAnonymisedResponse.class, null, value);
    }

    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "psnNetDTO")
    public JAXBElement<PsnNetDTO> createPsnNetDTO(PsnNetDTO value) {
        return new JAXBElement<>(PSN_NET_DTO_QNAME, PsnNetDTO.class, null, value);
    }

    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "psnNetNodeDTO")
    public JAXBElement<PsnNetNodeDTO> createPsnNetNodeDTO(PsnNetNodeDTO value) {
        return new JAXBElement<>(PSN_NET_NODE_DTO_QNAME, PsnNetNodeDTO.class, null, value);
    }

    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "psnTreeDTO")
    public JAXBElement<PsnTreeDTO> createPsnTreeDTO(PsnTreeDTO value) {
        return new JAXBElement<>(PSN_TREE_DTO_QNAME, PsnTreeDTO.class, null, value);
    }

    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "psndto")
    public JAXBElement<Psndto> createPsndto(Psndto value) {
        return new JAXBElement<>(PSNDTO_QNAME, Psndto.class,
                null, value);
    }

    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "validatePSN")
    public JAXBElement<ValidatePSN> createValidatePSN(ValidatePSN value) {
        return new JAXBElement<>(VALIDATE_PSN_QNAME, ValidatePSN.class, null, value);
    }

    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "validatePSNResponse")
    public JAXBElement<ValidatePSNResponse> createValidatePSNResponse(ValidatePSNResponse value) {
        return new JAXBElement<>(VALIDATE_PSN_RESPONSE_QNAME, ValidatePSNResponse.class, null, value);
    }

    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "InvalidParameterException")
    public JAXBElement<InvalidParameterException> createInvalidParameterException(InvalidParameterException value) {
        return new JAXBElement<>(INVALID_PARAMETER_EXCEPTION_QNAME, InvalidParameterException.class, null, value);
    }

    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "UnknownDomainException")
    public JAXBElement<UnknownDomainExceptionType> createUnknownDomainException(UnknownDomainExceptionType value) {
        return new JAXBElement<>(UNKNOWN_DOMAIN_EXCEPTION_QNAME, UnknownDomainExceptionType.class, null, value);
    }

    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "DeletionForbiddenException")
    public JAXBElement<DeletionForbiddenException> createDeletionForbiddenException(DeletionForbiddenException value) {
        return new JAXBElement<>(DELETION_FORBIDDEN_EXCEPTION_QNAME, DeletionForbiddenException.class, null, value);
    }

    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "UnknownValueException")
    public JAXBElement<UnknownValueExceptionType> createUnknownValueException(UnknownValueExceptionType value) {
        return new JAXBElement<>(UNKNOWN_VALUE_EXCEPTION_QNAME, UnknownValueExceptionType.class, null, value);
    }

    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "PSNNotFoundException")
    public JAXBElement<PSNNotFoundExceptionType> createPSNNotFoundException(PSNNotFoundExceptionType value) {
        return new JAXBElement<>(PSN_NOT_FOUND_EXCEPTION_QNAME, PSNNotFoundExceptionType.class, null, value);
    }

    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "InvalidPSNException")
    public JAXBElement<InvalidPSNExceptionType> createInvalidPSNException(InvalidPSNExceptionType value) {
        return new JAXBElement<>(INVALID_PSN_EXCEPTION_QNAME, InvalidPSNExceptionType.class, null, value);
    }

    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "ValueIsAnonymisedException")
    public JAXBElement<ValueIsAnonymisedException> createValueIsAnonymisedException(ValueIsAnonymisedException value) {
        return new JAXBElement<>(VALUE_IS_ANONYMISED_EXCEPTION_QNAME, ValueIsAnonymisedException.class, null, value);
    }

    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "DomainIsFullException")
    public JAXBElement<DomainIsFullException> createDomainIsFullException(DomainIsFullException value) {
        return new JAXBElement<>(DOMAIN_IS_FULL_EXCEPTION_QNAME, DomainIsFullException.class, null, value);
    }

    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "DBException")
    public JAXBElement<DBExceptionType> createDBException(DBExceptionType value) {
        return new JAXBElement<>(DB_EXCEPTION_QNAME, DBExceptionType.class, null, value);
    }

    @XmlElementDecl(namespace = "http://psn.ttp.ganimed.icmvc.emau.org/", name = "InsertPairException")
    public JAXBElement<InsertPairException> createInsertPairException(InsertPairException value) {
        return new JAXBElement<>(INSERT_PAIR_EXCEPTION_QNAME, InsertPairException.class, null, value);
    }

    @XmlElementDecl(namespace = "", name = "return", scope = InsertValuePseudonymPairsResponse.class)
    public JAXBElement<InsertValuePseudonymPairsResponse.Return> createInsertValuePseudonymPairsResponseReturn(
            InsertValuePseudonymPairsResponse.Return value) {
        return new JAXBElement<>(INSERT_VALUE_PSEUDONYM_PAIRS_RESPONSE_RETURN_QNAME,
                InsertValuePseudonymPairsResponse.Return.class,
                InsertValuePseudonymPairsResponse.class, value);
    }

    @XmlElementDecl(namespace = "", name = "return", scope = GetPseudonymsForResponse.class)
    public JAXBElement<GetPseudonymsForResponse.Return> createGetPseudonymsForResponseReturn(
            GetPseudonymsForResponse.Return value) {
        return new JAXBElement<>(INSERT_VALUE_PSEUDONYM_PAIRS_RESPONSE_RETURN_QNAME, GetPseudonymsForResponse.Return.class,
                GetPseudonymsForResponse.class, value);
    }

    @XmlElementDecl(namespace = "", name = "return", scope = GetOrCreatePseudonymsForResponse.class)
    public JAXBElement<GetOrCreatePseudonymsForResponse.Return> createGetOrCreatePseudonymsForResponseReturn(
            GetOrCreatePseudonymsForResponse.Return value) {
        return new JAXBElement<>(INSERT_VALUE_PSEUDONYM_PAIRS_RESPONSE_RETURN_QNAME,
                GetOrCreatePseudonymsForResponse.Return.class,
                GetOrCreatePseudonymsForResponse.class, value);
    }

    @XmlElementDecl(namespace = "", name = "return", scope = CreatePseudonymsForResponse.class)
    public JAXBElement<CreatePseudonymsForResponse.Return> createCreatePseudonymsForResponseReturn(
            CreatePseudonymsForResponse.Return value) {
        return new JAXBElement<>(INSERT_VALUE_PSEUDONYM_PAIRS_RESPONSE_RETURN_QNAME, CreatePseudonymsForResponse.Return.class,
                CreatePseudonymsForResponse.class, value);
    }

}
