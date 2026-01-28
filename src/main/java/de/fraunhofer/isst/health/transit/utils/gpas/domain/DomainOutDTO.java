
package de.fraunhofer.isst.health.transit.utils.gpas.domain;

import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for domainOutDTO complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="domainOutDTO">
 *   <complexContent>
 *     <extension base="{http://psn.ttp.ganimed.icmvc.emau.org/}domainInDTO">
 *       <sequence>
 *         <element name="childDomainNames" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="numberOfPseudonyms" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="numberOfAnonyms" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="cacheUsed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="percentPsnsUsed" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         <element name="createDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="updateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="createDateString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="updateDateString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "domainOutDTO", propOrder = {
        "childDomainNames",
        "numberOfPseudonyms",
        "numberOfAnonyms",
        "cacheUsed",
        "percentPsnsUsed",
        "createDate",
        "updateDate",
        "createDateString",
        "updateDateString"
})
public class DomainOutDTO
        extends DomainInDTO {

    @XmlElement(nillable = true)
    private List<String> childDomainNames;
    private long numberOfPseudonyms;
    private long numberOfAnonyms;
    private boolean cacheUsed;
    private short percentPsnsUsed;
    @XmlSchemaType(name = "dateTime")
    private XMLGregorianCalendar createDate;
    @XmlSchemaType(name = "dateTime")
    private XMLGregorianCalendar updateDate;
    private String createDateString;
    private String updateDateString;

    /**
     * Gets the value of the childDomainNames property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childDomainNames property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getChildDomainNames().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     *
     * @return The value of the childDomainNames property.
     */
    public List<String> getChildDomainNames() {
        if (childDomainNames == null) {
            childDomainNames = new ArrayList<>();
        }
        return this.childDomainNames;
    }

    /**
     * Gets the value of the numberOfPseudonyms property.
     */
    public long getNumberOfPseudonyms() {
        return numberOfPseudonyms;
    }

    /**
     * Sets the value of the numberOfPseudonyms property.
     */
    public void setNumberOfPseudonyms(long value) {
        this.numberOfPseudonyms = value;
    }

    /**
     * Gets the value of the numberOfAnonyms property.
     */
    public long getNumberOfAnonyms() {
        return numberOfAnonyms;
    }

    /**
     * Sets the value of the numberOfAnonyms property.
     */
    public void setNumberOfAnonyms(long value) {
        this.numberOfAnonyms = value;
    }

    /**
     * Gets the value of the cacheUsed property.
     */
    public boolean isCacheUsed() {
        return cacheUsed;
    }

    /**
     * Sets the value of the cacheUsed property.
     */
    public void setCacheUsed(boolean value) {
        this.cacheUsed = value;
    }

    /**
     * Gets the value of the percentPsnsUsed property.
     */
    public short getPercentPsnsUsed() {
        return percentPsnsUsed;
    }

    /**
     * Sets the value of the percentPsnsUsed property.
     */
    public void setPercentPsnsUsed(short value) {
        this.percentPsnsUsed = value;
    }

    /**
     * Gets the value of the createDate property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the updateDate property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getUpdateDate() {
        return updateDate;
    }

    /**
     * Sets the value of the updateDate property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setUpdateDate(XMLGregorianCalendar value) {
        this.updateDate = value;
    }

    /**
     * Gets the value of the createDateString property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCreateDateString() {
        return createDateString;
    }

    /**
     * Sets the value of the createDateString property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCreateDateString(String value) {
        this.createDateString = value;
    }

    /**
     * Gets the value of the updateDateString property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUpdateDateString() {
        return updateDateString;
    }

    /**
     * Sets the value of the updateDateString property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUpdateDateString(String value) {
        this.updateDateString = value;
    }

}
