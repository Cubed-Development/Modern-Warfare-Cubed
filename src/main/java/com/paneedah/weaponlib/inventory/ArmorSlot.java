package com.paneedah.weaponlib.inventory;

import com.paneedah.weaponlib.compatibility.CompatibleEntityEquipmentSlot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class ArmorSlot extends Slot {

    /** The parent class of this slot, ContainerPlayer, SlotArmor is a Anon inner class. */
    final EntityPlayer player;

    final CompatibleEntityEquipmentSlot armorType;

    public ArmorSlot(EntityPlayer player, IInventory inventory, int slotIndex, int x, int y, CompatibleEntityEquipmentSlot armorType) {
        super(inventory, slotIndex, x, y);
        this.armorType = armorType;
        this.player = player;
    }

    /**
     * Returns the maximum stack size for a given slot (usually the same as getInventoryStackLimit(), but 1 in the case
     * of armor slots)
     */
    public int getSlotStackLimit() {
        return 1;
    }

    /**
     * Check if the stack is a valid item for this slot. Always true beside for the armor slots.
     */
    public boolean isItemValid(ItemStack itemstack) {
        Item item = (itemstack == null ? null : itemstack.getItem());
        return item != null && compatibility.isValidArmor(itemstack, armorType, player);
    }
}
