package com.paneedah.weaponlib.config;

import javax.xml.bind.*;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Predicate;

import static com.paneedah.mw.utils.ModReference.log;

public class ConfigurationManager {

    public static enum StatusBarPosition{TOP_RIGHT, BOTTOM_RIGHT, TOP_LEFT, BOTTOM_LEFT};

    private static final float DROP_BLOCK_COEFFICIENT_MIN = 0f;
    private static final float DROP_BLOCK_COEFFICIENT_MAX = 5f;

    private static final float EXPLOSION_COEFFICIENT_MAX = 2f;
    private static final float EXPLOSION_COEFFICIENT_MIN = 0.2f;

    private static final float BLEEDING_ON_HIT_COEFFICIENT_MIN = 0f;
    private static final float BLEEDING_ON_HIT_COEFFICIENT_MAX = 1f;
    
    private static final float RENDER_OPTIMIZATION_MIN = 0f;
    private static final float RENDER_OPTIMIZATION_MAX = 1f;

    private static final int ORE_MIN_PER_CHUNK = 0;
    private static final int ORE_MAX_PER_CHUNK = 50;

    //private static final Float DEFAULT_DAMAGE_COEFFICIENT = 1.0f;

    private static final Predicate<Ore> DEFAULT_ORE_VALIDATOR = ore -> ore.spawnsPerChunk >= ORE_MIN_PER_CHUNK
            && ore.spawnsPerChunk <= ORE_MAX_PER_CHUNK;

    private static final Predicate<Explosions> DEFAULT_EXPLOSIONS_VALIDATOR = explosions -> explosions != null;


    public static final class Builder {

        private static final float DEFAULT_GUN_DAMAGE_MULTIPLIER = 1f;
        private static final float MAX_GUN_DAMAGE_MULTIPLIER = 2f;
        private static final float MIN_GUN_DAMAGE_MULTIPLIER = 0.1f;
        private Map<String, Gun> guns = new LinkedHashMap<>();
        private Map<String, AIEntity> aiEntities = new LinkedHashMap<>();

        private Source defaultConfigSource;
        private Source userConfigSource;
        private File userConfigFile;
        private StatusBarPosition statusBarPosition = StatusBarPosition.TOP_RIGHT;

        private Predicate<Ore> oreValidator = DEFAULT_ORE_VALIDATOR;
        private Predicate<Explosions> explosionsValidator = DEFAULT_EXPLOSIONS_VALIDATOR;

        private Configuration userConfig;

        public Builder withDefaultConfiguration(Source defaultConfigSource) {
            this.defaultConfigSource = defaultConfigSource;
            return this;
        }

        Builder withUserConfiguration(Source userConfigSource) {
            this.userConfigSource = userConfigSource;
            return this;
        }

        public Builder withUserConfiguration(File userConfigFile) {
            this.userConfigFile = userConfigFile;
            this.userConfigSource = new StreamSource(userConfigFile);
            return this;
        }

        public Builder withOreValidator(Predicate<Ore> oreValidator) {
            this.oreValidator = oreValidator;
            return this;
        }

        public Builder withExplosionsValidator(Predicate<Explosions> explosionsValidator) {
            this.explosionsValidator = explosionsValidator;
            return this;
        }

        public ConfigurationManager build() {
            Configuration defaultUpdatableConfig = createConfiguration(defaultConfigSource);
            userConfig = createConfiguration(userConfigSource);
            return new ConfigurationManager(merge(userConfig, defaultUpdatableConfig), userConfigFile, this);
        }

        static Configuration createConfiguration(Source source) {
            try {
                JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
                Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                JAXBElement<Configuration> configElement = jaxbUnmarshaller.unmarshal(source, Configuration.class);
                return configElement.getValue();
            } catch (JAXBException e) {
                System.err.println("Failed to parse configuration: " + e);
                return null;
            }
        }

        private Configuration merge(Configuration userConfig, Configuration defaultUpdatableConfig) {
            mergeOres(userConfig, defaultUpdatableConfig);
            mergeExplosions(userConfig, defaultUpdatableConfig);
            mergeProjectiles(userConfig, defaultUpdatableConfig);
            mergeGui(userConfig, defaultUpdatableConfig);
            mergeAi(userConfig, defaultUpdatableConfig);
            return defaultUpdatableConfig;
        }

        private void mergeExplosions(Configuration userConfig, Configuration defaultUpdatableConfig) {
            if(userConfig != null && explosionsValidator.test(userConfig.getExplosions())) {

                Float userDamageCoefficient = userConfig.getExplosions().getDamage();
                if (userDamageCoefficient == null) {
                    userDamageCoefficient = defaultUpdatableConfig.getExplosions().getDamage();
                } else if (userDamageCoefficient < EXPLOSION_COEFFICIENT_MIN) {
                    userDamageCoefficient = EXPLOSION_COEFFICIENT_MIN;
                } else if (userDamageCoefficient > EXPLOSION_COEFFICIENT_MAX) {
                    userDamageCoefficient = EXPLOSION_COEFFICIENT_MAX;
                }
                defaultUpdatableConfig.getExplosions().setDamage(userDamageCoefficient);

                Float userDropBlockChance = userConfig.getExplosions().getDropBlockChance();
                if (userDropBlockChance == null) {
                    userDropBlockChance = defaultUpdatableConfig.getExplosions().getDropBlockChance();
                } else if (userDropBlockChance < DROP_BLOCK_COEFFICIENT_MIN) {
                    userDropBlockChance = DROP_BLOCK_COEFFICIENT_MIN;
                } else if (userDropBlockChance > DROP_BLOCK_COEFFICIENT_MAX) {
                    userDropBlockChance = DROP_BLOCK_COEFFICIENT_MAX;
                }
                defaultUpdatableConfig.getExplosions().setDropBlockChance(userDropBlockChance);
            }
        }
        
        private void mergeAi(Configuration userConfig, Configuration defaultUpdatableConfig) {
            if(defaultUpdatableConfig.getAi() != null) {
                defaultUpdatableConfig.getAi().getEntity().stream()
                .filter(aiEntity -> aiEntity.getName() != null)
                .forEach(aiEntity -> {
                    if(aiEntity.getHealth() <= 0.1f || aiEntity.getHealth() > 2f) {
                        aiEntity.setHealth(1f);
                    }
                    if(aiEntity.getSpawn() < 0f || aiEntity.getSpawn() > 5f) {
                        aiEntity.setSpawn(1f);
                    }
                    aiEntities.put(aiEntity.getName(), aiEntity);
                });
            }
            
            if(userConfig != null) {
                if(userConfig.getAi() != null) {
                    for(AIEntity aiEntity: userConfig.getAi().getEntity()) {
                        if(aiEntity.getName() != null) {
                            if(aiEntity.getHealth() <= 0.1f || aiEntity.getHealth() > 2f) {
                                aiEntity.setHealth(1f);
                            }
                            if(aiEntity.getSpawn() < 0f || aiEntity.getSpawn() > 5f) {
                                aiEntity.setSpawn(1f);
                            }
                            aiEntities.put(aiEntity.getName(), aiEntity);
                        }
                    }
                }
            }
            
            if(!aiEntities.isEmpty()) {
                AI ai = defaultUpdatableConfig.getAi();
                if(ai == null) {
                    ai = new AI();
                    defaultUpdatableConfig.setAi(ai);
                }
                ai.getEntity().clear();
                ai.getEntity().addAll(aiEntities.values());
            }
        }

        private void mergeProjectiles(Configuration userConfig, Configuration defaultUpdatableConfig) {
            if(defaultUpdatableConfig.getProjectiles() != null) {
                defaultUpdatableConfig.getProjectiles().getGun().stream()
                .filter(gun -> gun.getId() != null)
                .forEach(gun -> {
                    if(gun.getDamage() < MIN_GUN_DAMAGE_MULTIPLIER || gun.getDamage() > MAX_GUN_DAMAGE_MULTIPLIER) {
                        gun.setDamage(DEFAULT_GUN_DAMAGE_MULTIPLIER);
                    }
                    guns.put(gun.getId(), gun);
                });
            }

            System.out.println("userConfig = " + userConfig);
            if(userConfig != null) {
                Float renderOptimization = userConfig.getProjectiles().getRenderOptimization();
                if(renderOptimization != null) {
                    if(renderOptimization < RENDER_OPTIMIZATION_MIN) {
                        renderOptimization = RENDER_OPTIMIZATION_MIN;
                    } else if(renderOptimization > RENDER_OPTIMIZATION_MAX) {
                        renderOptimization = RENDER_OPTIMIZATION_MAX;
                    }
                    defaultUpdatableConfig.getProjectiles().setRenderOptimization(renderOptimization);
                }
                Float bleedingOnHit = userConfig.getProjectiles().getBleedingOnHit();
                if(bleedingOnHit != null) {
                    if(bleedingOnHit < BLEEDING_ON_HIT_COEFFICIENT_MIN) {
                        bleedingOnHit = BLEEDING_ON_HIT_COEFFICIENT_MIN;
                    } else if(bleedingOnHit > BLEEDING_ON_HIT_COEFFICIENT_MAX) {
                        bleedingOnHit = BLEEDING_ON_HIT_COEFFICIENT_MAX;
                    }
                    defaultUpdatableConfig.getProjectiles().setBleedingOnHit(bleedingOnHit);
                }

                System.out.println(".isDestroyGlassBlocks() = " + userConfig.getProjectiles().isDestroyGlassBlocks());
                defaultUpdatableConfig.getProjectiles().setDestroyGlassBlocks(userConfig.getProjectiles().isDestroyGlassBlocks());
                System.out.println(".isDestroyGlassBlocks() = " + userConfig.getProjectiles().isDestroyGlassBlocks());

                if(userConfig.getProjectiles().isKnockbackOnHit() == null) {
                    defaultUpdatableConfig.getProjectiles().setKnockbackOnHit(
                            userConfig.getProjectiles().isKnockbackOnHit());
                }

                if(userConfig.getProjectiles().isMuzzleEffects() == null) {
                    defaultUpdatableConfig.getProjectiles().setMuzzleEffects(
                            userConfig.getProjectiles().isMuzzleEffects());
                }

                if(userConfig.getProjectiles().isBlurOnAim() == null) {
                    defaultUpdatableConfig.getProjectiles().setBlurOnAim(
                            userConfig.getProjectiles().isBlurOnAim());
                }

                for(Gun gun: userConfig.getProjectiles().getGun()) {
                    if(gun.getDamage() < MIN_GUN_DAMAGE_MULTIPLIER || gun.getDamage() > MAX_GUN_DAMAGE_MULTIPLIER) {
                        gun.setDamage(DEFAULT_GUN_DAMAGE_MULTIPLIER);
                    }
                    if(gun.getId() != null) {
                        guns.put(gun.getId(), gun);
                    }
                }
            }

            if(defaultUpdatableConfig.getProjectiles() != null) {
                defaultUpdatableConfig.getProjectiles().getGun().clear();
                defaultUpdatableConfig.getProjectiles().getGun().addAll(guns.values());
            }
        }

        private void mergeOres(Configuration userConfiguration, Configuration updatableDefaults) {
            if(userConfiguration != null && userConfiguration.getOres() != null) {
                updatableDefaults.getOres().getOre().forEach(updatableDefaultOre -> {
                    userConfiguration.getOres().getOre().stream()
                    .filter(o -> updatableDefaultOre.getName().equalsIgnoreCase(o.getName()))
                    .findFirst()
                    .ifPresent(userOre -> mergeOre(userOre, updatableDefaultOre));
                });
            }
        }

        private void mergeOre(Ore userOre, Ore updatableDefaultOre) {
            if(oreValidator.test(userOre)) {
                updatableDefaultOre.spawnsPerChunk = userOre.spawnsPerChunk;
            }
        }

        private void mergeGui(Configuration userConfig, Configuration defaultUpdatableConfig) {
            if(userConfig != null && userConfig.getGui() != null && userConfig.getGui().getStatusBarPosition() != null) {
                try {
                    String positionValue = userConfig.getGui().getStatusBarPosition().toUpperCase()
                            .replaceAll("[\\.\\-\\s]+", "_");
                    this.statusBarPosition = StatusBarPosition.valueOf(positionValue);
                } catch(IllegalArgumentException e) {}
            }
            if(this.statusBarPosition == null) {
                this.statusBarPosition = StatusBarPosition.TOP_RIGHT;
            }
            if(defaultUpdatableConfig.getGui() == null) {
                defaultUpdatableConfig.setGui(new Gui());
            }
            defaultUpdatableConfig.getGui().setStatusBarPosition(statusBarPosition.toString());
        }
    }

    private Configuration config;
    private File userConfigFile;
    private Builder builder;

    protected ConfigurationManager(Configuration config, File userConfigFile, Builder builder) {
        this.config = config;
        this.userConfigFile = userConfigFile;
        this.builder = builder;
    }

    protected Configuration getConfiguration() {
        return config;
    }

    public void save() {

        if(userConfigFile.exists() && builder.userConfig == null) {
            String extension = ".invalid." + new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
            File invalidFileCopy = new File(userConfigFile.toString() + extension);
            try {
                Files.move(userConfigFile.toPath(), invalidFileCopy.toPath());
            } catch (IOException e) {
                log.error("Failed to rename {} to {}", userConfigFile, invalidFileCopy);
            }
        }

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            if(userConfigFile != null) {
                marshaller.marshal(new ObjectFactory().createConfiguration(config), userConfigFile);
            } else {
                marshaller.marshal(new ObjectFactory().createConfiguration(config), System.out);
            }
        } catch (JAXBException e) {
            log.error("Failed to save configuration to {}", userConfigFile);
        }
    }

    public boolean doFilmGrain() {
    	return false;
    }
    
    public Explosions getExplosions() {
        return config.getExplosions();
    }

    public Ore getOre(String oreName) {
        Ores ores = config.getOres();
        if(ores == null) {
            return null;
        }
        return ores.getOre().stream()
                .filter(o -> oreName.equalsIgnoreCase(o.getName()))
                .findFirst()
                .orElse(null);
    }

    public Projectiles getProjectiles() {
        return config.getProjectiles();
    }

    public StatusBarPosition getStatusBarPosition() {
        return builder.statusBarPosition;
    }

    public Gun getGun(String id) {
        return builder.guns.get(id);
    }
    
    public AIEntity getAIEntity(String name) {
        return builder.aiEntities.get(name);
    }

}
