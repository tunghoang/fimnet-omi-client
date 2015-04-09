
package com.verimatrix.schemas.iptvtypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DTVEncryptionAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DTVEncryptionAttributes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="applianceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inputURL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="outputURL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="copyControlAttributes" type="{http://www.verimatrix.com/schemas/IPTVtypes.xsd}CopyControlAttributes"/>
 *         &lt;element name="osdAttributes" type="{http://www.verimatrix.com/schemas/IPTVtypes.xsd}OSDAttributes"/>
 *         &lt;element name="encryptionAttributes" type="{http://www.verimatrix.com/schemas/IPTVtypes.xsd}EncryptionAttributes"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTVEncryptionAttributes", propOrder = {
    "applianceName",
    "inputURL",
    "outputURL",
    "copyControlAttributes",
    "osdAttributes",
    "encryptionAttributes"
})
public class DTVEncryptionAttributes {

    @XmlElement(required = true)
    protected String applianceName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String inputURL;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String outputURL;
    @XmlElement(required = true)
    protected CopyControlAttributes copyControlAttributes;
    @XmlElement(required = true)
    protected OSDAttributes osdAttributes;
    @XmlElement(required = true)
    protected EncryptionAttributes encryptionAttributes;

    /**
     * Gets the value of the applianceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplianceName() {
        return applianceName;
    }

    /**
     * Sets the value of the applianceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplianceName(String value) {
        this.applianceName = value;
    }

    /**
     * Gets the value of the inputURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputURL() {
        return inputURL;
    }

    /**
     * Sets the value of the inputURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputURL(String value) {
        this.inputURL = value;
    }

    /**
     * Gets the value of the outputURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputURL() {
        return outputURL;
    }

    /**
     * Sets the value of the outputURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputURL(String value) {
        this.outputURL = value;
    }

    /**
     * Gets the value of the copyControlAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link CopyControlAttributes }
     *     
     */
    public CopyControlAttributes getCopyControlAttributes() {
        return copyControlAttributes;
    }

    /**
     * Sets the value of the copyControlAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CopyControlAttributes }
     *     
     */
    public void setCopyControlAttributes(CopyControlAttributes value) {
        this.copyControlAttributes = value;
    }

    /**
     * Gets the value of the osdAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link OSDAttributes }
     *     
     */
    public OSDAttributes getOsdAttributes() {
        return osdAttributes;
    }

    /**
     * Sets the value of the osdAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link OSDAttributes }
     *     
     */
    public void setOsdAttributes(OSDAttributes value) {
        this.osdAttributes = value;
    }

    /**
     * Gets the value of the encryptionAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptionAttributes }
     *     
     */
    public EncryptionAttributes getEncryptionAttributes() {
        return encryptionAttributes;
    }

    /**
     * Sets the value of the encryptionAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptionAttributes }
     *     
     */
    public void setEncryptionAttributes(EncryptionAttributes value) {
        this.encryptionAttributes = value;
    }

}
