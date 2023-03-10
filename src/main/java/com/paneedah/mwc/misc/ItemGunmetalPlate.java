package com.paneedah.mwc.misc;

import com.paneedah.mwc.ModernWarfareMod;
import com.paneedah.mwc.utils.ModReference;
import net.minecraft.item.Item;

public class ItemGunmetalPlate extends Item {

    public ItemGunmetalPlate() {
        setMaxStackSize(64);
        setTranslationKey(ModReference.id + "_" + "GunmetalPlate");
//        setTextureName(ModReference.MWC_ID + ":" + "gunmetalplate");
        setCreativeTab(ModernWarfareMod.BlocksTab);
    }
}
