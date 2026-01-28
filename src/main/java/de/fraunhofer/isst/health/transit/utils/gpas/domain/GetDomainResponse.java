
package de.fraunhofer.isst.health.transit.utils.gpas.domain;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDomainResponse complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="getDomainResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="domain" type="{http://psn.ttp.ganimed.icmvc.emau.org/}domainOutDTO" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDomainResponse", propOrder = {
        "domain"
})
public class GetDomainResponse {

    private DomainOutDTO domain;

    /**
     * Gets the value of the domain property.
     *
     * @return possible object is
     * {@link DomainOutDTO }
     */
    public DomainOutDTO getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     *
     * @param value allowed object is
     *              {@link DomainOutDTO }
     */
    public void setDomain(DomainOutDTO value) {
        this.domain = value;
    }

}
