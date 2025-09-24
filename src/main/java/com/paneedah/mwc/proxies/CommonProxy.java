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

    public void preInit() {
        MWC.modContext.preInit();

        UniversalSoundRegistry.init();
        UniversalSoundLookup.initialize();

        // Idk? Deprecated too.
        DataSerializers.registerSerializer(VehicleDataSerializer.SERIALIZER);
        DataSerializers.registerSerializer(VehiclePhysSerializer.SERIALIZER);

        // Special object initialization (Magic Mag)
        SpecialAttachments.init();

        Backpacks.createEquipment();
        Belts.createEquipment();
        Vests.createEquipment();
        Armors.createEquipment();

        Attachments.init();
        AuxiliaryAttachments.init();
        GunSkins.init();
        Bullets.init();
        Magazines.init();
        Guns.init(this);
        Electronics.createEquipment();
        Grenades.init(this);
        CustomSpawnEggs.init(this);

        new TacticalTomahawkFactory().createMelee(this);
        new BaseballBatFactory().createMelee(this);
        new BaseballBatNailsFactory().createMelee(this);
        new NightStickFactory().createMelee(this);

        MWC.modContext.registerTileEntities();
    }

    public void init() {
        MWC.modContext.init();

        TurretBaseFactory.createTileEntity();
        TileEntities.createTileEntity();

        Entities.init();
        Vehicles.init();

        GameRegistry.registerWorldGenerator(new ModernWorldGenerator(), 0);
    }

    public void postInit(final MWC mod, final FMLPostInitializationEvent initializationEvent) {
    }
}
