package com.paneedah.weaponlib.ai;

import com.paneedah.mwc.utils.ModReference;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.compatibility.CompatibleBiomeType;
import com.paneedah.weaponlib.compatibility.CompatibleEntityEquipmentSlot;
import com.paneedah.weaponlib.compatibility.CompatibleSound;
import com.paneedah.weaponlib.configold.AIEntity;
import com.paneedah.weaponlib.mission.MissionOffering;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAITasks;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.EnumDifficulty;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import static com.paneedah.mwc.utils.ModReference.log;
import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

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
    
    static class Equipment {
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
            CompatibleBiomeType biomeTypes[];
            
            public Spawn(int weightedProb, int min, int max, CompatibleBiomeType biomeTypes[]) {
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
        private Predicate<Entity> isValidLightLevel = e -> compatibility.world(e).rand.nextFloat() > 0.5f;
        
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
        private Map<CompatibleEntityEquipmentSlot, CustomArmor> armor = new HashMap<>();
        
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
        private List<MissionOffering> missionOfferings = new ArrayList<>();
        private List<String> introDialogs = new ArrayList<>();
        private String introImage;
        private String dialogBackground;
        private String rewardsBackground;
        private String missionSelectionBackground;
        
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

        private Builder withEquipmentOption(Map<EquipmentKey, EquipmentValue> equipmentOptions, Item item, 
                EnumDifficulty difficultyLevel, float weight, ItemAttachment<?>... attachments) {
            if(item == null) {
                log.warn("Attempted to configure entity equipment with null item");
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
        
        public Builder withSpawn(int weightedProb, int min, int max, CompatibleBiomeType... biomeTypes) {
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
        
//        public Builder withMissionOffering(MissionOffering missionOffering) {
//            this.missionOfferings.add(missionOffering);
//            return this;
//        }
        
        public Builder withIntroDialog(String dialog) {
            this.introDialogs.add(dialog);
            return this;
        }
        
        public Builder withIntroImage(String introImage) {
            this.introImage = introImage.toLowerCase();
            if(!this.introImage.endsWith(".png")) {
                this.introImage += ".png";
            }
            return this;
        }
        
        public Builder withDialogBackground(String dialogBackground) {
            this.dialogBackground = dialogBackground.toLowerCase();
            if(!this.dialogBackground.endsWith(".png")) {
                this.dialogBackground += ".png";
            }
            return this;
        }
        
        public Builder withRewardsBackground(String rewardsBackground) {
            this.rewardsBackground = rewardsBackground.toLowerCase();
            if(!this.rewardsBackground.endsWith(".png")) {
                this.rewardsBackground += ".png";
            }
            return this;
        }
        
        public Builder withMissionSelectionBackground(String missionSelectionBackground) {
            this.missionSelectionBackground = missionSelectionBackground.toLowerCase();
            if(!this.missionSelectionBackground.endsWith(".png")) {
                this.missionSelectionBackground += ".png";
            }
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
            AIEntity entityConfig = context.getConfigurationManager().getAIEntity(entityName);
            
            WeightedOptions.Builder<EnumDifficulty, Equipment> equipmentOptionsBuilder = new WeightedOptions.Builder<>();
            
            if(entityConfig == null || entityConfig.getEquipment().isEmpty())  {
                // if no equipment configured externally, use the default configuration
                equipmentOptions.forEach((key, value) -> {
                    equipmentOptionsBuilder.withOption(value.equipment, key.difficulty, value.weight);
                });
            } else {
                Map<EquipmentKey, EquipmentValue> equipmentOptions = new HashMap<>();

                EnumDifficulty difficultyLevel = EnumDifficulty.EASY;
                EnumDifficulty[] difficultyValues = EnumDifficulty.values();
                
                entityConfig.getEquipment().forEach(ee -> {
                    Item equipmentItem = compatibility.findItemByName(ee.getId());
                    if(equipmentItem != null) {
                        Equipment equipment = new Equipment();
                        equipment.item = equipmentItem;
                        equipment.attachments = ee.getAttachment().stream()
                                .map(a -> compatibility.findItemByName(a.getId()))
                                .filter(e -> e instanceof ItemAttachment<?>)
                                .map(a -> (ItemAttachment<?>)a)
                                .collect(Collectors.toList());
                        
                        for(int i = difficultyLevel.ordinal(); i < difficultyValues.length; i++) {      
                            equipmentOptions.put(new EquipmentKey(difficultyValues[i], equipment.item, 
                                    equipment.attachments.toArray(new ItemAttachment<?>[0])), 
                                    new EquipmentValue(equipment, ee.getWeight()));
                        }
                    } else {
                        log.warn("Attempted to configure entity equipment with invalid item {}", ee.getId());
                    }
                    
                });
                
               
                
                equipmentOptions.forEach((key, value) -> {
                    equipmentOptionsBuilder.withOption(value.equipment, key.difficulty, value.weight);
                });
            }
            
            configuration.equipmentOptions = equipmentOptionsBuilder.build();
            
            WeightedOptions.Builder<EnumDifficulty, Equipment> secondaryEquipmentOptionsBuilder = new WeightedOptions.Builder<>();
            secondaryEquipmentOptions.forEach((key, value) -> {
                secondaryEquipmentOptionsBuilder.withOption(value.equipment, key.difficulty, value.weight);
            });
            configuration.secondaryEquipmentOptions = secondaryEquipmentOptionsBuilder.build();

            configuration.ambientSound = context.registerSound(ambientSound);
            configuration.hurtSound = context.registerSound(hurtSound);
            configuration.deathSound = context.registerSound(deathSound);
            configuration.stepSound = context.registerSound(stepSound);
            configuration.lootTable = lootTable;
            configuration.maxHealth = entityConfig != null ? entityConfig.getHealth() * maxHealth : maxHealth;
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
            
            HashMap<UUID, MissionOffering> tmpMap = new LinkedHashMap<>();
            for(MissionOffering missionOffering: missionOfferings) {
                tmpMap.put(missionOffering.getId(), missionOffering);
            }
            configuration.missionOfferings = Collections.unmodifiableMap(tmpMap);
            
            configuration.dialogContent = Collections.unmodifiableList(introDialogs);
            
            if(introImage != null) {
                configuration.introImage = new ResourceLocation(ModReference.id,
                        "textures/gui/" + introImage);
            }
            
            if(dialogBackground != null) {
                configuration.dialogBackground = new ResourceLocation(ModReference.id, 
                        "textures/gui/" + dialogBackground);
            }
            
            if(rewardsBackground != null) {
                configuration.rewardsBackground = new ResourceLocation(ModReference.id, 
                        "textures/gui/" + rewardsBackground);
            }
            
            if(missionSelectionBackground != null) {
                configuration.missionSelectionBackground = new ResourceLocation(ModReference.id, 
                        "textures/gui/" + missionSelectionBackground);
            }
            
            Class<? extends Entity> entityClass = EntityClassFactory.getInstance()
                    .generateEntitySubclass(baseClass, modEntityId, configuration);
            
            
            SecondaryEntityRegistry.map.put(name, entityClass);
            
            compatibility.registerModEntity(entityClass, entityName, 
                    modEntityId, context.getMod(), trackingRange, updateFrequency, sendVelocityUpdates);
            
            
            
            if(spawnEgg) {
                compatibility.registerEgg(context, entityClass, entityName, primaryEggColor, secondaryEggColor);
            }
            
          
            
            
            for(Spawn spawn: spawns) {
            	//int weightedProb = spawn.weightedProb;
                int weightedProb = entityConfig != null ? (int)(entityConfig.getSpawn() * spawn.weightedProb) : spawn.weightedProb;
                //System.out.println("All you hoes need to rememeber who you're talking to: " + this.name + " -> " + weightedProb);
                if(weightedProb > 0) {
                	  
                    compatibility.addSpawn(safeCast(entityClass), weightedProb, 
                            spawn.min, spawn.max, spawn.biomeTypes);
                }
            }
            
            if(compatibility.isClientSide()) {
                for(TexturedModel tmv: texturedModelVariants) {
                    tmv.textureResource = new ResourceLocation(ModReference.id, "textures/entity/" + tmv.textureName);
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
    private CompatibleSound ambientSound;
    private CompatibleSound hurtSound;
    private CompatibleSound deathSound;
    private CompatibleSound stepSound;
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
    
    private Map<UUID, MissionOffering> missionOfferings;
    
    public float lookHeightMultiplier;

    
    public float sizeWidth, sizeHeight;

    private Map<CompatibleEntityEquipmentSlot, CustomArmor> armor;
    private float primaryEquipmentDropChance;
    private float secondaryEquipmentDropChance;
    private float armorDropChance;
    private int maxAmmo;

    private CustomMobAttack collisionAttack;
    private CustomMobAttack delayedAttack;

    private List<String> dialogContent;
    
    private ResourceLocation introImage;
    private ResourceLocation dialogBackground;
    private ResourceLocation rewardsBackground;
    private ResourceLocation missionSelectionBackground;
    
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

    public CompatibleSound getAmbientSound() {
        return ambientSound;
    }

    public CompatibleSound getHurtSound() {
        return hurtSound;
    }

    public CompatibleSound getDeathSound() {
        return deathSound;
    }

    public CompatibleSound getStepSound() {
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
    
    public Map<UUID, MissionOffering> getMissionOfferings() {
        return missionOfferings;
    }

    public List<String> getDialogContent() {
        return dialogContent;
    }

    public ResourceLocation getIntroImage() {
        return introImage;
    }

    public ResourceLocation getDialogBackground() {
        return dialogBackground;
    }
    
    public ResourceLocation getRewardsBackground() {
        return rewardsBackground;
    }

    public ResourceLocation getMissionSelectionBackground() {
        return missionSelectionBackground;
    }

    public boolean isDespawnable() {
        return isDespawnable;
    }
}
