package com.paneedah.mw.misc;

import com.paneedah.mw.ModernWarfareMod;
import com.paneedah.mw.utils.ModReference;
import net.minecraft.item.Item;

public class ItemGunmetalComposite extends Item {

    public ItemGunmetalComposite() {
        setMaxStackSize(64);
        setTranslationKey(ModReference.id + "_" + "GunmetalComposite");
//        setTextureName(ModReference.MWC_ID + ":" + "gunmetalcomposite");
        setCreativeTab(ModernWarfareMod.BlocksTab);
    }
}
