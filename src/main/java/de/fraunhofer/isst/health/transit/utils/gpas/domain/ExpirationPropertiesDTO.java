package de.fraunhofer.isst.health.transit.utils.gpas.domain;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "expirationPropertiesDTO", propOrder = {
        "fixedExpirationDate",
        "validPeriod"
})
public class ExpirationPropertiesDTO {

    @XmlSchemaType(name = "dateTime")
    private XMLGregorianCalendar fixedExpirationDate;
    private String validPeriod;

    public XMLGregorianCalendar getFixedExpirationDate() {
        return fixedExpirationDate;
    }

    public void setFixedExpirationDate(XMLGregorianCalendar value) {
        this.fixedExpirationDate = value;
    }

    public String getValidPeriod() {
        return validPeriod;
    }

    public void setValidPeriod(String value) {
        this.validPeriod = value;
    }
}