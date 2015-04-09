
package com.verimatrix.schemas.omitypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Device complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Device">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="smsDeviceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="smsNetworkId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deviceType" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}DeviceType"/>
 *         &lt;element name="networkDeviceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="smsAuthenticator" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Device", propOrder = {
    "smsDeviceId",
    "smsNetworkId",
    "deviceType",
    "networkDeviceId",
    "smsAuthenticator"
})
public class Device {

    @XmlElement(required = true)
    protected String smsDeviceId;
    @XmlElement(required = true)
    protected String smsNetworkId;
    @XmlElement(required = true)
    protected DeviceType deviceType;
    @XmlElement(required = true)
    protected String networkDeviceId;
    protected byte[] smsAuthenticator;

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
     * Gets the value of the smsNetworkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsNetworkId() {
        return smsNetworkId;
    }

    /**
     * Sets the value of the smsNetworkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsNetworkId(String value) {
        this.smsNetworkId = value;
    }

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
     * Gets the value of the networkDeviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkDeviceId() {
        return networkDeviceId;
    }

    /**
     * Sets the value of the networkDeviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkDeviceId(String value) {
        this.networkDeviceId = value;
    }

    /**
     * Gets the value of the smsAuthenticator property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSmsAuthenticator() {
        return smsAuthenticator;
    }

    /**
     * Sets the value of the smsAuthenticator property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSmsAuthenticator(byte[] value) {
        this.smsAuthenticator = ((byte[]) value);
    }

}
