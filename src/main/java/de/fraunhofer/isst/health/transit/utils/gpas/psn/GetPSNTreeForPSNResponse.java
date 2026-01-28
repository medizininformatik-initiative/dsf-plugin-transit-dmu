package de.fraunhofer.isst.health.transit.utils.gpas.psn;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPSNTreeForPSNResponse complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="getPSNTreeForPSNResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="psnTree" type="{http://psn.ttp.ganimed.icmvc.emau.org/}psnTreeDTO" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPSNTreeForPSNResponse", propOrder = {
        "psnTree"
})
public class GetPSNTreeForPSNResponse {

    private PsnTreeDTO psnTree;

    /**
     * Gets the value of the psnTree property.
     *
     * @return possible object is
     * {@link PsnTreeDTO }
     */
    public PsnTreeDTO getPsnTree() {
        return psnTree;
    }

    /**
     * Sets the value of the psnTree property.
     *
     * @param value allowed object is
     *              {@link PsnTreeDTO }
     */
    public void setPsnTree(PsnTreeDTO value) {
        this.psnTree = value;
    }

}
