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
import com.paneedah.mwc.tileentities.TurretBaseFactory;
import com.paneedah.mwc.vehicle.Vehicles;
import com.paneedah.mwc.weapons.*;
import com.paneedah.weaponlib.UniversalSoundLookup;
import com.paneedah.weaponlib.SpecialAttachments;
import com.paneedah.weaponlib.vehicle.network.VehicleDataSerializer;
import com.paneedah.weaponlib.vehicle.network.VehiclePhysSerializer;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

    public void preInit(final MWC mod) {
        MWC.modContext.preInit(mod);

        UniversalSoundRegistry.init();
        UniversalSoundLookup.initialize(MWC.modContext);

        // Forcing Item Initialization here, at the very least the variables, before they get registered normally on the init() (@SubscribeEvent) phase.
        MWCItems.init();

        // Idk? Deprecated too.
        DataSerializers.registerSerializer(VehicleDataSerializer.SERIALIZER);
        DataSerializers.registerSerializer(VehiclePhysSerializer.SERIALIZER);

        // Special object initialization (Magic Mag)
        SpecialAttachments.init(MWC.modContext);

        Backpacks.createEquipment(MWC.modContext);
        Belts.createEquipment(MWC.modContext);
        Vests.createEquipment(MWC.modContext);
        Armors.createEquipment(MWC.modContext);

        Attachments.init(MWC.modContext);
        AuxiliaryAttachments.init(MWC.modContext);
        GunSkins.init(MWC.modContext);
        Bullets.init(MWC.modContext);
        Magazines.init(MWC.modContext);
        Guns.init(this);
        Electronics.createEquipment(MWC.modContext);
        Grenades.init(this);
        CustomSpawnEggs.init(this);
        TileEntities.init();

        new TacticalTomahawkFactory().createMelee(this);
        new BaseballBatFactory().createMelee(this);
        new BaseballBatNailsFactory().createMelee(this);
        new NightStickFactory().createMelee(this);

        MWC.modContext.preInitEnd(mod);
    }

    public void init(final MWC mod) {
        MWC.modContext.init(mod);

        Entities.init(MWC.modContext);
        Vehicles.init(MWC.modContext);

        GameRegistry.registerWorldGenerator(new ModernWorldGenerator(), 0);
    }

    public void postInit(final MWC mod, final FMLPostInitializationEvent initializationEvent) {
    }
}
