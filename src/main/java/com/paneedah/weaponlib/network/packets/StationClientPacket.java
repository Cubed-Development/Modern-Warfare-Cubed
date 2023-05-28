package com.paneedah.weaponlib.network.packets;

import com.paneedah.weaponlib.crafting.base.TileEntityStation;
import io.netty.buffer.ByteBuf;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class StationClientPacket implements IMessage {

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

	public static class WorkshopClientPacketHandler implements IMessageHandler<StationClientPacket, IMessage> {

		public WorkshopClientPacketHandler() {
		}

		@Override
		public IMessage onMessage(StationClientPacket message, MessageContext messageContext) {
			mc.addScheduledTask(() -> {
				TileEntity tileEntity = mc.world.getTileEntity(message.pos);
				if(tileEntity != null && tileEntity instanceof TileEntityStation)
					((TileEntityStation) tileEntity).readBytesFromClientSync(message.copiedBuf);
			});

			return null;
		}
	}
}
