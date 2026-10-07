package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für identifierDTO complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="identifierDTO">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="entryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="fresh" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="identifierDomain" type="{http://www.ttp.icmvc.emau.org/epix/common/model}identifierDomainDTO" minOccurs="0"/>
 *         <element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identifierDTO", namespace = "http://www.ttp.icmvc.emau.org/epix/common/model", propOrder = {
    "description",
    "entryDate",
    "fresh",
    "identifierDomain",
    "value"
})
public class IdentifierDTO {

    protected String description;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar entryDate;
    protected boolean fresh;
    protected IdentifierDomainDTO identifierDomain;
    protected String value;

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der entryDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEntryDate() {
        return entryDate;
    }

    /**
     * Legt den Wert der entryDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEntryDate(XMLGregorianCalendar value) {
        this.entryDate = value;
    }

    /**
     * Ruft den Wert der fresh-Eigenschaft ab.
     * 
     */
    public boolean isFresh() {
        return fresh;
    }

    /**
     * Legt den Wert der fresh-Eigenschaft fest.
     * 
     */
    public void setFresh(boolean value) {
        this.fresh = value;
    }

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

    /**
     * Ruft den Wert der value-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
