
package de.fraunhofer.isst.health.transit.utils.gpas.domain;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for countPSNsForDomainsResponse complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="countPSNsForDomainsResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="psnCountForDomains" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "countPSNsForDomainsResponse", propOrder = {
        "psnCountForDomains"
})
public class CountPSNsForDomainsResponse {

    private long psnCountForDomains;

    /**
     * Gets the value of the psnCountForDomains property.
     */
    public long getPsnCountForDomains() {
        return psnCountForDomains;
    }

    /**
     * Sets the value of the psnCountForDomains property.
     */
    public void setPsnCountForDomains(long value) {
        this.psnCountForDomains = value;
    }

}
