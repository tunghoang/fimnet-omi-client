
package com.verimatrix.schemas.omitypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkContent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="smsNetworkId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="smsContentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="networkContentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="networkContentType" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}ContentType"/>
 *         &lt;element name="ratingLevel" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}RatingLevel" minOccurs="0"/>
 *         &lt;element name="fingerprintMessage" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}FingerprintMessage" minOccurs="0"/>
 *         &lt;element name="encryptionAttributes" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}NetworkContentEncryptionAttributes" minOccurs="0"/>
 *         &lt;element name="encryptionParameters" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}EncryptionParameters" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkContent", propOrder = {
    "smsNetworkId",
    "smsContentId",
    "networkContentId",
    "networkContentType",
    "ratingLevel",
    "fingerprintMessage",
    "encryptionAttributes",
    "encryptionParameters"
})
public class NetworkContent {

    @XmlElement(required = true)
    protected String smsNetworkId;
    @XmlElement(required = true)
    protected String smsContentId;
    protected String networkContentId;
    @XmlElement(required = true)
    protected ContentType networkContentType;
    protected Integer ratingLevel;
    protected FingerprintMessage fingerprintMessage;
    protected NetworkContentEncryptionAttributes encryptionAttributes;
    protected EncryptionParameters encryptionParameters;

    /**
     * Gets the value of the smsNetworkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsNetworkId() {
        return smsNetworkId;
    }

    /**
     * Sets the value of the smsNetworkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsNetworkId(String value) {
        this.smsNetworkId = value;
    }

    /**
     * Gets the value of the smsContentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsContentId() {
        return smsContentId;
    }

    /**
     * Sets the value of the smsContentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsContentId(String value) {
        this.smsContentId = value;
    }

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
     * Gets the value of the networkContentType property.
     * 
     * @return
     *     possible object is
     *     {@link ContentType }
     *     
     */
    public ContentType getNetworkContentType() {
        return networkContentType;
    }

    /**
     * Sets the value of the networkContentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentType }
     *     
     */
    public void setNetworkContentType(ContentType value) {
        this.networkContentType = value;
    }

    /**
     * Gets the value of the ratingLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRatingLevel() {
        return ratingLevel;
    }

    /**
     * Sets the value of the ratingLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRatingLevel(Integer value) {
        this.ratingLevel = value;
    }

    /**
     * Gets the value of the fingerprintMessage property.
     * 
     * @return
     *     possible object is
     *     {@link FingerprintMessage }
     *     
     */
    public FingerprintMessage getFingerprintMessage() {
        return fingerprintMessage;
    }

    /**
     * Sets the value of the fingerprintMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link FingerprintMessage }
     *     
     */
    public void setFingerprintMessage(FingerprintMessage value) {
        this.fingerprintMessage = value;
    }

    /**
     * Gets the value of the encryptionAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkContentEncryptionAttributes }
     *     
     */
    public NetworkContentEncryptionAttributes getEncryptionAttributes() {
        return encryptionAttributes;
    }

    /**
     * Sets the value of the encryptionAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkContentEncryptionAttributes }
     *     
     */
    public void setEncryptionAttributes(NetworkContentEncryptionAttributes value) {
        this.encryptionAttributes = value;
    }

    /**
     * Gets the value of the encryptionParameters property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptionParameters }
     *     
     */
    public EncryptionParameters getEncryptionParameters() {
        return encryptionParameters;
    }

    /**
     * Sets the value of the encryptionParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptionParameters }
     *     
     */
    public void setEncryptionParameters(EncryptionParameters value) {
        this.encryptionParameters = value;
    }

}
