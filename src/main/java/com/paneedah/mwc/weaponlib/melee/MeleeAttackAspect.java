package com.paneedah.mwc.weaponlib.melee;

import com.paneedah.mwc.weaponlib.CommonModContext;
import com.paneedah.mwc.weaponlib.ModContext;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleRayTraceResult;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleTargetPoint;
import com.paneedah.mwc.weaponlib.particle.SpawnParticleMessage;
import com.paneedah.mwc.weaponlib.state.Aspect;
import com.paneedah.mwc.weaponlib.state.PermitManager;
import com.paneedah.mwc.weaponlib.state.StateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

import static com.paneedah.mwc.utils.ModReference.log;
import static com.paneedah.mwc.weaponlib.compatibility.CompatibilityProvider.compatibility;


/*
 * On a client side this class is used from within a separate client "ticker" thread
 */
public class MeleeAttackAspect implements Aspect<MeleeState, PlayerMeleeInstance> {

    private static final long STUB_DURATION = 250;

    private static final long HEAVY_STUB_DURATION = 250;

    @SuppressWarnings("unused")
    private static final long ALERT_TIMEOUT = 300;

    private static Predicate<PlayerMeleeInstance> attackTimeoutExpired =
            instance -> System.currentTimeMillis() >  instance.getStateUpdateTimestamp()
                + STUB_DURATION;

    private static Predicate<PlayerMeleeInstance> heavyAttackTimeoutExpired =
            instance -> System.currentTimeMillis() >  instance.getStateUpdateTimestamp()
                + HEAVY_STUB_DURATION;

    private static Predicate<PlayerMeleeInstance> attackCooldownTimeoutExpired =
            instance -> System.currentTimeMillis() >  instance.getLastAttackTimestamp() + instance.getWeapon().getAttackCooldownTimeout();

    private static Predicate<PlayerMeleeInstance> heavyAttackCooldownTimeoutExpired =
            instance -> System.currentTimeMillis() >  instance.getLastAttackTimestamp() + instance.getWeapon().getHeavyAttackCooldownTimeout();

    private static Predicate<PlayerMeleeInstance> readyToStab =
            instance -> System.currentTimeMillis() >  instance.getStateUpdateTimestamp() + instance.getWeapon().getPrepareStubTimeout();

    private static Predicate<PlayerMeleeInstance> readyToHeavyStab =
            instance -> System.currentTimeMillis() >  instance.getStateUpdateTimestamp() + instance.getWeapon().getPrepareHeavyStubTimeout();

//    private static Predicate<PlayerMeleeInstance> alertTimeoutExpired =
//            instance -> System.currentTimeMillis() >= ALERT_TIMEOUT + instance.getStateUpdateTimestamp();

//    private static Predicate<PlayerMeleeInstance> sprinting = instance -> instance.getPlayer().isSprinting();

    private static final Set<MeleeState> allowedAttackFromStates = new HashSet<>(
            Arrays.asList(MeleeState.READY));

    private static final Set<MeleeState> allowedUpdateFromStates = new HashSet<>(
            Arrays.asList(MeleeState.ATTACKING, MeleeState.HEAVY_ATTACKING,
                    MeleeState.ATTACKING_STABBING, MeleeState.HEAVY_ATTACKING_STABBING, MeleeState.ALERT));


    private ModContext modContext;

    private StateManager<MeleeState, ? super PlayerMeleeInstance> stateManager;

    public MeleeAttackAspect(CommonModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public void setPermitManager(PermitManager permitManager) {}

    @Override
    public void setStateManager(StateManager<MeleeState, ? super PlayerMeleeInstance> stateManager) {
        this.stateManager = stateManager;

        stateManager

//        .in(this).change(MeleeState.READY).to(MeleeState.ALERT)
//        .when(attackCooldownTimeoutExpired.negate())
//        .withAction(this::cannotAttack)
//        .manual() // on start fire
//
//        .in(this).change(MeleeState.ALERT).to(MeleeState.READY)
//        .when(alertTimeoutExpired)
//        .automatic() //

        .in(this).change(MeleeState.READY).to(MeleeState.ATTACKING)
        .when(attackCooldownTimeoutExpired)
        .manual() // on start fire

        .in(this).change(MeleeState.ATTACKING).to(MeleeState.ATTACKING_STABBING)
        .withAction(i -> attack(i, false))
        .when(readyToStab)
        .automatic()

        .in(this).change(MeleeState.ATTACKING_STABBING).to(MeleeState.READY)
        .withAction(i -> {i.setLastAttackTimestamp(System.currentTimeMillis());})
        .when(attackTimeoutExpired)
        .automatic()

        .in(this).change(MeleeState.READY).to(MeleeState.HEAVY_ATTACKING)
        .when(heavyAttackCooldownTimeoutExpired)
        .manual()

        .in(this).change(MeleeState.HEAVY_ATTACKING).to(MeleeState.HEAVY_ATTACKING_STABBING)
        .withAction(i -> attack(i, true))
        .when(readyToHeavyStab)
        .automatic()

        .in(this).change(MeleeState.HEAVY_ATTACKING_STABBING).to(MeleeState.READY)
        .withAction(i -> {i.setLastAttackTimestamp(System.currentTimeMillis());})
        .when(heavyAttackTimeoutExpired)
        .automatic()
        ;
    }

    void onAttackButtonClick(EntityPlayer player) {
        PlayerMeleeInstance weaponInstance = modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance(player, PlayerMeleeInstance.class);
        if(weaponInstance != null) {
           stateManager.changeStateFromAnyOf(this, weaponInstance, allowedAttackFromStates, MeleeState.ATTACKING, MeleeState.ALERT);
        }
    }

    void onHeavyAttackButtonClick(EntityPlayer player) {
        PlayerMeleeInstance weaponInstance = modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance(player, PlayerMeleeInstance.class);
        if(weaponInstance != null) {
           stateManager.changeStateFromAnyOf(this, weaponInstance, allowedAttackFromStates, MeleeState.HEAVY_ATTACKING, MeleeState.ALERT);
        }
    }

    void onUpdate(EntityPlayer player) {
        PlayerMeleeInstance weaponInstance = modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance(player, PlayerMeleeInstance.class);
        if(weaponInstance != null) {
            stateManager.changeStateFromAnyOf(this, weaponInstance, allowedUpdateFromStates);
        }
    }

    @SuppressWarnings("unused")
    private void cannotAttack(PlayerMeleeInstance meleeInstance) {
        modContext.getStatusMessageCenter().addAlertMessage(
                compatibility.getLocalizedString("gui.coolingDown"), 2, 200, 100);
        compatibility.playSound(meleeInstance.getPlayer(), modContext.getNoAmmoSound(), 1F, 1F);
    }

    private void attack(PlayerMeleeInstance meleeInstance, boolean isHeavyAttack) {

        CompatibleRayTraceResult objectMouseOver = compatibility.getObjectMouseOver();
        if (objectMouseOver != null) {
            EntityPlayer player = compatibility.clientPlayer();
            World world = compatibility.world(player);
            compatibility.playSound(player, isHeavyAttack ? meleeInstance.getWeapon().getHeavyAtackSound() : meleeInstance.getWeapon().getLightAtackSound(), 1F, 1F);

            switch (objectMouseOver.getTypeOfHit())
            {
                case ENTITY:
                    attackEntity(objectMouseOver.getEntityHit(), player, meleeInstance, isHeavyAttack);
                    break;
                case BLOCK:
                    if (!compatibility.isAirBlock(world, objectMouseOver.getBlockPos())) {
                        compatibility.clickBlock(objectMouseOver.getBlockPos(), objectMouseOver.getSideHit());
                    }
                default:
                    break;
            }
        }

    }

    private void attackEntity(Entity entity, EntityPlayer player, PlayerMeleeInstance instance, boolean isHeavyAttack) {
        modContext.getChannel().getChannel().sendToServer(new TryAttackMessage(instance, entity, isHeavyAttack));
        entity.attackEntityFrom(DamageSource.causePlayerDamage(player),
                instance.getWeapon().getDamage(isHeavyAttack));
    }

    public void serverAttack(EntityPlayer player, PlayerMeleeInstance instance, Entity entity, boolean isHeavyAttack) {
        log.debug("Player {} hits {} with {} in state {} with damage {}", player, entity, instance, instance.getState(),
                instance.getWeapon().getDamage(isHeavyAttack));
        float damage = instance.getWeapon().getDamage(isHeavyAttack);
        entity.attackEntityFrom(DamageSource.causePlayerDamage(player), damage);

        CompatibleTargetPoint point = new CompatibleTargetPoint(entity.dimension,
                entity.posX, entity.posY, entity.posZ, 100);

        double motionX = entity.posX - player.posX;
        double motionY = entity.posY - player.posY;
        double motionZ = entity.posZ - player.posZ;

        int count = getParticleCount (damage);
        log.debug("Generating {} particle(s) per damage {}", count, damage);

        modContext.getChannel().sendToAllAround(new SpawnParticleMessage(
                SpawnParticleMessage.ParticleType.BLOOD,
                count,
                entity.posX - motionX / 2,
                entity.posY - motionY / 2,
                entity.posZ - motionZ / 2),
                point);
    }

    int getParticleCount(float damage) {
        return (int) (-0.11 * (damage - 30) * (damage - 30) + 100);
    }
}
