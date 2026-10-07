package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für prioritizePossibleMatch complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="prioritizePossibleMatch">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="linkId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="priority" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prioritizePossibleMatch", propOrder = {
    "linkId",
    "priority"
})
public class PrioritizePossibleMatch {

    protected long linkId;
    @XmlElement(required = true)
    protected String priority;

    /**
     * Ruft den Wert der linkId-Eigenschaft ab.
     * 
     */
    public long getLinkId() {
        return linkId;
    }

    /**
     * Legt den Wert der linkId-Eigenschaft fest.
     * 
     */
    public void setLinkId(long value) {
        this.linkId = value;
    }

    /**
     * Ruft den Wert der priority-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Legt den Wert der priority-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

}
