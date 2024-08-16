package com.paneedah.weaponlib.tracking;

import com.paneedah.weaponlib.compatibility.CompatiblePlayerEntityTrackerProvider;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.World;

import java.util.*;
import java.util.function.Supplier;

import static com.paneedah.mwc.proxies.ClientProxy.MC;
import static com.paneedah.mwc.utils.ModReference.LOG;

public class LivingEntityTracker {

    public static final LivingEntityTracker getTracker(EntityLivingBase player) {
        return CompatiblePlayerEntityTrackerProvider.getTracker(player);
    }

    private Supplier<World> world;
    private final Map<UUID, TrackableEntity> trackableEntities = new LinkedHashMap<>();

    public LivingEntityTracker(Supplier<World> world) {
        this.world = world;
    }

    public LivingEntityTracker() {}

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
        if (te != null) {
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
        for (Iterator<TrackableEntity> it = trackableEntities.values().iterator(); it.hasNext(); ) {
            TrackableEntity te = it.next();
            if (te.isExpired()) {
                it.remove();
            }
        }
    }

    public TrackableEntity getTrackableEntity(int index) {
        Collection<TrackableEntity> values = trackableEntities.values();
        int i = 0;
        TrackableEntity result = null;
        for (Iterator<TrackableEntity> it = values.iterator(); it.hasNext(); i++) {
            TrackableEntity te = it.next();
            if (i == index) {
                result = te;
                break;
            }
        }
        return result;
    }

    public void write(ByteBuf buf) {
        update();
        buf.writeInt(trackableEntities.size());
        for (TrackableEntity te : trackableEntities.values()) {
            te.serialize(buf, world);
        }
    }

    private void init(ByteBuf buf) {
        int trackableEntitiesSize = buf.readInt();
        for (int i = 0; i < trackableEntitiesSize; i++) {
            try {
                TrackableEntity te = TrackableEntity.fromBuf(buf, world);
                trackableEntities.put(te.getUuid(), te);
            } catch (RuntimeException e) {
                LOG.error("Failed to deserialize trackable entity {}", e.toString(), e);
            }
        }
    }

    public byte[] toByteArray() {
        ByteBuf buf = Unpooled.buffer();
        write(buf);
        return buf.array();
    }

    public static LivingEntityTracker fromByteArray(byte[] bytes, Supplier<World> world) {
        ByteBuf buf = Unpooled.wrappedBuffer(bytes);
        LivingEntityTracker tracker = new LivingEntityTracker(world);
        if (bytes != null && bytes.length > 0) {
            tracker.init(buf);
        } else {
            LOG.warn("Cannot deserialize tracker from empty byte array");
        }
        return tracker;
    }

    public static LivingEntityTracker read(ByteBuf buf /*, World world*/) {
        LivingEntityTracker tracker = new LivingEntityTracker(() -> MC.player.world);
        tracker.init(buf);
        return tracker;
    }


}
