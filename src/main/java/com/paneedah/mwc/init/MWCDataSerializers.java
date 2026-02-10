package com.paneedah.mwc.init;

import com.paneedah.weaponlib.vehicle.network.VehicleDataSerializer;
import com.paneedah.weaponlib.vehicle.network.VehiclePhysSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.DataSerializerEntry;

import static com.paneedah.mwc.ProjectConstants.ID;

@Mod.EventBusSubscriber(modid = ID)
public class MWCDataSerializers {

    @SubscribeEvent
    public static void registerSerializers(RegistryEvent.Register<DataSerializerEntry> event) {

        event.getRegistry().registerAll(
                new DataSerializerEntry(VehicleDataSerializer.SERIALIZER)
                        .setRegistryName("mwc", "vehicle_data"),

                new DataSerializerEntry(VehiclePhysSerializer.SERIALIZER)
                        .setRegistryName("mwc", "vehicle_phys")
        );
    }
}
