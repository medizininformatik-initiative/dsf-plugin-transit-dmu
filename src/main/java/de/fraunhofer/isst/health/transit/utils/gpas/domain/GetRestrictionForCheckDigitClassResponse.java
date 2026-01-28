
package de.fraunhofer.isst.health.transit.utils.gpas.domain;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRestrictionForCheckDigitClassResponse complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="getRestrictionForCheckDigitClassResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="alphabetRestriction" type="{http://psn.ttp.ganimed.icmvc.emau.org/}generatorAlphabetRestriction"
 *         minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRestrictionForCheckDigitClassResponse", propOrder = {
        "alphabetRestriction"
})
public class GetRestrictionForCheckDigitClassResponse {

    @XmlSchemaType(name = "string")
    private GeneratorAlphabetRestriction alphabetRestriction;

    /**
     * Gets the value of the alphabetRestriction property.
     *
     * @return possible object is
     * {@link GeneratorAlphabetRestriction }
     */
    public GeneratorAlphabetRestriction getAlphabetRestriction() {
        return alphabetRestriction;
    }

    /**
     * Sets the value of the alphabetRestriction property.
     *
     * @param value allowed object is
     *              {@link GeneratorAlphabetRestriction }
     */
    public void setAlphabetRestriction(GeneratorAlphabetRestriction value) {
        this.alphabetRestriction = value;
    }

}
