package com.paneedah.mwc.instancing;

import com.paneedah.weaponlib.electronics.HandheldState;
import com.paneedah.weaponlib.electronics.ItemHandheld;
import com.paneedah.weaponlib.perspective.Perspective;
import lombok.NoArgsConstructor;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

/**
 * @author Luna Mira Lage (Desoroxxx)
 * @since 0.2
 */
@NoArgsConstructor
public class PlayerHandheldInstance extends PlayerItemInstance<HandheldState> {

    public PlayerHandheldInstance(final int itemInventoryIndex, final EntityLivingBase player, final ItemStack itemStack) {
        super(itemInventoryIndex, player, itemStack);
    }

    @Override
    protected int getSerialVersion() {
        return 1;
    }

    @Override
    public Class<? extends Perspective<?>> getRequiredPerspectiveType() {
        return item != null ? ((ItemHandheld<?>) item).getRequiredPespectiveType() : null;
    }
}
