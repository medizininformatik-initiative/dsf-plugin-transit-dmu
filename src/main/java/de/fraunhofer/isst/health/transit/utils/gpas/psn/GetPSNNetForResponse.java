package de.fraunhofer.isst.health.transit.utils.gpas.psn;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPSNNetForResponse complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="getPSNNetForResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="psnNet" type="{http://psn.ttp.ganimed.icmvc.emau.org/}psnNetDTO" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPSNNetForResponse", propOrder = {
        "psnNet"
})
public class GetPSNNetForResponse {

    private PsnNetDTO psnNet;

    /**
     * Gets the value of the psnNet property.
     *
     * @return possible object is
     * {@link PsnNetDTO }
     */
    public PsnNetDTO getPsnNet() {
        return psnNet;
    }

    /**
     * Sets the value of the psnNet property.
     *
     * @param value allowed object is
     *              {@link PsnNetDTO }
     */
    public void setPsnNet(PsnNetDTO value) {
        this.psnNet = value;
    }

}
