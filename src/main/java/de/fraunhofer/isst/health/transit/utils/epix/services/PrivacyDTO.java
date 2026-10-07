package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java-Klasse für privacyDTO complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="privacyDTO">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="bloomFilterConfigs" type="{http://service.epix.ttp.icmvc.emau.org/}bloomFilterConfigDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "privacyDTO", propOrder = {
    "bloomFilterConfigs"
})
public class PrivacyDTO {

    @XmlElement(nillable = true)
    protected List<BloomFilterConfigDTO> bloomFilterConfigs;

    /**
     * Gets the value of the bloomFilterConfigs property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bloomFilterConfigs property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBloomFilterConfigs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BloomFilterConfigDTO }
     * </p>
     * 
     * 
     * @return
     *     The value of the bloomFilterConfigs property.
     */
    public List<BloomFilterConfigDTO> getBloomFilterConfigs() {
        if (bloomFilterConfigs == null) {
            bloomFilterConfigs = new ArrayList<>();
        }
        return this.bloomFilterConfigs;
    }

}
