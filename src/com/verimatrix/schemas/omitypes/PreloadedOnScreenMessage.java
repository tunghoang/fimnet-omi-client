
package com.verimatrix.schemas.omitypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreloadedOnScreenMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreloadedOnScreenMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="textId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="displayDuration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="messageHandle" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}MessageHandle"/>
 *         &lt;element name="messageAttributes" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}MessageAttributes"/>
 *         &lt;element name="messageQuadrant" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}MessageQuadrant"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreloadedOnScreenMessage", propOrder = {
    "textId",
    "displayDuration",
    "messageHandle",
    "messageAttributes",
    "messageQuadrant"
})
public class PreloadedOnScreenMessage {

    protected int textId;
    protected int displayDuration;
    @XmlElement(required = true)
    protected MessageHandle messageHandle;
    @XmlElement(required = true)
    protected MessageAttributes messageAttributes;
    @XmlElement(required = true)
    protected MessageQuadrant messageQuadrant;

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
     * Gets the value of the displayDuration property.
     * 
     */
    public int getDisplayDuration() {
        return displayDuration;
    }

    /**
     * Sets the value of the displayDuration property.
     * 
     */
    public void setDisplayDuration(int value) {
        this.displayDuration = value;
    }

    /**
     * Gets the value of the messageHandle property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHandle }
     *     
     */
    public MessageHandle getMessageHandle() {
        return messageHandle;
    }

    /**
     * Sets the value of the messageHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHandle }
     *     
     */
    public void setMessageHandle(MessageHandle value) {
        this.messageHandle = value;
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
     * Gets the value of the messageQuadrant property.
     * 
     * @return
     *     possible object is
     *     {@link MessageQuadrant }
     *     
     */
    public MessageQuadrant getMessageQuadrant() {
        return messageQuadrant;
    }

    /**
     * Sets the value of the messageQuadrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageQuadrant }
     *     
     */
    public void setMessageQuadrant(MessageQuadrant value) {
        this.messageQuadrant = value;
    }

}
