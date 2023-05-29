package com.paneedah.weaponlib.network.packets;

import com.paneedah.weaponlib.jim.util.RandomUtil;
import com.paneedah.weaponlib.particle.ParticleBlood;
import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class BloodPacketClient implements IMessage {

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

	public static class BalancePacketHandler implements IMessageHandler<BloodPacketClient, IMessage> {

		public BalancePacketHandler() {
		}

		@Override
		@SideOnly(Side.CLIENT)
		public IMessage onMessage(BloodPacketClient message, MessageContext messageContext) {
			mc.addScheduledTask(() -> {
				double velX = message.velx;
				double velY = message.vely;
				double velZ = message.velz;

				double length = Math.sqrt(velX * velX + velY * velY + velZ * velZ);
				velX /= -length;
				velY /= -length;
				velZ /= -length;

				double scale = 0.2;
				double spreader = 0.05;

				RandomUtil util = new RandomUtil();

				for(int i = 0; i < 15; ++i) {
					mc.effectRenderer.addEffect(new ParticleBlood(mc.world, message.x, message.y, message.z, velX * scale + util.getRandomWithNegatives(spreader), velY * scale + util.getRandomWithNegatives(spreader), velZ * scale + util.getRandomWithNegatives(spreader)));
				}
		   });

			return null;
		}

	}

	
}
