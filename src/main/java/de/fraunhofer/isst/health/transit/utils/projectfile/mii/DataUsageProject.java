package de.fraunhofer.isst.health.transit.utils.projectfile.mii;

import de.fraunhofer.isst.health.transit.utils.projectfile.enums.EDataUsageProjectCode;
import de.fraunhofer.isst.health.transit.utils.projectfile.enums.EDataUsageProjectType;
import de.fraunhofer.isst.health.transit.utils.projectfile.enums.ESearchableResource;
import de.fraunhofer.isst.health.transit.utils.projectfile.helper.MiiFhirComplexClientHelper;
import de.fraunhofer.isst.health.transit.utils.projectfile.queries.Query;
import de.fraunhofer.isst.health.transit.utils.projectfile.status.DataUsageProjectStatus;
import org.hl7.fhir.r4.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DataUsageProject {


    //region Member

    private MiiFhirComplexClientHelper helper;
    private String id;
    private String projectIdentifier;
    private String businesskey;

    private String title;
    private ResearchStudy.ResearchStudyStatus status;
    private String startDate;
    private String endDate;
    private Duration extractionInterval;

    private String projectUrl;
    private EDataUsageProjectType type;

    private EDataUsageProjectCode processStatus;

    private List<DataUsageProjectStatus> statusList;
    private List<Query> queries;
    private Map<String, Workflow> workflows;

    //Wird über die Workflows referenziert
    //private Map<String, Query> queries;
    //private Map<String, Response> responses;

    private List<MIIOrganisation> dizLocations;
    private MIIPersonGroup personGroup;

    private List<Contract> contracts;

    private List<MIITask> miiTasks;
    private MIIEndpoint miiEndpoint;
    private boolean hasChanged;
    private Map<String, QuestionnaireResponse> qResponse;

    private Object metaData;
    //endregion

    //region Getter&Setter

    public String getId() {
        return id;
    }

    public boolean hasId() {
        return id != null;
    }

    public String getProjectIdentifier() {
        return projectIdentifier;
    }

    public void setProjectIdentifier(String projectIdentifier) {
        this.hasChanged = true;
        this.projectIdentifier = projectIdentifier;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.hasChanged = true;
        this.title = title;
    }
    public String getProjectUrl() {
        return projectUrl;
    }

    public void setProjectUrl(String projectUrl) {
        this.hasChanged = true;
        this.projectUrl = projectUrl;
    }
    public ResearchStudy.ResearchStudyStatus getStatus() {
        return status;
    }
    public void setStatus(ResearchStudy.ResearchStudyStatus status) {
        this.hasChanged = true;
        this.status = status;
    }
    /**
     *
     * @return provided in the Format YYYY-MM-DDThh:mm:ss+zz:zz
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     *
     * @param startDate provided in the Format YYYY-MM-DDThh:mm:ss+zz:zz
     */
    public void setStartDate(String startDate) {
        this.hasChanged = true;
        this.startDate = startDate;
    }

    /**
     *
     * @return provided in the Format YYYY-MM-DDThh:mm:ss+zz:zz
     */
    public String getEndDate() {
        return endDate;
    }
    /**
     *
     * @param endDate provided in the Format YYYY-MM-DDThh:mm:ss+zz:zz
     */
    public void setEndDate(String endDate) {
        this.hasChanged = true;
        this.endDate = endDate;
    }
    public Duration getExtractionInterval() {
        return extractionInterval;
    }

    public void setExtractionInterval(Duration extractionInterval) {
        this.hasChanged = true;
        this.extractionInterval = extractionInterval;
    }
    public EDataUsageProjectType getType() {
        return type;
    }

    public void setType(EDataUsageProjectType type) {
        this.hasChanged = true;
        this.type = type;
    }
    public String getBusinesskey() {
        return businesskey;
    }

    public void setBusinesskey(String businesskey) {
        this.businesskey = businesskey;
    }

    public List<DataUsageProjectStatus> getStatusList() {
        return statusList;
    }

    public void setStatusList(List<DataUsageProjectStatus> status) {
        this.hasChanged = true;
        this.statusList = status;
    }

    public boolean addStatus(DataUsageProjectStatus status) {
        this.hasChanged = true;
        return statusList.add(status);
    }

    public void setProcessStatus(EDataUsageProjectCode processStatus) {
        this.hasChanged = true;
        this.processStatus = processStatus;
    }

    public EDataUsageProjectCode getProcessStatus() {
        return this.processStatus;
    }

    public Map<String, Workflow> getWorkflows() {
        return workflows;
    }

    public void setWorkflows(Map<String, Workflow> workflows) {
        this.hasChanged = true;
        this.workflows = workflows;
    }

    public List<MIITask> getTasks() {
        return miiTasks;
    }

    public void setTasks(List<MIITask> mIITasks) {
        this.hasChanged = true;
        this.miiTasks = mIITasks;
    }

    public boolean addTask(MIITask mIITask) {
        this.hasChanged = true;
        return miiTasks.add(mIITask);
    }

    public List<MIIOrganisation> getDizLocations() {
        return dizLocations;
    }

    public void setDizLocations(List<MIIOrganisation> dizLocations) {
        this.hasChanged = true;
        this.dizLocations = dizLocations;
    }

    public void addDizLocations(MIIOrganisation organisation) {
        this.hasChanged = true;
        this.dizLocations.add(organisation);
    }

    public MIIPersonGroup getPersonGroup() {
        return personGroup;
    }

    public void setPersonGroup(MIIPersonGroup personGroup) {
        this.hasChanged = true;
        this.personGroup = personGroup;
    }

    public MIIEndpoint getMiiEndpoint() {
        return miiEndpoint;
    }

    public void setMiiEndpoint(MIIEndpoint miiEndpoint) {
        this.hasChanged = true;
        this.miiEndpoint = miiEndpoint;
    }
    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.hasChanged = true;
        this.contracts = contracts;
    }


    public Map<String, QuestionnaireResponse> getqResponse() {
        return qResponse;
    }

    public void setqResponse(Map<String, QuestionnaireResponse> qResponse) {
        this.hasChanged = true;
        this.qResponse = qResponse;
    }

    public Object getMetaData() {
        return metaData;
    }

    public void setMetaData(Object metaData) {
        this.hasChanged = true;
        this.metaData = metaData;
    }

    public List<Query> getQueries() {
        return queries;
    }

    public void setQueries(List<Query> queries) {
        this.hasChanged = true;
        this.queries = queries;
    }
//endregion

    //region Methods
    public DataUsageProject(String projectIdentifier, MiiFhirComplexClientHelper helper) {
        this.helper = helper;
        this.projectIdentifier = projectIdentifier;
        this.dizLocations = new ArrayList<>();
        this.miiTasks = new ArrayList<>();
        this.statusList = new ArrayList<>();
        this.processStatus = EDataUsageProjectCode.INITIALIZED;
        this.hasChanged = true;
        personGroup = new MIIPersonGroup(projectIdentifier + "/Group", helper);
        miiEndpoint = new MIIEndpoint(projectIdentifier + "/Endpoint", helper.getConfig());
        extractionInterval = new Duration();
    }

    public DataUsageProject(ResearchStudy researchStudy, MiiFhirComplexClientHelper helper) {
        this.helper = helper;
        this.dizLocations = new ArrayList<>();
        this.miiTasks = new ArrayList<>();
        this.statusList = new ArrayList<>();
        this.processStatus = EDataUsageProjectCode.INITIALIZED;
        this.hasChanged = false;
        //Map Attributes of the ResearchStudy
        id = researchStudy.getIdElement().getIdPart();
        for (Identifier identifier: researchStudy.getIdentifier()) {
            if ("http://datamanagementunit.eu/businessKey".equals(identifier.getSystem())) {
                businesskey = identifier.getValue();
            }
            if (helper.getConfig().getResearchStudySystem().equals(identifier.getSystem())) {
                projectIdentifier = researchStudy.getIdentifierFirstRep().getValue();
            }
        }
        title = researchStudy.getTitle();
        status = researchStudy.getStatus();
        startDate = researchStudy.getPeriod().getStartElement().getValueAsString();
        endDate = researchStudy.getPeriod().getEndElement().getValueAsString();

        if (researchStudy.getPeriod().hasExtension(
                "http://datamanagementunit.eu/fhir/StructureDefinition/ExtractionIntervalExtension")) {
            extractionInterval = (Duration) researchStudy.getPeriod().getExtensionByUrl(
                    "http://datamanagementunit.eu/fhir/StructureDefinition/ExtractionIntervalExtension").getValue();
        } else {
            extractionInterval = new Duration();
            extractionInterval.setSystem("http://unitsofmeasure.org");
        }
        //Map StatusExtension

        //SetUp Status
        //A seperate SetUp for the Tasks List should not be necessary, because each Task should also have a correlated Status
        setStatus(researchStudy);
        setProjectStatus(researchStudy);
        setUpTasks(researchStudy);
        //Setup Enrollment
        setGroup(researchStudy);
        //Setup DIZ
        setDIZLocations(researchStudy);

        if (researchStudy.hasExtension("http://datamanagementunit.eu/fhir/StructureDefinition/ProjectURLExtension")) {
            UrlType tempType = (UrlType) researchStudy.getExtensionByUrl(
                    "http://datamanagementunit.eu/fhir/StructureDefinition/ProjectURLExtension").getValue();
            projectUrl = tempType.getValue();
        }
        if (researchStudy.hasExtension(
                "http://datamanagementunit.eu/fhir/StructureDefinition/EndpointExtension")) {
            setEndpoint(researchStudy.getExtensionByUrl(
                    "http://datamanagementunit.eu/fhir/StructureDefinition/EndpointExtension"));
        }
    }

    private void setUpTasks(ResearchStudy researchStudy) {
        for (Extension extension: researchStudy.getExtensionsByUrl(
                "http://datamanagementunit.eu/fhir/StructureDefinition/TaskExtension")) {
            Reference taskReference = (Reference) extension.getValue();
            String tempIdentifier = taskReference.getIdentifier().getValue();
            HTTPResponseObject correlatedTask = helper.searchByIdentifier(tempIdentifier, ESearchableResource.TASK);
            if (correlatedTask.hasResource()) {
                MIITask tempTask = new MIITask((Task) correlatedTask.getResource(), helper.getConfig());
                miiTasks.add(tempTask);
            }
        }
    }

    private void setEndpoint(Extension extensionsByUrl) {
        Reference tempReference = (Reference) extensionsByUrl.getValue();
        HTTPResponseObject responseObject = helper.searchByIdentifier(
                tempReference.getIdentifier().getValue(), ESearchableResource.ENDPOINT);

        if (responseObject.hasResource()) {
            miiEndpoint = new MIIEndpoint((Endpoint) responseObject.getResource(), helper.getConfig());
        } else {
            miiEndpoint = new MIIEndpoint(projectIdentifier + "Endpoint", helper.getConfig());
        }
    }

    private void setProjectStatus(ResearchStudy researchStudy) {
        if (researchStudy.hasExtension("http://datamanagementunit.eu/fhir/StructureDefinition/ProjectStatusExtension")) {

            CodeType projectStatus = (CodeType) researchStudy
                    .getExtensionByUrl("http://datamanagementunit.eu/fhir/StructureDefinition/ProjectStatusExtension")
                    .getExtensionByUrl("ProjectStatusCode").getValue();

            switch (projectStatus.getCode()) {
                case "initialized":
                    setProcessStatus(EDataUsageProjectCode.INITIALIZED);
                    break;
                case "active":
                    setProcessStatus(EDataUsageProjectCode.ACTIVE);
                    break;
                case "closed":
                    setProcessStatus(EDataUsageProjectCode.CLOSED);
                    break;
                case "archived":
                    setProcessStatus(EDataUsageProjectCode.ARCHIVED);
                    break;
                case "restored":
                    setProcessStatus(EDataUsageProjectCode.RESTORED);
                    break;
                default:
                    setProcessStatus(EDataUsageProjectCode.INITIALIZED);
                    break;
            }
        }
    }

    private void setStatus(ResearchStudy researchStudy) {
        statusList = new ArrayList<>();
        if (researchStudy.hasExtension(
                "http://datamanagementunit.eu/fhir/StructureDefinition/StatusExtension")) {
            for (Extension tempExtension : researchStudy.getExtensionsByUrl(
                    "http://datamanagementunit.eu/fhir/StructureDefinition/StatusExtension")) {
                DataUsageProjectStatus status = new DataUsageProjectStatus();
                if (tempExtension.hasExtension("ID")) {
                    StringType tempString = (StringType) tempExtension.getExtensionByUrl("ID").getValue();
                    status.setId(tempString.getValue());
                }
                if (tempExtension.hasExtension("LastUpdated")) {
                    DateTimeType updated = (DateTimeType) tempExtension.getExtensionByUrl("LastUpdated").getValue();
                    status.setLastUpdated(updated);
                }
                if (tempExtension.hasExtension("StatusCode")) {
                    CodeType statusCode = (CodeType) tempExtension.getExtensionByUrl("StatusCode").getValue();
                    switch (statusCode.getCode()) {
                        case "initialized":
                            status.setCode(EDataUsageProjectCode.INITIALIZED);
                            break;
                        case "active":
                            status.setCode(EDataUsageProjectCode.ACTIVE);
                            break;
                        case "closed":
                            status.setCode(EDataUsageProjectCode.CLOSED);
                            break;
                        case "archived":
                            status.setCode(EDataUsageProjectCode.ARCHIVED);
                            break;
                        case "restored":
                            status.setCode(EDataUsageProjectCode.RESTORED);
                            break;
                        case "unknown":
                        default:
                            status.setCode(EDataUsageProjectCode.UNKNOWN);
                            break;
                    }
                }
                if (tempExtension.hasExtension("CorrelatedTask")) {
                    Reference taskReference = (Reference) tempExtension.getExtensionByUrl("CorrelatedTask").getValue();
                    String tempIdentifier = taskReference.getIdentifier().getValue();
                    HTTPResponseObject responseObject = helper.searchByIdentifier(tempIdentifier, ESearchableResource.TASK);
                    if (responseObject.hasResource()) {
                        MIITask tempTask = new MIITask((Task) responseObject.getResource(), helper.getConfig());
                        status.setCorrelatedTask(tempTask);
                    }
                }
                statusList.add(status);
            }
        }
    }

    private void setGroup(ResearchStudy researchStudy) {
        HTTPResponseObject tempGroup = helper.searchByIdentifier(
                researchStudy.getEnrollmentFirstRep().getIdentifier().getValue(), ESearchableResource.GROUP);
        if (tempGroup.hasResource()) {
            personGroup = new MIIPersonGroup((Group) tempGroup.getResource(), helper);
        } else {
            personGroup = new MIIPersonGroup(projectIdentifier + "Group", helper);
        }
    }

    private void setDIZLocations(ResearchStudy researchStudy) {
        if (researchStudy.hasSite()) {
            for (Reference reference : researchStudy.getSite()) {
                HTTPResponseObject site = helper.searchByIdentifier(
                        reference.getIdentifier().getValue(), ESearchableResource.LOCATION);
                if (site.hasResource()) {
                    dizLocations.add(new MIIOrganisation((Location) site.getResource(), helper.getConfig()));
                }
            }
        }
    }

    public Bundle getBundle() {
        Bundle transactionBundle = new Bundle();
        transactionBundle.setType(Bundle.BundleType.TRANSACTION);
        toFhir(transactionBundle);
        return transactionBundle;
    }

    public void toFhir(Bundle bundle) {
        ResearchStudy researchStudy = new ResearchStudy();
        researchStudy.getMeta().addProfile("http://datamanagementunit.eu/fhir/StructureDefinition/ResearchStudyStorage");
        String narrativeString = "Identifier: " + helper.getConfig().getResearchStudySystem() + "/" + projectIdentifier + "\n";
        narrativeString += "Startdate: " + startDate + "\n";
        narrativeString += "Enddate: " + endDate;

        researchStudy.getText().setDivAsString(narrativeString);
        researchStudy.getText().setStatus(Narrative.NarrativeStatus.GENERATED);

        for (DataUsageProjectStatus d : statusList) {
            Extension statusExtension = researchStudy.addExtension().setUrl(
                    "http://datamanagementunit.eu/fhir/StructureDefinition/StatusExtension");
            statusExtension.addExtension().setUrl("ID").setValue(new StringType(d.getId()));
            switch (d.getCode()) {
                case "INITIALIZED":
                    statusExtension.addExtension().setUrl("StatusCode").setValue(new CodeType("initialized"));
                    break;
                case "ACTIVE":
                    statusExtension.addExtension().setUrl("StatusCode").setValue(new CodeType("active"));
                    break;
                case "CLOSED":
                    statusExtension.addExtension().setUrl("StatusCode").setValue(new CodeType("closed"));
                    break;
                case "ARCHIVED":
                    statusExtension.addExtension().setUrl("StatusCode").setValue(new CodeType("archived"));
                    break;
                case "RESTORED":
                    statusExtension.addExtension().setUrl("StatusCode").setValue(new CodeType("restored"));
                    break;
                case "UNKNOWN":
                    statusExtension.addExtension().setUrl("StatusCode").setValue(new CodeType("unknown"));
                    break;
                default:
                    break;
            }
            statusExtension.addExtension().setUrl("LastUpdated").setValue(d.getLastUpdated());
            statusExtension.addExtension().setUrl("CorrelatedTask")
                    .setValue(new Reference().setIdentifier(
                            new Identifier().setValue(
                                    d.getCorrelatedTask().getDsfId()).setSystem(helper.getConfig().getTaskSystem())));
        }

        if (miiEndpoint != null) {
            researchStudy.addExtension().setUrl(
                    "http://datamanagementunit.eu/fhir/StructureDefinition/EndpointExtension")
                    .setValue(new Reference().setIdentifier(new Identifier()
                            .setSystem(helper.getConfig().getEndpointSystem())
                            .setValue(miiEndpoint.getDsfId())));
            miiEndpoint.toFhir(bundle);
        }

        for (MIITask m : miiTasks) {
            researchStudy.addExtension()
                    .setUrl("http://datamanagementunit.eu/fhir/StructureDefinition/TaskExtension")
                    .setValue(new Reference().setIdentifier(new Identifier()
                                    .setSystem(helper.getConfig().getTaskSystem())
                                    .setValue(m.getDsfId())));
            m.toFhir(bundle);
        }

        if (projectUrl != null) {
            researchStudy.addExtension()
                    .setUrl("http://datamanagementunit.eu/fhir/StructureDefinition/ProjectURLExtension")
                    .setValue(new UrlType(projectUrl));
        }

        if (processStatus != null) {

            Extension processStatusExtension = researchStudy.addExtension().setUrl(
                    "http://datamanagementunit.eu/fhir/StructureDefinition/ProjectStatusExtension");

            switch (processStatus.name()) {
                case "INITIALIZED":
                    processStatusExtension.addExtension().setUrl("ProjectStatusCode").setValue(new CodeType("initialized"));
                    break;
                case "ACTIVE":
                    processStatusExtension.addExtension().setUrl("ProjectStatusCode").setValue(new CodeType("active"));
                    break;
                case "CLOSED":
                    processStatusExtension.addExtension().setUrl("ProjectStatusCode").setValue(new CodeType("closed"));
                    break;
                case "ARCHIVED":
                    processStatusExtension.addExtension().setUrl("ProjectStatusCode").setValue(new CodeType("archived"));
                    break;
                case "RESTORED":
                    processStatusExtension.addExtension().setUrl("ProjectStatusCode").setValue(new CodeType("restored"));
                    break;
                default:
                    break;
            }
        }

        researchStudy.getIdentifier().clear();
        researchStudy.getIdentifierFirstRep().setSystem(helper.getConfig().getResearchStudySystem()).setValue(projectIdentifier);

        //TODO ProjectFile-Server Profiles need to be updated to allow 2 identifier in ResearchStudy
        //researchStudy.addIdentifier().setSystem("http://datamanagementunit.eu/businessKey").setValue(businesskey);

        if (title != null) {
            researchStudy.setTitle(title);
        }
        if (status != null) {
            researchStudy.setStatus(status);
        }
        if (personGroup != null) {
            researchStudy.getEnrollmentFirstRep().getIdentifier()
                    .setValue(personGroup.getDsfId())
                    .setSystem(helper.getConfig().getGroupSystem());
            personGroup.toFhir(bundle);
        }
        if (extractionInterval != null) {
            researchStudy.getPeriod().addExtension()
                    .setUrl("http://datamanagementunit.eu/fhir/StructureDefinition/ExtractionIntervalExtension")
                    .setValue(extractionInterval);
        }
        if (startDate != null) {
            researchStudy.getPeriod().setStartElement(new DateTimeType(startDate));
        }
        if (endDate != null) {
            researchStudy.getPeriod().setEndElement(new DateTimeType(endDate));
        }
        for (MIIOrganisation organisation : dizLocations) {
            researchStudy.addSite().setIdentifier(new Identifier()
                    .setSystem(helper.getConfig().getDizSystem())
                    .setValue(organisation.getDsfId()));
            organisation.toFhir(bundle);
        }

        if (hasChanged) {
            Bundle.BundleEntryComponent bundleEntryComponent = bundle.addEntry();
            bundleEntryComponent.setResource(researchStudy);
            if (hasId()) {
                researchStudy.setId(id);
                bundleEntryComponent.getRequest().setMethod(Bundle.HTTPVerb.PUT).setUrl("ResearchStudy/" + id);
            } else {
                bundleEntryComponent.getRequest().setMethod(Bundle.HTTPVerb.POST).setUrl("ResearchStudy");
            }
        }
    }
    //endregion
}
