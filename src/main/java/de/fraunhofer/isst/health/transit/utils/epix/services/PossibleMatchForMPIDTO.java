package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für possibleMatchForMPIDTO complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="possibleMatchForMPIDTO">
 *   <complexContent>
 *     <extension base="{http://www.ttp.icmvc.emau.org/epix/common/model}possibleMatchBaseDTO">
 *       <sequence>
 *         <element name="assignedIdentity" type="{http://www.ttp.icmvc.emau.org/epix/common/model}identityOutDTO" minOccurs="0"/>
 *         <element name="matchingMPIIdentity" type="{http://www.ttp.icmvc.emau.org/epix/common/model}mpiIdentityDTO" minOccurs="0"/>
 *         <element name="requestedMPI" type="{http://www.ttp.icmvc.emau.org/epix/common/model}identifierDTO" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "possibleMatchForMPIDTO", namespace = "http://www.ttp.icmvc.emau.org/epix/common/model", propOrder = {
    "assignedIdentity",
    "matchingMPIIdentity",
    "requestedMPI"
})
public class PossibleMatchForMPIDTO
    extends PossibleMatchBaseDTO
{

    protected IdentityOutDTO assignedIdentity;
    protected MpiIdentityDTO matchingMPIIdentity;
    protected IdentifierDTO requestedMPI;

    /**
     * Ruft den Wert der assignedIdentity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IdentityOutDTO }
     *     
     */
    public IdentityOutDTO getAssignedIdentity() {
        return assignedIdentity;
    }

    /**
     * Legt den Wert der assignedIdentity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityOutDTO }
     *     
     */
    public void setAssignedIdentity(IdentityOutDTO value) {
        this.assignedIdentity = value;
    }

    /**
     * Ruft den Wert der matchingMPIIdentity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MpiIdentityDTO }
     *     
     */
    public MpiIdentityDTO getMatchingMPIIdentity() {
        return matchingMPIIdentity;
    }

    /**
     * Legt den Wert der matchingMPIIdentity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MpiIdentityDTO }
     *     
     */
    public void setMatchingMPIIdentity(MpiIdentityDTO value) {
        this.matchingMPIIdentity = value;
    }

    /**
     * Ruft den Wert der requestedMPI-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierDTO }
     *     
     */
    public IdentifierDTO getRequestedMPI() {
        return requestedMPI;
    }

    /**
     * Legt den Wert der requestedMPI-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierDTO }
     *     
     */
    public void setRequestedMPI(IdentifierDTO value) {
        this.requestedMPI = value;
    }

}
