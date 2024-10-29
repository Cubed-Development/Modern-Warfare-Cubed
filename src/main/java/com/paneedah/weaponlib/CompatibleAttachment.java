package com.paneedah.weaponlib;

import com.paneedah.weaponlib.melee.ItemMelee;
import lombok.Getter;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class CompatibleAttachment<T> {

    @Getter
    private final ItemAttachment<T> attachment;
    @Getter
    private Consumer<ModelBase> modelPositioning;
    //	private BiConsumer<EntityLivingBase, ItemStack> positioning;
    @Getter
    private Object positioning;
    private boolean isDefault;
    private boolean isPermanent;
    @Getter
    private ItemAttachment.ApplyHandler2<T> applyHandler;
    @Getter
    private ItemAttachment.ApplyHandler2<T> removeHandler;
    @Getter
    ItemAttachment.MeleeWeaponApplyHandler<ItemMelee> meleeApplyHandler;
    @Getter
    ItemAttachment.MeleeWeaponApplyHandler<ItemMelee> meleeRemoveHandler;

    public CompatibleAttachment(ItemAttachment<T> attachment,
                                Object positioning,
                                Consumer<ModelBase> modelPositioning,
                                boolean isDefault,
                                boolean isPermanent) {
        this.attachment = attachment;
        this.positioning = positioning;
        this.modelPositioning = modelPositioning;
        this.isDefault = isDefault;
        this.isPermanent = isPermanent;
    }

    public CompatibleAttachment(ItemAttachment<T> attachment,
                                BiConsumer<EntityLivingBase, ItemStack> positioning,
                                Consumer<ModelBase> modelPositioning,
                                boolean isDefault) {
        this(attachment, positioning, modelPositioning, isDefault, false);
    }

    //

    public CompatibleAttachment(ItemAttachment<T> attachment,
                                Consumer<RenderContext<RenderableState>> positioning,
                                boolean isDefault, boolean isPermanent) {
        this(attachment, positioning, null, isDefault, false);
    }

    public CompatibleAttachment(ItemAttachment<T> attachment, ItemAttachment.ApplyHandler2<T> applyHandler, ItemAttachment.ApplyHandler2<T> removeHandler) {
        this.attachment = attachment;
        this.applyHandler = applyHandler;
        this.removeHandler = removeHandler;
    }

    public CompatibleAttachment(ItemAttachment<T> attachment,
                                ItemAttachment.MeleeWeaponApplyHandler<ItemMelee> meleeApplyHandler,
                                ItemAttachment.MeleeWeaponApplyHandler<ItemMelee> meleeRemoveHandler) {
        this.attachment = attachment;
        this.meleeApplyHandler = meleeApplyHandler;
        this.meleeRemoveHandler = meleeRemoveHandler;
    }

    public CompatibleAttachment(ItemAttachment<T> attachment, Consumer<ModelBase> positioning) {
        this(attachment, null, positioning, false);
    }

    public CompatibleAttachment(ItemAttachment<T> attachment, Consumer<ModelBase> positioning, boolean isDefault) {
        this.attachment = attachment;
        modelPositioning = positioning;
        this.isDefault = isDefault;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public boolean isPermanent() {
        return isPermanent;
    }
}
