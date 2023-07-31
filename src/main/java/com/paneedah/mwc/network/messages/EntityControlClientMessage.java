package com.paneedah.mwc.network.messages;

import com.paneedah.weaponlib.compatibility.CompatibleExtraEntityFlags;
import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

@Getter
@NoArgsConstructor
public class EntityControlClientMessage implements IMessage {

    private int flags;
    private int values;
    private int entityId;

    public EntityControlClientMessage(final Entity entity, final int values) {
        this(entity, 0xFFFFFFFF & ~CompatibleExtraEntityFlags.FLIP, values);
    }

    public EntityControlClientMessage(final Entity entity, final int flags, final int values) {
        this.entityId = entity.getEntityId();
        this.flags = flags;
        this.values = values;
    }

    @Override
    public void fromBytes(final ByteBuf byteBuf) {
        entityId = byteBuf.readInt();
        flags = byteBuf.readInt();
        values = byteBuf.readInt();
    }

    @Override
    public void toBytes(final ByteBuf byteBuf) {
        byteBuf.writeInt(entityId);
        byteBuf.writeInt(flags);
        byteBuf.writeInt(values);
    }

    public Entity getEntity(final World world) {
        return world.getEntityByID(entityId);
    }
}
