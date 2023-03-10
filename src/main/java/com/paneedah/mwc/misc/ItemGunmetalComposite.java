package com.paneedah.mwc.misc;

import com.paneedah.mwc.ModernWarfareMod;
import com.paneedah.mwc.utils.ModReference;
import net.minecraft.item.Item;

public class ItemGunmetalComposite extends Item {

    public ItemGunmetalComposite() {
        setMaxStackSize(64);
        setTranslationKey(ModReference.id + "_" + "GunmetalComposite");
//        setTextureName(ModReference.MWC_ID + ":" + "gunmetalcomposite");
        setCreativeTab(ModernWarfareMod.BlocksTab);
    }
}
