package com.paneedah.mwc.network.messages;

import com.paneedah.weaponlib.melee.PlayerMeleeInstance;
import com.paneedah.weaponlib.network.TypeRegistry;
import io.netty.buffer.ByteBuf;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public final class MeleeAttackMessage implements IMessage {

    private PlayerMeleeInstance instance;
    private int entityId;
    private boolean isHeavyAttack;

    @Override
    public void fromBytes(final ByteBuf byteBuf) {
        instance = TypeRegistry.getInstance().fromBytes(byteBuf);
        entityId = byteBuf.readInt();
        isHeavyAttack = byteBuf.readBoolean();
    }

    @Override
    public void toBytes(final ByteBuf byteBuf) {
        TypeRegistry.getInstance().toBytes(instance, byteBuf);
        byteBuf.writeInt(entityId);
        byteBuf.writeBoolean(isHeavyAttack);
    }
}
