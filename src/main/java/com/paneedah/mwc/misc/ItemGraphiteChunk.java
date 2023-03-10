package com.paneedah.mwc.misc;

import com.paneedah.mwc.ModernWarfareMod;
import com.paneedah.mwc.utils.ModReference;
import net.minecraft.item.Item;

public class ItemGraphiteChunk extends Item {

    public ItemGraphiteChunk() {
        setMaxStackSize(64);
        setTranslationKey(ModReference.id + "_" + "GraphiteChunk");
//        setTextureName(ModReference.MWC_ID + ":" + "graphitechunk");
        setCreativeTab(ModernWarfareMod.BlocksTab);
    }
}
