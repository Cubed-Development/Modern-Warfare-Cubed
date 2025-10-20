package com.paneedah.mwc.instancing;

import com.paneedah.weaponlib.ItemBullet;
import com.paneedah.weaponlib.ItemMagazine;
import com.paneedah.weaponlib.MagazineState;
import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import java.util.List;

/**
 * @author Luna Mira Lage (Desoroxxx)
 * @since 0.2
 */
@NoArgsConstructor
public class PlayerMagazineInstance extends PlayerItemInstance<MagazineState> {

    private static final String AMMO_TAG = "AMMO";

    @Getter @Setter private short ammo;

    public PlayerMagazineInstance(final int itemInventoryIndex, final EntityLivingBase player, final ItemStack itemStack) {
        super(itemInventoryIndex, player, itemStack);
    }

    // region Getters

    public ItemMagazine getMagazine() {
        return (ItemMagazine) item;
    }

    public short getCapacity() {
        return getMagazine().getCapacity();
    }

    public List<ItemBullet> getCompatibleBullets() {
        return getMagazine().getCompatibleBullets();
    }

    // endregion

    // region NBT

    @Override
    public void readInstanceFromNBT(final NBTTagCompound tagCompound) {
        super.readInstanceFromNBT(tagCompound);

        ammo = tagCompound.getShort(AMMO_TAG);
    }

    @Override
    public void writeInstanceToNBT(final NBTTagCompound tagCompound) {
        super.writeInstanceToNBT(tagCompound);

        tagCompound.setShort(AMMO_TAG, ammo);
    }

    // endregion

    // region Serialization & Deserialization

    @Override
    public void read(final ByteBuf byteBuf) {
        super.read(byteBuf);

        ammo = byteBuf.readShort();
    }

    @Override
    public void write(final ByteBuf byteBuf) {
        super.write(byteBuf);

        byteBuf.writeShort(ammo);
    }

    // endregion
}
