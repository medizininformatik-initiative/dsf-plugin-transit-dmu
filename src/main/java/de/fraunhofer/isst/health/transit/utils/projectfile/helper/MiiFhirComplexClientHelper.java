package de.fraunhofer.isst.health.transit.utils.projectfile.helper;


import de.fraunhofer.isst.health.transit.spring.config.DmsProjectFileFhirClientConfig;
import de.fraunhofer.isst.health.transit.utils.projectfile.enums.ESearchableResource;
import de.fraunhofer.isst.health.transit.utils.projectfile.mii.DataUsageProject;
import de.fraunhofer.isst.health.transit.utils.projectfile.mii.HTTPResponseObject;
import dev.dsf.bpe.v2.ProcessPluginApi;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.OperationOutcome;
import org.hl7.fhir.r4.model.ResearchStudy;

import java.util.ArrayList;
import java.util.List;

public class MiiFhirComplexClientHelper extends MiiFhirSimpleClientHelper {
    private DataUsageProject dup;

    /**
     * This will create a new MiiFhirClientHelper for the specified DataUsageProject and Server
     * The config File will be used to configure the Rest client used to communicate with the server
     * The client will send a request to the server for a DUP with the specified it.
     * If one is found the
     * {@link DataUsageProject#DataUsageProject(
     * ResearchStudy researchStudy, MiiFhirComplexClientHelper helper)()}
     * constructor is used to create the object otherwise the basic C´constructor will be used.
     * @param projectIdentifier the identifier of the dup
     * @param dmsProjectFileFhirClientConfig the configuration of the server
     */
    public MiiFhirComplexClientHelper(ProcessPluginApi api, String projectIdentifier, DmsProjectFileFhirClientConfig dmsProjectFileFhirClientConfig) {
        super(api, dmsProjectFileFhirClientConfig);

        HTTPResponseObject responseObject = searchByIdentifier(projectIdentifier, ESearchableResource.RESEARCH_STUDY);

        if (responseObject.hasResource()) {
            dup = new DataUsageProject((ResearchStudy) responseObject.getResource(), this);
        } else {
            dup = new DataUsageProject(projectIdentifier, this);
        }
    }

    /**
     * This method transforms the DataUsageProject object stored in the helper
     * and all related objects back into FHIR resources and posts them to the server
     * This creates new resources if the object was newly created or updates them
     * if it was created to mirror an already existing resource on the server
     * If there are no changes in a resource its version on the server will not be updated
     * (history version and last updated tag remain unchanged)
     * @return a List with one OperationOutcome object containing the post results for each of the posted resource
     */
    public List<OperationOutcome> updateToServer() {
        Bundle transactionBundle = new Bundle();
        transactionBundle.setType(Bundle.BundleType.TRANSACTION);
        dup.toFhir(transactionBundle);
        if (transactionBundle.getEntry().size() != 0) {
            return miiFhirPost(transactionBundle);
        } else {
            return new ArrayList<>();
        }
    }

    public DataUsageProject getDataUsageProject() {
        return this.dup;
    }
}
