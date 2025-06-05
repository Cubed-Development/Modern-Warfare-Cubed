package com.paneedah.mwc.network.messages;

import com.paneedah.mwc.utils.VectorUtil;
import dev.redstudio.redcore.math.vectors.Vector3D;
import io.netty.buffer.ByteBuf;
import dev.redstudio.redcore.math.vectors.Vector3F;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public final class BloodClientMessage implements IMessage {

    private Vector3D position = new Vector3D();
    private Vector3F velocity = new Vector3F();

    @Override
    public void fromBytes(final ByteBuf byteBuf) {
        VectorUtil.Networking.read(byteBuf, position);
        VectorUtil.Networking.read(byteBuf, velocity);
    }

    @Override
    public void toBytes(final ByteBuf byteBuf) {
        VectorUtil.Networking.write(byteBuf, position);
        VectorUtil.Networking.write(byteBuf, velocity);
    }
}
