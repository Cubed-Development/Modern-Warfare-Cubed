package com.paneedah.mwc.network.handlers;

import com.paneedah.mwc.network.messages.VehicleInteractPacket;
import com.paneedah.weaponlib.vehicle.EntityVehicle;
import io.redstudioragnarok.redcore.utils.NetworkUtil;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public final class VehicleInteractPHandler implements IMessageHandler<VehicleInteractPacket, IMessage> {

    @Override
    public IMessage onMessage(final VehicleInteractPacket vehicleInteractPacket, final MessageContext messageContext) {
        NetworkUtil.processMessage(messageContext, () -> {
            final EntityVehicle vehicle = (EntityVehicle) messageContext.getServerHandler().player.world.getEntityByID(vehicleInteractPacket.getVehicleID());
            final EntityPlayer player = (EntityPlayer) messageContext.getServerHandler().player.world.getEntityByID(vehicleInteractPacket.getPlayerID());

            if (vehicle == null || player == null)
                return;

            if (vehicleInteractPacket.isRight()) {
                if (vehicle.canFitPassenger(player))
                    player.startRiding(vehicle);
            } else
                vehicle.setDead();
        });

        return null;
    }
}
