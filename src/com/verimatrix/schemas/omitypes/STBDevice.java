
package com.verimatrix.schemas.omitypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for STBDevice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="STBDevice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="smsSTBId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "STBDevice", propOrder = {
    "smsSTBId"
})
public class STBDevice {

    @XmlElement(required = true)
    protected String smsSTBId;

    /**
     * Gets the value of the smsSTBId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsSTBId() {
        return smsSTBId;
    }

    /**
     * Sets the value of the smsSTBId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsSTBId(String value) {
        this.smsSTBId = value;
    }

}
