package com.paneedah.weaponlib.network.packets;

import com.paneedah.weaponlib.UniversalSoundLookup;
import com.paneedah.weaponlib.compatibility.CompatibleMessageHandler;
import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.proxies.ClientProxy.mc;
import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class HeadshotSFXPacket implements net.minecraftforge.fml.common.network.simpleimpl.IMessage {

	

	public HeadshotSFXPacket() {
	
	}
	

	public void fromBytes(ByteBuf buf) {

	}

	public void toBytes(ByteBuf buf) {

	}

	public static class GunFXPacketHandler implements CompatibleMessageHandler<HeadshotSFXPacket, IMessage> {
		
		
		
		@SideOnly(Side.CLIENT)
		public void act() {
			mc.player.playSound(UniversalSoundLookup.lookupSound("headshotsfx"), 10, 1);
		}

		@Override
		public <T extends net.minecraftforge.fml.common.network.simpleimpl.IMessage> T onCompatibleMessage(HeadshotSFXPacket message, MessageContext messageContext) {
			 if(messageContext.side == Side.CLIENT) {
		            compatibility.runInMainClientThread(() -> {
					
		            	
		            	//System.out.println("hi");
		            	//PositionedSoundRecord shot = PositionedSoundRecord.getMasterRecord(UniversalSoundLookup.lookupSound("headshotsfx").getSound(), 1.0f);
		            	act();
		            	//mc.getSoundHandler().playSound(shot);
		            	
		            	//mc.world.playSound(mc.player, mc.player.getPosition(), SoundEvents.BLOCK_ANVIL_BREAK, SoundCategory.MASTER, 1.0f, 1.0f);
		            	
		            	//mc.getSoundHandler().playSound(PositionedSoundRecord.getMasterRecord(SoundEvents.BLOCK_GLASS_BREAK, 1.0f));
		            	
					
				});
			}
			
			return null;
		}

	}

	
}
