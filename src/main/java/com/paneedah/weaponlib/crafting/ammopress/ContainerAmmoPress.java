package com.paneedah.weaponlib.crafting.ammopress;

import com.paneedah.weaponlib.crafting.base.ContainerStation;
import com.paneedah.weaponlib.crafting.workbench.PagedSlot;
import com.paneedah.weaponlib.crafting.workbench.PagedSlotItemHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerAmmoPress extends ContainerStation {

    public ContainerAmmoPress(EntityPlayer player, InventoryPlayer inventory, TileEntityAmmoPress workbenchTileEntity) {

        // Page first
        int id = 0;
        for (int y = 0; y < 3; ++y) {
            for (int x = 0; x < 9; ++x) {
                addSlotToContainer(new PagedSlotItemHandler(currentPageSupplier, workbenchTileEntity.mainInventory,
                        23 + id, 1, 13 + x * 22, 37 + y * 22));

                id += 1;
            }
        }

        // Dismantle slots
        for (int i = 0; i < 4; ++i) {
            addSlotToContainer(new PagedSlotItemHandler(currentPageSupplier, workbenchTileEntity.mainInventory, 9 + i,
                    1, 268 + i * 31, 34));
        }

        id = 0;
        for (int y = 0; y < 2; ++y) {
            for (int x = 0; x < 5; ++x) {
                addSlotToContainer(new PagedSlotItemHandler(currentPageSupplier, workbenchTileEntity.mainInventory,
                        13 + (id++), 1, 271 + x * 22, 99 + y * 22));
            }
        }

        // Player inventory slots
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                addSlotToContainer(
                        new PagedSlot(currentPageSupplier, inventory, j + i * 9 + 9, 1, 13 + j * 22, 129 + i * 22));
            }
        }

        // Hotbar slots
        for (int i = 0; i < 9; ++i) {
            addSlotToContainer(new PagedSlot(currentPageSupplier, inventory, i, 1, 13 + i * 22, 205));
        }

        // 2nd
        // Output slots
        for (int i = 0; i < 9; ++i) {
            addSlotToContainer(new PagedSlotItemHandler(currentPageSupplier, workbenchTileEntity.mainInventory, i, 3,
                    40 + i * 22, 219));
        }

    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index) {
        Slot slot = inventorySlots.get(index);

        if (index < 27) {
            // Workbench inventory
            if (!mergeItemStack(slot.getStack(), 41, 76, false)) {
                return ItemStack.EMPTY;
            }
        } else if (index >= 41 && index <= 76) {
            // Main inventory & hotbar
            if (!mergeItemStack(slot.getStack(), 0, 26, false)) {
                return ItemStack.EMPTY;
            }
        } else if (index <= 30) {

            if (!mergeItemStack(slot.getStack(), 41, 76, false)) {
                return ItemStack.EMPTY;
            }
        } else if (index <= 40) {
            if (!mergeItemStack(slot.getStack(), 41, 76, false)) {
                return ItemStack.EMPTY;
            }
        }
        return ItemStack.EMPTY;
    }

}
