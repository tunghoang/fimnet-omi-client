
package com.verimatrix.schemas.iptvtypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VODEncryptionAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VODEncryptionAttributes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tag1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tag2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tag3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fileSize" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fileType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="targetPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="copyControlAttributes" type="{http://www.verimatrix.com/schemas/IPTVtypes.xsd}CopyControlAttributes"/>
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
@XmlType(name = "VODEncryptionAttributes", propOrder = {
    "name",
    "tag1",
    "tag2",
    "tag3",
    "fileName",
    "fileSize",
    "fileType",
    "targetPath",
    "copyControlAttributes",
    "encryptionAttributes"
})
public class VODEncryptionAttributes {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String tag1;
    @XmlElement(required = true)
    protected String tag2;
    @XmlElement(required = true)
    protected String tag3;
    @XmlElement(required = true)
    protected String fileName;
    @XmlElement(required = true)
    protected String fileSize;
    @XmlElement(required = true)
    protected String fileType;
    @XmlElement(required = true)
    protected String targetPath;
    @XmlElement(required = true)
    protected CopyControlAttributes copyControlAttributes;
    @XmlElement(required = true)
    protected EncryptionAttributes encryptionAttributes;

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

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the fileSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileSize() {
        return fileSize;
    }

    /**
     * Sets the value of the fileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileSize(String value) {
        this.fileSize = value;
    }

    /**
     * Gets the value of the fileType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * Sets the value of the fileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileType(String value) {
        this.fileType = value;
    }

    /**
     * Gets the value of the targetPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetPath() {
        return targetPath;
    }

    /**
     * Sets the value of the targetPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetPath(String value) {
        this.targetPath = value;
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
