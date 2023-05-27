package com.paneedah.weaponlib.compatibility;

import com.paneedah.weaponlib.config.ModernConfigManager;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Deprecated
public class Compatibility1_12_2 implements Compatibility {

    private static final Set<Material> PENETRABLE_MATERIALS = new HashSet<>(Arrays.asList(
            Material.WEB,
            Material.VINE,
            Material.PLANTS,
            Material.CACTUS,
            Material.LEAVES,
            Material.CIRCUITS,
            Material.CARPET,
            Material.CAKE
    ));

    private static final Set<Block> PENETRABLE_BLOCKS = new HashSet<>(Arrays.asList(
            Blocks.IRON_BARS,
            Blocks.STANDING_BANNER,
            Blocks.WALL_BANNER,
            Blocks.STANDING_SIGN,
            Blocks.WALL_SIGN
    ));

    /**
     * Checks if a given block is penetrable by bullets.
     *
     * @param blockState The IBlockState to check.
     *
     * @return True if the block is penetrable by bullets, false otherwise.
     */
    @Override
    public boolean isBlockPenetrableByBullets(IBlockState blockState) {
        if (PENETRABLE_MATERIALS.contains(blockState.getMaterial()) || PENETRABLE_BLOCKS.contains(blockState.getBlock()))
            return true;

        return ModernConfigManager.bulletBreakGlass && blockState.getMaterial() == Material.GLASS;
    }

    /**
     * Consumes a specific number of items from a player's inventory.
     *
     * @param items The list of items that may be consumed.
     * @param amount The total number of items that should be consumed.
     * @param player The EntityPlayer whose inventory should be consumed from.
     * @return The actual number of items consumed from the inventory. This might be less than amount if the inventory does not contain enough items.
     */
    public int consumeItemsFromPlayerInventory(List<? extends Item> items, int amount, EntityPlayer player) {
        int consumedAmount = 0;

        outerloop:
        for (Item item : items) {
            for (int slotIndex = 0; slotIndex < player.inventory.getSizeInventory(); ++slotIndex) {
                ItemStack stackInSlot = player.inventory.getStackInSlot(slotIndex);
                if (stackInSlot.getItem().equals(item)) {
                    int availableItems = stackInSlot.getCount();
                    int itemsToConsume = Math.min(availableItems, amount - consumedAmount);
                    stackInSlot.shrink(itemsToConsume);
                    consumedAmount += itemsToConsume;

                    if (consumedAmount >= amount)
                        break outerloop;
                }
            }
        }

        return consumedAmount;
    }
}
