package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für searchMask complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="searchMask">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="and" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="dayOfBirth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="fuzzySearchParams" type="{http://service.epix.ttp.icmvc.emau.org/}fuzzySearchParams" minOccurs="0"/>
 *         <element name="identity" type="{http://www.ttp.icmvc.emau.org/epix/common/model}identityInDTO" minOccurs="0"/>
 *         <element name="maxResults" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="monthOfBirth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="yearOfBirth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchMask", propOrder = {
    "and",
    "dayOfBirth",
    "domainName",
    "fuzzySearchParams",
    "identity",
    "maxResults",
    "monthOfBirth",
    "yearOfBirth"
})
public class SearchMask {

    protected boolean and;
    protected int dayOfBirth;
    protected String domainName;
    protected FuzzySearchParams fuzzySearchParams;
    protected IdentityInDTO identity;
    protected int maxResults;
    protected int monthOfBirth;
    protected int yearOfBirth;

    /**
     * Ruft den Wert der and-Eigenschaft ab.
     * 
     */
    public boolean isAnd() {
        return and;
    }

    /**
     * Legt den Wert der and-Eigenschaft fest.
     * 
     */
    public void setAnd(boolean value) {
        this.and = value;
    }

    /**
     * Ruft den Wert der dayOfBirth-Eigenschaft ab.
     * 
     */
    public int getDayOfBirth() {
        return dayOfBirth;
    }

    /**
     * Legt den Wert der dayOfBirth-Eigenschaft fest.
     * 
     */
    public void setDayOfBirth(int value) {
        this.dayOfBirth = value;
    }

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
     * Ruft den Wert der fuzzySearchParams-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FuzzySearchParams }
     *     
     */
    public FuzzySearchParams getFuzzySearchParams() {
        return fuzzySearchParams;
    }

    /**
     * Legt den Wert der fuzzySearchParams-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FuzzySearchParams }
     *     
     */
    public void setFuzzySearchParams(FuzzySearchParams value) {
        this.fuzzySearchParams = value;
    }

    /**
     * Ruft den Wert der identity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IdentityInDTO }
     *     
     */
    public IdentityInDTO getIdentity() {
        return identity;
    }

    /**
     * Legt den Wert der identity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityInDTO }
     *     
     */
    public void setIdentity(IdentityInDTO value) {
        this.identity = value;
    }

    /**
     * Ruft den Wert der maxResults-Eigenschaft ab.
     * 
     */
    public int getMaxResults() {
        return maxResults;
    }

    /**
     * Legt den Wert der maxResults-Eigenschaft fest.
     * 
     */
    public void setMaxResults(int value) {
        this.maxResults = value;
    }

    /**
     * Ruft den Wert der monthOfBirth-Eigenschaft ab.
     * 
     */
    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    /**
     * Legt den Wert der monthOfBirth-Eigenschaft fest.
     * 
     */
    public void setMonthOfBirth(int value) {
        this.monthOfBirth = value;
    }

    /**
     * Ruft den Wert der yearOfBirth-Eigenschaft ab.
     * 
     */
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    /**
     * Legt den Wert der yearOfBirth-Eigenschaft fest.
     * 
     */
    public void setYearOfBirth(int value) {
        this.yearOfBirth = value;
    }

}
