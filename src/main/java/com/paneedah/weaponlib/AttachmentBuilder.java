package com.paneedah.weaponlib;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.renderer.ModelSourceTransforms;
import com.paneedah.mwc.renderer.StaticModelSourceRenderer;
import com.paneedah.mwc.rendering.Transform;
import com.paneedah.mwc.weapons.AbstractItemBuilder;
import com.paneedah.weaponlib.ItemAttachment.ApplyHandler;
import com.paneedah.weaponlib.ItemAttachment.ApplyHandler2;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.crafting.CraftingGroup;
import com.paneedah.weaponlib.crafting.CraftingRegistry;
import com.paneedah.weaponlib.crafting.OptionsMetadata;
import dev.redstudio.redcore.math.vectors.Vector3F;
import lombok.Getter;
import net.minecraft.client.model.ModelBase;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.FMLLaunchHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.oredict.ShapedOreRecipe;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

import static com.paneedah.mwc.ProjectConstants.ID;
import static com.paneedah.mwc.handlers.ClientEventHandler.COOKING_QUEUE;

public class AttachmentBuilder<T> extends AbstractItemBuilder<AttachmentBuilder<T>> {

    public static int noRecipe = 0;

    @Getter protected String textureName;
    protected ModelSourceTransforms transforms = ModelSourceTransforms.builder()
            .entityPositioning(() -> new Transform()
                    .withScale(0.17F, 0.17F, 0.17F)
                    .withPosition(-0.5F, -0.5F, 0.6F)
                    .applyTransformations())
            .build();

    protected Vector3F pivotPoint;
    protected AttachmentCategory attachmentCategory;
    protected ApplyHandler<T> apply;
    protected ApplyHandler<T> remove;
    protected ApplyHandler2<T> apply2;
    protected ApplyHandler2<T> remove2;

    private final List<CustomRenderer<?>> postRenderer = new ArrayList<>();
    private final List<Tuple<ModelBase, String>> texturedModels = new ArrayList<>();
    private boolean isRenderablePart;

    protected Function<ItemStack, String> informationProvider;
    private Object[] craftingRecipe;
    private CraftingEntry[] modernRecipe;
    private CraftingGroup craftingGroup;

    Map<ItemAttachment<T>, CompatibleAttachment<T>> compatibleAttachments = new HashMap<>();
    private final List<ItemAttachment<T>> requiredAttachments = new ArrayList<>();

    public AttachmentBuilder<T> withCategory(AttachmentCategory category) {
        this.attachmentCategory = category;
        return this;
    }

    public AttachmentBuilder<T> withModernRecipe(CraftingGroup group, CraftingEntry... entries) {
        this.modernRecipe = entries;
        this.craftingGroup = group;
        return this;
    }

    public AttachmentBuilder<T> withPivotPoint(float x, float y, float z) {
        this.pivotPoint = new Vector3F(x, y, z);
        return this;
    }

    public AttachmentBuilder<T> withCompatibleAttachment(ItemAttachment<T> attachment, Consumer<ModelBase> positioner) {
        compatibleAttachments.put(attachment, new CompatibleAttachment<>(attachment, positioner));
        return this;
    }

    @SafeVarargs
    public final AttachmentBuilder<T> withRequiredAttachments(ItemAttachment<T>... required) {
        Collections.addAll(this.requiredAttachments, required);
        return this;
    }

    public AttachmentBuilder<T> withTextureName(String textureName) {
        this.textureName = textureName.toLowerCase();
        return this;
    }

    public AttachmentBuilder<T> withEntityPositioning(Runnable entityPositioning) {
        transforms.setEntityPositioning(entityPositioning);
        return this;
    }

    public AttachmentBuilder<T> withInventoryPositioning(Runnable inventoryPositioning) {
        transforms.setInventoryPositioning(inventoryPositioning);
        return this;
    }

    public AttachmentBuilder<T> withThirdPersonPositioning(Runnable thirdPersonPositioning) {
        transforms.setThirdPersonPositioning(thirdPersonPositioning);
        return this;
    }

    public AttachmentBuilder<T> withFirstPersonPositioning(Runnable firstPersonPositioning) {
        transforms.setFirstPersonPositioning(firstPersonPositioning);
        return this;
    }

    public AttachmentBuilder<T> withFirstPersonModelPositioning(Consumer<ModelBase> firstPersonModelPositioning) {
        transforms.setFirstPersonModelPositioning(firstPersonModelPositioning);
        return this;
    }

    public AttachmentBuilder<T> withEntityModelPositioning(Consumer<ModelBase> entityModelPositioning) {
        transforms.setEntityModelPositioning(entityModelPositioning);
        return this;
    }

    public AttachmentBuilder<T> withInventoryModelPositioning(Consumer<ModelBase> inventoryModelPositioning) {
        transforms.setInventoryModelPositioning(inventoryModelPositioning);
        return this;
    }

    public AttachmentBuilder<T> withThirdPersonModelPositioning(Consumer<ModelBase> thirdPersonModelPositioning) {
        transforms.setThirdPersonModelPositioning(thirdPersonModelPositioning);
        return this;
    }

    public AttachmentBuilder<T> withFirstPersonHandPositioning(Runnable leftHand, Runnable rightHand) {
        transforms.setFirstPersonLeftHandPositioning(leftHand);
        transforms.setFirstPersonRightHandPositioning(rightHand);
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

    public AttachmentBuilder<T> withCraftingRecipe(Object... craftingRecipe) {
        this.craftingRecipe = craftingRecipe;
        return this;
    }

    protected ItemAttachment<T> createAttachment() {
        return new ItemAttachment<>(attachmentCategory, apply, remove);
    }

    @Override
    public ItemAttachment<T> build() {
        ItemAttachment<T> attachment = createAttachment();
        attachment.setTranslationKey(ID + "_" + name);
        attachment.setCreativeTab(tab);
        attachment.setPostRenderer(postRenderer);
        attachment.setName(name);
        attachment.apply2 = apply2;

        attachment.setCraftingGroup(craftingGroup);
        attachment.setModernRecipe(modernRecipe);

        CraftingRegistry.registerHook(attachment);

        if (pivotPoint != null) {
            attachment.pivotPoint = pivotPoint;
        }

        attachment.remove2 = remove2;
        attachment.maxStackSize = maxStackSize;
        attachment.setRequiredAttachments(requiredAttachments);
        if (attachment.getInformationProvider() == null) {
            attachment.setInformationProvider(informationProvider);
        }

        if (textureName != null) {
            attachment.setTextureName(ID + ":" + stripFileExtension(textureName, ".png"));
        }

        if (isRenderablePart) {
            attachment.setRenderablePart(new Part() {
                @Override
                public String toString() {
                    return name != null ? "Part [" + name + "]" : super.toString();
                }
            });
        }

        if (model != null) {
            attachment.addModel(model, addFileExtension(textureName, ".png"));
        }

        texturedModels.forEach(tm -> attachment.addModel(tm.getU(), addFileExtension(tm.getV(), ".png")));
        compatibleAttachments.values().forEach(a -> attachment.addCompatibleAttachment(a));

        if ((model != null || !texturedModels.isEmpty()))
            MWC.modContext.registerRenderableItem(name, attachment, FMLCommonHandler.instance().getSide() == Side.CLIENT ? new StaticModelSourceRenderer(transforms) : null);

        if (craftingRecipe != null && craftingRecipe.length >= 2) {
            MWC.modContext.getRecipeManager().registerShapedRecipe(attachment, craftingRecipe);
        } else if (craftingComplexity != null) {
            OptionsMetadata optionsMetadata = new OptionsMetadata.OptionMetadataBuilder()
                    .withSlotCount(9)
                    .build(craftingComplexity, Arrays.copyOf(craftingMaterials, craftingMaterials.length));

            List<Object> shape = MWC.modContext.getRecipeManager().createShapedRecipe(attachment, name, optionsMetadata);

            ItemStack itemStack = new ItemStack(attachment);
            itemStack.setCount(craftingCount);

            ForgeRegistries.RECIPES.register(new ShapedOreRecipe(null, itemStack, shape.toArray()).setMirrored(false) // ! TODO: Temporary hack because we should use the registry event instead - Luna Mira Lage (Desoroxxx) 2025-09-19
                    .setRegistryName(ID, itemStack.getItem().getTranslationKey() + "_recipe"));
        } else if (attachment.getCategory() == AttachmentCategory.GRIP
                || attachment.getCategory() == AttachmentCategory.SCOPE
                || attachment.getCategory() == AttachmentCategory.MAGAZINE
                || attachment.getCategory() == AttachmentCategory.BULLET
                || attachment.getCategory() == AttachmentCategory.SILENCER
                || attachment.getCategory() == AttachmentCategory.SKIN
                || attachment.getCategory() == AttachmentCategory.LASER) {
            noRecipe += 1;
        }

        if (FMLLaunchHandler.side().isClient())
            COOKING_QUEUE.add(attachment);

        return attachment;
    }

    public <V extends ItemAttachment<T>> V build(Class<V> target) {
        return target.cast(build());
    }
}
