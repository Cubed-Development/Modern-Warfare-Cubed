package com.paneedah.mwc.rendering.renderer;

import com.paneedah.mwc.rendering.ModelSourceTransforms;
import com.paneedah.weaponlib.RenderContext;
import com.paneedah.weaponlib.RenderableState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.*;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.lang3.tuple.Pair;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;

import javax.vecmath.Matrix4f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

@SideOnly(Side.CLIENT)
public abstract class ModelSourceRenderer implements IBakedModel {

    public ModelResourceLocation modelResourceLocation;

    // Todo: This is crap, we should support every rendering environment
    protected static final ArrayList<TransformType> excludedTransformType = new ArrayList<>(Arrays.asList(
            TransformType.FIXED,
            TransformType.HEAD,
            TransformType.THIRD_PERSON_LEFT_HAND,
            TransformType.FIRST_PERSON_LEFT_HAND
    ));

    protected ItemStack itemStack;
    protected EntityLivingBase owner;
    protected ModelSourceTransforms transforms;
    protected TransformType transformType;
    protected RenderContext<RenderableState> renderContext = new RenderContext<>(null, null);

    private final ItemOverrideList itemOverrideList = new ModelSourceItemOverrideList(Collections.emptyList());
    private final Pair<? extends IBakedModel, Matrix4f> pair = Pair.of((IBakedModel) this, null);

    public void render() {
        if (itemStack == null || excludedTransformType.contains(transformType))
            return;

        GlStateManager.pushMatrix();

        doRender();

        GlStateManager.popMatrix();

        // Reset the dynamic values.
        this.owner = null;
        this.itemStack = null;
        this.transformType = TransformType.NONE;
    }

    protected abstract void doRender();

    private final class ModelSourceItemOverrideList extends ItemOverrideList {

        public ModelSourceItemOverrideList(final List<ItemOverride> overridesIn) {
            super(overridesIn);
        }

        @Override
        public IBakedModel handleItemState(final IBakedModel iBakedModel, final ItemStack itemStackIn, final World world, final EntityLivingBase entityLivingIn) {
            owner = entityLivingIn;
            itemStack = itemStackIn;

            renderContext.setEntityLiving(entityLivingIn);
            renderContext.setItemStack(itemStackIn);

            return super.handleItemState(iBakedModel, itemStackIn, world, entityLivingIn);
        }
    }

    @Override
    public final List<BakedQuad> getQuads(final IBlockState iBlockState, final EnumFacing enumFacing, final long rand) {
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
    public final TextureAtlasSprite getParticleTexture() {
        return MC.getTextureMapBlocks().getMissingSprite();
    }

    @Override
    public final ItemOverrideList getOverrides() {
        return itemOverrideList;
    }

    @Override
    public final Pair<? extends IBakedModel, Matrix4f> handlePerspective(final TransformType transformType) {
        this.transformType = transformType;
        return pair;
    }
}
