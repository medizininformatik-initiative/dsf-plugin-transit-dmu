
package de.fraunhofer.isst.health.transit.utils.gpas.domain;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for domainConfig complex type</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 *
 * <pre>{@code
 * <complexType name="domainConfig">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="forceCache" type="{http://psn.ttp.ganimed.icmvc.emau.org/}forceCache" minOccurs="0"/>
 *         <element name="includePrefixInCheckDigitCalculation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="includeSuffixInCheckDigitCalculation" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="maxDetectedErrors" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="multiPsnDomain" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="psnLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="psnPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="psnSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="psnsDeletable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="sendNotificationsWeb" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="useLastCharAsDelimiterAfterXChars" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="validateValuesViaParents" type="{http://psn.ttp.ganimed.icmvc.emau.org/}validateViaParents"
 *         minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "domainConfig", propOrder = {
        "forceCache",
        "includePrefixInCheckDigitCalculation",
        "includeSuffixInCheckDigitCalculation",
        "maxDetectedErrors",
        "multiPsnDomain",
        "psnLength",
        "psnPrefix",
        "psnSuffix",
        "psnsDeletable",
        "sendNotificationsWeb",
        "useLastCharAsDelimiterAfterXChars",
        "validateValuesViaParents"
})
public class DomainConfig {

    @XmlSchemaType(name = "string")
    private ForceCache forceCache;
    private boolean includePrefixInCheckDigitCalculation;
    private boolean includeSuffixInCheckDigitCalculation;
    private int maxDetectedErrors;
    private boolean multiPsnDomain;
    private int psnLength;
    private String psnPrefix;
    private String psnSuffix;
    private boolean psnsDeletable;
    private boolean sendNotificationsWeb;
    private int useLastCharAsDelimiterAfterXChars;
    @XmlSchemaType(name = "string")
    private ValidateViaParents validateValuesViaParents;

    /**
     * Gets the value of the forceCache property.
     *
     * @return possible object is
     * {@link ForceCache }
     */
    public ForceCache getForceCache() {
        return forceCache;
    }

    /**
     * Sets the value of the forceCache property.
     *
     * @param value allowed object is
     *              {@link ForceCache }
     */
    public void setForceCache(ForceCache value) {
        this.forceCache = value;
    }

    /**
     * Gets the value of the includePrefixInCheckDigitCalculation property.
     */
    public boolean isIncludePrefixInCheckDigitCalculation() {
        return includePrefixInCheckDigitCalculation;
    }

    /**
     * Sets the value of the includePrefixInCheckDigitCalculation property.
     */
    public void setIncludePrefixInCheckDigitCalculation(boolean value) {
        this.includePrefixInCheckDigitCalculation = value;
    }

    /**
     * Gets the value of the includeSuffixInCheckDigitCalculation property.
     */
    public boolean isIncludeSuffixInCheckDigitCalculation() {
        return includeSuffixInCheckDigitCalculation;
    }

    /**
     * Sets the value of the includeSuffixInCheckDigitCalculation property.
     */
    public void setIncludeSuffixInCheckDigitCalculation(boolean value) {
        this.includeSuffixInCheckDigitCalculation = value;
    }

    /**
     * Gets the value of the maxDetectedErrors property.
     */
    public int getMaxDetectedErrors() {
        return maxDetectedErrors;
    }

    /**
     * Sets the value of the maxDetectedErrors property.
     */
    public void setMaxDetectedErrors(int value) {
        this.maxDetectedErrors = value;
    }

    /**
     * Gets the value of the multiPsnDomain property.
     */
    public boolean isMultiPsnDomain() {
        return multiPsnDomain;
    }

    /**
     * Sets the value of the multiPsnDomain property.
     */
    public void setMultiPsnDomain(boolean value) {
        this.multiPsnDomain = value;
    }

    /**
     * Gets the value of the psnLength property.
     */
    public int getPsnLength() {
        return psnLength;
    }

    /**
     * Sets the value of the psnLength property.
     */
    public void setPsnLength(int value) {
        this.psnLength = value;
    }

    /**
     * Gets the value of the psnPrefix property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPsnPrefix() {
        return psnPrefix;
    }

    /**
     * Sets the value of the psnPrefix property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPsnPrefix(String value) {
        this.psnPrefix = value;
    }

    /**
     * Gets the value of the psnSuffix property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPsnSuffix() {
        return psnSuffix;
    }

    /**
     * Sets the value of the psnSuffix property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPsnSuffix(String value) {
        this.psnSuffix = value;
    }

    /**
     * Gets the value of the psnsDeletable property.
     */
    public boolean isPsnsDeletable() {
        return psnsDeletable;
    }

    /**
     * Sets the value of the psnsDeletable property.
     */
    public void setPsnsDeletable(boolean value) {
        this.psnsDeletable = value;
    }

    /**
     * Gets the value of the sendNotificationsWeb property.
     */
    public boolean isSendNotificationsWeb() {
        return sendNotificationsWeb;
    }

    /**
     * Sets the value of the sendNotificationsWeb property.
     */
    public void setSendNotificationsWeb(boolean value) {
        this.sendNotificationsWeb = value;
    }

    /**
     * Gets the value of the useLastCharAsDelimiterAfterXChars property.
     */
    public int getUseLastCharAsDelimiterAfterXChars() {
        return useLastCharAsDelimiterAfterXChars;
    }

    /**
     * Sets the value of the useLastCharAsDelimiterAfterXChars property.
     */
    public void setUseLastCharAsDelimiterAfterXChars(int value) {
        this.useLastCharAsDelimiterAfterXChars = value;
    }

    /**
     * Gets the value of the validateValuesViaParents property.
     *
     * @return possible object is
     * {@link ValidateViaParents }
     */
    public ValidateViaParents getValidateValuesViaParents() {
        return validateValuesViaParents;
    }

    /**
     * Sets the value of the validateValuesViaParents property.
     *
     * @param value allowed object is
     *              {@link ValidateViaParents }
     */
    public void setValidateValuesViaParents(ValidateViaParents value) {
        this.validateValuesViaParents = value;
    }

}
