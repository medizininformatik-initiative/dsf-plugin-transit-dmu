package de.fraunhofer.isst.health.transit.utils.epix.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;

import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für identifierHistoryDTO complex type.</p>
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.</p>
 * 
 * <pre>{@code
 * <complexType name="identifierHistoryDTO">
 *   <complexContent>
 *     <extension base="{http://www.ttp.icmvc.emau.org/epix/common/model}identifierDTO">
 *       <sequence>
 *         <element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="event" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="historyId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="historyTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identifierHistoryDTO", namespace = "http://www.ttp.icmvc.emau.org/epix/common/model", propOrder = {
    "comment",
    "event",
    "historyId",
    "historyTimestamp",
    "user"
})
public class IdentifierHistoryDTO
    extends IdentifierDTO
{

    protected String comment;
    protected String event;
    protected long historyId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar historyTimestamp;
    protected String user;

    /**
     * Ruft den Wert der comment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Legt den Wert der comment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Ruft den Wert der event-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvent() {
        return event;
    }

    /**
     * Legt den Wert der event-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvent(String value) {
        this.event = value;
    }

    /**
     * Ruft den Wert der historyId-Eigenschaft ab.
     * 
     */
    public long getHistoryId() {
        return historyId;
    }

    /**
     * Legt den Wert der historyId-Eigenschaft fest.
     * 
     */
    public void setHistoryId(long value) {
        this.historyId = value;
    }

    /**
     * Ruft den Wert der historyTimestamp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHistoryTimestamp() {
        return historyTimestamp;
    }

    /**
     * Legt den Wert der historyTimestamp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHistoryTimestamp(XMLGregorianCalendar value) {
        this.historyTimestamp = value;
    }

    /**
     * Ruft den Wert der user-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Legt den Wert der user-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

}
