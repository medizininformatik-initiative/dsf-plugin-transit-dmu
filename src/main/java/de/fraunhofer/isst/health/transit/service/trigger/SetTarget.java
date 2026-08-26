package de.fraunhofer.isst.health.transit.service.trigger;


import dev.dsf.bpe.v2.ProcessPluginApi;
import dev.dsf.bpe.v2.activity.ServiceTask;
import dev.dsf.bpe.v2.error.ErrorBoundaryEvent;
import dev.dsf.bpe.v2.variables.Variables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SetTarget implements ServiceTask
{
	private static final Logger logger = LoggerFactory.getLogger(SetTarget.class);

	public SetTarget() {
        super();
	}

    @Override
    public void execute(ProcessPluginApi api, Variables variables) throws ErrorBoundaryEvent, Exception {
        variables.setTarget(
                variables.createTarget(api.getOrganizationProvider().getLocalOrganizationIdentifierValue().get(),
                        api.getEndpointProvider().getLocalEndpointIdentifierValue().get(),
                        api.getEndpointProvider().getLocalEndpointAddress()));
    }
}
