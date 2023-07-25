package com.paneedah.mwc.network.messages;

import com.paneedah.weaponlib.grenade.PlayerGrenadeInstance;
import com.paneedah.mwc.network.TypeRegistry;
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
    private long activationTimestamp;

    @Override
    public void fromBytes(final ByteBuf byteBuf) {
        this.instance = TypeRegistry.getINSTANCE().fromBytes(byteBuf);
        this.activationTimestamp = byteBuf.readLong();
    }

    @Override
    public void toBytes(final ByteBuf byteBuf) {
        TypeRegistry.getINSTANCE().toBytes(instance, byteBuf);
        byteBuf.writeLong(activationTimestamp);
    }
}
