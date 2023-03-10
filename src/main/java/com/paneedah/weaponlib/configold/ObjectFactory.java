
package com.paneedah.weaponlib.configold;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.paneedah.weaponlib.config package. 
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

    private final static QName _Configuration_QNAME = new QName("http://moderwarfaremod.org/config", "configuration");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.paneedah.weaponlib.config
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Configuration }
     * 
     */
    public Configuration createConfiguration() {
        return new Configuration();
    }

    /**
     * Create an instance of {@link Gun }
     * 
     */
    public Gun createGun() {
        return new Gun();
    }

    /**
     * Create an instance of {@link Ore }
     * 
     */
    public Ore createOre() {
        return new Ore();
    }

    /**
     * Create an instance of {@link Ores }
     * 
     */
    public Ores createOres() {
        return new Ores();
    }

    /**
     * Create an instance of {@link Projectiles }
     * 
     */
    public Projectiles createProjectiles() {
        return new Projectiles();
    }

    /**
     * Create an instance of {@link EntityEquipment }
     * 
     */
    public EntityEquipment createEntityEquipment() {
        return new EntityEquipment();
    }

    /**
     * Create an instance of {@link AI }
     * 
     */
    public AI createAI() {
        return new AI();
    }

    /**
     * Create an instance of {@link Explosions }
     * 
     */
    public Explosions createExplosions() {
        return new Explosions();
    }

    /**
     * Create an instance of {@link Gui }
     * 
     */
    public Gui createGui() {
        return new Gui();
    }

    /**
     * Create an instance of {@link Attachment }
     * 
     */
    public Attachment createAttachment() {
        return new Attachment();
    }

    /**
     * Create an instance of {@link AIEntity }
     * 
     */
    public AIEntity createAIEntity() {
        return new AIEntity();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Configuration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://moderwarfaremod.org/config", name = "configuration")
    public JAXBElement<Configuration> createConfiguration(Configuration value) {
        return new JAXBElement<Configuration>(_Configuration_QNAME, Configuration.class, null, value);
    }

}
