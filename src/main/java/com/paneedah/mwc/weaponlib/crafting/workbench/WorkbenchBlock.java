package com.paneedah.mwc.weaponlib.crafting.workbench;

import com.paneedah.mwc.weaponlib.ModContext;
import com.paneedah.mwc.weaponlib.crafting.base.BlockStation;
import com.paneedah.mwc.weaponlib.inventory.GuiHandler;
import com.paneedah.mwc.weaponlib.network.packets.StationClientPacket;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * Block class for the workbench block
 * 
 * @author Homer Riva-Cambrin, 2022
 */
public class WorkbenchBlock extends BlockStation {

	
	// In ticks
	public static final int WORKBENCH_WEAPON_CRAFTING_TIME = 1200;
	public static final int WORKBENCH_ATTACHMENT_CRAFTING_TIME = 400;
	public static final int WORKBENCH_DISMANTLING_TIME = 200;
	
	
	

	public WorkbenchBlock(ModContext context, String name, Material materialIn) {
		super(context, name, materialIn);
	}
	
	
	
	
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		playerIn.openGui(modContext.getMod(), GuiHandler.WORKBENCH_GUI_ID, worldIn, pos.getX(), pos.getY(), pos.getZ());
		
		if(hand == EnumHand.MAIN_HAND) {
			
			playerIn.swingArm(hand);
			
		
			if(!worldIn.isRemote) {
				modContext.getChannel().getChannel().sendTo(new StationClientPacket(worldIn, pos), (EntityPlayerMP) playerIn);
			}
			return true;
		}
		
		
		
		return super.onBlockActivated(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
	}
	
	@Override
	public TileEntity createTileEntity(World world, IBlockState state) {
		return new TileEntityWorkbench();
	}



	


}
