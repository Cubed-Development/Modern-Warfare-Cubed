package com.paneedah.mwc.gui;

import com.paneedah.mwc.instancing.PlayerWeaponInstance;
import com.paneedah.mwc.instancing.Tags;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.AnimationModeProcessor;
import com.paneedah.weaponlib.animation.gui.AnimationGUI;
import com.paneedah.weaponlib.config.BalancePackManager;
import com.paneedah.weaponlib.config.ModernConfigManager;
import com.paneedah.weaponlib.debug.DebugRenderer;
import com.paneedah.weaponlib.electronics.ItemHandheld;
import com.paneedah.weaponlib.jim.util.LangTools;
import com.paneedah.weaponlib.render.ModificationGUI;
import com.paneedah.weaponlib.render.gui.GUIRenderHelper;
import com.paneedah.weaponlib.vehicle.EntityVehicle;
import com.paneedah.weaponlib.vehicle.VehicleCustomGUI;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;

import static com.paneedah.mwc.MWC.modContext;
import static com.paneedah.mwc.ProjectConstants.ID;
import static com.paneedah.mwc.proxies.ClientProxy.MC;
import static com.paneedah.weaponlib.render.gui.ColorPalette.BRIGHT_YARROW;
import static com.paneedah.weaponlib.render.gui.ColorPalette.POMEGRANATE;
import static com.paneedah.weaponlib.render.gui.ColorPalette.WHITE;
import static net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType.*;

public final class HUD extends Gui {

    // Ammunition Counter

    private static final byte AMMO_TOTAL_STRING_SCALE = 3;
    private static final byte CURRENT_AMMO_WIDTH_MULTIPLIER = 2;

    private static final short CURRENT_AMMO_COUNT_STRING_X_OFFSET = 64;
    private static final short TOTAL_AMMO_COUNT_STRING_X_OFFSET = 84;

    private static final float TOTAL_AMMO_STRING_SCALE = 6.625F;
    private static final float CURRENT_AMMO_STRING_Y_OFFSET = 5.5F;
    private static final float CURRENT_AMMO_STRING_SCALE = 3.5F;

    // Ammunition Counter Background

    private static final short AMMUNITION_COUNTER_BACKGROUND_WIDTH = 256;
    private static final short AMMUNITION_COUNTER_BACKGROUND_HEIGHT = 52;
    private static final short AMMUNITION_COUNTER_BACKGROUND_X = 256;
    private static final short AMMUNITION_COUNTER_BACKGROUND_Y = 128;

    // Ammunition Counter Disabled String

    private static final byte DISABLED_STRING_SCALE = 3;

    private static final short DISABLED_STRING_X_OFFSET = 100;
    private static final short DISABLED_STRING_Y_OFFSET = 13;


    // Ammunition Counter Weapon Name

    private static final byte AMMUNITION_COUNTER_WEAPON_NAME_SCALE = 2;

    private static final short AMMUNITION_COUNTER_WEAPON_NAME_DOWNSCALE_THRESHOLD = 13;
    private static final short AMMUNITION_COUNTER_WEAPON_NAME_X_OFFSET = 126;

    private static final float AMMUNITION_COUNTER_WEAPON_NAME_DOWNSCALE_MULTIPLIER = 8.5F;

    // Ammunition Counter Fire Mode Indicator

    private static final byte FIRE_MODE_KEY_SCALE = 2;

    private static final short FIRE_MODE_INDICATOR_U_OFFSET = 139;
    private static final short FIRE_MODE_INDICATOR_U_WIDTH = 39;
    private static final short FIRE_MODE_INDICATOR_V_OFFSET = 53;
    private static final short FIRE_MODE_INDICATOR_V_HEIGHT = 28;
    private static final short FIRE_MODE_INDICATOR_X_OFFSET = 113;
    private static final short FIRE_MODE_INDICATOR_Y_OFFSET = 60;
    private static final short FIRE_MODE_KEY_Y_STRING_OFFSET = 30;

    private static final float FIRE_MODE_INDICATOR_SCALE = 0.70F;
    private static final float FIRE_MODE_INDICATOR_OFFSET_MULTIPLIER = 2.1F;

    // Open Door

    private static final short OPEN_DOOR_KEY_Y_OFFSET = 10;
    private static final short OPENDOOR_REACH_OVERLAY_DISTANCE = 5;

    // X-pos = scaled_width * width%
    // Y-pos = scaled_height * height%
    private static final double OPEN_DOOR_PERCENT_WIDTH_POS = 0.4;
    private static final double OPEN_DOOR_PERCENT_HEIGHT_POS = 0.6;

    public static final VehicleCustomGUI VEHICLE_GUI_OVERLAY = new VehicleCustomGUI();
    private static final ResourceLocation AMMUNITION_COUNTER_TEXTURES = new ResourceLocation(ID, "textures/gui/hud.png");

    private boolean playerLookingAtDoor;

    private long lastDoorUpdateTimestamp;

    @SubscribeEvent
    public void onRenderGameOverlay(final RenderGameOverlayEvent.Pre renderGameOverlayEvent) {
        if (MC.fontRenderer == null || MC.player.isSpectator())
            return;

        handleCrosshair(renderGameOverlayEvent);

        handleHelmetHUD(renderGameOverlayEvent);
        handleVehicleHUD(renderGameOverlayEvent);
        handleAnimationModeHUD(renderGameOverlayEvent);
        handleAmmunitionCounterHUD(renderGameOverlayEvent);

        final PlayerWeaponInstance weaponInstance = modContext.getMainHeldWeapon();

        if (weaponInstance == null)
            return;

        handleOpenDoorHUD(renderGameOverlayEvent);

        if (renderGameOverlayEvent.getType() == HOTBAR && (isInAltModifyingState(weaponInstance) || isInModifyingState(weaponInstance)))
            ModificationGUI.getInstance().render(modContext);
    }

    // region Helmet HUD

    private void handleHelmetHUD(final RenderGameOverlayEvent.Pre renderGameOverlayEvent) {
        if (renderGameOverlayEvent.getType() != HELMET)
            return;

        final ItemStack helmetStack = MC.player.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
        if (MC.gameSettings.thirdPersonView != 0 || !(helmetStack.getItem() instanceof CustomArmor))
            return;

        // Texture must be Width: 427, Height: 240
        final String hudTexture = ((CustomArmor) helmetStack.getItem()).getHudTexture();
        if (hudTexture == null)
            return;

        final ScaledResolution scaledResolution = renderGameOverlayEvent.getResolution();
        final int screenWidth = scaledResolution.getScaledWidth();
        final int screenHeight = scaledResolution.getScaledHeight();

        GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);

        GL11.glColor4f(1, 1, 1, 1);
        GL11.glDisable(GL11.GL_LIGHTING);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GL11.glEnable(GL11.GL_BLEND);

        MC.renderEngine.bindTexture(new ResourceLocation(hudTexture));
        drawFullScreenQuad(screenWidth, screenHeight);

        GL11.glPopAttrib();
    }

    private static void drawFullScreenQuad(final double width, final double height) {
        final Tessellator tessellator = Tessellator.getInstance();
        final BufferBuilder buffer = tessellator.getBuffer();

        buffer.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX);

        buffer.pos(0, 0 + height, -1024).tex(0, 1).endVertex();
        buffer.pos(0 + width, 0 + height, -1024).tex(1, 1).endVertex();
        buffer.pos(0 + width, 0, -1024).tex(1, 0).endVertex();
        buffer.pos(0, 0, -1024).tex(0, 0).endVertex();

        tessellator.draw();
    }

    // endregion

    // region Vehicle HUD

    private void handleVehicleHUD(final RenderGameOverlayEvent.Pre renderGameOverlayEvent) {
        final ElementType eventType = renderGameOverlayEvent.getType();

        if (!MC.player.isRiding() || !(MC.player.getRidingEntity() instanceof EntityVehicle))
            return;

        final EntityVehicle entityVehicle = (EntityVehicle) MC.player.getRidingEntity();

        if (!Double.isNaN(entityVehicle.getSolver().getVelocityVector().lengthSquared()) && entityVehicle.getSolver().getVelocityVector().lengthSquared() != 0 &&
                (eventType == CROSSHAIRS || eventType == HOTBAR || eventType == HEALTH || eventType == EXPERIENCE || eventType == ARMOR)) {
            renderGameOverlayEvent.setCanceled(true);
        }

        if (eventType != HOTBAR)
            return;

        VEHICLE_GUI_OVERLAY.renderGUI(entityVehicle);
    }

    // endregion

    // region Animation Mode HUD

    private void handleAnimationModeHUD(final RenderGameOverlayEvent.Pre renderGameOverlayEvent) {
        if (!AnimationModeProcessor.getInstance().getFPSMode())
            return;

        renderGameOverlayEvent.setCanceled(true);

        GlStateManager.disableTexture2D();

        final AnimationGUI animationGUI = AnimationGUI.getInstance();

        animationGUI.render();

        if (!animationGUI.titleSafe.isState())
            return;

        DebugRenderer.setupBasicRender();
        final ScaledResolution scaledResolution = renderGameOverlayEvent.getResolution();
        DebugRenderer.renderPoint(new Vec3d(scaledResolution.getScaledWidth_double() / 2, scaledResolution.getScaledHeight_double() / 2, 0), new Vec3d(1, 0, 0));
        DebugRenderer.destructBasicRender();
    }

    // endregion

    // region Ammunition Counter HUD

    private void handleAmmunitionCounterHUD(final RenderGameOverlayEvent.Pre renderGameOverlayEvent) {
        if (!ModernConfigManager.enableAmmoCounter || renderGameOverlayEvent.getType() != HOTBAR)
            return;

        final ItemStack itemStack = MC.player.getHeldItemMainhand();
        final Item item = itemStack.getItem();

        if (!(item instanceof ItemMagazine) && !(item instanceof Weapon))
            return;

        final PlayerWeaponInstance weaponInstance = modContext.getMainHeldWeapon();
        if (isInAltModifyingState(weaponInstance) || isInModifyingState(weaponInstance))
            return;

        final ScaledResolution scaledResolution = renderGameOverlayEvent.getResolution();
        final int width = scaledResolution.getScaledWidth();
        final int height = scaledResolution.getScaledHeight();

        GlStateManager.enableBlend();

        GlStateManager.pushMatrix();

        final double size = ModernConfigManager.ammunitionCounterSize;
        final int x = AMMUNITION_COUNTER_BACKGROUND_X + ModernConfigManager.ammunitionCounterOffsetX;
        final int y = AMMUNITION_COUNTER_BACKGROUND_Y + ModernConfigManager.ammunitionCounterOffsetY;

        GlStateManager.translate((width - x * size), (height - y * size), 0);
        GlStateManager.scale(size, size, size);

        MC.getTextureManager().bindTexture(AMMUNITION_COUNTER_TEXTURES);

        if (ModernConfigManager.enableAmmoCounterBackground)
            drawTexturedModalRect(0, 0, 0, 0, AMMUNITION_COUNTER_BACKGROUND_WIDTH, AMMUNITION_COUNTER_BACKGROUND_HEIGHT);

        String totalCapacityString, currentAmmoString;
        int fireMode; // ! FIRE_MODE TODO: Once it's an enum, this can become much simpler - Luna Mira Lage (Desoroxxx) 2024-11-25
        int totalCapacity = 0;
        int currentAmmo = 0;

        if (item instanceof ItemMagazine) {
            totalCapacity = ((ItemMagazine) item).getCapacity();
            currentAmmo = Tags.getAmmo(itemStack);
        } else if (item instanceof Weapon) {
            final ItemMagazine itemMagazine = (ItemMagazine) WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.MAGAZINE, weaponInstance);

            // ! FIRE_MODE TODO: Once it's an enum, this can become much simpler - Luna Mira Lage (Desoroxxx) 2024-11-25
            switch (weaponInstance.getMaxShots()) {
                case Integer.MAX_VALUE:
                    fireMode = Weapon.FIRE_MODE_AUTO;
                    break;
                case 1:
                    fireMode = Weapon.FIRE_MODE_SINGLE;
                    break;
                default:
                    fireMode = Weapon.FIRE_MODE_BURST;
                    break;
            }

            totalCapacity = itemMagazine != null ? itemMagazine.getCapacity() : weaponInstance.getWeapon().getAmmoCapacity();
            currentAmmo = weaponInstance.getAmmo();

            final String fireModeKeyName = encaseInBrackets(KeyBindings.fireModeKey.getDisplayName());
            final double fireModeKeyNameOffset = MC.fontRenderer.getStringWidth(fireModeKeyName);

            GlStateManager.pushMatrix();

            GlStateManager.translate((-fireModeKeyNameOffset + FIRE_MODE_INDICATOR_X_OFFSET) + (-fireModeKeyNameOffset + (FIRE_MODE_INDICATOR_U_WIDTH * FIRE_MODE_INDICATOR_OFFSET_MULTIPLIER)), FIRE_MODE_INDICATOR_Y_OFFSET, 0);
            GlStateManager.scale(FIRE_MODE_INDICATOR_SCALE, FIRE_MODE_INDICATOR_SCALE, FIRE_MODE_INDICATOR_SCALE);

            GlStateManager.enableBlend();

            drawTexturedModalRect(0, 0, FIRE_MODE_INDICATOR_U_OFFSET + (FIRE_MODE_INDICATOR_U_WIDTH * fireMode), FIRE_MODE_INDICATOR_V_OFFSET, FIRE_MODE_INDICATOR_U_WIDTH, FIRE_MODE_INDICATOR_V_HEIGHT);

            GlStateManager.popMatrix();

            if (((Weapon) item).builder.getMaxShots().size() > 1)
                drawScaledString(fireModeKeyName, -fireModeKeyNameOffset + FIRE_MODE_INDICATOR_X_OFFSET, FIRE_MODE_KEY_Y_STRING_OFFSET, FIRE_MODE_KEY_SCALE, BRIGHT_YARROW);
        }

        if (totalCapacity == 0) {
            totalCapacityString = "-";
            currentAmmoString = "-";
        } else {
            totalCapacityString = String.valueOf(totalCapacity);
            currentAmmoString = String.valueOf((currentAmmo == 0 && item instanceof Weapon ? "-" : currentAmmo));
        }

        final String weaponName = new TextComponentTranslation(LangTools.formatName(item.getTranslationKey())).getFormattedText();
        final String ammunitionCount = String.format("  %s  | %s%s", TextFormatting.GRAY, TextFormatting.WHITE, totalCapacityString);

        double totalLength = 0;
        if (ammunitionCount.length() > AMMUNITION_COUNTER_WEAPON_NAME_DOWNSCALE_THRESHOLD) {
            final int adjLength = ammunitionCount.length() - AMMUNITION_COUNTER_WEAPON_NAME_DOWNSCALE_THRESHOLD;
            totalLength = adjLength * AMMUNITION_COUNTER_WEAPON_NAME_DOWNSCALE_MULTIPLIER;
        }

        drawScaledString(weaponName, AMMUNITION_COUNTER_WEAPON_NAME_X_OFFSET - MC.fontRenderer.getStringWidth(weaponName), -MC.fontRenderer.FONT_HEIGHT, AMMUNITION_COUNTER_WEAPON_NAME_SCALE, BRIGHT_YARROW);

        if (item instanceof Weapon && BalancePackManager.isWeaponDisabled((Weapon) item)) {
            GUIRenderHelper.drawScaledString("Disabled", DISABLED_STRING_X_OFFSET - totalLength, DISABLED_STRING_Y_OFFSET, DISABLED_STRING_SCALE, POMEGRANATE);
        } else {
            drawScaledString(weaponName, AMMUNITION_COUNTER_WEAPON_NAME_X_OFFSET - MC.fontRenderer.getStringWidth(weaponName), -MC.fontRenderer.FONT_HEIGHT, AMMUNITION_COUNTER_WEAPON_NAME_SCALE, BRIGHT_YARROW);
            drawScaledString(currentAmmoString, TOTAL_AMMO_COUNT_STRING_X_OFFSET - MC.fontRenderer.getStringWidth(currentAmmoString) * CURRENT_AMMO_WIDTH_MULTIPLIER, CURRENT_AMMO_STRING_Y_OFFSET, CURRENT_AMMO_STRING_SCALE, BRIGHT_YARROW);
            drawScaledString(ammunitionCount, CURRENT_AMMO_COUNT_STRING_X_OFFSET, TOTAL_AMMO_STRING_SCALE, AMMO_TOTAL_STRING_SCALE, WHITE);
        }

        GlStateManager.popMatrix();
    }

    private void drawScaledString(final String string, final double x, final double y, final double scale, final int color) {
        GlStateManager.pushMatrix();

        GlStateManager.translate(x, y, 0);
        GlStateManager.scale(scale, scale, scale);

        MC.fontRenderer.drawStringWithShadow(string, (float) (x / scale), (float) (y / scale), color);

        GlStateManager.popMatrix();
    }

    // endregion

    // region Open Door HUD

    private void handleOpenDoorHUD(final RenderGameOverlayEvent.Pre renderGameOverlayEvent) {
        if (!ModernConfigManager.enableOpenDoorDisplay || !isPlayerTargetingDoor() || renderGameOverlayEvent.getType() != HOTBAR)
            return;

        final ScaledResolution scaledResolution = renderGameOverlayEvent.getResolution();

        final int openDoorX = (int) (scaledResolution.getScaledWidth_double() * OPEN_DOOR_PERCENT_WIDTH_POS);
        final int openDoorY = (int) (scaledResolution.getScaledHeight_double() * OPEN_DOOR_PERCENT_HEIGHT_POS);

        drawCenteredString(MC.fontRenderer, encaseInBrackets(KeyBindings.openDoor.getDisplayName()), openDoorX, openDoorY, BRIGHT_YARROW);
        drawCenteredString(MC.fontRenderer, LangTools.formatName("overlay.opendoor"), openDoorX, openDoorY + OPEN_DOOR_KEY_Y_OFFSET, WHITE);
    }

    private boolean isPlayerTargetingDoor() {
        if ((System.currentTimeMillis() - lastDoorUpdateTimestamp) <= 128)
            return playerLookingAtDoor;

        final EntityPlayer player = MC.player;

        final Vec3d origin = player.getPositionVector().add(0, player.getEyeHeight(), 0);

        final RayTraceResult rayTraceResult = player.world.rayTraceBlocks(origin, origin.add(player.getLookVec().scale(OPENDOOR_REACH_OVERLAY_DISTANCE)), false, true, false);
        if (rayTraceResult != null) {
            final IBlockState state = player.world.getBlockState(rayTraceResult.getBlockPos());
            playerLookingAtDoor = state.getBlock() instanceof BlockDoor;
        } else {
            playerLookingAtDoor = false;
        }

        lastDoorUpdateTimestamp = System.currentTimeMillis();

        return playerLookingAtDoor;
    }

    // endregion

    private void handleCrosshair(final RenderGameOverlayEvent.Pre renderGameOverlayEvent) {
        if (renderGameOverlayEvent.getType() != CROSSHAIRS)
            return;

        final Item heldItem = MC.player.getHeldItemMainhand().getItem();
        if (!(heldItem instanceof Weapon) && !(heldItem instanceof ItemHandheld))
            return;

        renderGameOverlayEvent.setCanceled(true);
    }

    private static String encaseInBrackets(final String string) {
        return "[" + string + "]";
    }

    public static boolean isInModifyingState(final PlayerWeaponInstance weaponInstance) {
        return (weaponInstance.getState() == WeaponState.MODIFYING && !weaponInstance.isAltModificationModeEnabled())
                || weaponInstance.getState() == WeaponState.MODIFYING_REQUESTED
                || weaponInstance.getState() == WeaponState.NEXT_ATTACHMENT
                || weaponInstance.getState() == WeaponState.NEXT_ATTACHMENT_REQUESTED;
    }

    public static boolean isInAltModifyingState(final PlayerWeaponInstance weaponInstance) {
        return weaponInstance.isAltModificationModeEnabled() &&
                (weaponInstance.getState() == WeaponState.MODIFYING
                        || weaponInstance.getState() == WeaponState.MODIFYING_REQUESTED
                        || weaponInstance.getState() == WeaponState.NEXT_ATTACHMENT
                        || weaponInstance.getState() == WeaponState.NEXT_ATTACHMENT_REQUESTED);
    }
}
