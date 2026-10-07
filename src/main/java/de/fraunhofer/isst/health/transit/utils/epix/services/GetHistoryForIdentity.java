package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getHistoryForIdentity complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="getHistoryForIdentity">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="identityId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getHistoryForIdentity", propOrder = {
    "identityId"
})
public class GetHistoryForIdentity {

    protected long identityId;

    /**
     * Ruft den Wert der identityId-Eigenschaft ab.
     * 
     */
    public long getIdentityId() {
        return identityId;
    }

    /**
     * Legt den Wert der identityId-Eigenschaft fest.
     * 
     */
    public void setIdentityId(long value) {
        this.identityId = value;
    }

}
