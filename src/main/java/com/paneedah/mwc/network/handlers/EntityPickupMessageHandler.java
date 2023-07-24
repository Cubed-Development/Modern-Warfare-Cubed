package com.paneedah.mwc.network.handlers;

import com.paneedah.mwc.network.messages.EntityPickupMessage;
import com.paneedah.weaponlib.HighIQSpawnEgg;
import com.paneedah.weaponlib.SecondaryEntityRegistry;
import com.paneedah.weaponlib.ai.EntityCustomMob;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public final class EntityPickupMessageHandler implements IMessageHandler<EntityPickupMessage, IMessage> {

    @Override
    public IMessage onMessage(final EntityPickupMessage entityPickupMessage, final MessageContext messageContext) {
        // Get the player we should send to
        final EntityPlayerMP targetPlayer = (EntityPlayerMP) messageContext.getServerHandler().player.getEntityWorld().getEntityByID(entityPickupMessage.getPlayerID());

		if (targetPlayer == null)
			return entityPickupMessage;

        final Entity targetEntity = targetPlayer.world.getEntityByID(entityPickupMessage.getEntityID());

        if (!(targetEntity instanceof EntityCustomMob))
            return entityPickupMessage;

        final HighIQSpawnEgg highIQSpawnEgg = (HighIQSpawnEgg) SecondaryEntityRegistry.pickupMap.get(((EntityCustomMob) targetEntity).getConfiguration().getPickupItemID());

        targetPlayer.addItemStackToInventory(new ItemStack(highIQSpawnEgg));

        targetEntity.setDead();

        return entityPickupMessage;
    }
}
