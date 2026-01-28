
package de.fraunhofer.isst.health.transit.utils.gpas.domain;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRestrictionForCheckDigitClass complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="getRestrictionForCheckDigitClass">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="checkDigitClass" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRestrictionForCheckDigitClass", propOrder = {
        "checkDigitClass"
})
public class GetRestrictionForCheckDigitClass {

    @XmlElement(required = true)
    private String checkDigitClass;

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

}
