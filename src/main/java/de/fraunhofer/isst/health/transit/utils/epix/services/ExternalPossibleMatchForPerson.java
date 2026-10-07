package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für externalPossibleMatchForPerson complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="externalPossibleMatchForPerson">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="mpiId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="aliasMpiId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "externalPossibleMatchForPerson", propOrder = {
    "domainName",
    "mpiId",
    "aliasMpiId"
})
public class ExternalPossibleMatchForPerson {

    @XmlElement(required = true)
    protected String domainName;
    @XmlElement(required = true)
    protected String mpiId;
    @XmlElement(required = true)
    protected String aliasMpiId;

    /**
     * Ruft den Wert der domainName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * Legt den Wert der domainName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainName(String value) {
        this.domainName = value;
    }

    /**
     * Ruft den Wert der mpiId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMpiId() {
        return mpiId;
    }

    /**
     * Legt den Wert der mpiId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMpiId(String value) {
        this.mpiId = value;
    }

    /**
     * Ruft den Wert der aliasMpiId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAliasMpiId() {
        return aliasMpiId;
    }

    /**
     * Legt den Wert der aliasMpiId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAliasMpiId(String value) {
        this.aliasMpiId = value;
    }

}
