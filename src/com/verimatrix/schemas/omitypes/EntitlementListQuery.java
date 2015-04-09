
package com.verimatrix.schemas.omitypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntitlementListQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntitlementListQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="smsEntitlementId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="entityType" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}EntityType"/>
 *         &lt;element name="entitlementCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntitlementListQuery", propOrder = {
    "smsEntitlementId",
    "entityType",
    "entitlementCount"
})
public class EntitlementListQuery {

    @XmlElement(required = true)
    protected String smsEntitlementId;
    @XmlElement(required = true)
    protected EntityType entityType;
    protected int entitlementCount;

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
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityType }
     *     
     */
    public EntityType getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityType }
     *     
     */
    public void setEntityType(EntityType value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the entitlementCount property.
     * 
     */
    public int getEntitlementCount() {
        return entitlementCount;
    }

    /**
     * Sets the value of the entitlementCount property.
     * 
     */
    public void setEntitlementCount(int value) {
        this.entitlementCount = value;
    }

}
