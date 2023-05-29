package com.paneedah.weaponlib.inventory;

import com.paneedah.weaponlib.compatibility.CompatibleCustomPlayerInventoryCapability;
import com.paneedah.weaponlib.crafting.ammopress.ContainerAmmoPress;
import com.paneedah.weaponlib.crafting.ammopress.GUIContainerAmmoPress;
import com.paneedah.weaponlib.crafting.ammopress.TileEntityAmmoPress;
import com.paneedah.weaponlib.crafting.workbench.ContainerWorkbench;
import com.paneedah.weaponlib.crafting.workbench.GUIContainerWorkbench;
import com.paneedah.weaponlib.crafting.workbench.TileEntityWorkbench;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class GuiHandler implements IGuiHandler {

    public static final int STORAGE_ITEM_INVENTORY_GUI_ID = 1;
    public static final int CUSTOM_PLAYER_INVENTORY_GUI_ID = 2;
    public static final int WORKBENCH_GUI_ID = 3;
    public static final int AMMOPRESS_GUI_ID = 4;

    @Override
    public Object getServerGuiElement(int guiId, EntityPlayer player, World world, int x, int y, int z) {
        Object container = null;
        switch (guiId) {
        case STORAGE_ITEM_INVENTORY_GUI_ID: {
            CustomPlayerInventory customInventory = CompatibleCustomPlayerInventoryCapability
                    .getInventory(player);
            if (customInventory != null && customInventory.getStackInSlot(0) != null) {
                container = new StorageItemContainer(player, player.inventory,
                        new StorageInventory(customInventory.getStackInSlot(0)));
            }
        }
            break;
        case CUSTOM_PLAYER_INVENTORY_GUI_ID:
            container = new CustomPlayerInventoryContainer(player, player.inventory,
                    CompatibleCustomPlayerInventoryCapability.getInventory(player));
            break;
        case WORKBENCH_GUI_ID:
        	container = new ContainerWorkbench(player, player.inventory, (TileEntityWorkbench) world.getTileEntity(new BlockPos(x, y, z)));
        	break;
        case AMMOPRESS_GUI_ID:
        	container = new ContainerAmmoPress(player, player.inventory, (TileEntityAmmoPress) world.getTileEntity(new BlockPos(x, y, z)));
        	break;
        }
        return container;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Object getClientGuiElement(int guiId, EntityPlayer player, World world, int x, int y, int z) {
        Object guiContainer = null;
        switch (guiId) {
        case STORAGE_ITEM_INVENTORY_GUI_ID:
            CustomPlayerInventory customInventory = CompatibleCustomPlayerInventoryCapability.getInventory(FMLClientHandler.instance().getClientPlayerEntity());
            if (customInventory != null && customInventory.getStackInSlot(0) != null) {
                guiContainer = new StorageItemGuiContainer((StorageItemContainer) new StorageItemContainer(player,
                        player.inventory, new StorageInventory(customInventory.getStackInSlot(0))));
            }
            break;
        case CUSTOM_PLAYER_INVENTORY_GUI_ID:
            guiContainer = new CustomPlayerInventoryGuiContainer(player, player.inventory,
                    CompatibleCustomPlayerInventoryCapability.getInventory(player));
            break;
                
        case WORKBENCH_GUI_ID:
        	guiContainer = new GUIContainerWorkbench(player, player.inventory, (TileEntityWorkbench) world.getTileEntity(new BlockPos(x, y, z)));
        	
        	break;
        case AMMOPRESS_GUI_ID:
        	guiContainer = new GUIContainerAmmoPress(player, player.inventory, (TileEntityAmmoPress) world.getTileEntity(new BlockPos(x, y, z)));
        	break;
        }
        
        
        return guiContainer;
    }

}
