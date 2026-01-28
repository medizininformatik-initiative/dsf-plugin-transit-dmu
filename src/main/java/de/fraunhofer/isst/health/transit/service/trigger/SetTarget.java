package de.fraunhofer.isst.health.transit.service.trigger;

import dev.dsf.bpe.v1.ProcessPluginApi;
import dev.dsf.bpe.v1.activity.AbstractServiceDelegate;
import dev.dsf.bpe.v1.variables.Variables;
import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SetTarget extends AbstractServiceDelegate
{
	private static final Logger logger = LoggerFactory.getLogger(SetTarget.class);

	public SetTarget(ProcessPluginApi api)
	{
		super(api);
	}

	@Override
	protected void doExecute(DelegateExecution execution, Variables variables) throws BpmnError, Exception
	{
		variables.setTarget(
				variables.createTarget(api.getOrganizationProvider().getLocalOrganizationIdentifierValue().get(),
						api.getEndpointProvider().getLocalEndpointIdentifierValue().get(),
						api.getEndpointProvider().getLocalEndpointAddress()));
	}

}
