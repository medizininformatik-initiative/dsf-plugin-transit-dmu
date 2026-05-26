package de.fraunhofer.isst.health.transit.service.merge;


import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.parser.IParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import de.fraunhofer.isst.health.transit.ConstantsTransit;
import de.fraunhofer.isst.health.transit.models.InsertDataObject;
import de.fraunhofer.isst.health.transit.spring.config.DmsFhirClientConfig;
import de.fraunhofer.isst.health.transit.spring.config.DmsProjectFileFhirClientConfig;
import de.fraunhofer.isst.health.transit.spring.config.TransitVariablesConfig;
import de.fraunhofer.isst.health.transit.utils.InboxManager;
import de.fraunhofer.isst.health.transit.utils.StatusLogger;
import de.fraunhofer.isst.health.transit.utils.WebServiceClientHelper;
import dev.dsf.bpe.v2.ProcessPluginApi;
import dev.dsf.bpe.v2.activity.ServiceTask;
import dev.dsf.bpe.v2.error.ErrorBoundaryEvent;
import dev.dsf.bpe.v2.variables.Variables;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.hl7.fhir.r4.model.Binary;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.DocumentReference;
import org.hl7.fhir.r4.model.DomainResource;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import static de.fraunhofer.isst.health.transit.ConstantsTransit.*;

public class InsertDataSetImplementation implements ServiceTask {

    private static final Logger LOGGER = Logger.getLogger(InsertDataSetImplementation.class.getName());
    private static final int PREFIXLENGTH = 5;
    private IParser parser;
    private HashMap<String, String> dizPrefixMapping;
    private HashMap<String, String> uUIDToTransportIDs;
    private HashMap<String, String> transportIDToDIZID;
    private String dizId;
    private DmsProjectFileFhirClientConfig dmsProjectFileFhirClientConfig;
    private TransitVariablesConfig transitVariablesConfig;
    private DmsFhirClientConfig dmsFhirClientConfig;

    public InsertDataSetImplementation(DmsProjectFileFhirClientConfig dmsProjectFileFhirClientConfig, TransitVariablesConfig transitVariablesConfig, DmsFhirClientConfig dmsFhirClientConfig) {
        super();
        this.dmsProjectFileFhirClientConfig = dmsProjectFileFhirClientConfig;
        this.transitVariablesConfig = transitVariablesConfig;
        this.dmsFhirClientConfig = dmsFhirClientConfig;
    }

    @Override
    public void execute(ProcessPluginApi api, Variables variables) throws ErrorBoundaryEvent, Exception {
        ObjectMapper mapper = api.getObjectMapper();
        String fhirStoreUrl = variables.getString(ConstantsTransit.FHIRSTOREURL);

        LOGGER.log(Level.INFO, "Start InsertDataSetImplementation into Fhir-Store: "+ fhirStoreUrl);

        dizId = variables.getString(ConstantsTransit.CURRENTDIZID);

        String bundleID = variables.getString(ConstantsTransit.BUNDLEID
                + ConstantsTransit.DIZSEPERATOR
                + dizId);
        String binaryID = variables.getString(ConstantsTransit.BINARYID
                + ConstantsTransit.DIZSEPERATOR
                + dizId);
        String documentID = variables.getString(ConstantsTransit.DOCUMENTID
                + ConstantsTransit.DIZSEPERATOR
                + dizId);

        Binary binary = (Binary) variables.getFhirResource(BINARY);
        Bundle bundle = (Bundle) variables.getFhirResource(BUNDLE);
        DocumentReference documentReference = (DocumentReference) (DomainResource) variables.getFhirResource(DOCUMENT_REFERENCE);

        String key = variables.getBusinessKey() + "_" + dizId;

        if (!Objects.equals(bundleID, "NA")) {
//            bundle = downloader.getResourceFromInbox("Bundle", bundleID);
        } else {
//            binary = downloader.getResourceFromInbox("Binary", binaryID);
//            bundle = changeBinaryInBundleOfBundles(binary);
        }

        parser = FhirContext.forR4().newJsonParser();

        //Map the transport IDs to the DIZ that send them
        if (variables.getVariable(ConstantsTransit.DIZMAP) != null) {
            transportIDToDIZID = mapper.readValue(variables.getString(ConstantsTransit.DIZMAP),
                    new TypeReference<HashMap<String, String>>() {});
        } else {
            transportIDToDIZID = new HashMap<>();
        }

        //Map the newly generated UUIDS to the original transport ID
        if (variables.getVariable(ConstantsTransit.UUIDMAP
                + ConstantsTransit.DIZSEPERATOR + dizId) != null) {
            uUIDToTransportIDs = mapper.readValue(variables.getString(ConstantsTransit.UUIDMAP
                            + ConstantsTransit.DIZSEPERATOR + dizId),
                    new TypeReference<HashMap<String, String>>() {});
        } else {
            uUIDToTransportIDs = new HashMap<>();
        }

        //Map the random prefix to the diz it belongs to, needed to guarantee consistency between multiple deliveries
        if (variables.getVariable(ConstantsTransit.DIZPREFIXMAP) != null) {
            dizPrefixMapping = mapper.readValue(variables.getString(ConstantsTransit.DIZPREFIXMAP),
                    new TypeReference<HashMap<String, String>>() {});
        } else {
            dizPrefixMapping = new HashMap<>();
        }

        //Search for the prefix of the diz or generate a new one if none exist
        String prefix;
        if (dizPrefixMapping.containsKey(dizId)) {
            prefix = dizPrefixMapping.get(dizId);
        } else {
            prefix = RandomStringUtils.randomAlphanumeric(PREFIXLENGTH);
            while (dizPrefixMapping.containsValue(prefix)) {
                prefix = RandomStringUtils.randomAlphanumeric(PREFIXLENGTH);
            }
            dizPrefixMapping.put(dizId, prefix);
        }

        InsertDataObject insertDataObject = new InsertDataObject(key,
                parser.encodeResourceToString(documentReference),
                parser.encodeResourceToString(bundle),
                fhirStoreUrl);

        WebServiceClientHelper.postToContainer(insertDataObject);

        InboxManager inboxManager = new InboxManager();
        StatusLogger statusLogger = new StatusLogger(this.dmsProjectFileFhirClientConfig);
        String dupIdentifier = variables.getString(ConstantsTransit.DUPIDENTIFIER);

        statusLogger.logNewStatus(dupIdentifier,
                variables.getBusinessKey() + "_" + variables.getVariableLocal("inputCurrentDizId"),
                true);

        updateMaps(api, variables);
        inboxManager.deleteMIIFromInbox(bundleID, documentID, binaryID, dmsFhirClientConfig.getFhirStoreBaseUrl());
    }

    private void updateMaps(ProcessPluginApi api, Variables variables) throws JsonProcessingException {
        ObjectMapper mapper = api.getObjectMapper();

        //This can not be updated during processing since deliveries of the same diz are processed in order
        variables.setString(ConstantsTransit.UUIDMAP + ConstantsTransit.DIZSEPERATOR + dizId,
                mapper.writeValueAsString(uUIDToTransportIDs));

        //Check for changes made to the maps during processing
        if (variables.getVariable(ConstantsTransit.DIZMAP) != null) {
            HashMap<String, String> temp = mapper.readValue(variables.getString(ConstantsTransit.DIZMAP),
                    new TypeReference<HashMap<String, String>>() {});
            temp.putAll(transportIDToDIZID);
            variables.setString(ConstantsTransit.DIZMAP,  mapper.writeValueAsString(temp));
        } else {
            variables.setString(ConstantsTransit.DIZMAP,  mapper.writeValueAsString(transportIDToDIZID));
        }

        if (variables.getVariable(ConstantsTransit.DIZPREFIXMAP) != null) {
            HashMap<String, String> temp = mapper.readValue(variables.getString(ConstantsTransit.DIZPREFIXMAP),
                    new TypeReference<HashMap<String, String>>() {});
            temp.putAll(dizPrefixMapping);
            variables.setString(ConstantsTransit.DIZPREFIXMAP,  mapper.writeValueAsString(temp));
        } else {
            variables.setString(ConstantsTransit.DIZPREFIXMAP,  mapper.writeValueAsString(dizPrefixMapping));
        }
    }
    private String changeBinaryInBundleOfBundles(String input) {
        //TODO once we have the type of the ndjson bundle only resolve those, csv and zip must be uploaded as a binary
        Bundle outerBundle = new Bundle();
        LOGGER.log(Level.INFO, "Start transforming binary in Bundle");
        outerBundle.setType(Bundle.BundleType.BATCHRESPONSE);

        if (input.startsWith("<Bundle")) {
            parser = FhirContext.forR4().newXmlParser();
            LOGGER.log(Level.INFO, "ReturnBundle is XML");
        } else {
            parser = FhirContext.forR4().newJsonParser();
            LOGGER.log(Level.INFO, "ReturnBundle is JSON");
        }

        Bundle bundle  = parser.parseResource(Bundle.class, input);
        Binary binary = (Binary) bundle.getEntryFirstRep().getResource();
        String content = new String(binary.getData());
        Scanner scanner = new Scanner(content);
        parser = FhirContext.forR4().newJsonParser();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.startsWith("{\"resource\":")) {
                line = StringUtils.removeStart(line, "{\"resource\":");
                line = line.substring(0, line.length() - 1);
            }
            Bundle temp = parser.parseResource(Bundle.class, line);
            outerBundle.addEntry().setResource(temp);
        }
        return parser.encodeResourceToString(outerBundle);
    }

}
