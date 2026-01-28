
package de.fraunhofer.isst.health.transit.utils.gpas.domain;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for matchMode</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="matchMode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CONTAINS"/>
 *     <enumeration value="EQUALS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "matchMode")
@XmlEnum
public enum MatchMode {

    CONTAINS,
    EQUALS;

    public String value() {
        return name();
    }

    public static MatchMode fromValue(String v) {
        return valueOf(v);
    }

}
