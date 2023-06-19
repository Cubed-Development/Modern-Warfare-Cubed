package com.paneedah.weaponlib.electronics;

import com.paneedah.weaponlib.PlayerItemInstance;
import com.paneedah.weaponlib.network.TypeRegistry;
import com.paneedah.weaponlib.perspective.Perspective;
import com.paneedah.weaponlib.perspective.WirelessCameraPerspective;
import com.paneedah.weaponlib.tracking.PlayerEntityTracker;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

import static com.paneedah.mwc.utils.ModReference.LOG;

public class PlayerTabletInstance extends PlayerItemInstance<TabletState> {
	
	private static final int SERIAL_VERSION = 1;
	static {
		TypeRegistry.getInstance().register(PlayerTabletInstance.class);
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
	public void serialize(ByteBuf buf) {
	    super.serialize(buf);
	    buf.writeInt(activeWatchIndex);
	}
	
	public void setActiveWatchIndex(int activeWatchIndex) {
	    if(this.activeWatchIndex != activeWatchIndex) {
	        LOG.debug("Changing active watch index to {}", activeWatchIndex);
	        this.activeWatchIndex = activeWatchIndex;
	        markDirty();
	    }
    }
	
	public int getActiveWatchIndex() {
        return activeWatchIndex;
    }
	
	@Override
	public void init(ByteBuf buf) {
	    super.init(buf);
	    activeWatchIndex = buf.readInt();
	}
	
	@Override
	protected int getSerialVersion() {
		return SERIAL_VERSION;
	}

    public void nextActiveWatchIndex() {
        PlayerEntityTracker tracker = PlayerEntityTracker.getTracker(player);
        if(tracker != null) {
            if(activeWatchIndex >= tracker.getTrackableEntitites().size() - 1) {
                setActiveWatchIndex(0);
            } else {
                setActiveWatchIndex(activeWatchIndex + 1);
            }
        }
    }
    

    public void previousActiveWatchIndex() {
        PlayerEntityTracker tracker = PlayerEntityTracker.getTracker(player);
        if(tracker != null) {
            if(activeWatchIndex == 0) {
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
