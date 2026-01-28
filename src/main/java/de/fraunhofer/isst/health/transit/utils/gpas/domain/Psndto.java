
package de.fraunhofer.isst.health.transit.utils.gpas.domain;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for psndto complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="psndto">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="originalValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="pseudonym" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "psndto", propOrder = {
        "domainName",
        "originalValue",
        "pseudonym"
})
public class Psndto {

    private String domainName;
    private String originalValue;
    private String pseudonym;

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

    /**
     * Gets the value of the originalValue property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getOriginalValue() {
        return originalValue;
    }

    /**
     * Sets the value of the originalValue property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setOriginalValue(String value) {
        this.originalValue = value;
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

}
