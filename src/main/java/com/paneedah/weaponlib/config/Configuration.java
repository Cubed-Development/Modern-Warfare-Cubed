
package com.paneedah.weaponlib.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Configuration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Configuration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ores" type="{http://moderwarfaremod.org/config}Ores" minOccurs="0"/>
 *         &lt;element name="explosions" type="{http://moderwarfaremod.org/config}Explosions" minOccurs="0"/>
 *         &lt;element name="projectiles" type="{http://moderwarfaremod.org/config}Projectiles" minOccurs="0"/>
 *         &lt;element name="gui" type="{http://moderwarfaremod.org/config}Gui" minOccurs="0"/>
 *         &lt;element name="ai" type="{http://moderwarfaremod.org/config}AI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Configuration", propOrder = {
    "ores",
    "explosions",
    "projectiles",
    "gui",
    "ai"
})
public class Configuration {

    protected Ores ores;
    protected Explosions explosions;
    protected Projectiles projectiles;
    protected Gui gui;
    protected AI ai;

    /**
     * Gets the value of the ores property.
     * 
     * @return
     *     possible object is
     *     {@link Ores }
     *     
     */
    public Ores getOres() {
        return ores;
    }

    /**
     * Sets the value of the ores property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ores }
     *     
     */
    public void setOres(Ores value) {
        this.ores = value;
    }

    /**
     * Gets the value of the explosions property.
     * 
     * @return
     *     possible object is
     *     {@link Explosions }
     *     
     */
    public Explosions getExplosions() {
        return explosions;
    }

    /**
     * Sets the value of the explosions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Explosions }
     *     
     */
    public void setExplosions(Explosions value) {
        this.explosions = value;
    }

    /**
     * Gets the value of the projectiles property.
     * 
     * @return
     *     possible object is
     *     {@link Projectiles }
     *     
     */
    public Projectiles getProjectiles() {
        return projectiles;
    }

    /**
     * Sets the value of the projectiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Projectiles }
     *     
     */
    public void setProjectiles(Projectiles value) {
        this.projectiles = value;
    }

    /**
     * Gets the value of the gui property.
     * 
     * @return
     *     possible object is
     *     {@link Gui }
     *     
     */
    public Gui getGui() {
        return gui;
    }

    /**
     * Sets the value of the gui property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gui }
     *     
     */
    public void setGui(Gui value) {
        this.gui = value;
    }

    /**
     * Gets the value of the ai property.
     * 
     * @return
     *     possible object is
     *     {@link AI }
     *     
     */
    public AI getAi() {
        return ai;
    }

    /**
     * Sets the value of the ai property.
     * 
     * @param value
     *     allowed object is
     *     {@link AI }
     *     
     */
    public void setAi(AI value) {
        this.ai = value;
    }

}
