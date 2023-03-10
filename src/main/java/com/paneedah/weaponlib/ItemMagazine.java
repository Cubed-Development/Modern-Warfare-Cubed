package com.paneedah.weaponlib;

import com.paneedah.weaponlib.compatibility.CompatibleSound;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class ItemMagazine extends ItemAttachment<Weapon> implements PlayerItemInstanceFactory<PlayerMagazineInstance, MagazineState>, 
Reloadable, Updatable, Part {
	
	private static final long DEFAULT_RELOADING_TIMEOUT_TICKS = 25;
	
	public static final class Builder extends AttachmentBuilder<Weapon> {
		private int ammo;
		private long reloadingTimeout = DEFAULT_RELOADING_TIMEOUT_TICKS;
		private Set<ItemBullet> compatibleBullets = new HashSet<>();
		private String reloadSound;
		private String unloadSound;
		

		
		public Builder withAmmo(int ammo) {
			this.ammo = ammo;
			return this;
		}
		 

		public Builder withReloadingTimeout(int reloadingTimeout) {
			this.reloadingTimeout = reloadingTimeout;
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
		
		public Builder withCompatibleBullet(ItemBullet compatibleBullet) {
			this.compatibleBullets.add(compatibleBullet);
			return this;
		}
		
		
		
		@Override
		protected ItemAttachment<Weapon> createAttachment(ModContext modContext) {
			ItemMagazine magazine = new ItemMagazine(getModel(), getTextureName(), ammo);
			magazine.reloadingTimeout = reloadingTimeout;
	
			magazine.compatibleBullets = new ArrayList<>(compatibleBullets);
			if(reloadSound != null) {
				magazine.reloadSound = modContext.registerSound(reloadSound);
				magazine.unloadSound = modContext.registerSound(unloadSound);
			}
			magazine.modContext = modContext;
			withInformationProvider((stack) -> TextFormatting.RED + "Ammo: " + TextFormatting.GRAY + Tags.getAmmo(stack) + "/" + ammo);
			return magazine;
		}
	}
	
	private final int DEFAULT_MAX_STACK_SIZE = 1;
	
	private int ammo;
	private long reloadingTimeout;
	private List<ItemBullet> compatibleBullets;
	private CompatibleSound reloadSound;
	private CompatibleSound unloadSound;
	private ModContext modContext;
	private Vec3d rotPoint;
	
	ItemMagazine(ModelBase model, String textureName, int ammo) {
		this(model, textureName, ammo, null, null);
	}
	
	

	ItemMagazine(ModelBase model, String textureName, int ammo,
			com.paneedah.weaponlib.ItemAttachment.ApplyHandler<Weapon> apply,
			com.paneedah.weaponlib.ItemAttachment.ApplyHandler<Weapon> remove) {
		super(AttachmentCategory.MAGAZINE, model, textureName, null, apply, remove);
		this.ammo = ammo;
		setMaxStackSize(DEFAULT_MAX_STACK_SIZE);
	}
	

	
	ItemStack createItemStack() {
		ItemStack attachmentItemStack = new ItemStack(this);
		ensureItemStack(attachmentItemStack, ammo);
		return attachmentItemStack;
	}
	
	private void ensureItemStack(ItemStack itemStack, int initialAmmo) {
		if (compatibility.getTagCompound(itemStack) == null) {
			compatibility.setTagCompound(itemStack, new NBTTagCompound());
			Tags.setAmmo(itemStack, initialAmmo);
		}
	}
	
	@Override
	public void onCreated(ItemStack stack, World p_77622_2_, EntityPlayer p_77622_3_) {
		ensureItemStack(stack, 0);
		super.onCreated(stack, p_77622_2_, p_77622_3_);
	}

	@Override
	public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, World world) {
//		ensureItemStack(stack);
		return super.onItemUseFirst(stack, player, world);
	}
	
	@Override
	public void onUpdate(ItemStack stack, World world, Entity entity, int p_77663_4_, boolean p_77663_5_) {
		ensureItemStack(stack, ammo);
		super.onUpdate(stack, world, entity, p_77663_4_, p_77663_5_);
	}

	List<ItemBullet> getCompatibleBullets() {
		return compatibleBullets;
	}

	public int getAmmo() {
		return ammo;
	}

	public CompatibleSound getReloadSound() {
		return reloadSound;
	}
	
	public CompatibleSound getUnloadSound() {
		return unloadSound;
	}

	public long getReloadTimeout() {
		return reloadingTimeout;
	}
	
	@Override
	public Part getRenderablePart() {
		return this;
	}

	@Override
	public PlayerMagazineInstance createItemInstance(EntityLivingBase player, ItemStack itemStack, int slot) {
		PlayerMagazineInstance instance = new PlayerMagazineInstance(slot, player, itemStack);
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
