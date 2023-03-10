package com.paneedah.mwc.misc;

import com.paneedah.mwc.ModernWarfareMod;
import com.paneedah.mwc.utils.ModReference;
import net.minecraft.item.Item;

public class ItemPlasticPlate extends Item {

    public ItemPlasticPlate() {
        setMaxStackSize(64);
        setTranslationKey(ModReference.id + "_" + "PlasticPlate");
//        setTextureName(ModReference.MWC_ID + ":" + "plasticplate");
        setCreativeTab(ModernWarfareMod.BlocksTab);
    }
}
