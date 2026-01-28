
package de.fraunhofer.isst.health.transit.utils.gpas.domain;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for psnField</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="psnField">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NONE"/>
 *     <enumeration value="VALUE"/>
 *     <enumeration value="PSEUDONYM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "psnField")
@XmlEnum
public enum PsnField {

    NONE,
    VALUE,
    PSEUDONYM;

    public String value() {
        return name();
    }

    public static PsnField fromValue(String v) {
        return valueOf(v);
    }

}
