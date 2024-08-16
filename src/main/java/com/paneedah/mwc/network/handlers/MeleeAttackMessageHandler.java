package com.paneedah.mwc.network.handlers;

import com.paneedah.mwc.network.messages.MeleeAttackMessage;
import com.paneedah.weaponlib.melee.ItemMelee;
import com.paneedah.weaponlib.melee.MeleeAttackAspect;
import io.redstudioragnarok.redcore.utils.NetworkUtil;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

@NoArgsConstructor
@AllArgsConstructor
public final class MeleeAttackMessageHandler implements IMessageHandler<MeleeAttackMessage, IMessage> {

    private MeleeAttackAspect meleeAttackAspect;

    @Override
    public IMessage onMessage(final MeleeAttackMessage meleeAttackMessage, final MessageContext messageContext) {
        NetworkUtil.processMessage(messageContext, () -> {
            final EntityPlayer player = messageContext.getServerHandler().player;

            if (player.getHeldItemMainhand().getItem() instanceof ItemMelee)
                meleeAttackAspect.serverAttack(player, meleeAttackMessage.getInstance(), player.world.getEntityByID(meleeAttackMessage.getEntityId()), meleeAttackMessage.isHeavyAttack());
        });

        return null;
    }
}
