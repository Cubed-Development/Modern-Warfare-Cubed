package com.paneedah.weaponlib.crafting.base;

import com.paneedah.mwc.ProjectConstants;
import com.paneedah.mwc.network.messages.WorkbenchServerMessage;
import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.animation.gui.GuiRenderUtil;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.crafting.IModernCraftingRecipe;
import com.paneedah.weaponlib.crafting.workbench.CustomSearchTextField;
import com.paneedah.weaponlib.crafting.workbench.GUIButtonCustom;
import com.paneedah.weaponlib.render.gui.GUIRenderHelper;
import com.paneedah.weaponlib.render.gui.GUIRenderHelper.StringAlignment;
import com.paneedah.weaponlib.vehicle.jimphysics.InterpolationKit;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.inventory.Container;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.oredict.OreDictionary;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import static com.paneedah.mwc.MWC.CHANNEL;
import static com.paneedah.mwc.proxies.ClientProxy.MC;
import static com.paneedah.mwc.ProjectConstants.ID;

public abstract class GUIContainerStation<T extends TileEntityStation> extends GuiContainer {

    // Textures for the GUI
    protected static final ResourceLocation GUI_TEX = new ResourceLocation(ID + ":textures/gui/workshop_sheet.png");
    protected static final ResourceLocation GUI_INV_TEX = new ResourceLocation(ID + ":textures/gui/workbench_inv_sheet.png");

    // GUI dimensions
    private static final int GUI_TEXTURE_WIDTH = 402;
    private static final int GUI_TEXTURE_HEIGHT = 240;

    // GUI color palette
    protected static final int GRAY = 0x7B7B7B;
    protected static final int RED = 0xA95E5F;
    protected static final int GOLD = 0xFDF17C;
    protected static final int BLUE = 0x8FC5E3;
    protected static final int GREEN = 0x97E394;
    protected static final int LIGHT_GREY = 0xDADADA;

    // Item Scroll
    private long lastUnixTimeSeconds = 0;
    private int itemIndex = 0;

    // Generic buttons & search box
    protected GUIButtonCustom craftButton, leftArrow, rightArrow, dismantleButton;
    protected CustomSearchTextField searchBox;

    // Tile entity
    protected T tileEntity;

    // Current item to have a tooltip renderer.
    private final ArrayList<String> tooltipRenderItem = new ArrayList<>();

    // Mod context
    @Setter
    protected static ModContext modContext;

    // Currently selected crafting piece
    @Getter
    @Setter
    private IModernCraftingRecipe selectedCraftingPiece = null;

    // Tells us if we can craft the currently selected item
    private boolean hasRequiredItems = false;
    protected HashMap<Ingredient, Boolean> hasAvailableMaterials = new HashMap<>();

    @Getter
    private int craftingMode = 1;

    // Currently used crafting list.
    protected ArrayList<IModernCraftingRecipe> filteredCraftingList = new ArrayList<>();

    // The page the workbench is on
    @Getter
    private int page = 1;
    private int minPage, maxPage;

    // Scroll bar data
    private boolean scrollBarGrabbed = false;
    private double scrollBarProgress;
    private int scrollOffsetAtGrab, grabY;
    private int scrollBarOffset = 0;

    public GUIContainerStation(T tileEntity, Container c) {
        super(c);

        // Sets the GUI size so that the game can display it properly
        // (if it's too small the texture & slots will end up off-screen)
        this.xSize = GUI_TEXTURE_WIDTH;
        this.ySize = GUI_TEXTURE_HEIGHT;

        // Default page range is 1 to 2
        setPageRange(1, 2);

        this.tileEntity = tileEntity;
    }

    @Override
    public void initGui() {
        super.initGui();

        searchBox = new CustomSearchTextField(GUI_TEX, "Search Items...", 0, 0, fontRenderer, guiLeft + 15, guiTop + 32, 84, 13);
        searchBox.setMaxStringLength(50);
        searchBox.setEnableBackgroundDrawing(true);
        searchBox.setVisible(true);
        searchBox.setTextColor(16777215);

        craftButton = new GUIButtonCustom(GUI_TEX, 0, guiLeft + 211, guiTop + 179, 53, 17, 480, 370, "CRAFT")
                .withStandardState(GRAY, 0, 240).withHoveredState(GOLD, 0, 257).withErroredState(RED, 0, 274)
                .withPageRestriction(2);

        leftArrow = new GUIButtonCustom(GUI_TEX, 1, guiLeft + 318, guiTop, 42, 20, 480, 370, "")
                .withStandardState(0xFFFFFF, 99, 304)
                .withHoveredState(0xFFFFFF, 141, 304)
                .withDisabledState(0xFFFFFF, 57, 304)
                .withDisabledCheck(() -> Boolean.valueOf(getPage() == 1));

        rightArrow = new GUIButtonCustom(GUI_TEX, 2, guiLeft + 360, guiTop, 42, 20, 480, 370, "")
                .withStandardState(0xFFFFFF, 99, 284)
                .withHoveredState(0xFFFFFF, 141, 284)
                //.withDisabledState(0xFFFFFF, u, v)
                .withDisabledState(0xFFFFFF, 57, 284)
                .withDisabledCheck(() -> Boolean.valueOf(getPage() == 2));

        dismantleButton = new GUIButtonCustom(GUI_INV_TEX, 6, guiLeft + 286, guiTop + 70, 73, 17, 480, 370, "DISMANTLE")
                .withStandardState(GRAY, 0, 283).withHoveredState(GOLD, 0, 300)
                .withErroredState(RED, 0, 317).withPageRestriction(1);

        craftButton.setErrored(true);
        addButton(craftButton);
        addButton(leftArrow);
        addButton(rightArrow);
        addButton(dismantleButton);
        setPage(1);

        // Fill the filtered list with the default set of options
        fillFilteredList();
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        super.actionPerformed(button);

        if (button == dismantleButton) {
            CHANNEL.sendToServer(new WorkbenchServerMessage(WorkbenchServerMessage.DISMANTLE, tileEntity.getPos(), 0, -1, null, ""));
        } else if (button == leftArrow) {
            setPage(getPage() - 1);
        } else if (button == rightArrow) {
            setPage(getPage() + 1);
            if (getPage() == 2) {
                tileEntity.pushInventoryRefresh = true;
            }
        }
    }

    /**
     * Child classes must override this and specify if crafting
     * should be blocked
     */
    public abstract boolean requiresMaterialsToSubmitCraftRequest();

    /**
     * Method that is called when the filtered list should be reset.
     * Must be overriden by child classes.
     */
    public abstract void fillFilteredList();

    public void setCraftingMode(int mode) {
        craftButton.setErrored(true);
        craftingMode = mode;
    }

    public boolean hasSelectedCraftingPiece() {
        return getSelectedCraftingPiece() != null;
    }

    public void onSelectNewCrafting(IModernCraftingRecipe crafting) {
        final CraftingEntry[] modernRecipe = crafting.getModernRecipe();
        final HashMap<ItemStack, Integer> counter = new HashMap<>();

        for (int i = 22; i < tileEntity.mainInventory.getSlots(); ++i) {
            final ItemStack stack = tileEntity.mainInventory.getStackInSlot(i);
            if (stack.isEmpty()) {
                continue;
            }

            if (!counter.containsKey(stack)) {
                counter.put(stack, stack.getCount());
            } else {
                int existingcount = counter.get(stack).intValue();
                counter.put(stack, existingcount + stack.getCount());
            }
        }

        hasRequiredItems = true;
        for (CraftingEntry is : modernRecipe) {
            if (is.isOreDictionary()) {
                final NonNullList<ItemStack> list = OreDictionary.getOres(is.getOreDictionaryEntry());
                boolean foundSomething = false;
                for (ItemStack toTest : list) {
                    if (counter.containsKey(toTest) && toTest.getCount() <= counter.get(toTest)) {
                        foundSomething = true;
                        hasAvailableMaterials.put(is.getIngredient(), Boolean.TRUE);
                        break;
                    } else {
                        hasRequiredItems = false;
                    }
                }

                if (!foundSomething || notEnoughIngredients(is, counter)) {
                    hasRequiredItems = false;
                    hasAvailableMaterials.put(is.getIngredient(), Boolean.FALSE);
                }
            } else {
                if (notEnoughIngredients(is, counter)) {
                    hasRequiredItems = false;
                    hasAvailableMaterials.put(is.getIngredient(), Boolean.FALSE);
                } else {
                    hasAvailableMaterials.put(is.getIngredient(), Boolean.TRUE);
                }
            }
        }

        if (requiresMaterialsToSubmitCraftRequest()) {
            craftButton.setErrored(!hasRequiredItems);
        } else {
            craftButton.setErrored(false);
        }
    }

    public static boolean notEnoughIngredients(CraftingEntry ingredient, HashMap<ItemStack, Integer> counter) {
        int finalcount = 0;
        for (ItemStack stack : counter.keySet())
            if (ingredient.getIngredient().test(stack)) {
                finalcount += counter.get(stack).intValue();
            }
        return ingredient.getCount() > finalcount;
    }

    public void setPageRange(int min, int max) {
        minPage = min;
        maxPage = max;
    }

    public String format(String unloc) {
        return I18n.format(unloc + ".name");
    }

    public boolean hasRequiredItems() {
        return hasRequiredItems;
    }

    @Override
    public void updateScreen() {
        //initGui();
        super.updateScreen();
        tooltipRenderItem.clear();
        if (tileEntity.pushInventoryRefresh) {
            tileEntity.pushInventoryRefresh = false;
            if (selectedCraftingPiece != null) {
                onSelectNewCrafting(selectedCraftingPiece);
            }
        }
    }

    public void addCustomTooltipInformation(int mouseX, int mouseY, ArrayList<String> tooltip) {}

    public abstract void addCraftingInformationToTooltip(ArrayList<String> tooltip);

    public void drawTooltips(int mouseX, int mouseY, float partialTicks) {
        renderHoveredToolTip(mouseX, mouseY);

        if (!tooltipRenderItem.isEmpty()) {
            drawHoveringText(tooltipRenderItem, mouseX, mouseY);
        }

        final ArrayList<String> strings = new ArrayList<>();

        // Add custom tooltip information
        addCustomTooltipInformation(mouseX, mouseY, strings);

        // Add crafting information to the tooltip
        if (GUIRenderHelper.checkInBox(mouseX, mouseY, this.guiLeft + 304, this.guiTop + 185, 81, 11) && tileEntity.craftingTimer != -1) {
            addCraftingInformationToTooltip(strings);
        }

        // Add dismantling info to the tooltip
        if (GUIRenderHelper.checkInBox(mouseX, mouseY, this.guiLeft + 261, this.guiTop + 57, 122, 7)) {
            for (int i = 0; i < 4; ++i) {
                if (tileEntity.dismantleStatus[i] == -1 || tileEntity.dismantleDuration[i] == -1) {
                    continue;
                }

                if (GUIRenderHelper.checkInBox(mouseX, mouseY, this.guiLeft + 261 + i * 31, this.guiTop + 57, 29, 7)) {
                    final ItemStack stack = tileEntity.mainInventory.getStackInSlot(i + 9);
                    final Item item = stack.getItem();
                    if (stack.isEmpty()) {
                        continue;
                    }

                    final int seconds = (tileEntity.dismantleDuration[i] - tileEntity.dismantleStatus[i]) / 20;
                    strings.add(TextFormatting.BLUE + "Dismantling: " + TextFormatting.WHITE + I18n.format(tileEntity.mainInventory.getStackInSlot(i + 9).getItem().getTranslationKey() + ".name"));
                    strings.add(TextFormatting.BLUE + "Time remaining: " + TextFormatting.WHITE + GUIRenderHelper.formatTimeString(seconds, TimeUnit.SECONDS));
                    strings.add(TextFormatting.BLUE + "Products:");

                    for (CraftingEntry s : ((IModernCraftingRecipe) item).getModernRecipe())
                        strings.add(TextFormatting.GOLD + String.valueOf((int) Math.round(s.getCount() * s.getYield())) + "x " + TextFormatting.WHITE + format(s.getIngredient().getMatchingStacks()[0].getItem().getTranslationKey()));
                }
            }
        }

        if (!strings.isEmpty()) {
            drawHoveringText(strings, mouseX, mouseY);
        }

        GlStateManager.color(1, 1, 1, 1);
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        super.drawScreen(mouseX, mouseY, partialTicks);
        if (getPage() == 2) {
            searchBox.drawTextBox();
        }
    }

    @Override
    protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
        super.mouseClicked(mouseX, mouseY, mouseButton);
        searchBox.mouseClicked(mouseX, mouseY, mouseButton);

        if (GUIRenderHelper.checkInBox(mouseX, mouseY, this.guiLeft + 40, this.guiTop + 219, 176, 20)) {
            final int boxId = (mouseX - (this.guiLeft + 40)) / 20;
            CHANNEL.sendToServer(new WorkbenchServerMessage(WorkbenchServerMessage.MOVE_OUTPUT, tileEntity.getPos(), MC.player.getEntityId(), boxId));
        }

        int c = (int) Math.floor(filteredCraftingList.size() * scrollBarProgress / 7) * 7;
        for (int y = 0; y < 6; ++y) {
            for (int x = 0; x < 7; ++x) {
                if (c == filteredCraftingList.size()) {
                    break;
                }

                boolean selected = GUIRenderHelper.checkInBox(mouseX, mouseY, this.guiLeft + 12 + (x * 23), this.guiTop + 52 + (y * 23), 22, 22);
                if (selected) {
                    onSelectNewCrafting(filteredCraftingList.get(c));
                    setSelectedCraftingPiece(filteredCraftingList.get(c));
                }

                c += 1;
            }
        }
    }

    @Override
    protected void keyTyped(char typedChar, int keyCode) throws IOException {
        final boolean cancellationFlag = searchBox.getText().isEmpty() && keyCode == Keyboard.KEY_BACK;

        // This 'if' statement prevents the GUI from closing when we hit "E" (or whatever
        // the inventory key is!)
        if (!(MC.gameSettings.keyBindInventory.isActiveAndMatches(keyCode) && searchBox.isFocused())) {
            super.keyTyped(typedChar, keyCode);
        }

        searchBox.textboxKeyTyped(typedChar, keyCode);

        if (!cancellationFlag) {
            if (keyCode == Keyboard.KEY_BACK) {
                fillFilteredList();
            }

            if (!searchBox.getText().isEmpty()) {
                // Filter out bad results.
                filteredCraftingList.removeIf((a) -> !I18n.format(a.getItemStack().getTranslationKey() + ".name").toLowerCase().contains(searchBox.getText().toLowerCase()));
            }
        }
    }

    public void setItemRenderTooltip(ItemStack stack, String... strings) {
        if (stack.isEmpty()) {
            return;
        }

        Item item = stack.getItem();

        tooltipRenderItem.clear();
        tooltipRenderItem.add(item.getItemStackDisplayName(stack));
        final ITooltipFlag flag = MC.gameSettings.advancedItemTooltips ? ITooltipFlag.TooltipFlags.ADVANCED : ITooltipFlag.TooltipFlags.NORMAL;
        stack.getItem().addInformation(stack, tileEntity.getWorld(), tooltipRenderItem, flag);

        if (strings.length > 0) {
            tooltipRenderItem.addAll(Arrays.asList(strings));
        }
    }

    protected void setPage(int id) {
        // Lock to minimum page
        if (id < minPage) {
            id = minPage;
        }

        // Lock to maximum page
        if (id > maxPage) {
            id = maxPage;
        }

        scrollBarProgress = 0;
        scrollBarOffset = 0;
        page = id;
        ((ContainerStation) this.inventorySlots).page = id;

        for (GuiButton b : this.buttonList) {
            if (b instanceof GUIButtonCustom && ((GUIButtonCustom) b).getPageID() != -1) {
                b.visible = ((GUIButtonCustom) b).getPageID() == id;
            }
        }
    }

    public void render3DItemInGUI(Item item, int x, int y, int mouseX, int mouseY) {
        GlStateManager.pushMatrix();

        GlStateManager.translate(x, y, 100.0F);
        GlStateManager.translate(8.0F, 8.0F, 0.0F);
        GlStateManager.scale(1.0F, -1.0F, 1.0F);
        GlStateManager.scale(20.0F, 20.0F, 20.0F);

        GlStateManager.rotate(15 + mouseY * 0.01f, 1, 0, 0);
        GlStateManager.rotate(120 + mouseX * 0.01f, 0, 1, 0);
        GlStateManager.rotate(0, 0, 0, 1);

        GlStateManager.scale(4, 4, 4);
        GlStateManager.enableLighting();
        RenderHelper.enableStandardItemLighting();

        MC.getRenderItem().renderItem(new ItemStack(item), TransformType.THIRD_PERSON_LEFT_HAND);

        RenderHelper.disableStandardItemLighting();
        GlStateManager.disableLighting();
        GlStateManager.popMatrix();
    }

    public boolean shouldOverrideCraftingModeOneRender() {
        return false;
    }

    public void doCraftingModeOneRender(float partialTicks, int mouseX, int mouseY) {}

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        drawDefaultBackground();

        GlStateManager.enableBlend();

        if (getPage() == 1) {
            MC.getTextureManager().bindTexture(GUI_INV_TEX);
            drawModalRectWithCustomSizedTexture(this.guiLeft, this.guiTop, 0f, 0f, 402, 232, 480, 370);

            for (int i = 0; i < 4; ++i) {
                if (tileEntity.dismantleStatus[i] == -1 || tileEntity.dismantleDuration[i] == -1) {
                    continue;
                }

                final double progress = InterpolationKit.interpolateValue(tileEntity.previousDismantleStatus[i], tileEntity.dismantleStatus[i], MC.getRenderPartialTicks()) / (double) tileEntity.dismantleDuration[i];
                drawModalRectWithCustomSizedTexture(this.guiLeft + 261 + i * 31, this.guiTop + 57, 81, 232, 29, 7, 480, 370);
                drawModalRectWithCustomSizedTexture(this.guiLeft + 261 + i * 31, this.guiTop + 57, 81, 239, (int) (29 * progress), 7, 480, 370);
            }

            GUIRenderHelper.drawScaledString("INVENTORY", this.guiLeft + 10, this.guiTop + 5, 1.2, BLUE);
            //GUIRenderHelper.drawScaledString("DISMANTLING", this.guiLeft + 255, this.guiTop + 5, 1.2, BLUE);
            GUIRenderHelper.drawScaledString("Player Inventory", this.guiLeft + 21, this.guiTop + 115, 1.0, LIGHT_GREY);

        } else if (getPage() == 2) {
            GlStateManager.color(1f, 1f, 1f, 1f);
            GlStateManager.pushMatrix();

            MC.getTextureManager().bindTexture(GUI_TEX);

            GlStateManager.enableBlend();

            // Draw background elements
            drawModalRectWithCustomSizedTexture(this.guiLeft, this.guiTop, 0f, 0f, 192, 210, 480, 370);
            drawModalRectWithCustomSizedTexture(200 + this.guiLeft, 20 + this.guiTop, 200f, 20f, 202, 190, 480, 370);
            drawModalRectWithCustomSizedTexture(this.guiLeft, 213 + this.guiTop, 0f, 213f, 241, 27, 480, 370);

            // Draw progress bar
            // forty notches, therefore 1/40.0 = 0.025
            final double prevProgress = (Math.max(tileEntity.prevCraftingTimer, 0)) / (double) tileEntity.craftingDuration;
            final double currProgress = (Math.max(tileEntity.craftingTimer, 0)) / (double) tileEntity.craftingDuration;
            final double intpProgress = InterpolationKit.interpolateValue(prevProgress, currProgress, MC.getRenderPartialTicks());
            final double progress = (0.025) * (Math.round(intpProgress / (0.025)));

            drawModalRectWithCustomSizedTexture(this.guiLeft + 304, this.guiTop + 185, 53f, 240f, 81, 11, 480, 370);
            drawModalRectWithCustomSizedTexture(this.guiLeft + 304, this.guiTop + 185, 53f, 240f + 11, (int) (81 * progress), 11, 480, 370);

            if (!Mouse.isButtonDown(0)) {
                scrollBarGrabbed = false;
            }

            // Handle scroll bar
            final int scrollBarVertical = this.guiTop + 54 + scrollBarOffset;
            final int scrollBarHeight = (int) (138 * Math.min(1.0, 42.0 / filteredCraftingList.size()));

            drawModalRectWithCustomSizedTexture(this.guiLeft + 176, scrollBarVertical, 412, 54, 6, scrollBarHeight, 480, 370);

            if (Mouse.isButtonDown(0) && GUIRenderHelper.checkInBox(mouseX, mouseY, this.guiLeft + 176, scrollBarVertical, 6, scrollBarHeight) && !scrollBarGrabbed) {
                scrollBarGrabbed = true;
                scrollOffsetAtGrab = scrollBarOffset;
                grabY = mouseY;
            }

            if (scrollBarGrabbed) {
                scrollBarOffset = scrollOffsetAtGrab + (mouseY - grabY);
                if (scrollBarOffset + scrollBarHeight > 138) {
                    scrollBarOffset = 138 - scrollBarHeight;
                } else if (scrollBarOffset < 0) {
                    scrollBarOffset = 0;
                }
            }

            // Calculate the new scroll bar progress.
            scrollBarProgress = scrollBarOffset / (138.0 - scrollBarHeight);
            if (Double.isNaN(scrollBarProgress)) {
                scrollBarProgress = 0.0;
            }

            if (!filteredCraftingList.isEmpty()) {
                // Draw slots
                int c = (int) Math.floor(filteredCraftingList.size() * scrollBarProgress / 7) * 7;
                for (int y = 0; y < 6; ++y) {
                    for (int x = 0; x < 7; ++x) {
                        if (c >= filteredCraftingList.size()) {
                            break;
                        }

                        if (filteredCraftingList.get(c) == getSelectedCraftingPiece()) {
                            drawModalRectWithCustomSizedTexture(this.guiLeft + 12 + (x * 23), this.guiTop + 52 + (y * 23), 97f - 44, 262f, 22, 22, 480, 370);

                        } else {
                            final boolean selected = GUIRenderHelper.checkInBox(mouseX, mouseY, this.guiLeft + 12 + (x * 23), this.guiTop + 52 + (y * 23), 22, 22);
                            if (!selected) {
                                drawModalRectWithCustomSizedTexture(this.guiLeft + 12 + (x * 23), this.guiTop + 52 + (y * 23), 97f - 22, 262f, 22, 22, 480, 370);

                            } else {
                                setItemRenderTooltip(filteredCraftingList.get(c).getItemStack());
                                drawModalRectWithCustomSizedTexture(this.guiLeft + 12 + (x * 23), this.guiTop + 52 + (y * 23), 97f, 262f, 22, 22, 480, 370);
                            }
                        }

                        RenderHelper.enableGUIStandardItemLighting();

                        MC.getRenderItem().renderItemIntoGUI(filteredCraftingList.get(c).getItemStack(), this.guiLeft + 15 + (x * 23), this.guiTop + 55 + (y * 23));
                        MC.getTextureManager().bindTexture(GUI_TEX);

                        RenderHelper.disableStandardItemLighting();

                        c += 1;
                    }
                }
            }

            if (getCraftingMode() == 1 && hasSelectedCraftingPiece() && shouldOverrideCraftingModeOneRender()) {
                // Implemented in order to allow the workbench to use
                // special rendering for displaying guns.
                doCraftingModeOneRender(partialTicks, mouseX, mouseY);

            } else if (hasSelectedCraftingPiece()) {
                GuiRenderUtil.drawScaledString(fontRenderer, format(getSelectedCraftingPiece().getItemStack().getTranslationKey()), this.guiLeft + 214, this.guiTop + 31, 0.9, 0xFDF17C);
                GlStateManager.pushMatrix();
                RenderHelper.enableGUIStandardItemLighting();
                GlStateManager.translate(this.guiLeft + 275, this.guiTop + 45, 0);
                GlStateManager.scale(3, 3, 3);

                MC.getRenderItem().renderItemIntoGUI(getSelectedCraftingPiece().getItemStack(), 0, 0);

                GlStateManager.popMatrix();
            }

            GlStateManager.enableBlend();

            // Draw all the text within the GUI
            GuiRenderUtil.drawScaledString(fontRenderer, "CRAFTING", this.guiLeft + 11, this.guiTop + 5, 1.2, 0x8FC5E3);
            GuiRenderUtil.drawScaledString(fontRenderer, "Progress", this.guiLeft + 326, this.guiTop + 175, 0.8, 0xFFFFFF);
            GuiRenderUtil.drawScaledString(fontRenderer, "Output", this.guiLeft + 7, this.guiTop + 223, 0.9, 0xFFFFFF);
            GuiRenderUtil.drawScaledString(fontRenderer, "CRAFT", this.guiLeft + 222, this.guiTop + 184, 1.0, 0xB06061);
            GuiRenderUtil.drawScaledString(fontRenderer, "Results: " + TextFormatting.YELLOW + filteredCraftingList.size(), this.guiLeft + 12, this.guiTop + 191, 0.8, 0xFFFFFF);

            if (hasSelectedCraftingPiece()) {
                final IModernCraftingRecipe weapon = getSelectedCraftingPiece();
                if (weapon.getModernRecipe() != null && weapon.getModernRecipe().length != 0) {
                    int c = 0;
                    for (CraftingEntry entry : weapon.getModernRecipe()) {
                        if (entry.getIngredient() == null) {
                            ProjectConstants.LOGGER.warn("Skipped resource");
                            continue;
                        }

                        final ItemStack itemStack = updateandGetStacktoRender(entry);
                        final boolean hasItem = hasAvailableMaterials.get(entry.getIngredient()).booleanValue();
                        final int x = this.guiLeft + 210 + (c * 20);
                        final int y = this.guiTop + 122;

                        MC.getTextureManager().bindTexture(GUI_TEX);

                        if (GUIRenderHelper.checkInBox(mouseX, mouseY, x, y, 15, 15)) {
                            final TextFormatting formatColor;
                            final int percentage = ((int) Math.round(entry.getYield() * 100));

                            if (percentage <= 25) {
                                formatColor = TextFormatting.RED;
                            } else if (percentage <= 50) {
                                formatColor = TextFormatting.GOLD;
                            } else if (percentage <= 75) {
                                formatColor = TextFormatting.YELLOW;
                            } else {
                                formatColor = TextFormatting.GREEN;
                            }

                            setItemRenderTooltip(itemStack, formatColor + "" + percentage + "% Yield");

                            GlStateManager.enableTexture2D();

                            MC.getTextureManager().bindTexture(GUI_TEX);

                            GlStateManager.enableBlend();
                        }

                        GlStateManager.pushMatrix();
                        GlStateManager.color(1f, 1f, 1f);
                        GlStateManager.translate(x + 0.5, y + 0.5, 0);
                        GlStateManager.scale(0.125, 0.125, 0.125);

                        if (hasItem) {
                            drawModalRectWithCustomSizedTexture(0, 0, 242f, 215f, 113, 114, 480, 370);
                        } else {
                            drawModalRectWithCustomSizedTexture(0, 0, 358f, 215f, 113, 114, 480, 370);
                        }

                        GlStateManager.popMatrix();

                        MC.getRenderItem().renderItemIntoGUI(itemStack, x, y);

                        GUIRenderHelper.drawScaledString("x" + entry.getCount(), x + 8, y + 12, 0.6, hasItem ? GREEN : RED);
                        c += 1;
                    }
                }
            }

            GlStateManager.popMatrix();

            boolean playerInventoryFull = MC.player.inventory.getFirstEmptyStack() == -1;
            if (playerInventoryFull) {
                GUIRenderHelper.drawAlignedString("Inventory Full!", StringAlignment.LEFT, false, this.guiLeft + 245, this.guiTop + 214, 1.0, RED);
            }

            for (int i = 0; i < 9; ++i) {
                final ItemStack stack = tileEntity.mainInventory.getStackInSlot(i);

                MC.getTextureManager().bindTexture(GUI_TEX);

                if (GUIRenderHelper.checkInBox(mouseX, mouseY, this.guiLeft + 40 + (i * 22), this.guiTop + 219, 20, 20)) {
                    GUIRenderHelper.drawTexturedRect(this.guiLeft + 39 + (i * 22), this.guiTop + 218, playerInventoryFull ? 18 : 0, 351, 18, 18, 480, 370);
                    setItemRenderTooltip(stack);
                }

                RenderHelper.enableGUIStandardItemLighting();
                MC.getRenderItem().renderItemIntoGUI(stack, this.guiLeft + 40 + (i * 22), this.guiTop + 219);
                RenderHelper.disableStandardItemLighting();
            }

            GlStateManager.pushMatrix();
            GlStateManager.translate(0, 0, 100);

            for (int i = 0; i < 9; ++i) {
                final ItemStack stack = tileEntity.mainInventory.getStackInSlot(i);
                if (!stack.isEmpty()) {
                    GUIRenderHelper.drawScaledString(tileEntity.mainInventory.getStackInSlot(i).getCount() + "", this.guiLeft + 50 + (i * 22), this.guiTop + 230, 1, 0xFFFFFF);
                }
            }

            GlStateManager.popMatrix();
        }
    }

    private ItemStack updateandGetStacktoRender(CraftingEntry entry) {
        final ItemStack[] itemStacks = entry.getIngredient().getMatchingStacks();
        long currentUnixTimeSeconds = System.currentTimeMillis() / 1000;

        if (currentUnixTimeSeconds - lastUnixTimeSeconds >= 1) {
            itemIndex = itemIndex + 1 >= itemStacks.length ? 0 : itemIndex + 1;
            lastUnixTimeSeconds = currentUnixTimeSeconds;
        }

        return itemStacks[itemIndex];
    }

}
