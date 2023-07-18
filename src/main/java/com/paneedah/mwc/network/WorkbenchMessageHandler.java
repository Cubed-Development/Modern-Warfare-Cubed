package com.paneedah.mwc.network;

import akka.japi.Pair;
import com.paneedah.mwc.network.messages.WorkbenchMessage;
import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.crafting.CraftingRegistry;
import com.paneedah.weaponlib.crafting.IModernCrafting;
import com.paneedah.weaponlib.crafting.ammopress.TileEntityAmmoPress;
import com.paneedah.weaponlib.crafting.base.TileEntityStation;
import com.paneedah.weaponlib.crafting.workbench.TileEntityWorkbench;
import com.paneedah.weaponlib.network.packets.StationClientPacket;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.NetworkRegistry.TargetPoint;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.oredict.OreDictionary;

import java.util.ArrayList;
import java.util.HashMap;

// Todo: This is a mess.
@NoArgsConstructor
@AllArgsConstructor
public final class WorkbenchMessageHandler implements IMessageHandler<WorkbenchMessage, IMessage> {

    private ModContext modContext;

    @Override
    public IMessage onMessage(WorkbenchMessage workbenchMessage, MessageContext messageContext) {
        if (messageContext.side.isServer()) {
            final World world = messageContext.getServerHandler().player.world;

            final TileEntity tileEntity = world.getTileEntity(workbenchMessage.teLocation);
            if (tileEntity instanceof TileEntityStation) {
                final TileEntityStation station = (TileEntityStation) tileEntity;

                if (workbenchMessage.opcode == WorkbenchMessage.CRAFT) {
                    if (tileEntity instanceof TileEntityAmmoPress) {
                        // Since it's based on a queue, you can add whatever you'd like and it
                        // will merely refuse to craft it until you have the resources avaliable.
                        final TileEntityAmmoPress press = (TileEntityAmmoPress) station;
                        final Item item = CraftingRegistry.getModernCrafting(workbenchMessage.craftingGroup, workbenchMessage.craftingName).getItem();
                        final ItemStack newStack = new ItemStack(item, workbenchMessage.quantity);

                        if (press.hasStack()) {
                            final ItemStack topQueue = press.getCraftingQueue().getLast();
                            if (ItemStack.areItemsEqualIgnoreDurability(topQueue, newStack))
                                topQueue.grow(workbenchMessage.quantity);
                            else
                                press.addStack(newStack);
                        } else
                            press.addStack(newStack);

                        modContext.getChannel().sendToAllAround(new StationClientPacket(station.getWorld(), workbenchMessage.teLocation), new TargetPoint(0, workbenchMessage.teLocation.getX(), workbenchMessage.teLocation.getY(), workbenchMessage.teLocation.getZ(), 20));

                        return workbenchMessage;
                    }
                    final CraftingEntry[] modernRecipe = CraftingRegistry.getModernCrafting(workbenchMessage.craftingGroup, workbenchMessage.craftingName).getModernRecipe();
                    if (modernRecipe == null)
                        return workbenchMessage;

                    // Add all items to an item list to verify that they exist.
                    final HashMap<Item, ItemStack> itemList = new HashMap<>(27, 0.7f);
                    for (int i = 23; i < station.mainInventory.getSlots(); ++i)
                        itemList.put(station.mainInventory.getStackInSlot(i).getItem(), station.mainInventory.getStackInSlot(i));

                    final ArrayList<Pair<Item, Integer>> toConsume = new ArrayList<>();

                    // Verify
                    for (CraftingEntry stack : modernRecipe) {
                        if (!stack.isOreDictionary()) {
                            // Does it even have that item? / Does it have enough of that item?
                            if (!itemList.containsKey(stack.getItem()) || stack.getCount() > itemList.get(stack.getItem()).getCount())
                                return workbenchMessage;

                            toConsume.add(new Pair<>(stack.getItem(), stack.getCount()));
                        } else {
                            // Stack is an OreDictionary term
                            boolean hasAny = false;
                            final NonNullList<ItemStack> list = OreDictionary.getOres(stack.getOreDictionaryEntry());
                            for (ItemStack toTest : list) {
                                if (itemList.containsKey(toTest.getItem()) && stack.getCount() <= itemList.get(toTest.getItem()).getCount()) {
                                    hasAny = true;
                                    toConsume.add(new Pair<Item, Integer>(toTest.getItem(), stack.getCount()));
                                    break;
                                }
                            }

                            if (!hasAny)
                                return workbenchMessage;
                        }
                    }

                    for (Pair<Item, Integer> i : toConsume)
                        itemList.get(i.first()).shrink(i.second());

                    if (station instanceof TileEntityWorkbench) {
                        final TileEntityWorkbench workbench = (TileEntityWorkbench) station;
                        workbench.craftingTimer = workbenchMessage.craftingTimer;
                        workbench.craftingDuration = workbenchMessage.craftingDuration;
                        workbench.craftingTarget = CraftingRegistry.getModernCrafting(workbenchMessage.craftingGroup, workbenchMessage.craftingName);
                    }

                    station.sendUpdate();

                    modContext.getChannel().sendToAllAround(new StationClientPacket(station.getWorld(), workbenchMessage.teLocation), new TargetPoint(0, workbenchMessage.teLocation.getX(), workbenchMessage.teLocation.getY(), workbenchMessage.teLocation.getZ(), 20));
                } else if (workbenchMessage.opcode == WorkbenchMessage.DISMANTLE) {
                    for (int i = 9; i < 13; ++i) {
                        if (station.mainInventory.getStackInSlot(i).isEmpty())
                            continue;

                        final ItemStack stack = station.mainInventory.getStackInSlot(i);
                        if (stack.getItem() instanceof IModernCrafting && ((IModernCrafting) stack.getItem()).getModernRecipe() != null && (station.dismantleStatus[i - 9] == -1 || station.dismantleStatus[i - 9] > station.dismantleDuration[i - 9])) {
                            station.dismantleStatus[i - 9] = 0;
                            station.dismantleDuration[i - 9] = ((TileEntityStation) tileEntity).getDismantlingTime(((IModernCrafting) stack.getItem()));
                        }
                    }

                    modContext.getChannel().sendToAllAround(new StationClientPacket(station.getWorld(), workbenchMessage.teLocation), new TargetPoint(0, workbenchMessage.teLocation.getX(), workbenchMessage.teLocation.getY(), workbenchMessage.teLocation.getZ(), 25));
                } else if (workbenchMessage.opcode == WorkbenchMessage.MOVE_OUTPUT) {
                    ((EntityPlayer) world.getEntityByID(workbenchMessage.playerID)).addItemStackToInventory(station.mainInventory.getStackInSlot(workbenchMessage.slotToMove));
                } else if (workbenchMessage.opcode == WorkbenchMessage.POP_FROM_QUEUE) {
                    if (!(tileEntity instanceof TileEntityAmmoPress)) return workbenchMessage;

                    final TileEntityAmmoPress teAmmoPress = (TileEntityAmmoPress) tileEntity;

                    if (teAmmoPress.hasStack() && teAmmoPress.getCraftingQueue().size() > workbenchMessage.slotToMove)
                        teAmmoPress.getCraftingQueue().remove(workbenchMessage.slotToMove);

                    modContext.getChannel().sendToAllAround(new StationClientPacket(station.getWorld(), workbenchMessage.teLocation), new TargetPoint(0, workbenchMessage.teLocation.getX(), workbenchMessage.teLocation.getY(), workbenchMessage.teLocation.getZ(), 25));
                }
            }
        }

        return workbenchMessage;
    }
}
