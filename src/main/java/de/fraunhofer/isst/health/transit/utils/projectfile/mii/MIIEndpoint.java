package de.fraunhofer.isst.health.transit.utils.projectfile.mii;

import de.fraunhofer.isst.health.transit.spring.config.DmsProjectFileFhirClientConfig;
import de.fraunhofer.isst.health.transit.utils.projectfile.enums.EEndpointPayloadMimeType;

import org.hl7.fhir.r4.model.*;

import java.util.ArrayList;
import java.util.Objects;

public class MIIEndpoint {

    private DmsProjectFileFhirClientConfig config;

    private String id;
    private String dsfId;
    private Endpoint.EndpointStatus status;
    private ArrayList<String> payloadTypeCode;
    private ArrayList<String> payloadTypeSystem;
    private ArrayList<String> payloadTypeText;
    private ArrayList<EEndpointPayloadMimeType> mimeTypes;
    private String address;
    private boolean hasChanged;
    public MIIEndpoint(Endpoint endpoint, DmsProjectFileFhirClientConfig config) {
        if (endpoint.hasId()) {
            if (endpoint.hasId()) {
                id = endpoint.getIdElement().getIdPart();
            }
            this.config = config;
            dsfId = endpoint.getIdentifierFirstRep().getValue();
            status = endpoint.getStatus();
            payloadTypeCode = new ArrayList<>();
            payloadTypeSystem = new ArrayList<>();
            payloadTypeText = new ArrayList<>();
            mimeTypes = new ArrayList<>();
            for (CodeableConcept concept: endpoint.getPayloadType()) {
                if (concept.hasCoding()) {
                    payloadTypeCode.add(concept.getCodingFirstRep().getCode());
                    payloadTypeSystem.add(concept.getCodingFirstRep().getSystem());
                } else {
                    payloadTypeCode.add("");
                    payloadTypeSystem.add("");
                }
                if (concept.hasText()) {
                    payloadTypeText.add(concept.getText());
                } else {
                    payloadTypeText.add("");
                }
            }
            for (CodeType codeType:endpoint.getPayloadMimeType()) {
                switch (codeType.getCode()) {
                    case "application/json+fhir":
                        mimeTypes.add(EEndpointPayloadMimeType.JSON);
                        break;
                    case "application/xml+fhir":
                        mimeTypes.add(EEndpointPayloadMimeType.XML);
                        break;
                    default:
                        break;
                }
            }
        }
        address = endpoint.getAddress();
        hasChanged = false;
    }
    public MIIEndpoint(String identifier, DmsProjectFileFhirClientConfig config) {
        hasChanged = true;
        payloadTypeCode = new ArrayList<>();
        payloadTypeSystem = new ArrayList<>();
        payloadTypeText = new ArrayList<>();
        mimeTypes = new ArrayList<>();
        this.config = config;
        dsfId = identifier;
    }
    //region Getter&Setter

    public String getDsfId() {
        return dsfId;
    }

    public void setDsfId(String dsfid) {
        this.hasChanged = true;
        this.dsfId = dsfid;
    }

    public Endpoint.EndpointStatus getStatus() {
        return status;
    }

    public void setStatus(Endpoint.EndpointStatus status) {
        this.hasChanged = true;
        this.status = status;
    }

    public ArrayList<String> getPayloadTypeCode() {
        return payloadTypeCode;
    }

    public void setPayloadTypeCodes(ArrayList<String> payloadTypeCode) {
        this.hasChanged = true;
        this.payloadTypeCode = payloadTypeCode;
    }
    public ArrayList<String> getPayloadTypeSystem() {
        return payloadTypeSystem;
    }

    public void setPayloadTypeSystems(ArrayList<String> payloadTypeSystem) {
        this.hasChanged = true;
        this.payloadTypeSystem = payloadTypeSystem;
    }

    /**
     * Use empty String for code and system if only text and empty string for text if only code
     * @param code
     * @param system
     * @param text
     */
    public void addPayloadType(String code, String system, String text) {
        this.hasChanged = true;
        payloadTypeCode.add(code);
        payloadTypeSystem.add(system);
        payloadTypeText.add(text);
    }
    public ArrayList<EEndpointPayloadMimeType> getMimeTypes() {
        return mimeTypes;
    }

    public void setMimeTypes(ArrayList<EEndpointPayloadMimeType> mimeTypes) {
        this.hasChanged = true;
        this.mimeTypes = mimeTypes;
    }
    public void addMimeType(EEndpointPayloadMimeType type) {
        this.hasChanged = true;
        mimeTypes.add(type);
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.hasChanged = true;
        this.address = address;
    }
    public boolean hasId() {
        return id != null;
    }
    //endregion

    public Endpoint toFhir(Bundle bundle) {
        Endpoint endpoint = new Endpoint();

        endpoint.getText().setDivAsString("Identifier: " + config.getEndpointSystem() + "/" + dsfId);
        endpoint.getText().setStatus(Narrative.NarrativeStatus.GENERATED);
        endpoint.getMeta().addProfile("http://datamanagementunit.eu/fhir/StructureDefinition/EndpointStorage");
        endpoint.getIdentifierFirstRep().setValue(dsfId).setSystem(config.getEndpointSystem());
        if (status != null) {
            endpoint.setStatus(status);
        }
        if (address != null) {
            endpoint.setAddress(address);
        }
        endpoint.getConnectionType()
                .setSystem("http://terminology.hl7.org/CodeSystem/endpoint-connection-type")
                .setCode("hl7-fhir-rest");

        for (int i = 0; i < payloadTypeCode.size(); i++) {
            CodeableConcept concept = new CodeableConcept();
            if (!Objects.equals(payloadTypeCode.get(i), "")) {
                concept.addCoding().setCode(payloadTypeCode.get(i)).setSystem(payloadTypeSystem.get(i));
            }
            if (!Objects.equals(payloadTypeText.get(i), "")) {
                concept.setText(payloadTypeText.get(i));
            }
            endpoint.addPayloadType(concept);
        }

        for (EEndpointPayloadMimeType type : mimeTypes) {
            endpoint.addPayloadMimeType(type.getCode());
        }
        if (hasChanged) {
            Bundle.BundleEntryComponent bundleEntryComponent = bundle.addEntry();
            bundleEntryComponent.setResource(endpoint);
            if (id == null) {
                bundleEntryComponent.getRequest().setMethod(Bundle.HTTPVerb.POST).setUrl("Endpoint");
            } else {
                endpoint.setId(id);
                bundleEntryComponent.getRequest().setMethod(Bundle.HTTPVerb.PUT).setUrl("Endpoint/" + id);
            }
        }
        return endpoint;
    }
}
