
package com.verimatrix.schemas.omitypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OnScreenMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OnScreenMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageHandle" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}MessageHandle"/>
 *         &lt;element name="messageAttributes" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}MessageAttributes"/>
 *         &lt;element name="messageText" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}MessageText" maxOccurs="2"/>
 *         &lt;element name="messageDescriptor" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}MessageDescriptor" maxOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnScreenMessage", propOrder = {
    "messageHandle",
    "messageAttributes",
    "messageText",
    "messageDescriptor"
})
public class OnScreenMessage {

    @XmlElement(required = true)
    protected MessageHandle messageHandle;
    @XmlElement(required = true)
    protected MessageAttributes messageAttributes;
    @XmlElement(required = true)
    protected List<MessageText> messageText;
    @XmlElement(required = true, nillable = true)
    protected List<MessageDescriptor> messageDescriptor;

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
     * Gets the value of the messageText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageText }
     * 
     * 
     */
    public List<MessageText> getMessageText() {
        if (messageText == null) {
            messageText = new ArrayList<MessageText>();
        }
        return this.messageText;
    }

    /**
     * Gets the value of the messageDescriptor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageDescriptor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageDescriptor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageDescriptor }
     * 
     * 
     */
    public List<MessageDescriptor> getMessageDescriptor() {
        if (messageDescriptor == null) {
            messageDescriptor = new ArrayList<MessageDescriptor>();
        }
        return this.messageDescriptor;
    }

}
