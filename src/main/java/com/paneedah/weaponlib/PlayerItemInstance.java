package com.paneedah.weaponlib;

import com.paneedah.mwc.network.TypeRegistry;
import com.paneedah.mwc.network.UniversalObject;
import com.paneedah.mwc.rendering.perspective.Perspective;
import com.paneedah.weaponlib.state.ExtendedState;
import com.paneedah.weaponlib.state.ManagedState;
import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import static com.paneedah.mwc.utils.ModReference.LOG;

public class PlayerItemInstance<S extends ManagedState<S>> extends UniversalObject implements ExtendedState<S> {

    static {
        TypeRegistry.getINSTANCE().register(PlayerItemInstance.class);
        TypeRegistry.getINSTANCE().register(PlayerWeaponInstance.class);
    }

    protected S state;
    protected long stateUpdateTimestamp = System.currentTimeMillis();
    @Getter private long updateId;
    @Getter @Setter protected EntityLivingBase player;
    @Getter protected Item item;
    @Getter @Setter protected int itemInventoryIndex;
    private PlayerItemInstance<S> preparedState;
    @Getter private long syncStartTimestamp;
    @Getter protected long updateTimestamp;

    protected long reloadUpdateTimestamp;
    protected boolean compoundMagSwapCompleted = false;

//	private Set<PlayerItemStateListener<S>> listeners = new HashSet<>();

    public PlayerItemInstance() {}

    public PlayerItemInstance(int itemInventoryIndex, EntityLivingBase player) {
        this.itemInventoryIndex = itemInventoryIndex;
        this.player = player;
        ItemStack itemStack = player.getHeldItemMainhand();
        if (itemStack != null) {
            this.item = itemStack.getItem();
        }
    }

    public PlayerItemInstance(int itemInventoryIndex, EntityLivingBase player, ItemStack itemStack) {
        this.itemInventoryIndex = itemInventoryIndex;
        this.player = player;
        //this.itemStack = itemStack;
        if (itemStack != null) {
            this.item = itemStack.getItem();
        }
    }

    public ItemStack getItemStack() {
        return player instanceof EntityPlayer ? ((EntityPlayer) player).inventory.getStackInSlot(itemInventoryIndex) : null;
    }

    protected <T extends PlayerItemInstance<S>> T getPreparedState() {
        return (T) preparedState;
    }

    public boolean shouldHaveInstanceTags() {
        return true;
    }

    @Override
    public void read(ByteBuf byteBuf) {
        super.read(byteBuf);
        item = Item.getItemById(byteBuf.readInt());
        itemInventoryIndex = byteBuf.readInt();
        updateId = byteBuf.readLong();

        //state = WeaponState.DRAWING;
        state = TypeRegistry.getINSTANCE().fromBytes(byteBuf);


    }

    @Override
    public void write(ByteBuf byteBuf) {
        super.write(byteBuf);
        byteBuf.writeInt(Item.getIdFromItem(item));
        byteBuf.writeInt(itemInventoryIndex);
        byteBuf.writeLong(updateId);
        TypeRegistry.getINSTANCE().toBytes(state, byteBuf);
    }

    @Override
    public boolean setState(S state) {
        this.state = state;
        stateUpdateTimestamp = System.currentTimeMillis();

        markDirty();

        if (preparedState != null) { // TODO: use comparator or equals?
            if (preparedState.getState().commitPhase() == state) {
                LOG.debug("Committing state {} to {}", preparedState.getState(), preparedState.getState().commitPhase());
                updateWith(preparedState, false);
            } else {
                rollback();
            }

            preparedState = null;
        } else
            LOG.warn("Prepared state is null for PlayerItemInstance: {}", this);

        return false;
    }

    protected void rollback() {
        LOG.warn("Attempted rolling back, but this method is empty. State: {}, Prepared State: {}, Prepared State State: {}, Prepared State State Commit Phase: {}", state, preparedState, preparedState.getState(), preparedState.getState().commitPhase());
    }

    /**
     * Commits pending state
     */
    protected void updateWith(PlayerItemInstance<S> otherState, boolean updateManagedState) {
        if (updateManagedState)
            setState(otherState.getState());
    }

    @Override
    public S getState() {
        return state;
    }

    @Override
    public long getStateUpdateTimestamp() {
        return stateUpdateTimestamp;
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

    public Perspective getRequiredPerspectiveType() {
        return null;
    }

    protected void reconcile() {
        LOG.warn("Reconciling PlayerItemInstance: {}, but this method is empty", this);
    }

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
