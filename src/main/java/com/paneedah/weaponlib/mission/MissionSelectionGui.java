package com.paneedah.weaponlib.mission;

import com.paneedah.weaponlib.ModContext;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

import javax.annotation.Nullable;
import java.io.IOException;

@SideOnly(Side.CLIENT)
public class MissionSelectionGui extends GuiScreen {
    
    protected GuiScreen prevScreen;
    protected String title = "Select mission";
    private GuiButton selectButton;
    private MissionSelectionGuiList selectionList;
    private MissionAssigner missionAssigner;
    private EntityPlayer player;
    private ModContext modContext;
    
    private ResourceLocation introImage;
    private ResourceLocation contentBackground;
    private ResourceLocation rewardsBackground;
//    private ResourceLocation missionSelectionItemBackground;
    
    private int contentBackgroundTextureWidth = 460;
    private int contentBackgroundTextureHeight = 300;
    
    private float missionListBackgroundAspectRatio = (float)contentBackgroundTextureWidth / contentBackgroundTextureHeight; // = width /height
    private float introImageAspectRatio = 200f/300; // = width / height
    
    private float normalizedIntroImageWidth = 0.28f;
    
    private float normalizedMissionListWidth = 0.5f;
    private float normalizedMissionListLeft = 0.09f;
    private float normalizedMissionListTop = 0.1f;
    private float normalizedMissionListContentLeftPadding = 0.01f;
    private float normalizedMissionListContentTopPadding = 0.03f;

    public MissionSelectionGui(MissionAssigner missionAssigner, EntityPlayer player, ModContext modContext,
            GuiScreen screenIn, 
            ResourceLocation contentBackground, 
            ResourceLocation introImage,
//            ResourceLocation missionSelectionItemBackground,
            ResourceLocation rewardsBackground) {
        this.missionAssigner = missionAssigner;
        this.player = player;
        this.modContext = modContext;
        this.prevScreen = screenIn;
        this.contentBackground = contentBackground;
        this.introImage = introImage;
//        this.missionSelectionItemBackground = missionSelectionItemBackground;
        this.rewardsBackground = rewardsBackground;
    }

    /**
     * Adds the buttons (and other controls) to the screen in question. Called
     * when the GUI is displayed and when the window resizes, the buttonList is
     * cleared beforehand.
     */
    public void initGui() {
        this.title = I18n.format("selectMission");
        
        int topPadding = (int)(height * normalizedMissionListContentTopPadding);
        int missionListTop =  (int)(height * normalizedMissionListTop) + topPadding;
        
        int leftPadding = (int)(width * normalizedMissionListContentLeftPadding);
        int missionListLeft =  (int)(width * normalizedMissionListLeft) + leftPadding;
        
        int missionListWidth = ((int)(width * normalizedMissionListWidth) - leftPadding * 2);
        if((missionListWidth & 1) == 1) {
            missionListWidth--;
        }
        int missionListHeight = (int)(missionListWidth / missionListBackgroundAspectRatio) - topPadding * 2;
        
        this.selectionList = new MissionSelectionGuiList(missionAssigner, player, modContext, 
            this, this.mc, 
            missionListWidth, // widthIn
            missionListHeight, // height
            missionListLeft, // left
            missionListTop, // top
            missionListTop + missionListHeight, // Bottom
            36);
        
        this.postInit();
    }
    
    public ResourceLocation getContentBackground() {
        return contentBackground;
    }
    
    public ResourceLocation getRewardsBackground() {
        return rewardsBackground;
    }

    /**
     * Handles mouse input.
     */
    public void handleMouseInput() throws IOException {
        super.handleMouseInput();
        this.selectionList.handleMouseInput();
    }

    public void postInit() {
                
        int leftMargin = (int)(width * normalizedMissionListLeft);
        int topMargin = (int)(height * normalizedMissionListTop);
        
        int standardButtonWidth = 60;
        
        int buttonHeight = 30;
        
        int scaledIntroImageWidth = (int)(width * 0.28f);
        int scaledIntroImageHeight = (int)((float)scaledIntroImageWidth / introImageAspectRatio);
        int scaledContentBackgroundWidth = (int)(width * normalizedMissionListWidth);
        GuiButton buttonDone = new MissionGuiButton(0, leftMargin, topMargin + scaledIntroImageHeight - buttonHeight, 
                standardButtonWidth, buttonHeight,
                I18n.format("Done", new Object[0]));
        
        GuiButton buttonPreviousPage = new MissionGuiButton(2, leftMargin  + (scaledContentBackgroundWidth >> 1) - standardButtonWidth / 2, 
                topMargin + scaledIntroImageHeight - buttonHeight , standardButtonWidth, buttonHeight, "Previous");
        selectButton = new MissionGuiButton(1, leftMargin + scaledContentBackgroundWidth - standardButtonWidth, 
                topMargin + scaledIntroImageHeight - buttonHeight, standardButtonWidth, buttonHeight, "Select");
        
        selectButton.enabled = false;
        buttonList.add(buttonDone);
        buttonList.add(buttonPreviousPage);
        buttonList.add(selectButton);

    }

    /**
     * Called by the controls from the buttonList when activated. (Mouse pressed
     * for buttons)
     */
    protected void actionPerformed(GuiButton button) throws IOException {
        if (button.enabled) {
            MissionSelectionGuiListEntry missionSelectionEntry = this.selectionList.getSelectedMission();
            
            if (button.id == 0) {
                this.mc.displayGuiScreen(null);
            } else if (button.id == 2) {
                this.mc.displayGuiScreen(this.prevScreen);
            } else if(button.id == 1 && missionSelectionEntry != null) {
                missionSelectionEntry.loadMission();
            }
        }
    }

    /**
     * Draws the screen and all the components in it.
     */
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        drawDefaultBackground();
        
        mc.getTextureManager().bindTexture(contentBackground);
        
        int missionListWidth = (int)(width * normalizedMissionListWidth);
        int missionListHeight = (int)(missionListWidth / missionListBackgroundAspectRatio);
        
        int missionListLeft = (int)(width * (normalizedMissionListLeft));
        int missionListTop = (int)(height * (normalizedMissionListTop));
        
        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(GL11.GL_LIGHTING);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GL11.glEnable(GL11.GL_BLEND);
        
        drawScaledCustomSizeModalRect(
                missionListLeft, missionListTop, 0, 0, 
                contentBackgroundTextureWidth, contentBackgroundTextureHeight, 
                missionListWidth, missionListHeight, 
                contentBackgroundTextureWidth, contentBackgroundTextureHeight);
        
        if(introImage != null) {
            mc.getTextureManager().bindTexture(introImage);

            int introImageWidth = (int)(width * normalizedIntroImageWidth);
            int introImageHeight = (int)(introImageWidth/introImageAspectRatio);
            int leftMargin = (int)(width * normalizedMissionListLeft);
            int topMargin = (int)(height * normalizedMissionListTop);

            drawModalRectWithCustomSizedTexture(
                    width - leftMargin - introImageWidth, topMargin, 0, 0, 
                    introImageWidth, introImageHeight, introImageWidth, introImageHeight);

        }
        
        GL11.glPopAttrib();
        
        this.selectionList.drawScreen(mouseX, mouseY, partialTicks);
        
        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    /**
     * Called when the mouse is clicked. Args : mouseX, mouseY, clickedButton
     */
    protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
        super.mouseClicked(mouseX, mouseY, mouseButton);
        this.selectionList.mouseClicked(mouseX, mouseY, mouseButton);
    }

    /**
     * Called when a mouse button is released.
     */
    protected void mouseReleased(int mouseX, int mouseY, int state) {
        super.mouseReleased(mouseX, mouseY, state);
        this.selectionList.mouseReleased(mouseX, mouseY, state);
    }

    public void selectMission(@Nullable MissionSelectionGuiListEntry entry) {
        boolean flag = entry != null;
        this.selectButton.enabled = flag;
    }
}