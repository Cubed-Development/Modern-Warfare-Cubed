package com.paneedah.mwc.misc;

import com.paneedah.mwc.ModernWarfareMod;
import com.paneedah.mwc.utils.ModReference;
import net.minecraft.item.Item;

public class ItemSyntheticPolymerComposite extends Item {

    public ItemSyntheticPolymerComposite() {
        setMaxStackSize(64);
        setTranslationKey(ModReference.id + "_" + "SyntheticPolymerComposite");
//        setTextureName(ModReference.MWC_ID + ":" + "syntheticpolymercomposite");
        setCreativeTab(ModernWarfareMod.BlocksTab);
    }
}
