
package com.verimatrix.schemas.omitypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageAnchor.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageAnchor">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CENTER"/>
 *     &lt;enumeration value="AUTOLR"/>
 *     &lt;enumeration value="AUTOTD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MessageAnchor")
@XmlEnum
public enum MessageAnchor {

    CENTER,
    AUTOLR,
    AUTOTD;

    public String value() {
        return name();
    }

    public static MessageAnchor fromValue(String v) {
        return valueOf(v);
    }

}
