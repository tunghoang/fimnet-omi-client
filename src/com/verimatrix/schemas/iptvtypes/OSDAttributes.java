
package com.verimatrix.schemas.iptvtypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OSDAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OSDAttributes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="osdActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="osdDuration" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="osdType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="osdLocation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OSDAttributes", propOrder = {
    "osdActive",
    "osdDuration",
    "osdType",
    "osdLocation"
})
public class OSDAttributes {

    protected boolean osdActive;
    protected int osdDuration;
    protected int osdType;
    protected int osdLocation;

    /**
     * Gets the value of the osdActive property.
     * 
     */
    public boolean isOsdActive() {
        return osdActive;
    }

    /**
     * Sets the value of the osdActive property.
     * 
     */
    public void setOsdActive(boolean value) {
        this.osdActive = value;
    }

    /**
     * Gets the value of the osdDuration property.
     * 
     */
    public int getOsdDuration() {
        return osdDuration;
    }

    /**
     * Sets the value of the osdDuration property.
     * 
     */
    public void setOsdDuration(int value) {
        this.osdDuration = value;
    }

    /**
     * Gets the value of the osdType property.
     * 
     */
    public int getOsdType() {
        return osdType;
    }

    /**
     * Sets the value of the osdType property.
     * 
     */
    public void setOsdType(int value) {
        this.osdType = value;
    }

    /**
     * Gets the value of the osdLocation property.
     * 
     */
    public int getOsdLocation() {
        return osdLocation;
    }

    /**
     * Sets the value of the osdLocation property.
     * 
     */
    public void setOsdLocation(int value) {
        this.osdLocation = value;
    }

}
