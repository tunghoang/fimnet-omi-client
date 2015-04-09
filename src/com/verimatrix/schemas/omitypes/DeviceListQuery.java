
package com.verimatrix.schemas.omitypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceListQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceListQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="smsDeviceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deviceCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceListQuery", propOrder = {
    "smsDeviceId",
    "deviceCount"
})
public class DeviceListQuery {

    @XmlElement(required = true)
    protected String smsDeviceId;
    protected int deviceCount;

    /**
     * Gets the value of the smsDeviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsDeviceId() {
        return smsDeviceId;
    }

    /**
     * Sets the value of the smsDeviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsDeviceId(String value) {
        this.smsDeviceId = value;
    }

    /**
     * Gets the value of the deviceCount property.
     * 
     */
    public int getDeviceCount() {
        return deviceCount;
    }

    /**
     * Sets the value of the deviceCount property.
     * 
     */
    public void setDeviceCount(int value) {
        this.deviceCount = value;
    }

}
