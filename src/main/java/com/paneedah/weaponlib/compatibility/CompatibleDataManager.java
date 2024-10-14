package com.paneedah.weaponlib.compatibility;

import net.minecraft.entity.Entity;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;

@Deprecated
public class CompatibleDataManager {

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
            return ((Integer) dataManager.get(key)).intValue();
        }

        public boolean booleanValue() {
            return ((Boolean) dataManager.get(key)).booleanValue();
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
        return new Value<>(key.key);
    }


    public <T> void set(Key key, T value) {
        dataManager.set((DataParameter<T>) key.key, value);
    }
}
