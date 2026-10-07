package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java-Klasse für possibleMatchSolution.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * <pre>{@code
 * <simpleType name="possibleMatchSolution">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SPLIT"/>
 *     <enumeration value="MERGE"/>
 *     <enumeration value="INDIRECT_MERGE"/>
 *     <enumeration value="MERGE_BY_MOVE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "possibleMatchSolution")
@XmlEnum
public enum PossibleMatchSolution {

    SPLIT,
    MERGE,
    INDIRECT_MERGE,
    MERGE_BY_MOVE;

    public String value() {
        return name();
    }

    public static PossibleMatchSolution fromValue(String v) {
        return valueOf(v);
    }

}
