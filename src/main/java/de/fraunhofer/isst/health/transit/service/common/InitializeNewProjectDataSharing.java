package de.fraunhofer.isst.health.transit.service.common;

import de.fraunhofer.isst.health.transit.ConstantsTransit;
import de.fraunhofer.isst.health.transit.models.DIZLocation;
import de.fraunhofer.isst.health.transit.models.Participant;
import de.fraunhofer.isst.health.transit.models.TaskObject;
import org.hl7.fhir.r4.model.*;

import java.util.logging.Logger;

public final class InitializeNewProjectDataSharing
{
    private static final Logger LOGGER = Logger.getLogger(InitializeNewProjectDataSharing.class.getName());

    private InitializeNewProjectDataSharing() { }

    public static TaskObject generateTaskObject(Task task) {
        TaskObject taskObject = new TaskObject();

        taskObject.setTaskId(task.getIdElement().getIdPart());
        taskObject.setProjectStartDate(task.getAuthoredOnElement().getValueAsString());
        taskObject.setTaskCreationDate(task.getAuthoredOnElement().getValueAsString());
        for (Task.ParameterComponent input: task.getInput()) {
            switch (input.getType().getCodingFirstRep().getSystem()) {
                case ConstantsTransit.DSF_TASK_CODESYSTEM_BPMNMESSAGE, ConstantsTransit.DSF_TASK_CODESYSTEM_BPMNMESSAGE_OLD -> {
                    switch (input.getType().getCodingFirstRep().getCode()) {
                        case ConstantsTransit.DSF_TASK_BPMNMESSAGE_MESSAGENAME -> {
                            StringType messageName = (StringType) input.getValue();
                            taskObject.setMessageName(messageName.getValue());
                        }
                        case ConstantsTransit.DSF_TASK_BPMNMESSAGE_BUSINESSKEY -> {
                            StringType businessKey = (StringType) input.getValue();
                            taskObject.setBusinessKey(businessKey.getValue());
                        }
                        default -> LOGGER.info("Input type combination of system "
                                + input.getType().getCodingFirstRep().getSystem()
                                + " and code "
                                + input.getType().getCodingFirstRep().getCode()
                                + " is unknown and was ignored");
                    }
                }
                case ConstantsTransit.DSF_TASK_CODESYSTEM_DATASHARING -> {
                    switch (input.getType().getCodingFirstRep().getCode()) {
                        case ConstantsTransit.DSF_TASK_DATASHARING_DIC_CORRELATION -> {
                            Extension extension = input.getExtensionByUrl(ConstantsTransit.DSF_TASK_DATASHARING_DIC_IDENTIFIER);
                            if (extension == null) {
                                extension = input.getExtensionByUrl(ConstantsTransit.DSF_TASK_DATASHARING_DIC_IDENTIFIER2);
                            }
                            Reference reference = (Reference) extension.getValue();
                            DIZLocation dizLocation = new DIZLocation();
                            dizLocation.setIdentifierValue(reference.getIdentifier().getValue());
                            taskObject.addDIZLocation(dizLocation);
                        }
                        case ConstantsTransit.DSF_TASK_DATASHARING_PROJECTIDENTIFIER -> {
                            Identifier identifier = (Identifier) input.getValue();
                            taskObject.setDupIdentifier(identifier.getValue());
                        }
                        case ConstantsTransit.DSF_TASK_DATASHARING_CONTRACTLOCATION -> {
                            UrlType url = (UrlType) input.getValue();
                            taskObject.setContractLocation(url.getValue());
                        }
                        case ConstantsTransit.DSF_TASK_DATASHARING_RESEARCHERIDENTIFIER -> {
                            Identifier practitionerIdentifier = (Identifier) input.getValue();
                            Participant participant = new Participant();
                            participant.setIdentifierSystem(practitionerIdentifier.getSystem());
                            participant.setIdentifierValue(practitionerIdentifier.getValue());
                            taskObject.addParticipant(participant);
                        }
                        case ConstantsTransit.DSF_TASK_DATASHARING_PROJECTTITLE -> {
                            StringType title = (StringType) input.getValue();
                            taskObject.setDupTitle(title.getValue());
                        }
                        default -> LOGGER.info("Input type combination of system "
                                + input.getType().getCodingFirstRep().getSystem()
                                + " and code "
                                + input.getType().getCodingFirstRep().getCode()
                                + " is unknown and was ignored");
                    }
                }
                default -> LOGGER.info("Input type combination of system "
                        + input.getType().getCodingFirstRep().getSystem()
                        + " and code "
                        + input.getType().getCodingFirstRep().getCode()
                        + " is unknown and was ignored");
            }
        }
        return taskObject;
    }
}
