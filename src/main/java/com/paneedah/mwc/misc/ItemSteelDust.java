package com.paneedah.mwc.misc;

import com.paneedah.mwc.ModernWarfareMod;
import com.paneedah.mwc.utils.ModReference;
import net.minecraft.item.Item;

public class ItemSteelDust extends Item {

	public ItemSteelDust() {
		setMaxStackSize(64);
		setTranslationKey(ModReference.id + "_" + "SteelDust");
//		setTextureName(ModReference.MWC_ID + ":" + "steeldust");
		setCreativeTab(ModernWarfareMod.BlocksTab);
	}
}
