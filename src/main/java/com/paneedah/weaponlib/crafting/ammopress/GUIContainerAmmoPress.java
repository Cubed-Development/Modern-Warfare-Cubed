package com.paneedah.weaponlib.crafting.ammopress;

import com.paneedah.mwc.utils.ModReference;
import com.paneedah.weaponlib.ItemBullet;
import com.paneedah.weaponlib.crafting.CraftingGroup;
import com.paneedah.weaponlib.crafting.CraftingRegistry;
import com.paneedah.weaponlib.crafting.base.GUIContainerStation;
import com.paneedah.weaponlib.crafting.workbench.CustomSearchTextField;
import com.paneedah.weaponlib.crafting.workbench.GUIButtonCustom;
import com.paneedah.weaponlib.network.packets.StationPacket;
import com.paneedah.weaponlib.render.gui.GUIRenderHelper;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.input.Keyboard;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

import static net.minecraft.util.text.TextFormatting.WHITE;

/**
 * GUIContainer for the Workbench Block
 * 
 * Crafting Modes:
 * 1.) Bullets
 * 2.) Magazines
 * 
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
	private static final ResourceLocation AMMO_PRESS_TEX = new ResourceLocation(ModReference.ID + ":textures/gui/ammosheet.png");

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
		
		this.quantityBox = new CustomSearchTextField(AMMO_PRESS_TEX, "Amt.", 1, 1, this.fontRenderer, this.guiLeft + 267, this.guiTop + 183, 84, 13);
		this.quantityBox.setMaxStringLength(50);
		this.quantityBox.setEnableBackgroundDrawing(true);
		this.quantityBox.setVisible(true);
		this.quantityBox.setTextColor(16777215);

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
		if(getCraftingMode() == 1) {
			filteredCraftingList.addAll(CraftingRegistry.getCraftingListForGroup(CraftingGroup.BULLET));
		} else if(getCraftingMode() == 2) {
			filteredCraftingList.addAll(CraftingRegistry.getCraftingListForGroup(CraftingGroup.MAGAZINE));
		} else if(getCraftingMode() == 3) {
			filteredCraftingList.addAll(CraftingRegistry.getCraftingListForGroup(CraftingGroup.GRENADE));
		}
	}
	
	@Override
	public void updateScreen() {
		super.updateScreen();
		if(this.tileEntity.getCraftingQueue().size() > 9) {
			craftButton.setErrored(true);
		} else {
			craftButton.setErrored(false);
		}
	}

	@Override
	protected void actionPerformed(GuiButton button) throws IOException {
		super.actionPerformed(button);

		if (button == craftButton && !craftButton.isDisabled()) {
			if (hasSelectedCraftingPiece() && quantityBox.getText().length() != 0) {
				int quantity = Integer.parseInt(quantityBox.getText());
				modContext.getChannel().sendToServer(new StationPacket(StationPacket.CRAFT, tileEntity.getPos(), getSelectedCraftingPiece().getItem().getTranslationKey(), getSelectedCraftingPiece().getCraftingGroup(), quantity));
			}

		}  else if (button == bulletSelector) {
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
		tooltip.add(GOLD + "Crafting: " + WHITE + format(stack.getTranslationKey()));

		if(stack.getItem() instanceof ItemBullet) {
			tooltip.add(GOLD + "Quantity: " + WHITE
					+ stack.getCount() + GREEN +  " -> " + (stack.getCount() * TileEntityAmmoPress.BULLETS_CRAFTED_PER_PRESS));
		} else {
			tooltip.add(GOLD + "Quantity: " + WHITE + stack.getCount());
		}
	}

	
	@Override
	public void addCustomTooltipInformation(int mouseX, int mouseY, ArrayList<String> tooltip) {
		super.addCustomTooltipInformation(mouseX, mouseY, tooltip);
		if(tileEntity.hasStack()) {
			if (mouseY >= this.guiTop && mouseY <= this.guiTop + 20) {
				int id = (mouseX - (this.guiLeft + 200))/20;
				if(id >= 0 && tileEntity.getCraftingQueue().size() - 1 >= id) {
					
					ItemStack stack = tileEntity.getCraftingQueue().get(id);
					
				
					tooltip.add(format(stack.getTranslationKey()));
					if(stack.getItem() instanceof ItemBullet) {
						tooltip.add(GRAY + "Quantity: " + GOLD +
								stack.getCount() + GREEN + " -> " + (stack.getCount() * TileEntityAmmoPress.BULLETS_CRAFTED_PER_PRESS));
					} else {
						tooltip.add(GRAY + "Quantity: " + GOLD + stack.getCount());
					}
					
				}
			}
		}
		
		if(hasSelectedCraftingPiece() && getSelectedCraftingPiece().getItem() instanceof ItemBullet && 
				GUIRenderHelper.checkInBox(mouseX, mouseY, this.guiLeft + 268, this.guiTop + 201, 20, 20)) {
			
			tooltip.add(String.format("Amount %d will make %d bullets", getCurrentAmountInQuantityBox(), getCurrentAmountInQuantityBox() * TileEntityAmmoPress.BULLETS_CRAFTED_PER_PRESS));
		}
		
		//GUIRenderHelper.drawScaledString("x" + (getCurrentAmountInQuantityBox() * TileEntityAmmoPress.BULLETS_CRAFTED_PER_PRESS),
		//		this.guiLeft + 268, this.guiTop + 201, 0.7, GREEN);
	}
	
	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		
		super.drawScreen(mouseX, mouseY, partialTicks);
		if(getPage() == 2) this.quantityBox.drawTextBox();
		drawTooltips(mouseX, mouseY, partialTicks);

		if (getPage() == 2) {

			LinkedList<ItemStack> queue = tileEntity.getCraftingQueue();
			GlStateManager.enableBlend();
			for(int i = 0; i < queue.size(); ++i) {
				mc.getTextureManager().bindTexture(AMMO_PRESS_TEX);
				if(GUIRenderHelper.checkInBox(mouseX, mouseY, this.guiLeft + 200 + i*20, this.guiTop, 20, 20)) {
					GUIRenderHelper.drawTexturedRect(this.guiLeft + 200 + i*20, this.guiTop, 20, 40, 20, 20, 256, 256);
				} else {
					GUIRenderHelper.drawTexturedRect(this.guiLeft + 200 + i*20, this.guiTop, 0, 40, 20, 20, 256, 256);
				}
			}
			
			for(int i = 0; i < queue.size(); ++i) {
				ItemStack stack = queue.get(i);
				mc.getRenderItem().renderItemIntoGUI(stack, this.guiLeft + 202 + i*20, this.guiTop + 2);
			}
			
			for(int i = 0; i < queue.size(); ++i) {
				ItemStack stack = queue.get(i);
				GUIRenderHelper.drawScaledString("x" + stack.getCount(), this.guiLeft + 212 + i*20, this.guiTop + 16, 0.7, GOLD);
			}

			if(hasSelectedCraftingPiece() && getSelectedCraftingPiece().getItem() instanceof ItemBullet) {
				GUIRenderHelper.drawScaledString("x" + (getCurrentAmountInQuantityBox() * TileEntityAmmoPress.BULLETS_CRAFTED_PER_PRESS),
						this.guiLeft + 268, this.guiTop + 201, 0.7, GREEN);
			}
		}
	}

	private int getCurrentAmountInQuantityBox() {
		if(quantityBox.getText().length() == 0) return 0;
		return Integer.parseInt(quantityBox.getText());
	}
	
	@Override
	protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
		super.mouseClicked(mouseX, mouseY, mouseButton);
		this.quantityBox.mouseClicked(mouseX, mouseY, mouseButton);

		if(tileEntity.hasStack()) {
			if (mouseY >= this.guiTop && mouseY <= this.guiTop + 20) {
				int id = (mouseX - (this.guiLeft + 200))/20;
				if(id >= 0 && tileEntity.getCraftingQueue().size() - 1 >= id)
					modContext.getChannel().sendToServer(new StationPacket(StationPacket.POP_FROM_QUEUE, tileEntity.getPos(), mc.player.getEntityId(), id));
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	protected void keyTyped(char typedChar, int keyCode) throws IOException {
		boolean cancelationForQuantity = this.quantityBox.getText().length() == 0 && keyCode == Keyboard.KEY_BACK;
		
		super.keyTyped(typedChar, keyCode);
		if(Character.isDigit(typedChar) || keyCode == Keyboard.KEY_BACK)
			this.quantityBox.textboxKeyTyped(typedChar, keyCode);

		if((cancelationForQuantity && this.quantityBox.isFocused())) return;

		if(keyCode == Keyboard.KEY_BACK)
			fillFilteredList();
	}
}
