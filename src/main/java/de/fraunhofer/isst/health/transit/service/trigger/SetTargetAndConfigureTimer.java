package de.fraunhofer.isst.health.transit.service.trigger;

import dev.dsf.bpe.v1.ProcessPluginApi;
import dev.dsf.bpe.v1.activity.AbstractServiceDelegate;
import dev.dsf.bpe.v1.variables.Variables;
import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import static de.fraunhofer.isst.health.transit.ConstantsTransit.*;

public class SetTargetAndConfigureTimer extends AbstractServiceDelegate
{
	private static final Logger logger = LoggerFactory.getLogger(SetTargetAndConfigureTimer.class);

	public SetTargetAndConfigureTimer(ProcessPluginApi api)
	{
		super(api);
	}

	@Override
	protected void doExecute(DelegateExecution execution, Variables variables) throws BpmnError, Exception
	{
		String timerInterval = getTimerInterval(variables);

		String timerFrom = variables.getString(BPMN_EXECUTION_VARIABLE_FROM);
		String timerNow;
		if(timerFrom == null)
		{
			// Extract the timer from camunda variable
			String durationPart = timerInterval.substring(timerInterval.indexOf("/PT") + 1); // e.g. "PT5M"
			Duration duration = Duration.parse(durationPart);
			ZonedDateTime now = ZonedDateTime.now(ZoneId.systemDefault());
			ZonedDateTime since = now.minus(duration);
			timerFrom = since.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
			timerNow = now.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
		}else {
			timerFrom = variables.getString(BPMN_EXECUTION_VARIABLE_CURRENT);
			ZonedDateTime now = ZonedDateTime.now(ZoneId.systemDefault());
			timerNow = now.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
		}
		logger.info("Time to query from: '{}'", timerFrom);
		variables.setString(BPMN_EXECUTION_VARIABLE_FROM, timerFrom);
		logger.info("Current time: '{}'", timerNow);
		variables.setString(BPMN_EXECUTION_VARIABLE_CURRENT, timerNow);

		variables.setString(BPMN_EXECUTION_VARIABLE_TIMER_INTERVAL, timerInterval);
		variables.setTarget(
				variables.createTarget(api.getOrganizationProvider().getLocalOrganizationIdentifierValue().get(),
						api.getEndpointProvider().getLocalEndpointIdentifierValue().get(),
						api.getEndpointProvider().getLocalEndpointAddress()));
	}

	private String getTimerInterval(Variables variables)
	{
		return api.getTaskHelper()
				.getFirstInputParameterStringValue(variables.getStartTask(), CODESYSTEM_DMU_TOOLS,
						CODESYSTEM_TIMER_INTERVAL)
				.orElse(TIMER_INTERVAL_DEFAULT_VALUE);
	}
}
