package com.paneedah.mwc.misc;

import com.paneedah.mwc.ModernWarfareMod;
import com.paneedah.mwc.utils.ModReference;
import net.minecraft.item.Item;

public class ItemSyntheticPlastic extends Item {

    public ItemSyntheticPlastic() {
        setMaxStackSize(64);
        setTranslationKey(ModReference.id + "_" + "SyntheticPlastic");
//        setTextureName(ModReference.MWC_ID + ":" + "syntheticplastic");
        setCreativeTab(ModernWarfareMod.BlocksTab);
    }
}
