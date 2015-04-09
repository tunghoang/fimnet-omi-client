
package com.verimatrix.schemas.omitypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageHandle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageHandle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sector" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="messageId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageHandle", propOrder = {
    "sector",
    "messageId"
})
public class MessageHandle {

    protected int sector;
    protected int messageId;

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
     * Gets the value of the messageId property.
     * 
     */
    public int getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     */
    public void setMessageId(int value) {
        this.messageId = value;
    }

}
