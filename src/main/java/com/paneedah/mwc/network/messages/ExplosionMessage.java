package com.paneedah.mwc.network.messages;

import com.paneedah.mwc.utils.VectorUtil;
import dev.redstudio.redcore.math.vectors.Vector3F;
import io.netty.buffer.ByteBuf;
import dev.redstudio.redcore.math.vectors.Vector3D;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

import java.util.Vector;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public final class ExplosionMessage implements IMessage {

    private Vector3F velocity = new Vector3F();
    private float strength;

    @Override
    public void fromBytes(final ByteBuf byteBuf) {
        VectorUtil.Networking.read(byteBuf, velocity);
        strength = byteBuf.readFloat();
    }

    @Override
    public void toBytes(final ByteBuf byteBuf) {
        VectorUtil.Networking.write(byteBuf, velocity);
        byteBuf.writeFloat(strength);
    }
}
