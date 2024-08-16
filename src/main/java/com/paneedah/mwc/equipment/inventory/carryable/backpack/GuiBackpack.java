package com.paneedah.mwc.equipment.inventory.carryable.backpack;

import com.paneedah.weaponlib.inventory.BackpackInventoryTab;
import com.paneedah.weaponlib.inventory.InventoryTabs;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.util.ResourceLocation;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

public class GuiBackpack extends GuiContainer {

    private final ResourceLocation background;

    public GuiBackpack(BackpackContainer backpackContainer) {
        super(backpackContainer);

        final BackpackInventory inventory = backpackContainer.inventory;

        background = inventory.getOwner().getGuiTextureLocation();

        final int columns = inventory.getSizeInventory() / 4;

        xSize += (columns > 5 ? ((columns * 3) + 1) : 0);
    }

    @Override
    public void initGui() {
        super.initGui();

        final InventoryTabs inventoryTabs = InventoryTabs.getInstance();

        inventoryTabs.updateTabValues(guiLeft, guiTop, BackpackInventoryTab.class);
        inventoryTabs.addTabsToList(this.buttonList);
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        drawDefaultBackground();

        super.drawScreen(mouseX, mouseY, partialTicks);

        renderHoveredToolTip(mouseX, mouseY);
    }

    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        MC.getTextureManager().bindTexture(background);

        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);

        GuiInventory.drawEntityOnScreen(guiLeft + 51, guiTop + 75, 30, (guiLeft + 51) - mouseX, (guiTop + 25) - mouseY, MC.player);
    }
}
