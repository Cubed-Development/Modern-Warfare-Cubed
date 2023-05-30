package com.paneedah.weaponlib;

import com.paneedah.mwc.utils.ModReference;
import com.paneedah.weaponlib.animation.Transform;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.crafting.CraftingGroup;
import com.paneedah.weaponlib.crafting.CraftingRegistry;
import com.paneedah.weaponlib.crafting.IModernCrafting;
import com.paneedah.weaponlib.jim.util.VMWHooksHandler;
import com.paneedah.weaponlib.render.modelrepo.ServerGearModelHookRegistry;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ItemStorage extends Item implements ModelSource, IModernCrafting {
    
    public static class Builder {
        
        private static final int DEFAULT_GUI_TEXTURE_WIDTH = 176;
        
        private String name;
        private CreativeTabs tab;
        private ModelBase model;
        private String textureName;
        
        private Consumer<ItemStack> entityPositioning;
        private Consumer<ItemStack> inventoryPositioning;
        private BiConsumer<EntityPlayer, ItemStack> thirdPersonPositioning;
        private BiConsumer<EntityPlayer, ItemStack> customEquippedPositioning;
        private BiConsumer<EntityPlayer, ItemStack> firstPersonPositioning;
        private BiConsumer<ModelBase, ItemStack> firstPersonModelPositioning;
        private BiConsumer<ModelBase, ItemStack> thirdPersonModelPositioning;
        private BiConsumer<ModelBase, ItemStack> inventoryModelPositioning;
        private BiConsumer<ModelBase, ItemStack> entityModelPositioning;
        private Consumer<RenderContext<RenderableState>> firstPersonLeftHandPositioning;
        private Consumer<RenderContext<RenderableState>> firstPersonRightHandPositioning;
        private int size;
        private int guiTextureWidth = DEFAULT_GUI_TEXTURE_WIDTH;
        
        private String modelFileString;
        private String properTextureName;
        
        
        private Predicate<Item> validItemPredicate = item -> true;
        
        public Builder withName(String name) {
            this.name = name;
            return this;
        }
        
        public Builder withSize(int size) {
            this.size = size;
            return this;
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
         *
         * This method is particularly useful when there's a need to strictly control the types or specific items in an inventory.
         *
         * @param validItemPredicate The Predicate function that defines the criteria for item validity
         * @return Returns the Builder instance for method chaining
         */
        public Builder withValidItemPredicate(Predicate<Item> validItemPredicate) {
            this.validItemPredicate = validItemPredicate;
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
        
        public  Builder withCustomEquippedPositioning(BiConsumer<EntityPlayer, ItemStack> customEquippedPositioning) {
            this.customEquippedPositioning = customEquippedPositioning;
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

        private static class RendererRegistrationHelper {
            private static Object registerRenderer(Builder builder, ModContext modContext) {
                return new StaticModelSourceRenderer.Builder()
                .withHiddenInventory(builder.tab == null)
                .withEntityPositioning(builder.entityPositioning)
                .withFirstPersonPositioning(builder.firstPersonPositioning)
                .withThirdPersonPositioning(builder.thirdPersonPositioning)
                .withCustomEquippedPositioning(builder.customEquippedPositioning)
                .withInventoryPositioning(builder.inventoryPositioning != null ? builder.inventoryPositioning : stack -> new Transform().withPosition(-0.15, -4.15, 0.35).withRotation(18, -50, 0).withScale(2.9, 2.9, 2.9).doGLDirect())
                .withEntityModelPositioning(builder.entityModelPositioning)
                .withFirstPersonModelPositioning(builder.firstPersonModelPositioning)
                .withThirdPersonModelPositioning(builder.thirdPersonModelPositioning)
                .withInventoryModelPositioning(builder.inventoryModelPositioning)
                .withFirstPersonHandPositioning(builder.firstPersonLeftHandPositioning, builder.firstPersonRightHandPositioning)
                .withModContext(modContext)
                .build();
            }
        }
       
        public ItemStorage build(ModContext modContext) {
            if(name == null) {
                throw new IllegalStateException("ItemStorage name not set");
            }
            
            if(size <= 0) {
                throw new IllegalStateException("ItemStorage size must be greater than 0");
            }

            ResourceLocation guiTextureLocation = new ResourceLocation(ModReference.id, "textures/gui/inventory/carryable/" + size + "slots.png");
            
            ItemStorage item = new ItemStorage(modContext, size, validItemPredicate, guiTextureLocation, this.guiTextureWidth);
            
            ServerGearModelHookRegistry.modelArray.add(this.modelFileString);
            
            item.modelFileString = this.modelFileString;
            item.properTextureName = this.properTextureName;
            
            item.setTranslationKey(ModReference.id + "_" + name);

            if(this.modelFileString != null && !VMWHooksHandler.isOnServer()) {
            	
            	try {
            		//System.out.println("FOR ITEM: " + item.getRegistryName() + " | ");
					ModelBase base = (ModelBase) Class.forName(this.modelFileString).newInstance();
					item.texturedModels.add(new Tuple<>(base, addFileExtension(this.properTextureName, ".png")));
					
					
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
            
            if(model != null) item.texturedModels.add(new Tuple<>(model, addFileExtension(textureName, ".png")));
            
           
            if(tab != null) item.setCreativeTab(tab);
            
            // Register hook
            CraftingRegistry.registerHook(item);
            
            
            item.customEquippedPositioning = customEquippedPositioning;
            
            modContext.registerRenderableItem(name, item, FMLCommonHandler.instance().getSide() == Side.CLIENT ? RendererRegistrationHelper.registerRenderer(this, modContext) : null);
            
            return item;
        }
    }
    
    
    private List<Tuple<ModelBase, String>> texturedModels = new ArrayList<>();
    private int size;
    private ResourceLocation guiTextureLocation;
    private int guiTextureWidth;
    private Predicate<Item> validItemPredicate;
    
    private BiConsumer<EntityPlayer, ItemStack> customEquippedPositioning;
    
    
 // Modern crafting setup
    private CraftingEntry[] modernRecipe;
	private CraftingGroup craftGroup;

    
    
    public BiConsumer<EntityPlayer, ItemStack> getCustomEquippedPositioning() {
    	return customEquippedPositioning;
    }
    
    private String modelFileString;
    private String properTextureName;
    
    public String getModelFileString() {
    	return this.modelFileString;
    }
    
    public String getProperTextureName() {
    	return this.properTextureName;
    }
    
    public ItemStorage(ModContext context, int size,
            Predicate<Item> validItemPredicate,
            ResourceLocation guiTextureLocation, 
            int guiTextureWidth) {
        this.validItemPredicate = validItemPredicate;
        this.size = size;
        this.guiTextureLocation = guiTextureLocation;
        this.guiTextureWidth = guiTextureWidth;
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
    
    @Override
    public List<Tuple<ModelBase, String>> getTexturedModels() {
        return texturedModels;
    }

    @Override
    public CustomRenderer<?> getPostRenderer() {
        return null;
    }
    
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
