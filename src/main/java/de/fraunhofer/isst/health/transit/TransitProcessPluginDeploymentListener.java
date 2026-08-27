package de.fraunhofer.isst.health.transit;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.InitializingBean;

import dev.dsf.bpe.v2.ProcessPluginDeploymentListener;

public class TransitProcessPluginDeploymentListener
        implements ProcessPluginDeploymentListener, InitializingBean {

    private static final Logger LOGGER = Logger.getLogger(TransitProcessPluginDeploymentListener.class.getName());

    @Override
    public void afterPropertiesSet() {
    }

    @Override
    public void onProcessesDeployed(List<String> activeProcesses) {
        if (isTransitProcess(activeProcesses)) {
            LOGGER.info("Transit processes deployed - GPAS health check handled by GpasManagerConfig");
        }
    }

    private boolean isTransitProcess(List<String> activeProcesses) {
        return activeProcesses.contains(ConstantsTransit.PROCESS_NAME_FULL_TRANSIT) ||
               activeProcesses.contains(ConstantsTransit.PROCESS_NAME_FULL_TRANSIT_TRIGGER);
    }
}