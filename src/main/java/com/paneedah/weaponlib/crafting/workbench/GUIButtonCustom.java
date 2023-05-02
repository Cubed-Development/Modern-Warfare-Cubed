package com.paneedah.weaponlib.crafting.workbench;

import com.paneedah.weaponlib.render.gui.GUIRenderHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;

import java.util.function.Supplier;

/**
 * Custom GUI button class that adds several functionalities:
 * - Hovered UV
 * - Toggled UV
 * - Disabled UV (+ a disabled state)
 * 
 * Works well with sprite sheets.
 * 
 * @author Homer Riva-Cambrin, 2022
 */
public class GUIButtonCustom extends GuiButton {
	
	
	// Sprite sheet this button should use while rendering & the texture width and height
	private ResourceLocation loc;
	private int texWidth;
	private int texHeight;
	
	
	// Stores the various UVs should they be provided
	private int standardU, standardV, hoveredU, hoveredV, erroredU, erroredV, toggledU, toggledV, disabledU, disabledV;

	// Gets string color for rendering
	private int standardStringColor, hoveredStringColor, erroredStringColor, toggleStringColor, disabledStringColor;
	
	
	// Draws 'disabled' (or inactive) button
	private boolean isErrored = false;
	
	private boolean hasDisabledState = false;

	
	// Allows the user to supply a condition where
	// the button should be disabled (and should hence
	// not be rendered)
	private Supplier<Boolean> disabledCheck;
	

	// The page ID-- buttons have the optionality
	// of being unique to a singular page.
	private int pageID = -1;
	
	private boolean isToggleButton = false;
	private boolean isToggled = false;

	
	

	public GUIButtonCustom(ResourceLocation resourceLoc, int buttonId, int x, int y, int widthIn, int heightIn, int imgW, int imgH, String buttonText) {
		super(buttonId, x, y, widthIn, heightIn, buttonText);
		this.loc = resourceLoc;
		this.texWidth = imgW;
		this.texHeight = imgH;
	}
	

	
	/**
	 * Provides the standard state UV to the button in order to render
	 * the button normally (not hovered or disabled, etc.)
	 * 
	 * @param color - color as a hexidecimal value
	 * @param u - top left coordinate of texture selection (x component)
	 * @param v - top left coordinate of texture selection (y component)
	 * @return itself
	 */
	public GUIButtonCustom withStandardState(int color, int u, int v) {
		this.standardStringColor = color;
		this.standardU = u;
		this.standardV = v;
		return this;
	}
	
	/**
	 * Provides the hovered state UV to the button in order to render
	 * the button with a different texture should the mouse cursor be
	 * above it.
	 * 
	 * @param color - color as a hexidecimal value
	 * @param u - top left coordinate of texture selection (x component)
	 * @param v - top left coordinate of texture selection (y component)
	 * @return itself
	 */
	public GUIButtonCustom withHoveredState(int color, int u, int v) {
		this.hoveredStringColor = color;
		this.hoveredU = u;
		this.hoveredV = v;
		return this;
	}
	
	/**
	 * Provides the toggled state UV to the button in order to render
	 * the button with its toggled on state should this be a toggle button.
	 * 
	 * @param color - color as a hexidecimal value
	 * @param u - top left coordinate of texture selection (x component)
	 * @param v - top left coordinate of texture selection (y component)
	 * @return itself
	 */
	public GUIButtonCustom withToggledState(int color, int u, int v) {
		this.toggleStringColor = color;
		this.toggledU = u;
		this.toggledV = v;
		return this;
	}
	
	/**
	 * Provides the disabled state UV to the button in order to render
	 * the button if it is in it's inactive/disabled state.
	 * 
	 * @param color - color as a hexidecimal value
	 * @param u - top left coordinate of texture selection (x component)
	 * @param v - top left coordinate of texture selection (y component)
	 * @return itself
	 */
	public GUIButtonCustom withErroredState(int color, int u, int v) {
		this.erroredStringColor = color;
		this.erroredU = u;
		this.erroredV = v;
		return this;
	}
	
	/**
	 * Provides the disabled state UV to the button in order to render
	 * the button if it is in it's inactive/disabled state.
	 * 
	 * @param color - color as a hexidecimal value
	 * @param u - top left coordinate of texture selection (x component)
	 * @param v - top left coordinate of texture selection (y component)
	 * @return itself
	 */
	public GUIButtonCustom withDisabledState(int color, int u, int v) {
		this.hasDisabledState = true;
		this.disabledStringColor = color;
		this.disabledU = u;
		this.disabledV = v;
		return this;
	}
	
	/**
	 * Allows the user to specify a lambda function under which the button should not be rendered. An example of this would
	 * be providing it with the following:
	 * 
	 * () -> {
	 * 	  return this.hat == 1;
	 * }
	 * 
	 * In this case, if 'hat' is equal to one, it will not render the button.
	 * 
	 * @param supplier Java lambda function that returns a boolean stating the conditions under which the button should be disabled
	 * @return itself
	 */
	public GUIButtonCustom withDisabledCheck(Supplier<Boolean> supplier) {
		this.disabledCheck = supplier;
		return this;
	}
	
	
	/**
	 * Button will only appear if using the following page
	 * 
	 * @param pageID - page ID that this button should be isolated to
	 * @return itself
	 */
	public GUIButtonCustom withPageRestriction(int pageID) {
		this.pageID = pageID;
		return this;
	}
	
	
	
	
	/**
	 * Turns this GUI button into a toggle button.
	 * 
	 * @return itself
	 */
	public GUIButtonCustom makeToggleButton() {
		this.isToggleButton = true;
		return this;
	}
	
	
	
	/**
	 * Returns the button's disabled status
	 * 
	 * @return is the button disabled
	 */
	public boolean isDisabled() {
		return this.isErrored;
	}
	
	/**
	 * Is the button in a disabled state?
	 * 
	 * @param is button in disabled state
	 */
	public void setErrored(boolean disable) {
		this.isErrored = disable;
	}
	
	/**
	 * The page ID that this button is isolated to.
	 * 
	 * @return this button will render only with this page ID, -1 if non-applicable.
	 */
	public int getPageID() {
		return this.pageID;
	}
	
	
	/**
	 * Toggle button stuff
	 */

	
	public void toggleOff() {
		this.isToggled = false;
	}
	
	public void toggleOn() {
		this.isToggled = true;
	}
	
	public void toggle() {
		this.isToggled = !this.isToggled;
	}
	
	public boolean getToggleState() {
		return this.isToggled;
	}
	
	
	@Override
	public void drawButton(Minecraft mc, int mouseX, int mouseY, float partialTicks) {
		if(!visible || (disabledCheck != null && disabledCheck.get() && !hasDisabledState)) return;
		
		
		this.hovered = mouseX >= this.x && mouseY >= this.y && mouseX < this.x + this.width && mouseY < this.y + this.height;
        
		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
		GlStateManager.enableTexture2D();
		mc.getTextureManager().bindTexture(this.loc);
		
		
		int stringColor = 0;
		
		if(disabledCheck != null && disabledCheck.get()) {
			GUIRenderHelper.drawTexturedRect(this.x, this.y, this.disabledU, this.disabledV, this.width, this.height, this.texWidth, this.texHeight);
			stringColor = disabledStringColor;
		} else if(isErrored) {
			GUIRenderHelper.drawTexturedRect(this.x, this.y, this.erroredU, this.erroredV, this.width, this.height, this.texWidth, this.texHeight);
			stringColor = erroredStringColor;
		} else {
			if(isToggleButton && isToggled) {
				GUIRenderHelper.drawTexturedRect(this.x, this.y, this.toggledU, this.toggledV, this.width, this.height, this.texWidth, this.texHeight);
				stringColor = toggleStringColor;
			} else if(!hovered) {
				GUIRenderHelper.drawTexturedRect(this.x, this.y, this.standardU, this.standardV, this.width, this.height, this.texWidth, this.texHeight);
				stringColor = standardStringColor;
			} else {
				GUIRenderHelper.drawTexturedRect(this.x, this.y, this.hoveredU, this.hoveredV, this.width, this.height, this.texWidth, this.texHeight);
				stringColor = hoveredStringColor;
			}
		}
		
		
	
		
		
		GUIRenderHelper.drawScaledString(this.displayString, this.x + this.width/2.0 - mc.fontRenderer.getStringWidth(this.displayString)/2.0, this.y + this.height/2.0 - mc.fontRenderer.FONT_HEIGHT/2.0, 1.0, stringColor);
		GlStateManager.color(1, 1, 1);
	}
	
	@Override
	public void drawButtonForegroundLayer(int mouseX, int mouseY) {
		super.drawButtonForegroundLayer(mouseX, mouseY);
		
	}

}
