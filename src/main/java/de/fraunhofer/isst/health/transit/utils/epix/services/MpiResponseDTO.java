package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java-Klasse für mpiResponseDTO complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="mpiResponseDTO">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="responseEntries">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="key" type="{http://www.ttp.icmvc.emau.org/epix/common/model}identityInBaseDTO" minOccurs="0"/>
 *                             <element name="value" type="{http://www.ttp.icmvc.emau.org/epix/common/model}responseEntryDTO" minOccurs="0"/>
 *                           </sequence>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
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
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mpiResponseDTO", namespace = "http://www.ttp.icmvc.emau.org/epix/common/model", propOrder = {
    "responseEntries"
})
public class MpiResponseDTO {

    @XmlElement(required = true)
    protected ResponseEntries responseEntries;

    /**
     * Ruft den Wert der responseEntries-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResponseEntries }
     *     
     */
    public ResponseEntries getResponseEntries() {
        return responseEntries;
    }

    /**
     * Legt den Wert der responseEntries-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseEntries }
     *     
     */
    public void setResponseEntries(ResponseEntries value) {
        this.responseEntries = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.</p>
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="entry" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="key" type="{http://www.ttp.icmvc.emau.org/epix/common/model}identityInBaseDTO" minOccurs="0"/>
     *                   <element name="value" type="{http://www.ttp.icmvc.emau.org/epix/common/model}responseEntryDTO" minOccurs="0"/>
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
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "entry"
    })
    public static class ResponseEntries {

        protected List<Entry> entry;

        /**
         * Gets the value of the entry property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore, any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a {@code set} method for the entry property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Entry }
         * </p>
         * 
         * 
         * @return
         *     The value of the entry property.
         */
        public List<Entry> getEntry() {
            if (entry == null) {
                entry = new ArrayList<>();
            }
            return this.entry;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.</p>
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
         * 
         * <pre>{@code
         * <complexType>
         *   <complexContent>
         *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       <sequence>
         *         <element name="key" type="{http://www.ttp.icmvc.emau.org/epix/common/model}identityInBaseDTO" minOccurs="0"/>
         *         <element name="value" type="{http://www.ttp.icmvc.emau.org/epix/common/model}responseEntryDTO" minOccurs="0"/>
         *       </sequence>
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "key",
            "value"
        })
        public static class Entry {

            protected IdentityInBaseDTO key;
            protected ResponseEntryDTO value;

            /**
             * Ruft den Wert der key-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link IdentityInBaseDTO }
             *     
             */
            public IdentityInBaseDTO getKey() {
                return key;
            }

            /**
             * Legt den Wert der key-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link IdentityInBaseDTO }
             *     
             */
            public void setKey(IdentityInBaseDTO value) {
                this.key = value;
            }

            /**
             * Ruft den Wert der value-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link ResponseEntryDTO }
             *     
             */
            public ResponseEntryDTO getValue() {
                return value;
            }

            /**
             * Legt den Wert der value-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link ResponseEntryDTO }
             *     
             */
            public void setValue(ResponseEntryDTO value) {
                this.value = value;
            }

        }

    }

}
