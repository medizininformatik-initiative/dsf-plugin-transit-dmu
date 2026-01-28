package de.fraunhofer.isst.health.transit.utils.projectfile.mii;

import de.fraunhofer.isst.health.transit.spring.config.DmsProjectFileFhirClientConfig;
import de.fraunhofer.isst.health.transit.utils.projectfile.enums.ESearchableResource;
import de.fraunhofer.isst.health.transit.utils.projectfile.helper.MiiFhirComplexClientHelper;
import org.hl7.fhir.r4.model.*;

import java.util.ArrayList;

public class MIIPersonGroup {
    private String id;
    private String dsfId;
    private ArrayList<MIIPerson> researcher;
    private DmsProjectFileFhirClientConfig config;
    private boolean hasChanged;
    public MIIPersonGroup(Group group, MiiFhirComplexClientHelper helper) {
        this.id = group.getIdElement().getIdPart();
        this.config = helper.getConfig();
        this.dsfId = group.getIdentifierFirstRep().getValue();
        this.researcher = new ArrayList<>();
        if (!group.getMember().isEmpty()) {
            for (Group.GroupMemberComponent member: group.getMember()) {
                HTTPResponseObject responseObject =
                        helper.searchByIdentifier(member.getEntity().getIdentifier().getValue(),
                                ESearchableResource.PRACTITIONER);
                if (responseObject.hasResource()) {
                    researcher.add(new MIIPerson((Practitioner) responseObject.getResource(), config));
                }
            }
        }
        hasChanged = false;
    }
    public MIIPersonGroup(String identifier, MiiFhirComplexClientHelper helper) {
        dsfId = identifier;
        config = helper.getConfig();
        this.researcher = new ArrayList<>();
        hasChanged = true;
    }
    public String getId() {
        return id;
    }
    public boolean hasId() {
        return !(id == null);
    }
    public String getDsfId() {
        return dsfId;
    }

    public void setDsfId(String dsfId) {
        this.hasChanged = true;
        this.dsfId = dsfId;
    }
    public boolean addResearcher(MIIPerson person) {
        this.hasChanged = true;
        return researcher.add(person);
    }
    public ArrayList<MIIPerson> getResearcher() {
        return researcher;
    }
    public void setResearcher(ArrayList<MIIPerson> researcher) {
        this.hasChanged = true;
        this.researcher = researcher;
    }

    public Group toFhir(Bundle bundle) {
        Group group = new Group();
        group.getMeta().addProfile("http://datamanagementunit.eu/fhir/StructureDefinition/ParticipantGroup");
        group.setActual(true);
        group.setType(Group.GroupType.PRACTITIONER);
        group.getIdentifierFirstRep().setValue(dsfId).setSystem(config.getGroupSystem());

        String narrativeString = "Identifier: " + config.getGroupSystem() + "/" + dsfId + "\n";
        group.getText().setDivAsString(narrativeString);
        group.getText().setStatus(Narrative.NarrativeStatus.GENERATED);

        for (MIIPerson p : researcher) {
            group.addMember().setEntity(
                    new Reference().setIdentifier(
                            new Identifier().setSystem(config.getResearcherSystem()).setValue(p.getDsfId())));
            p.toFhir(bundle);
        }
        if (hasChanged) {
            Bundle.BundleEntryComponent bundleEntryComponent = bundle.addEntry();
            bundleEntryComponent.setResource(group);
            if (id == null) {
                bundleEntryComponent.getRequest().setMethod(Bundle.HTTPVerb.POST).setUrl("Group");
            } else {
                group.setId(id);
                bundleEntryComponent.getRequest().setMethod(Bundle.HTTPVerb.PUT).setUrl("Group/" + id);
            }
        }
        return group;
    }
}
