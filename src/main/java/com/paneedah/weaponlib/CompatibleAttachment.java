package com.paneedah.weaponlib;

import com.paneedah.weaponlib.melee.ItemMelee;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class CompatibleAttachment<T> {

    private final ItemAttachment<T> attachment;
    private Consumer<ModelBase> modelPositioning;
    //	private BiConsumer<EntityLivingBase, ItemStack> positioning;
    private Object positioning;
    private boolean isDefault;
    private boolean isPermanent;
    private ItemAttachment.ApplyHandler2<T> applyHandler;
    private ItemAttachment.ApplyHandler2<T> removeHandler;
    ItemAttachment.MeleeWeaponApplyHandler<ItemMelee> meleeApplyHandler;
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
        this.modelPositioning = positioning;
        this.isDefault = isDefault;
    }

    public ItemAttachment<T> getAttachment() {
        return attachment;
    }

    public Consumer<ModelBase> getModelPositioning() {
        return modelPositioning;
    }

//	public BiConsumer<EntityLivingBase, ItemStack> getPositioning() {
//		return positioning;
//	}

    public Object getPositioning() {
        return positioning;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public ItemAttachment.ApplyHandler2<T> getApplyHandler() {
        return applyHandler;
    }

    public ItemAttachment.ApplyHandler2<T> getRemoveHandler() {
        return removeHandler;
    }

    public ItemAttachment.MeleeWeaponApplyHandler<ItemMelee> getMeleeApplyHandler() {
        return meleeApplyHandler;
    }

    public ItemAttachment.MeleeWeaponApplyHandler<ItemMelee> getMeleeRemoveHandler() {
        return meleeRemoveHandler;
    }

    public boolean isPermanent() {
        return isPermanent;
    }
}
