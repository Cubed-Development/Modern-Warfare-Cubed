package com.paneedah.mwc.misc;

import com.paneedah.mwc.ModernWarfareMod;
import com.paneedah.mwc.utils.ModReference;
import net.minecraft.item.Item;

public class ItemCarbonComposite extends Item {

    public ItemCarbonComposite() {
        setMaxStackSize(64);
        setTranslationKey(ModReference.id + "_" + "CarbonComposite");
        //setTextureName(ModReference.MWC_ID + ":" + "carboncomposite");
        setCreativeTab(ModernWarfareMod.BlocksTab);
    }
}
