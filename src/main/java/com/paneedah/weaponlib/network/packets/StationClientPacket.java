package com.paneedah.weaponlib.network.packets;

import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.compatibility.CompatibleMessageHandler;
import com.paneedah.weaponlib.crafting.base.TileEntityStation;
import io.netty.buffer.ByteBuf;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

import static com.paneedah.mwc.proxies.ClientProxy.mc;
import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class StationClientPacket implements net.minecraftforge.fml.common.network.simpleimpl.IMessage {

	// THIS ONLY EXISTS ON THE SERVER END, THIS
	// VARIABLE WILL BE NULL ON THE CLIENT END.
	// USE mc INSTEAD.
	public World world;

	public BlockPos pos;

	
	// THIS ONLY EXISTS ON THE CLIENT.
	public ByteBuf copiedBuf;

	public StationClientPacket() {}
	
	public StationClientPacket(World world, BlockPos pos) {
		this.world = world;
		this.pos = pos;
	}


	public void fromBytes(ByteBuf buf) {
		this.pos = BlockPos.fromLong(buf.readLong());
		
		
		
		
		this.copiedBuf = buf.copy();
	
		
		
	}


	public void toBytes(ByteBuf buf) {
		buf.writeLong(this.pos.toLong());
		
		TileEntity te = world.getTileEntity(pos);
		if(te != null && te instanceof TileEntityStation) {
			TileEntityStation station = (TileEntityStation) te;
			station.writeBytesForClientSync(buf);
		}

	}

	public static class WorkshopClientPacketHandler implements CompatibleMessageHandler<StationClientPacket, IMessage> {
		
		private ModContext modContext;


		public WorkshopClientPacketHandler() {
		}

		public WorkshopClientPacketHandler(ModContext context) {
			this.modContext = context;
		}
		

		@Override
		public <T extends net.minecraftforge.fml.common.network.simpleimpl.IMessage> T onCompatibleMessage(StationClientPacket message, MessageContext messageContext) {
			 if(messageContext.side == Side.CLIENT) {
		            compatibility.runInMainClientThread(() -> {
					
		            	TileEntity te = mc.world.getTileEntity(message.pos);
		        		if(te != null && te instanceof TileEntityStation) {
		        			TileEntityStation station = (TileEntityStation) te;
		        			station.readBytesFromClientSync(message.copiedBuf);
		        		}
	
		            	
				});
			}
			
			return null;
		}

	}

	
}
