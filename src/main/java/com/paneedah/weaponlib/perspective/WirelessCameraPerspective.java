package com.paneedah.weaponlib.perspective;

import com.paneedah.weaponlib.PlayerItemInstance;
import com.paneedah.weaponlib.electronics.PlayerTabletInstance;
import com.paneedah.weaponlib.electronics.SignalQuality;
import com.paneedah.weaponlib.tracking.LivingEntityTracker;
import com.paneedah.weaponlib.tracking.TrackableEntity;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.FMLClientHandler;
import org.lwjgl.opengl.GL11;

import java.util.Random;

import static com.paneedah.mwc.proxies.ClientProxy.MC;
import static com.paneedah.mwc.ProjectConstants.LOGGER;

public class WirelessCameraPerspective extends RemoteFirstPersonPerspective {

    private static final String STATIC_TEXTURE = "weaponlib:/com/paneedah/weaponlib/resources/static.png";
    public static final String DARK_SCREEN_TEXTURE = "weaponlib:/com/paneedah/weaponlib/resources/dark-screen.png";


    private static final int STATIC_IMAGES_PER_ROW = 8;

    private int tickCounter;
    private int activeWatchIndex;
    private int badSignalTickCounter;

    private final Random random = new Random();

    private int totalTrackableEntities;

    private String displayName;

    private Float batteryLevel;

    @Override
    protected void updateWatchablePlayer() {


        EntityPlayer entityPlayer = MC.player;
        PlayerItemInstance<?> instance = modContext.getPlayerItemInstanceRegistry()
                .getMainHandItemInstance(entityPlayer);

        if (!(instance instanceof PlayerTabletInstance)) {
            return;
        }

        PlayerTabletInstance tabletInstance = (PlayerTabletInstance) instance;

        LivingEntityTracker playerEntityTracker = LivingEntityTracker.getTracker(entityPlayer);

        if (playerEntityTracker == null) {
            return;
        }

        activeWatchIndex = tabletInstance.getActiveWatchIndex();
        totalTrackableEntities = playerEntityTracker.getTrackableEntitites().size();
        TrackableEntity te = totalTrackableEntities > 0 ? playerEntityTracker.getTrackableEntity(activeWatchIndex) : null;

        Entity watchableEntity = null;
        if (te == null) {
            displayName = "";
            batteryLevel = null;
        } else {
            displayName = te.getDisplayName();
            watchableEntity = te.getEntity();
            batteryLevel = Float.valueOf(1f - ((float) (entityPlayer.world.getWorldTime()
                    - te.getStartTimestamp()) / te.getTrackingDuration()));
            if (batteryLevel.floatValue() > 1f) {
                batteryLevel = Float.valueOf(1f);
            } else if (batteryLevel.floatValue() < 0f) {
                batteryLevel = Float.valueOf(0f);
            }
        }

        Entity realEntity = watchableEntity == null ? null : watchableEntity.world
                .getEntityByID(watchableEntity.getEntityId());
        if (realEntity != null && realEntity != watchableEntity) {
            watchableEntity = realEntity;
        }

        if (tickCounter++ % 50 == 0) {
            LOGGER.trace("Using entity tracker {}", playerEntityTracker);
            if (watchableEntity != null) {
                LOGGER.debug("Watching {} with uuid {}, distance: {}  ", watchableEntity, watchableEntity.getUniqueID(), Double.valueOf(Math.sqrt(Math.pow(watchableEntity.posX - FMLClientHandler.instance().getClientPlayerEntity().posX, 2) + Math.pow(watchableEntity.posZ - FMLClientHandler.instance().getClientPlayerEntity().posZ, 2))));
            }
        }


        if (watchableEntity == null || watchableEntity instanceof EntityLivingBase) {
            watchablePlayer.setEntityLiving((EntityLivingBase) watchableEntity);
        }
    }

    @Override
    protected void renderOverlay() {


        super.renderOverlay();
        framebuffer.bindFramebuffer(true);
        int maxDistance = 120;
        int displayCameraIndex = activeWatchIndex + 1;
        String message = "Cam " + displayCameraIndex + "/" + totalTrackableEntities + ": " + displayName;
        EntityLivingBase watchableEntity = watchablePlayer.getEntityLiving();
        int color = 0xFFFF00;
        if (watchableEntity != null) {
            EntityPlayer origPlayer = MC.player;
            //origPlayer.getDistanceToEntity(watchableEntity);
            double distance = Math.pow(watchableEntity.posX - origPlayer.posX, 2)
                    + Math.pow(watchableEntity.posY - origPlayer.posY, 2)
                    + Math.pow(watchableEntity.posZ - origPlayer.posZ, 2);
            SignalQuality quality = SignalQuality.getQuality((int) Math.sqrt(distance), maxDistance);
            if (watchableEntity.isDead || quality.isInterrupted() || (badSignalTickCounter > 0 && badSignalTickCounter < 5) || watchableEntity.isDead) {
                if (badSignalTickCounter == 0) {
                    framebuffer.framebufferClear();
                    framebuffer.bindFramebuffer(true);
                }

                message = "Cam " + displayCameraIndex + "/" + totalTrackableEntities + ": no signal";
                drawStatic();
                badSignalTickCounter++;
            }
            if (badSignalTickCounter == 5) {
                badSignalTickCounter = 0;
            }
        } else if (totalTrackableEntities == 0) {
            framebuffer.framebufferClear();
            framebuffer.bindFramebuffer(true);
            MC.getTextureManager().bindTexture(new ResourceLocation(DARK_SCREEN_TEXTURE));
            drawTexturedQuadFit(0, 0, width, height, 0);
            color = 0xFF0000;
            message = "No Cameras Available";
        } else {
            framebuffer.framebufferClear();
            framebuffer.bindFramebuffer(true);
            message = "Cam " + displayCameraIndex + "/" + totalTrackableEntities + ": " + displayName;
            drawStatic();
        }

        FontRenderer fontRender = MC.fontRenderer;

        float scale = 2f;
        GL11.glScalef(scale, scale, scale);

        fontRender.drawString(message, (int) (40f / scale), (int) ((height - 30) / scale), color, false);

        if (totalTrackableEntities > 0 && batteryLevel != null) {
            fontRender.drawString("Battery: " + (int) (batteryLevel.floatValue() * 100) + "%", (int) ((width - 150f) / scale), (int) ((height - 30) / scale), color, false);
        }
    }

    public void drawStatic() {

        MC.getTextureManager().bindTexture(new ResourceLocation(STATIC_TEXTURE));

        int imageIndex = random.nextInt(STATIC_IMAGES_PER_ROW);

        /*
         *  (cU, cV)   (bU, bV)
         *
         *  (dU, dV)   (aU, aV)
         *
         */
        float uWidth = 1f / STATIC_IMAGES_PER_ROW;

        float aU = (imageIndex + 1) * uWidth; // imageIndex = 0, imagesPerRow = 2, aU = 0.5; imageIndex = 1, aU = 1
        // imagesPerRow = 4; imageIndex = 1; aU = 2/4 = 0.5
        float aV = 1f;

        float bU = (imageIndex + 1) * uWidth;
        float bV = 0f;

        float cU = imageIndex * uWidth; // imageIndex = 0, imagesPerRow = 2, cU = 0; imageIndex = 1, cU = 0.5
        float cV = 0f;

        float dU = imageIndex * uWidth;
        float dV = 1f;

        double x = 0;
        double y = 0;
        double width = this.width;
        double height = this.height;
        double zLevel = 0;

        final Tessellator tessellator = Tessellator.getInstance();
        final BufferBuilder buffer = tessellator.getBuffer();

        buffer.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX);

        buffer.pos(x + 0, y + height, zLevel).tex(aU, aV).endVertex();
        buffer.pos(x + width, y + height, zLevel).tex(bU, bV).endVertex();
        buffer.pos(x + width, y + 0, zLevel).tex(cU, cV).endVertex();
        buffer.pos(x + 0, y + 0, zLevel).tex(dU, dV).endVertex();

        tessellator.draw();
    }

    private static void drawTexturedQuadFit(double x, double y, double width, double height, double zLevel) {
        final Tessellator tessellator = Tessellator.getInstance();
        final BufferBuilder buffer = tessellator.getBuffer();

        buffer.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX);

        buffer.pos(x + 0, y + height, zLevel).tex(0, 1).endVertex();
        buffer.pos(x + width, y + height, zLevel).tex(1, 1).endVertex();
        buffer.pos(x + width, y + 0, zLevel).tex(1, 0).endVertex();
        buffer.pos(x + 0, y + 0, zLevel).tex(0, 0).endVertex();

        tessellator.draw();
    }
}
