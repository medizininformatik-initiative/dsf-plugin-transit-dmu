
package de.fraunhofer.isst.health.transit.utils.gpas.domain;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for forceCache</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="forceCache">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DEFAULT"/>
 *     <enumeration value="ON"/>
 *     <enumeration value="OFF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "forceCache")
@XmlEnum
public enum ForceCache {

    DEFAULT,
    ON,
    OFF;

    public String value() {
        return name();
    }

    public static ForceCache fromValue(String v) {
        return valueOf(v);
    }

}
