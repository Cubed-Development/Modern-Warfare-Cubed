package com.paneedah.mw.creativetab;

import com.paneedah.mw.weapons.Guns;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class AssaultRiflesTab extends CreativeTabs {

	public AssaultRiflesTab(int par1, String par2Str) {
		super(par1, par2Str);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ItemStack createIcon() {
		return new ItemStack(Guns.M16A4);
	}
}
