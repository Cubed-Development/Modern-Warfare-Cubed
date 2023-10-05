package com.paneedah.mwc.network.handlers;

import com.paneedah.mwc.capabilities.EquipmentCapability;
import com.paneedah.mwc.equipment.inventory.EquipmentInventory;
import com.paneedah.mwc.network.messages.EntityInventorySyncMessage;
import com.paneedah.weaponlib.ModContext;
import dev.redstudio.redcore.utils.NetworkUtil;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

import static com.paneedah.mwc.MWC.CHANNEL;

@NoArgsConstructor
@AllArgsConstructor
public final class EntityInventorySyncMessageServerHandler implements IMessageHandler<EntityInventorySyncMessage, IMessage> {

    private ModContext modContext;

    @Override
    public IMessage onMessage(EntityInventorySyncMessage entityInventorySyncMessage, MessageContext messageContext) {
        NetworkUtil.processMessage(messageContext, () -> {
            final EntityPlayer player = messageContext.getServerHandler().player;
            final EquipmentInventory inventory = entityInventorySyncMessage.getInventory();

            inventory.setContext(modContext);
            inventory.setOwner(player);
            EquipmentCapability.setInventory(player, inventory);

            final NetworkRegistry.TargetPoint point = new NetworkRegistry.TargetPoint(player.dimension, player.posX, player.posY, player.posZ, 1000);
            CHANNEL.sendToAllAround(new EntityInventorySyncMessage(player, true, inventory), point);
        });

        return null;
    }
}
