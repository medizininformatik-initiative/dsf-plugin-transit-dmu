package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java-Klasse für identityOutDTO complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="identityOutDTO">
 *   <complexContent>
 *     <extension base="{http://www.ttp.icmvc.emau.org/epix/common/model}identityOutBaseDTO">
 *       <sequence>
 *         <element name="contacts" type="{http://www.ttp.icmvc.emau.org/epix/common/model}contactOutDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identityOutDTO", namespace = "http://www.ttp.icmvc.emau.org/epix/common/model", propOrder = {
    "contacts"
})
public class IdentityOutDTO
    extends IdentityOutBaseDTO
{

    @XmlElement(nillable = true)
    protected List<ContactOutDTO> contacts;

    /**
     * Gets the value of the contacts property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the contacts property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getContacts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactOutDTO }
     * </p>
     * 
     * 
     * @return
     *     The value of the contacts property.
     */
    public List<ContactOutDTO> getContacts() {
        if (contacts == null) {
            contacts = new ArrayList<>();
        }
        return this.contacts;
    }

}
