
package de.fraunhofer.isst.health.transit.utils.gpas.domain;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for validateViaParents</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="validateViaParents">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OFF"/>
 *     <enumeration value="VALIDATE"/>
 *     <enumeration value="ENSURE_EXISTS"/>
 *     <enumeration value="CASCADE_DELETE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "validateViaParents")
@XmlEnum
public enum ValidateViaParents {

    OFF,
    VALIDATE,
    ENSURE_EXISTS,
    CASCADE_DELETE;

    public String value() {
        return name();
    }

    public static ValidateViaParents fromValue(String v) {
        return valueOf(v);
    }

}
