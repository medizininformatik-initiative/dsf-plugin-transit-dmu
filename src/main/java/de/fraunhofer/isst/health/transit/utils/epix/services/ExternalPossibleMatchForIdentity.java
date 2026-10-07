package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für externalPossibleMatchForIdentity complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="externalPossibleMatchForIdentity">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="identityId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="aliasIdentityId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "externalPossibleMatchForIdentity", propOrder = {
    "domainName",
    "identityId",
    "aliasIdentityId"
})
public class ExternalPossibleMatchForIdentity {

    @XmlElement(required = true)
    protected String domainName;
    protected long identityId;
    protected long aliasIdentityId;

    /**
     * Ruft den Wert der domainName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * Legt den Wert der domainName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainName(String value) {
        this.domainName = value;
    }

    /**
     * Ruft den Wert der identityId-Eigenschaft ab.
     * 
     */
    public long getIdentityId() {
        return identityId;
    }

    /**
     * Legt den Wert der identityId-Eigenschaft fest.
     * 
     */
    public void setIdentityId(long value) {
        this.identityId = value;
    }

    /**
     * Ruft den Wert der aliasIdentityId-Eigenschaft ab.
     * 
     */
    public long getAliasIdentityId() {
        return aliasIdentityId;
    }

    /**
     * Legt den Wert der aliasIdentityId-Eigenschaft fest.
     * 
     */
    public void setAliasIdentityId(long value) {
        this.aliasIdentityId = value;
    }

}
