package com.paneedah.weaponlib.melee;

import com.paneedah.mwc.utils.ModReference;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.ItemAttachment.ApplyHandler2;
import com.paneedah.weaponlib.crafting.CraftingComplexity;
import com.paneedah.weaponlib.crafting.OptionsMetadata;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.oredict.ShapedOreRecipe;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import static com.paneedah.mwc.utils.ModReference.LOG;

public class ItemMelee extends Item implements
PlayerItemInstanceFactory<PlayerMeleeInstance, MeleeState>, AttachmentContainer, Modifiable, Updatable {

    public static class Builder {

        private static final int DEFAULT_PREPARE_STUB_TIMEOUT = 100;

        private static final int DEFAULT_ATTACK_COOLDOWN_TIMEOUT = 500;
        private static final int DEFAULT_HEAVY_ATTACK_COOLDOWN_TIMEOUT = 1000;

        String name;
        List<String> textureNames = new ArrayList<>();

        private String attackSound;
        private String heavyAttackSound;

        private CreativeTabs creativeTab;
        private MeleeRenderer renderer;

        Map<ItemAttachment<ItemMelee>, CompatibleAttachment<ItemMelee>> compatibleAttachments = new HashMap<>();

        private Class<? extends WeaponSpawnEntity> spawnEntityClass;
        ImpactHandler blockImpactHandler;

        private Function<ItemStack, List<String>> informationProvider;

        private CraftingComplexity craftingComplexity;

        private Object[] craftingMaterials;
        public float attackDamage = 1f;
        public float heavyAttackDamage = 2f;
        public Supplier<Integer> prepareStubTimeout = () -> DEFAULT_PREPARE_STUB_TIMEOUT;
        public Supplier<Integer> prepareHeavyStubTimeout = () -> DEFAULT_PREPARE_STUB_TIMEOUT;

        public Supplier<Integer> attackCooldownTimeout = () -> DEFAULT_ATTACK_COOLDOWN_TIMEOUT;
        public Supplier<Integer> heavyAttackCooldownTimeout = () -> DEFAULT_HEAVY_ATTACK_COOLDOWN_TIMEOUT;

        private Object[] craftingRecipe;

        public Builder withInformationProvider(Function<ItemStack, List<String>> informationProvider) {
            this.informationProvider = informationProvider;
            return this;
        }

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

        public Builder withName(String name) {
            this.name = name;
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
            this.attackSound = attackSound.toLowerCase(); //ModReference.id + ":" + shootSound;
            return this;
        }

        public Builder withHeavyAttackSound(String heavyAttackSound) {
            this.heavyAttackSound = heavyAttackSound.toLowerCase(); //ModReference.id + ":" + reloadSound;
            return this;
        }

        public Builder withCreativeTab(CreativeTabs creativeTab) {
            this.creativeTab = creativeTab;
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

        public Builder withCrafting(CraftingComplexity craftingComplexity, Object...craftingMaterials) {
            if(craftingComplexity == null) {
                throw new IllegalArgumentException("Crafting complexity not set");
            }
            if(craftingMaterials.length < 2) {
                throw new IllegalArgumentException("2 or more materials required for crafting");
            }
            this.craftingComplexity = craftingComplexity;
            this.craftingMaterials = craftingMaterials;
            return this;
        }

        public Builder withCraftingRecipe(Object...craftingRecipe) {
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

            itemMelee.setCreativeTab(creativeTab);
            itemMelee.setTranslationKey(name);

            modContext.registerMeleeWeapon(name, itemMelee, renderer);

            if(craftingRecipe != null && craftingRecipe.length >= 2) {
                ItemStack itemStack = new ItemStack(itemMelee);
                List<Object> registeredRecipe = modContext.getRecipeManager().registerShapedRecipe(itemMelee, craftingRecipe);
                boolean hasOres = Arrays.stream(craftingRecipe).anyMatch(r -> r instanceof String);
                if(hasOres) {
                    ForgeRegistries.RECIPES.register(new ShapedOreRecipe(null, itemStack, registeredRecipe.toArray()).setMirrored(false).setRegistryName(ModReference.ID, itemStack.getItem().getTranslationKey() + "_recipe") /*TODO: temporary hack*/);
                } else {
                    ForgeRegistries.RECIPES.register(new ShapedOreRecipe(null, itemStack, registeredRecipe.toArray()).setMirrored(false).setRegistryName(ModReference.ID, itemStack.getItem().getTranslationKey() + "_recipe"));
                }
            } else if(craftingComplexity != null) {
                OptionsMetadata optionsMetadata = new OptionsMetadata.OptionMetadataBuilder()
                        .withSlotCount(9)
                        .build(craftingComplexity, Arrays.copyOf(craftingMaterials, craftingMaterials.length));

                List<Object> shape = modContext.getRecipeManager().createShapedRecipe(itemMelee, itemMelee.getName(), optionsMetadata);

                ForgeRegistries.RECIPES.register(new ShapedOreRecipe(null, new ItemStack(itemMelee), shape.toArray()).setMirrored(false).setRegistryName(ModReference.ID, new ItemStack(itemMelee).getItem().getTranslationKey() + "_recipe"));

            } else {
                //throw new IllegalStateException("No recipe defined for attachment " + name);
                //System.err.println("!!!No recipe defined for melee weapon " + name);
            }
            return itemMelee;
        }
    }

    static final long MAX_RELOAD_TIMEOUT_TICKS = 60;
    static final long MAX_UNLOAD_TIMEOUT_TICKS = 60;

    Builder builder;

    private ModContext modContext;

    private SoundEvent attackSound;
    private SoundEvent silencedShootSound;
    private SoundEvent heavyAttackSound;
    private SoundEvent unloadSound;
    private SoundEvent ejectSpentRoundSound;

    public static enum State { READY, SHOOTING, RELOAD_REQUESTED, RELOAD_CONFIRMED, UNLOAD_STARTED, UNLOAD_REQUESTED_FROM_SERVER, UNLOAD_CONFIRMED, PAUSED, MODIFYING, EJECT_SPENT_ROUND};

    ItemMelee(Builder builder, ModContext modContext) {
        this.builder = builder;
        this.modContext = modContext;
        setMaxStackSize(1);
    }

    public String getName() {
        return builder.name;
    }

    public SoundEvent getShootSound() {
        return attackSound;
    }

    public SoundEvent getSilencedShootSound() {
        return silencedShootSound;
    }

    public SoundEvent getReloadSound() {
        return heavyAttackSound;
    }

    public SoundEvent getUnloadSound() {
        return unloadSound;
    }

    public SoundEvent getEjectSpentRoundSound() {
        return ejectSpentRoundSound;
    }

    @Override
    public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack itemStack) {
        return true;
    }

    @Override
    public void onUpdate(ItemStack itemStack, World world, Entity entity, int p_77663_4_, boolean active) {
    }


    Map<ItemAttachment<ItemMelee>, CompatibleAttachment<ItemMelee>> getCompatibleAttachments() {
        return builder.compatibleAttachments;
    }


    public static boolean isActiveAttachment(PlayerMeleeInstance weaponInstance, ItemAttachment<ItemMelee> attachment) {
        return weaponInstance != null ?
                MeleeAttachmentAspect.isActiveAttachment(attachment, weaponInstance) : false;
    }

    @Override
    public int getMaxItemUseDuration(ItemStack itemStack) {
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
        return builder.compatibleAttachments.entrySet().stream()
                .filter(e -> target.isInstance(e.getKey()))
                .map(e -> e.getKey())
                .collect(Collectors.toList());
    }

    @Override
    public void addInformation(ItemStack itemStack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        if(tooltip != null && builder.informationProvider != null) {
            tooltip.addAll(builder.informationProvider.apply(itemStack));
        }
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
    public PlayerMeleeInstance createItemInstance(EntityLivingBase player, ItemStack itemStack, int slot){
        PlayerMeleeInstance instance = new PlayerMeleeInstance(slot, player, itemStack);
        //state.setAmmo(Tags.getAmmo(itemStack)); // TODO: get ammo properly
        instance.setState(MeleeState.READY);

        for(CompatibleAttachment<ItemMelee> compatibleAttachment: ((ItemMelee) itemStack.getItem()).getCompatibleAttachments().values()) {
            ItemAttachment<ItemMelee> attachment = compatibleAttachment.getAttachment();
            if(compatibleAttachment.isDefault() && attachment.getApply3() != null) {
                attachment.getApply3().apply(attachment, instance);
            }
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

    public ApplyHandler2<ItemMelee> getEquivalentHandler(AttachmentCategory attachmentCategory) {
        // TODO Auto-generated method stub
        return null;
    }

    public void attack(EntityPlayer player, boolean heavy) {
        if(heavy) {
            modContext.getMeleeAttackAspect().onAttackButtonClick(player);
        } else {
            modContext.getMeleeAttackAspect().onHeavyAttackButtonClick(player);
        }
    }

//    @SuppressWarnings({ "rawtypes", "unchecked", "deprecation" })
//    public Multimap getItemAttributeModifiers() {
//        Multimap multimap = super.getItemAttributeModifiers();
//        multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(),
//                new AttributeModifier(field_111210_e, "Weapon modifier", (double)builder.damage, 0));
//        return multimap;
//    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase player) {
        //target.attackEntityFrom(DamageSource.fall, builder.damage);
        PlayerItemInstance<?> instance = Tags.getInstance(stack);
        if(instance instanceof PlayerMeleeInstance) {
            LOG.debug("Player {} hits {} with {} in state {}", player, target, instance, instance.getState());
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

    public SoundEvent getHeavyAtackSound() {
        return heavyAttackSound;
    }

    public SoundEvent getLightAtackSound() {
        return attackSound;
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
    public boolean shouldCauseReequipAnimation(ItemStack oldStack, ItemStack newStack, boolean slotChanged) {
        return true;
    }
}
