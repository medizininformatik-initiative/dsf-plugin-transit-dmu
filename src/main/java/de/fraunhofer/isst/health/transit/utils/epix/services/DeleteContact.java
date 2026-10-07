package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für deleteContact complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="deleteContact">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="contactId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteContact", propOrder = {
    "contactId"
})
public class DeleteContact {

    protected long contactId;

    /**
     * Ruft den Wert der contactId-Eigenschaft ab.
     * 
     */
    public long getContactId() {
        return contactId;
    }

    /**
     * Legt den Wert der contactId-Eigenschaft fest.
     * 
     */
    public void setContactId(long value) {
        this.contactId = value;
    }

}
