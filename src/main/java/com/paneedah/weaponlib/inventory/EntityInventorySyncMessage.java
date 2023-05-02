package com.paneedah.weaponlib.inventory;

import com.paneedah.weaponlib.compatibility.CompatibleMessage;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.PacketBuffer;
import net.minecraft.world.World;

import java.io.IOException;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class EntityInventorySyncMessage implements CompatibleMessage {

    private NBTTagCompound inventoryCompound;
    private int entityId;
    private boolean excludeEntity;

    public EntityInventorySyncMessage() {}
    
    public EntityInventorySyncMessage(Entity entity, CustomPlayerInventory inventory, boolean excludeEntity) {
        this.entityId = entity.getEntityId();
        this.excludeEntity = excludeEntity;
        this.inventoryCompound = new NBTTagCompound();
        inventory.writeToNBT(inventoryCompound);
    }

    public void fromBytes(ByteBuf buf) {
        PacketBuffer packetBuf = new PacketBuffer(buf);
        entityId = packetBuf.readInt();
        excludeEntity = packetBuf.readBoolean();
        try {
            inventoryCompound  = compatibility.readTagCompound(packetBuf);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void toBytes(ByteBuf buf) {
        PacketBuffer packetBuf = new PacketBuffer(buf);
        packetBuf.writeInt(entityId);
        packetBuf.writeBoolean(excludeEntity);
        try {
            compatibility.writeTagCompound(packetBuf, inventoryCompound);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    protected CustomPlayerInventory getInventory() {
        CustomPlayerInventory inventory = new CustomPlayerInventory();
        if(inventoryCompound != null) {
            inventory.readFromNBT(inventoryCompound);
        }
        return inventory;
    }
    
    public Entity getEntity(World world) {
        return world.getEntityByID(entityId);
    }
    
    public boolean isExcludeEntity() {
        return excludeEntity;
    }
}
