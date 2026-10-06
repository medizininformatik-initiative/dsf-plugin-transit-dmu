# Transit DMU — Simplified Development Deployment (DMS role)

A minimal single-role (DMS) Docker Compose deployment for developing the Transit DMU
processes. This is a trimmed-down version of
[`examples/compose/dev-setup`](../examples/compose/dev-setup), reduced to the DMS role
and the Transit-specific services.

## Prerequisites

Generate the required certificates, private keys, FHIR bundle and `.env` file into this
deployment by running the `generate-dev-setup-cert-files` goal from the root directory of
this repository:

```sh
mvn generate-dev-setup-cert-files
```

This populates `secrets/`, `browser-certs/`, `dms/fhir/conf/bundle.xml` and `.env` in
this folder. The templates used are the Maven resources under
`src/main/resources/templates/`.

> **Note:** this goal requires **Maven 3.9+** (Maven 3.6.x fails with a
> `NoSuchMethodError: MojoFailureException` in this project). Use a Maven wrapper or a
> Maven 3.9.x installation.

Add an entry to your hosts file:

```
127.0.0.1	dms
```

## Plugin JARs

The DMS role requires the following plugin JARs. Download them and place them into the
`dms/bpe/process` folder of this deployment.

* **Data Sharing**
  https://github.com/medizininformatik-initiative/mii-process-data-sharing/releases/download/v1.1.0.0/mii-process-data-sharing-1.1.0.0.jar
* **Store Controller**
  https://github.com/medizininformatik-initiative/dsf-plugin-transit-fhirstorecontroller/releases/download/v1.0.0.3/mii-store-controller-1.0.0.3.jar
* **Transit**
  https://github.com/medizininformatik-initiative/dsf-plugin-transit-dmu/releases/download/v1.0.0.2/mii-transit-dmst-1.0.0.2.jar

## FHIR bundle

The `dms-fhir` service mounts the bundle at `dms/fhir/conf/bundle.xml`. It is generated
by `mvn generate-dev-setup-cert-files` (see [Prerequisites](#prerequisites)) into this
path, registering the DMS, DIC and HRP organizations/endpoints plus the MII affiliation.

## Start

```sh
docker compose up -d
```

## gPAS authentication (Keycloak OIDC)

The gPAS stack is integrated from the `dmu-gpas` project (`mosaicgreifswald/gpas:2026.1.0`)
with Keycloak-native OIDC auth on all three interfaces (Web, FHIR, SOAP). On startup the
`keycloak` service imports the `ttp` realm from `keycloak/ttp-realm.json`.

- **Keycloak admin console**: <http://localhost:8081> (admin / admin)
- **gPAS Web UI**: <http://localhost:8080/gpas> (login via Keycloak)

The Transit DMS-BPE authenticates to gPAS machine-to-machine using the `gpas-domain-admin`
Keycloak client (client-credentials grant) and sends the resulting token as a `Bearer` on
every SOAP call. This is configured via the `EU_DATAMANAGEMENTUNIT_TRANSIT_GPAS_KEYCLOAK_*`
environment variables on the `dms-bpe` service and needs no password.

Human access to the gPAS Web UI uses the users defined in the realm file
(`gpas-user` / `gpas-admin`; update their passwords before production use).

## Process engine (dmu-process-engine)

The `dmu-process-engine` service is a Camunda-based orchestrator that acts as a DSF
**client**: it triggers DSF processes by POSTing FHIR `Task`/`ActivityDefinition`/
`StructureDefinition` resources to `https://dms/fhir` (via the local `proxy`) using the
DMS client certificate for mutual TLS. It authenticates as the DMS organisation
(`dms.dsf.test`) and posts its temp-data bundles to the `dmsfhir` HAPI store
(the temp-data-inbox).

- **App / trigger endpoints**: <http://localhost:8083> (`POST /tf/mii`, `/tf/num`, ...)
- **Management/metrics**: <http://localhost:7979> (`/actuator/health`, `/prometheus`)
- **Camunda admin**: `klaus` (see `application.yaml`)

> **Note:** the engine's bundled processes target the MII data-sharing (`mergeDataSharing`)
> and NUM flows, which the local `dms-bpe` currently **excludes**
> (`DEV_DSF_BPE_PROCESS_EXCLUDED`). The service starts and can be used as a FHIR-store
> client / for its own Camunda workflows, but triggering those DSF processes locally will
> be rejected until the exclusion is removed and the corresponding plugin jars are added.

## Services

| Service           | Purpose                                          |
|-------------------|--------------------------------------------------|
| `db`              | Central PostgreSQL for the DSF and stores        |
| `dms-fhir`        | DSF FHIR server for the DMS role                 |
| `dms-bpe`         | DSF BPE for the DMS role (Transit processes)     |
| `proxy`           | nginx reverse proxy with TLS for `dms`           |
| `keycloak`        | OIDC provider for gPAS auth (imports `ttp` realm)|
| `mysql`+`gpas`    | Transit GPAS system (OIDC-protected)             |
| `projectfile`     | Project file FHIR store                          |
| `dmsstore`        | DMU FHIR store                                   |
| `dmsfhir`         | HAPI FHIR store (temp-data-inbox)                |
| `dmu-process-engine` | Camunda orchestrator (DSF client, see above)  |
| `filestorage`     | File storage server                             |
