
package com.verimatrix.schemas.omitypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceTypeLicenseData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceTypeLicenseData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deviceTypeData" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}DeviceTypeData"/>
 *         &lt;element name="licenseData" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}LicenseData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceTypeLicenseData", propOrder = {
    "deviceTypeData",
    "licenseData"
})
public class DeviceTypeLicenseData {

    @XmlElement(required = true)
    protected DeviceTypeData deviceTypeData;
    @XmlElement(required = true)
    protected LicenseData licenseData;

    /**
     * Gets the value of the deviceTypeData property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceTypeData }
     *     
     */
    public DeviceTypeData getDeviceTypeData() {
        return deviceTypeData;
    }

    /**
     * Sets the value of the deviceTypeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceTypeData }
     *     
     */
    public void setDeviceTypeData(DeviceTypeData value) {
        this.deviceTypeData = value;
    }

    /**
     * Gets the value of the licenseData property.
     * 
     * @return
     *     possible object is
     *     {@link LicenseData }
     *     
     */
    public LicenseData getLicenseData() {
        return licenseData;
    }

    /**
     * Sets the value of the licenseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenseData }
     *     
     */
    public void setLicenseData(LicenseData value) {
        this.licenseData = value;
    }

}
