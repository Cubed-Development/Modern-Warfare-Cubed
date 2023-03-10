package com.paneedah.mwc.misc;

import com.paneedah.mwc.ModernWarfareMod;
import com.paneedah.mwc.utils.ModReference;
import net.minecraft.item.Item;

public class ItemLeadIngot extends Item {

    public ItemLeadIngot() {
        setMaxStackSize(64);
        setTranslationKey(ModReference.id + "_" + "LeadIngot");
//        setTextureName(ModReference.MWC_ID + ":" + "leadingot");
        setCreativeTab(ModernWarfareMod.BlocksTab);
    }
}
