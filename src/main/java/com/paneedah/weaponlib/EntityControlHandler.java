package com.paneedah.weaponlib;

import com.paneedah.weaponlib.compatibility.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class EntityControlHandler implements CompatibleMessageHandler<EntityControlMessage, CompatibleMessage>  {

    private ModContext modContext;

    public EntityControlHandler() {
    }

    public EntityControlHandler(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public <T extends CompatibleMessage> T onCompatibleMessage(EntityControlMessage message, CompatibleMessageContext ctx) {
        if(ctx.isServerSide()) {
            ctx.runInMainThread(() -> {
                EntityPlayer player = ctx.getPlayer();
                CompatibleExtraEntityFlags.setFlags(player, message.getFlags(), message.getValues());
                CompatibleTargetPoint point = new CompatibleTargetPoint(player.dimension, 
                        player.posX, player.posY, player.posZ, 200);
                int updatedFlags = CompatibleExtraEntityFlags.getFlags(player);
                if((updatedFlags & CompatibleExtraEntityFlags.PRONING) != 0) {
                    setSize(player, 0.6f, 0.6f); //player.width, player.width);
                } else {
                    setSize(player, 0.6f, 1.8f);
                }
                modContext.getChannel().sendToAllAround(new EntityControlMessage(player, updatedFlags), point);
            });
        } else {
            compatibility.runInMainClientThread(() -> {
                EntityPlayer player = compatibility.clientPlayer();
                Entity targetEntity = message.getEntity(compatibility.world(player));
                CompatibleExtraEntityFlags.setFlags(targetEntity, message.getFlags(), message.getValues());
                
                int updatedFlags = CompatibleExtraEntityFlags.getFlags(player);
                if((updatedFlags & CompatibleExtraEntityFlags.PRONING) != 0) {
                    setSize(player, 0.6f, 0.6f); //player.width, player.width);
                } else {
                    setSize(player, 0.6F, 1.8F);
                }
                
            });
        }
        return null;
    }
    
    protected void setSize(EntityPlayer entityPlayer, float width, float height) {
        if (width != entityPlayer.width || height != entityPlayer.height) {

            entityPlayer.width = width;
            entityPlayer.height = height;
            
            compatibility.resizeEntityBoundingBox(entityPlayer, entityPlayer.width, entityPlayer.height, entityPlayer.width);

            if(height < 1.5) {
                entityPlayer.eyeHeight = 0.6f;
            } else {
                entityPlayer.eyeHeight = entityPlayer.getDefaultEyeHeight();
            }
        }
    }
}
