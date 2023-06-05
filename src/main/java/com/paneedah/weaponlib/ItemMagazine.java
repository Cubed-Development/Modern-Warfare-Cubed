package com.paneedah.weaponlib;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;

public class ItemMagazine extends ItemAttachment<Weapon> implements PlayerItemInstanceFactory<PlayerMagazineInstance, MagazineState>, Reloadable, Updatable, Part {
	
	public static final class Builder extends AttachmentBuilder<Weapon> {
		private int capacity;
		private final List<ItemBullet> compatibleBullets = new ArrayList<>();
		private String reloadSound;
		private String unloadSound;
		
		public Builder withCapacity(int capacity) {
			this.capacity = capacity;
			return this;
		}

		public Builder withCompatibleBullet(ItemBullet compatibleBullet) {
			this.compatibleBullets.add(compatibleBullet);
			return this;
		}

		public Builder withUnloadSound(String unloadSound) {
			this.unloadSound = unloadSound;
			return this;
		}
		
		public Builder withReloadSound(String reloadSound) {
			this.reloadSound = reloadSound;
			return this;
		}
		
		@Override
		protected ItemAttachment<Weapon> createAttachment(ModContext modContext) {
			final ItemMagazine magazine = new ItemMagazine(getModel(), getTextureName(), capacity);

			magazine.compatibleBullets = compatibleBullets;

			if(reloadSound != null)
				magazine.reloadSound = modContext.registerSound(reloadSound);

			if (unloadSound!= null)
				magazine.unloadSound = modContext.registerSound(unloadSound);

			magazine.modContext = modContext;

			withInformationProvider((stack) -> TextFormatting.RED + "Ammo: " + TextFormatting.GRAY + Tags.getAmmo(stack) + "/" + capacity);

			return magazine;
		}
	}

	private ModContext modContext;

	private final int capacity;
	private List<ItemBullet> compatibleBullets;
	private SoundEvent reloadSound;
	private SoundEvent unloadSound;

	ItemMagazine(ModelBase model, String textureName, int capacity) {
		this(model, textureName, capacity, null, null);
	}

	ItemMagazine(ModelBase model, String textureName, int capacity, ApplyHandler<Weapon> apply, ApplyHandler<Weapon> remove) {
		super(AttachmentCategory.MAGAZINE, model, textureName, null, apply, remove);
		this.capacity = capacity;
		setMaxStackSize(1);
	}

	public ItemStack create(int ammunition) {
		final ItemStack itemStack = new ItemStack(this);

		initializeTag(itemStack, ammunition);

		return itemStack;
	}

	public ItemStack create() {
		return this.create(capacity);
	}

	private void initializeTag(ItemStack itemStack, int initialAmmo) {
		if (itemStack.getTagCompound() == null) {
			itemStack.setTagCompound(new NBTTagCompound());
			Tags.setAmmo(itemStack, initialAmmo);
		}
	}
	
	@Override
	public void onCreated(ItemStack stack, World world, EntityPlayer player) {
		initializeTag(stack, 0);
	}

	List<ItemBullet> getCompatibleBullets() {
		return compatibleBullets;
	}

	public int getCapacity() {
		return capacity;
	}

	public SoundEvent getReloadSound() {
		return reloadSound;
	}
	
	public SoundEvent getUnloadSound() {
		return unloadSound;
	}

	@Override
	public Part getRenderablePart() {
		return this;
	}

	@Override
	public PlayerMagazineInstance createItemInstance(EntityLivingBase player, ItemStack itemStack, int slot) {
		final PlayerMagazineInstance instance = new PlayerMagazineInstance(slot, player, itemStack);

		instance.setState(MagazineState.READY);

		return instance;
	}

	@Override
	public void update(EntityPlayer player) {
		modContext.getMagazineReloadAspect().updateMainHeldItem(player);
	}

	@Override
	public void reloadMainHeldItemForPlayer(EntityPlayer player) {
		modContext.getMagazineReloadAspect().reloadMainHeldItem(player);
	}

    @Override
    public void unloadMainHeldItemForPlayer(EntityPlayer player) {
    	modContext.getMagazineReloadAspect().unloadMainHeldItem(player);
    }
}
