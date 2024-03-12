package com.paneedah.mwc.tileentities;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.props.*;
import com.paneedah.mwc.models.props.desks.*;
import com.paneedah.mwc.models.props.electronics.*;
import com.paneedah.mwc.models.props.gravestones.*;
import com.paneedah.mwc.models.props.lights.*;
import com.paneedah.mwc.models.props.servers.*;
import com.paneedah.mwc.models.props.shelves.ShelfLeft;
import com.paneedah.mwc.models.props.shelves.ShelfRight;
import com.paneedah.mwc.models.props.shelves.ShelfTop;
import com.paneedah.mwc.models.props.vents.Vent;
import com.paneedah.mwc.models.props.vents.VentCorner;
import com.paneedah.mwc.models.props.vents.VentEnd;
import com.paneedah.mwc.models.props.vents.VentIntersection;
import com.paneedah.mwc.rendering.Transform;
import com.paneedah.weaponlib.tile.LootBoxConfiguration;
import dev.redstudio.redcore.utils.AABBUtil;
import net.minecraft.block.material.Material;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraftforge.fml.common.ProgressManager;
import org.lwjgl.opengl.GL11;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

import static com.paneedah.mwc.MWC.modContext;
import static com.paneedah.mwc.utils.ModReference.ID;
import static com.paneedah.mwc.utils.ModReference.LOG;

public class TileEntities {

    public static void init() {
        new TurretBaseFactory().createTileEntity(modContext);

        final Queue<LootBoxConfiguration> props = new ArrayDeque<>(Arrays.asList(

                new LootBoxConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("weapons_case")
                        .withModel(new GunCase(), "gun_case")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(-0.65, 0, 0.15, 1.7, 0.3, 0.9)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.6f, 0.6f, 0.6f);
                            GL11.glTranslatef(0.7f, 1.1f, 0.5f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("weapons_case_small")
                        .withModel(new GunCaseSmall(), "gun_case_small")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0.05, 0, 0.1, 0.9, 0.33, 0.77)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.6f, 0.6f, 0.6f);
                            GL11.glTranslatef(0.8f, 1.1f, 0.8f);
                        }),


                new LootBoxConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("russian_weapons_case")
                        .withModel(new MilitaryCrate(), "militarycrate")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(-0.47, 0, 0.03, 1.44, 0.54, 0.98)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.6f, 0.6f, 0.6f);
                            GL11.glTranslatef(0.8f, 1.15f, 0.75f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("ammo_box")
                        .withModel(new Ammobox1(), "ammobox")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0.15, 0, 0.35, 0.83, 0.5, 0.7)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.4f, 0.4f, 0.4f);
                            GL11.glTranslatef(1.2f, 2.5f, 1.1f);
                        }),


                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("weapons_locker")
                        .withModel(new GunRack(), "gunrack")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(-0.375, 0, 0.05, 1.45, 1.825, 0.7)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.6f, 0.6f, 0.6f);
                            GL11.glTranslatef(0.4f, 1.15f, 0.6f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("fridge_open")
                        .withModel(new FridgeOpen(), "fridge")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0.06, 0, 0.075, 0.94, 2.06, 1.02)))
                        .withPositioning(tileEntity -> {
                            GL11.glTranslatef(0.55f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("fridge_closed")
                        .withModel(new FridgeClosed(), "fridge")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0.06, 0, 0.075, 0.94, 2.06, 1.02)))
                        .withPositioning(tileEntity -> {
                            GL11.glTranslatef(0.55f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("artillery_prop")
                        .withModel(new ArtilleryProp(), "artilleryprop")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(-0.3, 0, 0.1, 1.3, 1.5, 1.6)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.8f, 0.8f, 0.8f);
                            GL11.glTranslatef(0.55f, 0.6f, 0.55f);
                            GL11.glRotatef(90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.WOOD)
                        .withHardness(2)
                        .withName("supply_drop")
                        .withModel(new SupplyDrop(), "supplydrop")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(-0.3, 0, -0.6, 1.3, 1.2, 1.6)))
                        .withTransform(Transform.getZero()
                                .withScale(0.5F, 0.5F, 0.5F)
                                .withPosition(0, 0.75F, 0))
                        .modern(),

                new LootBoxConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("medical_crate")
                        .withModel(new MedicalCrate(), "medicalcrate")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 0.5, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.6f, 0.6f, 0.6f);
                            GL11.glTranslatef(0.7f, 1.13f, 0.5f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("locker")
                        .withModel(new Locker(), "locker")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 2, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.5f, 0.5f, 0.5f);
                            GL11.glTranslatef(0.7f, 1.85f, 1f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("scp_locker")
                        .withModel(new SCPLocker(), "scplocker")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 2, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.8f, 0.8f, 0.8f);
                            GL11.glTranslatef(0.5f, 0.45f, 0.6f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("barrel")
                        .withModel(new Barrel(), "barrel")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0.125, 0, 0.125, 0.875, 1, 0.875)))
                        .withTransform(Transform.getZero()
                                .withPosition(0, 0.375F, 0)
                                .withScale(0.75F, 0.75F, 0.75F))
                        .modern(),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("explosive_barrel")
                        .withModel(new Barrel(), "barrel_explosive")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0.125, 0, 0.125, 0.875, 1, 0.875)))
                        .withTransform(Transform.getZero()
                                .withPosition(0, 0.375F, 0)
                                .withScale(0.75F, 0.75F, 0.75F))
                        .modern(),

                new LootBoxConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("pc")
                        .withModel(new PC(), "electronics/pc")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.9f, 0.9f, 0.9f);
                            GL11.glTranslatef(0.7f, 0.25f, 0.6f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("laptop")
                        .withModel(new Laptop(), "electronics/pc")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 0.5, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.7f, 0.7f, 0.7f);
                            GL11.glTranslatef(0.5f, 0.71f, 0.6f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("monitor")
                        .withModel(new Monitor(), "electronics/pc")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.9f, 0.9f, 0.9f);
                            GL11.glTranslatef(0.7f, 0.25f, 0.6f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("filingcabinet")
                        .withModel(new FilingCabinet(), "filingcabinetopened")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("filingcabinet_opened")
                        .withModel(new FilingCabinetOpened(), "filingcabinetopened")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("shelf_right")
                        .withModel(new ShelfRight(), "shelf")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("shelf_left")
                        .withModel(new ShelfLeft(), "shelf")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("shelf_top")
                        .withModel(new ShelfTop(), "shelf")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 0.2, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("tv")
                        .withModel(new TV(), "electronics/tv")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 2, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("ceiling_tv")
                        .withModel(new CeilingTV(), "electronics/ceilingtv")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0.4f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("ceiling_tv_rotated")
                        .withModel(new CeilingTV(), "electronics/ceilingtv")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0.4f, 0.5f);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("office_chair")
                        .withModel(new OfficeChair2(), "officechair")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 0.7, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("office_chair_2")
                        .withModel(new OfficeChair(), "officechair")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 0.7, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.WOOD)
                        .withHardness(2)
                        .withName("desk_corner")
                        .withModel(new DeskCorner(), "desks/desk")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1.07f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.WOOD)
                        .withHardness(2)
                        .withName("desk_corner_alt1")
                        .withModel(new DeskCornerAlt1(), "desks/desk")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1.07f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.WOOD)
                        .withHardness(2)
                        .withName("desk_left")
                        .withModel(new DeskLeft(), "desks/desk")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.WOOD)
                        .withHardness(2)
                        .withName("desk_left_alt1")
                        .withModel(new DeskLeftAlt1(), "desks/desk")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.WOOD)
                        .withHardness(2)
                        .withName("desk_middle")
                        .withModel(new DeskMiddle(), "desks/desk")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.WOOD)
                        .withHardness(2)
                        .withName("desk_middle_alt1")
                        .withModel(new DeskMiddleAlt1(), "desks/deskmiddlealt1")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.WOOD)
                        .withHardness(2)
                        .withName("desk_right")
                        .withModel(new DeskRight(), "desks/desk")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.WOOD)
                        .withHardness(2)
                        .withName("desk_right_alt1")
                        .withModel(new DeskRightAlt1(), "desks/desk")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.WOOD)
                        .withHardness(2)
                        .withName("desk_shelf")
                        .withModel(new DeskShelf(), "desks/deskshelf")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, .6, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.WOOD)
                        .withHardness(2)
                        .withName("desk_shelf_alt1")
                        .withModel(new DeskShelfAlt1(), "desks/deskshelfalt1")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.WOOD)
                        .withHardness(2)
                        .withName("desk_shelf_alt2")
                        .withModel(new DeskShelfAlt2(), "desks/deskshelf")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, .6, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.WOOD)
                        .withHardness(2)
                        .withName("desk_shelf_alt3")
                        .withModel(new DeskShelfAlt3(), "desks/deskshelfalt3")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("barrier")
                        .withModel(new Barrier(), "barrier")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1.1f, 1.2f, 1f);
                            GL11.glTranslatef(0.42f, -0.25f, 0.5f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("barrier_rotated")
                        .withModel(new Barrier(), "barrier")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1.1f, 1.2f, 1.1f);
                            GL11.glTranslatef(0.42f, -0.25f, 0.5f);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.WOOD)
                        .withHardness(2)
                        .withName("body_bag")
                        .withModel(new BodyBag(), "bodybag")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.9f, 0.9f, 0.9f);
                            GL11.glTranslatef(0.4f, 0.17F, 0.555f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.WOOD)
                        .withHardness(2)
                        .withName("hanging_body")
                        .withModel(new HangingBody(), "hangingbody")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, -1, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.9f, 0.9f, 0.9f);
                            GL11.glTranslatef(0.5f, 1.8f, 0.55f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.WOOD)
                        .withHardness(2)
                        .withName("impaled_body")
                        .withModel(new ImpaledBody(), "impaledbody")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 3, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.9f, 0.9f, 0.9f);
                            GL11.glTranslatef(0.5f, 0.2f, 0.55f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("dumpster")
                        .withModel(new Dumpster(), "dumpster")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(-1.01, 0, 0.1, 1.01, 1.3, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.9f, 0.9f, 0.9f);
                            GL11.glTranslatef(0.6f, 0.2f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.WOOD)
                        .withHardness(2)
                        .withName("wooden_crate")
                        .withModel(new WoodenCrate(), "wooden_crate")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1.06, 1)))
                        .modern(),

                new LootBoxConfiguration()
                        .withMaterial(Material.WOOD)
                        .withHardness(2)
                        .withName("wooden_crate_opened")
                        .withModel(new WoodenCrateOpened(), "wooden_crate_opened")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1.06, 1)))
                        .modern(),

                new LootBoxConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("operating_table")
                        .withModel(new OperatingTable(), "operatingtable")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, -0.5, 1, 1.1, 1.5)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("operating_table_alt")
                        .withModel(new OperatingTableAlt(), "operatingtable")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, -0.5, 1, 1, 1.5)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("forklift")
                        .withModel(new Forklift(), "forklift")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1.5f, 1.5f, 1.5f);
                            GL11.glTranslatef(0.5f, -0.5f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("forklift_rotated")
                        .withModel(new Forklift(), "forklift")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1.5f, 1.5f, 1.5f);
                            GL11.glTranslatef(0.5f, -0.5f, 0.5f);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("forklift_alt")
                        .withModel(new ForkLiftAlt(), "forkliftalt")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("forklift_alt_rotated")
                        .withModel(new ForkLiftAlt(), "forkliftalt")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("trusses")
                        .withModel(new Trusses(), "trusses")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0.2, 0.4, 1, 0.4, 0.6)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("ceiling_lamp")
                        .withModel(new CeilingLamp(), "lights/ceilinglamp")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0.5, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 1.8f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("ceiling_lamp_alt")
                        .withModel(new CeilingLampAlt(), "lights/ceilinglampalt")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, -0.2f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("vent")
                        .withModel(new Vent(), "vent")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("vent_rotated")
                        .withModel(new Vent(), "vent")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 1f, 1.5f);
                            GL11.glRotatef(-90F, 1f, 0f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("vent_corner")
                        .withModel(new VentCorner(), "vent")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("vent_corner_rotated")
                        .withModel(new VentCorner(), "vent")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 1f, 1.5f);
                            GL11.glRotatef(-90F, 1f, 0f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("vent_corner_rotated_alt")
                        .withModel(new VentCorner(), "vent")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 1f, -0.5f);
                            GL11.glRotatef(90F, 1f, 0f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("vent_intersection")
                        .withModel(new VentIntersection(), "vent")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("vent_end")
                        .withModel(new VentEnd(), "vent")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("white_desk_left")
                        .withModel(new WhiteDeskLeft(), "shelf")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("white_desk_middle")
                        .withModel(new WhiteDeskMiddle(), "shelf")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0.95, 0, 1, 1, 0.8)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("white_desk_right")
                        .withModel(new WhiteDeskRight(), "shelf")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("trash_bin")
                        .withModel(new TrashBin(), "trashbin")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0.075, 0, 0.13, 0.94, 1.25, 0.63)))
                        .modern(),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("trash_bin_rotated")
                        .withModel(new TrashBin(), "trashbin")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0.15, 0, 0, 1, 1.25, 0.87)))
                        .withTransform(Transform.getZero().withRotation(0F, 45F, 0F))
                        .modern(),

                new LootBoxConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("caution_sign")
                        .withModel(new CautionSign(), "cautionsign")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.8f, 0.8f, 0.8f);
                            GL11.glTranslatef(0.6f, 0.45f, 0.6f);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("electric_box")
                        .withModel(new ElectricBox(), "electronics/electricbox")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0.8f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("electric_box_opened")
                        .withModel(new ElectricBoxOpened(), "electronics/electricboxopened")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0.8f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.WOOD)
                        .withHardness(2)
                        .withName("home_chair")
                        .withModel(new HomeChair(), "homechair")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 0.7, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.WOOD)
                        .withHardness(2)
                        .withName("home_chair_rotated")
                        .withModel(new HomeChair(), "homechair")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 0.7, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.WOOD)
                        .withHardness(2)
                        .withName("outdoor_chair")
                        .withModel(new OutdoorChair(), "outdoorchair")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 0.7, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.WOOD)
                        .withHardness(2)
                        .withName("outdoor_chair_rotated")
                        .withModel(new OutdoorChair(), "outdoorchair")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 0.7, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("vending_machine")
                        .withModel(new VendingMachine(), "electronics/vending_machine")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0.1, 1, 2, 0.8)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.8f, 0.8f, 0.8f);
                            GL11.glTranslatef(0.55f, 0.4f, 0.62f);
                            GL11.glRotatef(180F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("server_rack_left")
                        .withModel(new ServerRackLeft(), "servers/server_rack_left")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("server_rack_empty_left")
                        .withModel(new ServerRackEmptyLeft(), "servers/server_rack_empty_right")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("server_rack_left_alt")
                        .withModel(new ServerRackLeftAlt(), "servers/server_rack_left_alt")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("server_rack_left_alt_2")
                        .withModel(new ServerRackLeftAlt2(), "servers/server_rack_left_alt_2")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("server_rack_left_alt_3")
                        .withModel(new ServerRackLeftAlt3(), "servers/server_rack_left_alt_3")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("server_rack_empty_right")
                        .withModel(new ServerRackEmptyRight(), "servers/server_rack_left_alt_3")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("server_rack_right")
                        .withModel(new ServerRackRight(), "servers/server_rack_left_alt_3")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("server_rack_right_alt")
                        .withModel(new ServerRackRightAlt(), "servers/server_rack_right_alt")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("server_rack_top_left")
                        .withModel(new ServerRackTop(), "servers/server_rack_left")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 0.3, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("server_rack_top_right")
                        .withModel(new ServerRackTopRight(), "servers/server_rack_right")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 0.3, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("duelfloodlight")
                        .withModel(new DuelFloodlight(), "lights/duelfloodlight")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1.7, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.8f, 0.8f, 0.8f);
                            GL11.glTranslatef(0.65f, 0.35f, 0.65f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("duelfloodlight_rotated")
                        .withModel(new DuelFloodlight(), "lights/duelfloodlight")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1.7, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.8f, 0.8f, 0.8f);
                            GL11.glTranslatef(0.65f, 0.35f, 0.65f);
                            GL11.glRotatef(45F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("floodlight")
                        .withModel(new Floodlight(), "lights/floodlight")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 0.75, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.9f, 0.9f, 0.9f);
                            GL11.glTranslatef(0.55f, 0.175f, 0.55f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("floodlight_rotated")
                        .withModel(new Floodlight(), "lights/floodlight")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 0.75, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.9f, 0.9f, 0.9f);
                            GL11.glTranslatef(0.55f, 0.175f, 0.55f);
                            GL11.glRotatef(45F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("Radio")
                        .withModel(new Radio(), "electronics/radio")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0.05, 0, 0.1, 0.9, 0.33, 0.77)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.7f, 0.7f, 0.7f);
                            GL11.glTranslatef(0.65f, 0.58f, 0.8f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("Radio_rotated")
                        .withModel(new Radio(), "electronics/radio")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.7f, 0.7f, 0.7f);
                            GL11.glTranslatef(0.65f, 0.58f, 0.7f);
                            GL11.glRotatef(45F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("camera")
                        .withModel(new Camera(), "electronics/camera")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .modern(),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("camera_rotated")
                        .withModel(new Camera(), "electronics/camera")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> GL11.glRotatef(-45F, 0F, 1F, 0F))
                        .withTransform(Transform.getZero()
                                .withRotation(0F, -45F, 0F)
                                .withPosition(0F, 0F, -0.15F))
                        .modern(),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("propanetank")
                        .withModel(new PropaneTank(), "propanetank")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.6f, 0.6f, 0.6f);
                            GL11.glTranslatef(0.85f, 1f, 0.85f);
                            GL11.glRotatef(90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("towablefloodlight")
                        .withModel(new TowableFloodLight(), "lights/towablefloodlight")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.3f, 0f, 0.5f);
                            GL11.glRotatef(90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.SAND)
                        .withName("sandbag")
                        .withModel(new Sandbag(), "sandbag")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 0.5, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.SAND)
                        .withName("sandbagwall")
                        .withModel(new SandbagWall(), "sandbag")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("crossgravestone")
                        .withModel(new CrossGravestone(), "gravestone/crossgravestone")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("crossgravestone2")
                        .withModel(new CrossGravestone2(), "gravestone/crossgravestone2")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("crossgravestone3")
                        .withModel(new CrossGravestone3(), "gravestone/crossgravestone3")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("gravestoneskull")
                        .withModel(new GravestoneSkull(), "gravestone/gravestoneskull")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("gravestone")
                        .withModel(new Gravestone(), "gravestone/gravestoneskull")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.WOOD)
                        .withHardness(2)
                        .withName("scarecrow")
                        .withModel(new Scarecrow(), "scarecrow")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.CLOTH)
                        .withName("spookyghost")
                        .withModel(new SpookyGhost(), "ghost/spookyghost")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 1.05f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.CLOTH)
                        .withName("spookyghost2")
                        .withModel(new SpookyGhost(), "ghost/spookyghost2")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 1.05f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.CLOTH)
                        .withName("spookyghost3")
                        .withModel(new SpookyGhost(), "ghost/spookyghost3")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 1.05f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new LootBoxConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("swat_truck")
                        .withModel(new SwatTruck(), "swat_truck")
                        .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                        .withTransform(Transform.getZero().withScale(1.5F, 1.5F, 1.5F))
                        .modern()

        ));

        final ProgressManager.ProgressBar propsProgressBar = ProgressManager.push("Building Props", props.size());

        for (final LootBoxConfiguration lootBoxConfiguration : props) {
            final String name = I18n.format("tile." + ID + "_" + lootBoxConfiguration.getName() + ".name");

            propsProgressBar.step(name);

            if (!lootBoxConfiguration.isModern())
                LOG.warn("Non modern loot box configuration found: " + lootBoxConfiguration.getName() + ". This may impact performance and should be modernized.");

            lootBoxConfiguration
                    .withCreativeTab(MWC.PROPS_TAB)
                    .build(modContext);
        }

        LOG.debug("Built " + props.size() + " props");

        ProgressManager.pop(propsProgressBar);
    }
}
