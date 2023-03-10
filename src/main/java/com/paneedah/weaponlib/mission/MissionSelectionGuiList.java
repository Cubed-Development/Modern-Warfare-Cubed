package com.paneedah.weaponlib.mission;

import com.google.common.collect.Lists;
import com.paneedah.weaponlib.ModContext;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiListExtended;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

import javax.annotation.Nullable;
import java.util.Collection;
import java.util.List;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

@SideOnly(Side.CLIENT)
public class MissionSelectionGuiList extends GuiListExtended
{
    private final MissionSelectionGui missionSelection;
    private final List<MissionSelectionGuiListEntry> entries = Lists.<MissionSelectionGuiListEntry>newArrayList();
    private int selectedIdx = -1;
    private MissionAssigner missionAssigner;
    private EntityPlayer player;
    private ModContext modContext;
    
    private int selectionAreaWidth = 300;
    private int selectionAreaHeight = 200;

    public MissionSelectionGuiList(
            MissionAssigner missionAssigner, 
            EntityPlayer player, 
            ModContext modContext,
            MissionSelectionGui missionSelection, 
            Minecraft clientIn, 
            int width, 
            int height,
            int left,
            int top,
            int bottom, 
            int slotHeight)
    {
        super(clientIn, width, height, top, bottom, slotHeight);
        this.left = left;
        this.right = left + width;
        this.missionAssigner = missionAssigner;
        this.player = player;
        this.modContext = modContext;
        this.missionSelection = missionSelection;
        this.player = player;
        refreshList();
    }
    
    protected MissionSelectionGui getMissionSelection() {
        return missionSelection;
    }
    
    protected MissionAssigner getMissionAssigner() {
        return missionAssigner;
    }
    
    protected EntityPlayer getPlayer() {
        return player;
    }
    
    protected ModContext getModContext() {
        return modContext;
    }

    public void refreshList() {
                
        Collection<MissionOffering> availableMissionOfferings = Missions.getAvailableOfferings(missionAssigner, player);
        Collection<MissionOffering> redeemableMissionOfferings = Missions.getRedeemableMissionOfferings(missionAssigner, player);
        
        if(!redeemableMissionOfferings.isEmpty()) {
            for (MissionOffering missionOffering : redeemableMissionOfferings) {
                this.entries.add(new MissionSelectionGuiListEntry(this, missionOffering, true));
            }
        } else {
            for (MissionOffering missionOffering : availableMissionOfferings) {
                this.entries.add(new MissionSelectionGuiListEntry(this, missionOffering, false));
            }
        }
        
    }

    /**
     * Gets the IGuiListEntry object for the given index
     */
    public MissionSelectionGuiListEntry getListEntry(int index)
    {
        return this.entries.get(index);
    }

    protected int getSize()
    {
        return this.entries.size();
    }

    protected int getScrollBarX()
    {
        // TODO: introduce scroll bar right margin instead of hardcoded 5
        return this.left + this.width - 5; //super.getScrollBarX() + 15; // + 20;
    }

    /**
     * Gets the width of the list
     */
    public int getListWidth()
    {
        // TODO: introduce padding instead of hardcoded 25
        return this.width - 24; //super.getListWidth(); // + 50;
    }

    public void selectMission(int idx)
    {
        this.selectedIdx = idx;
        this.missionSelection.selectMission(this.getSelectedMission());
    }

    /**
     * Returns true if the element passed in is currently selected
     */
    protected boolean isSelected(int slotIndex)
    {
        return slotIndex == this.selectedIdx;
    }

    @Nullable
    public MissionSelectionGuiListEntry getSelectedMission()
    {
        return this.selectedIdx >= 0 && this.selectedIdx < this.getSize() ? this.getListEntry(this.selectedIdx) : null;
    }

    public MissionSelectionGui getMissionSelectionGui()
    {
        return this.missionSelection;
    }
    
    @Override
    protected void drawContainerBackground(Tessellator tessellator) {
    }
    
    @Override
    protected void overlayBackground(int startY, int endY, int startAlpha, int endAlpha) {
//        super.overlayBackground(startY, endY, startAlpha, endAlpha);
    }
    
    @Override
    public void drawScreen(int mouseXIn, int mouseYIn, float partialTicks) {
        
        
        if(!compatibility.isStencilEnabled(this.mc.getFramebuffer())) {
            compatibility.enableStencil(this.mc.getFramebuffer());
        }
        
        GL11.glEnable(GL11.GL_ALPHA_TEST);
        GL11.glEnable(GL11.GL_STENCIL_TEST);
        
        GL11.glPushAttrib(GL11.GL_ENABLE_BIT);
        
        GL11.glStencilFunc(GL11.GL_ALWAYS, 1, 0xFF);
        GL11.glStencilOp(GL11.GL_KEEP, GL11.GL_KEEP, GL11.GL_REPLACE);
        GL11.glStencilMask(0xFF);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GL11.glEnable(GL11.GL_BLEND);
//
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glColorMask(false, false, false, false);
        GL11.glDepthMask(false);
        GL11.glClear(GL11.GL_STENCIL_BUFFER_BIT); // Clear stencil buffer (0 by default)
        
        this.mc.renderEngine.bindTexture(new ResourceLocation("weaponlib", 
                "/com/paneedah/weaponlib/resources/rectangle-mask.png"));
        
        Gui.drawModalRectWithCustomSizedTexture(
                this.left, 
                this.top, 
                0, // u
                0, // v
                this.width, // width
                this.height + 2, //this.height, // height
                selectionAreaWidth, 
                selectionAreaHeight);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);


        GL11.glPushAttrib(GL11.GL_ENABLE_BIT);
        
        GL11.glStencilFunc(GL11.GL_EQUAL, 1, 0xFF);
        GL11.glStencilMask(0x00);
        GL11.glDepthMask(true);
        GL11.glColorMask(true, true, true, true);

        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(GL11.GL_LIGHTING);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GL11.glEnable(GL11.GL_BLEND);
        
        drawUnclippedScreen(mouseXIn, mouseYIn, partialTicks);
        GL11.glPopAttrib();
        
        GL11.glPopAttrib();
        
        GL11.glDisable(GL11.GL_ALPHA_TEST);
        GL11.glDisable(GL11.GL_STENCIL_TEST);
    }

    protected void drawUnclippedScreen(int mouseXIn, int mouseYIn, float partialTicks) {
        if (this.visible)
        {
            this.mouseX = mouseXIn;
            this.mouseY = mouseYIn;
            this.drawBackground();

            int i = this.getScrollBarX();
            int j = i + 6;
            this.bindAmountScrolled();
            GlStateManager.disableLighting();
            GlStateManager.disableFog();
            Tessellator tessellator = Tessellator.getInstance();
            BufferBuilder bufferbuilder = tessellator.getBuffer();

            int insideLeft = this.left + ((this.width - this.getListWidth()) >> 1);
            int l = this.top + 4 - (int)this.amountScrolled;

            if (this.hasListHeader)
            {
                this.drawListHeader(insideLeft, l, tessellator);
            }

            drawSelectionBox(insideLeft, l, mouseXIn, mouseYIn, partialTicks);
            GlStateManager.disableDepth();
//            this.overlayBackground(0, this.top, 255, 255);
//            this.overlayBackground(this.bottom, this.height, 255, 255);
            GlStateManager.enableBlend();
            GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ZERO, GlStateManager.DestFactor.ONE);
            GlStateManager.disableAlpha();
            GlStateManager.shadeModel(7425);
            GlStateManager.disableTexture2D();
            
            int j1 = this.getMaxScroll();

            if (j1 > 0)
            {
                int k1 = (this.bottom - this.top) * (this.bottom - this.top) / this.getContentHeight();
                k1 = MathHelper.clamp(k1, 32, this.bottom - this.top - 8);
                int l1 = (int)this.amountScrolled * (this.bottom - this.top - k1) / j1 + this.top;

                if (l1 < this.top)
                {
                    l1 = this.top;
                }

                bufferbuilder.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
                bufferbuilder.pos((double)i, (double)this.bottom, 0.0D).tex(0.0D, 1.0D).color(0, 0, 0, 255).endVertex();
                bufferbuilder.pos((double)j, (double)this.bottom, 0.0D).tex(1.0D, 1.0D).color(0, 0, 0, 255).endVertex();
                bufferbuilder.pos((double)j, (double)this.top, 0.0D).tex(1.0D, 0.0D).color(0, 0, 0, 255).endVertex();
                bufferbuilder.pos((double)i, (double)this.top, 0.0D).tex(0.0D, 0.0D).color(0, 0, 0, 255).endVertex();
                tessellator.draw();
                bufferbuilder.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
                bufferbuilder.pos((double)i, (double)(l1 + k1), 0.0D).tex(0.0D, 1.0D).color(128, 128, 128, 255).endVertex();
                bufferbuilder.pos((double)j, (double)(l1 + k1), 0.0D).tex(1.0D, 1.0D).color(128, 128, 128, 255).endVertex();
                bufferbuilder.pos((double)j, (double)l1, 0.0D).tex(1.0D, 0.0D).color(128, 128, 128, 255).endVertex();
                bufferbuilder.pos((double)i, (double)l1, 0.0D).tex(0.0D, 0.0D).color(128, 128, 128, 255).endVertex();
                tessellator.draw();
                bufferbuilder.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
                bufferbuilder.pos((double)i, (double)(l1 + k1 - 1), 0.0D).tex(0.0D, 1.0D).color(192, 192, 192, 255).endVertex();
                bufferbuilder.pos((double)(j - 1), (double)(l1 + k1 - 1), 0.0D).tex(1.0D, 1.0D).color(192, 192, 192, 255).endVertex();
                bufferbuilder.pos((double)(j - 1), (double)l1, 0.0D).tex(1.0D, 0.0D).color(192, 192, 192, 255).endVertex();
                bufferbuilder.pos((double)i, (double)l1, 0.0D).tex(0.0D, 0.0D).color(192, 192, 192, 255).endVertex();
                tessellator.draw();
            }

            this.renderDecorations(mouseXIn, mouseYIn);
            GlStateManager.enableTexture2D();
            GlStateManager.shadeModel(7424);
            GlStateManager.enableAlpha();
            GlStateManager.disableBlend();
        }
    }
    
    @Override
    protected void drawSelectionBox(int offsetX, int offsetY, int mouseXIn, int mouseYIn, float partialTicks)
    {
//        super.drawSelectionBox(insideLeft, insideTop, mouseXIn, mouseYIn, partialTicks);
        int i = this.getSize();
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferbuilder = tessellator.getBuffer();

        for (int slotIndex = 0; slotIndex < i; ++slotIndex)
        {
            int vPadding = 1;
            int slotY = offsetY + slotIndex * this.slotHeight + vPadding; //this.headerPadding;
            int slotH = this.slotHeight - vPadding * 2; // - 4;

            if (slotY > this.bottom || slotY + slotH < this.top)
            {
                this.updateItemPos(slotIndex, offsetX, slotY, partialTicks);
            }

            if (this.showSelectionBox && this.isSelected(slotIndex))
            {
                // TODO: move this outline rendering to the MissionSelectionGuiListEntry
                // TODO: after move, introduce selection box texture
                int selectionBoxLeft = this.left + (this.width / 2 - this.getListWidth() / 2);
                int selectionBoxRight = this.left + this.width / 2 + this.getListWidth() / 2;
//                int j1 = this.getScrollBarX() - 10;
                GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
                GlStateManager.disableTexture2D();
                bufferbuilder.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
                int selectionVPadding = 1; //2;
                bufferbuilder.pos((double)selectionBoxLeft, (double)(slotY + slotH + selectionVPadding * 2), 0.0D).tex(0.0D, 1.0D).color(128, 128, 128, 255).endVertex();
                bufferbuilder.pos((double)selectionBoxRight, (double)(slotY + slotH + selectionVPadding * 2), 0.0D).tex(1.0D, 1.0D).color(128, 128, 128, 255).endVertex();
                bufferbuilder.pos((double)selectionBoxRight, (double)(slotY - selectionVPadding * 2), 0.0D).tex(1.0D, 0.0D).color(128, 128, 128, 255).endVertex();
                bufferbuilder.pos((double)selectionBoxLeft, (double)(slotY - selectionVPadding * 2), 0.0D).tex(0.0D, 0.0D).color(128, 128, 128, 255).endVertex();
                bufferbuilder.pos((double)(selectionBoxLeft + 1), (double)(slotY + slotH + selectionVPadding ), 0.0D).tex(0.0D, 1.0D).color(0, 0, 0, 255).endVertex();
                bufferbuilder.pos((double)(selectionBoxRight - 1), (double)(slotY + slotH + selectionVPadding), 0.0D).tex(1.0D, 1.0D).color(0, 0, 0, 255).endVertex();
                bufferbuilder.pos((double)(selectionBoxRight - 1), (double)(slotY - selectionVPadding), 0.0D).tex(1.0D, 0.0D).color(0, 0, 0, 255).endVertex();
                bufferbuilder.pos((double)(selectionBoxLeft + 1), (double)(slotY - selectionVPadding), 0.0D).tex(0.0D, 0.0D).color(0, 0, 0, 255).endVertex();
                tessellator.draw();
                GlStateManager.enableTexture2D();
            }

            this.drawSlot(slotIndex, offsetX, slotY, slotH, mouseXIn, mouseYIn, partialTicks);
        }
    }
    
    @Override
    protected void drawSlot(int slotIndex, int x, int y, int slotHeight, int mouseX,
            int mouseY, float partialTicks) {
        
        // TODO: adjust list width based on the scroll bar position
        getListEntry(slotIndex).drawEntry(slotIndex, x, y, this.getListWidth(), slotHeight, 
                mouseX, mouseY, 
                this.isMouseYWithinSlotBounds(mouseY) && this.getSlotIndexFromScreenCoords(mouseX, mouseY) == slotIndex, 
                partialTicks);
    }
}