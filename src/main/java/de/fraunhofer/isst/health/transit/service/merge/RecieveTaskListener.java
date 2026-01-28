package de.fraunhofer.isst.health.transit.service.merge;

import dev.dsf.bpe.v1.ProcessPluginApi;
import dev.dsf.bpe.v1.activity.AbstractServiceDelegate;
import dev.dsf.bpe.v1.variables.Variables;
import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;

import java.util.logging.Level;
import java.util.logging.Logger;

public class RecieveTaskListener extends AbstractServiceDelegate
{

    private static final Logger LOGGER = Logger.getLogger(RecieveTaskListener.class.getName());

	public RecieveTaskListener(ProcessPluginApi api)
	{
		super(api);
	}

	@Override
	protected void doExecute(DelegateExecution delegateExecution, Variables variables) throws BpmnError, Exception
	{

		LOGGER.log(Level.INFO, "Started Camunda Implementation RecieveTaskListener");

		LOGGER.info("ActivityId : " + delegateExecution.getCurrentActivityId());
		LOGGER.info("ActivityName : " + delegateExecution.getCurrentActivityName());

		switch (delegateExecution.getCurrentActivityId()) {
			case "reportContainerCreation" -> {
				LOGGER.info("ReportContainerCreationTask businessKey : " + delegateExecution.getBusinessKey());
				LOGGER.info("ReportContainerCreationTask activityId : " + delegateExecution.getCurrentActivityId());
			}
			case "receiveDataSet" -> {
				LOGGER.info("ReceiveDataSetTask businessKey : " + delegateExecution.getBusinessKey());
				LOGGER.info("ReceiveDataSetTask activityId : " + delegateExecution.getCurrentActivityId());
			}
			case "fhirStoreDeletion" -> {
				LOGGER.info("FhirStoreDeletionTask businessKey : " + delegateExecution.getBusinessKey());
				LOGGER.info("FhirStoreDeletionTask activityId : " + delegateExecution.getCurrentActivityId());
			}
			default -> {
				LOGGER.info("Unknown CurrentActivityName: " + delegateExecution.getCurrentActivityName());
			}
		}
	}
}
