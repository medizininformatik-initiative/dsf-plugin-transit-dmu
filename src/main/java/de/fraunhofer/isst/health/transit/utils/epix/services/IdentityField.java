package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java-Klasse für identityField.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * <pre>{@code
 * <simpleType name="identityField">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NONE"/>
 *     <enumeration value="IDENTITY_ID"/>
 *     <enumeration value="PERSON_ID"/>
 *     <enumeration value="FIRST_NAME"/>
 *     <enumeration value="LAST_NAME"/>
 *     <enumeration value="MIDDLE_NAME"/>
 *     <enumeration value="PREFIX"/>
 *     <enumeration value="SUFFIX"/>
 *     <enumeration value="GENDER"/>
 *     <enumeration value="BIRTH_DATE"/>
 *     <enumeration value="BIRTHPLACE"/>
 *     <enumeration value="RACE"/>
 *     <enumeration value="RELIGION"/>
 *     <enumeration value="MOTHERS_MAIDEN_NAME"/>
 *     <enumeration value="DEGREE"/>
 *     <enumeration value="MOTHER_TONGUE"/>
 *     <enumeration value="NATIONALITY"/>
 *     <enumeration value="CIVIL_STATUS"/>
 *     <enumeration value="EXTERNAL_DATE"/>
 *     <enumeration value="VALUE1"/>
 *     <enumeration value="VALUE2"/>
 *     <enumeration value="VALUE3"/>
 *     <enumeration value="VALUE4"/>
 *     <enumeration value="VALUE5"/>
 *     <enumeration value="VALUE6"/>
 *     <enumeration value="VALUE7"/>
 *     <enumeration value="VALUE8"/>
 *     <enumeration value="VALUE9"/>
 *     <enumeration value="VALUE10"/>
 *     <enumeration value="IDENTITY_CREATED"/>
 *     <enumeration value="IDENTITY_LAST_EDITED"/>
 *     <enumeration value="SOURCE"/>
 *     <enumeration value="VITAL_STATUS"/>
 *     <enumeration value="DATE_OF_DEATH"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "identityField")
@XmlEnum
public enum IdentityField {

    NONE("NONE"),
    IDENTITY_ID("IDENTITY_ID"),
    PERSON_ID("PERSON_ID"),
    FIRST_NAME("FIRST_NAME"),
    LAST_NAME("LAST_NAME"),
    MIDDLE_NAME("MIDDLE_NAME"),
    PREFIX("PREFIX"),
    SUFFIX("SUFFIX"),
    GENDER("GENDER"),
    BIRTH_DATE("BIRTH_DATE"),
    BIRTHPLACE("BIRTHPLACE"),
    RACE("RACE"),
    RELIGION("RELIGION"),
    MOTHERS_MAIDEN_NAME("MOTHERS_MAIDEN_NAME"),
    DEGREE("DEGREE"),
    MOTHER_TONGUE("MOTHER_TONGUE"),
    NATIONALITY("NATIONALITY"),
    CIVIL_STATUS("CIVIL_STATUS"),
    EXTERNAL_DATE("EXTERNAL_DATE"),
    @XmlEnumValue("VALUE1")
    VALUE_1("VALUE1"),
    @XmlEnumValue("VALUE2")
    VALUE_2("VALUE2"),
    @XmlEnumValue("VALUE3")
    VALUE_3("VALUE3"),
    @XmlEnumValue("VALUE4")
    VALUE_4("VALUE4"),
    @XmlEnumValue("VALUE5")
    VALUE_5("VALUE5"),
    @XmlEnumValue("VALUE6")
    VALUE_6("VALUE6"),
    @XmlEnumValue("VALUE7")
    VALUE_7("VALUE7"),
    @XmlEnumValue("VALUE8")
    VALUE_8("VALUE8"),
    @XmlEnumValue("VALUE9")
    VALUE_9("VALUE9"),
    @XmlEnumValue("VALUE10")
    VALUE_10("VALUE10"),
    IDENTITY_CREATED("IDENTITY_CREATED"),
    IDENTITY_LAST_EDITED("IDENTITY_LAST_EDITED"),
    SOURCE("SOURCE"),
    VITAL_STATUS("VITAL_STATUS"),
    DATE_OF_DEATH("DATE_OF_DEATH");
    private final String value;

    IdentityField(String v) {
        value = v;
    }

    /**
     * Gets the value associated to the enum constant.
     * 
     * @return
     *     The value linked to the enum.
     */
    public String value() {
        return value;
    }

    /**
     * Gets the enum associated to the value passed as parameter.
     * 
     * @param v
     *     The value to get the enum from.
     * @return
     *     The enum which corresponds to the value, if it exists.
     * @throws IllegalArgumentException
     *     If no value matches in the enum declaration.
     */
    public static IdentityField fromValue(String v) {
        for (IdentityField c: IdentityField.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
