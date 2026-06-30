package com.paneedah.weaponlib.melee;

import com.paneedah.mwc.instancing.PlayerItemInstance;
import com.paneedah.mwc.instancing.PlayerItemInstanceFactory;
import com.paneedah.mwc.instancing.Tags;
import com.paneedah.mwc.weapons.AbstractItemBuilder;
import com.paneedah.weaponlib.*;
import lombok.Getter;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.oredict.ShapedOreRecipe;
import org.lwjgl.input.Keyboard;

import javax.annotation.Nonnull;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import static com.paneedah.mwc.ProjectConstants.ID;
import static com.paneedah.mwc.ProjectConstants.LOGGER;

public class ItemMelee extends Item implements
        PlayerItemInstanceFactory<PlayerMeleeInstance, MeleeState>, AttachmentContainer, Modifiable, Updatable {

    public static class Builder extends AbstractItemBuilder<Builder> {

        private static final int DEFAULT_PREPARE_STUB_TIMEOUT = 100;

        private static final int DEFAULT_ATTACK_COOLDOWN_TIMEOUT = 500;
        private static final int DEFAULT_HEAVY_ATTACK_COOLDOWN_TIMEOUT = 1000;

        List<String> textureNames = new ArrayList<>();

        private String attackSound;
        private String heavyAttackSound;

        private MeleeRenderer renderer;

        Map<ItemAttachment<ItemMelee>, CompatibleAttachment<ItemMelee>> compatibleAttachments = new HashMap<>();

        private Class<? extends WeaponSpawnEntity> spawnEntityClass;

        public float attackDamage = 1f;
        public float heavyAttackDamage = 2f;
        public Supplier<Integer> prepareStubTimeout = () -> DEFAULT_PREPARE_STUB_TIMEOUT;
        public Supplier<Integer> prepareHeavyStubTimeout = () -> DEFAULT_PREPARE_STUB_TIMEOUT;

        public Supplier<Integer> attackCooldownTimeout = () -> DEFAULT_ATTACK_COOLDOWN_TIMEOUT;
        public Supplier<Integer> heavyAttackCooldownTimeout = () -> DEFAULT_HEAVY_ATTACK_COOLDOWN_TIMEOUT;

        private Object[] craftingRecipe;

        public Builder withPrepareStubTimeout(Supplier<Integer> prepareStubTimeout) {
            this.prepareStubTimeout = prepareStubTimeout;
            return this;
        }

        public Builder withPrepareHeavyStubTimeout(Supplier<Integer> prepareHeavyStubTimeout) {
            this.prepareHeavyStubTimeout = prepareHeavyStubTimeout;
            return this;
        }

        public Builder withAttackCooldownTimeout(Supplier<Integer> attackCooldownTimeout) {
            this.attackCooldownTimeout = attackCooldownTimeout;
            return this;
        }

        public Builder withHeavyAttackCooldownTimeout(Supplier<Integer> heavyAttackCooldownTimeout) {
            this.heavyAttackCooldownTimeout = heavyAttackCooldownTimeout;
            return this;
        }

        public Builder withAttackDamage(float attackDamage) {
            this.attackDamage = attackDamage;
            return this;
        }

        public Builder withHeavyAttackDamage(float heavyAttackDamage) {
            this.heavyAttackDamage = heavyAttackDamage;
            return this;
        }

        public Builder withTextureNames(String... textureNames) {
            for (String textureName : textureNames) {
                this.textureNames.add(textureName.toLowerCase() + ".png");
            }
            return this;
        }

        public Builder withAttackSound(String attackSound) {
            this.attackSound = attackSound.toLowerCase(); //ID + ":" + shootSound;
            return this;
        }

        public Builder withHeavyAttackSound(String heavyAttackSound) {
            this.heavyAttackSound = heavyAttackSound.toLowerCase(); //ID + ":" + reloadSound;
            return this;
        }

        public Builder withRenderer(MeleeRenderer renderer) {
            this.renderer = renderer;
            return this;
        }

        public Builder withCompatibleSkin(MeleeSkin skin, String activeTextureName) {
            withCompatibleAttachment(skin,
                    (a, i) -> {
                        i.setActiveTextureIndex(skin.getTextureVariantIndex(activeTextureName.toLowerCase()));
                    },
                    (a, i) -> {}
            );
            return this;
        }

        public Builder withCompatibleAttachment(ItemAttachment<ItemMelee> attachment, ItemAttachment.MeleeWeaponApplyHandler<ItemMelee> applyHandler,
                                                ItemAttachment.MeleeWeaponApplyHandler<ItemMelee> removeHandler) {
            compatibleAttachments.put(attachment, new CompatibleAttachment<>(attachment, applyHandler, removeHandler));
            return this;
        }

        public Builder withCompatibleAttachment(ItemAttachment<ItemMelee> attachment, BiConsumer<EntityLivingBase, ItemStack> positioning) {
            compatibleAttachments.put(attachment, new CompatibleAttachment<>(attachment, positioning, null, false));
            return this;
        }

        public Builder withCompatibleAttachment(ItemAttachment<ItemMelee> attachment, boolean isDefault,
                                                BiConsumer<EntityLivingBase, ItemStack> positioning, Consumer<ModelBase> modelPositioning) {
            compatibleAttachments.put(attachment, new CompatibleAttachment<>(attachment, positioning, modelPositioning, isDefault));
            return this;
        }

        public Builder withCompatibleAttachment(ItemAttachment<ItemMelee> attachment, boolean isDefault,
                                                Consumer<ModelBase> positioner) {
            compatibleAttachments.put(attachment, new CompatibleAttachment<>(attachment, positioner, isDefault));
            return this;
        }

        public Builder withCraftingRecipe(Object... craftingRecipe) {
            this.craftingRecipe = craftingRecipe;
            return this;
        }

        public ItemMelee build(ModContext modContext) {

            if (name == null) {
                throw new IllegalStateException("Item name not provided");
            }

            if (heavyAttackSound == null) {
                heavyAttackSound = attackSound;
            }

            if (spawnEntityClass == null) {
                spawnEntityClass = WeaponSpawnEntity.class;
            }


            ItemMelee itemMelee = new ItemMelee(this, modContext);

            itemMelee.attackSound = this.attackSound != null ? modContext.registerSound(this.attackSound) : SoundEvents.AMBIENT_CAVE;
            itemMelee.heavyAttackSound = this.heavyAttackSound != null ? modContext.registerSound(this.heavyAttackSound) : SoundEvents.AMBIENT_CAVE;

            itemMelee.setCreativeTab(tab);
            itemMelee.setTranslationKey(name);

            modContext.registerMeleeWeapon(name, itemMelee, renderer);

            if (craftingRecipe != null && craftingRecipe.length >= 2) {
                ItemStack itemStack = new ItemStack(itemMelee);
                List<Object> registeredRecipe = modContext.getRecipeManager().registerShapedRecipe(itemMelee, craftingRecipe);
                boolean hasOres = Arrays.stream(craftingRecipe).anyMatch(r -> r instanceof String);
                if (hasOres) {
                    ForgeRegistries.RECIPES.register(new ShapedOreRecipe(null, itemStack, registeredRecipe.toArray()).setMirrored(false).setRegistryName(ID, itemStack.getItem().getTranslationKey() + "_recipe") /*TODO: temporary hack*/);
                } else {
                    ForgeRegistries.RECIPES.register(new ShapedOreRecipe(null, itemStack, registeredRecipe.toArray()).setMirrored(false).setRegistryName(ID, itemStack.getItem().getTranslationKey() + "_recipe"));
                }
            }
            return itemMelee;
        }
    }

    Builder builder;

    private final ModContext modContext;

    @Getter private SoundEvent attackSound;
    @Getter private SoundEvent heavyAttackSound;

    ItemMelee(Builder builder, ModContext modContext) {
        this.builder = builder;
        this.modContext = modContext;
        setMaxStackSize(1);
    }

    public String getName() {
        return builder.getName();
    }

    @Override
    public boolean onEntitySwing(@Nonnull EntityLivingBase entityLiving, @Nonnull ItemStack itemStack) {
        return true;
    }

    Map<ItemAttachment<ItemMelee>, CompatibleAttachment<ItemMelee>> getCompatibleAttachments() {
        return builder.compatibleAttachments;
    }


    public static boolean isActiveAttachment(PlayerMeleeInstance weaponInstance, ItemAttachment<ItemMelee> attachment) {
        return weaponInstance != null && MeleeAttachmentAspect.isActiveAttachment(attachment, weaponInstance);
    }

    @Override
    public int getMaxItemUseDuration(@Nonnull ItemStack itemStack) {
        return 0;
    }

    @Override
    public List<CompatibleAttachment<? extends AttachmentContainer>> getActiveAttachments(EntityLivingBase player, ItemStack itemStack) {
        return modContext.getMeleeAttachmentAspect().getActiveAttachments(player, itemStack);
    }

    public MeleeRenderer getRenderer() {
        return builder.renderer;
    }

    List<ItemAttachment<ItemMelee>> getCompatibleAttachments(Class<? extends ItemAttachment<ItemMelee>> target) {
        return builder.compatibleAttachments.keySet().stream()
                .filter(target::isInstance)
                .collect(Collectors.toList());
    }

    @Override
    public void addInformation(@Nonnull ItemStack itemStack, World worldIn, @Nonnull List<String> tooltip, ITooltipFlag flagIn) {
        final TextFormatting green = TextFormatting.GREEN;
        final TextFormatting grey = TextFormatting.GRAY;
        final TextFormatting red = TextFormatting.RED;
        final TextFormatting yellow = TextFormatting.YELLOW;

        final PlayerMeleeInstance playerMeleeInstance = Tags.getInstance(itemStack, PlayerMeleeInstance.class);

        final ArrayList<String> tooltipLines = new ArrayList<>();

        // Stats
        tooltipLines.add(green + "Damage: " + grey + builder.attackDamage);
        tooltipLines.add(green + "Damage (Heavy): " + grey + builder.heavyAttackDamage);

        // Debug
        if (flagIn.isAdvanced() && playerMeleeInstance != null && itemStack.getTagCompound() != null) {
            if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT)) {
                tooltipLines.add(red + "Logging NBT data, release left shift to stop");
                Tags.printTags(itemStack);
            } else {
                tooltipLines.add(yellow + "Press left shift to log NBT data");
            }
        }

        tooltip.addAll(tooltipLines);
    }

    @Override
    public void update(EntityPlayer player) {
        modContext.getMeleeAttackAspect().onUpdate(player);
        modContext.getMeleeAttachmentAspect().onUpdate(player);
//        modContext.getAttachmentAspect().updateMainHeldItem(player);
    }

//    public void tryFire(EntityPlayer player) {
//        modContext.getWeaponFireAspect().onFireButtonClick(player);
//    }
//
//    public void tryStopFire(EntityPlayer player) {
//        modContext.getWeaponFireAspect().onFireButtonRelease(player);
//    }

    @Override
    public PlayerMeleeInstance createItemInstance(final EntityLivingBase entityLivingBase, final ItemStack itemStack, final int slot) {
        final PlayerMeleeInstance instance = new PlayerMeleeInstance(slot, entityLivingBase, itemStack);

//        instance.setAmmo(Tags.getAmmo(itemStack)); // TODO: Get ammo properly
        instance.setState(MeleeState.READY);

        for (final CompatibleAttachment<ItemMelee> compatibleAttachment : ((ItemMelee) itemStack.getItem()).getCompatibleAttachments().values()) {
            final ItemAttachment<ItemMelee> attachment = compatibleAttachment.getAttachment();
            if (compatibleAttachment.isDefault() && attachment.getApply3() != null)
                attachment.getApply3().apply(attachment, instance);
        }

        return instance;
    }

    @Override
    public void toggleClientAttachmentSelectionMode(EntityPlayer player) {
        modContext.getMeleeAttachmentAspect().toggleClientAttachmentSelectionMode(player);
    }

//    @Override
//    public boolean onDroppedByPlayer(ItemStack itemStack, EntityPlayer player) {
//        // Server side only method
////        PlayerWeaponInstance instance = (PlayerWeaponInstance) Tags.getInstance(itemStack);
////        return instance == null || instance.getState() == WeaponState.READY;
//    }

    public String getTextureName() {
        return builder.textureNames.get(0);
    }

    public void attack(final EntityPlayer player, final boolean heavy) {
        if (heavy) {
            modContext.getMeleeAttackAspect().onHeavyAttackButtonClick(player);
        } else {
            modContext.getMeleeAttackAspect().onAttackButtonClick(player);
        }
    }

//    public Multimap getItemAttributeModifiers() {
//        Multimap multimap = super.getItemAttributeModifiers();
//        multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(),
//                new AttributeModifier(field_111210_e, "Weapon modifier", (double)builder.damage, 0));
//        return multimap;
//    }

    @Override
    public boolean hitEntity(@Nonnull ItemStack stack, @Nonnull EntityLivingBase target, @Nonnull EntityLivingBase player) {
        //target.attackEntityFrom(DamageSource.fall, builder.damage);
        PlayerItemInstance<?> instance = Tags.getInstance(stack);
        if (instance instanceof PlayerMeleeInstance) {
            LOGGER.debug("Player {} hits {} with {} in state {}", player, target, instance, instance.getState());
        }
        return true;
    }

    public float getDamage(boolean isHeavyAttack) {
        return isHeavyAttack ? builder.heavyAttackDamage : builder.attackDamage;
    }

    public long getPrepareStubTimeout() {
        return builder.prepareStubTimeout.get();
    }

    public long getPrepareHeavyStubTimeout() {
        return builder.prepareHeavyStubTimeout.get();
    }

    public long getAttackCooldownTimeout() {
        return builder.attackCooldownTimeout.get();
    }

    public long getHeavyAttackCooldownTimeout() {
        return builder.heavyAttackCooldownTimeout.get();
    }

    @Override
    public Collection<CompatibleAttachment<? extends AttachmentContainer>> getCompatibleAttachments(
            AttachmentCategory... categories) {
        Collection<CompatibleAttachment<ItemMelee>> c = builder.compatibleAttachments.values();
        List<AttachmentCategory> inputCategoryList = Arrays.asList(categories);
        return c.stream().filter(e -> inputCategoryList.contains(e)).collect(Collectors.toList());
    }

    // Todo: Remove this method once models are fixed to be at correct height
    @Override
    public boolean shouldCauseReequipAnimation(@Nonnull ItemStack oldStack, @Nonnull ItemStack newStack, boolean slotChanged) {
        return true;
    }
}
