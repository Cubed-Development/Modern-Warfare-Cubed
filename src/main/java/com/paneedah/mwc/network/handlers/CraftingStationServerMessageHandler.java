package com.paneedah.mwc.network.handlers;

import com.paneedah.mwc.ProjectConstants;
import com.paneedah.mwc.network.messages.CraftingStationClientMessage;
import com.paneedah.mwc.network.messages.CraftingStationServerMessage;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.crafting.CraftingRegistry;
import com.paneedah.weaponlib.crafting.ICraftingRecipe;
import com.paneedah.weaponlib.crafting.ammopress.TileEntityAmmoPress;
import com.paneedah.weaponlib.crafting.base.TileEntityStation;
import com.paneedah.weaponlib.crafting.workbench.TileEntityWorkbench;
import dev.redstudio.redcore.math.ClampUtil;
import dev.redstudio.redcore.utils.NetworkUtil;
import lombok.NoArgsConstructor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.NetworkRegistry.TargetPoint;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.oredict.OreDictionary;

import java.util.*;

import static com.paneedah.mwc.MWC.CHANNEL;

@NoArgsConstructor
public final class CraftingStationServerMessageHandler implements IMessageHandler<CraftingStationServerMessage, IMessage> {

    @Override
    public IMessage onMessage(final CraftingStationServerMessage craftingStationServerMessage, final MessageContext messageContext) {
        NetworkUtil.processMessage(messageContext, () -> {
            final World world = messageContext.getServerHandler().player.world;
            final TileEntity tileEntity = world.getTileEntity(craftingStationServerMessage.getTeLocation());

            if (!(tileEntity instanceof TileEntityStation))
                return;

            final TileEntityStation station = (TileEntityStation) tileEntity;

            if (craftingStationServerMessage.getOpCode() == CraftingStationServerMessage.CRAFT) {
                if (tileEntity instanceof TileEntityAmmoPress) {
                    // Since it's based on a queue, you can add whatever you'd like, and it will merely refuse to craft it until you have the resources available.
                    final TileEntityAmmoPress press = (TileEntityAmmoPress) station;
                    final ItemStack newStack = new ItemStack(CraftingRegistry.getModernCrafting(craftingStationServerMessage.getCraftingGroup(), craftingStationServerMessage.getCraftingName()).getOutput().getItem(), craftingStationServerMessage.getQuantity());

                    if (press.hasStack()) {
                        final ItemStack topQueue = press.getCraftingQueue().getLast();
                        if (ItemStack.areItemsEqualIgnoreDurability(topQueue, newStack)) {
                            topQueue.setCount(ClampUtil.clampMaxFirst(topQueue.getCount() + craftingStationServerMessage.getQuantity(), 1, 999));
                        } else {
                            press.addStack(newStack);
                        }
                    } else {
                        press.addStack(newStack);
                    }

                    CHANNEL.sendToAllAround(new CraftingStationClientMessage(station.getWorld(), craftingStationServerMessage.getTeLocation()), new TargetPoint(0, craftingStationServerMessage.getTeLocation().getX(), craftingStationServerMessage.getTeLocation().getY(), craftingStationServerMessage.getTeLocation().getZ(), 20));
                    return;
                }

                final CraftingEntry[] modernRecipe = CraftingRegistry.getModernCrafting(craftingStationServerMessage.getCraftingGroup(), craftingStationServerMessage.getCraftingName()).getCraftingRecipe();
                if (modernRecipe == null)
                    return;

                Map<CraftingEntry, Map<ItemStack, Integer>> ingredientsToConsume = new HashMap<>();

                // Gets all the items necessary to remove
                for (CraftingEntry entry : modernRecipe) {
                    Map<ItemStack, Integer> itemsForIngredient = new HashMap<>();
                    ingredientsToConsume.put(entry, itemsForIngredient);

                    int remainingNeeded = entry.getCount();
                    List<ItemStack> oreDictMatches = entry.isOreDictionary()
                            ? OreDictionary.getOres(entry.getOreDictionaryEntry())
                            : Collections.emptyList();

                    for (int i = 23; i < station.mainInventory.getSlots() && remainingNeeded > 0; ++i) {
                        ItemStack invStack = station.mainInventory.getStackInSlot(i);
                        if (invStack.isEmpty()) continue;

                        boolean isMatch = entry.isOreDictionary()
                                ? oreDictMatches.stream().anyMatch(ore -> OreDictionary.itemMatches(ore, invStack, false))
                                : entry.getIngredient().test(invStack);

                        if (!isMatch) continue;

                        int toTake = Math.min(remainingNeeded, invStack.getCount());
                        itemsForIngredient.put(invStack, toTake);
                        remainingNeeded -= toTake;

                        if (remainingNeeded <= 0) break;
                    }
                }

                // Verifies that the amount is not above what it should be.
                for (CraftingEntry entry : modernRecipe) {
                    int totalFound = ingredientsToConsume.get(entry).values().stream()
                            .mapToInt(Integer::intValue)
                            .sum();

                    if (totalFound < entry.getCount())
                        return;
                }

                // Consumes the item's from the workbench inventory
                ingredientsToConsume.values().forEach(itemMap -> itemMap.forEach(ItemStack::shrink));

                if (station instanceof TileEntityWorkbench) {
                    final TileEntityWorkbench workbench = (TileEntityWorkbench) station;
                    workbench.craftingTimer = craftingStationServerMessage.getCraftingTimer();
                    workbench.craftingDuration = craftingStationServerMessage.getCraftingDuration();
                    workbench.craftingTarget = CraftingRegistry.getModernCrafting(craftingStationServerMessage.getCraftingGroup(), craftingStationServerMessage.getCraftingName());
                }

                station.sendUpdate();
                CHANNEL.sendToAllAround(new CraftingStationClientMessage(station.getWorld(), craftingStationServerMessage.getTeLocation()), new TargetPoint(0, craftingStationServerMessage.getTeLocation().getX(), craftingStationServerMessage.getTeLocation().getY(), craftingStationServerMessage.getTeLocation().getZ(), 20));
            } else if (craftingStationServerMessage.getOpCode() == CraftingStationServerMessage.DISMANTLE) {
                for (int i = 9; i < 13; ++i) {
                    if (station.mainInventory.getStackInSlot(i).isEmpty())
                        continue;

                    final ItemStack stack = station.mainInventory.getStackInSlot(i);
                    if (stack.getItem() instanceof ICraftingRecipe && ((ICraftingRecipe) stack.getItem()).getCraftingRecipe() != null && (station.dismantleStatus[i - 9] == -1 || station.dismantleStatus[i - 9] > station.dismantleDuration[i - 9])) {
                        station.dismantleStatus[i - 9] = 0;
                        station.dismantleDuration[i - 9] = ((TileEntityStation) tileEntity).getDismantlingTime(((ICraftingRecipe) stack.getItem()));
                    }
                }
                CHANNEL.sendToAllAround(new CraftingStationClientMessage(station.getWorld(), craftingStationServerMessage.getTeLocation()), new TargetPoint(0, craftingStationServerMessage.getTeLocation().getX(), craftingStationServerMessage.getTeLocation().getY(), craftingStationServerMessage.getTeLocation().getZ(), 25));
            } else if (craftingStationServerMessage.getOpCode() == CraftingStationServerMessage.MOVE_OUTPUT) {
                ((EntityPlayer) world.getEntityByID(craftingStationServerMessage.getPlayerID())).addItemStackToInventory(station.mainInventory.getStackInSlot(craftingStationServerMessage.getSlotToMove()));
            } else if (craftingStationServerMessage.getOpCode() == CraftingStationServerMessage.POP_FROM_QUEUE) {
                if (!(tileEntity instanceof TileEntityAmmoPress))
                    return;

                final TileEntityAmmoPress teAmmoPress = (TileEntityAmmoPress) tileEntity;
                if (teAmmoPress.hasStack() && teAmmoPress.getCraftingQueue().size() > craftingStationServerMessage.getSlotToMove())
                    teAmmoPress.getCraftingQueue().remove(craftingStationServerMessage.getSlotToMove());
                CHANNEL.sendToAllAround(new CraftingStationClientMessage(station.getWorld(), craftingStationServerMessage.getTeLocation()), new TargetPoint(0, craftingStationServerMessage.getTeLocation().getX(), craftingStationServerMessage.getTeLocation().getY(), craftingStationServerMessage.getTeLocation().getZ(), 25));
            }
        });

        return null;
    }
}
