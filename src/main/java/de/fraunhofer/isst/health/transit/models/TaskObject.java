package de.fraunhofer.isst.health.transit.models;

import java.util.ArrayList;

public class TaskObject {
    private String taskId;
    private String dupIdentifier;
    private String businessKey;
    private String contractLocation;
    private String taskCreationDate;
    private String projectEndDate;
    private String projectStartDate;
    private String dupTitle;
    private String messageName;
    private ArrayList<DIZLocation> dizLocations;
    private ArrayList<Participant> participants;

    public TaskObject() {
        dizLocations = new ArrayList<>();
        participants = new ArrayList<>();
    }

    public TaskObject(String dupIdentifier, String businessKey) {
        this();
        this.dupIdentifier = dupIdentifier;
        this.businessKey = businessKey;
    }

    public String getDupIdentifier() {
        return dupIdentifier;
    }

    public void setDupIdentifier(String dupIdentifier) {
        this.dupIdentifier = dupIdentifier;
    }

    public String getBusinessKey() {
        return businessKey;
    }

    public void setBusinessKey(String businessKey) {
        this.businessKey = businessKey;
    }

    public void setContractLocation(String location) {
        this.contractLocation = location;
    }

    public String getContractLocation() {
        return contractLocation;
    }

    public void setTaskCreationDate(String taskCreationDate) {
        this.taskCreationDate = taskCreationDate;
    }

    public String getTaskCreationDate() {
        return taskCreationDate;
    }

    public void setDupTitle(String dupTitle) {
        this.dupTitle = dupTitle;
    }

    public String getDupTitle() {
        return dupTitle;
    }

    public String getMessageName() {
        return messageName;
    }

    public void setMessageName(String messageName) {
        this.messageName = messageName;
    }

    public void addDIZLocation(DIZLocation diz) {
        dizLocations.add(diz);
    }

    public ArrayList<DIZLocation> getDizLocations() {
        return dizLocations;
    }

    public void addParticipant(Participant participant) {
        participants.add(participant);
    }

    public ArrayList<Participant> getParticipants() {
        return participants;
    }

    public String getProjectEndDate() {
        return projectEndDate;
    }
    public void setProjectEndDate(String projectEndDate) {
        this.projectEndDate = projectEndDate;
    }

    public String getProjectStartDate() {
        return projectStartDate;
    }

    public void setProjectStartDate(String projectStartDate) {
        this.projectStartDate = projectStartDate;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }
}
