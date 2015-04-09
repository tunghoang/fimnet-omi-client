
package com.verimatrix.schemas.omitypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreloadedMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreloadedMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="textId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sector" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="messageAttributes" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}MessageAttributes"/>
 *         &lt;element name="messageText" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}MessageText"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreloadedMessage", propOrder = {
    "textId",
    "sector",
    "messageAttributes",
    "messageText"
})
public class PreloadedMessage {

    protected int textId;
    protected int sector;
    @XmlElement(required = true)
    protected MessageAttributes messageAttributes;
    @XmlElement(required = true)
    protected MessageText messageText;

    /**
     * Gets the value of the textId property.
     * 
     */
    public int getTextId() {
        return textId;
    }

    /**
     * Sets the value of the textId property.
     * 
     */
    public void setTextId(int value) {
        this.textId = value;
    }

    /**
     * Gets the value of the sector property.
     * 
     */
    public int getSector() {
        return sector;
    }

    /**
     * Sets the value of the sector property.
     * 
     */
    public void setSector(int value) {
        this.sector = value;
    }

    /**
     * Gets the value of the messageAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link MessageAttributes }
     *     
     */
    public MessageAttributes getMessageAttributes() {
        return messageAttributes;
    }

    /**
     * Sets the value of the messageAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageAttributes }
     *     
     */
    public void setMessageAttributes(MessageAttributes value) {
        this.messageAttributes = value;
    }

    /**
     * Gets the value of the messageText property.
     * 
     * @return
     *     possible object is
     *     {@link MessageText }
     *     
     */
    public MessageText getMessageText() {
        return messageText;
    }

    /**
     * Sets the value of the messageText property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageText }
     *     
     */
    public void setMessageText(MessageText value) {
        this.messageText = value;
    }

}
