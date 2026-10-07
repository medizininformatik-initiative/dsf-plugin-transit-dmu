package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für mpiIdentityDTO complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="mpiIdentityDTO">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="identity" type="{http://www.ttp.icmvc.emau.org/epix/common/model}identityOutDTO" minOccurs="0"/>
 *         <element name="mpiId" type="{http://www.ttp.icmvc.emau.org/epix/common/model}identifierDTO" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mpiIdentityDTO", namespace = "http://www.ttp.icmvc.emau.org/epix/common/model", propOrder = {
    "identity",
    "mpiId"
})
public class MpiIdentityDTO {

    protected IdentityOutDTO identity;
    protected IdentifierDTO mpiId;

    /**
     * Ruft den Wert der identity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IdentityOutDTO }
     *     
     */
    public IdentityOutDTO getIdentity() {
        return identity;
    }

    /**
     * Legt den Wert der identity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityOutDTO }
     *     
     */
    public void setIdentity(IdentityOutDTO value) {
        this.identity = value;
    }

    /**
     * Ruft den Wert der mpiId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierDTO }
     *     
     */
    public IdentifierDTO getMpiId() {
        return mpiId;
    }

    /**
     * Legt den Wert der mpiId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierDTO }
     *     
     */
    public void setMpiId(IdentifierDTO value) {
        this.mpiId = value;
    }

}
