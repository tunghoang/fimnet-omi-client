
package com.verimatrix.schemas.iptvtypes;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.verimatrix.schemas.iptvtypes package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.verimatrix.schemas.iptvtypes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VODContentAttributes }
     * 
     */
    public VODContentAttributes createVODContentAttributes() {
        return new VODContentAttributes();
    }

    /**
     * Create an instance of {@link DeviceAttributes }
     * 
     */
    public DeviceAttributes createDeviceAttributes() {
        return new DeviceAttributes();
    }

    /**
     * Create an instance of {@link OSDAttributes }
     * 
     */
    public OSDAttributes createOSDAttributes() {
        return new OSDAttributes();
    }

    /**
     * Create an instance of {@link CopyControlAttributes }
     * 
     */
    public CopyControlAttributes createCopyControlAttributes() {
        return new CopyControlAttributes();
    }

    /**
     * Create an instance of {@link DTVEncryptionAttributes }
     * 
     */
    public DTVEncryptionAttributes createDTVEncryptionAttributes() {
        return new DTVEncryptionAttributes();
    }

    /**
     * Create an instance of {@link VODEncryptionAttributes }
     * 
     */
    public VODEncryptionAttributes createVODEncryptionAttributes() {
        return new VODEncryptionAttributes();
    }

    /**
     * Create an instance of {@link DTVContentAttributes }
     * 
     */
    public DTVContentAttributes createDTVContentAttributes() {
        return new DTVContentAttributes();
    }

    /**
     * Create an instance of {@link EncryptionAttributes }
     * 
     */
    public EncryptionAttributes createEncryptionAttributes() {
        return new EncryptionAttributes();
    }

    /**
     * Create an instance of {@link VODEncryptionStatus }
     * 
     */
    public VODEncryptionStatus createVODEncryptionStatus() {
        return new VODEncryptionStatus();
    }

}
