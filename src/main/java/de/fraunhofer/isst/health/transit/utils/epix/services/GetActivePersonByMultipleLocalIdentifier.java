package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java-Klasse für getActivePersonByMultipleLocalIdentifier complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="getActivePersonByMultipleLocalIdentifier">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="identifier" type="{http://www.ttp.icmvc.emau.org/epix/common/model}identifierDTO" maxOccurs="unbounded"/>
 *         <element name="allIdentifierRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getActivePersonByMultipleLocalIdentifier", propOrder = {
    "domainName",
    "identifier",
    "allIdentifierRequired"
})
public class GetActivePersonByMultipleLocalIdentifier {

    @XmlElement(required = true)
    protected String domainName;
    @XmlElement(required = true)
    protected List<IdentifierDTO> identifier;
    protected boolean allIdentifierRequired;

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
     * Gets the value of the identifier property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the identifier property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getIdentifier().add(newItem);
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
     *     The value of the identifier property.
     */
    public List<IdentifierDTO> getIdentifier() {
        if (identifier == null) {
            identifier = new ArrayList<>();
        }
        return this.identifier;
    }

    /**
     * Ruft den Wert der allIdentifierRequired-Eigenschaft ab.
     * 
     */
    public boolean isAllIdentifierRequired() {
        return allIdentifierRequired;
    }

    /**
     * Legt den Wert der allIdentifierRequired-Eigenschaft fest.
     * 
     */
    public void setAllIdentifierRequired(boolean value) {
        this.allIdentifierRequired = value;
    }

}
