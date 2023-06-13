package com.paneedah.weaponlib.inventory;

import com.paneedah.mwc.utils.ModReference;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import java.io.IOException;

public class CustomPlayerInventoryGuiContainer extends GuiContainer {

    private static final ResourceLocation backGround = new ResourceLocation(ModReference.ID, "textures/gui/custom_inventory.png");

    private static final ThreadLocal<CustomPlayerInventoryGuiContainer> threadLocalGuiContainer = new ThreadLocal<>();

    public CustomPlayerInventoryGuiContainer(EntityPlayer player, InventoryPlayer inventoryPlayer, CustomPlayerInventory inventoryCustom) {
        super(new CustomPlayerInventoryContainer(player, inventoryPlayer, inventoryCustom));
    }
    
    @Override
    public void initGui() {
        super.initGui();
        
        final InventoryTabs inventoryTabs = InventoryTabs.getInstance();

        inventoryTabs.updateTabValues(guiLeft, guiTop, CustomPlayerInventoryTab.class);
        inventoryTabs.addTabsToList(buttonList);
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
    	drawDefaultBackground();

        super.drawScreen(mouseX, mouseY, partialTicks);

        renderHoveredToolTip(mouseX, mouseY);
    }

    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        mc.getTextureManager().bindTexture(backGround);

        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);

        GuiInventory.drawEntityOnScreen(guiLeft + 51, guiTop + 75, 30, (guiLeft + 51) - mouseX, (guiTop + 25) - mouseY, mc.player);
    }
    
    @Override
    protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
        try {
            threadLocalGuiContainer.set(this);
            super.mouseClicked(mouseX, mouseY, mouseButton);
        } finally {
            threadLocalGuiContainer.remove();
        }
    }
    
    @Override
    protected void mouseReleased(int mouseX, int mouseY, int state) {
        try {
            threadLocalGuiContainer.set(this);
            super.mouseReleased(mouseX, mouseY, state);
        } finally {
            threadLocalGuiContainer.remove();
        }
    }

    protected static CustomPlayerInventoryGuiContainer getClickedGuiContainer() {
        return threadLocalGuiContainer.get();
    }
}
