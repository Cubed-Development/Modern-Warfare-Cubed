package com.paneedah.weaponlib.crafting.base;

import com.paneedah.mwc.bases.ManufacturingItemBase;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.crafting.IModernCrafting;
import io.netty.buffer.ByteBuf;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraftforge.items.ItemStackHandler;

import java.util.LinkedList;

/**
 * Parent class for the workbench and ammo press tile entities.
 * 
 * Features:
 * 1. 50 slot inventory (contents of which are described above the variable)
 * 2. Writing/reading inventory data to/from NBT
 * 3. Dismantling up to four items at once
 * 4. A crafting timer (despite differences in crafting b/w ammo presses & workbenches, the timer IS universal)
 * 5. Methods allowing stations to work nicely with hoppers!
 * 
 * @author Homer Riva-Cambrin
 * @version September 23rd, 2022
 */
public class TileEntityStation extends TileEntity implements ITickable, ISidedInventory {
	
	/*
	 * --------------------------|
	 * Contents:                 |
	 * ------------------------- |
	 * 9 for crafting output     |
	 * 4 for dismantling slots   |
	 * 10 dismantling inventory  |
	 * 27 for main inventory (+) |
	 * ------------------------- |
	 * 50 slots total
	 * 
	 */
	public ItemStackHandler mainInventory = new ItemStackHandler(50);

	// T
	
	// For client interp purposes
	public int[] previousDismantleStatus = new int[] { -1, -1, -1, -1 };
	public int[] dismantleStatus = new int[] { -1, -1, -1, -1 };
	public int[] dismantleDuration = new int[] { -1, -1, -1, -1 };
	
	public int prevCraftingTimer = -1;
	public int craftingTimer = -1;
	public int craftingDuration = -1;
	
	public boolean pushInventoryRefresh = false;

	
	
	private boolean shouldUpdate = false;
	
	private EnumFacing facing = null;
	
	public TileEntityStation() {
		
	}
	
	public void sendUpdate() {
		this.shouldUpdate = true;
	}
	
	public double getProgress() {
		if (craftingTimer == -1 || craftingDuration == -1)
			return 0.0;
		return craftingTimer / (double) craftingDuration;
	}
	
	public void syncChanges() {
		world.markBlockRangeForRenderUpdate(pos, pos);
		world.notifyBlockUpdate(pos, getState(), getState(), 3);
		world.scheduleBlockUpdate(pos, getBlockType(), 0, 0);
		markDirty();
	}
	

	@Override
	public NBTTagCompound getUpdateTag() {
		//System.out.println("GOT UPDATE TAG");
		return this.writeToNBT(new NBTTagCompound());
	}
	
	@Override
	public SPacketUpdateTileEntity getUpdatePacket() {
		return new SPacketUpdateTileEntity(pos, 3, getUpdateTag());
	}
	
	public IBlockState getState() {
		return world.getBlockState(pos);
	}
	
	@Override
	public void onDataPacket(NetworkManager net, SPacketUpdateTileEntity pkt) {
		super.onDataPacket(net, pkt);
	}
	
	
	
	public EnumFacing getFacing() {
		if(facing == null) {
			facing = getWorld().getBlockState(getPos()).getValue(BlockStation.FACING);
		}
		
		
		return facing;
	}
	

	public int getDismantlingTime(IModernCrafting crafting) {
		return 0;
	}
	
	
	public void setDismantling(int[] instant, int[] lengths) {
		this.previousDismantleStatus = instant.clone();
		this.dismantleStatus = instant;
		this.dismantleDuration = lengths;
	}


	@Override
	public void update() {
		
		

		
		
		
		prevCraftingTimer = craftingTimer;
		
		for (int i = 0; i < dismantleStatus.length; ++i) {
			
			
			if (dismantleStatus[i] == -1 || dismantleDuration[i] == -1)
				continue;
			previousDismantleStatus[i] = dismantleStatus[i];
			dismantleStatus[i]++;
			
			
			

			if (mainInventory.getStackInSlot(i + 9).isEmpty()) {
				previousDismantleStatus[i] = -1;
				dismantleStatus[i] = -1;
				dismantleDuration[i] = -1;
			}

			
			if (dismantleStatus[i] > dismantleDuration[i]) {

				
				
				ItemStack stackToDismantle = mainInventory.getStackInSlot(i + 9);
				if (stackToDismantle.getItem() instanceof IModernCrafting) {
					CraftingEntry[] modernRecipe = ((IModernCrafting) stackToDismantle.getItem()).getModernRecipe();
					if(!world.isRemote) stackToDismantle.shrink(1);
					if((!world.isRemote && stackToDismantle.getCount() != 0) || (world.isRemote && stackToDismantle.getCount() >= 1)) {
						previousDismantleStatus[i] = 0;
						dismantleStatus[i] = 0;
					} else {
						previousDismantleStatus[i] = -1;
						dismantleStatus[i] = -1;
						dismantleDuration[i] = -1;
					}

					if(!world.isRemote) {
						for (CraftingEntry stack : modernRecipe) {
							ItemStack itemStack = new ItemStack(stack.getItem());
							if (stack.getItem() instanceof ManufacturingItemBase) {
								itemStack.setCount((int) Math.round(
										stack.getCount() * ((ManufacturingItemBase) stack.getItem()).getRecoveryChance()));
							}
							addStackToInventoryRange(itemStack, 13, 22);
						}
						sendUpdate();
					}
					
				}
			}

			
		}
		
	//	System.out.println(this.world.isRemote + " | " + this.mainInventory.serializeNBT());
		
		//if(!world.isRemote) System.out.println(mainInventory.serializeNBT());
		
		if(shouldUpdate) {
			syncChanges();
			shouldUpdate = false;
		}
		
		//if(!world.isRemote) {
			//System.out.println("yo");
			//mainInventory.setStackInSlot(24, new ItemStack(Items.GOLD_INGOT, 24));
			
		//}
		//System.out.println(mainInventory.serializeNBT());
		
	}
	
	
	public boolean inventoryContainsEnoughItems(Item item, int quantity, int start, int end) {
		int count = 0;
		for(int i = start; i <= end; ++i) {
			ItemStack slotStack = mainInventory.getStackInSlot(i);
			if(slotStack.getItem() == item) {
				count += slotStack.getCount();
				if(count >= quantity) return true;
			}
		}
		
		
		
		return count >= quantity;
	}
	
	public boolean consumeFromInventory(Item item, int quantity, int start, int end) {
		LinkedList<ItemStack> stackQueue = new LinkedList<>();
		
		int consumedSimulated = 0;
		for(int i = start; i <= end; ++i) {
			ItemStack slotStack = mainInventory.getStackInSlot(i);
			
			if(slotStack.getItem() == item) {
				stackQueue.add(slotStack);
				consumedSimulated += slotStack.getCount();
				if(consumedSimulated >= quantity) {
					break;
				}
			}
			
		}
		
		if(consumedSimulated >= quantity) {
			
			for(ItemStack s : stackQueue) {
				int toConsume = Math.min(quantity, s.getCount());
				s.shrink(toConsume);
				quantity -= toConsume;
				if(quantity == 0) {
					return true;
				}
			}
			
		} else {
			// Failed
			return false;
		}
		return tileEntityInvalid;
	}
	
	public void addStackToInventoryRange(ItemStack stack, int start, int end) {

		for (int i = start; i <= end; ++i) {
			if (ItemStack.areItemsEqual(mainInventory.getStackInSlot(i), stack)) {
				ItemStack inInventory = mainInventory.getStackInSlot(i);
				if (inInventory.getCount() + stack.getCount() <= inInventory.getMaxStackSize()) {
					inInventory.grow(stack.getCount());
					stack.shrink(stack.getCount());
				} else if (inInventory.getCount() >= inInventory.getMaxStackSize()) {
					continue;
				} else if (inInventory.getCount() + inInventory.getCount() >= inInventory.getMaxStackSize()) {
					int difference = inInventory.getMaxStackSize() - inInventory.getCount();
					inInventory.grow(difference);
					stack.shrink(difference);
					continue;
				}
			}
		}

		if (stack.getCount() > 0) {
			for (int i = start; i <= end; ++i) {
				if (mainInventory.getStackInSlot(i).isEmpty()) {
					mainInventory.setStackInSlot(i, stack);
					break;
				}
			}
		}
	}
	
	
	/**
	 * Happens on the client
	 * 
	 * @param buf
	 */
	public void readBytesFromClientSync(ByteBuf buf) {
		this.craftingTimer = buf.readInt();
		this.craftingDuration = buf.readInt();
		for(int i = 0; i < dismantleStatus.length; ++i) {
			int time = buf.readInt();
			previousDismantleStatus[i] = time;
			dismantleStatus[i] = time;
		}
		for(int i = 0; i < dismantleDuration.length; ++i) dismantleDuration[i] = buf.readInt();
		
		/*
		int inventorySize = buf.readInt();
		for(int i = 0; i < inventorySize; ++i) this.mainInventory.setStackInSlot(i, ByteBufUtils.readItemStack(buf));
		
		System.out.println("ON CLIENT: " + mainInventory.serializeNBT().toString());
		*/
		
	}

	/**
	 * Happens server-side
	 * 
	 * @param buf
	 */
	public void writeBytesForClientSync(ByteBuf buf) {
		buf.writeInt(this.craftingTimer);
		buf.writeInt(this.craftingDuration);
		for(int i = 0; i < dismantleStatus.length; ++i) buf.writeInt(dismantleStatus[i]);
		for(int i = 0; i < dismantleDuration.length; ++i) buf.writeInt(dismantleDuration[i]);
		
		// Write inventory
		/*
		buf.writeInt(mainInventory.getSlots());
		for(int i = 0; i < mainInventory.getSlots(); ++i) {
			ByteBufUtils.writeItemStack(buf, mainInventory.getStackInSlot(i));
		}*/
		
		
	}
	
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound) {
		super.writeToNBT(compound);
		compound.setTag("mainInventory", mainInventory.serializeNBT());
		compound.setInteger("craftingTimer", craftingTimer);
		compound.setInteger("craftingDuration", craftingDuration);
		return compound;
	}
	
	@Override
	public void readFromNBT(NBTTagCompound compound) {
		super.readFromNBT(compound);
		if (compound.hasKey("mainInventory"))
			this.mainInventory.deserializeNBT((NBTTagCompound) compound.getTag("mainInventory"));
		if(compound.hasKey("craftingTimer") && compound.hasKey("craftingDuration")) {
			this.craftingTimer = compound.getInteger("craftingTimer");
			this.craftingDuration = compound.getInteger("craftingDuration");
		}
		
	}
	
	/*
	 *  Sided inventory
	 * 
	 */

	@Override
	public int getSizeInventory() {
		return mainInventory.getSlots();
	}

	@Override
	public boolean isEmpty() {
		return true;
	}

	@Override
	public ItemStack getStackInSlot(int index) {
		return mainInventory.getStackInSlot(index);
	}

	@Override
	public ItemStack decrStackSize(int index, int count) {
		ItemStack s = mainInventory.getStackInSlot(index);
		s.shrink(count);
		return s;
	}

	@Override
	public ItemStack removeStackFromSlot(int index) {
		return mainInventory.extractItem(index, mainInventory.getStackInSlot(index).getCount(), false);
	}

	@Override
	public void setInventorySlotContents(int index, ItemStack stack) {
		mainInventory.setStackInSlot(index, stack);
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	public boolean isUsableByPlayer(EntityPlayer player) {
		return false;
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
	public boolean isItemValidForSlot(int index, ItemStack stack) {
		return true;
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

	@Override
	public String getName() {
		return null;
	}

	@Override
	public boolean hasCustomName() {
		return false;
	}

	@Override
	public int[] getSlotsForFace(EnumFacing side) {
		if(side == EnumFacing.DOWN) {
			return new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		} else {
			return new int[] { 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49 };
		}
 		
	}

	@Override
	public boolean canInsertItem(int index, ItemStack itemStackIn, EnumFacing direction) {
		return true;
	}

	@Override
	public boolean canExtractItem(int index, ItemStack stack, EnumFacing direction) {
		return true;
	}
	
	
	

}
