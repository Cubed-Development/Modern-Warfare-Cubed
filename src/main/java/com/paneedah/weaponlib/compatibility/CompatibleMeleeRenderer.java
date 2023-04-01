package com.paneedah.weaponlib.compatibility;

import com.paneedah.weaponlib.ClientModContext;
import com.paneedah.weaponlib.Part;
import com.paneedah.weaponlib.RenderContext;
import com.paneedah.weaponlib.animation.DebugPositioner;
import com.paneedah.weaponlib.animation.MultipartPositioning;
import com.paneedah.weaponlib.animation.MultipartPositioning.Positioner;
import com.paneedah.weaponlib.animation.MultipartRenderStateManager;
import com.paneedah.weaponlib.melee.MeleeRenderer.Builder;
import com.paneedah.weaponlib.melee.PlayerMeleeInstance;
import com.paneedah.weaponlib.melee.RenderableState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.block.model.*;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.tuple.Pair;
import org.lwjgl.opengl.GL11;

import javax.vecmath.Matrix4f;
import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public abstract class CompatibleMeleeRenderer extends ModelSourceRenderer implements IBakedModel {
	
	protected static class StateDescriptor {
		protected MultipartRenderStateManager<RenderableState, Part, RenderContext<RenderableState>> stateManager;
		protected float rate;
		protected float amplitude = 0.04f;
		private PlayerMeleeInstance instance;
		public StateDescriptor(PlayerMeleeInstance instance, MultipartRenderStateManager<RenderableState, Part, RenderContext<RenderableState>> stateManager,
				float rate, float amplitude) {
			this.instance = instance;
			this.stateManager = stateManager;
			this.rate = rate;
			this.amplitude = amplitude;
		}
	}
	
	protected CompatibleMeleeRenderer(Builder builder){
		this.builder = builder;
		this.textureManager = mc.getTextureManager();
        this.pair = Pair.of((IBakedModel) this, null);
//        this.playerBiped = new ModelBiped();
//        this.playerBiped.textureWidth = 64;
//        this.playerBiped.textureHeight = 64;
	}
	
	protected abstract ClientModContext getClientModContext();
	
	protected abstract StateDescriptor getStateDescriptor(EntityPlayer player, ItemStack itemStack);
	
	protected EntityPlayer player;

    protected TextureManager textureManager;

    private Pair<? extends IBakedModel, Matrix4f> pair;
    //protected ModelBiped playerBiped = new ModelBiped();
    
    protected ItemStack itemStack;

    protected ModelResourceLocation resourceLocation;
    
    private class WeaponItemOverrideList extends ItemOverrideList {

        public WeaponItemOverrideList(List<ItemOverride> overridesIn) {
            super(overridesIn);
        }
        
        @Override
        public IBakedModel handleItemState(IBakedModel originalModel, ItemStack stack, World world,
                EntityLivingBase entity) {
            CompatibleMeleeRenderer.this.itemStack = stack;
            CompatibleMeleeRenderer.this.player = (EntityPlayer) entity;
            return super.handleItemState(originalModel, stack, world, entity);
        }
    }
    
    private ItemOverrideList itemOverrideList = new WeaponItemOverrideList(Collections.emptyList());
    
    TransformType transformType;

    private Builder builder;
    
    @Override
    public List<BakedQuad> getQuads(IBlockState state, EnumFacing side, long rand) {
        // Todo: Actually make rendering compatible with Emissive Renderer
        if (net.minecraftforge.common.ForgeModContainer.allowEmissiveItems) {
            return Collections.emptyList();
        }

        if(itemStack == null) return Collections.emptyList();
        if(transformType == TransformType.GROUND 
                || transformType == TransformType.GUI
                || transformType == TransformType.FIRST_PERSON_RIGHT_HAND 
                || transformType == TransformType.THIRD_PERSON_RIGHT_HAND 
                ) {
            
            Tessellator tessellator = Tessellator.getInstance();
            BufferBuilder worldrenderer = tessellator.getBuffer();
            tessellator.draw();
            GlStateManager.pushMatrix();

            if (player != null) {
                if (transformType == TransformType.THIRD_PERSON_RIGHT_HAND) {
                    if (player.isSneaking()) GlStateManager.translate(0.0F, -0.2F, 0.0F);
                }
            }

            if (onGround()) {
                GlStateManager.scale(-3f, -3f, -3f);
            }

            int currentTextureId = GlStateManager.glGetInteger(GL11.GL_TEXTURE_BINDING_2D);
            renderItem();
            if(currentTextureId != 0) {
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
	
    @SideOnly(Side.CLIENT)
    public void renderItem()	{
		
		GL11.glPushMatrix();
		
		
		
		RenderContext<RenderableState> renderContext = new RenderContext<>(getClientModContext(), player, itemStack);
		
		//float limbSwing, float flimbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale
		//0.0F, 0.0f, -0.4f, 0.0f, 0.0f, 0.08f);
		renderContext.setAgeInTicks(-0.4f);
		renderContext.setScale(0.08f);
		renderContext.setCompatibleTransformType(transformType);
		
		Positioner<Part, RenderContext<RenderableState>> positioner = null;
		switch (transformType)
		{
		case GROUND:
		    GL11.glScaled(-1F, -1F, 1F);
		    GL11.glScaled(0.35F, 0.35F, 0.35F);
            GL11.glTranslatef(-0.7f, -1f, -0.1f);
            GL11.glRotatef(0F, 1f, 0f, 0f);
            //GL11.glRotatef(150F, 0f, 1f, 0f);
            GL11.glRotatef(90F, 0f, 0f, 1f);
			builder.getEntityPositioning().accept(itemStack);
			break;
			
		case GUI:
		    GL11.glScaled(-1F, -1F, 1F);
            GL11.glScaled(0.6F, 0.6F, 0.6F);
            GL11.glTranslatef(-0.7f, -0.8f, -0.1f);
            GL11.glRotatef(-30F, 1f, 0f, 0f);
            GL11.glRotatef(40F, 0f, 1f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
			builder.getInventoryPositioning().accept(itemStack);
			break;
			
        case THIRD_PERSON_RIGHT_HAND: case THIRD_PERSON_LEFT_HAND:
            GL11.glScaled(-1F, -1F, 1F);
            GL11.glScaled(0.4F, 0.4F, 0.4F);
            GL11.glTranslatef(-1.33f, -2f, 0.7f);
            GL11.glRotatef(-70F, 1f, 0f, 0f);
            GL11.glRotatef(50F, 0f, 1f, 0f);
            GL11.glRotatef(0F, 0f, 0f, 1f);
            builder.getThirdPersonPositioning().accept(renderContext);
            break;
			
        case FIRST_PERSON_RIGHT_HAND: case FIRST_PERSON_LEFT_HAND:
            
            CompatibleWeaponRenderer.fixVersionSpecificFirstPersonPositioning(transformType); 
            
            GL11.glScaled(-1F, -1F, 1F);
			
			StateDescriptor stateDescriptor = getStateDescriptor(player, itemStack);
			
			renderContext.setPlayerItemInstance(stateDescriptor.instance);
						
			MultipartPositioning<Part, RenderContext<RenderableState>> multipartPositioning = stateDescriptor.stateManager.nextPositioning();
			
			renderContext.setTransitionProgress(multipartPositioning.getProgress());
			
			renderContext.setFromState(multipartPositioning.getFromState(RenderableState.class));
			
			renderContext.setToState(multipartPositioning.getToState(RenderableState.class));
			
			positioner = multipartPositioning.getPositioner();
			
			CompatibleWeaponRenderer.renderLeftArm(player, renderContext, positioner);
            
			CompatibleWeaponRenderer.renderRightArm(player, renderContext, positioner);
		
			positioner.position(Part.MAIN_ITEM, renderContext);
			
			if(DebugPositioner.isDebugModeEnabled()) {
	            DebugPositioner.position(Part.MAIN_ITEM, renderContext);
	        }

			break;
		default:
		}
		
		renderItem(itemStack, renderContext, positioner);
		
		GL11.glPopMatrix();
	}
	
	protected abstract BiConsumer<Part, RenderContext<RenderableState>> getPartDebugPositioning();

	protected abstract void renderItem(ItemStack weaponItemStack, RenderContext<RenderableState> renderContext,
			Positioner<Part, RenderContext<RenderableState>> positioner);
}
