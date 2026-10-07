package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java-Klasse für mpiRequestDTO complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="mpiRequestDTO">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="requestConfig" type="{http://www.ttp.icmvc.emau.org/epix/common/model}requestConfig" minOccurs="0"/>
 *         <element name="requestEntries" type="{http://www.ttp.icmvc.emau.org/epix/common/model}identityInDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="sourceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mpiRequestDTO", namespace = "http://www.ttp.icmvc.emau.org/epix/common/model", propOrder = {
    "comment",
    "domainName",
    "requestConfig",
    "requestEntries",
    "sourceName"
})
public class MpiRequestDTO {

    protected String comment;
    protected String domainName;
    protected RequestConfig requestConfig;
    @XmlElement(nillable = true)
    protected List<IdentityInDTO> requestEntries;
    protected String sourceName;

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

    /**
     * Gets the value of the requestEntries property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the requestEntries property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRequestEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentityInDTO }
     * </p>
     * 
     * 
     * @return
     *     The value of the requestEntries property.
     */
    public List<IdentityInDTO> getRequestEntries() {
        if (requestEntries == null) {
            requestEntries = new ArrayList<>();
        }
        return this.requestEntries;
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

}
