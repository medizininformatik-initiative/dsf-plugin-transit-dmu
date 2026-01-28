
package de.fraunhofer.isst.health.transit.utils.gpas.domain;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for generatorAlphabetRestriction</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="generatorAlphabetRestriction">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NONE"/>
 *     <enumeration value="CONST_10"/>
 *     <enumeration value="CONST_32"/>
 *     <enumeration value="PRIME"/>
 *     <enumeration value="PRIME_POWER"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "generatorAlphabetRestriction")
@XmlEnum
public enum GeneratorAlphabetRestriction {

    NONE,
    CONST_10,
    CONST_32,
    PRIME,
    PRIME_POWER;

    public String value() {
        return name();
    }

    public static GeneratorAlphabetRestriction fromValue(String v) {
        return valueOf(v);
    }

}
