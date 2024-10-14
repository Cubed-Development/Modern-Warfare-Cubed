package com.paneedah.weaponlib;

import com.paneedah.mwc.network.TypeRegistry;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

public class PlayerMagazineInstance extends PlayerItemInstance<MagazineState> {

    static {
        TypeRegistry.getINSTANCE().register(PlayerMagazineInstance.class);
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
    public void read(ByteBuf byteBuf) {
        super.read(byteBuf);
//		ammo = buf.readInt();
    }

    @Override
    public void write(ByteBuf byteBuf) {
        super.write(byteBuf);
//		buf.writeInt(ammo);
    }

    @Override
    protected void updateWith(PlayerItemInstance<MagazineState> otherItemInstance, boolean updateManagedState) {
        super.updateWith(otherItemInstance, updateManagedState);
    }

    public ItemMagazine getMagazine() {
        return (ItemMagazine) item;
    }
}
