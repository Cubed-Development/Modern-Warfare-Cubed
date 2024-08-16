package com.paneedah.mwc.network;

import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.UUID;

import static com.paneedah.mwc.utils.ModReference.RED_LOG;

@NoArgsConstructor
public final class TypeRegistry {

    @Getter private static final TypeRegistry INSTANCE = new TypeRegistry();

    private final HashMap<UUID, Class<? extends ISerializable>> typeRegistry = new HashMap<>();

    public <T extends ISerializable> void register(Class<T> cls) {
        typeRegistry.put(getUuid(cls), cls);
    }

    public UUID getUuid(final Class<?> aClass) {
        try {
            final SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
            secureRandom.setSeed(aClass.getName().getBytes());
            return new UUID(secureRandom.nextLong(), secureRandom.nextLong());
        } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            RED_LOG.printFramedError("Networking", "Failed to create a secure random", "", noSuchAlgorithmException.getMessage());
            throw new RuntimeException(noSuchAlgorithmException);
        }

    }

    public <T extends ISerializable> void toBytes(final T object, final ByteBuf byteBuf) {
        final UUID uuid = getUuid(object.getClass());

        if (!typeRegistry.containsKey(uuid)) {
            RED_LOG.printFramedError("Networking", "Failed to write object because its class is not registered", "", "Object: " + object, "Class: " + object.getClass());
            throw new RuntimeException();
        }

        byteBuf.writeLong(uuid.getMostSignificantBits());
        byteBuf.writeLong(uuid.getLeastSignificantBits());
        if (object.getClass().isEnum()) {
            byteBuf.writeInt(((Enum<?>) object).ordinal());
        } else {
            object.write(byteBuf);
        }
    }

    public <T extends ISerializable> T fromBytes(final ByteBuf byteBuf) {
        long mostSigBits = byteBuf.readLong();
        long leastSigBits = byteBuf.readLong();
        UUID typeUuid = new UUID(mostSigBits, leastSigBits);


        Class<T> targetClass = (Class<T>) typeRegistry.get(typeUuid);

        if (targetClass == null) {
            RED_LOG.printFramedError("Networking", "Failed to deserialize object.\nDid you forget to register type?", "");
            throw new RuntimeException();
        }

        T instance;
        if (targetClass.isEnum()) {
            T[] constants = targetClass.getEnumConstants();
            instance = constants[byteBuf.readInt()];
        } else {
            try {
                instance = targetClass.newInstance();
            } catch (InstantiationException | IllegalAccessException exception) {
                RED_LOG.printFramedError("Networking", "Failed to create instance", "", exception.getMessage(), exception.getStackTrace()[3].toString());
                throw new RuntimeException();
            }

            instance.read(byteBuf);
        }

        return targetClass.cast(instance);
    }
}
