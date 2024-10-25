package com.paneedah.weaponlib;

import lombok.NoArgsConstructor;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

@NoArgsConstructor
public class PlayerMagazineInstance extends PlayerItemInstance<MagazineState> {

    public PlayerMagazineInstance(final int itemInventoryIndex, final EntityLivingBase player) {
        super(itemInventoryIndex, player);
    }

    public PlayerMagazineInstance(final int itemInventoryIndex, final EntityLivingBase player, final ItemStack itemStack) {
        super(itemInventoryIndex, player, itemStack);
    }

    @Override
    public boolean shouldHaveInstanceTags() {
        return false;
    }

    public ItemMagazine getMagazine() {
        return (ItemMagazine) item;
    }
}
