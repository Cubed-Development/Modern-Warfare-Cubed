package com.paneedah.weaponlib;

import com.paneedah.mwc.instancing.PlayerWeaponInstance;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.crafting.CraftingGroup;
import com.paneedah.weaponlib.crafting.ICraftingRecipe;
import com.paneedah.weaponlib.melee.PlayerMeleeInstance;
import dev.redstudio.redcore.math.vectors.Vector3F;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class ItemAttachment<T> extends Item implements ModelSource, ICraftingRecipe {

    private final AttachmentCategory category;
    private final ApplyHandler<T> apply;
    private final ApplyHandler<T> remove;
    protected ApplyHandler2<T> apply2;
    protected ApplyHandler2<T> remove2;
    protected MeleeWeaponApplyHandler<T> apply3;
    protected MeleeWeaponApplyHandler<T> remove3;
    private final List<Tuple<ModelBase, String>> texturedModels = new ArrayList<>();
    private List<CustomRenderer<?>> postRenderer = new ArrayList<>();
    private CustomRenderer<?> preRenderer;
    private Part renderablePart;
    private String name;
    private Function<ItemStack, String> informationProvider;
    protected int maxStackSize = 1;

    private CraftingEntry[] modernRecipe;
    private CraftingGroup craftGroup;

    private final List<CompatibleAttachment<T>> attachments = new ArrayList<>();

    private final List<Weapon> compatibleWeapons = new ArrayList<>();

    private List<ItemAttachment<T>> requiredAttachments = new ArrayList<>();

    protected String textureName;

    public Vector3F pivotPoint = new Vector3F();

    public interface ApplyHandler<T> {
        void apply(ItemAttachment<T> itemAttachment, T target, EntityLivingBase player);
    }

    public interface ApplyHandler2<T> {
        void apply(ItemAttachment<T> itemAttachment, PlayerWeaponInstance instance);
    }

    public interface MeleeWeaponApplyHandler<T> {
        void apply(ItemAttachment<T> itemAttachment, PlayerMeleeInstance instance);
    }

    protected ItemAttachment(AttachmentCategory category, ModelBase model, String textureName,
                             ApplyHandler<T> apply, ApplyHandler<T> remove) {
        this.category = category;
//		if(model != null) {
//			this.texturedModels.add(new Tuple<ModelBase, String>(model, textureName));
//		}
        this.textureName = textureName.toLowerCase();
        this.apply = apply;
        this.remove = remove;
    }

    protected ItemAttachment(AttachmentCategory category,
                             ApplyHandler<T> apply, ApplyHandler<T> remove) {
        this.category = category;
        this.apply = apply;
        this.remove = remove;
    }



    @Override
    public int getItemStackLimit() {
        return maxStackSize;
    }

    public Item setTextureName(String name) {
        return this;
    }

    @Override
    public CraftingGroup getCraftingGroup() {
        return this.craftGroup;
    }

    public void setCraftingGroup(CraftingGroup cg) {
        this.craftGroup = cg;
    }

    public void setModernRecipe(CraftingEntry... is) {
        this.modernRecipe = is;
    }


    public Part getRenderablePart() {
        return renderablePart;
    }

    protected void setRenderablePart(Part renderablePart) {
        this.renderablePart = renderablePart;
    }

    protected Function<ItemStack, String> getInformationProvider() {
        return informationProvider;
    }

    protected void setInformationProvider(
            Function<ItemStack, String> informationProvider) {
        this.informationProvider = informationProvider;
    }

    protected void setRequiredAttachments(List<ItemAttachment<T>> requiredAttachments) {
        this.requiredAttachments = Collections.unmodifiableList(requiredAttachments);
    }

    public List<ItemAttachment<T>> getRequiredAttachments() {
        return requiredAttachments;
    }

    @Deprecated
    public ItemAttachment<T> addModel(ModelBase model, String textureName) {
        texturedModels.add(new Tuple<>(model, textureName));
        return this;
    }

    public ItemAttachment(AttachmentCategory category) {
        this(category, (a, w, p) -> {}, (a, w, p) -> {});
    }

    public ItemAttachment(AttachmentCategory category, ModelBase attachment, String textureName) {
        this(category, attachment, textureName, (a, w, p) -> {}, (a, w, p) -> {});
    }

    public AttachmentCategory getCategory() {
        return category;
    }

    public List<Tuple<ModelBase, String>> getTexturedModels() {
        return texturedModels;
    }

    /**
     * For use with the "magic mag"
     *
     * @param model
     */
    public void setFirstModel(ItemAttachment<Weapon> model) {
        texturedModels.set(0, model.getTexturedModels().get(0));
    }

    public ApplyHandler<T> getApply() {
        return apply;
    }

    public ApplyHandler<T> getRemove() {
        return remove;
    }

    public void addCompatibleWeapon(Weapon weapon) {
        compatibleWeapons.add(weapon);
    }

    @Override
    public void addInformation(ItemStack itemStack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        if (informationProvider != null) {
            tooltip.add(informationProvider.apply(itemStack));
            return;
        }

        final TextFormatting green = TextFormatting.GREEN;
        final TextFormatting grey = TextFormatting.GRAY;

        final ArrayList<String> tooltipLines = new ArrayList<>();

        // Info
        if (category != null) {
            tooltipLines.add(green + "Type: " + grey + category);
        }

        // Compatible weapons and attachments
        if (category != AttachmentCategory.SKIN) {
            if (!compatibleWeapons.isEmpty()) {
                tooltipLines.add(green + "Compatible Weapons:");
                compatibleWeapons.forEach(weapon -> tooltipLines.add(grey + (I18n.format(weapon.getTranslationKey() + ".name"))));
            }

            if (!attachments.isEmpty()) {
                tooltipLines.add(green + "Attachments:");
                attachments.forEach(compatibleAttachment -> tooltipLines.add(grey + (I18n.format(compatibleAttachment.getAttachment().getTranslationKey() + ".name"))));
            }
        }

        tooltip.addAll(tooltipLines);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPostRenderers(List<CustomRenderer<?>> postRenderer) {
        postRenderer = postRenderer;
    }


    @Override
    public CustomRenderer<?> getPostRenderer() {
        return postRenderer.isEmpty() ? null : postRenderer.get(0);
    }

    public List<CustomRenderer<?>> getAllPostRenderers() {
        return postRenderer;
    }

    public CustomRenderer<?> getPreRenderer() {
        return preRenderer;
    }

    public void setPreRenderer(CustomRenderer<?> preRenderer) {
        this.preRenderer = preRenderer;
    }

    protected void addCompatibleAttachment(CompatibleAttachment<T> attachment) {
        attachments.add(attachment);
    }

    public List<CompatibleAttachment<T>> getAttachments() {
        return Collections.unmodifiableList(attachments);
    }

    @Override
    public String toString() {
        return name != null ? "Attachment [" + name + "]" : super.toString();
    }

    public ApplyHandler2<T> getApply2() {
        return apply2;
    }

    protected ApplyHandler2<T> getRemove2() {
        return remove2;
    }

    public MeleeWeaponApplyHandler<T> getApply3() {
        return apply3;
    }

    public MeleeWeaponApplyHandler<T> getRemove3() {
        return remove3;
    }

    public void setPostRenderer(List<CustomRenderer<?>> postRenderer2) {
        this.postRenderer = postRenderer2;

    }

    @Override
    public ItemStack getOutput() {
        return new ItemStack(this);
    }

    @Override
    public CraftingEntry[] getCraftingRecipe() {
        return this.modernRecipe;
    }

    @Override
    public void setCraftingRecipe(CraftingEntry[] craftingRecipe) {
        this.modernRecipe = craftingRecipe;
    }

    @Override
    public boolean shouldCauseReequipAnimation(ItemStack oldStack, ItemStack newStack, boolean slotChanged) {
        return true;
    }
}
