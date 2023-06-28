package com.paneedah.weaponlib;

import com.paneedah.weaponlib.ItemAttachment.ApplyHandler2;
import com.paneedah.weaponlib.network.TypeRegistry;
import com.paneedah.weaponlib.state.Aspect;
import com.paneedah.weaponlib.state.Permit;
import com.paneedah.weaponlib.state.Permit.Status;
import com.paneedah.weaponlib.state.PermitManager;
import com.paneedah.weaponlib.state.StateManager;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.network.ByteBufUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

import static com.paneedah.mwc.utils.ModReference.LOG;

public final class WeaponAttachmentAspect implements Aspect<WeaponState, PlayerWeaponInstance> {

	static {
		TypeRegistry.getInstance().register(EnterAttachmentModePermit.class);
		TypeRegistry.getInstance().register(ExitAttachmentModePermit.class);
		TypeRegistry.getInstance().register(ChangeAttachmentPermit.class);
	}

	private static class AttachmentLookupResult {
		CompatibleAttachment<Weapon> compatibleAttachment;
		int index = -1;
		boolean isCreative;
	}

	public static class EnterAttachmentModePermit extends Permit<WeaponState> {

		public EnterAttachmentModePermit() {
		}

		public EnterAttachmentModePermit(WeaponState state) {
			super(state);
		}
	}

	public static class ExitAttachmentModePermit extends Permit<WeaponState> {

		public ExitAttachmentModePermit() {
		}

		public ExitAttachmentModePermit(WeaponState state) {
			super(state);
		}
	}

	public static class ChangeAttachmentPermit extends Permit<WeaponState> {

		AttachmentCategory attachmentCategory;
		ItemStack attachment;

		public ChangeAttachmentPermit() {
		}

		public ChangeAttachmentPermit(AttachmentCategory attachmentCategory) {
			super(WeaponState.NEXT_ATTACHMENT);
			this.attachmentCategory = attachmentCategory;
		}

		public ChangeAttachmentPermit(AttachmentCategory category, ItemStack attachment) {
			super(WeaponState.NEXT_ATTACHMENT);
			this.attachmentCategory = category;
			this.attachment = attachment;

		}

		@Override
		public void init(ByteBuf buf) {
			super.init(buf);
			attachmentCategory = AttachmentCategory.values()[buf.readInt()];
			// If it is forced read out the itemstack
			if (buf.readBoolean())
				attachment = ByteBufUtils.readItemStack(buf);
		}

		@Override
		public void serialize(ByteBuf buf) {
			super.serialize(buf);
			buf.writeInt(attachmentCategory.ordinal());

			// Is the game forced to a certain attachment?
			if (attachment == null) {
				buf.writeBoolean(false);
			} else {
				buf.writeBoolean(true);
				ByteBufUtils.writeItemStack(buf, attachment);
			}

		}
	}

	private ModContext modContext;
	private PermitManager permitManager;
	private StateManager<WeaponState, ? super PlayerWeaponInstance> stateManager;

	private long clickSpammingTimeout = 150;

	private Predicate<PlayerWeaponInstance> clickSpammingPreventer = es -> System
			.currentTimeMillis() >= es.getStateUpdateTimestamp() + clickSpammingTimeout;

	private Predicate<PlayerWeaponInstance> clickSpammingPreventer2 = es -> System
			.currentTimeMillis() >= es.getStateUpdateTimestamp() + clickSpammingTimeout * 2;

	private Collection<WeaponState> allowedUpdateFromStates = Arrays.asList(WeaponState.MODIFYING_REQUESTED);
	private static final int INVENTORY_SIZE = 36;

	WeaponAttachmentAspect(ModContext modContext) {
		this.modContext = modContext;
	}

	@Override
	public void setStateManager(StateManager<WeaponState, ? super PlayerWeaponInstance> stateManager) {

		if (permitManager == null) {
			throw new IllegalStateException("Permit manager not initialized");
		}

		this.stateManager = stateManager

				.in(this).change(WeaponState.READY).to(WeaponState.MODIFYING).when(clickSpammingPreventer)
				.withPermit((s, es) -> new EnterAttachmentModePermit(s),
						modContext.getPlayerItemInstanceRegistry()::update, permitManager)
				.manual()

				.in(this).change(WeaponState.MODIFYING).to(WeaponState.READY).when(clickSpammingPreventer2)
				.withAction((instance) -> {
					permitManager.request(new ExitAttachmentModePermit(WeaponState.READY), instance, (p, e) -> {
						/* do nothing on callback */});
				}).manual()

				.in(this).change(WeaponState.MODIFYING).to(WeaponState.NEXT_ATTACHMENT).when(clickSpammingPreventer)
				.withPermit(null, modContext.getPlayerItemInstanceRegistry()::update, permitManager).manual()

				.in(this).change(WeaponState.NEXT_ATTACHMENT).to(WeaponState.MODIFYING).automatic();
	}

	@Override
	public void setPermitManager(PermitManager permitManager) {
		this.permitManager = permitManager;
		permitManager.registerEvaluator(EnterAttachmentModePermit.class, PlayerWeaponInstance.class,
				this::enterAttachmentSelectionMode);
		permitManager.registerEvaluator(ExitAttachmentModePermit.class, PlayerWeaponInstance.class,
				this::exitAttachmentSelectionMode);
		permitManager.registerEvaluator(ChangeAttachmentPermit.class, PlayerWeaponInstance.class,
				this::changeAttachment);

	}

	public void toggleClientAttachmentSelectionMode(EntityPlayer player) {

		PlayerWeaponInstance weaponInstance = modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance(player,
				PlayerWeaponInstance.class);
		if (weaponInstance != null) {
			stateManager.changeState(this, weaponInstance, WeaponState.MODIFYING, WeaponState.READY);
		}
	}

	void updateMainHeldItem(EntityPlayer player) {
		PlayerWeaponInstance instance = modContext.getPlayerItemInstanceRegistry().getMainHandItemInstance(player,
				PlayerWeaponInstance.class);
		if (instance != null) {
			stateManager.changeStateFromAnyOf(this, instance, allowedUpdateFromStates); // no target state specified,
																						// will trigger auto-transitions
		}
	}

	private void enterAttachmentSelectionMode(EnterAttachmentModePermit permit, PlayerWeaponInstance weaponInstance) {
		LOG.debug("Entering attachment mode");
		byte selectedAttachmentIndexes[] = new byte[AttachmentCategory.values.length];
		Arrays.fill(selectedAttachmentIndexes, (byte) -1);
		weaponInstance.setSelectedAttachmentIndexes(selectedAttachmentIndexes);

		permit.setStatus(Status.GRANTED);
	}

	private void exitAttachmentSelectionMode(ExitAttachmentModePermit permit, PlayerWeaponInstance weaponInstance) {
		LOG.debug("Exiting attachment mode");
		weaponInstance.setSelectedAttachmentIndexes(new byte[0]);

		permit.setStatus(Status.GRANTED);
	}

	List<CompatibleAttachment<? extends AttachmentContainer>> getActiveAttachments(EntityLivingBase player, ItemStack itemStack) {
		if (itemStack.getTagCompound() == null)
			itemStack.setTagCompound(new NBTTagCompound());

		List<CompatibleAttachment<? extends AttachmentContainer>> activeAttachments = new ArrayList<>();

		PlayerItemInstance<?> itemInstance = modContext.getPlayerItemInstanceRegistry().getItemInstance(player,
				itemStack);

		int[] activeAttachmentsIds;
		if (!(itemInstance instanceof PlayerWeaponInstance)) {
			activeAttachmentsIds = new int[AttachmentCategory.values.length];
			for (CompatibleAttachment<Weapon> attachment : ((Weapon) itemStack.getItem()).getCompatibleAttachments()
					.values()) {
				if (attachment.isDefault()) {
					activeAttachmentsIds[attachment.getAttachment().getCategory().ordinal()] = Item
							.getIdFromItem(attachment.getAttachment());
				}
			}
		} else {
			activeAttachmentsIds = ((PlayerWeaponInstance) itemInstance).getActiveAttachmentIds();
		}

		Weapon weapon = (Weapon) itemStack.getItem();

		for (int activeIndex : activeAttachmentsIds) {
			if (activeIndex == 0)
				continue; // is this a bug?
			Item item = Item.getItemById(activeIndex);
			if (item instanceof ItemAttachment) {
				CompatibleAttachment<? extends AttachmentContainer> compatibleAttachment = weapon
						.getCompatibleAttachments().get(item);
				if (compatibleAttachment != null) {
					activeAttachments.add(compatibleAttachment);
				}
			}

		}
		return activeAttachments;
	}

	public boolean isCompatibleAttachment(ItemAttachment<Weapon> attachment, PlayerWeaponInstance weaponInstance) {

		Weapon weapon = weaponInstance.getWeapon();

		CompatibleAttachment<? extends AttachmentContainer> compatibleAttachment = weapon.getCompatibleAttachments()
				.get(attachment);

		return compatibleAttachment != null;
	}

	public static class FlaggedAttachment {

		private ItemAttachment<Weapon> attachment;
		private ItemStack stack;
		private ArrayList<ItemAttachment<Weapon>> requiredParts;

		public FlaggedAttachment(ItemStack stack, ItemAttachment<Weapon> attachment) {
			this.stack = stack;
			this.attachment = attachment;
		}

		public void setRequiredParts(ArrayList<ItemAttachment<Weapon>> list) {
			this.requiredParts = list;
		}

		public ItemStack getItemStack() {
			return stack;
		}

		public ArrayList<ItemAttachment<Weapon>> getRequiredParts() {
			return requiredParts;
		}

		public boolean requiresAnyParts() {
			if (requiredParts == null)
				return false;
			return !requiredParts.isEmpty();
		}

		public ItemAttachment<Weapon> getAttachment() {
			return attachment;
		}

	}

	@SuppressWarnings("static-access")
	public ArrayList<FlaggedAttachment> getInventoryAttachments(AttachmentCategory category,
			PlayerWeaponInstance weaponInstance) {
		EntityPlayer player = (EntityPlayer) weaponInstance.getPlayer();
		Weapon weapon = weaponInstance.getWeapon();
		// weapon.getCompatibleAttachments(categories)

		ArrayList<FlaggedAttachment> attachmentList = new ArrayList<>();

		for (ItemStack i : player.inventory.mainInventory) {
			if (i.getItem() instanceof ItemAttachment<?>) {

				@SuppressWarnings("unchecked")
				ItemAttachment<Weapon> potentialAttachment = (ItemAttachment<Weapon>) i.getItem();

				FlaggedAttachment flaggedAttachment = new FlaggedAttachment(i, potentialAttachment);

				// Check proper category, if it is not
				// we do not care about it
				if (potentialAttachment.getCategory() != category)
					continue;

				// If this is not a compatible attachment,
				// we do not care either
				if (!isCompatibleAttachment(potentialAttachment, weaponInstance))
					continue;

				// We do want to display if it is a potential attachment
				// but there are conditions to be met
				if (!modContext.getAttachmentAspect().hasRequiredAttachments(potentialAttachment, weaponInstance)) {
					flaggedAttachment.setRequiredParts(getRequiredParts(potentialAttachment, weaponInstance));
				}

				attachmentList.add(flaggedAttachment);
			}
		}

		return attachmentList;
	}

	public ArrayList<ItemAttachment<Weapon>> getRequiredParts(ItemAttachment<Weapon> attachment,
			PlayerWeaponInstance weaponInstance) {

		ArrayList<ItemAttachment<Weapon>> requiredPartsList = new ArrayList<>();

		// Find all the required parts
		List<ItemAttachment<Weapon>> unfilteredParts = attachment.getRequiredAttachments();

		// Filter the list
		for (ItemAttachment<Weapon> attach : unfilteredParts) {
			if (isCompatibleAttachment(attach, weaponInstance))
				requiredPartsList.add(attach);
		}

		return requiredPartsList;
	}

	public void changeAttachment(AttachmentCategory attachmentCategory, PlayerWeaponInstance weaponInstance) {
		if (weaponInstance != null) {

			stateManager.changeState(this, weaponInstance, new ChangeAttachmentPermit(attachmentCategory),
					WeaponState.NEXT_ATTACHMENT);
		}
	}

	public void forceAttachment(AttachmentCategory attachmentCategory, PlayerWeaponInstance weaponInstance,
			ItemStack attachment) {
		if (weaponInstance != null) {

			stateManager.changeState(this, weaponInstance, new ChangeAttachmentPermit(attachmentCategory, attachment),
					WeaponState.NEXT_ATTACHMENT);
		}
	}

	public void tryChange(ChangeAttachmentPermit permit, PlayerWeaponInstance weaponInstance) {
		changeAttachment(permit, weaponInstance);
	}

	@SuppressWarnings("unchecked")
	private void changeAttachment(ChangeAttachmentPermit permit, PlayerWeaponInstance weaponInstance) {
		if (!(weaponInstance.getPlayer() instanceof EntityPlayer)) {
			return;
		}

		EntityPlayer player = (EntityPlayer) weaponInstance.getPlayer();

		AttachmentCategory attachmentCategory = permit.attachmentCategory;
		int[] originalActiveAttachmentIds = weaponInstance.getActiveAttachmentIds();
		int[] activeAttachmentIds = Arrays.copyOf(originalActiveAttachmentIds, originalActiveAttachmentIds.length);
		int activeAttachmentIdForThisCategory = activeAttachmentIds[attachmentCategory.ordinal()];
		ItemAttachment<Weapon> currentAttachment = null;
		if (activeAttachmentIdForThisCategory > 0) {
			currentAttachment = (ItemAttachment<Weapon>) Item.getItemById(activeAttachmentIdForThisCategory);
		}

	
		if (currentAttachment != null) {
			CompatibleAttachment<Weapon> currentCompatibleAttachment = weaponInstance.getWeapon()
					.getCompatibleAttachments().get(currentAttachment);
			
			if (currentCompatibleAttachment.isPermanent()) {
				
				return;
			}

			if (isAttachmentInUse(currentCompatibleAttachment.getAttachment(), weaponInstance)) {
				
				return;
			}
		}

		AttachmentLookupResult lookupResult;
		if(permit.attachment != null) {
			// Forced
			lookupResult = findForcedAttach(permit.attachment, currentAttachment, attachmentCategory, weaponInstance, ((EntityPlayer) weaponInstance.getPlayer()).isCreative());
		} else {
			// Next
			lookupResult = next(attachmentCategory, currentAttachment, weaponInstance);
		}
		
		if (currentAttachment != null) {
			// Need to apply removal functions first before applying addition functions
			if (currentAttachment.getRemove() != null) {
				currentAttachment.getRemove().apply(currentAttachment, weaponInstance.getWeapon(), player);
			}
			if (currentAttachment.getRemove2() != null) {
				currentAttachment.getRemove2().apply(currentAttachment, weaponInstance);
			}
		}
	
		if (lookupResult.index >= 0) {
			ItemStack slotItemStack = player.inventory.getStackInSlot(lookupResult.index);

			// if(permit.attachment != null) slotItemStack = permit.attachment;

			ItemAttachment<Weapon> nextAttachment = (ItemAttachment<Weapon>) slotItemStack.getItem();

			if (nextAttachment.getApply() != null) {
				nextAttachment.getApply().apply(nextAttachment, weaponInstance.getWeapon(), player);
			} else if (nextAttachment.getApply2() != null) {
				nextAttachment.getApply2().apply(nextAttachment, weaponInstance);
			} else if (lookupResult.compatibleAttachment.getApplyHandler() != null) {
				lookupResult.compatibleAttachment.getApplyHandler().apply(nextAttachment, weaponInstance);
			} else {
				ApplyHandler2<Weapon> handler = weaponInstance.getWeapon().getEquivalentHandler(attachmentCategory);
				if (handler != null) {
					handler.apply(null, weaponInstance);
				}
			}
			if (player.inventory.getStackInSlot(lookupResult.index) == null)
				return;

			player.inventory.getStackInSlot(lookupResult.index).shrink(1);
			if (player.inventory.mainInventory.get(lookupResult.index).getCount() <= 0)
				player.inventory.removeStackFromSlot(lookupResult.index);
			
			activeAttachmentIds[attachmentCategory.ordinal()] = Item.getIdFromItem(nextAttachment);
		} else if(lookupResult.isCreative) {
			ItemAttachment<Weapon> nextAttachment = (ItemAttachment<Weapon>) lookupResult.compatibleAttachment.getAttachment();

			if (nextAttachment.getApply() != null) {
				nextAttachment.getApply().apply(nextAttachment, weaponInstance.getWeapon(), player);
			} else if (nextAttachment.getApply2() != null) {
				nextAttachment.getApply2().apply(nextAttachment, weaponInstance);
			} else if (lookupResult.compatibleAttachment.getApplyHandler() != null) {
				lookupResult.compatibleAttachment.getApplyHandler().apply(nextAttachment, weaponInstance);
			} else {
				ApplyHandler2<Weapon> handler = weaponInstance.getWeapon().getEquivalentHandler(attachmentCategory);
				if (handler != null) {
					handler.apply(null, weaponInstance);
				}
			}
			activeAttachmentIds[attachmentCategory.ordinal()] = Item.getIdFromItem(nextAttachment);
			
		} else if (weaponInstance.getWeapon().isCategoryRemovable(attachmentCategory)) {
			activeAttachmentIds[attachmentCategory.ordinal()] = -1;
			ApplyHandler2<Weapon> handler = weaponInstance.getWeapon().getEquivalentHandler(attachmentCategory);
			if (handler != null) {
				handler.apply(null, weaponInstance);
			}
			
		} else {
			return;
		}

		if (currentAttachment != null && !player.isCreative()) {
			// Item must be added to the same spot the next attachment comes from or to any
			// spot if there is no next attachment
			if (lookupResult.index == -1) {
				player.inventory.addItemStackToInventory(new ItemStack(currentAttachment));
			} else if (player.inventory.mainInventory.get(lookupResult.index) == null || player.inventory.mainInventory.get(lookupResult.index).getItem() == Items.AIR) {
				player.inventory.mainInventory.set(lookupResult.index, new ItemStack(currentAttachment));
			}
		}

		Tags.setAttachmentIds(weaponInstance.getItemStack(), activeAttachmentIds);
		weaponInstance.setActiveAttachmentIds(activeAttachmentIds);
	}

	private AttachmentLookupResult findForcedAttach(ItemStack stack, Item currentAttachment,
			AttachmentCategory category, PlayerWeaponInstance weaponInstance, boolean isCreative) {

		AttachmentLookupResult result = new AttachmentLookupResult();

		if(stack.isEmpty()) {
			result.index = -1;
			return result;
		}

		if(isCreative) {
			CompatibleAttachment<Weapon> compatibleAttachment = weaponInstance.getWeapon().getCompatibleAttachments().get(stack.getItem());
			if(compatibleAttachment != null) {
				
				result.compatibleAttachment = compatibleAttachment;
				result.isCreative = true;
			}
			return result;
		}
		
		//System.out.println("Search..");
		EntityPlayer player = (EntityPlayer) weaponInstance.getPlayer();
		for(int i = 0; i < player.inventory.getSizeInventory(); ++i) {
			ItemStack inventory = player.inventory.getStackInSlot(i);
			if(ItemStack.areItemStacksEqual(inventory, stack)) {
				/*
				//attachmentItemFromInventory.getCategory() == category
				&& (compatibleAttachment = weaponInstance.getWeapon().getCompatibleAttachments()
						.get(attachmentItemFromInventory)) != null
				&& attachmentItemFromInventory != currentAttachment
				&& hasRequiredAttachments(compatibleAttachment.getAttachment(), weaponInstance)) {
				*/
				CompatibleAttachment<Weapon> compatibleAttachment = weaponInstance.getWeapon().getCompatibleAttachments().get(inventory.getItem());
				if(compatibleAttachment == null 
				   || category != compatibleAttachment.getAttachment().getCategory()
				   || !hasRequiredAttachments(compatibleAttachment.getAttachment(), weaponInstance)
				   ||	inventory.getItem() == currentAttachment) continue;

				result.index = i;
				result.compatibleAttachment = compatibleAttachment;
				break;
			}
		}
		
		
		return result;

	}

	private AttachmentLookupResult next(AttachmentCategory category, Item currentAttachment,
			PlayerWeaponInstance weaponInstance) {
		/*
		 * Start with selected index -1 (current attachment). Current index = selected
		 * index Iterate through the inventory until found a compatible attachment If
		 * hit the end, reset the counter to 0 and continue
		 *
		 * If had current attachment and no other attachment found, nothing changes e.g.
		 * selectedIndex = -1, currentIndex starts with selectedIndex + 1 = 0
		 * currentIndex: from 0 -> 36
		 *
		 * If had current attachment and other attachment found at index 10: e.g.
		 * selectedIndex = -1 currentIndex: from 0 -> 10 addItemToPlayerInventory
		 * selectedIndex = 10
		 *
		 * when entering attachment mode, all selected indexes are set to -1 selected
		 * indexes are really startSearchFromIndexes
		 */

		AttachmentLookupResult result = new AttachmentLookupResult();

		byte[] originallySelectedAttachmentIndexes = weaponInstance.getSelectedAttachmentIds();
		if (originallySelectedAttachmentIndexes == null
				|| originallySelectedAttachmentIndexes.length != AttachmentCategory.values.length) {
			return result;
		}

		byte[] selectedAttachmentIndexes = Arrays.copyOf(originallySelectedAttachmentIndexes,
				originallySelectedAttachmentIndexes.length);
		int activeIndex = selectedAttachmentIndexes[category.ordinal()];

		boolean isCategoryRemovable = weaponInstance.getWeapon().isCategoryRemovable(category);
		result.index = -1;
		int offset = activeIndex + 1;

		int endIndex = isCategoryRemovable ? (INVENTORY_SIZE + 1) : INVENTORY_SIZE;

		for (int i = 0; i < endIndex; i++) {
			// i = inventorySize corresponds to "no attachment"
			int currentIndex = i + offset;

			if (currentIndex >= INVENTORY_SIZE) {
				currentIndex -= INVENTORY_SIZE + (isCategoryRemovable ? 1 : 0);
			}

			LOG.debug("Searching for an attachment in slot {}", currentIndex);

			if (currentIndex == -1) {
				result.index = -1;
				break;
			}

			ItemStack slotItemStack = ((EntityPlayer) weaponInstance.getPlayer()).inventory
					.getStackInSlot(currentIndex);
			if (slotItemStack != null && slotItemStack.getItem() instanceof ItemAttachment) {
				@SuppressWarnings("unchecked")
				ItemAttachment<Weapon> attachmentItemFromInventory = (ItemAttachment<Weapon>) slotItemStack.getItem();
				CompatibleAttachment<Weapon> compatibleAttachment;
				if (attachmentItemFromInventory.getCategory() == category
						&& (compatibleAttachment = weaponInstance.getWeapon().getCompatibleAttachments()
								.get(attachmentItemFromInventory)) != null
						&& attachmentItemFromInventory != currentAttachment
						&& hasRequiredAttachments(compatibleAttachment.getAttachment(), weaponInstance)) {

					result.index = currentIndex;
					result.compatibleAttachment = compatibleAttachment;
					break;
				}
			}
		}

		selectedAttachmentIndexes[category.ordinal()] = (byte) result.index;
		weaponInstance.setSelectedAttachmentIndexes(selectedAttachmentIndexes);

		return result;
	}

	public static boolean hasRequiredAttachments(ItemAttachment<Weapon> attachmentItemFromInventory,
			PlayerWeaponInstance weaponInstance) {
		List<ItemAttachment<Weapon>> requiredAttachments = attachmentItemFromInventory.getRequiredAttachments();
		if (requiredAttachments.isEmpty()) {
			return true;
		}
		boolean result = false;
		for (int currentAttachmentId : weaponInstance.getActiveAttachmentIds()) {
			Item attachmentItem = Item.getItemById(currentAttachmentId);
			result = attachmentItem != null && requiredAttachments.contains(attachmentItem);
			if (result) {
				break;
			}
		}
		return result;
	}

	public static boolean isAttachmentInUse(ItemAttachment<Weapon> attachmentItem,
			PlayerWeaponInstance weaponInstance) {
		return isRequired(attachmentItem, weaponInstance);
	}

	public static boolean isRequired(ItemAttachment<Weapon> attachmentItem, PlayerWeaponInstance weaponInstance) {
		boolean result = false;
		for (int currentAttachmentId : weaponInstance.getActiveAttachmentIds()) {
			Item otherAttachmentItem = Item.getItemById(currentAttachmentId);
			if (otherAttachmentItem instanceof ItemAttachment) {
				result = ((ItemAttachment<?>) otherAttachmentItem).getRequiredAttachments().contains(attachmentItem);
				
				if (result) {
					break;
				}
			}
		}
		return result;
	}
	
	public static ArrayList<ItemAttachment<Weapon>> whatRequiredFor(ItemAttachment<Weapon> attachmentItem, PlayerWeaponInstance weaponInstance) {
		ArrayList<ItemAttachment<Weapon>> requireesList = new ArrayList<>();
		
		boolean result = false;
		for (int currentAttachmentId : weaponInstance.getActiveAttachmentIds()) {
			Item otherAttachmentItem = Item.getItemById(currentAttachmentId);
			if (otherAttachmentItem instanceof ItemAttachment) {
				result = ((ItemAttachment<?>) otherAttachmentItem).getRequiredAttachments().contains(attachmentItem);
				
				if (result) {
					requireesList.add((ItemAttachment<Weapon>) otherAttachmentItem);
				}
			}
		}
		return requireesList;
	}

	@SuppressWarnings("unchecked")
	/**
	 * Adds the attachment to the weapon identified by the itemStack without
	 * removing the attachment from the inventory.
	 *
	 * @param nextAttachment
	 * @param itemStack
	 * @param player
	 */
	public static void addAttachment(ItemAttachment<Weapon> attachment, PlayerWeaponInstance weaponInstance) {

		int[] activeAttachmentsIds = weaponInstance.getActiveAttachmentIds();
		int activeAttachmentIdForThisCategory = activeAttachmentsIds[attachment.getCategory().ordinal()];
		ItemAttachment<Weapon> currentAttachment = null;
		if (activeAttachmentIdForThisCategory > 0) {
			currentAttachment = (ItemAttachment<Weapon>) Item.getItemById(activeAttachmentIdForThisCategory);
		}

		if (currentAttachment == null) {
			if (attachment != null) {
				if (attachment.getApply() != null) {
					attachment.getApply().apply(attachment, weaponInstance.getWeapon(), weaponInstance.getPlayer());
				} else if (attachment.getApply2() != null) {
					attachment.getApply2().apply(attachment, weaponInstance);
				}
			}
			activeAttachmentsIds[attachment.getCategory().ordinal()] = Item.getIdFromItem(attachment);
		} else {
			System.err.println("Attachment of category " + attachment.getCategory() + " installed, remove it first");
		}
	}

	@SuppressWarnings("unchecked")
	/**
	 * Removes the attachment from the weapon identified by the itemStack without
	 * adding the attachment to the inventory.
	 *
	 * @param attachmentCategory
	 * @param itemStack
	 * @param player
	 * @return
	 */
	ItemAttachment<Weapon> removeAttachment(AttachmentCategory attachmentCategory,
			PlayerWeaponInstance weaponInstance) {

		int[] activeAttachmentIds = weaponInstance.getActiveAttachmentIds();
		int activeAttachmentIdForThisCategory = activeAttachmentIds[attachmentCategory.ordinal()];
		ItemAttachment<Weapon> currentAttachment = null;
		if (activeAttachmentIdForThisCategory > 0) {
			currentAttachment = (ItemAttachment<Weapon>) Item.getItemById(activeAttachmentIdForThisCategory);

			if (isAttachmentInUse(currentAttachment, weaponInstance)) {
				return null;
			}
		}

		if (currentAttachment != null && currentAttachment.getRemove() != null) {
			currentAttachment.getRemove().apply(currentAttachment, weaponInstance.getWeapon(),
					weaponInstance.getPlayer());
		}

		if (currentAttachment != null) {
			activeAttachmentIds[attachmentCategory.ordinal()] = -1;
			weaponInstance.setActiveAttachmentIds(activeAttachmentIds);
		}

		return currentAttachment;
	}

	public static ItemAttachment<Weapon> getActiveAttachment(AttachmentCategory category,
			PlayerWeaponInstance weaponInstance) {

		ItemAttachment<Weapon> itemAttachment = null;

		int[] activeAttachmentIds = weaponInstance.getActiveAttachmentIds();

		for (int activeIndex : activeAttachmentIds) {
			if (activeIndex == 0)
				continue;
			Item item = Item.getItemById(activeIndex);
			if (item instanceof ItemAttachment) {
				CompatibleAttachment<Weapon> compatibleAttachment = weaponInstance.getWeapon()
						.getCompatibleAttachments().get(item);
				if (compatibleAttachment != null && category == compatibleAttachment.getAttachment().getCategory()) {
					itemAttachment = compatibleAttachment.getAttachment();
					break;
				}
			}

		}
		return itemAttachment;
	}

	static boolean isActiveAttachment(ItemAttachment<Weapon> attachment, PlayerWeaponInstance weaponInstance) {
		int[] activeAttachmentIds = weaponInstance.getActiveAttachmentIds();
		return Arrays.stream(activeAttachmentIds)
				.anyMatch((attachmentId) -> attachment == Item.getItemById(attachmentId));
	}

	boolean isSilencerOn(PlayerWeaponInstance weaponInstance) {
		int[] activeAttachmentsIds = weaponInstance.getActiveAttachmentIds();
		int activeAttachmentIdForThisCategory = activeAttachmentsIds[AttachmentCategory.SILENCER.ordinal()];
		return activeAttachmentIdForThisCategory > 0;
	}

	ItemAttachment<Weapon> getActiveAttachment(PlayerWeaponInstance weaponInstance, AttachmentCategory category) {
		return weaponInstance.getAttachmentItemWithCategory(category);
	}
}
