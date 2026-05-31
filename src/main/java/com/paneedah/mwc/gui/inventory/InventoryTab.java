package com.paneedah.mwc.gui.inventory;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.*;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

public class InventoryTab extends GuiButton {
    private final ResourceLocation texture = new ResourceLocation("textures/gui/container/creative_inventory/tabs.png");
    private ItemStack itemStack;

    public InventoryTab(int id, int posX, int posY, ItemStack itemStack) {
        super(id, posX, posY, 28, 32, "");
        this.itemStack = itemStack;
    }

    public InventoryTab(int id, int posX, int posY) {
        super(id, posX, posY, 28, 32, "");
    }

    protected ItemStack getItemStack() {
        return itemStack;
    }

    @Override
    public void drawButton(Minecraft MC, int mouseX, int mouseY, float partialTicks) {
        if (this.visible) {
            GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);

            int yTexPos = this.enabled ? 3 : 32;
            int ySize = this.enabled ? 25 : 32;
            int xOffset = this.id == 2 ? 0 : 1;
            int yPos = this.y + (this.enabled ? 3 : 0);

            MC.renderEngine.bindTexture(this.texture);
            this.drawTexturedModalRect(this.x, yPos, xOffset * 28, yTexPos, 28, ySize);

            RenderItem itemRenderer = MC.getRenderItem();

            RenderHelper.enableGUIStandardItemLighting();
            this.zLevel = 100.0F;
            itemRenderer.zLevel = 100.0F;
            GlStateManager.enableLighting();
            GlStateManager.enableRescaleNormal();
            final ItemStack itemStack = getItemStack();
            itemRenderer.renderItemAndEffectIntoGUI(itemStack, x + 6, y + 8);
            itemRenderer.renderItemOverlays(MC.fontRenderer, itemStack, x + 6, y + 8);
            GlStateManager.disableLighting();
            GlStateManager.enableBlend();
            itemRenderer.zLevel = 0.0F;
            this.zLevel = 0.0F;
            RenderHelper.disableStandardItemLighting();
        }
    }

    @Override
    public boolean mousePressed(Minecraft MC, int mouseX, int mouseY) {
        boolean inWindow = this.enabled && this.visible && mouseX >= this.x && mouseY >= this.y
                && mouseX < this.x + this.width && mouseY < this.y + this.height;

        if (inWindow) {
            this.onTabClicked();
        }

        return inWindow;
    }

    public void onTabClicked() {
    }

    public boolean shouldAddToList() {
        return true;
    }
}
