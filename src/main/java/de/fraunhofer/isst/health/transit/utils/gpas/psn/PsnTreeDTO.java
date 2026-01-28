package de.fraunhofer.isst.health.transit.utils.gpas.psn;

import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for psnTreeDTO complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="psnTreeDTO">
 *   <complexContent>
 *     <extension base="{http://psn.ttp.ganimed.icmvc.emau.org/}psndto">
 *       <sequence>
 *         <element name="level" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="children" type="{http://psn.ttp.ganimed.icmvc.emau.org/}psnTreeDTO" maxOccurs="unbounded"
 *         minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "psnTreeDTO", propOrder = {
        "level",
        "children"
})
@XmlSeeAlso({
        PsnNetNodeDTO.class
})
public class PsnTreeDTO
        extends Psndto {

    private int level;
    @XmlElement(nillable = true)
    private List<PsnTreeDTO> children;

    /**
     * Gets the value of the level property.
     */
    public int getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     */
    public void setLevel(int value) {
        this.level = value;
    }

    /**
     * Gets the value of the children property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the children property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getChildren().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PsnTreeDTO }
     * </p>
     *
     * @return The value of the children property.
     */
    public List<PsnTreeDTO> getChildren() {
        if (children == null) {
            children = new ArrayList<>();
        }
        return this.children;
    }

}
