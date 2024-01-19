package com.paneedah.mwc.network.handlers;

import com.paneedah.mwc.network.messages.WorkbenchClientMessage;
import com.paneedah.mwc.network.messages.WorkbenchServerMessage;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.crafting.CraftingRegistry;
import com.paneedah.weaponlib.crafting.IModernCraftingRecipe;
import com.paneedah.weaponlib.crafting.ammopress.TileEntityAmmoPress;
import com.paneedah.weaponlib.crafting.base.TileEntityStation;
import com.paneedah.weaponlib.crafting.workbench.TileEntityWorkbench;
import io.redstudioragnarok.redcore.utils.MathUtil;
import io.redstudioragnarok.redcore.utils.NetworkUtil;
import lombok.NoArgsConstructor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.NetworkRegistry.TargetPoint;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

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
                        final ItemStack newStack = new ItemStack(CraftingRegistry.getModernCrafting(workbenchServerMessage.getCraftingGroup(), workbenchServerMessage.getCraftingName()).getItemStack().getItem(), workbenchServerMessage.getQuantity());

                        if (press.hasStack()) {
                            final ItemStack topQueue = press.getCraftingQueue().getLast();
                            if (ItemStack.areItemsEqualIgnoreDurability(topQueue, newStack))
                                topQueue.setCount((int) MathUtil.clampMaxFirst(topQueue.getCount() + workbenchServerMessage.getQuantity(), 1, 999));
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

                    final HashMap<Item, HashMap<ItemStack, Integer>> itemRemovalList = new HashMap<>();

                    // Calculate the itemstacks to remove
                    for (CraftingEntry stack : modernRecipe) {
                        itemRemovalList.computeIfAbsent(stack.getItem(), k -> new HashMap<>());
                        final Item stackItem = stack.getItem();
                        final int requiredCount = stack.getCount();

                        for (int i = 23; i < station.mainInventory.getSlots(); ++i) {
                            final ItemStack iS = station.mainInventory.getStackInSlot(i);
                            if (iS.getItem() != stackItem)
                                continue;

                            final int existingCount = itemRemovalList.get(stackItem).values().stream().mapToInt(Integer::intValue).sum();
                            if (existingCount >= requiredCount)
                                break;

                            final int iSCount = iS.getCount();
                            if (existingCount + iSCount >= requiredCount) {
                                itemRemovalList.get(stackItem).put(iS, requiredCount - existingCount);
                                break;
                            }

                            itemRemovalList.get(stackItem).put(iS, iSCount);
                        }
                    }

                    // Verify
                    for (CraftingEntry stack : modernRecipe) {
                        if (!stack.isOreDictionary()) {
                            final Item stackItem = stack.getItem();
                            if (!itemRemovalList.containsKey(stackItem) || itemRemovalList.get(stackItem).values().stream().mapToInt(Integer::intValue).sum() < stack.getCount())
                                return;
                        }
                    }

                    // Remove the items
                    for (Item i : itemRemovalList.keySet())
                        for (ItemStack iS : itemRemovalList.get(i).keySet())
                            iS.shrink(itemRemovalList.get(i).get(iS));

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
                        if (stack.getItem() instanceof IModernCraftingRecipe && ((IModernCraftingRecipe) stack.getItem()).getModernRecipe() != null && (station.dismantleStatus[i - 9] == -1 || station.dismantleStatus[i - 9] > station.dismantleDuration[i - 9])) {
                            station.dismantleStatus[i - 9] = 0;
                            station.dismantleDuration[i - 9] = ((TileEntityStation) tileEntity).getDismantlingTime(((IModernCraftingRecipe) stack.getItem()));
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
