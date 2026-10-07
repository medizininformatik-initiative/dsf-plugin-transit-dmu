package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für sourceFieldDTO complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="sourceFieldDTO">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="saltField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="saltValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="seed" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sourceFieldDTO", propOrder = {
    "name",
    "saltField",
    "saltValue",
    "seed"
})
public class SourceFieldDTO {

    protected String name;
    protected String saltField;
    protected String saltValue;
    protected long seed;

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
     * Ruft den Wert der saltField-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaltField() {
        return saltField;
    }

    /**
     * Legt den Wert der saltField-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaltField(String value) {
        this.saltField = value;
    }

    /**
     * Ruft den Wert der saltValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaltValue() {
        return saltValue;
    }

    /**
     * Legt den Wert der saltValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaltValue(String value) {
        this.saltValue = value;
    }

    /**
     * Ruft den Wert der seed-Eigenschaft ab.
     * 
     */
    public long getSeed() {
        return seed;
    }

    /**
     * Legt den Wert der seed-Eigenschaft fest.
     * 
     */
    public void setSeed(long value) {
        this.seed = value;
    }

}
