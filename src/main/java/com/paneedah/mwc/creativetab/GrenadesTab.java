package com.paneedah.mwc.creativetab;

import com.paneedah.mwc.Grenades;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GrenadesTab extends CreativeTabs {

    public GrenadesTab(int par1, String par2Str) {
        super(par1, par2Str);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ItemStack createIcon() {
        return new ItemStack(Grenades.FuseGrenade);
    }
}
