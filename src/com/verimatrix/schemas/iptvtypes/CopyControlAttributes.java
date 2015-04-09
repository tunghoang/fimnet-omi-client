
package com.verimatrix.schemas.iptvtypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CopyControlAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CopyControlAttributes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ccCGMS_A" type="{http://www.verimatrix.com/schemas/IPTVtypes.xsd}CGMS_A"/>
 *         &lt;element name="ccACP" type="{http://www.verimatrix.com/schemas/IPTVtypes.xsd}ACP"/>
 *         &lt;element name="ccDwightCavendish" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ccHDCP" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ccDOT" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CopyControlAttributes", propOrder = {
    "ccCGMSA",
    "ccACP",
    "ccDwightCavendish",
    "ccHDCP",
    "ccDOT"
})
public class CopyControlAttributes {

    @XmlElement(name = "ccCGMS_A")
    protected int ccCGMSA;
    protected int ccACP;
    protected boolean ccDwightCavendish;
    protected boolean ccHDCP;
    protected Boolean ccDOT;

    /**
     * Gets the value of the ccCGMSA property.
     * 
     */
    public int getCcCGMSA() {
        return ccCGMSA;
    }

    /**
     * Sets the value of the ccCGMSA property.
     * 
     */
    public void setCcCGMSA(int value) {
        this.ccCGMSA = value;
    }

    /**
     * Gets the value of the ccACP property.
     * 
     */
    public int getCcACP() {
        return ccACP;
    }

    /**
     * Sets the value of the ccACP property.
     * 
     */
    public void setCcACP(int value) {
        this.ccACP = value;
    }

    /**
     * Gets the value of the ccDwightCavendish property.
     * 
     */
    public boolean isCcDwightCavendish() {
        return ccDwightCavendish;
    }

    /**
     * Sets the value of the ccDwightCavendish property.
     * 
     */
    public void setCcDwightCavendish(boolean value) {
        this.ccDwightCavendish = value;
    }

    /**
     * Gets the value of the ccHDCP property.
     * 
     */
    public boolean isCcHDCP() {
        return ccHDCP;
    }

    /**
     * Sets the value of the ccHDCP property.
     * 
     */
    public void setCcHDCP(boolean value) {
        this.ccHDCP = value;
    }

    /**
     * Gets the value of the ccDOT property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCcDOT() {
        return ccDOT;
    }

    /**
     * Sets the value of the ccDOT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCcDOT(Boolean value) {
        this.ccDOT = value;
    }

}
