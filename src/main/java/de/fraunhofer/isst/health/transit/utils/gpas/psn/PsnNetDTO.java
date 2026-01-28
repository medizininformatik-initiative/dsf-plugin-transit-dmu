package de.fraunhofer.isst.health.transit.utils.gpas.psn;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for psnNetDTO complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="psnNetDTO">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="root" type="{http://psn.ttp.ganimed.icmvc.emau.org/}psnNetNodeDTO" minOccurs="0"/>
 *         <element name="nodes" type="{http://psn.ttp.ganimed.icmvc.emau.org/}psnNetNodeDTO"
 *         maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "psnNetDTO", propOrder = {
        "root",
        "nodes"
})
public class PsnNetDTO {

    private PsnNetNodeDTO root;
    @XmlElement(nillable = true)
    private List<PsnNetNodeDTO> nodes;

    /**
     * Gets the value of the root property.
     *
     * @return possible object is
     * {@link PsnNetNodeDTO }
     */
    public PsnNetNodeDTO getRoot() {
        return root;
    }

    /**
     * Sets the value of the root property.
     *
     * @param value allowed object is
     *              {@link PsnNetNodeDTO }
     */
    public void setRoot(PsnNetNodeDTO value) {
        this.root = value;
    }

    /**
     * Gets the value of the nodes property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nodes property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getNodes().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PsnNetNodeDTO }
     * </p>
     *
     * @return The value of the nodes property.
     */
    public List<PsnNetNodeDTO> getNodes() {
        if (nodes == null) {
            nodes = new ArrayList<>();
        }
        return this.nodes;
    }

}
