
package de.fraunhofer.isst.health.transit.utils.gpas.domain;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for arePSNDeletableResponse complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="arePSNDeletableResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="return" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arePSNDeletableResponse", propOrder = {
        "aBoolean"
})
public class ArePSNDeletableResponse {

    @XmlElement(name = "return")
    private boolean aBoolean;

    /**
     * Gets the value of the return property.
     */
    public boolean isReturn() {
        return aBoolean;
    }

    /**
     * Sets the value of the return property.
     */
    public void setReturn(boolean value) {
        this.aBoolean = value;
    }

}
