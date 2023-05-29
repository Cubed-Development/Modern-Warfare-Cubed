package com.paneedah.weaponlib.inventory;

import com.paneedah.weaponlib.Contextual;
import com.paneedah.weaponlib.ItemStorage;
import com.paneedah.weaponlib.ModContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.text.ITextComponent;

public class CustomPlayerInventory implements IInventory, Contextual {
    /**
     * The name your custom inventory will display in the GUI, possibly just
     * "Inventory"
     */
    private final String name = "Custom Inventory";

    /** The key used to store and retrieve the inventory from NBT */
    private static final String tagName = "CustomInvTag";

    private static final int INV_SIZE = 2;

    private ItemStack[] inventory;

    private ModContext modContext;
    
    private EntityPlayer owner;

    public CustomPlayerInventory(/*ModContext modContext*/) {
        inventory = new ItemStack[INV_SIZE];
        for(int i = 0; i < inventory.length; i++) {
            inventory[i] = new ItemStack(Items.AIR);
        }
    }
    
    public void setOwner(EntityPlayer player) {
        this.owner = player;
    }

    @Override
    public int getSizeInventory() {
        return inventory.length;
    }

    @Override
    public ItemStack getStackInSlot(int slot) {
        return inventory[slot];
    }

    @Override
    public ItemStack decrStackSize(int slot, int amount) {
        ItemStack stack = getStackInSlot(slot);
        if (stack != null) {
            if (stack.getCount() > amount) {
                stack = stack.splitStack(amount);
                markDirty();
            } else {
                setInventorySlotContents(slot, new ItemStack(Items.AIR));
            }
        }
        return stack;
    }
    
    @Override
    public boolean hasCustomName() {
        return true;
    }

//    @Override
//    public ItemStack getStackInSlotOnClosing(int slot) {
//        ItemStack stack = getStackInSlot(slot);
//        setInventorySlotContents(slot, null);
//        return stack;
//    }

    @Override
    public void setInventorySlotContents(int slot, ItemStack itemstack) {
        this.inventory[slot] = itemstack != null ? itemstack : new ItemStack(Items.AIR);

        if (itemstack != null && itemstack.getCount() > this.getInventoryStackLimit()) {
            if(itemstack.getItem() instanceof ItemStorage) {
//                System.out.println("Setting inventory slot " + slot + " with tag compound "
//                        + itemstack.getTagCompound());
            }
            itemstack.setCount(getInventoryStackLimit());
        }

        this.markDirty();
    }

    @Override
    public String getName() {
        return name;
    }

    /**
     * Our custom slots are similar to armor - only one item per slot
     */
    @Override
    public int getInventoryStackLimit() {
        return 1;
    }

    @Override
    public void markDirty() {
        for (int i = 0; i < getSizeInventory(); ++i) {
            if (getStackInSlot(i) != null && getStackInSlot(i).getCount() == 0) {
                inventory[i] = new ItemStack(Items.AIR);
            }
        }
        
        if(modContext != null && owner != null && owner.world.isRemote) {
            modContext.getChannel().sendToServer(new EntityInventorySyncMessage(owner, 
                    this, true));
//            modContext.getChannel().sendToAll(
//                    new EntityInventorySyncMessage(owner, this, true));
        }
    }
    
    @Override
    public boolean isUsableByPlayer(EntityPlayer player) {
        return true;
    }

    /**
     * This method doesn't seem to do what it claims to do, as items can still
     * be left-clicked and placed in the inventory even when this returns false
     */
    @Override
    public boolean isItemValidForSlot(int slot, ItemStack itemstack) {
        // If you have different kinds of slots, then check them here:
        // if (slot == SLOT_SHIELD && itemstack.getItem() instanceof ItemShield)
        // return true;

        // For now, only ItemUseMana items can be stored in these slots
        return true; // itemstack.getItem() instanceof ItemUseMana;
    }

    public void writeToNBT(NBTTagCompound compound) {
        NBTTagList items = new NBTTagList();

        for (int i = 0; i < getSizeInventory(); ++i) {
            final ItemStack stackInSlot = getStackInSlot(i);
            if (stackInSlot != null) {
//                System.out.println("Serializing stack " + stackInSlot
//                        + " with tag compound: " + stackInSlot.getTagCompound());
                NBTTagCompound item = new NBTTagCompound();
                item.setByte("Slot", (byte) i);
                stackInSlot.writeToNBT(item);
                items.appendTag(item);
            }
        }

        // We're storing our items in a custom tag list using our 'tagName' from
        // above
        // to prevent potential conflicts
        compound.setTag(tagName, items);
    }

    public void readFromNBT(NBTTagCompound compound) {
        // now you must include the NBTBase type ID when getting the list;
        // NBTTagCompound's ID is 10
        NBTTagList tagList = compound.getTagList(tagName, compound.getId());
        for (int i = 0; i < tagList.tagCount(); ++i) {
            // tagAt(int) has changed to getCompoundTagAt(int)
            NBTTagCompound item = tagList.getCompoundTagAt(i);
            byte slot = item.getByte("Slot");
            if (slot >= 0 && slot < getSizeInventory()) {
                inventory[slot] = new ItemStack(item);;
            } else {
//                System.out.println("Could not find slot " + slot);
            }
        }
    }

    @Override
    public void setContext(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public ITextComponent getDisplayName() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public ItemStack removeStackFromSlot(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void openInventory(EntityPlayer player) {
        // TODO Auto-generated method stub

    }

    @Override
    public void closeInventory(EntityPlayer player) {
        // TODO Auto-generated method stub

    }

    @Override
    public int getField(int id) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void setField(int id, int value) {
        // TODO Auto-generated method stub

    }

    @Override
    public int getFieldCount() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void clear() {
    }
}
