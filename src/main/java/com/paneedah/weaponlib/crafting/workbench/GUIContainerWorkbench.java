package com.paneedah.weaponlib.crafting.workbench;

import com.paneedah.weaponlib.Weapon;
import com.paneedah.weaponlib.animation.gui.GuiRenderUtil;
import com.paneedah.weaponlib.crafting.CraftingGroup;
import com.paneedah.weaponlib.crafting.CraftingRegistry;
import com.paneedah.weaponlib.crafting.base.GUIContainerStation;
import com.paneedah.weaponlib.network.packets.StationPacket;
import com.paneedah.weaponlib.render.gui.GUIRenderHelper;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


/**
 * GUI class for the Workbench Block
 * 
 * Crafting Modes:
 * 1.) Guns
 * 2.) Attachments (normal ones)
 * 3.) Modification mode attachments
 * 
 * Features (plus the features of it's parent class {@link GUIContainerStation})
 * 1. Player has three categories to choose from weapons, attachments, and modification attachments
 * 2. If the player has the materials to craft an item, they can craft it
 * 3. 3D weapon rendering into the GUI
 * 
 * @author Homer Riva-Cambrin, 2022
 * @version September 23rd, 2022
 */
@SideOnly(Side.CLIENT)
public class GUIContainerWorkbench extends GUIContainerStation<TileEntityWorkbench> {

	// Buttons & Search box
	private GUIButtonCustom assaultSelector, attachSelector, modSelector, gearSelector;

	public GUIContainerWorkbench(EntityPlayer player, InventoryPlayer inventory,
			TileEntityWorkbench tileEntityWorkbench) {
		super(tileEntityWorkbench, new ContainerWorkbench(player, inventory, tileEntityWorkbench));
	}
	

	@Override
	public void initGui() {
		super.initGui();
		
		assaultSelector = new GUIButtonCustom(GUI_TEX, 3, this.guiLeft + 92, this.guiTop + 29, 19, 20, 480, 370, "")
				.withStandardState(0xFFFFFF, 0, 291).withHoveredState(0xFFFFFF, 19, 291)
				.withToggledState(0xFFFFFF, 38, 291).withPageRestriction(2).makeToggleButton();

		attachSelector = new GUIButtonCustom(GUI_TEX, 4, this.guiLeft + 115, this.guiTop + 29, 19, 20, 480, 370, "")
				.withStandardState(0xFFFFFF, 0, 311).withHoveredState(0xFFFFFF, 19, 311)
				.withToggledState(0xFFFFFF, 38, 311).withPageRestriction(2).makeToggleButton();

		modSelector = new GUIButtonCustom(GUI_TEX, 5, this.guiLeft + 138, this.guiTop + 29, 19, 20, 480, 370, "")
				.withStandardState(0xFFFFFF, 0, 331)
				.withHoveredState(0xFFFFFF, 19, 331)
				.withToggledState(0xFFFFFF, 38, 331)
				.withPageRestriction(2).makeToggleButton();
		
		gearSelector = new GUIButtonCustom(GUI_TEX, 6, this.guiLeft + 161, this.guiTop + 29, 19, 20, 480, 370, "")
				.withStandardState(0xFFFFFF, 57, 331)
				.withHoveredState(0xFFFFFF, 76, 331)
				.withToggledState(0xFFFFFF, 95, 331)
				.withPageRestriction(2).makeToggleButton();
		
		
		assaultSelector.toggleOn();

		addButton(assaultSelector);
		addButton(attachSelector);
		addButton(modSelector);
		addButton(gearSelector);
		
		setPage(1);
	}
	
	@Override
	public void fillFilteredList() {
		filteredCraftingList.clear();
		if(getCraftingMode() == CraftingGroup.GUN.getID()) {
			filteredCraftingList.addAll(CraftingRegistry.getCraftingListForGroup(CraftingGroup.GUN));
		} else if(getCraftingMode() == CraftingGroup.ATTACHMENT_NORMAL.getID()) {
			filteredCraftingList.addAll(CraftingRegistry.getCraftingListForGroup(CraftingGroup.ATTACHMENT_NORMAL));
		} else if(getCraftingMode() == CraftingGroup.ATTACHMENT_MODIFICATION.getID()){
			filteredCraftingList.addAll(CraftingRegistry.getCraftingListForGroup(CraftingGroup.ATTACHMENT_MODIFICATION));
		} else if(getCraftingMode() == CraftingGroup.GEAR.getID()){
			filteredCraftingList.addAll(CraftingRegistry.getCraftingListForGroup(CraftingGroup.GEAR));
		}
  	}
	
	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		super.drawScreen(mouseX, mouseY, partialTicks);
		drawTooltips(mouseX, mouseY, partialTicks);
	}
	
	@Override
	protected void actionPerformed(GuiButton button) throws IOException {
		super.actionPerformed(button);
		if (button == craftButton) {
			if (hasSelectedCraftingPiece() && tileEntity.craftingTimer == -1) {
				modContext.getChannel()
						.sendToServer(new StationPacket(StationPacket.CRAFT, tileEntity.getPos(), 0, getCraftingMode() == 1 ? WorkbenchBlock.WORKBENCH_WEAPON_CRAFTING_TIME : WorkbenchBlock.WORKBENCH_ATTACHMENT_CRAFTING_TIME,
								CraftingGroup.getValue(getCraftingMode()),
								getSelectedCraftingPiece().getItem().getTranslationKey()));

			}

		} else if (button == assaultSelector) {
			((GUIButtonCustom) button).toggleOn();
			modSelector.toggleOff();
			attachSelector.toggleOff();
			gearSelector.toggleOff();
			setCraftingMode(1);

			setSelectedCraftingPiece(null);

			fillFilteredList();
		} else if (button == attachSelector) {
			((GUIButtonCustom) button).toggleOn();
			modSelector.toggleOff();
			assaultSelector.toggleOff();
			gearSelector.toggleOff();
			setCraftingMode(2);

			setSelectedCraftingPiece(null);

			fillFilteredList();
		} else if (button == modSelector) {
			((GUIButtonCustom) button).toggleOn();
			attachSelector.toggleOff();
			assaultSelector.toggleOff();
			gearSelector.toggleOff();
			setCraftingMode(3);
			fillFilteredList();
		} else if(button == gearSelector) {
			((GUIButtonCustom) button).toggleOn();
			attachSelector.toggleOff();
			assaultSelector.toggleOff();
			modSelector.toggleOff();
			
			setCraftingMode(CraftingGroup.GEAR.getID());
			fillFilteredList();
			
			
		}
	}



	@Override
	public void updateScreen() {
		super.updateScreen();
		if (!this.craftButton.isDisabled() && tileEntity.getProgress() != 0) {
			this.craftButton.setErrored(true);
		}
		if(hasSelectedCraftingPiece() && hasRequiredItems() && tileEntity.getProgress() == 0) {
			this.craftButton.setErrored(false);
		}
	}
	
	/**
	 * Since weapon crafting is not queued, we need to block
	 * the player from initiating a craft should they not have
	 * the materials.
	 */
	@Override
	public boolean requiresMaterialsToSubmitCraftRequest() {
		return true;
	}
	
	@Override
	public void addCraftingInformationToTooltip(ArrayList<String> tooltip) {
		int seconds = (tileEntity.craftingDuration - tileEntity.craftingTimer) / 20;
		tooltip.add(TextFormatting.GOLD + "Crafting: " + TextFormatting.WHITE + I18n.format(tileEntity.craftingTargetName + ".name"));
		tooltip.add(TextFormatting.GOLD + "Time remaining: " + TextFormatting.WHITE + GUIRenderHelper.formatTimeString(seconds, TimeUnit.SECONDS));
	}

	/**
	 * Rendering the weapons into the GUI requires a special
	 * consideration as we want them to be displayed as 3D models.
	 */
	@Override
	public boolean shouldOverrideCraftingModeOneRender() {
		return true;
	}
	
	@Override
	public void doCraftingModeOneRender(float partialTicks, int mouseX, int mouseY) {
		
		// This is just a backup check. This should only ever run if we are dealing
		// with crafting mode one, so it will always be a weapon.
		if(!(getSelectedCraftingPiece().getItem() instanceof Weapon)) return;
	
		Weapon weapon = (Weapon) getSelectedCraftingPiece().getItem();
        GuiRenderUtil.drawScaledString(fontRenderer, format(weapon.getTranslationKey()), this.guiLeft + 214, this.guiTop + 31, 1.2, 0xFDF17C);
        GuiRenderUtil.drawScaledString(fontRenderer, weapon.builder.getWeaponType(), this.guiLeft + 214, this.guiTop + 43, 0.75, 0xC8C49C);
        
        render3DItemInGUI(weapon, this.guiLeft + 300, this.guiTop + 55, mouseX, mouseY);
        
        
	}

}
