package com.paneedah.weaponlib.network;

import io.netty.buffer.ByteBuf;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class TypeRegistry {
	
	private static final String SHA1PRNG_ALG = "SHA1PRNG";
	
	private ConcurrentMap<UUID, Class<? extends UniversallySerializable>> typeRegistry = new ConcurrentHashMap<>();
	
	private static final TypeRegistry instance = new TypeRegistry();
	
	public static TypeRegistry getInstance() {
		return instance;
	}
	
	private TypeRegistry() {}
	
	public <T extends UniversallySerializable> void register(Class<T> cls) {
		typeRegistry.put(getUuid(cls), cls);
	}
	
	public UUID getUuid(Class<?> cls) {
		try {
			SecureRandom random = SecureRandom.getInstance(SHA1PRNG_ALG);
			random.setSeed(cls.getName().getBytes());
			return new UUID(random.nextLong(), random.nextLong());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return UUID.fromString(getClass().getName());
		}
	}
	
	public <T extends UniversallySerializable> void toBytes(T object, ByteBuf buf) {
		UUID typeUuid = getUuid(object.getClass());
		if(!typeRegistry.containsKey(typeUuid)) {
			throw new RuntimeException("Failed to serialize object " + object
					+ " because its class is not registered: " + object.getClass());
		}
		
		buf.writeLong(typeUuid.getMostSignificantBits());
		buf.writeLong(typeUuid.getLeastSignificantBits());
		if(object.getClass().isEnum()) {
			buf.writeInt(((Enum<?>)object).ordinal());
		} else {
			object.serialize(buf);
		}
	}
	
    public <T extends UniversallySerializable> T fromBytes(ByteBuf buf) {
        long mostSigBits = buf.readLong();
		long leastSigBits = buf.readLong();
		UUID typeUuid = new UUID(mostSigBits, leastSigBits);
		
		@SuppressWarnings("unchecked")
		Class<T> targetClass = (Class<T>) typeRegistry.get(typeUuid);
		
		if(targetClass == null) {
			throw new RuntimeException("Failed to deserailize object. Did you forget to register type?");
		}
		
		T instance;
		if(targetClass.isEnum()) {
			T constants[] = targetClass.getEnumConstants();
			instance = constants[buf.readInt()];
		} else {
			try {
				instance = targetClass.newInstance();
			} catch (InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
				throw new RuntimeException("Cannot create instance of  " + targetClass);
			}
			
			instance.init(buf);
		}
		
        return targetClass.cast(instance);
    }

}
