package com.paneedah.weaponlib;

import com.paneedah.mwc.network.TypeRegistry;
import com.paneedah.mwc.network.UniversalObject;
import com.paneedah.weaponlib.perspective.Perspective;
import com.paneedah.weaponlib.state.ExtendedState;
import com.paneedah.weaponlib.state.ManagedState;
import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import static com.paneedah.mwc.ProjectConstants.LOGGER;

@NoArgsConstructor
public class PlayerItemInstance<S extends ManagedState<S>> extends UniversalObject implements ExtendedState<S> {

    protected boolean compoundMagSwapCompleted = false;

    @Getter @Setter protected int itemInventoryIndex;

    public long syncStartTimestamp; // ? This needs to be 0 for #reconcile to be called by the ClientEventHandler
    @Getter protected long updateTimestamp;
    @Getter protected long stateUpdateTimestamp = System.currentTimeMillis();
    @Getter protected long reloadUpdateTimestamp;
    @Getter private long updateId; // ? If 0 the instance is newly created and should be synced to the server

    @Getter protected S state;
    @Getter @Setter protected EntityLivingBase player;
    @Getter protected Item item;
    private PlayerItemInstance<S> preparedState;

//	private Set<PlayerItemStateListener<S>> listeners = new HashSet<>();

    public PlayerItemInstance(int itemInventoryIndex, EntityLivingBase player) {
        this(itemInventoryIndex, player, player.getHeldItemMainhand());
    }

    public PlayerItemInstance(int itemInventoryIndex, EntityLivingBase player, ItemStack itemStack) {
        this.itemInventoryIndex = itemInventoryIndex;
        this.player = player;
        item = itemStack.getItem();
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

//        state = WeaponState.DRAWING;

        state = TypeRegistry.read(byteBuf);
    }

    @Override
    public void write(ByteBuf byteBuf) {
        super.write(byteBuf);

        byteBuf.writeInt(Item.getIdFromItem(item));
        byteBuf.writeInt(itemInventoryIndex);

        byteBuf.writeLong(updateId);

        TypeRegistry.write(state, byteBuf);
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
        if (updateManagedState)
            setState(otherState.getState());
    }

    public void markReloadDirt() {
        reloadUpdateTimestamp = System.currentTimeMillis();
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
        preparedState = (PlayerItemInstance<S>) preparedExtendedState;
    }

    public void completeMagSwap() {
        compoundMagSwapCompleted = true;
    }

    public void markMagSwapReady() {
        compoundMagSwapCompleted = false;
    }

    public boolean isMagSwapDone() {
        return compoundMagSwapCompleted;
    }

    public Class<? extends Perspective<?>> getRequiredPerspectiveType() {
        return null;
    }

    protected void reconcile() {
        // Currently no op in this class, mainly meant to be implemented in subclasses
        // Meant to be used to reconcile instances between server and client
    }

}
