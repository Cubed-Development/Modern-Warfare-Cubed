
package com.paneedah.weaponlib.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Gun complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Gun">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="damage" type="{http://www.w3.org/2001/XMLSchema}float" default="1.0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Gun")
public class Gun {

    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "enabled")
    protected Boolean enabled;
    @XmlAttribute(name = "damage")
    protected Float damage;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEnabled() {
        if (enabled == null) {
            return true;
        } else {
            return enabled;
        }
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the damage property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getDamage() {
        if (damage == null) {
            return  1.0F;
        } else {
            return damage;
        }
    }

    /**
     * Sets the value of the damage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDamage(Float value) {
        this.damage = value;
    }

}
