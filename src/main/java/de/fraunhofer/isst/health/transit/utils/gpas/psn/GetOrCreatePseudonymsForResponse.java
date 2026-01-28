package de.fraunhofer.isst.health.transit.utils.gpas.psn;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for getOrCreatePseudonymsForResponse complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="getOrCreatePseudonymsForResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="return" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="psn" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getOrCreatePseudonymsForResponse", propOrder = {
        "element"
})
public class GetOrCreatePseudonymsForResponse {

    @XmlElementRef(name = "return", type = JAXBElement.class, required = false)
    private JAXBElement<Return> element;

    /**
     * Gets the value of the return property.
     *
     * @return possible object is
     * {@link JAXBElement }{@code <}{@link Return }{@code >}
     */
    public JAXBElement<Return> getReturn() {
        return element;
    }

    /**
     * Sets the value of the return property.
     *
     * @param value allowed object is
     *              {@link JAXBElement }{@code <}{@link Return }{@code >}
     */
    public void setReturn(JAXBElement<Return> value) {
        this.element = value;
    }


    /**
     * <p>Java class for anonymous complex type</p>.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.</p>
     *
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="psn" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "psn"
    })
    public static class Return {

        private List<String> psn;

        /**
         * Gets the value of the psn property.
         *
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the psn property.</p>
         *
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getPsn().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * </p>
         *
         * @return The value of the psn property.
         */
        public List<String> getPsn() {
            if (psn == null) {
                psn = new ArrayList<>();
            }
            return this.psn;
        }

    }

}
