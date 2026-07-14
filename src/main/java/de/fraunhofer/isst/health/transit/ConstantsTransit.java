package de.fraunhofer.isst.health.transit;

public interface ConstantsTransit
{
	String PROCESS_TRANSIT_NAME_BASE = "datamanagementuniteu_";

	String PROCESS_NAME_TRANSIT = "transit";

	String PROCESS_NAME_TRANSIT_TRIGGER = "transitTrigger";

	String PROCESS_NAME_FULL_TRANSIT = PROCESS_TRANSIT_NAME_BASE + PROCESS_NAME_TRANSIT;

	String PROCESS_NAME_FULL_TRANSIT_TRIGGER = PROCESS_TRANSIT_NAME_BASE + PROCESS_NAME_TRANSIT_TRIGGER;

	String EXTENSION_URL_DIC_IDENTIFIER = "http://medizininformatik-initiative.de/fhir/StructureDefinition/extension-dic-identifier";
	String EXTENSION_LIST_ENTRY_MIMETYPE = "http://medizininformatik-initiative.de/fhir/StructureDefinition/extension-list-entry-item-mimetype";

	String BPMN_EXECUTION_VARIABLE_PROJECT_IDENTIFIER = "projectIdentifier";
	String BPMN_EXECUTION_VARIABLE_CONTRACT_URL = "contractUrl";
	String BPMN_EXECUTION_VARIABLE_RESEARCHER_IDENTIFIERS = "researcherIdentifiers";


	String BPMN_EXECUTION_VARIABLE_DATA_SHARING_MERGE_RECEIVE_ERROR_MESSAGE = "mergeReceiveDataSharingErrorMessage";
	String BPMN_EXECUTION_VARIABLE_DATA_SHARING_MERGE_RELEASE_ERROR_MESSAGE = "mergeReleaseDataSharingErrorMessage";

	String NAMINGSYSTEM_RESEARCHER_IDENTIFIER = "http://medizininformatik-initiative.de/sid/researcher-identifier";

	String CODESYSTEM_DATA_SHARING = "http://medizininformatik-initiative.de/fhir/CodeSystem/data-sharing";
	String CODESYSTEM_DATA_SHARING_VALUE_RESEARCHER_IDENTIFIER = "researcher-identifier";
	String CODESYSTEM_DATA_SHARING_VALUE_DIC_IDENTIFIER = "dic-identifier";
	String CODESYSTEM_DATA_SHARING_VALUE_DIC_CORRELATION_KEY = "dic-correlation-key";
	String CODESYSTEM_DATA_SHARING_VALUE_PROJECT_IDENTIFIER = "project-identifier";
	String CODESYSTEM_DATA_SHARING_VALUE_CONTRACT_URL = "contract-url";
	String CODESYSTEM_DATA_SHARING_VALUE_DATA_SET_REFERENCE = "data-set-reference";


	//MII-DMU_TOOLS
	String CODESYSTEM_DMU_TOOLS = "http://datamanagementunit.eu/fhir/CodeSystem/dmu-tools";
	String CODESYSTEM_DMU_VALUE_STORE_URL = "store-url";
	String CODESYSTEM_DMU_VALUE_DOCUMENT_REFERENCE = "document-reference";
	String CODESYSTEM_DMU_VALUE_QUESTIONNARE_RESPONSE = "questionnare-response";
	String CODESYSTEM_DMU_VALUE_DIZ = "data-integration-center";
	//EXECUTION
    //Names of the variables in the delegate execution
    String DSF_TASK_CODESYSTEM_BPMNMESSAGE = "http://dsf.dev/fhir/CodeSystem/bpmn-message";
    String DSF_TASK_CODESYSTEM_BPMNMESSAGE_OLD = "http://highmed.org/fhir/CodeSystem/bpmn-message";

    String DUPIDENTIFIER = "dupIdentifier";
    String FHIRSTOREURL = "fhirContainerUrl";
    String FHIRSTOREID = "fhirContainerId";
	String ARCHIVEURL = "archiveUrl";
    String ISARCHIVED = "archived";
    String BUNDLEOBJECT = "bundleObject";
    String BUNDLEID = "bundleID";
    String BINARYID = "binaryID";
    String DOCUMENTID = "documentID";
	String BUNDLE = "bundle";
	String BINARY = "binary";
	String DOCUMENT_REFERENCE = "documentReference";
    String DIZSEPERATOR = "_";
    String DIZLIST = "dizIds";
    String ERRORCOUNT = "errorCount";
    String CURRENTDIZID = "inputCurrentDizId";
    String DIZPREFIXMAP = "dizPrefixMap";
    String DIZMAP = "dizMap";
    String UUIDMAP = "uuidMap";
    String COLLECTIONURL = "collectionUrl";
    String QUESTIONNAIREID = "questionnaireResponseID";
    String QUESTIONNAIRERESPONSE = "QuestionnaireResponse";
    String HASH_IDS = "hashIDs";
    String REMOVE_IDENTIFIER = "removeIdentifier";
	String COLLECTION_BUNDLE = "collectionBundle";

	//Project File
	String PROJECT_FILE = "projectfile";

    //FHIR-Store
    String FHIR_STORE_VERSION = "1.0";
    String FHIR_STORE_REQUESTER = "Transit";
    String FHIR_STORE_RECIPIENT = "Transit";

    //Others

	//TODO change local DSF to Version 1.0 (Same as VM dms.isst.fraunhofer.de)
	 String DSF_TASK_CODESYSTEM_DATASHARING
			= "http://medizininformatik-initiative.de/fhir/CodeSystem/data-sharing";

	 String DSF_TASK_BPMNMESSAGE_MESSAGENAME = "message-name";
	 String DSF_TASK_BPMNMESSAGE_BUSINESSKEY = "business-key";
	 String DSF_TASK_CORRELATION_KEY = "correlation-key";

	 String DSF_TASK_DATASHARING_DIC_CORRELATION = "dic-correlation-key";
	 String DSF_TASK_DATASHARING_DIC_IDENTIFIER
			= "http://medizininformatik-initiative.de/fhir/StructureDefinition/extension-dic-identifier";
	 String DSF_TASK_DATASHARING_DIC_IDENTIFIER2
			= "http://medizininformatik-initiative.de/fhir/Extension/dic-identifier";
	 String DSF_TASK_DATASHARING_PROJECTIDENTIFIER = "project-identifier";
	 String DSF_TASK_DATASHARING_BUSSINESS_KEY = "businessKey";
	 String DSF_TASK_DATASHARING_CONTRACTLOCATION = "contract-url";
	 String DSF_TASK_DATASHARING_RESEARCHERIDENTIFIER = "researcher-identifier";
	 String DSF_TASK_DATASHARING_PROJECTTITLE = "project-title";
	 String DSF_TASK_DATASHARING_PROJECTDATECREATED = "project-date-created";
	 String DSF_TASK_DATASHARING_PROJECTENDDATE = "project-enddate";
	 String DSF_TASK_DATASHARING_EXTRACTIONINTERVAL = "extraction-period";
     String SALT_DOMAIN_NAME = "SALT_DOMAIN";
     int SALT_LENGTH = 64;
	//Trigger
	String CODESYSTEM_TIMER_INTERVAL = "timer-interval";
	String TIMER_INTERVAL_DEFAULT_VALUE = "PT24H";
	String BPMN_EXECUTION_VARIABLE_TIMER_INTERVAL = "timerInterval";
	String BPMN_EXECUTION_VARIABLE_FROM = "timerFrom";
	String BPMN_EXECUTION_VARIABLE_CURRENT = "timerCurrent";
	String BPMN_EXECUTION_NEW_PROJECT = "newProject";
	String BPMN_EXECUTION_PROJECT_IDS = "projectIds";
	String BPMN_EXECUTION_PROJECTS = "projects";
	String BPMN_EXECUTION_PROJECT = "project";
	String BPMN_EXECUTION_DATA = "data";
	String BPMN_EXECUTION_PROCESS = "process";
	String BPMN_EXECUTION_NEW_DATA = "newData";
	String BPMN_EXECUTION_DATA_LIST = "dataList";
	String BPMN_EXECUTION_TASK_LIST = "taskList";
	String BPMN_EXECUTION_NEW_DATA_IDS = "dataListIds";
	String BPMN_EXECUTION_CLOSE_PROCESS = "closeProcess";
	String BPMN_EXECUTION_CLOSE_PROCESS_LIST = "processList";
	String BPMN_EXECUTION_CLOSE_PROCESS_IDS = "processListIds";
	String CODESYSTEM_MERGE_TASK_ID = "merge-task-id";
	//Kubernetes
	String BPMN_EXECUTION_KUBERNETES = "kubernetes";

	//Questionnare
	String QUESTIONNAIRES_ITEM_DISPLAY = "display";
	String QUESTIONNAIRES_ITEM_RELEASE = "release";
	String QUESTIONNAIRES_PLACEHOLDER_PROJECT_IDENTIFIER = "{project-identifier-placeholder}";
	String QUESTIONNAIRES_ITEM_ARCHIVE_URL = "archive-url";

}
