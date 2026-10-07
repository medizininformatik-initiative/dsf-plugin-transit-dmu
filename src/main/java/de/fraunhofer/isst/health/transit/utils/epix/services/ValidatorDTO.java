package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für validatorDTO complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="validatorDTO">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="criterion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="qualifiedClassName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validatorDTO", propOrder = {
    "criterion",
    "qualifiedClassName"
})
public class ValidatorDTO {

    protected String criterion;
    protected String qualifiedClassName;

    /**
     * Ruft den Wert der criterion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCriterion() {
        return criterion;
    }

    /**
     * Legt den Wert der criterion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriterion(String value) {
        this.criterion = value;
    }

    /**
     * Ruft den Wert der qualifiedClassName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifiedClassName() {
        return qualifiedClassName;
    }

    /**
     * Legt den Wert der qualifiedClassName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifiedClassName(String value) {
        this.qualifiedClassName = value;
    }

}
