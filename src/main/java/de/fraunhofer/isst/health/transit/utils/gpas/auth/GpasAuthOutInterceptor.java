package de.fraunhofer.isst.health.transit.utils.gpas.auth;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.apache.cxf.message.Message;
import org.apache.cxf.phase.Phase;

import org.apache.cxf.phase.AbstractPhaseInterceptor;

// 1. Extend AbstractPhaseInterceptor instead of implementing Interceptor
public class GpasAuthOutInterceptor extends AbstractPhaseInterceptor<Message> {

    private static final Logger LOGGER = Logger.getLogger(GpasAuthOutInterceptor.class.getName());

    private final KeycloakAuthService authService;

    public GpasAuthOutInterceptor(KeycloakAuthService authService) {
        // 2. Call super() with the desired phase. Phase.SETUP is standard for adding headers.
        super(Phase.SETUP);
        this.authService = authService;
    }

    @Override
    public void handleMessage(Message message) {
        @SuppressWarnings("unchecked")
        Map<String, List<String>> headers = (Map<String, List<String>>) message.get(Message.PROTOCOL_HEADERS);

        if (headers != null && headers.containsKey("Authorization")) {
            LOGGER.fine("Authorization header already present");
            return;
        }

        try {
            String accessToken = authService.getAccessToken();
            if (headers == null) {
                // CXF requires a mutable map for headers if one doesn't exist
                headers = new HashMap<>();
                message.put(Message.PROTOCOL_HEADERS, headers);
            }
            headers.put("Authorization", List.of("Bearer " + accessToken));
            LOGGER.fine("Added Authorization header to GPAS SOAP request");
        } catch (Exception e) {
            LOGGER.severe("Failed to add Authorization header: " + e.getMessage());
        }
    }

    @Override
    public void handleFault(Message message) {
        // Usually left blank unless you need specific fault handling
    }
}