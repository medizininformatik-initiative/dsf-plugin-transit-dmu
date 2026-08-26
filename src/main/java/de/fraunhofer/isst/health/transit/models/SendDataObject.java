package de.fraunhofer.isst.health.transit.models;

public class SendDataObject {
    private String requester;
    private String recipient;
    private BpmnMessage bpmnMessage;
    private String dataSetReference;

    public SendDataObject() {

    }

    public SendDataObject(String requester, String recipient, String dataSetReference, BpmnMessage bpmnMessage) {
        this.requester = requester;
        this.recipient = recipient;
        this.dataSetReference = dataSetReference;
        this.bpmnMessage = bpmnMessage;
    }

    public String getRequester() {
        return requester;
    }

    public void setRequester(String requester) {
        this.requester = requester;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getDataSetReference() {
        return dataSetReference;
    }

    public void setDataSetReference(String dataSetReference) {
        this.dataSetReference = dataSetReference;
    }

    public BpmnMessage getBpmnMessage() {
        return bpmnMessage;
    }

    public void setBpmnMessage(BpmnMessage bpmnMessage) {
        this.bpmnMessage = bpmnMessage;
    }

    public static class BpmnMessage {
        private String messageName;
        private String businessKey;
        private String correlationKey;

        public BpmnMessage() {

        }

        public BpmnMessage(String messageName, String businessKey, String correlationKey) {
            this.messageName = messageName;
            this.businessKey = businessKey;
            this.correlationKey = correlationKey;
        }

        public String getMessageName() {
            return messageName;
        }

        public void setMessageName(String messageName) {
            this.messageName = messageName;
        }

        public String getBusinessKey() {
            return businessKey;
        }

        public void setBusinessKey(String businessKey) {
            this.businessKey = businessKey;
        }

        public String getCorrelationKey() {
            return correlationKey;
        }

        public void setCorrelationKey(String correlationKey) {
            this.correlationKey = correlationKey;
        }

    }

}
