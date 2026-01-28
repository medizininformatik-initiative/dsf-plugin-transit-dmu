
package de.fraunhofer.isst.health.transit.utils.gpas.domain;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for updateDomainInUse complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="updateDomainInUse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="comment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="parentDomainNames" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         <element name="sendNotificationsWeb" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="psnsDeletable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateDomainInUse", propOrder = {
        "domainName",
        "label",
        "comment",
        "parentDomainNames",
        "sendNotificationsWeb",
        "psnsDeletable"
})
public class UpdateDomainInUse {

    @XmlElement(required = true)
    private String domainName;
    @XmlElement(required = true)
    private String label;
    @XmlElement(required = true)
    private String comment;
    @XmlElement(required = true)
    private List<String> parentDomainNames;
    private boolean sendNotificationsWeb;
    private boolean psnsDeletable;

    /**
     * Gets the value of the domainName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * Sets the value of the domainName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDomainName(String value) {
        this.domainName = value;
    }

    /**
     * Gets the value of the label property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the comment property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the parentDomainNames property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parentDomainNames property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getParentDomainNames().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     *
     * @return The value of the parentDomainNames property.
     */
    public List<String> getParentDomainNames() {
        if (parentDomainNames == null) {
            parentDomainNames = new ArrayList<>();
        }
        return this.parentDomainNames;
    }

    /**
     * Gets the value of the sendNotificationsWeb property.
     */
    public boolean isSendNotificationsWeb() {
        return sendNotificationsWeb;
    }

    /**
     * Sets the value of the sendNotificationsWeb property.
     */
    public void setSendNotificationsWeb(boolean value) {
        this.sendNotificationsWeb = value;
    }

    /**
     * Gets the value of the psnsDeletable property.
     */
    public boolean isPsnsDeletable() {
        return psnsDeletable;
    }

    /**
     * Sets the value of the psnsDeletable property.
     */
    public void setPsnsDeletable(boolean value) {
        this.psnsDeletable = value;
    }

}
