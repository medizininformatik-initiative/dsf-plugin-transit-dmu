package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java-Klasse für bloomFilterConfigDTO complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="bloomFilterConfigDTO">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="algorithm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="alphabet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="balanced" type="{http://service.epix.ttp.icmvc.emau.org/}balancedDTO" minOccurs="0"/>
 *         <element name="bitsPerNgram" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="field" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="fold" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="length" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="ngrams" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="sourceFields" type="{http://service.epix.ttp.icmvc.emau.org/}sourceFieldDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bloomFilterConfigDTO", propOrder = {
    "algorithm",
    "alphabet",
    "balanced",
    "bitsPerNgram",
    "field",
    "fold",
    "length",
    "ngrams",
    "sourceFields"
})
public class BloomFilterConfigDTO {

    protected String algorithm;
    protected String alphabet;
    protected BalancedDTO balanced;
    protected int bitsPerNgram;
    protected String field;
    protected int fold;
    protected int length;
    protected int ngrams;
    @XmlElement(nillable = true)
    protected List<SourceFieldDTO> sourceFields;

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
     * Ruft den Wert der alphabet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlphabet() {
        return alphabet;
    }

    /**
     * Legt den Wert der alphabet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlphabet(String value) {
        this.alphabet = value;
    }

    /**
     * Ruft den Wert der balanced-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BalancedDTO }
     *     
     */
    public BalancedDTO getBalanced() {
        return balanced;
    }

    /**
     * Legt den Wert der balanced-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BalancedDTO }
     *     
     */
    public void setBalanced(BalancedDTO value) {
        this.balanced = value;
    }

    /**
     * Ruft den Wert der bitsPerNgram-Eigenschaft ab.
     * 
     */
    public int getBitsPerNgram() {
        return bitsPerNgram;
    }

    /**
     * Legt den Wert der bitsPerNgram-Eigenschaft fest.
     * 
     */
    public void setBitsPerNgram(int value) {
        this.bitsPerNgram = value;
    }

    /**
     * Ruft den Wert der field-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getField() {
        return field;
    }

    /**
     * Legt den Wert der field-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setField(String value) {
        this.field = value;
    }

    /**
     * Ruft den Wert der fold-Eigenschaft ab.
     * 
     */
    public int getFold() {
        return fold;
    }

    /**
     * Legt den Wert der fold-Eigenschaft fest.
     * 
     */
    public void setFold(int value) {
        this.fold = value;
    }

    /**
     * Ruft den Wert der length-Eigenschaft ab.
     * 
     */
    public int getLength() {
        return length;
    }

    /**
     * Legt den Wert der length-Eigenschaft fest.
     * 
     */
    public void setLength(int value) {
        this.length = value;
    }

    /**
     * Ruft den Wert der ngrams-Eigenschaft ab.
     * 
     */
    public int getNgrams() {
        return ngrams;
    }

    /**
     * Legt den Wert der ngrams-Eigenschaft fest.
     * 
     */
    public void setNgrams(int value) {
        this.ngrams = value;
    }

    /**
     * Gets the value of the sourceFields property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sourceFields property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSourceFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SourceFieldDTO }
     * </p>
     * 
     * 
     * @return
     *     The value of the sourceFields property.
     */
    public List<SourceFieldDTO> getSourceFields() {
        if (sourceFields == null) {
            sourceFields = new ArrayList<>();
        }
        return this.sourceFields;
    }

}
