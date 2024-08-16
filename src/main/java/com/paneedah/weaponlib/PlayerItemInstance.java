package com.paneedah.weaponlib;

import com.paneedah.mwc.network.TypeRegistry;
import com.paneedah.mwc.network.UniversalObject;
import com.paneedah.weaponlib.perspective.Perspective;
import com.paneedah.weaponlib.state.ExtendedState;
import com.paneedah.weaponlib.state.ManagedState;
import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import static com.paneedah.mwc.ProjectConstants.LOGGER;

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
        this.item = itemStack.getItem();
    }

    public PlayerItemInstance(int itemInventoryIndex, EntityLivingBase player, ItemStack itemStack) {
        this.itemInventoryIndex = itemInventoryIndex;
        this.player = player;
        //this.itemStack = itemStack;
        this.item = itemStack.getItem();
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

    // ! This in the past was weirder, and I never really got how it worked,
    // ! https://github.com/Cubed-Development/Modern-Warfare-Cubed/blob/d3ddec618657e42a20e7bee8768ca2d60ae231d3/src/main/java/com/paneedah/weaponlib/PlayerItemInstance.java#L101-L110
    // ! it caused problems so I just nuked it,
    // ! it seems to work fine still so ¯\_(ツ)_/¯ - Luna Lage 2024-08-15
    @Override
    public boolean setState(S state) {
        this.state = state;
        stateUpdateTimestamp = System.currentTimeMillis();

        markDirty();

        if (preparedState != null) {
            LOGGER.debug("Committing state {} to {}", preparedState.getState(), preparedState.getState().commitPhase());
            updateWith(preparedState, false);

            preparedState = null;
        }

        return false;
    }

    /**
     * Commits pending state
     */
    protected void updateWith(PlayerItemInstance<S> otherState, boolean updateManagedState) {
        if (updateManagedState) {
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

    public Class<? extends Perspective<?>> getRequiredPerspectiveType() {
        return null;
    }

    protected void reconcile() {
        // Currently no op in this class, mainly meant to be implemented in subclasses
        // Meant to be used to reconcile instances between server and client
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
