
package com.verimatrix.schemas.omitypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SiteListQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SiteListQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="smsSiteId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="entityType" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}SiteEntityType"/>
 *         &lt;element name="siteCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteListQuery", propOrder = {
    "smsSiteId",
    "entityType",
    "siteCount"
})
public class SiteListQuery {

    @XmlElement(required = true)
    protected String smsSiteId;
    @XmlElement(required = true)
    protected SiteEntityType entityType;
    protected int siteCount;

    /**
     * Gets the value of the smsSiteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsSiteId() {
        return smsSiteId;
    }

    /**
     * Sets the value of the smsSiteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsSiteId(String value) {
        this.smsSiteId = value;
    }

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link SiteEntityType }
     *     
     */
    public SiteEntityType getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SiteEntityType }
     *     
     */
    public void setEntityType(SiteEntityType value) {
        this.entityType = value;
    }

    /**
     * Gets the value of the siteCount property.
     * 
     */
    public int getSiteCount() {
        return siteCount;
    }

    /**
     * Sets the value of the siteCount property.
     * 
     */
    public void setSiteCount(int value) {
        this.siteCount = value;
    }

}
