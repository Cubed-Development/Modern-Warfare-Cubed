package com.paneedah.mwc.weaponlib.inventory;

import com.paneedah.mwc.weaponlib.Contextual;
import com.paneedah.mwc.weaponlib.ItemStorage;
import com.paneedah.mwc.weaponlib.ModContext;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleInventory;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

import static com.paneedah.mwc.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class CustomPlayerInventory extends CompatibleInventory implements Contextual {
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
            inventory[i] = compatibility.stackForEmptySlot();
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
            if (compatibility.getStackSize(stack) > amount) {
                stack = stack.splitStack(amount);
                markDirty();
            } else {
                setInventorySlotContents(slot, compatibility.stackForEmptySlot());
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
        this.inventory[slot] = itemstack != null ? itemstack : compatibility.stackForEmptySlot();

        if (itemstack != null && compatibility.getStackSize(itemstack) > this.getInventoryStackLimit()) {
            if(itemstack.getItem() instanceof ItemStorage) {
//                System.out.println("Setting inventory slot " + slot + " with tag compound "
//                        + itemstack.getTagCompound());
            }
            compatibility.setStackSize(itemstack, getInventoryStackLimit());
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
            if (getStackInSlot(i) != null && compatibility.getStackSize(getStackInSlot(i)) == 0) {
                inventory[i] = compatibility.stackForEmptySlot();
            }
        }
        
        if(modContext != null && owner != null && compatibility.world(owner).isRemote) {
            modContext.getChannel().getChannel().sendToServer(new EntityInventorySyncMessage(owner, 
                    this, true));
//            modContext.getChannel().getChannel().sendToAll(
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
//                        + " with tag compound: " + compatibility.getTagCompound(stackInSlot));
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
                inventory[slot] = compatibility.createItemStack(item);
            } else {
//                System.out.println("Could not find slot " + slot);
            }
        }
    }

    @Override
    public void setContext(ModContext modContext) {
        this.modContext = modContext;
    }
}
