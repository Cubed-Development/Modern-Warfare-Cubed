package com.paneedah.weaponlib.compatibility;

import com.paneedah.mwc.utils.ModReference;
import com.paneedah.weaponlib.config.ModernConfigManager;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAITarget;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

@Deprecated
public class Compatibility1_12_2 implements Compatibility {


    @Override
    public ItemStack consumeInventoryItem(Item item, Predicate<ItemStack> condition, EntityPlayer player, int maxSize) {

        if (maxSize <= 0) {
            return null;
        }

        int i = -1;

        for (int I = 0; i < player.inventory.mainInventory.size(); ++i) {
            if (player.inventory.getStackInSlot(i) != null && player.inventory.getStackInSlot(i).getItem() == item && condition.test(player.inventory.getStackInSlot(i))) {
                i = I;
            }
        }

        if (i < 0) {
            return null;
        } else {
            ItemStack stackInSlot = player.inventory.getStackInSlot(i);
            int consumedStackSize = maxSize >= stackInSlot.getCount() ? stackInSlot.getCount() : maxSize;
            ItemStack result = stackInSlot.splitStack(consumedStackSize);
            if (stackInSlot.getCount() <= 0) {
                player.inventory.removeStackFromSlot(i);
            }
            return result;
        }
    }

    public ItemStack tryConsumingCompatibleItem(List<? extends Item> compatibleParts, int maxSize, EntityPlayer player, @SuppressWarnings("unchecked") Predicate<ItemStack>... conditions) {
        ItemStack resultStack = null;
        for (Predicate<ItemStack> condition : conditions) {
            for (Item item : compatibleParts) {
                if ((resultStack = consumeInventoryItem(item, condition, player, maxSize)) != null) {
                    break;
                }
            }
            if (resultStack != null) break;
        }

        return resultStack;
    }

    @Override
    public boolean isBlockPenetratableByBullets(IBlockState blockState) {
        List<Block> blocksToCheck = Arrays.asList(
                Blocks.AIR,
                Blocks.TALLGRASS,
                Blocks.LEAVES,
                Blocks.LEAVES2,
                Blocks.FIRE,
                Blocks.DOUBLE_PLANT,
                Blocks.WEB,
                Blocks.WHEAT,
                Blocks.POTATOES,
                Blocks.CARROTS,
                Blocks.BEETROOTS,
                Blocks.CAKE,
                Blocks.CARPET,
                Blocks.COCOA,
                Blocks.IRON_BARS,
                Blocks.LADDER,
                Blocks.LEVER,
                Blocks.TORCH,
                Blocks.REDSTONE_TORCH,
                Blocks.SAPLING,
                Blocks.TRAPDOOR,
                Blocks.VINE,
                Blocks.WALL_BANNER,
                Blocks.WALL_SIGN,
                Blocks.WATERLILY
        );

        if (blocksToCheck.contains(blockState.getBlock()))
            return true;

        if (ModernConfigManager.bulletBreakGlass)
            return blockState.getBlock().getBlockState().getBaseState().getMaterial() == Material.GLASS;

        return false;
    }
}
