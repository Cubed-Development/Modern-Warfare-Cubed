package com.paneedah.weaponlib.inventory;

import com.paneedah.mwc.network.messages.OpenCustomPlayerInventoryGuiMessage;
import com.paneedah.weaponlib.ModContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import static com.paneedah.mwc.MWC.CHANNEL;

public class CustomPlayerInventoryTab extends InventoryTab {

    private ModContext clientModContext;

    public CustomPlayerInventoryTab(ModContext clientModContext, Item tabIconItem) {
        super(0, 0, 0, new ItemStack(tabIconItem));
        this.clientModContext = clientModContext;
    }

    @Override
    public void onTabClicked() {
        CHANNEL.sendToServer(new OpenCustomPlayerInventoryGuiMessage(GuiHandler.CUSTOM_PLAYER_INVENTORY_GUI_ID));

    }

    @Override
    public boolean shouldAddToList() {
        return true;
    }
}
