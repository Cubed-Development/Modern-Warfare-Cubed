package com.paneedah.mwc.misc;

import com.paneedah.mwc.ModernWarfareMod;
import com.paneedah.mwc.utils.ModReference;
import net.minecraft.item.Item;

public class ItemSteelIngot extends Item {

	public ItemSteelIngot() {
		setMaxStackSize(64);
		setTranslationKey(ModReference.id + "_" + "SteelIngot");
//		setTextureName(ModReference.id + ":" + "steelingot");
		setCreativeTab(ModernWarfareMod.BlocksTab);
	}
}
