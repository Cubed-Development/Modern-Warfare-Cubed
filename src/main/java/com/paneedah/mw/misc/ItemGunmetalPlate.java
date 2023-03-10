package com.paneedah.mw.misc;

import com.paneedah.mw.ModernWarfareMod;
import com.paneedah.mw.utils.ModReference;
import net.minecraft.item.Item;

public class ItemGunmetalPlate extends Item {

    public ItemGunmetalPlate() {
        setMaxStackSize(64);
        setTranslationKey(ModReference.id + "_" + "GunmetalPlate");
//        setTextureName(ModReference.MWC_ID + ":" + "gunmetalplate");
        setCreativeTab(ModernWarfareMod.BlocksTab);
    }
}
