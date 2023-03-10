package com.paneedah.mw.misc;

import com.paneedah.mw.ModernWarfareMod;
import com.paneedah.mw.utils.ModReference;
import net.minecraft.item.Item;

public class ItemCarbonFiber extends Item {

    public ItemCarbonFiber() {
        setMaxStackSize(64);
        setTranslationKey(ModReference.id + "_" + "CarbonFiber");
//        setTextureName(ModReference.MWC_ID + ":" + "carbonfiber");
        setCreativeTab(ModernWarfareMod.BlocksTab);
    }
}
