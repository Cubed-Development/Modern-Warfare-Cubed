package com.paneedah.weaponlib.inventory;

import com.paneedah.weaponlib.compatibility.CompatibleGuiContainer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class StorageItemGuiContainer extends CompatibleGuiContainer {
    /**
     * x and y size of the inventory window in pixels. Defined as float, passed
     * as int These are used for drawing the player model.
     */
    private float xSize_lo;
    private float ySize_lo;

    private ResourceLocation guiTextureLocation; // = new ResourceLocation("mw", "textures/gui/inventoryitem.png");

    /** The inventory to render on screen */
    private final StorageInventory inventory;

    public StorageItemGuiContainer(StorageItemContainer storageItemContainer) {
        super(storageItemContainer);
        this.inventory = storageItemContainer.getStorageInventory();
        this.guiTextureLocation = inventory.getItemStorage().getGuiTextureLocation();
        this.xSize = inventory.getItemStorage().getGuiTextureWidth();
    }

    @Override
    public void initGui() {
        super.initGui();

        int cornerX = guiLeft;
        int cornerY = guiTop;
        this.buttonList.clear();

        InventoryTabs iventoryTabs = InventoryTabs.getInstance();
        iventoryTabs.updateTabValues(cornerX, cornerY, BackpackInventoryTab.class);
        iventoryTabs.addTabsToList(this.buttonList);
    }

    /**
     * Draws the screen and all the components in it.
     */
    public void drawScreen(int par1, int par2, float par3) {
    	drawDefaultBackground();
        super.drawScreen(par1, par2, par3);
        this.xSize_lo = (float) par1;
        this.ySize_lo = (float) par2;
        this.renderHoveredToolTip(par1, par2);
    }

    /**
     * Draw the foreground layer for the GuiContainer (everything in front of
     * the items)
     */
    protected void drawGuiContainerForegroundLayer(int par1, int par2) {
//        String s = StatCollector.translateToLocal(inventory.getInventoryName());
//        fontRendererObj.drawString(s, this.xSize / this.fontRendererObj.getStringWidth(s) / 2, 0, 4210752);
//        fontRendererObj.drawString(StatCollector.translateToLocal("container.inventory"), 26, this.ySize - 96 + 4,
//                4210752);
    }

    /**
     * Draw the background layer for the GuiContainer (everything behind the
     * items)
     */
    protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(guiTextureLocation);
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
        drawPlayerModel(k + 51, l + 75, 30, (float) (k + 51) - this.xSize_lo, (float) (l + 75 - 50) - this.ySize_lo,
                compatibility.clientPlayer());
    }

   
}