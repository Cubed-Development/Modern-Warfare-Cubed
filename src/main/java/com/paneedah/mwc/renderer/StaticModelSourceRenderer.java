package com.paneedah.mwc.renderer;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.instancing.PlayerItemInstanceFactory;
import com.paneedah.mwc.items.equipment.carryable.ItemCarryable;
import com.paneedah.mwc.skins.CustomSkin;
import com.paneedah.weaponlib.*;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.block.model.*;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
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

import static com.paneedah.mwc.ProjectConstants.ID;
import static com.paneedah.mwc.proxies.ClientProxy.MC;

@SideOnly(Side.CLIENT)
public class StaticModelSourceRenderer extends ModelSource {

	protected ModelSourceTransforms transforms;

	private final Pair<? extends IBakedModel, Matrix4f> pair = Pair.of((IBakedModel) this, null);

	protected EntityLivingBase owner;

	protected ItemStack itemStack;

	protected ItemCameraTransforms.TransformType transformType;

	private class WeaponItemOverrideList extends ItemOverrideList {
		public WeaponItemOverrideList(final List<ItemOverride> overridesIn) {
			super(overridesIn);
		}

		@Override
		public IBakedModel handleItemState(final IBakedModel originalModel, final ItemStack stack, final World world, final EntityLivingBase entity) {
			StaticModelSourceRenderer.this.itemStack = stack;
			StaticModelSourceRenderer.this.owner = entity;
			return super.handleItemState(originalModel, stack, world, entity);
		}
	}

	public StaticModelSourceRenderer(final ModelSourceTransforms transforms) {
		this.transforms = transforms;
	}

	public void renderCustomEquipped(final EntityPlayer player, final ItemStack itemStack) {
		final RenderContext<RenderableState> renderContext = new RenderContext<>(player, itemStack);

		GlStateManager.pushMatrix();

		GlStateManager.scale(0.33F, 0.33F, 0.33F);

		// float pivotOffsetX = 0F;
		// float pivotOffsetY = 0F;
		// float pivotOffsetZ = 0F;
		// GlStateManager.translate(pivotOffsetX, pivotOffsetY, pivotOffsetZ);
		GlStateManager.rotate(180, 0.001F, 0, 0);
		// GlStateManager.translate(-pivotOffsetX, -pivotOffsetY, -pivotOffsetZ);

		GlStateManager.translate(-0.5F, 0.5F, 0.5F);

		transforms.getCustomEquippedPositioning().run();
		renderModelSource(renderContext, itemStack, null, 0, 0, -0.4F, 0, 0, 0.08F);

		GlStateManager.popMatrix();
	}

	@Override
	public List<BakedQuad> getQuads(final IBlockState state, final EnumFacing side, final long rand) {
		// TODO: Actually make rendering compatible with Emissive Renderer
		if (net.minecraftforge.common.ForgeModContainer.allowEmissiveItems)
			return Collections.emptyList();

		if (itemStack == ItemStack.EMPTY)
			return Collections.emptyList();

		if (transformType == null
		        || transformType == ItemCameraTransforms.TransformType.GROUND
		        || transformType == ItemCameraTransforms.TransformType.GUI
		        || transformType == ItemCameraTransforms.TransformType.FIRST_PERSON_RIGHT_HAND
		        || transformType == ItemCameraTransforms.TransformType.THIRD_PERSON_RIGHT_HAND) {

			Tessellator tessellator = Tessellator.getInstance();
			BufferBuilder worldrenderer = tessellator.getBuffer();
			tessellator.draw();
			GlStateManager.pushMatrix();

			if (owner != null) {
				if (transformType == ItemCameraTransforms.TransformType.THIRD_PERSON_RIGHT_HAND) {

					if (owner.isSneaking()) {
						GlStateManager.translate(0.0F, -0.2F, 0.0F);
					}
				}
			}

			final int currentTextureId = GlStateManager.glGetInteger(GL11.GL_TEXTURE_BINDING_2D);

			if (transformType == null && owner instanceof EntityPlayer) {
				renderCustomEquipped((EntityPlayer) owner, itemStack);
			} else {
				renderItem();
			}

			// Rebind the texture that was saved before our rendering, as it may have binded some other texture.
			if (currentTextureId != GlStateManager.glGetInteger(GL11.GL_TEXTURE_BINDING_2D))
				GlStateManager.bindTexture(currentTextureId);

			GlStateManager.popMatrix();
			worldrenderer.begin(GL11.GL_QUADS, DefaultVertexFormats.ITEM);
		}

		// Reset the dynamic values.
		this.owner = null;
		this.itemStack = ItemStack.EMPTY;
		this.transformType = null;

		return Collections.emptyList();
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
		return MC.getTextureMapBlocks().getMissingSprite();
	}

	@SideOnly(Side.CLIENT)
	public void renderItem() {
		GlStateManager.pushMatrix();

		GlStateManager.scale(-1, -1, 1);

		final EntityPlayer player = MC.player;
		final RenderContext<RenderableState> renderContext = new RenderContext<>(player, itemStack);

		switch (transformType) {
		case GROUND:
			transforms.getEntityPositioning().run();
			break;
		case GUI:
			GlStateManager.scale(0.6F, 0.6F, 0.6F);
			GlStateManager.translate(-0.7F, -0.8F, -0.1F);
			GlStateManager.rotate(-30, 1, 0, 0);
			GlStateManager.rotate(40, 0, 1, 0);
			GlStateManager.rotate(0, 0, 0, 1);
			transforms.getInventoryPositioning().run();
			break;
		case THIRD_PERSON_RIGHT_HAND:
		case THIRD_PERSON_LEFT_HAND:
			GlStateManager.scale(0.4F, 0.4F, 0.4F);
			GlStateManager.translate(-1.5F, -2.4F, 1.3F);
			GlStateManager.rotate(-100, 1, 0, 0);
			GlStateManager.rotate(50, 0, 1, 0);
			GlStateManager.rotate(0, 0, 0, 1);
			transforms.getThirdPersonPositioning().run();
			break;
		case FIRST_PERSON_RIGHT_HAND:
		case FIRST_PERSON_LEFT_HAND:
			GlStateManager.scale(0.6F, 0.6F, 0.6F);
			GlStateManager.rotate(-45, 0, 1, 0);
			GlStateManager.translate(-0.3F, -0.855F, 0.5F);
			transforms.getFirstPersonPositioning().run();
			WeaponRenderer.renderLeftArm(player, renderContext, (part, renderContext1) -> transforms.getFirstPersonLeftHandPositioning().run());
			WeaponRenderer.renderRightArm(player, renderContext, (part, renderContext1) -> transforms.getFirstPersonRightHandPositioning().run());
			break;
		default:
		}

		renderModelSource(renderContext, itemStack, transformType, 0, 0, -0.4F, 0, 0, 0.08F);

		GlStateManager.popMatrix();
	}

	protected void renderModelSource(final RenderContext<RenderableState> renderContext, final ItemStack itemStack, final ItemCameraTransforms.TransformType transformType, final float limbSwing, final float limbSwingAmount, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scale) {
		if (itemStack.getItem() instanceof ItemCarryable) {
			renderModelSourceCarryableItem(itemStack, transformType, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
			return;
		}

		if (!(itemStack.getItem() instanceof com.paneedah.weaponlib.ModelSource))
			throw new IllegalArgumentException();

		GlStateManager.pushMatrix();

		final com.paneedah.weaponlib.ModelSource modelSource = (com.paneedah.weaponlib.ModelSource) itemStack.getItem();

		for (final Tuple<ModelBase, String> texturedModel : modelSource.getTexturedModels()) {
			if (texturedModel.getV().startsWith("customskin_")) {
				MC.renderEngine.bindTexture(CustomSkin.getCustomSkinResource(texturedModel.getV().replace("customskin_", "")));
			} else {
				MC.renderEngine.bindTexture(new ResourceLocation(ID + ":textures/models/" + texturedModel.getV()));
			}

			GlStateManager.pushMatrix();
			GlStateManager.pushAttrib(); // TODO: This fucks up the GlStateManager - Luna Mira Lage (Desoroxxx) 2025-12-28 // Before the transition to GlStateManager it used `GL11.GL_ENABLE_BIT`, but GlStateManager don't allow mask so maybe we just don't at all? - Luna Mira Lage (Desoroxxx) - 2025-12-28

			final ModelBase model = texturedModel.getU();

			if (transformType != null) {
				switch (transformType) {
				case GROUND:
					transforms.getEntityModelPositioning().accept(model);
					break;
				case GUI:
					transforms.getInventoryModelPositioning().accept(model);
					break;
				case THIRD_PERSON_RIGHT_HAND:
				case THIRD_PERSON_LEFT_HAND:
					transforms.getThirdPersonModelPositioning().accept(model);
					break;
				case FIRST_PERSON_RIGHT_HAND:
				case FIRST_PERSON_LEFT_HAND:
					transforms.getFirstPersonModelPositioning().accept(model);
					break;
				default:
				}
			}

			model.render(MC.player, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);

			GlStateManager.popAttrib(); // TODO: This fucks up the GlStateManager - Luna Mira Lage (Desoroxxx) 2025-12-28
			GlStateManager.popMatrix();
		}

		final CustomRenderer<RenderableState> postRenderer = (CustomRenderer<RenderableState>) modelSource.getPostRenderer();

		// * As far as I know, we only post render stuff that has an instance, so I added that check, this may be incorrect - Luna Mira Lage (Desoroxxx) 2025-11-19
		if (postRenderer != null && itemStack.getItem() instanceof PlayerItemInstanceFactory) {
			renderContext.setAgeInTicks(-0.4F);
			renderContext.setScale(0.08F);
			renderContext.setCompatibleTransformType(transformType);

			renderContext.setPlayerItemInstance(MWC.modContext.getPlayerItemInstanceRegistry().getCachedItemInstance(renderContext.getPlayer(), itemStack));

			GlStateManager.pushMatrix();
			GlStateManager.pushAttrib(); // TODO: This fucks up the GlStateManager - Luna Mira Lage (Desoroxxx) 2025-12-28 // Before the transition to GlStateManager it used `GL11.GL_ENABLE_BIT | GL11.GL_CURRENT_BIT`, but GlStateManager don't allow mask so maybe we just don't at all? - Luna Mira Lage (Desoroxxx) - 2025-12-28

			postRenderer.render(renderContext);

			GlStateManager.popAttrib(); // TODO: This fucks up the GlStateManager - Luna Mira Lage (Desoroxxx) 2025-12-28
			GlStateManager.popMatrix();
		}

		GlStateManager.popMatrix();
	}

	protected void renderModelSourceCarryableItem(final ItemStack itemStack, final ItemCameraTransforms.TransformType transformType, final float limbSwing, final float limbSwingAmount, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scale) {
		final ItemCarryable itemCarryable = (ItemCarryable) itemStack.getItem();

		final ModelBiped model = EquipmentModelPools.get(itemCarryable.modelName);

		MC.getTextureManager().bindTexture(new ResourceLocation(ID + ":textures/models/" + itemCarryable.textureName));

		if (transformType != null) {
			switch (transformType) {
			case GROUND:
				transforms.getEntityModelPositioning().accept(model);
				break;
			case GUI:
				transforms.getInventoryModelPositioning().accept(model);
				break;
			case THIRD_PERSON_RIGHT_HAND:
			case THIRD_PERSON_LEFT_HAND:
				transforms.getThirdPersonModelPositioning().accept(model);
				break;
			case FIRST_PERSON_RIGHT_HAND:
			case FIRST_PERSON_LEFT_HAND:
				transforms.getFirstPersonModelPositioning().accept(model);
				break;
			default:
			}
		}

		model.render(MC.player, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
	}

	@Override
	public ItemOverrideList getOverrides() {
		return new WeaponItemOverrideList(Collections.emptyList());
	}

	@Override
	public Pair<? extends IBakedModel, Matrix4f> handlePerspective(final ItemCameraTransforms.TransformType cameraTransformType) {
		this.transformType = cameraTransformType;
		return pair;
	}
}
