package com.paneedah.weaponlib.animation.gui;

import lombok.Getter;
import lombok.Setter;
import net.minecraft.client.renderer.GlStateManager;

import java.awt.*;

public class Button {

    @Getter
    @Getter
    public double x, y;
    public String tooltip;

    @Getter
    @Setter
    public int id;
    @Getter
    @Setter
    public int size;
    @Getter
    @Setter
    public boolean state = false;

    public boolean isToggle = false;

    public int iconID;

    public Button(String tooltip, int iconID, int x, int y, int size) {
        this.tooltip = tooltip;
        this.x = x;
        this.y = y;
        this.size = size;
        this.iconID = iconID;
    }

    public Button(String tooltip, boolean toggle, int id, int x, int y, int size) {
        this.tooltip = tooltip;
        iconID = id;
        this.x = x;
        this.y = y;
        this.size = size;
        isToggle = toggle;
    }


    public void renderButton(int mouseX, int mouseY) {

        Color c = new Color(0x222f3e);

        if (isMouseOver(mouseX, mouseY)) {
            c = c.darker().darker();
            AnimationGUI.getInstance().but = this;


        }


        AnimationGUI.renderRect(c, x, y, size, size);

        GlStateManager.enableTexture2D();


        AnimationGUI.renderTexturedRect(iconID, x + (size * 0.2), y + size * 0.1, size * 0.6, size * 0.6);

        if (isToggle()) {
            Color col = isState() ? new Color(0xfeca57) : c.darker();
            AnimationGUI.renderRect(col, x + (size * 0.2), y + (size * 0.7), size * 0.6, size * 0.2);

        }


    }


    public boolean isMouseOver(int mouseX, int mouseY) {
        return (mouseX >= x && mouseY >= y) && (mouseX <= x + size && mouseY <= y + size);

    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isToggle() {
        return isToggle;
    }

    public void setToggle(boolean isToggle) {
        this.isToggle = isToggle;
    }

    public void onMouseClick() {

        if (isToggle) {
            setState(!state);
        }

    }

}
