
package com.verimatrix.schemas.omitypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SiteEntityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SiteEntityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RETAILER"/>
 *     &lt;enumeration value="WHOLESALER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SiteEntityType")
@XmlEnum
public enum SiteEntityType {

    RETAILER,
    WHOLESALER;

    public String value() {
        return name();
    }

    public static SiteEntityType fromValue(String v) {
        return valueOf(v);
    }

}
