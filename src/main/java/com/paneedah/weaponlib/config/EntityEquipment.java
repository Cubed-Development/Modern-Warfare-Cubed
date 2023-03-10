
package com.paneedah.weaponlib.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for EntityEquipment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityEquipment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attachment" type="{http://moderwarfaremod.org/config}Attachment" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="weight" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityEquipment", propOrder = {
    "attachment"
})
public class EntityEquipment {

    protected List<Attachment> attachment;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "weight")
    protected Float weight;

    /**
     * Gets the value of the attachment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attachment }
     * 
     * 
     */
    public List<Attachment> getAttachment() {
        if (attachment == null) {
            attachment = new ArrayList<Attachment>();
        }
        return this.attachment;
    }

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
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWeight(Float value) {
        this.weight = value;
    }

}
