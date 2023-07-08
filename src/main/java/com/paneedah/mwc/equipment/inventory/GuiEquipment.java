package com.paneedah.mwc.equipment.inventory;

import com.paneedah.weaponlib.inventory.CustomPlayerInventoryTab;
import com.paneedah.weaponlib.inventory.InventoryTabs;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.InventoryEffectRenderer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import java.io.IOException;

import static com.paneedah.mwc.utils.ModReference.ID;

public class GuiEquipment extends InventoryEffectRenderer {

    // Todo: Fix this name
    private static final ResourceLocation backGround = new ResourceLocation(ID, "textures/gui/inventory/custom_inventory.png");

    private static GuiEquipment currentGuiContainer;

    public GuiEquipment(EntityPlayer player, InventoryPlayer inventoryPlayer, EquipmentInventory inventoryCustom) {
        super(new EquipmentContainer(player, inventoryPlayer, inventoryCustom));
        allowUserInput = true;
    }
    
    @Override
    public void initGui() {
        buttonList.clear();

        super.initGui();

        guiLeft = (width - xSize) / 2;
        
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

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GlStateManager.color(1, 1, 1, 1);
        mc.getTextureManager().bindTexture(backGround);

        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);

        GuiInventory.drawEntityOnScreen(guiLeft + 51, guiTop + 75, 30, (guiLeft + 51) - mouseX, (guiTop + 25) - mouseY, mc.player);
    }

    @Override
    protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
        currentGuiContainer = this;
        super.mouseClicked(mouseX, mouseY, mouseButton);
    }

    @Override
    protected void mouseReleased(int mouseX, int mouseY, int state) {
        currentGuiContainer = this;
        super.mouseReleased(mouseX, mouseY, state);
    }

    protected static GuiEquipment getClickedGuiContainer() {
        return currentGuiContainer;
    }
}
