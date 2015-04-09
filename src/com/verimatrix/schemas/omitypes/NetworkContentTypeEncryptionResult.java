
package com.verimatrix.schemas.omitypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkContentTypeEncryptionResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkContentTypeEncryptionResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}Result"/>
 *         &lt;element name="networkContentTypeEncryptionStatus" type="{http://www.verimatrix.com/schemas/OMItypes.xsd}NetworkContentTypeEncryptionStatus" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkContentTypeEncryptionResult", propOrder = {
    "result",
    "networkContentTypeEncryptionStatus"
})
public class NetworkContentTypeEncryptionResult {

    @XmlElement(required = true)
    protected Result result;
    protected List<NetworkContentTypeEncryptionStatus> networkContentTypeEncryptionStatus;

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
     * Gets the value of the networkContentTypeEncryptionStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the networkContentTypeEncryptionStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetworkContentTypeEncryptionStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetworkContentTypeEncryptionStatus }
     * 
     * 
     */
    public List<NetworkContentTypeEncryptionStatus> getNetworkContentTypeEncryptionStatus() {
        if (networkContentTypeEncryptionStatus == null) {
            networkContentTypeEncryptionStatus = new ArrayList<NetworkContentTypeEncryptionStatus>();
        }
        return this.networkContentTypeEncryptionStatus;
    }

}
