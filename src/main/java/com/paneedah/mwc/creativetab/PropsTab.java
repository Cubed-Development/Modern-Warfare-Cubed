package com.paneedah.mwc.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.utils.ModReference.ID;

public final class PropsTab extends CreativeTabs {

	public PropsTab(final int index, final String label) {
		super(index, label);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ItemStack createIcon() {
		return new ItemStack(Item.REGISTRY.getObject(new ResourceLocation(ID, "barrel")));
	}
}
