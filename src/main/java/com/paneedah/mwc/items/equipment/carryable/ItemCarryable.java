package com.paneedah.mwc.items.equipment.carryable;

import com.paneedah.mwc.rendering.IEquipmentModelSource;
import com.paneedah.mwc.rendering.ModelSourceTransforms;
import com.paneedah.weaponlib.Weapon;
import com.paneedah.weaponlib.config.BalancePackManager;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.crafting.CraftingGroup;
import com.paneedah.weaponlib.crafting.IModernCrafting;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import java.util.List;
import java.util.function.Predicate;

import static com.paneedah.mwc.utils.ModReference.RED_LOG;

public class ItemCarryable extends Item implements IEquipmentModelSource, IModernCrafting {

    public abstract static class Builder<T extends Builder<T>> {

        protected static final int DEFAULT_GUI_TEXTURE_WIDTH = 176;

        protected static String subPath = "";

        protected String name;
        protected String modelName;
        protected String textureName;
        protected ModelSourceTransforms transforms = ModelSourceTransforms.builder().build();

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
         *
         * @return Returns the Builder instance for method chaining
         */
        public T withValidItemPredicate(Predicate<Item> validItemPredicate) {
            this.validItemPredicate = validItemPredicate;
            return self();
        }

        public T withModel(String model) {
            this.modelName = "com.paneedah.mwc.models.equipments." + subPath + model;
            return self();
        }

        public T withTexture(String textureName) {
            this.textureName = addFileExtension(textureName, ".png");
            return self();
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
        }

        protected abstract T self();

        public abstract ItemCarryable build();
    }

    protected int size;
    protected ResourceLocation guiTextureLocation;
    protected int guiTextureWidth;
    protected Predicate<Item> validItemPredicate;

    protected Runnable customEquippedPositioning;

    // Modern crafting setup
    protected CraftingEntry[] modernRecipe;
    protected CraftingGroup craftGroup;

    public Runnable getCustomEquippedPositioning() {
        return customEquippedPositioning;
    }

    private final String modelName;
    private final String textureName;

    public ItemCarryable(int size, Predicate<Item> validItemPredicate, ResourceLocation guiTextureLocation, int guiTextureWidth, String modelName, String textureName) {
        this.validItemPredicate = validItemPredicate;
        this.size = size;
        this.guiTextureLocation = guiTextureLocation;
        this.guiTextureWidth = guiTextureWidth;
        this.modelName = modelName;
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

    @Override
    public String getModelName() {
        return modelName;
    }

    @Override
    public String getTextureName() {
        return textureName;
    }
}
