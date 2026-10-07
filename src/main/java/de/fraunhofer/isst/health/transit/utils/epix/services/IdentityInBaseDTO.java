package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java-Klasse für identityInBaseDTO complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="identityInBaseDTO">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="birthPlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="civilStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="dateOfDeath" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="degree" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="externalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="identifiers" type="{http://www.ttp.icmvc.emau.org/epix/common/model}identifierDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="motherTongue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="mothersMaidenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="race" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="religion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="value1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="value10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="value2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="value3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="value4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="value5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="value6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="value7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="value8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="value9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="vitalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identityInBaseDTO", namespace = "http://www.ttp.icmvc.emau.org/epix/common/model", propOrder = {
    "birthDate",
    "birthPlace",
    "civilStatus",
    "dateOfDeath",
    "degree",
    "externalDate",
    "firstName",
    "gender",
    "identifiers",
    "lastName",
    "middleName",
    "motherTongue",
    "mothersMaidenName",
    "nationality",
    "prefix",
    "race",
    "religion",
    "suffix",
    "value1",
    "value10",
    "value2",
    "value3",
    "value4",
    "value5",
    "value6",
    "value7",
    "value8",
    "value9",
    "vitalStatus"
})
@XmlSeeAlso({
    IdentityInDTO.class,
    IdentityOutBaseDTO.class
})
public class IdentityInBaseDTO {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthDate;
    protected String birthPlace;
    protected String civilStatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfDeath;
    protected String degree;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar externalDate;
    protected String firstName;
    protected String gender;
    @XmlElement(nillable = true)
    protected List<IdentifierDTO> identifiers;
    protected String lastName;
    protected String middleName;
    protected String motherTongue;
    protected String mothersMaidenName;
    protected String nationality;
    protected String prefix;
    protected String race;
    protected String religion;
    protected String suffix;
    protected String value1;
    protected String value10;
    protected String value2;
    protected String value3;
    protected String value4;
    protected String value5;
    protected String value6;
    protected String value7;
    protected String value8;
    protected String value9;
    protected String vitalStatus;

    /**
     * Ruft den Wert der birthDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Legt den Wert der birthDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Ruft den Wert der birthPlace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthPlace() {
        return birthPlace;
    }

    /**
     * Legt den Wert der birthPlace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthPlace(String value) {
        this.birthPlace = value;
    }

    /**
     * Ruft den Wert der civilStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCivilStatus() {
        return civilStatus;
    }

    /**
     * Legt den Wert der civilStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCivilStatus(String value) {
        this.civilStatus = value;
    }

    /**
     * Ruft den Wert der dateOfDeath-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfDeath() {
        return dateOfDeath;
    }

    /**
     * Legt den Wert der dateOfDeath-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfDeath(XMLGregorianCalendar value) {
        this.dateOfDeath = value;
    }

    /**
     * Ruft den Wert der degree-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDegree() {
        return degree;
    }

    /**
     * Legt den Wert der degree-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDegree(String value) {
        this.degree = value;
    }

    /**
     * Ruft den Wert der externalDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExternalDate() {
        return externalDate;
    }

    /**
     * Legt den Wert der externalDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExternalDate(XMLGregorianCalendar value) {
        this.externalDate = value;
    }

    /**
     * Ruft den Wert der firstName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Legt den Wert der firstName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Ruft den Wert der gender-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Legt den Wert der gender-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the identifiers property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the identifiers property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getIdentifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifierDTO }
     * </p>
     * 
     * 
     * @return
     *     The value of the identifiers property.
     */
    public List<IdentifierDTO> getIdentifiers() {
        if (identifiers == null) {
            identifiers = new ArrayList<>();
        }
        return this.identifiers;
    }

    /**
     * Ruft den Wert der lastName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Legt den Wert der lastName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Ruft den Wert der middleName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Legt den Wert der middleName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Ruft den Wert der motherTongue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherTongue() {
        return motherTongue;
    }

    /**
     * Legt den Wert der motherTongue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherTongue(String value) {
        this.motherTongue = value;
    }

    /**
     * Ruft den Wert der mothersMaidenName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMothersMaidenName() {
        return mothersMaidenName;
    }

    /**
     * Legt den Wert der mothersMaidenName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMothersMaidenName(String value) {
        this.mothersMaidenName = value;
    }

    /**
     * Ruft den Wert der nationality-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Legt den Wert der nationality-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * Ruft den Wert der prefix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Legt den Wert der prefix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefix(String value) {
        this.prefix = value;
    }

    /**
     * Ruft den Wert der race-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRace() {
        return race;
    }

    /**
     * Legt den Wert der race-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRace(String value) {
        this.race = value;
    }

    /**
     * Ruft den Wert der religion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReligion() {
        return religion;
    }

    /**
     * Legt den Wert der religion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReligion(String value) {
        this.religion = value;
    }

    /**
     * Ruft den Wert der suffix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Legt den Wert der suffix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffix(String value) {
        this.suffix = value;
    }

    /**
     * Ruft den Wert der value1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue1() {
        return value1;
    }

    /**
     * Legt den Wert der value1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue1(String value) {
        this.value1 = value;
    }

    /**
     * Ruft den Wert der value10-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue10() {
        return value10;
    }

    /**
     * Legt den Wert der value10-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue10(String value) {
        this.value10 = value;
    }

    /**
     * Ruft den Wert der value2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue2() {
        return value2;
    }

    /**
     * Legt den Wert der value2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue2(String value) {
        this.value2 = value;
    }

    /**
     * Ruft den Wert der value3-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue3() {
        return value3;
    }

    /**
     * Legt den Wert der value3-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue3(String value) {
        this.value3 = value;
    }

    /**
     * Ruft den Wert der value4-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue4() {
        return value4;
    }

    /**
     * Legt den Wert der value4-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue4(String value) {
        this.value4 = value;
    }

    /**
     * Ruft den Wert der value5-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue5() {
        return value5;
    }

    /**
     * Legt den Wert der value5-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue5(String value) {
        this.value5 = value;
    }

    /**
     * Ruft den Wert der value6-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue6() {
        return value6;
    }

    /**
     * Legt den Wert der value6-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue6(String value) {
        this.value6 = value;
    }

    /**
     * Ruft den Wert der value7-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue7() {
        return value7;
    }

    /**
     * Legt den Wert der value7-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue7(String value) {
        this.value7 = value;
    }

    /**
     * Ruft den Wert der value8-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue8() {
        return value8;
    }

    /**
     * Legt den Wert der value8-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue8(String value) {
        this.value8 = value;
    }

    /**
     * Ruft den Wert der value9-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue9() {
        return value9;
    }

    /**
     * Legt den Wert der value9-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue9(String value) {
        this.value9 = value;
    }

    /**
     * Ruft den Wert der vitalStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVitalStatus() {
        return vitalStatus;
    }

    /**
     * Legt den Wert der vitalStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVitalStatus(String value) {
        this.vitalStatus = value;
    }

}
