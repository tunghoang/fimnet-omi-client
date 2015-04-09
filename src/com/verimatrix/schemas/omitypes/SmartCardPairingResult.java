
package com.verimatrix.schemas.omitypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SmartCardPairingResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmartCardPairingResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}Result"/>
 *         &lt;element name="stbDeviceList" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}STBDeviceList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SmartCardPairingResult", propOrder = {
    "result",
    "stbDeviceList"
})
public class SmartCardPairingResult {

    @XmlElement(required = true)
    protected Result result;
    protected STBDeviceList stbDeviceList;

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
     * Gets the value of the stbDeviceList property.
     * 
     * @return
     *     possible object is
     *     {@link STBDeviceList }
     *     
     */
    public STBDeviceList getStbDeviceList() {
        return stbDeviceList;
    }

    /**
     * Sets the value of the stbDeviceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link STBDeviceList }
     *     
     */
    public void setStbDeviceList(STBDeviceList value) {
        this.stbDeviceList = value;
    }

}
