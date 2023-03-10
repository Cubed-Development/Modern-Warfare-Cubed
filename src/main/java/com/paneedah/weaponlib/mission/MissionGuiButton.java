package com.paneedah.weaponlib.mission;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class MissionGuiButton extends GuiButton {

    protected static ResourceLocation BUTTON_TEXTURES = new ResourceLocation("weaponlib",
            "/com/paneedah/weaponlib/resources/mission-buttons.png");

    private int textureWidth = 200;
    private int textureHeight = 90;
    private int textureCount = 3;

    private int textureSegmentHeight = (int) ((float) textureHeight / textureCount);

    public MissionGuiButton(int buttonId, int x, int y, int widthIn, int heightIn, String buttonText) {
        super(buttonId, x, y, widthIn, heightIn, buttonText);
        this.height = 30;

    }

    public MissionGuiButton(int buttonId, int x, int y, String buttonText) {
        this(buttonId, x, y, 200, 30, buttonText);
    }

    public void drawButton(Minecraft mc, int mouseX, int mouseY, float partialTicks) {
        if (this.visible) {
            FontRenderer fontrenderer = mc.fontRenderer;
            mc.getTextureManager().bindTexture(BUTTON_TEXTURES);
            GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
            this.hovered = mouseX >= this.x && mouseY >= this.y && mouseX < this.x + this.width
                    && mouseY < this.y + this.height;
            int i = this.getHoverState(this.hovered);

            GlStateManager.enableBlend();
            GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA,
                    GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE,
                    GlStateManager.DestFactor.ZERO);
            GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA,
                    GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);

            int textureV = textureSegmentHeight * i;

            drawModalRectWithCustomSizedTexture(
                    this.x, this.y, 
                    0, // u
                    textureV, // v
                    this.width >> 1, this.height, 
                    textureWidth, textureHeight);
            
            drawModalRectWithCustomSizedTexture(
                    this.x + (this.width >> 1), this.y, 
                    textureWidth - (this.width >> 1), // u
                    textureV, // v
                    this.width >> 1, this.height, 
                    textureWidth, textureHeight);
            
            this.mouseDragged(mc, mouseX, mouseY);
            int j = 14737632;

            if (packedFGColour != 0) {
                j = packedFGColour;
            } else if (!this.enabled) {
                j = 10526880;
            } else if (this.hovered) {
                j = 16777120;
            }

            // this.drawCenteredString(fontrenderer, this.displayString, this.x
            // + this.width / 2, this.y + (this.height - 8) / 2, j);
            this.drawString(fontrenderer, this.displayString, this.x + 7, this.y + (this.height - 8) / 2, j);
        }
    }

}