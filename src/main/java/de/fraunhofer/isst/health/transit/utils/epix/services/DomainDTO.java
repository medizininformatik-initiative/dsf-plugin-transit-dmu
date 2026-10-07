package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für domainDTO complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="domainDTO">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="config" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="configObjects" type="{http://service.epix.ttp.icmvc.emau.org/}configurationContainer" minOccurs="0"/>
 *         <element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="entryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="inUse" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="matchingMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="mpiDomain" type="{http://www.ttp.icmvc.emau.org/epix/common/model}identifierDomainDTO" minOccurs="0"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="personCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="safeSource" type="{http://www.ttp.icmvc.emau.org/epix/common/model}sourceDTO" minOccurs="0"/>
 *         <element name="updateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "domainDTO", namespace = "http://www.ttp.icmvc.emau.org/epix/common/model", propOrder = {
    "config",
    "configObjects",
    "description",
    "entryDate",
    "inUse",
    "label",
    "matchingMode",
    "mpiDomain",
    "name",
    "personCount",
    "safeSource",
    "updateDate"
})
public class DomainDTO {

    protected String config;
    protected ConfigurationContainer configObjects;
    protected String description;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar entryDate;
    protected boolean inUse;
    protected String label;
    protected String matchingMode;
    protected IdentifierDomainDTO mpiDomain;
    protected String name;
    protected long personCount;
    protected SourceDTO safeSource;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateDate;

    /**
     * Ruft den Wert der config-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfig() {
        return config;
    }

    /**
     * Legt den Wert der config-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfig(String value) {
        this.config = value;
    }

    /**
     * Ruft den Wert der configObjects-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationContainer }
     *     
     */
    public ConfigurationContainer getConfigObjects() {
        return configObjects;
    }

    /**
     * Legt den Wert der configObjects-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationContainer }
     *     
     */
    public void setConfigObjects(ConfigurationContainer value) {
        this.configObjects = value;
    }

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
     * Ruft den Wert der inUse-Eigenschaft ab.
     * 
     */
    public boolean isInUse() {
        return inUse;
    }

    /**
     * Legt den Wert der inUse-Eigenschaft fest.
     * 
     */
    public void setInUse(boolean value) {
        this.inUse = value;
    }

    /**
     * Ruft den Wert der label-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Legt den Wert der label-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Ruft den Wert der matchingMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchingMode() {
        return matchingMode;
    }

    /**
     * Legt den Wert der matchingMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchingMode(String value) {
        this.matchingMode = value;
    }

    /**
     * Ruft den Wert der mpiDomain-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierDomainDTO }
     *     
     */
    public IdentifierDomainDTO getMpiDomain() {
        return mpiDomain;
    }

    /**
     * Legt den Wert der mpiDomain-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierDomainDTO }
     *     
     */
    public void setMpiDomain(IdentifierDomainDTO value) {
        this.mpiDomain = value;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der personCount-Eigenschaft ab.
     * 
     */
    public long getPersonCount() {
        return personCount;
    }

    /**
     * Legt den Wert der personCount-Eigenschaft fest.
     * 
     */
    public void setPersonCount(long value) {
        this.personCount = value;
    }

    /**
     * Ruft den Wert der safeSource-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SourceDTO }
     *     
     */
    public SourceDTO getSafeSource() {
        return safeSource;
    }

    /**
     * Legt den Wert der safeSource-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceDTO }
     *     
     */
    public void setSafeSource(SourceDTO value) {
        this.safeSource = value;
    }

    /**
     * Ruft den Wert der updateDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateDate() {
        return updateDate;
    }

    /**
     * Legt den Wert der updateDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateDate(XMLGregorianCalendar value) {
        this.updateDate = value;
    }

}
