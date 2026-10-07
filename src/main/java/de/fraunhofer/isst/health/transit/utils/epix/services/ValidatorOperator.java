package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java-Klasse für validatorOperator.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * <pre>{@code
 * <simpleType name="validatorOperator">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ALL"/>
 *     <enumeration value="AT_LEAST_ONE"/>
 *     <enumeration value="EXACT_ONE"/>
 *     <enumeration value="ALL_OR_NONE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "validatorOperator")
@XmlEnum
public enum ValidatorOperator {

    ALL,
    AT_LEAST_ONE,
    EXACT_ONE,
    ALL_OR_NONE;

    public String value() {
        return name();
    }

    public static ValidatorOperator fromValue(String v) {
        return valueOf(v);
    }

}
