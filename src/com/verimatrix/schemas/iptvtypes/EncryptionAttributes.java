
package com.verimatrix.schemas.iptvtypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EncryptionAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EncryptionAttributes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="encryptionMode" type="{http://www.verimatrix.com/schemas/IPTVtypes.xsd}EncryptionMode"/>
 *         &lt;element name="pcrCorrection" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="keyMutationInterval" type="{http://www.verimatrix.com/schemas/IPTVtypes.xsd}KeyInterval"/>
 *         &lt;element name="keyInsertionInterval" type="{http://www.verimatrix.com/schemas/IPTVtypes.xsd}KeyInterval"/>
 *         &lt;element name="videoMark" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="controlWordPathProtection" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="videoEncryptionLevel" type="{http://www.verimatrix.com/schemas/IPTVtypes.xsd}EncryptionPercent"/>
 *         &lt;element name="audioEncryptionLevel" type="{http://www.verimatrix.com/schemas/IPTVtypes.xsd}EncryptionPercent"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncryptionAttributes", propOrder = {
    "description",
    "encryptionMode",
    "pcrCorrection",
    "keyMutationInterval",
    "keyInsertionInterval",
    "videoMark",
    "controlWordPathProtection",
    "videoEncryptionLevel",
    "audioEncryptionLevel"
})
public class EncryptionAttributes {

    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected EncryptionMode encryptionMode;
    protected boolean pcrCorrection;
    protected int keyMutationInterval;
    protected int keyInsertionInterval;
    protected boolean videoMark;
    protected boolean controlWordPathProtection;
    protected int videoEncryptionLevel;
    protected int audioEncryptionLevel;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the encryptionMode property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptionMode }
     *     
     */
    public EncryptionMode getEncryptionMode() {
        return encryptionMode;
    }

    /**
     * Sets the value of the encryptionMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptionMode }
     *     
     */
    public void setEncryptionMode(EncryptionMode value) {
        this.encryptionMode = value;
    }

    /**
     * Gets the value of the pcrCorrection property.
     * 
     */
    public boolean isPcrCorrection() {
        return pcrCorrection;
    }

    /**
     * Sets the value of the pcrCorrection property.
     * 
     */
    public void setPcrCorrection(boolean value) {
        this.pcrCorrection = value;
    }

    /**
     * Gets the value of the keyMutationInterval property.
     * 
     */
    public int getKeyMutationInterval() {
        return keyMutationInterval;
    }

    /**
     * Sets the value of the keyMutationInterval property.
     * 
     */
    public void setKeyMutationInterval(int value) {
        this.keyMutationInterval = value;
    }

    /**
     * Gets the value of the keyInsertionInterval property.
     * 
     */
    public int getKeyInsertionInterval() {
        return keyInsertionInterval;
    }

    /**
     * Sets the value of the keyInsertionInterval property.
     * 
     */
    public void setKeyInsertionInterval(int value) {
        this.keyInsertionInterval = value;
    }

    /**
     * Gets the value of the videoMark property.
     * 
     */
    public boolean isVideoMark() {
        return videoMark;
    }

    /**
     * Sets the value of the videoMark property.
     * 
     */
    public void setVideoMark(boolean value) {
        this.videoMark = value;
    }

    /**
     * Gets the value of the controlWordPathProtection property.
     * 
     */
    public boolean isControlWordPathProtection() {
        return controlWordPathProtection;
    }

    /**
     * Sets the value of the controlWordPathProtection property.
     * 
     */
    public void setControlWordPathProtection(boolean value) {
        this.controlWordPathProtection = value;
    }

    /**
     * Gets the value of the videoEncryptionLevel property.
     * 
     */
    public int getVideoEncryptionLevel() {
        return videoEncryptionLevel;
    }

    /**
     * Sets the value of the videoEncryptionLevel property.
     * 
     */
    public void setVideoEncryptionLevel(int value) {
        this.videoEncryptionLevel = value;
    }

    /**
     * Gets the value of the audioEncryptionLevel property.
     * 
     */
    public int getAudioEncryptionLevel() {
        return audioEncryptionLevel;
    }

    /**
     * Sets the value of the audioEncryptionLevel property.
     * 
     */
    public void setAudioEncryptionLevel(int value) {
        this.audioEncryptionLevel = value;
    }

}
