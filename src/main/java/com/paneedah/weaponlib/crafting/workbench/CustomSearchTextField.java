package com.paneedah.weaponlib.crafting.workbench;

import com.paneedah.weaponlib.render.gui.GUIRenderHelper;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.util.ResourceLocation;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

/**
 * Simple class that replaces rendering of typical GUI text-boxes in
 * order to fit with the design of the workbench GUI.
 * 
 * @author James Holden, 2022
 */
public class CustomSearchTextField extends GuiTextField {
	
	private ResourceLocation tex;
	private int formatType = 0;
	private String hintText;

	public CustomSearchTextField(ResourceLocation tex, String hint, int componentId, int formatType, FontRenderer fontrendererObj, int x, int y, int par5Width,
			int par6Height) {
		super(componentId, fontrendererObj, x, y, par5Width, par6Height);
		
		this.tex = tex;
		this.hintText = hint;
		this.formatType = formatType;
	}
	
	@Override
	public void drawTextBox() {

		if(this.formatType == 1) {
			mc.getTextureManager().bindTexture(tex);
			GUIRenderHelper.drawTexturedRect(x, y - 4, 0, 60, 29, 20, 256, 256);
		}
		
		if(getText().length() == 0 && !isFocused()) {
			drawString(mc.fontRenderer, this.hintText, this.x + 3, this.y + 2, 0xFFFFFF);
		} else if(isFocused() && getText().length() == 0) {
			if(System.currentTimeMillis()%1000 < 500) {
				drawString(mc.fontRenderer, "_", this.x + 3, this.y + 2, 0xFFFFFF);
			}
		} else if(getText().length() != 0) {
			drawString(mc.fontRenderer, getText(), this.x + 3, this.y + 2, 0xFFFFFF);
			if(System.currentTimeMillis()%1000 < 500) {	
				drawString(mc.fontRenderer, "_", this.x + 3 + mc.fontRenderer.getStringWidth(getText()), this.y + 2, 0xFFFFFF);
			}
		}	
	}

}
