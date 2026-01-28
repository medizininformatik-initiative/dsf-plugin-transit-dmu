package de.fraunhofer.isst.health.transit.utils.gpas.psn;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getOrCreatePseudonymsForListResponse complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="getOrCreatePseudonymsForListResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="return" type="{http://psn.ttp.ganimed.icmvc.emau.org/}multiPsnMap" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getOrCreatePseudonymsForListResponse", propOrder = {
        "multiPsnMap"
})
public class GetOrCreatePseudonymsForListResponse {

    @XmlElement(name = "return")
    private MultiPsnMap multiPsnMap;

    /**
     * Gets the value of the return property.
     *
     * @return possible object is
     * {@link MultiPsnMap }
     */
    public MultiPsnMap getReturn() {
        return multiPsnMap;
    }

    /**
     * Sets the value of the return property.
     *
     * @param value allowed object is
     *              {@link MultiPsnMap }
     */
    public void setReturn(MultiPsnMap value) {
        this.multiPsnMap = value;
    }

}
