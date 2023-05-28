package com.paneedah.weaponlib.network.packets;

import io.netty.buffer.ByteBuf;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class OpenDoorPacket implements IMessage {

	BlockPos pos;

	public OpenDoorPacket() {}
	
	public OpenDoorPacket(BlockPos pos) {
		this.pos = pos;
	}

	public void fromBytes(ByteBuf buf) {
		this.pos = BlockPos.fromLong(buf.readLong());
	}

	public void toBytes(ByteBuf buf) {
		buf.writeLong(this.pos.toLong());
	}

	public static class OpenDoorPacketHandler implements IMessageHandler<OpenDoorPacket, IMessage> {

		public OpenDoorPacketHandler() {
		}

		@Override
		public IMessage onMessage(OpenDoorPacket message, MessageContext messageContext) {
			if(messageContext.side == Side.SERVER) {
				EntityPlayer player = messageContext.getServerHandler().player;
				player.getServer().addScheduledTask(() -> {
	            	IBlockState state = player.world.getBlockState(message.pos);
	            	BlockDoor door = (BlockDoor) state.getBlock();
	 				door.onBlockActivated(player.world, message.pos, state, player, EnumHand.MAIN_HAND, EnumFacing.NORTH, (float) message.pos.getX(), (float) message.pos.getY(), (float) message.pos.getZ());
				});
			}
			
			return null;
		}
	}
}
