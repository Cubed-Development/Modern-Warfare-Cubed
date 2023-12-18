package com.paneedah.mwc.network.messages;

import com.paneedah.weaponlib.PlayerItemInstance;
import com.paneedah.mwc.network.TypeRegistry;
import com.paneedah.weaponlib.state.Permit;
import io.netty.buffer.ByteBuf;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public final class PermitMessage implements IMessage {

    private Permit<?> permit;
    private PlayerItemInstance<?> playerItemInstance;
    @Override
    public void fromBytes(final ByteBuf byteBuf) {
        final TypeRegistry typeRegistry = TypeRegistry.getINSTANCE();

        playerItemInstance = typeRegistry.fromBytes(byteBuf);
        permit = typeRegistry.fromBytes(byteBuf);
    }

    @Override
    public void toBytes(final ByteBuf byteBuf) {
        final TypeRegistry typeRegistry = TypeRegistry.getINSTANCE();

        typeRegistry.toBytes(playerItemInstance, byteBuf);
        typeRegistry.toBytes(permit, byteBuf);
    }
}
