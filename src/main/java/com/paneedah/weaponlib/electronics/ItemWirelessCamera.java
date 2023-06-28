package com.paneedah.weaponlib.electronics;

import com.paneedah.mwc.utils.ModReference;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.crafting.CraftingComplexity;
import com.paneedah.weaponlib.crafting.OptionsMetadata;
import net.minecraft.client.model.ModelBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.oredict.ShapedOreRecipe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ItemWirelessCamera extends Item implements ModelSource {

    public static final long DEFAULT_DURATION = 300 * 1000;

    public static class Builder {

        protected String name;
        protected ModelBase model;
        protected String textureName;
        protected Consumer<ItemStack> entityPositioning;
        protected Consumer<ItemStack> inventoryPositioning;
        protected BiConsumer<EntityPlayer, ItemStack> thirdPersonPositioning;
        protected BiConsumer<EntityPlayer, ItemStack> firstPersonPositioning;
        protected BiConsumer<ModelBase, ItemStack> firstPersonModelPositioning;
        protected BiConsumer<ModelBase, ItemStack> thirdPersonModelPositioning;
        protected BiConsumer<ModelBase, ItemStack> inventoryModelPositioning;
        protected BiConsumer<ModelBase, ItemStack> entityModelPositioning;

        protected Consumer<RenderContext<RenderableState>> firstPersonLeftHandPositioning;
        protected Consumer<RenderContext<RenderableState>> firstPersonRightHandPositioning;

        protected CreativeTabs tab;
        protected AttachmentCategory attachmentCategory;
        private List<Tuple<ModelBase, String>> texturedModels = new ArrayList<>();
        private int maxStackSize = 1;

        private CraftingComplexity craftingComplexity;

        private Object[] craftingMaterials;

        private int craftingCount = 1;

        private long duration = DEFAULT_DURATION;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withCreativeTab(CreativeTabs tab) {
            this.tab = tab;
            return this;
        }

        public Builder withModel(ModelBase model) {
            this.model = model;
            return this;
        }

        public Builder withTextureName(String textureName) {
            this.textureName = textureName.toLowerCase();
            return this;
        }

        public Builder withMaxStackSize(int maxStackSize) {
            this.maxStackSize = maxStackSize;
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

        public  Builder withThirdPersonPositioning(BiConsumer<EntityPlayer, ItemStack> thirdPersonPositioning) {
            this.thirdPersonPositioning = thirdPersonPositioning;
            return this;
        }

        public Builder withFirstPersonPositioning(BiConsumer<EntityPlayer, ItemStack> firstPersonPositioning) {
            this.firstPersonPositioning = firstPersonPositioning;
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

        public Builder withFirstPersonHandPositioning(
                Consumer<RenderContext<RenderableState>> leftHand,
                Consumer<RenderContext<RenderableState>> rightHand)
        {
            this.firstPersonLeftHandPositioning = leftHand;
            this.firstPersonRightHandPositioning = rightHand;
            return this;
        }

        public Builder withModel(ModelBase model, String textureName) {
            this.texturedModels.add(new Tuple<>(model, textureName.toLowerCase()));
            return this;
        }

        public Builder withCrafting(CraftingComplexity craftingComplexity, Object...craftingMaterials) {
            return withCrafting(1, craftingComplexity, craftingMaterials);
        }

        public Builder withCrafting(int craftingCount, CraftingComplexity craftingComplexity, Object...craftingMaterials) {
            if(craftingComplexity == null) {
                throw new IllegalArgumentException("Crafting complexity not set");
            }
            if(craftingMaterials.length < 2) {
                throw new IllegalArgumentException("2 or more materials required for crafting");
            }
            if(craftingCount == 0) {
                throw new IllegalArgumentException("Invalid item count");
            }
            this.craftingComplexity = craftingComplexity;
            this.craftingMaterials = craftingMaterials;
            this.craftingCount = craftingCount;
            return this;
        }

        public Builder withDuration(long duration) {
            this.duration = duration;
            return this;
        }

        public ItemWirelessCamera build(ModContext modContext) {

            ItemWirelessCamera camera = new ItemWirelessCamera(this, modContext);
            camera.setTranslationKey(ModReference.ID + "_" + name);
            camera.setCreativeTab(tab);
//            camera.setPostRenderer(postRenderer);
//            camera.setName(name);
            camera.maxStackSize = maxStackSize;

//            if(textureName != null) {
//                camera.textureName = ModReference.id + ":" + stripFileExtension(textureName, ".png");
//            }

            texturedModels.forEach(tm -> camera.texturedModels.add(new Tuple<>(tm.getU(), addFileExtension(tm.getV(), ".png"))));

            if(model != null) {
                texturedModels.add(new Tuple<>(model, addFileExtension(textureName, ".png")));
            }

            if(model != null || !texturedModels.isEmpty()) {
                modContext.registerRenderableItem(name, camera, FMLCommonHandler.instance().getSide() == Side.CLIENT ? registerRenderer(camera, modContext) : null);
            }

            if(craftingComplexity != null) {
                OptionsMetadata optionsMetadata = new OptionsMetadata.OptionMetadataBuilder()
                    .withSlotCount(9)
                    .build(craftingComplexity, Arrays.copyOf(craftingMaterials, craftingMaterials.length));

                List<Object> shape = modContext.getRecipeManager().createShapedRecipe(camera, name, optionsMetadata);

                ItemStack itemStack = new ItemStack(camera);
                itemStack.setCount(craftingCount);
                if(optionsMetadata.hasOres()) {
                    ForgeRegistries.RECIPES.register(new ShapedOreRecipe(null, itemStack, shape.toArray()).setMirrored(false).setRegistryName(ModReference.ID, itemStack.getItem().getTranslationKey() + "_recipe") /*TODO: temporary hack*/);
                } else {
                    ForgeRegistries.RECIPES.register(new ShapedOreRecipe(null, itemStack, shape.toArray()).setMirrored(false).setRegistryName(ModReference.ID, itemStack.getItem().getTranslationKey() + "_recipe"));
                }
            }

            return camera;
        }


        static String addFileExtension(String s, String ext) {
            return s != null && !s.endsWith(ext) ? s + ext : s;
        }

        protected static String stripFileExtension(String str, String extension) {
            return str.endsWith(extension) ? str.substring(0, str.length() - extension.length()) : str;
        }

        private Object registerRenderer(ItemWirelessCamera camera, ModContext modContext) {
            return new StaticModelSourceRenderer.Builder()
            .withEntityPositioning(entityPositioning)
            .withFirstPersonPositioning(firstPersonPositioning)
            .withThirdPersonPositioning(thirdPersonPositioning)
            .withInventoryPositioning(inventoryPositioning)
            .withEntityModelPositioning(entityModelPositioning)
            .withFirstPersonModelPositioning(firstPersonModelPositioning)
            .withThirdPersonModelPositioning(thirdPersonModelPositioning)
            .withInventoryModelPositioning(inventoryModelPositioning)
            .withFirstPersonHandPositioning(firstPersonLeftHandPositioning, firstPersonRightHandPositioning)
            .withModContext(modContext)
            .build();
        }
    }

    private Builder builder;
    private ModContext modContext;
    private List<Tuple<ModelBase, String>> texturedModels = new ArrayList<>();

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
            if(player != null)
                player.world.spawnEntity(new EntityWirelessCamera(modContext, world, player, this, builder.duration));
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
