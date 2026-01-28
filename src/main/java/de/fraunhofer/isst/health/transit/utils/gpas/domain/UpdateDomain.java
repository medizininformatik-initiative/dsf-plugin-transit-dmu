
package de.fraunhofer.isst.health.transit.utils.gpas.domain;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateDomain complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="updateDomain">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="domainDTO" type="{http://psn.ttp.ganimed.icmvc.emau.org/}domainInDTO"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateDomain", propOrder = {
        "domainDTO"
})
public class UpdateDomain {

    @XmlElement(required = true)
    private DomainInDTO domainDTO;

    /**
     * Gets the value of the domainDTO property.
     *
     * @return possible object is
     * {@link DomainInDTO }
     */
    public DomainInDTO getDomainDTO() {
        return domainDTO;
    }

    /**
     * Sets the value of the domainDTO property.
     *
     * @param value allowed object is
     *              {@link DomainInDTO }
     */
    public void setDomainDTO(DomainInDTO value) {
        this.domainDTO = value;
    }

}
