package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für countPossibleMatchesForDomainFiltered complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="countPossibleMatchesForDomainFiltered">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="paginationConfig" type="{http://service.epix.ttp.icmvc.emau.org/}paginationConfig"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "countPossibleMatchesForDomainFiltered", propOrder = {
    "domainName",
    "paginationConfig"
})
public class CountPossibleMatchesForDomainFiltered {

    @XmlElement(required = true)
    protected String domainName;
    @XmlElement(required = true)
    protected PaginationConfig paginationConfig;

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
     * Ruft den Wert der paginationConfig-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PaginationConfig }
     *     
     */
    public PaginationConfig getPaginationConfig() {
        return paginationConfig;
    }

    /**
     * Legt den Wert der paginationConfig-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginationConfig }
     *     
     */
    public void setPaginationConfig(PaginationConfig value) {
        this.paginationConfig = value;
    }

}
