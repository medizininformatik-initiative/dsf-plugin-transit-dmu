package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für UnknownObjectException complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="UnknownObjectException">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="objectType" type="{http://service.epix.ttp.icmvc.emau.org/}unknownObjectType" minOccurs="0"/>
 *         <element name="objectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnknownObjectException", propOrder = {
    "objectType",
    "objectId",
    "message"
})
public class UnknownObjectException {

    @XmlSchemaType(name = "string")
    protected UnknownObjectType objectType;
    protected String objectId;
    protected String message;

    /**
     * Ruft den Wert der objectType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UnknownObjectType }
     *     
     */
    public UnknownObjectType getObjectType() {
        return objectType;
    }

    /**
     * Legt den Wert der objectType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UnknownObjectType }
     *     
     */
    public void setObjectType(UnknownObjectType value) {
        this.objectType = value;
    }

    /**
     * Ruft den Wert der objectId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectId() {
        return objectId;
    }

    /**
     * Legt den Wert der objectId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectId(String value) {
        this.objectId = value;
    }

    /**
     * Ruft den Wert der message-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Legt den Wert der message-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
