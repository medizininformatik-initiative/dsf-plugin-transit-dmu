package de.fraunhofer.isst.health.transit.utils.gpas.psn;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for createPseudonymsForList complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="createPseudonymsForList">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="values" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         <element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createPseudonymsForList", propOrder = {
        "values",
        "domainName",
        "number"
})
public class CreatePseudonymsForList {

    @XmlElement(required = true)
    private List<String> values;
    @XmlElement(required = true)
    private String domainName;
    private int number;

    /**
     * Gets the value of the values property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the values property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getValues().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     *
     * @return The value of the values property.
     */
    public List<String> getValues() {
        if (values == null) {
            values = new ArrayList<>();
        }
        return this.values;
    }

    /**
     * Gets the value of the domainName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * Sets the value of the domainName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDomainName(String value) {
        this.domainName = value;
    }

    /**
     * Gets the value of the number property.
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     */
    public void setNumber(int value) {
        this.number = value;
    }

}
