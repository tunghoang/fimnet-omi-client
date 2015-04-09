
package com.verimatrix.schemas.omitypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DevicePair complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DevicePair">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="stbDevice" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}STBDevice"/>
 *         &lt;element name="smartCardDevice" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}SmartCardDevice"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevicePair", propOrder = {
    "stbDevice",
    "smartCardDevice"
})
public class DevicePair {

    @XmlElement(required = true)
    protected STBDevice stbDevice;
    @XmlElement(required = true)
    protected SmartCardDevice smartCardDevice;

    /**
     * Gets the value of the stbDevice property.
     * 
     * @return
     *     possible object is
     *     {@link STBDevice }
     *     
     */
    public STBDevice getStbDevice() {
        return stbDevice;
    }

    /**
     * Sets the value of the stbDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link STBDevice }
     *     
     */
    public void setStbDevice(STBDevice value) {
        this.stbDevice = value;
    }

    /**
     * Gets the value of the smartCardDevice property.
     * 
     * @return
     *     possible object is
     *     {@link SmartCardDevice }
     *     
     */
    public SmartCardDevice getSmartCardDevice() {
        return smartCardDevice;
    }

    /**
     * Sets the value of the smartCardDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartCardDevice }
     *     
     */
    public void setSmartCardDevice(SmartCardDevice value) {
        this.smartCardDevice = value;
    }

}
