package com.paneedah.weaponlib;

import lombok.NoArgsConstructor;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

@NoArgsConstructor
public class PlayerMagazineInstance extends PlayerItemInstance<MagazineState> {

    public PlayerMagazineInstance(final int itemInventoryIndex, final EntityLivingBase player, final ItemStack itemStack) {
        super(itemInventoryIndex, player, itemStack);
    }

    // region Getters

    @Override
    public boolean shouldHaveInstanceTags() { // ! INSTANCE_TAG TODO: NO, serialized data should not just be throw as a big buffer array in a single tag for NBT. The typeRegistry should not be used for NBT!
        return false;
    }

    public ItemMagazine getMagazine() {
        return (ItemMagazine) item;
    }

    // endregion
}
