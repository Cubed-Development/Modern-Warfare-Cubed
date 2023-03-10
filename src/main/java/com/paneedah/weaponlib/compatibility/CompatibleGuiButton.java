package com.paneedah.weaponlib.compatibility;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;

public abstract class CompatibleGuiButton extends GuiButton {

    public CompatibleGuiButton(int buttonId, int x, int y, int widthIn, int heightIn, String buttonText) {
        super(buttonId, x, y, widthIn, heightIn, buttonText);
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    @Override
    public final void drawButton(Minecraft mc, int mouseX, int mouseY, float partialTicks) {
        drawButton(mc, mouseX, mouseY);
    }
    
    public abstract void drawButton(Minecraft mc, int mouseX, int mouseY);
    
    public static void setPosition(GuiButton button, int x, int y) {
        button.x = x;
        button.y = y;
    }

}
