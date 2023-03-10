package com.paneedah.mwc.resources;

import com.paneedah.mwc.ModernWarfareMod;
import com.paneedah.mwc.utils.ModReference;
import net.minecraft.item.Item;

public class ItemTinIngot extends Item {

	public ItemTinIngot() {
		setMaxStackSize(64);
		setTranslationKey(ModReference.id + "_" + "TinIngot");
		//setTextureName(ModReference.MWC_ID + ":" + "TinIngot");
		setCreativeTab(ModernWarfareMod.BlocksTab);
	}
}
