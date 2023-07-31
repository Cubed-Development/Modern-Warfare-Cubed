package com.paneedah.mwc.network.handlers;

import com.paneedah.mwc.network.messages.VehicleClientMessage;
import com.paneedah.weaponlib.vehicle.EntityVehicle;
import com.paneedah.weaponlib.vehicle.network.VehicleDataContainer;
import com.paneedah.weaponlib.vehicle.network.VehiclePacketLatencyTracker;
import io.redstudioragnarok.redcore.utils.NetworkUtil;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

public final class VehicleClientMessageHandler implements IMessageHandler<VehicleClientMessage, IMessage> {

    @Override
    @SideOnly(Side.CLIENT)
    public IMessage onMessage(final VehicleClientMessage vehicleClientMessage, final MessageContext messageContext) {
        NetworkUtil.processMessage(messageContext, () -> {
            final VehicleDataContainer vehicleData = vehicleClientMessage.getVehicleData();
            final EntityVehicle vehicle = (EntityVehicle) MC.player.world.getEntityByID(vehicleData.entityID);

            VehiclePacketLatencyTracker.push(vehicle);

            if (vehicle != null)
                vehicle.smoothShell.upload(vehicleData);
        });

        return null;
    }
}
