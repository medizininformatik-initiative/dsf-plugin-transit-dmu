package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für searchPersonsByPDQ complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="searchPersonsByPDQ">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="searchMask" type="{http://service.epix.ttp.icmvc.emau.org/}searchMask"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchPersonsByPDQ", propOrder = {
    "searchMask"
})
public class SearchPersonsByPDQ {

    @XmlElement(required = true)
    protected SearchMask searchMask;

    /**
     * Ruft den Wert der searchMask-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SearchMask }
     *     
     */
    public SearchMask getSearchMask() {
        return searchMask;
    }

    /**
     * Legt den Wert der searchMask-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMask }
     *     
     */
    public void setSearchMask(SearchMask value) {
        this.searchMask = value;
    }

}
