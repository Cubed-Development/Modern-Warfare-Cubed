package com.paneedah.mwc.equipment.inventory.carryable.backpack;

import com.paneedah.mwc.items.equipment.carryable.ItemBackpack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.common.util.Constants;

import java.util.ArrayList;
import java.util.List;

public class BackpackInventory implements IInventory {

    private static final String TAG_SLOT_INDEX = "Slot";
    private static final String TAG_SIZE = "size";

    private final String name;

    private final ItemStack owner;

    private ItemStack[] inventory;

    /**
     * @param owner The ItemStack to which this inventory belongs
     */
    public BackpackInventory(ItemStack owner) {
        this.owner = owner;
        name = null;

        final int size = ((ItemBackpack) owner.getItem()).getSize();

        inventory = new ItemStack[size];

        for (int i = 0; i < inventory.length; i++)
            inventory[i] = new ItemStack(Items.AIR);

        if (!owner.hasTagCompound()) {
            NBTTagCompound storageCompound = new NBTTagCompound();
            storageCompound.setInteger(TAG_SIZE, size);
            owner.setTagCompound(storageCompound);
        }

        assert owner.getTagCompound() != null;
        deserialize(owner.getTagCompound());
    }

    public ItemBackpack getOwner() {
        return (ItemBackpack) owner.getItem();
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

        if (stack.getCount() > amount) {
            stack = stack.splitStack(amount);
            markDirty(); // Don't forget this line or your inventory will not be saved!
        } else {
            setInventorySlotContents(slot, new ItemStack(Items.AIR)); // This method also calls markDirty, so we don't need to call it again
        }

        return stack;
    }

    @Override
    public void setInventorySlotContents(int slot, ItemStack stack) {
        inventory[slot] = stack;

        if (stack.getCount() > getInventoryStackLimit()) {
            stack.setCount(getInventoryStackLimit());
        }

        markDirty(); // Don't forget this line or your inventory will not be saved!
    }

    @Override
    public String getName() {
        return hasCustomName() ? name : "Inventory Item";
    }

    @Override
    public boolean hasCustomName() {
        return name != null;
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    /**
     * This is the method that will handle saving the inventory contents, as it is called (or should be called!) anytime the inventory changes.
     * Perfect.
     * Much better than using onUpdate in an Item, as this will also let you change things in your inventory without ever opening a Gui if you want.
     */
    @Override
    public void markDirty() {
        for (int i = 0; i < getSizeInventory(); ++i)
            if (getStackInSlot(i).getCount() == 0) {
                inventory[i] = new ItemStack(Items.AIR);
            }

        assert owner.getTagCompound() != null;
        serialize(owner.getTagCompound());
    }

    @Override
    public boolean isUsableByPlayer(EntityPlayer entityPlayer) {
        return true;
    }

    @Override
    public boolean isItemValidForSlot(int slot, ItemStack itemStack) {
        return true;
    }

    private void deserialize(NBTTagCompound compound) {
        NBTTagList items = compound.getTagList("ItemInventory", Constants.NBT.TAG_COMPOUND);

        int size = compound.getInteger(TAG_SIZE);
        if (size >= 0 && items.tagCount() >= 0) {
            inventory = new ItemStack[size];
            for (int i = 0; i < size; i++) {
                inventory[i] = new ItemStack(Items.AIR);
            }
            for (int i = 0; i < size && i < items.tagCount(); ++i) {
                NBTTagCompound item = items.getCompoundTagAt(i);
                int slot = item.getInteger(TAG_SLOT_INDEX);

                if (slot >= 0 && slot < size) {
                    inventory[slot] = new ItemStack(item);
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
