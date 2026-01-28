package de.fraunhofer.isst.health.transit.utils.gpas.psn;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insertPairError</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="insertPairError">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="VALUE_INVALID"/>
 *     <enumeration value="PSEUDONYM_INVALID"/>
 *     <enumeration value="DIFFERENT_PSEUDONYM_FOR_VALUE_EXISTS"/>
 *     <enumeration value="DIFFERENT_VALUE_FOR_PSEUDONYM_EXISTS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "insertPairError")
@XmlEnum
public enum InsertPairError {

    VALUE_INVALID,
    PSEUDONYM_INVALID,
    DIFFERENT_PSEUDONYM_FOR_VALUE_EXISTS,
    DIFFERENT_VALUE_FOR_PSEUDONYM_EXISTS;

    public String value() {
        return name();
    }

    public static InsertPairError fromValue(String v) {
        return valueOf(v);
    }

}
