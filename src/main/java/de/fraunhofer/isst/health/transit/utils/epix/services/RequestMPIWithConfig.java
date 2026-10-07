package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für requestMPIWithConfig complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="requestMPIWithConfig">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="identity" type="{http://www.ttp.icmvc.emau.org/epix/common/model}identityInDTO"/>
 *         <element name="sourceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="requestConfig" type="{http://www.ttp.icmvc.emau.org/epix/common/model}requestConfig"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestMPIWithConfig", propOrder = {
    "domainName",
    "identity",
    "sourceName",
    "comment",
    "requestConfig"
})
public class RequestMPIWithConfig {

    @XmlElement(required = true)
    protected String domainName;
    @XmlElement(required = true)
    protected IdentityInDTO identity;
    @XmlElement(required = true)
    protected String sourceName;
    protected String comment;
    @XmlElement(required = true)
    protected RequestConfig requestConfig;

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
     * Ruft den Wert der identity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IdentityInDTO }
     *     
     */
    public IdentityInDTO getIdentity() {
        return identity;
    }

    /**
     * Legt den Wert der identity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityInDTO }
     *     
     */
    public void setIdentity(IdentityInDTO value) {
        this.identity = value;
    }

    /**
     * Ruft den Wert der sourceName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceName() {
        return sourceName;
    }

    /**
     * Legt den Wert der sourceName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceName(String value) {
        this.sourceName = value;
    }

    /**
     * Ruft den Wert der comment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Legt den Wert der comment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Ruft den Wert der requestConfig-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RequestConfig }
     *     
     */
    public RequestConfig getRequestConfig() {
        return requestConfig;
    }

    /**
     * Legt den Wert der requestConfig-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestConfig }
     *     
     */
    public void setRequestConfig(RequestConfig value) {
        this.requestConfig = value;
    }

}
