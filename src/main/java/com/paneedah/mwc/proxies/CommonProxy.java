package com.paneedah.mwc.proxies;

import com.paneedah.mwc.*;
import com.paneedah.mwc.entities.Entities;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.items.melee.BaseballBatFactory;
import com.paneedah.mwc.items.melee.BaseballBatNailsFactory;
import com.paneedah.mwc.items.melee.NightStickFactory;
import com.paneedah.mwc.items.melee.TacticalTomahawkFactory;
import com.paneedah.mwc.skins.GunSkins;
import com.paneedah.mwc.tileentities.TileEntities;
import com.paneedah.mwc.vehicle.Vehicles;
import com.paneedah.mwc.weapons.Attachments;
import com.paneedah.mwc.weapons.AuxiliaryAttachments;
import com.paneedah.mwc.weapons.Guns;
import com.paneedah.mwc.weapons.Magazines;
import com.paneedah.mwc.wearables.Armors;
import com.paneedah.mwc.wearables.Backpacks;
import com.paneedah.mwc.wearables.Bullets;
import com.paneedah.mwc.wearables.Vests;
import com.paneedah.weaponlib.UniversalSoundLookup;
import com.paneedah.weaponlib.animation.SpecialAttachments;
import com.paneedah.weaponlib.vehicle.network.VehicleDataSerializer;
import com.paneedah.weaponlib.vehicle.network.VehiclePhysSerializer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

    /*
    public static Item ElectronicCircuitBoard;
    public static Item OpticGlass;
    public static Item Cloth;
    public static Item TanCloth;
    public static Item GreenCloth;
    public static Item Inductor;
    public static Item Transistor;
    public static Item Resistor;
    public static Item Diode;
    public static Item Capacitor;
    public static Item CopperWiring;
    public static Item Piston;
    public static Item LaserPointer;
    public static Item AluminumPlate;
    public static Item SteelPlate;
    public static Item BigSteelPlate;
    public static Item MiniSteelPlate;
    public static Item MetalComponents;
    public static Item Plastic;
    public static Item Backpack;
    */

    public ModelBiped getArmorModel(int id) {
        return null;
    }

    protected boolean isClient() {
        return false;
    }


    // I cannot figure out for the life of me why moving the init classes to the init() instead of the preInit() makes the game die, but I have no choice but to leave it here for now.
    public void preInit(final MWC mod) {
        MWC.modContext.preInit(mod, MWC.CHANNEL);

        // Sounds
        MWC.modContext.setChangeZoomSound("OpticZoom");
        MWC.modContext.setNightVisionOnSound("nightvision_on");
        MWC.modContext.setNightVisionOffSound("nightvision_off");
        MWC.modContext.setChangeFireModeSound("firerate_toggle");
        MWC.modContext.setNoAmmoSound("dry_fire");
        MWC.modContext.setExplosionSound("grenadeexplosion");
        MWC.modContext.setFlashExplosionSound("flashbang");

        MWC.modContext.setMaterialImpactSounds(Material.ROCK, 1.5f, "bullet_3_rock", "bullet_2_rock", "bullet_4_rock", "bullet_12_stone");
        MWC.modContext.setMaterialImpactSounds(Material.WOOD, 1.5f, "bullet_3_rock", "bullet_2_rock", "bullet_4_rock", "bullet_12_stone", "bullet_10_snap");
        MWC.modContext.setMaterialImpactSounds(Material.GRASS, 1.5f, "bullet_5_grass", "bullet_9_grass", "bullet_11_grass", "bullet_10_snap", "bullet_13_snap");
        MWC.modContext.setMaterialImpactSounds(Material.GROUND, 1.5f, "bullet_5_grass", "bullet_9_grass", "bullet_11_grass", "bullet_10_snap", "bullet_13_snap");
        MWC.modContext.setMaterialImpactSounds(Material.SAND, 1.5f, "bullet_5_grass", "bullet_9_grass", "bullet_11_grass", "bullet_10_snap", "bullet_13_snap");
        MWC.modContext.setMaterialImpactSounds(Material.SNOW, 1.5f, "bullet_5_grass", "bullet_9_grass", "bullet_11_grass", "bullet_10_snap", "bullet_13_snap");
        MWC.modContext.setMaterialImpactSounds(Material.IRON, 1.5f, "bullet_6_iron", "bullet_7_iron", "bullet_8_iron");
        UniversalSoundRegistry.init();
        UniversalSoundLookup.initialize(MWC.modContext);

        // Forcing Item Initialization here, at the very least the variables, before they get registered normally on the init() (@SubscribeEvent) phase.
        MWCItems.init();

        // Idk? Deprecated too.
        DataSerializers.registerSerializer(VehicleDataSerializer.SERIALIZER);
        DataSerializers.registerSerializer(VehiclePhysSerializer.SERIALIZER);

        // Special object initialization
        SpecialAttachments.init(mod, MWC.modContext);
        Backpacks.init(mod);
        Vests.init(mod);
        Armors.init(mod, MWC.modContext);
        Attachments.init(mod);
        AuxiliaryAttachments.init(mod);
        GunSkins.init(mod);
        Bullets.init(mod);
        Magazines.init(mod);
        Guns.init(mod, this);
        Electronics.init(mod);
        Grenades.init(mod, this);
        CustomSpawnEggs.init(mod, this);
        TileEntities.init(this);

        new TacticalTomahawkFactory().createMelee(this);
        new BaseballBatFactory().createMelee(this);
        new BaseballBatNailsFactory().createMelee(this);
        new NightStickFactory().createMelee(this);

        MWC.modContext.preInitEnd(mod, MWC.modContext.getChannel());
    }

    public void init(final MWC mod) {
        MWC.modContext.init(mod);

        Entities.init(this);
        Vehicles.init(this);

        GameRegistry.registerWorldGenerator(new WorldGeneratorEventHandler(), 0);
    }

    public void postInit(final MWC mod, final FMLPostInitializationEvent initializationEvent) {
    }
}
