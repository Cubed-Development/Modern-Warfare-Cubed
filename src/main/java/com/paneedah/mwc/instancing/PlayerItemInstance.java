package com.paneedah.mwc.instancing;

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
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.ProjectConstants.LOGGER;
import static net.minecraftforge.fml.relauncher.Side.CLIENT;

@NoArgsConstructor
public class PlayerItemInstance<S extends ManagedState<S>> extends UniversalObject implements ExtendedState<S> {

    @Getter @Setter protected int itemInventoryIndex;

    public long syncStartTimestamp; // ? This needs to be 0 for #reconcile to be called by the ClientEventHandler
    @Getter protected long updateTimestamp;
    @Getter protected long stateUpdateTimestamp = System.currentTimeMillis();
    @Getter private long updateId; // ? If 0 the instance is newly created and should be synced to the server

    @Getter @Setter protected EntityLivingBase player;
    @Getter protected Item item;
    @Getter protected S state;
    private PlayerItemInstance<S> preparedState;

    public PlayerItemInstance(final int itemInventoryIndex, final EntityLivingBase player, final ItemStack itemStack) {
        this.itemInventoryIndex = itemInventoryIndex;
        this.player = player;
        item = itemStack.getItem();
    }

    /**
     * Commits pending state
     */
    protected void updateWith(final PlayerItemInstance<S> otherState, final boolean updateManagedState) {
        if (updateManagedState)
            setState(otherState.getState());
    }

    @Override
    public <E extends ExtendedState<S>> void prepareTransaction(final E preparedExtendedState) {
        setState(preparedExtendedState.getState());

        preparedState = (PlayerItemInstance<S>) preparedExtendedState;
    }

    @SideOnly(CLIENT)
    public Class<? extends Perspective<?>> getRequiredPerspectiveType() {
        return null;
    }

    protected void reconcile() {
        // Currently no op in this class, mainly meant to be implemented in subclasses
        // Meant to be used to reconcile instances between server and client
    }

    @Override
    public String toString() {
        return item.getRegistryName() + "[" + getUuid() + "]";
    }

    protected void markDirty() {
        updateId++;
        updateTimestamp = System.currentTimeMillis();
    }

    protected void markClean() {
        updateId = 0;
    }
    
    // region Getters

    public ItemStack getItemStack() {
        return player instanceof EntityPlayer ? ((EntityPlayer) player).inventory.getStackInSlot(itemInventoryIndex) : null;
    }

    public boolean shouldHaveInstanceTags() { // ! INSTANCE_TAG TODO: NO, serialized data should not just be throw as a big buffer array in a single tag for NBT. The typeRegistry should not be used for NBT!
        return true;
    }

    // endregion
    
    // region Setters

    // ! This in the past was weirder, and I never really got how it worked,
    // ! https://github.com/Cubed-Development/Modern-Warfare-Cubed/blob/d3ddec618657e42a20e7bee8768ca2d60ae231d3/src/main/java/com/paneedah/weaponlib/PlayerItemInstance.java#L101-L110
    // ! it caused problems so I just nuked it,
    // ! it seems to work fine still so ¯\_(ツ)_/¯ - Luna Lage 2024-08-15
    @Override
    public boolean setState(final S state) {
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

    // endregion

    // ! INSTANCE_TAG TODO: Once NBT does not use serialized data, improve serialization
    // region Serialization & Deserialization

    @Override
    public void read(final ByteBuf byteBuf) {
        super.read(byteBuf);

        item = Item.getItemById(byteBuf.readInt());
        itemInventoryIndex = byteBuf.readInt();

        updateId = byteBuf.readLong();

        state = TypeRegistry.read(byteBuf);
    }

    @Override
    public void write(final ByteBuf byteBuf) {
        super.write(byteBuf);

        byteBuf.writeInt(Item.getIdFromItem(item));
        byteBuf.writeInt(itemInventoryIndex);

        byteBuf.writeLong(updateId);

        TypeRegistry.write(byteBuf, state);
    }

    protected static int[] readIntArray(final ByteBuf byteBuf) {
        final int length = byteBuf.readByte();

        final int[] array = new int[length];
        for (int i = 0; i < length; i++)
            array[i] = byteBuf.readInt();

        return array;
    }

    protected static byte[] readByteArray(final ByteBuf byteBuf) {
        final int length = byteBuf.readByte();

        final byte[] array = new byte[length];
        for (int i = 0; i < length; i++)
            array[i] = byteBuf.readByte();

        return array;
    }

    protected static void writeIntArray(final ByteBuf byteBuf, final int[] array) {
        byteBuf.writeByte(array.length);

        for (final int i : array)
            byteBuf.writeInt(i);
    }

    protected static void writeByteArray(final ByteBuf byteBuf, final byte[] array) {
        byteBuf.writeByte(array.length);

        for (final byte b : array)
            byteBuf.writeByte(b);
    }

    // endregion
}
