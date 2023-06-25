package com.paneedah.weaponlib.render;

import com.paneedah.mwc.utils.ModReference;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.WeaponAttachmentAspect.FlaggedAttachment;
import com.paneedah.weaponlib.command.DebugCommand;
import com.paneedah.weaponlib.config.BalancePackManager;
import com.paneedah.weaponlib.render.gui.ColorPalette;
import com.paneedah.weaponlib.render.gui.GUIRenderHelper;
import com.paneedah.weaponlib.render.gui.GUIRenderHelper.StringAlignment;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import org.lwjgl.input.Mouse;

import java.util.ArrayList;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

/**
 * Singleton modification GUI render & logic class
 * 
 * @author James R. Holden, 2022 [HRC]
 */
public class ModificationGUI {

	// Static variables
	public static ModificationGUI instance = new ModificationGUI();
	
	// Tabs are constant b/w weapons
	private static ArrayList<ModificationTab> tabList = new ArrayList<>();

	
	// Texture for gui
	private static final ResourceLocation MODIFICATION_GUI_TEXTURES = new ResourceLocation(ModReference.ID + ":textures/gui/modificationguisheet.png");

	
	private static final double SIDEBAR_SCALE = 0.8;
	private static final double SIDEBAR_ALPHA = 0.3;
	
	private static final double TAB_SCALE = 0.3;
	
	private static final float TAB_ALPHA = 0.7f;
	private static final float TAB_TRANSPARENT_ALPHA = 0.3f;
	
	
	private static final int SHEET_SIZE = 768;
	

	
	private static final int TOOLTIP_COL_ERROR = 0x702b2b;
	private static final int TOOLTIP_COL_NORMAL = 0x00000;
	
	
	private static final int[][] DEFAULT_POSITION = new int[][] {{-50, 50}, {120, 75}, {150, 0}, {100, -50},
		{145, 0}, {120, 50}, {-50, 50}, {0, -50}, {-100, -50}, {50, 100}, {50, 100}};
	
	// Attachments tabs
	private static final ModificationTab SCOPE_TAB = new ModificationTab(0, "Sight", AttachmentCategory.SCOPE, -50, 50,
			ModificationGroup.ATTACHMENT);
	private static final ModificationTab BARREL_TAB = new ModificationTab(1, "Muzzle", AttachmentCategory.SILENCER, 120, 75, ModificationGroup.ATTACHMENT);
	private static final ModificationTab LASER_TAB = new ModificationTab(2, "Laser", AttachmentCategory.LASER, 150, 0,
			ModificationGroup.ATTACHMENT);
	private static final ModificationTab GRIP_TAB = new ModificationTab(3, "Grip", AttachmentCategory.GRIP, 100, -50,
			ModificationGroup.ATTACHMENT);

	
	// Modifications tabs
	private static final ModificationTab HANDGUARD_TAB = new ModificationTab(4, "Handguard", AttachmentCategory.GUARD, 145, 0, ModificationGroup.MODIFICATION);
	private static final ModificationTab FRONT_SIGHT_TAB = new ModificationTab(5, "Front Sight",
			AttachmentCategory.FRONTSIGHT, 120, 50, ModificationGroup.MODIFICATION);
	private static final ModificationTab RECEIVER_TAB = new ModificationTab(6, "Receiver", AttachmentCategory.RECEIVER,
			-50, 50, ModificationGroup.MODIFICATION);
	private static final ModificationTab REAR_GRIP_TAB = new ModificationTab(7, "Rear Grip", AttachmentCategory.BACKGRIP,
			0, -50, ModificationGroup.MODIFICATION);
	private static final ModificationTab STOCK_TAB = new ModificationTab(8, "Stock", AttachmentCategory.STOCK, -100, -50,
			ModificationGroup.MODIFICATION);
	private static final ModificationTab RAILING_TAB = new ModificationTab(9, "Railing", AttachmentCategory.RAILING, 50, 100,
			ModificationGroup.MODIFICATION);

	private static final ModificationTab WEAPON_SKIN_TAB = new ModificationTab(10, "Skin", AttachmentCategory.SKIN, 50, 100,
			ModificationGroup.CUSTOMIZATION);
	
	
	// 
	
	
	/**
	 *  =====[ STATIC GUI ELEMENTS ]=====
	 * 
	 * Note to any developers trying to change this code:
	 * I highly recommend just foregoing the static version temporarily
	 * and making a temporary new TexturedRect in order to position it,
	 * as it will be much easier.
	 */
	private static final TexturedRect PRIMARY_ELEMENT = new TexturedRect(0, 0, 0, 0, 311, 108,  1);
	private static final TexturedRect RED_ELEMENT = new TexturedRect(0, 0, 311, 0, 311, 108,1);

	private static final TexturedRect DROPDOWN_SELECT_ELEMENT = new TexturedRect(0, 111, 40, 254, 109, 28,  1)
			.withSelectedVariant(188, 254);
	
	private static final TexturedRect DROPDOWN_SELECT_RED_ELEMENT = new TexturedRect(0, 111, 350, 300, 109, 28, 1)
			.withSelectedVariant(350, 328);
	private static final TexturedRect DROPDOWN_MENU_ELEMENT = new TexturedRect(0, 140, 0, 108, 434, 109, 1)
			.withSelectedVariant(0, 478);
	
	private static final TexturedRect DROPDOWN_SAFE_BOX = new TexturedRect(0, 140, 0, 108, 434, 140, 1)
			.withSelectedVariant(0, 478);
	private static final TexturedRect DROPDOWN_BAR_ELEMENT = new TexturedRect(0, 250, 0, 222, 435, 32,  1)
			.withSelectedVariant(0, 592);
	private static final TexturedRect LEFT_ARROW_ELEMENT = new TexturedRect(165, 256.5, 0, 254, 40, 46, 0.4);
	private static final TexturedRect RIGHT_ARROW_ELEMENT = new TexturedRect(255, 256.5, 149, 254, 39, 46, 0.4);
	private static final TexturedRect MORE_ITEMS_ALERT_ELEMENT = new TexturedRect(75, 114, 0, 713, 26, 26, 0.8);
	private static final TexturedRect PRIMARY_SELECTOR_ELEMENT = new TexturedRect(11, 10, 0, 389, 89, 89, 1);
	private static final TexturedRect LOCK_OUT_ELEMENT = new TexturedRect(11, 10, 0, 624, 89, 89, 1);

	
	
	static {

		// attachment
		tabList.add(SCOPE_TAB);
		tabList.add(BARREL_TAB);
		tabList.add(LASER_TAB);
		tabList.add(GRIP_TAB);

		// modification
		tabList.add(HANDGUARD_TAB);
		tabList.add(FRONT_SIGHT_TAB);
		tabList.add(RECEIVER_TAB);
		tabList.add(REAR_GRIP_TAB);
		tabList.add(STOCK_TAB);
		tabList.add(RAILING_TAB);

		// customization
		tabList.add(WEAPON_SKIN_TAB);
	}
	
	// Useful to see what tab has it's dropdown
	// active, as this will allow us to make the other
	// tabs transparent
	private ModificationTab activeTab;
	
	
	// Current group selected, defaults to ATTACHMENT
	private ModificationGroup currentGroup = ModificationGroup.ATTACHMENT;



	// Essentially functions as a latch, allowing us
	// to detect the first instant the mouse is clicked
	private boolean waitingForMouseRelease = true;
	
	// Persistent variable that tells us if this is 
	// a "click run" (i.e. should it treat it as if it
	// were clicked on)
	private boolean isInClick = false;
	

	private boolean dropdownCancel = false;
	
	// Integer of side tab hovered (i.e. mod/attach mode)
	private int tabHovered = -1;

	

	// Radar chart
	public RadarChart radarChart = new RadarChart("3", 0x1abc9c, 0.5f, 50, 5)
			.withTitles(new String[] { "Damage", "Recoil", "Inaccuracy", "Firerate", "Velocity" });

	
	/**
	 * Returns instance of the {@link ModificationGUI}
	 */
	public static ModificationGUI getInstance() {
		return instance;
	}

	

	/**
	 * Modification group enumerable, serves
	 * to provide easy string formatting capabilities
	 */
	public static enum ModificationGroup {
		ATTACHMENT, MODIFICATION, CUSTOMIZATION;

		/**
		 * Returns the modification group based on the ID
		 * (Attachment = 0, Modification = 1, Customization = 2)
		 * 
		 * @param id (0-2)
		 * @return Modification group
		 */
		public static ModificationGroup fromID(int id) {
			switch (id) {
			case 0:
				return ATTACHMENT;
			case 1:
				return MODIFICATION;
			case 2:
				return CUSTOMIZATION;
			}
			return ATTACHMENT;
		}
		
		/**
		 * While this is easy to do with string manipulation,
		 * faster to just look it up here.
		 * (Attachment = 0, Modification = 1, Customization = 2)
		 * 
		 * @param ID (0-2)
		 * @return String with first letter capatilized
		 */
		public static String getName(int id) {
			switch(id) {
			case 0:
				return "Attachment";
			case 1:
				return "Modification";
			case 2:
				return "Customization";
			}
			return "";
		}
	}

	

	/**
	 * Tooltip builder class for easily creating &
	 * rendering simple tooltips.
	 * 
	 * @author homer
	 *
	 */
	public static class TooltipBuilder {
		private StringBuilder sb = new StringBuilder();
		private int color;
		
		/**
		 * Sets tooltip builder's color
		 * @param Hex color code
		 */
		public void setColor(int color) {
			this.color = color;
		}

		/**
		 * Adds a line with a bullet point in front of it
		 * @param line
		 */
		public void addBulletPoint(String text) {
			addLine("� " + text);
		}
		
		/**
		 * Adds a line of text to the tooltip
		 * @param line
		 */
		public void addLine(String line) {
			sb.append(line + "\n");
		}

		/**
		 * Returns color as hexadecimal integer
		 * @return Hex color
		 */
		public int getColor() {
			return this.color;
		}
		
		/**
		 * In order to render sequentially,
		 * returns lines as String[]
		 * @return String array of lines split @ newline
		 */
		public String[] getLines() {
			return getText().split("\n");
		}

		/**
		 * Returns unmodified/unsplit text
		 * @return Builder text
		 */
		public String getText() {
			return sb.toString();
		}

	}

	/**
	 * Textured rect drawing and selection class
	 */
	private static class TexturedRect {
		private double x, y, u, v, textureWidth, textureHeight, width, height, scale;

		
		// Alternate texture UV for the selected version
		private int selectedU, selectedV;
		
		
		/**
		 *  Creates a new textured rect object
		 * 
		 * @param x What x coord to draw the rectangle at
		 * @param y What y coord to draw the rectangle at
		 * @param u X coordinate (actual pixel coord) of image top left
		 * @param v Y coordinate (actual pixel coord) of image top left
		 * @param width Width of drawing
		 * @param height Height of drawing
		 * @param textureWidth Width of image
		 * @param textureHeight Height of image
		 * @param scale
		 */
		public TexturedRect(double x, double y, double u, double v, double width, double height, double textureWidth,
				double textureHeight, double scale) {
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
			this.scale = scale;
			this.u = u;
			this.v = v;
			this.textureHeight = textureHeight;
			this.textureWidth = textureWidth;
		}
		
		public TexturedRect(double x, double y, double u, double v, double width, double height, double scale) {
			this(x, y, u, v, width, height, SHEET_SIZE, SHEET_SIZE, scale);
		}
		
		
		public TexturedRect withSelectedVariant(int u, int v) {
			this.selectedU = u;
			this.selectedV = v;
			return this;
		}

		public void render() {
			GUIRenderHelper.drawTexturedScaledRect(x, y, (float) u, (float) v, width, height, textureWidth, textureHeight, scale);
		}
		
		/**
		 * Renders selected variant of the textured rectangle
		 */
		public void renderSelected() {
			GUIRenderHelper.drawTexturedScaledRect(x, y, (float) selectedU, (float) selectedV, width, height, textureWidth, textureHeight, scale);
	
		}

		/**
		 * Checks if mouse within GUI boundings
		 * 
		 * @param guiX Top left X-coord of GUI
		 * @param guiY Top left Y-coord of GUI
		 * @param mouseX Mouse coordinate
		 * @param mouseY Mouse coordinate
		 * @param guiScale Scale of the gui
		 * @return
		 */
		public boolean checkBounding(double guiX, double guiY, int mouseX, int mouseY, double guiScale) {
			return GUIRenderHelper.checkInBox(mouseX, mouseY, guiX + this.x * guiScale, guiY + this.y * guiScale,
					this.width * scale * guiScale, this.height * scale * guiScale);
		}
	}

	public static class ModificationTab {
		private String title;
		private AttachmentCategory category;
		private double x, y;

		
		
		private boolean isDropDownOpen = false;
		private int page;
		private int id;
		
		private boolean hidden = false;
		
		private ModificationGroup group;
		
		

		public ModificationTab(int id, String title, AttachmentCategory category, double x, double y, ModificationGroup group) {
			this.id = id;
			this.x = x;
			this.y = y;
			this.group = group;
			this.title = title;
			this.category = category;
		}

		public void setDropdown(boolean down) {
			this.isDropDownOpen = down;
		}

		public void nextPage(int max) {
			// Page cannot be lower than zero,
			// and page count is determined by max/4
			// as there are 4 items per page
			if (page + 1 > max / 4) {
				page = 0;
			} else {
				page++;
			}

		}

		public void previousPage() {
			if (page == 0)
				return;
			page--;

		}

		public void setPos(double x, double y) {
			this.x = x;
			this.y = y;
		}

	}
	
	
	/**
	 * Translates an unlocalized name via {@link TextComponentTranslation}
	 * 
	 * @param Unlocalized item name
	 * @return Localized item name
	 */
	public static String translate(String unlocalized) {
		return new TextComponentTranslation(unlocalized + ".name").getFormattedText();
	}
	
	public double getGUIScale() {

		return 0.3;
	}
	
	
	/**
	 * Allows the class to update things like alpha without losing track of the initial color
	 */
	private float[] persistentColorState = new float[] {1.0f, 1.0f, 1.0f, 1.0f};
	
	private void setRGB(float r, float g, float b) {
		persistentColorState[0] = r;
		persistentColorState[1] = g;
		persistentColorState[2] = b;
		callPersistentState();
	}
	
	private void callPersistentState() {
		GlStateManager.color(persistentColorState[0], persistentColorState[1], persistentColorState[2], persistentColorState[3]);
	}
	
	private void clearRGB() {
		setRGB(1.0f, 1.0f, 1.0f);
		callPersistentState();
	}
	
	private void setAlpha(float alpha) {
		persistentColorState[3] = alpha;
		callPersistentState();
	}

	
	

	public void setGroup(ModificationGroup group) {
		this.currentGroup = group;
	}

	private int grabbedX;
	private int grabbedY;
	
	private int originalMouseX;
	private int originalMouseY;
	
	private ModificationTab grabbedTab;
	
	// In case you log into the game w/
	// the modificaiton menu already up
	private boolean hasBeenSetup = false;
	
	public void printTabLocations() {
		tabList.sort((a, b) -> a.id - b.id);
		
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		for(int i = 0; i < tabList.size(); ++i) {
			ModificationTab tab = tabList.get(i);
			sb.append("{" + ((int) tab.x) + ", " + ((int) tab.y) + "}");
			if(i < tabList.size()-1) {
				sb.append(",");
			}
		}
		sb.append("}");
		System.out.println(sb.toString());
	}
	
	
	public void setupForWeapon(PlayerWeaponInstance pwi) {
		hasBeenSetup = true;
		
		
		int[][] guiPositions = pwi.getWeapon().builder.getGUIPositions();
		for(ModificationTab tab : tabList) {
			// Update custom GUI positionings
			tab.setPos(guiPositions[tab.id][0], guiPositions[tab.id][1]);
			
			// Hide empty categories
			if(pwi.getWeapon().getCompatibleAttachments(tab.category).isEmpty()) {
				tab.hidden = true;
			} else {
				tab.hidden = false;
			}
		
		}
		
		
		
	}
	
	public void render(ModContext modContext) {

		
		if(!hasBeenSetup) {
			setupForWeapon(modContext.getMainHeldWeapon());
		}
		
		
		
		PlayerWeaponInstance weaponInstance = modContext.getMainHeldWeapon();
		Weapon weapon = weaponInstance.getWeapon();
		
		// Gets scaled screen coordinates and mouse coordinaties
		ScaledResolution scaledresolution = new ScaledResolution(mc);
		final int scaledWidth = scaledresolution.getScaledWidth();
		final int scaledHeight = scaledresolution.getScaledHeight();
		int mouseX = Mouse.getX() * scaledWidth / mc.displayWidth;
		int mouseY = scaledHeight - Mouse.getY() * scaledHeight / mc.displayHeight - 1;

		GlStateManager.pushMatrix();
		mc.setIngameNotInFocus();


		// Handle mouse clicks
		if (!waitingForMouseRelease && Mouse.isButtonDown(0) && mc.currentScreen == null) {
			waitingForMouseRelease = true;
			isInClick = true;
		} else if (!Mouse.isButtonDown(0)) {
			waitingForMouseRelease = false;
		}

		


		if (activeTab != null && !tabList.isEmpty() && tabList.get(tabList.size()-1) != activeTab) {
			// Ensures this tab always renders very last
			tabList.remove(activeTab);
			tabList.add(activeTab);
		}

		
		// Draws all the tabs
		for (ModificationTab mt : tabList) {
			if (mt.group != currentGroup || mt.hidden)
				continue;
			drawModificationTab(scaledresolution, mt, mouseX, mouseY, modContext.getMainHeldWeapon(), modContext);
		}
		
	
		
		
		
		GlStateManager.popMatrix();
		GlStateManager.pushMatrix();
		GlStateManager.scale(SIDEBAR_SCALE, SIDEBAR_SCALE, SIDEBAR_SCALE);
		GlStateManager.disableTexture2D();
		GlStateManager.enableBlend();
		// Draws background rectangles
	
		
		GUIRenderHelper.drawColoredRectangle(20, 20, 115, 175, SIDEBAR_ALPHA, ColorPalette.BLACK);
		GUIRenderHelper.drawColoredRectangle(140.5, 20, 7.5, 175, SIDEBAR_ALPHA, ColorPalette.BLACK);
		GUIRenderHelper.drawColoredRectangle(20, 200, 128, 125, SIDEBAR_ALPHA, ColorPalette.BLACK);

		

		if (mc.player.ticksExisted % 50 == 0) {

			float firerate = weaponInstance.getFireRate();
			float inaccuracy = weaponInstance.getWeapon().getInaccuracy()/10f;
			float damage = weaponInstance.getWeapon().getSpawnEntityDamage()/20;
			float recoil = weaponInstance.getRecoil()/10f;
			
			damage = Math.min(damage, 1.0f);
			
			
			radarChart.uploadSet(new float[] { damage, recoil, inaccuracy, firerate, 0.14f });
		}

		
		// Render radar chart on screen
		
		GlStateManager.disableTexture2D();
		radarChart.render(84, 275.5, mouseX, mouseY, SIDEBAR_SCALE);
		GlStateManager.enableTexture2D();
		
		
		/*
		GLStateWrapper.run(() -> {
			GlStateManager.disableTexture2D();
		}, () -> {
			GlStateManager.enableTexture2D();
		}, () -> {
			radarChart.render(84, 275.5, mouseX, mouseY, SIDEBAR_SCALE);
		});
		*/
		
		
		// Write titles in
		GUIRenderHelper.drawScaledString(
				TextFormatting.GOLD + "Weapon Stats",
				30, 205, 1.0, ColorPalette.WHITE);
		
		GUIRenderHelper.drawScaledString(
				TextFormatting.GOLD + translate(weapon.getTranslationKey()),
				30, 30, 1.0, ColorPalette.WHITE);
		GUIRenderHelper.drawScaledString(
				"Damage :: " + TextFormatting.GOLD + String.format("%.2f" , (BalancePackManager.getNetGunDamage(weapon))),
				30, 60, 1, ColorPalette.WHITE);
		GUIRenderHelper.drawScaledString("Recoil :: " + TextFormatting.GOLD + String.format("%.2f" , (weaponInstance.getRecoil())),
				30, 75, 1, ColorPalette.WHITE);
		GUIRenderHelper.drawScaledString("Firerate :: " + TextFormatting.GOLD + weaponInstance.getFireRate(), 30, 90, 1,
				ColorPalette.WHITE);
		GUIRenderHelper.drawScaledString(
				"Inaccuracy :: " + TextFormatting.GOLD + String.format("%.1f" , (weaponInstance.getInaccuracy())), 30,
				105, 1, ColorPalette.WHITE);

		GlStateManager.popMatrix();
		
		mc.getTextureManager().bindTexture(MODIFICATION_GUI_TEXTURES);
		
		//tabHovered = -1;
		
		boolean nullHoverTab = false;
		
		clearRGB();
		setAlpha(1.0f);
		for (int groupID = 0; groupID < 3; ++groupID) {
			GlStateManager.disableTexture2D();
			GUIRenderHelper.drawColoredRectangle(scaledresolution.getScaledWidth_double() - 15,
					scaledresolution.getScaledHeight_double() - 75 - (18 * groupID), 15, 15, 0.5, 0x00000);

			mc.getTextureManager().bindTexture(MODIFICATION_GUI_TEXTURES);
			
			GlStateManager.enableTexture2D();
			TexturedRect groupSelector = new TexturedRect(scaledresolution.getScaledWidth_double() - 13,
					scaledresolution.getScaledHeight_double() - 73.5 - (18 * groupID), 413, 356, 46, 46, 768, 768,
					0.25);

			groupSelector.render();
			if(groupSelector.checkBounding(0, 0, mouseX, mouseY, 1.0)) {
				nullHoverTab = true;
				tabHovered = groupID;
			}
			
			
			if (groupSelector.checkBounding(0, 0, mouseX, mouseY, 1.0) || (tabHovered == -1 && ModificationGroup.fromID(groupID) == currentGroup)) {
				
				
				
				TexturedRect groupSelector2 = new TexturedRect(scaledresolution.getScaledWidth_double() - 13,
						scaledresolution.getScaledHeight_double() - 73.5 - (18 * groupID), 413, 402, 46, 46, 768, 768,
						0.25);

				groupSelector2.render();
				String text = ModificationGroup.getName(groupID) + " Mode";
				setAlpha(0.5f);
			    GUIRenderHelper.drawTexturedScaledRect(scaledresolution.getScaledWidth_double() - 134, scaledresolution.getScaledHeight_double() - 74.5 - (18 * groupID), 90, 624, 390, 45, 768, 768, 0.3);
				setAlpha(1.0f);

				
				GUIRenderHelper.drawAlignedString(text, StringAlignment.RIGHT, true, scaledresolution.getScaledWidth_double() - 18, scaledresolution.getScaledHeight_double() - 75 - (18 * groupID), SIDEBAR_SCALE, ColorPalette.WHITE);
		
				//System.out.println("hi ");
				
				if(isInClick && groupSelector.checkBounding(0, 0, mouseX, mouseY, 1.0)) {
					// Click on a certain group
					currentGroup = ModificationGroup.fromID(groupID);
					
					weaponInstance.setAltModificationModeEnabled(currentGroup == ModificationGroup.MODIFICATION);
					
					activeTab = null;
				}
			}
		}
		if(!nullHoverTab) tabHovered = -1;


		// Reset click detection
		// (Rememeber they stay persistent)
		isInClick = false;
		
		GlStateManager.enableTexture2D();
	}

	

	public void drawModificationTab(ScaledResolution sr, ModificationTab tab, int mouseX, int mouseY,
			PlayerWeaponInstance pwi, ModContext modcontext) {

		
		// Set transparency value
		float guiTransparency = TAB_ALPHA;
		if (activeTab != null && tab != activeTab) {
			guiTransparency = TAB_TRANSPARENT_ALPHA;
		}

		double scale = TAB_SCALE;
		double x = sr.getScaledWidth_double() / 2 - tab.x;
		double y = sr.getScaledHeight_double() / 2 - tab.y;
		String title = tab.title;
		AttachmentCategory category = tab.category;

		//System.out.println(mc.displayHeight - (y/scale + 200));
		if(tab.isDropDownOpen && sr.getScaledHeight_double() < (y + 100)) {
			y -= 30;
		}
		
		boolean creativeMode = ((EntityPlayer) pwi.getPlayer()).isCreative();

		// Set up layout
		
		ArrayList<FlaggedAttachment> inventory;
		if(!creativeMode) {
			inventory = modcontext.getAttachmentAspect().getInventoryAttachments(category,
					pwi);
		} else {
			inventory = new ArrayList<>();
			for(CompatibleAttachment<? extends AttachmentContainer> compat : modcontext.getMainHeldWeapon().getWeapon().getCompatibleAttachments(category)) {
				
				FlaggedAttachment flaggedAttachment = new FlaggedAttachment(new ItemStack(compat.getAttachment()), (ItemAttachment<Weapon>) compat.getAttachment());
				
				// Check proper category, if it is not
				// we do not care about it
				if (compat.getAttachment().getCategory() != category)
					continue;

				// If this is not a compatible attachment,
				// we do not care either
				if (!modcontext.getAttachmentAspect().isCompatibleAttachment((ItemAttachment<Weapon>) compat.getAttachment(), pwi))
					continue;

				modcontext.getAttachmentAspect();
				// We do want to display if it is a potential attachment
				// but there are conditions to be met
				if (!WeaponAttachmentAspect.hasRequiredAttachments((ItemAttachment<Weapon>) compat.getAttachment(), pwi)) {
					flaggedAttachment.setRequiredParts(modcontext.getAttachmentAspect().getRequiredParts((ItemAttachment<Weapon>) compat.getAttachment(), pwi));
				}
				
				inventory.add(flaggedAttachment);
			}
		}

		// Checks to see if they all
		// require parts
		boolean allInventoryRequired = true;
		for (FlaggedAttachment flag : inventory) {
			if (!flag.requiresAnyParts()) {
				allInventoryRequired = false;
				break;
			}
		}
		if (inventory.isEmpty())
			allInventoryRequired = false;

		boolean dropdownHovered = DROPDOWN_SELECT_ELEMENT.checkBounding(x, y, mouseX, mouseY, scale);

		// Bind texture
		mc.getTextureManager().bindTexture(MODIFICATION_GUI_TEXTURES);

		GlStateManager.pushMatrix();
		GlStateManager.translate(x, y, 0.0);
		GlStateManager.scale(scale, scale, scale);
		
		
		// Set color & slight transparency
		GlStateManager.enableBlend();
		clearRGB();
		setAlpha(guiTransparency);

		// Tries to open the tab
		if (dropdownHovered && isInClick) {
			tab.isDropDownOpen = !tab.isDropDownOpen;
			if (tab.isDropDownOpen) {
				activeTab = tab;
				for (ModificationTab mt : tabList) {
					if (mt != tab)
						mt.isDropDownOpen = false;
				}
			} else {
				activeTab = null;
			}
		}

		// Setup tooltip
		TooltipBuilder tooltip = new TooltipBuilder();
		boolean requiresTooltip = false;

		// TexturedRect dropdownMenu = new TexturedRect
		// GlStateManager.fcolor(1, 0.4f, 0.2f, 0.8f);
		if (allInventoryRequired) {
			RED_ELEMENT.render();
		} else {
			PRIMARY_ELEMENT.render();
		}
		
		
		if(DebugCommand.isEditingGUI()) {
			if(!Mouse.isButtonDown(0)) grabbedTab = null;
			
			if(Mouse.isButtonDown(0) && grabbedTab == tab) {
				tab.x = grabbedX + (originalMouseX - mouseX);
				tab.y = grabbedY + (originalMouseY - mouseY);
			}
			

			if(isInClick && PRIMARY_ELEMENT.checkBounding(x, y, mouseX, mouseY, scale)) {
				grabbedX = (int) tab.x;
				grabbedY = (int) tab.y;
				grabbedTab = tab;
				originalMouseX = mouseX;
				originalMouseY = mouseY;
				
			}
		}
		
		ItemAttachment<Weapon> primaryAttachment = pwi.getAttachmentItemWithCategory(category);

		
		// Does something require this attachment?
		boolean lockOutState = WeaponAttachmentAspect.isRequired(primaryAttachment, modcontext.getMainHeldWeapon());

		
	//	System.out.println(dropdownCancel);
		if (!dropdownCancel && primaryAttachment != null && PRIMARY_SELECTOR_ELEMENT.checkBounding(x, y, mouseX, mouseY, scale)) {
			
			setAlpha(0.5f);
			if (!lockOutState)
				PRIMARY_SELECTOR_ELEMENT.render();

			tooltip.color = TOOLTIP_COL_NORMAL;
			requiresTooltip = true;
			tooltip.addLine(
					new TextComponentTranslation(primaryAttachment.getTranslationKey() + ".name").getFormattedText());

			if (lockOutState) {
				ArrayList<ItemAttachment<Weapon>> requirees = WeaponAttachmentAspect.whatRequiredFor(primaryAttachment,
						pwi);
				tooltip.addLine(TextFormatting.BOLD + "Is Required By:");
				for (ItemAttachment<Weapon> req : requirees)
					tooltip.addBulletPoint(translate(req.getTranslationKey()));
			}

			if (isInClick) {
				mc.player.playSound(UniversalSoundLookup.lookupSound("attachmentoff"), 10, 1);
	        	
				modcontext.getAttachmentAspect().forceAttachment(category, modcontext.getMainHeldWeapon(),
						ItemStack.EMPTY);

			}
			setAlpha(guiTransparency);
	

		}

		
		// Reset RGB state
		clearRGB();
		if (lockOutState) {
			setAlpha(0.9f);
			LOCK_OUT_ELEMENT.render();
			setAlpha(guiTransparency);
		}

		
		// Render the dropdown depending on
		// if it should be red or not
		if(!allInventoryRequired) {
			if (!dropdownHovered) {
				DROPDOWN_SELECT_ELEMENT.render();
			} else DROPDOWN_SELECT_ELEMENT.renderSelected();
			
		} else {
			if (!dropdownHovered) {
				DROPDOWN_SELECT_RED_ELEMENT.render();
			} else DROPDOWN_SELECT_RED_ELEMENT.renderSelected();
		}
		
		// 
		if (inventory.size() > 0)
			MORE_ITEMS_ALERT_ELEMENT.render();

		
		
		
		setAlpha(guiTransparency);
		if(activeTab == tab) {
			dropdownCancel = false;
			

			
			if(tab.isDropDownOpen && DROPDOWN_SAFE_BOX.checkBounding(x, y, mouseX, mouseY, scale)) {
				dropdownCancel = true;
			}
		}
		
		if (tab.isDropDownOpen) {
			
			
			
			GlStateManager.pushMatrix();
			GlStateManager.translate(0, 0, 100);
			if(!allInventoryRequired) {
				DROPDOWN_MENU_ELEMENT.render();
			} else DROPDOWN_MENU_ELEMENT.renderSelected();
			GlStateManager.popMatrix();

			if(!allInventoryRequired) {
				DROPDOWN_BAR_ELEMENT.render();
			} else DROPDOWN_BAR_ELEMENT.renderSelected();

			// Draw the two arrows
			
			if (LEFT_ARROW_ELEMENT.checkBounding(x, y, mouseX, mouseY, scale)) {
				if (isInClick)
					tab.previousPage();
				setAlpha(0.5f);
			}
			
			
			LEFT_ARROW_ELEMENT.render();
			setAlpha(1.0f);

			if (RIGHT_ARROW_ELEMENT.checkBounding(x, y, mouseX, mouseY, scale)) {
				if (isInClick)
					tab.nextPage(inventory.size());
				setAlpha(0.5f);
			}
			
			RIGHT_ARROW_ELEMENT.render();
			setAlpha(1.0f);

			GUIRenderHelper.drawScaledString("Pg. " + (tab.page + 1), 188.5, 256.5, 2.5, ColorPalette.WHITE);

		}

		GlStateManager.enableBlend();
	//	setRGB(0.5f, 1.0f, 1.0f);
		setAlpha(0.3f);

		if (dropdownHovered) {
			GUIRenderHelper.drawScaledString(title, 125, 10, 2.5, 0xfeca57);
		} else {
			GUIRenderHelper.drawScaledString(title, 125, 10, 2.5, ColorPalette.WHITE);
		}

		// Primary item render
		ItemAttachment<Weapon> current = pwi.getAttachmentItemWithCategory(category);
	
		if (current != null) {
			clearRGB();
			setAlpha(1.0f);
			
			
			
			GlStateManager.pushMatrix();
			GlStateManager.translate(0, 0, -15);
			GUIRenderHelper.quickItemRender(current, 13, 13, 5);
			GlStateManager.popMatrix();
			
		}

		// System.out.println("hi");

		GlStateManager.pushMatrix();
		GlStateManager.translate(0, 0, 50);
		if (tab.isDropDownOpen) {

			double i = 0;
			int startingPosition = tab.page * 4;
			for (int g = startingPosition; g < Math.min(inventory.size(), startingPosition + 4); ++g) {

				FlaggedAttachment flag = inventory.get(g);

				
				GUIRenderHelper.quickItemRender(flag.getAttachment(), i + 13, 150, 5);

				// RenderHelper.disableStandardItemLighting();
				GlStateManager.enableBlend();
				GlStateManager.enableAlpha();
				mc.getTextureManager().bindTexture(MODIFICATION_GUI_TEXTURES);

				// TexturedRect redBlockade = new TexturedRect(i + 11, 150, 0, 300, 89, 89, 512,
				// 512, 1);

				if (flag.requiresAnyParts()) {
					TexturedRect redBlockade = new TexturedRect(i + 11, 150, 0, 300, 89, 89, 1);
					redBlockade.render();

					if (redBlockade.checkBounding(x, y, mouseX, mouseY, scale)) {
						requiresTooltip = true;

						
						tooltip.color = TOOLTIP_COL_ERROR;
						tooltip.addBulletPoint(translate(flag.getAttachment().getTranslationKey()));
						tooltip.addLine(TextFormatting.BOLD + "Required Mods: ");
						for (ItemAttachment<Weapon> required : flag.getRequiredParts()) {
							tooltip.addBulletPoint(translate(required.getTranslationKey()));
						}
					}
					// drawTexturedRect(i+11, 150, 0, 300, 89, 89, 512, 512);

				} else {
					TexturedRect selector = new TexturedRect(i + 11, 150, 0, 389, 89, 89, 1);
					if (selector.checkBounding(x, y, mouseX, mouseY, scale)) {
						setAlpha(0.5f);
					
						
						GlStateManager.translate(0, 0, 50);
						selector.render();
						GlStateManager.translate(0, 0, -50);

						tooltip.color = TOOLTIP_COL_NORMAL;
						requiresTooltip = true;
						tooltip.addLine(
								new TextComponentTranslation(flag.getAttachment().getTranslationKey() + ".name")
										.getFormattedText());

						if (isInClick) {
							mc.player.playSound(UniversalSoundLookup.lookupSound("attachmenton"), 10, 1);
				        	
							modcontext.getAttachmentAspect().forceAttachment(category, modcontext.getMainHeldWeapon(),
									flag.getItemStack());
						}
					}
				}
				i += 108;

			}
		}
		
		GlStateManager.popMatrix();

		if (allInventoryRequired) {
			GUIRenderHelper.drawScaledString("Mods required", 119, 50, 3.0, 0xff3f34);
		}

		GlStateManager.popMatrix();

		if (requiresTooltip) {
			GlStateManager.pushMatrix();

			// Translate to front
			GlStateManager.translate(0, 0, 1000);

			// tooltip.addLine("fuck off");

			// Bind tooltip texture
			mc.getTextureManager().bindTexture(MODIFICATION_GUI_TEXTURES);
			setAlpha(0.5f);

			String[] args = tooltip.getLines();

			double maxStringWidth = 0.0;
			double maxStringHeight = args.length * 12;

			for (String s : args) {
				double len = mc.fontRenderer.getStringWidth(s) + 5.0;

				if (len > maxStringWidth) {
					maxStringWidth = len;
				}
			}

			// Draw tooltip background
			GlStateManager.disableTexture2D();
			
			GUIRenderHelper.drawColoredRectangle(mouseX, mouseY, maxStringWidth, maxStringHeight, 0.5, tooltip.color);
			//drawTexturedScaledRect(mouseX, mouseY, 89, 300, maxStringWidth, maxStringHeight, sheetSize, sheetSize, 0.5);

			// System.out.println(tooltip.getText());
			
			GlStateManager.enableTexture2D();
			int space = 0;
			for (String splitted : args) {
				GUIRenderHelper.drawScaledString(splitted, mouseX + 2, mouseY + 2 + space, 1.0, ColorPalette.WHITE);
				space += 10;
			}

			setAlpha(1.0f);
			clearRGB();
			GlStateManager.popMatrix();
		}

	}

	
	/*
	 * RENDER TOOLS
	 */

}
