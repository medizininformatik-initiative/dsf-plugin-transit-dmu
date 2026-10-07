package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java-Klasse für identifierDeletionResult.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * <pre>{@code
 * <simpleType name="identifierDeletionResult">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NOT_FOUND_AND_IGNORED"/>
 *     <enumeration value="FOUND_AND_DELETED"/>
 *     <enumeration value="FOUND_AND_NOT_DELETED_AS_USED_IN_MPI_DOMAIN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "identifierDeletionResult")
@XmlEnum
public enum IdentifierDeletionResult {

    NOT_FOUND_AND_IGNORED,
    FOUND_AND_DELETED,
    FOUND_AND_NOT_DELETED_AS_USED_IN_MPI_DOMAIN;

    public String value() {
        return name();
    }

    public static IdentifierDeletionResult fromValue(String v) {
        return valueOf(v);
    }

}
