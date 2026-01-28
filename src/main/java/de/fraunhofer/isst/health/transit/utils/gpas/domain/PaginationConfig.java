
package de.fraunhofer.isst.health.transit.utils.gpas.domain;

import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for paginationConfig complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="paginationConfig">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="filter">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="key" type="{http://psn.ttp.ganimed.icmvc.emau.org/}psnField" minOccurs="0"/>
 *                             <element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         <element name="filterFieldsAreTreatedAsConjunction" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="filterIsCaseSensitive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="firstEntry" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="matchMode" type="{http://psn.ttp.ganimed.icmvc.emau.org/}matchMode" minOccurs="0"/>
 *         <element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="sortField" type="{http://psn.ttp.ganimed.icmvc.emau.org/}psnField" minOccurs="0"/>
 *         <element name="sortIsAscending" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paginationConfig", propOrder = {
        "filter",
        "filterFieldsAreTreatedAsConjunction",
        "filterIsCaseSensitive",
        "firstEntry",
        "matchMode",
        "pageSize",
        "sortField",
        "sortIsAscending"
})
public class PaginationConfig {

    @XmlElement(required = true)
    private Filter filter;
    private boolean filterFieldsAreTreatedAsConjunction;
    private boolean filterIsCaseSensitive;
    private int firstEntry;
    @XmlSchemaType(name = "string")
    private MatchMode matchMode;
    private int pageSize;
    @XmlSchemaType(name = "string")
    private PsnField sortField;
    private boolean sortIsAscending;

    /**
     * Gets the value of the filter property.
     *
     * @return possible object is
     * {@link Filter }
     */
    public Filter getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     *
     * @param value allowed object is
     *              {@link Filter }
     */
    public void setFilter(Filter value) {
        this.filter = value;
    }

    /**
     * Gets the value of the filterFieldsAreTreatedAsConjunction property.
     */
    public boolean isFilterFieldsAreTreatedAsConjunction() {
        return filterFieldsAreTreatedAsConjunction;
    }

    /**
     * Sets the value of the filterFieldsAreTreatedAsConjunction property.
     */
    public void setFilterFieldsAreTreatedAsConjunction(boolean value) {
        this.filterFieldsAreTreatedAsConjunction = value;
    }

    /**
     * Gets the value of the filterIsCaseSensitive property.
     */
    public boolean isFilterIsCaseSensitive() {
        return filterIsCaseSensitive;
    }

    /**
     * Sets the value of the filterIsCaseSensitive property.
     */
    public void setFilterIsCaseSensitive(boolean value) {
        this.filterIsCaseSensitive = value;
    }

    /**
     * Gets the value of the firstEntry property.
     */
    public int getFirstEntry() {
        return firstEntry;
    }

    /**
     * Sets the value of the firstEntry property.
     */
    public void setFirstEntry(int value) {
        this.firstEntry = value;
    }

    /**
     * Gets the value of the matchMode property.
     *
     * @return possible object is
     * {@link MatchMode }
     */
    public MatchMode getMatchMode() {
        return matchMode;
    }

    /**
     * Sets the value of the matchMode property.
     *
     * @param value allowed object is
     *              {@link MatchMode }
     */
    public void setMatchMode(MatchMode value) {
        this.matchMode = value;
    }

    /**
     * Gets the value of the pageSize property.
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     */
    public void setPageSize(int value) {
        this.pageSize = value;
    }

    /**
     * Gets the value of the sortField property.
     *
     * @return possible object is
     * {@link PsnField }
     */
    public PsnField getSortField() {
        return sortField;
    }

    /**
     * Sets the value of the sortField property.
     *
     * @param value allowed object is
     *              {@link PsnField }
     */
    public void setSortField(PsnField value) {
        this.sortField = value;
    }

    /**
     * Gets the value of the sortIsAscending property.
     */
    public boolean isSortIsAscending() {
        return sortIsAscending;
    }

    /**
     * Sets the value of the sortIsAscending property.
     */
    public void setSortIsAscending(boolean value) {
        this.sortIsAscending = value;
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
     *         <element name="entry" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <sequence>
     *                   <element name="key" type="{http://psn.ttp.ganimed.icmvc.emau.org/}psnField" minOccurs="0"/>
     *                   <element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
            "entry"
    })
    public static class Filter {

        private List<Entry> entry;

        /**
         * Gets the value of the entry property.
         *
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the entry property.</p>
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
         * @return The value of the entry property.
         */
        public List<Entry> getEntry() {
            if (entry == null) {
                entry = new ArrayList<>();
            }
            return this.entry;
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
         *         <element name="key" type="{http://psn.ttp.ganimed.icmvc.emau.org/}psnField" minOccurs="0"/>
         *         <element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       </sequence>
         *     </restriction>
         *   </complexContent>
         * </complexType>
         * }</pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "key",
                "value"
        })
        public static class Entry {

            @XmlSchemaType(name = "string")
            private PsnField key;
            private String value;

            /**
             * Gets the value of the key property.
             *
             * @return possible object is
             * {@link PsnField }
             */
            public PsnField getKey() {
                return key;
            }

            /**
             * Sets the value of the key property.
             *
             * @param value allowed object is
             *              {@link PsnField }
             */
            public void setKey(PsnField value) {
                this.key = value;
            }

            /**
             * Gets the value of the value property.
             *
             * @return possible object is
             * {@link String }
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setValue(String value) {
                this.value = value;
            }

        }

    }

}
