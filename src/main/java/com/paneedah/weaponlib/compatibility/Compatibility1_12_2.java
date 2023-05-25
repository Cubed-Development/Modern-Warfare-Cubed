package com.paneedah.weaponlib.compatibility;

import com.paneedah.mwc.ModernWarfareMod;
import com.paneedah.mwc.utils.ModReference;
import com.paneedah.weaponlib.config.ModernConfigManager;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAITarget;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.client.event.FOVUpdateEvent;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.ShapedOreRecipe;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

@Deprecated
public class Compatibility1_12_2 implements Compatibility {

    private static final List<Block> blocksToCheck = Arrays.asList(
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

    @Override
    public void registerModEntity(Class<? extends Entity> entityClass, String entityName, int id, Object mod, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates) {
        net.minecraftforge.fml.common.registry.EntityRegistry.registerModEntity
                (new ResourceLocation(ModReference.id, entityName), entityClass, entityName, id, mod, trackingRange, updateFrequency, sendsVelocityUpdates);

    }

    @Override
    public void consumeInventoryItemFromSlot(EntityPlayer player, int slot) {
        if (player.inventory.getStackInSlot(slot) == null) {
            return;
        }

        player.inventory.getStackInSlot(slot).shrink(1);
        if (player.inventory.mainInventory.get(slot).getCount() <= 0) {
            player.inventory.removeStackFromSlot(slot);
        }
    }

    private static int itemSlotIndex(Item item, Predicate<ItemStack> condition, EntityPlayer player) {
        for (int i = 0; i < player.inventory.mainInventory.size(); ++i) {
            if (player.inventory.getStackInSlot(i) != null && player.inventory.getStackInSlot(i).getItem() == item && condition.test(player.inventory.getStackInSlot(i))) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public ItemStack consumeInventoryItem(Item item, Predicate<ItemStack> condition, EntityPlayer player, int maxSize) {

        if (maxSize <= 0) {
            return null;
        }

        int i = itemSlotIndex(item, condition, player);

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
    public boolean isBlockPenetratableByBullets(Block block) {
        if (blocksToCheck.contains(block))
            return true;

        if (ModernConfigManager.bulletBreakGlass)
            return block.getBlockState().getBaseState().getMaterial() == Material.GLASS;

        return false;
    }

    @Override
    public boolean isBlockPenetratableByBullets(IBlockState blockState) {
        return isBlockPenetratableByBullets(blockState.getBlock());
    }


    @Override
    public EntityAITarget createAINearestAttackableTarget(EntityLivingBase e, Class<? extends EntityLivingBase> targetClass,
                                                          boolean checkSight) {
        return new EntityAINearestAttackableTarget<>((EntityCreature) e, targetClass, checkSight);
    }

}
