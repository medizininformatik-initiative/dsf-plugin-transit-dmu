package de.fraunhofer.isst.health.transit.utils.gpas.psn;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insertPairExceptionDTO complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="insertPairExceptionDTO">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pseudonym" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="errorType" type="{http://psn.ttp.ganimed.icmvc.emau.org/}insertPairError" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertPairExceptionDTO", propOrder = {
        "message",
        "value",
        "pseudonym",
        "errorType"
})
public class InsertPairExceptionDTO {

    private String message;
    private String value;
    private String pseudonym;
    @XmlSchemaType(name = "string")
    private InsertPairError errorType;

    /**
     * Gets the value of the message property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the value property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the pseudonym property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPseudonym() {
        return pseudonym;
    }

    /**
     * Sets the value of the pseudonym property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPseudonym(String value) {
        this.pseudonym = value;
    }

    /**
     * Gets the value of the errorType property.
     *
     * @return possible object is
     * {@link InsertPairError }
     */
    public InsertPairError getErrorType() {
        return errorType;
    }

    /**
     * Sets the value of the errorType property.
     *
     * @param value allowed object is
     *              {@link InsertPairError }
     */
    public void setErrorType(InsertPairError value) {
        this.errorType = value;
    }

}
