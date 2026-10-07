package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java-Klasse für unknownObjectType.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * <pre>{@code
 * <simpleType name="unknownObjectType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DOMAIN"/>
 *     <enumeration value="IDENTITFIER_DOMAIN"/>
 *     <enumeration value="SOURCE"/>
 *     <enumeration value="PERSON"/>
 *     <enumeration value="IDENTIFIER"/>
 *     <enumeration value="IDENTITY"/>
 *     <enumeration value="CONTACT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "unknownObjectType")
@XmlEnum
public enum UnknownObjectType {

    DOMAIN,
    IDENTITFIER_DOMAIN,
    SOURCE,
    PERSON,
    IDENTIFIER,
    IDENTITY,
    CONTACT;

    public String value() {
        return name();
    }

    public static UnknownObjectType fromValue(String v) {
        return valueOf(v);
    }

}
