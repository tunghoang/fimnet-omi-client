
package com.verimatrix.schemas.omitypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageContentMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageContentMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="POS"/>
 *     &lt;enumeration value="NEG"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MessageContentMode")
@XmlEnum
public enum MessageContentMode {

    POS,
    NEG;

    public String value() {
        return name();
    }

    public static MessageContentMode fromValue(String v) {
        return valueOf(v);
    }

}
