
package com.paneedah.weaponlib.config;

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
    @XmlAttribute(name = "bleedingOnHit")
    protected Float bleedingOnHit;
    @XmlAttribute(name = "destroyGlassBlocks")
    protected Boolean destroyGlassBlocks;
    @XmlAttribute(name = "knockbackOnHit")
    protected Boolean knockbackOnHit;
    @XmlAttribute(name = "muzzleEffects")
    protected Boolean muzzleEffects;
    @XmlAttribute(name = "blurOnAim")
    protected Boolean blurOnAim;
    @XmlAttribute(name = "renderOptimization")
    protected Float renderOptimization;

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

    /**
     * Gets the value of the bleedingOnHit property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBleedingOnHit() {
        return bleedingOnHit;
    }

    /**
     * Sets the value of the bleedingOnHit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBleedingOnHit(Float value) {
        this.bleedingOnHit = value;
    }

    /**
     * Gets the value of the destroyGlassBlocks property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDestroyGlassBlocks() {
        return destroyGlassBlocks;
    }

    /**
     * Sets the value of the destroyGlassBlocks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDestroyGlassBlocks(Boolean value) {
        this.destroyGlassBlocks = value;
    }

    /**
     * Gets the value of the knockbackOnHit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKnockbackOnHit() {
        return knockbackOnHit;
    }

    /**
     * Sets the value of the knockbackOnHit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKnockbackOnHit(Boolean value) {
        this.knockbackOnHit = value;
    }

    /**
     * Gets the value of the muzzleEffects property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMuzzleEffects() {
        return muzzleEffects;
    }

    /**
     * Sets the value of the muzzleEffects property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMuzzleEffects(Boolean value) {
        this.muzzleEffects = value;
    }

    /**
     * Gets the value of the blurOnAim property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBlurOnAim() {
        return blurOnAim;
    }

    /**
     * Sets the value of the blurOnAim property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBlurOnAim(Boolean value) {
        this.blurOnAim = value;
    }

    public Float getRenderOptimization() {
        return renderOptimization;
    }

    public void setRenderOptimization(Float renderOptimization) {
        this.renderOptimization = renderOptimization;
    }
}
