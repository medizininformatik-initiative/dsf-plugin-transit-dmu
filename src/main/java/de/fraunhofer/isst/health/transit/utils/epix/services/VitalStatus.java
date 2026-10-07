package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java-Klasse für vitalStatus.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * <pre>{@code
 * <simpleType name="vitalStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="UNKNOWN"/>
 *     <enumeration value="ALIVE"/>
 *     <enumeration value="DECEASED"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "vitalStatus")
@XmlEnum
public enum VitalStatus {

    UNKNOWN,
    ALIVE,
    DECEASED;

    public String value() {
        return name();
    }

    public static VitalStatus fromValue(String v) {
        return valueOf(v);
    }

}
