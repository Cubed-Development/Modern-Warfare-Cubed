package com.paneedah.weaponlib;

import com.paneedah.weaponlib.network.TypeRegistry;
import com.paneedah.weaponlib.network.UniversalObject;
import com.paneedah.weaponlib.perspective.Perspective;
import com.paneedah.weaponlib.state.ExtendedState;
import com.paneedah.weaponlib.state.ManagedState;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import static com.paneedah.mwc.utils.ModReference.LOG;

public class PlayerItemInstance<S extends ManagedState<S>> extends UniversalObject implements ExtendedState<S>, PlayerContext {

	static {
		TypeRegistry.getInstance().register(PlayerItemInstance.class);
		TypeRegistry.getInstance().register(PlayerWeaponInstance.class);
	}

	protected S state;
	protected long stateUpdateTimestamp = System.currentTimeMillis();
	private long updateId;
	protected EntityLivingBase player;
	protected Item item;
	protected int itemInventoryIndex;
	private PlayerItemInstance<S> preparedState;
	private long syncStartTimestamp;
	protected long updateTimestamp;
	
	protected long reloadUpdateTimestamp;
	protected boolean compoundMagSwapCompleted = false;

//	private Set<PlayerItemStateListener<S>> listeners = new HashSet<>();

	public PlayerItemInstance() {}

	public PlayerItemInstance(int itemInventoryIndex, EntityLivingBase player) {
		this.itemInventoryIndex = itemInventoryIndex;
		this.player = player;
		ItemStack itemStack = player.getHeldItemMainhand();
		if(itemStack != null) {
			this.item = itemStack.getItem();
		}
	}

	public PlayerItemInstance(int itemInventoryIndex, EntityLivingBase player, ItemStack itemStack) {
		this.itemInventoryIndex = itemInventoryIndex;
		this.player = player;
		//this.itemStack = itemStack;
		if(itemStack != null) {
			this.item = itemStack.getItem();
		}
	}

	@Override
	public EntityLivingBase getPlayer() {
		return player;
	}

	@Override
	public void setPlayer(EntityLivingBase player) {
		this.player = player;
	}

	public Item getItem() {
		return item;
	}

	public ItemStack getItemStack() {
		return player instanceof EntityPlayer ? ((EntityPlayer)player).inventory.getStackInSlot(itemInventoryIndex) : null;
	}

	public int getItemInventoryIndex() {
		return itemInventoryIndex;
	}

	protected void setItemInventoryIndex(int itemInventoryIndex) {
		this.itemInventoryIndex = itemInventoryIndex;
	}

	@SuppressWarnings("unchecked")
	protected <T extends PlayerItemInstance<S>> T getPreparedState() {
		return (T)preparedState;
	}
	
	public boolean shouldHaveInstanceTags() {
		return true;
	}

	@Override
	public void init(ByteBuf buf) {
		super.init(buf);
		item = Item.getItemById(buf.readInt());
		itemInventoryIndex = buf.readInt();
		updateId = buf.readLong();

		//state = WeaponState.DRAWING;
		state = TypeRegistry.getInstance().fromBytes(buf);
		
		
	}

	@Override
	public void serialize(ByteBuf buf) {
		super.serialize(buf);
		buf.writeInt(Item.getIdFromItem(item));
		buf.writeInt(itemInventoryIndex);
		buf.writeLong(updateId);
		TypeRegistry.getInstance().toBytes(state, buf);
		
		
	}

	@Override
	public boolean setState(S state) {
		
		
		this.state = state;
		stateUpdateTimestamp = System.currentTimeMillis();
		
		
		
		markDirty();
		if(preparedState != null) { // TODO: use comparator or equals?
			if(preparedState.getState().commitPhase() == state) {
				LOG.debug("Committing state {} to {}", preparedState.getState(),
						preparedState.getState().commitPhase());
				updateWith(preparedState, false);
			} else {
				rollback();
			}

			preparedState = null;
		}
		return false;
	}

	protected void rollback() {
	}

	/**
	 * Commits pending state
	 */
	protected void updateWith(PlayerItemInstance<S> otherState, boolean updateManagedState) {
		if(updateManagedState) {
			
			setState(otherState.getState());
		}
	}

	@Override
	public S getState() {
		
		
		
		
		return state;
	}

	@Override
	public long getStateUpdateTimestamp() {
		return stateUpdateTimestamp;
	}

	public long getUpdateId() {
		return updateId;
	}
	
	public long getUpdateTimestamp() {
        return updateTimestamp;
    }
	
	public void markReloadDirt() {
		reloadUpdateTimestamp = System.currentTimeMillis();
	}
	
	public long getReloadTimestamp() {
		return this.reloadUpdateTimestamp;
	}

	protected void markDirty() {
		updateId++;
		updateTimestamp = System.currentTimeMillis();
	}
	
	protected void markClean() {
	    updateId = 0;
	}

	@Override
	public <E extends ExtendedState<S>> void prepareTransaction(E preparedExtendedState) {
		
		setState(preparedExtendedState.getState());
		this.preparedState = (PlayerItemInstance<S>) preparedExtendedState;
	}

	public long getSyncStartTimestamp() {
		return syncStartTimestamp;
	}
	
	public void completeMagSwap() {
		this.compoundMagSwapCompleted = true;
	}
	
	public void markMagSwapReady() {
		this.compoundMagSwapCompleted = false;
	}
	
	public boolean isMagSwapDone() {
		return this.compoundMagSwapCompleted;
	}

	public void setSyncStartTimestamp(long syncStartTimestamp) {
		this.syncStartTimestamp = syncStartTimestamp;
	}

    public Class<? extends Perspective<?>> getRequiredPerspectiveType() {
        return null;
    }

    protected void reconcile() {}

//    public View<?> createView() {
//        return null;
//    }

//	public void addListener(PlayerItemStateListener<S> listener) {
//		listeners.add(listener);
//	}
//
//	public void removeListener(PlayerItemStateListener<S> listener) {
//		listeners.remove(listener);
//	}
//
//	protected void notifyListeners() {
//		listeners.forEach(l -> l.stateChanged(this));
//	}

}
