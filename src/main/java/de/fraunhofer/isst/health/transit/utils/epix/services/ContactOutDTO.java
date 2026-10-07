package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für contactOutDTO complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="contactOutDTO">
 *   <complexContent>
 *     <extension base="{http://www.ttp.icmvc.emau.org/epix/common/model}contactInDTO">
 *       <sequence>
 *         <element name="contactCreated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="contactId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="contactLastEdited" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="contactVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="deactivated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="identityId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactOutDTO", namespace = "http://www.ttp.icmvc.emau.org/epix/common/model", propOrder = {
    "contactCreated",
    "contactId",
    "contactLastEdited",
    "contactVersion",
    "deactivated",
    "identityId"
})
public class ContactOutDTO
    extends ContactInDTO
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar contactCreated;
    protected long contactId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar contactLastEdited;
    protected Integer contactVersion;
    protected boolean deactivated;
    protected long identityId;

    /**
     * Ruft den Wert der contactCreated-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContactCreated() {
        return contactCreated;
    }

    /**
     * Legt den Wert der contactCreated-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContactCreated(XMLGregorianCalendar value) {
        this.contactCreated = value;
    }

    /**
     * Ruft den Wert der contactId-Eigenschaft ab.
     * 
     */
    public long getContactId() {
        return contactId;
    }

    /**
     * Legt den Wert der contactId-Eigenschaft fest.
     * 
     */
    public void setContactId(long value) {
        this.contactId = value;
    }

    /**
     * Ruft den Wert der contactLastEdited-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContactLastEdited() {
        return contactLastEdited;
    }

    /**
     * Legt den Wert der contactLastEdited-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContactLastEdited(XMLGregorianCalendar value) {
        this.contactLastEdited = value;
    }

    /**
     * Ruft den Wert der contactVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContactVersion() {
        return contactVersion;
    }

    /**
     * Legt den Wert der contactVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContactVersion(Integer value) {
        this.contactVersion = value;
    }

    /**
     * Ruft den Wert der deactivated-Eigenschaft ab.
     * 
     */
    public boolean isDeactivated() {
        return deactivated;
    }

    /**
     * Legt den Wert der deactivated-Eigenschaft fest.
     * 
     */
    public void setDeactivated(boolean value) {
        this.deactivated = value;
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

}
