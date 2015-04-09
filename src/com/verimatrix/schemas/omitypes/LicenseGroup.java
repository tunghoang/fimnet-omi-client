
package com.verimatrix.schemas.omitypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LicenseGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LicenseGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="groupData" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}GroupData"/>
 *         &lt;element name="deviceTypeData" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}DeviceTypeData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseGroup", propOrder = {
    "groupData",
    "deviceTypeData"
})
public class LicenseGroup {

    @XmlElement(required = true)
    protected GroupData groupData;
    protected List<DeviceTypeData> deviceTypeData;

    /**
     * Gets the value of the groupData property.
     * 
     * @return
     *     possible object is
     *     {@link GroupData }
     *     
     */
    public GroupData getGroupData() {
        return groupData;
    }

    /**
     * Sets the value of the groupData property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupData }
     *     
     */
    public void setGroupData(GroupData value) {
        this.groupData = value;
    }

    /**
     * Gets the value of the deviceTypeData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceTypeData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceTypeData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceTypeData }
     * 
     * 
     */
    public List<DeviceTypeData> getDeviceTypeData() {
        if (deviceTypeData == null) {
            deviceTypeData = new ArrayList<DeviceTypeData>();
        }
        return this.deviceTypeData;
    }

}
