package com.paneedah.weaponlib.melee;

import com.paneedah.mwc.network.NetworkPermitManager;
import com.paneedah.mwc.network.messages.BloodClientMessage;
import com.paneedah.mwc.network.messages.MeleeAttackMessage;
import com.paneedah.weaponlib.CommonModContext;
import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.state.Aspect;
import com.paneedah.weaponlib.state.StateManager;
import dev.redstudio.redcore.vectors.Vector3F;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

import static com.paneedah.mwc.MWC.CHANNEL;
import static com.paneedah.mwc.proxies.ClientProxy.MC;
import static com.paneedah.mwc.utils.ModReference.LOG;

/*
 * On a client side this class is used from within a separate client "ticker" thread
 */
public class MeleeAttackAspect implements Aspect<MeleeState, PlayerMeleeInstance> {

    private static final long STUB_DURATION = 250;

    private static final long HEAVY_STUB_DURATION = 250;

    
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
    public void setPermitManager(NetworkPermitManager permitManager) {}

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

    
    private void cannotAttack(PlayerMeleeInstance meleeInstance) {
        if (meleeInstance.getPlayer() instanceof EntityPlayer)
            ((EntityPlayer) meleeInstance.getPlayer()).sendStatusMessage(new TextComponentString(I18n.format("gui.coolingDown")), true);

        meleeInstance.getPlayer().playSound(modContext.getNoAmmoSound(), 1, 1);
    }

    private void attack(PlayerMeleeInstance meleeInstance, boolean isHeavyAttack) {
        if (FMLCommonHandler.instance().getSide() == Side.CLIENT)
            attackClient(meleeInstance, isHeavyAttack);
    }

    @SideOnly(Side.CLIENT)
    private void attackClient(PlayerMeleeInstance meleeInstance, boolean isHeavyAttack) {
        RayTraceResult objectMouseOver = MC.objectMouseOver;

        if (objectMouseOver != null) {
            EntityPlayer player = MC.player;
            World world = player.world;
            player.playSound(isHeavyAttack ? meleeInstance.getWeapon().getHeavyAtackSound() : meleeInstance.getWeapon().getLightAtackSound(), 1, 1);

            switch (objectMouseOver.typeOfHit)
            {
                case ENTITY:
                    attackEntity(objectMouseOver.entityHit, player, meleeInstance, isHeavyAttack);
                    break;
                case BLOCK:
                    if (!world.isAirBlock(objectMouseOver.getBlockPos())) {
                        MC.playerController.clickBlock(objectMouseOver.getBlockPos(), objectMouseOver.sideHit);
                    }
                default:
                    break;
            }
        }
    }

    private void attackEntity(Entity entity, EntityPlayer player, PlayerMeleeInstance instance, boolean isHeavyAttack) {
        CHANNEL.sendToServer(new MeleeAttackMessage(instance, entity.getEntityId(), isHeavyAttack));
        entity.attackEntityFrom(DamageSource.causePlayerDamage(player), instance.getWeapon().getDamage(isHeavyAttack));
    }

    public void serverAttack(EntityPlayer player, PlayerMeleeInstance instance, Entity entity, boolean isHeavyAttack) {
        LOG.debug("Player {} hits {} with {} in state {} with damage {}", player, entity, instance, instance.getState(),
                instance.getWeapon().getDamage(isHeavyAttack));
        float damage = instance.getWeapon().getDamage(isHeavyAttack);
        entity.attackEntityFrom(DamageSource.causePlayerDamage(player), damage);

        NetworkRegistry.TargetPoint point = new NetworkRegistry.TargetPoint(entity.dimension, entity.posX, entity.posY, entity.posZ, 100);

        double motionX = entity.posX - player.posX;
        double motionY = entity.posY - player.posY;
        double motionZ = entity.posZ - player.posZ;

        int count = getParticleCount (damage);
        LOG.debug("Generating {} particle(s) per damage {}", count, damage);

        CHANNEL.sendToAllAround(new BloodClientMessage(new Vector3F((float) (entity.posX - motionX / 2), (float) (entity.posY - motionY / 2) + 1, (float) (entity.posZ - motionZ / 2)), new Vector3F((float) motionX / 16, (float) motionY / 16, (float) motionZ / 16)), point);
    }

    int getParticleCount(float damage) {
        return (int) (-0.11 * (damage - 30) * (damage - 30) + 100);
    }
}
