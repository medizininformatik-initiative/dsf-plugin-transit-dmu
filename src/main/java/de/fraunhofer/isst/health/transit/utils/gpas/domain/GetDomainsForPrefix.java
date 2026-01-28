
package de.fraunhofer.isst.health.transit.utils.gpas.domain;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDomainsForPrefix complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="getDomainsForPrefix">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="prefix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDomainsForPrefix", propOrder = {
        "prefix"
})
public class GetDomainsForPrefix {

    @XmlElement(required = true)
    private String prefix;

    /**
     * Gets the value of the prefix property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Sets the value of the prefix property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPrefix(String value) {
        this.prefix = value;
    }

}
