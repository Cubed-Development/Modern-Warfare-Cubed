package com.paneedah.weaponlib;

import com.paneedah.weaponlib.network.TypeRegistry;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

public class PlayerMagazineInstance extends PlayerItemInstance<MagazineState> {
	
	static {
		TypeRegistry.getInstance().register(PlayerMagazineInstance.class);
	}
	
//	private int ammo;
		

	public PlayerMagazineInstance() {
		super();
	}

	@Override
	public boolean shouldHaveInstanceTags() {
		return false;
	}
	
	
	public PlayerMagazineInstance(int itemInventoryIndex, EntityLivingBase player, ItemStack itemStack) {
		super(itemInventoryIndex, player, itemStack);
	}

	public PlayerMagazineInstance(int itemInventoryIndex, EntityLivingBase player) {
		super(itemInventoryIndex, player);
	}
	
	@Override
	public void init(ByteBuf buf) {
		super.init(buf);
//		ammo = buf.readInt();
	}
	
	@Override
	public void serialize(ByteBuf buf) {
		super.serialize(buf);
//		buf.writeInt(ammo);
	}
	
	@Override
	protected void updateWith(PlayerItemInstance<MagazineState> otherItemInstance, boolean updateManagedState) {
		super.updateWith(otherItemInstance, updateManagedState);
//		PlayerMagazineInstance otherMagazineInstance = (PlayerMagazineInstance) otherItemInstance;
//		setAmmo(otherMagazineInstance.ammo);
	}

	public ItemMagazine getMagazine() {
		return (ItemMagazine)item;
	}
}
