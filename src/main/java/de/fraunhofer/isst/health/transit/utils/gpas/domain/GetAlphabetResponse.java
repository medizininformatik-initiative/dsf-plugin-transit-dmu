
package de.fraunhofer.isst.health.transit.utils.gpas.domain;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAlphabetResponse complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="getAlphabetResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="return" type="{http://psn.ttp.ganimed.icmvc.emau.org/}alphabet" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAlphabetResponse", propOrder = {
        "alphabet"
})
public class GetAlphabetResponse {

    @XmlElement(name = "return")
    private Alphabet alphabet;

    /**
     * Gets the value of the return property.
     *
     * @return possible object is
     * {@link Alphabet }
     */
    public Alphabet getReturn() {
        return alphabet;
    }

    /**
     * Sets the value of the return property.
     *
     * @param value allowed object is
     *              {@link Alphabet }
     */
    public void setReturn(Alphabet value) {
        this.alphabet = value;
    }

}
