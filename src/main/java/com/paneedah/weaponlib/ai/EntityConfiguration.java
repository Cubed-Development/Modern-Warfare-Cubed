package com.paneedah.weaponlib.ai;

import com.paneedah.mwc.utils.ModReference;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.config.ModernConfigManager;
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

import static com.paneedah.mwc.utils.ModReference.LOG;

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

        private static class Spawn {
            int weightedProb;
            int min;
            int max;
            BiomeDictionary.Type biomeTypes[];
            
            public Spawn(int weightedProb, int min, int max, BiomeDictionary.Type biomeTypes[]) {
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
            ItemAttachment<?> attachments[];
            
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
                if (this == obj)
                    return true;
                if (obj == null)
                    return false;
                if (getClass() != obj.getClass())
                    return false;
                EquipmentKey other = (EquipmentKey) obj;
                if (!Arrays.equals(attachments, other.attachments))
                    return false;
                if (difficulty != other.difficulty)
                    return false;
                if (item == null) {
                    if (other.item != null)
                        return false;
                } else if (!item.equals(other.item))
                    return false;
                return true;
            }
            
        }

        private int trackingRange = DEFAULT_TRACKING_RANGE;
        private int updateFrequency = DEFAULT_UPDATE_FREQUENCY;
        private boolean sendVelocityUpdates = true;
        
        private Supplier<Integer> entityIdSupplier;
        private Map<EquipmentKey, EquipmentValue> equipmentOptions = new HashMap<>();
        private Map<EquipmentKey, EquipmentValue> secondaryEquipmentOptions = new HashMap<>();

        
        private Class<? extends Entity> baseClass;
        private List<Spawn> spawns = new ArrayList<>();
        
        private List<AiTask> aiTasks = new ArrayList<>();
        private List<AiTask> aiTargetTasks = new ArrayList<>();
        
        private List<TexturedModel> texturedModelVariants = new ArrayList<>();
        
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
        private Map<EntityEquipmentSlot, CustomArmor> armor = new HashMap<>();
        
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
        	this.pickupItemID = item;
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
        
        public Builder withEquipmentOption(Item item, EnumDifficulty difficultyLevel, float weight, ItemAttachment<?>...attachments) {
            withEquipmentOption(equipmentOptions, item, difficultyLevel, weight, attachments);
            return this;
        }
        
        public Builder withSecondaryEquipmentOption(Item item, EnumDifficulty difficultyLevel, float weight, ItemAttachment<?>...attachments) {
            withEquipmentOption(secondaryEquipmentOptions, item, difficultyLevel, weight, attachments);
            return this;
        }
        
        public Builder withSize(float width, float height) {
        	this.sizeWidth = width;
        	this.sizeHeight = height;
        	return this;
        }
        
        public Builder withLookHeightMulitplier(float multiplier) {
        	this.lookHeightMultiplier = multiplier;
        	return this;
        }

        private Builder withEquipmentOption(Map<EquipmentKey, EquipmentValue> equipmentOptions, Item item, EnumDifficulty difficultyLevel, float weight, ItemAttachment<?>... attachments) {
            if(item == null) {
                LOG.warn("Attempted to configure entity equipment with null item");
                return this;
            }
            Equipment equipment = new Equipment();
            equipment.item = item;
            equipment.attachments = Arrays.asList(attachments);
            EnumDifficulty[] difficultyValues = EnumDifficulty.values();
            for(int i = difficultyLevel.ordinal(); i < difficultyValues.length; i++) {      
                equipmentOptions.put(new EquipmentKey(difficultyValues[i], equipment.item, attachments), 
                        new EquipmentValue(equipment, weight));
            }
            return this;
        }
        
        public Builder withPrimaryEquipmentDropChance(float chance) {
            this.primaryEquipmentDropChance = chance;
            return this;
        }
        
        public Builder withSecondaryEquipmentDropChance(float chance) {
            this.secondaryEquipmentDropChance = chance;
            return this;
        }
        
        public Builder withArmor(CustomArmor armor) {
            this.armor.put(armor.getCompatibleEquipmentSlot(), armor);
            return this;
        }
        
        public Builder withArmorDropChance(float chance) {
            this.armorDropChance = chance;
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
            this.aiTasks.add(task);
            return this;
        }
        
        public Builder withAiTargetTask(int priority, Function<EntityLiving, EntityAIBase> taskSupplier) {
            AiTask task = new AiTask();
            task.priority = priority;
            task.taskSupplier = taskSupplier;
            this.aiTargetTasks.add(task);
            return this;
        }
        
        public Builder withAmbientSound(String sound) {
            this.ambientSound = sound.toLowerCase();
            return this;
        }
        
        public Builder withHurtSound(String sound) {
            this.hurtSound = sound.toLowerCase();
            return this;
        }
        
        public Builder withDeathSound(String sound) {
            this.deathSound = sound.toLowerCase();
            return this;
        }
        
        public Builder withStepSound(String sound) {
            this.stepSound = sound.toLowerCase();
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
            this.spawnEgg = true;
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
            this.isInvulnerable = true;
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

            int modEntityId = entityIdSupplier.get();
            String entityName = name != null ? name : baseClass.getSimpleName() + "Ext" + modEntityId;

            //TODO: Remove this and actually have a proper way to register entities
            //     This is just a temporary solution to resolve the NPE
            //Obsolete?
            //if (!ModernConfigManager.aiEntities.containsKey(entityName))
            //    ModernConfigManager.aiEntities.put(entityName, new AIEntity(entityName, 1.0, 0.0));
            //AIEntity entityConfig = ModernConfigManager.aiEntities.get(entityName);


            WeightedOptions.Builder<EnumDifficulty, Equipment> equipmentOptionsBuilder = new WeightedOptions.Builder<>();
            if (ModernConfigManager.terroristEquipmentConfiguration == null || ModernConfigManager.terroristEquipmentConfiguration.isEmpty()) {
                equipmentOptions.forEach((key, value) -> equipmentOptionsBuilder.withOption(value.equipment, key.difficulty, value.weight));

            } else {
                Map<EquipmentKey, EquipmentValue> equipmentOptions = new HashMap<>();

                EnumDifficulty difficultyLevel = EnumDifficulty.EASY;
                EnumDifficulty[] difficultyValues = EnumDifficulty.values();

                String[] attachments = ModernConfigManager.terroristEquipmentConfiguration.split(", ");
                for (String attachment : attachments) {
                    String[] parts = attachment.split(":");
                    if (parts.length < 2) {
                        ModReference.LOG.warn("Invalid attachment configuration for entity " + name + ": " + attachment + ". Expected format: <gunId>:<weight>[:<attachment>...]");
                        continue;
                    }

                    String gunId = parts[0];
                    double weight;
                    try {
                        weight = Double.parseDouble(parts[1]);
                    } catch (NumberFormatException e) {
                        ModReference.LOG.warn("Invalid weight for gun " + name + ": " + parts[1] + ". Expected a valid double.");
                        continue;
                    }

                    Item gun = Item.REGISTRY.getObject(new ResourceLocation(ModReference.ID, gunId));
                    if (gun == null) {
                        ModReference.LOG.warn("Invalid equipment for entity " + name + ": " + gunId + ". Expected a valid item.");
                        continue;
                    }

                    Equipment equipment = new Equipment();
                    switch (name) {
                        case "turret":
                            equipment.item = Item.REGISTRY.getObject(new ResourceLocation(ModReference.ID, "turretgun"));
                            break;
                        case "turretupgraded":
                            equipment.item = Item.REGISTRY.getObject(new ResourceLocation(ModReference.ID, "turretgunupgraded"));
                            break;
                        case "turretsilenced":
                            equipment.item = Item.REGISTRY.getObject(new ResourceLocation(ModReference.ID, "turretgunsilenced"));
                            break;
                        default:
                            equipment.item = gun;
                    }
                    equipment.attachments = new ArrayList<>();

                    if (parts.length >= 3) {
                        for (String attachmentId : Arrays.asList(parts).subList(2, parts.length)) {
                            Item att = Item.REGISTRY.getObject(new ResourceLocation(ModReference.ID, attachmentId));
                            if (!(att instanceof ItemAttachment)) {
                                ModReference.LOG.warn("Invalid attachment for entity " + name + ": " + attachmentId + ". Expected a valid item.");
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
            configuration.sizeHeight = this.sizeHeight;
            configuration.sizeWidth = this.sizeWidth;
            
            Class<? extends Entity> entityClass = EntityClassFactory.getInstance().generateEntitySubclass(baseClass, modEntityId, configuration);

            SecondaryEntityRegistry.map.put(name, entityClass);

            net.minecraftforge.fml.common.registry.EntityRegistry.registerModEntity(new ResourceLocation(ModReference.ID, entityName), entityClass, entityName, modEntityId, context.getMod(), trackingRange, updateFrequency, sendVelocityUpdates);

            if(spawnEgg)
               EntityRegistry.registerEgg(EntityList.getKey(entityClass), primaryEggColor, secondaryEggColor);

            for(Spawn spawn: spawns) {
                int weightedProb = spawn.weightedProb;
                //int weightedProb = (int)(entityConfig.getSpawn());

                if(entityName.equals("terrorist")) {
                    weightedProb = (int) (spawn.weightedProb * ModernConfigManager.terroristSpawn);
                    configuration.maxHealth = ModernConfigManager.terroristHealth * maxHealth;
                }
                else if(entityName.equals("soldier")) {
                    weightedProb = (int) (spawn.weightedProb * ModernConfigManager.soldierSpawn);
                    configuration.maxHealth = ModernConfigManager.soldierHealth * maxHealth;
                }

                if(weightedProb > 0) {
                    Set<Biome> biomes = new HashSet<>();

                    for (BiomeDictionary.Type biomeType : spawn.biomeTypes) {
                        Set<Biome> biomesForType = BiomeDictionary.getBiomes(biomeType);
                        biomes.addAll(biomesForType);
                    }

                    EntityRegistry.addSpawn(safeCast(entityClass), weightedProb, spawn.min, spawn.max, EnumCreatureType.MONSTER, biomes.toArray(new Biome[0]));
                }
            }
            
            if(FMLCommonHandler.instance().getSide() == Side.CLIENT) {
                for(TexturedModel tmv: texturedModelVariants) {
                    tmv.textureResource = new ResourceLocation(ModReference.ID, "textures/entity/" + tmv.textureName);
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
        
        @SuppressWarnings("unchecked")
        private Class<? extends EntityLiving> safeCast(Class<? extends Entity> entityClass) {
            return (Class<? extends EntityLiving>) entityClass;
        }
    }
    
    private WeightedOptions<EnumDifficulty, Equipment> equipmentOptions;
    private WeightedOptions<EnumDifficulty, Equipment> secondaryEquipmentOptions;

    private List<AiTask> aiTasks;
    private List<AiTask> aiTargetTasks;
    private SoundEvent ambientSound;
    private SoundEvent hurtSound;
    private SoundEvent deathSound;
    private SoundEvent stepSound;
    private ResourceLocation lootTable;
    private double maxHealth;
    private Predicate<Entity> canSpawnHere;
    private Predicate<Entity> isValidLightLevel;
    private EnumCreatureAttribute creatureAttribute;
    private float maxTolerableLightBrightness;
    private double maxSpeed;
    private List<TexturedModel> texturedModelVariants;
    private double followRange;
    private double collisionAttackDamage;
    
    private boolean isPushable;
    private boolean isInvulnerable;
    private boolean isCollidable;
    private boolean isDespawnable;
    
    public float lookHeightMultiplier;

    public float sizeWidth, sizeHeight;

    private Map<EntityEquipmentSlot, CustomArmor> armor;
    private float primaryEquipmentDropChance;
    private float secondaryEquipmentDropChance;
    private float armorDropChance;
    private int maxAmmo;

    private CustomMobAttack collisionAttack;
    private CustomMobAttack delayedAttack;
    
    private String mobName;
    
    
    private int pickupItemID = -1;

    protected EntityConfiguration() {}
    
    public String getMobName() {
    	return this.mobName;
    }
    
    public WeightedOptions<EnumDifficulty, Equipment> getEquipmentOptions() {
        return equipmentOptions;
    }
    
    public WeightedOptions<EnumDifficulty, Equipment> getSecondaryEquipmentOptions() {
        return secondaryEquipmentOptions;
    }
    
    public float getSizeWidth() {
    	return this.sizeWidth;
    }
    
    public float getSizeHeight() {
    	return this.sizeHeight;
    }
    
    public int getPickupItemID() {
    	return this.pickupItemID;
    }
    
    public void addAiTasks(EntityLiving e, EntityAITasks tasks) {
        aiTasks.stream().forEach(t -> tasks.addTask(t.priority, t.taskSupplier.apply(e)));
    }
    
    public void addAiTargetTasks(EntityLiving e, EntityAITasks tasks) {
        aiTargetTasks.stream().forEach(t -> tasks.addTask(t.priority, t.taskSupplier.apply(e)));
    }
    
    public float getLookHeightMultiplier() {
    	return this.lookHeightMultiplier;
    }

    public SoundEvent getAmbientSound() {
        return ambientSound;
    }

    public SoundEvent getHurtSound() {
        return hurtSound;
    }

    public SoundEvent getDeathSound() {
        return deathSound;
    }

    public SoundEvent getStepSound() {
        return stepSound;
    }

    public ResourceLocation getLootTable() {
        return lootTable;
    }

    public double getMaxHealth() {
        return maxHealth;
    }
    
    public Predicate<Entity> getCanSpawnHere() {
        return canSpawnHere;
    }
    
    public Predicate<Entity> isValidLightLevel() {
        return isValidLightLevel;
    }

    public EnumCreatureAttribute getCreatureAttribute() {
        return creatureAttribute;
    }

    public float getMaxTolerableLightBrightness() {
        return maxTolerableLightBrightness;
    }
    
    public double getMaxSpeed() {
        return maxSpeed;
    }

    public double getFollowRange() {
        return followRange;
    }
    
    public List<TexturedModel> getTexturedModelVariants() {
        return texturedModelVariants;
    }
    
    public Collection<CustomArmor> getArmorSet() {
        return armor.values();
    }

    public float getPrimaryEquipmentDropChance() {
        return primaryEquipmentDropChance;
    }
    
    public float getSecondaryEquipmentDropChance() {
        return secondaryEquipmentDropChance;
    }

    public float getArmorDropChance() {
        return armorDropChance;
    }

    public int getMaxAmmo() {
        return maxAmmo;
    }

    public CustomMobAttack getCollisionAttack() {
        return collisionAttack;
    }
    
    public CustomMobAttack getDelayedAttack() {
        return delayedAttack;
    }

    public double getCollisionAttackDamage() {
        return collisionAttackDamage;
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
