package com.paneedah.mwc.misc;

import com.paneedah.mwc.ModernWarfareMod;
import com.paneedah.mwc.utils.ModReference;
import net.minecraft.item.Item;

public class ItemCopperIngot extends Item {

    public ItemCopperIngot() {
        setMaxStackSize(64);
        setTranslationKey(ModReference.id + "_" + "CopperIngot");
//        setTextureName(ModReference.MWC_ID + ":" + "copperingot");
        setCreativeTab(ModernWarfareMod.BlocksTab);
    }
}
