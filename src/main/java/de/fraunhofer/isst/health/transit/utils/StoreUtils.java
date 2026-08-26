package de.fraunhofer.isst.health.transit.utils;

import ca.uhn.fhir.context.FhirContext;
import de.fraunhofer.isst.health.transit.spring.config.TransitVariablesConfig;
import de.fraunhofer.isst.health.transit.utils.projectfile.mii.MIIPerson;
import org.hl7.fhir.r4.model.Bundle;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Logger;

public final class StoreUtils {
    private static final Logger LOGGER = Logger.getLogger(StoreUtils.class.getName());

    private static final FhirContext FHIR_CONTEXT = FhirContext.forR4();

    public static FhirContext getFHIRCONTEXT() {
        return FHIR_CONTEXT;
    }

    public static Bundle mergeBundle(Bundle source, Bundle target) {
        for (int i = 0; i < source.getEntry().size(); i++) {
            target.addEntry().setFullUrl(source.getEntry().get(i).getFullUrl()).setResource(source.getEntry().get(i)
                    .getResource());
        }
        return target;
    }

    public static String createDownloadFile(TransitVariablesConfig transitVariablesConfig, String filename, String content) {
        String path;
        String url;

        if (transitVariablesConfig.getFileStoragePath().endsWith("/")) {
            path = transitVariablesConfig.getFileStoragePath() + filename;
        } else {
            path = transitVariablesConfig.getFileStoragePath() + "/" + filename;
        }

        try (FileOutputStream fos = new FileOutputStream(path)) {
            fos.write(content.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            LOGGER.severe("Could not create Download-File at: " + path);
        }

        if (transitVariablesConfig.getFileStorageUrl().endsWith("/")) {
            url = transitVariablesConfig.getFileStorageUrl() + filename;
        } else {
            url = transitVariablesConfig.getFileStorageUrl() + "/" + filename;
        }

        return url;
    }

    public static void setAccessList(TransitVariablesConfig transitVariablesConfig, String fileName, ArrayList<MIIPerson> scientists) throws ClassNotFoundException, SQLException {
        LOGGER.info("Start setAccessList()");
        //Get Postgres-Server Info
        String postgresUrl = transitVariablesConfig.getFileStoragePostgresUrl();
        String postgresDB = transitVariablesConfig.getFileStoragePostgresDatabase();
        String username = transitVariablesConfig.getFileStoragePostgresUsername();
        String password = transitVariablesConfig.getFileStoragePostgresPassword();
        String jdbcUrl = "jdbc:postgresql://" + postgresUrl + "/" + postgresDB;

        for (MIIPerson person: scientists) {
            LOGGER.info("Scientist: " + person.getName());
        }

        //Connect to Postgres-Server
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

        //Prepare Statement
        PreparedStatement statement = connection.prepareStatement("INSERT INTO nginx.fileAccess (filename,userId) VALUES (?,?)");
        connection.setAutoCommit(false);
        LOGGER.info("Start SQL-Transaction!");
        //Set values for SQL-Statements
        for (MIIPerson scientist: scientists) {
            statement.setString(1, fileName);
            statement.setString(2, scientist.getDsfId());
            statement.execute();
            LOGGER.info("Insert Scientist: " + scientist.getDsfId() + ", Filename: " + fileName);
        }

        //Commit transaction and close connection
        connection.commit();
        LOGGER.info("Commit SQL-Transaction!");
        connection.close();
    }
}
