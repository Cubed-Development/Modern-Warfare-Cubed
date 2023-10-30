package com.paneedah.mwc.network.handlers;

import com.paneedah.mwc.network.messages.ExplosionMessage;
import dev.redstudio.redcore.utils.NetworkUtil;
import dev.redstudio.redcore.vectors.Vector3D;
import lombok.NoArgsConstructor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

@NoArgsConstructor
public final class ExplosionMessageHandler implements IMessageHandler<ExplosionMessage, IMessage> {

    @Override
    @SideOnly(Side.CLIENT)
    public IMessage onMessage(final ExplosionMessage explosionMessage, final MessageContext messageContext) {
        NetworkUtil.processMessage(messageContext, () -> {
            final EntityPlayer player = MC.player;
            final Vector3D velocity = explosionMessage.getVelocity();
            final float strength = explosionMessage.getStrength();

            player.motionX += velocity.x * strength;
            player.motionY += velocity.y * strength;
            player.motionZ += velocity.z * strength;
        });

        return null;
    }
}
