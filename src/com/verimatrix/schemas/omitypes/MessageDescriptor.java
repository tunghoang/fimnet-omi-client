
package com.verimatrix.schemas.omitypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageDescriptor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageDescriptor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="displayMode" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}MessageDisplayMode"/>
 *         &lt;element name="displayDuration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="xOrigin" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}MessageOrigin"/>
 *         &lt;element name="xPosition" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="xAnchor" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}MessageAnchor"/>
 *         &lt;element name="yOrigin" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}MessageOrigin"/>
 *         &lt;element name="yPosition" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="yAnchor" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}MessageAnchor"/>
 *         &lt;element name="textAlign" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}MessageAlign"/>
 *         &lt;element name="bgColor" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}MessageColor"/>
 *         &lt;element name="alpha" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}MessageAlpha"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageDescriptor", propOrder = {
    "displayMode",
    "displayDuration",
    "xOrigin",
    "xPosition",
    "xAnchor",
    "yOrigin",
    "yPosition",
    "yAnchor",
    "textAlign",
    "bgColor",
    "alpha"
})
public class MessageDescriptor {

    @XmlElement(required = true)
    protected MessageDisplayMode displayMode;
    protected int displayDuration;
    @XmlElement(required = true)
    protected MessageOrigin xOrigin;
    protected int xPosition;
    @XmlElement(required = true)
    protected MessageAnchor xAnchor;
    @XmlElement(required = true)
    protected MessageOrigin yOrigin;
    protected int yPosition;
    @XmlElement(required = true)
    protected MessageAnchor yAnchor;
    @XmlElement(required = true)
    protected MessageAlign textAlign;
    protected int bgColor;
    protected int alpha;

    /**
     * Gets the value of the displayMode property.
     * 
     * @return
     *     possible object is
     *     {@link MessageDisplayMode }
     *     
     */
    public MessageDisplayMode getDisplayMode() {
        return displayMode;
    }

    /**
     * Sets the value of the displayMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageDisplayMode }
     *     
     */
    public void setDisplayMode(MessageDisplayMode value) {
        this.displayMode = value;
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
     * Gets the value of the xOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link MessageOrigin }
     *     
     */
    public MessageOrigin getXOrigin() {
        return xOrigin;
    }

    /**
     * Sets the value of the xOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageOrigin }
     *     
     */
    public void setXOrigin(MessageOrigin value) {
        this.xOrigin = value;
    }

    /**
     * Gets the value of the xPosition property.
     * 
     */
    public int getXPosition() {
        return xPosition;
    }

    /**
     * Sets the value of the xPosition property.
     * 
     */
    public void setXPosition(int value) {
        this.xPosition = value;
    }

    /**
     * Gets the value of the xAnchor property.
     * 
     * @return
     *     possible object is
     *     {@link MessageAnchor }
     *     
     */
    public MessageAnchor getXAnchor() {
        return xAnchor;
    }

    /**
     * Sets the value of the xAnchor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageAnchor }
     *     
     */
    public void setXAnchor(MessageAnchor value) {
        this.xAnchor = value;
    }

    /**
     * Gets the value of the yOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link MessageOrigin }
     *     
     */
    public MessageOrigin getYOrigin() {
        return yOrigin;
    }

    /**
     * Sets the value of the yOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageOrigin }
     *     
     */
    public void setYOrigin(MessageOrigin value) {
        this.yOrigin = value;
    }

    /**
     * Gets the value of the yPosition property.
     * 
     */
    public int getYPosition() {
        return yPosition;
    }

    /**
     * Sets the value of the yPosition property.
     * 
     */
    public void setYPosition(int value) {
        this.yPosition = value;
    }

    /**
     * Gets the value of the yAnchor property.
     * 
     * @return
     *     possible object is
     *     {@link MessageAnchor }
     *     
     */
    public MessageAnchor getYAnchor() {
        return yAnchor;
    }

    /**
     * Sets the value of the yAnchor property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageAnchor }
     *     
     */
    public void setYAnchor(MessageAnchor value) {
        this.yAnchor = value;
    }

    /**
     * Gets the value of the textAlign property.
     * 
     * @return
     *     possible object is
     *     {@link MessageAlign }
     *     
     */
    public MessageAlign getTextAlign() {
        return textAlign;
    }

    /**
     * Sets the value of the textAlign property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageAlign }
     *     
     */
    public void setTextAlign(MessageAlign value) {
        this.textAlign = value;
    }

    /**
     * Gets the value of the bgColor property.
     * 
     */
    public int getBgColor() {
        return bgColor;
    }

    /**
     * Sets the value of the bgColor property.
     * 
     */
    public void setBgColor(int value) {
        this.bgColor = value;
    }

    /**
     * Gets the value of the alpha property.
     * 
     */
    public int getAlpha() {
        return alpha;
    }

    /**
     * Sets the value of the alpha property.
     * 
     */
    public void setAlpha(int value) {
        this.alpha = value;
    }

}
