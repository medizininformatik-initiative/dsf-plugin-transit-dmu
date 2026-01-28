package de.fraunhofer.isst.health.transit.utils.gpas.psn;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deletionResult</p>.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="deletionResult">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="SUCCESS"/>
 *     <enumeration value="NOT_FOUND"/>
 *     <enumeration value="ERROR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 */
@XmlType(name = "deletionResult")
@XmlEnum
public enum DeletionResult {

    SUCCESS,
    NOT_FOUND,
    ERROR;

    public String value() {
        return name();
    }

    public static DeletionResult fromValue(String v) {
        return valueOf(v);
    }

}
