package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für identityOutBaseDTO complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="identityOutBaseDTO">
 *   <complexContent>
 *     <extension base="{http://www.ttp.icmvc.emau.org/epix/common/model}identityInBaseDTO">
 *       <sequence>
 *         <element name="deactivated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="identityCreated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="identityId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="identityLastEdited" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="identityVersion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="personId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="source" type="{http://www.ttp.icmvc.emau.org/epix/common/model}sourceDTO" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identityOutBaseDTO", namespace = "http://www.ttp.icmvc.emau.org/epix/common/model", propOrder = {
    "deactivated",
    "identityCreated",
    "identityId",
    "identityLastEdited",
    "identityVersion",
    "personId",
    "source"
})
@XmlSeeAlso({
    IdentityOutDTO.class
})
public class IdentityOutBaseDTO
    extends IdentityInBaseDTO
{

    protected boolean deactivated;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar identityCreated;
    protected long identityId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar identityLastEdited;
    protected int identityVersion;
    protected long personId;
    protected SourceDTO source;

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
     * Ruft den Wert der identityCreated-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIdentityCreated() {
        return identityCreated;
    }

    /**
     * Legt den Wert der identityCreated-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIdentityCreated(XMLGregorianCalendar value) {
        this.identityCreated = value;
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
     * Ruft den Wert der identityLastEdited-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIdentityLastEdited() {
        return identityLastEdited;
    }

    /**
     * Legt den Wert der identityLastEdited-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIdentityLastEdited(XMLGregorianCalendar value) {
        this.identityLastEdited = value;
    }

    /**
     * Ruft den Wert der identityVersion-Eigenschaft ab.
     * 
     */
    public int getIdentityVersion() {
        return identityVersion;
    }

    /**
     * Legt den Wert der identityVersion-Eigenschaft fest.
     * 
     */
    public void setIdentityVersion(int value) {
        this.identityVersion = value;
    }

    /**
     * Ruft den Wert der personId-Eigenschaft ab.
     * 
     */
    public long getPersonId() {
        return personId;
    }

    /**
     * Legt den Wert der personId-Eigenschaft fest.
     * 
     */
    public void setPersonId(long value) {
        this.personId = value;
    }

    /**
     * Ruft den Wert der source-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SourceDTO }
     *     
     */
    public SourceDTO getSource() {
        return source;
    }

    /**
     * Legt den Wert der source-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceDTO }
     *     
     */
    public void setSource(SourceDTO value) {
        this.source = value;
    }

}
