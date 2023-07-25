package com.paneedah.mwc.network.messages;

import com.paneedah.mwc.network.NetworkUtil;
import com.paneedah.weaponlib.render.shells.ShellParticleSimulator.Shell;
import io.netty.buffer.ByteBuf;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public final class ShellMessageClient implements IMessage {

	private int shooter;
	private Shell.Type type;
	private Vec3d position;
	private Vec3d velocity;

	@Override
	public void fromBytes(final ByteBuf byteBuf) {
		this.shooter = byteBuf.readInt();
		this.type = Shell.Type.valueOf(ByteBufUtils.readUTF8String(byteBuf));
		this.position = NetworkUtil.readVec3d(byteBuf);
		this.velocity = NetworkUtil.readVec3d(byteBuf);
	}

	@Override
	public void toBytes(final ByteBuf byteBuf) {
		byteBuf.writeInt(this.shooter);
		ByteBufUtils.writeUTF8String(byteBuf, type.toString());
		NetworkUtil.writeVec3d(byteBuf, position);
		NetworkUtil.writeVec3d(byteBuf, velocity);
	}
}
