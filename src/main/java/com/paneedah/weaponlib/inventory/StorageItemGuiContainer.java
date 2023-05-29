package com.paneedah.weaponlib.inventory;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.util.ResourceLocation;

public class StorageItemGuiContainer extends GuiContainer {

    private final ResourceLocation background;

    public StorageItemGuiContainer(StorageItemContainer storageItemContainer) {
        super(storageItemContainer);

        final StorageInventory inventory = storageItemContainer.getStorageInventory();

        background = inventory.getItemStorage().getGuiTextureLocation();

        final int columns = inventory.getSizeInventory() / 4;

        xSize += (columns > 5 ? ((columns * 3) +1) : 0);
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
        mc.getTextureManager().bindTexture(background);

        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);

        GuiInventory.drawEntityOnScreen(guiLeft + 51, guiTop + 75, 30, (guiLeft + 51) - mouseX, (guiTop + 25) - mouseY, mc.player);
    }
}
