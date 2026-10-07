package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für fieldDTO complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="fieldDTO">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="algorithm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="blockingMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="blockingThreshold" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="matchingThreshold" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="multipleValuesSeparator" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="penaltyBothShort" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="penaltyNotAPerfectMatch" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="penaltyOneShort" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="weight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fieldDTO", propOrder = {
    "algorithm",
    "blockingMode",
    "blockingThreshold",
    "matchingThreshold",
    "multipleValuesSeparator",
    "name",
    "penaltyBothShort",
    "penaltyNotAPerfectMatch",
    "penaltyOneShort",
    "weight"
})
public class FieldDTO {

    protected String algorithm;
    protected String blockingMode;
    protected double blockingThreshold;
    protected double matchingThreshold;
    @XmlSchemaType(name = "unsignedShort")
    protected int multipleValuesSeparator;
    protected String name;
    protected double penaltyBothShort;
    protected double penaltyNotAPerfectMatch;
    protected double penaltyOneShort;
    protected double weight;

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
     * Ruft den Wert der blockingMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockingMode() {
        return blockingMode;
    }

    /**
     * Legt den Wert der blockingMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockingMode(String value) {
        this.blockingMode = value;
    }

    /**
     * Ruft den Wert der blockingThreshold-Eigenschaft ab.
     * 
     */
    public double getBlockingThreshold() {
        return blockingThreshold;
    }

    /**
     * Legt den Wert der blockingThreshold-Eigenschaft fest.
     * 
     */
    public void setBlockingThreshold(double value) {
        this.blockingThreshold = value;
    }

    /**
     * Ruft den Wert der matchingThreshold-Eigenschaft ab.
     * 
     */
    public double getMatchingThreshold() {
        return matchingThreshold;
    }

    /**
     * Legt den Wert der matchingThreshold-Eigenschaft fest.
     * 
     */
    public void setMatchingThreshold(double value) {
        this.matchingThreshold = value;
    }

    /**
     * Ruft den Wert der multipleValuesSeparator-Eigenschaft ab.
     * 
     */
    public int getMultipleValuesSeparator() {
        return multipleValuesSeparator;
    }

    /**
     * Legt den Wert der multipleValuesSeparator-Eigenschaft fest.
     * 
     */
    public void setMultipleValuesSeparator(int value) {
        this.multipleValuesSeparator = value;
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
     * Ruft den Wert der penaltyBothShort-Eigenschaft ab.
     * 
     */
    public double getPenaltyBothShort() {
        return penaltyBothShort;
    }

    /**
     * Legt den Wert der penaltyBothShort-Eigenschaft fest.
     * 
     */
    public void setPenaltyBothShort(double value) {
        this.penaltyBothShort = value;
    }

    /**
     * Ruft den Wert der penaltyNotAPerfectMatch-Eigenschaft ab.
     * 
     */
    public double getPenaltyNotAPerfectMatch() {
        return penaltyNotAPerfectMatch;
    }

    /**
     * Legt den Wert der penaltyNotAPerfectMatch-Eigenschaft fest.
     * 
     */
    public void setPenaltyNotAPerfectMatch(double value) {
        this.penaltyNotAPerfectMatch = value;
    }

    /**
     * Ruft den Wert der penaltyOneShort-Eigenschaft ab.
     * 
     */
    public double getPenaltyOneShort() {
        return penaltyOneShort;
    }

    /**
     * Legt den Wert der penaltyOneShort-Eigenschaft fest.
     * 
     */
    public void setPenaltyOneShort(double value) {
        this.penaltyOneShort = value;
    }

    /**
     * Ruft den Wert der weight-Eigenschaft ab.
     * 
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Legt den Wert der weight-Eigenschaft fest.
     * 
     */
    public void setWeight(double value) {
        this.weight = value;
    }

}
