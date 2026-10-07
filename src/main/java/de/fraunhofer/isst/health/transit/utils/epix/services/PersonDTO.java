package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java-Klasse für personDTO complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="personDTO">
 *   <complexContent>
 *     <extension base="{http://www.ttp.icmvc.emau.org/epix/common/model}personBaseDTO">
 *       <sequence>
 *         <element name="otherIdentities" type="{http://www.ttp.icmvc.emau.org/epix/common/model}identityOutDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="referenceIdentity" type="{http://www.ttp.icmvc.emau.org/epix/common/model}identityOutDTO" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personDTO", namespace = "http://www.ttp.icmvc.emau.org/epix/common/model", propOrder = {
    "otherIdentities",
    "referenceIdentity"
})
public class PersonDTO
    extends PersonBaseDTO
{

    @XmlElement(nillable = true)
    protected List<IdentityOutDTO> otherIdentities;
    protected IdentityOutDTO referenceIdentity;

    /**
     * Gets the value of the otherIdentities property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the otherIdentities property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOtherIdentities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentityOutDTO }
     * </p>
     * 
     * 
     * @return
     *     The value of the otherIdentities property.
     */
    public List<IdentityOutDTO> getOtherIdentities() {
        if (otherIdentities == null) {
            otherIdentities = new ArrayList<>();
        }
        return this.otherIdentities;
    }

    /**
     * Ruft den Wert der referenceIdentity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IdentityOutDTO }
     *     
     */
    public IdentityOutDTO getReferenceIdentity() {
        return referenceIdentity;
    }

    /**
     * Legt den Wert der referenceIdentity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityOutDTO }
     *     
     */
    public void setReferenceIdentity(IdentityOutDTO value) {
        this.referenceIdentity = value;
    }

}
