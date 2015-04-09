
package com.verimatrix.schemas.omitypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetailerEntitlementResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetailerEntitlementResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}Result"/>
 *         &lt;element name="retailer" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}Site" minOccurs="0"/>
 *         &lt;element name="entitlements" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}DeviceData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetailerEntitlementResult", propOrder = {
    "result",
    "retailer",
    "entitlements"
})
public class RetailerEntitlementResult {

    @XmlElement(required = true)
    protected Result result;
    protected Site retailer;
    protected List<DeviceData> entitlements;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link Result }
     *     
     */
    public Result getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link Result }
     *     
     */
    public void setResult(Result value) {
        this.result = value;
    }

    /**
     * Gets the value of the retailer property.
     * 
     * @return
     *     possible object is
     *     {@link Site }
     *     
     */
    public Site getRetailer() {
        return retailer;
    }

    /**
     * Sets the value of the retailer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Site }
     *     
     */
    public void setRetailer(Site value) {
        this.retailer = value;
    }

    /**
     * Gets the value of the entitlements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entitlements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntitlements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceData }
     * 
     * 
     */
    public List<DeviceData> getEntitlements() {
        if (entitlements == null) {
            entitlements = new ArrayList<DeviceData>();
        }
        return this.entitlements;
    }

}
