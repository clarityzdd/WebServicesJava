
package com.ttdev.ss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="f01" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "f01"
})
@XmlRootElement(name = "invalidProductId")
public class InvalidProductId {

    @XmlElement(required = true)
    protected String f01;

    /**
     * Gets the value of the f01 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getF01() {
        return f01;
    }

    /**
     * Sets the value of the f01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setF01(String value) {
        this.f01 = value;
    }

}
