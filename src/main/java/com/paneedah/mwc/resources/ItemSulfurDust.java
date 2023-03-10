package com.paneedah.mwc.resources;

import com.paneedah.mwc.ModernWarfareMod;
import com.paneedah.mwc.utils.ModReference;
import net.minecraft.item.Item;

public class ItemSulfurDust extends Item {

	public ItemSulfurDust() {
		setMaxStackSize(64);
		setTranslationKey(ModReference.id + "_" + "SulfurDust");
		//setTextureName(ModReference.MWC_ID + ":" + "SulfurDust");
		setCreativeTab(ModernWarfareMod.BlocksTab);
	}
}
