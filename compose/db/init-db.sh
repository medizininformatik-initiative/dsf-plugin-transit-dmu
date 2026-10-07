#!/bin/bash
set -e

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" --dbname "$POSTGRES_DB" <<-EOSQL
    CREATE DATABASE dic_fhir;
    GRANT ALL PRIVILEGES ON DATABASE dic_fhir TO liquibase_user;
    CREATE DATABASE dic_bpe;
    GRANT ALL PRIVILEGES ON DATABASE dic_bpe TO liquibase_user;
    CREATE DATABASE hrp_fhir;
    GRANT ALL PRIVILEGES ON DATABASE hrp_fhir TO liquibase_user;
    CREATE DATABASE hrp_bpe;
    GRANT ALL PRIVILEGES ON DATABASE hrp_bpe TO liquibase_user;
    CREATE DATABASE dms_fhir;
    GRANT ALL PRIVILEGES ON DATABASE dms_fhir TO liquibase_user;
    CREATE DATABASE dms_bpe;
    GRANT ALL PRIVILEGES ON DATABASE dms_bpe TO liquibase_user;
    CREATE DATABASE keycloak;
    GRANT ALL PRIVILEGES ON DATABASE keycloak TO liquibase_user;
    CREATE DATABASE dicfhir;
    GRANT ALL PRIVILEGES ON DATABASE dicfhir TO liquibase_user;
    CREATE DATABASE dmsfhir;
    GRANT ALL PRIVILEGES ON DATABASE dmsfhir TO liquibase_user;
    CREATE DATABASE dmsstore;
    GRANT ALL PRIVILEGES ON DATABASE dmsstore TO liquibase_user;
    CREATE DATABASE projectfile;
    GRANT ALL PRIVILEGES ON DATABASE projectfile TO liquibase_user;
    CREATE DATABASE hapi;
    GRANT ALL PRIVILEGES ON DATABASE hapi TO liquibase_user;

EOSQL