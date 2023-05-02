package com.paneedah.weaponlib.vehicle;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.relauncher.ReflectionHelper;
import net.minecraftforge.items.ItemStackHandler;

import java.lang.reflect.Method;

public class forjosh {
	
	public static ItemStackHandler getVMWSlots(EntityPlayer player)
    {
        Method m = null;
        try {
            m = ReflectionHelper.findMethod(Class.forName("com.paneedah.weaponlib.compatibility.CompatibleCustomPlayerInventoryCapability"), "getInventory", null, EntityLivingBase.class);
        } catch (Exception e) { return null; }
        Object inventory = null;
        try {
            inventory = m.invoke(null, player);
        } catch (Exception e) { return null; }
        ItemStack[] backpack = null;
        if(inventory != null){
            try {
                backpack = (ItemStack[]) ReflectionHelper.findField(Class.forName("com.paneedah.weaponlib.inventory.CustomPlayerInventory"), "inventory").get(inventory);
            } catch (Exception e) { return null; }
        }
        ItemStackHandler handler = new ItemStackHandler(2);
        handler.setStackInSlot(0, backpack[0]);
        handler.setStackInSlot(1, backpack[1]);
        return handler;
    }
	
	public static byte[] getBytes(ItemStackHandler handler) {
		ItemStack one = handler.getStackInSlot(0);
		ItemStack two = handler.getStackInSlot(1);

		NBTTagCompound comp = new NBTTagCompound();
		comp.setTag("firstItem", one.getTagCompound());
		comp.setTag("secondItem", two.getTagCompound());
		
		return comp.toString().getBytes();
	}
	

}
