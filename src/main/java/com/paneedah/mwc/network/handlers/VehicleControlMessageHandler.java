package com.paneedah.mwc.network.handlers;

import com.paneedah.mwc.network.messages.VehicleClientMessage;
import com.paneedah.mwc.network.messages.VehicleControlMessage;
import com.paneedah.weaponlib.vehicle.EntityVehicle;
import com.paneedah.weaponlib.vehicle.network.VehicleDataContainer;
import io.redstudioragnarok.redcore.utils.NetworkUtil;
import lombok.NoArgsConstructor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

import static com.paneedah.mwc.MWC.CHANNEL;

@NoArgsConstructor
public final class VehicleControlMessageHandler implements IMessageHandler<VehicleControlMessage, IMessage> {

    @Override
    public IMessage onMessage(VehicleControlMessage vehicleControlMessage, MessageContext messageContext) {
        NetworkUtil.processMessage(messageContext, () -> {
            final VehicleDataContainer vehicleDataContainer = vehicleControlMessage.getSerializer();
            final EntityVehicle vehicle = (EntityVehicle) messageContext.getServerHandler().player.world.getEntityByID(vehicleDataContainer.entityID);

            vehicleDataContainer.vehicle = vehicle;

            if (vehicle == null) {
                return;
            }

            for (EntityPlayer currentPlayer : messageContext.getServerHandler().player.world.playerEntities)
                if (!(vehicle.getPassengers().isEmpty() || vehicle.getPassengers().get(0) == currentPlayer)) // Check if the current player is a passenger of the vehicle
                {
                    CHANNEL.sendTo(new VehicleClientMessage(vehicleDataContainer), (EntityPlayerMP) currentPlayer);
                }
        });

        return null;
    }

}
