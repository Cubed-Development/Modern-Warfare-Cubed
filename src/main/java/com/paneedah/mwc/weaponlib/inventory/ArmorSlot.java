package com.paneedah.mwc.weaponlib.inventory;

import com.paneedah.mwc.weaponlib.compatibility.CompatibleEntityEquipmentSlot;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleSlot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import static com.paneedah.mwc.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class ArmorSlot extends CompatibleSlot {

    /** The parent class of this slot, ContainerPlayer, SlotArmor is a Anon inner class. */
    final EntityPlayer player;

    public ArmorSlot(EntityPlayer player, IInventory inventory, int slotIndex, int x, int y, CompatibleEntityEquipmentSlot armorType)
    {
        super(inventory, slotIndex, x, y, armorType);
        this.player = player;
    }

    /**
     * Returns the maximum stack size for a given slot (usually the same as getInventoryStackLimit(), but 1 in the case
     * of armor slots)
     */
    public int getSlotStackLimit()
    {
        return 1;
    }

    /**
     * Check if the stack is a valid item for this slot. Always true beside for the armor slots.
     */
    public boolean isItemValid(ItemStack itemstack)
    {
        Item item = (itemstack == null ? null : itemstack.getItem());
        return item != null && compatibility.isValidArmor(itemstack, armorType, player);
    }

//    /**
//     * Returns the icon index on items.png that is used as background image of the slot.
//     */
//    @SideOnly(Side.CLIENT)
//    public IIcon getBackgroundIconIndex()
//    {
//        return ItemArmor.func_94602_b(this.armorType);
//    }
}
