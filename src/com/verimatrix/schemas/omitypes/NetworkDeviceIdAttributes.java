
package com.verimatrix.schemas.omitypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.verimatrix.schemas.iptvtypes.DeviceAttributes;


/**
 * <p>Java class for NetworkDeviceIdAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkDeviceIdAttributes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="deviceAttributes" type="{http://www.verimatrix.com/schemas/IPTVtypes.xsd}DeviceAttributes"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkDeviceIdAttributes", propOrder = {
    "deviceAttributes"
})
public class NetworkDeviceIdAttributes {

    protected DeviceAttributes deviceAttributes;

    /**
     * Gets the value of the deviceAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceAttributes }
     *     
     */
    public DeviceAttributes getDeviceAttributes() {
        return deviceAttributes;
    }

    /**
     * Sets the value of the deviceAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceAttributes }
     *     
     */
    public void setDeviceAttributes(DeviceAttributes value) {
        this.deviceAttributes = value;
    }

}
