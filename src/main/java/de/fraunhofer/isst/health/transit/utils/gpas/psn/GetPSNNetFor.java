package de.fraunhofer.isst.health.transit.utils.gpas.psn;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPSNNetFor complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="getPSNNetFor">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="valueOrPSN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPSNNetFor", propOrder = {
        "valueOrPSN"
})
public class GetPSNNetFor {

    @XmlElement(required = true)
    private String valueOrPSN;

    /**
     * Gets the value of the valueOrPSN property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getValueOrPSN() {
        return valueOrPSN;
    }

    /**
     * Sets the value of the valueOrPSN property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setValueOrPSN(String value) {
        this.valueOrPSN = value;
    }

}
