package com.paneedah.mwc.network.handlers;

import akka.japi.Pair;
import com.paneedah.mwc.network.messages.WorkbenchClientMessage;
import com.paneedah.mwc.network.messages.WorkbenchServerMessage;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.crafting.CraftingRegistry;
import com.paneedah.weaponlib.crafting.IModernCrafting;
import com.paneedah.weaponlib.crafting.ammopress.TileEntityAmmoPress;
import com.paneedah.weaponlib.crafting.base.TileEntityStation;
import com.paneedah.weaponlib.crafting.workbench.TileEntityWorkbench;
import dev.redstudio.redcore.utils.NetworkUtil;
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

import static com.paneedah.mwc.MWC.CHANNEL;

@NoArgsConstructor
public final class WorkbenchServerMessageHandler implements IMessageHandler<WorkbenchServerMessage, IMessage> {

    @Override
    public IMessage onMessage(final WorkbenchServerMessage workbenchServerMessage, final MessageContext messageContext) {
        NetworkUtil.processMessage(messageContext, () -> {
            final World world = messageContext.getServerHandler().player.world;

            final TileEntity tileEntity = world.getTileEntity(workbenchServerMessage.getTeLocation());

            if (tileEntity instanceof TileEntityStation) {
                final TileEntityStation station = (TileEntityStation) tileEntity;

                if (workbenchServerMessage.getOpCode() == WorkbenchServerMessage.CRAFT) {
                    if (tileEntity instanceof TileEntityAmmoPress) {
                        // Since it's based on a queue, you can add whatever you'd like, and it will merely refuse to craft it until you have the resources available.
                        final TileEntityAmmoPress press = (TileEntityAmmoPress) station;
                        final ItemStack newStack = new ItemStack(CraftingRegistry.getModernCrafting(workbenchServerMessage.getCraftingGroup(), workbenchServerMessage.getCraftingName()).getItem(), workbenchServerMessage.getQuantity());

                        if (press.hasStack()) {
                            final ItemStack topQueue = press.getCraftingQueue().getLast();
                            if (ItemStack.areItemsEqualIgnoreDurability(topQueue, newStack))
                                topQueue.grow(workbenchServerMessage.getQuantity());
                            else
                                press.addStack(newStack);
                        } else
                            press.addStack(newStack);

                        CHANNEL.sendToAllAround(new WorkbenchClientMessage(station.getWorld(), workbenchServerMessage.getTeLocation()), new TargetPoint(0, workbenchServerMessage.getTeLocation().getX(), workbenchServerMessage.getTeLocation().getY(), workbenchServerMessage.getTeLocation().getZ(), 20));

                        return;
                    }

                    final CraftingEntry[] modernRecipe = CraftingRegistry.getModernCrafting(workbenchServerMessage.getCraftingGroup(), workbenchServerMessage.getCraftingName()).getModernRecipe();
                    if (modernRecipe == null)
                        return;

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
                                return;

                            toConsume.add(new Pair<>(stack.getItem(), stack.getCount()));
                        } else {
                            // Stack is an OreDictionary term
                            boolean hasAny = false;
                            final NonNullList<ItemStack> list = OreDictionary.getOres(stack.getOreDictionaryEntry());
                            for (ItemStack toTest : list) {
                                if (itemList.containsKey(toTest.getItem()) && stack.getCount() <= itemList.get(toTest.getItem()).getCount()) {
                                    hasAny = true;
                                    toConsume.add(new Pair<>(toTest.getItem(), stack.getCount()));
                                    break;
                                }
                            }

                            if (!hasAny)
                                return;
                        }
                    }

                    for (Pair<Item, Integer> i : toConsume)
                        itemList.get(i.first()).shrink(i.second());

                    if (station instanceof TileEntityWorkbench) {
                        final TileEntityWorkbench workbench = (TileEntityWorkbench) station;
                        workbench.craftingTimer = workbenchServerMessage.getCraftingTimer();
                        workbench.craftingDuration = workbenchServerMessage.getCraftingDuration();
                        workbench.craftingTarget = CraftingRegistry.getModernCrafting(workbenchServerMessage.getCraftingGroup(), workbenchServerMessage.getCraftingName());
                    }

                    station.sendUpdate();

                    CHANNEL.sendToAllAround(new WorkbenchClientMessage(station.getWorld(), workbenchServerMessage.getTeLocation()), new TargetPoint(0, workbenchServerMessage.getTeLocation().getX(), workbenchServerMessage.getTeLocation().getY(), workbenchServerMessage.getTeLocation().getZ(), 20));
                } else if (workbenchServerMessage.getOpCode() == WorkbenchServerMessage.DISMANTLE) {
                    for (int i = 9; i < 13; ++i) {
                        if (station.mainInventory.getStackInSlot(i).isEmpty())
                            continue;

                        final ItemStack stack = station.mainInventory.getStackInSlot(i);
                        if (stack.getItem() instanceof IModernCrafting && ((IModernCrafting) stack.getItem()).getModernRecipe() != null && (station.dismantleStatus[i - 9] == -1 || station.dismantleStatus[i - 9] > station.dismantleDuration[i - 9])) {
                            station.dismantleStatus[i - 9] = 0;
                            station.dismantleDuration[i - 9] = ((TileEntityStation) tileEntity).getDismantlingTime(((IModernCrafting) stack.getItem()));
                        }
                    }

                    CHANNEL.sendToAllAround(new WorkbenchClientMessage(station.getWorld(), workbenchServerMessage.getTeLocation()), new TargetPoint(0, workbenchServerMessage.getTeLocation().getX(), workbenchServerMessage.getTeLocation().getY(), workbenchServerMessage.getTeLocation().getZ(), 25));
                } else if (workbenchServerMessage.getOpCode() == WorkbenchServerMessage.MOVE_OUTPUT) {
                    ((EntityPlayer) world.getEntityByID(workbenchServerMessage.getPlayerID())).addItemStackToInventory(station.mainInventory.getStackInSlot(workbenchServerMessage.getSlotToMove()));
                } else if (workbenchServerMessage.getOpCode() == WorkbenchServerMessage.POP_FROM_QUEUE) {
                    if (!(tileEntity instanceof TileEntityAmmoPress)) return;

                    final TileEntityAmmoPress teAmmoPress = (TileEntityAmmoPress) tileEntity;

                    if (teAmmoPress.hasStack() && teAmmoPress.getCraftingQueue().size() > workbenchServerMessage.getSlotToMove())
                        teAmmoPress.getCraftingQueue().remove(workbenchServerMessage.getSlotToMove());

                    CHANNEL.sendToAllAround(new WorkbenchClientMessage(station.getWorld(), workbenchServerMessage.getTeLocation()), new TargetPoint(0, workbenchServerMessage.getTeLocation().getX(), workbenchServerMessage.getTeLocation().getY(), workbenchServerMessage.getTeLocation().getZ(), 25));
                }
            }
        });

        return null;
    }
}
