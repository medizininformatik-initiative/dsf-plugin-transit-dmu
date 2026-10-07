package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für possibleMatchBaseDTO complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="possibleMatchBaseDTO">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="creationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="linkId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="possibleMatchCreated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="probability" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "possibleMatchBaseDTO", namespace = "http://www.ttp.icmvc.emau.org/epix/common/model", propOrder = {
    "creationType",
    "linkId",
    "possibleMatchCreated",
    "priority",
    "probability"
})
@XmlSeeAlso({
    PossibleMatchDTO.class,
    PossibleMatchForMPIDTO.class
})
public abstract class PossibleMatchBaseDTO {

    protected String creationType;
    protected long linkId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar possibleMatchCreated;
    protected String priority;
    protected double probability;

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
     * Ruft den Wert der linkId-Eigenschaft ab.
     * 
     */
    public long getLinkId() {
        return linkId;
    }

    /**
     * Legt den Wert der linkId-Eigenschaft fest.
     * 
     */
    public void setLinkId(long value) {
        this.linkId = value;
    }

    /**
     * Ruft den Wert der possibleMatchCreated-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPossibleMatchCreated() {
        return possibleMatchCreated;
    }

    /**
     * Legt den Wert der possibleMatchCreated-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPossibleMatchCreated(XMLGregorianCalendar value) {
        this.possibleMatchCreated = value;
    }

    /**
     * Ruft den Wert der priority-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Legt den Wert der priority-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Ruft den Wert der probability-Eigenschaft ab.
     * 
     */
    public double getProbability() {
        return probability;
    }

    /**
     * Legt den Wert der probability-Eigenschaft fest.
     * 
     */
    public void setProbability(double value) {
        this.probability = value;
    }

}
