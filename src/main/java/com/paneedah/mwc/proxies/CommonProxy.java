package com.paneedah.mwc.proxies;

import com.paneedah.mwc.*;
import com.paneedah.mwc.entities.Entities;
import com.paneedah.mwc.items.melee.BaseballBatFactory;
import com.paneedah.mwc.items.melee.BaseballBatNailsFactory;
import com.paneedah.mwc.items.melee.NightStickFactory;
import com.paneedah.mwc.items.melee.TacticalTomahawkFactory;
import com.paneedah.mwc.ores.Ores;
import com.paneedah.mwc.skins.GunSkins;
import com.paneedah.mwc.skins.MeleeSkins;
import com.paneedah.mwc.tileentities.TileEntities;
import com.paneedah.mwc.utils.ModReference;
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
import com.paneedah.weaponlib.compatibility.CompatibleChannel;
import com.paneedah.weaponlib.compatibility.CompatibleFmlInitializationEvent;
import com.paneedah.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.paneedah.weaponlib.compatibility.CompatibleMaterial;
import com.paneedah.weaponlib.configold.ConfigurationManager;
import com.paneedah.weaponlib.vehicle.network.VehicleDataSerializer;
import com.paneedah.weaponlib.vehicle.network.VehiclePhysSerializer;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

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

    public void preInit(final ModernWarfareMod mod, final ConfigurationManager configurationManager, final CompatibleFmlPreInitializationEvent initializationEvent) {
        ModernWarfareMod.MOD_CONTEXT.preInit(mod, ModReference.id, configurationManager, initializationEvent, new CompatibleChannel(ModernWarfareMod.CHANNEL));

        ModernWarfareMod.MOD_CONTEXT.setChangeZoomSound("OpticZoom");
        ModernWarfareMod.MOD_CONTEXT.setNightVisionOnSound("nightvision_on");
        ModernWarfareMod.MOD_CONTEXT.setNightVisionOffSound("nightvision_off");
        ModernWarfareMod.MOD_CONTEXT.setChangeFireModeSound("firerate_toggle");
        ModernWarfareMod.MOD_CONTEXT.setNoAmmoSound("dry_fire");
        ModernWarfareMod.MOD_CONTEXT.setExplosionSound("grenadeexplosion");
        ModernWarfareMod.MOD_CONTEXT.setFlashExplosionSound("flashbang");
        
        /*
        ModernWarfareMod.MOD_CONTEXT.setMaterialsImpactSound("bullet_1_rock", 1f, CompatibleMaterial.WOOD);
        
        ModernWarfareMod.MOD_CONTEXT.setMaterialImpactSound("bullet_2_rock", 1f, CompatibleMaterial.ROCK);
        
        ModernWarfareMod.MOD_CONTEXT.setMaterialsImpactSound("bullet_3_rock", 1f, CompatibleMaterial.ROCK, CompatibleMaterial.GROUND);
        
        ModernWarfareMod.MOD_CONTEXT.setMaterialImpactSound("bullet_4_rock", 1f, CompatibleMaterial.ROCK);
        
        ModernWarfareMod.MOD_CONTEXT.setMaterialImpactSound("bullet_5_grass", 1f, CompatibleMaterial.GRASS);
        */
        
        ModernWarfareMod.MOD_CONTEXT.setMaterialImpactSounds(CompatibleMaterial.ROCK, 1.5f, "bullet_3_rock", "bullet_2_rock", "bullet_4_rock", "bullet_12_stone");
        ModernWarfareMod.MOD_CONTEXT.setMaterialImpactSounds(CompatibleMaterial.WOOD, 1.5f, "bullet_3_rock", "bullet_2_rock", "bullet_4_rock", "bullet_12_stone", "bullet_10_snap");
        ModernWarfareMod.MOD_CONTEXT.setMaterialImpactSounds(CompatibleMaterial.GRASS, 1.5f, "bullet_5_grass", "bullet_9_grass", "bullet_11_grass", "bullet_10_snap", "bullet_13_snap");
        ModernWarfareMod.MOD_CONTEXT.setMaterialImpactSounds(CompatibleMaterial.GROUND, 1.5f, "bullet_5_grass", "bullet_9_grass", "bullet_11_grass", "bullet_10_snap", "bullet_13_snap");
        ModernWarfareMod.MOD_CONTEXT.setMaterialImpactSounds(CompatibleMaterial.SAND, 1.5f, "bullet_5_grass", "bullet_9_grass", "bullet_11_grass", "bullet_10_snap", "bullet_13_snap");
        ModernWarfareMod.MOD_CONTEXT.setMaterialImpactSounds(CompatibleMaterial.SNOW, 1.5f, "bullet_5_grass", "bullet_9_grass", "bullet_11_grass", "bullet_10_snap", "bullet_13_snap");
        ModernWarfareMod.MOD_CONTEXT.setMaterialImpactSounds(CompatibleMaterial.IRON, 1.5f, "bullet_6_iron", "bullet_7_iron", "bullet_8_iron");
        /*
        ModernWarfareMod.MOD_CONTEXT.setMaterialsImpactSound("sound-name", 1f, CompatibleMaterial.WATER, CompatibleMaterial.GROUND);
        
        ModernWarfareMod.MOD_CONTEXT.setNightVisionOnSound("OpticZoom");
        ModernWarfareMod.MOD_CONTEXT.setNightVisionOffSound("OpticZoom");
        
        Backpack = new ItemStorage.Builder().withName("Backpack").withSize(32).withTextureName("knapsack").withTab(CreativeTabs.tabMisc).withModel(new TabletModel()).withModelTextureName("IPad.png").withGuiTextureName("inventoryitem.png").withCustomEquippedPositioning((player, stack) -> { GL11.glScalef(0.3f, 1f, 1f); GL11.glTranslatef(0f, 0f, 0.3f); }).build(ModernWarfareMod.MOD_CONTEXT);

        compatibility.registerItem(ModReference.id, ElectronicCircuitBoard, "Electronics");
        compatibility.registerItem(ModReference.id, OpticGlass, "OpticGlass");
        compatibility.registerItem(ModReference.id, Cloth, "Cloth");
        compatibility.registerItem(ModReference.id, TanCloth, "TanCloth");
        compatibility.registerItem(ModReference.id, GreenCloth, "GreenCloth");
        compatibility.registerItem(ModReference.id, AluminumPlate, "AluminumPlate");
        compatibility.registerItem(ModReference.id, SteelPlate, "SteelPlate");
        compatibility.registerItem(ModReference.id, BigSteelPlate, "BigSteelPlate");
        compatibility.registerItem(ModReference.id, MiniSteelPlate, "MiniSteelPlate");
        compatibility.registerItem(ModReference.id, MetalComponents, "MetalComponents");
        compatibility.registerItem(ModReference.id, Transistor, "Transistor");
        compatibility.registerItem(ModReference.id, Resistor, "Resistor");
        compatibility.registerItem(ModReference.id, Inductor, "Inductor");
        compatibility.registerItem(ModReference.id, Diode, "Diode");
        compatibility.registerItem(ModReference.id, Capacitor, "Capacitor");
        compatibility.registerItem(ModReference.id, CopperWiring, "CopperWiring");
        compatibility.registerItem(ModReference.id, Piston, "Piston");
        compatibility.registerItem(ModReference.id, LaserPointer, "LaserPointer");
        compatibility.registerItem(ModReference.id, Plastic, "plastic");
        */
        
        UniversalSoundRegistry.init();
        UniversalSoundLookup.initialize(ModernWarfareMod.MOD_CONTEXT);
        
        DataSerializers.registerSerializer(VehicleDataSerializer.SERIALIZER);
        DataSerializers.registerSerializer(VehiclePhysSerializer.SERIALIZER);

        SpecialAttachments.init(mod, configurationManager, initializationEvent, ModernWarfareMod.MOD_CONTEXT);
        
        Backpacks.preInit(mod, configurationManager, initializationEvent);
        Vests.preInit(mod, configurationManager, initializationEvent);
        Ores.init();
        Armors.init(mod, configurationManager, initializationEvent, ModernWarfareMod.MOD_CONTEXT);
        Attachments.init(mod, configurationManager, initializationEvent);
        AuxiliaryAttachments.init(mod, configurationManager, initializationEvent);
        GunSkins.init(mod, configurationManager, initializationEvent);
        MeleeSkins.init(mod, configurationManager, initializationEvent);
        Bullets.init(mod, configurationManager, initializationEvent);
        Magazines.init(mod, configurationManager, initializationEvent);
        Guns.init(mod, configurationManager, initializationEvent, this);
        com.paneedah.mwc.Electronics.init(mod, configurationManager, initializationEvent);
        Grenades.init(mod, configurationManager, initializationEvent, this);
        CustomSpawnEggs.init(mod, configurationManager, initializationEvent, this);
        TileEntities.init(this);
        
        new TacticalTomahawkFactory().createMelee(this);
        new BaseballBatFactory().createMelee(this);
        new BaseballBatNailsFactory().createMelee(this);
        new NightStickFactory().createMelee(this);
        
        ModernWarfareMod.MOD_CONTEXT.preInitEnd(mod, ModReference.id, configurationManager, initializationEvent, ModernWarfareMod.MOD_CONTEXT.getChannel());
    }

    public void init(final ModernWarfareMod mod, final ConfigurationManager configurationManager, final CompatibleFmlInitializationEvent initializationEvent) {
        ModernWarfareMod.MOD_CONTEXT.init(mod, ModReference.id);

        Entities.init(this);
        Vehicles.init(this);
        
        compatibility.registerWorldGenerator(new WorldGeneratorEventHandler(configurationManager), 0);
    }

    public void postInit(final ModernWarfareMod mod, final ConfigurationManager configurationManager, final FMLPostInitializationEvent initializationEvent) {
    }
}
