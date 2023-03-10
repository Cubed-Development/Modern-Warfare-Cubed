package com.paneedah.weaponlib.mission;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiListExtended;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mw.proxies.ClientProxy.mc;

@SideOnly(Side.CLIENT)
public class MissionSelectionGuiListEntry implements GuiListExtended.IGuiListEntry
{
    private final Minecraft client;
    private final MissionOffering missionOffering;
    private final MissionSelectionGuiList missionSelectionGuiList;

    private long lastClickTime;
    private ResourceLocation itemBackground = new ResourceLocation("weaponlib",
            "/com/paneedah/weaponlib/resources/mission-selection-items.png");
    
    private int textureWidth = 200;
    private int textureHeight = 90;
    private int textureSegmentWidth = textureWidth; //TODO: move to class member
    private int textureCount = 3;
    
    private int textureSegmentHeight = (int) ((float) textureHeight / textureCount);
    
    private boolean isRedeemable;

    public MissionSelectionGuiListEntry(MissionSelectionGuiList missionSelectionGuiList, 
            MissionOffering missionOffering, boolean isRedeemable)
    {
        this.missionSelectionGuiList = missionSelectionGuiList;
        this.missionOffering = missionOffering;
        this.isRedeemable = isRedeemable;
        this.client = mc;
    }
    
    protected MissionOffering getMissionOffering() {
        return missionOffering;
    }

    public void drawEntry(int slotIndex, int x, int y, int listWidth, int slotHeight, int mouseX, int mouseY, boolean isSelected, float partialTicks)
    {
        String s = this.missionOffering.getMissionName();
        
        client.getTextureManager().bindTexture(itemBackground);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);

        GlStateManager.enableBlend();
        GlStateManager.tryBlendFuncSeparate(
                GlStateManager.SourceFactor.SRC_ALPHA,
                GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, 
                GlStateManager.SourceFactor.ONE,
                GlStateManager.DestFactor.ZERO);
        GlStateManager.blendFunc(
                GlStateManager.SourceFactor.SRC_ALPHA,
                GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        
        int i = isSelected ? 2 : 1;
        int textureV = textureSegmentHeight * i;
        
        int buttonXPadding = 3;
        int buttonYPadding = 1;
        int buttonWidth = listWidth - buttonXPadding * 2;
        int buttonHeight = slotHeight - buttonYPadding * 2;
        int buttonLeft = x + buttonXPadding ;
        int buttonTop = y + buttonYPadding;
        Gui.drawScaledCustomSizeModalRect(
                buttonLeft, // x
                buttonTop, // y
                0, // u
                textureV, // v
                textureSegmentWidth, // >> 1, // uWidth
                textureSegmentHeight, // uHeight
                buttonWidth, // >> 1, // width
                buttonHeight, // height
                textureWidth, 
                textureHeight);
        
//        Gui.drawScaledCustomSizeModalRect(
//                buttonLeft +  (buttonWidth >> 1), // x
//                buttonTop, // y
//                textureWidth >> 1, // u
//                textureV, // v
//                textureSegmentWidth >> 1, // uWidth
//                textureSegmentHeight, // uHeight
//                buttonWidth >> 1, // width
//                buttonHeight, // height
//                textureWidth, 
//                textureHeight);
        
        this.client.fontRenderer.drawString(s, x + 10, y + 12, 16777215);
    }

    /**
     * Called when the mouse is clicked within this entry. Returning true means that something within this entry was
     * clicked and the list should not be dragged.
     */
    public boolean mousePressed(int slotIndex, int mouseX, int mouseY, int mouseEvent, int relativeX, int relativeY)
    {
        this.missionSelectionGuiList.selectMission(slotIndex);

        /*if (relativeX <= 32 && relativeX < 32)
        {
            loadMission();
            return true;
        }
        else */
        if (Minecraft.getSystemTime() - this.lastClickTime < 250L)
        {
            loadMission();
            return true;
        }
        else
        {
            this.lastClickTime = Minecraft.getSystemTime();
            return false;
        }
    }

    
    protected void loadMission() {
        System.out.println("Loading mission...");
        
        this.client.displayGuiScreen(new MissionAcceptGui(
                isRedeemable,
                missionSelectionGuiList.getSelectedMission().getMissionOffering(),
                missionSelectionGuiList.getMissionAssigner(), 
                missionSelectionGuiList.getPlayer(), 
                missionSelectionGuiList.getModContext(),  
                missionSelectionGuiList.getMissionSelection().getContentBackground(),
                missionSelectionGuiList.getMissionSelection().getRewardsBackground(),
                missionSelectionGuiList.getMissionSelection()));
//        this.client.displayGuiScreen(new SelectedMissionGui());
        
//        this.client.getSoundHandler().playSound(PositionedSoundRecord.getMasterRecord(SoundEvents.UI_BUTTON_CLICK, 1.0F));
//
////        if (this.client.getSaveLoader().canLoadWorld(this.worldSummary.getFileName()))
////        {
////            net.minecraftforge.fml.client.FMLClientHandler.instance().tryLoadExistingWorld(worldSelScreen, this.worldSummary);
////        }
    }

   

    /**
     * Fired when the mouse button is released. Arguments: index, x, y, mouseEvent, relativeX, relativeY
     */
    public void mouseReleased(int slotIndex, int x, int y, int mouseEvent, int relativeX, int relativeY) {
    }

    public void updatePosition(int p_192633_1_, int p_192633_2_, int p_192633_3_, float p_192633_4_) {
    }
}
