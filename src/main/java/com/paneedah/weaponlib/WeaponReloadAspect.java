package com.paneedah.weaponlib;

import com.paneedah.mwc.utils.MWCUtil;
import com.paneedah.weaponlib.animation.AnimationModeProcessor;
import com.paneedah.weaponlib.network.TypeRegistry;
import com.paneedah.weaponlib.state.Aspect;
import com.paneedah.weaponlib.state.Permit;
import com.paneedah.weaponlib.state.Permit.Status;
import com.paneedah.weaponlib.state.PermitManager;
import com.paneedah.weaponlib.state.StateManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.text.translation.I18n;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static com.paneedah.mwc.utils.ModReference.LOG;

public class WeaponReloadAspect implements Aspect<WeaponState, PlayerWeaponInstance> {

    private static final long ALERT_TIMEOUT = 500;
    private static final long INSPECT_TIMEOUT = 500;
    private static final long UNLOAD_TIMEOUT = 1000;

	static {
        TypeRegistry.getInstance().register(CompoundPermit.class);
        TypeRegistry.getInstance().register(UnloadPermit.class);
        TypeRegistry.getInstance().register(LoadPermit.class);
        TypeRegistry.getInstance().register(PlayerWeaponInstance.class); // TODO: move it out
    }

    private static final Set<WeaponState> ALLOWED_UPDATE_FROM_STATES = new HashSet<>(Arrays.asList(
                    WeaponState.AWAIT_FURTHER_LOAD_INSTRUCTIONS,
                    WeaponState.COMPOUND_REQUESTED,
                    WeaponState.COMPOUND_RELOAD,
                    WeaponState.COMPOUND_RELOAD_EMPTY,
                    WeaponState.COMPOUND_RELOAD_FINISH,
                    WeaponState.COMPOUND_RELOAD_FINISHED,
                    WeaponState.TACTICAL_RELOAD,
                    WeaponState.LOAD_REQUESTED,
                    WeaponState.LOAD,
                    WeaponState.LOAD_ITERATION,
                    WeaponState.LOAD_ITERATION_COMPLETED,
                    WeaponState.ALL_LOAD_ITERATIONS_COMPLETED,
                    WeaponState.UNLOAD_PREPARING,
                    WeaponState.UNLOAD_REQUESTED,
                    WeaponState.UNLOAD,
                    WeaponState.ALERT,
                    WeaponState.INSPECTING,
                    WeaponState.DRAWING
	));

    public static class CompoundPermit extends Permit<WeaponState> {

        public CompoundPermit() {
        }

        public CompoundPermit(WeaponState state) {
            super(state);
        }

    }


    public static class UnloadPermit extends Permit<WeaponState> {

        public UnloadPermit() {
        }

        public UnloadPermit(WeaponState state) {
            super(state);
        }
    }

    public static class LoadPermit extends Permit<WeaponState> {

        public LoadPermit() {
        }

        public LoadPermit(WeaponState state) {
            super(state);
        }
    }

    private static Predicate<PlayerWeaponInstance> hasNextLoadIteration = weaponInstance -> weaponInstance.getWeapon().hasIteratedLoad() && weaponInstance.getLoadIterationCount() > 0;

    private static Predicate<PlayerWeaponInstance> supportsDirectBulletLoad = weaponInstance -> weaponInstance.getWeapon().getAmmoCapacity() > 0;

    private static Predicate<PlayerWeaponInstance> magazineAttached = weaponInstance -> WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.MAGAZINE, weaponInstance) != null;
    
    private static Predicate<PlayerWeaponInstance> hasAmmo = (i) -> i.getAmmo() != 0;

    private static Predicate<PlayerWeaponInstance> loadIterationCompleted = weaponInstance -> System.currentTimeMillis() >= weaponInstance.getStateUpdateTimestamp() + Math.max(weaponInstance.getWeapon().builder.loadIterationTimeout, weaponInstance.getWeapon().getTotalLoadIterationDuration() + 250);

    private static Predicate<PlayerWeaponInstance> allLoadIterationsCompleted = weaponInstance -> System.currentTimeMillis() >= weaponInstance.getStateUpdateTimestamp() + weaponInstance.getWeapon().getAllLoadIterationAnimationsCompletedDuration();

    private static Predicate<PlayerWeaponInstance> reloadAnimationCompleted = weaponInstance -> {
        long maxTime = weaponInstance.getAnimationDuration();
		
		/*
		if (weaponInstance.getState() == WeaponState.COMPOUND_RELOAD)
			maxTime /= 4;
		else if (weaponInstance.getState() == WeaponState.COMPOUND_RELOAD_EMPTY)
			maxTime /= 1.5;
		*/
        
        //return System.currentTimeMillis() - weaponInstance.getStateUpdateTimestamp() > 2116;

        return System.currentTimeMillis() >= weaponInstance.getStateUpdateTimestamp() + Math.max(weaponInstance.getWeapon().builder.reloadingTimeout, maxTime);
    };


    private static Predicate<PlayerWeaponInstance> magSwapCompleted = weaponInstance -> weaponInstance.isMagSwapDone();
    
    private static Predicate<PlayerWeaponInstance> reloadMidpoint = weaponInstance -> Math.abs((System.currentTimeMillis() - (weaponInstance.getReloadTimestamp())) / ((double) weaponInstance.getWeapon().getTotalReloadingDuration() * 0.5) - 0.5) < 0.01;
    
    private static Predicate<PlayerWeaponInstance> unloadTimeoutExpired = weaponInstance -> System.currentTimeMillis() >= weaponInstance.getStateUpdateTimestamp() + UNLOAD_TIMEOUT;

    private static Predicate<PlayerWeaponInstance> awaitFurtherLoadInstructionCompleted = weaponInstance -> System.currentTimeMillis() >= weaponInstance.getStateUpdateTimestamp() + 295;
    
    private static Predicate<PlayerWeaponInstance> loadAfterUnloadEnabled = PlayerWeaponInstance::isLoadAfterUnloadEnabled;

    private static Predicate<PlayerWeaponInstance> unloadAnimationCompleted = weaponInstance -> System.currentTimeMillis() >= weaponInstance.getStateUpdateTimestamp() + weaponInstance.getWeapon().getTotalUnloadingDuration() * 1.1;

    private static Predicate<PlayerWeaponInstance> prepareFirstLoadIterationAnimationCompleted = weaponInstance -> System.currentTimeMillis() >= weaponInstance.getStateUpdateTimestamp() + weaponInstance.getWeapon().getPrepareFirstLoadIterationAnimationDuration() * 1.1;
    
    private static Predicate<PlayerWeaponInstance> shouldFinishCompoundReload = weaponInstance -> {
        if (weaponInstance.isDelayCompoundEnd())
            return true;
        else {
            long maxTime = (long) (weaponInstance.getAnimationDuration() * 1.2);
            
            return System.currentTimeMillis() >= weaponInstance.getReloadTimestamp() + maxTime;
        }
    };


    private Predicate<PlayerWeaponInstance> inventoryHasFreeSlots = weaponInstance -> weaponInstance.getPlayer() instanceof EntityPlayer && !(((EntityPlayer) weaponInstance.getPlayer()).inventory.getFirstEmptyStack() == -1);

    private static Predicate<PlayerWeaponInstance> alertTimeoutExpired = instance -> System.currentTimeMillis() >= ALERT_TIMEOUT + instance.getStateUpdateTimestamp();

    private static Predicate<PlayerWeaponInstance> inspectTimeoutExpired = instance -> System.currentTimeMillis() >= INSPECT_TIMEOUT + instance.getStateUpdateTimestamp();

    private static Predicate<PlayerWeaponInstance> drawingAnimationCompleted = weaponInstance -> System.currentTimeMillis() >= weaponInstance.getStateUpdateTimestamp() + weaponInstance.getWeapon().getTotalDrawingDuration() * 1.0;

    private ModContext modContext;

    private PermitManager permitManager;

    private StateManager<WeaponState, ? super PlayerWeaponInstance> stateManager;

    public WeaponReloadAspect(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public void setStateManager(StateManager<WeaponState, ? super PlayerWeaponInstance> stateManager) {
        if (permitManager == null)
            throw new IllegalStateException("Permit manager not initialized");

        this.stateManager = stateManager
                .in(this)
                .change(WeaponState.READY).to(WeaponState.AWAIT_FURTHER_LOAD_INSTRUCTIONS)
                .manual()

                .in(this)
                .change(WeaponState.READY).to(WeaponState.COMPOUND_REQUESTED)
                .manual()

                .in(this)
                .change(WeaponState.COMPOUND_RELOAD_EMPTY).to(WeaponState.COMPOUND_RELOAD_EMPTY)
                .when(reloadMidpoint.and(magSwapCompleted.negate()))

                .withAction(this::clientCompoundReload)
                .automatic()

                .in(this)
                .change(WeaponState.COMPOUND_RELOAD).to(WeaponState.COMPOUND_RELOAD)
                .when(reloadMidpoint.and(magSwapCompleted.negate()))
                .withAction(this::clientCompoundReload)
                .automatic()

                .in(this)

                .change(WeaponState.READY).to(WeaponState.COMPOUND_RELOAD)

                //.withAction(this::clientCompoundReload)

                /*
                .withPermit((s, es) -> new LoadPermit(s), modContext.getPlayerItemInstanceRegistry()::update, permitManager)
                .withAction((c, f, t, p) -> completeClientLoad(c, (LoadPermit)p))
                */
                .manual()

                .in(this)
                .change(WeaponState.READY).to(WeaponState.COMPOUND_RELOAD_EMPTY)
                .manual()

                .in(this)
                .change(WeaponState.READY).to(WeaponState.TACTICAL_RELOAD)
                .manual()
                
                /*
                .in(this)
                .change(WeaponState.AWAIT_FURTHER_LOAD_INSTRUCTIONS).to(WeaponState.LOAD)
                .when(hasAmmo.and(magazineAttached))
                .withAction(this::noFurtherLoadInstructionsReceived)
                .automatic()
                */
                
                .in(this)
                .change(WeaponState.AWAIT_FURTHER_LOAD_INSTRUCTIONS).to(WeaponState.READY)
                .when(awaitFurtherLoadInstructionCompleted)
                .withAction(this::noFurtherLoadInstructionsReceived)
                .automatic()

                .in(this)
                .change(WeaponState.AWAIT_FURTHER_LOAD_INSTRUCTIONS).to(WeaponState.READY)
                .withAction(this::furtherLoadInstructionsReceived)
                .manual()

                .in(this)
                .change(WeaponState.COMPOUND_REQUESTED).to(WeaponState.READY)
                .when(awaitFurtherLoadInstructionCompleted)
                .withAction(this::noCompoundInstructionsReceived)
                .automatic()

                .in(this)
                .change(WeaponState.COMPOUND_REQUESTED).to(WeaponState.READY)
                .withAction(this::compoundInstructionsReceived)
                .manual()

                .in(this)
                .change(WeaponState.READY).to(WeaponState.LOAD)
                .when(supportsDirectBulletLoad.or(magazineAttached.negate()))
                .withPermit((s, es) -> new LoadPermit(s), modContext.getPlayerItemInstanceRegistry()::update, permitManager)
                .withAction((c, f, t, p) -> completeClientLoad(c, (LoadPermit) p))
                .manual()

                .in(this)
                .change(WeaponState.UNLOAD).to(WeaponState.LOAD)
                .when(loadAfterUnloadEnabled.and(supportsDirectBulletLoad.or(magazineAttached.negate())))
                .withPermit((s, es) -> new LoadPermit(s), modContext.getPlayerItemInstanceRegistry()::update, permitManager)
                .withAction((c, f, t, p) -> completeClientLoad(c, (LoadPermit) p))
                .manual()

                .in(this)
                .change(WeaponState.LOAD).to(WeaponState.READY)
                .when(reloadAnimationCompleted.and(hasNextLoadIteration.negate()))
                .automatic()

                .in(this)
                .change(WeaponState.TACTICAL_RELOAD).to(WeaponState.COMPOUND_RELOAD_FINISH)
                .when(reloadAnimationCompleted.and(hasNextLoadIteration.negate()))
                .withAction((c, f, t, p) -> obamaCorporation(c))
                .automatic()

                .in(this)

                .change(WeaponState.COMPOUND_RELOAD).to(WeaponState.COMPOUND_RELOAD_FINISH)
                .when(reloadAnimationCompleted.and(hasNextLoadIteration.negate()))
                .withAction((c, f, t, p) -> obamaCorporation(c))
                .automatic()

                .in(this)
                .change(WeaponState.COMPOUND_RELOAD_EMPTY).to(WeaponState.COMPOUND_RELOAD_FINISH)
                .when(reloadAnimationCompleted.and(hasNextLoadIteration.negate()))
                .withAction((c, f, t, p) -> obamaCorporation(c))
                .automatic()

                .in(this)
                .change(WeaponState.COMPOUND_RELOAD_FINISH).to(WeaponState.COMPOUND_RELOAD_FINISHED)
                .withPermit((s, es) -> new CompoundPermit(s), modContext.getPlayerItemInstanceRegistry()::update, permitManager)
                .manual()

                .in(this)
                .change(WeaponState.COMPOUND_RELOAD_FINISHED).to(WeaponState.READY)
                .when(shouldFinishCompoundReload)
                .automatic()

                .in(this)
                .change(WeaponState.LOAD).to(WeaponState.LOAD_ITERATION)
                .when(hasNextLoadIteration.and(prepareFirstLoadIterationAnimationCompleted))
                .withAction(this::startLoadIteration)
                .automatic()

                .in(this)
                .change(WeaponState.LOAD_ITERATION).to(WeaponState.LOAD_ITERATION_COMPLETED)
                .when(loadIterationCompleted)
                .withAction(this::completeLoadIteration)
                .automatic()

                .in(this)
                .change(WeaponState.LOAD_ITERATION_COMPLETED).to(WeaponState.LOAD_ITERATION)
                .when(hasNextLoadIteration)
                .withAction(this::startLoadIteration)
                .automatic()

                .in(this)
                .change(WeaponState.LOAD_ITERATION_COMPLETED).to(WeaponState.ALL_LOAD_ITERATIONS_COMPLETED)
                .when(hasNextLoadIteration.negate())
                .automatic()

                .in(this)
                .change(WeaponState.ALL_LOAD_ITERATIONS_COMPLETED).to(WeaponState.READY)
                .when(allLoadIterationsCompleted)
                .withAction(this::completeAllLoadIterations)
                .automatic()

                .in(this)
                .prepare((c, f, t) -> { prepareUnload(c); }, unloadAnimationCompleted)
                .change(WeaponState.READY).to(WeaponState.UNLOAD)
                .when(magazineAttached.and(inventoryHasFreeSlots))
                .withPermit((s, c) -> new UnloadPermit(s), modContext.getPlayerItemInstanceRegistry()::update, permitManager)
                .withAction((c, f, t, p) -> completeClientUnload(c, (UnloadPermit) p))
                .manual()
                
                .in(this)
                .change(WeaponState.UNLOAD).to(WeaponState.READY)
                .when(loadAfterUnloadEnabled.negate().or(unloadTimeoutExpired))
                .automatic()

                .in(this)
                .change(WeaponState.READY).to(WeaponState.ALERT)
                .when(inventoryHasFreeSlots.negate())
                .withAction(this::inventoryFullAlert)
                .manual()

                .in(this).change(WeaponState.ALERT).to(WeaponState.READY)
                .when(alertTimeoutExpired)
                .automatic()

                .in(this)
                .change(WeaponState.READY).to(WeaponState.INSPECTING)
                .withAction(this::inspect)
                .manual()

                .in(this)
                .change(WeaponState.INSPECTING).to(WeaponState.READY)
                .when(inspectTimeoutExpired)
                .automatic()

                .in(this)
                .change(WeaponState.READY).to(WeaponState.DRAWING)

                .withAction(this::draw)
                //.automatic()
                .manual()

                .in(this)
                .change(WeaponState.DRAWING).to(WeaponState.READY)
                .when(drawingAnimationCompleted)
                .automatic()
        ;
    }

    public ItemAttachment<Weapon> previousMagazine;

    @Override
    public void setPermitManager(PermitManager permitManager) {
        this.permitManager = permitManager;
        
        permitManager.registerEvaluator(LoadPermit.class, PlayerWeaponInstance.class, this::processLoadPermit);
        permitManager.registerEvaluator(UnloadPermit.class, PlayerWeaponInstance.class, this::processUnloadPermit);
        permitManager.registerEvaluator(CompoundPermit.class, PlayerWeaponInstance.class, this::processCompoundPermit);
    }

    public void processCompoundPermit(CompoundPermit p, PlayerWeaponInstance pwi) {
        processActualCompoundPermit(p, pwi);
        
        //processUnloadPermit(new UnloadPermit(p.getState()), pwi);
        //p.setStatus(Status.GRANTED);

        previousMagazine = null;
    }


    public void obamaCorporation(PlayerWeaponInstance instance) {
        stateManager.changeState(this, instance, WeaponState.COMPOUND_RELOAD_FINISHED);
    }

    public void clientCompoundReload(PlayerWeaponInstance instance) {
        if (instance == null)
			return;

        instance.completeMagSwap();

        instance.getWeapon().getRenderer().setMagicMagPermit(true);

        if (instance.getState() == WeaponState.COMPOUND_RELOAD)
            stateManager.changeState(this, instance, WeaponState.COMPOUND_RELOAD);
        else
            stateManager.changeState(this, instance, WeaponState.COMPOUND_RELOAD_EMPTY);

        //processUnloadPermit(new UnloadPermit(instance.getState()), instance);

        // Send request to the server
        //permitManager.request(new CompoundPermit(instance.getState()), instance, (a, b) -> {});

        //processUnloadPermit(new UnloadPermit(instance.getState()), instance);
        //processLoadPermit(new LoadPermit(instance.getState()), instance);

        previousMagazine = null;
    }

    public void reloadMainHeldItem(EntityPlayer player) {
        PlayerWeaponInstance instance = modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance(player, PlayerWeaponInstance.class);

        if (instance != null) {
            if (AnimationModeProcessor.getInstance().isLegacyMode()) {
                furtherLoadInstructionsReceived(instance);
                stateManager.changeState(this, instance, WeaponState.READY);
            } else {
                if (WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.MAGAZINE, instance) == null) {
                    ItemStack nextAttachment = getNextBestMagazineStack(instance);
                    if (instance.getWeapon().getRenderer().getBuilder().isHasLoadEmpty() && nextAttachment != null && Tags.getAmmo(nextAttachment) == 0)
                        instance.getWeapon().getRenderer().setShouldDoEmptyVariant(true);

                    stateManager.changeState(this, instance, WeaponState.AWAIT_FURTHER_LOAD_INSTRUCTIONS, WeaponState.READY);
                } else {
                    if (instance.getState() != WeaponState.READY && instance.getState() != WeaponState.COMPOUND_REQUESTED)
                        return;

                    ItemAttachment<Weapon> nextAttachment = getNextMagazine(instance);

                    instance.markReloadDirt();
                    instance.markMagSwapReady();
                    if (instance.getAmmo() == 0) {
                        if (nextAttachment != null)
                            instance.getWeapon().getRenderer().setMagicMag(instance, nextAttachment, WeaponState.COMPOUND_RELOAD_EMPTY);

                        else
							return;

                        stateManager.changeState(this, instance, WeaponState.COMPOUND_RELOAD_EMPTY);
                    } else {
                        if (nextAttachment != null)
                            instance.getWeapon().getRenderer().setMagicMag(instance, nextAttachment, WeaponState.COMPOUND_RELOAD);
                        else
							return;
                        instance.setIsAwaitingCompoundInstructions(true);
                        stateManager.changeState(this, instance, WeaponState.COMPOUND_REQUESTED, WeaponState.READY);
                    }
                }
            }
        }
    }

    public void unloadMainHeldItem(EntityPlayer player) {
        PlayerWeaponInstance instance = modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance(player, PlayerWeaponInstance.class);
        
        if (instance != null) {
            instance.getWeapon().getRenderer().compoundReloadEmpty = false;
            instance.getWeapon().getRenderer().compoundReload = false;
            instance.setLoadAfterUnloadEnabled(false);


            ItemAttachment<Weapon> currentMagazine = modContext.getAttachmentAspect().getActiveAttachment(instance, AttachmentCategory.MAGAZINE);
            if (instance.getWeapon().getRenderer().getBuilder().isHasUnloadEmpty() && currentMagazine != null && instance.getAmmo() == 0)
                instance.getWeapon().getRenderer().setShouldDoEmptyVariant(true);

            stateManager.changeState(this, instance, WeaponState.UNLOAD, WeaponState.ALERT);
        }
    }

    void updateMainHeldItem(EntityPlayer player) {
        PlayerWeaponInstance instance = modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance(player, PlayerWeaponInstance.class);
        
        if (instance != null)
            stateManager.changeStateFromAnyOf(this, instance, ALLOWED_UPDATE_FROM_STATES); // no target state specified, will trigger auto-transitions
    }

    public void inspectMainHeldItem(EntityPlayer player) {
        PlayerWeaponInstance instance = modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance(player, PlayerWeaponInstance.class);
        
        if (instance != null)
            stateManager.changeState(this, instance, WeaponState.INSPECTING);
    }

    public void drawMainHeldItem(EntityPlayer player) {
        PlayerWeaponInstance instance = modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance(player, PlayerWeaponInstance.class);

        if (instance != null)
            stateManager.changeState(this, instance, WeaponState.DRAWING);
    }

    private ItemAttachment<Weapon> getNextMagazine(PlayerWeaponInstance weaponInstance) {
        EntityPlayer player = (EntityPlayer) weaponInstance.getPlayer();
        Weapon weapon = (Weapon) weaponInstance.getItem();

        List<ItemMagazine> compatibleMagazines = weapon.getCompatibleMagazines().stream().filter(compatibleMagazine -> WeaponAttachmentAspect.hasRequiredAttachments(compatibleMagazine, weaponInstance)).collect(Collectors.toList());

        if (compatibleMagazines.isEmpty())
            return null;

        Comparator<ItemStack> comparator;
        comparator = (stack1, stack2) -> Integer.compare(Tags.getAmmo(stack1), Tags.getAmmo(stack2));

        if (player.isCreative() && !player.isSneaking())
            return (ItemAttachment<Weapon>) compatibleMagazines.stream().map(ItemMagazine::create).max(comparator).orElse(null).getItem();

        ItemStack maxStack = null;
        int maxItemIndex = -1;
        for (int i = 0; i < player.inventory.mainInventory.size(); ++i) {
            if (player.inventory.getStackInSlot(i) != null && compatibleMagazines.contains(player.inventory.getStackInSlot(i).getItem()) && (maxStack == null || comparator.compare(player.inventory.getStackInSlot(i), maxStack) > 0)) {
                maxStack = player.inventory.getStackInSlot(i);
                maxItemIndex = i;
            }
        }
        
        int i = maxItemIndex;

        if (i < 0)
            return null;

        ItemStack magazineItemStack = player.inventory.getStackInSlot(i).copy().splitStack(Math.min(player.inventory.getStackInSlot(i).copy().getCount(), 1));

        if (magazineItemStack == null)
            return null;

        return (ItemAttachment<Weapon>) magazineItemStack.getItem();
    }

    private ItemStack getNextBestMagazineStack(PlayerWeaponInstance weaponInstance) {
        EntityPlayer player = (EntityPlayer) weaponInstance.getPlayer();
        Weapon weapon = (Weapon) weaponInstance.getItem();

        List<ItemMagazine> compatibleMagazines = weapon.getCompatibleMagazines().stream().filter(compatibleMagazine -> WeaponAttachmentAspect.hasRequiredAttachments(compatibleMagazine, weaponInstance)).collect(Collectors.toList());

        if (compatibleMagazines.isEmpty())
            return null;

        Comparator<ItemStack> comparator;
        comparator = (stack1, stack2) -> Integer.compare(Tags.getAmmo(stack1), Tags.getAmmo(stack2));

        if (player.isCreative() && !player.isSneaking())
            return compatibleMagazines.stream().map(ItemMagazine::create).max(comparator).orElse(null);

        ItemStack maxStack = null;
        int maxItemIndex = -1;
        for (int i = 0; i < player.inventory.mainInventory.size(); ++i) {
            if (player.inventory.getStackInSlot(i) != null && compatibleMagazines.contains(player.inventory.getStackInSlot(i).getItem()) && (maxStack == null || comparator.compare(player.inventory.getStackInSlot(i), maxStack) > 0)) {
                maxStack = player.inventory.getStackInSlot(i);
                maxItemIndex = i;
            }
        }

        int i = maxItemIndex;

        if (i < 0)
            return null;

        ItemStack magazineItemStack = player.inventory.getStackInSlot(i).copy().splitStack(Math.min(player.inventory.getStackInSlot(i).copy().getCount(), 1));

        return magazineItemStack;
    }

    private void processActualCompoundPermit(CompoundPermit p, PlayerWeaponInstance instance) {
        ItemStack weaponItemStack = instance.getItemStack();
        EntityPlayer player = (EntityPlayer) instance.getPlayer();
        Weapon weapon = instance.getWeapon();

        List<ItemMagazine> compatibleMagazines = weapon.getCompatibleMagazines().stream().filter(compatibleMagazine -> WeaponAttachmentAspect.hasRequiredAttachments(compatibleMagazine, instance)).collect(Collectors.toList());

        // Unload weapon
        ItemAttachment<Weapon> attachment = modContext.getAttachmentAspect().removeAttachment(AttachmentCategory.MAGAZINE, instance);
        
        //	processUnloadPermit(new UnloadPermit(p.getState()), instance);
        int originalAmmo = instance.getAmmo();

        // Mag list is empty
        if (compatibleMagazines.isEmpty())
            return;

        ItemStack magazineStack = MWCUtil.consumeItemsFromPlayerInventory(compatibleMagazines, Comparator.comparingInt(Tags::getAmmo), player);

        if (magazineStack == null) {
            // Cancel unload when magazine cannot be found in inventory
            WeaponAttachmentAspect.addAttachment(attachment, instance);
            p.setStatus(Status.GRANTED);
            return;
        }

        //ItemStack magazineStack = ItemStack.EMPTY;
        int ammo = Tags.getAmmo(magazineStack);
        Tags.setAmmo(weaponItemStack, ammo);
        WeaponAttachmentAspect.addAttachment((ItemAttachment<Weapon>) magazineStack.getItem(), instance);
        instance.setAmmo(ammo);
        
        p.setStatus(Status.GRANTED);

        if (attachment == null)
            p.setStatus(Status.DENIED);
        else if (attachment instanceof ItemMagazine && !player.isCreative()) {
            ItemStack attachmentItemStack = ((ItemMagazine) attachment).create(originalAmmo);
            if (!player.inventory.addItemStackToInventory(attachmentItemStack))
                LOG.error("Cannot add attachment " + attachment + " for " + instance + "back to the inventory");
            p.setStatus(Status.GRANTED);
        }
    }
    
    private void processLoadPermit(LoadPermit p, PlayerWeaponInstance weaponInstance) {
        LOG.debug("Processing load permit on server for {}", weaponInstance);

        ItemStack weaponItemStack = weaponInstance.getItemStack();

        if (weaponItemStack == null || !(weaponInstance.getPlayer() instanceof EntityPlayer)) {
            // Since reload request was sent for an item, the item was removed from the original slot
            // Also if instance is not owner by entity player , do not allow load
            return;
        }

        EntityPlayer player = (EntityPlayer) weaponInstance.getPlayer();
        Status status = Status.GRANTED;
        weaponInstance.setLoadIterationCount(0); // TODO: review if this is really necessary
        Weapon weapon = (Weapon) weaponInstance.getItem();

        if (weaponItemStack.getTagCompound() == null)
            weaponItemStack.setTagCompound(new NBTTagCompound());

        List<ItemMagazine> compatibleMagazines = weapon.getCompatibleMagazines().stream().filter(compatibleMagazine -> WeaponAttachmentAspect.hasRequiredAttachments(compatibleMagazine, weaponInstance)).collect(Collectors.toList());
        List<ItemAttachment<Weapon>> compatibleBullets = weapon.getCompatibleAttachments(ItemBullet.class);
        int consumedAmount;

        boolean consumed = false;

        for (int i = 0; i < player.inventory.getSizeInventory(); i++) {
            ItemStack itemstack = player.inventory.getStackInSlot(i);

            if (itemstack.getItem() == weapon.builder.ammo) {
                itemstack.shrink(1);
                consumed = true;
            }
        }

        if (!compatibleMagazines.isEmpty()) {
            ItemAttachment<Weapon> existingMagazine = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.MAGAZINE, weaponInstance);
            int ammo = Tags.getAmmo(weaponItemStack);
            if (existingMagazine == null) {
                ammo = 0;

                ItemStack magazineItemStack = MWCUtil.consumeItemsFromPlayerInventory(compatibleMagazines, (stack1, stack2) -> Integer.compare(Tags.getAmmo(stack1), Tags.getAmmo(stack2)), player);

                if (magazineItemStack != null) {
                    ammo = Tags.getAmmo(magazineItemStack);
                    Tags.setAmmo(weaponItemStack, ammo);
                    LOG.debug("Setting server side ammo for {} to {}", weaponInstance, ammo);
                    WeaponAttachmentAspect.addAttachment((ItemAttachment<Weapon>) magazineItemStack.getItem(), weaponInstance);
                    player.world.playSound(player instanceof EntityPlayer ? (EntityPlayer) player : null, player.posX, player.posY, player.posZ, weapon.getReloadSound(), player.getSoundCategory(), 1.0f, 1.0F);
                } else
                    status = Status.DENIED;
            }
            // Update permit instead: modContext.getChannel().sendTo(new ReloadMessage(weapon, ReloadMessage.Type.LOAD, newMagazine, ammo), (EntityPlayerMP) player);
            weaponInstance.setAmmo(ammo);
        } else if (!compatibleBullets.isEmpty() && (consumedAmount = MWCUtil.consumeItemsFromPlayerInventory(compatibleBullets, Math.min(weapon.getMaxBulletsPerReload(), weapon.getAmmoCapacity() - weaponInstance.getAmmo()), player)) != 0) {
            int ammo = weaponInstance.getAmmo() + consumedAmount;
            Tags.setAmmo(weaponItemStack, ammo);
            // Update permit instead modContext.getChannel().sendTo(new ReloadMessage(weapon, ammo), (EntityPlayerMP) player);
            weaponInstance.setAmmo(ammo);
            if (weapon.hasIteratedLoad())
                weaponInstance.setLoadIterationCount(consumedAmount);
            player.world.playSound(player instanceof EntityPlayer ? (EntityPlayer) player : null, player.posX, player.posY, player.posZ, weapon.getReloadSound(), player.getSoundCategory(), 1.0F, 1.0F);
        } else if (consumed) {
            Tags.setAmmo(weaponItemStack, weapon.builder.ammoCapacity);
            // Update permit instead: modContext.getChannel().sendTo(new ReloadMessage(weapon, weapon.builder.ammoCapacity), (EntityPlayerMP) player);
            weaponInstance.setAmmo(weapon.builder.ammoCapacity);
            player.world.playSound(player instanceof EntityPlayer ? (EntityPlayer) player : null, player.posX, player.posY, player.posZ, weapon.getReloadSound(), player.getSoundCategory(), 1.0F, 1.0F);
        } else {
            LOG.debug("No suitable ammo found for {}. Permit denied.", weaponInstance);
            //Tags.setAmmo(weaponItemStack, 0);
            //weaponInstance.setAmmo(0);
            status = Status.DENIED;
            // Update permit instead: modContext.getChannel().sendTo(new ReloadMessage(weapon, 0), (EntityPlayerMP) player);
        }

		//Tags.setInstance(weaponItemStack, weaponInstance);

        p.setStatus(status);
    }


    private void prepareUnload(PlayerWeaponInstance weaponInstance) {
        weaponInstance.getPlayer().playSound(weaponInstance.getWeapon().getUnloadSound(), 1.0F, 1.0F);
    }

    private void processUnloadPermit(UnloadPermit p, PlayerWeaponInstance weaponInstance) {
        LOG.debug("Processing unload permit on server for {}", weaponInstance);

        if (!(weaponInstance.getPlayer() instanceof EntityPlayer))
            return;

        ItemStack weaponItemStack = weaponInstance.getItemStack();

        EntityPlayer player = (EntityPlayer) weaponInstance.getPlayer();

        Weapon weapon = (Weapon) weaponItemStack.getItem();
        if (weaponItemStack.getTagCompound() != null) {
            ItemAttachment<Weapon> attachment = modContext.getAttachmentAspect().removeAttachment(AttachmentCategory.MAGAZINE, weaponInstance);
            if (attachment == null) {
                // Attachment can be null if it's in use and cannot be removed
                p.setStatus(Status.DENIED);
                return;
            }

            if (attachment instanceof ItemMagazine && !player.isCreative()) {
                previousMagazine = attachment;
                ItemStack attachmentItemStack = ((ItemMagazine) attachment).create(weaponInstance.getAmmo());
                if (!player.inventory.addItemStackToInventory(attachmentItemStack))
                    LOG.error("Cannot add attachment " + attachment + " for " + weaponInstance + "back to the inventory");
            }

            Tags.setAmmo(weaponItemStack, 0);
            weaponInstance.setAmmo(0);
            player.world.playSound(player instanceof EntityPlayer ? (EntityPlayer) player : null, player.posX, player.posY, player.posZ, weapon.getUnloadSound(), player.getSoundCategory(), 1.0F, 1.0F);

            p.setStatus(Status.GRANTED);
        } else
            p.setStatus(Status.DENIED);

        //Tags.setInstance(weaponItemStack, weaponInstance); // to sync immediately without waiting for tick sync
        p.setStatus(Status.GRANTED);
    }

    private void completeClientLoad(PlayerWeaponInstance weaponInstance, LoadPermit permit) {
        weaponInstance.setLoadAfterUnloadEnabled(false);
        if (permit == null) {
            LOG.error("Permit is null, something went wrong");
            return;
        }

        if (permit.getStatus() == Status.GRANTED)
            weaponInstance.getPlayer().playSound(weaponInstance.getWeapon().getReloadSound(), 1, 1);
    }

    private void completeClientUnload(PlayerWeaponInstance weaponInstance, UnloadPermit p) {
        if (weaponInstance.isLoadAfterUnloadEnabled()) {
            stateManager.changeState(this, weaponInstance, WeaponState.LOAD, WeaponState.ALERT);
            weaponInstance.setLoadAfterUnloadEnabled(false);
        }
    }

    public void inventoryFullAlert(PlayerWeaponInstance weaponInstance) {
        modContext.getStatusMessageCenter().addAlertMessage(I18n.translateToLocalFormatted("gui.inventoryFull"), 3, 250, 200);
    }

    public void inspect(PlayerWeaponInstance weaponInstance) {
        weaponInstance.getPlayer().playSound(weaponInstance.getWeapon().getInspectSound(), 1, 1);
    }

    public void draw(PlayerWeaponInstance weaponInstance) {
        weaponInstance.getPlayer().playSound(weaponInstance.getWeapon().getDrawSound(), 1, 1);
    }

    public void startLoadIteration(PlayerWeaponInstance weaponInstance) {
        weaponInstance.getPlayer().playSound(weaponInstance.getWeapon().getReloadIterationSound(), 1, 1);
    }

    public void completeLoadIteration(PlayerWeaponInstance weaponInstance) {
        weaponInstance.setLoadIterationCount(weaponInstance.getLoadIterationCount() - 1);
    }

    public void completeAllLoadIterations(PlayerWeaponInstance weaponInstance) {
        weaponInstance.getPlayer().playSound(weaponInstance.getWeapon().getAllReloadIterationsCompletedSound(), 1, 1);
    }

    public void noCompoundInstructionsReceived(PlayerWeaponInstance weaponInstance) {
        weaponInstance.setDelayCompoundEnd(false);
        weaponInstance.setIsAwaitingCompoundInstructions(false);
        stateManager.changeState(this, weaponInstance, WeaponState.COMPOUND_RELOAD);
    }

    public void compoundInstructionsReceived(PlayerWeaponInstance weaponInstance) {
        weaponInstance.setIsAwaitingCompoundInstructions(false);
        // If it doesn't have a tactical reload just do the normal compound reload
        if (!weaponInstance.getWeapon().getRenderer().getBuilder().isHasTacticalReload()) {
            stateManager.changeState(this, weaponInstance, WeaponState.COMPOUND_RELOAD);
            return;
        }

        weaponInstance.getWeapon().getRenderer().setMagicMag(weaponInstance, weaponInstance.getWeapon().getRenderer().magicMagReplacement, WeaponState.TACTICAL_RELOAD);

        stateManager.changeState(this, weaponInstance, WeaponState.TACTICAL_RELOAD);
    }

    public void noFurtherLoadInstructionsReceived(PlayerWeaponInstance weaponInstance) {
        stateManager.changeState(this, weaponInstance, WeaponState.LOAD, WeaponState.ALERT);
    }

    public void furtherLoadInstructionsReceived(PlayerWeaponInstance weaponInstance) {
        weaponInstance.setLoadAfterUnloadEnabled(true);
        stateManager.changeState(this, weaponInstance, WeaponState.UNLOAD, WeaponState.LOAD, WeaponState.ALERT);
    }
}
