package com.paneedah.weaponlib.inventory;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;

public class CustomSlot extends Slot {
    
    private Class<?> itemClass;
    
    public CustomSlot(Class<?> itemClass, IInventory inventory, int slotIndex, int x, int y) {
        super(inventory, slotIndex, x, y);
        this.itemClass = itemClass;
    }

    @Override
    public boolean isItemValid(ItemStack stack) {
        return itemClass.isInstance(stack.getItem());//stack.getItem() instanceof ItemStorage;
    }
    
    @Override
    public void onSlotChanged() {
        super.onSlotChanged();
        if(FMLCommonHandler.instance().getSide() == Side.CLIENT) {
            SlotChangeHandler.onGuiSlotChanged();
        }
    }
    
    private static class SlotChangeHandler {
        private static void onGuiSlotChanged() {
            CustomPlayerInventoryGuiContainer container = CustomPlayerInventoryGuiContainer.getClickedGuiContainer();
            if(container != null) {           
                container.initGui();
            }
        }
    }
    
}
