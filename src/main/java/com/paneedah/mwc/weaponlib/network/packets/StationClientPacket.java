package com.paneedah.mwc.weaponlib.network.packets;

import com.paneedah.mwc.weaponlib.ModContext;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleMessage;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleMessageContext;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleMessageHandler;
import com.paneedah.mwc.weaponlib.crafting.base.TileEntityStation;
import io.netty.buffer.ByteBuf;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import static com.paneedah.mwc.proxies.ClientProxy.mc;
import static com.paneedah.mwc.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class StationClientPacket implements CompatibleMessage {

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

	public static class WorkshopClientPacketHandler implements CompatibleMessageHandler<StationClientPacket, CompatibleMessage> {
		
		private ModContext modContext;
		
		
		public WorkshopClientPacketHandler(ModContext context) {
			this.modContext = context;
		}
		

		@Override
		public <T extends CompatibleMessage> T onCompatibleMessage(StationClientPacket m, CompatibleMessageContext ctx) {
			 if(!ctx.isServerSide()) {
		            compatibility.runInMainClientThread(() -> {
					
		            	TileEntity te = mc.world.getTileEntity(m.pos);
		        		if(te != null && te instanceof TileEntityStation) {
		        			TileEntityStation station = (TileEntityStation) te;
		        			station.readBytesFromClientSync(m.copiedBuf);
		        		}
	
		            	
				});
			}
			
			return null;
		}

	}

	
}
