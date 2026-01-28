
package de.fraunhofer.isst.health.transit.utils.gpas.domain;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvalidParentDomainException complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="InvalidParentDomainException">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="parentDomainName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidParentDomainException", propOrder = {
        "parentDomainName",
        "message"
})
public class InvalidParentDomainException {

    private String parentDomainName;
    private String message;

    /**
     * Gets the value of the parentDomainName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getParentDomainName() {
        return parentDomainName;
    }

    /**
     * Sets the value of the parentDomainName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setParentDomainName(String value) {
        this.parentDomainName = value;
    }

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

}
