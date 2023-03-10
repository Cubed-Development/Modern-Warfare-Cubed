package com.paneedah.weaponlib.melee;

import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.ItemAttachment.ApplyHandler2;
import com.paneedah.weaponlib.compatibility.CompatibleItem;
import com.paneedah.weaponlib.compatibility.CompatibleSound;
import com.paneedah.weaponlib.crafting.CraftingComplexity;
import com.paneedah.weaponlib.crafting.OptionsMetadata;
import net.minecraft.client.model.ModelBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import static com.paneedah.mwc.utils.ModReference.log;
import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class ItemMelee extends CompatibleItem implements
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

        private String modId;

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

        public Builder withModId(String modId) {
            this.modId = modId;
            return this;
        }

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
            if (modId == null) {
                throw new IllegalStateException("ModId is not set");
            }
            for (String textureName : textureNames) {
                this.textureNames.add(textureName.toLowerCase() + ".png");
            }
            return this;
        }

        public Builder withAttackSound(String attackSound) {
            if (modId == null) {
                throw new IllegalStateException("ModId is not set");
            }
            this.attackSound = attackSound.toLowerCase(); //modId + ":" + shootSound;
            return this;
        }

        public Builder withHeavyAttackSound(String heavyAttackSound) {
            if (modId == null) {
                throw new IllegalStateException("ModId is not set");
            }
            this.heavyAttackSound = heavyAttackSound.toLowerCase(); //modId + ":" + reloadSound;
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
            if (modId == null) {
                throw new IllegalStateException("ModId is not set");
            }

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

            itemMelee.attackSound = this.attackSound != null ?
                    modContext.registerSound(this.attackSound) : CompatibleSound.SNOWBALL_THROW;
            itemMelee.heavyAttackSound = this.heavyAttackSound != null ?
                    modContext.registerSound(this.heavyAttackSound) : CompatibleSound.SNOWBALL_THROW;

            itemMelee.setCreativeTab(creativeTab);
            itemMelee.setTranslationKey(name);

            modContext.registerMeleeWeapon(name, itemMelee, renderer);

            if(craftingRecipe != null && craftingRecipe.length >= 2) {
                ItemStack itemStack = new ItemStack(itemMelee);
                List<Object> registeredRecipe = modContext.getRecipeManager().registerShapedRecipe(itemMelee, craftingRecipe);
                boolean hasOres = Arrays.stream(craftingRecipe).anyMatch(r -> r instanceof String);
                if(hasOres) {
                    compatibility.addShapedOreRecipe(itemStack, registeredRecipe.toArray());
                } else {
                    compatibility.addShapedRecipe(itemStack, registeredRecipe.toArray());
                }
            } else if(craftingComplexity != null) {
                OptionsMetadata optionsMetadata = new OptionsMetadata.OptionMetadataBuilder()
                        .withSlotCount(9)
                        .build(craftingComplexity, Arrays.copyOf(craftingMaterials, craftingMaterials.length));

                List<Object> shape = modContext.getRecipeManager().createShapedRecipe(itemMelee, itemMelee.getName(), optionsMetadata);

                compatibility.addShapedRecipe(new ItemStack(itemMelee), shape.toArray());

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

    private CompatibleSound attackSound;
    private CompatibleSound silencedShootSound;
    private CompatibleSound heavyAttackSound;
    private CompatibleSound unloadSound;
    private CompatibleSound ejectSpentRoundSound;

    public static enum State { READY, SHOOTING, RELOAD_REQUESTED, RELOAD_CONFIRMED, UNLOAD_STARTED, UNLOAD_REQUESTED_FROM_SERVER, UNLOAD_CONFIRMED, PAUSED, MODIFYING, EJECT_SPENT_ROUND};

    ItemMelee(Builder builder, ModContext modContext) {
        this.builder = builder;
        this.modContext = modContext;
        setMaxStackSize(1);
    }

    public String getName() {
        return builder.name;
    }

    public CompatibleSound getShootSound() {
        return attackSound;
    }

    public CompatibleSound getSilencedShootSound() {
        return silencedShootSound;
    }

    public CompatibleSound getReloadSound() {
        return heavyAttackSound;
    }

    public CompatibleSound getUnloadSound() {
        return unloadSound;
    }

    public CompatibleSound getEjectSpentRoundSound() {
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
    public void addInformation(ItemStack itemStack, List<String> info, boolean flag) {
        if(info != null && builder.informationProvider != null) {
            info.addAll(builder.informationProvider.apply(itemStack));
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
            log.debug("Player {} hits {} with {} in state {}", player, target, instance, instance.getState());
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

    public CompatibleSound getHeavyAtackSound() {
        return heavyAttackSound;
    }

    public CompatibleSound getLightAtackSound() {
        return attackSound;
    }

    @Override
    public Collection<CompatibleAttachment<? extends AttachmentContainer>> getCompatibleAttachments(
            AttachmentCategory... categories) {
        Collection<CompatibleAttachment<ItemMelee>> c = builder.compatibleAttachments.values();
        List<AttachmentCategory> inputCategoryList = Arrays.asList(categories);
        return c.stream().filter(e -> inputCategoryList.contains(e)).collect(Collectors.toList());
    }
}
