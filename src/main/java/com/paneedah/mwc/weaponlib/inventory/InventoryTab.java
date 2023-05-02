package com.paneedah.mwc.weaponlib.inventory;

import com.paneedah.mwc.weaponlib.compatibility.CompatibleGuiButton;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleRenderItem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

public class InventoryTab extends CompatibleGuiButton {
    private ResourceLocation texture = new ResourceLocation("textures/gui/container/creative_inventory/tabs.png");
    //private ItemStack renderStack;
    private ItemStack itemStack;
    private CompatibleRenderItem itemRenderer = new CompatibleRenderItem();

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
    public void drawButton(Minecraft mc, int mouseX, int mouseY) {
        if (this.visible) {
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

            int yTexPos = this.enabled ? 3 : 32;
            int ySize = this.enabled ? 25 : 32;
            int xOffset = this.id == 2 ? 0 : 1;
            int yPos = this.getY() + (this.enabled ? 3 : 0);

            mc.renderEngine.bindTexture(this.texture);
            this.drawTexturedModalRect(this.getX(), yPos, xOffset * 28, yTexPos, 28, ySize);

            RenderHelper.enableGUIStandardItemLighting();
            this.zLevel = 100.0F;
            this.itemRenderer.setZLevel(100.0F);
            GL11.glEnable(GL11.GL_LIGHTING);
            GL11.glEnable(GL12.GL_RESCALE_NORMAL);
            final ItemStack itemStack = getItemStack();
            this.itemRenderer.renderItemAndEffectIntoGUI(mc.fontRenderer, mc.renderEngine, itemStack, getX() + 6,
                    getY() + 8);
            this.itemRenderer.renderItemOverlayIntoGUI(mc.fontRenderer, mc.renderEngine, itemStack, getX() + 6,
                    getY() + 8);
            GL11.glDisable(GL11.GL_LIGHTING);
            GL11.glEnable(GL11.GL_BLEND);
            this.itemRenderer.setZLevel(0.0F);
            this.zLevel = 0.0F;
            RenderHelper.disableStandardItemLighting();
        }
    }

    @Override
    public boolean mousePressed(Minecraft mc, int mouseX, int mouseY) {
        boolean inWindow = this.enabled && this.visible && mouseX >= this.getX() && mouseY >= this.getY()
                && mouseX < this.getX() + this.width && mouseY < this.getY() + this.height;

        if (inWindow) {
            this.onTabClicked();
        }

        return inWindow;
    }

    public void onTabClicked() {
    }

    public boolean shouldAddToList() {
        return false;
    }
}
