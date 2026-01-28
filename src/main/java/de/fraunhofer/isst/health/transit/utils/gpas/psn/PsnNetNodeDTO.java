package de.fraunhofer.isst.health.transit.utils.gpas.psn;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for psnNetNodeDTO complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="psnNetNodeDTO">
 *   <complexContent>
 *     <extension base="{http://psn.ttp.ganimed.icmvc.emau.org/}psnTreeDTO">
 *       <sequence>
 *         <element name="circleChildren" type="{http://psn.ttp.ganimed.icmvc.emau.org/}psndto" maxOccurs="unbounded"
 *         minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "psnNetNodeDTO", propOrder = {
        "circleChildren"
})
public class PsnNetNodeDTO
        extends PsnTreeDTO {

    @XmlElement(nillable = true)
    private List<Psndto> circleChildren;

    /**
     * Gets the value of the circleChildren property.
     *
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the circleChildren property.</p>
     *
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getCircleChildren().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Psndto }
     * </p>
     *
     * @return The value of the circleChildren property.
     */
    public List<Psndto> getCircleChildren() {
        if (circleChildren == null) {
            circleChildren = new ArrayList<>();
        }
        return this.circleChildren;
    }

}
