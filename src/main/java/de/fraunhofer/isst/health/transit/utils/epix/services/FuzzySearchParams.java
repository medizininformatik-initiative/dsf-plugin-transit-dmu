package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für fuzzySearchParams complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="fuzzySearchParams">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="matchType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="thresholdAutomaticMatch" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="thresholdPossibleMatch" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fuzzySearchParams", propOrder = {
    "matchType",
    "thresholdAutomaticMatch",
    "thresholdPossibleMatch"
})
public class FuzzySearchParams {

    protected String matchType;
    protected double thresholdAutomaticMatch;
    protected double thresholdPossibleMatch;

    /**
     * Ruft den Wert der matchType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchType() {
        return matchType;
    }

    /**
     * Legt den Wert der matchType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchType(String value) {
        this.matchType = value;
    }

    /**
     * Ruft den Wert der thresholdAutomaticMatch-Eigenschaft ab.
     * 
     */
    public double getThresholdAutomaticMatch() {
        return thresholdAutomaticMatch;
    }

    /**
     * Legt den Wert der thresholdAutomaticMatch-Eigenschaft fest.
     * 
     */
    public void setThresholdAutomaticMatch(double value) {
        this.thresholdAutomaticMatch = value;
    }

    /**
     * Ruft den Wert der thresholdPossibleMatch-Eigenschaft ab.
     * 
     */
    public double getThresholdPossibleMatch() {
        return thresholdPossibleMatch;
    }

    /**
     * Legt den Wert der thresholdPossibleMatch-Eigenschaft fest.
     * 
     */
    public void setThresholdPossibleMatch(double value) {
        this.thresholdPossibleMatch = value;
    }

}
