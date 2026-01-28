package de.fraunhofer.isst.health.transit.utils.gpas.psn;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymisationResult</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="anonymisationResult">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SUCCESS"/>
 *     <enumeration value="NOT_FOUND"/>
 *     <enumeration value="ALREADY_ANONYMISED"/>
 *     <enumeration value="ERROR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "anonymisationResult")
@XmlEnum
public enum AnonymisationResult {

    SUCCESS,
    NOT_FOUND,
    ALREADY_ANONYMISED,
    ERROR;

    public String value() {
        return name();
    }

    public static AnonymisationResult fromValue(String v) {
        return valueOf(v);
    }

}
