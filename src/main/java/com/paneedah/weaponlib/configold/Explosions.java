
package com.paneedah.weaponlib.configold;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Explosions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Explosions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="damage" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="dropBlockChance" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Explosions")
public class Explosions {

    @XmlAttribute(name = "damage")
    protected Float damage;
    @XmlAttribute(name = "dropBlockChance")
    protected Float dropBlockChance;

    /**
     * Gets the value of the damage property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDamage() {
        return damage;
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

    /**
     * Gets the value of the dropBlockChance property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDropBlockChance() {
        return dropBlockChance;
    }

    /**
     * Sets the value of the dropBlockChance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDropBlockChance(Float value) {
        this.dropBlockChance = value;
    }

}
