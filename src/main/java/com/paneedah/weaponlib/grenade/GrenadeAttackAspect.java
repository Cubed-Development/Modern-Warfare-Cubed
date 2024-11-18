package com.paneedah.weaponlib.grenade;

import com.paneedah.mwc.instancing.PlayerGrenadeInstance;
import com.paneedah.mwc.network.NetworkPermitManager;
import com.paneedah.mwc.network.messages.GrenadeMessage;
import com.paneedah.weaponlib.CommonModContext;
import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.grenade.ItemGrenade.Type;
import com.paneedah.weaponlib.state.Aspect;
import com.paneedah.weaponlib.state.StateManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

import static com.paneedah.mwc.MWC.CHANNEL;
import static com.paneedah.mwc.ProjectConstants.LOGGER;


/*
 * On a client side this class is used from within a separate client "ticker" thread
 */
public class GrenadeAttackAspect implements Aspect<GrenadeState, PlayerGrenadeInstance> {

    private final Predicate<PlayerGrenadeInstance> hasSafetyPin = instance -> instance.getGrenade().hasSafetyPin();

    private static final Predicate<PlayerGrenadeInstance> reequipTimeoutExpired =
            instance -> System.currentTimeMillis() > instance.getStateUpdateTimestamp()
                    + instance.getGrenade().getReequipTimeout();

//    private static Predicate<PlayerGrenadeInstance> isSmokeGrenade =
//                    instance -> instance.getGrenade().isSmokeOnly();

//    private static Predicate<PlayerGrenadeInstance> takingOffSafetyPinCompleted = instance ->
//            System.currentTimeMillis() >= instance.getStateUpdateTimestamp()
//                + instance.getGrenade().getTotalTakeSafetyPinOffDuration() * 1.1;

    private static final Predicate<PlayerGrenadeInstance> throwingCompleted = instance ->
            System.currentTimeMillis() >= instance.getStateUpdateTimestamp()
                    + instance.getGrenade().getTotalThrowingDuration() * 1.1;

    private static final Set<GrenadeState> allowedAttackFromStates = new HashSet<>(
            Arrays.asList(GrenadeState.READY, GrenadeState.STRIKER_LEVER_RELEASED));

    private static final Set<GrenadeState> allowedPinOffFromStates = new HashSet<>(
            Collections.singletonList(GrenadeState.SAFETY_PING_OFF));

    private static final Set<GrenadeState> allowedUpdateFromStates = new HashSet<>(
            Arrays.asList(GrenadeState.STRIKER_LEVER_RELEASED, GrenadeState.THROWING, GrenadeState.THROWN));

    private final ModContext modContext;

    private StateManager<GrenadeState, ? super PlayerGrenadeInstance> stateManager;

    public GrenadeAttackAspect(CommonModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public void setPermitManager(NetworkPermitManager permitManager) {}

    @Override
    public void setStateManager(StateManager<GrenadeState, ? super PlayerGrenadeInstance> stateManager) {
        this.stateManager = stateManager;

        stateManager

                .in(this)
                .change(GrenadeState.READY).to(GrenadeState.SAFETY_PING_OFF)
                .withAction(i -> takeSafetyPinOff(i))
                .when(hasSafetyPin)
                .manual()

                .in(this).change(GrenadeState.SAFETY_PING_OFF).to(GrenadeState.STRIKER_LEVER_RELEASED)
                .withAction(i -> releaseStrikerLever(i))
                //.when(takingOffSafetyPinCompleted)
                .manual()

                .in(this).change(GrenadeState.READY).to(GrenadeState.THROWING)
                .when(hasSafetyPin.negate())
                .manual()

                .in(this).change(GrenadeState.THROWING).to(GrenadeState.THROWN)
                .withAction(i -> throwIt(i))
                .when(throwingCompleted)
                .automatic()

                .in(this).change(GrenadeState.STRIKER_LEVER_RELEASED).to(GrenadeState.THROWING)
                .manual()

                .in(this).change(GrenadeState.THROWN).to(GrenadeState.READY)
                .withAction(i -> reequip(i))
                .when(reequipTimeoutExpired)
                .automatic()
        ;
    }

    private void throwIt(PlayerGrenadeInstance instance) {
        LOGGER.debug("Throwing with state " + instance.getState());
        instance.getPlayer().playSound(instance.getGrenade().getThrowSound(), 1, 1);
        CHANNEL.sendToServer(new GrenadeMessage(instance));
    }

    private void reequip(PlayerGrenadeInstance instance) {
        LOGGER.debug("Reequipping");
    }

    private void takeSafetyPinOff(PlayerGrenadeInstance instance) {
        instance.getPlayer().playSound(instance.getGrenade().getSafetyPinOffSound(), 1, 1);
        LOGGER.debug("Taking safety pin off");
    }

    private void releaseStrikerLever(PlayerGrenadeInstance instance) {
        LOGGER.debug("Safety pin is off");
    }

    void onAttackButtonClick(EntityPlayer player, boolean throwingFar) {
        PlayerGrenadeInstance grenadeInstance = modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance(player, PlayerGrenadeInstance.class);
        if (grenadeInstance != null) {
            grenadeInstance.setThrowingFar(throwingFar);
            stateManager.changeStateFromAnyOf(this, grenadeInstance, allowedAttackFromStates,
                    GrenadeState.SAFETY_PING_OFF, GrenadeState.THROWING);
        }
    }

    void onAttackButtonUp(EntityPlayer player, boolean throwingFar) {
        PlayerGrenadeInstance grenadeInstance = modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance(player, PlayerGrenadeInstance.class);
        if (grenadeInstance != null) {
            grenadeInstance.setThrowingFar(throwingFar);
            stateManager.changeStateFromAnyOf(this, grenadeInstance, allowedPinOffFromStates, GrenadeState.STRIKER_LEVER_RELEASED);
        }
    }

    void onUpdate(EntityPlayer player) {
        PlayerGrenadeInstance grenadeInstance = modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance(player, PlayerGrenadeInstance.class);
        if (grenadeInstance != null) {
            stateManager.changeStateFromAnyOf(this, grenadeInstance, allowedUpdateFromStates);
        }
    }

    public void serverThrowGrenade(EntityPlayer player, PlayerGrenadeInstance instance) {
        LOGGER.debug("Throwing grenade");

        //boolean isSmokeGrenade = instance.getGrenade().isSmokeOnly();

        serverThrowGrenade(modContext, player, instance);

        if (player.inventory.getStackInSlot(instance.getItemInventoryIndex()) == null) {
            return;
        }

        if (!player.capabilities.isCreativeMode) {
            player.inventory.getStackInSlot(instance.getItemInventoryIndex()).shrink(1);
        }
        if (player.inventory.mainInventory.get(instance.getItemInventoryIndex()).getCount() <= 0) {
            player.inventory.removeStackFromSlot(instance.getItemInventoryIndex());
        }
    }

    public static void serverThrowGrenade(ModContext modContext, EntityLivingBase player, PlayerGrenadeInstance instance) {
        if (instance.getGrenade().getType() == Type.SMOKE) {
            float velocity = instance.isThrowingFar() ? instance.getGrenade().getFarVelocity() : instance.getGrenade().getVelocity();
            EntitySmokeGrenade entityGrenade = new EntitySmokeGrenade.Builder()
                    .withThrower(player)
                    .withActivationTimestamp(System.currentTimeMillis())
                    .withGrenade(instance.getGrenade())
                    .withSmokeAmount(instance.getGrenade().getExplosionStrength())
                    .withActivationDelay(0) //instance.getGrenade().getExplosionTimeout())
                    .withActiveDuration(instance.getGrenade().getActiveDuration())
                    .withVelocity(velocity)
                    .withGravityVelocity(instance.getGrenade().getGravityVelocity())
                    .withRotationSlowdownFactor(instance.getGrenade().getRotationSlowdownFactor())
                    .build(modContext);
            LOGGER.debug("Throwing velocity {} ", velocity);
            if (player != null) {
                player.world.spawnEntity(entityGrenade);
            }
        } else if (instance.getGrenade().getType() == Type.GAS) {
            float velocity = instance.isThrowingFar() ? instance.getGrenade().getFarVelocity() : instance.getGrenade().getVelocity();
            EntityGasGrenade entityGrenade = new EntityGasGrenade.Builder()
                    .withThrower(player)
                    .withActivationTimestamp(System.currentTimeMillis())
                    .withGrenade(instance.getGrenade())
                    .withSmokeAmount(instance.getGrenade().getExplosionStrength())
                    .withActivationDelay(0)
                    .withActiveDuration(instance.getGrenade().getActiveDuration())
                    .withVelocity(velocity)
                    .withGravityVelocity(instance.getGrenade().getGravityVelocity())
                    .withRotationSlowdownFactor(instance.getGrenade().getRotationSlowdownFactor())
                    .build(modContext);
            LOGGER.debug("Throwing velocity {} ", velocity);
            if (player != null) {
                player.world.spawnEntity(entityGrenade);
            }
        } else if (instance.getGrenade().getType() == Type.FLASH) {
            float velocity = instance.isThrowingFar() ? instance.getGrenade().getFarVelocity() : instance.getGrenade().getVelocity();
            EntityFlashGrenade entityGrenade = new EntityFlashGrenade.Builder()
                    .withThrower(player)
                    .withActivationTimestamp(System.currentTimeMillis())
                    .withGrenade(instance.getGrenade())
                    .withExplosionStrength(instance.getGrenade().getExplosionStrength())
                    .withExplosionTimeout(instance.getGrenade().getExplosionTimeout())
                    .withVelocity(velocity)
                    .withGravityVelocity(instance.getGrenade().getGravityVelocity())
                    .withRotationSlowdownFactor(instance.getGrenade().getRotationSlowdownFactor())
                    .withDestroyingBlocks(false)
                    .build(modContext);
            LOGGER.debug("Throwing velocity {} ", velocity);
            if (player != null) {
                player.world.spawnEntity(entityGrenade);
            }
        } else {
            float velocity = instance.isThrowingFar() ? instance.getGrenade().getFarVelocity() : instance.getGrenade().getVelocity();
            EntityGrenade entityGrenade = new EntityGrenade.Builder()
                    .withThrower(player)
                    .withActivationTimestamp(System.currentTimeMillis())
                    .withGrenade(instance.getGrenade())
                    .withExplosionStrength(instance.getGrenade().getExplosionStrength())
                    .withExplosionTimeout(instance.getGrenade().getExplosionTimeout())
                    .withVelocity(velocity)
                    .withGravityVelocity(instance.getGrenade().getGravityVelocity())
                    .withRotationSlowdownFactor(instance.getGrenade().getRotationSlowdownFactor())
                    .withDestroyingBlocks(instance.getGrenade().isDestroyingBlocks())
                    .build(modContext);
            LOGGER.debug("Throwing velocity {} ", velocity);
            if (player != null) {
                player.world.spawnEntity(entityGrenade);
            }
        }
    }

    int getParticleCount(float damage) {
        return (int) (-0.11 * (damage - 30) * (damage - 30) + 100);
    }
}
