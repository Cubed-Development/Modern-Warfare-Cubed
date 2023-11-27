package com.paneedah.mwc.tileentities;

import com.paneedah.mwc.MWC;
import com.paneedah.weaponlib.tile.CustomTileEntityBlock;
import com.paneedah.weaponlib.tile.LootBoxConfiguration;
import dev.redstudio.redcore.utils.AABBUtil;
import net.minecraft.block.material.Material;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraftforge.fml.common.ProgressManager;
import org.lwjgl.opengl.GL11;

import java.util.ArrayDeque;

import static com.paneedah.mwc.MWC.modContext;
import static com.paneedah.mwc.utils.ModReference.ID;

public class TileEntities {

    public static void init() {
        new TurretBaseFactory().createTileEntity(modContext);

        final ArrayDeque<LootBoxConfiguration> props = new ArrayDeque<>();

        props.add(
                new LootBoxConfiguration()
                        .withMaterial(Material.ROCK)
                        .withName("weapons_case")
                        .withModelClassName("com.paneedah.mwc.models.props.GunCase")
                        .withTextureName("textures/models/props/gun_case.png")
                        .withCreativeTab(MWC.PROPS_TAB)
                        .withBoundingBox(blockState -> AABBUtil.orientAABB(facing, new AxisAlignedBB(-0.58, 0, 0.2, 1.63, 0.3, 0.8)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.6f, 0.6f, 0.6f);
                            GL11.glTranslatef(0.7f, 1.1f, 0.5f);
                        })
        );

        props.add(
                new LootBoxConfiguration()
                        .withMaterial(Material.ROCK)
                        .withName("weapons_case_small")
                        .withModelClassName("com.paneedah.mwc.models.props.GunCaseSmall")
                        .withTextureName("textures/models/props/gun_case_small.png")
                        .withCreativeTab(MWC.PROPS_TAB)
                        .withBoundingBox(blockState -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0.05, 0, 0.1, 0.9, 0.33, 0.77)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.6f, 0.6f, 0.6f);
                            GL11.glTranslatef(0.8f, 1.1f, 0.8f);
                        })
        );


        props.add(
                new LootBoxConfiguration()
                        .withMaterial(Material.ROCK)
                        .withName("russian_weapons_case")
                        .withModelClassName("com.paneedah.mwc.models.props.MilitaryCrate")
                        .withTextureName("textures/models/props/militarycrate.png")
                        .withCreativeTab(MWC.PROPS_TAB)
                        .withBoundingBox(blockState -> AABBUtil.orientAABB(facing, new AxisAlignedBB(-0.47, 0, 0.03, 1.44, 0.54, 0.98)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.6f, 0.6f, 0.6f);
                            GL11.glTranslatef(0.8f, 1.15f, 0.75f);
                        })
        );

        props.add(
                new LootBoxConfiguration()
                        .withMaterial(Material.ROCK)
                        .withName("ammo_box")
                        .withModelClassName("com.paneedah.mwc.models.props.Ammobox1")
                        .withTextureName("textures/models/props/ammobox.png")
                        .withCreativeTab(MWC.PROPS_TAB)
                        .withBoundingBox(blockState -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0.15, 0, 0.35, 0.83, 0.5, 0.7)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.4f, 0.4f, 0.4f);
                            GL11.glTranslatef(1.2f, 2.5f, 1.1f);
                        })
        );


        props.add(
                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withName("weapons_locker")
                        .withModelClassName("com.paneedah.mwc.models.props.GunRack")
                        .withTextureName("textures/models/props/gunrack.png")
                        .withCreativeTab(MWC.PROPS_TAB)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.6f, 0.6f, 0.6f);
                            GL11.glTranslatef(0.4f, 1.15f, 0.6f);
                        })
        );

        props.add(
                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withName("fridge_open")
                        .withModelClassName("com.paneedah.mwc.models.props.FridgeOpen")
                        .withTextureName("textures/models/props/fridge.png")
                        .withCreativeTab(MWC.PROPS_TAB)
                        .withBoundingBox(blockState -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 2, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glTranslatef(0.55f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        })
        );

        props.add(
                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withName("fridge_closed")
                        .withModelClassName("com.paneedah.mwc.models.props.FridgeClosed")
                        .withTextureName("textures/models/props/fridge.png")
                        .withCreativeTab(MWC.PROPS_TAB)
                        .withBoundingBox(blockState -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 2, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glTranslatef(0.55f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        })
        );

        props.add(
                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withName("artillery_prop")
                        .withModelClassName("com.paneedah.mwc.models.props.ArtilleryProp")
                        .withTextureName("textures/models/props/artilleryprop.png")
                        .withCreativeTab(MWC.PROPS_TAB)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.8f, 0.8f, 0.8f);
                            GL11.glTranslatef(0.55f, 0.6f, 0.55f);
                            GL11.glRotatef(90F, 0f, 1f, 0f);
                        })
        );

        props.add(
                new LootBoxConfiguration()
                        .withMaterial(Material.WOOD)
                        .withName("supply_drop")
                        .withModelClassName("com.paneedah.mwc.models.props.SupplyDrop")
                        .withTextureName("textures/models/props/supplydrop.png")
                        .withCreativeTab(MWC.PROPS_TAB)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.5f, 0.5f, 0.5f);
                            GL11.glTranslatef(0.2f, 1.63f, 1.7f);
                            GL11.glRotatef(90F, 0f, 1f, 0f);
                        })
        );

        props.add(
                new LootBoxConfiguration()
                        .withMaterial(Material.ROCK)
                        .withName("medical_crate")
                        .withModelClassName("com.paneedah.mwc.models.props.MedicalCrate")
                        .withTextureName("textures/models/props/medicalcrate.png")
                        .withCreativeTab(MWC.PROPS_TAB)
                        .withBoundingBox(blockState -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 0.5, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.6f, 0.6f, 0.6f);
                            GL11.glTranslatef(0.7f, 1.13f, 0.5f);
                        })
        );

        props.add(
                new LootBoxConfiguration()
                        .withMaterial(Material.ROCK)
                        .withName("locker")
                        .withModelClassName("com.paneedah.mwc.models.props.Locker")
                        .withTextureName("textures/models/props/locker.png")
                        .withCreativeTab(MWC.PROPS_TAB)
                        .withBoundingBox(blockState -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 2, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.5f, 0.5f, 0.5f);
                            GL11.glTranslatef(0.7f, 1.85f, 1f);
                        })
        );

        props.add(
                new LootBoxConfiguration()
                        .withMaterial(Material.ROCK)
                        .withName("scp_locker")
                        .withModelClassName("com.paneedah.mwc.models.props.SCPLocker")
                        .withTextureName("textures/models/props/scplocker.png")
                        .withCreativeTab(MWC.PROPS_TAB)
                        .withBoundingBox(blockState -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 2.2, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.8f, 0.8f, 0.8f);
                            GL11.glTranslatef(0.5f, 0.45f, 0.6f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        })
        );


        props.add(
                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withName("barrel")
                        .withModelClassName("com.paneedah.mwc.models.props.Barrel")
                        .withTextureName("textures/models/props/barrel.png")
                        .withCreativeTab(MWC.PROPS_TAB)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.9f, 0.8f, 0.9f);
                            GL11.glTranslatef(0.55f, 0.4f, 0.55f);
                        })
        );

        props.add(
                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withName("explosive_barrel")
                        .withModelClassName("com.paneedah.mwc.models.props.Barrel")
                        .withTextureName("textures/models/props/barrel_explosive.png")
                        .withCreativeTab(MWC.PROPS_TAB)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.9f, 0.8f, 0.9f);
                            GL11.glTranslatef(0.55f, 0.4f, 0.55f);
                        })
        );

        props.add(
                new LootBoxConfiguration()
                        .withMaterial(Material.ROCK)
                        .withName("pc")
                        .withModelClassName("com.paneedah.mwc.models.props.electronics.PC")
                        .withTextureName("textures/models/props/electronics/pc.png")
                        .withCreativeTab(MWC.PROPS_TAB)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.9f, 0.9f, 0.9f);
                            GL11.glTranslatef(0.7f, 0.25f, 0.6f);
                        })
        );

        props.add(
                new LootBoxConfiguration()
                        .withMaterial(Material.ROCK)
                        .withName("laptop")
                        .withModelClassName("com.paneedah.mwc.models.props.electronics.Laptop")
                        .withTextureName("textures/models/props/electronics/pc.png")
                        .withCreativeTab(MWC.PROPS_TAB)
                        .withBoundingBox(blockState -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 0.5, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.7f, 0.7f, 0.7f);
                            GL11.glTranslatef(0.5f, 0.71f, 0.6f);
                        })
        );

        props.add(
                new LootBoxConfiguration()
                        .withMaterial(Material.ROCK)
                        .withName("monitor")
                        .withModelClassName("com.paneedah.mwc.models.props.electronics.Monitor")
                        .withTextureName("textures/models/props/electronics/pc.png")
                        .withCreativeTab(MWC.PROPS_TAB)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.9f, 0.9f, 0.9f);
                            GL11.glTranslatef(0.7f, 0.25f, 0.6f);
                        })
        );

        props.add(
                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withName("filingcabinet")
                        .withModelClassName("com.paneedah.mwc.models.props.FilingCabinet")
                        .withTextureName("textures/models/props/filingcabinetopened.png")
                        .withCreativeTab(MWC.PROPS_TAB)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        })
        );

        props.add(
                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withName("filingcabinet_opened")
                        .withModelClassName("com.paneedah.mwc.models.props.FilingCabinetOpened")
                        .withTextureName("textures/models/props/filingcabinetopened.png")
                        .withCreativeTab(MWC.PROPS_TAB)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        })
        );

        props.add(
                new LootBoxConfiguration()
                        .withMaterial(Material.ROCK)
                        .withName("shelf_right")
                        .withModelClassName("com.paneedah.mwc.models.props.shelves.ShelfRight")
                        .withTextureName("textures/models/props/shelf.png")
                        .withCreativeTab(MWC.PROPS_TAB)
                        .withBoundingBox(blockState -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0.1, 0.2, 1, 1, 0.8)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        })
        );

        props.add(
                new LootBoxConfiguration()
                        .withMaterial(Material.ROCK)
                        .withName("shelf_left")
                        .withModelClassName("com.paneedah.mwc.models.props.shelves.ShelfLeft")
                        .withTextureName("textures/models/props/shelf.png")
                        .withCreativeTab(MWC.PROPS_TAB)
                        .withBoundingBox(blockState -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0.1, 0.2, 1, 1, 0.8)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        })
        );

        props.add(
                new LootBoxConfiguration()
                        .withMaterial(Material.ROCK)
                        .withName("shelf_top")
                        .withModelClassName("com.paneedah.mwc.models.props.shelves.ShelfTop")
                        .withTextureName("textures/models/props/shelf.png")
                        .withCreativeTab(MWC.PROPS_TAB)
                        .withBoundingBox(blockState -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0.2, 1, 0.11, 0.8)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        })
        );

        props.add(
                new LootBoxConfiguration()
                        .withMaterial(Material.ROCK)
                        .withName("tv")
                        .withModelClassName("com.paneedah.mwc.models.props.electronics.TV")
                        .withTextureName("textures/models/props/electronics/tv.png")
                        .withCreativeTab(MWC.PROPS_TAB)
                        .withBoundingBox(blockState -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 2, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        })
        );

        props.add(
                new LootBoxConfiguration()
                        .withMaterial(Material.ROCK)
                        .withName("ceiling_tv")
                        .withModelClassName("com.paneedah.mwc.models.props.electronics.CeilingTV")
                        .withTextureName("textures/models/props/electronics/ceilingtv.png")
                        .withCreativeTab(MWC.PROPS_TAB)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0.4f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        })
        );

        props.add(
                new LootBoxConfiguration()
                        .withMaterial(Material.ROCK)
                        .withName("ceiling_tv_rotated")
                        .withModelClassName("com.paneedah.mwc.models.props.electronics.CeilingTV")
                        .withTextureName("textures/models/props/electronics/ceilingtv.png")
                        .withCreativeTab(MWC.PROPS_TAB)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0.4f, 0.5f);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                        })
        );

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.ROCK)
                .withName("office_chair")
                .withModelClassName("com.paneedah.mwc.models.props.OfficeChair2")
                .withTextureName("textures/models/props/officechair.png")
                .withBoundingBox(blockState -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 0.7, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                })
        );

        props.add(
                new LootBoxConfiguration()
                        .withMaterial(Material.ROCK)
                        .withName("office_chair_2")
                        .withModelClassName("com.paneedah.mwc.models.props.OfficeChair")
                        .withTextureName("textures/models/props/officechair.png")
                        .withCreativeTab(MWC.PROPS_TAB)
                        .withBoundingBox(blockState -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 0.7, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        })
        );

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.WOOD)
                .withName("desk_corner")
                .withModelClassName("com.paneedah.mwc.models.props.desks.DeskCorner")
                .withTextureName("textures/models/props/desks/desk.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1.07f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.WOOD)
                .withName("desk_corner_alt1")
                .withModelClassName("com.paneedah.mwc.models.props.desks.DeskCornerAlt1")
                .withTextureName("textures/models/props/desks/desk.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1.07f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.WOOD)
                .withName("desk_left")
                .withModelClassName("com.paneedah.mwc.models.props.desks.DeskLeft")
                .withTextureName("textures/models/props/desks/desk.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.WOOD)
                .withName("desk_left_alt1")
                .withModelClassName("com.paneedah.mwc.models.props.desks.DeskLeftAlt1")
                .withTextureName("textures/models/props/desks/desk.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.WOOD)
                .withName("desk_middle")
                .withModelClassName("com.paneedah.mwc.models.props.desks.DeskMiddle")
                .withTextureName("textures/models/props/desks/desk.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.WOOD)
                .withName("desk_middle_alt1")
                .withModelClassName("com.paneedah.mwc.models.props.desks.DeskMiddleAlt1")
                .withTextureName("textures/models/props/desks/deskmiddlealt1.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.WOOD)
                .withName("desk_right")
                .withModelClassName("com.paneedah.mwc.models.props.desks.DeskRight")
                .withTextureName("textures/models/props/desks/desk.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.WOOD)
                .withName("desk_right_alt1")
                .withModelClassName("com.paneedah.mwc.models.props.desks.DeskRightAlt1")
                .withTextureName("textures/models/props/desks/desk.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.WOOD)
                .withName("desk_shelf")
                .withModelClassName("com.paneedah.mwc.models.props.desks.DeskShelf")
                .withTextureName("textures/models/props/desks/deskshelf.png")
                .withBoundingBox(blockState -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, .6, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.WOOD)
                .withName("desk_shelf_alt1")
                .withModelClassName("com.paneedah.mwc.models.props.desks.DeskShelfAlt1")
                .withTextureName("textures/models/props/desks/deskshelfalt1.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.WOOD)
                .withName("desk_shelf_alt2")
                .withModelClassName("com.paneedah.mwc.models.props.desks.DeskShelfAlt2")
                .withTextureName("textures/models/props/desks/deskshelf.png")
                .withBoundingBox(blockState -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, .6, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.WOOD)
                .withName("desk_shelf_alt3")
                .withModelClassName("com.paneedah.mwc.models.props.desks.DeskShelfAlt4")
                .withTextureName("textures/models/props/desks/deskshelfalt4.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.ROCK)
                .withName("barrier")
                .withModelClassName("com.paneedah.mwc.models.props.Barrier")
                .withTextureName("textures/models/props/barrier.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1.1f, 1.2f, 1f);
                    GL11.glTranslatef(0.42f, -0.25f, 0.5f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.ROCK)
                .withName("barrier_rotated")
                .withModelClassName("com.paneedah.mwc.models.props.Barrier")
                .withTextureName("textures/models/props/barrier.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1.1f, 1.2f, 1.1f);
                    GL11.glTranslatef(0.42f, -0.25f, 0.5f);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.WOOD)
                .withName("body_bag")
                .withModelClassName("com.paneedah.mwc.models.props.BodyBag")
                .withTextureName("textures/models/props/bodybag.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(0.9f, 0.9f, 0.9f);
                    GL11.glTranslatef(0.4f, 0.17F, 0.555f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.WOOD)
                .withName("hanging_body")
                .withModelClassName("com.paneedah.mwc.models.props.HangingBody")
                .withTextureName("textures/models/props/hangingbody.png")
                .withBoundingBox(blockState -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, -1, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(0.9f, 0.9f, 0.9f);
                    GL11.glTranslatef(0.5f, 1.8f, 0.55f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.WOOD)
                .withName("impaled_body")
                .withModelClassName("com.paneedah.mwc.models.props.ImpaledBody")
                .withTextureName("textures/models/props/impaledbody.png")
                .withBoundingBox(
                        blockState -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 3, 1))
                )
                .withPositioning(tileEntity -> {
                    GL11.glScalef(0.9f, 0.9f, 0.9f);
                    GL11.glTranslatef(0.5f, 0.2f, 0.55f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withName("dumpster")
                .withModelClassName("com.paneedah.mwc.models.props.Dumpster")
                .withTextureName("textures/models/props/dumpster.png")
                .withBoundingBox(
                        blockState -> AABBUtil.orientAABB(facing, new AxisAlignedBB(-1, 0, 0, 1, 1, 1))
                )
                .withPositioning(tileEntity -> {
                    GL11.glScalef(0.9f, 0.9f, 0.9f);
                    GL11.glTranslatef(0.6f, 0.2f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.WOOD)
                .withName("wooden_crate")
                .withModelClassName("com.paneedah.mwc.models.props.WoodenCrate")
                .withTextureName("textures/models/props/woodencrate.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 0.95f, 1f);
                    GL11.glTranslatef(0.5f, 0.085f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.WOOD)
                .withName("wooden_crate_opened")
                .withModelClassName("com.paneedah.mwc.models.props.WoodenCrateOpened")
                .withTextureName("textures/models/props/woodencrateopened.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.ROCK)
                .withName("operating_table")
                .withModelClassName("com.paneedah.mwc.models.props.OperatingTable")
                .withTextureName("textures/models/props/operatingtable.png")
                .withBoundingBox(blockState -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, -0.5, 1, 1, 1.5)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.ROCK)
                .withName("operating_table_alt")
                .withModelClassName("com.paneedah.mwc.models.props.OperatingTableAlt")
                .withTextureName("textures/models/props/operatingtable.png")
                .withBoundingBox(blockState -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, -0.5, 1, 1, 1.5)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withName("forklift")
                .withModelClassName("com.paneedah.mwc.models.props.Forklift")
                .withTextureName("textures/models/props/forklift.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1.5f, 1.5f, 1.5f);
                    GL11.glTranslatef(0.5f, -0.5f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withName("forklift_rotated")
                .withModelClassName("com.paneedah.mwc.models.props.Forklift")
                .withTextureName("textures/models/props/forklift.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1.5f, 1.5f, 1.5f);
                    GL11.glTranslatef(0.5f, -0.5f, 0.5f);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withName("forklift_alt")
                .withModelClassName("com.paneedah.mwc.models.props.ForkLiftAlt")
                .withTextureName("textures/models/props/forkliftalt.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withName("forklift_alt_rotated")
                .withModelClassName("com.paneedah.mwc.models.props.ForkLiftAlt")
                .withTextureName("textures/models/props/forkliftalt.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withName("trusses")
                .withModelClassName("com.paneedah.mwc.models.props.Trusses")
                .withTextureName("textures/models/props/trusses.png")
                .withBoundingBox(blockState -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0.8, 0.4, 1, 1, 0.6)))
                .withBoundingBox(blockState -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0.2, 0.4, 1, 0.4, 0.6)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withName("ceiling_lamp")
                .withModelClassName("com.paneedah.mwc.models.props.lights.CeilingLamp")
                .withTextureName("textures/models/props/lights/ceilinglamp.png")
                .withBoundingBox(blockState -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0.5, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 1.8f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withName("ceiling_lamp_alt")
                .withModelClassName("com.paneedah.mwc.models.props.lights.CeilingLampAlt")
                .withTextureName("textures/models/props/lights/ceilinglampalt.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, -0.2f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withName("vent")
                .withModelClassName("com.paneedah.mwc.models.props.vents.Vent")
                .withTextureName("textures/models/props/vent.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withName("vent_rotated")
                .withModelClassName("com.paneedah.mwc.models.props.vents.Vent")
                .withTextureName("textures/models/props/vent.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 1f, 1.5f);
                    GL11.glRotatef(-90F, 1f, 0f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withName("vent_corner")
                .withModelClassName("com.paneedah.mwc.models.props.vents.VentCorner")
                .withTextureName("textures/models/props/vent.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withName("vent_corner_rotated")
                .withModelClassName("com.paneedah.mwc.models.props.vents.VentCorner")
                .withTextureName("textures/models/props/vent.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 1f, 1.5f);
                    GL11.glRotatef(-90F, 1f, 0f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withName("vent_corner_rotated_alt")
                .withModelClassName("com.paneedah.mwc.models.props.vents.VentCorner")
                .withTextureName("textures/models/props/vent.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 1f, -0.5f);
                    GL11.glRotatef(90F, 1f, 0f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withName("vent_intersection")
                .withModelClassName("com.paneedah.mwc.models.props.vents.VentIntersection")
                .withTextureName("textures/models/props/vent.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withName("vent_end")
                .withModelClassName("com.paneedah.mwc.models.props.vents.VentEnd")
                .withTextureName("textures/models/props/vent.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withName("white_desk_left")
                .withModelClassName("com.paneedah.mwc.models.props.desks.WhiteDeskLeft")
                .withTextureName("textures/models/props/shelf.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withName("white_desk_middle")
                .withModelClassName("com.paneedah.mwc.models.props.desks.WhiteDeskMiddle")
                .withTextureName("textures/models/props/shelf.png")
                .withBoundingBox(blockState -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0.95, 0, 1, 1, 0.8)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withName("white_desk_right")
                .withModelClassName("com.paneedah.mwc.models.props.desks.WhiteDeskRight")
                .withTextureName("textures/models/props/shelf.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withName("trash_bin")
                .withModelClassName("com.paneedah.mwc.models.props.TrashBin")
                .withTextureName("textures/models/props/trashbin.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.ROCK)
                .withName("caution_sign")
                .withModelClassName("com.paneedah.mwc.models.props.CautionSign")
                .withTextureName("textures/models/props/cautionsign.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(0.8f, 0.8f, 0.8f);
                    GL11.glTranslatef(0.6f, 0.45f, 0.6f);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withName("electric_box")
                .withModelClassName("com.paneedah.mwc.models.props.electronics.ElectricBox")
                .withTextureName("textures/models/props/electronics/electricbox.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0.8f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withName("electric_box_opened")
                .withModelClassName("com.paneedah.mwc.models.props.electronics.ElectricBoxOpened")
                .withTextureName("textures/models/props/electronics/electricboxopened.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0.8f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.WOOD)
                .withName("home_chair")
                .withModelClassName("com.paneedah.mwc.models.props.HomeChair")
                .withTextureName("textures/models/props/homechair.png")
                .withBoundingBox(blockState -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 0.7, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.WOOD)
                .withName("outdoor_chair")
                .withModelClassName("com.paneedah.mwc.models.props.OutdoorChair")
                .withTextureName("textures/models/props/outdoorchair.png")
                .withBoundingBox(blockState -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 0.7, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.WOOD)
                .withName("home_chair_rotated")
                .withModelClassName("com.paneedah.mwc.models.props.HomeChair")
                .withTextureName("textures/models/props/homechair.png")
                .withBoundingBox(blockState -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 0.7, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.WOOD)
                .withName("outdoor_chair_rotated")
                .withModelClassName("com.paneedah.mwc.models.props.OutdoorChair")
                .withTextureName("textures/models/props/outdoorchair.png")
                .withBoundingBox(blockState -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 0.7, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withName("vending_machine")
                .withModelClassName("com.paneedah.mwc.models.props.electronics.VendingMachine")
                .withTextureName("textures/models/props/electronics/vendingmachine.png")
                .withBoundingBox(blockState -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0.1, 1, 2, 0.8)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(0.8f, 0.8f, 0.8f);
                    GL11.glTranslatef(0.55f, 0.4f, 0.62f);
                    GL11.glRotatef(180F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withName("ServerRackLeft")
                .withModelClassName("com.paneedah.mwc.models.props.servers.ServerRackLeft")
                .withTextureName("textures/models/props/servers/serverrackleft.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withName("ServerRackEmptyLeft")
                .withModelClassName("com.paneedah.mwc.models.props.servers.ServerRackEmptyLeft")
                .withTextureName("textures/models/props/servers/serverrackemptyright.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withName("ServerRackLeftAlt")
                .withModelClassName("com.paneedah.mwc.models.props.servers.ServerRackLeftAlt")
                .withTextureName("textures/models/props/servers/serverrackleftalt.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withName("ServerRackLeftAlt2")
                .withModelClassName("com.paneedah.mwc.models.props.servers.ServerRackLeftAlt2")
                .withTextureName("textures/models/props/servers/serverrackleftalt2.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withName("ServerRackLeftAlt3")
                .withModelClassName("com.paneedah.mwc.models.props.servers.ServerRackLeftAlt3")
                .withTextureName("textures/models/props/servers/serverrackleftalt3.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withName("ServerRackEmptyRight")
                .withModelClassName("com.paneedah.mwc.models.props.servers.ServerRackEmptyRight")
                .withTextureName("textures/models/props/servers/serverrackemptyright.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withName("ServerRackRight")
                .withModelClassName("com.paneedah.mwc.models.props.servers.ServerRackRight")
                .withTextureName("textures/models/props/servers/serverrackright.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withName("ServerRackRightAlt")
                .withModelClassName("com.paneedah.mwc.models.props.servers.ServerRackRightAlt")
                .withTextureName("textures/models/props/servers/serverrackrightalt.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withName("ServerRackTopLeft")
                .withModelClassName("com.paneedah.mwc.models.props.servers.ServerRackTop")
                .withTextureName("textures/models/props/servers/serverrackleft.png")
                .withBoundingBox(blockState -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 0.3, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withName("ServerRackTopRight")
                .withModelClassName("com.paneedah.mwc.models.props.servers.ServerRackTopRight")
                .withTextureName("textures/models/props/servers/serverrackleft.png")
                .withBoundingBox(blockState -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 0.3, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withName("duelfloodlight")
                .withModelClassName("com.paneedah.mwc.models.props.lights.DuelFloodlight")
                .withTextureName("textures/models/props/lights/duelfloodlight.png")
                .withBoundingBox(blockState -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1.7, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(0.8f, 0.8f, 0.8f);
                    GL11.glTranslatef(0.65f, 0.35f, 0.65f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withName("duelfloodlight_rotated")
                .withModelClassName("com.paneedah.mwc.models.props.lights.DuelFloodlight")
                .withTextureName("textures/models/props/lights/duelfloodlight.png")
                .withBoundingBox(blockState -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1.7, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(0.8f, 0.8f, 0.8f);
                    GL11.glTranslatef(0.65f, 0.35f, 0.65f);
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withName("floodlight")
                .withModelClassName("com.paneedah.mwc.models.props.lights.Floodlight")
                .withTextureName("textures/models/props/lights/floodlight.png")
                .withBoundingBox(blockState -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 0.75, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(0.9f, 0.9f, 0.9f);
                    GL11.glTranslatef(0.55f, 0.175f, 0.55f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withName("floodlight_rotated")
                .withModelClassName("com.paneedah.mwc.models.props.lights.Floodlight")
                .withTextureName("textures/models/props/lights/floodlight.png")
                .withBoundingBox(blockState -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 0.75, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(0.9f, 0.9f, 0.9f);
                    GL11.glTranslatef(0.55f, 0.175f, 0.55f);
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withName("Radio_rotated")
                .withModelClassName("com.paneedah.mwc.models.props.electronics.Radio")
                .withTextureName("textures/models/props/electronics/radio.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(0.7f, 0.7f, 0.7f);
                    GL11.glTranslatef(0.65f, 0.58f, 0.7f);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withName("Radio")
                .withModelClassName("com.paneedah.mwc.models.props.electronics.Radio")
                .withTextureName("textures/models/props/electronics/radio.png")
                .withBoundingBox(blockState -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0.05, 0, 0.1, 0.9, 0.33, 0.77)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(0.7f, 0.7f, 0.7f);
                    GL11.glTranslatef(0.65f, 0.58f, 0.6f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withName("camera_rotated")
                .withModelClassName("com.paneedah.mwc.models.props.electronics.Camera")
                .withTextureName("textures/models/props/electronics/camera.png")
                .withBoundingBox(0, 0, 0, 1, 0.8, 1)
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0.05f, 0.6f);
                    GL11.glRotatef(90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withName("propanetank")
                .withModelClassName("com.paneedah.mwc.models.props.PropaneTank")
                .withTextureName("textures/models/props/propanetank.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(0.6f, 0.6f, 0.6f);
                    GL11.glTranslatef(0.85f, 1f, 0.85f);
                    GL11.glRotatef(90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withName("towablefloodlight")
                .withModelClassName("com.paneedah.mwc.models.props.lights.TowableFloodLight")
                .withTextureName("textures/models/props/lights/towablefloodlight.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.3f, 0f, 0.5f);
                    GL11.glRotatef(90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.SAND)
                .withName("sandbag")
                .withModelClassName("com.paneedah.mwc.models.props.Sandbag")
                .withTextureName("textures/models/props/sandbag.png")
                .withBoundingBox(blockState -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 0.5, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.SAND)
                .withName("sandbagwall")
                .withModelClassName("com.paneedah.mwc.models.props.SandbagWall")
                .withTextureName("textures/models/props/sandbag.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.ROCK)
                .withName("crossgravestone")
                .withModelClassName("com.paneedah.mwc.models.props.gravestones.CrossGravestone")
                .withTextureName("textures/models/props/gravestone/crossgravestone.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.ROCK)
                .withName("crossgravestone2")
                .withModelClassName("com.paneedah.mwc.models.props.gravestones.CrossGravestone2")
                .withTextureName("textures/models/props/gravestone/crossgravestone2.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.ROCK)
                .withName("crossgravestone3")
                .withModelClassName("com.paneedah.mwc.models.props.gravestones.CrossGravestone3")
                .withTextureName("textures/models/props/gravestone/crossgravestone3.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.ROCK)
                .withName("gravestoneskull")
                .withModelClassName("com.paneedah.mwc.models.props.gravestones.GravestoneSkull")
                .withTextureName("textures/models/props/gravestone/gravestoneskull.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.ROCK)
                .withName("gravestone")
                .withModelClassName("com.paneedah.mwc.models.props.gravestones.Gravestone")
                .withTextureName("textures/models/props/gravestone/gravestone.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.WOOD)
                .withName("scarecrow")
                .withModelClassName("com.paneedah.mwc.models.props.Scarecrow")
                .withTextureName("textures/models/props/scarecrow.png")
                .withBoundingBox(0.3, 0, 0.3, 0.7, 3.5, 0.7)
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.CLOTH)
                .withName("spookyghost")
                .withModelClassName("com.paneedah.mwc.models.props.SpookyGhost")
                .withTextureName("textures/models/props/ghost/spookyghost.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 1.05f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.CLOTH)
                .withName("spookyghost2")
                .withModelClassName("com.paneedah.mwc.models.props.SpookyGhost")
                .withTextureName("textures/models/props/ghost/spookyghost2.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 1.05f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.CLOTH)
                .withName("spookyghost3")
                .withModelClassName("com.paneedah.mwc.models.props.SpookyGhost")
                .withTextureName("textures/models/props/ghost/spookyghost3.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 1.05f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withName("swat_truck")
                .withModelClassName("com.paneedah.mwc.models.props.SwatTruck")
                .withTextureName("textures/models/props/swattruck.png")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1.5f, 1.5f, 1.5f);
                    GL11.glTranslatef(0.3f, -0.45f, -1f);
                }));

        final ProgressManager.ProgressBar propsProgressBar = ProgressManager.push("Building Props", props.size());

        for (final LootBoxConfiguration lootBoxConfiguration : props) {
            propsProgressBar.step(I18n.format("tile." + ID + "_" + lootBoxConfiguration.getName() + ".name"));

            lootBoxConfiguration
                    .withCreativeTab(MWC.PROPS_TAB)
                    .build(modContext);
        }

        ProgressManager.pop(propsProgressBar);
    }
}
