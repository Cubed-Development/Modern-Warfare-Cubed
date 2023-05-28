package com.paneedah.weaponlib.inventory;

import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.compatibility.CompatibleCustomPlayerInventoryCapability;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class EntityInventorySyncHandler implements IMessageHandler<EntityInventorySyncMessage, IMessage> {

    private ModContext modContext;

    public EntityInventorySyncHandler() {
    }

    public EntityInventorySyncHandler(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public IMessage onMessage(EntityInventorySyncMessage message, MessageContext messageContext) {
        if (messageContext.side == Side.SERVER)
            onServerMessage(message, messageContext);
        else if (messageContext.side == Side.CLIENT)
            onClientMessage(message, messageContext);

        return null;
    }

    public void onServerMessage(EntityInventorySyncMessage message, MessageContext messageContext) {
        messageContext.getServerHandler().player.getServer().addScheduledTask(() -> {
            EntityPlayer player = messageContext.getServerHandler().player;
            CustomPlayerInventory inventory = message.getInventory();
            inventory.setContext(modContext);
            inventory.setOwner((EntityPlayer) player);
            CompatibleCustomPlayerInventoryCapability.setInventory((EntityLivingBase) player, inventory);
            NetworkRegistry.TargetPoint point = new NetworkRegistry.TargetPoint(player.dimension, player.posX, player.posY, player.posZ, 1000);
            modContext.getChannel().sendToAllAround(new EntityInventorySyncMessage(player, inventory, true), point);
        });
    }

    @SideOnly(Side.CLIENT)
    public void onClientMessage(EntityInventorySyncMessage message, MessageContext messageContext) {
        mc.addScheduledTask(() -> {
            EntityPlayer player = mc.player;
            Entity targetEntity = message.getEntity(player.world);

            if(targetEntity != player || (targetEntity == player && !message.isExcludeEntity())) {
                CustomPlayerInventory inventory = message.getInventory();
                inventory.setContext(modContext);
                inventory.setOwner((EntityPlayer) targetEntity);
                CompatibleCustomPlayerInventoryCapability.setInventory((EntityLivingBase) targetEntity, inventory);
            }
        });
    }
}
