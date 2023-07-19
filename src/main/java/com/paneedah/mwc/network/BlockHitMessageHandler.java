package com.paneedah.mwc.network;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.network.messages.BlockHitMessage;
import io.redstudioragnarok.redcore.vectors.Vector3F;
import net.minecraft.util.EnumParticleTypes;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

public class BlockHitMessageHandler implements IMessageHandler<BlockHitMessage, IMessage> {

    @Override
    @SideOnly(Side.CLIENT)
    public IMessage onMessage(BlockHitMessage blockHitMessage, MessageContext messageContext) {
        final Vector3F position = blockHitMessage.getPosition();

        for (int i = 0; i < MWC.bulletHitParticleMult; i++) {
            MC.effectRenderer.addBlockHitEffects(blockHitMessage.getBlockPos(), blockHitMessage.getEnumFacing());
            MC.world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, position.x, position.y, position.z, 0, 0, 0);
        }

        return blockHitMessage;
    }
}
