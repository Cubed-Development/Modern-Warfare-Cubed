package com.paneedah.weaponlib;

import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.crafting.CraftingGroup;
import com.paneedah.weaponlib.crafting.IModernCraftingRecipe;
import com.paneedah.weaponlib.melee.PlayerMeleeInstance;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

import static com.paneedah.mwc.ProjectConstants.ID;

public class ItemAttachment<T> extends Item implements ModelSource, IModernCraftingRecipe {

    @Getter
    private final AttachmentCategory category;
    @Getter
    private final String crosshair;
    @Getter
    private final ApplyHandler<T> apply;
    @Getter
    private final ApplyHandler<T> remove;
    @Getter
    protected ApplyHandler2<T> apply2;
    protected ApplyHandler2<T> remove2;
    @Getter
    protected MeleeWeaponApplyHandler<T> apply3;
    @Getter
    protected MeleeWeaponApplyHandler<T> remove3;
    @Getter
    private final List<Tuple<ModelBase, String>> texturedModels = new ArrayList<>();
    @Setter
    private List<CustomRenderer<?>> postRenderer = new ArrayList<>();
    @Getter
    @Setter
    private CustomRenderer<?> preRenderer;
    @Getter
    private Part renderablePart;
    @Setter
    private String name;
    private Function<ItemStack, String> informationProvider;
    protected int maxStackSize = 1;

    private CraftingEntry[] modernRecipe;
    private CraftingGroup craftGroup;

    private final List<CompatibleAttachment<T>> attachments = new ArrayList<>();

    private final List<Weapon> compatibleWeapons = new ArrayList<>();

    @Getter
    private List<ItemAttachment<T>> requiredAttachments = new ArrayList<>();

    protected String textureName;

    public Vec3d rotationPoint = Vec3d.ZERO;


    public interface ApplyHandler<T> {
        void apply(ItemAttachment<T> itemAttachment, T target, EntityLivingBase player);
    }

    public interface ApplyHandler2<T> {
        void apply(ItemAttachment<T> itemAttachment, PlayerWeaponInstance instance);
    }

    public interface MeleeWeaponApplyHandler<T> {
        void apply(ItemAttachment<T> itemAttachment, PlayerMeleeInstance instance);
    }

    protected ItemAttachment(AttachmentCategory category, ModelBase model, String textureName, String crosshair,
                             ApplyHandler<T> apply, ApplyHandler<T> remove) {
        this.category = category;
        this.textureName = textureName.toLowerCase();
        this.crosshair = crosshair != null ? ID + ":" + "textures/crosshairs/" + crosshair + ".png" : null;
        this.apply = apply;
        this.remove = remove;
    }

    protected ItemAttachment(AttachmentCategory category, String crosshair,
                             ApplyHandler<T> apply, ApplyHandler<T> remove) {
        this.category = category;
        this.crosshair = crosshair != null ? ID + ":" + "textures/crosshairs/" + crosshair + ".png" : null;
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
        return craftGroup;
    }

    public void setCraftingGroup(CraftingGroup cg) {
        craftGroup = cg;
    }

    public void setModernRecipe(CraftingEntry... is) {
        modernRecipe = is;
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

    @Deprecated
    public ItemAttachment<T> addModel(ModelBase model, String textureName) {
        texturedModels.add(new Tuple<>(model, textureName));
        return this;
    }

    public ItemAttachment(AttachmentCategory category, String crosshair) {
        this(category, crosshair, (a, w, p) -> {}, (a, w, p) -> {});
    }

    public ItemAttachment(AttachmentCategory category, ModelBase attachment, String textureName, String crosshair) {
        this(category, attachment, textureName, crosshair, (a, w, p) -> {}, (a, w, p) -> {});
    }

    /**
     * For use with the "magic mag"
     *
     */
    public void setFirstModel(ItemAttachment<Weapon> model) {
        texturedModels.set(0, model.getTexturedModels().get(0));
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

    public void setPostRenderers(List<CustomRenderer<?>> postRenderer) {
    }


    @Override
    public CustomRenderer<?> getPostRenderer() {
        return postRenderer.isEmpty() ? null : postRenderer.get(0);
    }

    public List<CustomRenderer<?>> getAllPostRenderers() {
        return postRenderer;
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

    protected ApplyHandler2<T> getRemove2() {
        return remove2;
    }

    @Override
    public ItemStack getItemStack() {
        return new ItemStack(this);
    }

    @Override
    public CraftingEntry[] getModernRecipe() {
        return modernRecipe;
    }

    @Override
    public void setCraftingRecipe(CraftingEntry[] recipe) {
        modernRecipe = recipe;
    }

    @Override
    public boolean shouldCauseReequipAnimation(ItemStack oldStack, ItemStack newStack, boolean slotChanged) {
        return true;
    }
}
