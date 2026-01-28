package de.fraunhofer.isst.health.transit.utils.projectfile.mii;

import de.fraunhofer.isst.health.transit.spring.config.DmsProjectFileFhirClientConfig;
import de.fraunhofer.isst.health.transit.utils.projectfile.enums.EDataUsageProjectCode;
import de.fraunhofer.isst.health.transit.utils.projectfile.status.DataUsageProjectStatus;
import org.hl7.fhir.r4.model.*;

import java.util.ArrayList;
import java.util.List;

public class MIITask {

    private String id;
    private String dsfId;
    private String groupId;
    private Task.TaskStatus primitiveStatus;
    private String originLocation;
    private String partOf;
    private List<String> relatedTasks;
    private DataUsageProjectStatus complexStatus;
    private Task.TaskIntent intent;
    private String code;
    private String focusValue;
    private String focusSystem;
    private DmsProjectFileFhirClientConfig config;
    private boolean hasChanged;
    private final String relatedTaskUrl = "http://datamanagementunit.eu/fhir/StructureDefinition/RelatedTasksExtension";
    private final String originLocationUrl = "http://datamanagementunit.eu/fhir/StructureDefinition/OriginLocationExtension";

    public MIITask(DmsProjectFileFhirClientConfig config) {
        this.config = config;
        relatedTasks = new ArrayList<>();
        hasChanged = true;
    }

    public MIITask(Task task, DmsProjectFileFhirClientConfig config) {
        this.config = config;
        if (task.hasId()) {
            id = task.getIdElement().getIdPart();
        }

        setUpStatus(task);

        if (task.hasExtension("http://hl7.org/fhir/StructureDefinition/workflow-researchStudy")) {
            Reference studyReference = (Reference) task.
                    getExtensionByUrl("http://hl7.org/fhir/StructureDefinition/workflow-researchStudy").getValue();
            partOf = studyReference.getIdentifier().getValue();
        }

        relatedTasks = new ArrayList<>();

        for (Extension tempExtension: task.getExtensionsByUrl(relatedTaskUrl)) {
            Reference reference = (Reference) tempExtension.getValue();
            relatedTasks.add(reference.getIdentifier().getValue());
        }

        if (task.hasExtension(originLocationUrl)) {
            Reference reference = (Reference) task.getExtensionByUrl(originLocationUrl).getValue();
            originLocation = reference.getIdentifier().getValue();
        }

        dsfId = task.getIdentifierFirstRep().getValue();
        groupId = task.getGroupIdentifier().getValue();
        primitiveStatus = task.getStatus();
        intent = task.getIntent();
        code = task.getCode().getText();

        if (task.hasFocus()) {
            focusValue = task.getFocus().getIdentifier().getSystem();
            focusValue = task.getFocus().getIdentifier().getValue();
        }
        hasChanged = false;
    }
    //region Getter&Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.hasChanged = true;
        this.id = id;
    }

    public String getDsfId() {
        return dsfId;
    }

    public void setDsfId(String dsfId) {
        this.hasChanged = true;
        this.dsfId = dsfId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.hasChanged = true;
        this.groupId = groupId;
    }

    public Task.TaskStatus getPrimitiveStatus() {
        return primitiveStatus;
    }

    public void setPrimitiveStatus(Task.TaskStatus primitiveStatus) {
        this.hasChanged = true;
        this.primitiveStatus = primitiveStatus;
    }

    public String getOriginLocation() {
        return originLocation;
    }

    public void setOriginLocation(String originLocation) {
        this.hasChanged = true;
        this.originLocation = originLocation;
    }

    public List<String> getRelatedTasks() {
        return relatedTasks;
    }

    public void setRelatedTasks(List<String> relatedTasks) {
        this.hasChanged = true;
        this.relatedTasks = relatedTasks;
    }
    public boolean addRelatedTask(String task) {
        this.hasChanged = true;
        return relatedTasks.add(task);
    }
    public DataUsageProjectStatus getComplexStatus() {
        return complexStatus;
    }

    public void setComplexStatus(DataUsageProjectStatus complexStatus) {
        this.hasChanged = true;
        this.complexStatus = complexStatus;
    }

    public Task.TaskIntent getIntent() {
        return intent;
    }

    public void setIntent(Task.TaskIntent intent) {
        this.hasChanged = true;
        this.intent = intent;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.hasChanged = true;
        this.code = code;
    }

    public String getFocusValue() {
        return focusValue;
    }

    public void setFocusValue(String focus) {
        this.hasChanged = true;
        this.focusValue = focus;
    }
    public String getFocusSystem() {
        return focusSystem;
    }

    public void setFocusSystem(String focus) {
        this.hasChanged = true;
        this.focusSystem = focus;
    }

    public String getPartOf() {
        return partOf;
    }

    public void setPartOf(String partOf) {
        this.hasChanged = true;
        this.partOf = partOf;
    }

    //endregion

    private void setUpStatus(Task task) {
        if (task.hasExtension("http://datamanagementunit.eu/fhir/StructureDefinition/StatusExtension")) {

            Extension tempExtension = task.getExtensionByUrl(
                    "http://datamanagementunit.eu/fhir/StructureDefinition/StatusExtension");

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
            this.setComplexStatus(status);
        }
    }

    public Task toFhir(Bundle bundle) {
        Task task = new Task();
        task.getMeta().addProfile(
                "http://datamanagementunit.eu/fhir/StructureDefinition/TaskStorage");
        task.getIdentifierFirstRep().setValue(dsfId).setSystem(config.getTaskSystem());

        String narrativeString = "Identifier: " + config.getTaskSystem() + "/" + dsfId + "\n";
        narrativeString += "DUPIdentifier: " + config.getResearchStudySystem() + "/" + groupId + "\n";
        narrativeString += "Tasktype: " + code;
        task.getText().setDivAsString(narrativeString);
        task.getText().setStatus(Narrative.NarrativeStatus.GENERATED);

        if (groupId != null) {
            task.getGroupIdentifier().setSystem(config.getResearchStudySystem()).setValue(groupId);
        }

        if (complexStatus != null) {
            Extension statusExtension = task.addExtension().setUrl(
                    "http://datamanagementunit.eu/fhir/StructureDefinition/StatusExtension");
            statusExtension.addExtension().setUrl("ID").setValue(new StringType(complexStatus.getId()));
            switch (complexStatus.getCode()) {
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
                default:
                    statusExtension.addExtension().setUrl("StatusCode").setValue(new CodeType("unknown"));
            }
            statusExtension.addExtension()
                    .setUrl("LastUpdated")
                    .setValue(complexStatus.getLastUpdated());
            statusExtension.addExtension()
                    .setUrl("CorrelatedTask")
                    .setValue(new Reference().setIdentifier(
                            new Identifier().setValue(dsfId).setSystem(config.getTaskSystem())));
        }

        if (partOf != null) {
            task.addExtension().setUrl(
                    "http://hl7.org/fhir/StructureDefinition/workflow-researchStudy")
                    .setValue(new Reference().setIdentifier(
                            new Identifier().setValue(partOf).setSystem(config.getResearchStudySystem())));
        }

        for (String taskIdentifier: relatedTasks) {
            task.addExtension().setUrl(relatedTaskUrl).setValue(new Reference()
                    .setIdentifier(new Identifier().setValue(taskIdentifier).setSystem(config.getTaskSystem())));
        }

        if (originLocation != null) {
            task.addExtension().setUrl(originLocationUrl).setValue(new Reference().setIdentifier(
                    new Identifier().setValue(originLocation).setSystem(config.getDizSystem())));
        }

        if (primitiveStatus != null) {
            task.setStatus(primitiveStatus);
        }

        if (intent != null) {
            task.setIntent(intent);
        }

        if (code != null) {
            task.getCode().setText(code);
        }

        if (!(focusSystem == null)) {
            task.getFocus().getIdentifier().setValue(focusValue).setSystem(focusSystem);
        }
        if (hasChanged) {
            Bundle.BundleEntryComponent bundleEntryComponent = bundle.addEntry();
            bundleEntryComponent.setResource(task);
            if (id == null) {
                bundleEntryComponent.getRequest().setMethod(Bundle.HTTPVerb.POST).setUrl("Task");
            } else {
                task.setId(id);
                bundleEntryComponent.getRequest().setMethod(Bundle.HTTPVerb.PUT).setUrl("Task/" + id);
            }
        }
        return task;
    }
}
