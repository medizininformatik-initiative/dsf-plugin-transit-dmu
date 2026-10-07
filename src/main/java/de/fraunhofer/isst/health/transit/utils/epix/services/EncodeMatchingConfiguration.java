package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für encodeMatchingConfiguration complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="encodeMatchingConfiguration">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="config" type="{http://service.epix.ttp.icmvc.emau.org/}configurationContainer"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "encodeMatchingConfiguration", propOrder = {
    "config"
})
public class EncodeMatchingConfiguration {

    @XmlElement(required = true)
    protected ConfigurationContainer config;

    /**
     * Ruft den Wert der config-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationContainer }
     *     
     */
    public ConfigurationContainer getConfig() {
        return config;
    }

    /**
     * Legt den Wert der config-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationContainer }
     *     
     */
    public void setConfig(ConfigurationContainer value) {
        this.config = value;
    }

}
