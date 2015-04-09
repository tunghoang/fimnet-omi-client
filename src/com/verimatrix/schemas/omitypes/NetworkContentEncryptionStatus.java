
package com.verimatrix.schemas.omitypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.verimatrix.schemas.iptvtypes.VODEncryptionStatus;


/**
 * <p>Java class for NetworkContentEncryptionStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkContentEncryptionStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="encryptionStatus" type="{http://www.verimatrix.com/schemas/IPTVtypes.xsd}VODEncryptionStatus"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkContentEncryptionStatus", propOrder = {
    "encryptionStatus"
})
public class NetworkContentEncryptionStatus {

    protected VODEncryptionStatus encryptionStatus;

    /**
     * Gets the value of the encryptionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link VODEncryptionStatus }
     *     
     */
    public VODEncryptionStatus getEncryptionStatus() {
        return encryptionStatus;
    }

    /**
     * Sets the value of the encryptionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link VODEncryptionStatus }
     *     
     */
    public void setEncryptionStatus(VODEncryptionStatus value) {
        this.encryptionStatus = value;
    }

}
