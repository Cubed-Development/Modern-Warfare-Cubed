package com.paneedah.weaponlib.crafting.ammopress;

import com.paneedah.weaponlib.ItemBullet;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.crafting.CraftingGroup;
import com.paneedah.weaponlib.crafting.IModernCraftingRecipe;
import com.paneedah.weaponlib.crafting.base.TileEntityStation;
import io.netty.buffer.ByteBuf;
import lombok.Getter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraftforge.common.util.Constants.NBT;
import net.minecraftforge.fml.common.network.ByteBufUtils;

import java.util.LinkedList;
import java.util.Objects;

public class TileEntityAmmoPress extends TileEntityStation {

    public static final int BULLET_CRAFT_DURATION = 2;
    public static final int MAGAZINE_CRAFT_DURATION = 100;
    //public static final int BULLET_DISMANTLE_DURATION = 2;
    public static final int BULLETS_CRAFTED_PER_PRESS = 6;

    private boolean crafting;

    public LinkedList<ItemStack> craftStack = new LinkedList<>();

    @Getter
    private double currentWheelRotation = 0.0;
    private double prevWheelRotation = 0.0;

    public TileEntityAmmoPress() {}

    public double getPreviousWheelRotation() {
        return prevWheelRotation;
    }

    public int getCraftingDurationForItem(Item item) {
        if (!(item instanceof IModernCraftingRecipe)) {
            return 0;
        }
        return getDismantlingTime((IModernCraftingRecipe) item);
    }

    @Override
    public int getDismantlingTime(IModernCraftingRecipe crafting) {
        CraftingGroup group = crafting.getCraftingGroup();
        if (Objects.requireNonNull(group) == CraftingGroup.BULLET) {
            return BULLET_CRAFT_DURATION;
        }

        return MAGAZINE_CRAFT_DURATION;
    }


    public ItemStack getLatestStackInQueue() {
        if (craftStack.isEmpty()) {
            return null;
        }
        ItemStack stack = craftStack.peek();
        if (stack.isEmpty()) {
            craftStack.pop();
            return getLatestStackInQueue();
        }

        return stack;
    }

    @Override
    public void writeBytesForClientSync(ByteBuf buf) {
        super.writeBytesForClientSync(buf);

        buf.writeInt(craftStack.size());
        for (ItemStack stack : craftStack) {
            ByteBufUtils.writeItemStack(buf, stack);
            buf.writeInt(stack.getCount());
        }
    }

    @Override
    public void readBytesFromClientSync(ByteBuf buf) {
        super.readBytesFromClientSync(buf);
        craftStack.clear();

        int size = buf.readInt();
        for (int i = 0; i < size; ++i) {
            ItemStack stack = ByteBufUtils.readItemStack(buf);
            stack.setCount(buf.readInt());
            craftStack.offer(stack);
        }


    }

    public boolean hasStack() {
        return !craftStack.isEmpty() && getLatestStackInQueue() != null;
    }

    public void addStack(ItemStack stack) {
        craftStack.offer(stack);
    }

    public LinkedList<ItemStack> getCraftingQueue() {
        return craftStack;
    }


    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);

        NBTTagList stackNBTCompound = new NBTTagList();
        for (ItemStack stack : craftStack) {
            NBTTagCompound element = new NBTTagCompound();
            stack.writeToNBT(element);
            stackNBTCompound.appendTag(element);
        }

        compound.setTag("craftingStack", stackNBTCompound);

        return compound;
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
        if (compound.hasKey("craftingStack")) {
            NBTTagList list = compound.getTagList("craftingStack", NBT.TAG_COMPOUND);
            for (int i = 0; i < list.tagCount(); ++i)
                craftStack.offer(new ItemStack(list.getCompoundTagAt(i)));
        }
    }

    @Override
    public void update() {
        super.update();

        if (hasStack()) {
            boolean canCraftNextItem = true;

            for (CraftingEntry entry : ((IModernCraftingRecipe) getLatestStackInQueue().getItem()).getModernRecipe()) {
                if (inventoryContainsEnoughItems(entry.getIngredient(), entry.getCount(), 22, 49)) {
                    continue;
                }

                canCraftNextItem = false;
                break;
            }

            if (craftingDuration == -1 && canCraftNextItem) {
                craftingDuration = getCraftingDurationForItem(getLatestStackInQueue().getItem());
            }

            if (craftingDuration != -1) {
                craftingTimer++;
                crafting = true;
            }

            if (craftingTimer > craftingDuration) {
                craftingTimer = -1;
                prevCraftingTimer = -1;
                craftingDuration = -1;
                crafting = false;
                ItemStack stack = getLatestStackInQueue();

                IModernCraftingRecipe craftingRecipe = (IModernCraftingRecipe) stack.getItem();
                for (CraftingEntry ingredient : craftingRecipe.getModernRecipe())
                    consumeFromInventory(ingredient.getIngredient(), ingredient.getCount(), 22, 49);

                ItemStack splitOff = stack.splitStack(1);

                // For every bullet crafted, output BULLETS_CRAFTED_PER_PRESS.
                if (splitOff.getItem() instanceof ItemBullet) {
                    splitOff.setCount(splitOff.getCount() * BULLETS_CRAFTED_PER_PRESS);
                }

                addStackToInventoryRange(splitOff, 0, 8);
                sendUpdate();
            }
        }

        if (world.isRemote && hasStack() && crafting) {
            prevWheelRotation = currentWheelRotation;
            currentWheelRotation += Math.PI / 32;

            if (currentWheelRotation >= 2 * Math.PI) {
                prevWheelRotation = 0;
                currentWheelRotation = 0;
            }

        } else if ((!hasStack() || !crafting) && world.isRemote) {
            // Velocity verlet integrator
            double delta = (currentWheelRotation - prevWheelRotation) * 0.05;
            prevWheelRotation = currentWheelRotation;
            currentWheelRotation += delta;
        }
    }
}
