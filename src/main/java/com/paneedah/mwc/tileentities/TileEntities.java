package com.paneedah.mwc.tileentities;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.Guns;
import com.paneedah.weaponlib.tile.CustomTileEntityBlock;
import com.paneedah.weaponlib.tile.LootBoxConfiguration;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.EnumDifficulty;
import org.lwjgl.opengl.GL11;

public class TileEntities {

    public static void init(CommonProxy commonProxy) {
    	new TurretBaseFactory().createTileEntity(MWC.modContext);

        new LootBoxConfiguration()
        .withMaterial(Material.ROCK)
        .withName("weapons_case")
        .withModelClassName("com.paneedah.mwc.models.GunCase")
        .withTextureName("textures/models/gun_case.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withBoundingBox(
        		blockState -> {
        			AxisAlignedBB boundingBox = null;
        			EnumFacing facing = blockState.getValue(CustomTileEntityBlock.FACING);
        			switch(facing) {
        			case WEST:
        				boundingBox = new AxisAlignedBB(0.82, 0, -0.65, 0.18, 0.3, 1.6);
        				break;
        			case EAST:
        				boundingBox = new AxisAlignedBB(0.81, 0, -0.6, 0.18, 0.3, 1.65);
        				break;
        			case NORTH:
        				boundingBox = new AxisAlignedBB(-0.58, 0, 0.2, 1.63, 0.3, 0.8);
        				break;
        			case SOUTH:
        				boundingBox = new AxisAlignedBB(-0.65, 0, 0.2, 1.6, 0.3, 0.8);
        				break;
        			default:
        			}
        			return boundingBox;
        		}
        )
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.6f, 0.6f, 0.6f);
            GL11.glTranslatef(0.7f, 1.1f, 0.5f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.ROCK)
        .withName("weapons_case_small")
        .withModelClassName("com.paneedah.mwc.models.GunCaseSmall")
        .withTextureName("textures/models/gun_case_small.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withBoundingBox(
        		blockState -> {
        			AxisAlignedBB boundingBox = null;
        			EnumFacing facing = blockState.getValue(CustomTileEntityBlock.FACING);
        			switch(facing) {
        			case WEST:
        				boundingBox = new AxisAlignedBB(0.09, 0, 0.09, 0.77, 0.33, 0.93);
        				break;
        			case EAST:
        				boundingBox = new AxisAlignedBB(0.22, 0, 0.05, 0.92, 0.33, 0.9);
        				break;
        			case NORTH:
        				boundingBox = new AxisAlignedBB(0.05, 0, 0.1, 0.9, 0.33, 0.77);
        				break;
        			case SOUTH:
        				boundingBox = new AxisAlignedBB(0.1, 0, 0.23, 0.95, 0.33, 0.92);
        				break;
        			default:
        			}
        			return boundingBox;
        		}
        )
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.6f, 0.6f, 0.6f);
            GL11.glTranslatef(0.8f, 1.1f, 0.8f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.ROCK)
        .withName("russian_weapons_case")
        .withModelClassName("com.paneedah.mwc.models.MilitaryCrate")
        .withTextureName("textures/models/militarycrate.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withBoundingBox(
        		blockState -> {
        			AxisAlignedBB boundingBox = null;
        			EnumFacing facing = blockState.getValue(CustomTileEntityBlock.FACING);
        			switch(facing) {
        			case WEST:
        				boundingBox = new AxisAlignedBB(0.03, 0, -0.43, 0.97, 0.54, 1.47);
        				break;
        			case EAST:
        				boundingBox = new AxisAlignedBB(0.03, 0, -0.43, 0.97, 0.54, 1.47);
        				break;
        			case NORTH:
        				boundingBox = new AxisAlignedBB(-0.47, 0, 0.03, 1.44, 0.54, 0.98);
        				break;
        			case SOUTH:
        				boundingBox = new AxisAlignedBB(-0.43, 0, 0.03, 1.46, 0.54, 0.98);
        				break;
        			default:
        			}
        			return boundingBox;
        		}
        )
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.6f, 0.6f, 0.6f);
            GL11.glTranslatef(0.8f, 1.15f, 0.75f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.ROCK)
        .withName("ammo_box")
        .withModelClassName("com.paneedah.mwc.models.Ammobox1")
        .withTextureName("textures/models/ammobox.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withBoundingBox(
        		blockState -> {
        			AxisAlignedBB boundingBox = null;
        			EnumFacing facing = blockState.getValue(CustomTileEntityBlock.FACING);
        			switch(facing) {
        			case WEST:
        				boundingBox = new AxisAlignedBB(0.35, 0, 0.15, 0.7, 0.5, 0.85);
        				break;
        			case EAST:
        				boundingBox = new AxisAlignedBB(0.35, 0, 0.15, 0.7, 0.5, 0.85);
        				break;
        			case NORTH:
        				boundingBox = new AxisAlignedBB(0.15, 0, 0.35, 0.83, 0.5, 0.7);
        				break;
        			case SOUTH:
        				boundingBox = new AxisAlignedBB(0.15, 0, 0.35, 0.83, 0.5, 0.7);
        				break;
        			default:
        			}
        			return boundingBox;
        		}
        )
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.4f, 0.4f, 0.4f);
            GL11.glTranslatef(1.2f, 2.5f, 1.1f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.IRON)
        .withName("weapons_locker")
        .withModelClassName("com.paneedah.mwc.models.GunRack")
        .withTextureName("textures/models/gunrack.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.6f, 0.6f, 0.6f);
            GL11.glTranslatef(0.4f, 1.15f, 0.6f);
        })
        .build(MWC.modContext);
        
        
        new LootBoxConfiguration()
        .withMaterial(Material.IRON)
        .withName("fridge_open")
        .withModelClassName("com.paneedah.mwc.models.FridgeOpen")
        .withTextureName("textures/models/fridge.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withBoundingBox(
        		blockState -> {
        			AxisAlignedBB boundingBox = null;
        			EnumFacing facing = blockState.getValue(CustomTileEntityBlock.FACING);
        			switch(facing) {
        			case WEST:
        				boundingBox = new AxisAlignedBB(0, 0, 0, 1, 2, 1);
        				break;
        			case EAST:
        				boundingBox = new AxisAlignedBB(0, 0, 0, 1, 2, 1);
        				break;
        			case NORTH:
        				boundingBox = new AxisAlignedBB(0, 0, 0, 1, 2, 1);
        				break;
        			case SOUTH:
        				boundingBox = new AxisAlignedBB(0, 0, 0, 1, 2, 1);
        				break;
        			default:
        			}
        			return boundingBox;
        		}
        )
        .withPositioning(tileEntity -> {
            GL11.glTranslatef(0.55f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.IRON)
        .withName("fridge_closed")
        .withModelClassName("com.paneedah.mwc.models.FridgeClosed")
        .withTextureName("textures/models/fridge.png")
        .withCreativeTab(MWC.PROPS_TAB)
                .withBoundingBox(
        		blockState -> {
        			AxisAlignedBB boundingBox = null;
        			EnumFacing facing = blockState.getValue(CustomTileEntityBlock.FACING);
        			switch(facing) {
        			case WEST:
        				boundingBox = new AxisAlignedBB(0, 0, 0, 1, 2, 1);
        				break;
        			case EAST:
        				boundingBox = new AxisAlignedBB(0, 0, 0, 1, 2, 1);
        				break;
        			case NORTH:
        				boundingBox = new AxisAlignedBB(0, 0, 0, 1, 2, 1);
        				break;
        			case SOUTH:
        				boundingBox = new AxisAlignedBB(0, 0, 0, 1, 2, 1);
        				break;
        			default:
        			}
        			return boundingBox;
        		}
        )
        .withPositioning(tileEntity -> {
            GL11.glTranslatef(0.55f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.IRON)
        .withName("artillery_PROP")
        .withModelClassName("com.paneedah.mwc.models.ArtilleryProp20")
        .withTextureName("textures/models/artilleryprop.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0.55f, 0.6f, 0.55f);
            GL11.glRotatef(90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.WOOD)
        .withName("supply_drop")
        .withModelClassName("com.paneedah.mwc.models.SupplyDrop")
        .withTextureName("textures/models/supplydrop.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.5f, 0.5f, 0.5f);
            GL11.glTranslatef(0.2f, 1.63f, 1.7f);
            GL11.glRotatef(90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.ROCK)
        .withName("medical_crate")
        .withModelClassName("com.paneedah.mwc.models.MedicalCrate")
        .withTextureName("textures/models/medicalcrate.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.6f, 0.6f, 0.6f);
            GL11.glTranslatef(0.7f, 1.13f, 0.5f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.ROCK)
        .withName("locker")
        .withModelClassName("com.paneedah.mwc.models.Locker")
        .withTextureName("textures/models/locker.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withBoundingBox(
        		blockState -> {
        			AxisAlignedBB boundingBox = null;
        			EnumFacing facing = blockState.getValue(CustomTileEntityBlock.FACING);
        			switch(facing) {
        			case WEST:
        				boundingBox = new AxisAlignedBB(0, 0, 0, 1, 2, 1);
        				break;
        			case EAST:
        				boundingBox = new AxisAlignedBB(0, 0, 0, 1, 2, 1);
        				break;
        			case NORTH:
        				boundingBox = new AxisAlignedBB(0, 0, 0, 1, 2, 1);
        				break;
        			case SOUTH:
        				boundingBox = new AxisAlignedBB(0, 0, 0, 1, 2, 1);
        				break;
        			default:
        			}
        			return boundingBox;
        		}
        )
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.5f, 0.5f, 0.5f);
            GL11.glTranslatef(0.7f, 1.85f, 1f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.ROCK)
        .withName("scp_locker")
        .withModelClassName("com.paneedah.mwc.models.SCPLocker")
        .withTextureName("textures/models/scplocker.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withBoundingBox(
        		blockState -> {
        			AxisAlignedBB boundingBox = null;
        			EnumFacing facing = blockState.getValue(CustomTileEntityBlock.FACING);
        			switch(facing) {
        			case WEST:
        				boundingBox = new AxisAlignedBB(0, 0, 0, 1, 2, 1);
        				break;
        			case EAST:
        				boundingBox = new AxisAlignedBB(0, 0, 0, 1, 2, 1);
        				break;
        			case NORTH:
        				boundingBox = new AxisAlignedBB(0, 0, 0, 1, 2, 1);
        				break;
        			case SOUTH:
        				boundingBox = new AxisAlignedBB(0, 0, 0, 1, 2, 1);
        				break;
        			default:
        			}
        			return boundingBox;
        		}
        )
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0.5f, 0.45f, 0.6f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        
        new LootBoxConfiguration()
        .withMaterial(Material.IRON)
        .withName("barrel")
        .withModelClassName("com.paneedah.mwc.models.Barrel")
        .withTextureName("textures/models/barrel.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
        	GL11.glScalef(0.9f, 0.8f, 0.9f);
            GL11.glTranslatef(0.55f, 0.4f, 0.55f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.IRON)
        .withName("explosive_barrel")
        .withModelClassName("com.paneedah.mwc.models.Barrel")
        .withTextureName("textures/models/barrel_explosive.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
        	GL11.glScalef(0.9f, 0.8f, 0.9f);
            GL11.glTranslatef(0.55f, 0.4f, 0.55f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.ROCK)
        .withName("pc")
        .withModelClassName("com.paneedah.mwc.models.PC")
        .withTextureName("textures/models/pc.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.9f, 0.9f, 0.9f);
            GL11.glTranslatef(0.7f, 0.25f, 0.6f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.ROCK)
        .withName("laptop")
        .withModelClassName("com.paneedah.mwc.models.Laptop")
        .withTextureName("textures/models/pc.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.7f, 0.7f, 0.7f);
            GL11.glTranslatef(0.5f, 0.71f, 0.6f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.ROCK)
        .withName("monitor")
        .withModelClassName("com.paneedah.mwc.models.Monitor")
        .withTextureName("textures/models/pc.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.9f, 0.9f, 0.9f);
            GL11.glTranslatef(0.7f, 0.25f, 0.6f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.IRON)
        .withName("filingcabinet")
        .withModelClassName("com.paneedah.mwc.models.FilingCabinet")
        .withTextureName("textures/models/filingcabinetopened.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.IRON)
        .withName("filingcabinet_opened")
        .withModelClassName("com.paneedah.mwc.models.FilingCabinetOpened")
        .withTextureName("textures/models/filingcabinetopened.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.ROCK)
        .withName("shelf_right")
        .withModelClassName("com.paneedah.mwc.models.ShelfRight")
        .withTextureName("textures/models/shelf.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.ROCK)
        .withName("shelf_left")
        .withModelClassName("com.paneedah.mwc.models.ShelfLeft")
        .withTextureName("textures/models/shelf.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.ROCK)
        .withName("shelf_top")
        .withModelClassName("com.paneedah.mwc.models.ShelfTop")
        .withTextureName("textures/models/shelf.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.ROCK)
        .withName("tv")
        .withModelClassName("com.paneedah.mwc.models.TV")
        .withTextureName("textures/models/tv.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.ROCK)
        .withName("ceiling_tv")
        .withModelClassName("com.paneedah.mwc.models.CeilingTV")
        .withTextureName("textures/models/ceilingtv.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0.4f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.ROCK)
        .withName("ceiling_tv_rotated")
        .withModelClassName("com.paneedah.mwc.models.CeilingTV")
        .withTextureName("textures/models/ceilingtv.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.6f, 0.4f, 0.7f);
            GL11.glRotatef(-135F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.ROCK)
        .withName("office_chair")
        .withModelClassName("com.paneedah.mwc.models.OfficeChair2")
        .withTextureName("textures/models/officechair.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.ROCK)
        .withName("office_chair_2")
        .withModelClassName("com.paneedah.mwc.models.OfficeChair")
        .withTextureName("textures/models/officechair.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.WOOD)
        .withName("desk_corner")
        .withModelClassName("com.paneedah.mwc.models.DeskCorner")
        .withTextureName("textures/models/desk.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1.07f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.WOOD)
        .withName("desk_corner_alt1")
        .withModelClassName("com.paneedah.mwc.models.DeskCornerAlt1")
        .withTextureName("textures/models/desk.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1.07f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.WOOD)
        .withName("desk_left")
        .withModelClassName("com.paneedah.mwc.models.DeskLeft")
        .withTextureName("textures/models/desk.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.WOOD)
        .withName("desk_left_alt1")
        .withModelClassName("com.paneedah.mwc.models.DeskLeftAlt1")
        .withTextureName("textures/models/desk.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.WOOD)
        .withName("desk_middle")
        .withModelClassName("com.paneedah.mwc.models.DeskMiddle")
        .withTextureName("textures/models/desk.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.WOOD)
        .withName("desk_middle_alt1")
        .withModelClassName("com.paneedah.mwc.models.DeskMiddleAlt1")
        .withTextureName("textures/models/deskmiddlealt1.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.WOOD)
        .withName("desk_right")
        .withModelClassName("com.paneedah.mwc.models.DeskRight")
        .withTextureName("textures/models/desk.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.WOOD)
        .withName("desk_right_alt1")
        .withModelClassName("com.paneedah.mwc.models.DeskRightAlt1")
        .withTextureName("textures/models/desk.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.WOOD)
        .withName("desk_shelf")
        .withModelClassName("com.paneedah.mwc.models.DeskShelf")
        .withTextureName("textures/models/deskshelf.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.WOOD)
        .withName("desk_shelf_alt1")
        .withModelClassName("com.paneedah.mwc.models.DeskShelfAlt1")
        .withTextureName("textures/models/deskshelfalt1.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.WOOD)
        .withName("desk_shelf_alt2")
        .withModelClassName("com.paneedah.mwc.models.DeskShelfAlt2")
        .withTextureName("textures/models/deskshelf.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.WOOD)
        .withName("desk_shelf_alt3")
        .withModelClassName("com.paneedah.mwc.models.DeskShelfAlt4")
        .withTextureName("textures/models/deskshelfalt4.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.ROCK)
        .withName("barrier")
        .withModelClassName("com.paneedah.mwc.models.Barrier")
        .withTextureName("textures/models/barrier.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1.1f, 1.2f, 1f);
            GL11.glTranslatef(0.42f, -0.25f, 0.5f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.ROCK)
        .withName("barrier_rotated")
        .withModelClassName("com.paneedah.mwc.models.Barrier")
        .withTextureName("textures/models/barrier.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
        	GL11.glScalef(1.1f, 1.2f, 1.1f);
            GL11.glTranslatef(0.42f, -0.25f, 0.5f);
            GL11.glRotatef(-45F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.WOOD)
        .withName("body_bag")
        .withModelClassName("com.paneedah.mwc.models.BodyBag")
        .withTextureName("textures/models/bodybag.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.9f, 0.9f, 0.9f);
            GL11.glTranslatef(0.5f, -0.9f, 0.55f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.WOOD)
        .withName("hanging_body")
        .withModelClassName("com.paneedah.mwc.models.HangingBody")
        .withTextureName("textures/models/hangingbody.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.9f, 0.9f, 0.9f);
            GL11.glTranslatef(0.5f, 1.8f, 0.55f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.WOOD)
        .withName("impaled_body")
        .withModelClassName("com.paneedah.mwc.models.ImpaledBody")
        .withTextureName("textures/models/impaledbody.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.9f, 0.9f, 0.9f);
            GL11.glTranslatef(0.5f, 0.2f, 0.55f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.IRON)
        .withName("dumpster")
        .withModelClassName("com.paneedah.mwc.models.Dumpster")
        .withTextureName("textures/models/dumpster.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withCreativeTab(MWC.PROPS_TAB)
        .withBoundingBox(
        		blockState -> {
        			AxisAlignedBB boundingBox = null;
        			EnumFacing facing = blockState.getValue(CustomTileEntityBlock.FACING);
        			switch(facing) {
        			case WEST:
        				boundingBox = new AxisAlignedBB(0, 0, 0, 2, 1, 1);
        				break;
        			case EAST:
        				boundingBox = new AxisAlignedBB(0, 0, 0, 2, 1, 1);
        				break;
        			case NORTH:
        				boundingBox = new AxisAlignedBB(0, 0, 0, 2, 1, 1);
        				break;
        			case SOUTH:
        				boundingBox = new AxisAlignedBB(0, 0, 0, 2, 1, 1);
        				break;
        			default:
        			}
        			return boundingBox;
        		}
        )
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.9f, 0.9f, 0.9f);
            GL11.glTranslatef(0.6f, 0.2f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.WOOD)
        .withName("wooden_crate")
        .withModelClassName("com.paneedah.mwc.models.WoodenCrate")
        .withTextureName("textures/models/woodencrate.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 0.95f, 1f);
            GL11.glTranslatef(0.5f, 0.085f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.WOOD)
        .withName("wooden_crate_opened")
        .withModelClassName("com.paneedah.mwc.models.WoodenCrateOpened")
        .withTextureName("textures/models/woodencrateopened.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.ROCK)
        .withName("operating_table")
        .withModelClassName("com.paneedah.mwc.models.OperatingTable")
        .withTextureName("textures/models/operatingtable.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.ROCK)
        .withName("operating_table_alt")
        .withModelClassName("com.paneedah.mwc.models.OperatingTableAlt")
        .withTextureName("textures/models/operatingtable.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.IRON)
        .withName("forklift")
        .withModelClassName("com.paneedah.mwc.models.Forklift")
        .withTextureName("textures/models/forklift.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1.5f, 1.5f, 1.5f);
            GL11.glTranslatef(0.5f, -0.5f, 0.5f);
            GL11.glRotatef(-45F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.IRON)
        .withName("forklift_alt")
        .withModelClassName("com.paneedah.mwc.models.ForkLiftAlt")
        .withTextureName("textures/models/forkliftalt.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-45F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.IRON)
        .withName("trusses")
        .withModelClassName("com.paneedah.mwc.models.Trusses")
        .withTextureName("textures/models/trusses.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.IRON)
        .withName("ceiling_lamp")
        .withModelClassName("com.paneedah.mwc.models.CeilingLamp")
        .withTextureName("textures/models/ceilinglamp.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 1.8f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.IRON)
        .withName("ceiling_lamp_alt")
        .withModelClassName("com.paneedah.mwc.models.CeilingLampAlt")
        .withTextureName("textures/models/ceilinglampalt.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, -0.2f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.IRON)
        .withName("vent")
        .withModelClassName("com.paneedah.mwc.models.Vent")
        .withTextureName("textures/models/vent.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.IRON)
        .withName("vent_rotated")
        .withModelClassName("com.paneedah.mwc.models.Vent")
        .withTextureName("textures/models/vent.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 1f, 1.5f);
            GL11.glRotatef(-90F, 1f, 0f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.IRON)
        .withName("vent_corner")
        .withModelClassName("com.paneedah.mwc.models.VentCorner")
        .withTextureName("textures/models/vent.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.IRON)
        .withName("vent_corner_rotated")
        .withModelClassName("com.paneedah.mwc.models.VentCorner")
        .withTextureName("textures/models/vent.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 1f, 1.5f);
            GL11.glRotatef(-90F, 1f, 0f, 0f);
        })
        .build(MWC.modContext);

        new LootBoxConfiguration()
        .withMaterial(Material.IRON)
        .withName("vent_corner_rotated_alt")
        .withModelClassName("com.paneedah.mwc.models.VentCorner")
        .withTextureName("textures/models/vent.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 1f, -0.5f);
            GL11.glRotatef(90F, 1f, 0f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.IRON)
        .withName("vent_intersection")
        .withModelClassName("com.paneedah.mwc.models.VentIntersection")
        .withTextureName("textures/models/vent.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.IRON)
        .withName("vent_end")
        .withModelClassName("com.paneedah.mwc.models.VentEnd")
        .withTextureName("textures/models/vent.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.IRON)
        .withName("white_desk_left")
        .withModelClassName("com.paneedah.mwc.models.WhiteDeskLeft")
        .withTextureName("textures/models/shelf.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.IRON)
        .withName("white_desk_middle")
        .withModelClassName("com.paneedah.mwc.models.WhiteDeskMiddle")
        .withTextureName("textures/models/shelf.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.IRON)
        .withName("white_desk_right")
        .withModelClassName("com.paneedah.mwc.models.WhiteDeskRight")
        .withTextureName("textures/models/shelf.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.IRON)
        .withName("trash_bin")
        .withModelClassName("com.paneedah.mwc.models.TrashBin")
        .withTextureName("textures/models/trashbin.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-45F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.ROCK)
        .withName("caution_sign")
        .withModelClassName("com.paneedah.mwc.models.CautionSign")
        .withTextureName("textures/models/cautionsign.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0.6f, 0.45f, 0.6f);
            GL11.glRotatef(-45F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.IRON)
        .withName("electric_box")
        .withModelClassName("com.paneedah.mwc.models.ElectricBox")
        .withTextureName("textures/models/electricbox.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0.8f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.IRON)
        .withName("electric_box_opened")
        .withModelClassName("com.paneedah.mwc.models.ElectricBoxOpened")
        .withTextureName("textures/models/electricboxopened.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
        	GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0.8f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.WOOD)
        .withName("home_chair")
        .withModelClassName("com.paneedah.mwc.models.HomeChair")
        .withTextureName("textures/models/homechair.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.WOOD)
        .withName("outdoor_chair")
        .withModelClassName("com.paneedah.mwc.models.OutdoorChair")
        .withTextureName("textures/models/outdoorchair.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.WOOD)
        .withName("home_chair_rotated")
        .withModelClassName("com.paneedah.mwc.models.HomeChair")
        .withTextureName("textures/models/homechair.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-45F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.WOOD)
        .withName("outdoor_chair_rotated")
        .withModelClassName("com.paneedah.mwc.models.OutdoorChair")
        .withTextureName("textures/models/outdoorchair.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-45F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.IRON)
        .withName("vending_machine")
        .withModelClassName("com.paneedah.mwc.models.VendingMachine")
        .withTextureName("textures/models/vendingmachine.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withBoundingBox(
        		blockState -> {
        			AxisAlignedBB boundingBox = null;
        			EnumFacing facing = blockState.getValue(CustomTileEntityBlock.FACING);
        			switch(facing) {
        			case WEST:
        				boundingBox = new AxisAlignedBB(0, 0, 0, 1, 2, 1);
        				break;
        			case EAST:
        				boundingBox = new AxisAlignedBB(0, 0, 0, 1, 2, 1);
        				break;
        			case NORTH:
        				boundingBox = new AxisAlignedBB(0, 0, 0, 1, 2, 1);
        				break;
        			case SOUTH:
        				boundingBox = new AxisAlignedBB(0, 0, 0, 1, 2, 1);
        				break;
        			default:
        			}
        			return boundingBox;
        		}
        )
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0.55f, 0.4f, 0.62f);
            GL11.glRotatef(180F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.IRON)
        .withName("ServerRackLeft")
        .withModelClassName("com.paneedah.mwc.models.ServerRackLeft")
        .withTextureName("textures/models/serverrackleft.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.IRON)
        .withName("ServerRackEmptyLeft")
        .withModelClassName("com.paneedah.mwc.models.ServerRackEmptyLeft")
        .withTextureName("textures/models/serverrackemptyright.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.IRON)
        .withName("ServerRackLeftAlt")
        .withModelClassName("com.paneedah.mwc.models.ServerRackLeftAlt")
        .withTextureName("textures/models/serverrackleftalt.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.IRON)
        .withName("ServerRackLeftAlt2")
        .withModelClassName("com.paneedah.mwc.models.ServerRackLeftAlt2")
        .withTextureName("textures/models/serverrackleftalt2.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.IRON)
        .withName("ServerRackLeftAlt3")
        .withModelClassName("com.paneedah.mwc.models.ServerRackLeftAlt3")
        .withTextureName("textures/models/serverrackleftalt3.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.IRON)
        .withName("ServerRackEmptyRight")
        .withModelClassName("com.paneedah.mwc.models.ServerRackEmptyRight")
        .withTextureName("textures/models/serverrackemptyright.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.IRON)
        .withName("ServerRackRight")
        .withModelClassName("com.paneedah.mwc.models.ServerRackRight")
        .withTextureName("textures/models/serverrackright.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.IRON)
        .withName("ServerRackRightAlt")
        .withModelClassName("com.paneedah.mwc.models.ServerRackRightAlt")
        .withTextureName("textures/models/serverrackrightalt.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.IRON)
        .withName("ServerRackTopLeft")
        .withModelClassName("com.paneedah.mwc.models.ServerRackTop")
        .withTextureName("textures/models/serverrackleft.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.IRON)
        .withName("ServerRackTopRight")
        .withModelClassName("com.paneedah.mwc.models.ServerRackTopRight")
        .withTextureName("textures/models/serverrackleft.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.IRON)
        .withName("DuelFloodLight")
        .withModelClassName("com.paneedah.mwc.models.DuelFloodLight")
        .withTextureName("textures/models/duelfloodlight.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withBoundingBox(
        		blockState -> {
        			AxisAlignedBB boundingBox = null;
        			EnumFacing facing = blockState.getValue(CustomTileEntityBlock.FACING);
        			switch(facing) {
        			case WEST:
        				boundingBox = new AxisAlignedBB(0, 0, 0, 1, 2, 1);
        				break;
        			case EAST:
        				boundingBox = new AxisAlignedBB(0, 0, 0, 1, 2, 1);
        				break;
        			case NORTH:
        				boundingBox = new AxisAlignedBB(0, 0, 0, 1, 2, 1);
        				break;
        			case SOUTH:
        				boundingBox = new AxisAlignedBB(0, 0, 0, 1, 2, 1);
        				break;
        			default:
        			}
        			return boundingBox;
        		}
        )
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.8f, 0.8f, 0.8f);
            GL11.glTranslatef(0.6f, 0.35f, 0.6f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.IRON)
        .withName("FloodLight")
        .withModelClassName("com.paneedah.mwc.models.Floodlight")
        .withTextureName("textures/models/floodlight.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.9f, 0.9f, 0.9f);
            GL11.glTranslatef(0.6f, 0.175f, 0.6f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.IRON)
        .withName("Radio_rotated")
        .withModelClassName("com.paneedah.mwc.models.Radio")
        .withTextureName("textures/models/radio.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.7f, 0.7f, 0.7f);
            GL11.glTranslatef(0.65f, 0.58f, 0.7f);
            GL11.glRotatef(-45F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.IRON)
        .withName("Radio")
        .withModelClassName("com.paneedah.mwc.models.Radio")
        .withTextureName("textures/models/radio.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withBoundingBox(
        		blockState -> {
        			AxisAlignedBB boundingBox = null;
        			EnumFacing facing = blockState.getValue(CustomTileEntityBlock.FACING);
        			switch(facing) {
        			case WEST:
        				boundingBox = new AxisAlignedBB(0.09, 0, 0.09, 0.77, 0.33, 0.93);
        				break;
        			case EAST:
        				boundingBox = new AxisAlignedBB(0.22, 0, 0.05, 0.92, 0.33, 0.9);
        				break;
        			case NORTH:
        				boundingBox = new AxisAlignedBB(0.05, 0, 0.1, 0.9, 0.33, 0.77);
        				break;
        			case SOUTH:
        				boundingBox = new AxisAlignedBB(0.1, 0, 0.23, 0.95, 0.33, 0.92);
        				break;
        			default:
        			}
        			return boundingBox;
        		}
        )    
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.7f, 0.7f, 0.7f);
            GL11.glTranslatef(0.65f, 0.58f, 0.6f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.IRON)
        .withName("camera_rotated")
        .withModelClassName("com.paneedah.mwc.models.Camera")
        .withTextureName("textures/models/camera.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0.05f, 0.6f);
            GL11.glRotatef(90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.IRON)
        .withName("propanetank")
        .withModelClassName("com.paneedah.mwc.models.PropaneTank")
        .withTextureName("textures/models/propanetank.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.6f, 0.6f, 0.6f);
            GL11.glTranslatef(0.85f, 1f, 0.85f);
            GL11.glRotatef(90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.IRON)
        .withName("towablefloodlight")
        .withModelClassName("com.paneedah.mwc.models.TowableFloodLight")
        .withTextureName("textures/models/towablefloodlight.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.3f, 0f, 0.5f);
            GL11.glRotatef(90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.SAND)
        .withName("hescobastion")
        .withModelClassName("com.paneedah.mwc.models.HescoBastion")
        .withTextureName("textures/models/hescobastion.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.SAND)
        .withName("sandbag")
        .withModelClassName("com.paneedah.mwc.models.Sandbag")
        .withTextureName("textures/models/sandbag.png")
        .withCreativeTab(MWC.PROPS_TAB)
                .withBoundingBox(
        		blockState -> {
        			AxisAlignedBB boundingBox = null;
        			EnumFacing facing = blockState.getValue(CustomTileEntityBlock.FACING);
        			switch(facing) {
        			case WEST:
        				boundingBox = new AxisAlignedBB(0, 0, 0, 1, 0.5, 1);
        				break;
        			case EAST:
        				boundingBox = new AxisAlignedBB(0, 0, 0, 1, 0.5, 1);
        				break;
        			case NORTH:
        				boundingBox = new AxisAlignedBB(0, 0, 0, 1, 0.5, 1);
        				break;
        			case SOUTH:
        				boundingBox = new AxisAlignedBB(0, 0, 0, 1, 0.5, 1);
        				break;
        			default:
        			}
        			return boundingBox;
        		}
        )
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.SAND)
        .withName("sandbagwall")
        .withModelClassName("com.paneedah.mwc.models.SandbagWall")
        .withTextureName("textures/models/sandbag.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.ROCK)
        .withName("crossgravestone")
        .withModelClassName("com.paneedah.mwc.models.CrossGravestone")
        .withTextureName("textures/models/crossgravestone.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);

        new LootBoxConfiguration()
        .withMaterial(Material.ROCK)
        .withName("crossgravestone2")
        .withModelClassName("com.paneedah.mwc.models.CrossGravestone2")
        .withTextureName("textures/models/crossgravestone2.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.ROCK)
        .withName("crossgravestone3")
        .withModelClassName("com.paneedah.mwc.models.CrossGravestone3")
        .withTextureName("textures/models/crossgravestone3.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.ROCK)
        .withName("gravestoneskull")
        .withModelClassName("com.paneedah.mwc.models.GravestoneSkull")
        .withTextureName("textures/models/gravestoneskull.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.ROCK)
        .withName("gravestone")
        .withModelClassName("com.paneedah.mwc.models.Gravestone")
        .withTextureName("textures/models/gravestone.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.WOOD)
        .withName("scarecrow")
        .withModelClassName("com.paneedah.mwc.models.Scarecrow")
        .withTextureName("textures/models/scarecrow.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withBoundingBox(0.3, 0, 0.3, 0.7, 3.5, 0.7)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.CLOTH)
        .withName("spookyghost")
        .withModelClassName("com.paneedah.mwc.models.SpookyGhost")
        .withTextureName("textures/models/spookyghost.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 1.05f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.CLOTH)
        .withName("spookyghost2")
        .withModelClassName("com.paneedah.mwc.models.SpookyGhost")
        .withTextureName("textures/models/spookyghost2.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 1.05f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.CLOTH)
        .withName("spookyghost3")
        .withModelClassName("com.paneedah.mwc.models.SpookyGhost")
        .withTextureName("textures/models/spookyghost3.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1f, 1f, 1f);
            GL11.glTranslatef(0.5f, 1.05f, 0.5f);
            GL11.glRotatef(-90F, 0f, 1f, 0f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.IRON)
        .withName("swat_truck")
        .withModelClassName("com.paneedah.mwc.models.SwatTruck")
        .withTextureName("textures/models/swattruck.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withPositioning(tileEntity -> {
            GL11.glScalef(1.5f, 1.5f, 1.5f);
            GL11.glTranslatef(0.3f, -0.45f, -1f);
        })
        .build(MWC.modContext);
        
        new LootBoxConfiguration()
        .withMaterial(Material.ROCK)
        .withName("ump45_gfl")
        .withModelClassName("com.paneedah.mwc.models.UMP45GFL")
        .withTextureName("textures/models/ump45gfl.png")
        .withCreativeTab(MWC.PROPS_TAB)
        .withBoundingBox(0.3, 0, 0.3, 0.7, 1, 0.7)
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.5f, 0.5f, 0.5f);
            GL11.glTranslatef(1f, 1.5f, 1f);
        })
        .build(MWC.modContext);
        }
}
