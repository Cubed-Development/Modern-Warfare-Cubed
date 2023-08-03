package com.paneedah.mwc.network.handlers;

import com.paneedah.mwc.network.messages.VehicleInteractMessage;
import com.paneedah.weaponlib.vehicle.EntityVehicle;
import io.redstudioragnarok.redcore.utils.NetworkUtil;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public final class VehicleInteractMessageHandler implements IMessageHandler<VehicleInteractMessage, IMessage> {

    @Override
    public IMessage onMessage(final VehicleInteractMessage vehicleInteractMessage, final MessageContext messageContext) {
        NetworkUtil.processMessage(messageContext, () -> {
            final EntityVehicle vehicle = (EntityVehicle) messageContext.getServerHandler().player.world.getEntityByID(vehicleInteractMessage.getVehicleID());
            final EntityPlayer player = (EntityPlayer) messageContext.getServerHandler().player.world.getEntityByID(vehicleInteractMessage.getPlayerID());

            if (vehicle == null || player == null)
                return;

            if (vehicleInteractMessage.isRight()) {
                if (vehicle.canFitPassenger(player))
                    player.startRiding(vehicle);
            } else
                vehicle.setDead();
        });

        return null;
    }
}
