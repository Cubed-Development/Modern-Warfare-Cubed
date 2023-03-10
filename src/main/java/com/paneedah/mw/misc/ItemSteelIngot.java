package com.paneedah.mw.misc;

import com.paneedah.mw.ModernWarfareMod;
import com.paneedah.mw.utils.ModReference;
import net.minecraft.item.Item;

public class ItemSteelIngot extends Item {

	public ItemSteelIngot() {
		setMaxStackSize(64);
		setTranslationKey(ModReference.id + "_" + "SteelIngot");
//		setTextureName(ModReference.MWC_ID + ":" + "steelingot");
		setCreativeTab(ModernWarfareMod.BlocksTab);
	}
}
