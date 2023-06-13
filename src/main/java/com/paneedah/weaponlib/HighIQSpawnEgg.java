package com.paneedah.weaponlib;

import akka.japi.Predicate;
import com.paneedah.mwc.utils.ModReference;
import com.paneedah.weaponlib.compatibility.ModelRegistryServerInterchange;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.crafting.CraftingGroup;
import com.paneedah.weaponlib.crafting.CraftingRegistry;
import com.paneedah.weaponlib.crafting.IModernCrafting;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.storage.AnvilChunkLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class HighIQSpawnEgg extends Item implements IModernCrafting {

	private CraftingEntry[] modernRecipe;
	private CraftingGroup craftGroup;

	public static class Builder {

		private String entitySpawnName;
		private Predicate<Block> blockPredicate;
		private String registryName;
		private CreativeTabs creativeTab;
		private int id;

		public Builder withEntitySpawnName(String name) {
			this.entitySpawnName = name;
			return this;
		}

		public Builder withBlockPredicate(Predicate<Block> predicate) {
			this.blockPredicate = predicate;
			return this;
		}

		public Builder withItemName(String name) {
			this.registryName = name;
			return this;
		}

		public Builder withCreativeTab(CreativeTabs tab) {
			this.creativeTab = tab;
			return this;
		}

		public HighIQSpawnEgg build() {

			HighIQSpawnEgg egg = new HighIQSpawnEgg();

			egg.setBlockPredicate(this.blockPredicate);
			egg.setEntitySpawnName(this.entitySpawnName);
			egg.setCreativeTab(this.creativeTab);
			egg.setTranslationKey(this.registryName);
			egg.setRegistryName(ModReference.ID, this.registryName);
			egg.setID(this.id);

			SecondaryEntityRegistry.pickupMap.put(this.id, egg);

			CraftingRegistry.registerHook(egg);

			ForgeRegistries.ITEMS.register(egg);
			
			ModelRegistryServerInterchange.ITEM_MODEL_REG.add(egg);

			return egg;
		}

		public Builder withID(int i) {
			this.id = i;
			return this;
		}

	}

	private String entitySpawnName;
	private Predicate<Block> blockPredicate;
	private int spawnID;

	public HighIQSpawnEgg() {

	}

	public int getID() {
		return this.spawnID;
	}

	public void setID(int i) {
		this.spawnID = i;
	}

	public String getEntitySpawnName() {
		return entitySpawnName;
	}

	public void setEntitySpawnName(String entitySpawnName) {
		this.entitySpawnName = entitySpawnName;
	}

	public Predicate<Block> getBlockPredicate() {
		return blockPredicate;
	}

	public void setBlockPredicate(Predicate<Block> blockPredicate) {
		this.blockPredicate = blockPredicate;
	}

	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand,
			EnumFacing facing, float hitX, float hitY, float hitZ) {


		if (hand == EnumHand.OFF_HAND)
			return EnumActionResult.FAIL;

		try {
			
			//System.out.println(worldIn.getBlockState(pos).getBlock());
			
			if (!blockPredicate.test(worldIn.getBlockState(pos).getBlock()))
				return EnumActionResult.FAIL;

			try {
				if (!worldIn.isRemote) {
					// Entity entity =
					// SecondaryEntityRegistry.map.get(getEntitySpawnName()).getConstructor(World.class).newInstance(worldIn);

					NBTTagCompound btc = new NBTTagCompound();
					btc.setString("id", ModReference.ID + ":" + getEntitySpawnName());
					Entity entity = AnvilChunkLoader.readWorldEntityPos(btc, worldIn, pos.getX() + 0.5, pos.up().getY(),
							pos.getZ() + 0.5, true);

					entity.setPosition(pos.getX() + 0.5, pos.up().getY(), pos.getZ() + 0.5);
					
					if (entity instanceof EntityLiving) {
						((EntityLiving) entity).onInitialSpawn(worldIn.getDifficultyForLocation(new BlockPos(entity)),
								(IEntityLivingData) null);
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
		return this.modernRecipe;
	}

	@Override
	public Item getItem() {
		return this;
	}

	@Override
	public CraftingGroup getCraftingGroup() {
		return this.craftGroup;
	}

	@Override
	public void setCraftingRecipe(CraftingEntry[] recipe) {
		this.modernRecipe = recipe;
	}

	@Override
	public void setCraftingGroup(CraftingGroup group) {
		this.craftGroup = group;
	}
}
