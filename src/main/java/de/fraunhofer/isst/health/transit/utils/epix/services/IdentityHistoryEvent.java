package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java-Klasse für identityHistoryEvent.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * <pre>{@code
 * <simpleType name="identityHistoryEvent">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NEW"/>
 *     <enumeration value="UPDATE"/>
 *     <enumeration value="MERGE"/>
 *     <enumeration value="MATCH"/>
 *     <enumeration value="PERFECT_MATCH"/>
 *     <enumeration value="MOVE"/>
 *     <enumeration value="FORCED_MATCH"/>
 *     <enumeration value="SET_REFERENCE"/>
 *     <enumeration value="FORCED_UPDATE"/>
 *     <enumeration value="DEACTIVATED"/>
 *     <enumeration value="ADD_CONTACT"/>
 *     <enumeration value="DEL_CONTACT"/>
 *     <enumeration value="ADD_IDENTIF"/>
 *     <enumeration value="DEL_IDENTIF"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "identityHistoryEvent")
@XmlEnum
public enum IdentityHistoryEvent {

    NEW,
    UPDATE,
    MERGE,
    MATCH,
    PERFECT_MATCH,
    MOVE,
    FORCED_MATCH,
    SET_REFERENCE,
    FORCED_UPDATE,
    DEACTIVATED,
    ADD_CONTACT,
    DEL_CONTACT,
    ADD_IDENTIF,
    DEL_IDENTIF;

    public String value() {
        return name();
    }

    public static IdentityHistoryEvent fromValue(String v) {
        return valueOf(v);
    }

}
