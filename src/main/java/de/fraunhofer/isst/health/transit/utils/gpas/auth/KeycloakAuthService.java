package de.fraunhofer.isst.health.transit.utils.gpas.auth;

import java.util.Base64;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class KeycloakAuthService {

    private static final Logger LOGGER = Logger.getLogger(KeycloakAuthService.class.getName());
    private static final long REFRESH_BEFORE_EXPIRY_SECONDS = 60;

    private final String serverUrl;
    private final String realm;
    private final String clientId;
    private final String clientSecret;

    private final AtomicReference<TokenInfo> currentToken = new AtomicReference<>();
    private final ObjectMapper objectMapper = new ObjectMapper();

    public KeycloakAuthService(String serverUrl, String realm, String clientId, String clientSecret) {
        this.serverUrl = serverUrl;
        this.realm = realm;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    public String getAccessToken() {
        TokenInfo token = currentToken.get();

        if (token != null && !token.isExpiringSoon()) {
            return token.accessToken;
        }

        synchronized (this) {
            token = currentToken.get();
            if (token != null && !token.isExpiringSoon()) {
                return token.accessToken;
            }

            LOGGER.info("Refreshing Keycloak access token for GPAS SOAP");
            try {
                token = fetchNewToken();
                currentToken.set(token);
                return token.accessToken;
            } catch (Exception e) {
                LOGGER.log(Level.SEVERE, "Failed to obtain access token from Keycloak", e);
                throw new RuntimeException("Failed to obtain access token from Keycloak", e);
            }
        }
    }

    private TokenInfo fetchNewToken() throws Exception {
        String tokenUrl = serverUrl + "/realms/" + realm + "/protocol/openid-connect/token";

        String credentials = clientId + ":" + clientSecret;
        String encodedCredentials = Base64.getEncoder().encodeToString(credentials.getBytes());

        String body = "grant_type=client_credentials"
                + "&client_id=" + clientId
                + "&client_secret=" + clientSecret;

        java.net.URL url = new java.net.URL(tokenUrl);
        java.net.HttpURLConnection conn = (java.net.HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Authorization", "Basic " + encodedCredentials);
        conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        conn.setDoOutput(true);

        try (java.io.OutputStream os = conn.getOutputStream()) {
            os.write(body.getBytes());
        }

        int responseCode = conn.getResponseCode();
        if (responseCode != 200) {
            throw new RuntimeException("Keycloak token request failed with status: " + responseCode);
        }

        String response;
        try (java.io.BufferedReader br = new java.io.BufferedReader(
                new java.io.InputStreamReader(conn.getInputStream()))) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            response = sb.toString();
        }

        JsonNode json = objectMapper.readTree(response);
        String accessToken = json.get("access_token").asText();
        long expiresIn = json.get("expires_in").asLong();

        return new TokenInfo(accessToken, expiresIn);
    }

    private static class TokenInfo {
        final String accessToken;
        final long expiresIn;
        final long obtainedAt;
        final long expiresAt;

        TokenInfo(String accessToken, long expiresIn) {
            this.accessToken = accessToken;
            this.expiresIn = expiresIn;
            this.obtainedAt = System.currentTimeMillis();
            if (expiresIn > 0) {
                this.expiresAt = obtainedAt + (expiresIn * 1000);
            } else {
                this.expiresAt = obtainedAt - 1;
            }
        }

        boolean isExpiringSoon() {
            long now = System.currentTimeMillis();
            return (expiresAt - now) < (REFRESH_BEFORE_EXPIRY_SECONDS * 1000);
        }
    }

    void setTokenForTesting(String accessToken, long expiresIn) {
        this.currentToken.set(new TokenInfo(accessToken, expiresIn));
    }
}