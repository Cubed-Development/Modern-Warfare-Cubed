package com.paneedah.mwc.weaponlib.inventory;

import com.paneedah.mwc.weaponlib.ModContext;
import com.paneedah.mwc.weaponlib.compatibility.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;

import static com.paneedah.mwc.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class EntityInventorySyncHandler implements CompatibleMessageHandler<EntityInventorySyncMessage, CompatibleMessage>  {

    private ModContext modContext;

    public EntityInventorySyncHandler(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public <T extends CompatibleMessage> T onCompatibleMessage(EntityInventorySyncMessage message, CompatibleMessageContext ctx) {
        if(ctx.isServerSide()) {
            ctx.runInMainThread(() -> {
                EntityPlayer player = ctx.getPlayer();
                CustomPlayerInventory inventory = message.getInventory();
                inventory.setContext(modContext);
                inventory.setOwner((EntityPlayer) player);
                CompatibleCustomPlayerInventoryCapability.setInventory((EntityLivingBase) player, inventory);
                CompatibleTargetPoint point = new CompatibleTargetPoint(player.dimension, 
                        player.posX, player.posY, player.posZ, 1000);
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
