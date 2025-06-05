package com.paneedah.mwc.network.messages;

import com.paneedah.mwc.utils.VectorUtil;
import com.paneedah.weaponlib.render.shells.ShellParticleSimulator.Shell;
import dev.redstudio.redcore.math.vectors.Vector3D;
import dev.redstudio.redcore.math.vectors.Vector3F;
import io.netty.buffer.ByteBuf;
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
    private Vector3F velocity = new Vector3F();

    @Override
    public void fromBytes(final ByteBuf byteBuf) {
        shooter = byteBuf.readInt();
        type = Shell.Type.valueOf(ByteBufUtils.readUTF8String(byteBuf));

        VectorUtil.Networking.read(byteBuf, position);
        VectorUtil.Networking.read(byteBuf, velocity);
    }

    @Override
    public void toBytes(final ByteBuf byteBuf) {
        byteBuf.writeInt(shooter);
        ByteBufUtils.writeUTF8String(byteBuf, type.toString());

        VectorUtil.Networking.write(byteBuf, position);
        VectorUtil.Networking.write(byteBuf, velocity);
    }
}
