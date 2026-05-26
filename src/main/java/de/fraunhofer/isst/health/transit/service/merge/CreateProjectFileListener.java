package de.fraunhofer.isst.health.transit.service.merge;

import ca.uhn.fhir.context.FhirContext;
import de.fraunhofer.isst.health.transit.ConstantsTransit;
import de.fraunhofer.isst.health.transit.models.DIZLocation;
import de.fraunhofer.isst.health.transit.models.Participant;
import de.fraunhofer.isst.health.transit.models.TaskObject;
import de.fraunhofer.isst.health.transit.service.common.InitializeNewProjectDataSharing;
import de.fraunhofer.isst.health.transit.spring.config.DmsProjectFileFhirClientConfig;
import de.fraunhofer.isst.health.transit.spring.config.TransitVariablesConfig;
import de.fraunhofer.isst.health.transit.utils.ResultFormatter;
import de.fraunhofer.isst.health.transit.utils.gpas.GpasManager;
import de.fraunhofer.isst.health.transit.utils.gpas.domain.*;
import de.fraunhofer.isst.health.transit.utils.projectfile.enums.EDataUsageProjectCode;
import de.fraunhofer.isst.health.transit.utils.projectfile.enums.EEndpointPayloadMimeType;
import de.fraunhofer.isst.health.transit.utils.projectfile.helper.MiiFhirComplexClientHelper;
import de.fraunhofer.isst.health.transit.utils.projectfile.mii.*;
import de.fraunhofer.isst.health.transit.utils.projectfile.status.DataUsageProjectStatus;
import de.medizininformatik_initiative.processes.common.util.ConstantsBase;
import dev.dsf.bpe.v2.ProcessPluginApi;
import dev.dsf.bpe.v2.activity.ServiceTask;
import dev.dsf.bpe.v2.constants.CodeSystems;
import dev.dsf.bpe.v2.constants.NamingSystems;
import dev.dsf.bpe.v2.error.ErrorBoundaryEvent;
import dev.dsf.bpe.v2.variables.Target;
import dev.dsf.bpe.v2.variables.Targets;
import dev.dsf.bpe.v2.variables.Variables;
import org.hl7.fhir.r4.model.*;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import static de.fraunhofer.isst.health.transit.ConstantsTransit.*;

public class CreateProjectFileListener implements ServiceTask {
    private static final Logger LOGGER = Logger.getLogger(CreateProjectFileListener.class.getName());
    private GpasManager gpasManager;
    private TransitVariablesConfig transitVariablesConfig;
    private DmsProjectFileFhirClientConfig dmsProjectFileFhirClientConfig;

    public CreateProjectFileListener(GpasManager gpasManager, TransitVariablesConfig transitVariablesConfig,
                                     DmsProjectFileFhirClientConfig dmsProjectFileFhirClientConfig) {
        super();
        this.gpasManager = gpasManager;
        this.transitVariablesConfig = transitVariablesConfig;
        this.dmsProjectFileFhirClientConfig = dmsProjectFileFhirClientConfig;
    }

    @Override
    public void execute(ProcessPluginApi api, Variables variables) throws ErrorBoundaryEvent, Exception {
        LOGGER.log(Level.INFO, "Started Camunda Implementation CreateProjectFileListener");
        Task task = variables.getStartTask();

        //Get Project Identifier from task
        String projectIdentifier = getProjectIdentifier(task);
        variables.setString(ConstantsTransit.DUPIDENTIFIER, projectIdentifier);

        //Get BusinessKey
        String bussinessKey = getBussinessKey(task, api);
        variables.setString(ConstantsTransit.DSF_TASK_DATASHARING_BUSSINESS_KEY, bussinessKey);

        //DMS Target for Store controller
        variables.setTarget(
                variables.createTarget(api.getOrganizationProvider().getLocalOrganizationIdentifierValue().get(),
                        api.getEndpointProvider().getLocalEndpointIdentifierValue().get(),
                        api.getEndpointProvider().getLocalEndpointAddress()));

        //list of DIZ
        List<Target> targetsList = getTargets(api, task, variables);
        Targets targets = variables.createTargets(targetsList);
        variables.setTargets(targets);

        TaskObject fileData = InitializeNewProjectDataSharing.generateTaskObject(task);

        //TODO Read values from (DSF-)Task-Object (Project Meta-Data)
        //Determines if the IDs and References of FHIR-Resources are being replaced by a hash-value
        variables.setBoolean(ConstantsTransit.HASH_IDS, true);
        //Determines if the Identifiers of non-Patient FHIR-Resources are being removed
        variables.setBoolean(ConstantsTransit.REMOVE_IDENTIFIER, true);

        LOGGER.log(Level.INFO, "Looking up DUP with identifier " + fileData.getDupIdentifier());
        MiiFhirComplexClientHelper helper = new MiiFhirComplexClientHelper(fileData.getDupIdentifier(), this.dmsProjectFileFhirClientConfig);
        LOGGER.log(Level.INFO, "Looked up DUP with code: " + helper.getLastResponse().getStatusCode());

        MIITask miiTask = new MIITask(new Task(), dmsProjectFileFhirClientConfig);
        miiTask.setDsfId(fileData.getBusinessKey());
        miiTask.setCode("initializeNewProjectDataSharing");
        miiTask.setIntent(Task.TaskIntent.PROPOSAL);
        miiTask.setPrimitiveStatus(Task.TaskStatus.INPROGRESS);
        miiTask.setGroupId(fileData.getDupIdentifier());
        miiTask.setPartOf(fileData.getDupIdentifier());

        DataUsageProjectStatus status = new DataUsageProjectStatus();
        status.setLastUpdated(new DateTimeType(fileData.getTaskCreationDate()));
        status.setId(fileData.getBusinessKey());
        status.setCode(EDataUsageProjectCode.INITIALIZED);
        status.setCorrelatedTask(miiTask);

        miiTask.setComplexStatus(status);

        MIIEndpoint endpoint = helper.getDataUsageProject().getMiiEndpoint();
        endpoint.addMimeType(EEndpointPayloadMimeType.JSON);
        endpoint.setStatus(Endpoint.EndpointStatus.OFF);
        endpoint.setAddress("placeholder");
        endpoint.addPayloadType("", "", "ResearchData");

        DataUsageProject dataUsageProject = helper.getDataUsageProject();
        dataUsageProject.setTitle(fileData.getDupTitle());
        dataUsageProject.setStartDate(fileData.getProjectEndDate());
        dataUsageProject.setEndDate(fileData.getProjectEndDate());

        dataUsageProject.setStatus(ResearchStudy.ResearchStudyStatus.ACTIVE);
        dataUsageProject.addStatus(status);
        dataUsageProject.setProcessStatus(EDataUsageProjectCode.INITIALIZED);
        dataUsageProject.setProjectUrl("http://url.org"); //TODO was genau passier hier
        dataUsageProject.addTask(miiTask);
        dataUsageProject.setBusinesskey(fileData.getBusinessKey());

        for (DIZLocation location : fileData.getDizLocations()) {
            MIIOrganisation miiOrganisation = new MIIOrganisation(location.getIdentifierValue(), this.dmsProjectFileFhirClientConfig);
            miiOrganisation.setTitle(location.getName());
            dataUsageProject.addDizLocations(miiOrganisation);
        }

        for (Participant participant : fileData.getParticipants()) {
            MIIPerson person = new MIIPerson(participant.getIdentifierValue(), this.dmsProjectFileFhirClientConfig);
            dataUsageProject.getPersonGroup().addResearcher(person);
        }
        LOGGER.log(Level.INFO, FhirContext.forR4().newJsonParser().encodeResourceToString(dataUsageProject.getBundle()));
        List<OperationOutcome.OperationOutcomeIssueComponent> problems = ResultFormatter.filterForError(helper.updateToServer());

        if (!problems.isEmpty()) {
            LOGGER.log(Level.SEVERE, "Uploading projectfile failed with " + problems.size() + " errors");
            for (OperationOutcome.OperationOutcomeIssueComponent issueComponent : problems) {
                LOGGER.log(Level.SEVERE, issueComponent.getSeverity().getDisplay() + " " + issueComponent.getDetails().getText());
            }
        } else {
            LOGGER.log(Level.INFO, "Projectfile uploaded successfully");
        }


        createDomain(fileData.getDupIdentifier());
    }


    public void createDomain(String dupIdentifier) {
        DomainInDTO domainInDTO = new DomainInDTO();

        DomainConfig domainConfig = new DomainConfig();
        domainConfig.setPsnLength(transitVariablesConfig.getGpasPsnLength());
        domainConfig.setIncludePrefixInCheckDigitCalculation(false);
        domainConfig.setIncludeSuffixInCheckDigitCalculation(false);
        domainConfig.setMaxDetectedErrors(1);
        domainConfig.setPsnsDeletable(true);
        domainConfig.setUseLastCharAsDelimiterAfterXChars(0);
        domainConfig.setSendNotificationsWeb(false);

        domainInDTO.setAlphabet("org.emau.icmvc.ganimed.ttp.psn.alphabets.Symbol32");
        domainInDTO.setCheckDigitClass("org.emau.icmvc.ganimed.ttp.psn.generator.HammingCode");
        domainInDTO.setName(dupIdentifier);
        domainInDTO.setLabel(dupIdentifier);
        domainInDTO.setConfig(domainConfig);
        gpasManager.createDomain(domainInDTO);
    }

    private List<Target> getTargets(ProcessPluginApi api, Task task, Variables variables)
    {
        return api.getTaskHelper()
                .getInputParametersWithExtension(task, CODESYSTEM_DATA_SHARING,
                        CODESYSTEM_DATA_SHARING_VALUE_DIC_CORRELATION_KEY, StringType.class,
                        EXTENSION_URL_DIC_IDENTIFIER)
                .map(p -> transformDicCorrelationKeyInputToTarget(api, p, variables)).toList();
    }

    private Target transformDicCorrelationKeyInputToTarget(ProcessPluginApi api, Task.ParameterComponent input, Variables variables)
    {
        String organizationIdentifier = ((Reference) input
                .getExtensionByUrl(EXTENSION_URL_DIC_IDENTIFIER).getValue()).getIdentifier()
                .getValue();
        String correlationKey = ((StringType) input.getValue()).asStringValue();

        return api.getEndpointProvider().getEndpoint(NamingSystems.OrganizationIdentifier.withValue(
                                ConstantsBase.NAMINGSYSTEM_DSF_ORGANIZATION_IDENTIFIER_MEDICAL_INFORMATICS_INITIATIVE_CONSORTIUM),
                        NamingSystems.OrganizationIdentifier.withValue(organizationIdentifier),
                        new Coding().setSystem(ConstantsBase.CODESYSTEM_DSF_ORGANIZATION_ROLE)
                                .setCode(ConstantsBase.CODESYSTEM_DSF_ORGANIZATION_ROLE_VALUE_DIC))
                .map(e -> variables.createTarget(organizationIdentifier, e.getIdentifierFirstRep().getValue(),
                        e.getAddress(), correlationKey))
                .orElseThrow(() -> new RuntimeException(
                        "No endpoint of found for organization '" + organizationIdentifier + "'"));
    }

    private String getProjectIdentifier(Task task)
    {
        return task.getInput().stream().filter(i -> i.getType().getCoding().stream()
                        .anyMatch(c -> ConstantsTransit.CODESYSTEM_DATA_SHARING.equals(c.getSystem())
                                && ConstantsTransit.CODESYSTEM_DATA_SHARING_VALUE_PROJECT_IDENTIFIER.equals(c.getCode())))
                .filter(i -> i.getValue() instanceof Identifier).map(i -> (Identifier) i.getValue())
                .filter(i -> ConstantsBase.NAMINGSYSTEM_MII_PROJECT_IDENTIFIER.equals(i.getSystem()))
                .map(Identifier::getValue).map(String::trim).findFirst().orElseThrow(() -> new RuntimeException(
                        "No project-identifier present in task with id '" + task.getId() + "'"));
    }


    private String getBussinessKey(Task task, ProcessPluginApi api)
    {
        return api.getTaskHelper()
                .getFirstInputParameterValue(task, CodeSystems.BpmnMessage.businessKey(), StringType.class)
                .orElseThrow(() -> new RuntimeException("Business Key is missing")).getValue();
    }

}
