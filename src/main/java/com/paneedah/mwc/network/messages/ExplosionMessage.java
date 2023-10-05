package com.paneedah.mwc.network.messages;

import io.netty.buffer.ByteBuf;
import dev.redstudio.redcore.vectors.Vector3D;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public final class ExplosionMessage implements IMessage {

    private Vector3D velocity = new Vector3D();
    private float strength;

    @Override
    public void fromBytes(final ByteBuf byteBuf) {
        velocity.read(byteBuf);
        strength = byteBuf.readFloat();
    }

    @Override
    public void toBytes(final ByteBuf byteBuf) {
        velocity.write(byteBuf);
        byteBuf.writeFloat(strength);
    }
}
