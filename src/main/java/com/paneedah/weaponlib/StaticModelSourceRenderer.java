package com.paneedah.weaponlib;

import com.paneedah.mwc.skins.CustomSkin;
import com.paneedah.mwc.utils.ModReference;
import com.paneedah.weaponlib.animation.MultipartPositioning.Positioner;
import com.paneedah.weaponlib.compatibility.Interceptors;
import com.paneedah.weaponlib.compatibility.ModelSourceRenderer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.block.model.*;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
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
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class StaticModelSourceRenderer extends ModelSourceRenderer implements IBakedModel {

	protected Builder builder;

	protected EntityLivingBase owner;

	private Pair<? extends IBakedModel, Matrix4f> pair;

	protected ItemStack itemStack;

	protected ItemCameraTransforms.TransformType transformType;

	private class WeaponItemOverrideList extends ItemOverrideList {
		public WeaponItemOverrideList(List<ItemOverride> overridesIn) {
			super(overridesIn);
		}

		@Override
		public IBakedModel handleItemState(IBakedModel originalModel, ItemStack stack, World world,
										   EntityLivingBase entity) {
			StaticModelSourceRenderer.this.itemStack = stack;
			StaticModelSourceRenderer.this.owner = entity;
			return super.handleItemState(originalModel, stack, world, entity);
		}
	}

	private ItemOverrideList itemOverrideList = new WeaponItemOverrideList(Collections.emptyList());

	public static class Builder {
		private Consumer<ItemStack> entityPositioning;
		private Consumer<ItemStack> inventoryPositioning;
		private BiConsumer<EntityPlayer, ItemStack> thirdPersonPositioning;
		private BiConsumer<EntityPlayer, ItemStack> firstPersonPositioning;
		private BiConsumer<EntityPlayer, ItemStack> customEquippedPositioning;
		
		private BiConsumer<ModelBase, ItemStack> firstPersonModelPositioning;
		private BiConsumer<ModelBase, ItemStack> thirdPersonModelPositioning;
		
		private BiConsumer<ModelBase, ItemStack> inventoryModelPositioning;
		private BiConsumer<ModelBase, ItemStack> entityModelPositioning;
		
		private Consumer<RenderContext<RenderableState>> firstPersonLeftHandPositioning;
		private Consumer<RenderContext<RenderableState>> firstPersonRightHandPositioning;
		

		private ModContext modContext;
		private boolean isHiddenInInventory;
		
		public Builder withHiddenInventory(boolean isHiddenInInventory) {
		    this.isHiddenInInventory = isHiddenInInventory;
		    return this;
		}
		
		public Builder withModContext(ModContext modContext) {
		    this.modContext = modContext;
		    return this;
		}

		public Builder withFirstPersonPositioning(BiConsumer<EntityPlayer, ItemStack> firstPersonPositioning) {
			this.firstPersonPositioning = firstPersonPositioning;
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
		
		public Builder withEntityPositioning(Consumer<ItemStack> entityPositioning) {
			this.entityPositioning = entityPositioning;
			return this;
		}
		
		public Builder withInventoryPositioning(Consumer<ItemStack> inventoryPositioning) {
			this.inventoryPositioning = inventoryPositioning;
			return this;
		}

		public Builder withThirdPersonPositioning(BiConsumer<EntityPlayer, ItemStack> thirdPersonPositioning) {
			this.thirdPersonPositioning = thirdPersonPositioning;
			return this;
		}
		
		public Builder withCustomEquippedPositioning(BiConsumer<EntityPlayer, ItemStack> customEquippedPositioning) {
            this.customEquippedPositioning = customEquippedPositioning;
            return this;
        }

		public Builder withFirstPersonModelPositioning(BiConsumer<ModelBase, ItemStack> firstPersonModelPositioning) {
			this.firstPersonModelPositioning = firstPersonModelPositioning;
			return this;
		}
		
		public Builder withEntityModelPositioning(BiConsumer<ModelBase, ItemStack> entityModelPositioning) {
			this.entityModelPositioning = entityModelPositioning;
			return this;
		}
		
		public Builder withInventoryModelPositioning(BiConsumer<ModelBase, ItemStack> inventoryModelPositioning) {
			this.inventoryModelPositioning = inventoryModelPositioning;
			return this;
		}

		public Builder withThirdPersonModelPositioning(BiConsumer<ModelBase, ItemStack> thirdPersonModelPositioning) {
			this.thirdPersonModelPositioning = thirdPersonModelPositioning;
			return this;
		}

		public StaticModelSourceRenderer build() {
			if(inventoryPositioning == null) {
				inventoryPositioning = itemStack -> {
				    if(isHiddenInInventory) GL11.glScalef(0f, 0f, 0f);
				    else GL11.glTranslatef(0,  0.12f, 0);
				};
			}
			
			if(entityPositioning == null) {
				entityPositioning = itemStack -> {
				};
			}
			
			if(firstPersonPositioning == null) {
				firstPersonPositioning = (player, itemStack) -> {
				};
			}
			
			if(thirdPersonPositioning == null) {
				thirdPersonPositioning = (player, itemStack) -> {
//					GL11.glTranslatef(-0.4F, 0.2F, 0.4F);
//					GL11.glRotatef(-45F, 0f, 1f, 0f);
//					GL11.glRotatef(70F, 1f, 0f, 0f);
				};
			}
			
			if(inventoryModelPositioning == null) {
				inventoryModelPositioning = (m, i) -> { 
				    if(isHiddenInInventory) GL11.glScalef(0f, 0f, 0f);
				 };
			}
			
			if(entityModelPositioning == null) {
				entityModelPositioning = (m, i) -> {};
			}
			
			if(firstPersonModelPositioning == null) {
				firstPersonModelPositioning = (m, i) -> {};
			}
			
			if(thirdPersonModelPositioning == null) {
				thirdPersonModelPositioning = (m, i) -> {};
			}
			
			if(firstPersonLeftHandPositioning == null) {
			    firstPersonLeftHandPositioning = c -> {GL11.glScalef(0f, 0f, 0f);};
			}
			
			if(firstPersonRightHandPositioning == null) {
			    firstPersonRightHandPositioning = c -> {GL11.glScalef(0f, 0f, 0f);};
            }
			
			return new StaticModelSourceRenderer(this);
		}

		public Consumer<ItemStack> getEntityPositioning() {
			return entityPositioning;
		}

		public Consumer<ItemStack> getInventoryPositioning() {
			return inventoryPositioning;
		}

		public BiConsumer<EntityPlayer, ItemStack> getThirdPersonPositioning() {
			return thirdPersonPositioning;
		}

		public BiConsumer<EntityPlayer, ItemStack> getFirstPersonPositioning() {
			return firstPersonPositioning;
		}

		public BiConsumer<ModelBase, ItemStack> getFirstPersonModelPositioning() {
			return firstPersonModelPositioning;
		}

		public BiConsumer<ModelBase, ItemStack> getThirdPersonModelPositioning() {
			return thirdPersonModelPositioning;
		}

		public BiConsumer<ModelBase, ItemStack> getInventoryModelPositioning() {
			return inventoryModelPositioning;
		}

		public BiConsumer<ModelBase, ItemStack> getEntityModelPositioning() {
			return entityModelPositioning;
		}
		
		public Consumer<RenderContext<RenderableState>> getFirstPersonLeftHandPositioning() {
            return firstPersonLeftHandPositioning;
        }
		
		public Consumer<RenderContext<RenderableState>> getFirstPersonRightHandPositioning() {
            return firstPersonRightHandPositioning;
        }
		
		public BiConsumer<EntityPlayer, ItemStack> getCustomEquippedPositioning() {
            return customEquippedPositioning;
        }
	}

	private StaticModelSourceRenderer(Builder builder) {
		this.builder = builder;
		this.pair = Pair.of((IBakedModel) this, null);
	}
	
    protected ModContext getModContext() {
        return builder.modContext;
    }
    
    public void renderCustomEquipped(EntityPlayer player, ItemStack itemStack) {
        RenderContext<RenderableState> renderContext = new RenderContext<>(getModContext(), player, itemStack);
        
        GL11.glPushMatrix();
        
        GL11.glScalef(0.33f, 0.33f, 0.33f);
        
//        float pivotOffsetX = 0f;
//        float pivotOffsetY = 0f;
//        float pivotOffsetZ = 0f;
//        GL11.glTranslatef(pivotOffsetX, pivotOffsetY, pivotOffsetZ);
        GL11.glRotatef(180f, 0.001f, 0.0f, 0.0f);
//        GL11.glTranslatef(-pivotOffsetX, -pivotOffsetY, -pivotOffsetZ);
        
        
        GL11.glTranslatef(-0.5f, 0.5f, 0.5f);
        
        if(Interceptors.isProning(player)) {
            PlayerRenderer playerRenderer = Interceptors.getPlayerRenderer(player);
            
            if(playerRenderer != null) {
                Positioner<Part, RenderContext<RenderableState>> bodyPositioner = playerRenderer.getCurrentPositioner();
                if(bodyPositioner != null) {
                    bodyPositioner.position(Part.MAIN, renderContext);
                }
            }
        }

        BiConsumer<EntityPlayer, ItemStack> positioning = builder.getCustomEquippedPositioning();
        
        if(positioning != null) {
            positioning.accept(player, itemStack);
            renderModelSource(renderContext, itemStack, null, null,  0.0F, 0.0f, -0.4f, 0.0f, 0.0f, 0.08f);
        }
        
        GL11.glPopMatrix();
    }

	@Override
	public List<BakedQuad> getQuads(IBlockState state, EnumFacing side, long rand) {
		// Todo: Actually make rendering compatible with Emissive Renderer
		if (net.minecraftforge.common.ForgeModContainer.allowEmissiveItems) {
			return Collections.emptyList();
		}

		if(itemStack == null) return Collections.emptyList();
		if(transformType == null
				|| transformType == ItemCameraTransforms.TransformType.GROUND
				|| transformType == ItemCameraTransforms.TransformType.GUI
				|| transformType == ItemCameraTransforms.TransformType.FIRST_PERSON_RIGHT_HAND
				|| transformType == ItemCameraTransforms.TransformType.THIRD_PERSON_RIGHT_HAND
		) {

			Tessellator tessellator = Tessellator.getInstance();
			BufferBuilder worldrenderer = tessellator.getBuffer();
			tessellator.draw();
			GlStateManager.pushMatrix();

			if (owner != null) {
				if (transformType == ItemCameraTransforms.TransformType.THIRD_PERSON_RIGHT_HAND) {

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
	public void renderItem() {
		GL11.glPushMatrix();

		GL11.glScaled(-1F, -1F, 1F);

		EntityPlayer player = mc.player;
		RenderContext<RenderableState> renderContext = new RenderContext<>(getModContext(), player, itemStack);

		switch (transformType) {
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
				WeaponRenderer.renderLeftArm(player, renderContext, (p, c) -> {
					builder.getFirstPersonLeftHandPositioning().accept(c);
				});
				WeaponRenderer.renderRightArm(player, renderContext, (p, c) -> {
					builder.getFirstPersonRightHandPositioning().accept(c);
				});
				break;
			default:
		}

		renderModelSource(renderContext, itemStack, transformType, null,  0.0F, 0.0f, -0.4f, 0.0f, 0.0f, 0.08f);

		GL11.glPopMatrix();
	}


	protected void renderModelSource(RenderContext<RenderableState> renderContext, ItemStack itemStack, ItemCameraTransforms.TransformType transformType, Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		if(!(itemStack.getItem() instanceof ModelSource)) {
			throw new IllegalArgumentException();
		}

		GL11.glPushMatrix();

		ModelSource modelSource = (ModelSource)itemStack.getItem();

		for(Tuple<ModelBase, String> texturedModel: modelSource.getTexturedModels()) {
			if (texturedModel.getV().startsWith("customskin_")) {
				mc.renderEngine.bindTexture(CustomSkin.getCustomSkinResource(texturedModel.getV().toLowerCase().replace("customskin_", "").replace(".png", "")));
			} else {
				mc.renderEngine.bindTexture(new ResourceLocation(ModReference.ID + ":textures/models/" + texturedModel.getV()));
			}
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
	public Pair<? extends IBakedModel, Matrix4f> handlePerspective(ItemCameraTransforms.TransformType cameraTransformType) {
		this.transformType = cameraTransformType;
		return pair;
	}
}
