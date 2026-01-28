package de.fraunhofer.isst.health.transit.utils.projectfile.mii;


import de.fraunhofer.isst.health.transit.spring.config.DmsProjectFileFhirClientConfig;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Location;
import org.hl7.fhir.r4.model.Narrative;

public class MIIOrganisation {

    //region Member

    private String id;
    private String dsfId;
    private String title;
    private DmsProjectFileFhirClientConfig config;
    private boolean hasChanged;
    //endregion

    public MIIOrganisation(String dsfId, DmsProjectFileFhirClientConfig config) {
        this.config = config;
        this.dsfId = dsfId;
        hasChanged = true;
    }
    public MIIOrganisation(Location location, DmsProjectFileFhirClientConfig config) {
        this.config = config;
        this.id = location.getIdElement().getIdPart();
        this.dsfId = location.getIdentifierFirstRep().getValue();
        hasChanged = false;
        if (location.hasName()) {
            title = location.getName();
        }
    }
    //region Getter&Setter

    public String getId() {
        return  id;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.hasChanged = true;
        this.title = title;
    }

    //endregion
    public Location toFhir(Bundle bundle) {
        Location location = new Location();

        String narrativeString = "Identifier: " + config.getDizSystem() + "/" + dsfId + "\n";
        if (title != null) {
            location.setName(title);
            narrativeString += "Name: " + title;
        }
        location.getText().setDivAsString(narrativeString);
        location.getText().setStatus(Narrative.NarrativeStatus.GENERATED);
        location.getMeta().addProfile("http://datamanagementunit.eu/fhir/StructureDefinition/DIZStorage");
        location.getIdentifierFirstRep().setSystem(config.getDizSystem()).setValue(dsfId);

        if (hasChanged) {
            Bundle.BundleEntryComponent bundleEntryComponent = bundle.addEntry();
            bundleEntryComponent.setResource(location);
            if (id == null) {
                bundleEntryComponent.getRequest().setMethod(Bundle.HTTPVerb.POST).setUrl("Location");
            } else {
                location.setId(id);
                bundleEntryComponent.getRequest().setMethod(Bundle.HTTPVerb.PUT).setUrl("Location/" + id);
            }
        }
        return location;
    }
}
