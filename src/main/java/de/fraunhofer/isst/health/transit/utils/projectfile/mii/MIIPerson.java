package de.fraunhofer.isst.health.transit.utils.projectfile.mii;

import de.fraunhofer.isst.health.transit.spring.config.DmsProjectFileFhirClientConfig;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Narrative;
import org.hl7.fhir.r4.model.Practitioner;

public class MIIPerson {

    //region Member

    private String id;
    private String dsfId;
    private String name;
    private String firstName;
    private DmsProjectFileFhirClientConfig config;
    private boolean hasChanged;
    //endregion

    public MIIPerson(String dsfId, DmsProjectFileFhirClientConfig config) {
        this.dsfId = dsfId;
        this.config = config;
        hasChanged = true;
    }
    public MIIPerson(Practitioner practitioner, DmsProjectFileFhirClientConfig config) {
        this.id = practitioner.getIdElement().getIdPart();
        this.dsfId = practitioner.getIdentifierFirstRep().getValue();
        this.config = config;
        if (practitioner.hasName()) {
            if (practitioner.getNameFirstRep().hasFamily()) {
                name = practitioner.getNameFirstRep().getFamily();
            }
            if (practitioner.getNameFirstRep().hasGiven()) {
                firstName = practitioner.getNameFirstRep().getGivenAsSingleString();
            }
        }
        hasChanged = false;
    }
    //region Getter&Setter


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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.hasChanged = true;
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.hasChanged = true;
        this.firstName = firstName;
    }
    //endregion

    public Practitioner toFhir(Bundle bundle) {
        Practitioner practitioner = new Practitioner();
        practitioner.getMeta().addProfile("http://datamanagementunit.eu/fhir/StructureDefinition/PractitionerStorage");
        practitioner.getIdentifierFirstRep().setSystem(config.getResearcherSystem()).setValue(dsfId);

        String narrativeString = "Identifier: " + config.getResearcherSystem() + "/" + dsfId + "\n";
        if (name != null) {
            practitioner.getNameFirstRep().setFamily(name);
            narrativeString += "Familyname: " + name + "\n";
        }
        if (firstName != null) {
            practitioner.getNameFirstRep().addGiven(firstName);
            narrativeString += "Name: " + firstName + "\n";
        }
        practitioner.getText().setDivAsString(narrativeString);
        practitioner.getText().setStatus(Narrative.NarrativeStatus.GENERATED);

        if (hasChanged) {
            Bundle.BundleEntryComponent bundleEntryComponent = bundle.addEntry();
            bundleEntryComponent.setResource(practitioner);
            if (id == null) {
                bundleEntryComponent.getRequest().setMethod(Bundle.HTTPVerb.POST).setUrl("Practitioner");
            } else {
                practitioner.setId(id);
                bundleEntryComponent.getRequest().setMethod(Bundle.HTTPVerb.PUT).setUrl("Practitioner/" + id);
            }
        }
        return practitioner;
    }
}
