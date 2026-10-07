package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für addIdentifierDomain complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="addIdentifierDomain">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="identifierDomain" type="{http://www.ttp.icmvc.emau.org/epix/common/model}identifierDomainDTO"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addIdentifierDomain", propOrder = {
    "identifierDomain"
})
public class AddIdentifierDomain {

    @XmlElement(required = true)
    protected IdentifierDomainDTO identifierDomain;

    /**
     * Ruft den Wert der identifierDomain-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierDomainDTO }
     *     
     */
    public IdentifierDomainDTO getIdentifierDomain() {
        return identifierDomain;
    }

    /**
     * Legt den Wert der identifierDomain-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierDomainDTO }
     *     
     */
    public void setIdentifierDomain(IdentifierDomainDTO value) {
        this.identifierDomain = value;
    }

}
