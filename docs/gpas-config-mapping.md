# GPAS Configuration Mapping

This document maps the Docker Compose environment variables to Spring Boot properties used in the Transit DSF plugin.

## Environment Variable to Spring Property Mapping

| Docker Compose (env) | Spring Property | Description |
|---------------------|-----------------|-------------|
| `EU_DATAMANAGEMENTUNIT_TRANSIT_GPAS_URL` | `eu.datamanagementunit.transit.gpas.url` | Base URL of the GPAS server (e.g., `http://gpas:8080/gpas`) |
| `EU_DATAMANAGEMENTUNIT_TRANSIT_GPAS_KEYCLOAK_ENABLE` | `eu.datamanagementunit.transit.gpas.keycloak.enable` | Enable Keycloak authentication for GPAS SOAP (default: `false`) |
| `EU_DATAMANAGEMENTUNIT_TRANSIT_GPAS_KEYCLOAK_CLIENT_ID` | `eu.datamanagementunit.transit.gpas.keycloak.client.id` | Keycloak client ID for GPAS SOAP authentication |
| `EU_DATAMANAGEMENTUNIT_TRANSIT_GPAS_KEYCLOAK_CLIENT_SECRET` | `eu.datamanagementunit.transit.gpas.keycloak.client.secret` | Keycloak client secret for GPAS SOAP authentication |
| `EU_DATAMANAGEMENTUNIT_TRANSIT_GPAS_KEYCLOAK_SERVER_URL` | `eu.datamanagementunit.transit.gpas.keycloak.server.url` | Keycloak server URL (e.g., `http://keycloak:8081`) |
| `EU_DATAMANAGEMENTUNIT_TRANSIT_GPAS_KEYCLOAK_REALM` | `eu.datamanagementunit.transit.gpas.keycloak.realm` | Keycloak realm (e.g., `ttp`) |

## dmu-gpas to Transit Plugin Mapping

The following table maps the dmu-gpas environment variables to the Transit plugin properties:

| dmu-gpas (ttp_gpas.env) | Transit Plugin Spring Property |
|------------------------|--------------------------------|
| `TTP_GPAS_SOAP_KEYCLOAK_ENABLE=true` | `eu.datamanagementunit.transit.gpas.keycloak.enable=true` |
| `TTP_KEYCLOAK_SERVER_URL` | `eu.datamanagementunit.transit.gpas.keycloak.server.url` |
| `TTP_KEYCLOAK_REALM` | `eu.datamanagementunit.transit.gpas.keycloak.realm` |
| `TTP_SOAP_KEYCLOAK_CLIENT_ID` | `eu.datamanagementunit.transit.gpas.keycloak.client.id` |
| `TTP_SOAP_KEYCLOAK_CLIENT_SECRET` | `eu.datamanagementunit.transit.gpas.keycloak.client.secret` |

## Example Docker Compose Configuration

```yaml
services:
  gpas:
    # ...

  keycloak:
    # ...

  transit-dmu:
    environment:
      EU_DATAMANAGEMENTUNIT_TRANSIT_GPAS_URL: "http://gpas:8080/gpas"
      EU_DATAMANAGEMENTUNIT_TRANSIT_GPAS_KEYCLOAK_ENABLE: "true"
      EU_DATAMANAGEMENTUNIT_TRANSIT_GPAS_KEYCLOAK_CLIENT_ID: "soap"
      EU_DATAMANAGEMENTUNIT_TRANSIT_GPAS_KEYCLOAK_CLIENT_SECRET: "soap-client-secret"
      EU_DATAMANAGEMENTUNIT_TRANSIT_GPAS_KEYCLOAK_SERVER_URL: "http://keycloak:8081"
      EU_DATAMANAGEMENTUNIT_TRANSIT_GPAS_KEYCLOAK_REALM: "ttp"
```

## Test Configuration

The test configuration is located at `src/test/resources/application.properties`:

```properties
eu.datamanagementunit.transit.gpas.url=http://localhost:8080/gpas
eu.datamanagementunit.transit.gpas.keycloak.enable=true
eu.datamanagementunit.transit.gpas.keycloak.client.id=gpas-domain-admin
eu.datamanagementunit.transit.gpas.keycloak.client.secret=domain-admin-client-secret
eu.datamanagementunit.transit.gpas.keycloak.server.url=http://localhost:8081
eu.datamanagementunit.transit.gpas.keycloak.realm=ttp
```

## Running Tests

To run the GpasManager tests:

```bash
mvn test -Dtest=GpasManagerTest
```

**Prerequisites:**
- GPAS container must be running and accessible on localhost:8080
- Keycloak container must be running and accessible on localhost:8081
- The GPAS soap client must have appropriate roles assigned in Keycloak

**Note on Client ID:**
- The test uses `gpas-domain-admin` client which has `role.gpas.admin` role
- This client can access both DomainService and gpasService endpoints