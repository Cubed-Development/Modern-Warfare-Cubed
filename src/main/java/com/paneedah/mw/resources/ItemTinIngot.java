package com.paneedah.mw.resources;

import com.paneedah.mw.ModernWarfareMod;
import com.paneedah.mw.utils.ModReference;
import net.minecraft.item.Item;

public class ItemTinIngot extends Item {

	public ItemTinIngot() {
		setMaxStackSize(64);
		setTranslationKey(ModReference.id + "_" + "TinIngot");
		//setTextureName(ModReference.MWC_ID + ":" + "TinIngot");
		setCreativeTab(ModernWarfareMod.BlocksTab);
	}
}
