
package de.fraunhofer.isst.health.transit.utils.gpas.domain;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for listPSNsForDomainsPaginated complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="listPSNsForDomainsPaginated">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="domainNames" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         <element name="config" type="{http://psn.ttp.ganimed.icmvc.emau.org/}paginationConfig"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listPSNsForDomainsPaginated", propOrder = {
        "domainNames",
        "config"
})
public class ListPSNsForDomainsPaginated {

    @XmlElement(required = true)
    private List<String> domainNames;
    @XmlElement(required = true)
    private PaginationConfig config;

    /**
     * Gets the value of the domainNames property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the domainNames property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDomainNames().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     *
     * @return The value of the domainNames property.
     */
    public List<String> getDomainNames() {
        if (domainNames == null) {
            domainNames = new ArrayList<>();
        }
        return this.domainNames;
    }

    /**
     * Gets the value of the config property.
     *
     * @return possible object is
     * {@link PaginationConfig }
     */
    public PaginationConfig getConfig() {
        return config;
    }

    /**
     * Sets the value of the config property.
     *
     * @param value allowed object is
     *              {@link PaginationConfig }
     */
    public void setConfig(PaginationConfig value) {
        this.config = value;
    }

}
