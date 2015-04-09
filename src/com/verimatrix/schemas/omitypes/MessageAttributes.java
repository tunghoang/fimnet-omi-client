
package com.verimatrix.schemas.omitypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageAttributes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contentMode" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}MessageContentMode"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageAttributes", propOrder = {
    "contentMode"
})
public class MessageAttributes {

    @XmlElement(required = true)
    protected MessageContentMode contentMode;

    /**
     * Gets the value of the contentMode property.
     * 
     * @return
     *     possible object is
     *     {@link MessageContentMode }
     *     
     */
    public MessageContentMode getContentMode() {
        return contentMode;
    }

    /**
     * Sets the value of the contentMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageContentMode }
     *     
     */
    public void setContentMode(MessageContentMode value) {
        this.contentMode = value;
    }

}
