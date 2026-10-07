package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java-Klasse für validatorGroupDTO complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="validatorGroupDTO">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="operator" type="{http://service.epix.ttp.icmvc.emau.org/}validatorOperator" minOccurs="0"/>
 *         <element name="validatorGroups" type="{http://service.epix.ttp.icmvc.emau.org/}validatorGroupDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="validators" type="{http://service.epix.ttp.icmvc.emau.org/}validatorDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validatorGroupDTO", propOrder = {
    "operator",
    "validatorGroups",
    "validators"
})
public class ValidatorGroupDTO {

    @XmlSchemaType(name = "string")
    protected ValidatorOperator operator;
    @XmlElement(nillable = true)
    protected List<ValidatorGroupDTO> validatorGroups;
    @XmlElement(nillable = true)
    protected List<ValidatorDTO> validators;

    /**
     * Ruft den Wert der operator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ValidatorOperator }
     *     
     */
    public ValidatorOperator getOperator() {
        return operator;
    }

    /**
     * Legt den Wert der operator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidatorOperator }
     *     
     */
    public void setOperator(ValidatorOperator value) {
        this.operator = value;
    }

    /**
     * Gets the value of the validatorGroups property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the validatorGroups property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getValidatorGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidatorGroupDTO }
     * </p>
     * 
     * 
     * @return
     *     The value of the validatorGroups property.
     */
    public List<ValidatorGroupDTO> getValidatorGroups() {
        if (validatorGroups == null) {
            validatorGroups = new ArrayList<>();
        }
        return this.validatorGroups;
    }

    /**
     * Gets the value of the validators property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the validators property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getValidators().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidatorDTO }
     * </p>
     * 
     * 
     * @return
     *     The value of the validators property.
     */
    public List<ValidatorDTO> getValidators() {
        if (validators == null) {
            validators = new ArrayList<>();
        }
        return this.validators;
    }

}
