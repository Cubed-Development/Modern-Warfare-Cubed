package com.paneedah.weaponlib.ai;

import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.config.ModernConfigManager;
import lombok.Getter;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAITasks;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.regex.Pattern;

import static com.paneedah.mwc.ProjectConstants.ID;
import static com.paneedah.mwc.ProjectConstants.LOGGER;

public class EntityConfiguration {

    private static final int DEFAULT_TRACKING_RANGE = 64;
    private static final int DEFAULT_UPDATE_FREQUENCY = 3;
    private static final int DEFAULT_MAX_HEALTH = 20;
    private static final double DEFAULT_MAX_SPEED = 0.25;
    private static final double DEFAULT_FOLLOW_RANGE = 35;
    private static final double DEFAULT_COLLISION_ATTACK_DAMAGE = 3.0;
    private static final float DEFAULT_MAX_TOLERABLE_LIGHT_BRIGHTNESS = 1f;
    private static final float DEFAULT_PRIMARY_EQUIPMENT_DROP_CHANCE = 0.5f;
    private static final float DEFAULT_SECONDARY_EQUIPMENT_DROP_CHANCE = 0.25f;
    private static final float DEFAULT_ARMOR_DROP_CHANCE = 0.25f;

    private static final int DEFAULT_MAX_AMMO = 36000;

    private static class AiTask {
        int priority;
        Function<EntityLiving, EntityAIBase> taskSupplier;
    }

    public static class Equipment {
        Item item;
        List<ItemAttachment<?>> attachments;
    }

    static class TexturedModel {
        String modelClassName;
        ModelBiped model;
        private String textureName;
        ResourceLocation textureResource;
    }


    public static class Builder {

        private static final Pattern PATTERN = Pattern.compile(", ");

        private static class Spawn {
            int weightedProb;
            int min;
            int max;
            BiomeDictionary.Type[] biomeTypes;

            public Spawn(int weightedProb, int min, int max, BiomeDictionary.Type[] biomeTypes) {
                this.weightedProb = weightedProb;
                this.min = min;
                this.max = max;
                this.biomeTypes = biomeTypes;
            }
        }

        private static class EquipmentValue {
            Equipment equipment;
            float weight;

            public EquipmentValue(Equipment equipment, float weight) {
                this.equipment = equipment;
                this.weight = weight;
            }

        }

        private static class EquipmentKey {
            EnumDifficulty difficulty;
            Item item;
            ItemAttachment<?>[] attachments;

            public EquipmentKey(EnumDifficulty difficulty, Item item, ItemAttachment<?>[] attachments) {
                this.difficulty = difficulty;
                this.item = item;
                this.attachments = attachments;
            }

            @Override
            public int hashCode() {
                final int prime = 31;
                int result = 1;
                result = prime * result + Arrays.hashCode(attachments);
                result = prime * result + ((difficulty == null) ? 0 : difficulty.hashCode());
                result = prime * result + ((item == null) ? 0 : item.hashCode());
                return result;
            }

            @Override
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null) {
                    return false;
                }
                if (getClass() != obj.getClass()) {
                    return false;
                }
                EquipmentKey other = (EquipmentKey) obj;
                if (!Arrays.equals(attachments, other.attachments)) {
                    return false;
                }
                if (difficulty != other.difficulty) {
                    return false;
                }
                if (item == null) {
                    return other.item == null;
                } else
                    return item.equals(other.item);
            }

        }

        private Supplier<Integer> entityIdSupplier;
        private final Map<EquipmentKey, EquipmentValue> equipmentOptions = new HashMap<>();
        private final Map<EquipmentKey, EquipmentValue> secondaryEquipmentOptions = new HashMap<>();


        private Class<? extends Entity> baseClass;
        private final List<Spawn> spawns = new ArrayList<>();

        private final List<AiTask> aiTasks = new ArrayList<>();
        private final List<AiTask> aiTargetTasks = new ArrayList<>();

        private final List<TexturedModel> texturedModelVariants = new ArrayList<>();

        private String name;
        private String ambientSound;
        private String hurtSound;
        private String deathSound;
        private String stepSound;
        private ResourceLocation lootTable;

        private Predicate<Entity> canSpawnHere;
        private Predicate<Entity> isValidLightLevel = e -> e.world.rand.nextFloat() > 0.5f;

        private float maxTolerableLightBrightness = DEFAULT_MAX_TOLERABLE_LIGHT_BRIGHTNESS;

        private EnumCreatureAttribute creatureAttribute = EnumCreatureAttribute.UNDEFINED;


        private float sizeWidth = 0.6F;
        private float sizeHeight = 1.99F;

        private double maxHealth = DEFAULT_MAX_HEALTH;

        private double maxSpeed = DEFAULT_MAX_SPEED;

        private double followRange = DEFAULT_FOLLOW_RANGE;

        private double collisionAttackDamage = DEFAULT_COLLISION_ATTACK_DAMAGE;

        private boolean spawnEgg;
        private int primaryEggColor;
        private int secondaryEggColor;
        private final Map<EntityEquipmentSlot, CustomArmor> armor = new HashMap<>();

        private float primaryEquipmentDropChance = DEFAULT_PRIMARY_EQUIPMENT_DROP_CHANCE;
        private float secondaryEquipmentDropChance = DEFAULT_SECONDARY_EQUIPMENT_DROP_CHANCE;
        private float armorDropChance = DEFAULT_ARMOR_DROP_CHANCE;

        private int maxAmmo = DEFAULT_MAX_AMMO;

        private CustomMobAttack collisionAttack;
        private CustomMobAttack delayedAttack;

        private boolean isPushable = true;
        private boolean isInvulnerable = false;
        private boolean isCollidable = true;
        private boolean isDespawnable = true;

        private float lookHeightMultiplier;

        private int pickupItemID = -1;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withBaseClass(Class<? extends Entity> baseClass) {
            this.baseClass = baseClass;
            return this;
        }

        public Builder withPickupItemID(int item) {
            pickupItemID = item;
            return this;
        }

        public Builder withCreatureAttribute(EnumCreatureAttribute creatureAttribute) {
            this.creatureAttribute = creatureAttribute;
            return this;
        }

        public Builder withMaxTolerableLightBrightness(float maxTolerableLightBrightness) {
            this.maxTolerableLightBrightness = maxTolerableLightBrightness;
            return this;
        }

        public Builder withEntityIdSupplier(Supplier<Integer> entityIdSupplier) {
            this.entityIdSupplier = entityIdSupplier;
            return this;
        }

        public Builder withEquipmentOption(Item item, EnumDifficulty difficultyLevel, float weight, ItemAttachment<?>... attachments) {
            withEquipmentOption(equipmentOptions, item, difficultyLevel, weight, attachments);
            return this;
        }

        public Builder withSecondaryEquipmentOption(Item item, EnumDifficulty difficultyLevel, float weight, ItemAttachment<?>... attachments) {
            withEquipmentOption(secondaryEquipmentOptions, item, difficultyLevel, weight, attachments);
            return this;
        }

        public Builder withSize(float width, float height) {
            sizeWidth = width;
            sizeHeight = height;
            return this;
        }

        public Builder withLookHeightMulitplier(float multiplier) {
            lookHeightMultiplier = multiplier;
            return this;
        }

        private Builder withEquipmentOption(Map<EquipmentKey, EquipmentValue> equipmentOptions, Item item, EnumDifficulty difficultyLevel, float weight, ItemAttachment<?>... attachments) {
            if (item == null) {
                LOGGER.warn("Attempted to configure entity equipment with null item");
                return this;
            }
            Equipment equipment = new Equipment();
            equipment.item = item;
            equipment.attachments = Arrays.asList(attachments);
            EnumDifficulty[] difficultyValues = EnumDifficulty.values();
            for (int i = difficultyLevel.ordinal(); i < difficultyValues.length; i++) {
                equipmentOptions.put(new EquipmentKey(difficultyValues[i], equipment.item, attachments),
                        new EquipmentValue(equipment, weight));
            }
            return this;
        }

        public Builder withPrimaryEquipmentDropChance(float chance) {
            primaryEquipmentDropChance = chance;
            return this;
        }

        public Builder withSecondaryEquipmentDropChance(float chance) {
            secondaryEquipmentDropChance = chance;
            return this;
        }

        public Builder withArmor(CustomArmor armor) {
            this.armor.put(armor.getCompatibleEquipmentSlot(), armor);
            return this;
        }

        public Builder withArmorDropChance(float chance) {
            armorDropChance = chance;
            return this;
        }

        public Builder withSpawn(int weightedProb, int min, int max, BiomeDictionary.Type... biomeTypes) {
            spawns.add(new Spawn(weightedProb, min, max, biomeTypes));
            return this;
        }

        public Builder withTexturedModelVariant(String modelClassName, String texture) {
            TexturedModel tm = new TexturedModel();
            tm.modelClassName = modelClassName;
            tm.textureName = texture;
            texturedModelVariants.add(tm);
            return this;
        }

        public Builder withAiTask(int priority, Function<EntityLiving, EntityAIBase> taskSupplier) {
            AiTask task = new AiTask();
            task.priority = priority;
            task.taskSupplier = taskSupplier;
            aiTasks.add(task);
            return this;
        }

        public Builder withAiTargetTask(int priority, Function<EntityLiving, EntityAIBase> taskSupplier) {
            AiTask task = new AiTask();
            task.priority = priority;
            task.taskSupplier = taskSupplier;
            aiTargetTasks.add(task);
            return this;
        }

        public Builder withAmbientSound(String sound) {
            ambientSound = sound.toLowerCase();
            return this;
        }

        public Builder withHurtSound(String sound) {
            hurtSound = sound.toLowerCase();
            return this;
        }

        public Builder withDeathSound(String sound) {
            deathSound = sound.toLowerCase();
            return this;
        }

        public Builder withStepSound(String sound) {
            stepSound = sound.toLowerCase();
            return this;
        }

        public Builder withLootTable(ResourceLocation lootTable) {
            this.lootTable = lootTable;
            return this;
        }

        public Builder withMaxHealth(double maxHealth) {
            this.maxHealth = maxHealth;
            return this;
        }

        public Builder withMaxSpeed(double maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Builder withFollowRange(double followRange) {
            this.followRange = followRange;
            return this;
        }

        public Builder withCollisionAttackDamage(double collisionAttackDamage) {
            this.collisionAttackDamage = collisionAttackDamage;
            return this;
        }

        public Builder withSpawnLocationPredicate(Predicate<Entity> canSpawnHere) {
            this.canSpawnHere = canSpawnHere;
            return this;
        }

        public Builder withSpawnLightLevelPredicate(Predicate<Entity> isValidLightLevel) {
            this.isValidLightLevel = isValidLightLevel;
            return this;
        }

        public Builder withSpawnEgg(int primaryEggColor, int secondaryEggColor) {
            spawnEgg = true;
            this.primaryEggColor = primaryEggColor;
            this.secondaryEggColor = secondaryEggColor;
            return this;
        }

        public Builder withMaxAmmo(int maxAmmo) {
            this.maxAmmo = maxAmmo;
            return this;
        }

        public Builder withCollisionAttack(CustomMobAttack collisionAttack) {
            this.collisionAttack = collisionAttack;
            return this;
        }

        public Builder withDelayedAttack(CustomMobAttack delayedAttack) {
            this.delayedAttack = delayedAttack;
            return this;
        }

        public Builder withPushability(boolean isPushable) {
            this.isPushable = isPushable;
            return this;
        }

        public Builder withCollidability(boolean isCollidable) {
            this.isCollidable = isCollidable;
            return this;
        }

        public Builder withDespawnability(boolean isDespawnable) {
            this.isDespawnable = isDespawnable;
            return this;
        }

        public Builder withInvulnerability() {
            isInvulnerable = true;
            return this;
        }

        public void register(ModContext context) {
            EntityConfiguration configuration = new EntityConfiguration();
            configuration.creatureAttribute = creatureAttribute;
            configuration.aiTasks = aiTasks;
            configuration.aiTargetTasks = aiTargetTasks;
            configuration.collisionAttack = collisionAttack;
            configuration.delayedAttack = delayedAttack;
            configuration.mobName = name;

            int modEntityId = entityIdSupplier.get().intValue();
            String entityName = name != null ? name : baseClass.getSimpleName() + "Ext" + modEntityId;

            //TODO: Remove this and actually have a proper way to register entities
            //     This is just a temporary solution to resolve the NPE
            //Obsolete?


            WeightedOptions.Builder<EnumDifficulty, Equipment> equipmentOptionsBuilder = new WeightedOptions.Builder<>();
            if (ModernConfigManager.terroristEquipmentConfiguration == null || ModernConfigManager.terroristEquipmentConfiguration.isEmpty()) {
                equipmentOptions.forEach((key, value) -> equipmentOptionsBuilder.withOption(value.equipment, key.difficulty, value.weight));

            } else {
                Map<EquipmentKey, EquipmentValue> equipmentOptions = new HashMap<>();

                EnumDifficulty difficultyLevel = EnumDifficulty.EASY;
                EnumDifficulty[] difficultyValues = EnumDifficulty.values();

                String[] attachments = PATTERN.split(ModernConfigManager.terroristEquipmentConfiguration);
                for (String attachment : attachments) {
                    String[] parts = attachment.split(":");
                    if (parts.length < 2) {
                        LOGGER.warn("Invalid attachment configuration for entity " + name + ": " + attachment + ". Expected format: <gunId>:<weight>[:<attachment>...]");
                        continue;
                    }

                    String gunId = parts[0];
                    double weight;
                    try {
                        weight = Double.parseDouble(parts[1]);
                    } catch (NumberFormatException e) {
                        LOGGER.warn("Invalid weight for gun " + name + ": " + parts[1] + ". Expected a valid double.");
                        continue;
                    }

                    Item gun = Item.REGISTRY.getObject(new ResourceLocation(ID, gunId));
                    if (gun == null) {
                        LOGGER.warn("Invalid equipment for entity " + name + ": " + gunId + ". Expected a valid item.");
                        continue;
                    }

                    Equipment equipment = new Equipment();
                    switch (name) {
                        case "turret":
                            equipment.item = Item.REGISTRY.getObject(new ResourceLocation(ID, "turretgun"));
                            break;
                        case "turretupgraded":
                            equipment.item = Item.REGISTRY.getObject(new ResourceLocation(ID, "turretgunupgraded"));
                            break;
                        case "turretsilenced":
                            equipment.item = Item.REGISTRY.getObject(new ResourceLocation(ID, "turretgunsilenced"));
                            break;
                        default:
                            equipment.item = gun;
                    }
                    equipment.attachments = new ArrayList<>();

                    if (parts.length >= 3) {
                        for (String attachmentId : Arrays.asList(parts).subList(2, parts.length)) {
                            Item att = Item.REGISTRY.getObject(new ResourceLocation(ID, attachmentId));
                            if (!(att instanceof ItemAttachment)) {
                                LOGGER.warn("Invalid attachment for entity " + name + ": " + attachmentId + ". Expected a valid item.");
                                continue;
                            }

                            equipment.attachments.add((ItemAttachment<?>) att);
                        }
                    }

                    for (int i = difficultyLevel.ordinal(); i < difficultyValues.length; i++) {
                        equipmentOptions.put(new EquipmentKey(difficultyValues[i], equipment.item, equipment.attachments.toArray(new ItemAttachment<?>[0])),
                                new EquipmentValue(equipment, (float) weight));
                    }
                }

                equipmentOptions.forEach((key, value) -> {
                    equipmentOptionsBuilder.withOption(value.equipment, key.difficulty, value.weight);
                });
            }

            configuration.equipmentOptions = equipmentOptionsBuilder.build();

            WeightedOptions.Builder<EnumDifficulty, Equipment> secondaryEquipmentOptionsBuilder = new WeightedOptions.Builder<>();
            secondaryEquipmentOptions.forEach((key, value) -> secondaryEquipmentOptionsBuilder.withOption(value.equipment, key.difficulty, value.weight));

            configuration.secondaryEquipmentOptions = secondaryEquipmentOptionsBuilder.build();
            configuration.ambientSound = context.registerSound(ambientSound);
            configuration.hurtSound = context.registerSound(hurtSound);
            configuration.deathSound = context.registerSound(deathSound);
            configuration.stepSound = context.registerSound(stepSound);
            configuration.lootTable = lootTable;
            configuration.maxHealth = maxHealth;
            configuration.maxSpeed = maxSpeed;
            configuration.followRange = followRange;
            configuration.canSpawnHere = canSpawnHere;
            configuration.isValidLightLevel = isValidLightLevel;
            configuration.maxTolerableLightBrightness = maxTolerableLightBrightness;
            configuration.texturedModelVariants = texturedModelVariants;
            configuration.armor = armor;
            configuration.primaryEquipmentDropChance = primaryEquipmentDropChance;
            configuration.secondaryEquipmentDropChance = secondaryEquipmentDropChance;
            configuration.armorDropChance = armorDropChance;
            configuration.maxAmmo = maxAmmo;
            configuration.collisionAttackDamage = collisionAttackDamage;
            configuration.isPushable = isPushable;
            configuration.isInvulnerable = isInvulnerable;
            configuration.isCollidable = isCollidable;
            configuration.isDespawnable = isDespawnable;
            configuration.lookHeightMultiplier = lookHeightMultiplier;
            configuration.pickupItemID = pickupItemID;
            configuration.sizeHeight = sizeHeight;
            configuration.sizeWidth = sizeWidth;

            Class<? extends Entity> entityClass = EntityClassFactory.getInstance().generateEntitySubclass(baseClass, modEntityId, configuration);

            SecondaryEntityRegistry.map.put(name, entityClass);

            boolean sendVelocityUpdates = true;
            net.minecraftforge.fml.common.registry.EntityRegistry.registerModEntity(new ResourceLocation(ID, entityName), entityClass, ID + "_" + entityName, modEntityId, context.getMod(), DEFAULT_TRACKING_RANGE, DEFAULT_UPDATE_FREQUENCY, sendVelocityUpdates);

            if (spawnEgg) {
                EntityRegistry.registerEgg(EntityList.getKey(entityClass), primaryEggColor, secondaryEggColor);
            }

            for (Spawn spawn : spawns) {
                int weightedProb = spawn.weightedProb;
                //int weightedProb = (int)(entityConfig.getSpawn());

                if (entityName.equals("terrorist")) {
                    weightedProb = (int) (spawn.weightedProb * ModernConfigManager.terroristSpawn);
                    configuration.maxHealth = ModernConfigManager.terroristHealth * maxHealth;
                } else if (entityName.equals("soldier")) {
                    weightedProb = (int) (spawn.weightedProb * ModernConfigManager.soldierSpawn);
                    configuration.maxHealth = ModernConfigManager.soldierHealth * maxHealth;
                }

                if (weightedProb > 0) {
                    Set<Biome> biomes = new HashSet<>();

                    for (BiomeDictionary.Type biomeType : spawn.biomeTypes) {
                        Set<Biome> biomesForType = BiomeDictionary.getBiomes(biomeType);
                        biomes.addAll(biomesForType);
                    }

                    EntityRegistry.addSpawn(safeCast(entityClass), weightedProb, spawn.min, spawn.max, EnumCreatureType.MONSTER, biomes.toArray(new Biome[0]));
                }
            }

            if (FMLCommonHandler.instance().getSide() == Side.CLIENT) {
                for (TexturedModel tmv : texturedModelVariants) {
                    tmv.textureResource = new ResourceLocation(ID, "textures/entity/" + tmv.textureName);
                    try {
                        tmv.model = (ModelBiped) Class.forName(tmv.modelClassName).newInstance();
                    } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                }

                RendererRegistration.registerRenderableEntity(context, entityClass, texturedModelVariants);
            }
        }

        private static class RendererRegistration {
            /*
             * This method is wrapped into a static class to facilitate conditional client-side only loading
             */
            private static void registerRenderableEntity(ModContext context, Class<? extends Entity> entityClass, List<TexturedModel> texturedModelVariants) {
                try {
                    ModelBiped model = (ModelBiped) Class.forName(texturedModelVariants.get(0).modelClassName).newInstance();
                    context.registerRenderableEntity(entityClass, new RenderCustomMob(model));
                } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
                    e.printStackTrace();

                }
            }
        }


        private Class<? extends EntityLiving> safeCast(Class<? extends Entity> entityClass) {
            return (Class<? extends EntityLiving>) entityClass;
        }
    }

    @Getter
    private WeightedOptions<EnumDifficulty, Equipment> equipmentOptions;
    @Getter
    private WeightedOptions<EnumDifficulty, Equipment> secondaryEquipmentOptions;

    private List<AiTask> aiTasks;
    private List<AiTask> aiTargetTasks;
    @Getter
    private SoundEvent ambientSound;
    @Getter
    private SoundEvent hurtSound;
    @Getter
    private SoundEvent deathSound;
    @Getter
    private SoundEvent stepSound;
    @Getter
    private ResourceLocation lootTable;
    @Getter
    private double maxHealth;
    @Getter
    private Predicate<Entity> canSpawnHere;
    private Predicate<Entity> isValidLightLevel;
    @Getter
    private EnumCreatureAttribute creatureAttribute;
    @Getter
    private float maxTolerableLightBrightness;
    @Getter
    private double maxSpeed;
    @Getter
    private List<TexturedModel> texturedModelVariants;
    @Getter
    private double followRange;
    @Getter
    private double collisionAttackDamage;

    private boolean isPushable;
    private boolean isInvulnerable;
    private boolean isCollidable;
    private boolean isDespawnable;

    @Getter
    public float lookHeightMultiplier;

    @Getter
    @Getter
    public float sizeWidth, sizeHeight;

    private Map<EntityEquipmentSlot, CustomArmor> armor;
    @Getter
    private float primaryEquipmentDropChance;
    @Getter
    private float secondaryEquipmentDropChance;
    @Getter
    private float armorDropChance;
    @Getter
    private int maxAmmo;

    @Getter
    private CustomMobAttack collisionAttack;
    @Getter
    private CustomMobAttack delayedAttack;

    @Getter
    private String mobName;


    @Getter
    private int pickupItemID = -1;

    protected EntityConfiguration() {}

    public void addAiTasks(EntityLiving e, EntityAITasks tasks) {
        aiTasks.forEach(t -> tasks.addTask(t.priority, t.taskSupplier.apply(e)));
    }

    public void addAiTargetTasks(EntityLiving e, EntityAITasks tasks) {
        aiTargetTasks.forEach(t -> tasks.addTask(t.priority, t.taskSupplier.apply(e)));
    }

    public Predicate<Entity> isValidLightLevel() {
        return isValidLightLevel;
    }

    public Collection<CustomArmor> getArmorSet() {
        return armor.values();
    }

    public boolean isPushable() {
        return isPushable;
    }

    public boolean isInvulnerable() {
        return isInvulnerable;
    }

    public boolean isCollidable() {
        return isCollidable;
    }

    public boolean isDespawnable() {
        return isDespawnable;
    }
}
