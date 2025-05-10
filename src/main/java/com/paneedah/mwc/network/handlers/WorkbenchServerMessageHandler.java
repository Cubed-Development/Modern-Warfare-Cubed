package com.paneedah.mwc.network.handlers;

import com.paneedah.mwc.network.messages.WorkbenchClientMessage;
import com.paneedah.mwc.network.messages.WorkbenchServerMessage;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.crafting.CraftingRegistry;
import com.paneedah.weaponlib.crafting.ICraftingRecipe;
import com.paneedah.weaponlib.crafting.ammopress.TileEntityAmmoPress;
import com.paneedah.weaponlib.crafting.base.TileEntityStation;
import com.paneedah.weaponlib.crafting.workbench.TileEntityWorkbench;
import dev.redstudio.redcore.math.ClampUtil;
import dev.redstudio.redcore.math.MathUtil;
import dev.redstudio.redcore.utils.NetworkUtil;
import lombok.NoArgsConstructor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.NetworkRegistry.TargetPoint;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.oredict.OreDictionary;

import java.util.*;

import static com.paneedah.mwc.MWC.CHANNEL;
import static com.paneedah.mwc.ProjectConstants.LOGGER;

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
                        final ItemStack newStack = new ItemStack(CraftingRegistry.getModernCrafting(workbenchServerMessage.getCraftingGroup(), workbenchServerMessage.getCraftingName()).getOutput().getItem(), workbenchServerMessage.getQuantity());

                        if (press.hasStack()) {
                            final ItemStack topQueue = press.getCraftingQueue().getLast();
                            if (ItemStack.areItemsEqualIgnoreDurability(topQueue, newStack)) {
                                topQueue.setCount(ClampUtil.clampMaxFirst(topQueue.getCount() + workbenchServerMessage.getQuantity(), 1, 999));
                            } else {
                                press.addStack(newStack);
                            }
                        } else {
                            press.addStack(newStack);
                        }

                        CHANNEL.sendToAllAround(new WorkbenchClientMessage(station.getWorld(), workbenchServerMessage.getTeLocation()), new TargetPoint(0, workbenchServerMessage.getTeLocation().getX(), workbenchServerMessage.getTeLocation().getY(), workbenchServerMessage.getTeLocation().getZ(), 20));
                        return;
                    }

                    final CraftingEntry[] modernRecipe = CraftingRegistry.getModernCrafting(workbenchServerMessage.getCraftingGroup(), workbenchServerMessage.getCraftingName()).getCraftingRecipe();
                    if (modernRecipe == null)
                        return;

                    final HashMap<Ingredient, HashMap<ItemStack, Integer>> removalList = new HashMap<>();

                    for (CraftingEntry stack : modernRecipe) {
                        final Ingredient stackItem = stack.getIngredient();
                        final int requiredCount = stack.getCount();
                        final boolean isOreDict = stack.isOreDictionary();

                        removalList.computeIfAbsent(stackItem, k -> new HashMap<>());

                        final List<ItemStack> oreDictList = isOreDict ? OreDictionary.getOres(stack.getOreDictionaryEntry()) : Collections.emptyList();

                        for (int i = 23; i < station.mainInventory.getSlots(); ++i) {
                            final ItemStack iS = station.mainInventory.getStackInSlot(i);
                            if (iS.isEmpty())
                                continue;

                            boolean matches;
                            if (isOreDict) {
                                matches = oreDictList.stream().anyMatch(oreEntry -> OreDictionary.itemMatches(oreEntry, iS, false));
                            } else {
                                matches = stackItem.test(iS);
                            }

                            if (!matches)
                                continue;

                            final int existingCount = removalList.get(stackItem).values().stream().mapToInt(Integer::intValue).sum();
                            if (existingCount >= requiredCount)
                                break;

                            final int iSCount = iS.getCount();
                            final int needed = requiredCount - existingCount;
                            if (iSCount >= needed) {
                                removalList.get(stackItem).put(iS, needed);
                                break;
                            } else {
                                removalList.get(stackItem).put(iS, iSCount);
                            }
                        }
                    }

                    // Verify
                    for (CraftingEntry stack : modernRecipe) {
                        final Ingredient ingredient = stack.getIngredient();
                        final int requiredCount = stack.getCount();

                        if (!stack.isOreDictionary()) {
                            if (!removalList.containsKey(ingredient))
                                return;

                            int collected = removalList.get(ingredient)
                                    .values()
                                    .stream()
                                    .mapToInt(Integer::intValue)
                                    .sum();

                            if (collected < requiredCount)
                                return;
                        } else {
                            final NonNullList<ItemStack> oreList = OreDictionary.getOres(stack.getOreDictionaryEntry());
                            int matchedCount = 0;

                            for (Map.Entry<Ingredient, HashMap<ItemStack, Integer>> entry : removalList.entrySet()) {
                                for (ItemStack candidate : entry.getValue().keySet()) {
                                    for (ItemStack oreEntry : oreList) {
                                        if (OreDictionary.itemMatches(oreEntry, candidate, false)) {
                                            matchedCount += entry.getValue().get(candidate);
                                            break;
                                        }
                                    }
                                }
                            }

                            if (matchedCount < requiredCount)
                                return;
                        }
                    }

                    // Remove the items
                    for (Ingredient i : removalList.keySet())
                        for (ItemStack iS : removalList.get(i).keySet())
                            iS.shrink(removalList.get(i).get(iS));

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
                        if (stack.getItem() instanceof ICraftingRecipe && ((ICraftingRecipe) stack.getItem()).getCraftingRecipe() != null && (station.dismantleStatus[i - 9] == -1 || station.dismantleStatus[i - 9] > station.dismantleDuration[i - 9])) {
                            station.dismantleStatus[i - 9] = 0;
                            station.dismantleDuration[i - 9] = ((TileEntityStation) tileEntity).getDismantlingTime(((ICraftingRecipe) stack.getItem()));
                        }
                    }
                    CHANNEL.sendToAllAround(new WorkbenchClientMessage(station.getWorld(), workbenchServerMessage.getTeLocation()), new TargetPoint(0, workbenchServerMessage.getTeLocation().getX(), workbenchServerMessage.getTeLocation().getY(), workbenchServerMessage.getTeLocation().getZ(), 25));
                } else if (workbenchServerMessage.getOpCode() == WorkbenchServerMessage.MOVE_OUTPUT) {
                    ((EntityPlayer) world.getEntityByID(workbenchServerMessage.getPlayerID())).addItemStackToInventory(station.mainInventory.getStackInSlot(workbenchServerMessage.getSlotToMove()));
                } else if (workbenchServerMessage.getOpCode() == WorkbenchServerMessage.POP_FROM_QUEUE) {
                    if (!(tileEntity instanceof TileEntityAmmoPress))
                        return;

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
