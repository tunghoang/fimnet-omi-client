
package com.verimatrix.schemas.omitypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Domain complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Domain">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="smsDomainId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="maxDevices" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="timePeriodRule" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}TimePeriodRule"/>
 *         &lt;element name="domainAddress" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}DomainAddress" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Domain", propOrder = {
    "smsDomainId",
    "maxDevices",
    "timePeriodRule",
    "domainAddress"
})
public class Domain {

    @XmlElement(required = true)
    protected String smsDomainId;
    protected int maxDevices;
    @XmlElement(required = true)
    protected TimePeriodRule timePeriodRule;
    protected Integer domainAddress;

    /**
     * Gets the value of the smsDomainId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsDomainId() {
        return smsDomainId;
    }

    /**
     * Sets the value of the smsDomainId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsDomainId(String value) {
        this.smsDomainId = value;
    }

    /**
     * Gets the value of the maxDevices property.
     * 
     */
    public int getMaxDevices() {
        return maxDevices;
    }

    /**
     * Sets the value of the maxDevices property.
     * 
     */
    public void setMaxDevices(int value) {
        this.maxDevices = value;
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
     * Gets the value of the domainAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDomainAddress() {
        return domainAddress;
    }

    /**
     * Sets the value of the domainAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDomainAddress(Integer value) {
        this.domainAddress = value;
    }

}
