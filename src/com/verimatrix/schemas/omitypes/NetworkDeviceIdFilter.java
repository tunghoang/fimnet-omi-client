
package com.verimatrix.schemas.omitypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkDeviceIdFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkDeviceIdFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deviceType" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}DeviceType" minOccurs="0"/>
 *         &lt;element name="attributes" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}NetworkDeviceIdAttributes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkDeviceIdFilter", propOrder = {
    "deviceType",
    "attributes"
})
public class NetworkDeviceIdFilter {

    protected DeviceType deviceType;
    protected NetworkDeviceIdAttributes attributes;

    /**
     * Gets the value of the deviceType property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceType }
     *     
     */
    public DeviceType getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceType }
     *     
     */
    public void setDeviceType(DeviceType value) {
        this.deviceType = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkDeviceIdAttributes }
     *     
     */
    public NetworkDeviceIdAttributes getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkDeviceIdAttributes }
     *     
     */
    public void setAttributes(NetworkDeviceIdAttributes value) {
        this.attributes = value;
    }

}
