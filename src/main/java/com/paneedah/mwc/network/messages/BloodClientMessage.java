package com.paneedah.mwc.network.messages;

import com.paneedah.mwc.network.NetworkUtil;
import io.netty.buffer.ByteBuf;
import io.redstudioragnarok.redcore.vectors.Vector3F;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public final class BloodClientMessage implements IMessage {

    private Vector3F position;
    private Vector3F velocity;

    @Override
    public void fromBytes(final ByteBuf byteBuf) {
        position = NetworkUtil.readVector3F(byteBuf);
        velocity = NetworkUtil.readVector3F(byteBuf);
    }

    @Override
    public void toBytes(final ByteBuf byteBuf) {
        NetworkUtil.writeVector3F(byteBuf, position);
        NetworkUtil.writeVector3F(byteBuf, velocity);
    }
}
