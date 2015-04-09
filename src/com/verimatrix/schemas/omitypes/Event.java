
package com.verimatrix.schemas.omitypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Event complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Event">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="smsEventId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="smsContentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="smsNetworkId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="exclusive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="preStartDuration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="timePeriodRule" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}TimePeriodRule"/>
 *         &lt;element name="ratingLevel" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}RatingLevel" minOccurs="0"/>
 *         &lt;element name="fingerprintMessage" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}FingerprintMessage" minOccurs="0"/>
 *         &lt;element name="eventParameters" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}EventParameters" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Event", propOrder = {
    "smsEventId",
    "smsContentId",
    "smsNetworkId",
    "exclusive",
    "preStartDuration",
    "timePeriodRule",
    "ratingLevel",
    "fingerprintMessage",
    "eventParameters"
})
public class Event {

    @XmlElement(required = true)
    protected String smsEventId;
    @XmlElement(required = true)
    protected String smsContentId;
    @XmlElement(required = true)
    protected String smsNetworkId;
    protected boolean exclusive;
    protected int preStartDuration;
    @XmlElement(required = true)
    protected TimePeriodRule timePeriodRule;
    protected Integer ratingLevel;
    protected FingerprintMessage fingerprintMessage;
    protected EventParameters eventParameters;

    /**
     * Gets the value of the smsEventId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsEventId() {
        return smsEventId;
    }

    /**
     * Sets the value of the smsEventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsEventId(String value) {
        this.smsEventId = value;
    }

    /**
     * Gets the value of the smsContentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsContentId() {
        return smsContentId;
    }

    /**
     * Sets the value of the smsContentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsContentId(String value) {
        this.smsContentId = value;
    }

    /**
     * Gets the value of the smsNetworkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsNetworkId() {
        return smsNetworkId;
    }

    /**
     * Sets the value of the smsNetworkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsNetworkId(String value) {
        this.smsNetworkId = value;
    }

    /**
     * Gets the value of the exclusive property.
     * 
     */
    public boolean isExclusive() {
        return exclusive;
    }

    /**
     * Sets the value of the exclusive property.
     * 
     */
    public void setExclusive(boolean value) {
        this.exclusive = value;
    }

    /**
     * Gets the value of the preStartDuration property.
     * 
     */
    public int getPreStartDuration() {
        return preStartDuration;
    }

    /**
     * Sets the value of the preStartDuration property.
     * 
     */
    public void setPreStartDuration(int value) {
        this.preStartDuration = value;
    }

    /**
     * Gets the value of the timePeriodRule property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodRule }
     *     
     */
    public TimePeriodRule getTimePeriodRule() {
        return timePeriodRule;
    }

    /**
     * Sets the value of the timePeriodRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodRule }
     *     
     */
    public void setTimePeriodRule(TimePeriodRule value) {
        this.timePeriodRule = value;
    }

    /**
     * Gets the value of the ratingLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRatingLevel() {
        return ratingLevel;
    }

    /**
     * Sets the value of the ratingLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRatingLevel(Integer value) {
        this.ratingLevel = value;
    }

    /**
     * Gets the value of the fingerprintMessage property.
     * 
     * @return
     *     possible object is
     *     {@link FingerprintMessage }
     *     
     */
    public FingerprintMessage getFingerprintMessage() {
        return fingerprintMessage;
    }

    /**
     * Sets the value of the fingerprintMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link FingerprintMessage }
     *     
     */
    public void setFingerprintMessage(FingerprintMessage value) {
        this.fingerprintMessage = value;
    }

    /**
     * Gets the value of the eventParameters property.
     * 
     * @return
     *     possible object is
     *     {@link EventParameters }
     *     
     */
    public EventParameters getEventParameters() {
        return eventParameters;
    }

    /**
     * Sets the value of the eventParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventParameters }
     *     
     */
    public void setEventParameters(EventParameters value) {
        this.eventParameters = value;
    }

}
