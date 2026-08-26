package de.fraunhofer.isst.health.transit.utils.projectfile.helper;

public class MiiFhirClientHelperConfig {

    private String serverUrl;
    private boolean printPrettyDefault;

    private String researchStudySystem;
    private String researcherSystem;
    private String dizSystem;
    private String taskSystem;
    private String endpointSystem;
    private String groupSystem;
    private String bearerToken;
    private int timeOut;

    public MiiFhirClientHelperConfig() {
        printPrettyDefault = true;
        researchStudySystem = "http://medizininformatik-initiative.de/sid/project-identifier";
        dizSystem = "http://highmed.org/sid/organization-identifier";
        researcherSystem = "http://medizininformatik-initiative.de/sid/researcher-identifier";
        taskSystem = "http://datamanagementunit.eu/fhir/Task";
        endpointSystem = "http://datamanagementunit.eu/fhir/Endpoint";
        groupSystem = "http://datamanagementunit.eu/fhir/Group";
    }

    // region Getter&Setter
    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public boolean getPrettyPrintDefault() {
        return printPrettyDefault;
    }

    public void setPrettyPrintDefault(boolean printPrettyDefault) {
        this.printPrettyDefault = printPrettyDefault;
    }

    public String getResearchStudySystem() {
        return researchStudySystem;
    }

    public void setResearchStudySystem(String researchStudySystem) {
        this.researchStudySystem = researchStudySystem;
    }

    public String getResearcherSystem() {
        return researcherSystem;
    }

    public void setResearcherSystem(String practitionerSystem) {
        this.researcherSystem = practitionerSystem;
    }

    public String getDIZSystem() {
        return dizSystem;
    }

    public void setDIZSystem(String organizationSystem) {
        this.dizSystem = organizationSystem;
    }

    public String getTaskSystem() {
        return taskSystem;
    }

    public void setTaskSystem(String taskSystem) {
        this.taskSystem = taskSystem;
    }

    public String getEndpointSystem() {
        return endpointSystem;
    }

    public void setEndpointSystem(String endpointSystem) {
        this.endpointSystem = endpointSystem;
    }

    public String getGroupSystem() {
        return groupSystem;
    }

    public void setGroupSystem(String groupSystem) {
        this.groupSystem = groupSystem;
    }
    public String getBearerToken() {
        return bearerToken;
    }

    public void setBearerToken(String bearerToken) {
        this.bearerToken = bearerToken;
    }

    public int getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(int timeOut) {
        this.timeOut = timeOut;
    }
    //endregion

    public String checkIfValid() {
        if (serverUrl != null
                && researcherSystem != null
                && endpointSystem != null
                && groupSystem != null
                && dizSystem != null
                && researchStudySystem != null
                && taskSystem != null) {
            return "";
        } else if (serverUrl == null) {
            return "The server url defines the server where the project files "
                    + "are stored and as such must be present";
        } else {
            return "To allow for the correct identification of resources "
                    + "an identifier system should be provided for all possible resource types.";
        }
    }



}
