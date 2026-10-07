package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für validatorConfigDTO complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="validatorConfigDTO">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="field" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="validator" type="{http://service.epix.ttp.icmvc.emau.org/}validatorDTO" minOccurs="0"/>
 *         <element name="validatorGroup" type="{http://service.epix.ttp.icmvc.emau.org/}validatorGroupDTO" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validatorConfigDTO", propOrder = {
    "field",
    "validator",
    "validatorGroup"
})
public class ValidatorConfigDTO {

    protected String field;
    protected ValidatorDTO validator;
    protected ValidatorGroupDTO validatorGroup;

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
     * Ruft den Wert der validator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ValidatorDTO }
     *     
     */
    public ValidatorDTO getValidator() {
        return validator;
    }

    /**
     * Legt den Wert der validator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidatorDTO }
     *     
     */
    public void setValidator(ValidatorDTO value) {
        this.validator = value;
    }

    /**
     * Ruft den Wert der validatorGroup-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ValidatorGroupDTO }
     *     
     */
    public ValidatorGroupDTO getValidatorGroup() {
        return validatorGroup;
    }

    /**
     * Legt den Wert der validatorGroup-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidatorGroupDTO }
     *     
     */
    public void setValidatorGroup(ValidatorGroupDTO value) {
        this.validatorGroup = value;
    }

}
