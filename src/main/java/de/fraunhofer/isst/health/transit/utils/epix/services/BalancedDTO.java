package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für balancedDTO complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="balancedDTO">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="seed" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "balancedDTO", propOrder = {
    "seed"
})
public class BalancedDTO {

    protected long seed;

    /**
     * Ruft den Wert der seed-Eigenschaft ab.
     * 
     */
    public long getSeed() {
        return seed;
    }

    /**
     * Legt den Wert der seed-Eigenschaft fest.
     * 
     */
    public void setSeed(long value) {
        this.seed = value;
    }

}
