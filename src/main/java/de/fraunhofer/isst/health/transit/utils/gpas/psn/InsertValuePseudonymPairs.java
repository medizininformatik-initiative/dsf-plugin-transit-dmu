package de.fraunhofer.isst.health.transit.utils.gpas.psn;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insertValuePseudonymPairs complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="insertValuePseudonymPairs">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="pairs" type="{http://psn.ttp.ganimed.icmvc.emau.org/}multiPsnList"/>
 *         <element name="domainName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertValuePseudonymPairs", propOrder = {
        "pairs",
        "domainName"
})
public class InsertValuePseudonymPairs {

    @XmlElement(required = true)
    private MultiPsnList pairs;
    @XmlElement(required = true)
    private String domainName;

    /**
     * Gets the value of the pairs property.
     *
     * @return possible object is
     * {@link MultiPsnList }
     */
    public MultiPsnList getPairs() {
        return pairs;
    }

    /**
     * Sets the value of the pairs property.
     *
     * @param value allowed object is
     *              {@link MultiPsnList }
     */
    public void setPairs(MultiPsnList value) {
        this.pairs = value;
    }

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

}
