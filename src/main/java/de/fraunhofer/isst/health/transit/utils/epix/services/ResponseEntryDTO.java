package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für responseEntryDTO complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="responseEntryDTO">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="matchStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="mpiErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="person" type="{http://www.ttp.icmvc.emau.org/epix/common/model}personDTO" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseEntryDTO", namespace = "http://www.ttp.icmvc.emau.org/epix/common/model", propOrder = {
    "matchStatus",
    "mpiErrorCode",
    "person"
})
public class ResponseEntryDTO {

    protected String matchStatus;
    protected String mpiErrorCode;
    protected PersonDTO person;

    /**
     * Ruft den Wert der matchStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchStatus() {
        return matchStatus;
    }

    /**
     * Legt den Wert der matchStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchStatus(String value) {
        this.matchStatus = value;
    }

    /**
     * Ruft den Wert der mpiErrorCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMpiErrorCode() {
        return mpiErrorCode;
    }

    /**
     * Legt den Wert der mpiErrorCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMpiErrorCode(String value) {
        this.mpiErrorCode = value;
    }

    /**
     * Ruft den Wert der person-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PersonDTO }
     *     
     */
    public PersonDTO getPerson() {
        return person;
    }

    /**
     * Legt den Wert der person-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonDTO }
     *     
     */
    public void setPerson(PersonDTO value) {
        this.person = value;
    }

}
