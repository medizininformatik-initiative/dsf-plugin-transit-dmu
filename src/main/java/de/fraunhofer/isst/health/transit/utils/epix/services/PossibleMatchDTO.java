package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java-Klasse für possibleMatchDTO complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="possibleMatchDTO">
 *   <complexContent>
 *     <extension base="{http://www.ttp.icmvc.emau.org/epix/common/model}possibleMatchBaseDTO">
 *       <sequence>
 *         <element name="matchingMPIIdentities" type="{http://www.ttp.icmvc.emau.org/epix/common/model}mpiIdentityDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "possibleMatchDTO", namespace = "http://www.ttp.icmvc.emau.org/epix/common/model", propOrder = {
    "matchingMPIIdentities"
})
public class PossibleMatchDTO
    extends PossibleMatchBaseDTO
{

    @XmlElement(nillable = true)
    protected List<MpiIdentityDTO> matchingMPIIdentities;

    /**
     * Gets the value of the matchingMPIIdentities property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the matchingMPIIdentities property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMatchingMPIIdentities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MpiIdentityDTO }
     * </p>
     * 
     * 
     * @return
     *     The value of the matchingMPIIdentities property.
     */
    public List<MpiIdentityDTO> getMatchingMPIIdentities() {
        if (matchingMPIIdentities == null) {
            matchingMPIIdentities = new ArrayList<>();
        }
        return this.matchingMPIIdentities;
    }

}
