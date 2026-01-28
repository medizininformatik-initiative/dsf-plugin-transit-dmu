package de.fraunhofer.isst.health.transit.utils.projectfile.mii;

import de.fraunhofer.isst.health.transit.utils.projectfile.enums.EContractType;
import java.io.File;

public class Contract {
    private String uri;
    private File pdf;
    private EContractType type;

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public File getPdf() {
        return pdf;
    }

    public void setPdf(File pdf) {
        this.pdf = pdf;
    }

    public EContractType getType() {
        return type;
    }

    public void setType(EContractType type) {
        this.type = type;
    }
}
