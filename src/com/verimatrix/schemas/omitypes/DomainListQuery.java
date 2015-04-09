
package com.verimatrix.schemas.omitypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DomainListQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DomainListQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="smsDomainId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="domainCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DomainListQuery", propOrder = {
    "smsDomainId",
    "domainCount"
})
public class DomainListQuery {

    @XmlElement(required = true)
    protected String smsDomainId;
    protected int domainCount;

    /**
     * Gets the value of the smsDomainId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsDomainId() {
        return smsDomainId;
    }

    /**
     * Sets the value of the smsDomainId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsDomainId(String value) {
        this.smsDomainId = value;
    }

    /**
     * Gets the value of the domainCount property.
     * 
     */
    public int getDomainCount() {
        return domainCount;
    }

    /**
     * Sets the value of the domainCount property.
     * 
     */
    public void setDomainCount(int value) {
        this.domainCount = value;
    }

}
