package com.paneedah.mwc.proxies;

import com.paneedah.mwc.*;
import com.paneedah.mwc.entities.Entities;
import com.paneedah.mwc.equipment.*;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.items.melee.BaseballBatFactory;
import com.paneedah.mwc.items.melee.BaseballBatNailsFactory;
import com.paneedah.mwc.items.melee.NightStickFactory;
import com.paneedah.mwc.items.melee.TacticalTomahawkFactory;
import com.paneedah.mwc.skins.GunSkins;
import com.paneedah.mwc.tileentities.TileEntities;
import com.paneedah.mwc.vehicle.Vehicles;
import com.paneedah.mwc.weapons.*;
import com.paneedah.weaponlib.UniversalSoundLookup;
import com.paneedah.weaponlib.animation.SpecialAttachments;
import com.paneedah.weaponlib.vehicle.network.VehicleDataSerializer;
import com.paneedah.weaponlib.vehicle.network.VehiclePhysSerializer;
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


    // I cannot figure out for the life of me why moving the init classes to the init() instead of the preInit() makes the game die, but I have no choice but to leave it here for now.
    public void preInit(final MWC mod) {
        MWC.modContext.preInit(mod);

        UniversalSoundRegistry.init();
        UniversalSoundLookup.initialize(MWC.modContext);

        // Forcing Item Initialization here, at the very least the variables, before they get registered normally on the init() (@SubscribeEvent) phase.
        MWCItems.init();

        // Idk? Deprecated too.
        DataSerializers.registerSerializer(VehicleDataSerializer.SERIALIZER);
        DataSerializers.registerSerializer(VehiclePhysSerializer.SERIALIZER);

        // Special object initialization
        SpecialAttachments.init(mod, MWC.modContext);
        Backpacks.init();
        Belts.init();
        Vests.init(mod);
        Armors.init(mod, MWC.modContext);
        Attachments.init(mod);
        AuxiliaryAttachments.init(mod);
        GunSkins.init(mod);
        Bullets.init(mod);
        Magazines.init(mod);
        Guns.init(mod, this);
        Electronics.init();
        Grenades.init(mod, this);
        CustomSpawnEggs.init(mod, this);
        TileEntities.init(this);

        new TacticalTomahawkFactory().createMelee(this);
        new BaseballBatFactory().createMelee(this);
        new BaseballBatNailsFactory().createMelee(this);
        new NightStickFactory().createMelee(this);

        MWC.modContext.preInitEnd(mod);
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
