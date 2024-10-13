package com.paneedah.weaponlib.inventory;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

public class InventoryTab extends GuiButton {
    private final ResourceLocation texture = new ResourceLocation("textures/gui/container/creative_inventory/tabs.png");
    //private ItemStack renderStack;
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
        if (visible) {
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

            int yTexPos = enabled ? 3 : 32;
            int ySize = enabled ? 25 : 32;
            int xOffset = id == 2 ? 0 : 1;
            int yPos = y + (enabled ? 3 : 0);

            MC.renderEngine.bindTexture(texture);
            drawTexturedModalRect(x, yPos, xOffset * 28, yTexPos, 28, ySize);

            RenderItem itemRenderer = MC.getRenderItem();

            RenderHelper.enableGUIStandardItemLighting();
            zLevel = 100.0F;
            itemRenderer.zLevel = 100.0F;
            GL11.glEnable(GL11.GL_LIGHTING);
            GL11.glEnable(GL12.GL_RESCALE_NORMAL);
            final ItemStack itemStack = getItemStack();
            itemRenderer.renderItemAndEffectIntoGUI(itemStack, x + 6, y + 8);
            itemRenderer.renderItemOverlays(MC.fontRenderer, itemStack, x + 6, y + 8);
            GL11.glDisable(GL11.GL_LIGHTING);
            GL11.glEnable(GL11.GL_BLEND);
            itemRenderer.zLevel = 0.0F;
            zLevel = 0.0F;
            RenderHelper.disableStandardItemLighting();
        }
    }

    @Override
    public boolean mousePressed(Minecraft MC, int mouseX, int mouseY) {
        boolean inWindow = enabled && visible && mouseX >= x && mouseY >= y
                && mouseX < x + width && mouseY < y + height;

        if (inWindow) {
            onTabClicked();
        }

        return inWindow;
    }

    public void onTabClicked() {
    }

    public boolean shouldAddToList() {
        return false;
    }
}
