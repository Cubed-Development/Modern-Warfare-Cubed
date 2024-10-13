package com.paneedah.mwc.equipment.inventory.carryable.backpack;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class BackpackContainer extends Container {

    /**
     * The Item Inventory for this Container, only needed if you want to reference isUseableByPlayer
     */
    public final BackpackInventory inventory;

    private final int armorSlotStartIndex;
    private final int armorSlotEndIndex;
    private final int standardInventorySlotStartIndex;
    private final int standardInventorySlotEndIndex;
    private final int hotbarSlotStartIndex;
    private final int hotbarSlotEndIndex;

    public BackpackContainer(EntityPlayer player, InventoryPlayer inventoryPlayer, BackpackInventory inventoryItem) {
        inventory = inventoryItem;

        final List<Slot> storageSlots = createStorageSlots(inventory);
        storageSlots.forEach(slot -> addSlotToContainer(slot));

        final int customSlotStartIndex = 0;
        final int customSlotEndIndex = customSlotStartIndex + storageSlots.size() - 1;

        List<Slot> armorSlots = createArmorSlots(player, inventoryPlayer);
        armorSlots.forEach(slot -> addSlotToContainer(slot));

        armorSlotStartIndex = customSlotEndIndex + 1;
        armorSlotEndIndex = armorSlotStartIndex + armorSlots.size() - 1;

        List<Slot> standardInventorySlots = createStandardInventorySlots(inventoryPlayer);
        standardInventorySlots.forEach(slot -> addSlotToContainer(slot));

        standardInventorySlotStartIndex = armorSlotEndIndex + 1;
        standardInventorySlotEndIndex = standardInventorySlotStartIndex + standardInventorySlots.size() - 1;

        List<Slot> hotbarSlots = createHotbarSlots(inventoryPlayer);
        hotbarSlots.forEach(slot -> addSlotToContainer(slot));

        hotbarSlotStartIndex = standardInventorySlotEndIndex + 1;
        hotbarSlotEndIndex = hotbarSlotStartIndex + hotbarSlots.size() - 1;
    }

    protected List<Slot> createStorageSlots(BackpackInventory inventoryCustom) {

        List<Slot> slots = new ArrayList<>();
        for (int i = 0; i < inventoryCustom.getSizeInventory(); ++i) {
            slots.add(new BackpackSlot(inventory, i, 80 + (18 * (i / 4)), 8 + (18 * (i % 4))));
        }

        return slots;
    }

    protected List<Slot> createHotbarSlots(InventoryPlayer inventoryPlayer) {
        List<Slot> slots = new ArrayList<>();
        for (int i = 0; i < 9; ++i) {
            slots.add(new Slot(inventoryPlayer, i, 8 + i * 18, 142));
        }
        return slots;
    }

    protected List<Slot> createStandardInventorySlots(InventoryPlayer inventoryPlayer) {
        List<Slot> slots = new ArrayList<>();
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                slots.add(new Slot(inventoryPlayer, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }
        return slots;
    }

    protected List<Slot> createArmorSlots(EntityPlayer player, InventoryPlayer inventoryPlayer) {
        List<Slot> slots = new ArrayList<>();
        int i;
        for (i = 0; i < 4; ++i) {
            final EntityEquipmentSlot entityequipmentslot = new EntityEquipmentSlot[]{EntityEquipmentSlot.HEAD, EntityEquipmentSlot.CHEST, EntityEquipmentSlot.LEGS, EntityEquipmentSlot.FEET}[i];
            addSlotToContainer(new Slot(inventoryPlayer, inventoryPlayer.getSizeInventory() - 1 - i - 1,
                    8, 8 + i * 18) {
                /**
                 * Returns the maximum stack size for a given slot (usually the same as getInventoryStackLimit(), but 1
                 * in the case of armor slots)
                 */
                public int getSlotStackLimit() {
                    return 1;
                }

                /**
                 * Check if the stack is allowed to be placed in this slot, used for armor slots as well as furnace
                 * fuel.
                 */
                public boolean isItemValid(ItemStack stack) {
                    return stack.getItem().isValidArmor(stack, entityequipmentslot, player);
                }

                /**
                 * Return whether this slot's stack can be taken from this slot.
                 */
                public boolean canTakeStack(EntityPlayer playerIn) {
                    ItemStack itemstack = getStack();
                    return (itemstack.isEmpty() || playerIn.isCreative() || !EnchantmentHelper.hasBindingCurse(itemstack)) && super.canTakeStack(playerIn);
                }

                @Nullable
                @SideOnly(Side.CLIENT)
                public String getSlotTexture() {
                    return ItemArmor.EMPTY_SLOT_NAMES[entityequipmentslot.getIndex()];
                }
            });
        }
        return slots;
    }

    @Override
    public boolean canInteractWith(EntityPlayer player) {
        return inventory.isUsableByPlayer(player);
    }

    /**
     * Called when a player shift-clicks on a slot. You must override this or
     * you will crash when someone does that.
     */
    public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int index) {
        ItemStack itemstack = new ItemStack(Items.AIR);
        Slot slot = inventorySlots.get(index);

        if (slot != null && slot.getHasStack()) {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            // If item is in our custom Inventory or armor slot
            if (index < standardInventorySlotStartIndex) {
                // try to place in player inventory / action bar
                if (!mergeItemStack(itemstack1, standardInventorySlotStartIndex, hotbarSlotEndIndex + 1, true)) {
                    return new ItemStack(Items.AIR);
                }

                slot.onSlotChange(itemstack1, itemstack);
            }
            // Item is in inventory / hotbar, try to place in custom inventory
            // or armor slots
            else {

                if (itemstack1.getItem() instanceof ItemArmor) {

                    ItemArmor armor = ((ItemArmor) itemstack1.getItem());
                    int ordinal = 4 - armor.getEquipmentSlot().getSlotIndex();
                    if (!mergeItemStack(itemstack1, armorSlotStartIndex + ordinal, armorSlotStartIndex + ordinal + 1, false)) {

                        if (!mergeItemStack(itemstack1, 0, inventorySlots.size() - 1, false)) {
                            return ItemStack.EMPTY;
                        }

                        return ItemStack.EMPTY;
                    }

                }


                // place in custom inventory
                if (!mergeItemStack(itemstack1, 0, standardInventorySlotStartIndex, false)) {
                        return new ItemStack(Items.AIR);


                    // item is in player's inventory, but not in action bar
                if (index <= standardInventorySlotEndIndex) {
                    // place in action bar
                    if (!mergeItemStack(itemstack1, hotbarSlotStartIndex, hotbarSlotEndIndex + 1, false)) {
                        return new ItemStack(Items.AIR);
                    }
                }
                // item in action bar - place in player inventory
                else if (index >= hotbarSlotStartIndex && index <= hotbarSlotEndIndex) {
                    if (!mergeItemStack(itemstack1, standardInventorySlotStartIndex, standardInventorySlotEndIndex + 1, false)) {
                        return new ItemStack(Items.AIR);
                    }
                }
            }

            if (itemstack1.getCount() == 0) {
                slot.putStack(ItemStack.EMPTY);
            } else {
                slot.onSlotChanged();
            }

            if (itemstack1.getCount() == itemstack.getCount()) {
                return null;
            }

            slot.onTake(par1EntityPlayer, itemstack1);
        }

        return itemstack;
    }
}
