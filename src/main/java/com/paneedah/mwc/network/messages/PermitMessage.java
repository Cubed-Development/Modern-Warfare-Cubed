package com.paneedah.mwc.network.messages;

import com.paneedah.mwc.network.TypeRegistry;
import com.paneedah.weaponlib.PlayerItemInstance;
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
        playerItemInstance = TypeRegistry.read(byteBuf);
        permit = TypeRegistry.read(byteBuf);
    }

    @Override
    public void toBytes(final ByteBuf byteBuf) {
        TypeRegistry.write(playerItemInstance, byteBuf);
        TypeRegistry.write(permit, byteBuf);
    }
}
