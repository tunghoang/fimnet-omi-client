
package com.verimatrix.schemas.omitypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SmartCardDevice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SmartCardDevice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="smsSmartCardId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SmartCardDevice", propOrder = {
    "smsSmartCardId"
})
public class SmartCardDevice {

    @XmlElement(required = true)
    protected String smsSmartCardId;

    /**
     * Gets the value of the smsSmartCardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsSmartCardId() {
        return smsSmartCardId;
    }

    /**
     * Sets the value of the smsSmartCardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsSmartCardId(String value) {
        this.smsSmartCardId = value;
    }

}
