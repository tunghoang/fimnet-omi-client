
package com.verimatrix.schemas.omitypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for STBPairingResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="STBPairingResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}Result"/>
 *         &lt;element name="smartCardDeviceList" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}SmartCardDeviceList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STBPairingResult", propOrder = {
    "result",
    "smartCardDeviceList"
})
public class STBPairingResult {

    @XmlElement(required = true)
    protected Result result;
    protected SmartCardDeviceList smartCardDeviceList;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link Result }
     *     
     */
    public Result getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link Result }
     *     
     */
    public void setResult(Result value) {
        this.result = value;
    }

    /**
     * Gets the value of the smartCardDeviceList property.
     * 
     * @return
     *     possible object is
     *     {@link SmartCardDeviceList }
     *     
     */
    public SmartCardDeviceList getSmartCardDeviceList() {
        return smartCardDeviceList;
    }

    /**
     * Sets the value of the smartCardDeviceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmartCardDeviceList }
     *     
     */
    public void setSmartCardDeviceList(SmartCardDeviceList value) {
        this.smartCardDeviceList = value;
    }

}
