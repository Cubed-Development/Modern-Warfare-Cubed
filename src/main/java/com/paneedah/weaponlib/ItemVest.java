package com.paneedah.weaponlib;

import com.paneedah.mwc.ProjectConstants;
import com.paneedah.mwc.renderer.ModelSourceTransforms;
import com.paneedah.mwc.renderer.StaticModelSourceRenderer;
import com.paneedah.mwc.rendering.Transform;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.crafting.CraftingGroup;
import com.paneedah.weaponlib.crafting.CraftingRegistry;
import com.paneedah.weaponlib.crafting.ICraftingRecipe;
import com.paneedah.weaponlib.render.IHasModel;
import com.paneedah.weaponlib.render.modelrepo.ServerGearModelHookRegistry;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.ISpecialArmor;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import static com.paneedah.mwc.handlers.ClientEventHandler.COOKING_QUEUE;
import static com.paneedah.mwc.ProjectConstants.ID;

public class ItemVest extends Item implements ISpecialArmor, ModelSource, ICraftingRecipe, IHasModel {


    public static class Builder {

        private String name;
        private CreativeTabs tab;
        private ModelBase model;
        private String textureName;
        private final ModelSourceTransforms transforms = ModelSourceTransforms.builder()
                .entityPositioning(() -> new Transform()
                        .withPosition(-0.5F, -1.75F, 0.5F)
                        .withScale(1, 1, 1)
                        .applyTransformations())
                .inventoryPositioning(() -> new Transform()
                        .withPosition(-0.15F, -4.15F, 0.35F)
                        .withRotation(18, -50, 0)
                        .withScale(2.9F, 2.9F, 2.9F)
                        .applyTransformations())
                .build();

        private String modelFileString;
        private String properTextureName;

        private int durability;
        private int damageReduceAmount;
        private double percentDamageBlocked;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withDamageReduceAmount(int damageReduceAmount) {
            this.damageReduceAmount = damageReduceAmount;
            return this;
        }

        public Builder withPercentDamageBlocked(double ratio) {
            this.percentDamageBlocked = ratio;
            return this;
        }

        public Builder withDurability(int durability) {
            this.durability = durability;
            return this;
        }

        public Builder withTab(CreativeTabs tab) {
            this.tab = tab;
            return this;
        }


        public Builder withProperModel(String elModel, String properTextureName) {

            modelFileString = elModel;
            this.properTextureName = properTextureName;


            return this;
        }

        public Builder withModel(ModelBase model) {
            this.model = model;
            return this;
        }

//        public Builder withGuiTextureName(String guiTextureName) {
//            this.guiTextureName = guiTextureName;
//            return this;
//        }

//        public Builder withGuiTextureWidth(int guiTextureWidth) {
//            this.guiTextureWidth = guiTextureWidth;
//            return this;
//        }

        public Builder withModelTextureName(String textureName) {
            this.textureName = textureName;
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

        public Builder withCustomEquippedPositioning(Runnable customEquippedPositioning) {
            transforms.setCustomEquippedPositioning(customEquippedPositioning);
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

        public ItemVest build(ModContext modContext) {
            if (name == null) {
                throw new IllegalStateException("ItemVest name not set");
            }

            ItemVest item = new ItemVest(modContext, percentDamageBlocked, durability);

            // Register model and texture for the item
            ServerGearModelHookRegistry.modelArray.add(this.modelFileString);
            item.modelFileString = this.modelFileString;
            item.textureName = this.properTextureName;
            item.setTranslationKey(ID + "_" + name);

            // Register crafting hook for the item
            CraftingRegistry.registerHook(item);

            // Register the model for the client side, if applicable
            if (this.modelFileString != null && !FMLCommonHandler.instance().getSide().isServer()) {
                try {
                    ModelBase baseModel = (ModelBase) Class.forName(this.modelFileString).newInstance();
                    item.texturedModels.add(new Tuple<>(baseModel, addFileExtension(this.properTextureName, ".png")));
                } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
                    ProjectConstants.LOGGER.info("Error loading model for: " + this.modelFileString);
                    e.printStackTrace();
                }
            }

            // Add additional model if specified
            if (model != null) {
                item.texturedModels.add(new Tuple<>(model, addFileExtension(textureName, ".png")));
            }


            // Set creative tab if provided
            if (tab != null) {
                item.setCreativeTab(tab);
            }

            // Register the item with the mod context as renderable
            modContext.registerRenderableItem(
                    name,
                    item,
                    FMLCommonHandler.instance().getSide() == Side.CLIENT ? new StaticModelSourceRenderer(transforms) : null
            );

            // Queue item for client-side processing if on client side
            if (FMLCommonHandler.instance().getSide().isClient()) {
                COOKING_QUEUE.add(item);
            }

            return item;
        }
    }


    private final List<Tuple<ModelBase, String>> texturedModels = new ArrayList<>();
    private int size;
    private final int damageReduceAmount;

    private final int durability;
    private final double percentDamageBlocked;


    // Modern crafting setup
    private CraftingEntry[] modernRecipe;
    private CraftingGroup craftGroup;


    public ModelBiped model;
    public String modelFileString;
    public String textureName;

    public String getModelFileString() {
        return this.modelFileString;
    }

    public String getTextureName() {
        return this.textureName;
    }


    public ItemVest(ModContext context, double percentDamageBlocked, int durability) {
        this.percentDamageBlocked = percentDamageBlocked;
        this.damageReduceAmount = 1;
        this.durability = durability;
    }

    @Override
    public void addInformation(ItemStack itemStack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add(TextFormatting.GREEN + "Damage Blocked: " + TextFormatting.GRAY + Math.round(percentDamageBlocked * 100) + "%");
    }

    @Override
    public int getMaxItemUseDuration(ItemStack stack) {
        return 1; // return any value greater than zero
    }

    @Override
    public List<Tuple<ModelBase, String>> getTexturedModels() {
        return texturedModels;
    }

    @Override
    public CustomRenderer<?> getPostRenderer() {
        return null;
    }

    public double getDamageBlocked() {
        return this.percentDamageBlocked;
    }

    public int getSize() {
        return size;
    }

//    public ResourceLocation getGuiTextureLocation() {
//        return guiTextureLocation;
//    }

    private static String addFileExtension(String s, String ext) {
        return s != null && !s.endsWith(ext) ? s + ext : s;
    }

    @Override
    public ArmorProperties getProperties(EntityLivingBase player, ItemStack vestStack, DamageSource source, double damage, int slot) {
        //this.percentDamageBlocked = 1.0;
        return new ArmorProperties(0, this.percentDamageBlocked, 2000);
    }

    @Override
    public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot) {

        return (int) (this.percentDamageBlocked * 10);
    }

    @Override
    public void damageArmor(EntityLivingBase entity, ItemStack stack, DamageSource source, int damage, int slot) {

        //double absorb = damage * percentDamageBlocked;
        //int itemDamage = (int)(absorb / 25.0 < 1 ? 1 : absorb / 25.0F);
        //stack.damageItem(itemDamage, entity);
    }


    @Override
    public CraftingEntry[] getCraftingRecipe() {
        return this.modernRecipe;
    }


    @Override
    public ItemStack getOutput() {
        return new ItemStack(this);
    }


    @Override
    public CraftingGroup getCraftingGroup() {
        return this.craftGroup;
    }


    @Override
    public void setCraftingRecipe(CraftingEntry[] craftingRecipe) {
        this.modernRecipe = craftingRecipe;
    }


    @Override
    public void setCraftingGroup(CraftingGroup group) {
        this.craftGroup = group;
    }

    @Override
    public void registerModels() {


    }
}
