package com.paneedah.mw.misc;

import com.paneedah.mw.ModernWarfareMod;
import com.paneedah.mw.utils.ModReference;
import net.minecraft.item.Item;

public class ItemCopperIngot extends Item {

    public ItemCopperIngot() {
        setMaxStackSize(64);
        setTranslationKey(ModReference.id + "_" + "CopperIngot");
//        setTextureName(ModReference.MWC_ID + ":" + "copperingot");
        setCreativeTab(ModernWarfareMod.BlocksTab);
    }
}
