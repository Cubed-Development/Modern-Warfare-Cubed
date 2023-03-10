package com.paneedah.mw.misc;

import com.paneedah.mw.ModernWarfareMod;
import com.paneedah.mw.utils.ModReference;
import net.minecraft.item.Item;

public class ItemSyntheticPlastic extends Item {

    public ItemSyntheticPlastic() {
        setMaxStackSize(64);
        setTranslationKey(ModReference.id + "_" + "SyntheticPlastic");
//        setTextureName(ModReference.MWC_ID + ":" + "syntheticplastic");
        setCreativeTab(ModernWarfareMod.BlocksTab);
    }
}
