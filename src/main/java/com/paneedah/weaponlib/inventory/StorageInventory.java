package com.paneedah.weaponlib.inventory;

import com.paneedah.weaponlib.ItemStorage;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.common.util.Constants;

import java.util.ArrayList;
import java.util.List;

public class StorageInventory implements IInventory {
    
    private static final String TAG_SLOT_INDEX = "Slot";
    private static final String TAG_SIZE = "size";

    private String name = "Inventory Item";

    private final ItemStack storageItemStack;

    private ItemStack[] inventory;

    /**
     * @param itemstack
     *            - the ItemStack to which this inventory belongs
     */
    public StorageInventory(ItemStack storageItemStack) {
        this.storageItemStack = storageItemStack;

        int size = 0;
        Item item = storageItemStack.getItem();
        if(item instanceof ItemStorage) {
            size = ((ItemStorage)item).getSize();
        }
        this.inventory = new ItemStack[size];
        for(int i = 0; i < this.inventory.length; i++) {
            this.inventory[i] = new ItemStack(Items.AIR);
        }
        
        if (!storageItemStack.hasTagCompound()) {
            NBTTagCompound storageCompound = new NBTTagCompound();
            storageCompound.setInteger(TAG_SIZE, size);
            storageItemStack.setTagCompound(storageCompound);
        }
        
        deserialize(storageItemStack.getTagCompound());
    }

    public ItemStorage getItemStorage() {
        return (ItemStorage) storageItemStack.getItem();
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
                // Don't forget this line or your inventory will not be saved!
                markDirty();
            } else {
                // this method also calls onInventoryChanged, so we don't need
                // to call it again
                setInventorySlotContents(slot, new ItemStack(Items.AIR));
            }
        }
        return stack;
    }

    @Override
    public void setInventorySlotContents(int slot, ItemStack stack) {
        this.inventory[slot] = stack != null ? stack : new ItemStack(Items.AIR);

        if (stack != null && stack.getCount() > getInventoryStackLimit()) {
            stack.setCount(getInventoryStackLimit());
        }

        // Don't forget this line or your inventory will not be saved!
        markDirty();
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean hasCustomName() {
        return name.length() > 0;
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    /**
     * This is the method that will handle saving the inventory contents, as it
     * is called (or should be called!) anytime the inventory changes. Perfect.
     * Much better than using onUpdate in an Item, as this will also let you
     * change things in your inventory without ever opening a Gui, if you want.
     */
    @Override
    public void markDirty() {
        for (int i = 0; i < getSizeInventory(); ++i) {
            if (getStackInSlot(i) != null && getStackInSlot(i).getCount() == 0) {
                inventory[i] = new ItemStack(Items.AIR);
            }
        }

        serialize(storageItemStack.getTagCompound());
    }

    @Override
    public boolean isUsableByPlayer(EntityPlayer entityplayer) {
        return true;
    }

    @Override
    public boolean isItemValidForSlot(int slot, ItemStack itemstack) {
        return true;
    }

    private void deserialize(NBTTagCompound compound) {
        NBTTagList items = compound.getTagList("ItemInventory", Constants.NBT.TAG_COMPOUND);

        int size = compound.getInteger(TAG_SIZE);
        if(size >= 0 && items.tagCount() >= 0) {
            inventory = new ItemStack[size];
            for(int i = 0; i < size; i++) {
                inventory[i] = new ItemStack(Items.AIR);
            }
            for (int i = 0; i < size && i < items.tagCount(); ++i) {
                NBTTagCompound item = (NBTTagCompound) items.getCompoundTagAt(i);
                int slot = item.getInteger(TAG_SLOT_INDEX);

                if (slot >= 0 && slot < size) {
                    inventory[slot] = new ItemStack(item);;
                }
            }
        }
    }

    private void serialize(NBTTagCompound tagcompound) {
        
        tagcompound.setInteger(TAG_SIZE, inventory.length);
        
        NBTTagList items = new NBTTagList();

        List<ItemStack> stackInSlots = new ArrayList<>();
        for (int i = 0; i < getSizeInventory(); ++i) {
            // Only write stacks that contain items
            final ItemStack stackInSlot = getStackInSlot(i);
            if (stackInSlot != null) {
                // Make a new NBT Tag Compound to write the itemstack and slot
                // index to
                NBTTagCompound item = new NBTTagCompound();
                item.setInteger(TAG_SLOT_INDEX, i);
                // Writes the itemstack in slot(i) to the Tag Compound we just
                // made
                stackInSlot.writeToNBT(item);

                items.appendTag(item);
                
                stackInSlots.add(stackInSlot);
            }
        }
        // Add the TagList to the ItemStack's Tag Compound with the name
        // "ItemInventory"
        tagcompound.setTag("ItemInventory", items);
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
