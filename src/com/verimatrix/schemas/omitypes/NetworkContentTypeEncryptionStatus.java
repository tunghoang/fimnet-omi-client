
package com.verimatrix.schemas.omitypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkContentTypeEncryptionStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkContentTypeEncryptionStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="networkContentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="networkContentEncryptionStatus" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}NetworkContentEncryptionStatus"/>
 *         &lt;element name="encryptionStatus" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}EncryptionStatus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkContentTypeEncryptionStatus", propOrder = {
    "networkContentId",
    "networkContentEncryptionStatus",
    "encryptionStatus"
})
public class NetworkContentTypeEncryptionStatus {

    @XmlElement(required = true)
    protected String networkContentId;
    @XmlElement(required = true)
    protected NetworkContentEncryptionStatus networkContentEncryptionStatus;
    @XmlElement(required = true)
    protected EncryptionStatus encryptionStatus;

    /**
     * Gets the value of the networkContentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkContentId() {
        return networkContentId;
    }

    /**
     * Sets the value of the networkContentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkContentId(String value) {
        this.networkContentId = value;
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
