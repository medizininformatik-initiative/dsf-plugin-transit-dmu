package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java-Klasse für paginationConfig complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="paginationConfig">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="createTimestampFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="dateFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="eventFilter" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="firstEntry" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="globalFieldFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="globalFieldFilterCaseSensitive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="identityAndPersonFilterCombinedAsConjunction" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="identityFilter">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="key" type="{http://service.epix.ttp.icmvc.emau.org/}identityField" minOccurs="0"/>
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
 *         <element name="identityFilterAsConjunction" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="identityFilterCaseSensitive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="identityGenderStrings">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="key" type="{http://service.epix.ttp.icmvc.emau.org/}gender" minOccurs="0"/>
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
 *         <element name="identityVitalStatusStrings">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="key" type="{http://service.epix.ttp.icmvc.emau.org/}vitalStatus" minOccurs="0"/>
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
 *         <element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="personFilter">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="key" type="{http://service.epix.ttp.icmvc.emau.org/}personField" minOccurs="0"/>
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
 *         <element name="personFilterAsConjunction" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="personFilterCaseSensitive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="priorityFilter" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="solutionFilter" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="sortField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="sortIsAscending" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="timeFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paginationConfig", propOrder = {
    "createTimestampFilter",
    "dateFormat",
    "eventFilter",
    "firstEntry",
    "globalFieldFilter",
    "globalFieldFilterCaseSensitive",
    "identityAndPersonFilterCombinedAsConjunction",
    "identityFilter",
    "identityFilterAsConjunction",
    "identityFilterCaseSensitive",
    "identityGenderStrings",
    "identityVitalStatusStrings",
    "pageSize",
    "personFilter",
    "personFilterAsConjunction",
    "personFilterCaseSensitive",
    "priorityFilter",
    "solutionFilter",
    "sortField",
    "sortIsAscending",
    "timeFormat"
})
public class PaginationConfig {

    protected String createTimestampFilter;
    protected String dateFormat;
    @XmlElement(nillable = true)
    protected List<String> eventFilter;
    protected int firstEntry;
    protected String globalFieldFilter;
    protected boolean globalFieldFilterCaseSensitive;
    protected boolean identityAndPersonFilterCombinedAsConjunction;
    @XmlElement(required = true)
    protected IdentityFilter identityFilter;
    protected boolean identityFilterAsConjunction;
    protected boolean identityFilterCaseSensitive;
    @XmlElement(required = true)
    protected IdentityGenderStrings identityGenderStrings;
    @XmlElement(required = true)
    protected IdentityVitalStatusStrings identityVitalStatusStrings;
    protected int pageSize;
    @XmlElement(required = true)
    protected PersonFilter personFilter;
    protected boolean personFilterAsConjunction;
    protected boolean personFilterCaseSensitive;
    @XmlElement(nillable = true)
    protected List<String> priorityFilter;
    @XmlElement(nillable = true)
    protected List<String> solutionFilter;
    protected String sortField;
    protected boolean sortIsAscending;
    protected String timeFormat;

    /**
     * Ruft den Wert der createTimestampFilter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateTimestampFilter() {
        return createTimestampFilter;
    }

    /**
     * Legt den Wert der createTimestampFilter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateTimestampFilter(String value) {
        this.createTimestampFilter = value;
    }

    /**
     * Ruft den Wert der dateFormat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFormat() {
        return dateFormat;
    }

    /**
     * Legt den Wert der dateFormat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFormat(String value) {
        this.dateFormat = value;
    }

    /**
     * Gets the value of the eventFilter property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the eventFilter property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEventFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the eventFilter property.
     */
    public List<String> getEventFilter() {
        if (eventFilter == null) {
            eventFilter = new ArrayList<>();
        }
        return this.eventFilter;
    }

    /**
     * Ruft den Wert der firstEntry-Eigenschaft ab.
     * 
     */
    public int getFirstEntry() {
        return firstEntry;
    }

    /**
     * Legt den Wert der firstEntry-Eigenschaft fest.
     * 
     */
    public void setFirstEntry(int value) {
        this.firstEntry = value;
    }

    /**
     * Ruft den Wert der globalFieldFilter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalFieldFilter() {
        return globalFieldFilter;
    }

    /**
     * Legt den Wert der globalFieldFilter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalFieldFilter(String value) {
        this.globalFieldFilter = value;
    }

    /**
     * Ruft den Wert der globalFieldFilterCaseSensitive-Eigenschaft ab.
     * 
     */
    public boolean isGlobalFieldFilterCaseSensitive() {
        return globalFieldFilterCaseSensitive;
    }

    /**
     * Legt den Wert der globalFieldFilterCaseSensitive-Eigenschaft fest.
     * 
     */
    public void setGlobalFieldFilterCaseSensitive(boolean value) {
        this.globalFieldFilterCaseSensitive = value;
    }

    /**
     * Ruft den Wert der identityAndPersonFilterCombinedAsConjunction-Eigenschaft ab.
     * 
     */
    public boolean isIdentityAndPersonFilterCombinedAsConjunction() {
        return identityAndPersonFilterCombinedAsConjunction;
    }

    /**
     * Legt den Wert der identityAndPersonFilterCombinedAsConjunction-Eigenschaft fest.
     * 
     */
    public void setIdentityAndPersonFilterCombinedAsConjunction(boolean value) {
        this.identityAndPersonFilterCombinedAsConjunction = value;
    }

    /**
     * Ruft den Wert der identityFilter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IdentityFilter }
     *     
     */
    public IdentityFilter getIdentityFilter() {
        return identityFilter;
    }

    /**
     * Legt den Wert der identityFilter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityFilter }
     *     
     */
    public void setIdentityFilter(IdentityFilter value) {
        this.identityFilter = value;
    }

    /**
     * Ruft den Wert der identityFilterAsConjunction-Eigenschaft ab.
     * 
     */
    public boolean isIdentityFilterAsConjunction() {
        return identityFilterAsConjunction;
    }

    /**
     * Legt den Wert der identityFilterAsConjunction-Eigenschaft fest.
     * 
     */
    public void setIdentityFilterAsConjunction(boolean value) {
        this.identityFilterAsConjunction = value;
    }

    /**
     * Ruft den Wert der identityFilterCaseSensitive-Eigenschaft ab.
     * 
     */
    public boolean isIdentityFilterCaseSensitive() {
        return identityFilterCaseSensitive;
    }

    /**
     * Legt den Wert der identityFilterCaseSensitive-Eigenschaft fest.
     * 
     */
    public void setIdentityFilterCaseSensitive(boolean value) {
        this.identityFilterCaseSensitive = value;
    }

    /**
     * Ruft den Wert der identityGenderStrings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IdentityGenderStrings }
     *     
     */
    public IdentityGenderStrings getIdentityGenderStrings() {
        return identityGenderStrings;
    }

    /**
     * Legt den Wert der identityGenderStrings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityGenderStrings }
     *     
     */
    public void setIdentityGenderStrings(IdentityGenderStrings value) {
        this.identityGenderStrings = value;
    }

    /**
     * Ruft den Wert der identityVitalStatusStrings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IdentityVitalStatusStrings }
     *     
     */
    public IdentityVitalStatusStrings getIdentityVitalStatusStrings() {
        return identityVitalStatusStrings;
    }

    /**
     * Legt den Wert der identityVitalStatusStrings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityVitalStatusStrings }
     *     
     */
    public void setIdentityVitalStatusStrings(IdentityVitalStatusStrings value) {
        this.identityVitalStatusStrings = value;
    }

    /**
     * Ruft den Wert der pageSize-Eigenschaft ab.
     * 
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Legt den Wert der pageSize-Eigenschaft fest.
     * 
     */
    public void setPageSize(int value) {
        this.pageSize = value;
    }

    /**
     * Ruft den Wert der personFilter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PersonFilter }
     *     
     */
    public PersonFilter getPersonFilter() {
        return personFilter;
    }

    /**
     * Legt den Wert der personFilter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonFilter }
     *     
     */
    public void setPersonFilter(PersonFilter value) {
        this.personFilter = value;
    }

    /**
     * Ruft den Wert der personFilterAsConjunction-Eigenschaft ab.
     * 
     */
    public boolean isPersonFilterAsConjunction() {
        return personFilterAsConjunction;
    }

    /**
     * Legt den Wert der personFilterAsConjunction-Eigenschaft fest.
     * 
     */
    public void setPersonFilterAsConjunction(boolean value) {
        this.personFilterAsConjunction = value;
    }

    /**
     * Ruft den Wert der personFilterCaseSensitive-Eigenschaft ab.
     * 
     */
    public boolean isPersonFilterCaseSensitive() {
        return personFilterCaseSensitive;
    }

    /**
     * Legt den Wert der personFilterCaseSensitive-Eigenschaft fest.
     * 
     */
    public void setPersonFilterCaseSensitive(boolean value) {
        this.personFilterCaseSensitive = value;
    }

    /**
     * Gets the value of the priorityFilter property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the priorityFilter property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPriorityFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the priorityFilter property.
     */
    public List<String> getPriorityFilter() {
        if (priorityFilter == null) {
            priorityFilter = new ArrayList<>();
        }
        return this.priorityFilter;
    }

    /**
     * Gets the value of the solutionFilter property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the solutionFilter property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSolutionFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the solutionFilter property.
     */
    public List<String> getSolutionFilter() {
        if (solutionFilter == null) {
            solutionFilter = new ArrayList<>();
        }
        return this.solutionFilter;
    }

    /**
     * Ruft den Wert der sortField-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortField() {
        return sortField;
    }

    /**
     * Legt den Wert der sortField-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortField(String value) {
        this.sortField = value;
    }

    /**
     * Ruft den Wert der sortIsAscending-Eigenschaft ab.
     * 
     */
    public boolean isSortIsAscending() {
        return sortIsAscending;
    }

    /**
     * Legt den Wert der sortIsAscending-Eigenschaft fest.
     * 
     */
    public void setSortIsAscending(boolean value) {
        this.sortIsAscending = value;
    }

    /**
     * Ruft den Wert der timeFormat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeFormat() {
        return timeFormat;
    }

    /**
     * Legt den Wert der timeFormat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeFormat(String value) {
        this.timeFormat = value;
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
     *                   <element name="key" type="{http://service.epix.ttp.icmvc.emau.org/}identityField" minOccurs="0"/>
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
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "entry"
    })
    public static class IdentityFilter {

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
         *         <element name="key" type="{http://service.epix.ttp.icmvc.emau.org/}identityField" minOccurs="0"/>
         *         <element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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

            @XmlSchemaType(name = "string")
            protected IdentityField key;
            protected String value;

            /**
             * Ruft den Wert der key-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link IdentityField }
             *     
             */
            public IdentityField getKey() {
                return key;
            }

            /**
             * Legt den Wert der key-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link IdentityField }
             *     
             */
            public void setKey(IdentityField value) {
                this.key = value;
            }

            /**
             * Ruft den Wert der value-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Legt den Wert der value-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

        }

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
     *                   <element name="key" type="{http://service.epix.ttp.icmvc.emau.org/}gender" minOccurs="0"/>
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
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "entry"
    })
    public static class IdentityGenderStrings {

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
         *         <element name="key" type="{http://service.epix.ttp.icmvc.emau.org/}gender" minOccurs="0"/>
         *         <element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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

            @XmlSchemaType(name = "string")
            protected Gender key;
            protected String value;

            /**
             * Ruft den Wert der key-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Gender }
             *     
             */
            public Gender getKey() {
                return key;
            }

            /**
             * Legt den Wert der key-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Gender }
             *     
             */
            public void setKey(Gender value) {
                this.key = value;
            }

            /**
             * Ruft den Wert der value-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Legt den Wert der value-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

        }

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
     *                   <element name="key" type="{http://service.epix.ttp.icmvc.emau.org/}vitalStatus" minOccurs="0"/>
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
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "entry"
    })
    public static class IdentityVitalStatusStrings {

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
         *         <element name="key" type="{http://service.epix.ttp.icmvc.emau.org/}vitalStatus" minOccurs="0"/>
         *         <element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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

            @XmlSchemaType(name = "string")
            protected VitalStatus key;
            protected String value;

            /**
             * Ruft den Wert der key-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link VitalStatus }
             *     
             */
            public VitalStatus getKey() {
                return key;
            }

            /**
             * Legt den Wert der key-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link VitalStatus }
             *     
             */
            public void setKey(VitalStatus value) {
                this.key = value;
            }

            /**
             * Ruft den Wert der value-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Legt den Wert der value-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

        }

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
     *                   <element name="key" type="{http://service.epix.ttp.icmvc.emau.org/}personField" minOccurs="0"/>
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
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "entry"
    })
    public static class PersonFilter {

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
         *         <element name="key" type="{http://service.epix.ttp.icmvc.emau.org/}personField" minOccurs="0"/>
         *         <element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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

            @XmlSchemaType(name = "string")
            protected PersonField key;
            protected String value;

            /**
             * Ruft den Wert der key-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link PersonField }
             *     
             */
            public PersonField getKey() {
                return key;
            }

            /**
             * Legt den Wert der key-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link PersonField }
             *     
             */
            public void setKey(PersonField value) {
                this.key = value;
            }

            /**
             * Ruft den Wert der value-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Legt den Wert der value-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

        }

    }

}
