package com.paneedah.weaponlib.electronics;

import com.paneedah.mwc.network.TypeRegistry;
import com.paneedah.weaponlib.PlayerItemInstance;
import com.paneedah.weaponlib.perspective.Perspective;
import com.paneedah.weaponlib.perspective.WirelessCameraPerspective;
import com.paneedah.weaponlib.tracking.LivingEntityTracker;
import io.netty.buffer.ByteBuf;
import lombok.Getter;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

import static com.paneedah.mwc.ProjectConstants.LOGGER;

@Getter
public class PlayerTabletInstance extends PlayerItemInstance<TabletState> {

    private static final int SERIAL_VERSION = 1;

    static {
        TypeRegistry.getINSTANCE().register(PlayerTabletInstance.class);
    }

    private int activeWatchIndex;

    public PlayerTabletInstance() {
        super();
    }

    public PlayerTabletInstance(int itemInventoryIndex, EntityLivingBase player, ItemStack itemStack) {
        super(itemInventoryIndex, player, itemStack);
    }

    public PlayerTabletInstance(int itemInventoryIndex, EntityLivingBase player) {
        super(itemInventoryIndex, player);
    }

    @Override
    public Class<? extends Perspective<?>> getRequiredPerspectiveType() {
        return WirelessCameraPerspective.class;
    }

    @Override
    public void write(ByteBuf byteBuf) {
        super.write(byteBuf);
        byteBuf.writeInt(activeWatchIndex);
    }

    public void setActiveWatchIndex(int activeWatchIndex) {
        if (this.activeWatchIndex != activeWatchIndex) {
            LOGGER.debug("Changing active watch index to {}", Integer.valueOf(activeWatchIndex));
            this.activeWatchIndex = activeWatchIndex;
            markDirty();
        }
    }

    @Override
    public void read(ByteBuf byteBuf) {
        super.read(byteBuf);
        activeWatchIndex = byteBuf.readInt();
    }

    @Override
    protected int getSerialVersion() {
        return SERIAL_VERSION;
    }

    public void nextActiveWatchIndex() {
        LivingEntityTracker tracker = LivingEntityTracker.getTracker(player);
        if (tracker != null) {
            if (activeWatchIndex >= tracker.getTrackableEntitites().size() - 1) {
                setActiveWatchIndex(0);
            } else {
                setActiveWatchIndex(activeWatchIndex + 1);
            }
        }
    }


    public void previousActiveWatchIndex() {
        LivingEntityTracker tracker = LivingEntityTracker.getTracker(player);
        if (tracker != null) {
            if (activeWatchIndex == 0) {
                setActiveWatchIndex(tracker.getTrackableEntitites().size() - 1);
            } else {
                setActiveWatchIndex(activeWatchIndex - 1);
            }
        }
    }


    @Override
    public String toString() {
        return "Tablet [" + getUuid() + "]";
    }

}
