package de.fraunhofer.isst.health.transit.service.merge;

import de.fraunhofer.isst.health.transit.ConstantsTransit;
import de.fraunhofer.isst.health.transit.spring.config.DmsProjectFileFhirClientConfig;
import de.fraunhofer.isst.health.transit.utils.ResultFormatter;
import de.fraunhofer.isst.health.transit.utils.projectfile.helper.MiiFhirComplexClientHelper;
import dev.dsf.bpe.v2.ProcessPluginApi;
import dev.dsf.bpe.v2.activity.ServiceTask;
import dev.dsf.bpe.v2.error.ErrorBoundaryEvent;
import dev.dsf.bpe.v2.variables.Variables;
import org.hl7.fhir.r4.model.OperationOutcome;
import org.hl7.fhir.r4.model.ResearchStudy;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CompleteProjectFileImplementation implements ServiceTask {
	private static final Logger LOGGER = Logger.getLogger(CompleteProjectFileImplementation.class.getName());
	private DmsProjectFileFhirClientConfig dmsProjectFileFhirClientConfig;

	public CompleteProjectFileImplementation(DmsProjectFileFhirClientConfig dmsProjectFileFhirClientConfig) {
		super();
        this.dmsProjectFileFhirClientConfig = dmsProjectFileFhirClientConfig;
	}

    @Override
    public void execute(ProcessPluginApi api, Variables variables) throws ErrorBoundaryEvent, Exception {
        LOGGER.log(Level.INFO, "Start CompleteProjectFileImplementation");

        String dupIdentifier = variables.getString(ConstantsTransit.DUPIDENTIFIER);

        MiiFhirComplexClientHelper fhirClient = new MiiFhirComplexClientHelper(api, dupIdentifier, dmsProjectFileFhirClientConfig);

        fhirClient.getDataUsageProject().setStatus(ResearchStudy.ResearchStudyStatus.COMPLETED);

        List<OperationOutcome.OperationOutcomeIssueComponent> problems =
                ResultFormatter.filterForError(fhirClient.updateToServer());

        if (!problems.isEmpty()) {
            LOGGER.log(Level.SEVERE, "Updating ResearchStudyStatus failed with " + problems.size() + " errors");
            for (OperationOutcome.OperationOutcomeIssueComponent issueComponent : problems) {
                LOGGER.log(Level.SEVERE, issueComponent.getSeverity().getDisplay() + " " + issueComponent.getDetails().getText());
            }
        } else {
            LOGGER.log(Level.INFO, "ResearchStudyStatus updated successfully");
        }
    }
}
