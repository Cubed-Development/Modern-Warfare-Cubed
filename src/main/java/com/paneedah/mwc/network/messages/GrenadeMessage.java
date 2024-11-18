package com.paneedah.mwc.network.messages;

import com.paneedah.mwc.network.TypeRegistry;
import com.paneedah.mwc.instancing.PlayerGrenadeInstance;
import io.netty.buffer.ByteBuf;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public final class GrenadeMessage implements IMessage {

    private PlayerGrenadeInstance instance;

    @Override
    public void fromBytes(final ByteBuf byteBuf) {
        this.instance = TypeRegistry.read(byteBuf);
    }

    @Override
    public void toBytes(final ByteBuf byteBuf) {
        TypeRegistry.write(byteBuf, instance);
    }
}
