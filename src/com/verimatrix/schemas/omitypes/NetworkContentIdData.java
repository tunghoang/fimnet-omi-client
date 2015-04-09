
package com.verimatrix.schemas.omitypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkContentIdData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkContentIdData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="networkContent" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}NetworkContent"/>
 *         &lt;element name="attributes" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}NetworkContentEncryptionAttributes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkContentIdData", propOrder = {
    "networkContent",
    "attributes"
})
public class NetworkContentIdData {

    @XmlElement(required = true)
    protected NetworkContent networkContent;
    protected NetworkContentEncryptionAttributes attributes;

    /**
     * Gets the value of the networkContent property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkContent }
     *     
     */
    public NetworkContent getNetworkContent() {
        return networkContent;
    }

    /**
     * Sets the value of the networkContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkContent }
     *     
     */
    public void setNetworkContent(NetworkContent value) {
        this.networkContent = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkContentEncryptionAttributes }
     *     
     */
    public NetworkContentEncryptionAttributes getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkContentEncryptionAttributes }
     *     
     */
    public void setAttributes(NetworkContentEncryptionAttributes value) {
        this.attributes = value;
    }

}
