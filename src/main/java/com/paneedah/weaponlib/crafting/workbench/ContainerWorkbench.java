package com.paneedah.weaponlib.crafting.workbench;

import com.paneedah.weaponlib.crafting.base.ContainerStation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerWorkbench extends ContainerStation {

    // Panda: Does this have to be here? There's no getters or setters for this. Couldn't we just not set this here and just utilize workbenchTileEntity that's passed?
    private TileEntityWorkbench tileEntityWorkbench;

    public ContainerWorkbench(EntityPlayer player, InventoryPlayer inventory, TileEntityWorkbench workbenchTileEntity) {
        this.tileEntityWorkbench = workbenchTileEntity;

        // Page first
        int id = 0;
        for (int y = 0; y < 3; ++y) {
            for (int x = 0; x < 9; ++x) {
                addSlotToContainer(new PagedSlotItemHandler(currentPageSupplier, tileEntityWorkbench.mainInventory, 23 + id, 1, 13 + x * 22, 37 + y * 22));
                id += 1;
            }
        }

        // Dismantle slots
        for (int i = 0; i < 4; ++i) {
            addSlotToContainer(new PagedSlotItemHandler(currentPageSupplier, tileEntityWorkbench.mainInventory, 9 + i, 1, 268 + i * 31, 34));
        }

        id = 0;
        for (int y = 0; y < 2; ++y) {
            for (int x = 0; x < 5; ++x) {
                addSlotToContainer(new PagedSlotItemHandler(currentPageSupplier, tileEntityWorkbench.mainInventory, 13 + (id++), 1, 271 + x * 22, 99 + y * 22));
            }
        }

        // Player inventory slots
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                addSlotToContainer(new PagedSlot(currentPageSupplier, inventory, j + i * 9 + 9, 1, 13 + j * 22, 129 + i * 22));
            }
        }

        // Hotbar slots
        for (int i = 0; i < 9; ++i)
            addSlotToContainer(new PagedSlot(currentPageSupplier, inventory, i, 1, 13 + i * 22, 205));

        // 2nd
        // Output slots
        for (int i = 0; i < 9; ++i)
            addSlotToContainer(new PagedSlotItemHandler(currentPageSupplier, tileEntityWorkbench.mainInventory, i, 3, 40 + i * 22, 219));
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index) {
        final Slot slot = this.inventorySlots.get(index);

        // TODO: [PANDA] Self reminder to triple check this merge of if statements cuz i'm incompetent.

        if (index < 27 && !this.mergeItemStack(slot.getStack(), 41, 76, false)) {
            // Workbench inventory
            return ItemStack.EMPTY;
        }

        if (index >= 41 && index <= 76 && !this.mergeItemStack(slot.getStack(), 0, 26, false)) {
            // Main inventory & hotbar
            return ItemStack.EMPTY;
        }

        if (index <= 30 && !this.mergeItemStack(slot.getStack(), 41, 76, false)) {
            return ItemStack.EMPTY;
        }

        if (index <= 40) {
            this.mergeItemStack(slot.getStack(), 41, 76, false);
        }

        return ItemStack.EMPTY;
    }
}
