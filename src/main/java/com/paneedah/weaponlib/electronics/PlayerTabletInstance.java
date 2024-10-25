package com.paneedah.weaponlib.electronics;

import com.paneedah.weaponlib.PlayerItemInstance;
import com.paneedah.weaponlib.perspective.Perspective;
import com.paneedah.weaponlib.perspective.WirelessCameraPerspective;
import com.paneedah.weaponlib.tracking.LivingEntityTracker;
import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

import static com.paneedah.mwc.ProjectConstants.LOGGER;

@NoArgsConstructor
public class PlayerTabletInstance extends PlayerItemInstance<TabletState> {

    @Getter private int activeWatchIndex;

    public PlayerTabletInstance(final int itemInventoryIndex, final EntityLivingBase player) {
        super(itemInventoryIndex, player);
    }

    public PlayerTabletInstance(final int itemInventoryIndex, final EntityLivingBase player, final ItemStack itemStack) {
        super(itemInventoryIndex, player, itemStack);
    }

    @Override
    protected int getSerialVersion() {
        return 1;
    }

    @Override
    public Class<? extends Perspective<?>> getRequiredPerspectiveType() {
        return WirelessCameraPerspective.class;
    }

    public void previousActiveWatchIndex() {
        final LivingEntityTracker tracker = LivingEntityTracker.getTracker(player);
        if (tracker == null)
            return;

        if (activeWatchIndex == 0) {
            setActiveWatchIndex(tracker.getTrackableEntitites().size() - 1);
        } else {
            setActiveWatchIndex(activeWatchIndex - 1);
        }
    }

    public void nextActiveWatchIndex() {
        final LivingEntityTracker tracker = LivingEntityTracker.getTracker(player);
        if (tracker == null)
            return;

        if (activeWatchIndex >= tracker.getTrackableEntitites().size() - 1) {
            setActiveWatchIndex(0);
        } else {
            setActiveWatchIndex(activeWatchIndex + 1);
        }
    }

    public void setActiveWatchIndex(final int activeWatchIndex) {
        if (this.activeWatchIndex == activeWatchIndex)
            return;

        LOGGER.debug("Changing {} active watch index to {}", toString(), activeWatchIndex);

        this.activeWatchIndex = activeWatchIndex;

        markDirty();
    }

    // region Serialization and Deserialization

    @Override
    public void write(final ByteBuf byteBuf) {
        super.write(byteBuf);

        byteBuf.writeInt(activeWatchIndex);
    }

    @Override
    public void read(final ByteBuf byteBuf) {
        super.read(byteBuf);

        activeWatchIndex = byteBuf.readInt();
    }

    // endregion
}
