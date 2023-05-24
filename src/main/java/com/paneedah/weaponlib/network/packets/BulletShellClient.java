package com.paneedah.weaponlib.network.packets;

import com.paneedah.weaponlib.compatibility.CompatibleClientEventHandler;
import com.paneedah.weaponlib.compatibility.CompatibleMessageHandler;
import com.paneedah.weaponlib.network.NetworkUtil;
import com.paneedah.weaponlib.render.shells.ShellParticleSimulator.Shell;
import io.netty.buffer.ByteBuf;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

import static com.paneedah.mwc.proxies.ClientProxy.mc;
import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class BulletShellClient implements net.minecraftforge.fml.common.network.simpleimpl.IMessage {

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

	public static class GunFXPacketHandler implements CompatibleMessageHandler<BulletShellClient, IMessage> {
		
		

		@Override
		public <T extends net.minecraftforge.fml.common.network.simpleimpl.IMessage> T onCompatibleMessage(BulletShellClient message, MessageContext messageContext) {
			 if(messageContext.side == Side.CLIENT) {
				 mc.addScheduledTask(() -> {
					
		            	if(mc.player.getEntityId() != message.shooter) {
		            		Shell shell = new Shell(message.type, message.position, new Vec3d(-90, 0, 90), message.velocity);
			            	CompatibleClientEventHandler.SHELL_MANAGER.enqueueShell(shell);
		            	}
		            	
					
				});
			}
			
			return null;
		}

	}

	
}
