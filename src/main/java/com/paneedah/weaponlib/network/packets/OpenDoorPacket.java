package com.paneedah.weaponlib.network.packets;

import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.compatibility.CompatibleMessage;
import com.paneedah.weaponlib.compatibility.CompatibleMessageContext;
import com.paneedah.weaponlib.compatibility.CompatibleMessageHandler;
import io.netty.buffer.ByteBuf;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;

public class OpenDoorPacket implements CompatibleMessage {

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

	public static class OpenDoorPacketHandler implements CompatibleMessageHandler<OpenDoorPacket, CompatibleMessage> {
		
		private ModContext modContext;
		
		
		public OpenDoorPacketHandler(ModContext context) {
			this.modContext = context;
		}
		

		@Override
		public <T extends CompatibleMessage> T onCompatibleMessage(OpenDoorPacket m, CompatibleMessageContext ctx) {
			if(ctx.isServerSide()) {
	            ctx.runInMainThread(() -> {
					
	            	
	            	
	            	EntityPlayer player = ctx.getPlayer();
	            	
	            	IBlockState state = player.world.getBlockState(m.pos);
	            	BlockDoor door = (BlockDoor) state.getBlock();
	 				door.onBlockActivated(player.world, m.pos, state, player, EnumHand.MAIN_HAND, EnumFacing.NORTH, (float) m.pos.getX(), (float) m.pos.getY(), (float) m.pos.getZ());
	 				
		            
		            	
				});
			}
			
			return null;
		}

	}

	
}
