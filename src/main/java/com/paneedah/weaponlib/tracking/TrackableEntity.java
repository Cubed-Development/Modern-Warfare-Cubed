package com.paneedah.weaponlib.tracking;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.function.Supplier;

import static com.paneedah.mwc.utils.ModReference.LOG;

public class TrackableEntity {

    private Supplier<Entity> entitySupplier;
    private long startTimestamp;
    private UUID uuid;
    private int entityId;
    private long trackingDuration;
    private WeakReference<Entity> entityRef;
    private String displayName = "";
    private Supplier<World> worldSupplier;

    private TrackableEntity() {}

    public TrackableEntity(Entity entity, long startTimestamp, long trackingDuration) {
        this.uuid = entity.getPersistentID();
        this.entityId = entity.getEntityId();
        this.entitySupplier = () -> entity;
        this.startTimestamp = startTimestamp;
        this.trackingDuration = trackingDuration;
        this.worldSupplier = () -> entity.world;
    }

    public UUID getUuid() {
        if(uuid != null) {
            return uuid;
        }
        Entity entity = getEntity();
        return entity != null ? entity.getPersistentID() : null;
    }

    public void setEntitySupplier(Supplier<Entity> entitySupplier) {
        this.entitySupplier = entitySupplier;
        this.entityId = -1;
        this.entityRef = null;
    }

    public Entity getEntity() {
        if(entityRef == null || entityRef.get() == null) {
            Entity entity = entitySupplier.get();
            if(entity != null) {
                if(entity instanceof EntityPlayer) {
                    displayName = ((EntityPlayer) entity).getDisplayNameString();
                } else if(entity instanceof EntityLivingBase) {
                    displayName = EntityList.getEntityString(entity);
                }
                entityId = entity.getEntityId();
            }
            entityRef = new WeakReference<Entity>(entity);
        }
        return entityRef.get();
    }


    public static TrackableEntity fromBuf(ByteBuf buf, Supplier<World> world) {
        TrackableEntity te = new TrackableEntity();
        te.init(buf, world);
        return te;
    }

    public void init(ByteBuf buf, Supplier<World> worldSupplier) {
        this.worldSupplier = worldSupplier;
        uuid = new UUID(buf.readLong(), buf.readLong());
        entityId = buf.readInt();
        LOG.debug("Deserializing entity uuid {}, id {}", uuid, entityId);

        startTimestamp = buf.readLong();
        trackingDuration = buf.readLong();
        
        World world = worldSupplier.get();
        if(world != null) {
            // This is the correction for older versions using milliseconds
            if(startTimestamp > world.getWorldTime() + 1000) {
                startTimestamp = world.getWorldTime();
                trackingDuration /= 50;
            }
        }
        
        entitySupplier = () -> {
            World w = worldSupplier.get();
            if(w.isRemote) {
                return w.getEntityByID(entityId);
            }
            return w.getPlayerEntityByUUID(uuid);
        };
    }

    public void serialize(ByteBuf buf, Supplier<World> world) {
        buf.writeLong(uuid.getMostSignificantBits());
        buf.writeLong(uuid.getLeastSignificantBits());
        Entity entity = getEntity();
        int entityId = -1;
        if(entity != null) {
            entityId = entity.getEntityId();
        }
        LOG.debug("Serializing server entity uuid {}, id {}", uuid, entityId);

        buf.writeInt(entityId);
        buf.writeLong(startTimestamp);
        buf.writeLong(trackingDuration);
    }

    public boolean isExpired() {
        if(worldSupplier == null) {
            return true;
        }
        //Entity entity = getEntity();
        return /*(entity != null && entity.isDead) ||  */ startTimestamp + trackingDuration < worldSupplier.get().getWorldTime();
    }

    public String getDisplayName() {
        return displayName;
    }

    public long getTrackingDuration() {
        return trackingDuration;
    }

    public long getStartTimestamp() {
        return startTimestamp;
    }
}
