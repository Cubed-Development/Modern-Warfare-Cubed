package com.paneedah.weaponlib.inventory;

import com.paneedah.weaponlib.compatibility.CompatibleGuiButton;
import com.paneedah.weaponlib.compatibility.CompatibleInventoryTabs;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiInventory;

import java.util.ArrayList;
import java.util.List;

import static com.paneedah.mwc.proxies.ClientProxy.mc;
import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class InventoryTabs extends CompatibleInventoryTabs {

    private ArrayList<InventoryTab> tabList = new ArrayList<InventoryTab>();

    private static InventoryTabs instance = new InventoryTabs();
    
    private InventoryTabs() {}

    public static InventoryTabs getInstance() {
        return instance;
    }

    public void registerTab(InventoryTab tab) {
        tabList.add(tab);
    }

    public ArrayList<InventoryTab> getTabList() {
        return tabList;
    }

    @Override
    public void guiPostInit(GuiScreen gui) {
        if ((gui instanceof GuiInventory)) {
            int xSize = 176;
            int ySize = 166;
            int guiLeft = (gui.width - xSize) / 2;
            int guiTop = (gui.height - ySize) / 2;
            guiLeft += getPotionOffset();

            updateTabValues(guiLeft, guiTop, StandardPlayerInventoryTab.class);

            List<Object> buttonlist = compatibility.getPrivateValue(GuiScreen.class, gui, "buttonList", "field_146292_n");
            addTabsToList(buttonlist);
        }
    }

    public void openInventoryGui() {
        compatibility.closeScreen(); //.sendQueue.addToSendQueue(new CPacketCloseWindow(mc.thePlayer.openContainer.windowId));
        GuiInventory inventory = new GuiInventory(compatibility.clientPlayer());
        mc.displayGuiScreen(inventory);
    }

    public void updateTabValues(int cornerX, int cornerY, Class<?> selectedButton) {
        int count = 2;
        for (int i = 0; i < tabList.size(); i++) {
            InventoryTab t = tabList.get(i);

            if (t.shouldAddToList()) {
                t.id = count;
                CompatibleGuiButton.setPosition(t, cornerX + (count - 2) * 28, cornerY - 28);
                t.enabled = !t.getClass().equals(selectedButton);
                count++;
            }
        }
    }

    @SuppressWarnings("unchecked")
    public void addTabsToList(List<?> buttonList) {
        for (InventoryTab tab : tabList) {
            if (tab.shouldAddToList()) {
                ((List<Object>)buttonList).add((Object)tab);
            }
        }
    }

    
}
