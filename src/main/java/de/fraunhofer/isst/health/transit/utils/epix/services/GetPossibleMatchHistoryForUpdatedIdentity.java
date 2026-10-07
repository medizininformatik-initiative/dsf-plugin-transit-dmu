package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getPossibleMatchHistoryForUpdatedIdentity complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="getPossibleMatchHistoryForUpdatedIdentity">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="updatedIdentityId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPossibleMatchHistoryForUpdatedIdentity", propOrder = {
    "updatedIdentityId"
})
public class GetPossibleMatchHistoryForUpdatedIdentity {

    protected long updatedIdentityId;

    /**
     * Ruft den Wert der updatedIdentityId-Eigenschaft ab.
     * 
     */
    public long getUpdatedIdentityId() {
        return updatedIdentityId;
    }

    /**
     * Legt den Wert der updatedIdentityId-Eigenschaft fest.
     * 
     */
    public void setUpdatedIdentityId(long value) {
        this.updatedIdentityId = value;
    }

}
