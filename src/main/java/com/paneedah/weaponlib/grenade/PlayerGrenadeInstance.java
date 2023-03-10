package com.paneedah.weaponlib.grenade;

import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.network.TypeRegistry;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;


public class PlayerGrenadeInstance extends PlayerItemInstance<GrenadeState> {

	private static final int SERIAL_VERSION = 11;

	static {
		TypeRegistry.getInstance().register(PlayerGrenadeInstance.class);
	}

	private int ammo;
	private long activationTimestamp;

	private Deque<AsyncGrenadeState> filteredStateQueue = new LinkedBlockingDeque<>();
	private int[] activeAttachmentIds = new int[0];
	private byte[] selectedAttachmentIndexes = new byte[0];

    private long lastSafetyPinAlertTimestamp;

    private boolean throwingFar;

	public PlayerGrenadeInstance() {
		super();
	}

	public PlayerGrenadeInstance(int itemInventoryIndex, EntityLivingBase player, ItemStack itemStack) {
		super(itemInventoryIndex, player, itemStack);
	}

	public PlayerGrenadeInstance(int itemInventoryIndex, EntityLivingBase player) {
		super(itemInventoryIndex, player);
	}

	@Override
	protected int getSerialVersion() {
		return SERIAL_VERSION;
	}

	private void addStateToHistory(GrenadeState state) {
	    AsyncGrenadeState t;
		// Remove existing items from lower priorities from the top of the stack; stop when same or higher priority item is found
		while((t = filteredStateQueue.peekFirst()) != null) {
			if(t.getState().getPriority() < state.getPriority()) {
				filteredStateQueue.pollFirst();
			} else {
				break;
			}
		}

		long expirationTimeout = 500;

		filteredStateQueue.addFirst(new AsyncGrenadeState(state, this.stateUpdateTimestamp, expirationTimeout));
	}

	@Override
	public boolean setState(GrenadeState state) {
		boolean result = super.setState(state);
		addStateToHistory(state);
		return result;
	}

	public AsyncGrenadeState nextHistoryState() {
	    AsyncGrenadeState result = filteredStateQueue.pollLast();
		if(result == null) {
		    result = new AsyncGrenadeState(getState(), stateUpdateTimestamp);
		}
		return result;
	}

	public int getAmmo() {
		return ammo;
	}

	protected void setAmmo(int ammo) {
		if(ammo != this.ammo) {
			this.ammo = ammo;
			markDirty();
		}
	}

	@Override
	public void init(ByteBuf buf) {
		super.init(buf);
		throwingFar = buf.readBoolean();
		activeAttachmentIds = initIntArray(buf);
		selectedAttachmentIndexes = initByteArray(buf);
	}

	@Override
	public void serialize(ByteBuf buf) {
		super.serialize(buf);
		buf.writeBoolean(throwingFar);
		serializeIntArray(buf, activeAttachmentIds);
		serializeByteArray(buf, selectedAttachmentIndexes);
	}

	private static void serializeIntArray(ByteBuf buf, int a[]) {
		buf.writeByte(a.length);
		for(int i = 0; i < a.length; i++) {
			buf.writeInt(a[i]);
		}
	}

	private static void serializeByteArray(ByteBuf buf, byte a[]) {
		buf.writeByte(a.length);
		for(int i = 0; i < a.length; i++) {
			buf.writeByte(a[i]);
		}
	}

	private static int[] initIntArray(ByteBuf buf) {
		int length = buf.readByte();
		int a[] = new int[length];
		for(int i = 0; i < length; i++) {
			a[i] = buf.readInt();
		}
		return a;
	}

	private static byte[] initByteArray(ByteBuf buf) {
		int length = buf.readByte();
		byte a[] = new byte[length];
		for(int i = 0; i < length; i++) {
			a[i] = buf.readByte();
		}
		return a;
	}

	@Override
	protected void updateWith(PlayerItemInstance<GrenadeState> otherItemInstance, boolean updateManagedState) {
		super.updateWith(otherItemInstance, updateManagedState);
		PlayerGrenadeInstance otherWeaponInstance = (PlayerGrenadeInstance) otherItemInstance;

		setAmmo(otherWeaponInstance.ammo);
		setSelectedAttachmentIndexes(otherWeaponInstance.selectedAttachmentIndexes);
		setActiveAttachmentIds(otherWeaponInstance.activeAttachmentIds);
	}

	public ItemGrenade getWeapon() {
		return (ItemGrenade)item;
	}

	public long getActivationTimestamp() {
		return activationTimestamp;
	}

	void setActivationTimestamp(long activationTimestamp) {
		this.activationTimestamp = activationTimestamp;
	}

	public int[] getActiveAttachmentIds() {
		if(activeAttachmentIds == null || activeAttachmentIds.length != AttachmentCategory.values.length) {
			activeAttachmentIds = new int[AttachmentCategory.values.length];
			for(CompatibleAttachment<ItemGrenade> attachment: getWeapon().getCompatibleAttachments().values()) {
				if(attachment.isDefault()) {
					activeAttachmentIds[attachment.getAttachment().getCategory().ordinal()] = Item.getIdFromItem(attachment.getAttachment());
				}
			}
		}
		return activeAttachmentIds;
	}

	void setActiveAttachmentIds(int[] activeAttachmentIds) {
		if(!Arrays.equals(this.activeAttachmentIds, activeAttachmentIds)) {
			this.activeAttachmentIds = activeAttachmentIds;
			markDirty();
		}
	}

	public byte[] getSelectedAttachmentIds() {
		return selectedAttachmentIndexes;
	}

	void setSelectedAttachmentIndexes(byte[] selectedAttachmentIndexes) {
		if(!Arrays.equals(this.selectedAttachmentIndexes, selectedAttachmentIndexes)) {
			this.selectedAttachmentIndexes = selectedAttachmentIndexes;
			markDirty();
		}
	}

	@SuppressWarnings("unchecked")
	public ItemAttachment<ItemGrenade> getAttachmentItemWithCategory(AttachmentCategory category) {
		if(activeAttachmentIds == null || activeAttachmentIds.length <= category.ordinal()) {
			return null;
		}
		Item scopeItem = Item.getItemById(activeAttachmentIds[category.ordinal()]);
		return (ItemAttachment<ItemGrenade>) scopeItem;
	}

    public List<CompatibleAttachment<? extends AttachmentContainer>> getActiveAttachments(RenderContext<RenderableState> renderContext, boolean attached) {
        int[] activeIds = getActiveAttachmentIds();
        List<CompatibleAttachment<? extends AttachmentContainer>> result = new ArrayList<>();
        for(int i = 0; i < activeIds.length; i++) {
            if(activeIds[i] == 0) continue;
            Item item = Item.getItemById(activeIds[i]);
            if(item instanceof ItemAttachment) {
                CompatibleAttachment<? extends AttachmentContainer> compatibleAttachment = getWeapon().getCompatibleAttachments().get(item);
                if(compatibleAttachment != null) {
                    result.add(compatibleAttachment);
                }
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return getWeapon().builder.name + "[" + getUuid() + "]";
    }

    public long getLastSafetyPinAlertTimestamp() {
        return lastSafetyPinAlertTimestamp;
    }

    public void setLastSafetyPinAlertTimestamp(long lastSafetyPinAlertTimestamp) {
        this.lastSafetyPinAlertTimestamp = lastSafetyPinAlertTimestamp;
    }

    public void setThrowingFar(boolean throwingFar) {
        this.throwingFar = throwingFar;
    }

    public boolean isThrowingFar() {
        return throwingFar;
    }
}
