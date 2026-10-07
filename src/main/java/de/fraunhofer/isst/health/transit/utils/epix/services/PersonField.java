package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java-Klasse für personField.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * <pre>{@code
 * <simpleType name="personField">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NONE"/>
 *     <enumeration value="PERSON_ID"/>
 *     <enumeration value="MPI"/>
 *     <enumeration value="PERSON_CREATED"/>
 *     <enumeration value="PERSON_LAST_EDITED"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "personField")
@XmlEnum
public enum PersonField {

    NONE,
    PERSON_ID,
    MPI,
    PERSON_CREATED,
    PERSON_LAST_EDITED;

    public String value() {
        return name();
    }

    public static PersonField fromValue(String v) {
        return valueOf(v);
    }

}
