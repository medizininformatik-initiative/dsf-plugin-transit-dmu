package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für requestConfig complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="requestConfig">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="forceReferenceUpdate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="saveAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestConfig", namespace = "http://www.ttp.icmvc.emau.org/epix/common/model", propOrder = {
    "forceReferenceUpdate",
    "saveAction"
})
public class RequestConfig {

    protected boolean forceReferenceUpdate;
    protected String saveAction;

    /**
     * Ruft den Wert der forceReferenceUpdate-Eigenschaft ab.
     * 
     */
    public boolean isForceReferenceUpdate() {
        return forceReferenceUpdate;
    }

    /**
     * Legt den Wert der forceReferenceUpdate-Eigenschaft fest.
     * 
     */
    public void setForceReferenceUpdate(boolean value) {
        this.forceReferenceUpdate = value;
    }

    /**
     * Ruft den Wert der saveAction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaveAction() {
        return saveAction;
    }

    /**
     * Legt den Wert der saveAction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaveAction(String value) {
        this.saveAction = value;
    }

}
