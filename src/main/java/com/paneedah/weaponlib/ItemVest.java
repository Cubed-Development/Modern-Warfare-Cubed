package com.paneedah.weaponlib;

import com.paneedah.mwc.renderer.ModelSourceTransforms;
import com.paneedah.mwc.renderer.StaticModelSourceRenderer;
import com.paneedah.weaponlib.animation.Transform;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.crafting.CraftingGroup;
import com.paneedah.weaponlib.crafting.CraftingRegistry;
import com.paneedah.weaponlib.crafting.IModernCraftingRecipe;
import com.paneedah.weaponlib.render.IHasModel;
import com.paneedah.weaponlib.render.modelrepo.ServerGearModelHookRegistry;
import lombok.Getter;
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

public class ItemVest extends Item implements ISpecialArmor, ModelSource, IModernCraftingRecipe, IHasModel {


    public static class Builder {

        private String name;
        private CreativeTabs tab;
        private ModelBase model;
        private String textureName;
        private final ModelSourceTransforms transforms = ModelSourceTransforms.builder()
                .entityPositioning(() -> new Transform()
                        .withPosition(-0.5F, -1.75F, 0.5F)
                        .withScale(1, 1, 1)
                        .doGLDirect())
                .inventoryPositioning(() -> new Transform()
                        .withPosition(-0.15, -4.15, 0.35)
                        .withRotation(18, -50, 0)
                        .withScale(2.9, 2.9, 2.9)
                        .doGLDirect())
                .build();

        private String modelFileString;
        private String properTextureName;

        private int durability;
        private double percentDamageBlocked;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withDamageReduceAmount(int damageReduceAmount) {
            return this;
        }

        public Builder withPercentDamageBlocked(double ratio) {
            percentDamageBlocked = ratio;
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
                throw new IllegalStateException("ItemBackpack name not set");
            }


            ItemVest item = new ItemVest(modContext, percentDamageBlocked, durability);


            ServerGearModelHookRegistry.modelArray.add(modelFileString);

            item.modelFileString = modelFileString;
            item.textureName = properTextureName;
            item.setTranslationKey(ID + "_" + name);

            // Register hook
            CraftingRegistry.registerHook(item);


            if (modelFileString != null && !FMLCommonHandler.instance().getSide().isServer()) {

                try {
                    //System.out.println("FOR ITEM: " + item.getRegistryName() + " | ");
                    ModelBase base = (ModelBase) Class.forName(modelFileString).newInstance();
                    item.texturedModels.add(new Tuple<>(base, addFileExtension(properTextureName, ".png")));


                } catch (InstantiationException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }


            }

            if (model != null) {
                item.texturedModels.add(new Tuple<>(model, addFileExtension(textureName, ".png")));
            }


            if (tab != null) {
                item.setCreativeTab(tab);


            }

            // lientEventHandler.ITEM_REG.add(item);

            modContext.registerRenderableItem(name, item, FMLCommonHandler.instance().getSide() == Side.CLIENT ? new StaticModelSourceRenderer(transforms) : null);

            if (FMLCommonHandler.instance().getSide().isClient()) {
                COOKING_QUEUE.add(item);
            }

            return item;
        }
    }


    private final List<Tuple<ModelBase, String>> texturedModels = new ArrayList<>();
    @Getter
    private int size;

    private final double percentDamageBlocked;


    // Modern crafting setup
    private CraftingEntry[] modernRecipe;
    private CraftingGroup craftGroup;


    public ModelBiped model;
    @Getter
    public String modelFileString;
    @Getter
    public String textureName;


    public ItemVest(ModContext context, double percentDamageBlocked, int durability) {
        this.percentDamageBlocked = percentDamageBlocked;
        int damageReduceAmount = 1;
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
        return percentDamageBlocked;
    }

    private static String addFileExtension(String s, String ext) {
        return s != null && !s.endsWith(ext) ? s + ext : s;
    }

    @Override
    public ArmorProperties getProperties(EntityLivingBase player, ItemStack vestStack, DamageSource source, double damage, int slot) {
        //this.percentDamageBlocked = 1.0;
        return new ArmorProperties(0, percentDamageBlocked, 2000);
    }

    @Override
    public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot) {

        return (int) (percentDamageBlocked * 10);
    }

    @Override
    public void damageArmor(EntityLivingBase entity, ItemStack stack, DamageSource source, int damage, int slot) {

    }


    @Override
    public CraftingEntry[] getModernRecipe() {
        return modernRecipe;
    }


    @Override
    public ItemStack getItemStack() {
        return new ItemStack(this);
    }


    @Override
    public CraftingGroup getCraftingGroup() {
        return craftGroup;
    }


    @Override
    public void setCraftingRecipe(CraftingEntry[] recipe) {
        modernRecipe = recipe;
    }


    @Override
    public void setCraftingGroup(CraftingGroup group) {
        craftGroup = group;
    }

    @Override
    public void registerModels() {


    }
}
