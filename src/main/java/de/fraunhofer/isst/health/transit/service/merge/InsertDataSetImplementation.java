package de.fraunhofer.isst.health.transit.service.merge;


import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.parser.IParser;
import de.fraunhofer.isst.health.transit.ConstantsTransit;
import de.fraunhofer.isst.health.transit.models.InsertDataObject;
import de.fraunhofer.isst.health.transit.spring.config.DmsFhirClientConfig;
import de.fraunhofer.isst.health.transit.spring.config.DmsProjectFileFhirClientConfig;
import de.fraunhofer.isst.health.transit.spring.config.TransitVariablesConfig;
import de.fraunhofer.isst.health.transit.utils.InboxManager;
import de.fraunhofer.isst.health.transit.utils.StatusLogger;
import de.fraunhofer.isst.health.transit.utils.WebServiceClientHelper;
import dev.dsf.bpe.v1.ProcessPluginApi;
import dev.dsf.bpe.v1.activity.AbstractServiceDelegate;
import dev.dsf.bpe.v1.variables.Variables;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
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

public class InsertDataSetImplementation extends AbstractServiceDelegate {

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

    public InsertDataSetImplementation(ProcessPluginApi api, DmsProjectFileFhirClientConfig dmsProjectFileFhirClientConfig, TransitVariablesConfig transitVariablesConfig, DmsFhirClientConfig dmsFhirClientConfig) {
        super(api);
        this.dmsProjectFileFhirClientConfig = dmsProjectFileFhirClientConfig;
        this.transitVariablesConfig = transitVariablesConfig;
        this.dmsFhirClientConfig = dmsFhirClientConfig;
    }

    @Override
    protected void doExecute(DelegateExecution delegateExecution, Variables variables) throws BpmnError, Exception {

        String fhirStoreUrl = (String) delegateExecution.getVariable(ConstantsTransit.FHIRSTOREURL);

        LOGGER.log(Level.INFO, "Start InsertDataSetImplementation into Fhir-Store: "+ fhirStoreUrl);

        dizId = (String) delegateExecution.getVariable(ConstantsTransit.CURRENTDIZID);

        String bundleID = (String) delegateExecution.getVariable(ConstantsTransit.BUNDLEID
                + ConstantsTransit.DIZSEPERATOR
                + dizId);
        String binaryID = (String) delegateExecution.getVariable(ConstantsTransit.BINARYID
                + ConstantsTransit.DIZSEPERATOR
                + dizId);
        String documentID = (String) delegateExecution.getVariable(ConstantsTransit.DOCUMENTID
                + ConstantsTransit.DIZSEPERATOR
                + dizId);

        Binary binary = (Binary) variables.getResource(BINARY);
        Bundle bundle = (Bundle) variables.getResource(BUNDLE);
        DocumentReference documentReference = (DocumentReference) (DomainResource) variables.getResource(DOCUMENT_REFERENCE);

        String key = delegateExecution.getBusinessKey() + "_" + dizId;

        if (!Objects.equals(bundleID, "NA")) {
//            bundle = downloader.getResourceFromInbox("Bundle", bundleID);
        } else {
//            binary = downloader.getResourceFromInbox("Binary", binaryID);
//            bundle = changeBinaryInBundleOfBundles(binary);
        }

        parser = FhirContext.forR4().newJsonParser();

        //Map the transport IDs to the DIZ that send them
        if (delegateExecution.hasVariable(ConstantsTransit.DIZMAP)) {
            transportIDToDIZID = (HashMap<String, String>) delegateExecution.getVariable(ConstantsTransit.DIZMAP);
        } else {
            transportIDToDIZID = new HashMap<>();
        }

        //Map the newly generated UUIDS to the original transport ID
        if (delegateExecution.hasVariable(ConstantsTransit.UUIDMAP
                + ConstantsTransit.DIZSEPERATOR + dizId)) {
            uUIDToTransportIDs = (HashMap<String, String>) delegateExecution.getVariable(ConstantsTransit.UUIDMAP
                    + ConstantsTransit.DIZSEPERATOR + dizId);
        } else {
            uUIDToTransportIDs = new HashMap<>();
        }

        //Map the random prefix to the diz it belongs to, needed to guarantee consistency between multiple deliveries
        if (delegateExecution.hasVariable(ConstantsTransit.DIZPREFIXMAP)) {
            dizPrefixMapping = (HashMap<String, String>) delegateExecution.getVariable(ConstantsTransit.DIZPREFIXMAP);
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
        String dupIdentifier = (String) delegateExecution.getVariable(ConstantsTransit.DUPIDENTIFIER);

        statusLogger.logNewStatus(dupIdentifier,
                delegateExecution.getBusinessKey() + "_" + delegateExecution.getVariableLocal("inputCurrentDizId"),
                true);

        updateMaps(delegateExecution);
        inboxManager.deleteMIIFromInbox(bundleID, documentID, binaryID, dmsFhirClientConfig.getFhirStoreBaseUrl());

    }


    private void updateMaps(DelegateExecution delegateExecution) {
        //This can not be updated during processing since deliveries of the same diz are processed in order
        delegateExecution.setVariable(ConstantsTransit.UUIDMAP + ConstantsTransit.DIZSEPERATOR + dizId, uUIDToTransportIDs);

        //Check for changes made to the maps during processing
        if (delegateExecution.hasVariable(ConstantsTransit.DIZMAP)) {
            HashMap<String, String> temp = (HashMap<String, String>) delegateExecution.getVariable(ConstantsTransit.DIZMAP);
            temp.putAll(transportIDToDIZID);
            delegateExecution.setVariable(ConstantsTransit.DIZMAP, temp);
        } else {
            delegateExecution.setVariable(ConstantsTransit.DIZMAP, transportIDToDIZID);
        }

        if (delegateExecution.hasVariable(ConstantsTransit.DIZPREFIXMAP)) {
            HashMap<String, String> temp = (HashMap<String, String>) delegateExecution.getVariable(ConstantsTransit.DIZPREFIXMAP);
            temp.putAll(dizPrefixMapping);
            delegateExecution.setVariable(ConstantsTransit.DIZPREFIXMAP, temp);
        } else {
            delegateExecution.setVariable(ConstantsTransit.DIZPREFIXMAP, dizPrefixMapping);
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
