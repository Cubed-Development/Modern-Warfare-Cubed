package com.paneedah.mwc.equipment.inventory;

import com.paneedah.mwc.items.equipment.carryable.ItemBackpack;
import com.paneedah.weaponlib.ItemVest;
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
import java.util.Arrays;
import java.util.List;

public class EquipmentContainer extends Container {

    private EquipmentInventory equipmentInventory;

    private int customSlotStartIndex;
    private int customSlotEndIndex;
    private int armorSlotStartIndex;
    private int armorSlotEndIndex;
    private int standardInventorySlotStartIndex;
    private int standardInventorySlotEndIndex;
    private int hotbarSlotStartIndex;
    private int hotbarSlotEndIndex;

    private List<Slot> customSlots;

    public EquipmentContainer(EntityPlayer player, InventoryPlayer inventoryPlayer, EquipmentInventory equipmentInventory) {

        this.equipmentInventory = equipmentInventory;

        this.customSlots = createCustomSlots(equipmentInventory);
        customSlots.forEach(slot -> addSlotToContainer(slot));

        this.customSlotStartIndex = 0;
        this.customSlotEndIndex = customSlotStartIndex + customSlots.size() - 1;

        List<Slot> armorSlots = createArmorSlots(player, inventoryPlayer);
        // armorSlots.forEach(slot -> addSlotToContainer(slot));

        this.armorSlotStartIndex = equipmentInventory.getSizeInventory();
        this.armorSlotEndIndex = armorSlotStartIndex + armorSlots.size() - 1;

        List<Slot> standardInventorySlots = createStandardInventorySlots(inventoryPlayer);
        standardInventorySlots.forEach(slot -> addSlotToContainer(slot));

        this.standardInventorySlotStartIndex = armorSlotEndIndex + 1;
        this.standardInventorySlotEndIndex = standardInventorySlotStartIndex + standardInventorySlots.size() - 1;

        List<Slot> hotbarSlots = createHotbarSlots(inventoryPlayer);
        hotbarSlots.forEach(slot -> addSlotToContainer(slot));

        this.hotbarSlotStartIndex = standardInventorySlotEndIndex + 1;
        this.hotbarSlotEndIndex = hotbarSlotStartIndex + hotbarSlots.size() - 1;
    }

    protected List<Slot> createCustomSlots(EquipmentInventory inventoryCustom) {
        return Arrays.asList(
                new EquipmentSlot(ItemBackpack.class, inventoryCustom, 0, 80, 8),
                new EquipmentSlot(ItemBackpack.class, inventoryCustom, 1, 80, 26),
                new EquipmentSlot(ItemVest.class, inventoryCustom, 2, 80, 44)
        );
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
            this.addSlotToContainer(new Slot(inventoryPlayer, inventoryPlayer.getSizeInventory() - 1 - i - 1,
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
                    ItemStack itemstack = this.getStack();
                    return !itemstack.isEmpty() && !playerIn.isCreative() && EnchantmentHelper.hasBindingCurse(itemstack) ? false : super.canTakeStack(playerIn);
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

    /**
     * This should always return true, since custom inventory can be accessed
     * from anywhere
     */
    @Override
    public boolean canInteractWith(EntityPlayer player) {
        return true;
    }

    /**
     * Called when a player shift-clicks on a slot. You must override this or
     * you will crash when someone does that. Basically the same as every other
     * container I make, since I define the same constant indices for all of
     * them
     */
    public ItemStack transferStackInSlot(EntityPlayer player, int slotIndex) {
        ItemStack itemstack = null;
        try {


            Slot slot = (Slot) this.inventorySlots.get(slotIndex);

            if (slot != null && slot.getHasStack()) {

                ItemStack itemstack1 = slot.getStack();
                itemstack = itemstack1.copy();

                // Either armor slot or custom item slot was clicked
                if (slotIndex < standardInventorySlotStartIndex) {

                    // try to place in player inventory / action bar
                    if (!this.mergeItemStack(itemstack1, standardInventorySlotStartIndex, hotbarSlotEndIndex + 1, true)) {
                        return new ItemStack(Items.AIR);
                    }

                    slot.onSlotChange(itemstack1, itemstack);
                }
                // Item is in inventory / hotbar, try to place either in custom or
                // armor slots
                else {

                    // if item is our custom item                
                    if (customSlots.stream().anyMatch(s -> s.isItemValid(itemstack1))) {

                        if (!this.mergeItemStack(itemstack1, customSlotStartIndex, customSlotEndIndex + 1, false)) {
                            return new ItemStack(Items.AIR);
                        }
                    }
                    // if item is armor
                    else if (itemstack1.getItem() instanceof ItemArmor) {

                        ItemArmor armor = ((ItemArmor) itemstack1.getItem());
                        int ordinal = 4 - armor.getEquipmentSlot().getSlotIndex();
                        if (!this.mergeItemStack(itemstack1, armorSlotStartIndex + ordinal, armorSlotStartIndex + ordinal + 1, false)) {

                            if (!this.mergeItemStack(itemstack1, 0, inventorySlots.size() - 1, false)) {
                                return ItemStack.EMPTY;
                            }

                            return ItemStack.EMPTY;
                        }
                	
                		
                    	/*
                    	if((itemstack.getItem() instanceof CustomArmor)) {
                    		 EntityEquipmentSlot type = ((ItemArmor) itemstack1.getItem()).armorType;//((ItemArmor) itemstack1.getItem()).armorType;
                             
                           
                             
                             if (!this.mergeItemStack(itemstack1, armorSlotStartIndex + type.ordinal(), armorSlotStartIndex + type.ordinal() + 1, false)) {
                                 return new ItemStack(Items.AIR);
                             }
                    	} else {
                    		int ordinal = 4 - ((ItemArmor) itemstack1.getItem()).getEquipmentSlot().getSlotIndex();
                    		if (!this.mergeItemStack(itemstack1, armorSlotStartIndex + ordinal, armorSlotStartIndex + ordinal + 1, false)) {
                                return new ItemStack(Items.AIR);
                            }
                    	}
                       */
                    }
                    // item in player's inventory, but not in action bar
                    else if (slotIndex >= standardInventorySlotStartIndex && slotIndex < hotbarSlotStartIndex) {
                        // place in action bar
                        if (!this.mergeItemStack(itemstack1, hotbarSlotStartIndex, hotbarSlotEndIndex + 1, false)) {
                            return new ItemStack(Items.AIR);
                        }
                    }
                    // item in action bar - place in player inventory
                    else if (slotIndex >= hotbarSlotStartIndex && slotIndex < hotbarSlotEndIndex + 1) {
                        if (!this.mergeItemStack(itemstack1, standardInventorySlotStartIndex, standardInventorySlotEndIndex + 1, false)) {
                            return new ItemStack(Items.AIR);
                        }
                    }
                }

                if (itemstack1.getCount() == 0) {
                    slot.putStack(new ItemStack(Items.AIR));
                } else {
                    slot.onSlotChanged();
                }

                if (itemstack1.getCount() == itemstack.getCount()) {
                    return null;
                }

                slot.onTake(player, itemstack1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return itemstack != null ? itemstack : new ItemStack(Items.AIR);
    }
}
