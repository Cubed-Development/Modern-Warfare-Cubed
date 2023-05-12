package com.paneedah.weaponlib.inventory;

import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.compatibility.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class EntityInventorySyncHandler implements CompatibleMessageHandler<EntityInventorySyncMessage, IMessage>  {

    private ModContext modContext;

    public EntityInventorySyncHandler(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public <T extends IMessage> T onCompatibleMessage(EntityInventorySyncMessage message, MessageContext messageContext) {
        if(messageContext.side == Side.SERVER) {
            compatibility.runInMainClientThread(() -> {
                EntityPlayer player = messageContext.getServerHandler().player;
                CustomPlayerInventory inventory = message.getInventory();
                inventory.setContext(modContext);
                inventory.setOwner((EntityPlayer) player);
                CompatibleCustomPlayerInventoryCapability.setInventory((EntityLivingBase) player, inventory);
                NetworkRegistry.TargetPoint point = new NetworkRegistry.TargetPoint(player.dimension, player.posX, player.posY, player.posZ, 1000);
                modContext.getChannel().sendToAllAround(new EntityInventorySyncMessage(player, inventory, true), point);
                
            });
        } else {
            compatibility.runInMainClientThread(() -> {
                EntityPlayer player = compatibility.clientPlayer();
                Entity targetEntity = message.getEntity(compatibility.world(player));

                if(targetEntity != player || (targetEntity == player && !message.isExcludeEntity())) {
                    CustomPlayerInventory inventory = message.getInventory();
                    inventory.setContext(modContext);
                    inventory.setOwner((EntityPlayer) targetEntity);
                    CompatibleCustomPlayerInventoryCapability.setInventory((EntityLivingBase) targetEntity, inventory);
                }
            });
        }
        return null;
    }
}
