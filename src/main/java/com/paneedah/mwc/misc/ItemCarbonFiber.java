package com.paneedah.mwc.misc;

import com.paneedah.mwc.ModernWarfareMod;
import com.paneedah.mwc.utils.ModReference;
import net.minecraft.item.Item;

public class ItemCarbonFiber extends Item {

    public ItemCarbonFiber() {
        setMaxStackSize(64);
        setTranslationKey(ModReference.id + "_" + "CarbonFiber");
//        setTextureName(ModReference.id + ":" + "carbonfiber");
        setCreativeTab(ModernWarfareMod.BlocksTab);
    }
}
