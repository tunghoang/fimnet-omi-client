
package com.verimatrix.schemas.omitypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.verimatrix.schemas.iptvtypes.DTVEncryptionAttributes;
import com.verimatrix.schemas.iptvtypes.VODEncryptionAttributes;


/**
 * <p>Java class for NetworkContentEncryptionAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkContentEncryptionAttributes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="vodEncryptionAttributes" type="{http://www.verimatrix.com/schemas/IPTVtypes.xsd}VODEncryptionAttributes"/>
 *         &lt;element name="dtvEncryptionAttributes" type="{http://www.verimatrix.com/schemas/IPTVtypes.xsd}DTVEncryptionAttributes"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkContentEncryptionAttributes", propOrder = {
    "vodEncryptionAttributes",
    "dtvEncryptionAttributes"
})
public class NetworkContentEncryptionAttributes {

    protected VODEncryptionAttributes vodEncryptionAttributes;
    protected DTVEncryptionAttributes dtvEncryptionAttributes;

    /**
     * Gets the value of the vodEncryptionAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link VODEncryptionAttributes }
     *     
     */
    public VODEncryptionAttributes getVodEncryptionAttributes() {
        return vodEncryptionAttributes;
    }

    /**
     * Sets the value of the vodEncryptionAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link VODEncryptionAttributes }
     *     
     */
    public void setVodEncryptionAttributes(VODEncryptionAttributes value) {
        this.vodEncryptionAttributes = value;
    }

    /**
     * Gets the value of the dtvEncryptionAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link DTVEncryptionAttributes }
     *     
     */
    public DTVEncryptionAttributes getDtvEncryptionAttributes() {
        return dtvEncryptionAttributes;
    }

    /**
     * Sets the value of the dtvEncryptionAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTVEncryptionAttributes }
     *     
     */
    public void setDtvEncryptionAttributes(DTVEncryptionAttributes value) {
        this.dtvEncryptionAttributes = value;
    }

}
