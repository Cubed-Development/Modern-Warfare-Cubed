package com.paneedah.mwc.network.messages;

import com.paneedah.weaponlib.render.shells.ShellParticleSimulator.Shell;
import io.netty.buffer.ByteBuf;
import dev.redstudio.redcore.vectors.Vector3D;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public final class ShellMessageClient implements IMessage {

	private int shooter;
	private Shell.Type type;
	private Vector3D position = new Vector3D();
	private Vector3D velocity = new Vector3D();

	@Override
	public void fromBytes(final ByteBuf byteBuf) {
		shooter = byteBuf.readInt();
		type = Shell.Type.valueOf(ByteBufUtils.readUTF8String(byteBuf));
		position.read(byteBuf);
		velocity.read(byteBuf);
	}

	@Override
	public void toBytes(final ByteBuf byteBuf) {
		byteBuf.writeInt(shooter);
		ByteBufUtils.writeUTF8String(byteBuf, type.toString());
		position.write(byteBuf);
		velocity.write(byteBuf);
	}
}
