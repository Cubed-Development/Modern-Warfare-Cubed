package com.paneedah.weaponlib;

import com.paneedah.mwc.utils.ModReference;
import com.paneedah.weaponlib.ItemAttachment.ApplyHandler;
import com.paneedah.weaponlib.ItemAttachment.ApplyHandler2;
import com.paneedah.weaponlib.crafting.*;
import net.minecraft.client.model.ModelBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.oredict.ShapedOreRecipe;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class AttachmentBuilder<T> {
	
	public static int noRecipe = 0;
	
	protected String name;
	protected ModelBase model;
	protected String textureName;
	
	protected Vec3d rotationPoint;
	
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
	protected ApplyHandler<T> apply;
	protected ApplyHandler<T> remove;
	protected ApplyHandler2<T> apply2;
	protected ApplyHandler2<T> remove2;
	private String crosshair;
	private List<CustomRenderer<?>> postRenderer = new ArrayList<>();
	private List<Tuple<ModelBase, String>> texturedModels = new ArrayList<>();
	private boolean isRenderablePart;
    private int maxStackSize = 1;
    private Function<ItemStack, String> informationProvider;

	private CraftingComplexity craftingComplexity;

	private Object[] craftingMaterials;

	Map<ItemAttachment<T>, CompatibleAttachment<T>> compatibleAttachments = new HashMap<>();
    private int craftingCount = 1;
    private Object[] craftingRecipe;
    
    private List<ItemAttachment<T>> requiredAttachments = new ArrayList<>();
    
    private CraftingEntry[] modernRecipe;
    private CraftingGroup craftingGroup;

	public AttachmentBuilder<T> withCategory(AttachmentCategory attachmentCategory) {
		this.attachmentCategory = attachmentCategory;
		return this;
	}
	
	public AttachmentBuilder<T> withModernRecipe(CraftingGroup group, CraftingEntry...is) {
		this.modernRecipe = is;
		this.craftingGroup = group;
		return this;
	}

	public AttachmentBuilder<T> withName(String name) {
		this.name = name;
		return this;
	}

	public AttachmentBuilder<T> withCreativeTab(CreativeTabs tab) {
		this.tab = tab;
		return this;
	}
	
	public AttachmentBuilder<T> withRotationPoint(double x, double y, double z) {
		this.rotationPoint = new Vec3d(x, y, z);
		return this;
	}

	public AttachmentBuilder<T> withCompatibleAttachment(ItemAttachment<T> attachment, Consumer<ModelBase> positioner) {
		compatibleAttachments.put(attachment, new CompatibleAttachment<>(attachment, positioner));
		return this;
	}
	
	@SafeVarargs
    public final AttachmentBuilder<T> withRequiredAttachments(ItemAttachment<T>...requiredAttachments) {
        for(int i = 0; i < requiredAttachments.length; i++) {
            this.requiredAttachments.add(requiredAttachments[i]);
        }
        return this;
    }

	public AttachmentBuilder<T> withModel(ModelBase model) {
		this.model = model;
		return this;
	}

	public AttachmentBuilder<T> withTextureName(String textureName) {
		this.textureName = textureName.toLowerCase();
		return this;
	}

	public AttachmentBuilder<T> withMaxStackSize(int maxStackSize) {
        this.maxStackSize = maxStackSize;
        return this;
    }

	public AttachmentBuilder<T> withEntityPositioning(Consumer<ItemStack> entityPositioning) {
		this.entityPositioning = entityPositioning;
		return this;
	}

	public AttachmentBuilder<T> withInventoryPositioning(Consumer<ItemStack> inventoryPositioning) {
		this.inventoryPositioning = inventoryPositioning;
		return this;
	}

	public  AttachmentBuilder<T> withThirdPersonPositioning(BiConsumer<EntityPlayer, ItemStack> thirdPersonPositioning) {
		this.thirdPersonPositioning = thirdPersonPositioning;
		return this;
	}

	public AttachmentBuilder<T> withFirstPersonPositioning(BiConsumer<EntityPlayer, ItemStack> firstPersonPositioning) {
		this.firstPersonPositioning = firstPersonPositioning;
		return this;
	}

	public AttachmentBuilder<T> withFirstPersonModelPositioning(BiConsumer<ModelBase, ItemStack> firstPersonModelPositioning) {
		this.firstPersonModelPositioning = firstPersonModelPositioning;
		return this;
	}

	public AttachmentBuilder<T> withEntityModelPositioning(BiConsumer<ModelBase, ItemStack> entityModelPositioning) {
		this.entityModelPositioning = entityModelPositioning;
		return this;
	}

	public AttachmentBuilder<T> withInventoryModelPositioning(BiConsumer<ModelBase, ItemStack> inventoryModelPositioning) {
		this.inventoryModelPositioning = inventoryModelPositioning;
		return this;
	}

	public AttachmentBuilder<T> withThirdPersonModelPositioning(BiConsumer<ModelBase, ItemStack> thirdPersonModelPositioning) {
		this.thirdPersonModelPositioning = thirdPersonModelPositioning;
		return this;
	}

	public AttachmentBuilder<T> withFirstPersonHandPositioning(
            Consumer<RenderContext<RenderableState>> leftHand,
            Consumer<RenderContext<RenderableState>> rightHand)
    {
        this.firstPersonLeftHandPositioning = leftHand;
        this.firstPersonRightHandPositioning = rightHand;
        return this;
    }

	public AttachmentBuilder<T> withCrosshair(String crosshair) {
		this.crosshair = crosshair.toLowerCase();
		return this;
	}


	public AttachmentBuilder<T> withPostRender(CustomRenderer<?> postRenderer) {
		this.postRenderer.add(postRenderer);
		return this;
	}

	public AttachmentBuilder<T> withModel(ModelBase model, String textureName) {
		this.texturedModels.add(new Tuple<>(model, textureName.toLowerCase()));
		return this;
	}

	public AttachmentBuilder<T> withRenderablePart() {
		this.isRenderablePart = true;
		return this;
	}


	public AttachmentBuilder<T> withApply(ApplyHandler<T> apply) {
		this.apply = apply;
		return this;
	}

	public AttachmentBuilder<T> withRemove(ApplyHandler<T> remove) {
		this.remove = remove;
		return this;
	}

	public AttachmentBuilder<T> withApply(ApplyHandler2<T> apply) {
		this.apply2 = apply;
		return this;
	}

	public AttachmentBuilder<T> withRemove(ApplyHandler2<T> remove) {
		this.remove2 = remove;
		return this;
	}

	public AttachmentBuilder<T> withCrafting(CraftingComplexity craftingComplexity, Object...craftingMaterials) {
	    return withCrafting(1, craftingComplexity, craftingMaterials);
	}

	public AttachmentBuilder<T> withInformationProvider(Function<ItemStack, String> informationProvider) {
        this.informationProvider = informationProvider;
        return this;
    }

	public AttachmentBuilder<T> withCrafting(int craftingCount, CraftingComplexity craftingComplexity, Object...craftingMaterials) {
		if(craftingComplexity == null)
			throw new IllegalArgumentException("Crafting complexity not set");

		if(craftingMaterials.length < 2)
			throw new IllegalArgumentException("2 or more materials required for crafting");

		if(craftingCount == 0)
		    throw new IllegalArgumentException("Invalid item count");

		this.craftingComplexity = craftingComplexity;
		this.craftingMaterials = craftingMaterials;
		this.craftingCount = craftingCount;
		return this;
	}

	public AttachmentBuilder<T> withCraftingRecipe(Object...craftingRecipe) {
	    this.craftingRecipe = craftingRecipe;
	    return this;
	}

	protected ItemAttachment<T> createAttachment(ModContext modContext) {
		return new ItemAttachment<T>(attachmentCategory, crosshair, apply, remove);
	}

	@SuppressWarnings("deprecation")
	public ItemAttachment<T> build(ModContext modContext) {
		ItemAttachment<T> attachment = createAttachment(modContext);
		attachment.setTranslationKey(ModReference.ID + "_" + name);
		attachment.setCreativeTab(tab);
		attachment.setPostRenderer(postRenderer);
		attachment.setName(name);
		attachment.apply2 = apply2;
		
		
		attachment.setCraftingGroup(craftingGroup);
		attachment.setModernRecipe(modernRecipe);
		
		// Do not register things if they do not have recipes.
		CraftingRegistry.registerHook(attachment);

		if(rotationPoint != null) attachment.rotationPoint = rotationPoint;

		attachment.remove2 = remove2;
		attachment.maxStackSize = maxStackSize;
		attachment.setRequiredAttachments(requiredAttachments);
		if (attachment.getInformationProvider() == null)
		    attachment.setInformationProvider(informationProvider);

		if (getTextureName() != null)
			attachment.setTextureName(ModReference.ID + ":" + stripFileExtension(getTextureName(), ".png"));

		if(isRenderablePart) {
			attachment.setRenderablePart(new Part() {
				@Override
				public String toString() {
					return name != null ? "Part [" + name + "]" : super.toString();
				}
			});
		}

		if(getModel() != null) {
			attachment.addModel(getModel(), addFileExtension(getTextureName(), ".png"));
		}

		texturedModels.forEach(tm -> attachment.addModel(tm.getU(), addFileExtension(tm.getV(), ".png") ));

		compatibleAttachments.values().forEach(a -> attachment.addCompatibleAttachment(a));

		if((getModel() != null || !texturedModels.isEmpty())) {
			modContext.registerRenderableItem(name, attachment, FMLCommonHandler.instance().getSide() == Side.CLIENT ? registerRenderer(attachment, modContext) : null);
		}

		if(craftingRecipe != null && craftingRecipe.length >= 2) {
//		    ItemStack itemStack = new ItemStack(attachment);
		    modContext.getRecipeManager().registerShapedRecipe(attachment, craftingRecipe);
//		    boolean hasOres = Arrays.stream(craftingRecipe).anyMatch(r -> r instanceof String);
//		    if(hasOres) {
//                compatibility.addShapedOreRecipe(itemStack, registeredRecipe.toArray());
//            } else {
//                compatibility.addShapedRecipe(itemStack, registeredRecipe.toArray());
//            }
		} else if(craftingComplexity != null) {
			OptionsMetadata optionsMetadata = new OptionsMetadata.OptionMetadataBuilder()
				.withSlotCount(9)
            	.build(craftingComplexity, Arrays.copyOf(craftingMaterials, craftingMaterials.length));

			List<Object> shape = modContext.getRecipeManager().createShapedRecipe(attachment, name, optionsMetadata);

			ItemStack itemStack = new ItemStack(attachment);
			itemStack.setCount(craftingCount);
            if(optionsMetadata.hasOres()) {
				ForgeRegistries.RECIPES.register(new ShapedOreRecipe(null, itemStack, shape.toArray()).setMirrored(false).setRegistryName(ModReference.ID, itemStack.getItem().getTranslationKey() + "_recipe"));
			} else {
				ForgeRegistries.RECIPES.register(new ShapedOreRecipe(null, itemStack, shape.toArray()).setMirrored(false).setRegistryName(ModReference.ID, itemStack.getItem().getTranslationKey() + "_recipe"));
			}
		} else if(attachment.getCategory() == AttachmentCategory.GRIP
		        || attachment.getCategory() == AttachmentCategory.SCOPE
		        || attachment.getCategory() == AttachmentCategory.MAGAZINE
		        || attachment.getCategory() == AttachmentCategory.BULLET
		        || attachment.getCategory() == AttachmentCategory.SILENCER
		        || attachment.getCategory() == AttachmentCategory.SKIN
		        || attachment.getCategory() == AttachmentCategory.LASER
		        ){
		    //throw new IllegalStateException("No recipe defined for attachment " + name);
		    noRecipe += 1;
			//System.err.println("!!!No recipe defined for attachment " + name);
		}
		
		

		return attachment;
	}


	private Object registerRenderer(ItemAttachment<T> attachment, ModContext modContext) {
		return new StaticModelSourceRenderer.Builder()
		.withHiddenInventory(tab == null)
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


	static String addFileExtension(String s, String ext) {
		return s != null && !s.endsWith(ext) ? s + ext : s;
	}

	protected static String stripFileExtension(String str, String extension) {
		return str.endsWith(extension) ? str.substring(0, str.length() - extension.length()) : str;
	}

	public <V extends ItemAttachment<T>> V build(ModContext modContext, Class<V> target) {
		return target.cast(build(modContext));
	}

    public ModelBase getModel() {
        return model;
    }

    public String getTextureName() {
        return textureName;
    }
}
