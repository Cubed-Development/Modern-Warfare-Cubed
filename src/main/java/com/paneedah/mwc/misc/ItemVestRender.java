package com.paneedah.mwc.misc;

import com.paneedah.mwc.utils.ModReference;
import net.minecraft.item.Item;

public class ItemVestRender extends Item {

    public ItemVestRender() {
        setMaxStackSize(1);
        setTranslationKey(ModReference.id + "_" + "vestrender");
//        setTextureName(ModReference.MWC_ID + ":" + "syntheticplastic");
//        setCreativeTab(ModernWarfareMod.BlocksTab);
    }
}
