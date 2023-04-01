package com.paneedah.weaponlib.compatibility;

import com.paneedah.mwc.utils.ModReference;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.StaticModelSourceRenderer.Builder;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.block.model.*;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.tuple.Pair;
import org.lwjgl.opengl.GL11;

import javax.vecmath.Matrix4f;
import java.util.Collections;
import java.util.List;

import static com.paneedah.mwc.proxies.ClientProxy.mc;
import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public abstract class CompatibleStaticModelSourceRenderer extends ModelSourceRenderer implements IBakedModel {

	protected Builder builder;

	protected EntityLivingBase owner;

	protected TextureManager textureManager;

	private Pair<? extends IBakedModel, Matrix4f> pair;

	protected ModelBiped playerBiped = new ModelBiped();

	protected ItemStack itemStack;

	protected ModelResourceLocation resourceLocation;

	protected TransformType transformType;

	private class WeaponItemOverrideList extends ItemOverrideList {

		public WeaponItemOverrideList(List<ItemOverride> overridesIn) {
			super(overridesIn);
		}

		@Override
		public IBakedModel handleItemState(IBakedModel originalModel, ItemStack stack, World world,
				EntityLivingBase entity) {
			CompatibleStaticModelSourceRenderer.this.itemStack = stack;
			CompatibleStaticModelSourceRenderer.this.owner = entity;
			return super.handleItemState(originalModel, stack, world, entity);
		}
	}

	private ItemOverrideList itemOverrideList = new WeaponItemOverrideList(Collections.emptyList());


	protected CompatibleStaticModelSourceRenderer(Builder builder)
	{
		this.builder = builder;
		this.pair = Pair.of((IBakedModel) this, null);
	}
	
	public void renderCustomEquipped(EntityPlayer player, ItemStack itemStack) {
	}
 

	@Override
	public List<BakedQuad> getQuads(IBlockState state, EnumFacing side, long rand) {
		// Todo: Actually make rendering compatible with Emissive Renderer
		if (net.minecraftforge.common.ForgeModContainer.allowEmissiveItems) {
			return Collections.emptyList();
		}

		if(itemStack == null) return Collections.emptyList();
		if(transformType == null 
		        || transformType == TransformType.GROUND
				|| transformType == TransformType.GUI
				|| transformType == TransformType.FIRST_PERSON_RIGHT_HAND
				|| transformType == TransformType.THIRD_PERSON_RIGHT_HAND
				) {

			Tessellator tessellator = Tessellator.getInstance();
			BufferBuilder worldrenderer = tessellator.getBuffer();
			tessellator.draw();
			GlStateManager.pushMatrix();

			if (owner != null) {
				if (transformType == TransformType.THIRD_PERSON_RIGHT_HAND) {
					
					if (owner.isSneaking()) GlStateManager.translate(0.0F, -0.2F, 0.0F);
				}
			}

			if (onGround()) {
				GlStateManager.scale(-3f, -3f, -3f);
			}

			int currentTextureId = GlStateManager.glGetInteger(GL11.GL_TEXTURE_BINDING_2D);
			if(transformType == null && owner instanceof EntityPlayer) {
			    renderCustomEquipped((EntityPlayer)owner, itemStack);
			} else {
			    renderItem();
			}
			if(currentTextureId != 0) {
			    GlStateManager.bindTexture(currentTextureId);
			}
			GlStateManager.popMatrix();
			worldrenderer.begin(GL11.GL_QUADS, DefaultVertexFormats.ITEM);
		}

		// Reset the dynamic values.
		this.owner = null;
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

	@SideOnly(Side.CLIENT)
	public void renderItem()
	{
		
		GL11.glPushMatrix();

		GL11.glScaled(-1F, -1F, 1F);

		EntityPlayer player = compatibility.clientPlayer();
        RenderContext<RenderableState> renderContext = new RenderContext<>(getModContext(), player, itemStack);

		switch (transformType)
		{
		case GROUND:
			GL11.glScaled(0.35F, 0.35F, 0.35F);
			GL11.glTranslatef(-0.7f, -1f, -0.1f);
			GL11.glRotatef(0F, 1f, 0f, 0f);
			//GL11.glRotatef(150F, 0f, 1f, 0f);
			GL11.glRotatef(90F, 0f, 0f, 1f);
			builder.getEntityPositioning().accept(itemStack);
			break;
		case GUI:
			GL11.glScaled(0.6F, 0.6F, 0.6F);
			GL11.glTranslatef(-0.7f, -0.8f, -0.1f);
			GL11.glRotatef(-30F, 1f, 0f, 0f);
			GL11.glRotatef(40F, 0f, 1f, 0f);
			GL11.glRotatef(0F, 0f, 0f, 1f);
			builder.getInventoryPositioning().accept(itemStack);
			break;
		case THIRD_PERSON_RIGHT_HAND: case THIRD_PERSON_LEFT_HAND:
			GL11.glScaled(0.4F, 0.4F, 0.4F);
			GL11.glTranslatef(-1.5f, -2.4f, 1.3f);
			GL11.glRotatef(-100F, 1f, 0f, 0f);
			GL11.glRotatef(50F, 0f, 1f, 0f);
			GL11.glRotatef(0F, 0f, 0f, 1f);
			builder.getThirdPersonPositioning().accept(player, itemStack);
			break;
		case FIRST_PERSON_RIGHT_HAND: case FIRST_PERSON_LEFT_HAND:
			GL11.glScaled(0.6F, 0.6F, 0.6F);
			GL11.glRotatef(-45F, 0f, 1f, 0f);
			GL11.glTranslatef(-0.3f, -0.855f, 0.5f);
			builder.getFirstPersonPositioning().accept(player, itemStack);
			CompatibleWeaponRenderer.renderLeftArm(player, renderContext, (p, c) -> {
			    builder.getFirstPersonLeftHandPositioning().accept(c);
			});
			CompatibleWeaponRenderer.renderRightArm(player, renderContext, (p, c) -> {
			    builder.getFirstPersonRightHandPositioning().accept(c);
			});
			break;
		default:
		}

		renderModelSource(renderContext, itemStack, transformType, null,  0.0F, 0.0f, -0.4f, 0.0f, 0.0f, 0.08f);

		GL11.glPopMatrix();
	}


	protected void renderModelSource(RenderContext<RenderableState> renderContext, ItemStack itemStack, TransformType transformType, Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		
		if(!(itemStack.getItem() instanceof ModelSource)) {
			throw new IllegalArgumentException();
		}

		GL11.glPushMatrix();

	
		ModelSource modelSource = (ModelSource)itemStack.getItem();

        for(Tuple<ModelBase, String> texturedModel: modelSource.getTexturedModels()) {
			mc.renderEngine.bindTexture(new ResourceLocation(ModReference.id + ":textures/models/" + texturedModel.getV()));
			GL11.glPushMatrix();
			GL11.glPushAttrib(GL11.GL_ENABLE_BIT);
			ModelBase model = texturedModel.getU();

			if(transformType != null) {
			    switch (transformType) {
	            	case GROUND:
	                	builder.getEntityModelPositioning().accept(model, itemStack);
	                	break;
	            	case GUI:
	                	builder.getInventoryModelPositioning().accept(model, itemStack);
	                	break;
	            	case THIRD_PERSON_RIGHT_HAND: case THIRD_PERSON_LEFT_HAND:
	                	builder.getThirdPersonModelPositioning().accept(model, itemStack);
	                	break;
	            	case FIRST_PERSON_RIGHT_HAND: case FIRST_PERSON_LEFT_HAND:
	                	builder.getFirstPersonModelPositioning().accept(model, itemStack);
	                	break;
	            	default:
	            }
			}

			model.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopAttrib();
			GL11.glPopMatrix();
		}

        @SuppressWarnings("unchecked")
        CustomRenderer<RenderableState> postRenderer = (CustomRenderer<RenderableState>) modelSource.getPostRenderer();

		if(postRenderer != null) {
	        renderContext.setAgeInTicks(-0.4f);
	        renderContext.setScale(0.08f);
	        renderContext.setCompatibleTransformType(transformType);

	        renderContext.setPlayerItemInstance(getModContext().getPlayerItemInstanceRegistry().getItemInstance(renderContext.getPlayer(), itemStack));

            GL11.glPushMatrix();
            GL11.glPushAttrib(GL11.GL_ENABLE_BIT | GL11.GL_CURRENT_BIT);

            postRenderer.render(renderContext);
            GL11.glPopAttrib();
            GL11.glPopMatrix();
        }
		GL11.glPopMatrix();
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

    protected abstract ModContext getModContext();

}
