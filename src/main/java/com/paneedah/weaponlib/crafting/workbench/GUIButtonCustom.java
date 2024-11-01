package com.paneedah.weaponlib.crafting.workbench;

import com.paneedah.weaponlib.render.gui.GUIRenderHelper;
import lombok.Getter;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.ResourceLocation;

import java.util.function.Supplier;

/**
 * Custom GUI button class that adds several functionalities:
 * - Hovered UV
 * - Toggled UV
 * - Disabled UV (+ a disabled state)
 * <p>
 * Works well with sprite sheets.
 *
 * @author Homer Riva-Cambrin, 2022
 */
public class GUIButtonCustom extends GuiButton {

    // Sprite sheet this button should use while rendering & the texture width and height
    private final ResourceLocation loc;
    private final int texWidth;
    private final int texHeight;

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

    /**
     * -- GETTER --
     *  The page ID that this button is isolated to.
     *
     * @return this button will renderer only with this page ID, -1 if non-applicable.
     */
    // The page ID-- buttons have the optionality
    // of being unique to a singular page.
    @Getter
    private int pageID = -1;

    private boolean isToggleButton = false;
    private boolean isToggled = false;

    public GUIButtonCustom(ResourceLocation resourceLoc, int buttonId, int x, int y, int widthIn, int heightIn, int imgW, int imgH, String buttonText) {
        super(buttonId, x, y, widthIn, heightIn, buttonText);
        loc = resourceLoc;
        texWidth = imgW;
        texHeight = imgH;
    }

    /**
     * Provides the standard state UV to the button in order to renderer
     * the button normally (not hovered or disabled, etc.)
     *
     * @param color - color as a hexadecimal value
     * @param u - top left coordinate of texture selection (x component)
     * @param v - top left coordinate of texture selection (y component)
     *
     * @return itself
     */
    public GUIButtonCustom withStandardState(int color, int u, int v) {
        standardStringColor = color;
        standardU = u;
        standardV = v;
        return this;
    }

    /**
     * Provides the hovered state UV to the button in order to renderer
     * the button with a different texture should the mouse cursor be
     * above it.
     *
     * @param color - color as a hexadecimal value
     * @param u - top left coordinate of texture selection (x component)
     * @param v - top left coordinate of texture selection (y component)
     *
     * @return itself
     */
    public GUIButtonCustom withHoveredState(int color, int u, int v) {
        hoveredStringColor = color;
        hoveredU = u;
        hoveredV = v;
        return this;
    }

    /**
     * Provides the toggled state UV to the button in order to renderer
     * the button with its toggled on state should this be a toggle button.
     *
     * @param color - color as a hexadecimal value
     * @param u - top left coordinate of texture selection (x component)
     * @param v - top left coordinate of texture selection (y component)
     *
     * @return itself
     */
    public GUIButtonCustom withToggledState(int color, int u, int v) {
        toggleStringColor = color;
        toggledU = u;
        toggledV = v;
        return this;
    }

    /**
     * Provides the disabled state UV to the button in order to renderer
     * the button if it is in its inactive/disabled state.
     *
     * @param color - color as a hexadecimal value
     * @param u - top left coordinate of texture selection (x component)
     * @param v - top left coordinate of texture selection (y component)
     *
     * @return itself
     */
    public GUIButtonCustom withErroredState(int color, int u, int v) {
        erroredStringColor = color;
        erroredU = u;
        erroredV = v;
        return this;
    }

    /**
     * Provides the disabled state UV to the button in order to renderer
     * the button if it is in its inactive/disabled state.
     *
     * @param color - color as a hexadecimal value
     * @param u - top left coordinate of texture selection (x component)
     * @param v - top left coordinate of texture selection (y component)
     *
     * @return itself
     */
    public GUIButtonCustom withDisabledState(int color, int u, int v) {
        hasDisabledState = true;
        disabledStringColor = color;
        disabledU = u;
        disabledV = v;
        return this;
    }

    /**
     * Allows the user to specify a lambda function under which the button should not be rendered. An example of this would
     * be providing it with the following:
     * <p>
     * () -> {
     * return this.hat == 1;
     * }
     * <p>
     * In this case, if 'hat' is equal to one, it will not render the button.
     *
     * @param supplier Java lambda function that returns a boolean stating the conditions under which the button should be disabled
     *
     * @return itself
     */
    public GUIButtonCustom withDisabledCheck(Supplier<Boolean> supplier) {
        disabledCheck = supplier;
        return this;
    }

    /**
     * Button will only appear if using the following page
     *
     * @param pageID - page ID that this button should be isolated to
     *
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
        isToggleButton = true;
        return this;
    }

    /**
     * Returns the button's disabled status
     *
     * @return is the button disabled
     */
    public boolean isDisabled() {
        return isErrored;
    }

    /**
     * Is the button in a disabled state?
     *
     * @param disable button in disabled state
     */
    public void setErrored(boolean disable) {
        isErrored = disable;
    }

    /**
     * Toggle button stuff
     */
    public void toggleOff() {
        isToggled = false;
    }

    public void toggleOn() {
        isToggled = true;
    }

    public void toggle() {
        isToggled = !isToggled;
    }

    public boolean getToggleState() {
        return isToggled;
    }

    @Override
    public void drawButton(Minecraft MC, int mouseX, int mouseY, float partialTicks) {
        if (!visible || (disabledCheck != null && disabledCheck.get().booleanValue() && !hasDisabledState)) {
            return;
        }

        this.hovered = mouseX >= this.x && mouseY >= this.y && mouseX < this.x + this.width && mouseY < this.y + this.height;

        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        GlStateManager.enableTexture2D();
        MC.getTextureManager().bindTexture(loc);

        int stringColor;
        if (disabledCheck != null && disabledCheck.get().booleanValue()) {
            GUIRenderHelper.drawTexturedRect(this.x, this.y, disabledU, disabledV, this.width, this.height, texWidth, texHeight);
            stringColor = disabledStringColor;

        } else if (isErrored) {
            GUIRenderHelper.drawTexturedRect(this.x, this.y, erroredU, erroredV, this.width, this.height, texWidth, texHeight);
            stringColor = erroredStringColor;

        } else {
            if (isToggleButton && isToggled) {
                GUIRenderHelper.drawTexturedRect(this.x, this.y, toggledU, toggledV, this.width, this.height, texWidth, texHeight);
                stringColor = toggleStringColor;

            } else if (!this.hovered) {
                GUIRenderHelper.drawTexturedRect(this.x, this.y, standardU, standardV, this.width, this.height, texWidth, texHeight);
                stringColor = standardStringColor;

            } else {
                GUIRenderHelper.drawTexturedRect(this.x, this.y, hoveredU, hoveredV, this.width, this.height, texWidth, texHeight);
                stringColor = hoveredStringColor;
            }
        }

        GUIRenderHelper.drawScaledString(this.displayString, this.x + this.width / 2.0 - MC.fontRenderer.getStringWidth(this.displayString) / 2.0, this.y + this.height / 2.0 - MC.fontRenderer.FONT_HEIGHT / 2.0, 1.0, stringColor);
        GlStateManager.color(1, 1, 1);
    }

    @Override
    public void drawButtonForegroundLayer(int mouseX, int mouseY) {
        super.drawButtonForegroundLayer(mouseX, mouseY);
    }

    @Override
    public void playPressSound(SoundHandler soundHandlerIn) {
        if ((disabledCheck != null && disabledCheck.get().booleanValue()) || isErrored) {
            return;
        }

        soundHandlerIn.playSound(PositionedSoundRecord.getMasterRecord(SoundEvents.UI_BUTTON_CLICK, 1.0F));
    }
}
