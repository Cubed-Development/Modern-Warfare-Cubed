package com.paneedah.weaponlib;

import akka.japi.Pair;
import com.google.common.collect.Maps;
import com.paneedah.mwc.skins.CustomSkin;
import com.paneedah.mwc.utils.ModReference;
import com.paneedah.weaponlib.animation.*;
import com.paneedah.weaponlib.animation.DebugPositioner.TransitionConfiguration;
import com.paneedah.weaponlib.animation.MultipartPositioning.Positioner;
import com.paneedah.weaponlib.animation.gui.AnimationGUI;
import com.paneedah.weaponlib.animation.jim.AnimationData;
import com.paneedah.weaponlib.animation.jim.AnimationSet;
import com.paneedah.weaponlib.animation.jim.BBLoader;
import com.paneedah.weaponlib.animation.jim.SingleAnimation;
import com.paneedah.weaponlib.animation.movement.WeaponRotationHandler;
import com.paneedah.weaponlib.command.DebugCommand;
import com.paneedah.weaponlib.compatibility.Interceptors;
import com.paneedah.weaponlib.compatibility.ModelSourceRenderer;
import com.paneedah.weaponlib.config.BalancePackManager;
import com.paneedah.weaponlib.config.ModernConfigManager;
import com.paneedah.weaponlib.jim.util.VMWHooksHandler;
import com.paneedah.weaponlib.render.*;
import com.paneedah.weaponlib.shader.jim.Shader;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.block.model.*;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EnumPlayerModelParts;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHandSide;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeModContainer;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.BufferUtils;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.ARBFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL20;

import javax.annotation.Nullable;
import javax.imageio.ImageIO;
import javax.vecmath.Matrix4f;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.*;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import static com.paneedah.mwc.proxies.ClientProxy.mc;
import static com.paneedah.mwc.utils.ModReference.LOG;

public class WeaponRenderer extends ModelSourceRenderer implements IBakedModel {

	private static final float DEFAULT_RANDOMIZING_RATE = 0.33f;
	private static final float DEFAULT_RANDOMIZING_FIRING_RATE = 20;
	private static final float DEFAULT_RANDOMIZING_ZOOM_RATE = 0.25f;

	private static final float DEFAULT_NORMAL_RANDOMIZING_AMPLITUDE = 0.06f;
	private static final float DEFAULT_ZOOM_RANDOMIZING_AMPLITUDE = 0.005f;
	private static final float DEFAULT_FIRING_RANDOMIZING_AMPLITUDE = 0.03f;

	public static final int DEFAULT_ANIMATION_DURATION = 250;
	private static final int DEFAULT_RECOIL_ANIMATION_DURATION = 100;
	private static final int DEFAULT_SHOOTING_ANIMATION_DURATION = 100;
	private static final int DEFAULT_ITERATION_COMPLETED_ANIMATION_DURATION = 100;
	private static final int DEFAULT_PREPARE_FIRST_LOAD_ITERATION_ANIMATION_DURATION = 100;
	private static final int DEFAULT_ALL_LOAD_ITERATION_ANIMATIONS_COMPLETED_DURATION = 100;

	private static final int INVENTORY_TEXTURE_WIDTH = 128;
	private static final int INVENTORY_TEXTURE_HEIGHT = 128;

	private static final Map<String, ResourceLocation> ARMOR_TEXTURE_RES_MAP = Maps.<String, ResourceLocation>newHashMap();

	private org.apache.commons.lang3.tuple.Pair<? extends IBakedModel, Matrix4f> pair;

	public static class StateDescriptor implements MultipartRenderStateDescriptor<RenderableState, Part, RenderContext<RenderableState>> {
		protected MultipartRenderStateManager<RenderableState, Part, RenderContext<RenderableState>> stateManager;
		protected float rate;
		protected float amplitude = 0.04f;
		private PlayerWeaponInstance instance;

		public StateDescriptor(PlayerWeaponInstance instance, MultipartRenderStateManager<RenderableState, Part, RenderContext<RenderableState>> stateManager, float rate, float amplitude) {
			this.instance = instance;
			this.stateManager = stateManager;
			this.rate = rate;
			this.amplitude = amplitude;
		}

		@Override
		public MultipartRenderStateManager<RenderableState, Part, RenderContext<RenderableState>> getStateManager() {
			return stateManager;
		}
	}

	protected EntityLivingBase player;

	protected TextureManager textureManager;
	
	protected ModelBiped playerBiped = new ModelBiped();

	protected ItemStack itemStack;

	protected ModelResourceLocation resourceLocation;

	public static FloatBuffer atlasMatrix = BufferUtils.createFloatBuffer(16);

	private class WeaponItemOverrideList extends ItemOverrideList {

		public WeaponItemOverrideList(List<ItemOverride> overridesIn) {
			super(overridesIn);
		}

		@Override
		public IBakedModel handleItemState(IBakedModel originalModel, ItemStack stack, World world,
										   EntityLivingBase entity) {
			WeaponRenderer.this.itemStack = stack;
			WeaponRenderer.this.player = entity;
			return super.handleItemState(originalModel, stack, world, entity);
		}
	}

	private ItemOverrideList itemOverrideList = new WeaponItemOverrideList(Collections.emptyList());

	ItemCameraTransforms.TransformType transformType;

	public static class Builder {
	    
        private Random random = new Random();
        
        public boolean threePointOh;
        
        private Vec3d beizer = new Vec3d(0, 3.5, -1);

		private ModelBase model;
		private WavefrontModel bakedModel;
		private String textureName;
		private Consumer<ItemStack> entityPositioning;
		private Consumer<ItemStack> inventoryPositioning;
		private Consumer<RenderContext<RenderableState>> thirdPersonPositioning;

		public Consumer<RenderContext<RenderableState>> firstPersonPositioning;
		private Consumer<RenderContext<RenderableState>> firstPersonPositioningProning;
		private Consumer<RenderContext<RenderableState>> firstPersonPositioningZooming;
		private Consumer<RenderContext<RenderableState>> firstPersonPositioningRunning;
		private Consumer<RenderContext<RenderableState>> firstPersonPositioningModifying;
		private Consumer<RenderContext<RenderableState>> firstPersonPositioningModifyingAlt;
		private Consumer<RenderContext<RenderableState>> firstPersonPositioningRecoiled;
		private Consumer<RenderContext<RenderableState>> firstPersonPositioningProningRecoiled;
		private Consumer<RenderContext<RenderableState>> firstPersonPositioningShooting;
	    private Consumer<RenderContext<RenderableState>> firstPersonPositioningProningShooting;

		private Consumer<RenderContext<RenderableState>> firstPersonPositioningZoomingRecoiled;
		private Consumer<RenderContext<RenderableState>> firstPersonPositioningZoomingShooting;
		private Consumer<RenderContext<RenderableState>> firstPersonPositioningLoadIterationCompleted;

		private Consumer<RenderContext<RenderableState>> firstPersonLeftHandPositioning;
		private Consumer<RenderContext<RenderableState>> firstPersonLeftHandPositioningProning;
		private Consumer<RenderContext<RenderableState>> firstPersonLeftHandPositioningZooming;
		private Consumer<RenderContext<RenderableState>> firstPersonLeftHandPositioningRunning;
		private Consumer<RenderContext<RenderableState>> firstPersonLeftHandPositioningModifying;
		private Consumer<RenderContext<RenderableState>> firstPersonLeftHandPositioningModifyingAlt;
		private Consumer<RenderContext<RenderableState>> firstPersonLeftHandPositioningRecoiled;
		private Consumer<RenderContext<RenderableState>> firstPersonLeftHandPositioningProningRecoiled;
		private Consumer<RenderContext<RenderableState>> firstPersonLeftHandPositioningShooting;
		private Consumer<RenderContext<RenderableState>> firstPersonLeftHandPositioningProningShooting;
		private Consumer<RenderContext<RenderableState>> firstPersonLeftHandPositioningLoadIterationCompleted;

		private Consumer<RenderContext<RenderableState>> firstPersonRightHandPositioning;
		private Consumer<RenderContext<RenderableState>> firstPersonRightHandPositioningProning;
		private Consumer<RenderContext<RenderableState>> firstPersonRightHandPositioningZooming;
		private Consumer<RenderContext<RenderableState>> firstPersonRightHandPositioningRunning;
		private Consumer<RenderContext<RenderableState>> firstPersonRightHandPositioningModifying;
		private Consumer<RenderContext<RenderableState>> firstPersonRightHandPositioningModifyingAlt;
		private Consumer<RenderContext<RenderableState>> firstPersonRightHandPositioningRecoiled;
		private Consumer<RenderContext<RenderableState>> firstPersonRightHandPositioningProningRecoiled;
		private Consumer<RenderContext<RenderableState>> firstPersonRightHandPositioningShooting;
	    private Consumer<RenderContext<RenderableState>> firstPersonRightHandPositioningProningShooting;

	    private Consumer<RenderContext<RenderableState>> firstPersonRightHandPositioningLoadIterationCompleted;

	    
	 
		private List<Transition<RenderContext<RenderableState>>> firstPersonPositioningReloading;
	    private List<Transition<RenderContext<RenderableState>>> firstPersonLeftHandPositioningReloading;
		private List<Transition<RenderContext<RenderableState>>> firstPersonRightHandPositioningReloading;
		
		@Deprecated
	    private List<Transition<RenderContext<RenderableState>>> thirdPersonPositioningReloading;
	    @Deprecated
		private List<Transition<RenderContext<RenderableState>>> thirdPersonLeftHandPositioningReloading;
	    @Deprecated
	    private List<Transition<RenderContext<RenderableState>>> thirdPersonRightHandPositioningReloading;
	        
	    private List<Transition<RenderContext<RenderableState>>> firstPersonPositioningInspecting;
	    private List<Transition<RenderContext<RenderableState>>> firstPersonLeftHandPositioningInspecting;
	    private List<Transition<RenderContext<RenderableState>>> firstPersonRightHandPositioningInspecting;
	    

	    private TransitionContainer compoundReloadContainer = new TransitionContainer();
	    private TransitionContainer compoundReloadEmptyContainer = new TransitionContainer();
	    private TransitionContainer loadEmptyContainer = new TransitionContainer();
	    private TransitionContainer unloadEmptyContainer = new TransitionContainer();
	    public TransitionContainer tacticalReloadContainer = new TransitionContainer();
	    
	    
	    // ADS animations
	    private TransitionContainer compoundReloadADSContainer = new TransitionContainer();
	    
	    private List<Transition<RenderContext<RenderableState>>> firstPersonPositioningDrawing;
        private List<Transition<RenderContext<RenderableState>>> firstPersonLeftHandPositioningDrawing;
        private List<Transition<RenderContext<RenderableState>>> firstPersonRightHandPositioningDrawing;

		private List<Transition<RenderContext<RenderableState>>> firstPersonPositioningUnloading;
		private List<Transition<RenderContext<RenderableState>>> firstPersonLeftHandPositioningUnloading;
		private List<Transition<RenderContext<RenderableState>>> firstPersonRightHandPositioningUnloading;
		
		@Deprecated
	    private List<Transition<RenderContext<RenderableState>>> thirdPersonPositioningUnloading;
	    @Deprecated
		private List<Transition<RenderContext<RenderableState>>> thirdPersonLeftHandPositioningUnloading;
	    @Deprecated
	    private List<Transition<RenderContext<RenderableState>>> thirdPersonRightHandPositioningUnloading;
	        
		private List<Transition<RenderContext<RenderableState>>> firstPersonPositioningLoadIteration;
        private List<Transition<RenderContext<RenderableState>>> firstPersonLeftHandPositioningLoadIteration;
        private List<Transition<RenderContext<RenderableState>>> firstPersonRightHandPositioningLoadIteration;
        
        private List<Transition<RenderContext<RenderableState>>> firstPersonPositioningAllLoadIterationsCompleted;
        private List<Transition<RenderContext<RenderableState>>> firstPersonLeftHandPositioningAllLoadIterationsCompleted;
        private List<Transition<RenderContext<RenderableState>>> firstPersonRightHandPositioningAllLoadIterationsCompleted;

		private long totalReloadingDuration;
		
		private long totalUnloadingDuration;
		private long totalDrawingDuration;
		private long totalLoadIterationDuration;
		


		private int recoilAnimationDuration = DEFAULT_RECOIL_ANIMATION_DURATION;
		private int shootingAnimationDuration = DEFAULT_SHOOTING_ANIMATION_DURATION;
		private int loadIterationCompletedAnimationDuration = DEFAULT_ITERATION_COMPLETED_ANIMATION_DURATION;
	    private int prepareFirstLoadIterationAnimationDuration = DEFAULT_PREPARE_FIRST_LOAD_ITERATION_ANIMATION_DURATION;
	    private int allLoadIterationAnimationsCompletedDuration = DEFAULT_ALL_LOAD_ITERATION_ANIMATIONS_COMPLETED_DURATION;

		private float normalRandomizingRate = DEFAULT_RANDOMIZING_RATE; // movements per second, e.g. 0.25 = 0.25 movements per second = 1 movement in 3 minutes
		private float firingRandomizingRate = DEFAULT_RANDOMIZING_FIRING_RATE; // movements per second, e.g. 20 = 20 movements per second = 1 movement in 50 ms
		private float zoomRandomizingRate = DEFAULT_RANDOMIZING_ZOOM_RATE;

		private float normalRandomizingAmplitude = DEFAULT_NORMAL_RANDOMIZING_AMPLITUDE;
		private float zoomRandomizingAmplitude = DEFAULT_ZOOM_RANDOMIZING_AMPLITUDE;
		private float firingRandomizingAmplitude = DEFAULT_FIRING_RANDOMIZING_AMPLITUDE;

		private LinkedHashMap<Part, Consumer<RenderContext<RenderableState>>> firstPersonCustomPositioning = new LinkedHashMap<>();
	    private LinkedHashMap<Part, Consumer<RenderContext<RenderableState>>> firstPersonCustomPositioningProning = new LinkedHashMap<>();

		private LinkedHashMap<Part, List<Transition<RenderContext<RenderableState>>>> firstPersonCustomPositioningUnloading = new LinkedHashMap<>();
		private LinkedHashMap<Part, List<Transition<RenderContext<RenderableState>>>> firstPersonCustomPositioningReloading = new LinkedHashMap<>();

		@Deprecated
	    private LinkedHashMap<Part, List<Transition<RenderContext<RenderableState>>>> thirdPersonCustomPositioningUnloading = new LinkedHashMap<>();
	    @Deprecated
		private LinkedHashMap<Part, List<Transition<RenderContext<RenderableState>>>> thirdPersonCustomPositioningReloading = new LinkedHashMap<>();
		
	    private LinkedHashMap<Part, List<Transition<RenderContext<RenderableState>>>> firstPersonCustomPositioningLoadIteration = new LinkedHashMap<>();
        private LinkedHashMap<Part, List<Transition<RenderContext<RenderableState>>>> firstPersonCustomPositioningLoadIterationsCompleted = new LinkedHashMap<>();
        private LinkedHashMap<Part, List<Transition<RenderContext<RenderableState>>>> firstPersonCustomPositioningInspecting = new LinkedHashMap<>();
        private LinkedHashMap<Part, List<Transition<RenderContext<RenderableState>>>> firstPersonCustomPositioningDrawing = new LinkedHashMap<>();

		private LinkedHashMap<Part, Consumer<RenderContext<RenderableState>>> firstPersonCustomPositioningRecoiled = new LinkedHashMap<>();
		private LinkedHashMap<Part, Consumer<RenderContext<RenderableState>>> firstPersonCustomPositioningProningRecoiled = new LinkedHashMap<>();
        private LinkedHashMap<Part, Consumer<RenderContext<RenderableState>>> firstPersonCustomPositioningZoomingRecoiled = new LinkedHashMap<>();
		private LinkedHashMap<Part, Consumer<RenderContext<RenderableState>>> firstPersonCustomPositioningZoomingShooting = new LinkedHashMap<>();
	    private LinkedHashMap<Part, Consumer<RenderContext<RenderableState>>> firstPersonCustomPositioningLoadIterationCompleted = new LinkedHashMap<>();

	    private LinkedHashMap<Part, Consumer<RenderContext<RenderableState>>> firstPersonCustomPositioningZooming = new LinkedHashMap<>();

		private List<Transition<RenderContext<RenderableState>>> firstPersonPositioningEjectSpentRound;
		private List<Transition<RenderContext<RenderableState>>> firstPersonLeftHandPositioningEjectSpentRound;
		private List<Transition<RenderContext<RenderableState>>> firstPersonRightHandPositioningEjectSpentRound;
		private LinkedHashMap<Part, List<Transition<RenderContext<RenderableState>>>> firstPersonCustomPositioningEjectSpentRound = new LinkedHashMap<>();

		private List<Transition<RenderContext<RenderableState>>> firstPersonPositioningEjectSpentRoundAimed;
        private List<Transition<RenderContext<RenderableState>>> firstPersonLeftHandPositioningEjectSpentRoundAimed;
        private List<Transition<RenderContext<RenderableState>>> firstPersonRightHandPositioningEjectSpentRoundAimed;
        private LinkedHashMap<Part, List<Transition<RenderContext<RenderableState>>>> firstPersonCustomPositioningEjectSpentRoundAimed = new LinkedHashMap<>();

		private boolean hasRecoilPositioningDefined;
		
		
		
		public Transform firstPersonTransform;
		public Transform firstPersonLeftHandTransform;
		public Transform firstPersonRightHandTransform;
		
		public Transform firstPersonZoomingTransform;
		public Transform firstPersonLeftHandZoomingTransform;
		public Transform firstPersonRightHandZoomingTransform;
		
		

		private boolean compoundReloadUsesTactical;
		private boolean compoundReloadEmptyUsesTactical;
		private boolean hasTacticalReload;
		public boolean isHasTacticalReload() {
			return hasTacticalReload;
		}

		public void setHasTacticalReload(boolean hasTacticalReload) {
			this.hasTacticalReload = hasTacticalReload;
		}

		public boolean isHasUnloadEmpty() {
			return hasUnloadEmpty;
		}

		public void setHasUnloadEmpty(boolean hasUnloadEmpty) {
			this.hasUnloadEmpty = hasUnloadEmpty;
		}

		public boolean isHasLoadEmpty() {
			return hasLoadEmpty;
		}

		public void setHasLoadEmpty(boolean hasLoadEmpty) {
			this.hasLoadEmpty = hasLoadEmpty;
		}

		public boolean isHasCompoundReloadEmpty() {
			return hasCompoundReloadEmpty;
		}

		public void setHasCompoundReloadEmpty(boolean hasCompoundReloadEmpty) {
			this.hasCompoundReloadEmpty = hasCompoundReloadEmpty;
		}

		public boolean isHasCompoundReload() {
			return hasCompoundReload;
		}

		public void setHasCompoundReload(boolean hasCompoundReload) {
			this.hasCompoundReload = hasCompoundReload;
		}

		public boolean isHasLoad() {
			return hasLoad;
		}

		public void setHasLoad(boolean hasLoad) {
			this.hasLoad = hasLoad;
		}

		public boolean isHasUnload() {
			return hasUnload;
		}

		public void setHasUnload(boolean hasUnload) {
			this.hasUnload = hasUnload;
		}

		public boolean isHasDraw() {
			return hasDraw;
		}

		public void setHasDraw(boolean hasDraw) {
			this.hasDraw = hasDraw;
		}

		public boolean isHasInspect() {
			return hasInspect;
		}

		public void setHasInspect(boolean hasInspect) {
			this.hasInspect = hasInspect;
		}


		private boolean hasUnloadEmpty;
		private boolean hasLoadEmpty;
		private boolean hasCompoundReloadEmpty;
		private boolean hasCompoundReload;
		private boolean hasLoad;
		private boolean hasUnload;
		private boolean hasDraw;
		private boolean hasInspect; 
		private boolean hasEjectSpentRound;
		private boolean hasEjectSpentRoundAimed;
		
		

		protected ItemAttachment<Weapon>[] actionPiece; 
		protected Transform actionPieceTransform;
		
		public long getTacticalReloadDuration() {
			return tacticalReloadContainer.getDuration();
		}
		
		public long getCompoundReloadDuration() {
			return compoundReloadContainer.getDuration();
		}
		
		public long getCompoundReloadEmptyDuration() {
			return compoundReloadEmptyContainer.getDuration();
		}

		public Builder withModel(ModelBase model) {
			this.model = model;
			return this;
		}
		public Builder withBakedModel(WavefrontModel bakedModel) {
			this.bakedModel = bakedModel;
			return this;
		}
		
		public Builder withActionPiece(ItemAttachment<Weapon>... attachment) {
			this.actionPiece = attachment;
			return this;
		}
		
		public Builder withActionTransform(Transform transform) {
			this.actionPieceTransform = transform;
			return this;
		}

		@Deprecated
		public Builder withShootingAnimationDuration(int shootingAnimationDuration) {
			this.shootingAnimationDuration = shootingAnimationDuration;
			return this;
		}
		@Deprecated
		public Builder withRecoilAnimationDuration(int recoilAnimationDuration) {
			this.recoilAnimationDuration = recoilAnimationDuration;
			return this;
		}
		@Deprecated
		public Builder withPrepareFirstLoadIterationAnimationDuration(int prepareFirstLoadIterationAnimationDuration) {
            this.prepareFirstLoadIterationAnimationDuration = prepareFirstLoadIterationAnimationDuration;
            return this;
        }
		@Deprecated
        public Builder withAllLoadIterationAnimationsCompletedDuration(int allLoadIterationAnimationsCompletedDuration) {
            this.allLoadIterationAnimationsCompletedDuration = allLoadIterationAnimationsCompletedDuration;
            return this;
        }


		public Builder withNormalRandomizingRate(float normalRandomizingRate) {
			this.normalRandomizingRate = normalRandomizingRate;
			return this;
		}

		public Builder withZoomRandomizingRate(float zoomRandomizingRate) {
			this.zoomRandomizingRate = zoomRandomizingRate;
			return this;
		}

		public Builder withFiringRandomizingRate(float firingRandomizingRate) {
			this.firingRandomizingRate = firingRandomizingRate;
			return this;
		}

		public Builder withFiringRandomizingAmplitude(float firingRandomizingAmplitude) {
			this.firingRandomizingAmplitude = firingRandomizingAmplitude;
			return this;
		}

		public Builder withNormalRandomizingAmplitude(float firingRandomizingRate) {
			this.firingRandomizingRate = firingRandomizingRate;
			return this;
		}

		public Builder withZoomRandomizingAmplitude(float zoomRandomizingAmplitude) {
			this.zoomRandomizingAmplitude = zoomRandomizingAmplitude;
			return this;
		}

		public Builder withTextureName(String textureName) {
			this.textureName = textureName + ".png";
			return this;
		}
		
		public Builder withADSBeizer(Vec3d beizer) {
			this.beizer = beizer;
			return this;
		}

		public Builder withWeaponProximity(float weaponProximity) {
			return this;
		}

		public Builder withYOffsetZoom(float yOffsetZoom) {
			return this;
		}

		public Builder withXOffsetZoom(float xOffsetZoom) {
			return this;
		}

		public Builder withEntityPositioning(Consumer<ItemStack> entityPositioning) {
			this.entityPositioning = entityPositioning;
			return this;
		}

		@Deprecated
		public Builder withInventoryPositioning(Consumer<ItemStack> inventoryPositioning) {
			this.inventoryPositioning = inventoryPositioning;
			return this;
		}

		public Builder withThirdPersonPositioning(Consumer<RenderContext<RenderableState>> thirdPersonPositioning) {
			this.thirdPersonPositioning = thirdPersonPositioning;
			return this;
		}

		public Builder withFirstPersonPositioning(Consumer<RenderContext<RenderableState>> firstPersonPositioning) {
			this.firstPersonPositioning = firstPersonPositioning;
			return this;
		}
		
		
		
		
		
		public Builder withFirstPersonPositioningProning(Consumer<RenderContext<RenderableState>> firstPersonPositioningProning) {
		    this.firstPersonPositioningProning = firstPersonPositioningProning;
		    return this;
		}

		@Deprecated
		public Builder withFirstPersonPositioningRunning(Consumer<RenderContext<RenderableState>> firstPersonPositioningRunning) {
			//this.firstPersonPositioningRunning = firstPersonPositioningRunning;
			return this;
		}

		public Builder withFirstPersonPositioningZooming(Consumer<RenderContext<RenderableState>> firstPersonPositioningZooming) {
			this.firstPersonPositioningZooming = firstPersonPositioningZooming;
			return this;
		}

		@Deprecated
		public Builder withFirstPersonPositioningRecoiled(Consumer<RenderContext<RenderableState>> firstPersonPositioningRecoiled) {
			//this.hasRecoilPositioningDefined = true;
			//this.firstPersonPositioningRecoiled = firstPersonPositioningRecoiled;
			return this;
		}
		
		@Deprecated
		public Builder withFirstPersonPositioningProningRecoiled(Consumer<RenderContext<RenderableState>> firstPersonPositioningProningRecoiled) {
		   // this.firstPersonPositioningProningRecoiled = firstPersonPositioningProningRecoiled;
		    return this;
		}

		public Builder withFirstPersonPositioningShooting(Consumer<RenderContext<RenderableState>> firstPersonPositioningShooting) {
			this.firstPersonPositioningShooting = firstPersonPositioningShooting;
			return this;
		}

		public Builder withFirstPersonPositioningProningShooting(Consumer<RenderContext<RenderableState>> firstPersonPositioningProningShooting) {
		    this.firstPersonPositioningProningShooting = firstPersonPositioningProningShooting;
		    return this;
		}

		@Deprecated
		public Builder withFirstPersonPositioningZoomingRecoiled(Consumer<RenderContext<RenderableState>> firstPersonPositioningZoomingRecoiled) {
			//this.firstPersonPositioningZoomingRecoiled = firstPersonPositioningZoomingRecoiled;
			return this;
		}

		public Builder withFirstPersonPositioningZoomingShooting(Consumer<RenderContext<RenderableState>> firstPersonPositioningZoomingShooting) {
			this.firstPersonPositioningZoomingShooting = firstPersonPositioningZoomingShooting;
			return this;
		}
		
		public Builder withFirstPersonPositioningLoadIterationCompleted(Consumer<RenderContext<RenderableState>> firstPersonPositioningLoadIterationCompleted) {
            this.firstPersonPositioningLoadIterationCompleted = firstPersonPositioningLoadIterationCompleted;
            return this;
        }
		
		public final Builder withFirstPersonPositioningReloadingNew(List<Transition<RenderContext<RenderableState>>> transitions) {
			
			this.firstPersonPositioningReloading = transitions;
			return this;
		}

		@SafeVarargs
		public final Builder withFirstPersonPositioningReloading(Transition<RenderContext<RenderableState>> ...transitions) {
			this.firstPersonPositioningReloading = Arrays.asList(transitions);
			return this;
		}

		@SafeVarargs
		public final Builder withFirstPersonPositioningUnloading(Transition<RenderContext<RenderableState>> ...transitions) {
			this.firstPersonPositioningUnloading = Arrays.asList(transitions);
			return this;
		}
		
		public final Builder withFirstPersonPositioningUnloading(List<Transition<RenderContext<RenderableState>>> transitions) {
			this.firstPersonPositioningUnloading = transitions;
			return this;
		}
		
		@Deprecated
		@SafeVarargs
        public final Builder withThirdPersonPositioningReloading(Transition<RenderContext<RenderableState>> ...transitions) {
            this.thirdPersonPositioningReloading = Arrays.asList(transitions);
            return this;
        }

        @SafeVarargs
        public final Builder withThirdPersonPositioningUnloading(Transition<RenderContext<RenderableState>> ...transitions) {
            this.thirdPersonPositioningUnloading = Arrays.asList(transitions);
            return this;
        }
		
		@SafeVarargs
        public final Builder withFirstPersonPositioningInspecting(Transition<RenderContext<RenderableState>> ...transitions) {
            this.firstPersonPositioningInspecting = Arrays.asList(transitions);
            return this;
        }
		
		 public final Builder withFirstPersonPositioningInspecting(List<Transition<RenderContext<RenderableState>>> transitions) {
	            this.firstPersonPositioningInspecting = transitions;
	            return this;
	        }
		
		@SafeVarargs
        public final Builder withFirstPersonPositioningDrawing(Transition<RenderContext<RenderableState>> ...transitions) {
            this.firstPersonPositioningDrawing = Arrays.asList(transitions);
            return this;
        }
		
		@SafeVarargs
        public final Builder withFirstPersonPositioningLoadIteration(Transition<RenderContext<RenderableState>> ...transitions) {
            this.firstPersonPositioningLoadIteration = Arrays.asList(transitions);
            return this;
        }
		
		@SafeVarargs
        public final Builder withFirstPersonPositioningAllLoadIterationsCompleted(Transition<RenderContext<RenderableState>> ...transitions) {
            this.firstPersonPositioningAllLoadIterationsCompleted = Arrays.asList(transitions);
            return this;
        }

		@SafeVarargs
		public final Builder withFirstPersonPositioningEjectSpentRound(Transition<RenderContext<RenderableState>> ...transitions) {
			this.firstPersonPositioningEjectSpentRound = Arrays.asList(transitions);
			return this;
		}
		
		@SafeVarargs
        public final Builder withFirstPersonPositioningEjectSpentRoundAimed(Transition<RenderContext<RenderableState>> ...transitions) {
            this.firstPersonPositioningEjectSpentRoundAimed = Arrays.asList(transitions);
            return this;
        }

		public Builder withFirstPersonPositioningModifying(Consumer<RenderContext<RenderableState>> firstPersonPositioningModifying) {
			this.firstPersonPositioningModifying = firstPersonPositioningModifying;
			return this;
		}
		
		public Builder withFirstPersonPositioningModifyingAlt(Consumer<RenderContext<RenderableState>> firstPersonPositioningModifyingAlt) {
            this.firstPersonPositioningModifyingAlt = firstPersonPositioningModifyingAlt;
            return this;
        }


		public Builder withFirstPersonHandPositioning(
				Consumer<RenderContext<RenderableState>> leftHand,
				Consumer<RenderContext<RenderableState>> rightHand)
		{
			this.firstPersonLeftHandPositioning = leftHand;
			this.firstPersonRightHandPositioning = rightHand;
			return this;
		}
		
		public Builder withFirstPersonHandPositioningProning(
		        Consumer<RenderContext<RenderableState>> leftHand,
		        Consumer<RenderContext<RenderableState>> rightHand)
		{
		    this.firstPersonLeftHandPositioningProning = leftHand;
		    this.firstPersonRightHandPositioningProning = rightHand;
		    return this;
		}

		@Deprecated
		public Builder withFirstPersonHandPositioningRunning(
				Consumer<RenderContext<RenderableState>> leftHand,
				Consumer<RenderContext<RenderableState>> rightHand)
		{
			//this.firstPersonLeftHandPositioningRunning = leftHand;
			//this.firstPersonRightHandPositioningRunning = rightHand;
			return this;
		}

		public Builder withFirstPersonHandPositioningZooming(
				Consumer<RenderContext<RenderableState>> leftHand,
				Consumer<RenderContext<RenderableState>> rightHand)
		{
			this.firstPersonLeftHandPositioningZooming = leftHand;
			this.firstPersonRightHandPositioningZooming = rightHand;
			return this;
		}

		@Deprecated
		public Builder withFirstPersonHandPositioningRecoiled(
				Consumer<RenderContext<RenderableState>> leftHand,
				Consumer<RenderContext<RenderableState>> rightHand)
		{
			//this.firstPersonLeftHandPositioningRecoiled = leftHand;
			//this.firstPersonRightHandPositioningRecoiled = rightHand;
			return this;
		}
		
		@Deprecated
		public Builder withFirstPersonHandPositioningProningRecoiled(
		        Consumer<RenderContext<RenderableState>> leftHand,
		        Consumer<RenderContext<RenderableState>> rightHand)
		{
		  //  this.firstPersonLeftHandPositioningProningRecoiled = leftHand;
		  //  this.firstPersonRightHandPositioningProningRecoiled = rightHand;
		    return this;
		}

		public Builder withFirstPersonHandPositioningShooting(
				Consumer<RenderContext<RenderableState>> leftHand,
				Consumer<RenderContext<RenderableState>> rightHand)
		{
			this.firstPersonLeftHandPositioningShooting = leftHand;
			this.firstPersonRightHandPositioningShooting = rightHand;
			return this;
		}
		
		public Builder withFirstPersonHandPositioningProningShooting(
		        Consumer<RenderContext<RenderableState>> leftHand,
		        Consumer<RenderContext<RenderableState>> rightHand)
		{
		    this.firstPersonLeftHandPositioningProningShooting = leftHand;
		    this.firstPersonRightHandPositioningProningShooting = rightHand;
		    return this;
		}
		
		public Builder withFirstPersonHandPositioningLoadIterationCompleted(
                Consumer<RenderContext<RenderableState>> leftHand,
                Consumer<RenderContext<RenderableState>> rightHand)
        {
            this.firstPersonLeftHandPositioningLoadIterationCompleted = leftHand;
            this.firstPersonRightHandPositioningLoadIterationCompleted = rightHand;
            return this;
        }
		
		public final Builder withFirstPersonLeftHandPositioningReloading(List<Transition<RenderContext<RenderableState>>> transitions) {
			this.firstPersonLeftHandPositioningReloading = transitions;
			return this;
		}

		
		
		@SafeVarargs
		public final Builder withFirstPersonLeftHandPositioningReloading(Transition<RenderContext<RenderableState>> ...transitions) {
			this.firstPersonLeftHandPositioningReloading = Arrays.asList(transitions);
			return this;
		}
		
		@Deprecated
		@SafeVarargs
		public final Builder withThirdPersonLeftHandPositioningReloading(Transition<RenderContext<RenderableState>> ...transitions) {
		    this.thirdPersonLeftHandPositioningReloading = Arrays.asList(transitions);
		    return this;
		}
		
		@SafeVarargs
        public final Builder withFirstPersonLeftHandPositioningInspecting(Transition<RenderContext<RenderableState>> ...transitions) {
            this.firstPersonLeftHandPositioningInspecting = Arrays.asList(transitions);
            return this;
        }
		
		public final Builder withFirstPersonLeftHandPositioningInspecting(List<Transition<RenderContext<RenderableState>>> transitions) {
            this.firstPersonLeftHandPositioningInspecting = transitions;
            return this;
        }
		
	      @SafeVarargs
	        public final Builder withFirstPersonLeftHandPositioningDrawing(Transition<RenderContext<RenderableState>> ...transitions) {
	            this.firstPersonLeftHandPositioningDrawing = Arrays.asList(transitions);
	            return this;
	        }

		@SafeVarargs
		public final Builder withFirstPersonLeftHandPositioningEjectSpentRound(Transition<RenderContext<RenderableState>> ...transitions) {
			this.firstPersonLeftHandPositioningEjectSpentRound = Arrays.asList(transitions);
			return this;
		}
		
		@SafeVarargs
        public final Builder withFirstPersonLeftHandPositioningEjectSpentRoundAimed(Transition<RenderContext<RenderableState>> ...transitions) {
            this.firstPersonLeftHandPositioningEjectSpentRoundAimed = Arrays.asList(transitions);
            return this;
        }

		@SafeVarargs
		public final Builder withFirstPersonLeftHandPositioningUnloading(Transition<RenderContext<RenderableState>> ...transitions) {
			this.firstPersonLeftHandPositioningUnloading = Arrays.asList(transitions);
			return this;
		}
		
		public final Builder withFirstPersonLeftHandPositioningUnloading(List<Transition<RenderContext<RenderableState>>> transitions) {
			this.firstPersonLeftHandPositioningUnloading = transitions;
			return this;
		}
		
		@SafeVarargs
		public final Builder withThirdPersonLeftHandPositioningUnloading(Transition<RenderContext<RenderableState>> ...transitions) {
		    this.thirdPersonLeftHandPositioningUnloading = Arrays.asList(transitions);
		    return this;
		}
		
		@SafeVarargs
        public final Builder withFirstPersonLeftHandPositioningLoadIteration(Transition<RenderContext<RenderableState>> ...transitions) {
            this.firstPersonLeftHandPositioningLoadIteration = Arrays.asList(transitions);
            return this;
        }
		
		@SafeVarargs
        public final Builder withFirstPersonLeftHandPositioningAllLoadIterationsCompleted(Transition<RenderContext<RenderableState>> ...transitions) {
            this.firstPersonLeftHandPositioningAllLoadIterationsCompleted = Arrays.asList(transitions);
            return this;
        }

		@SafeVarargs
		public final Builder withFirstPersonRightHandPositioningReloading(Transition<RenderContext<RenderableState>> ...transitions) {
			this.firstPersonRightHandPositioningReloading = Arrays.asList(transitions);
			return this;
		}
		
		@Deprecated
		@SafeVarargs
		public final Builder withThirdPersonRightHandPositioningReloading(Transition<RenderContext<RenderableState>> ...transitions) {
		    this.thirdPersonRightHandPositioningReloading = Arrays.asList(transitions);
		    return this;
		}

		@SafeVarargs
		public final Builder withFirstPersonRightHandPositioningUnloading(Transition<RenderContext<RenderableState>> ...transitions) {
			this.firstPersonRightHandPositioningUnloading = Arrays.asList(transitions);
			return this;
		}
		
		public final Builder withFirstPersonRightHandPositioningUnloading(List<Transition<RenderContext<RenderableState>>> transitions) {
			this.firstPersonRightHandPositioningUnloading = transitions;
			return this;
		}
		
		@Deprecated
		@SafeVarargs
		public final Builder withThirdPersonRightHandPositioningUnloading(Transition<RenderContext<RenderableState>> ...transitions) {
		    this.thirdPersonRightHandPositioningUnloading = Arrays.asList(transitions);
		    return this;
		}
		
		@SafeVarargs
        public final Builder withFirstPersonRightHandPositioningInspecting(Transition<RenderContext<RenderableState>> ...transitions) {
            this.firstPersonRightHandPositioningInspecting = Arrays.asList(transitions);
            return this;
        }
		
		   public final Builder withFirstPersonRightHandPositioningInspecting(List<Transition<RenderContext<RenderableState>>> transitions) {
	            this.firstPersonRightHandPositioningInspecting = transitions;
	            return this;
	        }
		
		@SafeVarargs
		public final Builder withFirstPersonRightHandPositioningDrawing(Transition<RenderContext<RenderableState>> ...transitions) {
		    this.firstPersonRightHandPositioningDrawing = Arrays.asList(transitions);
		    return this;
		}

		@SafeVarargs
		public final Builder withFirstPersonRightHandPositioningEjectSpentRound(Transition<RenderContext<RenderableState>> ...transitions) {
			this.firstPersonRightHandPositioningEjectSpentRound = Arrays.asList(transitions);
			return this;
		}
		
		@SafeVarargs
        public final Builder withFirstPersonRightHandPositioningEjectSpentRoundAimed(Transition<RenderContext<RenderableState>> ...transitions) {
            this.firstPersonRightHandPositioningEjectSpentRoundAimed = Arrays.asList(transitions);
            return this;
        }
		
		@SafeVarargs
        public final Builder withFirstPersonRightHandPositioningLoadIteration(Transition<RenderContext<RenderableState>> ...transitions) {
            this.firstPersonRightHandPositioningLoadIteration = Arrays.asList(transitions);
            return this;
        }
        
        @SafeVarargs
        public final Builder withFirstPersonRightHandPositioningAllLoadIterationsCompleted(Transition<RenderContext<RenderableState>> ...transitions) {
            this.firstPersonRightHandPositioningAllLoadIterationsCompleted = Arrays.asList(transitions);
            return this;
        }

		public Builder withFirstPersonHandPositioningModifying(
				Consumer<RenderContext<RenderableState>> leftHand,
				Consumer<RenderContext<RenderableState>> rightHand)
		{
			this.firstPersonLeftHandPositioningModifying = leftHand;
			this.firstPersonRightHandPositioningModifying = rightHand;
			return this;
		}
		
		public Builder withFirstPersonHandPositioningModifyingAlt(
                Consumer<RenderContext<RenderableState>> leftHand,
                Consumer<RenderContext<RenderableState>> rightHand)
        {
            this.firstPersonLeftHandPositioningModifyingAlt = leftHand;
            this.firstPersonRightHandPositioningModifyingAlt = rightHand;
            return this;
        }

		public Builder withFirstPersonCustomPositioning(Part part, Consumer<RenderContext<RenderableState>> positioning) {
			if(part instanceof DefaultPart) {
				throw new IllegalArgumentException("Part " + part + " is not custom");
			}
			if(this.firstPersonCustomPositioning.put(part, positioning) != null) {
				throw new IllegalArgumentException("Part " + part + " already added");
			}
			return this;
		}
		
		public Builder withFirstPersonCustomPositioningProning(Part part, Consumer<RenderContext<RenderableState>> positioning) {
		    if(part instanceof DefaultPart) {
		        throw new IllegalArgumentException("Part " + part + " is not custom");
		    }
		    if(this.firstPersonCustomPositioningProning.put(part, positioning) != null) {
		        throw new IllegalArgumentException("Part " + part + " already added");
		    }
		    return this;
		}
		
		public Builder withFirstPersonCustomPositioningZooming(Part part, Consumer<RenderContext<RenderableState>> positioning) {
            if(part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }
            if(this.firstPersonCustomPositioningZooming.put(part, positioning) != null) {
                throw new IllegalArgumentException("Part " + part + " already added");
            }
            return this;
        }

		@Deprecated
		public Builder withFirstPersonPositioningCustomRecoiled(Part part, Consumer<RenderContext<RenderableState>> positioning) {
		/*
			if(part instanceof DefaultPart) {
				throw new IllegalArgumentException("Part " + part + " is not custom");
			}
			if(this.firstPersonCustomPositioningRecoiled.put(part, positioning) != null) {
				throw new IllegalArgumentException("Part " + part + " already added");
			}*/
			return this;
		}
		
		@Deprecated
		public Builder withFirstPersonPositioningCustomProningRecoiled(Part part, Consumer<RenderContext<RenderableState>> positioning) {
		    /*
			if(part instanceof DefaultPart) {
		        throw new IllegalArgumentException("Part " + part + " is not custom");
		    }
		    if(this.firstPersonCustomPositioningProningRecoiled.put(part, positioning) != null) {
		        throw new IllegalArgumentException("Part " + part + " already added");
		    }*/
		    return this;
		}

		public Builder withFirstPersonPositioningCustomZoomingShooting(Part part, Consumer<RenderContext<RenderableState>> positioning) {
			if(part instanceof DefaultPart) {
				throw new IllegalArgumentException("Part " + part + " is not custom");
			}
			if(this.firstPersonCustomPositioningZoomingShooting.put(part, positioning) != null) {
				throw new IllegalArgumentException("Part " + part + " already added");
			}
			return this;
		}
		
		
		@Deprecated
		public Builder withFirstPersonPositioningCustomZoomingRecoiled(Part part, Consumer<RenderContext<RenderableState>> positioning) {
			/*
			if(part instanceof DefaultPart) {
				throw new IllegalArgumentException("Part " + part + " is not custom");
			}
			if(this.firstPersonCustomPositioningZoomingRecoiled.put(part, positioning) != null) {
				throw new IllegalArgumentException("Part " + part + " already added");
			}*/
			return this;
		}

		@SafeVarargs
		public final Builder withFirstPersonCustomPositioningReloading(Part part, Transition<RenderContext<RenderableState>> ...transitions) {
			if(part instanceof DefaultPart) {
				throw new IllegalArgumentException("Part " + part + " is not custom");
			}

			this.firstPersonCustomPositioningReloading.put(part, Arrays.asList(transitions));
			return this;
		}
		
		public final Builder withFirstPersonCustomPositioningReloading(Part part, List<Transition<RenderContext<RenderableState>>> transitions) {
			if(part instanceof DefaultPart) {
				throw new IllegalArgumentException("Part " + part + " is not custom");
			}

			this.firstPersonCustomPositioningReloading.put(part, transitions);
			return this;
		}
		
		
		
		@Deprecated
	      @SafeVarargs
	      public final Builder withThirdPersonCustomPositioningReloading(Part part, Transition<RenderContext<RenderableState>> ...transitions) {
	          if(part instanceof DefaultPart) {
	              throw new IllegalArgumentException("Part " + part + " is not custom");
	          }

	          this.thirdPersonCustomPositioningReloading.put(part, Arrays.asList(transitions));
	          return this;
	      }
	      
		@SafeVarargs
        public final Builder withFirstPersonCustomPositioningInspecting(Part part, Transition<RenderContext<RenderableState>> ...transitions) {
            if(part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }

            this.firstPersonCustomPositioningInspecting.put(part, Arrays.asList(transitions));
            return this;
        }
		
		@SafeVarargs
		public final Builder withFirstPersonCustomPositioningDrawing(Part part, Transition<RenderContext<RenderableState>> ...transitions) {
		    if(part instanceof DefaultPart) {
		        throw new IllegalArgumentException("Part " + part + " is not custom");
		    }

		    this.firstPersonCustomPositioningDrawing.put(part, Arrays.asList(transitions));
		    return this;
		}
		
		public Builder withFirstPersonCustomPositioningLoadIterationCompleted(Part part, Consumer<RenderContext<RenderableState>> positioning) {
            if(part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }
            if(this.firstPersonCustomPositioningLoadIterationCompleted.put(part, positioning) != null) {
                throw new IllegalArgumentException("Part " + part + " already added");
            }
            return this;
        }
		
		public final Builder withFirstPersonCustomPositioningUnloading(Part part, List<Transition<RenderContext<RenderableState>>> transitions) {
			if(part instanceof DefaultPart) {
				throw new IllegalArgumentException("Part " + part + " is not custom");
			}
			this.firstPersonCustomPositioningUnloading.put(part, transitions);
			return this;
		}

		@SafeVarargs
		public final Builder withFirstPersonCustomPositioningUnloading(Part part, Transition<RenderContext<RenderableState>> ...transitions) {
			if(part instanceof DefaultPart) {
				throw new IllegalArgumentException("Part " + part + " is not custom");
			}
			this.firstPersonCustomPositioningUnloading.put(part, Arrays.asList(transitions));
			return this;
		}
		
		@Deprecated
		@SafeVarargs
        public final Builder withThirdPersonCustomPositioningUnloading(Part part, Transition<RenderContext<RenderableState>> ...transitions) {
            if(part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }
            this.thirdPersonCustomPositioningUnloading.put(part, Arrays.asList(transitions));
            return this;
        }

		@SafeVarargs
		public final Builder withFirstPersonCustomPositioningEjectSpentRound(Part part, Transition<RenderContext<RenderableState>> ...transitions) {
			if(part instanceof DefaultPart) {
				throw new IllegalArgumentException("Part " + part + " is not custom");
			}

			this.firstPersonCustomPositioningEjectSpentRound.put(part, Arrays.asList(transitions));
			return this;
		}
		
		public final Builder withFirstPersonCustomPositioningEjectSpentRound(Part part, List<Transition<RenderContext<RenderableState>>> list) {
			if(part instanceof DefaultPart) {
				throw new IllegalArgumentException("Part " + part + " is not custom");
			}

			this.firstPersonCustomPositioningEjectSpentRound.put(part, list);
			return this;
		}
		
		@SafeVarargs
        public final Builder withFirstPersonCustomPositioningEjectSpentRoundAimed(Part part, Transition<RenderContext<RenderableState>> ...transitions) {
            if(part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }

            this.firstPersonCustomPositioningEjectSpentRoundAimed.put(part, Arrays.asList(transitions));
            return this;
        }
		
		public final Builder withFirstPersonCustomPositioningEjectSpentRoundAimed(Part part, List<Transition<RenderContext<RenderableState>>> list) {
            if(part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }

            this.firstPersonCustomPositioningEjectSpentRoundAimed.put(part, list);
            return this;
        }
		
		@SafeVarargs
        public final Builder withFirstPersonCustomPositioningLoadIteration(Part part, Transition<RenderContext<RenderableState>> ...transitions) {
            if(part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }
            this.firstPersonCustomPositioningLoadIteration.put(part, Arrays.asList(transitions));
            return this;
        }
		
		@SafeVarargs
        public final Builder withFirstPersonCustomPositioningAllLoadIterationsCompleted(Part part, Transition<RenderContext<RenderableState>> ...transitions) {
            if(part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }
            this.firstPersonCustomPositioningLoadIterationsCompleted.put(part, Arrays.asList(transitions));
            return this;
        }
		
		public boolean isUsingNewSystem() {
			return this.threePointOh;
		}
		
		public void setUsingThreePointOh() {
			this.threePointOh = true;
		}
		
		public Builder withFirstPersonPositioning(Transform firstPersonTransform) {
			this.firstPersonTransform = firstPersonTransform;
			this.firstPersonPositioning = firstPersonTransform.getAsPosition();
			return this;
		}
		
		public Builder withFPSZooming(Transform zooming) {
			this.firstPersonZoomingTransform = zooming;
			this.firstPersonPositioningZooming = zooming.getAsPosition();
			return this;
		}
		
		public Builder withFirstPersonHandPositioning(Transform leftHand, Transform rightHand)
		{
			
			this.firstPersonLeftHandTransform = leftHand;
			this.firstPersonRightHandTransform = rightHand;
			
			this.firstPersonLeftHandPositioning = leftHand.getAsPosition();
			this.firstPersonRightHandPositioning = rightHand.getAsPosition();
			return this;
		}
		
		public void checkDefaults() {
			if(firstPersonTransform == null) {
				firstPersonTransform = Transform.NULL.copy();
			} 
			if(firstPersonLeftHandTransform == null) {
				firstPersonLeftHandTransform = Transform.NULL.copy();
			}
			if(firstPersonRightHandTransform == null) {
				firstPersonRightHandTransform = Transform.NULL.copy();
			}
		}
		
		
		
		
		private String animationFileName;
		
		public Builder setupModernMagazineAnimations(String animationFile, Part...parts) {
			// .withFirstPersonCustomPositioningReloading(Magazines.M38Mag,
			
			this.setAnimationFileName(animationFile);
			
			for(Part p : parts) {
				//if(!(p instanceof ItemMagazine)) continue;

				Vec3d r = ((ItemMagazine) p).rotationPoint;
				//System.out.println("ROTMAMDFKFKJF FOR MAG: " + r);
				
				if(hasUnloadEmpty) {
					withUnloadEmptyCustom(p, BBLoader.getAnimation(animationFile, BBLoader.KEY_UNLOAD_EMPTY, BBLoader.KEY_MAGAZINE)
							.getTransitionList(Transform.NULL.copy().withRotationPoint(r.x, r.y, r.z), BBLoader.HANDDIVISOR));
				}
				
				if(hasLoadEmpty) {
					withLoadEmptyCustom(p, BBLoader.getAnimation(animationFile, BBLoader.KEY_LOAD_EMPTY, BBLoader.KEY_MAGAZINE)
							.getTransitionList(Transform.NULL.copy().withRotationPoint(r.x, r.y, r.z), BBLoader.HANDDIVISOR));
					
				}
				
				if(hasTacticalReload) {
					withTacticalReloadCustom(p, BBLoader.getAnimation(animationFile, BBLoader.KEY_TACTICAL_RELOAD, BBLoader.KEY_MAGAZINE)
							.getTransitionList(Transform.NULL.copy().withRotationPoint(r.x, r.y, r.z), BBLoader.HANDDIVISOR));
					
				}
				
				if(hasLoad) {
					withFirstPersonCustomPositioningReloading(p, BBLoader.getAnimation(animationFile, BBLoader.KEY_LOAD, BBLoader.KEY_MAGAZINE)
							.getTransitionList(Transform.NULL.copy().withRotationPoint(r.x, r.y, r.z), BBLoader.HANDDIVISOR));
					
				}
				if(hasUnload) {
					withFirstPersonCustomPositioningUnloading(p, BBLoader.getAnimation(animationFile, BBLoader.KEY_UNLOAD, BBLoader.KEY_MAGAZINE)
							.getTransitionList(Transform.NULL.copy().withRotationPoint(r.x, r.y, r.z), BBLoader.HANDDIVISOR));
					
				}
				
				if(hasCompoundReload) {
					withFirstPersonCustomPositioningCompoundReloading(p, BBLoader.getAnimation(animationFile, BBLoader.KEY_COMPOUND_RELOAD, BBLoader.KEY_MAGAZINE)
							.getTransitionList(Transform.NULL.copy().withRotationPoint(r.x, r.y, r.z), BBLoader.HANDDIVISOR));
					
				}
				
				if(hasCompoundReloadEmpty) {
					withFPSCustomCompoundReloadingEmpty(p, BBLoader.getAnimation(animationFile, BBLoader.KEY_COMPOUND_RELOAD_EMPTY, BBLoader.KEY_MAGAZINE)
							.getTransitionList(Transform.NULL.copy().withRotationPoint(r.x, r.y, r.z), BBLoader.HANDDIVISOR));
				
				}
				
				
				
				
		}
			
			
			// Now time to do magic magazine things
			if(hasCompoundReloadEmpty && compoundReloadEmptyUsesTactical) {
				withFPSCustomCompoundReloadingEmpty(SpecialAttachments.MagicMag.getRenderablePart(),
						BBLoader.getAnimation(animationFile, BBLoader.KEY_COMPOUND_RELOAD_EMPTY, BBLoader.KEY_MAGIC_MAGAZINE)
						.getTransitionList(Transform.NULL
								.copy(), BBLoader.HANDDIVISOR));
			}
			if(hasCompoundReload && compoundReloadUsesTactical) {
				withFirstPersonCustomPositioningCompoundReloading(SpecialAttachments.MagicMag.getRenderablePart(), 
						BBLoader.getAnimation(animationFile, BBLoader.KEY_COMPOUND_RELOAD, BBLoader.KEY_MAGIC_MAGAZINE)
						.getTransitionList(Transform.NULL
								.copy(), BBLoader.HANDDIVISOR));
			}
			
			
			return this;
		
		}
		
		public static boolean isOnServer() {
			return FMLCommonHandler.instance().getMinecraftServerInstance().getServerOwner() != null;
		}
		
		
		public Builder setupModernAnimations(String animationFile, ItemAttachment<Weapon> aR15Action) {
			if(VMWHooksHandler.isOnServer()) return this;
			
			final String mainBoneName = "main";
			final String leftBoneName = "lefthand";
			final String rightBoneName = "righthand";
			
			// Makes sure the file is loaded
			
			AnimationSet set = BBLoader.getAnimationSet(animationFile);
			
			
			
			/* ==============
			 * 
			 * Do category checks
			 * 
			 * ==============
			 */
			
			if(set.containsKey(BBLoader.KEY_LOAD_EMPTY)) {
				hasLoadEmpty = true;
			}
			if(set.containsKey(BBLoader.KEY_UNLOAD_EMPTY)) {
				hasUnloadEmpty = true;
			}
			if(set.containsKey(BBLoader.KEY_TACTICAL_RELOAD)) {
				hasTacticalReload = true;
			}
			if(set.containsKey(BBLoader.KEY_COMPOUND_RELOAD)) {
				hasCompoundReload = true;
			}
			if(set.containsKey(BBLoader.KEY_COMPOUND_RELOAD_EMPTY)) {
				hasCompoundReloadEmpty = true;
			}
			if(set.containsKey(BBLoader.KEY_INSPECT)) {
				hasInspect = true;
			}
			if(set.containsKey(BBLoader.KEY_DRAW)) {
				hasDraw = true;
			}
			if(set.containsKey(BBLoader.KEY_LOAD)) {
				hasLoad = true;
			}
			if(set.containsKey(BBLoader.KEY_UNLOAD)) {
				hasUnload = true;
			}
			
			if(set.containsKey(BBLoader.KEY_EJECT_SPENT_ROUND)) hasEjectSpentRound = true;
			
			if(set.containsKey(BBLoader.KEY_EJECT_SPENT_ROUND_AIMED)) hasEjectSpentRoundAimed = true;
			
			// Check if compound & compound empty should use tactical functionality
			SingleAnimation compound = set.getSingleAnimation(BBLoader.KEY_COMPOUND_RELOAD);
			if(compound != null) {
				if(compound.hasBone(BBLoader.KEY_MAGIC_MAGAZINE)) {
					if(compound.getBone(BBLoader.KEY_MAGIC_MAGAZINE).bbTransition.size() > 1) {
						compoundReloadUsesTactical = true;
					}
				}
			}
			
			SingleAnimation compoundEmpty = set.getSingleAnimation(BBLoader.KEY_COMPOUND_RELOAD_EMPTY);
			if(compoundEmpty != null) {
				if(compoundEmpty.hasBone(BBLoader.KEY_MAGIC_MAGAZINE)) {
					if(compoundEmpty.getBone(BBLoader.KEY_MAGIC_MAGAZINE).bbTransition.size() > 1) {
						compoundReloadEmptyUsesTactical = true;
					}
				}
			}
			
			
			if(hasLoadEmpty) {
				setupLoadEmpty(animationFile, BBLoader.KEY_LOAD_EMPTY, mainBoneName, leftBoneName, rightBoneName);
	
				
			}
			if(hasUnloadEmpty) setupUnloadEmpty(animationFile, BBLoader.KEY_UNLOAD_EMPTY, mainBoneName, leftBoneName, rightBoneName);
			if(hasTacticalReload) setupTacticalReload(animationFile, BBLoader.KEY_TACTICAL_RELOAD, mainBoneName, leftBoneName, rightBoneName);
			
			if(hasInspect) setupInspectAnimations(animationFile, BBLoader.KEY_INSPECT, mainBoneName, leftBoneName, rightBoneName);
			if(hasCompoundReload) {
				if(firstPersonZoomingTransform != null) {
					setupModernContainerADS(animationFile, BBLoader.KEY_COMPOUND_RELOAD, this.compoundReloadADSContainer);
				}
				setupCompoundReload(animationFile, BBLoader.KEY_COMPOUND_RELOAD, mainBoneName, leftBoneName, rightBoneName);
			}
			if(hasLoad) setupReload(animationFile, BBLoader.KEY_LOAD, mainBoneName,  leftBoneName, rightBoneName);
			if(hasUnload) setupUnload(animationFile, BBLoader.KEY_UNLOAD, mainBoneName, leftBoneName, rightBoneName);
			if(hasDraw) setupDraw(animationFile, BBLoader.KEY_DRAW, mainBoneName, leftBoneName, rightBoneName);
			if(hasCompoundReloadEmpty) setupCompoundReloadEmpty(animationFile, BBLoader.KEY_COMPOUND_RELOAD_EMPTY, mainBoneName, leftBoneName, rightBoneName);
			if(hasEjectSpentRound) setupModernEjectSpentRoundAnimation(animationFile);
			if(hasEjectSpentRoundAimed) setupModernEjectSpentRoundAimedAnimation(animationFile);
			
			setupCustomKeyedPart(aR15Action, animationFile, BBLoader.KEY_ACTION);
			
			return this;
		}
		
		/*
		public Builder setupModernEjectSpentRoundAllAnimation(ItemAttachment<Weapon> action, String animationFile, String partKey) {
			hasEjectSpentRound = true;
			hasEjectSpentRoundAimed = true;
			
			setupModernEjectSpentRoundAimedAnimation(action, animationFile, partKey);
			setupModernEjectSpentRoundAnimation(action, animationFile, partKey);
			
		//	setupCustomKeyedPart(action, animationFile, BBLoader.KEY_BOLT_ACTION);
			
			return this;
		}*/
			
		
		public Builder setupModernEjectSpentRoundAnimation(String animationFile) {
			if(VMWHooksHandler.isOnServer()) return this;
			
			
			AnimationData main = BBLoader.getAnimation(animationFile, BBLoader.KEY_EJECT_SPENT_ROUND, BBLoader.KEY_MAIN);
			AnimationData left = BBLoader.getAnimation(animationFile, BBLoader.KEY_EJECT_SPENT_ROUND, "lefthand");
			AnimationData right = BBLoader.getAnimation(animationFile, BBLoader.KEY_EJECT_SPENT_ROUND, "righthand");
						
			checkDefaults();
			
			this.firstPersonPositioningEjectSpentRound = main.getTransitionList(firstPersonTransform, BBLoader.GENDIVISOR, false);
			this.firstPersonLeftHandPositioningEjectSpentRound = left.getTransitionList(firstPersonLeftHandTransform, BBLoader.HANDDIVISOR, false);
			this.firstPersonRightHandPositioningEjectSpentRound = right.getTransitionList(firstPersonRightHandTransform, BBLoader.HANDDIVISOR, false);
	
			
			
			return this;
			
		}
		
		public Builder setupModernEjectSpentRoundAimedAnimation(String animationFile) {
			if(VMWHooksHandler.isOnServer()) return this;
			
			
			
			
			AnimationData main = BBLoader.getAnimation(animationFile, BBLoader.KEY_EJECT_SPENT_ROUND, BBLoader.KEY_MAIN);
			AnimationData left = BBLoader.getAnimation(animationFile, BBLoader.KEY_EJECT_SPENT_ROUND, "lefthand");
			AnimationData right = BBLoader.getAnimation(animationFile, BBLoader.KEY_EJECT_SPENT_ROUND, "righthand");
						
			checkDefaults();
			
		
			
			
			
			this.firstPersonPositioningEjectSpentRoundAimed = main.getTransitionList(firstPersonTransform, BBLoader.GENDIVISOR, false);
			this.firstPersonLeftHandPositioningEjectSpentRoundAimed = left.getTransitionList(firstPersonLeftHandTransform, BBLoader.HANDDIVISOR, false);
			this.firstPersonRightHandPositioningEjectSpentRoundAimed = right.getTransitionList(firstPersonRightHandTransform, BBLoader.HANDDIVISOR, false);
	
			
			
			
			return this;
			
		}
		
		
		public Builder setupBoltActionAnimations(ItemAttachment<Weapon> action, String animationFile, String partKey) {
			if(VMWHooksHandler.isOnServer()) return this;
			
			AnimationSet set = BBLoader.getAnimationSet(animationFile);
			
			
			Vec3d rotPoint = action.rotationPoint;
			
			Part aR15Action = action.getRenderablePart();

			if(hasEjectSpentRound && set.getSingleAnimation(BBLoader.KEY_EJECT_SPENT_ROUND).hasBone(partKey)) {
				withFirstPersonCustomPositioningUnloading(aR15Action, BBLoader.getAnimation(animationFile, BBLoader.KEY_EJECT_SPENT_ROUND, partKey)
						.getTransitionList(Transform.NULL.copy().withRotationPoint(rotPoint.x, rotPoint.y, rotPoint.z), BBLoader.HANDDIVISOR));
			}
			
			if(hasEjectSpentRoundAimed && set.getSingleAnimation(BBLoader.KEY_EJECT_SPENT_ROUND_AIMED).hasBone(partKey)) {
				withFirstPersonCustomPositioningUnloading(aR15Action, BBLoader.getAnimation(animationFile, BBLoader.KEY_EJECT_SPENT_ROUND_AIMED, partKey)
						.getTransitionList(Transform.NULL.copy().withRotationPoint(rotPoint.x, rotPoint.y, rotPoint.z), BBLoader.HANDDIVISOR));
			}
			
			return this;
			
			
			
		}
		
		public Builder setupCustomKeyedPart(ItemAttachment<Weapon> action, String animationFile, String partKey) {
			if(VMWHooksHandler.isOnServer()) return this;
			
			AnimationSet set = BBLoader.getAnimationSet(animationFile);
			
			
			Vec3d rotPoint = action.rotationPoint;
			
			Part aR15Action = action.getRenderablePart();
			
			if(hasLoadEmpty && set.getSingleAnimation(BBLoader.KEY_LOAD_EMPTY).hasBone(partKey)) {
				withLoadEmptyCustom(aR15Action, BBLoader.getAnimation(animationFile, BBLoader.KEY_LOAD_EMPTY, partKey)
						.getTransitionList(Transform.NULL.copy().withRotationPoint(rotPoint.x, rotPoint.y, rotPoint.z), BBLoader.HANDDIVISOR));
			}
			
			
			if(hasUnloadEmpty && set.getSingleAnimation(BBLoader.KEY_UNLOAD_EMPTY).hasBone(partKey)) {
				withUnloadEmptyCustom(aR15Action, BBLoader.getAnimation(animationFile, BBLoader.KEY_UNLOAD_EMPTY, partKey)
						.getTransitionList(Transform.NULL.copy().withRotationPoint(rotPoint.x, rotPoint.y, rotPoint.z), BBLoader.HANDDIVISOR));
			}
			
			
			if(hasCompoundReload && set.getSingleAnimation(BBLoader.KEY_COMPOUND_RELOAD).hasBone(partKey)) {
				withFirstPersonCustomPositioningCompoundReloading(aR15Action, BBLoader.getAnimation(animationFile, BBLoader.KEY_COMPOUND_RELOAD, partKey)
						.getTransitionList(Transform.NULL.copy().withRotationPoint(rotPoint.x, rotPoint.y, rotPoint.z), BBLoader.HANDDIVISOR));
			}
			
			if(hasCompoundReloadEmpty && set.getSingleAnimation(BBLoader.KEY_COMPOUND_RELOAD_EMPTY).hasBone(partKey)) {
				withFPSCustomCompoundReloadingEmpty(aR15Action, BBLoader.getAnimation(animationFile, BBLoader.KEY_COMPOUND_RELOAD_EMPTY, partKey)
						.getTransitionList(Transform.NULL.copy().withRotationPoint(rotPoint.x, rotPoint.y, rotPoint.z), BBLoader.HANDDIVISOR));
			}
			
			if(hasTacticalReload && set.getSingleAnimation(BBLoader.KEY_TACTICAL_RELOAD).hasBone(partKey)) {
				withTacticalReloadCustom(aR15Action, BBLoader.getAnimation(animationFile, BBLoader.KEY_TACTICAL_RELOAD, partKey)
						.getTransitionList(Transform.NULL.copy().withRotationPoint(rotPoint.x, rotPoint.y, rotPoint.z), BBLoader.HANDDIVISOR));
			}
			
			if(hasDraw && set.getSingleAnimation(BBLoader.KEY_DRAW).hasBone(partKey)) {
				withFirstPersonCustomPositioningDrawing(aR15Action, BBLoader.getAnimation(animationFile, BBLoader.KEY_DRAW, partKey)
						.getTransitionList(Transform.NULL.copy().withRotationPoint(rotPoint.x, rotPoint.y, rotPoint.z), BBLoader.HANDDIVISOR));
			}
			
			if(hasInspect && set.getSingleAnimation(BBLoader.KEY_INSPECT).hasBone(partKey)) {
				withFirstPersonCustomPositioningInspecting(aR15Action, BBLoader.getAnimation(animationFile, BBLoader.KEY_INSPECT, partKey)
						.getTransitionList(Transform.NULL.copy().withRotationPoint(rotPoint.x, rotPoint.y, rotPoint.z), BBLoader.HANDDIVISOR));
			}
			
			if(hasLoad && set.getSingleAnimation(BBLoader.KEY_LOAD).hasBone(partKey)) {
				withFirstPersonCustomPositioningReloading(aR15Action, BBLoader.getAnimation(animationFile, BBLoader.KEY_LOAD, partKey)
						.getTransitionList(Transform.NULL.copy().withRotationPoint(rotPoint.x, rotPoint.y, rotPoint.z), BBLoader.HANDDIVISOR));
			}
			
			
			if(hasUnload && set.getSingleAnimation(BBLoader.KEY_UNLOAD).hasBone(partKey)) {
				withFirstPersonCustomPositioningUnloading(aR15Action, BBLoader.getAnimation(animationFile, BBLoader.KEY_UNLOAD, partKey)
						.getTransitionList(Transform.NULL.copy().withRotationPoint(rotPoint.x, rotPoint.y, rotPoint.z), BBLoader.HANDDIVISOR));
			}
			
			
			
			if(hasEjectSpentRound && set.getSingleAnimation(BBLoader.KEY_EJECT_SPENT_ROUND).hasBone(partKey)) {
				
				
				List<Transition<RenderContext<RenderableState>>> list = BBLoader.getAnimation(animationFile, BBLoader.KEY_EJECT_SPENT_ROUND, partKey)
						.getTransitionList(Transform.NULL.copy().withRotationPoint(rotPoint.x, rotPoint.y, rotPoint.z), BBLoader.HANDDIVISOR);
				
				
				withFirstPersonCustomPositioningEjectSpentRound(aR15Action, list);
				//withFirstPersonCustomPositioningUnloading(aR15Action, list);
			}
			
			if(hasEjectSpentRoundAimed && set.getSingleAnimation(BBLoader.KEY_EJECT_SPENT_ROUND_AIMED).hasBone(partKey)) {
				
				List<Transition<RenderContext<RenderableState>>> list = BBLoader.getAnimation(animationFile, BBLoader.KEY_EJECT_SPENT_ROUND_AIMED, partKey)
						.getTransitionList(Transform.NULL.copy().withRotationPoint(rotPoint.x, rotPoint.y, rotPoint.z), BBLoader.HANDDIVISOR);
				
				withFirstPersonCustomPositioningEjectSpentRoundAimed(aR15Action, list);
			}
			
			return this;
			
			
			
		}
		
		
		
		
		public Builder setCompoundReloadTacticalFunctionality(boolean normal, boolean empty) {
			this.compoundReloadUsesTactical = normal;
			this.compoundReloadEmptyUsesTactical = empty;
			return this;
		}
		
		public Builder setupInspectAnimations(String animationFile, String anim, String mainBoneName, String leftHandBoneName, String rightHandBoneName) {
			
			//System.out.println("Attemping fetch @ " + animationFile + ", " + anim + ", " + mainBoneName);
			AnimationData main = BBLoader.getAnimation(animationFile, anim, mainBoneName);
			AnimationData left = BBLoader.getAnimation(animationFile, anim, leftHandBoneName);
			AnimationData right = BBLoader.getAnimation(animationFile, anim, rightHandBoneName);
						
			checkDefaults();
			
			this.firstPersonPositioningInspecting = main.getTransitionList(firstPersonTransform, BBLoader.GENDIVISOR);
			this.firstPersonLeftHandPositioningInspecting = left.getTransitionList(firstPersonLeftHandTransform, BBLoader.HANDDIVISOR);
			this.firstPersonRightHandPositioningInspecting = right.getTransitionList(firstPersonRightHandTransform, BBLoader.HANDDIVISOR);
			return this;
		}
		
		public Builder setupCompoundReload(String animationFile, String anim, String mainBoneName, String leftHandBoneName, String rightHandBoneName) {
			
			AnimationData main = BBLoader.getAnimation(animationFile, anim, mainBoneName);
			AnimationData left = BBLoader.getAnimation(animationFile, anim, leftHandBoneName);
			AnimationData right = BBLoader.getAnimation(animationFile, anim, rightHandBoneName);
						
			checkDefaults();
			
			if(firstPersonZoomingTransform != null) {
				this.compoundReloadContainer.setFirstPerson(main.getTransitionListDual(firstPersonTransform, firstPersonZoomingTransform, BBLoader.GENDIVISOR));
				
			} else {
				this.compoundReloadContainer.setFirstPerson(main.getTransitionList(firstPersonTransform, BBLoader.GENDIVISOR));
				
			}
			this.compoundReloadContainer.setLeftHand(left.getTransitionList(firstPersonLeftHandTransform, BBLoader.HANDDIVISOR));
			this.compoundReloadContainer.setRightHand(right == null ? null : right.getTransitionList(firstPersonRightHandTransform, BBLoader.HANDDIVISOR));

			
			this.compoundReloadContainer.setDuration();
			//this.compoundReloadContainer.setDuration((long) Math.round((main.getAppointedDuration()*AnimationData.PACE)));
			return this;
			
		}
		
		public Builder setupLoadEmpty(String animationFile, String anim, String mainBoneName, String leftHandBoneName, String rightHandBoneName) {
			
			AnimationData main = BBLoader.getAnimation(animationFile, anim, mainBoneName);
			AnimationData left = BBLoader.getAnimation(animationFile, anim, leftHandBoneName);
			AnimationData right = BBLoader.getAnimation(animationFile, anim, rightHandBoneName);
						
			checkDefaults();
			
			this.loadEmptyContainer.setFirstPerson(main.getTransitionList(firstPersonTransform, BBLoader.GENDIVISOR));
			this.loadEmptyContainer.setLeftHand(left.getTransitionList(firstPersonLeftHandTransform, BBLoader.HANDDIVISOR));
			this.loadEmptyContainer.setRightHand(right == null ? null : right.getTransitionList(firstPersonRightHandTransform, BBLoader.HANDDIVISOR));

			this.loadEmptyContainer.setDuration();
			return this;
			
		}
		
		public Builder setupUnloadEmpty(String animationFile, String anim, String mainBoneName, String leftHandBoneName, String rightHandBoneName) {
			
			AnimationData main = BBLoader.getAnimation(animationFile, anim, mainBoneName);
			AnimationData left = BBLoader.getAnimation(animationFile, anim, leftHandBoneName);
			AnimationData right = BBLoader.getAnimation(animationFile, anim, rightHandBoneName);
						
			checkDefaults();
			
			this.unloadEmptyContainer.setFirstPerson(main.getTransitionList(firstPersonTransform, BBLoader.GENDIVISOR));
			this.unloadEmptyContainer.setLeftHand(left.getTransitionList(firstPersonLeftHandTransform, BBLoader.HANDDIVISOR));
			this.unloadEmptyContainer.setRightHand(right == null ? null : right.getTransitionList(firstPersonRightHandTransform, BBLoader.HANDDIVISOR));

			this.unloadEmptyContainer.setDuration();
			return this;
			
		}
		
		public Builder setupModernContainer(String animationFile, String anim, TransitionContainer container) {
			AnimationData main = BBLoader.getAnimation(animationFile, anim, "main");
			AnimationData left = BBLoader.getAnimation(animationFile, anim, "lefthand");
			AnimationData right = BBLoader.getAnimation(animationFile, anim, "righthand");
						
			checkDefaults();
			
			container.setFirstPerson(main.getTransitionList(firstPersonTransform, BBLoader.GENDIVISOR));
			container.setLeftHand(left.getTransitionList(firstPersonLeftHandTransform, BBLoader.HANDDIVISOR));
			container.setRightHand(right == null ? null : right.getTransitionList(firstPersonRightHandTransform, BBLoader.HANDDIVISOR));
			container.setDuration();
			return this;
		}
		
		public Builder setupModernContainerADS(String animationFile, String anim, TransitionContainer container) {
			AnimationData main = BBLoader.getAnimation(animationFile, anim, "main");
			AnimationData left = BBLoader.getAnimation(animationFile, anim, "lefthand");
			AnimationData right = BBLoader.getAnimation(animationFile, anim, "righthand");
						
			checkDefaults();
			
			container.setFirstPerson(main.getTransitionList(firstPersonZoomingTransform, BBLoader.GENDIVISOR));
			container.setLeftHand(left.getTransitionList(firstPersonLeftHandTransform, BBLoader.HANDDIVISOR));
			container.setRightHand(right == null ? null : right.getTransitionList(firstPersonRightHandTransform, BBLoader.HANDDIVISOR));
			container.setDuration();
			return this;
		}
		
		public Builder setupTacticalReload(String animationFile, String anim, String mainBoneName, String leftHandBoneName, String rightHandBoneName) {
			
			AnimationData main = BBLoader.getAnimation(animationFile, anim, mainBoneName);
			AnimationData left = BBLoader.getAnimation(animationFile, anim, leftHandBoneName);
			AnimationData right = BBLoader.getAnimation(animationFile, anim, rightHandBoneName);
						
			checkDefaults();
			
			this.tacticalReloadContainer.setFirstPerson(main.getTransitionList(firstPersonTransform, BBLoader.GENDIVISOR));
			this.tacticalReloadContainer.setLeftHand(left.getTransitionList(firstPersonLeftHandTransform, BBLoader.HANDDIVISOR));
			this.tacticalReloadContainer.setRightHand(right == null ? null : right.getTransitionList(firstPersonRightHandTransform, BBLoader.HANDDIVISOR));

			this.tacticalReloadContainer.setDuration();
			return this;
			
		}
		
		
		public Builder setupCompoundReloadEmpty(String animationFile, String anim, String mainBoneName, String leftHandBoneName, String rightHandBoneName) {
			
			AnimationData main = BBLoader.getAnimation(animationFile, anim, mainBoneName);
			AnimationData left = BBLoader.getAnimation(animationFile, anim, leftHandBoneName);
			AnimationData right = BBLoader.getAnimation(animationFile, anim, rightHandBoneName);
						
			checkDefaults();
			
			this.compoundReloadEmptyContainer.setFirstPerson(main.getTransitionList(firstPersonTransform, BBLoader.GENDIVISOR));
			this.compoundReloadEmptyContainer.setLeftHand(left.getTransitionList(firstPersonLeftHandTransform, BBLoader.HANDDIVISOR));
			this.compoundReloadEmptyContainer.setRightHand(right == null ? null : right.getTransitionList(firstPersonRightHandTransform, BBLoader.HANDDIVISOR));
			
			this.compoundReloadEmptyContainer.setDuration();
			//setupBBAnim(animationFile, anim, mainBoneName, leftHandBoneName, rightHandBoneName, this.compoundReloadContainer);
			return this;
			
		}
		
		public Builder setupReload(String animationFile, String anim, String mainBoneName, String leftHandBoneName, String rightHandBoneName) {
			AnimationData main = BBLoader.getAnimation(animationFile, anim, mainBoneName);
			AnimationData left = BBLoader.getAnimation(animationFile, anim, leftHandBoneName);
			AnimationData right = BBLoader.getAnimation(animationFile, anim, rightHandBoneName);
						
			checkDefaults();
			
			this.firstPersonPositioningReloading = main.getTransitionList(firstPersonTransform, BBLoader.GENDIVISOR);
			this.firstPersonLeftHandPositioningReloading = left.getTransitionList(firstPersonLeftHandTransform, BBLoader.HANDDIVISOR);
			this.firstPersonRightHandPositioningReloading = right.getTransitionList(firstPersonRightHandTransform, BBLoader.HANDDIVISOR);
	
			return this;
			
		}
		
		public Builder setupUnload(String animationFile, String anim, String mainBoneName, String leftHandBoneName, String rightHandBoneName) {
			AnimationData main = BBLoader.getAnimation(animationFile, anim, mainBoneName);
			AnimationData left = BBLoader.getAnimation(animationFile, anim, leftHandBoneName);
			AnimationData right = BBLoader.getAnimation(animationFile, anim, rightHandBoneName);
						
			checkDefaults();
			
			this.firstPersonPositioningUnloading = main.getTransitionList(firstPersonTransform, BBLoader.GENDIVISOR);
			this.firstPersonLeftHandPositioningUnloading = left.getTransitionList(firstPersonLeftHandTransform, BBLoader.HANDDIVISOR);
			this.firstPersonRightHandPositioningUnloading = right.getTransitionList(firstPersonRightHandTransform, BBLoader.HANDDIVISOR);
	
			return this;
			
		}
		
		
		public Builder setupDraw(String animationFile, String anim, String mainBoneName, String leftHandBoneName, String rightHandBoneName) {
			AnimationData main = BBLoader.getAnimation(animationFile, anim, mainBoneName);
			AnimationData left = BBLoader.getAnimation(animationFile, anim, leftHandBoneName);
			AnimationData right = BBLoader.getAnimation(animationFile, anim, rightHandBoneName);
						
			checkDefaults();
			
			this.firstPersonPositioningDrawing = main.getTransitionList(firstPersonTransform, BBLoader.GENDIVISOR);
			this.firstPersonLeftHandPositioningDrawing = left.getTransitionList(firstPersonLeftHandTransform, BBLoader.HANDDIVISOR);
			this.firstPersonRightHandPositioningDrawing = right.getTransitionList(firstPersonRightHandTransform, BBLoader.HANDDIVISOR);
	
			return this;
			
		}
		
		public final Builder withLoadEmptyCustom(Part part, List<Transition<RenderContext<RenderableState>>> transitions) {
            if(part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }

            loadEmptyContainer.getCustom().put(part, transitions);
            return this;
        }
		
		public final Builder withUnloadEmptyCustom(Part part, List<Transition<RenderContext<RenderableState>>> transitions) {
            if(part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }

            unloadEmptyContainer.getCustom().put(part, transitions);
            return this;
        }
		
		
		public final Builder withTacticalReloadCustom(Part part, List<Transition<RenderContext<RenderableState>>> transitions) {
            if(part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }

            tacticalReloadContainer.getCustom().put(part, transitions);
            return this;
        }
		
		public final Builder withFirstPersonCustomPositioningCompoundReloading(Part part, List<Transition<RenderContext<RenderableState>>> transitions) {
            if(part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }

            compoundReloadContainer.getCustom().put(part, transitions);
            return this;
        }
		
		public final Builder withFPSCustomCompoundReloadingEmpty(Part part, List<Transition<RenderContext<RenderableState>>> transitions) {
            if(part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }

            compoundReloadEmptyContainer.getCustom().put(part, transitions);
            return this;
        }
		
		public final Builder withFPSCustomCompoundReloadingEmpty(Part part, Transition<RenderContext<RenderableState>> ...transitions) {
			if(part instanceof DefaultPart) {
				throw new IllegalArgumentException("Part " + part + " is not custom");
			}
			
			
			
			compoundReloadEmptyContainer.getCustom().put(part, Arrays.asList(transitions));
			return this;
		}
        public final Builder withFirstPersonCustomPositioningInspecting(Part part, List<Transition<RenderContext<RenderableState>>> transitions) {
            if(part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }

            this.firstPersonCustomPositioningInspecting.put(part, transitions);
            return this;
        }

        public final Builder withFirstPersonCustomPositioningDrawing(Part part, List<Transition<RenderContext<RenderableState>>> transitions) {
            if(part instanceof DefaultPart) {
                throw new IllegalArgumentException("Part " + part + " is not custom");
            }

            this.firstPersonCustomPositioningDrawing.put(part, transitions);
            return this;
        }
        
		public WeaponRenderer build() {
			if(FMLCommonHandler.instance().getSide() == Side.SERVER) {
				return null;
			}

			if(inventoryPositioning == null) {
				inventoryPositioning = itemStack -> {GL11.glTranslatef(0,  0.12f, 0);};
			}

			if(entityPositioning == null) {
				entityPositioning = itemStack -> {
				};
			}
			
			 
			WeaponRenderer renderer = new WeaponRenderer(this);

			/*
			if(firstPersonPositioning == null) {
				firstPersonPositioning = (renderContext) -> {
					GL11.glRotatef(45F, 0f, 1f, 0f);

					if(renderer.getClientModContext() != null) {
						PlayerWeaponInstance instance = renderer.getClientModContext().getMainHeldWeapon();
						if(instance != null && instance.isAimed()) {
							GL11.glTranslatef(xOffsetZoom, yOffsetZoom, weaponProximity);
						} else {
							GL11.glTranslatef(0F, -1.2F, 0F);
						}
					}

				};
			}
			*/
			if(firstPersonPositioningProning == null) {
			    firstPersonPositioningProning = firstPersonPositioning;
			}

			if(firstPersonPositioningZooming == null) {
				firstPersonPositioningZooming = firstPersonPositioning;
			}

			if(firstPersonPositioningReloading == null) {
				firstPersonPositioningReloading = Collections.singletonList(new Transition<>(firstPersonPositioning, DEFAULT_ANIMATION_DURATION));
			}
			
	        if(thirdPersonPositioningReloading == null) {
	            // TODO: verify
	            thirdPersonPositioningReloading = Collections.singletonList(new Transition<>(thirdPersonPositioning, DEFAULT_ANIMATION_DURATION));
	        }
			
			if(firstPersonPositioningInspecting == null) {
                firstPersonPositioningInspecting = Collections.singletonList(new Transition<>(firstPersonPositioning, DEFAULT_ANIMATION_DURATION));
            }
			
			if(firstPersonPositioningDrawing == null) {
			    firstPersonPositioningDrawing = Collections.singletonList(new Transition<>(firstPersonPositioning, DEFAULT_ANIMATION_DURATION));
			}
			
			if(firstPersonPositioningLoadIteration == null) {
			    firstPersonPositioningLoadIteration = Collections.singletonList(new Transition<>(firstPersonPositioning, DEFAULT_ANIMATION_DURATION));
            }

			
			for(Transition<RenderContext<RenderableState>> t: firstPersonPositioningReloading) {
				totalReloadingDuration += t.getDuration();
				totalReloadingDuration += t.getPause();
			}

			
			//totalLoadIterationDuration
			for(Transition<RenderContext<RenderableState>> t: firstPersonPositioningLoadIteration) {
			    totalLoadIterationDuration += t.getDuration();
			    totalLoadIterationDuration += t.getPause();
            }

			if(firstPersonPositioningUnloading == null) {
				firstPersonPositioningUnloading = Collections.singletonList(new Transition<>(firstPersonPositioning, DEFAULT_ANIMATION_DURATION));
			}
			
	        if(thirdPersonPositioningUnloading == null) {
	            thirdPersonPositioningUnloading = Collections.singletonList(new Transition<>(thirdPersonPositioning, DEFAULT_ANIMATION_DURATION));
	        }

			for(Transition<RenderContext<RenderableState>> t: firstPersonPositioningUnloading) {
				totalUnloadingDuration += t.getDuration();
				totalUnloadingDuration += t.getPause();
			}
			
			for(Transition<RenderContext<RenderableState>> t: firstPersonPositioningDrawing) {
			    totalDrawingDuration += t.getDuration();
			    totalDrawingDuration += t.getPause();
			}
			
			if(firstPersonPositioningLoadIteration == null) {
			    firstPersonPositioningLoadIteration = Collections.singletonList(new Transition<>(firstPersonPositioning, DEFAULT_ANIMATION_DURATION));
            }
			
			if(firstPersonPositioningAllLoadIterationsCompleted == null) {
			    firstPersonPositioningAllLoadIterationsCompleted = Collections.singletonList(new Transition<>(firstPersonPositioning, DEFAULT_ANIMATION_DURATION));
            }

			if(firstPersonPositioningRecoiled == null) {
				firstPersonPositioningRecoiled = firstPersonPositioning;
			} else {
			    Consumer<RenderContext<RenderableState>> firstPersonPositioningRecoiledOrig = firstPersonPositioningRecoiled;
			   
			    
			    firstPersonPositioningRecoiled = renderContext -> {
			        
			    	
			        float maxAngle = 1.5f;
		            float xRotation = random.nextFloat() * maxAngle;
		            float yRotation = random.nextFloat() * maxAngle;
		            float zRotation = random.nextFloat() * maxAngle;


		            
		            GL11.glRotatef(xRotation, 1f, 0f, 0f);
		            GL11.glRotatef(yRotation, 0f, 1f, 0f);
		            GL11.glRotatef(zRotation, 0f, 0f, 1f);

		            float amplitude = 0f;
		           
                    float xRandomOffset = random.nextFloat() * amplitude;
		            float yRandomOffset = random.nextFloat() * amplitude;
		            float zRandomOffset = random.nextFloat() * amplitude;
		            GL11.glTranslatef(xRandomOffset, yRandomOffset, zRandomOffset);
		            
		            firstPersonPositioningRecoiledOrig.accept(renderContext);
			    };
			}
			
			if(firstPersonPositioningProningRecoiled == null) {
			    firstPersonPositioningProningRecoiled = firstPersonPositioningRecoiled;
			}

			if(firstPersonPositioningRunning == null) {
				
				
				firstPersonPositioningRunning = (rc) -> {
					if(rc.getWeaponInstance().getWeapon().builder.isUsingNewSystem()) { 
						new Transform().withPosition(-0.5, 0, 0.5).withRotation(15, -5, 15).withScale(1, 1, 1).doGLDirect();
						
					} else {
						new Transform().withPosition(-0.5, 0, 0.5).withRotation(15, -5, 15).withScale(1, 1, 1).doGLDirect();
						
					}
					
				};
			}

			if(firstPersonPositioningModifying == null) {
				firstPersonPositioningModifying = firstPersonPositioning;
			}

			if(firstPersonPositioningModifyingAlt == null) {
                firstPersonPositioningModifyingAlt = firstPersonPositioning;
            }

			if(firstPersonPositioningShooting == null) {
				firstPersonPositioningShooting = firstPersonPositioning;
			}
			
			if(firstPersonPositioningProningShooting == null) {
			    firstPersonPositioningProningShooting = firstPersonPositioningProning;
			}

			if(firstPersonPositioningZoomingRecoiled == null) {
				firstPersonPositioningZoomingRecoiled = firstPersonPositioningZooming;
			}

			if(firstPersonPositioningZoomingShooting == null) {
				firstPersonPositioningZoomingShooting = firstPersonPositioningZooming;
			}
			
			if(firstPersonPositioningLoadIterationCompleted == null) {
			    firstPersonPositioningLoadIterationCompleted = firstPersonPositioning;
            }

			if(thirdPersonPositioning == null) {
				thirdPersonPositioning = (context) -> {
					GL11.glTranslatef(-0.4F, 0.2F, 0.4F);
					GL11.glRotatef(-45F, 0f, 1f, 0f);
					GL11.glRotatef(70F, 1f, 0f, 0f);
				};
			}

			// Left hand positioning

			if(firstPersonLeftHandPositioning == null) {
				firstPersonLeftHandPositioning = (context) -> {};
			}
			
			if(firstPersonLeftHandPositioningProning == null) {
                firstPersonLeftHandPositioningProning = firstPersonLeftHandPositioning;
            }

			if(firstPersonLeftHandPositioningReloading == null) {
				firstPersonLeftHandPositioningReloading = firstPersonPositioningReloading.stream().map(
				        t -> new Transition<RenderContext<RenderableState>>(c -> {}, 0)).collect(Collectors.toList());
			}

			if(firstPersonLeftHandPositioningUnloading == null) {
				firstPersonLeftHandPositioningUnloading = firstPersonPositioningUnloading.stream().map(
				        t -> new Transition<RenderContext<RenderableState>>(c -> {}, 0)).collect(Collectors.toList());
			}
			
			if(thirdPersonLeftHandPositioningReloading == null) {
			    thirdPersonLeftHandPositioningReloading = thirdPersonPositioningReloading.stream().map(
			            t -> new Transition<RenderContext<RenderableState>>(c -> {}, 0)).collect(Collectors.toList());
			}

			if(thirdPersonLeftHandPositioningUnloading == null) {
			    thirdPersonLeftHandPositioningUnloading = thirdPersonPositioningUnloading.stream().map(
			            t -> new Transition<RenderContext<RenderableState>>(c -> {}, 0)).collect(Collectors.toList());
			}
			
			if(firstPersonLeftHandPositioningInspecting == null) {
                firstPersonLeftHandPositioningInspecting = firstPersonPositioningInspecting.stream().map(
                        t -> new Transition<RenderContext<RenderableState>>(c -> {}, 0)).collect(Collectors.toList());
            }
			
			if(firstPersonLeftHandPositioningDrawing == null) {
			    firstPersonLeftHandPositioningDrawing = firstPersonPositioningDrawing.stream().map(
			            t -> new Transition<RenderContext<RenderableState>>(c -> {}, 0)).collect(Collectors.toList());
			}
			
			if(firstPersonLeftHandPositioningLoadIteration == null) {
			    firstPersonLeftHandPositioningLoadIteration = firstPersonPositioningReloading.stream().map(
                        t -> new Transition<RenderContext<RenderableState>>(c -> {}, 0)).collect(Collectors.toList());
            }
			
			if(firstPersonLeftHandPositioningAllLoadIterationsCompleted == null) {
			    firstPersonLeftHandPositioningAllLoadIterationsCompleted = firstPersonPositioningReloading.stream().map(
                        t -> new Transition<RenderContext<RenderableState>>(c -> {}, 0)).collect(Collectors.toList());
            }

			if(firstPersonLeftHandPositioningRecoiled == null) {
				firstPersonLeftHandPositioningRecoiled = firstPersonLeftHandPositioning;
			}
			
			if(firstPersonLeftHandPositioningProningRecoiled == null) {
			    firstPersonLeftHandPositioningProningRecoiled = firstPersonLeftHandPositioningProning;
            }

			if(firstPersonLeftHandPositioningShooting == null) {
				firstPersonLeftHandPositioningShooting = firstPersonLeftHandPositioning;
			}
			
			if(firstPersonLeftHandPositioningProningShooting == null) {
			    firstPersonLeftHandPositioningProningShooting = firstPersonLeftHandPositioningProning;
			}

			if(firstPersonLeftHandPositioningZooming == null) {
				firstPersonLeftHandPositioningZooming = firstPersonLeftHandPositioning;
			}

			if(firstPersonLeftHandPositioningRunning == null) {
				firstPersonLeftHandPositioningRunning = firstPersonLeftHandPositioning;
			}

			if(firstPersonLeftHandPositioningModifying == null) {
				firstPersonLeftHandPositioningModifying = firstPersonLeftHandPositioning;
			}
			
			if(firstPersonLeftHandPositioningModifyingAlt == null) {
                firstPersonLeftHandPositioningModifyingAlt = firstPersonLeftHandPositioning;
            }
			
			if(firstPersonLeftHandPositioningLoadIterationCompleted == null) {
			    firstPersonLeftHandPositioningLoadIterationCompleted = firstPersonLeftHandPositioning;
            }

			// Right hand positioning

			if(firstPersonRightHandPositioning == null) {
				firstPersonRightHandPositioning = (context) -> {};
			}
			
			if(firstPersonRightHandPositioningProning == null) {
			    firstPersonRightHandPositioningProning = firstPersonRightHandPositioning;
			}

			if(firstPersonRightHandPositioningReloading == null) {
				//firstPersonRightHandPositioningReloading = Collections.singletonList(new Transition(firstPersonRightHandPositioning, DEFAULT_ANIMATION_DURATION));
				firstPersonRightHandPositioningReloading = firstPersonPositioningReloading.stream().map(
				        t -> new Transition<RenderContext<RenderableState>>(c -> {}, 0)).collect(Collectors.toList());
			}

			if(firstPersonRightHandPositioningUnloading == null) {
				firstPersonRightHandPositioningUnloading = firstPersonPositioningUnloading.stream().map(
				        t -> new Transition<RenderContext<RenderableState>>(c -> {}, 0)).collect(Collectors.toList());
			}
			
			if(thirdPersonRightHandPositioningReloading == null) {
			    //thirdPersonRightHandPositioningReloading = Collections.singletonList(new Transition(thirdPersonRightHandPositioning, DEFAULT_ANIMATION_DURATION));
			    thirdPersonRightHandPositioningReloading = thirdPersonPositioningReloading.stream().map(
			            t -> new Transition<RenderContext<RenderableState>>(c -> {}, 0)).collect(Collectors.toList());
			}

			if(thirdPersonRightHandPositioningUnloading == null) {
			    thirdPersonRightHandPositioningUnloading = thirdPersonPositioningUnloading.stream().map(
			            t -> new Transition<RenderContext<RenderableState>>(c -> {}, 0)).collect(Collectors.toList());
			}
			
			if(firstPersonRightHandPositioningInspecting == null) {
                firstPersonRightHandPositioningInspecting = firstPersonPositioningInspecting.stream().map(
                        t -> new Transition<RenderContext<RenderableState>>(c -> {}, 0)).collect(Collectors.toList());
            }
			
			if(firstPersonRightHandPositioningDrawing == null) {
			    firstPersonRightHandPositioningDrawing = firstPersonPositioningDrawing.stream().map(
			            t -> new Transition<RenderContext<RenderableState>>(c -> {}, 0)).collect(Collectors.toList());
			}
			
			if(firstPersonRightHandPositioningLoadIteration == null) {
                firstPersonRightHandPositioningLoadIteration = firstPersonPositioningReloading.stream().map(
                        t -> new Transition<RenderContext<RenderableState>>(c -> {}, 0)).collect(Collectors.toList());
            }
            
            if(firstPersonRightHandPositioningAllLoadIterationsCompleted == null) {
                firstPersonRightHandPositioningAllLoadIterationsCompleted = firstPersonPositioningReloading.stream().map(
                        t -> new Transition<RenderContext<RenderableState>>(c -> {}, 0)).collect(Collectors.toList());
            }
            
            /*
             * Compound
             */
            
            this.compoundReloadContainer.build(this);
            this.compoundReloadEmptyContainer.build(this);
            this.loadEmptyContainer.build(this);
            this.unloadEmptyContainer.build(this);
            this.tacticalReloadContainer.build(this);

            

			if(firstPersonRightHandPositioningRecoiled == null) {
				firstPersonRightHandPositioningRecoiled = firstPersonRightHandPositioning;
			}
			
			if(firstPersonRightHandPositioningProningRecoiled == null) {
			    firstPersonRightHandPositioningProningRecoiled = firstPersonRightHandPositioningProning;
            }

			if(firstPersonRightHandPositioningShooting == null) {
				firstPersonRightHandPositioningShooting = firstPersonRightHandPositioning;
			}
			
			if(firstPersonRightHandPositioningProningShooting == null) {
			    firstPersonRightHandPositioningProningShooting = firstPersonRightHandPositioningProning;
			}

			if(firstPersonRightHandPositioningZooming == null) {
				firstPersonRightHandPositioningZooming = firstPersonRightHandPositioning;
			}

			if(firstPersonRightHandPositioningRunning == null) {
				firstPersonRightHandPositioningRunning = firstPersonRightHandPositioning;
			}

			if(firstPersonRightHandPositioningModifying == null) {
				firstPersonRightHandPositioningModifying = firstPersonRightHandPositioning;
			}
			
			if(firstPersonRightHandPositioningModifyingAlt == null) {
                firstPersonRightHandPositioningModifyingAlt = firstPersonRightHandPositioning;
            }
			
			if(firstPersonRightHandPositioningLoadIterationCompleted == null) {
			    firstPersonRightHandPositioningLoadIterationCompleted = firstPersonLeftHandPositioning;
            }

			/*
			 * If custom positioning for recoil is not set, default it to normal custom positioning
			 */
			if(!firstPersonCustomPositioning.isEmpty() && firstPersonCustomPositioningRecoiled.isEmpty()) {
				firstPersonCustomPositioning.forEach((part, pos) -> {
					firstPersonCustomPositioningRecoiled.put(part, pos);
				});
			}
			
			if(!firstPersonCustomPositioning.isEmpty() && firstPersonCustomPositioningProning.isEmpty()) {
                firstPersonCustomPositioning.forEach((part, pos) -> {
                    firstPersonCustomPositioningProning.put(part, pos);
                });
             }
			
			if(!firstPersonCustomPositioning.isEmpty() && firstPersonCustomPositioningZooming.isEmpty()) {
			    firstPersonCustomPositioning.forEach((part, pos) -> {
			        firstPersonCustomPositioningZooming.put(part, pos);
			    });
			}

			if(!firstPersonCustomPositioning.isEmpty() && firstPersonCustomPositioningZoomingRecoiled.isEmpty()) {
				firstPersonCustomPositioning.forEach((part, pos) -> {
					firstPersonCustomPositioningZoomingRecoiled.put(part, pos);
				});
			}
			
			if(!firstPersonCustomPositioning.isEmpty() && firstPersonCustomPositioningProningRecoiled.isEmpty()) {
			    firstPersonCustomPositioningRecoiled.forEach((part, pos) -> {
                    firstPersonCustomPositioningProningRecoiled.put(part, pos);
                });
            }

			if(!firstPersonCustomPositioning.isEmpty() && firstPersonCustomPositioningZoomingShooting.isEmpty()) {
				firstPersonCustomPositioning.forEach((part, pos) -> {
					firstPersonCustomPositioningZoomingShooting.put(part, pos);
				});
			}
			
			if(!firstPersonCustomPositioning.isEmpty() && firstPersonCustomPositioningLoadIterationCompleted.isEmpty()) {
                firstPersonCustomPositioning.forEach((part, pos) -> {
                    firstPersonCustomPositioningLoadIterationCompleted.put(part, pos);
                });
            }

			firstPersonCustomPositioningReloading.forEach((p, t) -> {
				if(t.size() != firstPersonPositioningReloading.size()) {
					throw new IllegalStateException("Custom reloading transition number mismatch. Expected " + firstPersonPositioningReloading.size()
					+ ", actual: " + t.size());
				}
			});
			
			thirdPersonCustomPositioningReloading.forEach((p, t) -> {
			    if(t.size() != thirdPersonPositioningReloading.size()) {
			        throw new IllegalStateException("Custom reloading transition number mismatch. Expected " + thirdPersonPositioningReloading.size()
			        + ", actual: " + t.size());
			    }
			});

			firstPersonCustomPositioningUnloading.forEach((p, t) -> {
				if(t.size() != firstPersonPositioningUnloading.size()) {
					throw new IllegalStateException("Custom unloading transition number mismatch. Expected " + firstPersonPositioningUnloading.size()
					+ ", actual: " + t.size());
				}
			});
			
			thirdPersonCustomPositioningUnloading.forEach((p, t) -> {
                if(t.size() != thirdPersonPositioningUnloading.size()) {
                    throw new IllegalStateException("Custom unloading transition number mismatch. Expected " + thirdPersonPositioningUnloading.size()
                    + ", actual: " + t.size());
                }
            });
			
			firstPersonCustomPositioningInspecting.forEach((p, t) -> {
			    if(t.size() != firstPersonPositioningInspecting.size()) {
			        throw new IllegalStateException("Custom inspecting transition number mismatch. Expected " + firstPersonPositioningInspecting.size()
			        + ", actual: " + t.size());
			    }
			});
			
		
			
			
			firstPersonCustomPositioningDrawing.forEach((p, t) -> {
			    if(t.size() != firstPersonPositioningDrawing.size()) {
			        throw new IllegalStateException("Custom Drawing transition number mismatch. Expected " + firstPersonPositioningDrawing.size()
			        + ", actual: " + t.size());
			    }
			});

			firstPersonCustomPositioningLoadIteration.forEach((p, t) -> {
                if(t.size() != firstPersonPositioningLoadIteration.size()) {
                    throw new IllegalStateException("Custom reloading transition number mismatch. Expected " + firstPersonPositioningLoadIteration.size()
                    + ", actual: " + t.size());
                }
            });
			
			firstPersonCustomPositioningLoadIterationsCompleted.forEach((p, t) -> {
                if(t.size() != firstPersonPositioningAllLoadIterationsCompleted.size()) {
                    throw new IllegalStateException("Custom reloading transition number mismatch. Expected " + firstPersonPositioningAllLoadIterationsCompleted.size()
                    + ", actual: " + t.size());
                }
            });

			return renderer;
		}
		
		public void buildNormalTransition(List<Transition<RenderContext<RenderableState>>> transitionList) {
			  if(transitionList == null) {
				  transitionList = firstPersonPositioningReloading.stream().map(
	                        t -> new Transition<RenderContext<RenderableState>>(c -> {}, 0)).collect(Collectors.toList());
	            }
		}
		
		
		@SuppressWarnings("unchecked")
		public void buildCustomTransitionList(LinkedHashMap<Part, List<Transition<RenderContext<RenderableState>>>> lhm) {
			lhm.forEach((p, t) -> {
                if(((List<Transition<RenderContext<RenderableState>>>) t).size() != lhm.size()) {
                    throw new IllegalStateException("Custom reloading transition number mismatch. Expected " + lhm.size()
                    + ", actual: " + ((List<Transition<RenderContext<RenderableState>>>) t).size());
                }
            });
		}

		public Consumer<ItemStack> getEntityPositioning() {
			return entityPositioning;
		}

		public Consumer<ItemStack> getInventoryPositioning() {
			return inventoryPositioning;
		}

		public Consumer<RenderContext<RenderableState>> getThirdPersonPositioning() {
			return thirdPersonPositioning;
		}

		public String getTextureName() {
			return textureName;
		}

		public ModelBase getModel() {
			return model;
		}

		public WavefrontModel getBakedModel() {
			return bakedModel;
		}

		public String getAnimationFileName() {
			return animationFileName;
		}

		public void setAnimationFileName(String animationFileName) {
			this.animationFileName = animationFileName;
		}
	}

	private Builder builder;

	private Map<EntityLivingBase, MultipartRenderStateManager<RenderableState, Part, RenderContext<RenderableState>>> firstPersonStateManagers;
    private Map<EntityLivingBase, MultipartRenderStateManager<RenderableState, Part, RenderContext<RenderableState>>> thirdPersonStateManagers;

	private MultipartTransitionProvider<RenderableState, Part, RenderContext<RenderableState>> firstPersonTransitionProvider;
	private MultipartTransitionProvider<RenderableState, Part, RenderContext<RenderableState>> thirdPersonTransitionProvider;

	// Deferred render list
	private ArrayList<Pair<FloatBuffer,  CustomRenderer<RenderableState>>> deferredPost = new ArrayList<>();
	
	
	private long magicAnimationTimer;
	private WeaponState magicState = WeaponState.READY;
	
	
	

	protected ClientModContext clientModContext;

	private WeaponRenderer(Builder builder) {
		this.setBuilder(builder);
		this.firstPersonStateManagers = new HashMap<>();
		this.thirdPersonStateManagers = new HashMap<>();
		this.firstPersonTransitionProvider = new FirstPersonWeaponTransitionProvider();
		this.thirdPersonTransitionProvider = new ThirdPersonWeaponTransitionProvider();
		this.textureManager = mc.getTextureManager();
		this.pair = org.apache.commons.lang3.tuple.Pair.of((IBakedModel) this, null);
		this.playerBiped = new ModelBiped();
		this.playerBiped.textureWidth = 64;
		this.playerBiped.textureHeight = 64;
	}
	
	
	public Builder getWeaponRendererBuilder() {
		return this.getBuilder();
	}

	protected long getTotalReloadingDuration() {
		return getBuilder().totalReloadingDuration;
	}

	protected long getTotalUnloadingDuration() {
		return getBuilder().totalUnloadingDuration;
	}
	
	protected long getTotalDrawingDuration() {
        return getBuilder().totalDrawingDuration;
    }

	protected ClientModContext getClientModContext() {
		return clientModContext;
	}

	protected void setClientModContext(ClientModContext clientModContext) {
		this.clientModContext = clientModContext;
	}
	
	public boolean isCompoundReloadTactical() {
		return getBuilder().compoundReloadUsesTactical;
	}
	
	public boolean isCompoundReloadEmptyTactical() {
		return getBuilder().compoundReloadEmptyUsesTactical;
	}
	
	public boolean compoundReload = false;
	public boolean compoundReloadEmpty = false;
	
	private boolean shouldDoEmptyVariant = false;
	
	public boolean shouldDoEmptyVariant() {
		return shouldDoEmptyVariant;
	}
	
	public void setShouldDoEmptyVariant(boolean state) {
		this.shouldDoEmptyVariant = state;
	}
	
	protected StateDescriptor getFirstPersonStateDescriptor(EntityLivingBase player, ItemStack itemStack) {
		
		
		float amplitude = getBuilder().normalRandomizingAmplitude;
		float rate = getBuilder().normalRandomizingRate;
		RenderableState currentState = null;

		PlayerItemInstance<?> playerItemInstance = clientModContext.getPlayerItemInstanceRegistry().getItemInstance(player, itemStack);
				//.getMainHandItemInstance(player, PlayerWeaponInstance.class); // TODO: cannot be always main hand, need to which hand from context

		PlayerWeaponInstance playerWeaponInstance = null;
		if(playerItemInstance == null || !(playerItemInstance instanceof PlayerWeaponInstance)
		        || playerItemInstance.getItem() != itemStack.getItem()) {
		    LOG.error("Invalid or mismatching item. Player item instance: {}. Item stack: {}", playerItemInstance, itemStack);
		} else {
		    playerWeaponInstance = (PlayerWeaponInstance) playerItemInstance;
		}

	
		if(playerWeaponInstance != null) {
			AsyncWeaponState asyncWeaponState = getNextNonExpiredState(playerWeaponInstance);
			//System.out.println(asyncWeaponState.getState());
			
			WeaponState renderableState = asyncWeaponState.getState();
		
			
			switch(renderableState) {
			
			case RECOILED:
				
				if(playerWeaponInstance.isAutomaticModeEnabled() && !hasRecoilPositioning()) {
					
					if(playerWeaponInstance.isAimed()) {
						currentState = RenderableState.ZOOMING;
						rate = getBuilder().firingRandomizingRate;
						amplitude = getBuilder().zoomRandomizingAmplitude;
					} else {
						currentState = RenderableState.NORMAL;
						rate = getBuilder().firingRandomizingRate;
						amplitude = getBuilder().firingRandomizingAmplitude;
					}
				} else if(playerWeaponInstance.isAimed()) {
					currentState = RenderableState.ZOOMING_RECOILED;
					amplitude = getBuilder().zoomRandomizingAmplitude;
				} else {
					
					currentState = RenderableState.RECOILED;
				}
				
				break;

			case PAUSED:
				if(playerWeaponInstance.isAutomaticModeEnabled() && !hasRecoilPositioning()) {

					boolean isLongPaused = System.currentTimeMillis() - asyncWeaponState.getTimestamp() > (50f / playerWeaponInstance.getFireRate())
							&& asyncWeaponState.isInfinite();

					if(playerWeaponInstance.isAimed()) {
						currentState = RenderableState.ZOOMING;
						if(!isLongPaused) {
							rate = getBuilder().firingRandomizingRate;
						}
						amplitude = getBuilder().zoomRandomizingAmplitude;
					} else {
						currentState = RenderableState.NORMAL;
						if(!isLongPaused) {
							rate = getBuilder().firingRandomizingRate;
							amplitude = getBuilder().firingRandomizingAmplitude;
						}
					}
				} else if(playerWeaponInstance.isAimed()) {
					currentState = RenderableState.ZOOMING_SHOOTING;
					//rate = builder.firingRandomizingRate;
					amplitude = getBuilder().zoomRandomizingAmplitude;
				} else {
					currentState = RenderableState.SHOOTING;
				}

				break;
				
			case COMPOUND_RELOAD_EMPTY:
				currentState = RenderableState.COMPOUND_RELOAD_EMPTY;
				break;

			case TACTICAL_RELOAD:
				
				
				currentState = RenderableState.TACTICAL_RELOAD;
				break;
				
			case COMPOUND_RELOAD:
				//ReflexScreen
				currentState = RenderableState.COMPOUND_RELOAD;
				break;
				
			
				
			case UNLOAD_PREPARING: case UNLOAD_REQUESTED: case UNLOAD:
			
			
				/*
				if(compoundReload) {
					currentState = RenderableState.COMPOUND_RELOAD;
				} else if(compoundReloadEmpty){
					currentState = RenderableState.COMPOUND_RELOAD_EMPTY;
				} else {
					currentState = RenderableState.UNLOADING;
				}*/
				if(shouldDoEmptyVariant()) {
					currentState = RenderableState.UNLOAD_EMPTY;
				} else {
					currentState = RenderableState.UNLOADING;
				}
				
			
				
				break;

			case LOAD:
				
				
				/*
				if(!compoundReload && !compoundReloadEmpty) {
					currentState = RenderableState.RELOADING;
				} 
				*/
				if(shouldDoEmptyVariant()) {
					currentState = RenderableState.LOAD_EMPTY;
				} else {
					currentState = RenderableState.RELOADING;
				}
				
				
				
				break;

			case LOAD_ITERATION:
			    currentState = RenderableState.LOAD_ITERATION;
			    break;
			    
			case LOAD_ITERATION_COMPLETED:
				
                currentState = RenderableState.LOAD_ITERATION_COMPLETED;
                break;
			    
			case ALL_LOAD_ITERATIONS_COMPLETED:
			    currentState = RenderableState.ALL_LOAD_ITERATIONS_COMPLETED;
			    break;
			    
			case EJECTING:
			    if(playerWeaponInstance.isAimed()) {
			        currentState = RenderableState.EJECT_SPENT_ROUND_AIMED;
			    } else {
			        currentState = RenderableState.EJECT_SPENT_ROUND;
			    }
				
				break;

			case MODIFYING: case MODIFYING_REQUESTED: case NEXT_ATTACHMENT: case NEXT_ATTACHMENT_REQUESTED:
			    if(playerWeaponInstance.isAltMofificationModeEnabled()) {
			        currentState = RenderableState.MODIFYING_ALT;
			    } else {
			        currentState = RenderableState.MODIFYING;
			    }
				
				break;
				
			case INSPECTING:
                currentState = RenderableState.INSPECTING;
                break;
                
			case DRAWING:
                currentState = RenderableState.DRAWING;
                break;

			default:
				if(player.isSprinting() && getBuilder().firstPersonPositioningRunning != null
				
				&& asyncWeaponState.getState() == WeaponState.READY
				&& !playerWeaponInstance.isAwaitingCompoundInstructions()
				// Prevents jumping dureing reloading
				&& System.currentTimeMillis()-playerWeaponInstance.getStateUpdateTimestamp()  > 50
						) {
					
					currentState = RenderableState.NORMAL;
					//currentState = RenderableState.RUNNING;
				} else if(playerWeaponInstance.isAimed()) {
					currentState = RenderableState.ZOOMING;
					rate = getBuilder().zoomRandomizingRate;
					amplitude = getBuilder().zoomRandomizingAmplitude;
				}
			}


			//log.trace("Rendering state {} created from {}", currentState, asyncWeaponState.getState());
		}

		if(currentState == null) {
			
			currentState = RenderableState.NORMAL;
		}
		
        
        if(player instanceof EntityPlayer && Interceptors.isProning((EntityPlayer) player)) {
            switch(currentState) {
            case NORMAL:
                currentState = RenderableState.PRONING;
                break;
            case RECOILED:
                currentState = RenderableState.PRONING_RECOILED;
                break;
            case SHOOTING:
                currentState = RenderableState.PRONING_SHOOTING;
                break;
            default:
                break;
            }
        }

        
      

		MultipartRenderStateManager<RenderableState, Part, RenderContext<RenderableState>> stateManager = firstPersonStateManagers.get(player);
		if(stateManager == null) {
			stateManager = new MultipartRenderStateManager<>(currentState, firstPersonTransitionProvider);
			firstPersonStateManagers.put(player, stateManager);
		} else {
			stateManager.setState(currentState, true, currentState == RenderableState.SHOOTING
			        || currentState == RenderableState.PRONING_SHOOTING
					|| currentState == RenderableState.ZOOMING_SHOOTING
					|| currentState == RenderableState.RUNNING
					|| currentState == RenderableState.ZOOMING
					|| currentState == RenderableState.DRAWING);
		}

		return new StateDescriptor(playerWeaponInstance, stateManager, rate, amplitude);
	}
	
    protected StateDescriptor getThirdPersonStateDescriptor(EntityLivingBase player, ItemStack itemStack) {
        float amplitude = getBuilder().normalRandomizingAmplitude;
        float rate = getBuilder().normalRandomizingRate;
        RenderableState currentState = null;

        PlayerItemInstance<?> playerItemInstance = clientModContext.getPlayerItemInstanceRegistry().getItemInstance(player, itemStack);
                //.getMainHandItemInstance(player, PlayerWeaponInstance.class); // TODO: cannot be always main hand, need to which hand from context

        PlayerWeaponInstance playerWeaponInstance = null;
        if(playerItemInstance == null || !(playerItemInstance instanceof PlayerWeaponInstance)
                || playerItemInstance.getItem() != itemStack.getItem()) {
            LOG.error("Invalid or mismatching item. Player item instance: {}. Item stack: {}", playerItemInstance, itemStack);
        } else {
            playerWeaponInstance = (PlayerWeaponInstance) playerItemInstance;
        }

        if(playerWeaponInstance != null) {
            AsyncWeaponState asyncWeaponState = getNextNonExpiredState(playerWeaponInstance);

            switch(asyncWeaponState.getState()) {

            case RECOILED:
                if(playerWeaponInstance.isAutomaticModeEnabled() && !hasRecoilPositioning()) {
                    if(playerWeaponInstance.isAimed()) {
                        currentState = RenderableState.ZOOMING;
                        rate = getBuilder().firingRandomizingRate;
                        amplitude = getBuilder().zoomRandomizingAmplitude;
                    } else {
                        currentState = RenderableState.NORMAL;
                        rate = getBuilder().firingRandomizingRate;
                        amplitude = getBuilder().firingRandomizingAmplitude;
                    }
                } else if(playerWeaponInstance.isAimed()) {
                    currentState = RenderableState.ZOOMING_RECOILED;
                    amplitude = getBuilder().zoomRandomizingAmplitude;
                } else {
                    currentState = RenderableState.RECOILED;
                }

                break;

            case PAUSED:
                if(playerWeaponInstance.isAutomaticModeEnabled() && !hasRecoilPositioning()) {

                    boolean isLongPaused = System.currentTimeMillis() - asyncWeaponState.getTimestamp() > (50f / playerWeaponInstance.getFireRate())
                            && asyncWeaponState.isInfinite();

                    if(playerWeaponInstance.isAimed()) {
                        currentState = RenderableState.ZOOMING;
                        if(!isLongPaused) {
                            rate = getBuilder().firingRandomizingRate;
                        }
                        amplitude = getBuilder().zoomRandomizingAmplitude;
                    } else {
                        currentState = RenderableState.NORMAL;
                        if(!isLongPaused) {
                            rate = getBuilder().firingRandomizingRate;
                            amplitude = getBuilder().firingRandomizingAmplitude;
                        }
                    }
                } else if(playerWeaponInstance.isAimed()) {
                    currentState = RenderableState.ZOOMING_SHOOTING;
                    //rate = builder.firingRandomizingRate;
                    amplitude = getBuilder().zoomRandomizingAmplitude;
                } else {
                    currentState = RenderableState.SHOOTING;
                }

                break;

            case UNLOAD_PREPARING: case UNLOAD_REQUESTED: case UNLOAD:
                currentState = RenderableState.UNLOADING;
                break;

            case LOAD:
            	
            	
            	
            
            	
                //currentState = RenderableState.RELOADING;
                break;

            case LOAD_ITERATION:
                currentState = RenderableState.LOAD_ITERATION;
                break;
                
            case LOAD_ITERATION_COMPLETED:
                currentState = RenderableState.LOAD_ITERATION_COMPLETED;
                break;
                
            case ALL_LOAD_ITERATIONS_COMPLETED:
                currentState = RenderableState.ALL_LOAD_ITERATIONS_COMPLETED;
                break;
                
            case EJECTING:
                if(playerWeaponInstance.isAimed()) {
                    currentState = RenderableState.EJECT_SPENT_ROUND_AIMED;
                } else {
                    currentState = RenderableState.EJECT_SPENT_ROUND;
                }
                
                break;

            case MODIFYING: case MODIFYING_REQUESTED: case NEXT_ATTACHMENT: case NEXT_ATTACHMENT_REQUESTED:
                currentState = RenderableState.MODIFYING;
                break;
                
            case INSPECTING:
                currentState = RenderableState.INSPECTING;
                break;

            default:
                if((player != null && player.isSprinting()) && getBuilder().firstPersonPositioningRunning != null) {
                    currentState = RenderableState.RUNNING;
                } else if(playerWeaponInstance.isAimed()) {
                    currentState = RenderableState.ZOOMING;
                    rate = getBuilder().zoomRandomizingRate;
                    amplitude = getBuilder().zoomRandomizingAmplitude;
                }
            }


            //log.trace("Rendering state {} created from {}", currentState, asyncWeaponState.getState());
        }

        if(currentState == null) {
            currentState = RenderableState.NORMAL;
        }

        MultipartRenderStateManager<RenderableState, Part, RenderContext<RenderableState>> stateManager = thirdPersonStateManagers.get(player);
        if(stateManager == null) {
            stateManager = new MultipartRenderStateManager<>(currentState, thirdPersonTransitionProvider);
            thirdPersonStateManagers.put(player, stateManager);
        } else {
            stateManager.setState(currentState, true, currentState == RenderableState.SHOOTING
                    || currentState == RenderableState.ZOOMING_SHOOTING
                    || currentState == RenderableState.RUNNING
                    || currentState == RenderableState.ZOOMING);
        }

        return new StateDescriptor(playerWeaponInstance, stateManager, rate, amplitude);
    }

	private AsyncWeaponState getNextNonExpiredState(PlayerWeaponInstance playerWeaponState) {
		AsyncWeaponState asyncWeaponState = null;
		while((asyncWeaponState = playerWeaponState.nextHistoryState()) != null) {

			if(System.currentTimeMillis() < asyncWeaponState.getTimestamp() + asyncWeaponState.getDuration()) {
				if(asyncWeaponState.getState() == WeaponState.FIRING
						&& (hasRecoilPositioning() || !playerWeaponState.isAutomaticModeEnabled())) { // allow recoil for non-automatic weapons
					continue;
				} else {
					break; // found non-expired-state
				}
			}
		}

		return asyncWeaponState;
	}

	private Consumer<RenderContext<RenderableState>> createWeaponPartPositionFunction(Transition<RenderContext<RenderableState>> t) {
		if(t == null) {
			return context -> {};
		}
		Consumer<RenderContext<RenderableState>> weaponPositionFunction = t.getItemPositioning();
		if(weaponPositionFunction != null) {
			return context -> weaponPositionFunction.accept(context);
		}

		return context -> {};

	}

	private Consumer<RenderContext<RenderableState>> createWeaponPartPositionFunction(Consumer<RenderContext<RenderableState>> weaponPositionFunction) {
		if(weaponPositionFunction != null) {
			return context -> weaponPositionFunction.accept(context);
		}
		return context -> {};

	}
	
	
	private List<MultipartTransition<Part, RenderContext<RenderableState>>> getComplexTransition(TransitionContainer tc) {
		return getComplexTransition(tc.getFirstPerson(),
				tc.getLeftHand(),
				tc.getRightHand(),
				tc.getCustom());
	}

	private List<MultipartTransition<Part, RenderContext<RenderableState>>> getComplexTransition(
			List<Transition<RenderContext<RenderableState>>> wt,
			List<Transition<RenderContext<RenderableState>>> lht,
			List<Transition<RenderContext<RenderableState>>> rht,
			LinkedHashMap<Part, List<Transition<RenderContext<RenderableState>>>> custom)
	{
		
		
		
		
	
		
		
		List<MultipartTransition<Part, RenderContext<RenderableState>>> result = new ArrayList<>();
		for(int i = 0; i < wt.size(); i++) {
		
			Transition<RenderContext<RenderableState>> p = wt.get(i);
			Transition<RenderContext<RenderableState>> l = lht.get(i);
			Transition<RenderContext<RenderableState>> r = rht.get(i);

		
			long pause = p.getPause();
			
            if(DebugPositioner.isDebugModeEnabled()) {
                TransitionConfiguration transitionConfiguration = DebugPositioner.getTransitionConfiguration(i, false);
                if(transitionConfiguration != null) {
                    pause = transitionConfiguration.getPause();
                }
            }
        	
            
            
			MultipartTransition<Part, RenderContext<RenderableState>> t = new MultipartTransition<Part, RenderContext<RenderableState>>(p.getDuration(), pause)
					.withPartPositionFunction(Part.MAIN_ITEM, createWeaponPartPositionFunction(p))
					.withPartPositionFunction(Part.LEFT_HAND, createWeaponPartPositionFunction(l))
					.withPartPositionFunction(Part.RIGHT_HAND, createWeaponPartPositionFunction(r));
			
			

			t.sound = p.getSound();
			
			
			
			
			for(Entry<Part, List<Transition<RenderContext<RenderableState>>>> e: custom.entrySet()){
				
			
				List<Transition<RenderContext<RenderableState>>> partTransitions = e.getValue();
				Transition<RenderContext<RenderableState>> partTransition = null;
				if(partTransitions != null && partTransitions.size() > i) {
					partTransition = partTransitions.get(i);
				} else {
					LOG.warn("Transition not defined for part {}", custom);
				}
				t.withPartPositionFunction(e.getKey(), createWeaponPartPositionFunction(partTransition));
			}

			
			
			result.add(t);
		}
		
	
		
		
		
		return result;
	}

	private List<MultipartTransition<Part, RenderContext<RenderableState>>> getSimpleTransition(
			Consumer<RenderContext<RenderableState>> w,
			Consumer<RenderContext<RenderableState>> lh,
			Consumer<RenderContext<RenderableState>> rh,
			//Consumer<RenderContext<RenderableState>> m,
			LinkedHashMap<Part, Consumer<RenderContext<RenderableState>>> custom,
			int duration) {
		MultipartTransition<Part, RenderContext<RenderableState>> mt = new MultipartTransition<Part, RenderContext<RenderableState>>(duration, 0)
				.withPartPositionFunction(Part.MAIN_ITEM, createWeaponPartPositionFunction(w))
				.withPartPositionFunction(Part.LEFT_HAND, createWeaponPartPositionFunction(lh))
				.withPartPositionFunction(Part.RIGHT_HAND, createWeaponPartPositionFunction(rh));
		custom.forEach((part, position) -> {
			mt.withPartPositionFunction(part, createWeaponPartPositionFunction(position));
		});
		return Collections.singletonList(mt);
	}
	
	private List<MultipartTransition<Part, RenderContext<RenderableState>>> getSimpleTransition(
			Consumer<RenderContext<RenderableState>> w,
			Consumer<RenderContext<RenderableState>> lh,
			Consumer<RenderContext<RenderableState>> rh,
			//Consumer<RenderContext<RenderableState>> m,
			LinkedHashMap<Part, Consumer<RenderContext<RenderableState>>> custom,
			int duration,
			Interpolation interpType
			) {
		MultipartTransition<Part, RenderContext<RenderableState>> mt = new MultipartTransition<Part, RenderContext<RenderableState>>(duration, 0, interpType)
				.withPartPositionFunction(Part.MAIN_ITEM, createWeaponPartPositionFunction(w))
				.withPartPositionFunction(Part.LEFT_HAND, createWeaponPartPositionFunction(lh))
				.withPartPositionFunction(Part.RIGHT_HAND, createWeaponPartPositionFunction(rh));
		custom.forEach((part, position) -> {
			mt.withPartPositionFunction(part, createWeaponPartPositionFunction(position));
		});
		return Collections.singletonList(mt);
	}
	
	private List<MultipartTransition<Part, RenderContext<RenderableState>>> getSimpleTransitionBeizer(
			Consumer<RenderContext<RenderableState>> w,
			Consumer<RenderContext<RenderableState>> lh,
			Consumer<RenderContext<RenderableState>> rh,
			//Consumer<RenderContext<RenderableState>> m,
			LinkedHashMap<Part, Consumer<RenderContext<RenderableState>>> custom,
			int duration, Vec3d beizer) {
		MultipartTransition<Part, RenderContext<RenderableState>> mt = new MultipartTransition<Part, RenderContext<RenderableState>>(duration, 0, beizer)
				.withPartPositionFunction(Part.MAIN_ITEM, createWeaponPartPositionFunction(w))
				.withPartPositionFunction(Part.LEFT_HAND, createWeaponPartPositionFunction(lh))
				.withPartPositionFunction(Part.RIGHT_HAND, createWeaponPartPositionFunction(rh));
		custom.forEach((part, position) -> {
			mt.withPartPositionFunction(part, createWeaponPartPositionFunction(position));
		});
		return Collections.singletonList(mt);
	}

	private class FirstPersonWeaponTransitionProvider implements MultipartTransitionProvider<RenderableState, Part, RenderContext<RenderableState>> {

		@Override
		public List<MultipartTransition<Part, RenderContext<RenderableState>>> getTransitions(RenderableState state) {
			
		
			switch(state) {
			case MODIFYING:
				return getSimpleTransition(getBuilder().firstPersonPositioningModifying,
						getBuilder().firstPersonLeftHandPositioningModifying,
						getBuilder().firstPersonRightHandPositioningModifying,
						getBuilder().firstPersonCustomPositioning,
						DEFAULT_ANIMATION_DURATION);
			case MODIFYING_ALT:
                return getSimpleTransition(getBuilder().firstPersonPositioningModifyingAlt,
                        getBuilder().firstPersonLeftHandPositioningModifyingAlt,
                        getBuilder().firstPersonRightHandPositioningModifyingAlt,
                        getBuilder().firstPersonCustomPositioning,
                        DEFAULT_ANIMATION_DURATION);
			case RUNNING:
				return
						getSimpleTransition(getBuilder().firstPersonPositioningRunning,
						getBuilder().firstPersonLeftHandPositioningRunning,
						getBuilder().firstPersonRightHandPositioningRunning,
						getBuilder().firstPersonCustomPositioning,
						325, Interpolation.ACCELERATION);
			case UNLOAD_EMPTY:
				return getComplexTransition(getBuilder().unloadEmptyContainer);
			case LOAD_EMPTY:
				return getComplexTransition(getBuilder().loadEmptyContainer);
			case TACTICAL_RELOAD:
				
				
				return getComplexTransition(getBuilder().tacticalReloadContainer);
			case UNLOADING:
				return getComplexTransition(getBuilder().firstPersonPositioningUnloading,
						getBuilder().firstPersonLeftHandPositioningUnloading,
						getBuilder().firstPersonRightHandPositioningUnloading,
						getBuilder().firstPersonCustomPositioningUnloading
						);
			case RELOADING:
				return getComplexTransition(getBuilder().firstPersonPositioningReloading,
						getBuilder().firstPersonLeftHandPositioningReloading,
						getBuilder().firstPersonRightHandPositioningReloading,
						getBuilder().firstPersonCustomPositioningReloading
						);
			case COMPOUND_RELOAD:
				
				return getComplexTransition(getBuilder().compoundReloadContainer);
			case COMPOUND_RELOAD_EMPTY:
				
				
				
				return getComplexTransition(getBuilder().compoundReloadEmptyContainer);
			case LOAD_ITERATION:
                return getComplexTransition(getBuilder().firstPersonPositioningLoadIteration,
                        getBuilder().firstPersonLeftHandPositioningLoadIteration,
                        getBuilder().firstPersonRightHandPositioningLoadIteration,
                        getBuilder().firstPersonCustomPositioningLoadIteration
                        );
			case INSPECTING:
				
                return getComplexTransition(getBuilder().firstPersonPositioningInspecting,
                        getBuilder().firstPersonLeftHandPositioningInspecting,
                        getBuilder().firstPersonRightHandPositioningInspecting,
                        getBuilder().firstPersonCustomPositioningInspecting
                        );
            case DRAWING:
                return getComplexTransition(getBuilder().firstPersonPositioningDrawing,
                        getBuilder().firstPersonLeftHandPositioningDrawing,
                        getBuilder().firstPersonRightHandPositioningDrawing,
                        getBuilder().firstPersonCustomPositioningDrawing
                        );
			case LOAD_ITERATION_COMPLETED:
                return getSimpleTransition(getBuilder().firstPersonPositioningLoadIterationCompleted,
                        getBuilder().firstPersonLeftHandPositioningLoadIterationCompleted,
                        getBuilder().firstPersonRightHandPositioningLoadIterationCompleted,
                        getBuilder().firstPersonCustomPositioningLoadIterationCompleted,
                        getBuilder().loadIterationCompletedAnimationDuration);
			case ALL_LOAD_ITERATIONS_COMPLETED:
                return getComplexTransition(getBuilder().firstPersonPositioningAllLoadIterationsCompleted,
                        getBuilder().firstPersonLeftHandPositioningAllLoadIterationsCompleted,
                        getBuilder().firstPersonRightHandPositioningAllLoadIterationsCompleted,
                        getBuilder().firstPersonCustomPositioningLoadIterationsCompleted
                        );
			case RECOILED:
				return getSimpleTransition(getBuilder().firstPersonPositioningRecoiled,
						getBuilder().firstPersonLeftHandPositioningRecoiled,
						getBuilder().firstPersonRightHandPositioningRecoiled,
						getBuilder().firstPersonCustomPositioningRecoiled,
						getBuilder().recoilAnimationDuration);
            case PRONING_RECOILED:
                return getSimpleTransition(getBuilder().firstPersonPositioningProningRecoiled,
                        getBuilder().firstPersonLeftHandPositioningProningRecoiled,
                        getBuilder().firstPersonRightHandPositioningProningRecoiled,
                        getBuilder().firstPersonCustomPositioningProningRecoiled,
                        getBuilder().recoilAnimationDuration);
			case SHOOTING:
				return getSimpleTransition(getBuilder().firstPersonPositioningShooting,
						getBuilder().firstPersonLeftHandPositioningShooting,
						getBuilder().firstPersonRightHandPositioningShooting,
						getBuilder().firstPersonCustomPositioning,
						getBuilder().shootingAnimationDuration);
            case PRONING_SHOOTING:
                return getSimpleTransition(getBuilder().firstPersonPositioningProningShooting,
                        getBuilder().firstPersonLeftHandPositioningProningShooting,
                        getBuilder().firstPersonRightHandPositioningProningShooting,
                        getBuilder().firstPersonCustomPositioning,
                        getBuilder().shootingAnimationDuration);
			case EJECT_SPENT_ROUND:
				return getComplexTransition(getBuilder().firstPersonPositioningEjectSpentRound,
						getBuilder().firstPersonLeftHandPositioningEjectSpentRound,
						getBuilder().firstPersonRightHandPositioningEjectSpentRound,
						getBuilder().firstPersonCustomPositioningEjectSpentRound
						);
			case EJECT_SPENT_ROUND_AIMED:
                return getComplexTransition(getBuilder().firstPersonPositioningEjectSpentRoundAimed,
                        getBuilder().firstPersonLeftHandPositioningEjectSpentRoundAimed,
                        getBuilder().firstPersonRightHandPositioningEjectSpentRoundAimed,
                        getBuilder().firstPersonCustomPositioningEjectSpentRoundAimed
                        );
			case NORMAL:
				return getSimpleTransitionBeizer(getBuilder().firstPersonPositioning,
						getBuilder().firstPersonLeftHandPositioning,
						getBuilder().firstPersonRightHandPositioning,
						getBuilder().firstPersonCustomPositioning,
						DEFAULT_ANIMATION_DURATION, getBuilder().beizer);
            case PRONING:
                return getSimpleTransition(getBuilder().firstPersonPositioningProning,
                        getBuilder().firstPersonLeftHandPositioningProning,
                        getBuilder().firstPersonRightHandPositioningProning,
                        getBuilder().firstPersonCustomPositioningProning,
                        DEFAULT_ANIMATION_DURATION);
			case ZOOMING:
				
				
				return getSimpleTransitionBeizer(getBuilder().firstPersonPositioningZooming,
						getBuilder().firstPersonLeftHandPositioningZooming,
						getBuilder().firstPersonRightHandPositioningZooming,
						getBuilder().firstPersonCustomPositioningZooming,
						DEFAULT_ANIMATION_DURATION, getBuilder().beizer);
				
			case ZOOMING_SHOOTING:
				return getSimpleTransition(getBuilder().firstPersonPositioningZoomingShooting,
						getBuilder().firstPersonLeftHandPositioningZooming,
						getBuilder().firstPersonRightHandPositioningZooming,
						getBuilder().firstPersonCustomPositioningZoomingShooting,
						60);
			case ZOOMING_RECOILED:
				return getSimpleTransition(getBuilder().firstPersonPositioningZoomingRecoiled,
						getBuilder().firstPersonLeftHandPositioningZooming,
						getBuilder().firstPersonRightHandPositioningZooming,
						getBuilder().firstPersonCustomPositioningZoomingRecoiled,
						60);
			default:
				break;
			}
			return null;
		}
	}
	
	private class ThirdPersonWeaponTransitionProvider implements MultipartTransitionProvider<RenderableState, Part, RenderContext<RenderableState>> {

        @Override
        public List<MultipartTransition<Part, RenderContext<RenderableState>>> getTransitions(RenderableState state) {
            switch(state) {
            case UNLOADING:
                return getComplexTransition(getBuilder().thirdPersonPositioningUnloading,
                        getBuilder().thirdPersonLeftHandPositioningUnloading,
                        getBuilder().thirdPersonRightHandPositioningUnloading,
                        getBuilder().thirdPersonCustomPositioningUnloading
                        );
            case RELOADING:
                return getComplexTransition(getBuilder().thirdPersonPositioningReloading,
                        getBuilder().thirdPersonLeftHandPositioningReloading,
                        getBuilder().thirdPersonRightHandPositioningReloading,
                        getBuilder().thirdPersonCustomPositioningReloading
                        );
            case NORMAL: default:
                return getSimpleTransition(getBuilder().thirdPersonPositioning,
                        context -> {},
                        context -> {},
                        new LinkedHashMap<>(),
                        DEFAULT_ANIMATION_DURATION);
//            default:
//                return getSimpleTransition(context -> {},
//                        context -> {
//                            //
//                        },
//                        context -> {
////                            GL11.glTranslatef(0f, 0.5f, 0f);
////                            GL11.glRotatef(30f, 0f, 0f, 1f);
//                        },
//                        new LinkedHashMap<>(),
//                        DEFAULT_ANIMATION_DURATION);
            }
            //return null;
        }
    }
	
	public static ResourceLocation SPARKS_ONE = new ResourceLocation(ModReference.ID + ":textures/flashes/sparks1.png");
	public static ResourceLocation FLASHF = new ResourceLocation(ModReference.ID + ":textures/flashes/flashfront2.png");

	public static ItemAttachment<Weapon> magicMagReplacement;
	public static boolean updateMagicMagazine;
	
	public void renderItem(ItemStack weaponItemStack, RenderContext<RenderableState> renderContext, Positioner<Part, RenderContext<RenderableState>> positioner) {
		if(DebugCommand.debugFlag == 1)
			return;
		
		weaponItemStack.getItem();
		
		if(ClientEventHandler.muzzlePositioner && !OpenGLSelectionHelper.isInSelectionPass) {
			GlStateManager.pushMatrix();
			Vec3d deb = ClientEventHandler.debugmuzzlePosition;
			GlStateManager.translate(deb.x, deb.y, deb.z);
			WeaponRenderer.captureAtlasPosition();
			GlStateManager.popMatrix();
		}

		//ClientEventHandler.uploadFlash(mc.player.getEntityId());
		
		boolean shot = false;
		if(renderContext.getPlayer() != null && (ClientEventHandler.checkShot(renderContext.getPlayer().getEntityId()) || AnimationGUI.getInstance().forceFlash.isState())) {
			shot = true;
			//flash = ShaderLoader.loadShader(new ResourceLocation(ModReference.id + ":shaders/flash"));

		    //MuzzleFlashRenderer.renderFlash(renderContext.getPlayer().getEntityId(), weaponItemStack, true);
			//mc.getFramebuffer().bindFramebuffer(false);
			
			
			//Vec3d iP  = MWCUtil.getInterpolatedPlayerPos();
			//PostProcessPipeline.getLightManager().addLight((float) iP.x, (float) iP.y, (float) iP.z, 1.0f, 0.623f, 0.262f, 0.1f, 0.009f, 0.032f);

			MuzzleFlashRenderer.renderFlash(renderContext.getPlayer().getEntityId(), weaponItemStack, false);

			//Vec3d distortPos = new Vec3d(0, 0, 1).rotateYaw((float) -Math.toRadians(mc.player.rotationYaw)).add(mc.player.getPositionEyes(1.0f));
			
			//PostProcessPipeline.createDistortionPoint((float) distortPos.x, (float) distortPos.y, (float) distortPos.z, 1f, 300);
			
			/*
			renderFlash(weaponItemStack, true);
			mc.getFramebuffer().bindFramebuffer(false);
			renderFlash(weaponItemStack, false);
			*/
		}
		//ClientEventHandler.muzzleFlashMap.clear();
		//ClientEventHandler.uploadFlash(mc.player.getEntityId());

		/*
		 GL11.glGetFloat(GL11.GL_MODELVIEW_MATRIX, MODELVIEW);
	        GL11.glGetFloat(GL11.GL_PROJECTION_MATRIX, PROJECTION);
	        GL11.glGetInteger(GL11.GL_VIEWPORT, VIEWPORT);
			Project.gluProject(-0.2f, -1.4f, 0, MODELVIEW, PROJECTION, VIEWPORT, POSITION);
		      */
		
		//Project.gluProject((float) (100f*Math.random()-100), (float) (100f*Math.random()-100), (float) (100f*Math.random()-100), buf, buf2, buf3, test);
			
		if(DebugCommand.debugFlag == 2)
			return;
			
		List<CompatibleAttachment<? extends AttachmentContainer>> attachments = null;
		if(getBuilder().getModel() instanceof ModelWithAttachments) {
			attachments = ((Weapon) weaponItemStack.getItem()).getActiveAttachments(renderContext.getPlayer(), weaponItemStack);
		}

		if(getBuilder().getTextureName() != null) {
			mc.renderEngine.bindTexture(new ResourceLocation(ModReference.ID + ":textures/models/" + getBuilder().getTextureName()));
		} else {
			String textureName = null;
			/*
			CompatibleAttachment<?> compatibleSkin = attachments.stream()
					.filter(ca -> ca.getAttachment() instanceof ItemSkin).findAny().orElse(null);
			if(compatibleSkin != null) {
				PlayerItemInstance<?> itemInstance = getClientModContext().getPlayerItemInstanceRegistry()
						.getItemInstance(renderContext.getPlayer(), weaponItemStack);
				if(itemInstance instanceof PlayerWeaponInstance) {
					int textureIndex = ((PlayerWeaponInstance) itemInstance).getActiveTextureIndex();
					if(textureIndex >= 0) {
						textureName = ((ItemSkin) compatibleSkin.getAttachment()).getTextureVariant(textureIndex)
								+ ".png";
					}
				}
			}*/

			if(textureName == null) {
				Weapon weapon = ((Weapon) weaponItemStack.getItem());
				textureName = weapon.getTextureName();
			}

			mc.renderEngine.bindTexture(new ResourceLocation(ModReference.ID + ":textures/models/" + textureName));
		}
		
		
		if(DebugCommand.debugFlag == 3) return;
		
		//gunLightingShader = ShaderLoader.loadShader(new ResourceLocation(ModReference.id + ":shaders/gunlight"));
	    
		//Shaders.gunLightingShader = ShaderLoader.loadVMWShader("gunlight");
		
		if(!OpenGLSelectionHelper.isInSelectionPass && !AnimationGUI.getInstance().magEdit.isState()) {
			
			//Shaders.gunLightingShader = ShaderLoader.loadVMWShader("gunlight");
			GlStateManager.enableBlend();
			//OpenGlHelper.glFramebufferTexture2D(OpenGlHelper.GL_FRAMEBUFFER, GL30.GL_COLOR_ATTACHMENT1, GL11.GL_TEXTURE_2D, PostProcessPipeline.maskingBuffer.framebufferTexture, 0);
			
			
			ItemAttachment<Weapon> skin = renderContext.getWeaponInstance().getAttachmentItemWithCategory(AttachmentCategory.SKIN);
			boolean useSkin = skin != null; 
			
			if(useSkin) {
		
				ItemSkin itemSkin = (ItemSkin) skin;
				GlStateManager.setActiveTexture(GL13.GL_TEXTURE0 + 3);

				if (itemSkin.getTextureName().startsWith("customskin_")) {
					mc.getTextureManager().bindTexture(CustomSkin.getCustomSkinResource(itemSkin.getTextureName().toLowerCase().replace("customskin_", "")));
				} else {
					mc.getTextureManager().bindTexture(new ResourceLocation(ModReference.ID +":textures/models/"+itemSkin.getTextureName()+".png"));
				}
				
				GlStateManager.setActiveTexture(GL13.GL_TEXTURE0);
			}
			
			if (DebugCommand.debugFlag == 4)
				return;
			
			if(ModernConfigManager.enableAllShaders && ModernConfigManager.enableGunShaders) {
				Shaders.gunLightingShader.use();
				Shaders.gunLightingShader.uniform1f("time", ClientValueRepo.TICKER.getLerpedFloat());
				Shaders.gunLightingShader.uniform1i("disabled", BalancePackManager.isWeaponDisabled(renderContext.getWeaponInstance().getWeapon()) ? 1 : 0);
				
				if(useSkin) {
					Shaders.gunLightingShader.uniform1i("skin", 3);
					
				}
				Shaders.gunLightingShader.uniform1i("useSkin", useSkin ? 1 : 0);
				
				
		    	GL20.glUniform1i(GL20.glGetUniformLocation(Shaders.gunLightingShader.getShaderId(), "lightmap"), 1);
		    	GL20.glUniform1f(GL20.glGetUniformLocation(Shaders.gunLightingShader.getShaderId(), "lightIntensity"), shot ? 1.5f + ((float) Math.random()) : 0.0f);
			
			}
			
			if(DebugCommand.debugFlag == 5) return;
			
		}
		
    	// Clears out the defferal list, so that a new set can be
		// populated in.
		deferredPost.clear();

		double sqDistance = 0.0;
		
		if(player != null && player != mc.player) {
		    Vec3d projectView = net.minecraft.client.renderer.ActiveRenderInfo.projectViewFromEntity(
		            mc.player, 
		            renderContext.getAgeInTicks());
		    sqDistance = projectView.squareDistanceTo(player.posX, player.posY, player.posZ);
		}

		double volumeThreshold = sqDistance;

		if(sqDistance > Interceptors.OPTIMIZATION_MODE_MIN)
			Interceptors.setRenderVolumeThreshold(volumeThreshold - Interceptors.OPTIMIZATION_MODE_MIN);
		
		//Interceptors.setRenderVolumeThreshold(0.0);
		
		try {
			if(!AnimationModeProcessor.getInstance().shouldIsolateCategory()) {
			//	GlStateManager.translate(0, 0, test1);
				//GlStateManager.translate(-0.05*test1, 0.01*test1, 0);
				//GlStateManager.rotate(-10f*test1, 1, 1, 0);
				//mc.getTextureManager().bindTexture(new ResourceLocation(ModReference.id + ":textures/items/sexmoiv.png"));

				if (getBuilder().getModel() != null) {
					getBuilder().getModel().render(this.player,
							renderContext.getLimbSwing(),
							renderContext.getFlimbSwingAmount(),
							renderContext.getAgeInTicks(),
							renderContext.getNetHeadYaw(),
							renderContext.getHeadPitch(),
							renderContext.getScale());
				} else {
					// TODO: Make It render
					getBuilder().getBakedModel();
				}
			}
		    
			if(DebugCommand.debugFlag == 6) return;
			

			// NOTE: Removed as the cube count optimization wasn't working due to
			// Q-renderer.
		    if(/*sqDistance < 900*/ true) {
		    	if(sqDistance > Interceptors.OPTIMIZATION_MODE_MIN)
		    		Interceptors.setRenderVolumeThreshold(volumeThreshold - Interceptors.OPTIMIZATION_MODE_MIN);
		        if(attachments != null) {
		       
		            renderAttachments(positioner, renderContext, attachments);
		        }
		    }
		    
		    if(DebugCommand.debugFlag == 7)
				return;
			
		} finally {
		    Interceptors.setRenderVolumeThreshold(0.0);
		}
		
		
		
		
		if(DebugCommand.debugFlag == 8)
			return;
		
		if(!OpenGLSelectionHelper.isInSelectionPass && ModernConfigManager.enableAllShaders && ModernConfigManager.enableGunShaders) Shaders.gunLightingShader.release();
		
		
		if(DebugCommand.debugFlag == 9)
			return;
		
		
		if(!AnimationModeProcessor.getInstance().getFPSMode()) renderPostRenderers(renderContext);
		
		
		
		/*
		for(CompatibleAttachment<?> compatibleAttachment: attachments) {
			@SuppressWarnings("unchecked")
	        CustomRenderer<RenderableState> postRenderer = (CustomRenderer<RenderableState>) compatibleAttachment.getAttachment().getPostRenderer();
			if(postRenderer != null) {
				
				GL11.glPushMatrix();
				GL11.glPushAttrib(GL11.GL_ENABLE_BIT | GL11.GL_CURRENT_BIT);
				postRenderer.render(renderContext);
				GL11.glPopAttrib();
				GL11.glPopMatrix();
				
			}
		}
		*/
		
	}

	public void renderAttachments(Positioner<Part, RenderContext<RenderableState>> positioner, RenderContext<RenderableState> renderContext,List<CompatibleAttachment<? extends AttachmentContainer>> attachments) {
		GlStateManager.color(1, 1, 1);
		for(CompatibleAttachment<?> compatibleAttachment: attachments) {
			if(compatibleAttachment != null && !(compatibleAttachment.getAttachment() instanceof ItemSkin) && !(compatibleAttachment.getAttachment() instanceof ItemScope)) {
				
				if(AnimationModeProcessor.getInstance().shouldIsolateCategory() && compatibleAttachment.getAttachment().getCategory() != AnimationModeProcessor.getInstance().getIsolatedCategory()) continue;
				renderCompatibleAttachment(compatibleAttachment, positioner, renderContext);
			}
		}
		
		for(CompatibleAttachment<?> compatibleAttachment: attachments) {
			if(compatibleAttachment != null && !(compatibleAttachment.getAttachment() instanceof ItemSkin) && (compatibleAttachment.getAttachment() instanceof ItemScope)) {
				if(AnimationModeProcessor.getInstance().shouldIsolateCategory() && compatibleAttachment.getAttachment().getCategory() != AnimationModeProcessor.getInstance().getIsolatedCategory()) continue;
				
				renderCompatibleAttachment(compatibleAttachment, positioner, renderContext);
			}
		}
	}

	
	
	
	public void setMagicMagPermit(boolean state) {
	}
	
	
	public void setMagicMag(PlayerWeaponInstance instance, ItemAttachment<Weapon> weapon, WeaponState nextState) {
		
		magicMagReplacement = weapon;
		updateMagicMagazine = true;
		magicState = nextState;

		magicAnimationTimer = System.currentTimeMillis();
		
		Vec3d magRotationPoint = ((ItemMagazine) weapon).rotationPoint;
		
		if(getBuilder().isHasTacticalReload() && nextState == WeaponState.TACTICAL_RELOAD) {
			getWeaponRendererBuilder().tacticalReloadContainer.getCustom().put(SpecialAttachments.MagicMag.getRenderablePart(),
					BBLoader.getAnimation(getBuilder().getAnimationFileName(), BBLoader.KEY_TACTICAL_RELOAD, BBLoader.KEY_MAGIC_MAGAZINE)
					.getTransitionList(Transform.NULL
							
							.withRotationPoint(magRotationPoint.x, magRotationPoint.y, magRotationPoint.z)
							.copy(), BBLoader.HANDDIVISOR));
			
			
		} else if(isCompoundReloadEmptyTactical() && nextState == WeaponState.COMPOUND_RELOAD_EMPTY) {
			
			// Log
			LOG.debug("Creating a compound empty animation using the magic magazine system");
			
			getWeaponRendererBuilder().compoundReloadEmptyContainer.getCustom().put(SpecialAttachments.MagicMag.getRenderablePart(),
					BBLoader.getAnimation(getBuilder().getAnimationFileName(), BBLoader.KEY_COMPOUND_RELOAD_EMPTY, BBLoader.KEY_MAGIC_MAGAZINE)
					.getTransitionList(Transform.NULL
							
							.withRotationPoint(magRotationPoint.x, magRotationPoint.y, magRotationPoint.z)
							.copy(), BBLoader.HANDDIVISOR));
		} else if(isCompoundReloadTactical() && nextState == WeaponState.COMPOUND_RELOAD) {
			
			// Log
			LOG.debug("Creating a standard compound animation using the magic magazine system");
			
			getWeaponRendererBuilder().compoundReloadContainer.getCustom().put(SpecialAttachments.MagicMag.getRenderablePart(),
					BBLoader.getAnimation(getBuilder().getAnimationFileName(), BBLoader.KEY_COMPOUND_RELOAD, BBLoader.KEY_MAGIC_MAGAZINE)
					.getTransitionList(Transform.NULL
							.withRotationPoint(magRotationPoint.x, magRotationPoint.y, magRotationPoint.z)
							.copy(), BBLoader.HANDDIVISOR));
		} 
	}
	
	private CompatibleAttachment<?> currentMagazine;

	public String name;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
    private void renderCompatibleAttachment(CompatibleAttachment<?> compatibleAttachment,
			Positioner<Part, RenderContext<RenderableState>> positioner, RenderContext<RenderableState> renderContext) {

		
		
		
		if(compatibleAttachment.getAttachment().getCategory() == AttachmentCategory.MAGAZINE) {
			currentMagazine = compatibleAttachment;
		}
		
		
		if(AnimationModeProcessor.getInstance().getExcludedCategory() == compatibleAttachment.getAttachment().getCategory()) return;
		
		
		
		
		// For animation mode
		if(AnimationModeProcessor.getInstance().shouldIsolateCategory()) {
			if(AnimationModeProcessor.getInstance().getIsolatedCategory() != compatibleAttachment.getAttachment().getCategory());
			
		}
		// Do magic mag stuff
		if(compatibleAttachment.getAttachment().getCategory() == AttachmentCategory.MAGICMAG) {
			
			
			
			WeaponState state = renderContext.getWeaponInstance().getState();
			if(!renderContext.getWeaponInstance().getWeapon().builder.isUsingNewSystem()) return;
			
			
			
			
			if(magicMagReplacement != null && updateMagicMagazine) {
				// New magazine? No problem-- just swap the models.
				updateMagicMagazine = false;
				compatibleAttachment.getAttachment().setFirstModel(magicMagReplacement);
			}
			
			
			
			
			// The *1.2 is important so that the magazine is there until the animation is fully completed
			boolean time = System.currentTimeMillis() - this.magicAnimationTimer >=
					 renderContext.getWeaponInstance().getAnimationDuration(magicState) * 1.2;
		
			
			
			// If the times up, remove our permit
			if(time) setMagicMagPermit(false);
					
			// If we don't have a permit cancel
						//if(!magicMagPermit) return;
			
			boolean isFinishing = state != WeaponState.COMPOUND_RELOAD_FINISHED && state != WeaponState.COMPOUND_RELOAD_FINISH;
			
			
			if(magicState == WeaponState.COMPOUND_RELOAD) {
				if((state == WeaponState.COMPOUND_REQUESTED || state == WeaponState.COMPOUND_RELOAD || state == WeaponState.COMPOUND_RELOAD_FINISHED) && !isCompoundReloadTactical()) {
					
					return;
				}
			}
			
			if(magicState == WeaponState.COMPOUND_RELOAD_EMPTY) {
				if((state == WeaponState.COMPOUND_RELOAD_EMPTY) && !isCompoundReloadEmptyTactical()) {
					return;
				}
			}
			
			
		
			
			
			// Run checks
			if(time) {
				if(!isCompoundReloadEmptyTactical() && !isCompoundReloadTactical() && !getBuilder().isHasTacticalReload())
					return;
					
					
				
				
				
					
				if(state != WeaponState.COMPOUND_RELOAD_EMPTY && state != WeaponState.COMPOUND_RELOAD && state != WeaponState.TACTICAL_RELOAD && isFinishing) {
					return;
				}
				
				
				
				
			
			
			} else if(!isCompoundReloadEmptyTactical() && !isCompoundReloadTactical() && !getBuilder().isHasTacticalReload()){
				return;
			}
			
			
			
			//ItemAttachment<Weapon> exp = renderContext.getModContext().getAttachmentAspect().getActiveAttachment(renderContext.getWeaponInstance(), AttachmentCategory.MAGAZINE);
			if(currentMagazine != null) {
				//compatibleAttachment.getModelPositioning().accept(texturedModel.getU());
				
				//currentMagazine.getModelPositioning().accept(arg0);
			}
			
			
		
		}
		
		
		
		
		
		
		
		
		if(compatibleAttachment.getAttachment() instanceof ItemMagazine && AnimationGUI.getInstance().magEdit.isState() && !OpenGLSelectionHelper.isInSelectionPass) {
	    	compatibleAttachment.getAttachment();
	    	
	    	
	    	GlStateManager.pushMatrix();
	    	
	    	//GlStateManager.translate(mag.getRotationPoint().x, mag.getRotationPoint().y, mag.getRotationPoint().z);
	    	GlStateManager.translate(ClientEventHandler.magRotPositioner.x, ClientEventHandler.magRotPositioner.y, ClientEventHandler.magRotPositioner.z);
	    	
	    	
	    	WeaponRenderer.captureAtlasPosition();
	    	//AnimationModeProcessor.getInstance().captureDeferral();
	    	
	    	GlStateManager.popMatrix();
	    }
		GL11.glPushMatrix();
		GL11.glPushAttrib(GL11.GL_ENABLE_BIT | GL11.GL_CURRENT_BIT);

		if(compatibleAttachment.getPositioning() instanceof BiConsumer) {
			((BiConsumer) compatibleAttachment.getPositioning()).accept(renderContext.getPlayer(), renderContext.getWeapon());
		} else if(compatibleAttachment.getPositioning() instanceof Consumer) {
            ((Consumer) compatibleAttachment.getPositioning()).accept(renderContext);
        }

		ItemAttachment<?> itemAttachment = compatibleAttachment.getAttachment();


		
	
		if(positioner != null) {
			
			if(itemAttachment instanceof Part) {
				
				
				positioner.position((Part) itemAttachment, renderContext);
			} else if(itemAttachment.getRenderablePart() != null) {
				positioner.position(itemAttachment.getRenderablePart(), renderContext);
			}
		}
		
		
		
		Entity renderViewEntity = mc.getRenderViewEntity();
	    if(renderViewEntity == null) {
	        renderViewEntity = mc.player;
	    }
//	    double distanceSq = this.player != null ? renderViewEntity.getDistanceSq(this.player) : 0;

	   // GlStateManager.rotate(45, 1, 0, 0);
	    
	    
	    
	    
	   
	    
		for(Tuple<ModelBase, String> texturedModel: compatibleAttachment.getAttachment().getTexturedModels()) {
			mc.renderEngine.bindTexture(new ResourceLocation(ModReference.ID + ":textures/models/" + texturedModel.getV()));
			GL11.glPushMatrix();
			GL11.glPushAttrib(GL11.GL_ENABLE_BIT | GL11.GL_CURRENT_BIT);
			
			
			
			//System.out.println(compatibleAttachment.getAttachment().getCategory());
			
			
			if(compatibleAttachment.getAttachment().getCategory() == AttachmentCategory.ACTION) {
				
				if(AnimationModeProcessor.getInstance().getFPSMode()) {
					
					AnimationModeProcessor.getInstance().slideTransform.doGLDirect();

					WeaponRenderer.captureAtlasPosition();
				}
			}
			
			
			if(compatibleAttachment.getModelPositioning() != null) {
			
				/*
				if(!(compatibleAttachment.getAttachment() instanceof ItemMagazine)) {
					compatibleAttachment.getModelPositioning().accept(texturedModel.getU());
				} else {
					new Transform().withScale(1, 1, 1).withRotationPoint(ClientEventHandler.magRotPositioner.x, ClientEventHandler.magRotPositioner.y, ClientEventHandler.magRotPositioner.z).withRotation(45, 0, 0).doGLDirect();
				}*/
				
				
				if(compatibleAttachment.getAttachment().getCategory() == AttachmentCategory.MAGICMAG) {
					if(currentMagazine != null) {
						currentMagazine.getModelPositioning().accept(texturedModel.getU());
					}
				} else {
					compatibleAttachment.getModelPositioning().accept(texturedModel.getU());
					
				}
				
				/*
				if(compatibleAttachment.getAttachment().getCategory() == AttachmentCategory.ACTION) {

					//System.out.println("hi");
					if(renderContext.getWeaponInstance().getAmmo() != 0) {
						renderContext.getWeaponInstance().setSlideLock(false);
					}
					
					WeaponState state = renderContext.getWeaponInstance().getState();
					//System.out.println(renderContext.getWeaponInstance());
					if(renderContext.getWeaponInstance().isSlideLocked() && (state == WeaponState.READY || state == WeaponState.ALERT)) {
						GlStateManager.translate(0, 0, 0.43);
					}
					
					double slideKickback = ClientValueRepo.gunPow.getLerpedFloat()/32f;
					
					slideKickback *= slideKickback*slideKickback;
					slideKickback = Math.min(slideKickback, 0.5);
					
					GlStateManager.translate(0, 0, slideKickback);
					
				}
				*/
				/*
				if((compatibleAttachment.getAttachment() instanceof ItemMagazine)) {
					new Transform().withScale(1, 1, 1).withRotationPoint(ClientEventHandler.magRotPositioner.x, ClientEventHandler.magRotPositioner.y, ClientEventHandler.magRotPositioner.z)
					.withRotation(0, 0, 0).doGLDirect();
				}
				*/
			//	System.out.println(ClientValueRepo.slidePump.getLerpedFloat());
				
				ItemAttachment<Weapon>[] possibleActionList = renderContext.getWeaponInstance().getWeapon().getRenderer().getBuilder().actionPiece;
				
				if(possibleActionList != null && possibleActionList.length > 0) {
					for(ItemAttachment<Weapon> part : possibleActionList) {
						if(compatibleAttachment.getAttachment() == part) {
							
							
							float mu = (float) ClientValueRepo.slidePumpValue.getLerpedFloat();
							
					
							mu = Math.min(mu, 1.0f);
							
							
							
							Transform t = renderContext.getWeaponInstance().getWeapon().getRenderer().getBuilder().actionPieceTransform;
							

							if(DebugCommand.isDebuggingActionPosition()) {
								//System.out.println("hi");
								t = DebugCommand.debugSlideTransform;
								//System.out.println(t.getPositionZ());
								mu = 1f;
							}
							if(t == null) break;
							
							
							GlStateManager.translate(t.getPositionX()*mu, t.getPositionY()*mu, t.getPositionZ()*mu);
							
							break;
						}
					}
				}
				
				
			
				
				//System.out.println(compatibleAttachment.getAttachment());
				
			}
			
			
			
			//if(distanceSq < 49) {
		         texturedModel.getU().render(renderContext.getPlayer(),
		                    renderContext.getLimbSwing(),
		                    renderContext.getFlimbSwingAmount(),
		                    renderContext.getAgeInTicks(),
		                    renderContext.getNetHeadYaw(),
		                    renderContext.getHeadPitch(),
		                    renderContext.getScale());
			//}


			GL11.glPopAttrib();
			GL11.glPopMatrix();
		}

		
		
		List<CustomRenderer<?>> postList = compatibleAttachment.getAttachment().getAllPostRenderers();
		for(CustomRenderer<?> preloaded : postList) {
			CustomRenderer<RenderableState> actualPost = (CustomRenderer<RenderableState>) preloaded;
			deferredPost.add(new Pair<>(captureCurrentModelViewMatrix(), actualPost));
		}
		
		
		/*
		@SuppressWarnings("unchecked")
        CustomRenderer<RenderableState> postRenderer = (CustomRenderer<RenderableState>) compatibleAttachment.getAttachment().getPostRenderer();
		if(postRenderer != null) {
			// Stuff like lasers goes in here
			//postRenderer.render(renderContext);
			deferredPost.add(new Pair<>(captureCurrentModelViewMatrix(), postRenderer));
		}
		*/

		for(CompatibleAttachment<?> childAttachment: itemAttachment.getAttachments()) {
			renderCompatibleAttachment(childAttachment, positioner, renderContext);
		}

		GL11.glPopAttrib();
		GL11.glPopMatrix();
	}
	
	public FloatBuffer captureCurrentModelViewMatrix() {
		FloatBuffer buf = BufferUtils.createFloatBuffer(16);
		GL11.glGetFloat(GL11.GL_MODELVIEW_MATRIX, buf);
		buf.rewind();
		return buf;
	}
	
	public void renderPostRenderers(RenderContext<RenderableState> renderContext) {
		
	
		
		for(Pair<FloatBuffer, CustomRenderer<RenderableState>> pair : this.deferredPost) {
			GL11.glPushMatrix();
			
			GL11.glLoadMatrix(pair.first());
			
			GL11.glPushAttrib(GL11.GL_ENABLE_BIT | GL11.GL_CURRENT_BIT);
			pair.second().render(renderContext);
			GL11.glPopAttrib();
			GL11.glPopMatrix();
		}
		
	}
	
	public boolean hasRecoilPositioning() {
        return getBuilder().hasRecoilPositioningDefined;
    }
	
	public Vec3d getADSBeizer() {
		return getBuilder().beizer;
	}

    public long getTotalLoadIterationDuration() {
        return getBuilder().totalLoadIterationDuration;
    }

    public long getPrepareFirstLoadIterationAnimationDuration() {
        return getBuilder().prepareFirstLoadIterationAnimationDuration;
    }
    
    public long getAllLoadIterationAnimationsCompletedDuration() {
        return getBuilder().allLoadIterationAnimationsCompletedDuration;
    }

    public MultipartRenderStateManager<RenderableState, Part, RenderContext<RenderableState>> getStateManager(EntityPlayer player) {
        return firstPersonStateManagers.get(player);
    }


	public Builder getBuilder() {
		return builder;
	}


	public void setBuilder(Builder builder) {
		this.builder = builder;
	}

	@Override
	public List<BakedQuad> getQuads(IBlockState state, EnumFacing side, long rand) {
		// Todo: Actually make rendering compatible with Emissive Renderer
		if (ForgeModContainer.allowEmissiveItems)
			ForgeModContainer.allowEmissiveItems = false;

		if (transformType == ItemCameraTransforms.TransformType.GROUND
				|| transformType == ItemCameraTransforms.TransformType.GUI
				|| transformType == ItemCameraTransforms.TransformType.FIRST_PERSON_RIGHT_HAND
				|| transformType == ItemCameraTransforms.TransformType.THIRD_PERSON_RIGHT_HAND
				|| transformType == ItemCameraTransforms.TransformType.FIRST_PERSON_LEFT_HAND
				|| transformType == ItemCameraTransforms.TransformType.THIRD_PERSON_LEFT_HAND) {

			Tessellator tessellator = Tessellator.getInstance();
			BufferBuilder worldrenderer = tessellator.getBuffer();
			tessellator.draw();
			GlStateManager.pushMatrix();

			if (player != null) {
				if (transformType == ItemCameraTransforms.TransformType.THIRD_PERSON_RIGHT_HAND) {



					/*
					if (player.isSneaking() && (getClientModContext() != null && getClientModContext().getMainHeldWeapon() != null && getClientModContext().getMainHeldWeapon().isAimed())) {
						//GlStateManager.translate(0.0F, 0.2F, 0.0F);
					}*/

				} else if (transformType == ItemCameraTransforms.TransformType.FIRST_PERSON_LEFT_HAND
						|| transformType == ItemCameraTransforms.TransformType.FIRST_PERSON_RIGHT_HAND) {
					//
				}
			}

			if (onGround()) {
				GlStateManager.scale(-3f, -3f, -3f);
			}

			int currentTextureId = GlStateManager.glGetInteger(GL11.GL_TEXTURE_BINDING_2D);

			if (!AnimationModeProcessor.getInstance().getFPSMode()) {
				renderItem();
				//RenderHelper.enableStandardItemLighting();
			} else {
				GlStateManager.pushMatrix();
				renderItem();
				GlStateManager.popMatrix();

				OpenGLSelectionHelper.startSelectionPass();
				OpenGLSelectionHelper.bindSelectBuffer();
				renderItem();
				OpenGLSelectionHelper.stopSelectionPass();
				OpenGLSelectionHelper.fbo.bindFramebuffer(true);

				if (AnimationModeProcessor.getInstance().colorSelected == -1) {
					OpenGLSelectionHelper.readValueAtMousePosition();
				}

				mc.getFramebuffer().bindFramebuffer(false);
			}

			if (currentTextureId != 0) {
				GlStateManager.bindTexture(currentTextureId);
			}
			GlStateManager.popMatrix();

			worldrenderer.begin(GL11.GL_QUADS, DefaultVertexFormats.ITEM);
		}

		// Reset the dynamic values.
		this.player = null;
		this.itemStack = null;
		this.transformType = null;

		return Collections.emptyList();
	}

	protected boolean onGround() {
		return transformType == null;
	}

	@Override
	public final boolean isAmbientOcclusion() {
		return true;
	}

	@Override
	public final boolean isGui3d() {
		return true;
	}

	@Override
	public final boolean isBuiltInRenderer() {
		return false;
	}

	@Override
	public TextureAtlasSprite getParticleTexture() {
		return mc.getTextureMapBlocks().getMissingSprite();
	}

	public void setOwner(EntityLivingBase player) {
		this.player = player;
	}

	public static void applyRotationAtPoint(float xOffset, float yOffset, float zOffset, float xRotation,
											float yRotation, float zRotation) {
		GL11.glTranslatef(-xOffset, -yOffset, -zOffset);

		GL11.glRotatef(xRotation, 1f, 0f, 0f);
		GL11.glRotatef(yRotation, 0f, 1f, 0f);
		GL11.glRotatef(zRotation, 0f, 0f, 1f);

		GL11.glTranslatef(xOffset, yOffset, zOffset);
	}

	public static WeaponRotationHandler wrh = new WeaponRotationHandler();

	public static void captureAtlasPosition() {
		GL11.glGetFloat(GL11.GL_MODELVIEW_MATRIX, atlasMatrix);
	}

	public void setTransformType(ItemCameraTransforms.TransformType type) {
		this.transformType = type;
	}

	@SideOnly(Side.CLIENT)
	public void renderItem() {

		//if(true) return;


		// System.out.println(BBLoader.loadAnimationData("HKgrip.animation.json",
		// "animation.HKgrip.reload2", "bone4").bbTransition);
		GL11.glPushMatrix();

		// Framebuffer originalFramebuffer = mc.getFramebuffer();
		Framebuffer framebuffer = null;
		Integer inventoryTexture = null;

		boolean inventoryTextureInitializationPhaseOn = false;

		final ScaledResolution scaledresolution = new ScaledResolution(mc);

		int originalFramebufferId = -1;

		if (transformType == ItemCameraTransforms.TransformType.GUI && DebugCommand.isForceLiveRenderGUI()) {


			Object textureMapKey = this; // weaponItemStack != null ? weaponItemStack : this;
			inventoryTexture = getClientModContext().getInventoryTextureMap().get(textureMapKey);

			//mc.getFramebuffer()

			if (inventoryTexture == null) {

				originalFramebufferId = GlStateManager.glGetInteger(ARBFramebufferObject.GL_FRAMEBUFFER_BINDING);

				if (OpenGlHelper.isFramebufferEnabled()) {
					OpenGlHelper.glBindFramebuffer(OpenGlHelper.GL_FRAMEBUFFER, 0);
				}

				inventoryTextureInitializationPhaseOn = true;
				framebuffer = new Framebuffer(INVENTORY_TEXTURE_WIDTH, INVENTORY_TEXTURE_HEIGHT, true);
				//framebuffer = new MultisampledFBO(INVENTORY_TEXTURE_WIDTH, INVENTORY_TEXTURE_HEIGHT, true);




				framebuffer.bindFramebuffer(true);




				// Setup MSAA
				
				/*
				multisampleFBO  = GLCompatible.glGenFramebuffers();
				GLCompatible.glBindFramebuffer(GLCompatible.GL_FRAMEBUFFER, multisampleFBO);
				multiampleTexFBO = GL11.glGenTextures();
				
				int width = mc.displayWidth;
				int height = mc.displayHeight;
				
				GL11.glBindTexture(GLCompatible.GL_TEXTURE_2D_MULTISAMPLE, multiampleTexFBO);
				GLCompatible.glTexImage2DMultisample(GLCompatible.GL_TEXTURE_2D_MULTISAMPLE, 4, GL11.GL_RGBA8, width, height, false);*/
				//GLCompatible.glFramebufferTexture2D(GLCompatible.GL_FRAMEBUFFER, GLCompatible.GL_COLOR_ATTACHMENT0, GLCompatible.GL_TEXTURE_2D_MULTISAMPLE, framebuffer.framebufferTexture, 0);


				// End MSAA


				inventoryTexture = framebuffer.framebufferTexture;

				getClientModContext().getInventoryTextureMap().put(textureMapKey, inventoryTexture);

				setupInventoryRendering(INVENTORY_TEXTURE_WIDTH, INVENTORY_TEXTURE_HEIGHT);



			}

		}



		RenderContext<RenderableState> renderContext = new RenderContext<>(getClientModContext(), player, itemStack);

		renderContext.setAgeInTicks(-0.4f);
		renderContext.setScale(0.08f);
		renderContext.setCompatibleTransformType(transformType);

		Positioner<Part, RenderContext<RenderableState>> positioner = null;

		org.lwjgl.util.vector.Matrix4f forLater = null;

		boolean forceMSAA = false;
		switch (transformType) {
			case GROUND:
				GL11.glScaled(-1F, -1F, 1F);
				GL11.glScaled(0.45F, 0.45F, 0.45F);
				GL11.glTranslatef(-1.1f, -0.9f, 0f);
				GL11.glRotatef(0F, 1f, 0f, 0f);
				GL11.glRotatef(0F, 0f, 1f, 0f);
				GL11.glRotatef(0F, 0f, 0f, 1f);
				builder.getEntityPositioning().accept(itemStack);
				break;
			case GUI:

				forceMSAA = true;

				double inventoryScale = 30;

				GL11.glScaled(1, -1, 1);

				// RenderHelper.enableStandardItemLighting();
			

			/*
			GlStateManager.rotate(0f, 0, 0, 1);
			GlStateManager.rotate(120f, 0, 1, 0);
			GlStateManager.rotate(-20f, 1, 0, 0);
			
			GL11.glTranslatef(-150.0f, -40f, 0f);
			*/
			
			 /*
			GlStateManager.translate(50.0, -50.0, 0.0);
			//GlStateManager.rotate(180f, 1, 0, 0);
			GlStateManager.rotate(90f, 0, 0, 1);
			
			GlStateManager.scale(inventoryScale, inventoryScale, inventoryScale);
			*/
				new Transform()
						.withPosition(75, -85, 0)
						.withRotation(20, 130, 120)
						.withScale(inventoryScale, inventoryScale, inventoryScale)
						.doGLDirect();
			{
				StateDescriptor thirdPersonStateDescriptor = getThirdPersonStateDescriptor(player, itemStack);
				renderContext.setPlayerItemInstance(thirdPersonStateDescriptor.instance);
				MultipartPositioning<Part, RenderContext<RenderableState>> multipartPositioning = thirdPersonStateDescriptor.stateManager
						.nextPositioning();

				renderContext.setTransitionProgress(multipartPositioning.getProgress());

				renderContext.setFromState(multipartPositioning.getFromState(RenderableState.class));

				renderContext.setToState(multipartPositioning.getToState(RenderableState.class));

				positioner = multipartPositioning.getPositioner();

				positioner.position(Part.MAIN_ITEM, renderContext);
			}


			//	builder.getInventoryPositioning().accept(itemStack);
			break;
			case THIRD_PERSON_RIGHT_HAND:

			case THIRD_PERSON_LEFT_HAND:
				//System.out.println("yo");
				GL11.glScaled(-1F, -1F, 1F);
				GL11.glScaled(0.4F, 0.4F, 0.4F);
				GL11.glTranslatef(-1.25f, -2.1f, 0.6f);
				GL11.glRotatef(110F, 1f, 0f, 0f);
				GL11.glRotatef(135F, 0f, 1f, 0f);
				GL11.glRotatef(-180F, 0f, 0f, 1f);
				if (player instanceof EntityPlayer && !Interceptors.isProning((EntityPlayer) player)) {
					StateDescriptor thirdPersonStateDescriptor = getThirdPersonStateDescriptor(player, itemStack);

					renderContext.setPlayerItemInstance(thirdPersonStateDescriptor.instance);

					MultipartPositioning<Part, RenderContext<RenderableState>> thirdPersonMultipartPositioning = thirdPersonStateDescriptor.stateManager
							.nextPositioning();

					renderContext.setTransitionProgress(thirdPersonMultipartPositioning.getProgress());

					renderContext.setCancelBeizer();

					renderContext.setFromState(thirdPersonMultipartPositioning.getFromState(RenderableState.class));

					renderContext.setToState(thirdPersonMultipartPositioning.getToState(RenderableState.class));

					positioner = thirdPersonMultipartPositioning.getPositioner();

					positioner.position(Part.MAIN_ITEM, renderContext);

					if (DebugPositioner.isDebugModeEnabled()) {
						DebugPositioner.position(Part.MAIN_ITEM, renderContext);
					}
				} else {
					builder.getThirdPersonPositioning().accept(renderContext);
				}
				break;
			case FIRST_PERSON_RIGHT_HAND:
			case FIRST_PERSON_LEFT_HAND:

				/*
				 *
				 */

				// GlStateManager.translate(x, y, z);
				// LEGACY
				if(AnimationModeProcessor.getInstance().isLegacyMode()) {
					fixVersionSpecificFirstPersonPositioning(transformType);

				}

				GL11.glScaled(-1F, -1F, 1F);

				StateDescriptor stateDescriptor = getFirstPersonStateDescriptor(player, itemStack);
				renderContext.setPlayerItemInstance(stateDescriptor.instance);
				MultipartPositioning<Part, RenderContext<RenderableState>> multipartPositioning = stateDescriptor.stateManager
						.nextPositioning();

				renderContext.setTransitionProgress(multipartPositioning.getProgress());

				renderContext.setFromState(multipartPositioning.getFromState(RenderableState.class));

				renderContext.setToState(multipartPositioning.getToState(RenderableState.class));

				positioner = multipartPositioning.getPositioner();

				positioner.randomize(stateDescriptor.rate, stateDescriptor.amplitude);

				// Render grid in animation mode
				if (!OpenGLSelectionHelper.isInSelectionPass && AnimationModeProcessor.getInstance().getFPSMode()) {

					GlStateManager.pushMatrix();
					ResourceLocation loc = new ResourceLocation(ModReference.ID + ":textures/hud/grid.png");

					Shader grid = Shaders.grid;
					// GlStateManager.rotate(45f, 0, 1, 0);
					// GlStateManager.disableTexture2D();
					//mc.getTextureManager().bindTexture(loc);
					// GlStateManager.disableDepth();
					grid.use();
					GlStateManager.disableCull();
					Tessellator t = Tessellator.getInstance();
					BufferBuilder bb = t.getBuffer();
					bb.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX);
					double sL = 30.0;
					double y = 10;
					bb.pos(-1 * sL, y, -1 * sL).tex(1, 0).endVertex();
					bb.pos(1 * sL, y, -1 * sL).tex(1, 1).endVertex();
					bb.pos(1 * sL, y, 1 * sL).tex(0, 1).endVertex();
					bb.pos(-1 * sL, y, 1 * sL).tex(1, 1).endVertex();
					t.draw();

					GlStateManager.enableDepth();
					GlStateManager.popMatrix();
					grid.release();
				}
				GlStateManager.enableDepth();



				forLater = MatrixHelper.captureMatrix();





				// if(!DebugPositioner.isDebugModeEnabled())
				positioner.position(Part.MAIN_ITEM, renderContext);


				//new Transform().withPosition(-0.5, 0, 0.5).withRotation(15, -5, 15).withScale(1, 1, 1).doGLDirect();
			
			
			/*
			AnimationData anm = BBLoader.getAnimation("real", "reload", "main");
			//AnimationData anm = BBLoader.loadAnimationData("m16.animation.json", "animation.M16.reload", "main");
			FuckMyLife.instance.bbMap.clear();
	        for(Entry<Float, BlockbenchTransition> tranny : anm.bbTransition.entrySet()) {
				FuckMyLife.instance.bbMap.put(tranny.getKey(), tranny.getValue());
			}
	        
	        FuckMyLife.instance.timer += 0.013f;
	        
	        try {
	        	//FuckMyLife.instance.position(FuckMyLife.instance.timer, 4.0f, false);
	        } catch(Exception e) {
	        	e.printStackTrace();
	        }*/
	        
	        /*
	        GL11.glRotated(-23.0522f, 0, 0, 1);
			GL11.glRotated(-4.2163f, 0, 1, 0);
			GL11.glRotated(-3.6519f, 1, 0, 0);
			*/
			
			/*
			RecoilParam parameters = renderContext.getWeaponInstance().getWeapon().getRecoilParameters();

			boolean scopeFlag = true;
			boolean isPistol = parameters.getRecoilGroup() == 1;

			boolean isShotgun = parameters.getRecoilGroup() == 2;
			boolean isAssault = parameters.getRecoilGroup() == 0;
			float min = (isAssault && renderContext.getWeaponInstance().isAimed()) ? 0.2f : 1f;
			if (renderContext.getWeaponInstance().getScope() != null
					&& renderContext.getWeaponInstance().getScope().isOptical()
					&& renderContext.getWeaponInstance().isAimed()) {
				min *= 0.5;
				scopeFlag = true;
				// System.out.println("yo");
			}
			float maxAngle = (float) (2 * Math.PI);
			float time = (float) (35f - (ClientValueRepo.gunPow / 400));
			if (min != 1.0)
				time = 35f;
			float tick = (float) ((float) maxAngle * ((mc.player.ticksExisted % time) / time))
					- (maxAngle / 2);

			double amp = 0.07 + (ClientValueRepo.gunPow / 700);
			double a = 1;
			double b = 2;
			double c = Math.PI;

			EntityPlayer p = mc.player;

			float xRotation = (float) ((float) amp * Math.sin(a * tick + c));
			float yRotation = (float) ((float) amp * Math.sin(b * tick));
			float zRotation = (float) 0;

			RenderableState sus = stateDescriptor.getStateManager().getLastState();

			float shoting = (float) ClientValueRepo.gunPow;
			if (scopeFlag)
				shoting *= 0.2f;

			float recoilStop = (float) ClientValueRepo.recoilStop / 1.5f;

			float zRot = (float) ((float) -ClientValueRepo.gunPow / 25f + ((float) 0)) * min;

			float pistol = 25;
			float pR = isPistol ? (float) ClientValueRepo.randomRot.y : 0f;

			float muzzleRiser = (float) shoting / 60f;
			if (shoting > recoilStop) {
				muzzleRiser = recoilStop / 60f;
			}

			if (isPistol || isShotgun)
				muzzleRiser *= pistol;
			muzzleRiser *= (min);
			muzzleRiser *= parameters.getMuzzleClimbMultiplier();

			float wavyBoi = 0f;
			if (!isPistol) {
				wavyBoi = (float) Math.pow(Math.sin(ClientValueRepo.recovery * 0.048 + shoting * 0.015), 3) * 2;
			} else {
				wavyBoi = (float) Math.pow(-Math.sin((ClientValueRepo.recovery - ClientValueRepo.gunPow) * 0.2), 1) * 2;

			}
			wavyBoi *= min;

			// System.out.println(wavyBoi);
			// System.out.println(System.currentTimeMillis());

			// float muzzleDown = ClientValueRepo.gunPow > 30 ? (float)
			// (ClientValueRepo.gunPow-30f)/5f : 0f;
			// System.out.println(shoting);

			float aimMultiplier = renderContext.getWeaponInstance().isAimed() ? 0.1f : 1.0f;

			float strafe = (float) ClientValueRepo.strafe * aimMultiplier * 0.7f;

			float forwardMov = (float) ClientValueRepo.forward * aimMultiplier * 0.7f;
			float rise = (float) (ClientValueRepo.rise / 1f);
			
			
			

			forwardMov = Math.max(0, forwardMov);

			if (!AnimationModeProcessor.getInstance().getFPSMode()) {

				// gun sway
				applyRotationAtPoint(0f, 0f, 3f, (float) (xRotation) - (wavyBoi) + forwardMov + (rise / 1f),
						yRotation + strafe, zRotation + zRot);

				// Gun inertia
				// applyRotationAtPoint(0.0f, 0.0f, 0.0f, wavyBoi, 0, 0);

				float fight = (float) Math.pow(Math.sin(shoting * 0.015), 3);
				fight *= min;
				// +-+

				// System.out.println(mc.player.motionY);
				// float prevWiggle = (float)
				// (2*Math.PI*((mc.player.ticksExisted%20)/20.0))*mc.getRenderPartialTicks();
				float prevTickWiggle = (float) (2 * Math.PI
						* (((mc.player.ticksExisted - 1) % 20) / 20.0));

				// System.out.println(mc.player.ticksExisted);
				float tickWiggle = (float) (2 * Math.PI * (((ClientValueRepo.ticker.getLerpedFloat()) % 36) / 36.0));

		
				// tickWiggle = MatrixHelper.solveLerp((float) ClientValueRepo.walkYWiggle,
				// tickWiggle, mc.getRenderPartialTicks());

				
				
				float xWiggle = (float) ((float) Math.sin(tickWiggle) * ClientValueRepo.walkingGun.getLerpedPosition());
				
				// xWiggle = MatrixHelper.solveLerp((float) ClientValueRepo.walkXWiggle,
				// xWiggle, mc.getRenderPartialTicks());

				// ClientValueRepo.walkXWiggle = xWiggle;

				float yWiggle = (float) ((float) Math.cos(tickWiggle) * ClientValueRepo.walkingGun.getLerpedPosition())
						* 0.02f;

				float sway = (float) ((float) ((float) Math.sin(tickWiggle * 2)) * ClientValueRepo.forward) * 0.2f;
				sway *= aimMultiplier;
				// xWiggle = (float) ClientValueRepo.walkingGun.getLerpedPosition();
				// xWiggle = 0f;
				// forwardMov = 0f;

				// Gun inertia

				applyRotationAtPoint(0.0f, 0.0f, 0.0f,
						(float) ClientValueRepo.yInertia + fight + (isPistol ? -muzzleRiser : 0f) + forwardMov
								+ (rise / 1f) + (yWiggle * 3),
						(float) -ClientValueRepo.xInertia - fight + pR + strafe - (forwardMov * 3) + (sway * 10),
						(float) ClientValueRepo.xInertia + fight + xWiggle + (forwardMov * 10));

				if (!isPistol)
					applyRotationAtPoint(0.0f, 0.0f, -1.0f, -muzzleRiser, 0.0f, 0.0f);

				float limitedShoting = Math.min(shoting, (float) ClientValueRepo.recoilStop / 1.5f);

				GlStateManager.translate(0.0 * parameters.getTranslationMultipliers().x + (-strafe / 10) + (sway / 3f),
						(isPistol ? -0.01 * limitedShoting : 0f) * parameters.getTranslationMultipliers().y
								+ (rise / 35f) + yWiggle + (forwardMov / 10f),
						0.01 * limitedShoting * min * parameters.getTranslationMultipliers().z);
				
			}*/

				wrh.run(renderContext, stateDescriptor);
				//ads.doGLDirect();
				// AnimationModeProcessor.instance.applyCameraTransforms();
				if (DebugPositioner.isDebugModeEnabled()) {

					DebugPositioner.position(Part.MAIN_ITEM, renderContext);
				}

				// gunLightingShader = ShaderLoader.loadShader(new ResourceLocation(ModReference.id + ":"
				// + "shaders/gunlight"));
				if (player != null && player.getHeldItemMainhand() != null
						&& player.getHeldItemMainhand().getItem() instanceof Weapon) {
					// Draw hands only if weapon is held in the main hand
					/*
					 */
					if (OpenGLSelectionHelper.isInSelectionPass) {
						if (OpenGLSelectionHelper.shouldRender(1)) {
							OpenGLSelectionHelper.bindSelectShader(1);
							renderLeftArm(player, renderContext, positioner);

						}
						if (OpenGLSelectionHelper.shouldRender(2)) {
							OpenGLSelectionHelper.bindSelectShader(2);
							renderRightArm(player, renderContext, positioner);

						}
						GL20.glUseProgram(0);
					} else {
						/*
						 * gunLightingShader.use();
						 * GL20.glUniform1i(GL20.glGetUniformLocation(gunLightingShader.getShaderId(),
						 * "lightmap"), 1);
						 * GL20.glUniform1f(GL20.glGetUniformLocation(gunLightingShader.getShaderId(),
						 * "lightIntensity"), (ClientValueRepo.flash > 0) ? 5.0f : 0.0f);
						 */

						//	renderSpecialLeftArm(player, renderContext, positioner);
						renderLeftArm(player, renderContext, positioner);

						renderRightArm(player, renderContext, positioner);

						if (!OpenGLSelectionHelper.isInSelectionPass && AnimationModeProcessor.getInstance().getFPSMode()) {


							if (OpenGLSelectionHelper.selectID == 1 || OpenGLSelectionHelper.selectID == 2) {

								GlStateManager.pushMatrix();
								Transform t = AnimationModeProcessor.getInstance().getTransformFromSelected();
								GlStateManager.translate(t.getPositionX(), t.getPositionY(), t.getPositionZ());
								captureAtlasPosition();
								//AnimationModeProcessor.getInstance().renderTransformIndicator(0.2f);
								GlStateManager.enableDepth();
								GlStateManager.popMatrix();
							}
						}

						// gunLightingShader.release();

					}





					// gunLightingShader.release();
				}

				// test

				break;
			default:
		}

		if (transformType != ItemCameraTransforms.TransformType.GUI || inventoryTextureInitializationPhaseOn)

		{





			// gunLightingShader = ShaderLoader.loadShader(new ResourceLocation(ModReference.id + ":"
			// + "shaders/gunlight"));

			/*
			 * gunLightingShader.use(); //System.out.println(ClientValueRepo.flash);
			 * GL20.glUniform1i(GL20.glGetUniformLocation(gunLightingShader.getShaderId(),
			 * "lightmap"), 1);
			 * GL20.glUniform1f(GL20.glGetUniformLocation(gunLightingShader.getShaderId(),
			 * "lightIntensity"), (ClientValueRepo.flash > 0) ? 5.0f : 0.0f);
			 */

			// OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240F,
			// 240F);
			// GlStateManager.color(20.0f, 20.0f, 20.0f);

			// GlStateManager.enableBlend();
			// GL14.glBlendEquation(GL14.GL_FUNC_ADD);
			// renderItem(itemStack, renderContext, positioner);
			// GlStateManager.blendFunc(SourceFactor.SRC_ALPHA, DestFactor.ONE);
			// mc.getFramebuffer().bindFramebuffer(false);




			if (OpenGLSelectionHelper.isInSelectionPass) {
				if (OpenGLSelectionHelper.shouldRender(3)) {
					OpenGLSelectionHelper.bindSelectShader(3);
					AnimationModeProcessor.getInstance().setExcludedCategory(AttachmentCategory.ACTION);

					renderItem(itemStack, renderContext, positioner);

					AnimationModeProcessor.getInstance().setExcludedCategory(null);


				} else if(OpenGLSelectionHelper.shouldRender(4)) {

				}

				OpenGLSelectionHelper.bindSelectShader(4);
				AnimationModeProcessor.getInstance().setActiveCategory(AttachmentCategory.ACTION);
				//renderItem(itemStack, renderContext, positioner);
				renderItem(itemStack, renderContext, positioner);

				AnimationModeProcessor.getInstance().setActiveCategory(null);


			} else {

				if(forceMSAA) {
					//System.out.println(framebuffer.framebufferObject);
					//GlStateManager.scale(20, 20, 20);
					//System.out.println(GL11.glGetError());
					//	msaaBuffer.bindMSAABuffer(mc.getFramebuffer().framebufferObject);
					GlStateManager.enableBlend();
					GlStateManager.enableAlpha();
				}

				if(AnimationModeProcessor.getInstance().getFPSMode()) {

					AnimationModeProcessor.getInstance().setActiveCategory(AttachmentCategory.ACTION);
					renderItem(itemStack, renderContext, positioner);
					AnimationModeProcessor.getInstance().setActiveCategory(null);


					AnimationModeProcessor.getInstance().setExcludedCategory(AttachmentCategory.ACTION);
					renderItem(itemStack, renderContext, positioner);
					AnimationModeProcessor.getInstance().setExcludedCategory(null);


				} else {
					renderItem(itemStack, renderContext, positioner);
				}








				if(AnimationGUI.getInstance().magEdit.isState() && AnimationModeProcessor.getInstance().getFPSMode()) {
					GL11.glPushMatrix();
					AnimationModeProcessor.getInstance().deferredMatrix.rewind();
					GL11.glLoadMatrix(AnimationModeProcessor.getInstance().deferredMatrix);
					//GlStateManager.disableCull();
					GlStateManager.enableDepth();
					GlStateManager.disableTexture2D();
					GlStateManager.disableAlpha();
					GlStateManager.disableBlend();
					AnimationModeProcessor.getInstance().renderCross();
					GlStateManager.enableLighting();

					GL11.glPopMatrix();
				}



				if (OpenGLSelectionHelper.selectID == 3 && AnimationModeProcessor.getInstance().getFPSMode() && !AnimationModeProcessor.getInstance().editRotationPointMode && !AnimationGUI.getInstance().magEdit.isState() ) {
					AnimationModeProcessor.getInstance().currentPartMatrix = MatrixHelper.captureMatrix();
					captureAtlasPosition();
				}




			}

			if (OpenGLSelectionHelper.selectID == 3 && AnimationModeProcessor.getInstance().getFPSMode() && AnimationModeProcessor.getInstance().editRotationPointMode && !OpenGLSelectionHelper.isInSelectionPass) {
				GlStateManager.pushMatrix();
				FloatBuffer temp = BufferUtils.createFloatBuffer(16);
				forLater.store(temp);
				temp.rewind();
				GL11.glLoadMatrix(temp);


				AnimationModeProcessor.getInstance().currentPartMatrix = MatrixHelper.captureMatrix();
				AnimationModeProcessor.getInstance().renderTransformIndicator(1.0f);
				GlStateManager.popMatrix();
			}
		}




		if (transformType == ItemCameraTransforms.TransformType.GUI && inventoryTextureInitializationPhaseOn) {
			//	System.out.println("yo shawty");
			framebuffer.unbindFramebuffer();
			framebuffer.framebufferTexture = -1;
			framebuffer.deleteFramebuffer();

			restoreInventoryRendering(scaledresolution);
		}



		GL11.glPopMatrix();

		if (originalFramebufferId >= 0) {
			if (OpenGlHelper.isFramebufferEnabled()) {
				OpenGlHelper.glBindFramebuffer(OpenGlHelper.GL_FRAMEBUFFER, originalFramebufferId);
				GlStateManager.viewport(0, 0, mc.getFramebuffer().framebufferWidth, mc.getFramebuffer().framebufferHeight);
			}
		}

		if (transformType == ItemCameraTransforms.TransformType.GUI) {
			renderCachedInventoryTexture(renderContext, inventoryTexture);
		}





		if(!AnimationModeProcessor.getInstance().editRotationPointMode && AnimationModeProcessor.getInstance().getFPSMode() && !OpenGLSelectionHelper.isInSelectionPass) {
			GL11.glPushMatrix();
			GL11.glLoadMatrix(atlasMatrix);
			GlStateManager.disableTexture2D();
			GlStateManager.disableLighting();

			AnimationModeProcessor.getInstance().renderTransformIndicator(1.0f);

			GL11.glPopMatrix();
		}





		if (AnimationModeProcessor.getInstance().getFPSMode()) {

			//Shaders.selectedge = Shaders.selectedge;

			Shaders.selectedge.use();
			if (OpenGLSelectionHelper.fbo != null) {

				GlStateManager.setActiveTexture(GL13.GL_TEXTURE0 + 5);
				GL11.glBindTexture(GL11.GL_TEXTURE_2D, OpenGLSelectionHelper.fbo.framebufferTexture);
				Shaders.selectedge.uniform1i("select", 5);
			}
			// System.out.println(OpenGLSelectionHelper.selectID);
			Shaders.selectedge.uniform1i("idSelected", OpenGLSelectionHelper.selectID);
			Shaders.selectedge.uniform2f("fragSize", (float) 1.0f / mc.displayWidth, (float) 1.0f / mc.displayHeight);
			GlStateManager.setActiveTexture(GL13.GL_TEXTURE0);



			mc.getFramebuffer().bindFramebuffer(true);
			Shaders.selectedge.release();

			OpenGLSelectionHelper.bindBallBuf();
			ByteBuffer buf = OpenGLSelectionHelper.readRawColor();
			int red = buf.get(0) & 0xFF;
			int green = buf.get(1) & 0xFF;
			int blue = buf.get(2) & 0xFF;

			boolean changed = false;

			if (!(red == 0 && green == 0 && blue == 0)) {
				if (red == 0 && green == 0) {
					// blue
					changed = true;
					AnimationModeProcessor.getInstance().colorHover = 3;
				} else if (red == 0 && blue == 0) {
					// green]
					changed = true;
					AnimationModeProcessor.getInstance().colorHover = 2;
				} else if (green == 0 && blue == 0) {
					// red
					changed = true;
					AnimationModeProcessor.getInstance().colorHover = 1;
				}
			}

			Color s = new Color(0x48dbfb);
			double diff = (red - s.getRed()) + (blue - s.getBlue()) + (green - s.getGreen());
			if (!changed && Math.abs(diff) > 10) {
				AnimationModeProcessor.getInstance().colorHover = -1;
			}

			if (!Mouse.isButtonDown(0)) {
				AnimationModeProcessor.getInstance().tryToUpdateSelectedColor(-1);
			}
		}
	}

	public static final net.minecraft.client.model.ModelRenderer bipedLeftArm = null;

	public static void fixVersionSpecificFirstPersonPositioning(ItemCameraTransforms.TransformType transformType) {
		int i = transformType == ItemCameraTransforms.TransformType.FIRST_PERSON_RIGHT_HAND ? 1 : -1;

		GL11.glTranslatef(0.5f, 0.5f, 0.5f); // untranslate 1.9.4

		i = -i;
		GL11.glTranslatef((float) i * 0.56F, 0.52F + /* p_187459_2_ * */ +0.6F, 0.72F); // untranslate 1.9.4

		if (transformType == ItemCameraTransforms.TransformType.FIRST_PERSON_LEFT_HAND) {
			// mirror everything if left hand
			GL11.glScalef(-1f, 1f, 1f);
		}

		i = 1; // Draw everything as if for the right hand, assuming mirroring is already in
		// place
		GL11.glTranslatef((float) i * 0.56F, -0.52F + /* p_187459_2_ * */ -0.6F, -0.72F); // re-translate 1.9.4

		GL11.glTranslatef(0f, 0.6f, 0f); // -0.6 y-offset is set somewhere upstream in 1.9.4, so adjusting it

		GL11.glRotatef(45f, 0f, 1f, 0f); // rotate as per 1.8.9 transformFirstPersonItem

		GL11.glScalef(0.4F, 0.4F, 0.4F); // scale as per 1.8.9 transformFirstPersonItem
		GL11.glTranslatef(-0.5f, -0.5f, -0.5f);
	}

	private void setupInventoryRendering(double projectionWidth, double projectionHeight) {
		GL11.glClear(GL11.GL_DEPTH_BUFFER_BIT);
		GL11.glMatrixMode(GL11.GL_PROJECTION);
		GL11.glLoadIdentity();
		GL11.glOrtho(0.0D, projectionWidth, projectionHeight, 0.0D, 1000.0D, 3000.0D);
		GL11.glMatrixMode(GL11.GL_MODELVIEW);
		GL11.glLoadIdentity();
		GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
	}

	private void restoreInventoryRendering(final ScaledResolution scaledresolution) {
		GL11.glMatrixMode(GL11.GL_PROJECTION);
		GL11.glLoadIdentity();
		GL11.glOrtho(0.0D, scaledresolution.getScaledWidth_double(), scaledresolution.getScaledHeight_double(), 0.0D,
				1000.0D, 3000.0D);
		GL11.glMatrixMode(GL11.GL_MODELVIEW);



//        GlStateManager.loadIdentity();
//        GlStateManager.translate(0.0F, 0.0F, -2000.0F);
	}

	// Allows us to determine how large the icon sheet is.
	private static int gunIconSheetHeight;
	private static int gunIconSheetWidth;
	private static boolean hasCalculatedSheetDimensions = false;



	private void renderCachedInventoryTexture(RenderContext<RenderableState> renderContext, Integer inventoryTexture) {


		if(getClientModContext() != null) {
			WeaponSpritesheetBuilder.provideModContext(getClientModContext());
		}


		if(!DebugCommand.isForceLiveRenderGUI()) {

			PlayerWeaponInstance pwi = renderContext.getWeaponInstance();

			if(!WeaponSpritesheetBuilder.hasSpriteID(pwi.getWeapon().getName())) return;

			GlStateManager.pushMatrix();
			GL11.glPushAttrib(GL11.GL_ENABLE_BIT);
			GlStateManager.enableBlend();
			GlStateManager.enableAlpha();
			GlStateManager.disableLighting();

			GL11.glTranslatef(0.0F, 1.0F, 0.5F);
			GL11.glScalef(0.004F, 0.004F, 0.004F);
			GL11.glScalef(1.0F, -1.0F, 1F);
			GlStateManager.translate(-8.0F, -8.0F, 0.0F);

			mc.getTextureManager().bindTexture(ResourceManager.GUN_ICON_SHEET);


			// Checks to see if the gun icon sheet has already
			// had it's size cached, if not it does that.
			if(!hasCalculatedSheetDimensions) {
				hasCalculatedSheetDimensions = true;


				try {
					InputStream inputStream = mc.getResourceManager().getResource(ResourceManager.GUN_ICON_SHEET).getInputStream();
					BufferedImage bf = ImageIO.read(inputStream);

					gunIconSheetWidth = bf.getWidth();
					gunIconSheetHeight = bf.getHeight();



				} catch(IOException e) {
					e.printStackTrace();
					gunIconSheetHeight = 1664;
					gunIconSheetWidth = 1664;
				}

			}

			int id = WeaponSpritesheetBuilder.getSpriteID(pwi.getWeapon().getName());
			SpriteSheetTools.Sprite sprite = SpriteSheetTools.getSquareSprite(id, 128, gunIconSheetWidth, gunIconSheetHeight);

			final Tessellator tessellator = Tessellator.getInstance();
			final BufferBuilder buffer = tessellator.getBuffer();

			buffer.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX);

			buffer.pos(0, 256, 0).tex(sprite.getMinU(), sprite.getMaxV()).endVertex();
			buffer.pos(256, 256, 0).tex(sprite.getMaxU(), sprite.getMaxV()).endVertex();
			buffer.pos(256, 0, 0).tex(sprite.getMaxU(), sprite.getMinV()).endVertex();
			buffer.pos(0, 0, 0).tex(sprite.getMinU(), sprite.getMinV()).endVertex();

			tessellator.draw();

			GL11.glPopAttrib();
			GlStateManager.enableLighting();
			GlStateManager.popMatrix();
			GlStateManager.enableTexture2D();
		} else {
			GL11.glPushMatrix();
			GL11.glPushAttrib(GL11.GL_ENABLE_BIT);


			GlStateManager.enableBlend();
			GlStateManager.enableAlpha();
			//GlStateManager.disableTexture2D();


			GL11.glTranslatef(0.0F, 1.0F, 0.5F);
			GL11.glScalef(0.004F, 0.004F, 0.004F);
			GL11.glScalef(1.0F, -1.0F, 1F);
			GlStateManager.translate(-8.0F, -8.0F, 0.0F);


			GlStateManager.bindTexture(inventoryTexture);

			drawTexturedQuadFit(0, 0, 256, 256, 0);


			GL11.glPopAttrib();


			GL11.glPopMatrix();

		}


		if(BalancePackManager.isWeaponDisabled(renderContext.getWeaponInstance().getWeapon())) {
			GlStateManager.disableTexture2D();
			Tessellator t = Tessellator.getInstance();
			BufferBuilder bb = t.getBuffer();
			bb.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_COLOR);
			double size = 1.0;
			bb.pos(0, 0, 10).color(1, 0, 0, .5f).endVertex();
			bb.pos(size, 0, 10).color(1, 0, 0, .5f).endVertex();
			bb.pos(size, size, 10).color(1, 0, 0, .5f).endVertex();
			bb.pos(0, size, 10).color(1, 0, 0, .5f).endVertex();

			t.draw();
			GlStateManager.enableTexture2D();
		}






		/*

		 */


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

	public static <T> void renderRightArm(EntityLivingBase player, RenderContext<T> renderContext,
										  Positioner<Part, RenderContext<T>> positioner) {



		Render<AbstractClientPlayer> entityRenderObject = mc.getRenderManager()
				.getEntityRenderObject((AbstractClientPlayer) player);
		RenderPlayer render = (RenderPlayer) entityRenderObject;
		mc.getTextureManager().bindTexture(((AbstractClientPlayer) player).getLocationSkin());

		GL11.glPushMatrix();
		// GL11.glTranslatef(0.5f, 0f, 0.0f);

		if (AnimationModeProcessor.getInstance().isLegacyMode()) {
			GL11.glScaled(1F, 1F, 1F);
			GL11.glTranslatef(-0.25f, 0f, 0.2f);
			GL11.glRotatef(5F, 1f, 0f, 0f);
			GL11.glRotatef(25F, 0f, 1f, 0f);
			GL11.glRotatef(0F, 0f, 0f, 1f);
		}

		positioner.position(Part.RIGHT_HAND, renderContext);
		if (DebugPositioner.isDebugModeEnabled()) {
			DebugPositioner.position(Part.RIGHT_HAND, renderContext);
		}

		/*
		if (!OpenGLSelectionHelper.isInSelectionPass && AnimationModeProcessor.getInstance().getFPSMode()) {

			if (OpenGLSelectionHelper.selectID == 2) {

				AnimationModeProcessor.getInstance().renderTransformIndicator(0.2f);
			}
		}*/

		renderContext.capturePartPosition(Part.RIGHT_HAND);

		if (!AnimationModeProcessor.getInstance().isLegacyMode()) {

			GL11.glTranslatef(0.35f, -0.15f, -0.1f);
		}
		// GlStateManager.rotate(-45, 1, 0, 0);

		renderRightArm(render.getMainModel(), (AbstractClientPlayer) player);

		ItemStack itemstack = getItemStackFromSlot(player, EntityEquipmentSlot.CHEST);

		if (itemstack != null && itemstack.getItem() instanceof ItemArmor) {
			// ItemArmor itemarmor = (ItemArmor)itemstack.getItem();
			render.bindTexture(getArmorResource(player, itemstack, EntityEquipmentSlot.CHEST, null));

			ModelBiped armorModel = getArmorModelHook(player, itemstack, EntityEquipmentSlot.CHEST, null);
			if (armorModel != null) {
				renderRightArm(armorModel, (AbstractClientPlayer) player);
			}
		}

		GL11.glPopMatrix();
	}

	static <T> void renderSpecialLeftArm(EntityLivingBase player, RenderContext<T> renderContext,
										 Positioner<Part, RenderContext<T>> positioner) {

		Render<AbstractClientPlayer> entityRenderObject = mc.getRenderManager()
				.getEntityRenderObject((AbstractClientPlayer) player);
		RenderPlayer render = (RenderPlayer) entityRenderObject;
		mc.getTextureManager().bindTexture(((AbstractClientPlayer) player).getLocationSkin());

		GL11.glPushMatrix();



		//GlStateManager.translate(0,-0, -70);


		//positioner.position(Part.LEFT_HAND, renderContext);
		if (DebugPositioner.isDebugModeEnabled()) {
			DebugPositioner.position(Part.LEFT_HAND, renderContext);
		}

		GlStateManager.translate(5,-5, -2);

		float mcT = 45f*(mc.player.ticksExisted%20)/20f;

		GlStateManager.rotate(mcT, 0, 1, 0);

		/*
		AnimationData anm = BBLoader.getAnimation("real", "reload", "lefthand");
		//AnimationData anm = BBLoader.loadAnimationData("m16.animation.json", "animation.M16.reload", "lefthand");
		FuckMyLife.instance.bbMap.clear();
        for(Entry<Float, BlockbenchTransition> tranny : anm.bbTransition.entrySet()) {
			FuckMyLife.instance.bbMap.put(tranny.getKey(), tranny.getValue());
		}

      //  System.out.println(anm.bbTransition.get(1.5).directTransform());
        FuckMyLife.instance.timer = 0f;
        try {
        	//FuckMyLife.instance.position(FuckMyLife.instance.timer, 4.0f, true);
        } catch(Exception e) {
        	e.printStackTrace();
        }*/
		// System.out.println(anm.bbTransition);


        /*
        FuckMyLife.instance.timer += 0.01f;
        FuckMyLife.instance.timer = 0f;
        */


        /*
   	 GlStateManager.rotate(57.7232f, 0, 0, 1);
   	 GlStateManager.rotate(26.1991f, 0, 1, 0);
   	 GlStateManager.rotate(-17.5f, 1, 0, 0);
        */


		/*
		if (!OpenGLSelectionHelper.isInSelectionPass && AnimationModeProcessor.getInstance().getFPSMode()) {

			if (OpenGLSelectionHelper.selectID == 1) {

				AnimationModeProcessor.getInstance().renderTransformIndicator(0.2f);
			}
		}*/


		renderContext.capturePartPosition(Part.LEFT_HAND);

		if (!AnimationModeProcessor.getInstance().isLegacyMode()) {

			//GL11.glTranslatef(-0.38f, -0.12f, -0.13f);
		}


		//armModel.boxList.get(0).rotateAngleY = (float) Math.toRadians(180);
		GlStateManager.disableTexture2D();
		//armModel.render(null, 0f, 0f, 0f, 0f, 0f, 0.0625f);

		//	renderLeftArm(render.getMainModel(), (AbstractClientPlayer) player);

		ItemStack itemstack = getItemStackFromSlot(player, EntityEquipmentSlot.CHEST);

		if (itemstack != null && itemstack.getItem() instanceof ItemArmor) {
			// ItemArmor itemarmor = (ItemArmor)itemstack.getItem();
			render.bindTexture(getArmorResource(player, itemstack, EntityEquipmentSlot.CHEST, null));

			ModelBiped armorModel = getArmorModelHook(player, itemstack, EntityEquipmentSlot.CHEST, null);
			if (armorModel != null) {
				renderLeftArm(armorModel, (AbstractClientPlayer) player);
			}
		}

		// GlStateManager.enableTexture2D();

		GL11.glPopMatrix();
	}


	public static net.minecraft.client.model.ModelRenderer bipedRightArm = null;


	public static <T> void renderLeftArm(EntityLivingBase player, RenderContext<T> renderContext,
										 Positioner<Part, RenderContext<T>> positioner) {

		//if(true) return;

		Render<AbstractClientPlayer> entityRenderObject = mc.getRenderManager()
				.getEntityRenderObject((AbstractClientPlayer) player);
		RenderPlayer render = (RenderPlayer) entityRenderObject;
		mc.getTextureManager().bindTexture(((AbstractClientPlayer) player).getLocationSkin());

		GL11.glPushMatrix();
		if (AnimationModeProcessor.getInstance().isLegacyMode()) {

			GL11.glTranslatef(0f, -1f, 0f);
			GL11.glRotatef(-10F, 1f, 0f, 0f);
			GL11.glRotatef(0F, 0f, 1f, 0f);
			GL11.glRotatef(10F, 0f, 0f, 1f);
		}

		float mct = 45f*((mc.player.ticksExisted%45)/45f);







		positioner.position(Part.LEFT_HAND, renderContext);
		if (DebugPositioner.isDebugModeEnabled()) {
			DebugPositioner.position(Part.LEFT_HAND, renderContext);
		}
		/*
		AnimationData anm = BBLoader.getAnimation("real", "reload", "lefthand");
		//AnimationData anm = BBLoader.loadAnimationData("m16.animation.json", "animation.M16.reload", "lefthand");
		FuckMyLife.instance.bbMap.clear();
        for(Entry<Float, BlockbenchTransition> tranny : anm.bbTransition.entrySet()) {
			FuckMyLife.instance.bbMap.put(tranny.getKey(), tranny.getValue());
		}

      //  System.out.println(anm.bbTransition.get(1.5).directTransform());
        FuckMyLife.instance.timer = 0f;
        try {
        	//FuckMyLife.instance.position(FuckMyLife.instance.timer, 4.0f, true);
        } catch(Exception e) {
        	e.printStackTrace();
        }*/
		// System.out.println(anm.bbTransition);


        /*
        FuckMyLife.instance.timer += 0.01f;
        FuckMyLife.instance.timer = 0f;
        */


		//AnimationModeProcessor.getInstance().renderCross();

		/*
		DebugRenderer.setupBasicRender();
		DebugRenderer.renderPoint(Vec3d.ZERO, new Vec3d(1, 0, 0));
		DebugRenderer.destructBasicRender();
		GlStateManager.color(1, 1, 1);
        */
        /*
   	 GlStateManager.rotate(57.7232f, 0, 0, 1);
   	 GlStateManager.rotate(26.1991f, 0, 1, 0);
   	 GlStateManager.rotate(-17.5f, 1, 0, 0);
        */


		/*
		if (!OpenGLSelectionHelper.isInSelectionPass && AnimationModeProcessor.getInstance().getFPSMode()) {

			if (OpenGLSelectionHelper.selectID == 1) {

				AnimationModeProcessor.getInstance().renderTransformIndicator(0.2f);
			}
		}*/


		renderContext.capturePartPosition(Part.LEFT_HAND);

		//GL11.glTranslated(1, 0, 0);
		//GlStateManager.rotate(0f, 0, 1, 0);

		if (!AnimationModeProcessor.getInstance().isLegacyMode()) {

//			GL11.glTranslatef(-0.38f, -0.12f, -0.13f);
		}


		//	armModel = new ArmModel();

		renderLeftArm(render.getMainModel(), (AbstractClientPlayer) player);

		ItemStack itemstack = getItemStackFromSlot(player, EntityEquipmentSlot.CHEST);

		if (itemstack != null && itemstack.getItem() instanceof ItemArmor) {
			render.bindTexture(getArmorResource(player, itemstack, EntityEquipmentSlot.CHEST, null));
			ModelBiped armorModel = getArmorModelHook(player, itemstack, EntityEquipmentSlot.CHEST, null);
			if (armorModel != null) {
				renderLeftArm(armorModel, (AbstractClientPlayer) player);
			}
		}

		/*
		 * 	ItemStack itemstack = getItemStackFromSlot(player, EntityEquipmentSlot.CHEST);

		if (itemstack != null && itemstack.getItem() instanceof ItemArmor) {
			// ItemArmor itemarmor = (ItemArmor)itemstack.getItem();
			render.bindTexture(getArmorResource(player, itemstack, EntityEquipmentSlot.CHEST, null));

			ModelBiped armorModel = getArmorModelHook(player, itemstack, EntityEquipmentSlot.CHEST, null);
			if (armorModel != null) {
				renderRightArm(armorModel, (AbstractClientPlayer) player);
			}
		}
		 */

		// GlStateManager.enableTexture2D();

		GL11.glPopMatrix();

	}

	public static void renderRightArm(ModelBiped modelplayer, AbstractClientPlayer clientPlayer) {
		float f = 1.0F;

		GlStateManager.color(f, f, f);
		// ModelPlayer modelplayer = renderPlayer.getMainModel();
		// Can ignore private method setModelVisibilities since it was already called
		// earlier for left hand
		setModelVisibilities(modelplayer, clientPlayer);

		GlStateManager.enableBlend();
		modelplayer.swingProgress = 0.0F;
		modelplayer.isSneak = false;
		modelplayer.setRotationAngles(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F, clientPlayer);

		if (AnimationModeProcessor.getInstance().isLegacyMode()) {
			modelplayer.bipedRightArm.rotateAngleX = -0.3F;
			modelplayer.bipedRightArm.rotateAngleY = 0.0F;
		} else {
			modelplayer.bipedRightArm.rotateAngleX = (float) Math.toRadians(-90);
			modelplayer.bipedRightArm.rotateAngleY = 0f;
			modelplayer.bipedRightArm.rotateAngleZ = 0f;
		}



		modelplayer.bipedRightArm.render(0.0625F);

		if (modelplayer instanceof ModelPlayer) {
			if (AnimationModeProcessor.getInstance().isLegacyMode()) {
				((ModelPlayer) modelplayer).bipedRightArmwear.rotateAngleX = 0.0F;
				((ModelPlayer) modelplayer).bipedRightArmwear.rotateAngleX = -0.3F;
			} else {
				((ModelPlayer) modelplayer).bipedRightArm.rotateAngleX = 0f;
				((ModelPlayer) modelplayer).bipedRightArm.rotateAngleY = 0f;
				((ModelPlayer) modelplayer).bipedRightArm.rotateAngleZ = 0f;
			}
			// ((ModelPlayer) modelplayer).bipedRightArmwear.render(0.0625F);
		}

		GlStateManager.disableBlend();
	}

	public static ModelBiped duplicateBiped(ModelBiped mb) {
		ModelBiped newBiped = new ModelBiped();

		newBiped.textureHeight = mb.textureHeight;
		newBiped.textureWidth = mb.textureWidth;
		newBiped.leftArmPose = mb.leftArmPose;
		newBiped.rightArmPose = mb.rightArmPose;
		newBiped.swingProgress = mb.swingProgress;





		for(net.minecraft.client.model.ModelRenderer mr : mb.boxList) {

			net.minecraft.client.model.ModelRenderer newModelRenderer = cloneModelRenderer(newBiped, mr);

			if(mr.childModels != null) {
				for(net.minecraft.client.model.ModelRenderer children : mr.childModels) {
					newModelRenderer.childModels.add(cloneModelRenderer(newBiped, children));
				}
			}



			//newModelRenderer.cubeList.addAll(mr.cubeList);

		}

		newBiped.bipedLeftArm = cloneModelRenderer(newBiped, mb.bipedLeftArm);
		newBiped.bipedRightArm = cloneModelRenderer(newBiped, mb.bipedLeftArm);
		newBiped.bipedBody = cloneModelRenderer(newBiped, mb.bipedLeftArm);
		newBiped.bipedHeadwear = cloneModelRenderer(newBiped, mb.bipedLeftArm);
		newBiped.bipedLeftLeg = cloneModelRenderer(newBiped, mb.bipedLeftArm);
		newBiped.bipedRightLeg = cloneModelRenderer(newBiped, mb.bipedLeftArm);
		newBiped.bipedHead = cloneModelRenderer(newBiped, mb.bipedLeftArm);


		return newBiped;
	}

	public static class ModelRendererPreset {
		public boolean isHidden, mirror, showModel;
		public float offsetX, offsetY, offsetZ;
		public float rotateAngleX, rotateAngleY, rotateAngleZ;
		public float rotationPointX, rotationPointY, rotationPointZ;
		public float textureHeight, textureWidth;

		public ModelRendererPreset(net.minecraft.client.model.ModelRenderer mr) {
			isHidden = mr.isHidden;
			showModel = mr.showModel;
			mirror = mr.mirror;
			offsetX = mr.offsetX;
			offsetY = mr.offsetY;
			offsetZ = mr.offsetZ;
			rotateAngleX = mr.rotateAngleX;
			rotateAngleY = mr.rotateAngleY;
			rotateAngleZ = mr.rotateAngleZ;
			rotationPointX = mr.rotationPointX;
			rotationPointY = mr.rotationPointY;
			rotationPointZ = mr.rotationPointZ;
			textureHeight = mr.textureHeight;
			textureWidth = mr.textureWidth;
		}

		public void set(ModelRenderer mr) {
			mr.isHidden = isHidden;
			mr.showModel = showModel;
			mr.mirror = mirror;
			mr.offsetX = offsetX;
			mr.offsetY = offsetY;
			mr.offsetZ = offsetZ;
			mr.rotateAngleX = rotateAngleX;
			mr.rotateAngleY = rotateAngleY;
			mr.rotateAngleZ = rotateAngleZ;
			mr.rotationPointX = rotationPointX;
			mr.rotationPointY = rotationPointY;
			mr.rotationPointZ = rotationPointZ;
			mr.textureHeight = textureHeight;
			mr.textureWidth = textureWidth;
		}
	}


	public static net.minecraft.client.model.ModelRenderer cloneModelRenderer(ModelBase base, net.minecraft.client.model.ModelRenderer children) {

		net.minecraft.client.model.ModelRenderer newModel = new net.minecraft.client.model.ModelRenderer(base);
		newModel.cubeList.addAll(children.cubeList);

		//newModel.boxName = children.boxName;
		newModel.isHidden = children.isHidden;
		newModel.mirror = children.mirror;
		newModel.offsetX = children.offsetX;
		newModel.offsetY = children.offsetY;
		newModel.offsetZ = children.offsetZ;
		newModel.rotateAngleX = children.rotateAngleX;
		newModel.rotateAngleY = children.rotateAngleY;
		newModel.rotateAngleZ = children.rotateAngleZ;
		newModel.rotationPointX = children.rotationPointX;
		newModel.rotationPointY = children.rotationPointY;
		newModel.rotationPointZ = children.rotationPointZ;
		newModel.showModel = children.showModel;
		newModel.textureHeight = children.textureHeight;
		newModel.textureWidth = children.textureWidth;

		return newModel;

	}


	public static ModelBiped backupModel;
	public static AbstractClientPlayer acp;

	public static void renderLeftArm(ModelBiped modelplayer, AbstractClientPlayer clientPlayer) {
		// GlStateManager.color(1.0F, 1.0F, 1.0F);

		/*
		if(acp == null || acp != clientPlayer) {
			acp = clientPlayer;
			backupModel = duplicateBiped(modelplayer);
		}*/

		ModelRendererPreset preset = new ModelRendererPreset(modelplayer.bipedLeftArm);

		ModelBiped toRender = modelplayer;
		//if(!(modelplayer instanceof ModelPlayer)) backupModel = modelplayer;

		setModelVisibilities(toRender, clientPlayer);

		GlStateManager.enableBlend();
		toRender.isSneak = false;
		toRender.swingProgress = 0.0F;
		toRender.setRotationAngles(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F, clientPlayer);

		if (!AnimationModeProcessor.getInstance().isLegacyMode() && mc.gameSettings.thirdPersonView == 0) {

			toRender.bipedLeftArm.rotateAngleX = (float) Math.toRadians(-90);
			toRender.bipedLeftArm.rotateAngleY = 0f;
			toRender.bipedLeftArm.rotateAngleZ = 0f;
		} else {
			toRender.bipedLeftArm.rotateAngleX = 0.0F;

		}


		if(AnimationModeProcessor.getInstance().isLegacyMode() || mc.gameSettings.thirdPersonView != 0) {

			toRender.bipedLeftArm.offsetX = 0f;
			toRender.bipedLeftArm.offsetY = 0f;
			toRender.bipedLeftArm.offsetZ = 0f;
		} else {

			toRender.bipedLeftArm.offsetX = -0.375f;
			toRender.bipedLeftArm.offsetY = -0.125f;
			toRender.bipedLeftArm.offsetZ = -0.15f;
		}


		//modelplayer.bipedLeftArm.render(0.0625F);


		//System.out.println(modelplayer instanceof ModelPlayer);
		toRender.bipedLeftArm.render(0.0625F);

		preset.set(toRender.bipedLeftArm);

		if (modelplayer instanceof ModelPlayer) {
			//System.out.println("USSY");
			//((ModelPlayer) modelplayer).bipedLeftArmwear.rotateAngleX = 0.0F;
			//((ModelPlayer) modelplayer).bipedLeftArmwear.render(0.0625F);
		}

		//((ModelPlayer) modelplayer).bipedLeftArmwear.rotateAngleX = 0.0F;
		//((ModelPlayer) modelplayer).bipedLeftArmwear.render(0.0625F);


		GlStateManager.disableBlend();
	}

	public static void renderVehicleRightArm(ModelBiped modelplayer, AbstractClientPlayer clientPlayer) {
		GlStateManager.color(1.0F, 1.0F, 1.0F);
		setModelVisibilities(modelplayer, clientPlayer);

		GlStateManager.enableBlend();
		modelplayer.bipedRightArm.render(0.0625F);
		if (modelplayer instanceof ModelPlayer) {
			((ModelPlayer) modelplayer).bipedRightArmwear.rotateAngleX = 0.0F;
			((ModelPlayer) modelplayer).bipedRightArmwear.rotateAngleX = -0.3F;
			((ModelPlayer) modelplayer).bipedRightArmwear.render(0.0625F);
		}

		GlStateManager.disableBlend();
	}

	public static void renderLeftVehicleArm(ModelBiped modelplayer, AbstractClientPlayer clientPlayer) {
		GlStateManager.color(1.0F, 1.0F, 1.0F);
		setModelVisibilities(modelplayer, clientPlayer);

		GlStateManager.enableBlend();
		modelplayer.bipedLeftArm.render(0.0625F);
		if (modelplayer instanceof ModelPlayer) {
			((ModelPlayer) modelplayer).bipedLeftArmwear.rotateAngleX = 0.0F;
			((ModelPlayer) modelplayer).bipedLeftArmwear.render(0.0625F);
		}

		GlStateManager.disableBlend();
	}

	public static void setModelVisibilities(ModelBiped modelplayer, AbstractClientPlayer clientPlayer) {
		// ModelPlayer modelplayer = renderPlayer.getMainModel();

		if (clientPlayer.isSpectator()) {
			// modelplayer.setInvisible(false);
			modelplayer.setVisible(true);
			modelplayer.bipedHead.showModel = true;
			modelplayer.bipedHeadwear.showModel = true;
		} else {
			ItemStack itemstack = clientPlayer.getHeldItemMainhand();
			ItemStack itemstack1 = clientPlayer.getHeldItemOffhand();
			modelplayer.setVisible(true);
			modelplayer.bipedHeadwear.showModel = clientPlayer.isWearing(EnumPlayerModelParts.HAT);

			if (modelplayer instanceof ModelPlayer) {
				((ModelPlayer) modelplayer).bipedBodyWear.showModel = clientPlayer
						.isWearing(EnumPlayerModelParts.JACKET);
				((ModelPlayer) modelplayer).bipedLeftLegwear.showModel = clientPlayer
						.isWearing(EnumPlayerModelParts.LEFT_PANTS_LEG);
				((ModelPlayer) modelplayer).bipedRightLegwear.showModel = clientPlayer
						.isWearing(EnumPlayerModelParts.RIGHT_PANTS_LEG);
				((ModelPlayer) modelplayer).bipedLeftArmwear.showModel = clientPlayer
						.isWearing(EnumPlayerModelParts.LEFT_SLEEVE);
				((ModelPlayer) modelplayer).bipedRightArmwear.showModel = clientPlayer
						.isWearing(EnumPlayerModelParts.RIGHT_SLEEVE);
			}

			modelplayer.isSneak = clientPlayer.isSneaking();
			ModelBiped.ArmPose modelbiped$armpose = ModelBiped.ArmPose.EMPTY;
			ModelBiped.ArmPose modelbiped$armpose1 = ModelBiped.ArmPose.EMPTY;

			if (itemstack != null) {
				modelbiped$armpose = ModelBiped.ArmPose.ITEM;

				if (clientPlayer.getItemInUseCount() > 0) {
					EnumAction enumaction = itemstack.getItemUseAction();

					if (enumaction == EnumAction.BLOCK) {
						modelbiped$armpose = ModelBiped.ArmPose.BLOCK;
					} else if (enumaction == EnumAction.BOW) {
						modelbiped$armpose = ModelBiped.ArmPose.BOW_AND_ARROW;
					}
				}
			}

			if (itemstack1 != null) {
				modelbiped$armpose1 = ModelBiped.ArmPose.ITEM;

				if (clientPlayer.getItemInUseCount() > 0) {
					EnumAction enumaction1 = itemstack1.getItemUseAction();

					if (enumaction1 == EnumAction.BLOCK) {
						modelbiped$armpose1 = ModelBiped.ArmPose.BLOCK;
					}
				}
			}

			if (clientPlayer.getPrimaryHand() == EnumHandSide.RIGHT) {
				modelplayer.rightArmPose = modelbiped$armpose;
				modelplayer.leftArmPose = modelbiped$armpose1;
			} else {
				modelplayer.rightArmPose = modelbiped$armpose1;
				modelplayer.leftArmPose = modelbiped$armpose;
			}
		}
	}

	@Override
	public ItemCameraTransforms getItemCameraTransforms() {
		return ItemCameraTransforms.DEFAULT;
	}

	@Override
	public ItemOverrideList getOverrides() {

		return itemOverrideList;
	}

	@Override
	public org.apache.commons.lang3.tuple.Pair<? extends IBakedModel, Matrix4f> handlePerspective(ItemCameraTransforms.TransformType cameraTransformType) {
		this.transformType = cameraTransformType;
		return pair;
	}

	public static ModelBiped getArmorModelHook(net.minecraft.entity.EntityLivingBase entity,
											   net.minecraft.item.ItemStack itemStack, EntityEquipmentSlot slot, ModelBiped model) {
		return net.minecraftforge.client.ForgeHooksClient.getArmorModel(entity, itemStack, slot, model);
	}

	protected void setModelVisible(ModelBiped model) {
		model.setVisible(true);
	}

	@SuppressWarnings("incomplete-switch")
	protected void setModelSlotVisible(ModelBiped p_188359_1_, EntityEquipmentSlot slotIn) {
		this.setModelVisible(p_188359_1_);

		switch (slotIn) {
			case HEAD:
				p_188359_1_.bipedHead.showModel = true;
				p_188359_1_.bipedHeadwear.showModel = true;
				break;
			case CHEST:
				p_188359_1_.bipedBody.showModel = true;
				p_188359_1_.bipedRightArm.showModel = true;
				p_188359_1_.bipedLeftArm.showModel = true;
				break;
			case LEGS:
				p_188359_1_.bipedBody.showModel = true;
				p_188359_1_.bipedRightLeg.showModel = true;
				p_188359_1_.bipedLeftLeg.showModel = true;
				break;
			case FEET:
				p_188359_1_.bipedRightLeg.showModel = true;
				p_188359_1_.bipedLeftLeg.showModel = true;
		}
	}

	@Nullable
	public static ItemStack getItemStackFromSlot(EntityLivingBase living, EntityEquipmentSlot slotIn) {
		return living.getItemStackFromSlot(slotIn);
	}

//    public static ModelBiped getModelFromSlot(EntityEquipmentSlot slotIn) {
//        return (ModelBiped)(isLegSlot(slotIn) ? this.modelLeggings : this.modelArmor);
//    }

	private static boolean isLegSlot(EntityEquipmentSlot slotIn) {
		return slotIn == EntityEquipmentSlot.LEGS;
	}

	public static ResourceLocation getArmorResource(net.minecraft.entity.Entity entity, ItemStack stack,
													EntityEquipmentSlot slot, String type) {
		ItemArmor item = (ItemArmor) stack.getItem();
		String texture = item.getArmorMaterial().getName();
		String domain = "minecraft";
		int idx = texture.indexOf(':');
		if (idx != -1) {
			domain = texture.substring(0, idx);
			texture = texture.substring(idx + 1);
		}
		String s1 = String.format("%s:textures/models/armor/%s_layer_%d%s.png", domain, texture,
				(isLegSlot(slot) ? 2 : 1), type == null ? "" : String.format("_%s", type));

		s1 = net.minecraftforge.client.ForgeHooksClient.getArmorTexture(entity, stack, s1, slot, type);
		ResourceLocation resourcelocation = (ResourceLocation) ARMOR_TEXTURE_RES_MAP.get(s1);

		if (resourcelocation == null) {
			resourcelocation = new ResourceLocation(s1);
			ARMOR_TEXTURE_RES_MAP.put(s1, resourcelocation);
		}

		return resourcelocation;
	}
}
