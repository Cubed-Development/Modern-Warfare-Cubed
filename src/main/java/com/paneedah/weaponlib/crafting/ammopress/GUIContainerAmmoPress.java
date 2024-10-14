package com.paneedah.weaponlib.crafting.ammopress;

import com.paneedah.mwc.network.messages.WorkbenchServerMessage;
import com.paneedah.weaponlib.ItemBullet;
import com.paneedah.weaponlib.crafting.CraftingGroup;
import com.paneedah.weaponlib.crafting.CraftingRegistry;
import com.paneedah.weaponlib.crafting.base.GUIContainerStation;
import com.paneedah.weaponlib.crafting.workbench.CustomSearchTextField;
import com.paneedah.weaponlib.crafting.workbench.GUIButtonCustom;
import com.paneedah.weaponlib.render.gui.GUIRenderHelper;
import io.redstudioragnarok.redcore.utils.MathUtil;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;
import org.lwjgl.input.Keyboard;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

import static com.paneedah.mwc.MWC.CHANNEL;
import static com.paneedah.mwc.proxies.ClientProxy.MC;
import static com.paneedah.mwc.ProjectConstants.ID;

/**
 * GUIContainer for the Workbench Block
 * <p>
 * Crafting Modes:
 * 1.) Bullets
 * 2.) Magazines
 * <p>
 * Features (plus the features of it's parent class {@link GUIContainerStation})
 * 1. Player has three categories to choose from weapons, attachments, and modification attachments
 * 2. A queue that allows players to queue items up for crafting (maximum sets in queue is 7)
 * 3. Textbox that allows the player to specify the quantity
 *
 * @author Homer Riva-Cambrin, 2022
 * @version September 23rd, 2022
 */
public class GUIContainerAmmoPress extends GUIContainerStation<TileEntityAmmoPress> {

    // Ammo press texture location
    private static final ResourceLocation AMMO_PRESS_TEX = new ResourceLocation(ID + ":textures/gui/ammosheet.png");

    // Selectors & Quantity Box
    private GUIButtonCustom bulletSelector, magazineSelector, grenadeSelector;
    private CustomSearchTextField quantityBox;


    public GUIContainerAmmoPress(EntityPlayer player, InventoryPlayer inventory,
                                 TileEntityAmmoPress tileEntityAmmoPress) {
        super(tileEntityAmmoPress, new ContainerAmmoPress(player, inventory, tileEntityAmmoPress));
    }


    @Override
    public void initGui() {
        super.initGui();

        quantityBox = new CustomSearchTextField(AMMO_PRESS_TEX, "Amt.", 1, 1, this.fontRenderer, this.guiLeft + 267, this.guiTop + 183, 84, 13);
        quantityBox.setMaxStringLength(3);
        quantityBox.setEnableBackgroundDrawing(true);
        quantityBox.setVisible(true);
        quantityBox.setTextColor(16777215);

        bulletSelector = new GUIButtonCustom(AMMO_PRESS_TEX, 3, this.guiLeft + 107, this.guiTop + 29, 19, 20, 256, 256, "")
                .withStandardState(0xFFFFFF, 0, 0).withHoveredState(0xFFFFFF, 19, 0)
                .withToggledState(0xFFFFFF, 38, 0).withPageRestriction(2).makeToggleButton();

        magazineSelector = new GUIButtonCustom(AMMO_PRESS_TEX, 4, this.guiLeft + 130, this.guiTop + 29, 19, 20, 256, 256, "")
                .withStandardState(0xFFFFFF, 0, 20).withHoveredState(0xFFFFFF, 19, 20)
                .withToggledState(0xFFFFFF, 38, 20).withPageRestriction(2).makeToggleButton();

        grenadeSelector = new GUIButtonCustom(AMMO_PRESS_TEX, 5, this.guiLeft + 153, this.guiTop + 29, 19, 20, 256, 256, "")
                .withStandardState(0xFFFFFF, 0, 40).withHoveredState(0xFFFFFF, 19, 40)
                .withToggledState(0xFFFFFF, 38, 40).withPageRestriction(2).makeToggleButton();

        bulletSelector.toggleOn();

        addButton(bulletSelector);
        addButton(magazineSelector);
        addButton(grenadeSelector);

        setPage(1);
    }

    /**
     * False because we are only interested in if the player
     * has the materials if we are asking: Can they craft the
     * latest item in the queue? If not, do not proceed, if yes,
     * proceed.
     */
    @Override
    public boolean requiresMaterialsToSubmitCraftRequest() {
        return false;
    }

    @Override
    public void fillFilteredList() {
        filteredCraftingList.clear();
        if (getCraftingMode() == 1) {
            filteredCraftingList.addAll(CraftingRegistry.getCraftingListForGroup(CraftingGroup.BULLET));
        } else if (getCraftingMode() == 2) {
            filteredCraftingList.addAll(CraftingRegistry.getCraftingListForGroup(CraftingGroup.MAGAZINE));
        } else if (getCraftingMode() == 3) {
            filteredCraftingList.addAll(CraftingRegistry.getCraftingListForGroup(CraftingGroup.GRENADE));
        }
    }

    @Override
    public void updateScreen() {
        super.updateScreen();
        if (tileEntity.getCraftingQueue().size() > 4) {
            craftButton.setErrored(true);
        } else if (hasSelectedCraftingPiece()) {
            craftButton.setErrored(false);
        }
    }

    @Override
    protected void actionPerformed(GuiButton button) throws IOException {
        super.actionPerformed(button);

        if (button == craftButton && !craftButton.isDisabled()) {
            if (hasSelectedCraftingPiece() && quantityBox.getText().length() != 0) {
                int quantity = Integer.parseInt(quantityBox.getText());
                CHANNEL.sendToServer(new WorkbenchServerMessage(WorkbenchServerMessage.CRAFT, tileEntity.getPos(), getSelectedCraftingPiece().getItemStack().getTranslationKey(), getSelectedCraftingPiece().getCraftingGroup(), quantity));
            }

        } else if (button == bulletSelector) {
            ((GUIButtonCustom) button).toggleOn();
            magazineSelector.toggleOff();
            grenadeSelector.toggleOff();

            setCraftingMode(1);
            setSelectedCraftingPiece(null);

            fillFilteredList();
        } else if (button == magazineSelector) {
            ((GUIButtonCustom) button).toggleOn();
            bulletSelector.toggleOff();
            grenadeSelector.toggleOff();

            setCraftingMode(2);
            setSelectedCraftingPiece(null);

            fillFilteredList();
        } else if (button == grenadeSelector) {
            ((GUIButtonCustom) button).toggleOn();
            magazineSelector.toggleOff();
            bulletSelector.toggleOff();

            setCraftingMode(3);
            setSelectedCraftingPiece(null);

            fillFilteredList();
        }
    }

    @Override
    public void addCraftingInformationToTooltip(ArrayList<String> tooltip) {
        ItemStack stack = tileEntity.getLatestStackInQueue();
        tooltip.add(TextFormatting.GOLD + "Crafting: " + TextFormatting.WHITE + format(stack.getTranslationKey()));

        final int remainingTicks = tileEntity.craftingDuration - tileEntity.craftingTimer;
        tooltip.add(TextFormatting.GOLD + "Time remaining: " + TextFormatting.WHITE + String.format("%.2f", Float.valueOf(remainingTicks / 20F)) + "s");

        if (stack.getItem() instanceof ItemBullet) {
            tooltip.add(TextFormatting.GOLD + "Quantity: " + TextFormatting.WHITE + stack.getCount() + TextFormatting.GREEN + " -> " + (stack.getCount() * TileEntityAmmoPress.BULLETS_CRAFTED_PER_PRESS));
        } else {
            tooltip.add(TextFormatting.GOLD + "Quantity: " + TextFormatting.WHITE + stack.getCount());
        }
    }


    @Override
    public void addCustomTooltipInformation(int mouseX, int mouseY, ArrayList<String> tooltip) {
        super.addCustomTooltipInformation(mouseX, mouseY, tooltip);
        if (tileEntity.hasStack()) {
            if (mouseY >= this.guiTop && mouseY <= this.guiTop + 20) {
                int id = (mouseX - (this.guiLeft + 200)) / 20;
                if (id >= 0 && tileEntity.getCraftingQueue().size() - 1 >= id) {

                    ItemStack stack = tileEntity.getCraftingQueue().get(id);


                    tooltip.add(format(stack.getTranslationKey()));
                    if (stack.getItem() instanceof ItemBullet) {
                        tooltip.add(TextFormatting.GRAY + "Quantity: " + TextFormatting.GOLD +
                                stack.getCount() + TextFormatting.GREEN + " -> " + (stack.getCount() * TileEntityAmmoPress.BULLETS_CRAFTED_PER_PRESS));
                    } else {
                        tooltip.add(TextFormatting.GRAY + "Quantity: " + TextFormatting.GOLD + stack.getCount());
                    }

                }
            }
        }

        if (hasSelectedCraftingPiece() && getSelectedCraftingPiece().getItemStack().getItem() instanceof ItemBullet &&
                GUIRenderHelper.checkInBox(mouseX, mouseY, this.guiLeft + 268, this.guiTop + 201, 20, 20)) {

            tooltip.add(String.format("Amount %d will make %d bullets", Integer.valueOf(getCurrentAmountInQuantityBox()), Integer.valueOf(getCurrentAmountInQuantityBox() * TileEntityAmmoPress.BULLETS_CRAFTED_PER_PRESS)));
        }

    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {

        super.drawScreen(mouseX, mouseY, partialTicks);
        if (getPage() == 2) {
            quantityBox.drawTextBox();
        }
        drawTooltips(mouseX, mouseY, partialTicks);

        if (getPage() == 2) {

            LinkedList<ItemStack> queue = tileEntity.getCraftingQueue();
            GlStateManager.enableBlend();
            for (int i = 0; i < queue.size(); ++i) {
                MC.getTextureManager().bindTexture(AMMO_PRESS_TEX);
                if (GUIRenderHelper.checkInBox(mouseX, mouseY, this.guiLeft + 200 + i * 20, this.guiTop, 20, 20)) {
                    GUIRenderHelper.drawTexturedRect(this.guiLeft + 200 + i * 20, this.guiTop, 20, 80, 20, 20, 256, 256);
                } else {
                    GUIRenderHelper.drawTexturedRect(this.guiLeft + 200 + i * 20, this.guiTop, 0, 80, 20, 20, 256, 256);
                }
            }

            for (int i = 0; i < queue.size(); ++i) {
                ItemStack stack = queue.get(i);
                MC.getRenderItem().renderItemIntoGUI(stack, this.guiLeft + 202 + i * 20, this.guiTop + 2);
            }

            for (int i = 0; i < queue.size(); ++i) {
                ItemStack stack = queue.get(i);
                GUIRenderHelper.drawScaledString("x" + stack.getCount(), this.guiLeft + 212 + i * 20, this.guiTop + 16, 0.7, GOLD);
            }

            if (hasSelectedCraftingPiece() && getSelectedCraftingPiece().getItemStack().getItem() instanceof ItemBullet) {
                GUIRenderHelper.drawScaledString("x" + (getCurrentAmountInQuantityBox() * TileEntityAmmoPress.BULLETS_CRAFTED_PER_PRESS),
                        this.guiLeft + 268, this.guiTop + 201, 0.7, GREEN);
            }
        }
    }

    private int getCurrentAmountInQuantityBox() {
        if (quantityBox.getText().length() == 0) {
            return 0;
        }

        return MathUtil.clampMaxFirst(Integer.parseInt(quantityBox.getText()), 1, 999);
    }

    @Override
    protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
        super.mouseClicked(mouseX, mouseY, mouseButton);
        quantityBox.mouseClicked(mouseX, mouseY, mouseButton);

        if (tileEntity.hasStack()) {
            if (mouseY >= this.guiTop && mouseY <= this.guiTop + 20) {
                int id = (mouseX - (this.guiLeft + 200)) / 20;
                if (id >= 0 && tileEntity.getCraftingQueue().size() - 1 >= id) {
                    CHANNEL.sendToServer(new WorkbenchServerMessage(WorkbenchServerMessage.POP_FROM_QUEUE, tileEntity.getPos(), MC.player.getEntityId(), id));
                }
            }
        }
    }


    @Override
    protected void keyTyped(char typedChar, int keyCode) throws IOException {
        boolean cancelationForQuantity = quantityBox.getText().length() == 0 && keyCode == Keyboard.KEY_BACK;

        super.keyTyped(typedChar, keyCode);
        if (Character.isDigit(typedChar) || keyCode == Keyboard.KEY_BACK) {
            quantityBox.textboxKeyTyped(typedChar, keyCode);
        }

        if ((cancelationForQuantity && quantityBox.isFocused())) {
            return;
        }

        if (keyCode == Keyboard.KEY_BACK) {
            fillFilteredList();
        }
    }
}
