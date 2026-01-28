
package de.fraunhofer.isst.health.transit.utils.gpas.domain;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDomainsForSuffix complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="getDomainsForSuffix">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="suffix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDomainsForSuffix", propOrder = {
        "suffix"
})
public class GetDomainsForSuffix {

    @XmlElement(required = true)
    private String suffix;

    /**
     * Gets the value of the suffix property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSuffix(String value) {
        this.suffix = value;
    }

}
