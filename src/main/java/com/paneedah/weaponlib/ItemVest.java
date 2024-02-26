package com.paneedah.weaponlib;

import com.paneedah.mwc.rendering.IModelSource;
import com.paneedah.mwc.rendering.ModelSourceTransforms;
import com.paneedah.mwc.rendering.renderer.StaticModelSourceRenderer;
import com.paneedah.mwc.rendering.TexturedModel;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.crafting.CraftingGroup;
import com.paneedah.weaponlib.crafting.CraftingRegistry;
import com.paneedah.weaponlib.crafting.IModernCraftingRecipe;
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

import static com.paneedah.mwc.utils.ModReference.ID;

public class ItemVest extends Item implements ISpecialArmor, IModelSource, IModernCraftingRecipe, IHasModel {

    public static class Builder {

        private String name;
        private CreativeTabs tab;
        private ModelBase model;
        private String textureName;
        private ModelSourceTransforms.ModelSourceTransformsBuilder transforms = ModelSourceTransforms.builder();
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

        public ItemVest build(ModContext modContext) {
            if (name == null) {
                throw new IllegalStateException("ItemBackpack name not set");
            }

//            if(size <= 0) {
//                throw new IllegalStateException("ItemBackpack size must be greater than 0");
//            }

//            if(guiTextureName == null) {
//                throw new IllegalStateException("ItemBackpack gui texture not set");
//            }
//            
//            if(!guiTextureName.startsWith("textures/gui/")) {
//                guiTextureName = "textures/gui/" + guiTextureName;
//            }
//            ResourceLocation guiTextureLocation = new ResourceLocation(addFileExtension(guiTextureName, ".png"));


            ItemVest item = new ItemVest(modContext, percentDamageBlocked, durability);


            ServerGearModelHookRegistry.modelArray.add(this.modelFileString);

            item.modelFileString = this.modelFileString;
            item.textureName = this.properTextureName;
            item.setTranslationKey(ID + "_" + name);

            // Register hook
            CraftingRegistry.registerHook(item);


            if (this.modelFileString != null && !FMLCommonHandler.instance().getSide().isServer()) {
                try {
                    ModelBase base = (ModelBase) Class.forName(this.modelFileString).newInstance();
                    item.texturedModels.add(new TexturedModel(base, addFileExtension(this.properTextureName, ".png")));
                } catch (InstantiationException | IllegalAccessException | ClassNotFoundException exception) {
                    exception.printStackTrace();
                }
            }

            if (model != null)
                item.texturedModels.add(new TexturedModel(model, addFileExtension(textureName, ".png")));

            if (tab != null)
                item.setCreativeTab(tab);

            // lientEventHandler.ITEM_REG.add(item);

            modContext.registerRenderableItem(name, item, FMLCommonHandler.instance().getSide() == Side.CLIENT ? new StaticModelSourceRenderer(transforms.build()) : null);

            return item;
        }
    }


    private List<TexturedModel> texturedModels = new ArrayList<>();
    private int size;
    private final int damageReduceAmount;

    private int durability;
    private double percentDamageBlocked;


    // Modern crafting setup
    private CraftingEntry[] modernRecipe;
    private CraftingGroup craftGroup;


    public ModelBiped model;
    private String modelFileString;
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
        super.addInformation(itemStack, worldIn, tooltip, flagIn);
        double formattedDouble = Math.round(this.percentDamageBlocked * 10000) / 100.0;
        tooltip.add(String.format("%sDamage Blocked: %s%s%%", TextFormatting.GREEN, TextFormatting.GRAY, formattedDouble));
    }

    @Override
    public int getMaxItemUseDuration(ItemStack stack) {
        return 1; // return any value greater than zero
    }

    @Override
    public List<TexturedModel> getTexturedModels() {
        return texturedModels;
    }

    @Override
    public CustomRenderer<RenderableState> getPostRenderer() {
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
        //int itemDamage = (int)(absorb / 25.0 < 1 ? 1 : absorb / 25.0);
        //stack.damageItem(itemDamage, entity);
    }


    @Override
    public CraftingEntry[] getModernRecipe() {
        return this.modernRecipe;
    }


    @Override
    public ItemStack getItemStack() {
        return new ItemStack(this);
    }


    @Override
    public CraftingGroup getCraftingGroup() {
        return this.craftGroup;
    }


    @Override
    public void setCraftingRecipe(CraftingEntry[] recipe) {
        this.modernRecipe = recipe;
    }


    @Override
    public void setCraftingGroup(CraftingGroup group) {
        this.craftGroup = group;
    }

    @Override
    public void registerModels() {


    }
}
