package com.paneedah.mwc.items.equipment.carryable;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.equipment.belts.MagazineBelt;
import com.paneedah.mwc.utils.LangUtil;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.Transform;
import com.paneedah.weaponlib.config.BalancePackManager;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.crafting.CraftingGroup;
import com.paneedah.weaponlib.crafting.CraftingRegistry;
import com.paneedah.weaponlib.crafting.IModernCrafting;
import com.paneedah.weaponlib.render.IHasModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.ModelLoaderRegistry;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

import static com.paneedah.mwc.utils.ModReference.RED_LOG;

public class ItemCarryable extends Item implements IModernCrafting {

    public abstract static class Builder<T extends Builder<T>> {

        protected static final int DEFAULT_GUI_TEXTURE_WIDTH = 176;

        protected String name;
        protected ModelBiped model;
        protected String textureName;

        protected Consumer<ItemStack> entityPositioning;
        protected Consumer<ItemStack> inventoryPositioning;
        protected BiConsumer<EntityPlayer, ItemStack> thirdPersonPositioning;
        protected BiConsumer<EntityPlayer, ItemStack> customEquippedPositioning;
        protected BiConsumer<EntityPlayer, ItemStack> firstPersonPositioning;
        protected BiConsumer<ModelBase, ItemStack> firstPersonModelPositioning;
        protected BiConsumer<ModelBase, ItemStack> thirdPersonModelPositioning;
        protected BiConsumer<ModelBase, ItemStack> inventoryModelPositioning;
        protected BiConsumer<ModelBase, ItemStack> entityModelPositioning;
        protected Consumer<RenderContext<RenderableState>> firstPersonLeftHandPositioning;
        protected Consumer<RenderContext<RenderableState>> firstPersonRightHandPositioning;
        protected int size;
        protected int guiTextureWidth = DEFAULT_GUI_TEXTURE_WIDTH;

        protected Predicate<Item> validItemPredicate = item -> !(item instanceof Weapon) || (((Weapon) item).getConfigurationGroup() == BalancePackManager.GunConfigurationGroup.HANDGUN);

        public T withName(String name) {
            this.name = name;
            return self();
        }

        public T withSize(int size) {
            this.size = size;
            return self();
        }

        /**
         * Sets a Predicate to filter items that can be stored in the inventory.
         * <p>
         * This Predicate can be tailored based on item type or specific items, enabling fine-grained control over what can be carried.
         *
         * <p>
         * <b>Type-based Filtering:</b> Can be used to filter items based on their types.
         *
         * <ul>
         * <li> Allow a specific type: {@code item -> item instanceof SpecificType}
         * <li> Exclude a specific type: {@code item -> !(item instanceof SpecificType)}
         * <li> Allow multiple types: {@code item -> item instanceof SpecificType1 || item instanceof SpecificType2}
         * <li> Exclude multiple types: {@code item -> !(item instanceof SpecificType1 || item instanceof SpecificType2)}
         * <li> Allow one type but exclude another: {@code item -> item instanceof SpecificType1 && !(item instanceof SpecificType2)}
         * </ul>
         * In a game context, the 'instanceof' operator could be applied to classes like ItemAmmo, Weapon, Armor, etc.
         *
         * <p>
         * <b>Item-based Filtering:</b> Can be used to filter specific items, irrespective of their types.
         *
         * <ul>
         * <li> Allow a specific item: {@code item -> item == specificItem}
         * <li> Exclude a specific item: {@code item -> item != specificItem}
         * <li> Allow multiple items: {@code item -> item == specificItem1 || item == specificItem2}
         * <li> Exclude multiple items: {@code item -> item != specificItem1 && item != specificItem2}
         * <li> Allow one item but exclude another: {@code item -> item == specificItem1 && item != specificItem2}
         * </ul>
         *
         * <p>
         * <b>Combined Filtering:</b> Can be used to combine the type and item-based filtering.
         *
         * <ul>
         * <li> Allow a type and a specific item: {@code item -> item instanceof SpecificType && item == specificItem}
         * <li> Allow a type but exclude an item: {@code item -> item instanceof SpecificType && item != specificItem}
         * <li> Exclude a type and a specific item: {@code item -> !(item instanceof SpecificType) && item != specificItem}
         * <li> Allow multiple types or items: {@code item -> (item instanceof SpecificType1 || item instanceof SpecificType2) || (item == specificItem1 || item == specificItem2)}
         * <li> Exclude multiple types or items: {@code item -> !(item instanceof SpecificType1 || item instanceof SpecificType2) && item != specificItem1 && item != specificItem2}
         * <li> Allow a type but exclude another type and a specific item: {@code item -> item instanceof SpecificType1 && !(item instanceof SpecificType2) && item != specificItem}
         * </ul>
         * <p>
         * This method is particularly useful when there's a need to strictly control the types or specific items in an inventory.
         *
         * @param validItemPredicate The Predicate function that defines the criteria for item validity
         * @return Returns the Builder instance for method chaining
         */
        public T withValidItemPredicate(Predicate<Item> validItemPredicate) {
            this.validItemPredicate = validItemPredicate;
            return self();
        }

        public T withModel(ModelBiped model) {
            this.model = model;
            return self();
        }

        public T withTexture(String textureName) {
            this.textureName = addFileExtension(textureName, ".png");
            return self();
        }

        public T withEntityPositioning(Consumer<ItemStack> entityPositioning) {
            this.entityPositioning = entityPositioning;
            return self();
        }

        public T withInventoryPositioning(Consumer<ItemStack> inventoryPositioning) {
            this.inventoryPositioning = inventoryPositioning;
            return self();
        }

        public T withThirdPersonPositioning(BiConsumer<EntityPlayer, ItemStack> thirdPersonPositioning) {
            this.thirdPersonPositioning = thirdPersonPositioning;
            return self();
        }

        public T withCustomEquippedPositioning(BiConsumer<EntityPlayer, ItemStack> customEquippedPositioning) {
            this.customEquippedPositioning = customEquippedPositioning;
            return self();
        }

        public T withFirstPersonPositioning(BiConsumer<EntityPlayer, ItemStack> firstPersonPositioning) {
            this.firstPersonPositioning = firstPersonPositioning;
            return self();
        }

        public T withFirstPersonModelPositioning(BiConsumer<ModelBase, ItemStack> firstPersonModelPositioning) {
            this.firstPersonModelPositioning = firstPersonModelPositioning;
            return self();
        }

        public T withEntityModelPositioning(BiConsumer<ModelBase, ItemStack> entityModelPositioning) {
            this.entityModelPositioning = entityModelPositioning;
            return self();
        }

        public T withInventoryModelPositioning(BiConsumer<ModelBase, ItemStack> inventoryModelPositioning) {
            this.inventoryModelPositioning = inventoryModelPositioning;
            return self();
        }

        public T withThirdPersonModelPositioning(BiConsumer<ModelBase, ItemStack> thirdPersonModelPositioning) {
            this.thirdPersonModelPositioning = thirdPersonModelPositioning;
            return self();
        }

        public T withFirstPersonHandPositioning(
                Consumer<RenderContext<RenderableState>> leftHand,
                Consumer<RenderContext<RenderableState>> rightHand) {
            this.firstPersonLeftHandPositioning = leftHand;
            this.firstPersonRightHandPositioning = rightHand;
            return self();
        }

        protected static class RendererRegistrationHelper {
            protected static Object registerRenderer(Builder builder) {
                return new StaticModelSourceRenderer.Builder()
                        .withHiddenInventory(false)
                        .withEntityPositioning(builder.entityPositioning)
                        .withFirstPersonPositioning(builder.firstPersonPositioning)
                        .withThirdPersonPositioning(builder.thirdPersonPositioning)
                        .withCustomEquippedPositioning(builder.customEquippedPositioning)
                        .withInventoryPositioning(builder.inventoryPositioning != null ? builder.inventoryPositioning : stack -> new Transform().withPosition(-0.15, -4.15, 0.35).withRotation(18, -50, 0).withScale(2.9, 2.9, 2.9).doGLDirect())
                        .withEntityModelPositioning(builder.entityModelPositioning != null? builder.entityModelPositioning : (modelBase, itemStack) -> new Transform().withPosition(-5.3, -0.20, -1.25).withRotation(0, -150, -90).withScale(3.8, 3.8, 3.8).doGLDirect())
                        .withFirstPersonModelPositioning(builder.firstPersonModelPositioning)
                        .withThirdPersonModelPositioning(builder.thirdPersonModelPositioning)
                        .withInventoryModelPositioning(builder.inventoryModelPositioning)
                        .withFirstPersonHandPositioning(builder.firstPersonLeftHandPositioning, builder.firstPersonRightHandPositioning)
                        .build();
            }
        }

        protected void validateInput() {
            if (name == null) {
                RED_LOG.printFramedError("Carryable Item", "Carryable Item has no name set", "Non critical exception falling back to 'missing_name'", "At:" + new Throwable().getStackTrace()[3].toString());
                name = "missing_name";
            }

            if (size <= 0) {
                RED_LOG.printFramedError("Carryable Item", name + " size was not greater than 0", "Non critical exception falling back to a size of 8", "At:" + new Throwable().getStackTrace()[3].toString());
                size = 8;
            }

            if (model == null)
                RED_LOG.printFramedError("Carryable Item", name + " model was not set", "Non critical exception model will not be rendered", "At:" + new Throwable().getStackTrace()[3].toString());
        }

        protected abstract T self();

        public abstract ItemCarryable build();
    }

    protected int size;
    protected ResourceLocation guiTextureLocation;
    protected int guiTextureWidth;
    protected Predicate<Item> validItemPredicate;

    protected BiConsumer<EntityPlayer, ItemStack> customEquippedPositioning;

    // Modern crafting setup
    protected CraftingEntry[] modernRecipe;
    protected CraftingGroup craftGroup;

    public BiConsumer<EntityPlayer, ItemStack> getCustomEquippedPositioning() {
        return customEquippedPositioning;
    }

    public final ModelBiped model;
    public final String textureName;

    public ItemCarryable(int size, Predicate<Item> validItemPredicate, ResourceLocation guiTextureLocation, int guiTextureWidth, ModelBiped model, String textureName) {
        this.validItemPredicate = validItemPredicate;
        this.size = size;
        this.guiTextureLocation = guiTextureLocation;
        this.guiTextureWidth = guiTextureWidth;
        this.model = model;
        this.textureName = textureName;
    }

    // Without this method, your inventory will NOT work!!!
    @Override
    public int getMaxItemUseDuration(ItemStack stack) {
        return 1; // return any value greater than zero
    }

//    protected ItemStack onCompatibleItemRightClick(ItemStack itemStack, World world, EntityPlayer player, boolean mainHand) {
//        if (!world.isRemote) {
//            // If player not sneaking, open the inventory gui
//            if (!player.isSneaking()) {
//                player.openGui(context.getMod(), GuiHandler.STORAGE_ITEM_INVENTORY_GUI_ID, world, 0, 0, 0);
//            }
//        }
//        return itemStack;
//    }

//    @SideOnly(Side.CLIENT)
//    public void registerIcons(IIconRegister iconRegister) {
//        this.itemIcon = iconRegister.registerIcon(this.getIconString());
//    }

    public int getSize() {
        return size;
    }

    @Override
    public void addInformation(ItemStack itemStack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        super.addInformation(itemStack, worldIn, tooltip, flagIn);
        tooltip.add(String.format("%sSize:%s %d", TextFormatting.GREEN, TextFormatting.GRAY, this.size));
    }

    public ResourceLocation getGuiTextureLocation() {
        return guiTextureLocation;
    }

    private static String addFileExtension(String s, String ext) {
        return s != null && !s.endsWith(ext) ? s + ext : s;
    }

    public int getGuiTextureWidth() {
        return guiTextureWidth;
    }

    public Predicate<Item> getValidItemPredicate() {
        return validItemPredicate;
    }

    @Override
    public CraftingEntry[] getModernRecipe() {
        return this.modernRecipe;
    }

    @Override
    public Item getItem() {
        return this;
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
}
