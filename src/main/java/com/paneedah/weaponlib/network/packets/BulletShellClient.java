package com.paneedah.weaponlib.network.packets;

import com.paneedah.weaponlib.ClientEventHandler;
import com.paneedah.weaponlib.network.NetworkUtil;
import com.paneedah.weaponlib.render.shells.ShellParticleSimulator.Shell;
import io.netty.buffer.ByteBuf;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class BulletShellClient implements IMessage {

	public Vec3d position;
	public int shooter;
	public Vec3d velocity;
	public Shell.Type type;

	public BulletShellClient() {}
	
	public BulletShellClient(int shooterID, Shell.Type type, Vec3d pos, Vec3d velocity) {
		this.shooter = shooterID;
		this.type = type;
		this.position = pos;
		this.velocity = velocity;
	}

	public void fromBytes(ByteBuf buf) {
		this.shooter = buf.readInt();
		this.position = NetworkUtil.readVec3d(buf);
		this.velocity = NetworkUtil.readVec3d(buf);
		this.type = Shell.Type.valueOf(ByteBufUtils.readUTF8String(buf));
	}

	public void toBytes(ByteBuf buf) {
		buf.writeInt(this.shooter);
		NetworkUtil.writeVec3d(buf, position);
		NetworkUtil.writeVec3d(buf, velocity);
		ByteBufUtils.writeUTF8String(buf, type.toString());
	}

	public static class GunFXPacketHandler implements IMessageHandler<BulletShellClient, IMessage> {

		@Override
		@SideOnly(Side.CLIENT)
		public IMessage onMessage(BulletShellClient message, MessageContext messageContext) {
			mc.addScheduledTask(() -> {
				if(mc.player.getEntityId() != message.shooter)
					ClientEventHandler.SHELL_MANAGER.enqueueShell(new Shell(message.type, message.position, new Vec3d(-90, 0, 90), message.velocity));
			});

			return null;
		}
	}
}
