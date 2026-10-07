package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java-Klasse für fieldName.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * <pre>{@code
 * <simpleType name="fieldName">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="firstName"/>
 *     <enumeration value="middleName"/>
 *     <enumeration value="lastName"/>
 *     <enumeration value="prefix"/>
 *     <enumeration value="suffix"/>
 *     <enumeration value="birthDate"/>
 *     <enumeration value="gender"/>
 *     <enumeration value="birthPlace"/>
 *     <enumeration value="race"/>
 *     <enumeration value="religion"/>
 *     <enumeration value="mothersMaidenName"/>
 *     <enumeration value="degree"/>
 *     <enumeration value="motherTongue"/>
 *     <enumeration value="nationality"/>
 *     <enumeration value="civilStatus"/>
 *     <enumeration value="externalDate"/>
 *     <enumeration value="value1"/>
 *     <enumeration value="value2"/>
 *     <enumeration value="value3"/>
 *     <enumeration value="value4"/>
 *     <enumeration value="value5"/>
 *     <enumeration value="value6"/>
 *     <enumeration value="value7"/>
 *     <enumeration value="value8"/>
 *     <enumeration value="value9"/>
 *     <enumeration value="value10"/>
 *     <enumeration value="vitalStatus"/>
 *     <enumeration value="dateOfDeath"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "fieldName")
@XmlEnum
public enum FieldName {

    @XmlEnumValue("firstName")
    FIRST_NAME("firstName"),
    @XmlEnumValue("middleName")
    MIDDLE_NAME("middleName"),
    @XmlEnumValue("lastName")
    LAST_NAME("lastName"),
    @XmlEnumValue("prefix")
    PREFIX("prefix"),
    @XmlEnumValue("suffix")
    SUFFIX("suffix"),
    @XmlEnumValue("birthDate")
    BIRTH_DATE("birthDate"),
    @XmlEnumValue("gender")
    GENDER("gender"),
    @XmlEnumValue("birthPlace")
    BIRTH_PLACE("birthPlace"),
    @XmlEnumValue("race")
    RACE("race"),
    @XmlEnumValue("religion")
    RELIGION("religion"),
    @XmlEnumValue("mothersMaidenName")
    MOTHERS_MAIDEN_NAME("mothersMaidenName"),
    @XmlEnumValue("degree")
    DEGREE("degree"),
    @XmlEnumValue("motherTongue")
    MOTHER_TONGUE("motherTongue"),
    @XmlEnumValue("nationality")
    NATIONALITY("nationality"),
    @XmlEnumValue("civilStatus")
    CIVIL_STATUS("civilStatus"),
    @XmlEnumValue("externalDate")
    EXTERNAL_DATE("externalDate"),
    @XmlEnumValue("value1")
    VALUE_1("value1"),
    @XmlEnumValue("value2")
    VALUE_2("value2"),
    @XmlEnumValue("value3")
    VALUE_3("value3"),
    @XmlEnumValue("value4")
    VALUE_4("value4"),
    @XmlEnumValue("value5")
    VALUE_5("value5"),
    @XmlEnumValue("value6")
    VALUE_6("value6"),
    @XmlEnumValue("value7")
    VALUE_7("value7"),
    @XmlEnumValue("value8")
    VALUE_8("value8"),
    @XmlEnumValue("value9")
    VALUE_9("value9"),
    @XmlEnumValue("value10")
    VALUE_10("value10"),
    @XmlEnumValue("vitalStatus")
    VITAL_STATUS("vitalStatus"),
    @XmlEnumValue("dateOfDeath")
    DATE_OF_DEATH("dateOfDeath");
    private final String value;

    FieldName(String v) {
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
    public static FieldName fromValue(String v) {
        for (FieldName c: FieldName.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
