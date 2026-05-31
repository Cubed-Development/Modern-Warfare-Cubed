package com.paneedah.mwc.gui.inventory;

import com.paneedah.mwc.gui.GuiHandler;
import com.paneedah.mwc.network.messages.OpenCustomPlayerInventoryGuiMessage;
import com.paneedah.weaponlib.ModContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import static com.paneedah.mwc.MWC.CHANNEL;

/**
 * The Inventory Tab for equipping Vests and Backpacks
 */
public class CustomPlayerInventoryTab extends InventoryTab {


    public CustomPlayerInventoryTab(Item tabIconItem) {
        super(0, 0, 0, new ItemStack(tabIconItem));
    }

    @Override
    public void onTabClicked() {
        CHANNEL.sendToServer(new OpenCustomPlayerInventoryGuiMessage(GuiHandler.CUSTOM_PLAYER_INVENTORY_GUI_ID));

    }
}
