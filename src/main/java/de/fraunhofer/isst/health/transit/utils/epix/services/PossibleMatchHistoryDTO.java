package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für possibleMatchHistoryDTO complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="possibleMatchHistoryDTO">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="algorithm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="creationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="explanation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="historyTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="identity1Id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="identity2Id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="identityLinkId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="initialCreationTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="person1Id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="person2Id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="solution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="threshold" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="updatedIdentityId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "possibleMatchHistoryDTO", namespace = "http://www.ttp.icmvc.emau.org/epix/common/model", propOrder = {
    "algorithm",
    "creationType",
    "explanation",
    "historyTimestamp",
    "id",
    "identity1Id",
    "identity2Id",
    "identityLinkId",
    "initialCreationTimestamp",
    "person1Id",
    "person2Id",
    "solution",
    "threshold",
    "updatedIdentityId",
    "user"
})
public class PossibleMatchHistoryDTO {

    protected String algorithm;
    protected String creationType;
    protected String explanation;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar historyTimestamp;
    protected long id;
    protected long identity1Id;
    protected long identity2Id;
    protected long identityLinkId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar initialCreationTimestamp;
    protected long person1Id;
    protected long person2Id;
    protected String solution;
    protected double threshold;
    protected long updatedIdentityId;
    protected String user;

    /**
     * Ruft den Wert der algorithm-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlgorithm() {
        return algorithm;
    }

    /**
     * Legt den Wert der algorithm-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlgorithm(String value) {
        this.algorithm = value;
    }

    /**
     * Ruft den Wert der creationType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationType() {
        return creationType;
    }

    /**
     * Legt den Wert der creationType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationType(String value) {
        this.creationType = value;
    }

    /**
     * Ruft den Wert der explanation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExplanation() {
        return explanation;
    }

    /**
     * Legt den Wert der explanation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExplanation(String value) {
        this.explanation = value;
    }

    /**
     * Ruft den Wert der historyTimestamp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHistoryTimestamp() {
        return historyTimestamp;
    }

    /**
     * Legt den Wert der historyTimestamp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHistoryTimestamp(XMLGregorianCalendar value) {
        this.historyTimestamp = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der identity1Id-Eigenschaft ab.
     * 
     */
    public long getIdentity1Id() {
        return identity1Id;
    }

    /**
     * Legt den Wert der identity1Id-Eigenschaft fest.
     * 
     */
    public void setIdentity1Id(long value) {
        this.identity1Id = value;
    }

    /**
     * Ruft den Wert der identity2Id-Eigenschaft ab.
     * 
     */
    public long getIdentity2Id() {
        return identity2Id;
    }

    /**
     * Legt den Wert der identity2Id-Eigenschaft fest.
     * 
     */
    public void setIdentity2Id(long value) {
        this.identity2Id = value;
    }

    /**
     * Ruft den Wert der identityLinkId-Eigenschaft ab.
     * 
     */
    public long getIdentityLinkId() {
        return identityLinkId;
    }

    /**
     * Legt den Wert der identityLinkId-Eigenschaft fest.
     * 
     */
    public void setIdentityLinkId(long value) {
        this.identityLinkId = value;
    }

    /**
     * Ruft den Wert der initialCreationTimestamp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInitialCreationTimestamp() {
        return initialCreationTimestamp;
    }

    /**
     * Legt den Wert der initialCreationTimestamp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInitialCreationTimestamp(XMLGregorianCalendar value) {
        this.initialCreationTimestamp = value;
    }

    /**
     * Ruft den Wert der person1Id-Eigenschaft ab.
     * 
     */
    public long getPerson1Id() {
        return person1Id;
    }

    /**
     * Legt den Wert der person1Id-Eigenschaft fest.
     * 
     */
    public void setPerson1Id(long value) {
        this.person1Id = value;
    }

    /**
     * Ruft den Wert der person2Id-Eigenschaft ab.
     * 
     */
    public long getPerson2Id() {
        return person2Id;
    }

    /**
     * Legt den Wert der person2Id-Eigenschaft fest.
     * 
     */
    public void setPerson2Id(long value) {
        this.person2Id = value;
    }

    /**
     * Ruft den Wert der solution-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolution() {
        return solution;
    }

    /**
     * Legt den Wert der solution-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSolution(String value) {
        this.solution = value;
    }

    /**
     * Ruft den Wert der threshold-Eigenschaft ab.
     * 
     */
    public double getThreshold() {
        return threshold;
    }

    /**
     * Legt den Wert der threshold-Eigenschaft fest.
     * 
     */
    public void setThreshold(double value) {
        this.threshold = value;
    }

    /**
     * Ruft den Wert der updatedIdentityId-Eigenschaft ab.
     * 
     */
    public long getUpdatedIdentityId() {
        return updatedIdentityId;
    }

    /**
     * Legt den Wert der updatedIdentityId-Eigenschaft fest.
     * 
     */
    public void setUpdatedIdentityId(long value) {
        this.updatedIdentityId = value;
    }

    /**
     * Ruft den Wert der user-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Legt den Wert der user-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

}
