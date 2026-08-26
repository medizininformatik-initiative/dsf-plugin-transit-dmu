package de.fraunhofer.isst.health.transit.service.merge;


import dev.dsf.bpe.v2.ProcessPluginApi;
import dev.dsf.bpe.v2.activity.ServiceTask;
import dev.dsf.bpe.v2.error.ErrorBoundaryEvent;
import dev.dsf.bpe.v2.variables.Variables;

import java.util.logging.Level;
import java.util.logging.Logger;

public class RecieveTaskListener implements ServiceTask
{

    private static final Logger LOGGER = Logger.getLogger(RecieveTaskListener.class.getName());

	public RecieveTaskListener()
	{
		super();
	}

    @Override
    public void execute(ProcessPluginApi api, Variables variables) throws ErrorBoundaryEvent, Exception {
        LOGGER.log(Level.INFO, "Started Camunda Implementation RecieveTaskListener");

        LOGGER.info("ActivityId : " + variables.getCurrentActivityId());
        //LOGGER.info("ActivityName : " + variables.getCurrentActivityName());

        switch (variables.getCurrentActivityId()) {
            case "reportContainerCreation" -> {
                LOGGER.info("ReportContainerCreationTask businessKey : " + variables.getBusinessKey());
                LOGGER.info("ReportContainerCreationTask activityId : " + variables.getCurrentActivityId());
            }
            case "receiveDataSet" -> {
                LOGGER.info("ReceiveDataSetTask businessKey : " + variables.getBusinessKey());
                LOGGER.info("ReceiveDataSetTask activityId : " + variables.getCurrentActivityId());
            }
            case "fhirStoreDeletion" -> {
                LOGGER.info("FhirStoreDeletionTask businessKey : " + variables.getBusinessKey());
                LOGGER.info("FhirStoreDeletionTask activityId : " + variables.getCurrentActivityId());
            }
            default -> {
                //LOGGER.info("Unknown CurrentActivityName: " + variables.getCurrentActivityName());
                LOGGER.info("Unknown CurrentActivityId: " + variables.getCurrentActivityId());
            }
        }
    }


}
