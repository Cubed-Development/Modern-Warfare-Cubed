package com.paneedah.mwc.network.messages;

import io.netty.buffer.ByteBuf;
import io.redstudioragnarok.redcore.vectors.Vector3F;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public final class SpawnParticleMessage implements IMessage {

    public enum ParticleType {
        SMOKE_GRENADE_SMOKE,
        SMOKE_GRENADE_YELLOW_SMOKE
    }

    private ParticleType type;
    private int count;
    private Vector3F position = new Vector3F();
    private Vector3F velocity = new Vector3F();

    @Override
    public void fromBytes(final ByteBuf byteBuf) {
        type = ParticleType.values()[byteBuf.readInt()];
        count = byteBuf.readInt();
        position.read(byteBuf);
        velocity.read(byteBuf);
    }

    @Override
    public void toBytes(final ByteBuf byteBuf) {
        byteBuf.writeInt(type.ordinal());
        byteBuf.writeInt(count);
        position.write(byteBuf);
        velocity.write(byteBuf);
    }
}
