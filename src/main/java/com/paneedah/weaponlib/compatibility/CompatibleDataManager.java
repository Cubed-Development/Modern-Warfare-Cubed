package com.paneedah.weaponlib.compatibility;

import net.minecraft.entity.Entity;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;

@Deprecated
public class CompatibleDataManager {

//    private static final DataParameter<Integer> VARIANT = EntityDataManager.<Integer>createKey(EntityCustomMob.class, DataSerializers.VARINT);
//    private static final DataParameter<Boolean> SWINGING_ARMS = EntityDataManager.<Boolean>createKey(EntityCustomMob.class, DataSerializers.BOOLEAN);

    public static class Key {
        private final DataParameter<?> key;

        public Key(DataParameter<?> key) {
            this.key = key;
        }
    }


    public class Value<T> {
        DataParameter<T> key;

        Value(DataParameter<T> key) {
            this.key = key;
        }

        public int intValue() {
            return (Integer) dataManager.get(key);
        }

        public boolean booleanValue() {
            return (Boolean) dataManager.get(key);
        }
    }

    private final EntityDataManager dataManager;

    public CompatibleDataManager(EntityDataManager dataManager) {
        this.dataManager = dataManager;
    }


    public <T> void register(Key key, T value) {
        dataManager.register((DataParameter<T>) key.key, value);
    }

    public static Key createKey(Class<? extends Entity> entityClass, Class<?> valueType) {
        Key key;
        if (valueType == int.class) {
            key = new Key(EntityDataManager.createKey(entityClass, DataSerializers.VARINT));
        } else if (valueType == boolean.class) {
            key = new Key(EntityDataManager.createKey(entityClass, DataSerializers.BOOLEAN));
        } else {
            throw new IllegalArgumentException("Value type " + valueType + " not supported");
        }

        return key;
    }


    public <T> Value<T> get(Key key) {
        return new Value<>((DataParameter<T>) key.key);
    }


    public <T> void set(Key key, T value) {
        dataManager.set((DataParameter<T>) key.key, value);
    }
}
