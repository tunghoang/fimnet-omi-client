
package com.verimatrix.schemas.omitypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LicenseData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LicenseData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lowerBounds" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="upperBounds" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="limit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="activeCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseData", propOrder = {
    "lowerBounds",
    "upperBounds",
    "limit",
    "activeCount"
})
public class LicenseData {

    protected int lowerBounds;
    protected int upperBounds;
    protected int limit;
    protected int activeCount;

    /**
     * Gets the value of the lowerBounds property.
     * 
     */
    public int getLowerBounds() {
        return lowerBounds;
    }

    /**
     * Sets the value of the lowerBounds property.
     * 
     */
    public void setLowerBounds(int value) {
        this.lowerBounds = value;
    }

    /**
     * Gets the value of the upperBounds property.
     * 
     */
    public int getUpperBounds() {
        return upperBounds;
    }

    /**
     * Sets the value of the upperBounds property.
     * 
     */
    public void setUpperBounds(int value) {
        this.upperBounds = value;
    }

    /**
     * Gets the value of the limit property.
     * 
     */
    public int getLimit() {
        return limit;
    }

    /**
     * Sets the value of the limit property.
     * 
     */
    public void setLimit(int value) {
        this.limit = value;
    }

    /**
     * Gets the value of the activeCount property.
     * 
     */
    public int getActiveCount() {
        return activeCount;
    }

    /**
     * Sets the value of the activeCount property.
     * 
     */
    public void setActiveCount(int value) {
        this.activeCount = value;
    }

}
