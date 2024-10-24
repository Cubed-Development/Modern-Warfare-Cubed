package com.paneedah.mwc.network.handlers;

import com.paneedah.mwc.network.messages.EntityPickupMessage;
import com.paneedah.weaponlib.HighIQSpawnEgg;
import com.paneedah.weaponlib.SecondaryEntityRegistry;
import com.paneedah.weaponlib.ai.EntityCustomMob;
import io.redstudioragnarok.redcore.utils.NetworkUtil;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public final class EntityPickupMessageHandler implements IMessageHandler<EntityPickupMessage, IMessage> {

    @Override
    public IMessage onMessage(final EntityPickupMessage entityPickupMessage, final MessageContext messageContext) {
        NetworkUtil.processMessage(messageContext, () -> {
            // Get the player we should send to
            final EntityPlayerMP targetPlayer = (EntityPlayerMP) messageContext.getServerHandler().player.getEntityWorld().getEntityByID(entityPickupMessage.getPlayerID());
            final Entity targetEntity = messageContext.getServerHandler().player.world.getEntityByID(entityPickupMessage.getEntityID());

            if (targetPlayer == null || !(targetEntity instanceof EntityCustomMob)) {
                return;
            }

            final HighIQSpawnEgg highIQSpawnEgg = (HighIQSpawnEgg) SecondaryEntityRegistry.pickupMap.get(Integer.valueOf(((EntityCustomMob) targetEntity).getConfiguration().getPickupItemID()));

            targetPlayer.addItemStackToInventory(new ItemStack(highIQSpawnEgg));

            targetEntity.setDead();
        });

        return null;
    }
}
