package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für removePossibleMatch complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="removePossibleMatch">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="possibleMatchId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="comment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removePossibleMatch", propOrder = {
    "possibleMatchId",
    "comment"
})
public class RemovePossibleMatch {

    protected long possibleMatchId;
    @XmlElement(required = true)
    protected String comment;

    /**
     * Ruft den Wert der possibleMatchId-Eigenschaft ab.
     * 
     */
    public long getPossibleMatchId() {
        return possibleMatchId;
    }

    /**
     * Legt den Wert der possibleMatchId-Eigenschaft fest.
     * 
     */
    public void setPossibleMatchId(long value) {
        this.possibleMatchId = value;
    }

    /**
     * Ruft den Wert der comment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Legt den Wert der comment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

}
