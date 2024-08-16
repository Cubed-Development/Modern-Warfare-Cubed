package com.paneedah.mwc.network.messages;

import io.netty.buffer.ByteBuf;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EntityControlClientMessage implements IMessage {

    private Entity entity;
    private int flags;
    private int values;

    @Override
    public void fromBytes(final ByteBuf byteBuf) {
        entity = MC.player.world.getEntityByID(byteBuf.readInt());
        flags = byteBuf.readInt();
        values = byteBuf.readInt();
    }

    @Override
    public void toBytes(final ByteBuf byteBuf) {
        byteBuf.writeInt(entity.getEntityId());
        byteBuf.writeInt(flags);
        byteBuf.writeInt(values);
    }
}
