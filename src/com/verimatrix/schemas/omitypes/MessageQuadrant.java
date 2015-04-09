
package com.verimatrix.schemas.omitypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageQuadrant.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageQuadrant">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CENTER"/>
 *     &lt;enumeration value="NORTH"/>
 *     &lt;enumeration value="NORTH_EAST"/>
 *     &lt;enumeration value="EAST"/>
 *     &lt;enumeration value="SOUTH_EAST"/>
 *     &lt;enumeration value="SOUTH"/>
 *     &lt;enumeration value="SOUTH_WEST"/>
 *     &lt;enumeration value="WEST"/>
 *     &lt;enumeration value="NORTH_WEST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MessageQuadrant")
@XmlEnum
public enum MessageQuadrant {

    CENTER,
    NORTH,
    NORTH_EAST,
    EAST,
    SOUTH_EAST,
    SOUTH,
    SOUTH_WEST,
    WEST,
    NORTH_WEST;

    public String value() {
        return name();
    }

    public static MessageQuadrant fromValue(String v) {
        return valueOf(v);
    }

}
