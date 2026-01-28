
package de.fraunhofer.isst.health.transit.utils.gpas.domain;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAlphabet complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="getAlphabet">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="alphabetName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAlphabet", propOrder = {
        "alphabetName"
})
public class GetAlphabet {

    @XmlElement(required = true)
    private String alphabetName;

    /**
     * Gets the value of the alphabetName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAlphabetName() {
        return alphabetName;
    }

    /**
     * Sets the value of the alphabetName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAlphabetName(String value) {
        this.alphabetName = value;
    }

}
