package com.paneedah.weaponlib;

import com.paneedah.weaponlib.compatibility.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

import static com.paneedah.mwc.proxies.ClientProxy.mc;
import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class EntityControlHandler implements CompatibleMessageHandler<EntityControlMessage, IMessage>  {

    private ModContext modContext;

    public EntityControlHandler() {
    }

    public EntityControlHandler(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public <T extends net.minecraftforge.fml.common.network.simpleimpl.IMessage> T onCompatibleMessage(EntityControlMessage message, MessageContext messageContext) {
        if(messageContext.side == Side.SERVER) {
            mc.addScheduledTask(() -> {
                EntityPlayer player = messageContext.getServerHandler().player;
                CompatibleExtraEntityFlags.setFlags(player, message.getFlags(), message.getValues());
                NetworkRegistry.TargetPoint point = new NetworkRegistry.TargetPoint(player.dimension, player.posX, player.posY, player.posZ, 200);
                int updatedFlags = CompatibleExtraEntityFlags.getFlags(player);
                if((updatedFlags & CompatibleExtraEntityFlags.PRONING) != 0) {
                    setSize(player, 0.6f, 0.6f); //player.width, player.width);
                } else {
                    setSize(player, 0.6f, 1.8f);
                }
                modContext.getChannel().sendToAllAround(new EntityControlMessage(player, updatedFlags), point);
            });
        } else {
            mc.addScheduledTask(() -> {
                EntityPlayer player = mc.player;
                Entity targetEntity = message.getEntity(player.world);
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

            AxisAlignedBB axisalignedbb = entityPlayer.getEntityBoundingBox();

            entityPlayer.setEntityBoundingBox(new AxisAlignedBB(axisalignedbb.minX, axisalignedbb.minY, axisalignedbb.minZ,
                    axisalignedbb.minX + entityPlayer.width, axisalignedbb.minY + entityPlayer.height, axisalignedbb.minZ + entityPlayer.width));


            if(height < 1.5) {
                entityPlayer.eyeHeight = 0.6f;
            } else {
                entityPlayer.eyeHeight = entityPlayer.getDefaultEyeHeight();
            }
        }
    }
}
