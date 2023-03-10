package com.paneedah.mw.resources;

import com.paneedah.mw.ModernWarfareMod;
import com.paneedah.mw.utils.ModReference;
import net.minecraft.item.Item;

public class ItemSulfurDust extends Item {

	public ItemSulfurDust() {
		setMaxStackSize(64);
		setTranslationKey(ModReference.id + "_" + "SulfurDust");
		//setTextureName(ModReference.MWC_ID + ":" + "SulfurDust");
		setCreativeTab(ModernWarfareMod.BlocksTab);
	}
}
