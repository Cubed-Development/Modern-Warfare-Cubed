package com.paneedah.weaponlib;

import com.paneedah.weaponlib.animation.AnimationModeProcessor;
import com.paneedah.weaponlib.animation.gui.AnimationGUI;
import com.paneedah.weaponlib.config.BalancePackManager;
import com.paneedah.weaponlib.config.ModernConfigManager;
import com.paneedah.weaponlib.debug.DebugRenderer;
import com.paneedah.weaponlib.jim.util.LangTools;
import com.paneedah.weaponlib.render.ModificationGUI;
import com.paneedah.weaponlib.render.gui.ColorPalette;
import com.paneedah.weaponlib.render.gui.GUIRenderHelper;
import com.paneedah.weaponlib.vehicle.EntityVehicle;
import com.paneedah.weaponlib.vehicle.VehicleCustomGUI;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.GlStateManager.DestFactor;
import net.minecraft.client.renderer.GlStateManager.SourceFactor;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;

import static com.paneedah.mwc.proxies.ClientProxy.MC;
import static com.paneedah.mwc.ProjectConstants.ID;
import static net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType.*;

public class CustomGui extends Gui {

    //    private static final int BUFF_ICON_SIZE = 256;

    private static final int STATUS_BAR_BOTTOM_OFFSET = 15;
    private static final int STATUS_BAR_TOP_OFFSET = 10;

    private final WeaponAttachmentAspect attachmentAspect;
    private final ModContext modContext;
    private final String statusBarPosition;

    public static VehicleCustomGUI vehicleGUIOverlay = new VehicleCustomGUI();

    public static final ResourceLocation AMMO_COUNTER_TEXTURES = new ResourceLocation(ID + ":textures/hud/ammoiconsheet.png");

    private static FontRenderer FONT_RENDERER = null;


    public CustomGui(Minecraft MC, ModContext modContext, WeaponAttachmentAspect attachmentAspect) {
        this.modContext = modContext;
        this.attachmentAspect = attachmentAspect;
        this.statusBarPosition = ModernConfigManager.statusBarPosition;

    }

    public static FontRenderer getFontRenderer() {
        if (FONT_RENDERER == null) {
            FONT_RENDERER = MC.fontRenderer;
        }
        return FONT_RENDERER;
    }


    @SubscribeEvent
    public final void onRenderHud(RenderGameOverlayEvent.Pre event) {
        handleAnimationModeHUD(event);

        handleVehicleHUD(event);

        handleHelmetHUD(event);


        if (modContext.getMainHeldWeapon() != null) {
            ScaledResolution scaledResolution = new ScaledResolution(MC);
            double width = scaledResolution.getScaledWidth_double();
            double height = scaledResolution.getScaledHeight_double();


            //handleOpenDoorHUD(event, width, height);

            //	handleModificationHUD(event, modContext.getMainHeldWeapon(), width, height);
        }
    }


    public void handleAnimationModeHUD(RenderGameOverlayEvent.Pre event) {
        // animation on
        if (AnimationModeProcessor.getInstance().getFPSMode()) {
            event.setCanceled(true);

            GlStateManager.disableTexture2D();

            AnimationGUI.getInstance().render();


            if (AnimationGUI.getInstance().titleSafe.isState()) {
                DebugRenderer.setupBasicRender();
                ScaledResolution sr = new ScaledResolution(MC);
                DebugRenderer.renderPoint(new Vec3d(sr.getScaledWidth_double() / 2, sr.getScaledHeight_double() / 2, 0), new Vec3d(1, 0, 0));

                DebugRenderer.destructBasicRender();
            }


        }
    }


    public void handleVehicleHUD(RenderGameOverlayEvent.Pre event) {
        ElementType eventType = event.getType();


        if (MC.player.isRiding() && MC.player.getRidingEntity() instanceof EntityVehicle) {
            EntityVehicle v = (EntityVehicle) MC.player.getRidingEntity();


            if (!Double.isNaN(v.getSolver().getVelocityVector().lengthSquared())
                    && v.getSolver().getVelocityVector().lengthSquared() != 0.0) {

                if (eventType == CROSSHAIRS || eventType == HOTBAR || eventType == HEALTH || eventType == EXPERIENCE || eventType == ARMOR) {
                    event.setCanceled(true);
                }


            }


        }


        if (event.getType() == HELMET && MC.player.isRiding() && MC.player.getRidingEntity() instanceof EntityVehicle) {


            EntityVehicle vehicle = (EntityVehicle) MC.player.getRidingEntity();
            vehicleGUIOverlay.renderGUI(vehicle);
        }
    }

    public void handleHelmetHUD(RenderGameOverlayEvent.Pre event) {
        if (event.getType() == HELMET) {

            ItemStack helmetStack = MC.player.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
            if (helmetStack != null && MC.gameSettings.thirdPersonView == 0 && helmetStack.getItem() instanceof CustomArmor) {

                // Texture must be Width: 427, height: 240
                String hudTexture = ((CustomArmor) helmetStack.getItem()).getHudTexture();
                if (hudTexture != null) {
                    ScaledResolution scaledResolution = event.getResolution();
                    int screenWidth = scaledResolution.getScaledWidth();
                    int screenHeight = scaledResolution.getScaledHeight();

                    ItemStack chestStack = MC.player.getItemStackFromSlot(EntityEquipmentSlot.CHEST);
                    ItemStack feetStack = MC.player.getItemStackFromSlot(EntityEquipmentSlot.FEET);

                    if (chestStack != null && helmetStack != null && feetStack != null
                            && chestStack.getItem() instanceof CustomArmor
                            && helmetStack.getItem() instanceof CustomArmor
                            && feetStack.getItem() instanceof CustomArmor
                            && ((CustomArmor) chestStack.getItem()).getUnlocalizedArmorSetName()
                            .equals(((CustomArmor) helmetStack.getItem()).getUnlocalizedArmorSetName())
                            && ((CustomArmor) chestStack.getItem()).getUnlocalizedArmorSetName()
                            .equals(((CustomArmor) feetStack.getItem()).getUnlocalizedArmorSetName())
                    ) {
                        CustomArmor armor = (CustomArmor) chestStack.getItem();
                        double maxShieldCapacity = armor.getMaxShieldCapacity();
                        if (maxShieldCapacity > 0) {
                            double currentShieldCapacity = armor.getShieldCapacity(chestStack);
                            drawShieldIndicator(armor, MathHelper.clamp(currentShieldCapacity / maxShieldCapacity, 0.0, 1.0), screenWidth, screenHeight);
                        }
                    }

                    GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
                    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                    GL11.glDisable(GL11.GL_LIGHTING);
                    GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
                    GL11.glEnable(GL11.GL_BLEND);


                    MC.renderEngine.bindTexture(new ResourceLocation(hudTexture));

                    drawTexturedQuadFit(0, 0, screenWidth, screenHeight, -100);

                    GL11.glPopAttrib();
                }
            }
        }
    }

    // Ammo counter spec
    public static final int AMMO_COUNTER_WIDTH = 256;
    public static final int AMMO_COUNTER_HEIGHT = 52;
    //public static final double AMMO_COUNTER_SCALE = 0.50;

    // Weapon name
    public static final int AMMO_COUNTER_WEAPON_NAME_DOWNSCALE_THRESHOLD = 13;
    public static final double WEAPON_NAME_DOWNSCALE_MULTIPLIER = 8.5;
    public static final int WEAPON_STRING_X_OFFSET = 126;
    public static final double WEAPON_STRING_SCALE = 2.0;

    // Firemode indicator
    public static final int FIREMODE_INDICATOR_U_OFFSET = 147;
    public static final int FIREMODE_INDICATOR_U_WIDTH = 39;
    public static final int FIREMODE_INDICATOR_V_HEIGHT = 54;
    public static final int FIREMODE_INDICATOR_X_OFFSET = 90;
    public static final int FIREMODE_INDICATOR_Y_OFFSET = 60;
    public static final double FIREMODE_INDICATOR_SCALE = 0.70;

    // Disabled string
    public static final int DISABLED_STRING_X_OFFSET = 100;
    public static final int DISABLED_STRING_Y_OFFSET = 13;
    public static final double DISABLED_STRING_SCALE = 3.0;

    // Firemode string
    public static final int FIREMODE_KEY_X_STRING_OFFSET = 105;
    public static final int FIREMODE_KEY_Y_STRING_OFFSET = 30;
    public static final double FIREMODE_KEY_SCALE = 2.0;

    // Ammo strings
    public static final double CURRENT_AMMO_STRING_SCALE = 3.5;
    public static final double AMMO_TOTAL_STRING_SCALE = 3.0;
    public static final double CURRENT_AMMO_STRING_Y_OFFSET = 5.5;
    public static final int CURRENT_AMMO_COUNT_STRING_X_OFFSET = 64;
    public static final int TOTAL_AMMO_COUNT_STRING_X_OFFSET = 84;
    public static final double KEY_NAME_OFFSET_FIREMODE_INDICATOR_MULTIPLIER = 1.75;
    public static final double CURRENT_AMMO_WIDTH_MULTIPLIER = 2.0;
    public static final double TOTAL_AMMO_STRING_SCALE = 6.625;

    public Vec3d cachedPlayerPosition = Vec3d.ZERO;
    public double cachedPlayerEyeHeight;
    public Vec3d cachedLookVector = Vec3d.ZERO;
    public boolean shouldRenderDoorOverlay = false;

    // X-pos = scaled_width * width%
    // Y-pos = scaled_height * height%
    public static final double OPEN_DOOR_PERCENT_WIDTH_POS = 0.4;
    public static final double OPEN_DOOR_PERCENT_HEIGHT_POS = 0.6;


    public static final String OPENDOOR_TEXT_LANG_KEY = "overlay.opendoor";
    public static final int OPEN_DOOR_KEY_Y_OFFSET = 10;
    public static final int OPENDOOR_REACH_OVERLAY_DISTANCE = 5;

    public static final String BRACKET_FORMATTER = "[%s]";


    public void handleOpenDoorHUD(RenderGameOverlayEvent.Pre event, double scaledWidth, double scaledHeight) {

        if (ModernConfigManager.enableOpenDoorDisplay) {
            EntityPlayer player = MC.player;

            if (shouldRenderDoorOverlay) {
                int openDoorX = (int) (scaledWidth * OPEN_DOOR_PERCENT_WIDTH_POS);
                int openDoorY = (int) (scaledHeight * OPEN_DOOR_PERCENT_HEIGHT_POS);

                drawCenteredString(FONT_RENDERER, String.format(BRACKET_FORMATTER, KeyBindings.openDoor.getDisplayName()), openDoorX, openDoorY, ColorPalette.SUN_FLOWER);
                drawCenteredString(FONT_RENDERER, LangTools.formatName(OPENDOOR_TEXT_LANG_KEY), openDoorX, openDoorY + OPEN_DOOR_KEY_Y_OFFSET, ColorPalette.WHITE);
            }

            if (cachedPlayerPosition.equals(player.getPositionVector()) && cachedPlayerEyeHeight == player.getEyeHeight() && cachedLookVector.equals(player.getLookVec())) {
                return;
            }


            cachedPlayerPosition = player.getPositionVector();
            cachedLookVector = player.getLookVec();
            cachedPlayerEyeHeight = player.getEyeHeight();
            shouldRenderDoorOverlay = false;

            Vec3d originVector = player.getPositionVector().add(0, player.getEyeHeight(), 0);


            RayTraceResult rtr = player.world.rayTraceBlocks(originVector, originVector.add(player.getLookVec().scale(OPENDOOR_REACH_OVERLAY_DISTANCE)), false, true, false);
            if (rtr != null) {
                IBlockState state = player.world.getBlockState(rtr.getBlockPos());
                if (state.getBlock() instanceof BlockDoor) {
                    shouldRenderDoorOverlay = true;
                }
            }
        }
    }


    @SubscribeEvent
    public final void onRenderCrosshair(RenderGameOverlayEvent.Pre event) {
        if (event.getType() != CROSSHAIRS || MC.player.isSpectator()) {
            return;
        }

        ItemStack itemStack = MC.player.getHeldItemMainhand();

        ScaledResolution scaledResolution = event.getResolution();
        int width = scaledResolution.getScaledWidth();
        int height = scaledResolution.getScaledHeight();
        FontRenderer fontRender = MC.fontRenderer;

        PlayerWeaponInstance weaponInstance = modContext.getMainHeldWeapon();

        if (weaponInstance != null) {
            Weapon weaponItem = (Weapon) itemStack.getItem();
            String crosshair = weaponItem != null ? weaponItem.getCrosshair(weaponInstance) : null;

            if (crosshair != null) {
                MC.entityRenderer.setupOverlayRendering();

                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                GlStateManager.disableLighting();
                GlStateManager.blendFunc(SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA);
                GlStateManager.disableBlend();

                MC.renderEngine.bindTexture(new ResourceLocation(crosshair));

                if (isInAltModifyingState(weaponInstance) || isInModifyingState(weaponInstance)) {
                    //GlStateManager.alphaFunc(GL11.GL_GREATER, 0);
                    ModificationGUI.getInstance().render(modContext);
                    //GlStateManager.alphaFunc(GL11.GL_GREATER, 0.1f);
                    //GlStateManager.enableBlend();
                    //GlStateManager.alphaFunc(GL11.GL_GREATER, 0);
                    //GUIRenderHelper.drawColoredRectangle(20, 200, 128, 125, 0.05, ColorPalette.BLACK);

                } else {
                    ModernConfigManager.enableOpenDoorDisplay = ModernConfigManager.enableAmmoCounter;
                    drawAmmoCounter(fontRender, width, height, itemStack.getItem());
                }

                handleOpenDoorHUD(event, width, height);
                event.setCanceled(true);
            }

        } else if (itemStack.getItem() instanceof ItemMagazine) {
            drawAmmoCounter(fontRender, width, height, itemStack.getItem());
        }
    }

    public void drawAmmoCounter(FontRenderer fr, int width, int height, Item item) {
        if (!ModernConfigManager.enableAmmoCounter) {
            return;
        }

        getFontRenderer();

        GlStateManager.enableBlend();
        GlStateManager.pushMatrix();

        final int AMMO_COUNTER_X_POS = 256 + ModernConfigManager.ammoCounterX;
        final int AMMO_COUNTER_Y_POS = 128 + ModernConfigManager.ammoCounterY;
        final double AMMO_COUNTER_SIZE = ModernConfigManager.ammoCounterSize;

        GlStateManager.translate((width - AMMO_COUNTER_X_POS * AMMO_COUNTER_SIZE), (height - AMMO_COUNTER_Y_POS * AMMO_COUNTER_SIZE), 0);
        GlStateManager.scale(AMMO_COUNTER_SIZE, AMMO_COUNTER_SIZE, AMMO_COUNTER_SIZE);
        MC.getTextureManager().bindTexture(AMMO_COUNTER_TEXTURES);

        if (ModernConfigManager.enableAmmoCounterBackground) {
            if (ModernConfigManager.ammoCounterBackgroundReverse) {
                GlStateManager.enableBlend();
                GlStateManager.pushMatrix();
                GlStateManager.scale(-1, 1, 1);
                drawTexturedModalRect(-90, 0, 0, 0, -AMMO_COUNTER_WIDTH, AMMO_COUNTER_HEIGHT);
                GlStateManager.popMatrix();
            } else {
                drawTexturedModalRect(0, 0, 0, 0, AMMO_COUNTER_WIDTH, AMMO_COUNTER_HEIGHT);
            }
        }

        String totalCapacityString, currentAmmoString;
        int firemode;
        int totalCapacity = 0;
        int currentAmmo = 0;

        if (item instanceof ItemMagazine) {
            totalCapacity = ((ItemMagazine) item).getCapacity();
            currentAmmo = Tags.getAmmo(MC.player.getHeldItemMainhand());

        } else if (item instanceof Weapon) {
            final PlayerWeaponInstance weaponInstance = modContext.getMainHeldWeapon();
            final ItemMagazine magazine = (ItemMagazine) WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.MAGAZINE, weaponInstance);
            final String keyNameString = String.format(BRACKET_FORMATTER, KeyBindings.fireModeKey.getDisplayName());
            final double keyNameOffset = getFontRenderer().getStringWidth(keyNameString);

            switch (weaponInstance.getMaxShots()) {
                case Integer.MAX_VALUE:
                    firemode = Weapon.FIREMODE_AUTO;
                    break;
                case 1:
                    firemode = Weapon.FIREMODE_SINGLE;
                    break;
                default:
                    firemode = Weapon.FIREMODE_BURST;
                    break;
            }

            totalCapacity = magazine != null ? magazine.getCapacity() : weaponInstance.getWeapon().getAmmoCapacity();
            currentAmmo = weaponInstance.getAmmo();

            GlStateManager.pushMatrix();
            GlStateManager.translate(AMMO_COUNTER_WIDTH - FIREMODE_INDICATOR_X_OFFSET - (keyNameOffset * KEY_NAME_OFFSET_FIREMODE_INDICATOR_MULTIPLIER), FIREMODE_INDICATOR_Y_OFFSET, 0);
            GlStateManager.scale(FIREMODE_INDICATOR_SCALE, FIREMODE_INDICATOR_SCALE, FIREMODE_INDICATOR_SCALE);
            GlStateManager.enableBlend();
            drawTexturedModalRect(0, 0, FIREMODE_INDICATOR_U_OFFSET + FIREMODE_INDICATOR_U_WIDTH * (Weapon.FIREMODE_AUTO - firemode), FIREMODE_INDICATOR_V_HEIGHT, FIREMODE_INDICATOR_U_WIDTH, FIREMODE_INDICATOR_U_WIDTH);
            GlStateManager.popMatrix();

            if (((Weapon) item).builder.getMaxShots().size() > 1) {
                drawScaledString(FONT_RENDERER, keyNameString, FIREMODE_KEY_X_STRING_OFFSET - keyNameOffset, FIREMODE_KEY_Y_STRING_OFFSET, FIREMODE_KEY_SCALE, ColorPalette.BRIGHT_YARROW);
            }
        }

        if (totalCapacity == 0) {
            totalCapacityString = "-";
            currentAmmoString = "-";
        } else {
            totalCapacityString = String.valueOf(totalCapacity);
            currentAmmoString = String.valueOf((currentAmmo == 0 && item instanceof Weapon ? "-" : currentAmmo));
        }

        final String weaponName = new TextComponentTranslation(LangTools.formatName(item.getTranslationKey())).getFormattedText();
        final String bottomString = String.format("  %s  | %s%s", TextFormatting.GRAY, TextFormatting.WHITE, totalCapacityString);

        double totalLength = 0;
        if (bottomString.length() > AMMO_COUNTER_WEAPON_NAME_DOWNSCALE_THRESHOLD) {
            final int adjLength = bottomString.length() - AMMO_COUNTER_WEAPON_NAME_DOWNSCALE_THRESHOLD;
            totalLength = adjLength * WEAPON_NAME_DOWNSCALE_MULTIPLIER;
        }

        drawScaledString(FONT_RENDERER, weaponName, WEAPON_STRING_X_OFFSET - FONT_RENDERER.getStringWidth(weaponName), -FONT_RENDERER.FONT_HEIGHT, WEAPON_STRING_SCALE, ColorPalette.BRIGHT_YARROW);

        if (item instanceof Weapon && BalancePackManager.isWeaponDisabled((Weapon) item)) {
            GUIRenderHelper.drawScaledString("Disabled", DISABLED_STRING_X_OFFSET - totalLength, DISABLED_STRING_Y_OFFSET, DISABLED_STRING_SCALE, ColorPalette.POMEGRANATE);
        } else {
            drawScaledString(fr, weaponName, WEAPON_STRING_X_OFFSET - fr.getStringWidth(weaponName), -fr.FONT_HEIGHT, WEAPON_STRING_SCALE, ColorPalette.BRIGHT_YARROW);
            drawScaledString(fr, currentAmmoString, TOTAL_AMMO_COUNT_STRING_X_OFFSET - fr.getStringWidth(currentAmmoString) * CURRENT_AMMO_WIDTH_MULTIPLIER, CURRENT_AMMO_STRING_Y_OFFSET, CURRENT_AMMO_STRING_SCALE, ColorPalette.BRIGHT_YARROW);
            drawScaledString(fr, bottomString, CURRENT_AMMO_COUNT_STRING_X_OFFSET, TOTAL_AMMO_STRING_SCALE, AMMO_TOTAL_STRING_SCALE);
        }

        GlStateManager.popMatrix();
    }

    public void drawScaledString(FontRenderer fr, String str, double x, double y, double scale, int color) {

        GlStateManager.pushMatrix();

        GlStateManager.translate(x, y, 0);
        GlStateManager.scale(scale, scale, scale);

        fr.drawStringWithShadow(str, (float) (x / scale), (float) (y / scale), color);
        GlStateManager.popMatrix();
    }

    public void drawScaledString(FontRenderer fr, String str, double x, double y, double scale) {
        drawScaledString(fr, str, x, y, scale, 0xffffff);
    }

    private void drawShieldIndicator(CustomArmor armor, double capacity, double screenWidth, double screenHeight) {
        Framebuffer framebuffer = MC.getFramebuffer();
        if (!framebuffer.isStencilEnabled()) {
            framebuffer.enableStencil();
        }

        GL11.glEnable(GL11.GL_ALPHA_TEST);
        GL11.glEnable(GL11.GL_STENCIL_TEST);


        GL11.glPushAttrib(GL11.GL_ENABLE_BIT);

        GL11.glStencilFunc(GL11.GL_ALWAYS, 1, 0xFF);
        GL11.glStencilOp(GL11.GL_KEEP, GL11.GL_KEEP, GL11.GL_REPLACE);
        GL11.glStencilMask(0xFF);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GL11.glEnable(GL11.GL_BLEND);

        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glColorMask(false, false, false, false);
        GL11.glDepthMask(false);
        GL11.glClear(GL11.GL_STENCIL_BUFFER_BIT); // Clear stencil buffer (0 by default)

        MC.renderEngine.bindTexture(new ResourceLocation(armor.getShieldIndicatorMaskTextureName()));

        // 640:328 
        // 427:240

        drawTexturedQuadFit((armor.getShieldIndicatorPositionX() - 1) * (screenWidth / 640.0), armor.getShieldIndicatorPositionY() * (screenHeight / 328.0),
                armor.getShieldIndicatorWidth() * (screenWidth / 640.0) + 2, (armor.getShieldIndicatorHeight() + 1) * (screenHeight / 328.0), -101);

        GL11.glStencilFunc(GL11.GL_EQUAL, 1, 0xFF);
        GL11.glStencilMask(0x00);
        GL11.glDepthMask(true);
        GL11.glColorMask(true, true, true, true);

        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

        GL11.glDisable(GL11.GL_LIGHTING);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GL11.glEnable(GL11.GL_BLEND);

        MC.renderEngine.bindTexture(new ResourceLocation(armor.getShieldIndicatorProgressBarTextureName()));

        drawTexturedQuadFit((armor.getShieldIndicatorPositionX() - 1) * (screenWidth / 640.0), armor.getShieldIndicatorPositionY() * (screenHeight / 328.0),
                ((armor.getShieldIndicatorWidth() + 2) * (screenWidth / 640.0)) * capacity, (armor.getShieldIndicatorHeight() + 1) * (screenHeight / 328.0), -101);

        GL11.glPopAttrib();

        GlStateManager.disableAlpha();
        GL11.glDisable(GL11.GL_STENCIL_TEST);
    }


    private int getStatusBarXPosition(int width, String text, FontRenderer fontRender) {
        int x;
        if (statusBarPosition.equals("BOTTOM_RIGHT") || statusBarPosition.equals("TOP_RIGHT")) {
            x = width - 80;
            int stringWidth = fontRender.getStringWidth(text);
            if (stringWidth > 80) {
                x = width - stringWidth - 5;
            }
        } else {
            x = 10;
        }

        return x;
    }

    private int getStatusBarYPosition(int height) {
        int yPos;
        switch (statusBarPosition) {
            case "TOP_RIGHT":
            case "TOP_LEFT":
                yPos = STATUS_BAR_TOP_OFFSET;
                break;
            case "BOTTOM_RIGHT":
            case "BOTTOM_LEFT":
                yPos = height - STATUS_BAR_BOTTOM_OFFSET;
                break;
            default:
                yPos = STATUS_BAR_TOP_OFFSET;
        }
        return yPos;
    }


    private String getDefaultMagazineMessage(ItemStack itemStack) {

        ItemMagazine magazine = (ItemMagazine) itemStack.getItem();

        String ammoCounterMessage = I18n.format("gui.ammoCounter", Tags.getAmmo(itemStack) + "/" + magazine.getCapacity());
        return ammoCounterMessage;
    }


    private String getDefaultWeaponMessage(PlayerWeaponInstance weaponInstance) {
        ItemMagazine magazine = (ItemMagazine) WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.MAGAZINE, weaponInstance);
        int totalCapacity;
        if (magazine != null) {
            totalCapacity = magazine.getCapacity();
        } else {
            totalCapacity = weaponInstance.getWeapon().getAmmoCapacity();
        }

        String text;
        if (weaponInstance.getWeapon().getAmmoCapacity() == 0 && totalCapacity == 0) {
            text = I18n.format("gui.noMagazine");
        } else {
            text = I18n.format(
                    "gui.ammoCounter", weaponInstance.getWeapon().getCurrentAmmo(MC.player) + "/" + totalCapacity);
        }
        return text;
    }


    public static boolean isInModifyingState(PlayerWeaponInstance weaponInstance) {
        return (weaponInstance.getState() == WeaponState.MODIFYING && !weaponInstance.isAltMofificationModeEnabled())
                || weaponInstance.getState() == WeaponState.MODIFYING_REQUESTED
                || weaponInstance.getState() == WeaponState.NEXT_ATTACHMENT
                || weaponInstance.getState() == WeaponState.NEXT_ATTACHMENT_REQUESTED;
    }

    public static boolean isInAltModifyingState(PlayerWeaponInstance weaponInstance) {
        return weaponInstance.isAltMofificationModeEnabled()
                && (weaponInstance.getState() == WeaponState.MODIFYING
                || weaponInstance.getState() == WeaponState.MODIFYING_REQUESTED
                || weaponInstance.getState() == WeaponState.NEXT_ATTACHMENT
                || weaponInstance.getState() == WeaponState.NEXT_ATTACHMENT_REQUESTED);
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
