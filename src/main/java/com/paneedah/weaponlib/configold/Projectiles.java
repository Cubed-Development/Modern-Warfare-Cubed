
package com.paneedah.weaponlib.configold;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for Projectiles complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Projectiles">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gun" type="{http://moderwarfaremod.org/config}Gun" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="bleedingOnHit" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="destroyGlassBlocks" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="knockbackOnHit" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="muzzleEffects" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="blurOnAim" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "projectiles", propOrder = {"gun"})
public class Projectiles {

    protected List<Gun> gun;

    /**
     * Gets the value of the gun property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gun property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGun().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Gun }
     * 
     * 
     */
    public List<Gun> getGun() {
        if (gun == null) {
            gun = new ArrayList<Gun>();
        }
        return this.gun;
    }
}
