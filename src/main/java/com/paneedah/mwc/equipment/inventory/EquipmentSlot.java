package com.paneedah.mwc.equipment.inventory;

import com.paneedah.mwc.items.equipment.carryable.ItemBackpack;
import com.paneedah.mwc.items.equipment.carryable.ItemBelt;
import com.paneedah.weaponlib.ItemVest;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.utils.ModReference.ID;

public class EquipmentSlot extends Slot {

    public static final ResourceLocation EMPTY_BACKPACK_SLOT_TEXTURE = new ResourceLocation(ID, "gui/inventory/empty_backpack_slot");
    public static final ResourceLocation EMPTY_BELT_SLOT_TEXTURE = new ResourceLocation(ID, "gui/inventory/empty_belt_slot");
    public static final ResourceLocation EMPTY_VEST_SLOT_TEXTURE = new ResourceLocation(ID, "gui/inventory/empty_vest_slot");
    
    private final Class<?> itemClass;
    
    public EquipmentSlot(Class<?> itemClass, IInventory inventory, int slotIndex, int x, int y) {
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
        if (itemClass.equals(ItemBackpack.class))
            return EMPTY_BACKPACK_SLOT_TEXTURE.toString();
        else if (itemClass.equals(ItemBelt.class))
            return EMPTY_BELT_SLOT_TEXTURE.toString();
        else if (itemClass.equals(ItemVest.class))
            return EMPTY_VEST_SLOT_TEXTURE.toString();
        else
            return backgroundName;
    }

    @SideOnly(Side.CLIENT)
    private static void onGuiSlotChanged() {
        final GuiEquipment container = GuiEquipment.getClickedGuiContainer();

        if(container != null)
            container.initGui();
    }
}
