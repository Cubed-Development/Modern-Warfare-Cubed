package com.paneedah.weaponlib.network.packets;

import akka.japi.Pair;
import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.crafting.CraftingGroup;
import com.paneedah.weaponlib.crafting.CraftingRegistry;
import com.paneedah.weaponlib.crafting.IModernCrafting;
import com.paneedah.weaponlib.crafting.ammopress.TileEntityAmmoPress;
import com.paneedah.weaponlib.crafting.base.TileEntityStation;
import com.paneedah.weaponlib.crafting.workbench.TileEntityWorkbench;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.NetworkRegistry.TargetPoint;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.oredict.OreDictionary;

import java.util.ArrayList;
import java.util.HashMap;

public class StationPacket implements IMessage {

	
	
	public static final int CRAFT = 1;
	public static final int DISMANTLE = 2;
	public static final int MOVE_OUTPUT = 3;
	public static final int UPDATE = 4;
	public static final int POP_FROM_QUEUE = 5;
	
	public int opcode;
	public BlockPos teLocation;
	
	
	public int craftingTimer;
	public int craftingDuration;
	
	public CraftingGroup craftingGroup;
	public String craftingName = "";
	
	public int playerID;
	public int slotToMove;

	public int quantity = -1;
	
	public StationPacket() {}
	
	
	public StationPacket(int type, BlockPos location, String nameToCraft, CraftingGroup group, int quantity) {
		this.opcode = type;
		this.teLocation = location;
		
		this.craftingName = nameToCraft;
		this.craftingGroup = group;
		
		this.quantity = quantity;
	}
	
	public StationPacket(int type, BlockPos location, int craftingTimer, int craftingDuration, CraftingGroup group, String nameToCraft) {
		
		//System.out.printf("Initializing SP with Opcode %d | Crafting Group=%s | Name to Craft: %s\n", type, group.toString(), nameToCraft);
		
		this.opcode = type;
		this.teLocation = location;
		
		this.craftingTimer = craftingTimer;
		this.craftingDuration = craftingDuration;
		
		this.craftingGroup = group;
		this.craftingName = nameToCraft;
	}
	
	public StationPacket(int type, BlockPos location, int playerID, int slotToMove)  {
		this.opcode = type;
		this.teLocation = location;
		this.playerID = playerID;
		this.slotToMove = slotToMove;
	}
	

	public void fromBytes(ByteBuf buf) {
		this.opcode = buf.readInt();
		this.teLocation = BlockPos.fromLong(buf.readLong());
		if(this.opcode == CRAFT) {
			this.quantity = buf.readInt();
			if(quantity == -1) {
				this.craftingTimer = buf.readInt();
				this.craftingDuration = buf.readInt();	
			}
			this.craftingGroup = CraftingGroup.getValue(buf.readInt());
			this.craftingName = ByteBufUtils.readUTF8String(buf);
			
		} else if(this.opcode == MOVE_OUTPUT || this.opcode == POP_FROM_QUEUE) {
			this.playerID = buf.readInt();
			this.slotToMove = buf.readInt();
		} else if(this.opcode == DISMANTLE) {
			this.craftingDuration = buf.readInt();
		}
		
		
	}

	public void toBytes(ByteBuf buf) {
		buf.writeInt(this.opcode);
		buf.writeLong(this.teLocation.toLong());
		if(this.opcode == CRAFT) {
			buf.writeInt(this.quantity);
			if(this.quantity == -1) {
				buf.writeInt(this.craftingTimer);
				buf.writeInt(this.craftingDuration);
			}
			buf.writeInt(this.craftingGroup.getID());
			ByteBufUtils.writeUTF8String(buf, this.craftingName);
			 
		} else if(this.opcode == MOVE_OUTPUT || this.opcode == POP_FROM_QUEUE) {
			buf.writeInt(this.playerID);
			buf.writeInt(this.slotToMove);
		} else if(this.opcode == DISMANTLE) {
			buf.writeInt(this.craftingDuration);
		}
		
	}

	public static class WorkbenchPacketHandler implements IMessageHandler<StationPacket, IMessage> {
		
		private ModContext modContext;

		public WorkbenchPacketHandler() {}

		public WorkbenchPacketHandler(ModContext context) {
			this.modContext = context;
		}

		@Override
		public IMessage onMessage(StationPacket message, MessageContext messageContext) {
			if(messageContext.side == Side.SERVER) {
				messageContext.getServerHandler().player.getServer().addScheduledTask(() -> {
	            	World world = messageContext.getServerHandler().player.world;

	            	TileEntity tileEntity = world.getTileEntity(message.teLocation);
	            	if(tileEntity instanceof TileEntityStation) {
	            		TileEntityStation station = (TileEntityStation) tileEntity;

	            		if(message.opcode == CRAFT) {
	            			if(tileEntity instanceof TileEntityAmmoPress) {
	            				// Since it's based on a queue, you can add whatever you'd like and it
	            				// will merely refuse to craft it until you have the resources avaliable.
	            				TileEntityAmmoPress press = (TileEntityAmmoPress) station;
		            			Item item = CraftingRegistry.getModernCrafting(message.craftingGroup, message.craftingName).getItem();
		            			ItemStack newStack = new ItemStack(item, message.quantity);

		            			if(press.hasStack()) {
		            				ItemStack topQueue = press.getCraftingQueue().getLast();
		            				if(ItemStack.areItemsEqualIgnoreDurability(topQueue, newStack))
		            					topQueue.grow(message.quantity);
									else
		            					press.addStack(newStack);
		            			} else
		            				press.addStack(newStack);

		            			modContext.getChannel().sendToAllAround(new StationClientPacket(station.getWorld(), message.teLocation), new TargetPoint(0, message.teLocation.getX(), message.teLocation.getY(), message.teLocation.getZ(), 20));

		            			return;
	            			}
	            			CraftingEntry[] modernRecipe = CraftingRegistry.getModernCrafting(message.craftingGroup, message.craftingName).getModernRecipe();
		            		if(modernRecipe == null)
								return;

		            		// Add all items to an item list to verify that they exist.
		            		HashMap<Item, ItemStack> itemList = new HashMap<>(27, 0.7f);
		            		for(int i = 23; i < station.mainInventory.getSlots(); ++i)
		            			itemList.put(station.mainInventory.getStackInSlot(i).getItem(), station.mainInventory.getStackInSlot(i));

		            		ArrayList<Pair<Item, Integer>> toConsume = new ArrayList<>();

		            		// Verify
		            		for(CraftingEntry stack : modernRecipe) {
		            			if(!stack.isOreDictionary()) {
		            				// Does it even have that item? / Does it have enough of that item?
			            			if(!itemList.containsKey(stack.getItem()) || stack.getCount() > itemList.get(stack.getItem()).getCount())
			            				return;

			            			toConsume.add(new Pair<Item, Integer>(stack.getItem(), stack.getCount()));
		            			} else {
		            				// Stack is an OreDictionary term
		            				boolean hasAny = false;
		            				NonNullList<ItemStack> list = OreDictionary.getOres(stack.getOreDictionaryEntry());
		            				for(ItemStack toTest : list) {
		            					if(itemList.containsKey(toTest.getItem()) && stack.getCount() <= itemList.get(toTest.getItem()).getCount()) {
		            						hasAny = true;
		            						toConsume.add(new Pair<Item, Integer>(toTest.getItem(), stack.getCount()));
		            						break;
		            					}
		            				}

		            				if(!hasAny) return;
		            			}
		            		}

		            		/*
		            		// Consume materials
		            		for(CraftingEntry stack : modernRecipe) {
		            			if(!stack.isOreDictionary()) {
		            				itemList.get(stack.getItem()).shrink(stack.getCount());
		            			} else {

		            				List<ItemStack> list = OreDictionary.getOres(stack.getOreDictionaryEntry());
		            				for(ItemStack test : list) {

		            				}
		            				itemList.get(stack.getItem()).shrink(stack.getCount());
		            			}

		            		}*/

		            		for(Pair<Item, Integer> i : toConsume)
		            			itemList.get(i.first()).shrink(i.second());

		            		if(station instanceof TileEntityWorkbench) {
		            			TileEntityWorkbench workbench = (TileEntityWorkbench) station;
		            			workbench.craftingTimer = message.craftingTimer;
		            			workbench.craftingDuration = message.craftingDuration;
			            		workbench.craftingTarget = CraftingRegistry.getModernCrafting(message.craftingGroup, message.craftingName);
		            		}

		            		station.sendUpdate();
		            		//station.markDirty();

		            		modContext.getChannel().sendToAllAround(new StationClientPacket(station.getWorld(), message.teLocation), new TargetPoint(0, message.teLocation.getX(), message.teLocation.getY(), message.teLocation.getZ(), 20));

	            		} else if(message.opcode == DISMANTLE) {
	            			for(int i = 9; i < 13; ++i) {
	            				if(station.mainInventory.getStackInSlot(i).isEmpty())
									continue;

								ItemStack stack = station.mainInventory.getStackInSlot(i);
								if(stack.getItem() instanceof IModernCrafting && ((IModernCrafting) stack.getItem()).getModernRecipe() != null && (station.dismantleStatus[i - 9] == -1 || station.dismantleStatus[i - 9] > station.dismantleDuration[i - 9])) {
									station.dismantleStatus[i - 9] = 0;
									station.dismantleDuration[i - 9] = ((TileEntityStation) tileEntity).getDismantlingTime(((IModernCrafting) stack.getItem()));
								}
	            			}

	            			modContext.getChannel().sendToAllAround(new StationClientPacket(station.getWorld(), message.teLocation), new TargetPoint(0, message.teLocation.getX(), message.teLocation.getY(), message.teLocation.getZ(), 25));
	            		} else if(message.opcode == MOVE_OUTPUT) {
	            			((EntityPlayer) world.getEntityByID(message.playerID)).addItemStackToInventory(station.mainInventory.getStackInSlot(message.slotToMove));
	            		} else if(message.opcode == POP_FROM_QUEUE) {
	            			if(!(tileEntity instanceof TileEntityAmmoPress)) return;

	            			TileEntityAmmoPress teAmmoPress = (TileEntityAmmoPress) tileEntity;

	            			if(teAmmoPress.hasStack() && teAmmoPress.getCraftingQueue().size() > message.slotToMove)
	            				teAmmoPress.getCraftingQueue().remove(message.slotToMove);

	            			modContext.getChannel().sendToAllAround(new StationClientPacket(station.getWorld(), message.teLocation), new TargetPoint(0, message.teLocation.getX(), message.teLocation.getY(), message.teLocation.getZ(), 25));
	            		}
	            	}
				});
			}
			
			return null;
		}
	}
}
