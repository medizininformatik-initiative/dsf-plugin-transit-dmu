package de.fraunhofer.isst.health.transit.utils.gpas.psn;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createPseudonymForResponse complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="createPseudonymForResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="psn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createPseudonymForResponse", propOrder = {
        "psn"
})
public class CreatePseudonymForResponse {

    private String psn;

    /**
     * Gets the value of the psn property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPsn() {
        return psn;
    }

    /**
     * Sets the value of the psn property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPsn(String value) {
        this.psn = value;
    }

}
