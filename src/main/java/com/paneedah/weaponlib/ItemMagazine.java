package com.paneedah.weaponlib;

import com.paneedah.mwc.instancing.PlayerItemInstanceFactory;
import com.paneedah.mwc.instancing.PlayerMagazineInstance;
import com.paneedah.mwc.instancing.Tags;
import lombok.Getter;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.text.TextFormatting;

import java.util.ArrayList;
import java.util.List;

public class ItemMagazine extends ItemAttachment<Weapon> implements PlayerItemInstanceFactory<PlayerMagazineInstance, MagazineState>, Reloadable, Updatable, Part {

    public static final class Builder extends AttachmentBuilder<Weapon> {
        private short capacity;
        private final List<ItemBullet> compatibleBullets = new ArrayList<>();
        private String reloadSound;
        private String unloadSound;

        public Builder withCapacity(int capacity) {
            this.capacity = (short) capacity;
            return this;
        }

        public Builder withCompatibleBullet(ItemBullet compatibleBullet) {
            this.compatibleBullets.add(compatibleBullet);
            return this;
        }

        public Builder withUnloadSound(String unloadSound) {
            this.unloadSound = unloadSound;
            return this;
        }

        public Builder withReloadSound(String reloadSound) {
            this.reloadSound = reloadSound;
            return this;
        }

        @Override
        protected ItemAttachment<Weapon> createAttachment(ModContext modContext) {
            final ItemMagazine magazine = new ItemMagazine(getModel(), getTextureName(), capacity);

            magazine.compatibleBullets = compatibleBullets;

            if (reloadSound != null) {
                magazine.reloadSound = modContext.registerSound(reloadSound);
            }

            if (unloadSound != null) {
                magazine.unloadSound = modContext.registerSound(unloadSound);
            }

            magazine.modContext = modContext;

            informationProvider = stack -> {
                final PlayerMagazineInstance instance = (PlayerMagazineInstance) Tags.getInstance(stack);

                if (instance == null)
                    return "borken";

                return TextFormatting.GREEN + "Ammunition: " + TextFormatting.GRAY + instance.getAmmo() + "/" + capacity;
            };

            return magazine;
        }
    }

    private ModContext modContext;

    @Getter private final short capacity;
    @Getter private List<ItemBullet> compatibleBullets;
    @Getter private SoundEvent reloadSound;
    @Getter private SoundEvent unloadSound;

    ItemMagazine(ModelBase model, String textureName, short capacity) {
        this(model, textureName, capacity, null, null);
    }

    ItemMagazine(ModelBase model, String textureName, short capacity, ApplyHandler<Weapon> apply, ApplyHandler<Weapon> remove) {
        super(AttachmentCategory.MAGAZINE, model, textureName, apply, remove);
        this.capacity = capacity;
        setMaxStackSize(1);
    }

    public ItemStack create() {
        return create(capacity);
    }

    public ItemStack create(final short ammunition) {
        final ItemStack itemStack = new ItemStack(this);

        final PlayerMagazineInstance magazineInstance = createItemInstance(null, itemStack, 0);
        magazineInstance.setAmmo(ammunition);

        return itemStack;
    }

    @Override
    public Part getRenderablePart() {
        return this;
    }

    @Override
    public PlayerMagazineInstance createItemInstance(final EntityLivingBase entityLivingBase, final ItemStack itemStack, final int slot) {
        final PlayerMagazineInstance instance = new PlayerMagazineInstance(slot, entityLivingBase, itemStack);

        instance.setState(MagazineState.READY);
        instance.setAmmo((short) 0);

        return instance;
    }

    @Override
    public void update(EntityPlayer player) {
        modContext.getMagazineReloadAspect().updateMainHeldItem(player);
    }

    @Override
    public void reloadMainHeldItemForPlayer(EntityPlayer player) {
        modContext.getMagazineReloadAspect().reloadMainHeldItem(player);
    }

    @Override
    public void unloadMainHeldItemForPlayer(EntityPlayer player) {
        modContext.getMagazineReloadAspect().unloadMainHeldItem(player);
    }
}
