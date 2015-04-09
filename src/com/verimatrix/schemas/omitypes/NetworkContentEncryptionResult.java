
package com.verimatrix.schemas.omitypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkContentEncryptionResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkContentEncryptionResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}Result"/>
 *         &lt;element name="networkContentEncryptionStatus" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}NetworkContentEncryptionStatus" minOccurs="0"/>
 *         &lt;element name="encryptionStatus" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}EncryptionStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkContentEncryptionResult", propOrder = {
    "result",
    "networkContentEncryptionStatus",
    "encryptionStatus"
})
public class NetworkContentEncryptionResult {

    @XmlElement(required = true)
    protected Result result;
    protected NetworkContentEncryptionStatus networkContentEncryptionStatus;
    protected EncryptionStatus encryptionStatus;

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
     * Gets the value of the networkContentEncryptionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkContentEncryptionStatus }
     *     
     */
    public NetworkContentEncryptionStatus getNetworkContentEncryptionStatus() {
        return networkContentEncryptionStatus;
    }

    /**
     * Sets the value of the networkContentEncryptionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkContentEncryptionStatus }
     *     
     */
    public void setNetworkContentEncryptionStatus(NetworkContentEncryptionStatus value) {
        this.networkContentEncryptionStatus = value;
    }

    /**
     * Gets the value of the encryptionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptionStatus }
     *     
     */
    public EncryptionStatus getEncryptionStatus() {
        return encryptionStatus;
    }

    /**
     * Sets the value of the encryptionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptionStatus }
     *     
     */
    public void setEncryptionStatus(EncryptionStatus value) {
        this.encryptionStatus = value;
    }

}
