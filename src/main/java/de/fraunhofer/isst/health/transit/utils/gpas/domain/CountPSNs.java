
package de.fraunhofer.isst.health.transit.utils.gpas.domain;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for countPSNs complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="countPSNs">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="config" type="{http://psn.ttp.ganimed.icmvc.emau.org/}paginationConfig"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "countPSNs", propOrder = {
        "domainName",
        "config"
})
public class CountPSNs {

    @XmlElement(required = true)
    private String domainName;
    @XmlElement(required = true)
    private PaginationConfig config;

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
     * Gets the value of the config property.
     *
     * @return possible object is
     * {@link PaginationConfig }
     */
    public PaginationConfig getConfig() {
        return config;
    }

    /**
     * Sets the value of the config property.
     *
     * @param value allowed object is
     *              {@link PaginationConfig }
     */
    public void setConfig(PaginationConfig value) {
        this.config = value;
    }

}
