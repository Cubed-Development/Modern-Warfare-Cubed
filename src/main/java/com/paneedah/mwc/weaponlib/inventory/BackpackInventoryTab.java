package com.paneedah.mwc.weaponlib.inventory;

import com.paneedah.mwc.weaponlib.ItemStorage;
import com.paneedah.mwc.weaponlib.ModContext;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleCustomPlayerInventoryCapability;
import net.minecraft.item.ItemStack;

import static com.paneedah.mwc.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class BackpackInventoryTab extends InventoryTab {

    private ModContext clientModContext;

    public BackpackInventoryTab(ModContext clientModContext) {
        super(0, 0, 0);
        this.clientModContext = clientModContext;
    }

    @Override
    public void onTabClicked() {
        clientModContext.getChannel().getChannel()
                .sendToServer(new OpenCustomPlayerInventoryGuiMessage(GuiHandler.STORAGE_ITEM_INVENTORY_GUI_ID));
    }

    @Override
    public boolean shouldAddToList() {
        final ItemStack stackInSlot = getBackpackStackInSlot();
        return stackInSlot != null && stackInSlot.getItem() instanceof ItemStorage;
    }
    
    @Override
    protected ItemStack getItemStack() {
        return getBackpackStackInSlot();
    }
    
    protected static ItemStack getBackpackStackInSlot() {
        CustomPlayerInventory customInventory = CompatibleCustomPlayerInventoryCapability
                .getInventory(compatibility.getClientPlayer());
        return customInventory != null ? customInventory.getStackInSlot(0) : null;
    }
}
