
package com.paneedah.weaponlib.configold;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for AIEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AIEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="equipment" type="{http://moderwarfaremod.org/config}EntityEquipment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="health" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="spawn" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AIEntity", propOrder = {
    "equipment"
})
public class AIEntity {

    protected List<EntityEquipment> equipment;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "health")
    protected Float health;
    @XmlAttribute(name = "spawn")
    protected Float spawn;

    /**
     * Gets the value of the equipment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityEquipment }
     * 
     * 
     */
    public List<EntityEquipment> getEquipment() {
        if (equipment == null) {
            equipment = new ArrayList<EntityEquipment>();
        }
        return this.equipment;
    }

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
     * Gets the value of the health property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHealth() {
        return health;
    }

    /**
     * Sets the value of the health property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHealth(Float value) {
        this.health = value;
    }

    /**
     * Gets the value of the spawn property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSpawn() {
        return spawn;
    }

    /**
     * Sets the value of the spawn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSpawn(Float value) {
        this.spawn = value;
    }

}
