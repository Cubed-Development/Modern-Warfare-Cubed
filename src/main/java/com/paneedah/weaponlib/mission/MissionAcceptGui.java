package com.paneedah.weaponlib.mission;

import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.compatibility.CompatibleMissionCapability;
import com.paneedah.weaponlib.mission.MissionReward.ItemReward;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import java.util.List;
import java.util.Set;

public class MissionAcceptGui extends GuiScreen {
        
    private float normalizedContentWidth = 0.5f;
    private float normalizedRewardsWidth = 0.28f;
    
    private float normalizedLeftMargin = 0.09f;
    private float normalizedTopMargin = 0.1f;
    
    private float normalizedTopContentPadding = 0.04f;
    private float normalizedLeftContentPadding = 0.04f;
    
    private int rewardsTextureWidth = 240;
    private int rewardsTextureHeight = 360;
    private float rewardsBackgroundAspectRatio = (float) rewardsTextureWidth / rewardsTextureHeight;
    
    private int itemBoxTextureTopMargin = 84;
    private int itemBoxTextureWidth = 60;
    
    private int itemBoxTextureHeight = 220;
    
    private int contentBackgroundTextureWidth = 460;
    private int contentBackgroundTextureHeight = 300;
    private float contentBackgroundAspectRatio = (float)contentBackgroundTextureWidth / contentBackgroundTextureHeight; // = width /height
    
    private int numberOfItemSlots = 4;
    
    private int buttonHeight = 30;
    
    private int contentTextColor = 0xFFFFFF;
    
    private GuiButton buttonPrevious;
    private GuiButton buttonAccept;
    private GuiButton buttonDecline;
    

    private ResourceLocation contentBackground;
    private ResourceLocation rewardsBackground;
    
//    private ResourceLocation missionSelectionItemBackground;
    
    private MissionAssigner missionAssigner;
    private EntityPlayer player;
    private ModContext modContext;
    private GuiScreen previousScreen;
    private MissionOffering missionOffering;
    private boolean isRedeemable;

    public MissionAcceptGui(
            boolean isRedeemable,
            MissionOffering missionOffering,
            MissionAssigner missionAssigner, 
            EntityPlayer player, 
            ModContext modContext,
            ResourceLocation contentBackground,
            ResourceLocation rewardsBackground,
            GuiScreen previousScreen) {
        this.isRedeemable = isRedeemable;
        this.missionOffering = missionOffering;
        this.missionAssigner = missionAssigner;
        this.player = player;
        this.modContext = modContext;
        
        this.contentBackground = contentBackground;
        this.rewardsBackground = rewardsBackground;
        this.previousScreen = previousScreen;
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
        
        int scaledRewardsBackgroundWidth = (int)(width * normalizedRewardsWidth);
        int scaledRewardsBackgroundHeight = (int)((float)scaledRewardsBackgroundWidth / rewardsBackgroundAspectRatio);
        int scaledContentBackgroundWidth = (int)(width * normalizedContentWidth);
                
        buttonDecline = new MissionGuiButton(2, 
                leftMargin, 
                topMargin + scaledRewardsBackgroundHeight - buttonHeight, 
                standardButtonWidth, buttonHeight, I18n.format("Done"));
        
        buttonList.add(buttonDecline);
        
        if(previousScreen != null) {
            buttonPrevious = new MissionGuiButton(0, 
                    leftMargin  + (scaledContentBackgroundWidth >> 1) - standardButtonWidth / 2, 
                    topMargin + scaledRewardsBackgroundHeight - buttonHeight , 
                    standardButtonWidth, buttonHeight,
                    I18n.format("Previous", new Object[0]));
            buttonList.add(buttonPrevious);
        }

        buttonAccept = new MissionGuiButton(1, leftMargin + scaledContentBackgroundWidth - standardButtonWidth, 
                topMargin + scaledRewardsBackgroundHeight - buttonHeight, standardButtonWidth, buttonHeight, 
                isRedeemable ? I18n.format("Redeem") : I18n.format("Accept"));
        
        
        buttonList.add(buttonAccept);
        updateScreen();
    }


    @Override
    public void updateScreen() {
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float p_73863_3_) {
        drawDefaultBackground();
        
        super.drawScreen(mouseX, mouseY, p_73863_3_);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

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
        
        int leftContentPadding = (int)(normalizedLeftContentPadding * width);
        int topContentPadding = (int)(normalizedTopContentPadding * height);
        
        fontRenderer.drawString(
                (isRedeemable ? "Completed: " : "") + missionOffering.getMissionName(), 
                leftMargin + leftContentPadding, topMargin + topContentPadding, contentTextColor);
       
        fontRenderer.drawSplitString(I18n.format(this.missionOffering.getMissionDescription()), 
                leftMargin + leftContentPadding, topMargin + topContentPadding * 3, 
                scaledContentBackgroundWidth - (int)(leftContentPadding * 1.5f), contentTextColor);
        
        
        int scaledRewardsBackgroundWidth = (int)(width * normalizedRewardsWidth); // * 0.3f);
        int scaledRewardsBackgroundHeight = (int)(scaledRewardsBackgroundWidth / rewardsBackgroundAspectRatio);
        
        fontRenderer.drawString(I18n.format("Level") + ": " + I18n.format(missionOffering.getLevel().toString()), 
                leftMargin + leftContentPadding, 
                topMargin + scaledContentBackgroundHeight - (int)(topContentPadding * 1.5f), contentTextColor);
        
        int rewardsLeftMargin = width - leftMargin - scaledRewardsBackgroundWidth;
        if(rewardsBackground != null) {
            mc.getTextureManager().bindTexture(rewardsBackground);
            GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glDisable(GL11.GL_LIGHTING);
            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
            GL11.glEnable(GL11.GL_BLEND);
            drawScaledCustomSizeModalRect(rewardsLeftMargin, topMargin, 0, 0, 
                    rewardsTextureWidth, rewardsTextureHeight, 
                    scaledRewardsBackgroundWidth, scaledRewardsBackgroundHeight, 
                    rewardsTextureWidth, rewardsTextureHeight);
            GL11.glPopAttrib();
        }
        
        int rewardsTitleWidth = fontRenderer.getStringWidth(I18n.format("Rewards"));
        
        fontRenderer.drawString(I18n.format("Rewards"), 
                rewardsLeftMargin + ((scaledRewardsBackgroundWidth - rewardsTitleWidth) >> 1), 
                topMargin + topContentPadding, contentTextColor);
        
        List<MissionReward> rewards = missionOffering.getRewards();
        
        GlStateManager.pushMatrix();
        RenderHelper.enableGUIStandardItemLighting();
        GlStateManager.disableLighting();
        GlStateManager.enableRescaleNormal();
        GlStateManager.enableColorMaterial();
        GlStateManager.enableLighting();
        
        float normalizedItemBoxTextureTopMargin = (float)itemBoxTextureTopMargin/rewardsTextureHeight;
        
        int itemBoxSlotTextureHeight = (int)((float)itemBoxTextureHeight/numberOfItemSlots);
        float normalizedItemBoxSlotTextureHeight = (float)itemBoxSlotTextureHeight/rewardsTextureHeight;
        float normalizedItemBoxSlotTextureWidth = (float)itemBoxTextureWidth/rewardsTextureWidth;

        int itemSlotWidth = (int)(scaledRewardsBackgroundWidth * normalizedItemBoxSlotTextureWidth);
        
        int itemSlotHeight = (int)(scaledRewardsBackgroundHeight * normalizedItemBoxSlotTextureHeight);

        int itemsTopMargin = topMargin 
                + (int)(normalizedItemBoxTextureTopMargin * scaledRewardsBackgroundHeight) // scaled vertical offset of the items texture
                + (int)(itemSlotHeight * 0.25f); // additional scaled vertical offset of an item within a cell

        
        int itemsLeftMargin = rewardsLeftMargin 
                + ((scaledRewardsBackgroundWidth - itemSlotWidth) >> 1) // scaled horizontal offset of the items texture
                + + (int)(itemSlotWidth * 0.16f); // additional scaled horizontal offset of an item within a cell
        
        for(int i = 0; i < rewards.size(); i++) {

            MissionReward reward = rewards.get(i);
            if(reward instanceof ItemReward) {
                itemRender.zLevel = 0.0F;
                
                ItemStack itemStack = ((ItemReward) reward).getReward();
                itemRender.renderItemAndEffectIntoGUI(
                        itemStack,
                        itemsLeftMargin,
                        i * itemSlotHeight + itemsTopMargin);
                
                itemRender.renderItemOverlays(this.fontRenderer, itemStack, 
                        itemsLeftMargin,
                        i * itemSlotHeight + itemsTopMargin);
            }
            
        }
        
        this.itemRender.zLevel = 0.0F;
        
        GlStateManager.disableLighting();
        
        for(int i = 0; i < rewards.size(); i++) {
            
            if (this.isPointInRegion(itemsLeftMargin, 
                    i * itemSlotHeight + itemsTopMargin, 
                    itemSlotWidth, itemSlotHeight, 
                    mouseX, mouseY))
            {
                MissionReward reward = rewards.get(i);
                if(reward instanceof ItemReward) {
                    ItemStack itemStack = ((ItemReward) reward).getReward();
                    this.renderToolTip(itemStack, mouseX, mouseY);
                }
            }
        }
        
        GlStateManager.popMatrix();
              
        GlStateManager.enableLighting();
        GlStateManager.enableDepth();
        RenderHelper.enableStandardItemLighting();
    }

    protected boolean isPointInRegion(int rectX, int rectY, int rectWidth, int rectHeight, int pointX, int pointY)
    {
        int i = 0; //this.guiLeft;
        int j = 0; //this.guiTop;
        pointX = pointX - i;
        pointY = pointY - j;
        return pointX >= rectX - 1 && pointX < rectX + rectWidth + 1 && pointY >= rectY - 1 && pointY < rectY + rectHeight + 1;
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
        if (parButton == buttonPrevious) {
            mc.displayGuiScreen(previousScreen);
        } else if (parButton == buttonAccept) {
            
            if(isRedeemable) {
                Set<Mission> missions = CompatibleMissionCapability.getMissions(player);
                for(Mission mission: missions) {
                    if(missionOffering.getId().equals(mission.getMissionOfferingId()) 
                            && mission.isCompleted(player) && !mission.isRedeemed()) {
                        mission.setRedeemed(player.world.getTotalWorldTime());
                    }
                }
                CompatibleMissionCapability.updateMissions(player, missions);
                // TODO: end of move this code to client redeem()
                
                modContext.getChannel().getChannel().sendToServer(
                        new AcceptMissionMessage(missionAssigner, missionOffering, AcceptMissionMessage.Action.REDEEM));
                
                mc.displayGuiScreen((GuiScreen) null);

            } else {
                CompatibleMissionCapability.updateMission(player, 
                        new Mission(missionOffering.getId(), (Entity)missionAssigner, 
                                mc.world.getTotalWorldTime(),
                                missionOffering.getMaxDuration(),
                                missionOffering.createGoals()));

                modContext.getChannel().getChannel().sendToServer(
                        new AcceptMissionMessage(missionAssigner, missionOffering, AcceptMissionMessage.Action.ASSIGN));
                mc.displayGuiScreen((GuiScreen) null);

            }
            
        } else if (parButton == buttonDecline) {
            mc.displayGuiScreen((GuiScreen) null);
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