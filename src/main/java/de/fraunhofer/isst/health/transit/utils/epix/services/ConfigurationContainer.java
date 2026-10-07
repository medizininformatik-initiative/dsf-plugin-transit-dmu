package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java-Klasse für configurationContainer complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="configurationContainer">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="deduplication" type="{http://service.epix.ttp.icmvc.emau.org/}deduplicationDTO" minOccurs="0"/>
 *         <element name="limitSearchForLowMemory" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="matchingConfig" type="{http://service.epix.ttp.icmvc.emau.org/}matchingDTO" minOccurs="0"/>
 *         <element name="matchingMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="mpiGenerator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="mpiPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="persistMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="preprocessingFields" type="{http://service.epix.ttp.icmvc.emau.org/}preprocessingFieldDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="privacy" type="{http://service.epix.ttp.icmvc.emau.org/}privacyDTO" minOccurs="0"/>
 *         <element name="requiredFields" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="updateBehaviour" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="useNotifications" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="validation" type="{http://service.epix.ttp.icmvc.emau.org/}validationDTO" minOccurs="0"/>
 *         <element name="valueFieldMapping">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="entry" maxOccurs="unbounded" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <sequence>
 *                             <element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "configurationContainer", propOrder = {
    "deduplication",
    "limitSearchForLowMemory",
    "matchingConfig",
    "matchingMode",
    "mpiGenerator",
    "mpiPrefix",
    "persistMode",
    "preprocessingFields",
    "privacy",
    "requiredFields",
    "updateBehaviour",
    "useNotifications",
    "validation",
    "valueFieldMapping"
})
public class ConfigurationContainer {

    protected DeduplicationDTO deduplication;
    protected boolean limitSearchForLowMemory;
    protected MatchingDTO matchingConfig;
    protected String matchingMode;
    protected String mpiGenerator;
    protected String mpiPrefix;
    protected String persistMode;
    @XmlElement(nillable = true)
    protected List<PreprocessingFieldDTO> preprocessingFields;
    protected PrivacyDTO privacy;
    @XmlElement(nillable = true)
    protected List<String> requiredFields;
    protected String updateBehaviour;
    protected boolean useNotifications;
    protected ValidationDTO validation;
    @XmlElement(required = true)
    protected ValueFieldMapping valueFieldMapping;

    /**
     * Ruft den Wert der deduplication-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DeduplicationDTO }
     *     
     */
    public DeduplicationDTO getDeduplication() {
        return deduplication;
    }

    /**
     * Legt den Wert der deduplication-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DeduplicationDTO }
     *     
     */
    public void setDeduplication(DeduplicationDTO value) {
        this.deduplication = value;
    }

    /**
     * Ruft den Wert der limitSearchForLowMemory-Eigenschaft ab.
     * 
     */
    public boolean isLimitSearchForLowMemory() {
        return limitSearchForLowMemory;
    }

    /**
     * Legt den Wert der limitSearchForLowMemory-Eigenschaft fest.
     * 
     */
    public void setLimitSearchForLowMemory(boolean value) {
        this.limitSearchForLowMemory = value;
    }

    /**
     * Ruft den Wert der matchingConfig-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MatchingDTO }
     *     
     */
    public MatchingDTO getMatchingConfig() {
        return matchingConfig;
    }

    /**
     * Legt den Wert der matchingConfig-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingDTO }
     *     
     */
    public void setMatchingConfig(MatchingDTO value) {
        this.matchingConfig = value;
    }

    /**
     * Ruft den Wert der matchingMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchingMode() {
        return matchingMode;
    }

    /**
     * Legt den Wert der matchingMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchingMode(String value) {
        this.matchingMode = value;
    }

    /**
     * Ruft den Wert der mpiGenerator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMpiGenerator() {
        return mpiGenerator;
    }

    /**
     * Legt den Wert der mpiGenerator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMpiGenerator(String value) {
        this.mpiGenerator = value;
    }

    /**
     * Ruft den Wert der mpiPrefix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMpiPrefix() {
        return mpiPrefix;
    }

    /**
     * Legt den Wert der mpiPrefix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMpiPrefix(String value) {
        this.mpiPrefix = value;
    }

    /**
     * Ruft den Wert der persistMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersistMode() {
        return persistMode;
    }

    /**
     * Legt den Wert der persistMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersistMode(String value) {
        this.persistMode = value;
    }

    /**
     * Gets the value of the preprocessingFields property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the preprocessingFields property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getPreprocessingFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreprocessingFieldDTO }
     * </p>
     * 
     * 
     * @return
     *     The value of the preprocessingFields property.
     */
    public List<PreprocessingFieldDTO> getPreprocessingFields() {
        if (preprocessingFields == null) {
            preprocessingFields = new ArrayList<>();
        }
        return this.preprocessingFields;
    }

    /**
     * Ruft den Wert der privacy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PrivacyDTO }
     *     
     */
    public PrivacyDTO getPrivacy() {
        return privacy;
    }

    /**
     * Legt den Wert der privacy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivacyDTO }
     *     
     */
    public void setPrivacy(PrivacyDTO value) {
        this.privacy = value;
    }

    /**
     * Gets the value of the requiredFields property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the requiredFields property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getRequiredFields().add(newItem);
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
     *     The value of the requiredFields property.
     */
    public List<String> getRequiredFields() {
        if (requiredFields == null) {
            requiredFields = new ArrayList<>();
        }
        return this.requiredFields;
    }

    /**
     * Ruft den Wert der updateBehaviour-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateBehaviour() {
        return updateBehaviour;
    }

    /**
     * Legt den Wert der updateBehaviour-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateBehaviour(String value) {
        this.updateBehaviour = value;
    }

    /**
     * Ruft den Wert der useNotifications-Eigenschaft ab.
     * 
     */
    public boolean isUseNotifications() {
        return useNotifications;
    }

    /**
     * Legt den Wert der useNotifications-Eigenschaft fest.
     * 
     */
    public void setUseNotifications(boolean value) {
        this.useNotifications = value;
    }

    /**
     * Ruft den Wert der validation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ValidationDTO }
     *     
     */
    public ValidationDTO getValidation() {
        return validation;
    }

    /**
     * Legt den Wert der validation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationDTO }
     *     
     */
    public void setValidation(ValidationDTO value) {
        this.validation = value;
    }

    /**
     * Ruft den Wert der valueFieldMapping-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ValueFieldMapping }
     *     
     */
    public ValueFieldMapping getValueFieldMapping() {
        return valueFieldMapping;
    }

    /**
     * Legt den Wert der valueFieldMapping-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueFieldMapping }
     *     
     */
    public void setValueFieldMapping(ValueFieldMapping value) {
        this.valueFieldMapping = value;
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
     *                   <element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    public static class ValueFieldMapping {

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
         *         <element name="key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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

            protected String key;
            protected String value;

            /**
             * Ruft den Wert der key-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKey() {
                return key;
            }

            /**
             * Legt den Wert der key-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKey(String value) {
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
