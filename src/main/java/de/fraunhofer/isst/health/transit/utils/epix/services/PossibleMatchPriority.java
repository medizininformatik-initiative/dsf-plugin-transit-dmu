package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java-Klasse für possibleMatchPriority.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * <pre>{@code
 * <simpleType name="possibleMatchPriority">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="OPEN"/>
 *     <enumeration value="POSTPONED"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "possibleMatchPriority")
@XmlEnum
public enum PossibleMatchPriority {

    OPEN,
    POSTPONED;

    public String value() {
        return name();
    }

    public static PossibleMatchPriority fromValue(String v) {
        return valueOf(v);
    }

}
