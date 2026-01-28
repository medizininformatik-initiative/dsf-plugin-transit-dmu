
package de.fraunhofer.isst.health.transit.utils.gpas.domain;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for listPSNsResponse complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="listPSNsResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="return" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="psnList" type="{http://psn.ttp.ganimed.icmvc.emau.org/}psndto"
 *                   maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "listPSNsResponse", propOrder = {
        "element"
})
public class ListPSNsResponse {

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
     *         <element name="psnList" type="{http://psn.ttp.ganimed.icmvc.emau.org/}psndto" maxOccurs="unbounded" minOccurs="0"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "psnList"
    })
    public static class Return {

        private List<Psndto> psnList;

        /**
         * Gets the value of the psnList property.
         *
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the psnList property.</p>
         *
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getPsnList().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Psndto }
         * </p>
         *
         * @return The value of the psnList property.
         */
        public List<Psndto> getPsnList() {
            if (psnList == null) {
                psnList = new ArrayList<>();
            }
            return this.psnList;
        }

    }

}
