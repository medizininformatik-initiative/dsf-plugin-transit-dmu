package de.fraunhofer.isst.health.transit.utils;

import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Identifier;
import org.hl7.fhir.r4.model.Property;
import org.hl7.fhir.r4.model.ResourceType;

import java.util.List;

public class RemoveIdentifierUtil
{

    public static void removeIdentifier(Bundle bundleObject) {
        //Iterate over all entries of inner Bundle
        for (int i = 0; i < bundleObject.getEntry().size(); i++) {

            //Remove Identifier if not a Patient
            if (bundleObject.getEntry().get(i).getResource().getResourceType() != ResourceType.Patient) {
                searchForIdentifier(bundleObject.getEntry().get(i).getResource().children());
            }
        }
    }

    private static void searchForIdentifier(List<Property> values) {

        for (Property value : values) {
            if (value.hasValues() && value.getTypeCode().startsWith("Identifier")) {

                ((Identifier) value.getValues().getFirst())
                        .setUse(null)
                        .setType(null)
                        .setSystem(null)
                        .setValue(null)
                        .setPeriod(null)
                        .setAssigner(null)
                        .setAssignerTarget(null)
                        .setId(null)
                        .setExtension(null)
                        .setDisallowExtensions(false);

                break;
            }
        }
    }

}
