package com.paneedah.mwc.renderer;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.items.equipment.carryable.ItemCarryable;
import com.paneedah.mwc.skins.CustomSkin;
import com.paneedah.weaponlib.*;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
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

import static com.paneedah.mwc.proxies.ClientProxy.MC;
import static com.paneedah.mwc.ProjectConstants.ID;

@SideOnly(Side.CLIENT)
public class StaticModelSourceRenderer extends ModelSource implements IBakedModel {

    protected ModelSourceTransforms transforms;

    private final Pair<? extends IBakedModel, Matrix4f> pair = Pair.of((IBakedModel) this, null);

    protected EntityLivingBase owner;

    protected ItemStack itemStack;

    protected ItemCameraTransforms.TransformType transformType;

    private class WeaponItemOverrideList extends ItemOverrideList {
        public WeaponItemOverrideList(List<ItemOverride> overridesIn) {
            super(overridesIn);
        }

        @Override
        public IBakedModel handleItemState(IBakedModel originalModel, ItemStack stack, World world, EntityLivingBase entity) {
            StaticModelSourceRenderer.this.itemStack = stack;
            StaticModelSourceRenderer.this.owner = entity;
            return super.handleItemState(originalModel, stack, world, entity);
        }
    }

    public StaticModelSourceRenderer(ModelSourceTransforms transforms) {
        this.transforms = transforms;
    }

    public void renderCustomEquipped(EntityPlayer player, ItemStack itemStack) {
        RenderContext<RenderableState> renderContext = new RenderContext<>(player, itemStack);

        GL11.glPushMatrix();

        GL11.glScalef(0.33f, 0.33f, 0.33f);

//        float pivotOffsetX = 0f;
//        float pivotOffsetY = 0f;
//        float pivotOffsetZ = 0f;
//        GL11.glTranslatef(pivotOffsetX, pivotOffsetY, pivotOffsetZ);
        GL11.glRotatef(180f, 0.001f, 0.0f, 0.0f);
//        GL11.glTranslatef(-pivotOffsetX, -pivotOffsetY, -pivotOffsetZ);


        GL11.glTranslatef(-0.5f, 0.5f, 0.5f);

        transforms.getCustomEquippedPositioning().run();
        renderModelSource(renderContext, itemStack, null, 0.0F, 0.0f, -0.4f, 0.0f, 0.0f, 0.08f);

        GL11.glPopMatrix();
    }

    @Override
    public List<BakedQuad> getQuads(IBlockState state, EnumFacing side, long rand) {
        // Todo: Actually make rendering compatible with Emissive Renderer
        if (net.minecraftforge.common.ForgeModContainer.allowEmissiveItems) {
            return Collections.emptyList();
        }

        if (itemStack == null) {
            return Collections.emptyList();
        }

        if (transformType == null || transformType == ItemCameraTransforms.TransformType.GROUND
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

                    if (owner.isSneaking()) {
                        GlStateManager.translate(0.0F, -0.2F, 0.0F);
                    }
                }
            }

            int currentTextureId = GlStateManager.glGetInteger(GL11.GL_TEXTURE_BINDING_2D);

            if (transformType == null && owner instanceof EntityPlayer) {
                renderCustomEquipped((EntityPlayer) owner, itemStack);
            } else {
                renderItem();
            }

            if (currentTextureId != 0) {
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
        GL11.glPushMatrix();

        GL11.glScaled(-1, -1, 1);

        final EntityPlayer player = MC.player;
        final RenderContext<RenderableState> renderContext = new RenderContext<>(player, itemStack);

        switch (transformType) {
            case GROUND:
                transforms.getEntityPositioning().run();
                break;
            case GUI:
                GL11.glScaled(0.6F, 0.6F, 0.6F);
                GL11.glTranslatef(-0.7F, -0.8F, -0.1F);
                GL11.glRotatef(-30F, 1, 0, 0);
                GL11.glRotatef(40F, 0, 1, 0);
                GL11.glRotatef(0, 0, 0, 1);
                transforms.getInventoryPositioning().run();
                break;
            case THIRD_PERSON_RIGHT_HAND:
            case THIRD_PERSON_LEFT_HAND:
                GL11.glScaled(0.4F, 0.4F, 0.4F);
                GL11.glTranslatef(-1.5f, -2.4f, 1.3f);
                GL11.glRotatef(-100F, 1f, 0f, 0f);
                GL11.glRotatef(50F, 0f, 1f, 0f);
                GL11.glRotatef(0F, 0f, 0f, 1f);
                transforms.getThirdPersonPositioning().run();
                break;
            case FIRST_PERSON_RIGHT_HAND:
            case FIRST_PERSON_LEFT_HAND:
                GL11.glScaled(0.6F, 0.6F, 0.6F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glTranslatef(-0.3f, -0.855f, 0.5f);
                transforms.getFirstPersonPositioning().run();
                WeaponRenderer.renderLeftArm(player, renderContext, (part, renderContext1) -> transforms.getFirstPersonLeftHandPositioning().run());
                WeaponRenderer.renderRightArm(player, renderContext, (part, renderContext1) -> transforms.getFirstPersonRightHandPositioning().run());
                break;
            default:
        }


        renderModelSource(renderContext, itemStack, transformType, 0, 0, -0.4F, 0, 0, 0.08F);

        GL11.glPopMatrix();
    }


    protected void renderModelSource(RenderContext<RenderableState> renderContext, ItemStack itemStack, ItemCameraTransforms.TransformType transformType, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        if (itemStack.getItem() instanceof ItemCarryable) {
            renderModelSourceCarryableItem(itemStack, transformType, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
            return;
        }

        if (!(itemStack.getItem() instanceof com.paneedah.weaponlib.ModelSource)) {
            throw new IllegalArgumentException();
        }

        GL11.glPushMatrix();

        com.paneedah.weaponlib.ModelSource modelSource = (com.paneedah.weaponlib.ModelSource) itemStack.getItem();

        for (Tuple<ModelBase, String> texturedModel : modelSource.getTexturedModels()) {
            if (texturedModel.getV().startsWith("customskin_")) {
                MC.renderEngine.bindTexture(CustomSkin.getCustomSkinResource(texturedModel.getV().replace("customskin_", "")));
            } else {
                MC.renderEngine.bindTexture(new ResourceLocation(ID + ":textures/models/" + texturedModel.getV()));
            }
            GL11.glPushMatrix();
            GL11.glPushAttrib(GL11.GL_ENABLE_BIT);
            ModelBase model = texturedModel.getU();

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
            GL11.glPopAttrib();
            GL11.glPopMatrix();
        }


        CustomRenderer<RenderableState> postRenderer = (CustomRenderer<RenderableState>) modelSource.getPostRenderer();

        if (postRenderer != null) {
            renderContext.setAgeInTicks(-0.4f);
            renderContext.setScale(0.08f);
            renderContext.setCompatibleTransformType(transformType);

            renderContext.setPlayerItemInstance(MWC.modContext.getPlayerItemInstanceRegistry().getItemInstance(renderContext.getPlayer(), itemStack));

            GL11.glPushMatrix();
            GL11.glPushAttrib(GL11.GL_ENABLE_BIT | GL11.GL_CURRENT_BIT);

            postRenderer.render(renderContext);
            GL11.glPopAttrib();
            GL11.glPopMatrix();
        }
        GL11.glPopMatrix();
    }

    protected void renderModelSourceCarryableItem(ItemStack itemStack, ItemCameraTransforms.TransformType transformType, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        ItemCarryable itemCarryable = (ItemCarryable) itemStack.getItem();

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
    public Pair<? extends IBakedModel, Matrix4f> handlePerspective(ItemCameraTransforms.TransformType cameraTransformType) {
        this.transformType = cameraTransformType;
        return pair;
    }
}
