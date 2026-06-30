package com.paneedah.weaponlib.electronics;

import com.paneedah.mwc.renderer.ModelSourceTransforms;
import com.paneedah.mwc.renderer.StaticModelSourceRenderer;
import com.paneedah.mwc.weapons.AbstractItemBuilder;
import com.paneedah.weaponlib.*;
import com.paneedah.mwc.rendering.Transform;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import static com.paneedah.mwc.ProjectConstants.ID;

public class ItemWirelessCamera extends Item implements ModelSource {

    public static final long DEFAULT_DURATION = 300 * 1000;

    public static class Builder extends AbstractItemBuilder<Builder> {

        protected String textureName;
        protected ModelSourceTransforms transforms = ModelSourceTransforms.builder()
                .entityPositioning(() -> new Transform()
                        .withPosition(-0.5F, -0.55F, 0.5F)
                        .withScale(0.5F, 0.5F, 0.5F)
                        .applyTransformations())
                .inventoryPositioning(() -> new Transform()
                        .withScale(2.25F, 2.25F, 2.25F)
                        .withPosition(-0.80F, -0.7F, 0)
                        .applyTransformations())
                .build();

        protected AttachmentCategory attachmentCategory;
        private final List<Tuple<ModelBase, String>> texturedModels = new ArrayList<>();

        private long duration = DEFAULT_DURATION;

        public Builder withTextureName(String textureName) {
            this.textureName = textureName.toLowerCase();
            return this;
        }

        public Builder withEntityPositioning(Runnable entityPositioning) {
            transforms.setEntityPositioning(entityPositioning);
            return this;
        }

        public Builder withInventoryPositioning(Runnable inventoryPositioning) {
            transforms.setInventoryPositioning(inventoryPositioning);
            return this;
        }

        public Builder withThirdPersonPositioning(Runnable thirdPersonPositioning) {
            transforms.setThirdPersonPositioning(thirdPersonPositioning);
            return this;
        }

        public Builder withFirstPersonPositioning(Runnable firstPersonPositioning) {
            transforms.setFirstPersonPositioning(firstPersonPositioning);
            return this;
        }

        public Builder withFirstPersonModelPositioning(Consumer<ModelBase> firstPersonModelPositioning) {
            transforms.setFirstPersonModelPositioning(firstPersonModelPositioning);
            return this;
        }

        public Builder withEntityModelPositioning(Consumer<ModelBase> entityModelPositioning) {
            transforms.setEntityModelPositioning(entityModelPositioning);
            return this;
        }

        public Builder withInventoryModelPositioning(Consumer<ModelBase> inventoryModelPositioning) {
            transforms.setInventoryModelPositioning(inventoryModelPositioning);
            return this;
        }

        public Builder withThirdPersonModelPositioning(Consumer<ModelBase> thirdPersonModelPositioning) {
            transforms.setThirdPersonModelPositioning(thirdPersonModelPositioning);
            return this;
        }

        public Builder withFirstPersonHandPositioning(Runnable leftHand, Runnable rightHand) {
            transforms.setFirstPersonLeftHandPositioning(leftHand);
            transforms.setFirstPersonRightHandPositioning(rightHand);
            return this;
        }

        public Builder withModel(ModelBase model, String textureName) {
            this.texturedModels.add(new Tuple<>(model, textureName.toLowerCase()));
            return this;
        }

        public Builder withDuration(long duration) {
            this.duration = duration;
            return this;
        }

        @Override
        public ItemWirelessCamera build(ModContext modContext) {

            ItemWirelessCamera camera = new ItemWirelessCamera(this, modContext);
            camera.setTranslationKey(ID + "_" + name);
            camera.setCreativeTab(tab);
            camera.maxStackSize = maxStackSize;

            texturedModels.forEach(tm -> camera.texturedModels.add(new Tuple<>(tm.getU(), addFileExtension(tm.getV(), ".png"))));

            if (model != null) {
                texturedModels.add(new Tuple<>(model, addFileExtension(textureName, ".png")));
            }

            if (model != null || !texturedModels.isEmpty()) {
                modContext.registerRenderableItem(name, camera,
                        FMLCommonHandler.instance().getSide() == Side.CLIENT ? new StaticModelSourceRenderer(transforms) : null);
            }

            return camera;
        }
    }

    private final Builder builder;
    private final ModContext modContext;
    private final List<Tuple<ModelBase, String>> texturedModels = new ArrayList<>();

    public ItemWirelessCamera(Builder builder, ModContext modContext) {
        this.builder = builder;
        this.modContext = modContext;
        this.maxStackSize = 16;
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
        ItemStack itemStack = player.getHeldItem(hand);

        itemStack.setCount(itemStack.getCount() - 1);

        if (!world.isRemote) {
            if (player != null) {
                player.world.spawnEntity(new EntityWirelessCamera(modContext, world, player, this, builder.duration));
            }
        }

        return new ActionResult<>(EnumActionResult.SUCCESS, itemStack);
    }

    @Override
    public List<Tuple<ModelBase, String>> getTexturedModels() {
        return texturedModels;
    }

    @Override
    public CustomRenderer<?> getPostRenderer() {
        return null;
    }

    public ModelBase getModel() {
        return texturedModels.get(0).getU();
    }

    public String getTextureName() {
        return texturedModels.get(0).getV();
    }
}
