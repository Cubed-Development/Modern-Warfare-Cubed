package com.paneedah.mw.misc;

import com.paneedah.mw.ModernWarfareMod;
import com.paneedah.mw.utils.ModReference;
import net.minecraft.item.Item;

public class ItemSteelDust extends Item {

	public ItemSteelDust() {
		setMaxStackSize(64);
		setTranslationKey(ModReference.id + "_" + "SteelDust");
//		setTextureName(ModReference.MWC_ID + ":" + "steeldust");
		setCreativeTab(ModernWarfareMod.BlocksTab);
	}
}
