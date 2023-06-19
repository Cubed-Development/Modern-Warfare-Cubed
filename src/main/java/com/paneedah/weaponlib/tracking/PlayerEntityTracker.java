package com.paneedah.weaponlib.tracking;

import com.paneedah.weaponlib.compatibility.CompatiblePlayerEntityTrackerProvider;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.World;

import java.util.*;
import java.util.function.Supplier;

import static com.paneedah.mwc.proxies.ClientProxy.mc;
import static com.paneedah.mwc.utils.ModReference.LOG;

public class PlayerEntityTracker {

    public static final PlayerEntityTracker getTracker(EntityLivingBase player) {
        return CompatiblePlayerEntityTrackerProvider.getTracker(player);
    }

    private Supplier<World> world;
    private Map<UUID, TrackableEntity> trackableEntities = new LinkedHashMap<>();

    public PlayerEntityTracker(Supplier<World> world) {
        this.world = world;
    }

    public PlayerEntityTracker() {}

    void init(Supplier<World> world) {
        this.world = world;
    }

    public void addTrackableEntity(TrackableEntity te) {
        update();
        trackableEntities.put(te.getEntity().getPersistentID(), te);
    }

    public boolean updateTrackableEntity(Entity entity) {
        update();
        TrackableEntity te = trackableEntities.get(entity.getPersistentID());
        if(te != null) {
            te.setEntitySupplier(() -> entity);
            return true;
        }
        return false;
    }

    public Collection<TrackableEntity> getTrackableEntitites() {
        //update();
        return Collections.unmodifiableCollection(trackableEntities.values());
    }

    public void update() {
        for(Iterator<TrackableEntity> it = trackableEntities.values().iterator(); it.hasNext();) {
            TrackableEntity te = it.next();
            if(te.isExpired()) {
                it.remove();
            }
        }
    }

    public TrackableEntity getTrackableEntity(int index) {
        Collection<TrackableEntity> values = trackableEntities.values();
        int i = 0;
        TrackableEntity result = null;
        for(Iterator<TrackableEntity> it = values.iterator(); it.hasNext(); i++) {
            TrackableEntity te = it.next();
            if(i == index) {
                result = te;
                break;
            }
        }
        return result;
    }

    public void serialize(ByteBuf buf) {
        update();
        buf.writeInt(trackableEntities.size());
        for(TrackableEntity te: trackableEntities.values()) {
            te.serialize(buf, world);
        }
    }

    private void init(ByteBuf buf) {
        int trackableEntitiesSize = buf.readInt();
        for(int i = 0; i < trackableEntitiesSize; i++) {
            try {
                TrackableEntity te = TrackableEntity.fromBuf(buf, world);
                trackableEntities.put(te.getUuid(), te);
            } catch(RuntimeException e) {
                LOG.error("Failed to deserialize trackable entity {}", e.toString(), e);
            }
        }
    }

    public byte[] toByteArray() {
        ByteBuf buf = Unpooled.buffer();
        serialize(buf);
        return buf.array();
    }

    public static PlayerEntityTracker fromByteArray(byte[] bytes, Supplier<World> world) {
        ByteBuf buf = Unpooled.wrappedBuffer(bytes);
        PlayerEntityTracker tracker = new PlayerEntityTracker(world);
        if(bytes != null && bytes.length > 0) {
            tracker.init(buf);
        } else {
            LOG.warn("Cannot deserialize tracker from empty byte array");
        }
        return tracker;
    }

    public static PlayerEntityTracker fromBuf(ByteBuf buf /*, World world*/) {
        PlayerEntityTracker tracker = new PlayerEntityTracker(() -> mc.player.world);
        tracker.init(buf);
        return tracker;
    }


}
