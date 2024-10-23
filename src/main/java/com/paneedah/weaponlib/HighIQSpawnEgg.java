package com.paneedah.weaponlib;

import akka.japi.Predicate;
import com.paneedah.weaponlib.compatibility.ModelRegistryServerInterchange;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.crafting.CraftingGroup;
import com.paneedah.weaponlib.crafting.CraftingRegistry;
import com.paneedah.weaponlib.crafting.IModernCraftingRecipe;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.storage.AnvilChunkLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import static com.paneedah.mwc.ProjectConstants.ID;

public class HighIQSpawnEgg extends Item implements IModernCraftingRecipe {

    private CraftingEntry[] modernRecipe;
    private CraftingGroup craftGroup;

    public static class Builder {

        private String entitySpawnName;
        private Predicate<Block> blockPredicate;
        private String registryName;
        private CreativeTabs creativeTab;
        private int id;

        public Builder withEntitySpawnName(String name) {
            entitySpawnName = name;
            return this;
        }

        public Builder withBlockPredicate(Predicate<Block> predicate) {
            blockPredicate = predicate;
            return this;
        }

        public Builder withItemName(String name) {
            registryName = name;
            return this;
        }

        public Builder withCreativeTab(CreativeTabs tab) {
            creativeTab = tab;
            return this;
        }

        public HighIQSpawnEgg build() {

            HighIQSpawnEgg egg = new HighIQSpawnEgg();

            egg.setBlockPredicate(blockPredicate);
            egg.setEntitySpawnName(entitySpawnName);
            egg.setCreativeTab(creativeTab);
            egg.setTranslationKey(registryName);
            egg.setRegistryName(ID, registryName);
            egg.setID(id);

            SecondaryEntityRegistry.pickupMap.put(Integer.valueOf(id), egg);

            CraftingRegistry.registerHook(egg);

            ForgeRegistries.ITEMS.register(egg);

            ModelRegistryServerInterchange.ITEM_MODEL_REG.add(egg);

            return egg;
        }

        public Builder withID(int i) {
            id = i;
            return this;
        }

    }

    @Getter
    @Setter
    private String entitySpawnName;
    @Getter
    @Setter
    private Predicate<Block> blockPredicate;
    private int spawnID;

    public HighIQSpawnEgg() {

    }

    public int getID() {
        return spawnID;
    }

    public void setID(int i) {
        spawnID = i;
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand,
                                      EnumFacing facing, float hitX, float hitY, float hitZ) {


        if (hand == EnumHand.OFF_HAND) {
            return EnumActionResult.FAIL;
        }

        try {

            //System.out.println(worldIn.getBlockState(pos).getBlock());

            if (!blockPredicate.test(worldIn.getBlockState(pos).getBlock())) {
                return EnumActionResult.FAIL;
            }

            try {
                if (!worldIn.isRemote) {

                    NBTTagCompound btc = new NBTTagCompound();
                    btc.setString("id", ID + ":" + getEntitySpawnName());
                    Entity entity = AnvilChunkLoader.readWorldEntityPos(btc, worldIn, pos.getX() + 0.5, pos.up().getY(),
                            pos.getZ() + 0.5, true);

                    entity.setPosition(pos.getX() + 0.5, pos.up().getY(), pos.getZ() + 0.5);

                    if (entity instanceof EntityLiving) {
                        ((EntityLiving) entity).onInitialSpawn(worldIn.getDifficultyForLocation(new BlockPos(entity)),
                                null);
                    }

                }
                player.getHeldItemMainhand().shrink(1);

                return EnumActionResult.SUCCESS;
            } catch (Exception e) {
                System.err.println("Unable to spawn entity with name: " + getEntitySpawnName());
            }

            return super.onItemUse(player, worldIn, pos, hand, facing, hitX, hitY, hitZ);
        } catch (Exception e) {
            e.printStackTrace();
            return EnumActionResult.PASS;
        }

    }

    @Override
    public CraftingEntry[] getModernRecipe() {
        return modernRecipe;
    }

    @Override
    public ItemStack getItemStack() {
        return new ItemStack(this);
    }

    @Override
    public CraftingGroup getCraftingGroup() {
        return craftGroup;
    }

    @Override
    public void setCraftingRecipe(CraftingEntry[] recipe) {
        modernRecipe = recipe;
    }

    @Override
    public void setCraftingGroup(CraftingGroup group) {
        craftGroup = group;
    }
}
