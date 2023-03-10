package com.paneedah.weaponlib.crafting.ammopress;

import com.paneedah.weaponlib.ItemBullet;
import com.paneedah.weaponlib.ItemMagazine;
import com.paneedah.weaponlib.Tags;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.crafting.CraftingGroup;
import com.paneedah.weaponlib.crafting.IModernCrafting;
import com.paneedah.weaponlib.crafting.base.TileEntityStation;
import io.netty.buffer.ByteBuf;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraftforge.common.util.Constants.NBT;
import net.minecraftforge.fml.common.network.ByteBufUtils;

import java.util.LinkedList;

public class TileEntityAmmoPress extends TileEntityStation {
	
	
	
	public static final int BULLET_CRAFT_DURATION = 2;
	public static final int MAGAZINE_CRAFT_DURATION = 100;
	
	public static final int BULLET_DISMANTLE_DURATION = 2;
	
	public static final int BULLETS_CRAFTED_PER_PRESS = 6;
	
	
	public LinkedList<ItemStack> craftStack = new LinkedList<>();
	
	
	
	
	
	

	
	private double currentWheelRotation = 0.0;
	private double prevWheelRotation = 0.0;
	
	public TileEntityAmmoPress() {
		// TODO Auto-generated constructor stub
	}
	
	public double getCurrentWheelRotation() {
		return currentWheelRotation;
	}
	
	public double getPreviousWheelRotation() {
		return prevWheelRotation;
	}
	
	
	public int getCraftingDurationForItem(Item item) {
		if(!(item instanceof IModernCrafting)) return 0;
		return getDismantlingTime((IModernCrafting) item);
		
	}
	
	@Override
	public int getDismantlingTime(IModernCrafting crafting) {
		CraftingGroup group = crafting.getCraftingGroup();
		switch(group) {
			default:
				return MAGAZINE_CRAFT_DURATION;
			case MAGAZINE:
				return MAGAZINE_CRAFT_DURATION;
			case BULLET:
				return BULLET_CRAFT_DURATION;
		}
	}
	
	
	public ItemStack getLatestStackInQueue() {
		if(this.craftStack.isEmpty()) return null;
		ItemStack stack = craftStack.peek();
		if(stack.isEmpty()) {
			
			craftStack.pop();
			return getLatestStackInQueue();
		}

		return stack;
	}
	
	@Override
	public void writeBytesForClientSync(ByteBuf buf) {
		super.writeBytesForClientSync(buf);
		
		buf.writeInt(this.craftStack.size());
		for(ItemStack stack : craftStack) {
			ByteBufUtils.writeItemStack(buf, stack);
			buf.writeInt(stack.getCount());
		}
	}
	
	@Override
	public void readBytesFromClientSync(ByteBuf buf) {
		super.readBytesFromClientSync(buf);
		this.craftStack.clear();
		
		int size = buf.readInt();
		for(int i = 0; i < size; ++i) {
			ItemStack stack = ByteBufUtils.readItemStack(buf);
			stack.setCount(buf.readInt());
			this.craftStack.offer(stack);
		}
		
		
		
	}
	
	public boolean hasStack() {
		return !this.craftStack.isEmpty() && getLatestStackInQueue() != null;
	}
	
	public void addStack(ItemStack stack) {
		this.craftStack.offer(stack);
	}
	
	public LinkedList<ItemStack> getCraftingQueue() {
		return this.craftStack;
	}
	
	
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound) {
		super.writeToNBT(compound);

		
		NBTTagList stackNBTCompound = new NBTTagList();
		for(int i = 0; i < this.craftStack.size(); ++i) {
			ItemStack stack = this.craftStack.get(i);
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
		if(compound.hasKey("craftingStack")) {
			NBTTagList list = compound.getTagList("craftingStack", NBT.TAG_COMPOUND);
			for(int i = 0; i < list.tagCount(); ++i) {
				this.craftStack.offer(new ItemStack(list.getCompoundTagAt(i)));
			}
		}
		
		
		

	}

	
	
	@Override
	public void update() {
		super.update();
		
		
		//System.out.println(getCraftingQueue());
	
	
		if(hasStack()) {
			
		//System.out.println("yo " + getCraftingQueue());
			
			//if(1+1 == 2) return;
			boolean canCraftNextItem = true;
			for(CraftingEntry entry : ((IModernCrafting) getLatestStackInQueue().getItem()).getModernRecipe()) {
				if(!inventoryContainsEnoughItems(entry.getItem(), entry.getCount(), 22, 49)) {
				
					canCraftNextItem = false;
					break;
				}
			}
	
			if(craftingDuration == -1 && canCraftNextItem) {
				craftingDuration = getCraftingDurationForItem(getLatestStackInQueue().getItem());
			}
			
			
			
	
			if(craftingDuration != -1) craftingTimer++;
			if(craftingTimer > craftingDuration) {
				
				
				craftingTimer = -1;
				prevCraftingTimer = -1;
				craftingDuration = -1;
				ItemStack stack = getLatestStackInQueue();
				
				IModernCrafting craftingRecipe = (IModernCrafting) stack.getItem();
				
				for(CraftingEntry ingredient : craftingRecipe.getModernRecipe()) {
					consumeFromInventory(ingredient.getItem(), ingredient.getCount(), 22, 49);
				}
				
				ItemStack splitOff = stack.splitStack(1);
				
				// For every bullet crafted, output BULLETS_CRAFTED_PER_PRESS.
				if(splitOff.getItem() instanceof ItemBullet) {
					splitOff.setCount(splitOff.getCount() * BULLETS_CRAFTED_PER_PRESS);
				}
				
				// Make magazines empty
				if(splitOff.getItem() instanceof ItemMagazine) {
					Tags.setAmmo(splitOff, 0);
				}
				
				
				addStackToInventoryRange(splitOff, 0, 8);
				sendUpdate();
			}
			
			
		}
		
		
		
	
		if(this.world.isRemote && hasStack()) {
			prevWheelRotation = currentWheelRotation;
			currentWheelRotation += Math.PI/32;
			
			if(currentWheelRotation >= 2*Math.PI) {
				prevWheelRotation = 0;
				currentWheelRotation = 0;
			}
		} else if(!hasStack() && this.world.isRemote) {
			// Velocity verlet integrator
			double delta = (currentWheelRotation - prevWheelRotation) * 0.05;
			prevWheelRotation = currentWheelRotation;
			currentWheelRotation += delta;
		}
		
	}

}
