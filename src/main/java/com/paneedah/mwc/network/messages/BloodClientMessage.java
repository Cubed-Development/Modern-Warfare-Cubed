package com.paneedah.mwc.network.messages;

import io.netty.buffer.ByteBuf;
import dev.redstudio.redcore.vectors.Vector3F;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public final class BloodClientMessage implements IMessage {

    private Vector3F position = new Vector3F();
    private Vector3F velocity = new Vector3F();

    @Override
    public void fromBytes(final ByteBuf byteBuf) {
        position.read(byteBuf);
        velocity.read(byteBuf);
    }

    @Override
    public void toBytes(final ByteBuf byteBuf) {
        position.write(byteBuf);
        velocity.write(byteBuf);
    }
}
