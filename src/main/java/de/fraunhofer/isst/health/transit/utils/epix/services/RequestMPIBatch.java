package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für requestMPIBatch complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="requestMPIBatch">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="mpiRequest" type="{http://www.ttp.icmvc.emau.org/epix/common/model}mpiRequestDTO"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestMPIBatch", propOrder = {
    "mpiRequest"
})
public class RequestMPIBatch {

    @XmlElement(required = true)
    protected MpiRequestDTO mpiRequest;

    /**
     * Ruft den Wert der mpiRequest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MpiRequestDTO }
     *     
     */
    public MpiRequestDTO getMpiRequest() {
        return mpiRequest;
    }

    /**
     * Legt den Wert der mpiRequest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MpiRequestDTO }
     *     
     */
    public void setMpiRequest(MpiRequestDTO value) {
        this.mpiRequest = value;
    }

}
