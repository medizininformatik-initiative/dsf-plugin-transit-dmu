
package de.fraunhofer.isst.health.transit.utils.gpas.domain;

import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for domainInDTO complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="domainInDTO">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="checkDigitClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="alphabet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="config" type="{http://psn.ttp.ganimed.icmvc.emau.org/}domainConfig" minOccurs="0"/>
 *         <element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="parentDomainNames" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "domainInDTO", propOrder = {
        "name",
        "label",
        "checkDigitClass",
        "alphabet",
        "config",
        "comment",
        "parentDomainNames"
})
@XmlSeeAlso({
        DomainOutDTO.class
})
public class DomainInDTO {

    private String name;
    private String label;
    private String checkDigitClass;
    private String alphabet;
    private DomainConfig config;
    private String comment;
    @XmlElement(nillable = true)
    private List<String> parentDomainNames;

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the label property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the checkDigitClass property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCheckDigitClass() {
        return checkDigitClass;
    }

    /**
     * Sets the value of the checkDigitClass property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCheckDigitClass(String value) {
        this.checkDigitClass = value;
    }

    /**
     * Gets the value of the alphabet property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAlphabet() {
        return alphabet;
    }

    /**
     * Sets the value of the alphabet property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAlphabet(String value) {
        this.alphabet = value;
    }

    /**
     * Gets the value of the config property.
     *
     * @return possible object is
     * {@link DomainConfig }
     */
    public DomainConfig getConfig() {
        return config;
    }

    /**
     * Sets the value of the config property.
     *
     * @param value allowed object is
     *              {@link DomainConfig }
     */
    public void setConfig(DomainConfig value) {
        this.config = value;
    }

    /**
     * Gets the value of the comment property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the parentDomainNames property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parentDomainNames property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getParentDomainNames().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     *
     * @return The value of the parentDomainNames property.
     */
    public List<String> getParentDomainNames() {
        if (parentDomainNames == null) {
            parentDomainNames = new ArrayList<>();
        }
        return this.parentDomainNames;
    }

}
