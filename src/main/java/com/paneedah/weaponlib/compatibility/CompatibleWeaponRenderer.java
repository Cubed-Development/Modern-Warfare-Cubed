 package com.paneedah.weaponlib.compatibility;

 import com.google.common.collect.Maps;
 import com.paneedah.mwc.utils.ModReference;
 import com.paneedah.weaponlib.*;
 import com.paneedah.weaponlib.WeaponRenderer.Builder;
 import com.paneedah.weaponlib.animation.*;
 import com.paneedah.weaponlib.animation.MultipartPositioning.Positioner;
 import com.paneedah.weaponlib.animation.gui.AnimationGUI;
 import com.paneedah.weaponlib.animation.movement.WeaponRotationHandler;
 import com.paneedah.weaponlib.command.DebugCommand;
 import com.paneedah.weaponlib.config.BalancePackManager;
 import com.paneedah.weaponlib.render.*;
 import com.paneedah.weaponlib.render.SpriteSheetTools.Sprite;
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
 import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
 import net.minecraft.client.renderer.entity.Render;
 import net.minecraft.client.renderer.entity.RenderPlayer;
 import net.minecraft.client.renderer.texture.TextureAtlasSprite;
 import net.minecraft.client.renderer.texture.TextureManager;
 import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
 import net.minecraft.client.shader.Framebuffer;
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
 import net.minecraft.world.World;
 import net.minecraftforge.common.ForgeModContainer;
 import net.minecraftforge.fml.relauncher.Side;
 import net.minecraftforge.fml.relauncher.SideOnly;
 import org.apache.commons.lang3.tuple.Pair;
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
 import java.util.Collections;
 import java.util.List;
 import java.util.Map;

 import static com.paneedah.mwc.proxies.ClientProxy.mc;
		

public abstract class CompatibleWeaponRenderer extends ModelSourceRenderer implements IBakedModel {

	private static final int INVENTORY_TEXTURE_WIDTH = 128;
	private static final int INVENTORY_TEXTURE_HEIGHT = 128;

	private static final Map<String, ResourceLocation> ARMOR_TEXTURE_RES_MAP = Maps
			.<String, ResourceLocation>newHashMap();

	public static class StateDescriptor
			implements MultipartRenderStateDescriptor<RenderableState, Part, RenderContext<RenderableState>> {
		protected MultipartRenderStateManager<RenderableState, Part, RenderContext<RenderableState>> stateManager;
		protected float rate;
		protected float amplitude = 0.04f;
		private PlayerWeaponInstance instance;

		public StateDescriptor(PlayerWeaponInstance instance,
				MultipartRenderStateManager<RenderableState, Part, RenderContext<RenderableState>> stateManager,
				float rate, float amplitude) {
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

	private Pair<? extends IBakedModel, Matrix4f> pair;
	protected ModelBiped playerBiped = new ModelBiped();

	protected ItemStack itemStack;

	protected ModelResourceLocation resourceLocation;

	private class WeaponItemOverrideList extends ItemOverrideList {

		public WeaponItemOverrideList(List<ItemOverride> overridesIn) {
			super(overridesIn);
		}

		@Override
		public IBakedModel handleItemState(IBakedModel originalModel, ItemStack stack, World world,
				EntityLivingBase entity) {
			CompatibleWeaponRenderer.this.itemStack = stack;
			CompatibleWeaponRenderer.this.player = entity;
			return super.handleItemState(originalModel, stack, world, entity);
		}
	}

	private ItemOverrideList itemOverrideList = new WeaponItemOverrideList(Collections.emptyList());

	TransformType transformType;

	private Builder builder;

	protected CompatibleWeaponRenderer(WeaponRenderer.Builder builder) {
		this.builder = builder;

		this.textureManager = mc.getTextureManager();
		this.pair = Pair.of((IBakedModel) this, null);
		this.playerBiped = new ModelBiped();
		this.playerBiped.textureWidth = 64;
		this.playerBiped.textureHeight = 64;
	}

	public static FloatBuffer atlasMatrix = BufferUtils.createFloatBuffer(16);
	
	@Override
	public List<BakedQuad> getQuads(IBlockState state, EnumFacing side, long rand) {
		// Todo: Actually make rendering compatible with Emissive Renderer
		if (ForgeModContainer.allowEmissiveItems)
			ForgeModContainer.allowEmissiveItems = false;
		
		if (transformType == TransformType.GROUND
				|| transformType == TransformType.GUI
				|| transformType == TransformType.FIRST_PERSON_RIGHT_HAND
				|| transformType == TransformType.THIRD_PERSON_RIGHT_HAND
				|| transformType == TransformType.FIRST_PERSON_LEFT_HAND
				|| transformType == TransformType.THIRD_PERSON_LEFT_HAND) {

			Tessellator tessellator = Tessellator.getInstance();
			BufferBuilder worldrenderer = tessellator.getBuffer();
			tessellator.draw();
			GlStateManager.pushMatrix();

			if (player != null) {
				if (transformType == TransformType.THIRD_PERSON_RIGHT_HAND) {
					
					
				
					/*
					if (player.isSneaking() && (getClientModContext() != null && getClientModContext().getMainHeldWeapon() != null && getClientModContext().getMainHeldWeapon().isAimed())) {
						//GlStateManager.translate(0.0F, 0.2F, 0.0F);
					}*/
						
				} else if (transformType == TransformType.FIRST_PERSON_LEFT_HAND
						|| transformType == TransformType.FIRST_PERSON_RIGHT_HAND) {
					//
				}
			}

			if (onGround()) {
				GlStateManager.scale(-3f, -3f, -3f);
			}

			int currentTextureId = GlStateManager.glGetInteger(GL11.GL_TEXTURE_BINDING_2D);

			if (!AnimationModeProcessor.getInstance().getFPSMode()) {
				
				//Bloom.initializeMultisample();
				renderItem();
				//RenderHelper.enableStandardItemLighting();
				//Bloom.unapplyMultisample();
			} else {
				GlStateManager.pushMatrix();
				renderItem();
				GlStateManager.popMatrix();

				OpenGLSelectionHelper.startSelectionPass();
				OpenGLSelectionHelper.bindSelectBuffer();
				// Bloom.initializeMultisample();
				renderItem();
				// Bloom.unapplyMultisample();
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

	protected abstract ClientModContext getClientModContext();

//    protected abstract StateDescriptor getStateDescriptor(EntityLivingBase player, ItemStack itemStack);

	protected abstract StateDescriptor getFirstPersonStateDescriptor(EntityLivingBase player, ItemStack itemStack);

	protected abstract StateDescriptor getThirdPersonStateDescriptor(EntityLivingBase player, ItemStack itemStack);

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
	
	public void setTransformType(TransformType type) {
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

		if (transformType == TransformType.GUI && DebugCommand.isForceLiveRenderGUI()) {

			
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
				ResourceLocation loc = new ResourceLocation(ModReference.id + ":textures/hud/grid.png");

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

			// Bloom.initializeMultisample();

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

		if (transformType != TransformType.GUI || inventoryTextureInitializationPhaseOn)

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

			// Bloom.data.bindFramebuffer(true);
			// GlStateManager.enableBlend();
			// GL14.glBlendEquation(GL14.GL_FUNC_ADD);
			// Bloom.data.bindFramebuffer(false);
			// Dloom.bloomData.bindFramebuffer(true);
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
					//Bloom.initializeMultisample();
					//GlStateManager.scale(20, 20, 20);
					//System.out.println(GL11.glGetError());
				//	msaaBuffer.bindMSAABuffer(mc.getFramebuffer().framebufferObject);
					GlStateManager.enableBlend();
					GlStateManager.enableAlpha();
					//Bloom.initializeMultisample(framebuffer);
					
				}
				//Bloom.initializeMultisample();
				
			
				
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
		

	

		if (transformType == TransformType.GUI && inventoryTextureInitializationPhaseOn) {
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

		if (transformType == TransformType.GUI) {
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
			Bloom.renderFboTriangle(mc.getFramebuffer());
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
	
	public static final ModelRenderer bipedLeftArm = null;
	
	
	static void fixVersionSpecificFirstPersonPositioning(TransformType transformType) {
		int i = transformType == TransformType.FIRST_PERSON_RIGHT_HAND ? 1 : -1;

		GL11.glTranslatef(0.5f, 0.5f, 0.5f); // untranslate 1.9.4

		i = -i;
		GL11.glTranslatef((float) i * 0.56F, 0.52F + /* p_187459_2_ * */ +0.6F, 0.72F); // untranslate 1.9.4

		if (transformType == TransformType.FIRST_PERSON_LEFT_HAND) {
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
			Sprite sprite = SpriteSheetTools.getSquareSprite(id, 128, gunIconSheetWidth, gunIconSheetHeight);

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

	static <T> void renderRightArm(EntityLivingBase player, RenderContext<T> renderContext,
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
	
	
	public static ModelRenderer bipedRightArm = null;
	

	static <T> void renderLeftArm(EntityLivingBase player, RenderContext<T> renderContext,
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

	protected abstract void renderItem(ItemStack weaponItemStack, RenderContext<RenderableState> renderContext,
			Positioner<Part, RenderContext<RenderableState>> positioner);

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
		
		public ModelRendererPreset(ModelRenderer mr) {
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
	public Pair<? extends IBakedModel, Matrix4f> handlePerspective(TransformType cameraTransformType) {
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
