package com.paneedah.weaponlib.compatibility;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.gson.JsonSyntaxException;
import com.paneedah.mwc.ProjectConstants;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.MapItemRenderer;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.particle.ParticleManager;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.culling.ClippingHelperImpl;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.culling.ICamera;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.client.shader.ShaderLinkHelper;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.crash.ICrashReportDetail;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.*;
import net.minecraft.world.GameType;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.glu.Project;

import javax.annotation.Nullable;
import java.io.IOException;
import java.nio.FloatBuffer;
import java.util.List;
import java.util.Objects;
import java.util.Random;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

@Deprecated
@SideOnly(Side.CLIENT)
public class CompatibleWorldRenderer extends EntityRenderer {
    private static final ResourceLocation RAIN_TEXTURES = new ResourceLocation("textures/environment/rain.png");
    private static final ResourceLocation SNOW_TEXTURES = new ResourceLocation("textures/environment/snow.png");
    public static boolean anaglyphEnable;
    /**
     * Anaglyph field (0=R, 1=GB)
     */
    public static int anaglyphField;
    private static final float MAX_ZOOM = 0.01f;

    private final IResourceManager resourceManager;
    private final Random random = new Random();
    private float farPlaneDistance;
    public final ItemRenderer itemRenderer;
    @Getter
    private final MapItemRenderer mapItemRenderer;
    /**
     * Entity renderer update count
     */
    private int rendererUpdateCount;
    private final MouseFilter mouseFilterXAxis = new MouseFilter();
    private final MouseFilter mouseFilterYAxis = new MouseFilter();
    private final float thirdPersonDistance = 4.0F;
    /**
     * Previous third person distance
     */
    private float thirdPersonDistancePrev = 4.0F;
    /**
     * Smooth cam yaw
     */
    private float smoothCamYaw;
    /**
     * Smooth cam pitch
     */
    private float smoothCamPitch;
    /**
     * Smooth cam filter X
     */
    private float smoothCamFilterX;
    /**
     * Smooth cam filter Y
     */
    private float smoothCamFilterY;
    /**
     * Smooth cam partial ticks
     */
    private float smoothCamPartialTicks;
    /**
     * FOV modifier hand
     */
    private float fovModifierHand;
    /**
     * FOV modifier hand prev
     */
    private float fovModifierHandPrev;
    private float bossColorModifier;
    private float bossColorModifierPrev;
    /**
     * Cloud fog mode
     */
    private boolean cloudFog;
    private final boolean renderHand = true;
    private long timeWorldIcon;
    /**
     * Previous frame time in milliseconds
     */
    private long prevFrameTime = Minecraft.getSystemTime();
    /**
     * The texture id of the blocklight/skylight texture used for lighting effects
     */
    private final DynamicTexture lightmapTexture;
    /**
     * Colors computed in updateLightmap() and loaded into the lightmap emptyTexture
     */
    private final int[] lightmapColors;
    private final ResourceLocation locationLightMap;
    /**
     * Is set, updateCameraAndRender() calls updateLightmap(); set by updateTorchFlicker()
     */
    private boolean lightmapUpdateNeeded;
    /**
     * Torch flicker X
     */
    private float torchFlickerX;
    private float torchFlickerDX;
    /**
     * Rain sound counter
     */
    private int rainSoundCounter;
    private final float[] rainXCoords = new float[1024];
    private final float[] rainYCoords = new float[1024];
    /**
     * Fog color buffer
     */
    private final FloatBuffer fogColorBuffer = GLAllocation.createDirectFloatBuffer(16);
    private float fogColorRed;
    private float fogColorGreen;
    private float fogColorBlue;
    /**
     * Fog color 2
     */
    private float fogColor2;
    /**
     * Fog color 1
     */
    private float fogColor1;
    private int debugViewDirection;
    private boolean debugView;
    private double cameraYaw;
    private double cameraPitch;
    private ItemStack itemActivationItem;
    private int itemActivationTicks;
    private float itemActivationOffX;
    private float itemActivationOffY;
    @Setter
    @Getter
    private ShaderGroup shaderGroup;
    private static final ResourceLocation[] SHADERS_TEXTURES = new ResourceLocation[]{new ResourceLocation("shaders/post/notch.json"), new ResourceLocation("shaders/post/fxaa.json"), new ResourceLocation("shaders/post/art.json"), new ResourceLocation("shaders/post/bumpy.json"), new ResourceLocation("shaders/post/blobs2.json"), new ResourceLocation("shaders/post/pencil.json"), new ResourceLocation("shaders/post/color_convolve.json"), new ResourceLocation("shaders/post/deconverge.json"), new ResourceLocation("shaders/post/flip.json"), new ResourceLocation("shaders/post/invert.json"), new ResourceLocation("shaders/post/ntsc.json"), new ResourceLocation("shaders/post/outline.json"), new ResourceLocation("shaders/post/phosphor.json"), new ResourceLocation("shaders/post/scan_pincushion.json"), new ResourceLocation("shaders/post/sobel.json"), new ResourceLocation("shaders/post/bits.json"), new ResourceLocation("shaders/post/desaturate.json"), new ResourceLocation("shaders/post/green.json"), new ResourceLocation("shaders/post/blur.json"), new ResourceLocation("shaders/post/wobble.json"), new ResourceLocation("shaders/post/blobs.json"), new ResourceLocation("shaders/post/antialias.json"), new ResourceLocation("shaders/post/creeper.json"), new ResourceLocation("shaders/post/spider.json")};
    public static final int SHADER_COUNT = SHADERS_TEXTURES.length;
    private int shaderIndex;
    private boolean useShader;
    private int frameCount;
    @Setter
    private boolean prepareTerrain;

    public CompatibleWorldRenderer(Minecraft MCIn, IResourceManager resourceManagerIn) {
        super(MCIn, resourceManagerIn);
        shaderIndex = SHADER_COUNT;
        resourceManager = resourceManagerIn;
        itemRenderer = MCIn.getItemRenderer();
        mapItemRenderer = new MapItemRenderer(MCIn.getTextureManager());
        lightmapTexture = new DynamicTexture(16, 16);
        locationLightMap = MCIn.getTextureManager().getDynamicTextureLocation("lightMap", lightmapTexture);
        lightmapColors = lightmapTexture.getTextureData();
        shaderGroup = null;

        for (int i = 0; i < 32; ++i) {
            for (int j = 0; j < 32; ++j) {
                float f = (float) (j - 16);
                float f1 = (float) (i - 16);
                float f2 = MathHelper.sqrt(f * f + f1 * f1);
                rainXCoords[i << 5 | j] = -f1 / f2;
                rainYCoords[i << 5 | j] = f / f2;
            }
        }
    }

    public boolean isShaderActive() {
        return OpenGlHelper.shadersSupported && shaderGroup != null;
    }

    public void stopUseShader() {
        if (shaderGroup != null) {
            shaderGroup.deleteShaderGroup();
        }

        shaderGroup = null;
        shaderIndex = SHADER_COUNT;
    }

    public void switchUseShader() {
    }

    /**
     * What shader to use when spectating this entity
     */
    public void loadEntityShader(@Nullable Entity entityIn) {
        if (OpenGlHelper.shadersSupported) {
            if (shaderGroup != null) {
                shaderGroup.deleteShaderGroup();
            }

            shaderGroup = null;

            if (entityIn instanceof EntityCreeper) {
                loadShader(new ResourceLocation("shaders/post/creeper.json"));
            } else if (entityIn instanceof EntitySpider) {
                loadShader(new ResourceLocation("shaders/post/spider.json"));
            } else if (entityIn instanceof EntityEnderman) {
                loadShader(new ResourceLocation("shaders/post/invert.json"));
            } else {
                net.minecraftforge.client.ForgeHooksClient.loadEntityShader(entityIn, this);
            }
        }
    }

    public void loadShader(ResourceLocation resourceLocationIn) {
        try {
            shaderGroup = new ShaderGroup(MC.getTextureManager(), resourceManager, MC.getFramebuffer(), resourceLocationIn);
            shaderGroup.createBindFramebuffers(MC.displayWidth, MC.displayHeight);
            useShader = true;
        } catch (IOException ioexception) {
            ProjectConstants.LOGGER.warn("Failed to load shader: {}", resourceLocationIn, ioexception);
            shaderIndex = SHADER_COUNT;
            useShader = false;
        } catch (JsonSyntaxException jsonsyntaxexception) {
            ProjectConstants.LOGGER.warn("Failed to load shader: {}", resourceLocationIn, jsonsyntaxexception);
            shaderIndex = SHADER_COUNT;
            useShader = false;
        }
    }

    public void onResourceManagerReload(IResourceManager resourceManager) {
        if (shaderGroup != null) {
            shaderGroup.deleteShaderGroup();
        }

        shaderGroup = null;

        if (shaderIndex == SHADER_COUNT) {
            loadEntityShader(MC.getRenderViewEntity());
        } else {
            loadShader(SHADERS_TEXTURES[shaderIndex]);
        }
    }

    /**
     * Updates the entity renderer
     */
    public void updateRenderer() {


        updateFovModifierHand();
        updateTorchFlicker();
        fogColor2 = fogColor1;
        thirdPersonDistancePrev = 4.0F;

        float f = MC.gameSettings.mouseSensitivity * 0.6F + 0.2F;


        float f1 = f * f * f * 8.0F;
        smoothCamFilterX = mouseFilterXAxis.smooth(smoothCamYaw, 0.05F * f1);
        smoothCamFilterY = mouseFilterYAxis.smooth(smoothCamPitch, 0.05F * f1);
        smoothCamPartialTicks = 0.0F;
        smoothCamYaw = 0.0F;
        smoothCamPitch = 0.0F;

        if (MC.getRenderViewEntity() == null) {
            MC.setRenderViewEntity(MC.player);
        }

        float f3 = MC.world.getLightBrightness(new BlockPos(MC.getRenderViewEntity()));
        float f4 = (float) MC.gameSettings.renderDistanceChunks / 32.0F;
        float f2 = f3 * (1.0F - f4) + f4;
        fogColor1 += (f2 - fogColor1) * 0.1F;
        ++rendererUpdateCount;
        //this.itemRenderer.updateEquippedItem();
        addRainParticles();
        bossColorModifierPrev = bossColorModifier;

        if (MC.ingameGUI.getBossOverlay().shouldDarkenSky()) {
            bossColorModifier += 0.05F;

            if (bossColorModifier > 1.0F) {
                bossColorModifier = 1.0F;
            }
        } else if (bossColorModifier > 0.0F) {
            bossColorModifier -= 0.0125F;
        }

        if (itemActivationTicks > 0) {
            --itemActivationTicks;

            if (itemActivationTicks == 0) {
                itemActivationItem = null;
            }
        }
    }

    public void updateShaderGroupSize(int width, int height) {
        if (OpenGlHelper.shadersSupported) {
            if (shaderGroup != null) {
                shaderGroup.createBindFramebuffers(width, height);
            }

            MC.renderGlobal.createBindEntityOutlineFbs(width, height);
        }
    }

    /**
     * Gets the block or object that is being moused over.
     */
    public void getMouseOver(float partialTicks) {
        Entity entity = MC.getRenderViewEntity();

        if (entity != null) {
            if (MC.world != null) {
                MC.profiler.startSection("pick");
                MC.pointedEntity = null;
                double d0 = MC.playerController.getBlockReachDistance();
                MC.objectMouseOver = entity.rayTrace(d0, partialTicks);
                Vec3d eyePosition = entity.getPositionEyes(partialTicks);
                boolean flag = false;
                int i = 3;
                double d1 = d0;

                if (MC.playerController.extendedReach()) {
                    d1 = 6.0D;
                    d0 = d1;
                } else {
                    if (d0 > 3.0D) {
                        flag = true;
                    }
                }

                if (MC.objectMouseOver != null) {
                    d1 = MC.objectMouseOver.hitVec.distanceTo(eyePosition);
                }

                Vec3d entityLookVec = entity.getLook(1.0F);
                Vec3d targetPos = eyePosition.add(entityLookVec.x * d0, entityLookVec.y * d0, entityLookVec.z * d0);
                /**
                 * Pointed entity
                 */
                Entity pointedEntity = null;
                Vec3d vec3d3 = null;
                float f = 1.0F;
                List<Entity> list = MC.world.getEntitiesInAABBexcluding(entity, entity.getEntityBoundingBox().expand(entityLookVec.x * d0, entityLookVec.y * d0, entityLookVec.z * d0).grow(1.0D, 1.0D, 1.0D), Predicates.and(EntitySelectors.NOT_SPECTATING, new Predicate<Entity>() {
                    public boolean apply(@Nullable Entity p_apply_1_) {
                        return p_apply_1_ != null && p_apply_1_.canBeCollidedWith();
                    }
                }));
                double d2 = d1;

                for (int j = 0; j < list.size(); ++j) {
                    Entity entity1 = list.get(j);
                    AxisAlignedBB axisalignedbb = entity1.getEntityBoundingBox().grow(entity1.getCollisionBorderSize());
                    RayTraceResult raytraceresult = axisalignedbb.calculateIntercept(eyePosition, targetPos);

                    if (axisalignedbb.contains(eyePosition)) {
                        if (d2 >= 0.0D) {
                            pointedEntity = entity1;
                            vec3d3 = raytraceresult == null ? eyePosition : raytraceresult.hitVec;
                            d2 = 0.0D;
                        }
                    } else if (raytraceresult != null) {
                        double d3 = eyePosition.distanceTo(raytraceresult.hitVec);

                        if (d3 < d2 || d2 == 0.0D) {
                            if (entity1.getLowestRidingEntity() == entity.getLowestRidingEntity() && !entity1.canRiderInteract()) {
                                if (d2 == 0.0D) {
                                    pointedEntity = entity1;
                                    vec3d3 = raytraceresult.hitVec;
                                }
                            } else {
                                pointedEntity = entity1;
                                vec3d3 = raytraceresult.hitVec;
                                d2 = d3;
                            }
                        }
                    }
                }

                if (pointedEntity != null && flag) {
                    assert vec3d3 != null;
                    if (eyePosition.distanceTo(vec3d3) > 3.0D) {
                        pointedEntity = null;
                        MC.objectMouseOver = new RayTraceResult(RayTraceResult.Type.MISS, vec3d3, null, new BlockPos(vec3d3));
                    }
                }

                if (pointedEntity != null && (d2 < d1 || MC.objectMouseOver == null)) {
                    assert vec3d3 != null;
                    MC.objectMouseOver = new RayTraceResult(pointedEntity, vec3d3);

                    if (pointedEntity instanceof EntityLivingBase || pointedEntity instanceof EntityItemFrame) {
                        MC.pointedEntity = pointedEntity;
                    }
                }

                MC.profiler.endSection();
            }
        }
    }

    /**
     * Update FOV modifier hand
     */
    private void updateFovModifierHand() {
        float f = 1.0F;

        if (MC.getRenderViewEntity() instanceof AbstractClientPlayer) {
            AbstractClientPlayer abstractclientplayer = (AbstractClientPlayer) MC.getRenderViewEntity();
            f = abstractclientplayer.getFovModifier();
        }

        fovModifierHandPrev = fovModifierHand;
        fovModifierHand += (f - fovModifierHand) * 0.5F;

        if (fovModifierHand > 1.5F) {
            fovModifierHand = 1.5F;
        }

        if (fovModifierHand < MAX_ZOOM) {
            fovModifierHand = MAX_ZOOM;
        }
    }

    /**
     * Changes the field of view of the player depending on if they are underwater or not
     */
    public float getFOVModifier(float partialTicks, boolean useFOVSetting) {
        if (debugView) {
            return 90.0F;
        } else {
            Entity entity = MC.getRenderViewEntity();
            float f = 70.0F;

            if (useFOVSetting) {
                f = MC.gameSettings.fovSetting;
                f = f * (fovModifierHandPrev + (fovModifierHand - fovModifierHandPrev) * partialTicks);
            }

            if (entity instanceof EntityLivingBase && ((EntityLivingBase) entity).getHealth() <= 0.0F) {
                float f1 = (float) ((EntityLivingBase) entity).deathTime + partialTicks;
                f /= (1.0F - 500.0F / (f1 + 500.0F)) * 2.0F + 1.0F;
            }

            assert entity != null;
            IBlockState iblockstate = ActiveRenderInfo.getBlockStateAtEntityViewpoint(MC.world, entity, partialTicks);

            if (iblockstate.getMaterial() == Material.WATER) {
                f = f * 60.0F / 70.0F;
            }

            return net.minecraftforge.client.ForgeHooksClient.getFOVModifier(this, entity, iblockstate, partialTicks, f);
        }
    }

    private void hurtCameraEffect(float partialTicks) {

        if (MC.getRenderViewEntity() instanceof EntityLivingBase) {
            EntityLivingBase entitylivingbase = (EntityLivingBase) MC.getRenderViewEntity();
            float f = (float) entitylivingbase.hurtTime - partialTicks;

            if (entitylivingbase.getHealth() <= 0.0F) {
                float f1 = (float) entitylivingbase.deathTime + partialTicks;
                GlStateManager.rotate(40.0F - 8000.0F / (f1 + 200.0F), 0.0F, 0.0F, 1.0F);
            }

            if (f < 0.0F) {
                return;
            }

            f = f / (float) entitylivingbase.maxHurtTime;
            f = MathHelper.sin(f * f * f * f * (float) Math.PI);
            float f2 = entitylivingbase.attackedAtYaw;
            GlStateManager.rotate(-f2, 0.0F, 1.0F, 0.0F);
            GlStateManager.rotate(-f * 14.0F, 0.0F, 0.0F, 1.0F);
            GlStateManager.rotate(f2, 0.0F, 1.0F, 0.0F);
        }
    }

    /**
     * Updates the bobbing renderer effect of the player.
     */
    private void applyBobbing(float partialTicks) {
        if (MC.getRenderViewEntity() instanceof EntityPlayer) {
            EntityPlayer entityplayer = (EntityPlayer) MC.getRenderViewEntity();
            float f = entityplayer.distanceWalkedModified - entityplayer.prevDistanceWalkedModified;
            float f1 = -(entityplayer.distanceWalkedModified + f * partialTicks);
            float f2 = entityplayer.prevCameraYaw + (entityplayer.cameraYaw - entityplayer.prevCameraYaw) * partialTicks;
            float f3 = entityplayer.prevCameraPitch + (entityplayer.cameraPitch - entityplayer.prevCameraPitch) * partialTicks;
            GlStateManager.translate(MathHelper.sin(f1 * (float) Math.PI) * f2 * 0.5F, -Math.abs(MathHelper.cos(f1 * (float) Math.PI) * f2), 0.0F);
            GlStateManager.rotate(MathHelper.sin(f1 * (float) Math.PI) * f2 * 3.0F, 0.0F, 0.0F, 1.0F);
            GlStateManager.rotate(Math.abs(MathHelper.cos(f1 * (float) Math.PI - 0.2F) * f2) * 5.0F, 1.0F, 0.0F, 0.0F);
            GlStateManager.rotate(f3, 1.0F, 0.0F, 0.0F);
        }
    }

    /**
     * sets up player's eye (or camera in third person mode)
     */
    private void orientCamera(float partialTicks) {
        Entity entity = MC.getRenderViewEntity();
        assert entity != null;
        float f = entity.getEyeHeight();
        double d0 = entity.prevPosX + (entity.posX - entity.prevPosX) * (double) partialTicks;
        double d1 = entity.prevPosY + (entity.posY - entity.prevPosY) * (double) partialTicks + (double) f;
        double d2 = entity.prevPosZ + (entity.posZ - entity.prevPosZ) * (double) partialTicks;

        if (entity instanceof EntityLivingBase && ((EntityLivingBase) entity).isPlayerSleeping()) {
            f = (float) ((double) f + 1.0D);
            GlStateManager.translate(0.0F, 0.3F, 0.0F);

            if (!MC.gameSettings.debugCamEnable) {
                BlockPos blockpos = new BlockPos(entity);
                IBlockState iblockstate = MC.world.getBlockState(blockpos);
                net.minecraftforge.client.ForgeHooksClient.orientBedCamera(MC.world, blockpos, iblockstate, entity);

                GlStateManager.rotate(entity.prevRotationYaw + (entity.rotationYaw - entity.prevRotationYaw) * partialTicks + 180.0F, 0.0F, -1.0F, 0.0F);
                GlStateManager.rotate(entity.prevRotationPitch + (entity.rotationPitch - entity.prevRotationPitch) * partialTicks, -1.0F, 0.0F, 0.0F);
            }
        } else if (MC.gameSettings.thirdPersonView > 0) {
            double d3 = thirdPersonDistancePrev + (4.0F - thirdPersonDistancePrev) * partialTicks;

            if (MC.gameSettings.debugCamEnable) {
                GlStateManager.translate(0.0F, 0.0F, (float) (-d3));
            } else {
                float f1 = entity.rotationYaw;
                float f2 = entity.rotationPitch;

                if (MC.gameSettings.thirdPersonView == 2) {
                    f2 += 180.0F;
                }

                double d4 = (double) (-MathHelper.sin(f1 * 0.017453292F) * MathHelper.cos(f2 * 0.017453292F)) * d3;
                double d5 = (double) (MathHelper.cos(f1 * 0.017453292F) * MathHelper.cos(f2 * 0.017453292F)) * d3;
                double d6 = (double) (-MathHelper.sin(f2 * 0.017453292F)) * d3;

                for (int i = 0; i < 8; ++i) {
                    float f3 = (float) ((i & 1) * 2 - 1);
                    float f4 = (float) ((i >> 1 & 1) * 2 - 1);
                    float f5 = (float) ((i >> 2 & 1) * 2 - 1);
                    f3 = f3 * 0.1F;
                    f4 = f4 * 0.1F;
                    f5 = f5 * 0.1F;
                    RayTraceResult raytraceresult = MC.world.rayTraceBlocks(new Vec3d(d0 + (double) f3, d1 + (double) f4, d2 + (double) f5), new Vec3d(d0 - d4 + (double) f3 + (double) f5, d1 - d6 + (double) f4, d2 - d5 + (double) f5));

                    if (raytraceresult != null) {
                        double d7 = raytraceresult.hitVec.distanceTo(new Vec3d(d0, d1, d2));

                        if (d7 < d3) {
                            d3 = d7;
                        }
                    }
                }

                if (MC.gameSettings.thirdPersonView == 2) {
                    GlStateManager.rotate(180.0F, 0.0F, 1.0F, 0.0F);
                }

                GlStateManager.rotate(entity.rotationPitch - f2, 1.0F, 0.0F, 0.0F);
                GlStateManager.rotate(entity.rotationYaw - f1, 0.0F, 1.0F, 0.0F);
                GlStateManager.translate(0.0F, 0.0F, (float) (-d3));
                GlStateManager.rotate(f1 - entity.rotationYaw, 0.0F, 1.0F, 0.0F);
                GlStateManager.rotate(f2 - entity.rotationPitch, 1.0F, 0.0F, 0.0F);
            }
        } else {
            GlStateManager.translate(0.0F, 0.0F, 0.05F);
        }

        if (!MC.gameSettings.debugCamEnable) {
            float yaw = entity.prevRotationYaw + (entity.rotationYaw - entity.prevRotationYaw) * partialTicks + 180.0F;
            float pitch = entity.prevRotationPitch + (entity.rotationPitch - entity.prevRotationPitch) * partialTicks;
            float roll = 0.0F;
            if (entity instanceof EntityAnimal) {
                EntityAnimal entityanimal = (EntityAnimal) entity;
                yaw = entityanimal.prevRotationYawHead + (entityanimal.rotationYawHead - entityanimal.prevRotationYawHead) * partialTicks + 180.0F;
            }
            IBlockState state = ActiveRenderInfo.getBlockStateAtEntityViewpoint(MC.world, entity, partialTicks);
            net.minecraftforge.client.event.EntityViewRenderEvent.CameraSetup event = new net.minecraftforge.client.event.EntityViewRenderEvent.CameraSetup(this, entity, state, partialTicks, yaw, pitch, roll);
            net.minecraftforge.common.MinecraftForge.EVENT_BUS.post(event);
            GlStateManager.rotate(event.getRoll(), 0.0F, 0.0F, 1.0F);
            GlStateManager.rotate(event.getPitch(), 1.0F, 0.0F, 0.0F);
            GlStateManager.rotate(event.getYaw(), 0.0F, 1.0F, 0.0F);
        }

        GlStateManager.translate(0.0F, -f, 0.0F);
        d0 = entity.prevPosX + (entity.posX - entity.prevPosX) * (double) partialTicks;
        d1 = entity.prevPosY + (entity.posY - entity.prevPosY) * (double) partialTicks + (double) f;
        d2 = entity.prevPosZ + (entity.posZ - entity.prevPosZ) * (double) partialTicks;
        cloudFog = MC.renderGlobal.hasCloudFog(d0, d1, d2, partialTicks);
    }

    /**
     * sets up projection, view effects, camera position/rotation
     */
    private void setupCameraTransform(float partialTicks, int pass) {
        farPlaneDistance = (float) (MC.gameSettings.renderDistanceChunks * 16);
        GlStateManager.matrixMode(5889);
        GlStateManager.loadIdentity();
        float f = 0.07F;

        if (MC.gameSettings.anaglyph) {
            GlStateManager.translate((float) (-(pass * 2 - 1)) * 0.07F, 0.0F, 0.0F);
        }

        double cameraZoom = 1.0D;

        Project.gluPerspective(getFOVModifier(partialTicks, true), (float) MC.displayWidth / (float) MC.displayHeight, 0.05F, farPlaneDistance * MathHelper.SQRT_2);
        GlStateManager.matrixMode(5888);
        GlStateManager.loadIdentity();

        if (MC.gameSettings.anaglyph) {
            GlStateManager.translate((float) (pass * 2 - 1) * 0.1F, 0.0F, 0.0F);
        }

        hurtCameraEffect(partialTicks);

        if (MC.gameSettings.viewBobbing) {
            applyBobbing(partialTicks);
        }

        float f1 = MC.player.prevTimeInPortal + (MC.player.timeInPortal - MC.player.prevTimeInPortal) * partialTicks;

        if (f1 > 0.0F) {
            int i = 20;

            if (MC.player.isPotionActive(MobEffects.NAUSEA)) {
                i = 7;
            }

            float f2 = 5.0F / (f1 * f1 + 5.0F) - f1 * 0.04F;
            f2 = f2 * f2;
            GlStateManager.rotate(((float) rendererUpdateCount + partialTicks) * (float) i, 0.0F, 1.0F, 1.0F);
            GlStateManager.scale(1.0F / f2, 1.0F, 1.0F);
            GlStateManager.rotate(-((float) rendererUpdateCount + partialTicks) * (float) i, 0.0F, 1.0F, 1.0F);
        }

        orientCamera(partialTicks);

        if (debugView) {
            switch (debugViewDirection) {
                case 0:
                    GlStateManager.rotate(90.0F, 0.0F, 1.0F, 0.0F);
                    break;
                case 1:
                    GlStateManager.rotate(180.0F, 0.0F, 1.0F, 0.0F);
                    break;
                case 2:
                    GlStateManager.rotate(-90.0F, 0.0F, 1.0F, 0.0F);
                    break;
                case 3:
                    GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                    break;
                case 4:
                    GlStateManager.rotate(-90.0F, 1.0F, 0.0F, 0.0F);
            }
        }
    }

    /**
     * Render player hand
     */
    private void renderHand(float partialTicks, int pass) {
        if (!debugView) {
            GlStateManager.matrixMode(5889);
            GlStateManager.loadIdentity();
            float f = 0.07F;

            if (MC.gameSettings.anaglyph) {
                GlStateManager.translate((float) (-(pass * 2 - 1)) * 0.07F, 0.0F, 0.0F);
            }

            Project.gluPerspective(getFOVModifier(partialTicks, false), (float) MC.displayWidth / (float) MC.displayHeight, 0.05F, farPlaneDistance * 2.0F);
            GlStateManager.matrixMode(5888);
            GlStateManager.loadIdentity();

            if (MC.gameSettings.anaglyph) {
                GlStateManager.translate((float) (pass * 2 - 1) * 0.1F, 0.0F, 0.0F);
            }

            GlStateManager.pushMatrix();
            hurtCameraEffect(partialTicks);

            if (MC.gameSettings.viewBobbing) {
                applyBobbing(partialTicks);
            }

            boolean flag = MC.getRenderViewEntity() instanceof EntityLivingBase && ((EntityLivingBase) MC.getRenderViewEntity()).isPlayerSleeping();

            if (!net.minecraftforge.client.ForgeHooksClient.renderFirstPersonHand(MC.renderGlobal, partialTicks, pass)) {
                if (MC.gameSettings.thirdPersonView == 0 && !flag && !MC.gameSettings.hideGUI && !MC.playerController.isSpectator()) {
                    enableLightmap();
                    itemRenderer.renderItemInFirstPerson(partialTicks);
                    disableLightmap();
                }
            }

            GlStateManager.popMatrix();

            if (MC.gameSettings.thirdPersonView == 0 && !flag) {
                itemRenderer.renderOverlays(partialTicks);
                hurtCameraEffect(partialTicks);
            }

            if (MC.gameSettings.viewBobbing) {
                applyBobbing(partialTicks);
            }
        }
    }

    public void enableLightmap() {
        GlStateManager.setActiveTexture(OpenGlHelper.lightmapTexUnit);
        GlStateManager.matrixMode(5890);
        GlStateManager.loadIdentity();
        float f = 0.00390625F;
        GlStateManager.scale(0.00390625F, 0.00390625F, 0.00390625F);
        GlStateManager.translate(8.0F, 8.0F, 8.0F);
        GlStateManager.matrixMode(5888);
        MC.getTextureManager().bindTexture(locationLightMap);
        GlStateManager.glTexParameteri(3553, 10241, 9729);
        GlStateManager.glTexParameteri(3553, 10240, 9729);
        GlStateManager.glTexParameteri(3553, 10242, 10496);
        GlStateManager.glTexParameteri(3553, 10243, 10496);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        GlStateManager.enableTexture2D();
        GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
    }

    /**
     * Recompute a random value that is applied to block color in updateLightmap()
     */
    private void updateTorchFlicker() {
        torchFlickerDX = (float) ((double) torchFlickerDX + (Math.random() - Math.random()) * Math.random() * Math.random());
        torchFlickerDX = (float) ((double) torchFlickerDX * 0.9D);
        torchFlickerX += torchFlickerDX - torchFlickerX;
        lightmapUpdateNeeded = true;
    }

    private void updateLightmap(float partialTicks) {
        if (lightmapUpdateNeeded) {
            MC.profiler.startSection("lightTex");
            World world = MC.world;

            if (world != null) {
                float f = world.getSunBrightness(1.0F);
                float f1 = f * 0.95F + 0.05F;

                for (int i = 0; i < 256; ++i) {
                    float f2 = world.provider.getLightBrightnessTable()[i / 16] * f1;
                    float f3 = world.provider.getLightBrightnessTable()[i % 16] * (torchFlickerX * 0.1F + 1.5F);

                    if (world.getLastLightningBolt() > 0) {
                        f2 = world.provider.getLightBrightnessTable()[i / 16];
                    }

                    float f4 = f2 * (f * 0.65F + 0.35F);
                    float f5 = f2 * (f * 0.65F + 0.35F);
                    float f6 = f3 * ((f3 * 0.6F + 0.4F) * 0.6F + 0.4F);
                    float f7 = f3 * (f3 * f3 * 0.6F + 0.4F);
                    float f8 = f4 + f3;
                    float f9 = f5 + f6;
                    float f10 = f2 + f7;
                    f8 = f8 * 0.96F + 0.03F;
                    f9 = f9 * 0.96F + 0.03F;
                    f10 = f10 * 0.96F + 0.03F;

                    if (bossColorModifier > 0.0F) {
                        float f11 = bossColorModifierPrev + (bossColorModifier - bossColorModifierPrev) * partialTicks;
                        f8 = f8 * (1.0F - f11) + f8 * 0.7F * f11;
                        f9 = f9 * (1.0F - f11) + f9 * 0.6F * f11;
                        f10 = f10 * (1.0F - f11) + f10 * 0.6F * f11;
                    }

                    if (world.provider.getDimensionType().getId() == 1) {
                        f8 = 0.22F + f3 * 0.75F;
                        f9 = 0.28F + f6 * 0.75F;
                        f10 = 0.25F + f7 * 0.75F;
                    }

                    if (MC.player.isPotionActive(MobEffects.NIGHT_VISION)) {
                        float f15 = getNightVisionBrightness(MC.player, partialTicks);
                        float f12 = 1.0F / f8;

                        if (f12 > 1.0F / f9) {
                            f12 = 1.0F / f9;
                        }

                        if (f12 > 1.0F / f10) {
                            f12 = 1.0F / f10;
                        }

                        f8 = f8 * (1.0F - f15) + f8 * f12 * f15;
                        f9 = f9 * (1.0F - f15) + f9 * f12 * f15;
                        f10 = f10 * (1.0F - f15) + f10 * f12 * f15;
                    }

                    if (f8 > 1.0F) {
                        f8 = 1.0F;
                    }

                    if (f9 > 1.0F) {
                        f9 = 1.0F;
                    }

                    if (f10 > 1.0F) {
                        f10 = 1.0F;
                    }

                    float f16 = MC.gameSettings.gammaSetting;
                    float f17 = 1.0F - f8;
                    float f13 = 1.0F - f9;
                    float f14 = 1.0F - f10;
                    f17 = 1.0F - f17 * f17 * f17 * f17;
                    f13 = 1.0F - f13 * f13 * f13 * f13;
                    f14 = 1.0F - f14 * f14 * f14 * f14;
                    f8 = f8 * (1.0F - f16) + f17 * f16;
                    f9 = f9 * (1.0F - f16) + f13 * f16;
                    f10 = f10 * (1.0F - f16) + f14 * f16;
                    f8 = f8 * 0.96F + 0.03F;
                    f9 = f9 * 0.96F + 0.03F;
                    f10 = f10 * 0.96F + 0.03F;

                    if (f8 > 1.0F) {
                        f8 = 1.0F;
                    }

                    if (f9 > 1.0F) {
                        f9 = 1.0F;
                    }

                    if (f10 > 1.0F) {
                        f10 = 1.0F;
                    }

                    if (f8 < 0.0F) {
                        f8 = 0.0F;
                    }

                    if (f9 < 0.0F) {
                        f9 = 0.0F;
                    }

                    if (f10 < 0.0F) {
                        f10 = 0.0F;
                    }

                    int j = 255;
                    int k = (int) (f8 * 255.0F);
                    int l = (int) (f9 * 255.0F);
                    int i1 = (int) (f10 * 255.0F);
                    lightmapColors[i] = -16777216 | k << 16 | l << 8 | i1;
                }

                lightmapTexture.updateDynamicTexture();
                lightmapUpdateNeeded = false;
                MC.profiler.endSection();
            }
        }
    }

    private float getNightVisionBrightness(EntityLivingBase entitylivingbaseIn, float partialTicks) {
        int i = Objects.requireNonNull(entitylivingbaseIn.getActivePotionEffect(MobEffects.NIGHT_VISION)).getDuration();
        return i > 200 ? 1.0F : 0.7F + MathHelper.sin(((float) i - partialTicks) * (float) Math.PI * 0.2F) * 0.3F;
    }

    public void updateCameraAndRender(float partialTicks, long nanoTime) {


        boolean flag = Display.isActive();

        if (!flag && MC.gameSettings.pauseOnLostFocus && (!MC.gameSettings.touchscreen || !Mouse.isButtonDown(1))) {
            if (Minecraft.getSystemTime() - prevFrameTime > 500L) {
                MC.displayInGameMenu();
            }
        } else {
            prevFrameTime = Minecraft.getSystemTime();
        }

        MC.profiler.startSection("mouse");

        if (flag && Minecraft.IS_RUNNING_ON_MAC && MC.inGameHasFocus && !Mouse.isInsideWindow()) {
            Mouse.setGrabbed(false);
            Mouse.setCursorPosition(Display.getWidth() / 2, Display.getHeight() / 2 - 20);
            Mouse.setGrabbed(true);
        }

        if (MC.inGameHasFocus && flag) {
            MC.mouseHelper.mouseXYChange();
            MC.getTutorial().handleMouse(MC.mouseHelper);
            float f = MC.gameSettings.mouseSensitivity * 0.6F + 0.2F;


            float f1 = f * f * f * 8.0F;
            float f2 = (float) MC.mouseHelper.deltaX * f1;
            float f3 = (float) MC.mouseHelper.deltaY * f1;
            int i = 1;

            if (MC.gameSettings.invertMouse) {
                i = -1;
            }

            if (MC.gameSettings.smoothCamera) {
                smoothCamYaw += f2;
                smoothCamPitch += f3;
                float f4 = partialTicks - smoothCamPartialTicks;
                smoothCamPartialTicks = partialTicks;
                f2 = smoothCamFilterX * f4;
                f3 = smoothCamFilterY * f4;
                MC.player.turn(f2, f3 * (float) i);
            } else {
                smoothCamYaw = 0.0F;
                smoothCamPitch = 0.0F;
                MC.player.turn(f2, f3 * (float) i);
            }
        }

        MC.profiler.endSection();

        if (!MC.skipRenderWorld) {
            anaglyphEnable = MC.gameSettings.anaglyph;
            final ScaledResolution scaledresolution = new ScaledResolution(MC);
            int i1 = scaledresolution.getScaledWidth();
            int j1 = scaledresolution.getScaledHeight();
            final int k1 = Mouse.getX() * i1 / MC.displayWidth;
            final int l1 = j1 - Mouse.getY() * j1 / MC.displayHeight - 1;
            int i2 = MC.gameSettings.limitFramerate;

            /**
             * End time of last renderer (ns)
             */
            long renderEndNanoTime;
            if (MC.world != null) {
                MC.profiler.startSection("level");
                int j = Math.min(Minecraft.getDebugFPS(), i2);
                j = Math.max(j, 60);
                long k = System.nanoTime() - nanoTime;
                long l = Math.max((long) (1000000000 / j / 4) - k, 0L);
                renderWorld(partialTicks, System.nanoTime() + l);

                if (MC.isSingleplayer() && timeWorldIcon < Minecraft.getSystemTime() - 1000L) {
                    timeWorldIcon = Minecraft.getSystemTime();

                }

                if (OpenGlHelper.shadersSupported) {
                    MC.renderGlobal.renderEntityOutlineFramebuffer();

                    if (shaderGroup != null && useShader) {
                        GlStateManager.matrixMode(5890);
                        GlStateManager.pushMatrix();
                        GlStateManager.loadIdentity();
                        shaderGroup.render(partialTicks);
                        GlStateManager.popMatrix();
                    }

                    MC.getFramebuffer().bindFramebuffer(true);
                }

                renderEndNanoTime = System.nanoTime();
                MC.profiler.endStartSection("gui");

                if (!MC.gameSettings.hideGUI || MC.currentScreen != null) {
                    GlStateManager.alphaFunc(516, 0.1F);
                    setupOverlayRendering();
                    renderItemActivation(i1, j1, partialTicks);
                    MC.ingameGUI.renderGameOverlay(partialTicks);
                }

                MC.profiler.endSection();
            } else {
                GlStateManager.viewport(0, 0, MC.displayWidth, MC.displayHeight);
                GlStateManager.matrixMode(5889);
                GlStateManager.loadIdentity();
                GlStateManager.matrixMode(5888);
                GlStateManager.loadIdentity();
                setupOverlayRendering();
                renderEndNanoTime = System.nanoTime();
                // Forge: Fix MC-112292
                net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher.instance.renderEngine = MC.getTextureManager();
                // Forge: also fix rendering text before entering world (not part of MC-112292, but the same reason)
                net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher.instance.fontRenderer = MC.fontRenderer;
            }

            if (MC.currentScreen != null) {
                GlStateManager.clear(256);

                try {
                    net.minecraftforge.client.ForgeHooksClient.drawScreen(MC.currentScreen, k1, l1, MC.getTickLength());
                } catch (Throwable throwable) {
                    CrashReport crashreport = CrashReport.makeCrashReport(throwable, "Rendering screen");
                    CrashReportCategory crashreportcategory = crashreport.makeCategory("Screen renderer details");
                    crashreportcategory.addDetail("Screen name", new ICrashReportDetail<String>() {
                        public String call() throws Exception {
                            return MC.currentScreen.getClass().getCanonicalName();
                        }
                    });
                    crashreportcategory.addDetail("Mouse location", new ICrashReportDetail<String>() {
                        public String call() throws Exception {
                            return String.format("Scaled: (%d, %d). Absolute: (%d, %d)", Integer.valueOf(k1), Integer.valueOf(l1), Integer.valueOf(Mouse.getX()), Integer.valueOf(Mouse.getY()));
                        }
                    });
                    crashreportcategory.addDetail("Screen size", new ICrashReportDetail<String>() {
                        public String call() throws Exception {
                            return String.format("Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %d", Integer.valueOf(scaledresolution.getScaledWidth()), Integer.valueOf(scaledresolution.getScaledHeight()), Integer.valueOf(MC.displayWidth), Integer.valueOf(MC.displayHeight), Integer.valueOf(scaledresolution.getScaleFactor()));
                        }
                    });
                    throw new ReportedException(crashreport);
                }
            }
        }
    }

    public void renderStreamIndicator(float partialTicks) {
        setupOverlayRendering();
    }

    private boolean isDrawBlockOutline() {
        boolean drawBlockOutline = true;
        if (!drawBlockOutline) {
            return false;
        } else {
            Entity entity = MC.getRenderViewEntity();
            boolean flag = entity instanceof EntityPlayer && !MC.gameSettings.hideGUI;

            if (flag && !((EntityPlayer) entity).capabilities.allowEdit) {
                ItemStack itemstack = ((EntityPlayer) entity).getHeldItemMainhand();

                if (MC.objectMouseOver != null && MC.objectMouseOver.typeOfHit == RayTraceResult.Type.BLOCK) {
                    BlockPos blockpos = MC.objectMouseOver.getBlockPos();
                    Block block = MC.world.getBlockState(blockpos).getBlock();

                    if (MC.playerController.getCurrentGameType() == GameType.SPECTATOR) {
                        flag = block.hasTileEntity(MC.world.getBlockState(blockpos)) && MC.world.getTileEntity(blockpos) instanceof IInventory;
                    } else {
                        flag = !itemstack.isEmpty() && (itemstack.canDestroy(block) || itemstack.canPlaceOn(block));
                    }
                }
            }

            return flag;
        }
    }

    public void renderWorld(float partialTicks, long finishTimeNano) {

        updateLightmap(partialTicks);

        if (MC.getRenderViewEntity() == null) {
            MC.setRenderViewEntity(MC.player);
        }

        getMouseOver(partialTicks);
        GlStateManager.enableDepth();
        GlStateManager.enableAlpha();
        GlStateManager.alphaFunc(516, 0.5F);
        MC.profiler.startSection("center");

        if (MC.gameSettings.anaglyph) {
            anaglyphField = 0;
            GlStateManager.colorMask(false, true, true, false);
            renderWorldPass(0, partialTicks, finishTimeNano);
            anaglyphField = 1;
            GlStateManager.colorMask(true, false, false, false);
            renderWorldPass(1, partialTicks, finishTimeNano);
            GlStateManager.colorMask(true, true, true, false);
        } else {
            renderWorldPass(2, partialTicks, finishTimeNano);
            if (OpenGlHelper.shadersSupported) {
                MC.renderGlobal.renderEntityOutlineFramebuffer();

                if (shaderGroup != null && useShader) {
                    GlStateManager.matrixMode(5890);
                    GlStateManager.pushMatrix();
                    GlStateManager.loadIdentity();

                    shaderGroup.render(partialTicks);
                    GlStateManager.popMatrix();
                }

                MC.getFramebuffer().bindFramebuffer(true);
            }
        }

        MC.profiler.endSection();
    }

    private void renderWorldPass(int pass, float partialTicks, long finishTimeNano) {

        RenderGlobal renderglobal = MC.renderGlobal;
        ParticleManager particlemanager = MC.effectRenderer;
        boolean flag = isDrawBlockOutline();
        GlStateManager.enableCull();
        MC.profiler.endStartSection("clear");
        GlStateManager.viewport(0, 0, MC.displayWidth, MC.displayHeight);
        updateFogColor(partialTicks);
        GlStateManager.clear(16640);
        MC.profiler.endStartSection("camera");
        setupCameraTransform(partialTicks, pass);
        ActiveRenderInfo.updateRenderInfo(MC.player, MC.gameSettings.thirdPersonView == 2);
        MC.profiler.endStartSection("frustum");
        ClippingHelperImpl.getInstance();
        MC.profiler.endStartSection("culling");
        ICamera icamera = new Frustum();
        Entity entity = MC.getRenderViewEntity();
        assert entity != null;
        double d0 = entity.lastTickPosX + (entity.posX - entity.lastTickPosX) * (double) partialTicks;
        double d1 = entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * (double) partialTicks;
        double d2 = entity.lastTickPosZ + (entity.posZ - entity.lastTickPosZ) * (double) partialTicks;
        icamera.setPosition(d0, d1, d2);

        if (MC.gameSettings.renderDistanceChunks >= 4) {
            setupFog(-1, partialTicks);
            MC.profiler.endStartSection("sky");
            GlStateManager.matrixMode(5889);
            GlStateManager.loadIdentity();
            Project.gluPerspective(getFOVModifier(partialTicks, true), (float) MC.displayWidth / (float) MC.displayHeight, 0.05F, farPlaneDistance * 2.0F);
            GlStateManager.matrixMode(5888);
            renderglobal.renderSky(partialTicks, pass);
            GlStateManager.matrixMode(5889);
            GlStateManager.loadIdentity();
            Project.gluPerspective(getFOVModifier(partialTicks, true), (float) MC.displayWidth / (float) MC.displayHeight, 0.05F, farPlaneDistance * MathHelper.SQRT_2);
            GlStateManager.matrixMode(5888);
        }

        setupFog(0, partialTicks);
        GlStateManager.shadeModel(7425);

        if (entity.posY + (double) entity.getEyeHeight() < 128.0D) {
            renderCloudsCheck(renderglobal, partialTicks, pass, d0, d1, d2);
        }

        MC.profiler.endStartSection("prepareterrain");
        setupFog(0, partialTicks);
        MC.getTextureManager().bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
        RenderHelper.disableStandardItemLighting();
        MC.profiler.endStartSection("terrain_setup");
        if (prepareTerrain) {
            renderglobal.setupTerrain(entity, partialTicks, icamera, frameCount++, MC.player.isSpectator());
        }

        if (pass == 0 || pass == 2) {
            MC.profiler.endStartSection("updatechunks");
            MC.renderGlobal.updateChunks(finishTimeNano);
        }

        MC.profiler.endStartSection("terrain");
        GlStateManager.matrixMode(5888);
        GlStateManager.pushMatrix();
        GlStateManager.disableAlpha();
        renderglobal.renderBlockLayer(BlockRenderLayer.SOLID, partialTicks, pass, entity);
        GlStateManager.enableAlpha();
        renderglobal.renderBlockLayer(BlockRenderLayer.CUTOUT_MIPPED, partialTicks, pass, entity);
        MC.getTextureManager().getTexture(TextureMap.LOCATION_BLOCKS_TEXTURE).setBlurMipmap(false, false);
        renderglobal.renderBlockLayer(BlockRenderLayer.CUTOUT, partialTicks, pass, entity);
        MC.getTextureManager().getTexture(TextureMap.LOCATION_BLOCKS_TEXTURE).restoreLastBlurMipmap();
        GlStateManager.shadeModel(7424);
        GlStateManager.alphaFunc(516, 0.1F);

        if (!debugView) {
            GlStateManager.matrixMode(5888);
            GlStateManager.popMatrix();
            GlStateManager.pushMatrix();
            RenderHelper.enableStandardItemLighting();
            MC.profiler.endStartSection("entities");
            net.minecraftforge.client.ForgeHooksClient.setRenderPass(0);
            renderglobal.renderEntities(entity, icamera, partialTicks);
            net.minecraftforge.client.ForgeHooksClient.setRenderPass(0);
            RenderHelper.disableStandardItemLighting();
            disableLightmap();
        }

        GlStateManager.matrixMode(5888);
        GlStateManager.popMatrix();

        if (flag && MC.objectMouseOver != null && !entity.isInsideOfMaterial(Material.WATER)) {
            EntityPlayer entityplayer = (EntityPlayer) entity;
            GlStateManager.disableAlpha();
            MC.profiler.endStartSection("outline");
            if (!net.minecraftforge.client.ForgeHooksClient.onDrawBlockHighlight(renderglobal, entityplayer, MC.objectMouseOver, 0, partialTicks)) {
                renderglobal.drawSelectionBox(entityplayer, MC.objectMouseOver, 0, partialTicks);
            }
            GlStateManager.enableAlpha();
        }

        if (MC.debugRenderer.shouldRender()) {
            MC.debugRenderer.renderDebug(partialTicks, finishTimeNano);
        }

        MC.profiler.endStartSection("destroyProgress");
        GlStateManager.enableBlend();
        GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
        MC.getTextureManager().getTexture(TextureMap.LOCATION_BLOCKS_TEXTURE).setBlurMipmap(false, false);
        renderglobal.drawBlockDamageTexture(Tessellator.getInstance(), Tessellator.getInstance().getBuffer(), entity, partialTicks);
        MC.getTextureManager().getTexture(TextureMap.LOCATION_BLOCKS_TEXTURE).restoreLastBlurMipmap();
        GlStateManager.disableBlend();

        if (!debugView) {
            enableLightmap();
            MC.profiler.endStartSection("litParticles");
            particlemanager.renderLitParticles(entity, partialTicks);
            RenderHelper.disableStandardItemLighting();
            setupFog(0, partialTicks);
            MC.profiler.endStartSection("particles");
            particlemanager.renderParticles(entity, partialTicks);
            disableLightmap();
        }

        GlStateManager.depthMask(false);
        GlStateManager.enableCull();
        MC.profiler.endStartSection("weather");
        renderRainSnow(partialTicks);
        GlStateManager.depthMask(true);
        renderglobal.renderWorldBorder(entity, partialTicks);
        GlStateManager.disableBlend();
        GlStateManager.enableCull();
        GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
        GlStateManager.alphaFunc(516, 0.1F);
        setupFog(0, partialTicks);
        GlStateManager.enableBlend();
        GlStateManager.depthMask(false);
        MC.getTextureManager().bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
        GlStateManager.shadeModel(7425);
        MC.profiler.endStartSection("translucent");
        renderglobal.renderBlockLayer(BlockRenderLayer.TRANSLUCENT, partialTicks, pass, entity);
        if (!debugView) //Only renderer if renderer pass 0 happens as well.
        {
            RenderHelper.enableStandardItemLighting();
            MC.profiler.endStartSection("entities");
            net.minecraftforge.client.ForgeHooksClient.setRenderPass(1);
            renderglobal.renderEntities(entity, icamera, partialTicks);
            // restore blending function changed by RenderGlobal.preRenderDamagedBlocks
            GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
            net.minecraftforge.client.ForgeHooksClient.setRenderPass(-1);
            RenderHelper.disableStandardItemLighting();
        }
        GlStateManager.shadeModel(7424);
        GlStateManager.depthMask(true);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        GlStateManager.disableFog();

        if (entity.posY + (double) entity.getEyeHeight() >= 128.0D) {
            MC.profiler.endStartSection("aboveClouds");
            renderCloudsCheck(renderglobal, partialTicks, pass, d0, d1, d2);
        }

        MC.profiler.endStartSection("forge_render_last");
        net.minecraftforge.client.ForgeHooksClient.dispatchRenderLast(renderglobal, partialTicks);

        MC.profiler.endStartSection("hand");

    }

    private void renderCloudsCheck(RenderGlobal renderGlobalIn, float partialTicks, int pass, double x, double y, double z) {
        if (MC.gameSettings.shouldRenderClouds() != 0) {
            MC.profiler.endStartSection("clouds");
            GlStateManager.matrixMode(5889);
            GlStateManager.loadIdentity();
            Project.gluPerspective(getFOVModifier(partialTicks, true), (float) MC.displayWidth / (float) MC.displayHeight, 0.05F, farPlaneDistance * 4.0F);
            GlStateManager.matrixMode(5888);
            GlStateManager.pushMatrix();
            setupFog(0, partialTicks);
            renderGlobalIn.renderClouds(partialTicks, pass, x, y, z);
            GlStateManager.disableFog();
            GlStateManager.popMatrix();
            GlStateManager.matrixMode(5889);
            GlStateManager.loadIdentity();
            Project.gluPerspective(getFOVModifier(partialTicks, true), (float) MC.displayWidth / (float) MC.displayHeight, 0.05F, farPlaneDistance * MathHelper.SQRT_2);
            GlStateManager.matrixMode(5888);
        }
    }

    private void addRainParticles() {
        float f = MC.world.getRainStrength(1.0F);

        if (!MC.gameSettings.fancyGraphics) {
            f /= 2.0F;
        }

        if (f != 0.0F) {
            random.setSeed((long) rendererUpdateCount * 312987231L);
            Entity entity = MC.getRenderViewEntity();
            World world = MC.world;
            assert entity != null;
            BlockPos blockpos = new BlockPos(entity);
            int i = 10;
            double d0 = 0.0D;
            double d1 = 0.0D;
            double d2 = 0.0D;
            int j = 0;
            int k = (int) (100.0F * f * f);

            if (MC.gameSettings.particleSetting == 1) {
                k >>= 1;
            } else if (MC.gameSettings.particleSetting == 2) {
                k = 0;
            }

            for (int l = 0; l < k; ++l) {
                BlockPos blockpos1 = world.getPrecipitationHeight(blockpos.add(random.nextInt(10) - random.nextInt(10), 0, random.nextInt(10) - random.nextInt(10)));
                Biome biome = world.getBiome(blockpos1);
                BlockPos blockpos2 = blockpos1.down();
                IBlockState iblockstate = world.getBlockState(blockpos2);

                if (blockpos1.getY() <= blockpos.getY() + 10 && blockpos1.getY() >= blockpos.getY() - 10 && biome.canRain() && biome.getTemperature(blockpos1) >= 0.15F) {
                    double d3 = random.nextDouble();
                    double d4 = random.nextDouble();
                    AxisAlignedBB axisalignedbb = iblockstate.getBoundingBox(world, blockpos2);

                    if (iblockstate.getMaterial() != Material.LAVA && iblockstate.getBlock() != Blocks.MAGMA) {
                        if (iblockstate.getMaterial() != Material.AIR) {
                            ++j;

                            if (random.nextInt(j) == 0) {
                                d0 = (double) blockpos2.getX() + d3;
                                d1 = (double) ((float) blockpos2.getY() + 0.1F) + axisalignedbb.maxY - 1.0D;
                                d2 = (double) blockpos2.getZ() + d4;
                            }

                            MC.world.spawnParticle(EnumParticleTypes.WATER_DROP, (double) blockpos2.getX() + d3, (double) ((float) blockpos2.getY() + 0.1F) + axisalignedbb.maxY, (double) blockpos2.getZ() + d4, 0.0D, 0.0D, 0.0D);
                        }
                    } else {
                        MC.world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, (double) blockpos1.getX() + d3, (double) ((float) blockpos1.getY() + 0.1F) - axisalignedbb.minY, (double) blockpos1.getZ() + d4, 0.0D, 0.0D, 0.0D);
                    }
                }
            }

            if (j > 0 && random.nextInt(3) < rainSoundCounter++) {
                rainSoundCounter = 0;

                if (d1 > (double) (blockpos.getY() + 1) && world.getPrecipitationHeight(blockpos).getY() > MathHelper.floor((float) blockpos.getY())) {
                    MC.world.playSound(d0, d1, d2, SoundEvents.WEATHER_RAIN_ABOVE, SoundCategory.WEATHER, 0.1F, 0.5F, false);
                } else {
                    MC.world.playSound(d0, d1, d2, SoundEvents.WEATHER_RAIN, SoundCategory.WEATHER, 0.2F, 1.0F, false);
                }
            }
        }
    }

    /**
     * Render rain and snow
     */
    protected void renderRainSnow(float partialTicks) {
        net.minecraftforge.client.IRenderHandler renderer = MC.world.provider.getWeatherRenderer();
        if (renderer != null) {
            renderer.render(partialTicks, MC.world, MC);
            return;
        }

        float f = MC.world.getRainStrength(partialTicks);

        if (f > 0.0F) {
            enableLightmap();
            Entity entity = MC.getRenderViewEntity();
            World world = MC.world;
            assert entity != null;
            int i = MathHelper.floor(entity.posX);
            int j = MathHelper.floor(entity.posY);
            int k = MathHelper.floor(entity.posZ);
            Tessellator tessellator = Tessellator.getInstance();
            BufferBuilder bufferbuilder = tessellator.getBuffer();
            GlStateManager.disableCull();
            GlStateManager.glNormal3f(0.0F, 1.0F, 0.0F);
            GlStateManager.enableBlend();
            GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
            GlStateManager.alphaFunc(516, 0.1F);
            double d0 = entity.lastTickPosX + (entity.posX - entity.lastTickPosX) * (double) partialTicks;
            double d1 = entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * (double) partialTicks;
            double d2 = entity.lastTickPosZ + (entity.posZ - entity.lastTickPosZ) * (double) partialTicks;
            int l = MathHelper.floor(d1);
            int i1 = 5;

            if (MC.gameSettings.fancyGraphics) {
                i1 = 10;
            }

            int j1 = -1;
            float f1 = (float) rendererUpdateCount + partialTicks;
            bufferbuilder.setTranslation(-d0, -d1, -d2);
            GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
            BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();

            for (int k1 = k - i1; k1 <= k + i1; ++k1) {
                for (int l1 = i - i1; l1 <= i + i1; ++l1) {
                    int i2 = (k1 - k + 16) * 32 + l1 - i + 16;
                    double d3 = (double) rainXCoords[i2] * 0.5D;
                    double d4 = (double) rainYCoords[i2] * 0.5D;
                    blockpos$mutableblockpos.setPos(l1, 0, k1);
                    Biome biome = world.getBiome(blockpos$mutableblockpos);

                    if (biome.canRain() || biome.getEnableSnow()) {
                        int j2 = world.getPrecipitationHeight(blockpos$mutableblockpos).getY();
                        int k2 = j - i1;
                        int l2 = j + i1;

                        if (k2 < j2) {
                            k2 = j2;
                        }

                        if (l2 < j2) {
                            l2 = j2;
                        }

                        int i3 = Math.max(j2, l);

                        if (k2 != l2) {
                            random.setSeed((long) l1 * l1 * 3121 + l1 * 45238971L ^ (long) k1 * k1 * 418711 + k1 * 13761L);
                            blockpos$mutableblockpos.setPos(l1, k2, k1);
                            float f2 = biome.getTemperature(blockpos$mutableblockpos);

                            if (world.getBiomeProvider().getTemperatureAtHeight(f2, j2) >= 0.15F) {
                                if (j1 != 0) {
                                    if (j1 >= 0) {
                                        tessellator.draw();
                                    }

                                    j1 = 0;
                                    MC.getTextureManager().bindTexture(RAIN_TEXTURES);
                                    bufferbuilder.begin(7, DefaultVertexFormats.PARTICLE_POSITION_TEX_COLOR_LMAP);
                                }

                                double d5 = -((double) (rendererUpdateCount + l1 * l1 * 3121 + l1 * 45238971 + k1 * k1 * 418711 + k1 * 13761 & 31) + (double) partialTicks) / 32.0D * (3.0D + random.nextDouble());
                                double d6 = (double) ((float) l1 + 0.5F) - entity.posX;
                                double d7 = (double) ((float) k1 + 0.5F) - entity.posZ;
                                float f3 = MathHelper.sqrt(d6 * d6 + d7 * d7) / (float) i1;
                                float f4 = ((1.0F - f3 * f3) * 0.5F + 0.5F) * f;
                                blockpos$mutableblockpos.setPos(l1, i3, k1);
                                int j3 = world.getCombinedLight(blockpos$mutableblockpos, 0);
                                int k3 = j3 >> 16 & 65535;
                                int l3 = j3 & 65535;
                                bufferbuilder.pos((double) l1 - d3 + 0.5D, l2, (double) k1 - d4 + 0.5D).tex(0.0D, (double) k2 * 0.25D + d5).color(1.0F, 1.0F, 1.0F, f4).lightmap(k3, l3).endVertex();
                                bufferbuilder.pos((double) l1 + d3 + 0.5D, l2, (double) k1 + d4 + 0.5D).tex(1.0D, (double) k2 * 0.25D + d5).color(1.0F, 1.0F, 1.0F, f4).lightmap(k3, l3).endVertex();
                                bufferbuilder.pos((double) l1 + d3 + 0.5D, k2, (double) k1 + d4 + 0.5D).tex(1.0D, (double) l2 * 0.25D + d5).color(1.0F, 1.0F, 1.0F, f4).lightmap(k3, l3).endVertex();
                                bufferbuilder.pos((double) l1 - d3 + 0.5D, k2, (double) k1 - d4 + 0.5D).tex(0.0D, (double) l2 * 0.25D + d5).color(1.0F, 1.0F, 1.0F, f4).lightmap(k3, l3).endVertex();
                            } else {
                                if (j1 != 1) {
                                    if (j1 == 0) {
                                        tessellator.draw();
                                    }

                                    j1 = 1;
                                    MC.getTextureManager().bindTexture(SNOW_TEXTURES);
                                    bufferbuilder.begin(7, DefaultVertexFormats.PARTICLE_POSITION_TEX_COLOR_LMAP);
                                }

                                double d8 = -((float) (rendererUpdateCount & 511) + partialTicks) / 512.0F;
                                double d9 = random.nextDouble() + (double) f1 * 0.01D * (double) ((float) random.nextGaussian());
                                double d10 = random.nextDouble() + (double) (f1 * (float) random.nextGaussian()) * 0.001D;
                                double d11 = (double) ((float) l1 + 0.5F) - entity.posX;
                                double d12 = (double) ((float) k1 + 0.5F) - entity.posZ;
                                float f6 = MathHelper.sqrt(d11 * d11 + d12 * d12) / (float) i1;
                                float f5 = ((1.0F - f6 * f6) * 0.3F + 0.5F) * f;
                                blockpos$mutableblockpos.setPos(l1, i3, k1);
                                int i4 = (world.getCombinedLight(blockpos$mutableblockpos, 0) * 3 + 15728880) / 4;
                                int j4 = i4 >> 16 & 65535;
                                int k4 = i4 & 65535;
                                bufferbuilder.pos((double) l1 - d3 + 0.5D, l2, (double) k1 - d4 + 0.5D).tex(0.0D + d9, (double) k2 * 0.25D + d8 + d10).color(1.0F, 1.0F, 1.0F, f5).lightmap(j4, k4).endVertex();
                                bufferbuilder.pos((double) l1 + d3 + 0.5D, l2, (double) k1 + d4 + 0.5D).tex(1.0D + d9, (double) k2 * 0.25D + d8 + d10).color(1.0F, 1.0F, 1.0F, f5).lightmap(j4, k4).endVertex();
                                bufferbuilder.pos((double) l1 + d3 + 0.5D, k2, (double) k1 + d4 + 0.5D).tex(1.0D + d9, (double) l2 * 0.25D + d8 + d10).color(1.0F, 1.0F, 1.0F, f5).lightmap(j4, k4).endVertex();
                                bufferbuilder.pos((double) l1 - d3 + 0.5D, k2, (double) k1 - d4 + 0.5D).tex(0.0D + d9, (double) l2 * 0.25D + d8 + d10).color(1.0F, 1.0F, 1.0F, f5).lightmap(j4, k4).endVertex();
                            }
                        }
                    }
                }
            }

            if (j1 >= 0) {
                tessellator.draw();
            }

            bufferbuilder.setTranslation(0.0D, 0.0D, 0.0D);
            GlStateManager.enableCull();
            GlStateManager.disableBlend();
            GlStateManager.alphaFunc(516, 0.1F);
            disableLightmap();
        }
    }

    /**
     * Setup orthogonal projection for rendering GUI screen overlays
     */
    public void setupOverlayRendering() {
        ScaledResolution scaledresolution = new ScaledResolution(MC);
        GlStateManager.clear(256);
        GlStateManager.matrixMode(5889);
        GlStateManager.loadIdentity();
        GlStateManager.ortho(0.0D, scaledresolution.getScaledWidth_double(), scaledresolution.getScaledHeight_double(), 0.0D, 1000.0D, 3000.0D);
        GlStateManager.matrixMode(5888);
        GlStateManager.loadIdentity();
        GlStateManager.translate(0.0F, 0.0F, -2000.0F);
    }

    /**
     * calculates fog and calls glClearColor
     */
    private void updateFogColor(float partialTicks) {
        World world = MC.world;
        Entity entity = MC.getRenderViewEntity();
        float f = 0.25F + 0.75F * (float) MC.gameSettings.renderDistanceChunks / 32.0F;
        f = 1.0F - (float) Math.pow(f, 0.25D);
        assert MC.getRenderViewEntity() != null;
        Vec3d vec3d = world.getSkyColor(MC.getRenderViewEntity(), partialTicks);
        float f1 = (float) vec3d.x;
        float f2 = (float) vec3d.y;
        float f3 = (float) vec3d.z;
        Vec3d vec3d1 = world.getFogColor(partialTicks);
        fogColorRed = (float) vec3d1.x;
        fogColorGreen = (float) vec3d1.y;
        fogColorBlue = (float) vec3d1.z;

        if (MC.gameSettings.renderDistanceChunks >= 4) {
            double d0 = MathHelper.sin(world.getCelestialAngleRadians(partialTicks)) > 0.0F ? -1.0D : 1.0D;
            Vec3d vec3d2 = new Vec3d(d0, 0.0D, 0.0D);
            assert entity != null;
            float f5 = (float) entity.getLook(partialTicks).dotProduct(vec3d2);

            if (f5 < 0.0F) {
                f5 = 0.0F;
            }

            if (f5 > 0.0F) {
                float[] afloat = world.provider.calcSunriseSunsetColors(world.getCelestialAngle(partialTicks), partialTicks);

                if (afloat != null) {
                    f5 = f5 * afloat[3];
                    fogColorRed = fogColorRed * (1.0F - f5) + afloat[0] * f5;
                    fogColorGreen = fogColorGreen * (1.0F - f5) + afloat[1] * f5;
                    fogColorBlue = fogColorBlue * (1.0F - f5) + afloat[2] * f5;
                }
            }
        }

        fogColorRed += (f1 - fogColorRed) * f;
        fogColorGreen += (f2 - fogColorGreen) * f;
        fogColorBlue += (f3 - fogColorBlue) * f;
        float f8 = world.getRainStrength(partialTicks);

        if (f8 > 0.0F) {
            float f4 = 1.0F - f8 * 0.5F;
            float f10 = 1.0F - f8 * 0.4F;
            fogColorRed *= f4;
            fogColorGreen *= f4;
            fogColorBlue *= f10;
        }

        float f9 = world.getThunderStrength(partialTicks);

        if (f9 > 0.0F) {
            float f11 = 1.0F - f9 * 0.5F;
            fogColorRed *= f11;
            fogColorGreen *= f11;
            fogColorBlue *= f11;
        }

        assert entity != null;
        IBlockState iblockstate = ActiveRenderInfo.getBlockStateAtEntityViewpoint(MC.world, entity, partialTicks);

        if (cloudFog) {
            Vec3d vec3d3 = world.getCloudColour(partialTicks);
            fogColorRed = (float) vec3d3.x;
            fogColorGreen = (float) vec3d3.y;
            fogColorBlue = (float) vec3d3.z;
        } else {
            //Forge Moved to Block.
            Vec3d viewport = ActiveRenderInfo.projectViewFromEntity(entity, partialTicks);
            BlockPos viewportPos = new BlockPos(viewport);
            IBlockState viewportState = MC.world.getBlockState(viewportPos);
            Vec3d inMaterialColor = viewportState.getBlock().getFogColor(MC.world, viewportPos, viewportState, entity, new Vec3d(fogColorRed, fogColorGreen, fogColorBlue), partialTicks);
            fogColorRed = (float) inMaterialColor.x;
            fogColorGreen = (float) inMaterialColor.y;
            fogColorBlue = (float) inMaterialColor.z;
        }

        float f13 = fogColor2 + (fogColor1 - fogColor2) * partialTicks;
        fogColorRed *= f13;
        fogColorGreen *= f13;
        fogColorBlue *= f13;
        double d1 = (entity.lastTickPosY + (entity.posY - entity.lastTickPosY) * (double) partialTicks) * world.provider.getVoidFogYFactor();

        if (entity instanceof EntityLivingBase && ((EntityLivingBase) entity).isPotionActive(MobEffects.BLINDNESS)) {
            int i = Objects.requireNonNull(((EntityLivingBase) entity).getActivePotionEffect(MobEffects.BLINDNESS)).getDuration();

            if (i < 20) {
                d1 *= 1.0F - (float) i / 20.0F;
            } else {
                d1 = 0.0D;
            }
        }

        if (d1 < 1.0D) {
            if (d1 < 0.0D) {
                d1 = 0.0D;
            }

            d1 = d1 * d1;
            fogColorRed = (float) ((double) fogColorRed * d1);
            fogColorGreen = (float) ((double) fogColorGreen * d1);
            fogColorBlue = (float) ((double) fogColorBlue * d1);
        }

        if (bossColorModifier > 0.0F) {
            float f14 = bossColorModifierPrev + (bossColorModifier - bossColorModifierPrev) * partialTicks;
            fogColorRed = fogColorRed * (1.0F - f14) + fogColorRed * 0.7F * f14;
            fogColorGreen = fogColorGreen * (1.0F - f14) + fogColorGreen * 0.6F * f14;
            fogColorBlue = fogColorBlue * (1.0F - f14) + fogColorBlue * 0.6F * f14;
        }

        if (entity instanceof EntityLivingBase && ((EntityLivingBase) entity).isPotionActive(MobEffects.NIGHT_VISION)) {
            float f15 = getNightVisionBrightness((EntityLivingBase) entity, partialTicks);
            float f6 = 1.0F / fogColorRed;

            if (f6 > 1.0F / fogColorGreen) {
                f6 = 1.0F / fogColorGreen;
            }

            if (f6 > 1.0F / fogColorBlue) {
                f6 = 1.0F / fogColorBlue;
            }

            fogColorRed = fogColorRed * (1.0F - f15) + fogColorRed * f6 * f15;
            fogColorGreen = fogColorGreen * (1.0F - f15) + fogColorGreen * f6 * f15;
            fogColorBlue = fogColorBlue * (1.0F - f15) + fogColorBlue * f6 * f15;
        }

        if (MC.gameSettings.anaglyph) {
            float f16 = (fogColorRed * 30.0F + fogColorGreen * 59.0F + fogColorBlue * 11.0F) / 100.0F;
            float f17 = (fogColorRed * 30.0F + fogColorGreen * 70.0F) / 100.0F;
            float f7 = (fogColorRed * 30.0F + fogColorBlue * 70.0F) / 100.0F;
            fogColorRed = f16;
            fogColorGreen = f17;
            fogColorBlue = f7;
        }

        net.minecraftforge.client.event.EntityViewRenderEvent.FogColors event = new net.minecraftforge.client.event.EntityViewRenderEvent.FogColors(this, entity, iblockstate, partialTicks, fogColorRed, fogColorGreen, fogColorBlue);
        net.minecraftforge.common.MinecraftForge.EVENT_BUS.post(event);

        fogColorRed = event.getRed();
        fogColorGreen = event.getGreen();
        fogColorBlue = event.getBlue();

        GlStateManager.clearColor(fogColorRed, fogColorGreen, fogColorBlue, 0.0F);
    }

    /**
     * Sets up the fog to be rendered. If the arg passed in is -1 the fog starts at 0 and goes to 80% of far plane
     * distance and is used for sky rendering.
     */
    private void setupFog(int startCoords, float partialTicks) {
        Entity entity = MC.getRenderViewEntity();
        setupFogColor(false);
        GlStateManager.glNormal3f(0.0F, -1.0F, 0.0F);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        assert entity != null;
        IBlockState iblockstate = ActiveRenderInfo.getBlockStateAtEntityViewpoint(MC.world, entity, partialTicks);
        float hook = net.minecraftforge.client.ForgeHooksClient.getFogDensity(this, entity, iblockstate, partialTicks, 0.1F);
        if (hook >= 0) {
            GlStateManager.setFogDensity(hook);
        } else if (entity instanceof EntityLivingBase && ((EntityLivingBase) entity).isPotionActive(MobEffects.BLINDNESS)) {
            float f1 = 5.0F;
            int i = Objects.requireNonNull(((EntityLivingBase) entity).getActivePotionEffect(MobEffects.BLINDNESS)).getDuration();

            if (i < 20) {
                f1 = 5.0F + (farPlaneDistance - 5.0F) * (1.0F - (float) i / 20.0F);
            }

            GlStateManager.setFog(GlStateManager.FogMode.LINEAR);

            if (startCoords == -1) {
                GlStateManager.setFogStart(0.0F);
                GlStateManager.setFogEnd(f1 * 0.8F);
            } else {
                GlStateManager.setFogStart(f1 * 0.25F);
                GlStateManager.setFogEnd(f1);
            }

            if (GLContext.getCapabilities().GL_NV_fog_distance) {
                GlStateManager.glFogi(34138, 34139);
            }
        } else if (cloudFog) {
            GlStateManager.setFog(GlStateManager.FogMode.EXP);
            GlStateManager.setFogDensity(0.1F);
        } else if (iblockstate.getMaterial() == Material.WATER) {
            GlStateManager.setFog(GlStateManager.FogMode.EXP);

            if (entity instanceof EntityLivingBase) {
                if (((EntityLivingBase) entity).isPotionActive(MobEffects.WATER_BREATHING)) {
                    GlStateManager.setFogDensity(0.01F);
                } else {
                    GlStateManager.setFogDensity(0.1F - (float) EnchantmentHelper.getRespirationModifier((EntityLivingBase) entity) * 0.03F);
                }
            } else {
                GlStateManager.setFogDensity(0.1F);
            }
        } else if (iblockstate.getMaterial() == Material.LAVA) {
            GlStateManager.setFog(GlStateManager.FogMode.EXP);
            GlStateManager.setFogDensity(2.0F);
        } else {
            float f = farPlaneDistance;
            GlStateManager.setFog(GlStateManager.FogMode.LINEAR);

            if (startCoords == -1) {
                GlStateManager.setFogStart(0.0F);
                GlStateManager.setFogEnd(f);
            } else {
                GlStateManager.setFogStart(f * 0.75F);
                GlStateManager.setFogEnd(f);
            }

            if (GLContext.getCapabilities().GL_NV_fog_distance) {
                GlStateManager.glFogi(34138, 34139);
            }

            if (MC.world.provider.doesXZShowFog((int) entity.posX, (int) entity.posZ) || MC.ingameGUI.getBossOverlay().shouldCreateFog()) {
                GlStateManager.setFogStart(f * 0.05F);
                GlStateManager.setFogEnd(Math.min(f, 192.0F) * 0.5F);
            }
            net.minecraftforge.client.ForgeHooksClient.onFogRender(this, entity, iblockstate, partialTicks, startCoords, f);
        }

        GlStateManager.enableColorMaterial();
        GlStateManager.enableFog();
        GlStateManager.colorMaterial(1028, 4608);
    }

    public void setupFogColor(boolean black) {
        if (black) {
            GlStateManager.glFog(2918, setFogColorBuffer(0.0F, 0.0F, 0.0F, 1.0F));
        } else {
            GlStateManager.glFog(2918, setFogColorBuffer(fogColorRed, fogColorGreen, fogColorBlue, 1.0F));
        }
    }

    /**
     * Update and return fogColorBuffer with the RGBA values passed as arguments
     */
    private FloatBuffer setFogColorBuffer(float red, float green, float blue, float alpha) {
        fogColorBuffer.clear();
        fogColorBuffer.put(red).put(green).put(blue).put(alpha);
        fogColorBuffer.flip();
        return fogColorBuffer;
    }

    public void resetData() {
        itemActivationItem = null;
        mapItemRenderer.clearLoadedMaps();
    }

    public static void drawNameplate(FontRenderer fontRendererIn, String str, float x, float y, float z, int verticalShift, float viewerYaw, float viewerPitch, boolean isThirdPersonFrontal, boolean isSneaking) {
        GlStateManager.pushMatrix();
        GlStateManager.translate(x, y, z);
        GlStateManager.glNormal3f(0.0F, 1.0F, 0.0F);
        GlStateManager.rotate(-viewerYaw, 0.0F, 1.0F, 0.0F);
        GlStateManager.rotate((float) (isThirdPersonFrontal ? -1 : 1) * viewerPitch, 1.0F, 0.0F, 0.0F);
        GlStateManager.scale(-0.025F, -0.025F, 0.025F);
        GlStateManager.disableLighting();
        GlStateManager.depthMask(false);

        if (!isSneaking) {
            GlStateManager.disableDepth();
        }

        GlStateManager.enableBlend();
        GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
        int i = fontRendererIn.getStringWidth(str) / 2;
        GlStateManager.disableTexture2D();
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferbuilder = tessellator.getBuffer();
        bufferbuilder.begin(7, DefaultVertexFormats.POSITION_COLOR);
        bufferbuilder.pos(-i - 1, -1 + verticalShift, 0.0D).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
        bufferbuilder.pos(-i - 1, 8 + verticalShift, 0.0D).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
        bufferbuilder.pos(i + 1, 8 + verticalShift, 0.0D).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
        bufferbuilder.pos(i + 1, -1 + verticalShift, 0.0D).color(0.0F, 0.0F, 0.0F, 0.25F).endVertex();
        tessellator.draw();
        GlStateManager.enableTexture2D();

        if (!isSneaking) {
            fontRendererIn.drawString(str, -fontRendererIn.getStringWidth(str) / 2, verticalShift, 553648127);
            GlStateManager.enableDepth();
        }

        GlStateManager.depthMask(true);
        fontRendererIn.drawString(str, -fontRendererIn.getStringWidth(str) / 2, verticalShift, isSneaking ? 553648127 : -1);
        GlStateManager.enableLighting();
        GlStateManager.disableBlend();
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        GlStateManager.popMatrix();
    }

    public void displayItemActivation(ItemStack p_190565_1_) {
        itemActivationItem = p_190565_1_;
        itemActivationTicks = 40;
        itemActivationOffX = random.nextFloat() * 2.0F - 1.0F;
        itemActivationOffY = random.nextFloat() * 2.0F - 1.0F;
    }

    private void renderItemActivation(int p_190563_1_, int p_190563_2_, float p_190563_3_) {
        if (itemActivationItem != null && itemActivationTicks > 0) {
            int i = 40 - itemActivationTicks;
            float f = ((float) i + p_190563_3_) / 40.0F;
            float f1 = f * f;
            float f2 = f * f1;
            float f3 = 10.25F * f2 * f1 + -24.95F * f1 * f1 + 25.5F * f2 + -13.8F * f1 + 4.0F * f;
            float f4 = f3 * (float) Math.PI;
            float f5 = itemActivationOffX * (float) (p_190563_1_ / 4);
            float f6 = itemActivationOffY * (float) (p_190563_2_ / 4);
            GlStateManager.enableAlpha();
            GlStateManager.pushMatrix();
            GlStateManager.pushAttrib();
            GlStateManager.enableDepth();
            GlStateManager.disableCull();
            RenderHelper.enableStandardItemLighting();
            GlStateManager.translate((float) (p_190563_1_ / 2) + f5 * MathHelper.abs(MathHelper.sin(f4 * 2.0F)), (float) (p_190563_2_ / 2) + f6 * MathHelper.abs(MathHelper.sin(f4 * 2.0F)), -50.0F);
            float f7 = 50.0F + 175.0F * MathHelper.sin(f4);
            GlStateManager.scale(f7, -f7, f7);
            GlStateManager.rotate(900.0F * MathHelper.abs(MathHelper.sin(f4)), 0.0F, 1.0F, 0.0F);
            GlStateManager.rotate(6.0F * MathHelper.cos(f * 8.0F), 1.0F, 0.0F, 0.0F);
            GlStateManager.rotate(6.0F * MathHelper.cos(f * 8.0F), 0.0F, 0.0F, 1.0F);
            MC.getRenderItem().renderItem(itemActivationItem, ItemCameraTransforms.TransformType.FIXED);
            GlStateManager.popAttrib();
            GlStateManager.popMatrix();
            RenderHelper.disableStandardItemLighting();
            GlStateManager.enableCull();
            GlStateManager.disableDepth();
        }
    }

    public void useShader(boolean useShader) {
        this.useShader = useShader;
    }
}
