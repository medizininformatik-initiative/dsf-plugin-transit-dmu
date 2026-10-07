package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java-Klasse für matchingDTO complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="matchingDTO">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="fields" type="{http://service.epix.ttp.icmvc.emau.org/}fieldDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="numberOfThreads" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="parallelMatchingAfter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="thresholdAutomaticMatch" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="thresholdPossibleMatch" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="useCEMFIM" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "matchingDTO", propOrder = {
    "fields",
    "numberOfThreads",
    "parallelMatchingAfter",
    "thresholdAutomaticMatch",
    "thresholdPossibleMatch",
    "useCEMFIM"
})
public class MatchingDTO {

    @XmlElement(nillable = true)
    protected List<FieldDTO> fields;
    protected int numberOfThreads;
    protected int parallelMatchingAfter;
    protected double thresholdAutomaticMatch;
    protected double thresholdPossibleMatch;
    protected boolean useCEMFIM;

    /**
     * Gets the value of the fields property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fields property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldDTO }
     * </p>
     * 
     * 
     * @return
     *     The value of the fields property.
     */
    public List<FieldDTO> getFields() {
        if (fields == null) {
            fields = new ArrayList<>();
        }
        return this.fields;
    }

    /**
     * Ruft den Wert der numberOfThreads-Eigenschaft ab.
     * 
     */
    public int getNumberOfThreads() {
        return numberOfThreads;
    }

    /**
     * Legt den Wert der numberOfThreads-Eigenschaft fest.
     * 
     */
    public void setNumberOfThreads(int value) {
        this.numberOfThreads = value;
    }

    /**
     * Ruft den Wert der parallelMatchingAfter-Eigenschaft ab.
     * 
     */
    public int getParallelMatchingAfter() {
        return parallelMatchingAfter;
    }

    /**
     * Legt den Wert der parallelMatchingAfter-Eigenschaft fest.
     * 
     */
    public void setParallelMatchingAfter(int value) {
        this.parallelMatchingAfter = value;
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

    /**
     * Ruft den Wert der useCEMFIM-Eigenschaft ab.
     * 
     */
    public boolean isUseCEMFIM() {
        return useCEMFIM;
    }

    /**
     * Legt den Wert der useCEMFIM-Eigenschaft fest.
     * 
     */
    public void setUseCEMFIM(boolean value) {
        this.useCEMFIM = value;
    }

}
