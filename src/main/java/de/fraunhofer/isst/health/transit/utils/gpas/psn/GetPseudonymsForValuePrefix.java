package de.fraunhofer.isst.health.transit.utils.gpas.psn;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPseudonymsForValuePrefix complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="getPseudonymsForValuePrefix">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="valuePrefix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPseudonymsForValuePrefix", propOrder = {
        "valuePrefix",
        "domainName"
})
public class GetPseudonymsForValuePrefix {

    @XmlElement(required = true)
    private String valuePrefix;
    @XmlElement(required = true)
    private String domainName;

    /**
     * Gets the value of the valuePrefix property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getValuePrefix() {
        return valuePrefix;
    }

    /**
     * Sets the value of the valuePrefix property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setValuePrefix(String value) {
        this.valuePrefix = value;
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
