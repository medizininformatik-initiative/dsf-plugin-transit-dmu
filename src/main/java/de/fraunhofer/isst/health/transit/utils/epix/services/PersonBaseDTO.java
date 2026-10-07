package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für personBaseDTO complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="personBaseDTO">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="deactivated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="mpiId" type="{http://www.ttp.icmvc.emau.org/epix/common/model}identifierDTO" minOccurs="0"/>
 *         <element name="personCreated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="personId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="personLastEdited" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personBaseDTO", namespace = "http://www.ttp.icmvc.emau.org/epix/common/model", propOrder = {
    "deactivated",
    "domainName",
    "mpiId",
    "personCreated",
    "personId",
    "personLastEdited"
})
@XmlSeeAlso({
    PersonDTO.class
})
public class PersonBaseDTO {

    protected boolean deactivated;
    protected String domainName;
    protected IdentifierDTO mpiId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar personCreated;
    protected long personId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar personLastEdited;

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

    /**
     * Ruft den Wert der personCreated-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPersonCreated() {
        return personCreated;
    }

    /**
     * Legt den Wert der personCreated-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPersonCreated(XMLGregorianCalendar value) {
        this.personCreated = value;
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
     * Ruft den Wert der personLastEdited-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPersonLastEdited() {
        return personLastEdited;
    }

    /**
     * Legt den Wert der personLastEdited-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPersonLastEdited(XMLGregorianCalendar value) {
        this.personLastEdited = value;
    }

}
