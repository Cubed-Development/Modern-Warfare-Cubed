package com.paneedah.weaponlib;

import com.paneedah.mwc.instancing.PlayerMagazineInstance;
import com.paneedah.mwc.network.NetworkPermitManager;
import com.paneedah.mwc.utils.MWCUtil;
import com.paneedah.weaponlib.state.Aspect;
import com.paneedah.weaponlib.state.Permit;
import com.paneedah.weaponlib.state.StateManager;
import lombok.NoArgsConstructor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvent;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

import static com.paneedah.weaponlib.state.Permit.Status.DENIED;
import static com.paneedah.weaponlib.state.Permit.Status.GRANTED;

public class MagazineReloadAspect implements Aspect<MagazineState, PlayerMagazineInstance> {

    private static final Set<MagazineState> allowedUpdateFromStates = new HashSet<>(
            Arrays.asList(
                    MagazineState.LOAD_REQUESTED,
                    MagazineState.LOAD,
                    MagazineState.UNLOAD_REQUESTED,
                    MagazineState.UNLOAD));

    @NoArgsConstructor
    public static class LoadPermit extends Permit<MagazineState> {

        public LoadPermit(MagazineState state) {
            super(state);
        }
    }

    @NoArgsConstructor
    public static class UnloadPermit extends Permit<MagazineState> {

        public UnloadPermit(MagazineState state) {
            super(state);
        }

    }

    private static final long reloadAnimationDuration = 1000;


    private static final Predicate<PlayerMagazineInstance> reloadAnimationCompleted = es ->
            System.currentTimeMillis() >= es.getStateUpdateTimestamp() + reloadAnimationDuration; // TODO: readVector3D reload animation duration from the state itself

    private final ModContext modContext;

    private NetworkPermitManager permitManager;

    private StateManager<MagazineState, ? super PlayerMagazineInstance> stateManager;

    private final Predicate<PlayerMagazineInstance> notFull = instance -> instance.getAmmo() < instance.getMagazine().getCapacity();

    private final Predicate<PlayerMagazineInstance> notEmpty = instance -> instance.getAmmo() != 0;

    public MagazineReloadAspect(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public void setStateManager(StateManager<MagazineState, ? super PlayerMagazineInstance> stateManager) {

        if (permitManager == null) {
            throw new IllegalStateException("Permit manager not initialized");
        }

        this.stateManager = stateManager

                .in(this)
                .change(MagazineState.READY).to(MagazineState.LOAD)
                .when(notFull)
                .withPermit((s, es) -> new LoadPermit(s),
                        modContext.getPlayerItemInstanceRegistry()::update,
                        permitManager)
                .withAction((c, f, t, p) -> doPermittedLoad(c, (LoadPermit) p))
                .manual()

                .in(this)
                .change(MagazineState.LOAD).to(MagazineState.READY)
                .when(reloadAnimationCompleted)
                .automatic()

                .in(this)
                .change(MagazineState.READY).to(MagazineState.UNLOAD)
                .when(notEmpty)
                .withPermit((s, es) -> new UnloadPermit(s),
                        modContext.getPlayerItemInstanceRegistry()::update,
                        permitManager)
                .withAction((c, f, t, p) -> doPermittedUnload(c, (UnloadPermit) p))
                .manual()

                .in(this)
                .change(MagazineState.UNLOAD).to(MagazineState.READY)
                .when(reloadAnimationCompleted)
                .automatic()

        ;
    }

    @Override
    public void setPermitManager(NetworkPermitManager permitManager) {
        this.permitManager = permitManager;
        permitManager.registerEvaluator(LoadPermit.class, PlayerMagazineInstance.class, (p, c) -> {evaluateLoad(p, c);});
        permitManager.registerEvaluator(UnloadPermit.class, PlayerMagazineInstance.class, (p, c) -> {evaluateUnload(p, c);});

    }

    public void reloadMainHeldItem(EntityPlayer player) {
        PlayerMagazineInstance instance = modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance(player, PlayerMagazineInstance.class);
        stateManager.changeState(this, instance, MagazineState.LOAD);
    }

    public void unloadMainHeldItem(EntityPlayer player) {
        PlayerMagazineInstance instance = modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance(player, PlayerMagazineInstance.class);
        stateManager.changeState(this, instance, MagazineState.UNLOAD);
    }

    void updateMainHeldItem(EntityPlayer player) {
        PlayerMagazineInstance instance = modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance(player, PlayerMagazineInstance.class);
        if (instance != null) {
            stateManager.changeStateFromAnyOf(this, instance, allowedUpdateFromStates); // no target state specified, will trigger auto-transitions
        }
    }


    private void evaluateUnload(final UnloadPermit permit, final PlayerMagazineInstance instance) {
        permit.setStatus(DENIED);

        final ItemStack itemStack = instance.getItemStack();

        if (!(itemStack.getItem() instanceof ItemMagazine))
            return;

        final EntityPlayer player = (EntityPlayer) instance.getPlayer();

        final ItemStack bulletStack = new ItemStack(instance.getCompatibleBullets().get(0), instance.getAmmo());
        if (!player.addItemStackToInventory(bulletStack))
            player.dropItem(bulletStack, false);

        if (itemStack.getCount() > 1) {
            itemStack.shrink(1);
            player.inventory.addItemStackToInventory(instance.getMagazine().create((short) 0));
        } else {
            instance.setAmmo((short) 0);
        }

        final SoundEvent unloadSound = instance.getMagazine().getUnloadSound();
        if (unloadSound != null)
            instance.getPlayer().playSound(unloadSound, 1, 1);

        permit.setStatus(GRANTED);
    }


    private void evaluateLoad(final LoadPermit permit, final PlayerMagazineInstance instance) {
        permit.setStatus(DENIED);

        final ItemStack itemStack = instance.getItemStack();

        if (!(itemStack.getItem() instanceof ItemMagazine))
            return;

        final EntityPlayer player = (EntityPlayer) instance.getPlayer();

        if (instance.getAmmo() >= instance.getCapacity())
            return;

        short consumedAmount;
        if ((consumedAmount = (short) MWCUtil.consumeMagazinesFromPlayerInventory(instance.getCompatibleBullets(), instance.getCapacity() - instance.getAmmo(), player)) == 0)
            return;

        if (itemStack.getCount() > 1) {
            itemStack.shrink(1);
            player.inventory.addItemStackToInventory(instance.getMagazine().create((short) (instance.getAmmo() + consumedAmount)));
        } else {
            instance.setAmmo((short) (instance.getAmmo() + consumedAmount));
        }

        final SoundEvent reloadSound = instance.getMagazine().getReloadSound();
        if (reloadSound != null)
            instance.getPlayer().playSound(reloadSound, 1, 1);

        permit.setStatus(GRANTED);
    }

    private void doPermittedUnload(PlayerMagazineInstance weaponInstance, UnloadPermit permit) {
        if (permit == null) {
            System.err.println("Permit is null, something went wrong");
        }
//      if(permit.getStatus() == Status.GRANTED) {
//          weaponInstance.getPlayer().playSound(weaponInstance.getWeapon().getReloadSound(), 1, 1);
//      }
    }

    private void doPermittedLoad(PlayerMagazineInstance weaponInstance, LoadPermit permit) {
        if (permit == null) {
            System.err.println("Permit is null, something went wrong");
        }
//      if(permit.getStatus() == Status.GRANTED) {
//          weaponInstance.getPlayer().playSound(weaponInstance.getWeapon().getReloadSound(), 1, 1);
//      }
    }
}
