
package com.verimatrix.schemas.omitypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeviceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LEGACY"/>
 *     &lt;enumeration value="STB_IPTV"/>
 *     &lt;enumeration value="DESKTOP_PC"/>
 *     &lt;enumeration value="DESKTOP_MAC"/>
 *     &lt;enumeration value="RSM"/>
 *     &lt;enumeration value="RKE"/>
 *     &lt;enumeration value="PROF_RECEIVER"/>
 *     &lt;enumeration value="STB_HYBRID"/>
 *     &lt;enumeration value="STB_DVB_SC"/>
 *     &lt;enumeration value="STB_DVB_NSC1"/>
 *     &lt;enumeration value="STB_DVB_NSC2"/>
 *     &lt;enumeration value="STB_DVB_STB"/>
 *     &lt;enumeration value="WEB_PC"/>
 *     &lt;enumeration value="WEB_MAC"/>
 *     &lt;enumeration value="WEB_IPHONE"/>
 *     &lt;enumeration value="WEB_ANDROID"/>
 *     &lt;enumeration value="WEB_STB"/>
 *     &lt;enumeration value="PLAYREADY_PC"/>
 *     &lt;enumeration value="PLAYREADY_MAC"/>
 *     &lt;enumeration value="PLAYREADY_IPHONE"/>
 *     &lt;enumeration value="PLAYREADY_ANDROID"/>
 *     &lt;enumeration value="PLAYREADY_STB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeviceType")
@XmlEnum
public enum DeviceType {

    LEGACY("LEGACY"),
    STB_IPTV("STB_IPTV"),
    DESKTOP_PC("DESKTOP_PC"),
    DESKTOP_MAC("DESKTOP_MAC"),
    RSM("RSM"),
    RKE("RKE"),
    PROF_RECEIVER("PROF_RECEIVER"),
    STB_HYBRID("STB_HYBRID"),
    STB_DVB_SC("STB_DVB_SC"),
    @XmlEnumValue("STB_DVB_NSC1")
    STB_DVB_NSC_1("STB_DVB_NSC1"),
    @XmlEnumValue("STB_DVB_NSC2")
    STB_DVB_NSC_2("STB_DVB_NSC2"),
    STB_DVB_STB("STB_DVB_STB"),
    WEB_PC("WEB_PC"),
    WEB_MAC("WEB_MAC"),
    WEB_IPHONE("WEB_IPHONE"),
    WEB_ANDROID("WEB_ANDROID"),
    WEB_STB("WEB_STB"),
    PLAYREADY_PC("PLAYREADY_PC"),
    PLAYREADY_MAC("PLAYREADY_MAC"),
    PLAYREADY_IPHONE("PLAYREADY_IPHONE"),
    PLAYREADY_ANDROID("PLAYREADY_ANDROID"),
    PLAYREADY_STB("PLAYREADY_STB");
    private final String value;

    DeviceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeviceType fromValue(String v) {
        for (DeviceType c: DeviceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
