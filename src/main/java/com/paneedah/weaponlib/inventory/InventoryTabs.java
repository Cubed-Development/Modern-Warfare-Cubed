package com.paneedah.weaponlib.inventory;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.List;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class InventoryTabs {

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


    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void guiPostInit(GuiScreenEvent.InitGuiEvent.Post event) {
        final GuiScreen gui = event.getGui();

        if ((gui instanceof GuiInventory)) {
            int xSize = 176;
            int ySize = 166;
            int guiLeft = (gui.width - xSize) / 2;
            int guiTop = (gui.height - ySize) / 2;

            updateTabValues(guiLeft, guiTop, StandardPlayerInventoryTab.class);

            List<Object> buttonlist = ObfuscationReflectionHelper.getPrivateValue(GuiScreen.class, gui, "buttonList", "field_146292_n");
            addTabsToList(buttonlist);
        }
    }

    public void openInventoryGui() {
        mc.player.closeScreen();
        GuiInventory inventory = new GuiInventory(mc.player);
        mc.displayGuiScreen(inventory);
    }

    public void updateTabValues(int cornerX, int cornerY, Class<?> selectedButton) {
        int count = 2;
        for (int i = 0; i < tabList.size(); i++) {
            InventoryTab t = tabList.get(i);

            if (t.shouldAddToList()) {
                t.id = count;
                t.x = cornerX + (count - 2) * 28;
                t.y = cornerY - 28;
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
