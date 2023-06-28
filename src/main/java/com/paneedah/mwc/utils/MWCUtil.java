package com.paneedah.mwc.utils;

import com.paneedah.weaponlib.ItemMagazine;
import com.paneedah.weaponlib.config.ModernConfigManager;
import io.redstudioragnarok.redcore.vectors.Vector3D;
import net.jafama.FastMath;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.*;
import java.util.function.BiPredicate;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

/**
 * This class provides random utility methods.
 * <p>
 * Methods should be put here if they don't fit well anywhere else.
 *
 * @author Desoroxx
 */
public class MWCUtil {

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
     *
     * @author Desoroxx
     */
    public static boolean isPenetrableByBullets(IBlockState blockState) {
        if (PENETRABLE_MATERIALS.contains(blockState.getMaterial()) || PENETRABLE_BLOCKS.contains(blockState.getBlock()) || (!ModernConfigManager.penetrableBlocks.isEmpty() && ModernConfigManager.penetrableBlocks.contains(blockState.getBlock().getRegistryName().toString())))
            return true;

        return ModernConfigManager.bulletBreakGlass && blockState.getMaterial() == Material.GLASS;
    }

    /**
     * Consumes a specific number of items from a player's inventory.
     *
     * @param items The list of items that may be consumed.
     * @param amount The total number of items that should be consumed.
     * @param player The EntityPlayer whose inventory should be consumed from.
     *
     * @return The actual number of items consumed from the inventory. This might be less than amount if the inventory does not contain enough items.
     *
     * @author Desoroxx
     */
    public static int consumeItemsFromPlayerInventory(final List<? extends Item> items, final int amount, final EntityPlayer player) {
        if (amount <= 0)
            return 0;

        if (player.isCreative() && !player.isSneaking())
            return amount;

        int consumedAmount = 0;

        outerloop:
        for (final Item item : items) {
            for (int slotIndex = 0; slotIndex < player.inventory.getSizeInventory(); ++slotIndex) {
                ItemStack stackInSlot = player.inventory.getStackInSlot(slotIndex);
                if (stackInSlot.getItem().equals(item)) {
                    final int availableItems = stackInSlot.getCount();
                    final int itemsToConsume = Math.min(availableItems, amount - consumedAmount);

                    stackInSlot.shrink(itemsToConsume);
                    consumedAmount += itemsToConsume;

                    if (consumedAmount >= amount)
                        break outerloop;
                }
            }
        }

        return consumedAmount;
    }

    /**
     * Consumes items from the player's inventory based on a list of item magazines, using a comparator to determine the item to be consumed.
     * <p>
     * If the player is in Creative mode, the item with the highest value according to the comparator will be created and returned.
     * Otherwise, it iterates through the player's inventory and finds the item with the highest value according to the comparator, and consumes one item of that stack.
     *
     * @param items The list of item magazines to compare against.
     * @param comparator The comparator used to determine the item with the highest value.
     * @param player The player whose inventory is being searched.
     *
     * @return An ItemStack representing the consumed item, or null if no item was consumed.
     *
     * @author Desoroxx
     */
    public static ItemStack consumeItemsFromPlayerInventory(final List<? extends ItemMagazine> items, final Comparator<ItemStack> comparator, final EntityPlayer player) {
        ItemStack maxStack = null;

        if (player.isCreative() && !player.isSneaking())
            return items.stream().map(ItemMagazine::create).max(comparator).orElse(null);

        for (final ItemStack currentStack : player.inventory.mainInventory)
            if (items.contains(currentStack.getItem()) && (maxStack == null || comparator.compare(currentStack, maxStack) > 0))
                maxStack = currentStack;

        if (maxStack == null || maxStack.isEmpty())
            return null;

        return maxStack.splitStack(1);
    }

    /**
     * Method to trace the path (or 'ray') from a starting position to an ending position in a given world, accounting for potential collisions.
     * The blocks which are considered as collidable are determined by the isCollidable BiPredicate.
     *
     * @param world The world in which to perform the ray trace.
     * @param startPos The starting position for the ray trace.
     * @param endPos The ending position for the ray trace.
     * @param isCollidable A BiPredicate that takes a Block and its IBlockState and returns true if the block is considered collidable, false otherwise.
     *
     * @return A RayTraceResult object containing the result of the ray trace. If no collision is detected, it returns null.
     *
     * @author Desoroxx
     */
    public static RayTraceResult rayTraceBlocks(final World world, final Vector3D startPos, final Vector3D endPos, final BiPredicate<Block, IBlockState> isCollidable) {
        int startX = FastMath.floorToInt(startPos.x);
        int startY = FastMath.floorToInt(startPos.y);
        int startZ = FastMath.floorToInt(startPos.z);

        final int endX = FastMath.floorToInt(endPos.x);
        final int endY = FastMath.floorToInt(endPos.y);
        final int endZ = FastMath.floorToInt(endPos.z);

        final BlockPos.MutableBlockPos blockPos = new BlockPos.MutableBlockPos(startX, startY, startZ);
        IBlockState iBlockState;

        for (int i = 0; i < 256; i++) {
            if (startX == endX && startY == endY && startZ == endZ)
                return null;

            final double nextX = endX > startX ? startX + 1 : endX < startX ? startX : 999;
            final double nextY = endY > startY ? startY + 1 : endY < startY ? startY : 999;
            final double nextZ = endZ > startZ ? startZ + 1 : endZ < startZ ? startZ : 999;

            final double diffX = endPos.x - startPos.x;
            final double diffY = endPos.y - startPos.y;
            final double diffZ = endPos.z - startPos.z;

            double factorX = endX != startX ? (nextX - startPos.x) / diffX : 999;
            double factorY = endY != startY ? (nextY - startPos.y) / diffY : 999;
            double factorZ = endZ != startZ ? (nextZ - startPos.z) / diffZ : 999;

            factorX = factorX == 0 ? -1.0E-4 : factorX;
            factorY = factorY == 0 ? -1.0E-4 : factorY;
            factorZ = factorZ == 0 ? -1.0E-4 : factorZ;

            final EnumFacing direction;

            if (factorX < factorY && factorX < factorZ) {
                direction = endX > startX ? EnumFacing.WEST : EnumFacing.EAST;
                startPos.set(nextX, startPos.y + diffY * factorX, startPos.z + diffZ * factorX);
                startX = FastMath.floorToInt(startPos.x);
                if (direction == EnumFacing.EAST) startX--;
            } else if (factorY < factorZ) {
                direction = endY > startY ? EnumFacing.DOWN : EnumFacing.UP;
                startPos.set(startPos.x + diffX * factorY, nextY, startPos.z + diffZ * factorY);
                startY = FastMath.floorToInt(startPos.y);
                if (direction == EnumFacing.UP) startY--;
            } else {
                direction = endZ > startZ ? EnumFacing.NORTH : EnumFacing.SOUTH;
                startPos.set(startPos.x + diffX * factorZ, startPos.y + diffY * factorZ, nextZ);
                startZ = FastMath.floorToInt(startPos.z);
                if (direction == EnumFacing.SOUTH) startZ--;
            }

            blockPos.setPos(startX, startY, startZ);
            iBlockState = world.getBlockState(blockPos);
            if (isCollidable.test(iBlockState.getBlock(), iBlockState)) {
                final RayTraceResult rayTraceResult = iBlockState.collisionRayTrace(world, blockPos, startPos.toVec3d(), endPos.toVec3d());
                if (rayTraceResult != null)
                    return rayTraceResult;
            }
        }
        return null;
    }

    /**
     * Gets interpolated player coordinates using the current partial render tick.
     *
     * @return The interpolated player coordinates
     */
    @SideOnly(Side.CLIENT)
    public static Vec3d getInterpolatedPlayerPos() {
        EntityPlayer player = mc.player;

        final float renderPartialTicks = mc.getRenderPartialTicks();

        final double interpolatedX = (player.posX - player.prevPosX) * renderPartialTicks + player.prevPosX;
        final double interpolatedY = (player.posY - player.prevPosY) * renderPartialTicks + player.prevPosY;
        final double interpolatedZ = (player.posZ - player.prevPosZ) * renderPartialTicks + player.prevPosZ;

        return new Vec3d(interpolatedX, interpolatedY, interpolatedZ);
    }
}
