package com.paneedah.mwc.weaponlib.network.packets;

import com.paneedah.mwc.weaponlib.ModContext;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleMessage;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleMessageContext;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleMessageHandler;
import com.paneedah.mwc.weaponlib.jim.util.RandomUtil;
import io.netty.buffer.ByteBuf;

import static com.paneedah.mwc.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class BloodPacketClient implements CompatibleMessage {

	double x, y, z, velx, vely, velz;

	public BloodPacketClient() {}
	
	public BloodPacketClient(double x, double y, double z, double velX, double velY, double velZ) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.velx = velX;
		this.vely = velY;
		this.velz = velZ;
	}
	

	public void fromBytes(ByteBuf buf) {
	
		this.x = buf.readDouble();
		this.y = buf.readDouble();
		this.z = buf.readDouble();
		this.velx = buf.readDouble();
		this.vely = buf.readDouble();
		this.velz = buf.readDouble();

	
	}
	
	

	public void toBytes(ByteBuf buf) {
		buf.writeDouble(this.x);
		buf.writeDouble(this.y);
		buf.writeDouble(this.z);
		buf.writeDouble(this.velx);
		buf.writeDouble(this.vely);
		buf.writeDouble(this.velz);
	}

	public static class BalancePacketHandler implements CompatibleMessageHandler<BloodPacketClient, CompatibleMessage> {
		
		private ModContext modContext;
		
		
		public BalancePacketHandler(ModContext context) {
			this.modContext = context;
		}
		

		@Override
		public <T extends CompatibleMessage> T onCompatibleMessage(BloodPacketClient m, CompatibleMessageContext ctx) {
			 if(!ctx.isServerSide()) {
		            compatibility.runInMainClientThread(() -> {
					
		            	
		            	double velX = m.velx;
		            	double velY = m.vely;
		            	double velZ = m.velz;
		            	
		            	double length = Math.sqrt(velX*velX + velY*velY + velZ*velZ);
		            	velX /= -length;
		            	velY /= -length;
		            	velZ /= -length;
		            	
		            	
		            	double scale = 0.2;
		            	double spreader = 0.05;
		            	
		            	RandomUtil util = new RandomUtil();
		            	
		            	for(int i = 0; i < 15; ++i) {
		            	///	System.out.println(m.x + " | " + m.y  + " | " + m.z);
		            		compatibility.addBloodParticle(modContext, m.x, m.y, m.z, velX*scale + util.getRandomWithNegatives(spreader), velY*scale + util.getRandomWithNegatives(spreader), velZ*scale + util.getRandomWithNegatives(spreader));
			            	
							
		            	}
		            	
				});
			}
			
			return null;
		}

	}

	
}
