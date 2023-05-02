package com.paneedah.mwc.weaponlib.inventory;

import com.paneedah.mwc.utils.ModReference;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleGuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import java.io.IOException;

import static com.paneedah.mwc.weaponlib.compatibility.CompatibilityProvider.compatibility;
public class CustomPlayerInventoryGuiContainer extends CompatibleGuiContainer {
    /**
     * x size of the inventory window in pixels. Defined as float, passed as int
     */
    private float xSize_lo;

    /**
     * y size of the inventory window in pixels. Defined as float, passed as
     * int.
     */
    private float ySize_lo;

    /**
     * Normally I use '(ModInfo.MOD_ID, "textures/...")', but it can be done
     * this way as well
     */
    private static final ResourceLocation iconLocation = new ResourceLocation(ModReference.id, "textures/gui/custom_inventory.png");


    /**
     * Could use IInventory type to be more generic, but this way will save an
     * import...
     */
    private final CustomPlayerInventory inventory;

    public CustomPlayerInventoryGuiContainer(EntityPlayer player, InventoryPlayer inventoryPlayer, CustomPlayerInventory inventoryCustom) {
        super(new CustomPlayerInventoryContainer(player, inventoryPlayer, inventoryCustom));
        this.inventory = inventoryCustom;
        // if you need the player for something later on, store it in a local
        // variable here as well
    }
    
    @Override
    public void initGui() {
        // TODO Auto-generated method stub
        super.initGui();
        
        int cornerX = guiLeft;
        int cornerY = guiTop;
        this.buttonList.clear();
        
        InventoryTabs iventoryTabs = InventoryTabs.getInstance();
        iventoryTabs.updateTabValues(cornerX, cornerY, CustomPlayerInventoryTab.class);
        iventoryTabs.addTabsToList(this.buttonList);
    }

    /**
     * Draws the screen and all the components in it.
     */
    public void drawScreen(int mouseX, int mouseY, float f) {
    	drawDefaultBackground();
    	
       super.drawScreen(mouseX, mouseY, f);

        xSize_lo = mouseX;
        ySize_lo = mouseY;
        this.renderHoveredToolTip(mouseX, mouseY);
    }

    /**
     * Draw the foreground layer for the GuiContainer (everything in front of
     * the items)
     */
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
     
    	// This method will simply draw inventory names on the screen - you
        // could do without it entirely
        // if that's not important to you, since we are overriding the default
        // inventory rather than
        // creating a specific type of inventory

//        String s = this.inventory.hasCustomInventoryName() ? this.inventory.getInventoryName()
//                : I18n.getString(this.inventory.getInventoryName());
//        // with the name "Custom Inventory", the 'Cu' will be drawn in the first
//        // slot
//        fontRendererObj.drawString(s, this.xSize - fontRendererObj.getStringWidth(s), 12, 4210752);
//        // this just adds "Inventory" above the player's inventory below
//        fontRendererObj.drawString(I18n.getString("container.inventory"), 80, this.ySize - 96, 4210752);
    
//        String s = StatCollector.translateToLocal(inventory.getInventoryName());
//        fontRendererObj.drawString(s, this.xSize / this.fontRendererObj.getStringWidth(s) / 2, 0, 4210752);
//        fontRendererObj.drawString(StatCollector.translateToLocal("container.inventory"), 26, this.ySize - 96 + 4, 4210752);
   
//        String s = inventory.hasCustomInventoryName() ? inventory.getInventoryName() : I18n.format(inventory.getInventoryName());
//        // with the name "Custom Inventory", the 'Cu' will be drawn in the first slot
//        fontRendererObj.drawString(s, xSize - fontRendererObj.getStringWidth(s), 12, 4210752);
//        // this just adds "Inventory" above the player's inventory below
//        fontRendererObj.drawString(I18n.format("container.inventory"), 80, ySize - 96, 4210752);
    }

    /**
     * Draw the background layer for the GuiContainer (everything behind the
     * items)
     */
    protected void drawGuiContainerBackgroundLayer(float f, int mouseX, int mouseY) {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        mc.getTextureManager().bindTexture(iconLocation);
        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
       drawPlayerModel(guiLeft + 51, guiTop + 75, 30, guiLeft + 51 - xSize_lo, guiTop + 25 - ySize_lo, compatibility.clientPlayer());
    }

    

    private static ThreadLocal<CustomPlayerInventoryGuiContainer> threadLocalGuiContainer = new ThreadLocal<>();
    
    @Override
    protected void compatibleMouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
        try {
            threadLocalGuiContainer.set(this);
            super.compatibleMouseClicked(mouseX, mouseY, mouseButton);
        } finally {
            threadLocalGuiContainer.remove();
        }
    }
    
    @Override
    protected void mouseReleased(int mouseX, int mouseY, int state) {
        try {
            threadLocalGuiContainer.set(this);
            super.mouseReleased(mouseX, mouseY, state);
        } finally {
            threadLocalGuiContainer.remove();
        }
    }
    
    protected static CustomPlayerInventoryGuiContainer getClickedGuiContainer() { 
        return threadLocalGuiContainer.get();
    }
}
