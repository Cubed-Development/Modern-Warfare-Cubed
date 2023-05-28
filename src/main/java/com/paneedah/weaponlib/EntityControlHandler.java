package com.paneedah.weaponlib;

import com.paneedah.weaponlib.compatibility.CompatibleExtraEntityFlags;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class EntityControlHandler implements IMessageHandler<EntityControlMessage, IMessage> {

    private ModContext modContext;

    public EntityControlHandler() {
    }

    public EntityControlHandler(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public IMessage onMessage(EntityControlMessage message, MessageContext messageContext) {
        if (messageContext.side == Side.SERVER)
            onServerMessage(message, messageContext);
        else if (messageContext.side == Side.CLIENT)
            onClientMessage(message, messageContext);

        return null;
    }

    public void onServerMessage(EntityControlMessage message, MessageContext messageContext) {
        messageContext.getServerHandler().player.getServer().addScheduledTask(() -> {
            EntityPlayer player = messageContext.getServerHandler().player;
            CompatibleExtraEntityFlags.setFlags(player, message.getFlags(), message.getValues());
            NetworkRegistry.TargetPoint point = new NetworkRegistry.TargetPoint(player.dimension, player.posX, player.posY, player.posZ, 200);
            int updatedFlags = CompatibleExtraEntityFlags.getFlags(player);
            if((updatedFlags & CompatibleExtraEntityFlags.PRONING) != 0)
                setSize(player, 0.6f, 0.6f); //player.width, player.width);
            else
                setSize(player, 0.6f, 1.8f);
            modContext.getChannel().sendToAllAround(new EntityControlMessage(player, updatedFlags), point);
        });
    }

    @SideOnly(Side.CLIENT)
    public void onClientMessage(EntityControlMessage message, MessageContext messageContext) {
        mc.addScheduledTask(() -> {
            EntityPlayer player = mc.player;
            Entity targetEntity = message.getEntity(player.world);
            CompatibleExtraEntityFlags.setFlags(targetEntity, message.getFlags(), message.getValues());

            int updatedFlags = CompatibleExtraEntityFlags.getFlags(player);
            if((updatedFlags & CompatibleExtraEntityFlags.PRONING) != 0)
                setSize(player, 0.6f, 0.6f); //player.width, player.width);
            else
                setSize(player, 0.6F, 1.8F);
        });
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
