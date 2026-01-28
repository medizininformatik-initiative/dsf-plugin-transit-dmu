
package de.fraunhofer.isst.health.transit.utils.gpas.domain;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for countPSNsResponse complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="countPSNsResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="psnCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "countPSNsResponse", propOrder = {
        "psnCount"
})
public class CountPSNsResponse {

    private long psnCount;

    /**
     * Gets the value of the psnCount property.
     */
    public long getPsnCount() {
        return psnCount;
    }

    /**
     * Sets the value of the psnCount property.
     */
    public void setPsnCount(long value) {
        this.psnCount = value;
    }

}
