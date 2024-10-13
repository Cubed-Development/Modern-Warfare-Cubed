package com.paneedah.weaponlib.crafting.workbench;

import com.paneedah.weaponlib.render.gui.GUIRenderHelper;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.util.ResourceLocation;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

/**
 * Simple class that replaces rendering of typical GUI text-boxes in
 * order to fit with the design of the workbench GUI.
 *
 * @author James Holden, 2022
 */
public class CustomSearchTextField extends GuiTextField {

    private final ResourceLocation tex;
    private int formatType;
    private final String hintText;

    public CustomSearchTextField(ResourceLocation tex, String hint, int componentId, int formatType, FontRenderer fontRendererObj, int x, int y, int par5Width, int par6Height) {
        super(componentId, fontRendererObj, x, y, par5Width, par6Height);
        this.tex = tex;
        hintText = hint;
        this.formatType = formatType;
    }

    @Override
    public void drawTextBox() {
        if (formatType == 1) {
            MC.getTextureManager().bindTexture(tex);
            GUIRenderHelper.drawTexturedRect(x, y - 4, 0, 60, 29, 20, 256, 256);
        }

        if (getText().isEmpty() && !isFocused()) {
            drawString(MC.fontRenderer, hintText, this.x + 3, this.y + 2, 0xFFFFFF);

        } else if (isFocused() && getText().isEmpty()) {
            if (System.currentTimeMillis() % 1000 < 500) {
                drawString(MC.fontRenderer, "_", this.x + 3, this.y + 2, 0xFFFFFF);
            }

        } else if (!getText().isEmpty()) {
            drawString(MC.fontRenderer, getText(), this.x + 3, this.y + 2, 0xFFFFFF);
            if (System.currentTimeMillis() % 1000 < 500) {
                drawString(MC.fontRenderer, "_", this.x + 3 + MC.fontRenderer.getStringWidth(getText()), this.y + 2, 0xFFFFFF);
            }
        }
    }
}
