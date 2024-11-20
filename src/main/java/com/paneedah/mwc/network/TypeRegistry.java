package com.paneedah.mwc.network;

import com.paneedah.mwc.instancing.*;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.electronics.HandheldState;
import com.paneedah.weaponlib.electronics.TabletState;
import com.paneedah.weaponlib.grenade.GrenadeState;
import com.paneedah.weaponlib.melee.MeleeAttachmentAspect;
import com.paneedah.weaponlib.melee.MeleeState;
import com.paneedah.weaponlib.melee.PlayerMeleeInstance;
import com.paneedah.weaponlib.state.Permit;
import io.netty.buffer.ByteBuf;
import lombok.NoArgsConstructor;

import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

import static com.paneedah.mwc.ProjectConstants.RED_LOGGER;
import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public final class TypeRegistry {

    private static final HashMap<String, Class<? extends ISerializable>> typeRegistry = new HashMap<>();

    static {
        register(PlayerItemInstance.class);
        register(PlayerWeaponInstance.class);
        register(PlayerMagazineInstance.class);
        register(PlayerMeleeInstance.class);
        register(PlayerGrenadeInstance.class);
        register(PlayerHandheldInstance.class);
        register(PlayerTabletInstance.class);

        register(WeaponState.class);
        register(MagazineState.class);
        register(MeleeState.class);
        register(GrenadeState.class);
        register(HandheldState.class);
        register(TabletState.class);

        register(Permit.class);
        register(WeaponAttachmentAspect.EnterAttachmentModePermit.class);
        register(WeaponAttachmentAspect.ExitAttachmentModePermit.class);
        register(WeaponAttachmentAspect.ChangeAttachmentPermit.class);
        register(MeleeAttachmentAspect.EnterAttachmentModePermit.class);
        register(MeleeAttachmentAspect.ExitAttachmentModePermit.class);
        register(MeleeAttachmentAspect.ChangeAttachmentPermit.class);
        register(WeaponReloadAspect.LoadPermit.class);
        register(WeaponReloadAspect.UnloadPermit.class);
        register(WeaponReloadAspect.CompoundPermit.class);
        register(MagazineReloadAspect.LoadPermit.class);
        register(MagazineReloadAspect.UnloadPermit.class);

        register(LightExposure.class);
        register(SpreadableExposure.class);
    }

    private static <T extends ISerializable> void register(Class<T> cls) {
        typeRegistry.put(cls.getName(), cls);
    }

    public static <T extends ISerializable> void write(final ByteBuf byteBuf, final T object) {
        final String className = object.getClass().getName();

        if (!typeRegistry.containsKey(className)) {
            RED_LOGGER.printFramedError("Networking", "Failed to write object because its class is not registered", "", "Object: " + object, "Class: " + object.getClass());
            throw new IllegalStateException("Failed to write object because its class is not registered");
        }

        byte[] classNameBytes = className.getBytes(StandardCharsets.UTF_8);
        byteBuf.writeInt(classNameBytes.length);
        byteBuf.writeBytes(classNameBytes);

        if (object.getClass().isEnum()) {
            byteBuf.writeInt(((Enum<?>) object).ordinal());
        } else {
            object.write(byteBuf);
        }
    }

    public static <T extends ISerializable> T read(final ByteBuf byteBuf) {
        final byte[] classNameBytes = new byte[byteBuf.readInt()];
        byteBuf.readBytes(classNameBytes);
        final String className = new String(classNameBytes, StandardCharsets.UTF_8);

        if (!typeRegistry.containsKey(className)) {
            RED_LOGGER.printFramedError("Networking", "Failed to deserialize object because its class is not registered", "Weapon will probably reset to it's default state");
            return null;
        }

        final Class<T> targetClass = (Class<T>) typeRegistry.get(className);

        if (targetClass == null) {
            RED_LOGGER.printFramedError("Networking", "Failed to deserialize object", "Weapon will probably reset to it's default state");
            return null;
        }

        T instance;
        if (targetClass.isEnum()) {
            T[] constants = targetClass.getEnumConstants();
            instance = constants[byteBuf.readInt()];
        } else {
            try {
                instance = targetClass.getDeclaredConstructor().newInstance();
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException exception) {
                RED_LOGGER.printFramedError("Networking", "Failed to create instance", "Weapon will probably reset to it's default state", exception.getMessage(), exception.getStackTrace()[3].toString());
                return null;
            }

            instance.read(byteBuf);
        }

        return targetClass.cast(instance);
    }

    public static HashMap<String, Class<?>> getTypeRegistryCopy() {
        return new HashMap<>(typeRegistry);
    }
}
