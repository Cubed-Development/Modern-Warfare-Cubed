package com.paneedah.mwc.rendering.renderer;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.rendering.*;
import com.paneedah.mwc.skins.CustomSkin;
import com.paneedah.weaponlib.CustomRenderer;
import com.paneedah.weaponlib.RenderableState;
import com.paneedah.weaponlib.WeaponRenderer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

import static com.paneedah.mwc.proxies.ClientProxy.MC;
import static com.paneedah.mwc.utils.ModReference.ID;

@SideOnly(Side.CLIENT)
public final class StaticModelSourceRenderer extends ModelSourceRenderer {

    public StaticModelSourceRenderer(final ModelSourceTransforms transforms) {
        this.transforms = transforms;
    }

    @Override
    public void doRender() {
        if (owner != null && transformType == TransformType.THIRD_PERSON_RIGHT_HAND && owner.isSneaking())
            GlStateManager.translate(0, -0.2F, 0);

        GL11.glScaled(-1, -1, 1);

        final EntityPlayer player = MC.player;

        switch (transformType) {
            case GROUND:
                transforms.getEntityPositioning().run();
                break;
            case GUI:
                transforms.getInventoryPositioning().run();
                break;
            case THIRD_PERSON_RIGHT_HAND:
                transforms.getThirdPersonPositioning().run();
                break;
            case FIRST_PERSON_RIGHT_HAND:
                transforms.getFirstPersonPositioning().run();

                final Runnable firstPersonLeftArmPositioning = transforms.getFirstPersonLeftArmPositioning();
                final Runnable firstPersonRightArmPositioning = transforms.getFirstPersonRightArmPositioning();

                if (firstPersonLeftArmPositioning != null)
                    WeaponRenderer.renderLeftArm(player, renderContext, (part, renderContext1) -> firstPersonLeftArmPositioning.run());

                if (firstPersonRightArmPositioning!= null)
                    WeaponRenderer.renderRightArm(player, renderContext, (part, renderContext1) -> firstPersonRightArmPositioning.run());
                break;
        }

        if (itemStack.getItem() instanceof IModelSource) {
            renderModel();
        } else if (itemStack.getItem() instanceof IEquipmentModelSource) {
            renderEquipmentModel();
        }
    }

    private void renderModel() {
        final IModelSource iModelSource = (IModelSource) itemStack.getItem();

        for (final TexturedModel texturedModel : iModelSource.getTexturedModels()) {
            if (texturedModel.getTextureName().startsWith("customskin_")) {
                MC.renderEngine.bindTexture(CustomSkin.getCustomSkinResource(texturedModel.getTextureName().replace("customskin_", "")));
            } else {
                MC.renderEngine.bindTexture(new ResourceLocation(ID + ":textures/models/" + texturedModel.getTextureName()));
            }

            final ModelBase model = texturedModel.getModel();

            model.render(MC.player, 0, 0, 0, 0, 0, 0.08F);
        }


        final CustomRenderer<RenderableState> postRenderer = iModelSource.getPostRenderer();

        if (postRenderer != null) {
            renderContext.setScale(0.08F);
            renderContext.setCompatibleTransformType(transformType);

            renderContext.setPlayerItemInstance(MWC.modContext.getPlayerItemInstanceRegistry().getItemInstance(renderContext.getEntityLiving(), itemStack));

            postRenderer.render(renderContext);
        }
    }

    private void renderEquipmentModel() {
        final IEquipmentModelSource iEquipmentModelSource = (IEquipmentModelSource) itemStack.getItem();

        final ModelBiped model = EquipmentModelPools.get(iEquipmentModelSource.getModelName());

        if (model == null)
            return;

        MC.getTextureManager().bindTexture(new ResourceLocation(ID + ":textures/models/" + iEquipmentModelSource.getTextureName()));

        model.render(MC.player, 0, 0, 0, 0, 0, 0.08F);
    }
}
