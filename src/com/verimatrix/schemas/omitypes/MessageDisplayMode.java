
package com.verimatrix.schemas.omitypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageDisplayMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageDisplayMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FX_NEXTSTB"/>
 *     &lt;enumeration value="RM_NEXTSTB"/>
 *     &lt;enumeration value="FX_NEXTCA"/>
 *     &lt;enumeration value="RM_NEXTCA"/>
 *     &lt;enumeration value="FX_STILLCA"/>
 *     &lt;enumeration value="RM_STILLCA"/>
 *     &lt;enumeration value="FX_IMMED"/>
 *     &lt;enumeration value="RM_IMMED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MessageDisplayMode")
@XmlEnum
public enum MessageDisplayMode {

    FX_NEXTSTB,
    RM_NEXTSTB,
    FX_NEXTCA,
    RM_NEXTCA,
    FX_STILLCA,
    RM_STILLCA,
    FX_IMMED,
    RM_IMMED;

    public String value() {
        return name();
    }

    public static MessageDisplayMode fromValue(String v) {
        return valueOf(v);
    }

}
