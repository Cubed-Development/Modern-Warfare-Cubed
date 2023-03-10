package com.paneedah.mw.misc;

import com.paneedah.mw.ModernWarfareMod;
import com.paneedah.mw.utils.ModReference;
import net.minecraft.item.Item;

public class ItemLeadIngot extends Item {

    public ItemLeadIngot() {
        setMaxStackSize(64);
        setTranslationKey(ModReference.id + "_" + "LeadIngot");
//        setTextureName(ModReference.MWC_ID + ":" + "leadingot");
        setCreativeTab(ModernWarfareMod.BlocksTab);
    }
}
