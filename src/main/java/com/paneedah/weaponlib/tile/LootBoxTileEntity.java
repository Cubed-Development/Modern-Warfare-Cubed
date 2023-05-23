package com.paneedah.weaponlib.tile;

import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.grenade.ItemGrenade;
import com.paneedah.weaponlib.grenade.PlayerGrenadeInstance;
import com.paneedah.weaponlib.tile.LootBoxConfiguration.Equipment;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

import java.util.Set;

public class LootBoxTileEntity extends CustomTileEntity<LootBoxConfiguration> {
    
    private static final String TAG_TIME = "T";
    private long lastEquipmentDispenseTimestamp;
    
    @Override
    public void onEntityBlockActivated(World world, BlockPos pos, EntityPlayer player) {
        dropContents(world, pos, player);
    }
    
    public void dropContents(World world, BlockPos pos, EntityPlayer player) {
        
        LootBoxConfiguration configuration = getConfiguration();
        if(lastEquipmentDispenseTimestamp > world.getWorldTime()) {
            lastEquipmentDispenseTimestamp = 0;
        }
        if(!world.isRemote) {
            if(configuration.getEquipmentDispenseTimeoutTicks() < world.getWorldTime() - lastEquipmentDispenseTimestamp) {
                lastEquipmentDispenseTimestamp = world.getWorldTime();
                Equipment equipment = configuration.getEquipmentOptions().pick(EnumDifficulty.EASY);
                if (equipment != null && equipment.item != null) {
                    System.out.println("Dropping " + equipment.item.getTranslationKey());
                    player.playSound(configuration.getDispenseSound(), 0.15f, 1);
                    ItemStack equipmentItemStack = null;
                    if(equipment.item instanceof Weapon) {
                        equipmentItemStack = new ItemStack(equipment.item, equipment.stackSize);
                        initWeaponWithAttachments(equipment, equipmentItemStack, player);
                    } else if(equipment.item instanceof ItemGrenade) {
                        equipmentItemStack = new ItemStack(equipment.item, equipment.stackSize);
                        initGrenade(equipment, equipmentItemStack, player);
                    } else if(equipment.item instanceof ItemBullet) {
                        ItemBullet bullet = (ItemBullet)equipment.item;
                        equipmentItemStack = new ItemStack(equipment.item, 
                                Math.min(equipment.stackSize, bullet.getItemStackLimit()));
                        
                        initBullet(equipment, equipmentItemStack, player);
                    }
                    //compatibility.setItemStackToSlot(player, EntityEquipmentSlot.MAIN_HAND, equipmentItemStack);
                    
                    if(equipmentItemStack != null) {
                        EntityItem item = new EntityItem(getWorld(), getPos().getX() + 1, getPos().getY() + 1, getPos().getZ() + 1, equipmentItemStack);
                        item.setNoPickupDelay();
                        if(player != null)
                            player.world.spawnEntity(item);
                    }
                }
            } else {
                player.playSound(configuration.getEquipmentNotAvailableSound(), 0.15F, 1);
            }
        }
        
//      if (!this.worldObj.isRemote) {
//          for (ItemStack itemstack : this.ContainerItemStacks)
//          {
//              if (itemstack != null)
//              {
//                  EntityItem item = new EntityItem(this.worldObj, this.xCoord + 0.5, this.yCoord + 0.5, this.zCoord + 0.5, itemstack);
//                  item.delayBeforeCanPickup = 0;
//                  this.worldObj.spawnEntityInWorld(item);
//              }
//          }
//      }
//      this.ContainerItemStacks = new ItemStack[5];
    }

    @SuppressWarnings("unchecked")
    private void initWeaponWithAttachments(Equipment equipment, ItemStack itemStack, EntityPlayer player) {
        if(equipment.attachments != null && equipment.item instanceof Weapon && equipment.item instanceof PlayerItemInstanceFactory) {
            PlayerWeaponInstance weaponInstance = (PlayerWeaponInstance) ((PlayerItemInstanceFactory<?, ?>)equipment.item).createItemInstance(player, new ItemStack(equipment.item), 0);
            for(ItemAttachment<?> attachment: equipment.attachments) {
                Set<ItemAttachment<Weapon>> compatibleAttachments = weaponInstance.getWeapon().getCompatibleAttachments().keySet();
                compatibleAttachments.contains(attachment);
                WeaponAttachmentAspect.addAttachment((ItemAttachment<Weapon>) attachment, weaponInstance);
            }
            Tags.setInstance(itemStack, weaponInstance);
            //Tags.setAmmo(itemStack, getConfiguration().getMaxAmmo());
        }
    }
    
    private void initGrenade(Equipment equipment, ItemStack itemStack, EntityPlayer player) {
        if(equipment.item instanceof ItemGrenade) {
            PlayerGrenadeInstance grenadeInstance = (PlayerGrenadeInstance) ((PlayerItemInstanceFactory<?, ?>)equipment.item)
                    .createItemInstance(player, new ItemStack(equipment.item), 0);
            grenadeInstance.setThrowingFar(true);
            Tags.setInstance(itemStack, grenadeInstance);
        }
    }
    
    private void initBullet(Equipment equipment, ItemStack itemStack, EntityPlayer player) {
        
    }
    
    @Override
    public void readFromNBT(NBTTagCompound tagCompound) {
        super.readFromNBT(tagCompound);
        lastEquipmentDispenseTimestamp = tagCompound.getLong(TAG_TIME);
    }
    
    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound tagCompound) {
        super.writeToNBT(tagCompound);
        tagCompound.setLong(TAG_TIME, lastEquipmentDispenseTimestamp);
        return tagCompound;
    }
}
