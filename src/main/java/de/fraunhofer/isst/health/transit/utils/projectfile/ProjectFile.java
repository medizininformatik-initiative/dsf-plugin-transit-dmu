package de.fraunhofer.isst.health.transit.utils.projectfile;

import org.hl7.fhir.r4.model.ResearchStudy;

public class ProjectFile {

    public ProjectFile() {
        this.researchStudy = new ResearchStudy();
    }

    private ResearchStudy researchStudy;

    //region Getter&Setter
    public ResearchStudy getResearchStudy() {
        return researchStudy;
    }
    public void setResearchStudy(ResearchStudy researchStudy) {
        this.researchStudy = researchStudy;
    }
    //endregion


}
