package com.paneedah.weaponlib.mission;

import com.paneedah.weaponlib.ModContext;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import java.util.List;

public class MissionIntroGui extends GuiScreen {
    
    private float normalizedIntroImageWidth = 0.28f;
    private float normalizedContentWidth = 0.5f;
    
    private float normalizedLeftMargin = 0.09f;
    private float normalizedTopMargin = 0.1f;
    
    private float normalizedTopContentPadding = 0.04f;
    private float normalizedLeftContentPadding = 0.04f;
    
    private int contentBackgroundTextureWidth = 460;
    private int contentBackgroundTextureHeight = 300;
    
    private float contentBackgroundAspectRatio = (float)contentBackgroundTextureWidth / contentBackgroundTextureHeight; // = width /height
    
    private int introImageTextureWidth = 240;
    private int introImageTextureHeight = 360;
    private float introImageAspectRatio = (float)introImageTextureWidth/introImageTextureHeight; // = width / height
    
    private int buttonHeight = 30;
    
    private int contentTextColor = 0xFFFFFF;
    
    private GuiButton buttonDone;
    private GuiButton buttonNextPage;
    private GuiButton buttonPreviousPage;
    
    private int currentContentPage;
    private List<String> contentPages;
    
    private ResourceLocation introImage;
    private ResourceLocation contentBackground;
//    private ResourceLocation missionSelectionItemBackground;
    private ResourceLocation rewardsBackground;
    private ResourceLocation missionSelectionBackground;
    
    private MissionAssigner missionAssigner;
    private EntityPlayer player;
    private ModContext modContext;

    public MissionIntroGui(
            MissionAssigner missionAssigner, 
            EntityPlayer player, 
            ModContext modContext,
            List<String> contentPages, 
            ResourceLocation contentBackground, 
            ResourceLocation introImage,
            ResourceLocation rewardsBackground,
            ResourceLocation missionSelectionBackground
            ) {
        
        this.missionAssigner = missionAssigner;
        this.player = player;
        this.modContext = modContext;
        
        this.contentPages = contentPages;
        this.contentBackground = contentBackground;
        this.introImage = introImage;
        this.rewardsBackground = rewardsBackground;
        this.missionSelectionBackground = missionSelectionBackground;
    }

    /**
     * Adds the buttons (and other controls) to the screen in question.
     */
    @Override
    public void initGui() {
        buttonList.clear();
        Keyboard.enableRepeatEvents(true);
        
        int leftMargin = (int)(width * normalizedLeftMargin);
        int topMargin = (int)(height * normalizedTopMargin);
        
        int standardButtonWidth = 60;
        
        int scaledIntroImageWidth = (int)(width * 0.28f);
        int scaledIntroImageHeight = (int)((float)scaledIntroImageWidth / introImageAspectRatio);
        int scaledContentBackgroundWidth = (int)(width * normalizedContentWidth);
        buttonDone = new MissionGuiButton(0, leftMargin, topMargin + scaledIntroImageHeight - buttonHeight, 
                standardButtonWidth, buttonHeight,
                I18n.format("Done", new Object[0]));
        
        buttonPreviousPage = new MissionGuiButton(2, leftMargin  + (scaledContentBackgroundWidth >> 1) - standardButtonWidth / 2, 
                topMargin + scaledIntroImageHeight - buttonHeight , standardButtonWidth, buttonHeight, 
                I18n.format("Previous"));
        buttonNextPage = new MissionGuiButton(1, leftMargin + scaledContentBackgroundWidth - standardButtonWidth, 
                topMargin + scaledIntroImageHeight - buttonHeight, standardButtonWidth, buttonHeight, 
                I18n.format("Next"));
        
        buttonList.add(buttonDone);
        buttonList.add(buttonPreviousPage);
        buttonList.add(buttonNextPage);
        updateScreen();
    }


    @Override
    public void updateScreen() {
        buttonNextPage.visible = currentContentPage < contentPages.size();
        buttonPreviousPage.visible = currentContentPage > 0;
    }

    @Override
    public void drawScreen(int parWidth, int parHeight, float p_73863_3_) {
        drawDefaultBackground();
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        
        int leftMargin = (int)(width * normalizedLeftMargin);
        int topMargin = (int)(height * normalizedTopMargin);

        int scaledContentBackgroundWidth = (int)(width * normalizedContentWidth);
        int scaledContentBackgroundHeight = (int)(scaledContentBackgroundWidth / contentBackgroundAspectRatio);
        
        if(contentBackground != null) {
            mc.getTextureManager().bindTexture(contentBackground);
            
            GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glDisable(GL11.GL_LIGHTING);
            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
            GL11.glEnable(GL11.GL_BLEND);
            
            drawScaledCustomSizeModalRect(
                    leftMargin, topMargin, 0, 0, 
                    contentBackgroundTextureWidth, contentBackgroundTextureHeight, 
                    scaledContentBackgroundWidth, scaledContentBackgroundHeight, 
                    contentBackgroundTextureWidth, contentBackgroundTextureHeight);
            
            GL11.glPopAttrib();
        }
        
        int leftContentPadding = (int)(normalizedLeftContentPadding * height);
        int topContentPadding = (int)(normalizedTopContentPadding * height);
        
        fontRenderer.drawSplitString(I18n.format(contentPages.get(currentContentPage)), 
                leftMargin + leftContentPadding, topMargin + topContentPadding, 
                scaledContentBackgroundWidth - leftContentPadding * 2, contentTextColor);
        
        if(introImage != null) {
            mc.getTextureManager().bindTexture(introImage);

            int scaledIntroImageWidth = (int)(width * normalizedIntroImageWidth);
            int scaledIntroImageHeight = (int)(scaledIntroImageWidth/introImageAspectRatio);

            GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glDisable(GL11.GL_LIGHTING);
            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
            GL11.glEnable(GL11.GL_BLEND);
            
            drawScaledCustomSizeModalRect(
                    width - leftMargin - scaledIntroImageWidth, topMargin, 0, 0, 
                    introImageTextureWidth, introImageTextureHeight, 
                    scaledIntroImageWidth, scaledIntroImageHeight, 
                    introImageTextureWidth, introImageTextureHeight);
            
            GL11.glPopAttrib();

        }

        super.drawScreen(parWidth, parHeight, p_73863_3_);
    }

    /**
     * Called when a mouse button is pressed and the mouse is moved around.
     * Parameters are : mouseX, mouseY, lastButtonClicked & timeSinceMouseClick.
     */
    @Override
    protected void mouseClickMove(int parMouseX, int parMouseY, int parLastButtonClicked, long parTimeSinceMouseClick) {

    }

    @Override
    protected void actionPerformed(GuiButton parButton) {
        if (parButton == buttonDone) {
            // You can send a packet to server here if you need server to do
            // something
            mc.displayGuiScreen((GuiScreen) null);
        } else if (parButton == buttonNextPage) {
            if (currentContentPage < contentPages.size() - 1) {
                currentContentPage++;
            } else {
                mc.displayGuiScreen(new MissionSelectionGui(missionAssigner, 
                        player, 
                        modContext, 
                        this,
                        missionSelectionBackground, 
                        introImage, 
//                        missionSelectionItemBackground, 
                        rewardsBackground));
            }
        } else if (parButton == buttonPreviousPage) {
            if (currentContentPage > 0) {
                currentContentPage--;
            }
        }
    }

    /**
     * Called when the screen is unloaded. Used to disable keyboard repeat
     * events
     */
    @Override
    public void onGuiClosed() {

    }

    /**
     * Returns true if this GUI should pause the game when it is displayed in
     * single-player
     */
    @Override
    public boolean doesGuiPauseGame() {
        return true;
    }
}