
package com.verimatrix.schemas.iptvtypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VODContentAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VODContentAttributes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tag1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tag2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tag3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VODContentAttributes", propOrder = {
    "name",
    "tag1",
    "tag2",
    "tag3"
})
public class VODContentAttributes {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String tag1;
    @XmlElement(required = true)
    protected String tag2;
    @XmlElement(required = true)
    protected String tag3;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the tag1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag1() {
        return tag1;
    }

    /**
     * Sets the value of the tag1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag1(String value) {
        this.tag1 = value;
    }

    /**
     * Gets the value of the tag2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag2() {
        return tag2;
    }

    /**
     * Sets the value of the tag2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag2(String value) {
        this.tag2 = value;
    }

    /**
     * Gets the value of the tag3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag3() {
        return tag3;
    }

    /**
     * Sets the value of the tag3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag3(String value) {
        this.tag3 = value;
    }

}
