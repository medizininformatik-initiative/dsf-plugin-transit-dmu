package de.fraunhofer.isst.health.transit.service.merge;

import ca.uhn.fhir.context.FhirContext;
import de.fraunhofer.isst.health.transit.ConstantsTransit;
import de.fraunhofer.isst.health.transit.spring.config.DmsFhirClientConfig;
import de.fraunhofer.isst.health.transit.utils.HashIDsUtil;
import de.fraunhofer.isst.health.transit.utils.RemoveIdentifierUtil;
import de.fraunhofer.isst.health.transit.utils.gpas.GpasManager;
import de.fraunhofer.isst.health.transit.utils.gpas.domain.DomainConfig;
import de.fraunhofer.isst.health.transit.utils.gpas.domain.DomainInDTO;
import de.fraunhofer.isst.health.transit.utils.gpas.domain.DomainOutDTO;
import de.fraunhofer.isst.health.transit.utils.gpas.psn.GetOrCreatePseudonymForListResponse;
import dev.dsf.bpe.v2.ProcessPluginApi;
import dev.dsf.bpe.v2.activity.ServiceTask;
import dev.dsf.bpe.v2.error.ErrorBoundaryEvent;
import dev.dsf.bpe.v2.variables.Variables;
import org.apache.commons.lang3.StringUtils;
import org.hl7.fhir.r4.model.*;

import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import static de.fraunhofer.isst.health.transit.ConstantsTransit.*;

public class PseudonymizationImplementation implements ServiceTask {
    private static final Logger LOGGER = Logger.getLogger(PseudonymizationImplementation.class.getName());
    private static final String NDJSON_WRAPPER = "{\"resource\":";
    private final FhirContext fhirContext = FhirContext.forR4();
    private GpasManager gpasManager;
    private DmsFhirClientConfig dmsFhirClientConfig;

    public PseudonymizationImplementation(GpasManager gpasManager, DmsFhirClientConfig dmsFhirClientConfig) {
        super();
        this.gpasManager = gpasManager;
        this.dmsFhirClientConfig = dmsFhirClientConfig;
    }

    @Override
    public void execute(ProcessPluginApi processPluginApi, Variables variables) throws ErrorBoundaryEvent, Exception {
        String dizId = variables.getString(ConstantsTransit.CURRENTDIZID);
        String bundleID = variables.getString(ConstantsTransit.BUNDLEID
                + ConstantsTransit.DIZSEPERATOR
                + dizId);
        String binaryID = variables.getString(ConstantsTransit.BINARYID
                + ConstantsTransit.DIZSEPERATOR
                + dizId);
        String documentID = variables.getString(ConstantsTransit.DOCUMENTID
                + ConstantsTransit.DIZSEPERATOR
                + dizId);

        Binary binary = variables.getFhirResource(BINARY);
        Bundle bundle = variables.getFhirResource(BUNDLE);

        String dupIdentifier = variables.getString(ConstantsTransit.DUPIDENTIFIER);
        boolean hashIDs = variables.getBoolean(ConstantsTransit.HASH_IDS);
        boolean removeIdentifier = variables.getBoolean(ConstantsTransit.REMOVE_IDENTIFIER);

        LOGGER.log(Level.INFO, "Start Pseudonymization of Data Recieved for Project: "+dupIdentifier);
//        Downloader downloader = new Downloader(this.dmsFhirClientConfig.getFhirStoreBaseUrl());

//        String documentReference = downloader.getResourceFromInbox("DocumentReference", documentID);
        String bundleRaw;
        String binaryRaw;

        if (!Objects.equals(bundleID, "NA")) {

            bundlePseudonymization(bundle, dupIdentifier, hashIDs, removeIdentifier);

            //Set Source to Transit to prevent triggering the Process again when updating Bundle to Inbox
            bundle.getMeta().setSource("Transit");

            //Update Bundle on FHIR-Inbox
            variables.setFhirResource(BUNDLE, bundle);
        } else {

            binaryPseudonymization(binary, dupIdentifier, hashIDs, removeIdentifier);

            //Set Source to Transit to prevent triggering the Process again when updating Binary to Inbox
            binary.getMeta().setSource("Transit");

            //Update Binary on FHIR-Inbox
            variables.setFhirResource(BINARY, binary);
        }

        LOGGER.log(Level.INFO, "Finished Pseudonymization of Data");
    }

    private void bundlePseudonymization(Bundle bundle, String dupIdentifier, boolean hashIDs, boolean removeIdentifier) {
        Set<String> patientIds = extractPatientIds(bundle);
        Map<String, String> idMap = getPseudForPatients(patientIds, dupIdentifier);
        replacePatientReferences(bundle, idMap);

        if (hashIDs) {
            HashIDsUtil.hashIDs(bundle, getOrCreateSaltString(dupIdentifier));
        }
        if (removeIdentifier) {
            RemoveIdentifierUtil.removeIdentifier(bundle);
        }
    }

    private void binaryPseudonymization(Binary binary, String dupIdentifier, boolean hashIDs, boolean removeIdentifier) {
        String payload = new String(binary.getData(), StandardCharsets.UTF_8);

        //Create array of Bundles from NDJSON
        String[] payloadArray = payload.split("\\r?\\n");
        ArrayList<Bundle> bundleArray = new ArrayList<>();

        for (String jsonBundle : payloadArray) {
            if (jsonBundle.startsWith(NDJSON_WRAPPER)) {
                jsonBundle = StringUtils.removeStart(jsonBundle, NDJSON_WRAPPER);
                jsonBundle = jsonBundle.substring(0, jsonBundle.length() - 1);
            }
            bundleArray.add(fhirContext.newJsonParser().parseResource(Bundle.class, jsonBundle));
        }

        //pseudonymize all Bundles in Array
        Set<String> patientIds = new HashSet<>();
        bundleArray.forEach(entry -> patientIds.addAll(extractPatientIds(entry)));

        Map<String, String> idMap = getPseudForPatients(patientIds, dupIdentifier);
        bundleArray.forEach(entry -> replacePatientReferences(entry, idMap));

        if (hashIDs) {
            String salt = getOrCreateSaltString(dupIdentifier);
            for (Bundle bundle : bundleArray) {
                HashIDsUtil.hashIDs(bundle, salt);
            }
        }
        if (removeIdentifier) {
            bundleArray.forEach(RemoveIdentifierUtil::removeIdentifier);
        }

        //Recreate JSON
        ArrayList<String> payloadArrayOut = new ArrayList<>();
        for (Bundle bundleOut : bundleArray) {
            payloadArrayOut.add(NDJSON_WRAPPER + fhirContext.newJsonParser().encodeResourceToString(bundleOut) + "}");
        }

        String payloadOut = String.join("\n", payloadArrayOut);
        binary.setData(payloadOut.getBytes());
    }

    public static Set<String> extractPatientIds(Bundle bundle) {
        Set<String> patientIds = new HashSet<>();
        if (bundle == null) {
            return patientIds;
        }

        for (Bundle.BundleEntryComponent entry : bundle.getEntry()) {
            if (entry.hasResource()) {
                Resource resource = entry.getResource();

                // Check if it's a Patient resource
                if (resource instanceof Patient) {
                    Patient patient = (Patient) resource;
                    if (patient.hasIdentifier()) {
                        patientIds.add(patient.getIdentifierFirstRep().getValue());
                    }
                }

                // If the resource is another Bundle, recursively process it
                if (resource instanceof Bundle) {
                    patientIds.addAll(extractPatientIds((Bundle) resource));
                }
            }
        }
        return patientIds;
    }

    public Map<String, String> getPseudForPatients(Set<String> patientIds, String domain) {
        List<GetOrCreatePseudonymForListResponse.Return.Entry> pseudonymList =
                gpasManager.getOrCreatePseudonymForList(patientIds.stream().toList(), domain);

        Map<String, String> idMap = new HashMap<>();
        for (GetOrCreatePseudonymForListResponse.Return.Entry entry : pseudonymList) {
            idMap.put(entry.getKey(), entry.getValue());
        }
        return idMap;
    }

    public static Bundle replacePatientReferences(Bundle bundle, Map<String, String> idMap) {

        for (Bundle.BundleEntryComponent entry : bundle.getEntry()) {
            if (entry.hasResource()) {
                Resource resource = entry.getResource();
                // Check if it's a Patient resource
                if (resource instanceof Patient patient) {
                    Identifier identifier = new Identifier();
                    identifier.setSystem("http://mii.de/fhir/pseud");
                    identifier.setValue(idMap.get(patient.getIdElement().getIdPart()));
                    patient.setIdentifier(List.of(identifier));
                    entry.setResource(patient);
                }

                // If the resource is another Bundle, recursively process it
                if (resource instanceof Bundle) {
                    entry.setResource(replacePatientReferences((Bundle) resource, idMap));
                }
            }
        }

        return bundle;
    }

    public String getOrCreateSaltString(String dupId) {

        //Check if Domain exists
        DomainOutDTO domainOut = gpasManager.getDomain(SALT_DOMAIN_NAME);

        //Create Domain if not already existing
        if  (domainOut == null) {
            DomainInDTO domainInDTO = new DomainInDTO();

            DomainConfig domainConfig = new DomainConfig();
            domainConfig.setPsnLength(SALT_LENGTH);
            domainConfig.setIncludePrefixInCheckDigitCalculation(false);
            domainConfig.setIncludeSuffixInCheckDigitCalculation(false);
            domainConfig.setMaxDetectedErrors(1);
            domainConfig.setPsnsDeletable(true);
            domainConfig.setUseLastCharAsDelimiterAfterXChars(0);
            domainConfig.setSendNotificationsWeb(false);

            domainInDTO.setAlphabet("org.emau.icmvc.ganimed.ttp.psn.alphabets.Symbol32");
            domainInDTO.setCheckDigitClass("org.emau.icmvc.ganimed.ttp.psn.generator.HammingCode");
            domainInDTO.setName(SALT_DOMAIN_NAME);
            domainInDTO.setLabel(SALT_DOMAIN_NAME);
            domainInDTO.setConfig(domainConfig);

            gpasManager.createDomain(domainInDTO);
        }

        //Create or Get Salt-String for dupId
        List<GetOrCreatePseudonymForListResponse.Return.Entry> saltStringList =
                gpasManager.getOrCreatePseudonymForList(List.of(dupId), SALT_DOMAIN_NAME);

        //Check if Salt-String is available
        if (saltStringList.isEmpty()) {
            throw new RuntimeException("Could not GET or CREATE a alt string!");
        } else {
            return saltStringList.get(0).getValue();
        }
    }

}
