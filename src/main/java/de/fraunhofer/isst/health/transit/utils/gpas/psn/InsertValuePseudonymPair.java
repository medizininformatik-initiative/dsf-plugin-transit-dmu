package de.fraunhofer.isst.health.transit.utils.gpas.psn;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insertValuePseudonymPair complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="insertValuePseudonymPair">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="pseudonym" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertValuePseudonymPair", propOrder = {
        "value",
        "pseudonym",
        "domainName"
})
public class InsertValuePseudonymPair {

    @XmlElement(required = true)
    private String value;
    @XmlElement(required = true)
    private String pseudonym;
    @XmlElement(required = true)
    private String domainName;

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
     * Gets the value of the domainName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * Sets the value of the domainName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDomainName(String value) {
        this.domainName = value;
    }

}
