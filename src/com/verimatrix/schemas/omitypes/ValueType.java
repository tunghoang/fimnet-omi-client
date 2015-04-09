
package com.verimatrix.schemas.omitypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValueType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ValueType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STRING"/>
 *     &lt;enumeration value="DATETIME"/>
 *     &lt;enumeration value="NUMBER"/>
 *     &lt;enumeration value="FLOAT"/>
 *     &lt;enumeration value="BOOLEAN"/>
 *     &lt;enumeration value="DURATION"/>
 *     &lt;enumeration value="BASE64"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ValueType")
@XmlEnum
public enum ValueType {

    STRING("STRING"),
    DATETIME("DATETIME"),
    NUMBER("NUMBER"),
    FLOAT("FLOAT"),
    BOOLEAN("BOOLEAN"),
    DURATION("DURATION"),
    @XmlEnumValue("BASE64")
    BASE_64("BASE64");
    private final String value;

    ValueType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ValueType fromValue(String v) {
        for (ValueType c: ValueType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
