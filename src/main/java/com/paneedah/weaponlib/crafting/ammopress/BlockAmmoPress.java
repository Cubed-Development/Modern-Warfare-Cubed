package com.paneedah.weaponlib.crafting.ammopress;

import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.crafting.base.BlockStation;
import com.paneedah.weaponlib.inventory.GuiHandler;
import com.paneedah.weaponlib.network.packets.StationClientPacket;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.List;

public class BlockAmmoPress extends BlockStation {
	
	// The actual bounding box for the ammo-press
	public static AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(0.1D, 0.0D, 0.1D, 0.9D, 0.8D, 0.9D);
	
	// The two bounding boxes added to the collision box list for highlighting
	public static AxisAlignedBB COLLISION_BOX_BOTTOM = new AxisAlignedBB(0.1D, 0.0D, 0.1D, 0.9D, 0.2D, 0.9D);
	public static AxisAlignedBB COLLISION_BOX_TOP = new AxisAlignedBB(0.2D, 0.0D, 0.2D, 0.8D, 0.8D, 0.8D);

	public BlockAmmoPress(ModContext context, String name, Material materialIn) {
		super(context, name, materialIn);
	}
	
	@Override
	public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox,
			List<AxisAlignedBB> collidingBoxes, Entity entityIn, boolean p_185477_7_) {
		addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_BOTTOM);
		addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX_TOP);
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		playerIn.openGui(modContext.getMod(), GuiHandler.AMMOPRESS_GUI_ID, worldIn, pos.getX(), pos.getY(), pos.getZ());
		
		if(hand == EnumHand.MAIN_HAND) {
			
			playerIn.swingArm(hand);
			
			if(!worldIn.isRemote) {
				modContext.getChannel().sendTo(new StationClientPacket(worldIn, pos), (EntityPlayerMP) playerIn);
			}
		}
		
		return super.onBlockActivated(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
		
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return BOUNDING_BOX;
	}
	
	@Override
	public TileEntity createTileEntity(World world, IBlockState state) {
		return new TileEntityAmmoPress();
	}


}
