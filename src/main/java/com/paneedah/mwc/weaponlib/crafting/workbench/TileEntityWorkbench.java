package com.paneedah.mwc.weaponlib.crafting.workbench;

import com.paneedah.mwc.weaponlib.crafting.CraftingGroup;
import com.paneedah.mwc.weaponlib.crafting.CraftingRegistry;
import com.paneedah.mwc.weaponlib.crafting.IModernCrafting;
import com.paneedah.mwc.weaponlib.crafting.base.TileEntityStation;
import io.netty.buffer.ByteBuf;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.play.server.SPacketUpdateTileEntity;
import net.minecraftforge.fml.common.network.ByteBufUtils;

public class TileEntityWorkbench extends TileEntityStation {


	public IModernCrafting craftingTarget;

	// For the client.
	public String craftingTargetName;


	public int ticker;



	public TileEntityWorkbench() {
	}

	@Override
	public void onLoad() {
		super.onLoad();

	}


	@Override
	public int getDismantlingTime(IModernCrafting crafting) {
		return WorkbenchBlock.WORKBENCH_DISMANTLING_TIME;
	}
	

	@Override
	public NBTTagCompound getUpdateTag() {
		return super.getUpdateTag();
	}

	@Override
	public SPacketUpdateTileEntity getUpdatePacket() {
		return super.getUpdatePacket();
	}

	@Override
	public void handleUpdateTag(NBTTagCompound tag) {
		super.handleUpdateTag(tag);
	}
	
	
	@Override
	public void writeBytesForClientSync(ByteBuf buf) {
		super.writeBytesForClientSync(buf);
	//	System.out.println("Writing bytes for client sync, target is currently: " + this.craftingTarget);
		if(this.craftingTarget != null) {
			buf.writeBoolean(true);
			ByteBufUtils.writeUTF8String(buf, this.craftingTarget.getItem().getTranslationKey());
			//System.out.println("Tile Entity Workbench writing " + this.craftingTarget.getItem().getTranslationKey());
		} else {
			buf.writeBoolean(false);
		}
		
	}
	
	@Override
	public void readBytesFromClientSync(ByteBuf buf) {
		super.readBytesFromClientSync(buf);
		//System.out.println("Starting read from client sync...");
		if(buf.readBoolean()) {
			this.craftingTargetName = ByteBufUtils.readUTF8String(buf);
			//System.out.println("Tile Entity Workbench reading " + this.craftingTargetName);
		}
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound) {
		super.writeToNBT(compound);
		//System.out.println(compound);
		if (craftingTimer != -1 && this.craftingTarget != null) {
			compound.setInteger("craftingTargetID", this.craftingTarget.getCraftingGroup().getID());
			compound.setString("craftingTargetName", this.craftingTarget.getItem().getTranslationKey());

		}
		return compound;
	}

	@Override
	public void readFromNBT(NBTTagCompound compound) {
		super.readFromNBT(compound);
		//System.out.println("Reading: " + compound);
		if (compound.hasKey("craftingTimer") && compound.hasKey("craftingDuration")) {
			this.craftingTarget = CraftingRegistry.getModernCrafting(
					CraftingGroup.getValue(compound.getInteger("craftingTargetID")),
					compound.getString("craftingTargetName"));
		}

	}

	public void setTimer(int time, int duration) {
		this.craftingTimer = time;
		this.craftingDuration = duration;
	}

	

	@Override
	public void update() {
		super.update();
	
		
		if (this.craftingTimer != -1) {
			this.craftingTimer++;
		}

		

		if (getProgress() >= 1) {
			craftingTimer = -1;
			craftingDuration = -1;


			if (!this.world.isRemote && this.craftingTarget != null) {
				addStackToInventoryRange(new ItemStack(this.craftingTarget.getItem()), 0, 9);
				sendUpdate();
			}

		}

	}

}
