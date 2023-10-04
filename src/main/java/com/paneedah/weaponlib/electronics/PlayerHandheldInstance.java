package com.paneedah.weaponlib.electronics;

import com.paneedah.mwc.network.TypeRegistry;
import com.paneedah.mwc.rendering.perspective.Perspective;
import com.paneedah.weaponlib.PlayerItemInstance;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

public class PlayerHandheldInstance extends PlayerItemInstance<HandheldState> {
	
	private static final int SERIAL_VERSION = 1;

	static {
		TypeRegistry.getINSTANCE().register(PlayerHandheldInstance.class);
	}

	public PlayerHandheldInstance() {
		super();
	}

	public PlayerHandheldInstance(int itemInventoryIndex, EntityLivingBase player, ItemStack itemStack) {
		super(itemInventoryIndex, player, itemStack);
	}

	public PlayerHandheldInstance(int itemInventoryIndex, EntityLivingBase player) {
		super(itemInventoryIndex, player);
	}
	
	@Override
	public Perspective getRequiredPerspectiveType() {
	    ItemHandheld<?> item = (ItemHandheld<?>)getItem();
	    return item != null ? item.getRequiredPespectiveType() : null;
	}
	
	@Override
	public void write(ByteBuf byteBuf) {
	    super.write(byteBuf);
	}
	
	@Override
	public void read(ByteBuf byteBuf) {
	    super.read(byteBuf);
	}
	
	@Override
	protected int getSerialVersion() {
		return SERIAL_VERSION;
	}
    
    @Override
    public String toString() {
        return "Handheld [" + getUuid() + "]";
    }

}
