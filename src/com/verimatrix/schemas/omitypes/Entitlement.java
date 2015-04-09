
package com.verimatrix.schemas.omitypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Entitlement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Entitlement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="smsEntitlementId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="package" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}Package"/>
 *         &lt;element name="entitledEntity" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}EntitledEntity"/>
 *         &lt;element name="timePeriodRule" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}TimePeriodRule"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Entitlement", propOrder = {
    "smsEntitlementId",
    "_package",
    "entitledEntity",
    "timePeriodRule"
})
public class Entitlement {

    @XmlElement(required = true)
    protected String smsEntitlementId;
    @XmlElement(name = "package", required = true)
    protected Package _package;
    @XmlElement(required = true)
    protected EntitledEntity entitledEntity;
    @XmlElement(required = true)
    protected TimePeriodRule timePeriodRule;

    /**
     * Gets the value of the smsEntitlementId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsEntitlementId() {
        return smsEntitlementId;
    }

    /**
     * Sets the value of the smsEntitlementId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsEntitlementId(String value) {
        this.smsEntitlementId = value;
    }

    /**
     * Gets the value of the package property.
     * 
     * @return
     *     possible object is
     *     {@link Package }
     *     
     */
    public Package getPackage() {
        return _package;
    }

    /**
     * Sets the value of the package property.
     * 
     * @param value
     *     allowed object is
     *     {@link Package }
     *     
     */
    public void setPackage(Package value) {
        this._package = value;
    }

    /**
     * Gets the value of the entitledEntity property.
     * 
     * @return
     *     possible object is
     *     {@link EntitledEntity }
     *     
     */
    public EntitledEntity getEntitledEntity() {
        return entitledEntity;
    }

    /**
     * Sets the value of the entitledEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntitledEntity }
     *     
     */
    public void setEntitledEntity(EntitledEntity value) {
        this.entitledEntity = value;
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

}
