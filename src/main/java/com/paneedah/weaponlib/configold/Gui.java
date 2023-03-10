
package com.paneedah.weaponlib.configold;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Gui complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Gui">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="statusBarPosition" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="top-right"/>
 *             &lt;enumeration value="bottom-right"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Gui")
public class Gui {

    @XmlAttribute(name = "statusBarPosition", required = true)
    protected String statusBarPosition;

    /**
     * Gets the value of the statusBarPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusBarPosition() {
        return statusBarPosition;
    }

    /**
     * Sets the value of the statusBarPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusBarPosition(String value) {
        this.statusBarPosition = value;
    }

}
