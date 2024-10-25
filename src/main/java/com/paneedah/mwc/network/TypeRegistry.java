package com.paneedah.mwc.network;

import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.electronics.HandheldState;
import com.paneedah.weaponlib.electronics.PlayerHandheldInstance;
import com.paneedah.weaponlib.electronics.PlayerTabletInstance;
import com.paneedah.weaponlib.electronics.TabletState;
import com.paneedah.weaponlib.grenade.GrenadeState;
import com.paneedah.weaponlib.grenade.PlayerGrenadeInstance;
import com.paneedah.weaponlib.melee.MeleeAttachmentAspect;
import com.paneedah.weaponlib.melee.MeleeState;
import com.paneedah.weaponlib.melee.PlayerMeleeInstance;
import com.paneedah.weaponlib.state.Permit;
import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.UUID;

import static com.paneedah.mwc.ProjectConstants.LOGGER;
import static com.paneedah.mwc.ProjectConstants.RED_LOGGER;

@NoArgsConstructor
public final class TypeRegistry {

    @Getter private static final TypeRegistry INSTANCE = new TypeRegistry();

    private final HashMap<String, Class<? extends ISerializable>> typeRegistry = new HashMap<>();

    static {
        INSTANCE.register(PlayerItemInstance.class);
        INSTANCE.register(PlayerWeaponInstance.class);
        INSTANCE.register(PlayerMagazineInstance.class);
        INSTANCE.register(PlayerMeleeInstance.class);
        INSTANCE.register(PlayerGrenadeInstance.class);
        INSTANCE.register(PlayerHandheldInstance.class);
        INSTANCE.register(PlayerTabletInstance.class);

        INSTANCE.register(WeaponState.class);
        INSTANCE.register(MagazineState.class);
        INSTANCE.register(MeleeState.class);
        INSTANCE.register(GrenadeState.class);
        INSTANCE.register(HandheldState.class);
        INSTANCE.register(TabletState.class);

        INSTANCE.register(Permit.class);
        INSTANCE.register(WeaponAttachmentAspect.EnterAttachmentModePermit.class);
        INSTANCE.register(WeaponAttachmentAspect.ExitAttachmentModePermit.class);
        INSTANCE.register(WeaponAttachmentAspect.ChangeAttachmentPermit.class);
        INSTANCE.register(MeleeAttachmentAspect.EnterAttachmentModePermit.class);
        INSTANCE.register(MeleeAttachmentAspect.ExitAttachmentModePermit.class);
        INSTANCE.register(MeleeAttachmentAspect.ChangeAttachmentPermit.class);
        INSTANCE.register(WeaponReloadAspect.LoadPermit.class);
        INSTANCE.register(WeaponReloadAspect.UnloadPermit.class);
        INSTANCE.register(WeaponReloadAspect.CompoundPermit.class);
        INSTANCE.register(MagazineReloadAspect.LoadPermit.class);
        INSTANCE.register(MagazineReloadAspect.UnloadPermit.class);

        INSTANCE.register(LightExposure.class);
        INSTANCE.register(SpreadableExposure.class);
    }

    private <T extends ISerializable> void register(Class<T> cls) {
        typeRegistry.put(cls.getName(), cls);
    }

    public <T extends ISerializable> void toBytes(final T object, final ByteBuf byteBuf) {
        final String className = object.getClass().getName();

        if (!typeRegistry.containsKey(className)) {
            RED_LOGGER.printFramedError("Networking", "Failed to write object because its class is not registered", "", "Object: " + object, "Class: " + object.getClass());
            throw new IllegalStateException("Failed to write object because its class is not registered");
        }

        byte[] classNameBytes = className.getBytes(StandardCharsets.UTF_8);
        byteBuf.writeByte((byte) classNameBytes.length);
        byteBuf.writeBytes(classNameBytes);

        if (object.getClass().isEnum()) {
            byteBuf.writeInt(((Enum<?>) object).ordinal());
        } else {
            object.write(byteBuf);
        }
    }

    public <T extends ISerializable> T fromBytes(final ByteBuf byteBuf) {
        Class<T> targetClass;

        final byte[] classNameBytes = new byte[byteBuf.readByte()];
        byteBuf.readBytes(classNameBytes);
        final String className = new String(classNameBytes, StandardCharsets.UTF_8);

        if (!typeRegistry.containsKey(className)) {
            RED_LOGGER.printFramedError("Networking", "Failed to deserialize object because its class is not registered", "Weapon will reset to it's default state");
            return null;
        }

        targetClass = (Class<T>) typeRegistry.get(className);

        if (targetClass == null) {
            RED_LOGGER.printFramedError("Networking", "Failed to deserialize object", "Weapon will reset to it's default state");
            return null;
        }

        T instance;
        if (targetClass.isEnum()) {
            T[] constants = targetClass.getEnumConstants();
            instance = constants[byteBuf.readInt()];
        } else {
            try {
                instance = targetClass.newInstance();
            } catch (InstantiationException | IllegalAccessException exception) {
                RED_LOGGER.printFramedError("Networking", "Failed to create instance", "Weapon will reset to it's default state", exception.getMessage(), exception.getStackTrace()[3].toString());
                return null;
            }

            instance.read(byteBuf);
        }

        return targetClass.cast(instance);
    }
}
