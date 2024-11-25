package com.paneedah.mwc.instancing;

import com.paneedah.weaponlib.ItemMagazine;
import com.paneedah.weaponlib.MagazineState;
import lombok.NoArgsConstructor;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

/**
 * @author Luna Mira Lage (Desoroxxx)
 * @since 0.2
 */
@NoArgsConstructor
public class PlayerMagazineInstance extends PlayerItemInstance<MagazineState> {

    public PlayerMagazineInstance(final int itemInventoryIndex, final EntityLivingBase player, final ItemStack itemStack) {
        super(itemInventoryIndex, player, itemStack);
    }

    // region Getters

    @Override
    public boolean shouldHaveInstanceTags() {
        return false;
    }

    public ItemMagazine getMagazine() {
        return (ItemMagazine) item;
    }

    // endregion
}
