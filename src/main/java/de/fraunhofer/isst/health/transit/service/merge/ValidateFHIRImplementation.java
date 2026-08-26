package de.fraunhofer.isst.health.transit.service.merge;

import de.fraunhofer.isst.health.transit.ConstantsTransit;
import de.fraunhofer.isst.health.transit.models.BundleObject;
import dev.dsf.bpe.v2.ProcessPluginApi;
import dev.dsf.bpe.v2.activity.ServiceTask;
import dev.dsf.bpe.v2.error.ErrorBoundaryEvent;
import dev.dsf.bpe.v2.variables.Variables;
import org.hl7.fhir.r5.elementmodel.Manager;
import org.hl7.fhir.r5.model.ImplementationGuide;
import org.hl7.fhir.r5.model.OperationOutcome;
import org.hl7.fhir.utilities.FhirPublication;
import org.hl7.fhir.validation.ValidationEngine;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ValidateFHIRImplementation implements ServiceTask {
    private static final Logger LOGGER = Logger.getLogger(ValidateFHIRImplementation.class.getName());

    public ValidateFHIRImplementation() {
        super();
    }

    @Override
    public void execute(ProcessPluginApi processPluginApi, Variables variables) throws ErrorBoundaryEvent, Exception {
        LOGGER.log(Level.INFO, "Start ValidateFHIRImplementation");
        String dizId = variables.getString(ConstantsTransit.CURRENTDIZID);
        String key = variables.getBusinessKey() + ConstantsTransit.DIZSEPERATOR + dizId;
        variables.setStringLocal(ConstantsTransit.ERRORCOUNT + ConstantsTransit.DIZSEPERATOR + key, "0");
        LOGGER.log(Level.INFO, "Validation skipped");
    }

    private OperationOutcome validate(BundleObject bundleObject) {
        try {
            ValidationEngine validationEngine = new ValidationEngine.ValidationEngineBuilder().fromSource("hl7.fhir.r4.core");

            //This allows the validator to continue while the server is down. It will create errors because no CodeSystem is
            // known, but it will not crash
            validationEngine.getContext().setCanRunWithoutTerminology(true);

            validationEngine.connectToTSServer(
                    "http://tx.fhir.org",
                    "",
                    FhirPublication.R4);

            StringBuilder message = new StringBuilder("Started validation against following IGs: FhirR4");

            for (ImplementationGuide implementationGuide : validationEngine.getIgs()) {
                message.append("; ").append(implementationGuide.getName());
            }

            LOGGER.log(Level.INFO, message.toString());

            switch (bundleObject.getContentType()) {
                case "application/fhir+json" -> {
                    return validationEngine.validate(Manager.FhirFormat.JSON,
                            new ByteArrayInputStream(bundleObject.getBundle().getBytes()), new ArrayList<>());
                }
                case "application/fhir+xml" -> {
                    return validationEngine.validate(Manager.FhirFormat.XML,
                            new ByteArrayInputStream(bundleObject.getBundle().getBytes()), new ArrayList<>());
                }
                default -> LOGGER.log(Level.SEVERE, "Unknown ContentType for incoming Bundle!");
            }

        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Validation failed with Exception of type "
                    + e.getClass() + " and could not be completed: " + e.getMessage());
            e.printStackTrace();
        }
        return null;
    }

}
