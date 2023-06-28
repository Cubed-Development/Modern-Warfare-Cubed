package com.paneedah.weaponlib.inventory;

import com.paneedah.mwc.items.equipment.ItemCarryableStorage;
import com.paneedah.weaponlib.ItemVest;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.utils.ModReference.ID;

public class CustomSlot extends Slot {

    private static final ResourceLocation emptyBackpackSlotTexture = new ResourceLocation(ID, "gui/inventory/empty_backpack_slot");
    private static final ResourceLocation emptyVestSlotTexture = new ResourceLocation(ID, "gui/inventory/empty_vest_slot");
    
    private final Class<?> itemClass;
    
    public CustomSlot(Class<?> itemClass, IInventory inventory, int slotIndex, int x, int y) {
        super(inventory, slotIndex, x, y);
        this.itemClass = itemClass;
    }

    @Override
    public boolean isItemValid(ItemStack stack) {
        return itemClass.isInstance(stack.getItem());
    }
    
    @Override
    public void onSlotChanged() {
        super.onSlotChanged();

        if(FMLCommonHandler.instance().getSide() == Side.CLIENT)
            onGuiSlotChanged();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public String getSlotTexture() {
        if (itemClass.equals(ItemCarryableStorage.class))
            return emptyBackpackSlotTexture.toString();
        else if (itemClass.equals(ItemVest.class))
            return emptyVestSlotTexture.toString();
        else
            return backgroundName;
    }

    @SideOnly(Side.CLIENT)
    private static void onGuiSlotChanged() {
        final GuiEquipmentInventory container = GuiEquipmentInventory.getClickedGuiContainer();

        if(container != null)
            container.initGui();
    }
}
