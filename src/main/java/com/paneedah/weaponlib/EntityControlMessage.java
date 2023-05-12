package com.paneedah.weaponlib;

import com.paneedah.weaponlib.compatibility.CompatibleExtraEntityFlags;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public class EntityControlMessage implements net.minecraftforge.fml.common.network.simpleimpl.IMessage {

    private int flags;
    private int values;
    private int entityId;

    public EntityControlMessage() {}

    public EntityControlMessage(Entity entity, int values) {
        this(entity, 0xFFFFFFFF & ~CompatibleExtraEntityFlags.FLIP, values);
    }
    
    public EntityControlMessage(Entity entity, int flags, int values) {
        this.entityId = entity.getEntityId();
        this.flags = flags;
        this.values = values;
    }

    public void fromBytes(ByteBuf buf) {
        entityId = buf.readInt();
        flags = buf.readInt();
        values = buf.readInt();
    }

    public void toBytes(ByteBuf buf) {
        buf.writeInt(entityId);
        buf.writeInt(flags);
        buf.writeInt(values);
    }

    public int getFlags() {
        return flags;
    }
    
    public int getValues() {
        return values;
    }
    
    public Entity getEntity(World world) {
        return world.getEntityByID(entityId);
    }
}
