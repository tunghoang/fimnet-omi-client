
package com.verimatrix.schemas.omitypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Package complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Package">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="smsPackageId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="packageAttributes" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}PackageAttributes" minOccurs="0"/>
 *         &lt;element name="packageParameters" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}PackageParameters" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Package", propOrder = {
    "smsPackageId",
    "description",
    "packageAttributes",
    "packageParameters"
})
public class Package {

    @XmlElement(required = true)
    protected String smsPackageId;
    protected String description;
    protected PackageAttributes packageAttributes;
    protected PackageParameters packageParameters;

    /**
     * Gets the value of the smsPackageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsPackageId() {
        return smsPackageId;
    }

    /**
     * Sets the value of the smsPackageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsPackageId(String value) {
        this.smsPackageId = value;
    }

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
     * Gets the value of the packageAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link PackageAttributes }
     *     
     */
    public PackageAttributes getPackageAttributes() {
        return packageAttributes;
    }

    /**
     * Sets the value of the packageAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageAttributes }
     *     
     */
    public void setPackageAttributes(PackageAttributes value) {
        this.packageAttributes = value;
    }

    /**
     * Gets the value of the packageParameters property.
     * 
     * @return
     *     possible object is
     *     {@link PackageParameters }
     *     
     */
    public PackageParameters getPackageParameters() {
        return packageParameters;
    }

    /**
     * Sets the value of the packageParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageParameters }
     *     
     */
    public void setPackageParameters(PackageParameters value) {
        this.packageParameters = value;
    }

}
