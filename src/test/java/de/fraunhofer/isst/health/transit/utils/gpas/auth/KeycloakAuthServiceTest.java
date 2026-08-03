package de.fraunhofer.isst.health.transit.utils.gpas.auth;

import org.junit.Assume;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.Assert.*;

public class KeycloakAuthServiceTest {

    private static final String TEST_CLIENT_ID = "test-client";
    private static final String TEST_CLIENT_SECRET = "test-secret";

    private static Properties properties;
    private static String keycloakUrl;
    private static String keycloakRealm;
    private static boolean checkKeycloakAvailable;

    @BeforeClass
    public static void loadProperties() throws Exception {
        properties = new Properties();
        try (InputStream is = KeycloakAuthServiceTest.class.getClassLoader().getResourceAsStream("application.properties")) {
            if (is != null) {
                properties.load(is);
            }
        }

        keycloakUrl = properties.getProperty("eu.datamanagementunit.transit.gpas.keycloak.server.url", "http://localhost:8081");
        keycloakRealm = properties.getProperty("eu.datamanagementunit.transit.gpas.keycloak.realm", "ttp");

        checkKeycloakAvailable = Boolean.parseBoolean(System.getProperty("check.keycloak.available", "true"));
    }

    private boolean isServiceAvailable(String url) {
        try {
            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setRequestMethod("HEAD");
            conn.setConnectTimeout(3000);
            conn.setReadTimeout(3000);
            int responseCode = conn.getResponseCode();
            return responseCode < 500;
        } catch (Exception e) {
            return false;
        }
    }

    private void assumeKeycloakAvailable() {
        if (checkKeycloakAvailable) {
            Assume.assumeTrue("Keycloak not available at " + keycloakUrl + "/realms/" + keycloakRealm,
                    isServiceAvailable(keycloakUrl + "/realms/" + keycloakRealm));
        }
    }

    @Test
    public void getAccessToken_returnsToken_whenNotExpiringSoon() {
        assumeKeycloakAvailable();
        KeycloakAuthService service = new KeycloakAuthService(
                keycloakUrl, keycloakRealm, TEST_CLIENT_ID, TEST_CLIENT_SECRET);
        service.setTokenForTesting("test-token-123", 300);

        String token = service.getAccessToken();

        assertEquals("test-token-123", token);
    }

    @Test
    public void getAccessToken_fetchesNewToken_whenExpired() {
        assumeKeycloakAvailable();
        KeycloakAuthService service = new KeycloakAuthService(
                keycloakUrl, keycloakRealm, TEST_CLIENT_ID, TEST_CLIENT_SECRET);
        service.setTokenForTesting("expired-token", -1);

        try {
            service.getAccessToken();
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            assertTrue(e.getMessage().contains("Failed to obtain access token"));
        }
    }

    @Test
    public void getAccessToken_fetchesNewToken_whenExpiringSoon() {
        assumeKeycloakAvailable();
        KeycloakAuthService service = new KeycloakAuthService(
                keycloakUrl, keycloakRealm, TEST_CLIENT_ID, TEST_CLIENT_SECRET);
        service.setTokenForTesting("about-to-expire", 30);

        try {
            service.getAccessToken();
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            assertTrue(e.getMessage().contains("Failed to obtain access token"));
        }
    }

    @Test
    public void concurrentAccess_doesNotCauseIssues() throws Exception {
        assumeKeycloakAvailable();
        KeycloakAuthService service = new KeycloakAuthService(
                keycloakUrl, keycloakRealm, TEST_CLIENT_ID, TEST_CLIENT_SECRET);

        int threadCount = 5;
        CountDownLatch startLatch = new CountDownLatch(1);
        CountDownLatch doneLatch = new CountDownLatch(threadCount);
        AtomicReference<Exception> error = new AtomicReference<>();

        Thread[] threads = new Thread[threadCount];

        for (int i = 0; i < threadCount; i++) {
            threads[i] = new Thread(() -> {
                try {
                    startLatch.await();
                    service.setTokenForTesting("concurrent-test-token", 300);
                    String token = service.getAccessToken();
                    assertEquals("concurrent-test-token", token);
                } catch (Exception e) {
                    error.set(e);
                } finally {
                    doneLatch.countDown();
                }
            });
            threads[i].start();
        }

        startLatch.countDown();
        doneLatch.await();

        if (error.get() != null) {
            throw error.get();
        }
    }
}