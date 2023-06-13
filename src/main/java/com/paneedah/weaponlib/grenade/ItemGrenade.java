package com.paneedah.weaponlib.grenade;

import com.paneedah.mwc.utils.ModReference;
import com.paneedah.weaponlib.RenderableState;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.crafting.*;
import net.minecraft.client.model.ModelBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.oredict.ShapedOreRecipe;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ItemGrenade extends Item implements
PlayerItemInstanceFactory<PlayerGrenadeInstance, GrenadeState>, AttachmentContainer, Updatable, IModernCrafting {

    public static final int DEFAULT_FUSE_TIMEOUT = 3000;
    public static final float DEFAULT_EXPLOSION_STRENTH = 2f;
    public static final int EXPLODE_ON_IMPACT = -1;

    public static final float DEFAULT_GRAVITY_VELOCITY = 0.06f;
    public static final float DEFAULT_FAR_VELOCITY = 1.3f;
    public static final float DEFAULT_VELOCITY = 1.5f;
    public static final float DEFAULT_ROTATION_SLOWDOWN_FACTOR = 0.99f;

    public static final float DEFAULT_EFFECTIVE_RADIUS = 20f;
    public static final float DEFAULT_FRAGMENT_DAMAGE = 15f;
    public static final int DEFAULT_FRAGMENT_COUNT = 100;

    private CraftingEntry[] modernRecipe;
    private CraftingGroup craftGroup;

    @Override
    public CraftingEntry[] getModernRecipe() {
        return this.modernRecipe;
    }

    @Override
    public Item getItem() {
        return this;
    }

    @Override
    public CraftingGroup getCraftingGroup() {
        return this.craftGroup;
    }

    @Override
    public void setCraftingRecipe(CraftingEntry[] recipe) {
        this.modernRecipe = recipe;
    }

    @Override
    public void setCraftingGroup(CraftingGroup group) {
        this.craftGroup = group;
    }

    public static enum Type {
        REGULAR, SMOKE, GAS, FLASH
    }

    public static class Builder {

        protected String name;
        protected ModelBase model;
        protected String textureName;
        protected Consumer<ItemStack> entityPositioning;
        protected Consumer<ItemStack> inventoryPositioning;
        protected BiConsumer<EntityLivingBase, ItemStack> thirdPersonPositioning;
        protected BiConsumer<EntityLivingBase, ItemStack> firstPersonPositioning;
        protected BiConsumer<ModelBase, ItemStack> firstPersonModelPositioning;
        protected BiConsumer<ModelBase, ItemStack> thirdPersonModelPositioning;
        protected BiConsumer<ModelBase, ItemStack> inventoryModelPositioning;
        protected BiConsumer<ModelBase, ItemStack> entityModelPositioning;

        protected Consumer<RenderContext<RenderableState>> firstPersonLeftHandPositioning;
        protected Consumer<RenderContext<RenderableState>> firstPersonRightHandPositioning;

        protected Map<ItemAttachment<ItemGrenade>, CompatibleAttachment<ItemGrenade>> compatibleAttachments = new HashMap<>();

        private Supplier<Float> velocity = () -> DEFAULT_VELOCITY;
        private Supplier<Float> farVelocity = () -> DEFAULT_FAR_VELOCITY;
        private Supplier<Float> gravityVelocity = () -> DEFAULT_GRAVITY_VELOCITY;

        private int maxStackSize = 1;

        private int explosionTimeout = DEFAULT_FUSE_TIMEOUT;
        private float explosionStrength = DEFAULT_EXPLOSION_STRENTH;

        protected CreativeTabs tab;

        private CraftingComplexity craftingComplexity;
        private Object[] craftingMaterials;
        private int craftingCount = 1;

        private GrenadeRenderer renderer;
        List<String> textureNames = new ArrayList<>();
        private Supplier<Float> rotationSlowdownFactor = () -> DEFAULT_ROTATION_SLOWDOWN_FACTOR;

        private String bounceHardSound;
        private String bounceSoftSound;
        private String explosionSound;
        private String safetyPinOffSound;
        private String stopAfterThrowingSound;
        private String throwSound;
        private float effectiveRadius = DEFAULT_EFFECTIVE_RADIUS;
        private float fragmentDamage = DEFAULT_FRAGMENT_DAMAGE;
        private int fragmentCount = DEFAULT_FRAGMENT_COUNT;
        //private boolean smokeOnly;
        private Type type = Type.REGULAR;
        private long activeDuration;
        private Object[] craftingRecipe;
        private boolean isDestroyingBlocks = true;
        private CraftingEntry[] modernRecipe;
        private CraftingGroup craftingGroup;

        public Builder withModernRecipe(CraftingGroup group, CraftingEntry...is) {
            this.modernRecipe = is;
            this.craftingGroup = group;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withCreativeTab(CreativeTabs tab) {
            this.tab = tab;
            return this;
        }

        public Builder withModel(ModelBase model) {
            this.model = model;
            return this;
        }

        public Builder withVelocity(Supplier<Float> velocity) {
            this.velocity = velocity;
            return this;
        }

        public Builder withFarVelocity(Supplier<Float> farVelocity) {
            this.farVelocity = farVelocity;
            return this;
        }

        public Builder withGravityVelocity(Supplier<Float> gravityVelocity) {
            this.gravityVelocity = gravityVelocity;
            return this;
        }

        public Builder withRotationSlowdownFactor(Supplier<Float> rotationSlowdownFactor) {
            this.rotationSlowdownFactor = rotationSlowdownFactor;
            return this;
        }

        public Builder withExplosionStrength(float explosionStrength) {
            this.explosionStrength = explosionStrength;
            return this;
        }

        public Builder withExplosionTimeout(int explosionTimeout) {
            this.explosionTimeout = explosionTimeout;
            return this;
        }

        public Builder withExplosionOnImpact() {
            this.explosionTimeout = EXPLODE_ON_IMPACT;
            return this;
        }
        
        public Builder withDestroyingBlocks(boolean isDestroyingBlocks) {
            this.isDestroyingBlocks = isDestroyingBlocks;
            return this;
        }

//        public Builder withSmokeOnly() {
//            this.smokeOnly = true;
//            return this;
//        }
        
        public Builder withType(Type type) {
            this.type = type;
            return this;
        }

        public Builder withTextureNames(String... textureNames) {
            for (String textureName : textureNames) {
                this.textureNames.add(textureName.toLowerCase() + ".png");
            }
            return this;
        }

        public Builder withCompatibleAttachment(ItemAttachment<ItemGrenade> attachment, BiConsumer<EntityLivingBase, ItemStack> positioning) {
            compatibleAttachments.put(attachment, new CompatibleAttachment<>(attachment, positioning, null, true));
            return this;
        }

        public Builder withMaxStackSize(int maxStackSize) {
            this.maxStackSize = maxStackSize;
            return this;
        }

        public Builder withEntityPositioning(Consumer<ItemStack> entityPositioning) {
            this.entityPositioning = entityPositioning;
            return this;
        }

        public Builder withInventoryPositioning(Consumer<ItemStack> inventoryPositioning) {
            this.inventoryPositioning = inventoryPositioning;
            return this;
        }

        public  Builder withThirdPersonPositioning(BiConsumer<EntityLivingBase, ItemStack> thirdPersonPositioning) {
            this.thirdPersonPositioning = thirdPersonPositioning;
            return this;
        }

        public Builder withFirstPersonPositioning(BiConsumer<EntityLivingBase, ItemStack> firstPersonPositioning) {
            this.firstPersonPositioning = firstPersonPositioning;
            return this;
        }

        public Builder withFirstPersonModelPositioning(BiConsumer<ModelBase, ItemStack> firstPersonModelPositioning) {
            this.firstPersonModelPositioning = firstPersonModelPositioning;
            return this;
        }

        public Builder withEntityModelPositioning(BiConsumer<ModelBase, ItemStack> entityModelPositioning) {
            this.entityModelPositioning = entityModelPositioning;
            return this;
        }

        public Builder withInventoryModelPositioning(BiConsumer<ModelBase, ItemStack> inventoryModelPositioning) {
            this.inventoryModelPositioning = inventoryModelPositioning;
            return this;
        }

        public Builder withThirdPersonModelPositioning(BiConsumer<ModelBase, ItemStack> thirdPersonModelPositioning) {
            this.thirdPersonModelPositioning = thirdPersonModelPositioning;
            return this;
        }

        public Builder withFirstPersonHandPositioning(
                Consumer<RenderContext<RenderableState>> leftHand,
                Consumer<RenderContext<RenderableState>> rightHand)
        {
            this.firstPersonLeftHandPositioning = leftHand;
            this.firstPersonRightHandPositioning = rightHand;
            return this;
        }

        public Builder withRenderer(GrenadeRenderer renderer) {
            this.renderer = renderer;
            return this;
        }

        public Builder withCrafting(CraftingComplexity craftingComplexity, Object...craftingMaterials) {
            return withCrafting(1, craftingComplexity, craftingMaterials);
        }

        public Builder withCrafting(int craftingCount, CraftingComplexity craftingComplexity, Object...craftingMaterials) {
            if(craftingComplexity == null) {
                throw new IllegalArgumentException("Crafting complexity not set");
            }
            if(craftingMaterials.length < 2) {
                throw new IllegalArgumentException("2 or more materials required for crafting");
            }
            if(craftingCount == 0) {
                throw new IllegalArgumentException("Invalid item count");
            }
            this.craftingComplexity = craftingComplexity;
            this.craftingMaterials = craftingMaterials;
            this.craftingCount = craftingCount;
            return this;
        }

        public Builder withCraftingRecipe(Object...craftingRecipe) {
            this.craftingRecipe = craftingRecipe;
            return this;
        }

        public Builder withBounceHardSound(String sound) {
            this.bounceHardSound = sound != null ? sound.toLowerCase() : null;
            return this;
        }

        public Builder withBounceSoftSound(String sound) {
            this.bounceSoftSound = sound != null ? sound.toLowerCase() : null;
            return this;
        }

        public Builder withExplosionSound(String sound) {
            this.explosionSound = sound != null ? sound.toLowerCase() : null;
            return this;
        }

        public Builder withSafetyPinOffSound(String sound) {
            this.safetyPinOffSound = sound != null ? sound.toLowerCase() : null;
            return this;
        }

        public Builder withThrowSound(String sound) {
            this.throwSound = sound != null ? sound.toLowerCase() : null;
            return this;
        }

        public Builder withStopAfterThrowingSond(String sound) {
            this.stopAfterThrowingSound = sound != null ? sound.toLowerCase() : null;
            return this;
        }

        public Builder withEffectiveRadius(float effectiveRadius) {
            this.effectiveRadius = effectiveRadius;
            return this;
        }

        public Builder withFragmentDamage(float fragmentDamage) {
            this.fragmentDamage = fragmentDamage;
            return this;
        }

        public Builder withFragmentCount(int fragmentCount) {
            this.fragmentCount = fragmentCount;
            return this;
        }

        public Builder withActiveDuration(long duration) {
            this.activeDuration = duration;
            return this;
        }

        public ItemGrenade build(ModContext modContext) {
            ItemGrenade grenade = new ItemGrenade(this, modContext);
            grenade.setTranslationKey(ModReference.ID + "_" + name);
            grenade.setCreativeTab(tab);
            grenade.maxStackSize = maxStackSize;

            grenade.setCraftingGroup(craftingGroup);
            grenade.setCraftingRecipe(modernRecipe);

            CraftingRegistry.registerHook(grenade);

            if(this.bounceHardSound != null) {
                grenade.bounceHardSound = modContext.registerSound(this.bounceHardSound);
            }

            if(this.bounceSoftSound != null) {
                grenade.bounceSoftSound = modContext.registerSound(this.bounceSoftSound);
            }

            if(this.explosionSound != null) {
                grenade.explosionSound = modContext.registerSound(this.explosionSound);
            }

            if(this.safetyPinOffSound != null) {
                grenade.safetyPinOffSound = modContext.registerSound(this.safetyPinOffSound);
            }

            if(this.throwSound != null) {
                grenade.throwSound = modContext.registerSound(this.throwSound);
            }

            if(this.stopAfterThrowingSound != null) {
                grenade.stopAfterThrowingSound = modContext.registerSound(this.stopAfterThrowingSound);
            }

            modContext.registerGrenadeWeapon(name, grenade, renderer);

            if(craftingRecipe != null && craftingRecipe.length >= 2) {
                modContext.getRecipeManager().registerShapedRecipe(grenade, craftingRecipe);
            } else if(craftingComplexity != null) {
                OptionsMetadata optionsMetadata = new OptionsMetadata.OptionMetadataBuilder()
                    .withSlotCount(9)
                    .build(craftingComplexity, Arrays.copyOf(craftingMaterials, craftingMaterials.length));

                List<Object> shape = modContext.getRecipeManager().createShapedRecipe(grenade, name, optionsMetadata);

                ItemStack itemStack = new ItemStack(grenade);
                itemStack.setCount(craftingCount);
                if(optionsMetadata.hasOres()) {
                    ForgeRegistries.RECIPES.register(new ShapedOreRecipe(null, itemStack, shape.toArray()).setMirrored(false).setRegistryName(ModReference.ID, itemStack.getItem().getTranslationKey() + "_recipe") /*TODO: temporary hack*/);
                } else {
                    ForgeRegistries.RECIPES.register(new ShapedOreRecipe(null, itemStack, shape.toArray()).setMirrored(false).setRegistryName(ModReference.ID, itemStack.getItem().getTranslationKey() + "_recipe"));
                }
            } else {
                //throw new IllegalStateException("No recipe defined for attachment " + name);
                //System.err.println("!!!No recipe defined for grenade " + name);
            }

            return grenade;
        }


        static String addFileExtension(String s, String ext) {
            return s != null && !s.endsWith(ext) ? s + ext : s;
        }

        protected static String stripFileExtension(String str, String extension) {
            return str.endsWith(extension) ? str.substring(0, str.length() - extension.length()) : str;
        }
    }

    Builder builder;
    private ModContext modContext;
    private SoundEvent bounceHardSound;
    private SoundEvent bounceSoftSound;
    private SoundEvent explosionSound;
    private SoundEvent safetyPinOffSound;
    private SoundEvent throwSound;
    private SoundEvent stopAfterThrowingSound;

    public ItemGrenade(Builder builder, ModContext modContext) {
        this.builder = builder;
        this.modContext = modContext;
        this.maxStackSize = 16;
    }


    public GrenadeRenderer getRenderer() {
        return builder.renderer;
    }

    public String getTextureName() {
        return builder.textureNames.get(0);
    }

    public boolean hasSafetyPin() {
        return builder.explosionTimeout > 0;
    }

    public List<CompatibleAttachment<? extends AttachmentContainer>> getActiveAttachments(EntityLivingBase player,
            ItemStack itemStack) {
        return new ArrayList<>(builder.compatibleAttachments.values());
    }

    Map<ItemAttachment<ItemGrenade>, CompatibleAttachment<ItemGrenade>> getCompatibleAttachments() {
        return builder.compatibleAttachments;
    }

    public String getName() {
        return builder.name;
    }

    @Override
    public PlayerGrenadeInstance createItemInstance(EntityLivingBase player, ItemStack itemStack, int slot) {
        PlayerGrenadeInstance instance = new PlayerGrenadeInstance(slot, player, itemStack);
        instance.setState(GrenadeState.READY);
        return instance;
    }

    public void attack(EntityPlayer player, boolean throwingFar) {
        modContext.getGrenadeAttackAspect().onAttackButtonClick(player, throwingFar);
    }


    public void attackUp(EntityPlayer player, boolean throwingFar) {
        modContext.getGrenadeAttackAspect().onAttackButtonUp(player, throwingFar);
    }

    @Override
    public void update(EntityPlayer player) {
        modContext.getGrenadeAttackAspect().onUpdate(player);
    }

    public float getExplosionStrength() {
        return builder.explosionStrength;
    }

    public int getExplosionTimeout() {
        return builder.explosionTimeout;
    }

    public long getThrowTimeout() {
        return 200;
    }

    public long getTotalTakeSafetyPinOffDuration() {
        return builder.renderer.getTotalTakingSafetyPinOffDuration();
    }

    public long getReequipTimeout() {
        return 800;
    }

    public double getTotalThrowingDuration() {
        return builder.renderer.getTotalThrowingDuration();
    }

    public float getVelocity() {
        return builder.velocity.get();
    }

    public float getFarVelocity() {
        return builder.farVelocity.get();
    }

    public float getGravityVelocity() {
        return builder.gravityVelocity.get();
    }

    public float getRotationSlowdownFactor() {
        return builder.rotationSlowdownFactor.get();
    }

    public SoundEvent getBounceHardSound() {
        return bounceHardSound;
    }

    public SoundEvent getBounceSoftSound() {
        return bounceSoftSound;
    }

    public SoundEvent getExplosionSound() {
        return explosionSound;
    }

    public SoundEvent getSafetyPinOffSound() {
        return safetyPinOffSound;
    }

    public SoundEvent getThrowSound() {
        return throwSound;
    }

    public SoundEvent getStopAfterThrowingSound() {
        return stopAfterThrowingSound;
    }

    public float getEffectiveRadius() {
        return builder.effectiveRadius;
    }

    public float getFragmentDamage() {
        return builder.fragmentDamage;
    }

    public int getFragmentCount() {
        return builder.fragmentCount;
    }

    public boolean isDestroyingBlocks() {
        return builder.isDestroyingBlocks;
    }
    
    public Type getType() {
        return builder.type;
    }

    public long getActiveDuration() {
        return builder.activeDuration;
    }

    @Override
    public Collection<CompatibleAttachment<? extends AttachmentContainer>> getCompatibleAttachments(
            AttachmentCategory... categories) {
        Collection<CompatibleAttachment<ItemGrenade>> c = builder.compatibleAttachments.values();
        List<AttachmentCategory> inputCategoryList = Arrays.asList(categories);
        return c.stream().filter(e -> inputCategoryList.contains(e)).collect(Collectors.toList());
    }

    // Todo: Remove this method once models are fixed to be at correct height
    @Override
    public boolean shouldCauseReequipAnimation(ItemStack oldStack, ItemStack newStack, boolean slotChanged) {
        return true;
    }
}
