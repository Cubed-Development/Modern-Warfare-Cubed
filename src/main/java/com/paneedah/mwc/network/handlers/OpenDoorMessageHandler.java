package com.paneedah.mwc.network.handlers;

import com.paneedah.mwc.network.messages.OpenDoorMessage;
import io.redstudioragnarok.redcore.utils.NetworkUtil;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public final class OpenDoorMessageHandler implements IMessageHandler<OpenDoorMessage, IMessage> {

    @Override
    public IMessage onMessage(final OpenDoorMessage openDoorMessage, final MessageContext messageContext) {
        NetworkUtil.processMessage(messageContext, () -> {
            final EntityPlayer player = messageContext.getServerHandler().player;
            final BlockPos position = openDoorMessage.getPosition();
            final IBlockState iBlockState = player.world.getBlockState(position);

            iBlockState.getBlock().onBlockActivated(player.world, position, iBlockState, player, EnumHand.MAIN_HAND, EnumFacing.NORTH, (float) position.getX(), (float) position.getY(), (float) position.getZ());
        });

        return null;
    }
}
