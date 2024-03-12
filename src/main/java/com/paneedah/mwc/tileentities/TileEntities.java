package com.paneedah.mwc.tileentities;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.props.TrashBin;
import com.paneedah.mwc.rendering.Transform;
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
import static com.paneedah.mwc.utils.ModReference.LOG;

public class TileEntities {

    public static void init() {
        new TurretBaseFactory().createTileEntity(modContext);

        final ArrayDeque<LootBoxConfiguration> props = new ArrayDeque<>();

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.ROCK)
                .withHardness(3.5F)
                .withName("weapons_case")
                .withModelClassName("GunCase")
                .withTextureName("gun_case")
                .withCreativeTab(MWC.PROPS_TAB)
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(-0.65, 0, 0.15, 1.7, 0.3, 0.9)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(0.6f, 0.6f, 0.6f);
                    GL11.glTranslatef(0.7f, 1.1f, 0.5f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.ROCK)
                .withHardness(3.5F)
                .withName("weapons_case_small")
                .withModelClassName("GunCaseSmall")
                .withTextureName("gun_case_small")
                .withCreativeTab(MWC.PROPS_TAB)
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0.05, 0, 0.1, 0.9, 0.33, 0.77)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(0.6f, 0.6f, 0.6f);
                    GL11.glTranslatef(0.8f, 1.1f, 0.8f);
                }));


        props.add(new LootBoxConfiguration()
                .withMaterial(Material.ROCK)
                .withHardness(3.5F)
                .withName("russian_weapons_case")
                .withModelClassName("MilitaryCrate")
                .withTextureName("militarycrate")
                .withCreativeTab(MWC.PROPS_TAB)
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(-0.47, 0, 0.03, 1.44, 0.54, 0.98)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(0.6f, 0.6f, 0.6f);
                    GL11.glTranslatef(0.8f, 1.15f, 0.75f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.ROCK)
                .withHardness(3.5F)
                .withName("ammo_box")
                .withModelClassName("Ammobox1")
                .withTextureName("ammobox")
                .withCreativeTab(MWC.PROPS_TAB)
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0.15, 0, 0.35, 0.83, 0.5, 0.7)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(0.4f, 0.4f, 0.4f);
                    GL11.glTranslatef(1.2f, 2.5f, 1.1f);
                }));


        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("weapons_locker")
                .withModelClassName("GunRack")
                .withTextureName("gunrack")
                .withCreativeTab(MWC.PROPS_TAB)
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(-0.375, 0, 0.05, 1.45, 1.825, 0.7)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(0.6f, 0.6f, 0.6f);
                    GL11.glTranslatef(0.4f, 1.15f, 0.6f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("fridge_open")
                .withModelClassName("FridgeOpen")
                .withTextureName("fridge")
                .withCreativeTab(MWC.PROPS_TAB)
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0.06, 0, 0.075, 0.94, 2.06, 1.02)))
                .withPositioning(tileEntity -> {
                    GL11.glTranslatef(0.55f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("fridge_closed")
                .withModelClassName("FridgeClosed")
                .withTextureName("fridge")
                .withCreativeTab(MWC.PROPS_TAB)
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0.06, 0, 0.075, 0.94, 2.06, 1.02)))
                .withPositioning(tileEntity -> {
                    GL11.glTranslatef(0.55f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("artillery_prop")
                .withModelClassName("ArtilleryProp")
                .withTextureName("artilleryprop")
                .withCreativeTab(MWC.PROPS_TAB)
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(-0.3, 0, 0.1, 1.3, 1.5, 1.6)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(0.8f, 0.8f, 0.8f);
                    GL11.glTranslatef(0.55f, 0.6f, 0.55f);
                    GL11.glRotatef(90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.WOOD)
                .withHardness(2)
                .withName("supply_drop")
                .withModelClassName("SupplyDrop")
                .withTextureName("supplydrop")
                .withCreativeTab(MWC.PROPS_TAB)
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(-0.3, 0, -0.6, 1.3, 1.2, 1.6)))
                .withTransform(Transform.getZero()
                        .withScale(0.5F, 0.5F, 0.5F)
                        .withPosition(0, 0.75F, 0))
                .modern());

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.ROCK)
                .withHardness(3.5F)
                .withName("medical_crate")
                .withModelClassName("MedicalCrate")
                .withTextureName("medicalcrate")
                .withCreativeTab(MWC.PROPS_TAB)
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 0.5, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(0.6f, 0.6f, 0.6f);
                    GL11.glTranslatef(0.7f, 1.13f, 0.5f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.ROCK)
                .withHardness(3.5F)
                .withName("locker")
                .withModelClassName("Locker")
                .withTextureName("locker")
                .withCreativeTab(MWC.PROPS_TAB)
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 2, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(0.5f, 0.5f, 0.5f);
                    GL11.glTranslatef(0.7f, 1.85f, 1f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.ROCK)
                .withHardness(3.5F)
                .withName("scp_locker")
                .withModelClassName("SCPLocker")
                .withTextureName("scplocker")
                .withCreativeTab(MWC.PROPS_TAB)
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 2, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(0.8f, 0.8f, 0.8f);
                    GL11.glTranslatef(0.5f, 0.45f, 0.6f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("barrel")
                .withModelClassName("Barrel")
                .withTextureName("barrel")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0.125, 0, 0.125, 0.875, 1, 0.875)))
                .withTransform(Transform.getZero()
                        .withPosition(0, 0.375F, 0)
                        .withScale(0.75F, 0.75F, 0.75F))
                .modern());

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("explosive_barrel")
                .withModelClassName("Barrel")
                .withTextureName("barrel_explosive")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0.125, 0, 0.125, 0.875, 1, 0.875)))
                .withTransform(Transform.getZero()
                        .withPosition(0, 0.375F, 0)
                        .withScale(0.75F, 0.75F, 0.75F))
                .modern());

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.ROCK)
                .withHardness(3.5F)
                .withName("pc")
                .withModelClassName("electronics.PC")
                .withTextureName("electronics/pc")
                .withCreativeTab(MWC.PROPS_TAB)
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(0.9f, 0.9f, 0.9f);
                    GL11.glTranslatef(0.7f, 0.25f, 0.6f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.ROCK)
                .withHardness(3.5F)
                .withName("laptop")
                .withModelClassName("electronics.Laptop")
                .withTextureName("electronics/pc")
                .withCreativeTab(MWC.PROPS_TAB)
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 0.5, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(0.7f, 0.7f, 0.7f);
                    GL11.glTranslatef(0.5f, 0.71f, 0.6f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.ROCK)
                .withHardness(3.5F)
                .withName("monitor")
                .withModelClassName("electronics.Monitor")
                .withTextureName("electronics/pc")
                .withCreativeTab(MWC.PROPS_TAB)
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(0.9f, 0.9f, 0.9f);
                    GL11.glTranslatef(0.7f, 0.25f, 0.6f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("filingcabinet")
                .withModelClassName("FilingCabinet")
                .withTextureName("filingcabinetopened")
                .withCreativeTab(MWC.PROPS_TAB)
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("filingcabinet_opened")
                .withModelClassName("FilingCabinetOpened")
                .withTextureName("filingcabinetopened")
                .withCreativeTab(MWC.PROPS_TAB)
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.ROCK)
                .withHardness(3.5F)
                .withName("shelf_right")
                .withModelClassName("shelves.ShelfRight")
                .withTextureName("shelf")
                .withCreativeTab(MWC.PROPS_TAB)
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.ROCK)
                .withHardness(3.5F)
                .withName("shelf_left")
                .withModelClassName("shelves.ShelfLeft")
                .withTextureName("shelf")
                .withCreativeTab(MWC.PROPS_TAB)
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.ROCK)
                .withHardness(3.5F)
                .withName("shelf_top")
                .withModelClassName("shelves.ShelfTop")
                .withTextureName("shelf")
                .withCreativeTab(MWC.PROPS_TAB)
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 0.2, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.ROCK)
                .withHardness(3.5F)
                .withName("tv")
                .withModelClassName("electronics.TV")
                .withTextureName("electronics/tv")
                .withCreativeTab(MWC.PROPS_TAB)
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 2, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.ROCK)
                .withHardness(3.5F)
                .withName("ceiling_tv")
                .withModelClassName("electronics.CeilingTV")
                .withTextureName("electronics/ceilingtv")
                .withCreativeTab(MWC.PROPS_TAB)
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0.4f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.ROCK)
                .withHardness(3.5F)
                .withName("ceiling_tv_rotated")
                .withModelClassName("electronics.CeilingTV")
                .withTextureName("electronics/ceilingtv")
                .withCreativeTab(MWC.PROPS_TAB)
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0.4f, 0.5f);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.ROCK)
                .withHardness(3.5F)
                .withName("office_chair")
                .withModelClassName("OfficeChair2")
                .withTextureName("officechair")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 0.7, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.ROCK)
                .withHardness(3.5F)
                .withName("office_chair_2")
                .withModelClassName("OfficeChair")
                .withTextureName("officechair")
                .withCreativeTab(MWC.PROPS_TAB)
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 0.7, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.WOOD)
                .withHardness(2)
                .withName("desk_corner")
                .withModelClassName("desks.DeskCorner")
                .withTextureName("desks/desk")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1.07f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.WOOD)
                .withHardness(2)
                .withName("desk_corner_alt1")
                .withModelClassName("desks.DeskCornerAlt1")
                .withTextureName("desks/desk")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1.07f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.WOOD)
                .withHardness(2)
                .withName("desk_left")
                .withModelClassName("desks.DeskLeft")
                .withTextureName("desks/desk")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.WOOD)
                .withHardness(2)
                .withName("desk_left_alt1")
                .withModelClassName("desks.DeskLeftAlt1")
                .withTextureName("desks/desk")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.WOOD)
                .withHardness(2)
                .withName("desk_middle")
                .withModelClassName("desks.DeskMiddle")
                .withTextureName("desks/desk")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.WOOD)
                .withHardness(2)
                .withName("desk_middle_alt1")
                .withModelClassName("desks.DeskMiddleAlt1")
                .withTextureName("desks/deskmiddlealt1")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.WOOD)
                .withHardness(2)
                .withName("desk_right")
                .withModelClassName("desks.DeskRight")
                .withTextureName("desks/desk")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.WOOD)
                .withHardness(2)
                .withName("desk_right_alt1")
                .withModelClassName("desks.DeskRightAlt1")
                .withTextureName("desks/desk")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.WOOD)
                .withHardness(2)
                .withName("desk_shelf")
                .withModelClassName("desks.DeskShelf")
                .withTextureName("desks/deskshelf")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, .6, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.WOOD)
                .withHardness(2)
                .withName("desk_shelf_alt1")
                .withModelClassName("desks.DeskShelfAlt1")
                .withTextureName("desks/deskshelfalt1")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.WOOD)
                .withHardness(2)
                .withName("desk_shelf_alt2")
                .withModelClassName("desks.DeskShelfAlt2")
                .withTextureName("desks/deskshelf")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, .6, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.WOOD)
                .withHardness(2)
                .withName("desk_shelf_alt3")
                .withModelClassName("desks.DeskShelfAlt4")
                .withTextureName("desks/deskshelfalt4")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.ROCK)
                .withHardness(3.5F)
                .withName("barrier")
                .withModelClassName("Barrier")
                .withTextureName("barrier")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1.1f, 1.2f, 1f);
                    GL11.glTranslatef(0.42f, -0.25f, 0.5f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.ROCK)
                .withHardness(3.5F)
                .withName("barrier_rotated")
                .withModelClassName("Barrier")
                .withTextureName("barrier")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1.1f, 1.2f, 1.1f);
                    GL11.glTranslatef(0.42f, -0.25f, 0.5f);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.WOOD)
                .withHardness(2)
                .withName("body_bag")
                .withModelClassName("BodyBag")
                .withTextureName("bodybag")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(0.9f, 0.9f, 0.9f);
                    GL11.glTranslatef(0.4f, 0.17F, 0.555f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.WOOD)
                .withHardness(2)
                .withName("hanging_body")
                .withModelClassName("HangingBody")
                .withTextureName("hangingbody")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, -1, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(0.9f, 0.9f, 0.9f);
                    GL11.glTranslatef(0.5f, 1.8f, 0.55f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.WOOD)
                .withHardness(2)
                .withName("impaled_body")
                .withModelClassName("ImpaledBody")
                .withTextureName("impaledbody")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 3, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(0.9f, 0.9f, 0.9f);
                    GL11.glTranslatef(0.5f, 0.2f, 0.55f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("dumpster")
                .withModelClassName("Dumpster")
                .withTextureName("dumpster")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(-1.01, 0, 0.1, 1.01, 1.3, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(0.9f, 0.9f, 0.9f);
                    GL11.glTranslatef(0.6f, 0.2f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.WOOD)
                .withHardness(2)
                .withName("wooden_crate")
                .withModelClassName("WoodenCrate")
                .withTextureName("woodencrate")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 0.95f, 1f);
                    GL11.glTranslatef(0.5f, 0.085f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.WOOD)
                .withHardness(2)
                .withName("wooden_crate_opened")
                .withModelClassName("WoodenCrateOpened")
                .withTextureName("woodencrateopened")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.ROCK)
                .withHardness(3.5F)
                .withName("operating_table")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, -0.5, 1, 1, 1.5)))
                .withModelClassName("OperatingTable")
                .withTextureName("operatingtable")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.ROCK)
                .withHardness(3.5F)
                .withName("operating_table_alt")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, -0.5, 1, 1, 1.5)))
                .withModelClassName("OperatingTableAlt")
                .withTextureName("operatingtable")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("forklift")
                .withModelClassName("Forklift")
                .withTextureName("forklift")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1.5f, 1.5f, 1.5f);
                    GL11.glTranslatef(0.5f, -0.5f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("forklift_rotated")
                .withModelClassName("Forklift")
                .withTextureName("forklift")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1.5f, 1.5f, 1.5f);
                    GL11.glTranslatef(0.5f, -0.5f, 0.5f);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("forklift_alt")
                .withModelClassName("ForkLiftAlt")
                .withTextureName("forkliftalt")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("forklift_alt_rotated")
                .withModelClassName("ForkLiftAlt")
                .withTextureName("forkliftalt")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("trusses")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0.2, 0.4, 1, 0.4, 0.6)))
                .withModelClassName("Trusses")
                .withTextureName("trusses")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("ceiling_lamp")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0.5, 0, 1, 1, 1)))
                .withModelClassName("lights.CeilingLamp")
                .withTextureName("lights/ceilinglamp")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 1.8f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("ceiling_lamp_alt")
                .withModelClassName("lights.CeilingLampAlt")
                .withTextureName("lights/ceilinglampalt")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, -0.2f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("vent")
                .withModelClassName("vents.Vent")
                .withTextureName("vent")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("vent_rotated")
                .withModelClassName("vents.Vent")
                .withTextureName("vent")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 1f, 1.5f);
                    GL11.glRotatef(-90F, 1f, 0f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("vent_corner")
                .withModelClassName("vents.VentCorner")
                .withTextureName("vent")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("vent_corner_rotated")
                .withModelClassName("vents.VentCorner")
                .withTextureName("vent")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 1f, 1.5f);
                    GL11.glRotatef(-90F, 1f, 0f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("vent_corner_rotated_alt")
                .withModelClassName("vents.VentCorner")
                .withTextureName("vent")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 1f, -0.5f);
                    GL11.glRotatef(90F, 1f, 0f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("vent_intersection")
                .withModelClassName("vents.VentIntersection")
                .withTextureName("vent")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("vent_end")
                .withModelClassName("vents.VentEnd")
                .withTextureName("vent")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("white_desk_left")
                .withModelClassName("desks.WhiteDeskLeft")
                .withTextureName("shelf")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("white_desk_middle")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0.95, 0, 1, 1, 0.8)))
                .withModelClassName("desks.WhiteDeskMiddle")
                .withTextureName("shelf")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("white_desk_right")
                .withModelClassName("desks.WhiteDeskRight")
                .withTextureName("shelf")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("trash_bin")
                .withModel(new TrashBin(), "trashbin")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0.075, 0, 0.13, 0.94, 1.25, 0.63)))
                .modern());

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("trash_bin_rotated")
                .withModel(new TrashBin(), "trashbin")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0.15, 0, 0, 1, 1.25, 0.87)))
                .withTransform(Transform.getZero()
                        .withRotation(0F, 45F, 0F)
                )
                .modern());

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.ROCK)
                .withHardness(3.5F)
                .withName("caution_sign")
                .withModelClassName("CautionSign")
                .withTextureName("cautionsign")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(0.8f, 0.8f, 0.8f);
                    GL11.glTranslatef(0.6f, 0.45f, 0.6f);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("electric_box")
                .withModelClassName("electronics.ElectricBox")
                .withTextureName("electronics/electricbox")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0.8f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("electric_box_opened")
                .withModelClassName("electronics.ElectricBoxOpened")
                .withTextureName("electronics/electricboxopened")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0.8f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.WOOD)
                .withHardness(2)
                .withName("home_chair")
                .withModelClassName("HomeChair")
                .withTextureName("homechair")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 0.7, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.WOOD)
                .withHardness(2)
                .withName("outdoor_chair")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 0.7, 1)))
                .withModelClassName("OutdoorChair")
                .withTextureName("outdoorchair")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.WOOD)
                .withHardness(2)
                .withName("home_chair_rotated")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 0.7, 1)))
                .withModelClassName("HomeChair")
                .withTextureName("homechair")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.WOOD)
                .withHardness(2)
                .withName("outdoor_chair_rotated")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 0.7, 1)))
                .withModelClassName("OutdoorChair")
                .withTextureName("outdoorchair")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("vending_machine")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0.1, 1, 2, 0.8)))
                .withModelClassName("electronics.VendingMachine")
                .withTextureName("electronics/vendingmachine")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(0.8f, 0.8f, 0.8f);
                    GL11.glTranslatef(0.55f, 0.4f, 0.62f);
                    GL11.glRotatef(180F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("ServerRackLeft")
                .withModelClassName("servers.ServerRackLeft")
                .withTextureName("servers/serverrackleft")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("ServerRackEmptyLeft")
                .withModelClassName("servers.ServerRackEmptyLeft")
                .withTextureName("servers/serverrackemptyright")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("ServerRackLeftAlt")
                .withModelClassName("servers.ServerRackLeftAlt")
                .withTextureName("servers/serverrackleftalt")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("ServerRackLeftAlt2")
                .withModelClassName("servers.ServerRackLeftAlt2")
                .withTextureName("servers/serverrackleftalt2")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("ServerRackLeftAlt3")
                .withModelClassName("servers.ServerRackLeftAlt3")
                .withTextureName("servers/serverrackleftalt3")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("ServerRackEmptyRight")
                .withModelClassName("servers.ServerRackEmptyRight")
                .withTextureName("servers/serverrackemptyright")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("ServerRackRight")
                .withModelClassName("servers.ServerRackRight")
                .withTextureName("servers/serverrackright")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("ServerRackRightAlt")
                .withModelClassName("servers.ServerRackRightAlt")
                .withTextureName("servers/serverrackrightalt")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("ServerRackTopLeft")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 0.3, 1)))
                .withModelClassName("servers.ServerRackTop")
                .withTextureName("servers/serverrackleft")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("ServerRackTopRight")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 0.3, 1)))
                .withModelClassName("servers.ServerRackTopRight")
                .withTextureName("servers/serverrackleft")
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("duelfloodlight")
                .withModelClassName("lights.DuelFloodlight")
                .withTextureName("lights/duelfloodlight")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1.7, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(0.8f, 0.8f, 0.8f);
                    GL11.glTranslatef(0.65f, 0.35f, 0.65f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("duelfloodlight_rotated")
                .withModelClassName("lights.DuelFloodlight")
                .withTextureName("lights/duelfloodlight")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1.7, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(0.8f, 0.8f, 0.8f);
                    GL11.glTranslatef(0.65f, 0.35f, 0.65f);
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("floodlight")
                .withModelClassName("lights.Floodlight")
                .withTextureName("lights/floodlight")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 0.75, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(0.9f, 0.9f, 0.9f);
                    GL11.glTranslatef(0.55f, 0.175f, 0.55f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("floodlight_rotated")
                .withModelClassName("lights.Floodlight")
                .withTextureName("lights/floodlight")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 0.75, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(0.9f, 0.9f, 0.9f);
                    GL11.glTranslatef(0.55f, 0.175f, 0.55f);
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("Radio_rotated")
                .withModelClassName("electronics.Radio")
                .withTextureName("electronics/radio")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(0.7f, 0.7f, 0.7f);
                    GL11.glTranslatef(0.65f, 0.58f, 0.7f);
                    GL11.glRotatef(45F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("Radio")
                .withModelClassName("electronics.Radio")
                .withTextureName("electronics/radio")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0.05, 0, 0.1, 0.9, 0.33, 0.77)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(0.7f, 0.7f, 0.7f);
                    GL11.glTranslatef(0.65f, 0.58f, 0.8f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("camera")
                .withModelClassName("electronics.Camera")
                .withTextureName("electronics/camera")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .modern());

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("camera_rotated")
                .withModelClassName("electronics.Camera")
                .withTextureName("electronics/camera")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> GL11.glRotatef(-45F, 0F, 1F, 0F))
                .withTransform(Transform.getZero()
                        .withRotation(0F, -45F, 0F)
                        .withPosition(0F, 0F, -0.15F))
                .modern());

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("propanetank")
                .withModelClassName("PropaneTank")
                .withTextureName("propanetank")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(0.6f, 0.6f, 0.6f);
                    GL11.glTranslatef(0.85f, 1f, 0.85f);
                    GL11.glRotatef(90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("towablefloodlight")
                .withModelClassName("lights.TowableFloodLight")
                .withTextureName("lights/towablefloodlight")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.3f, 0f, 0.5f);
                    GL11.glRotatef(90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.SAND)
                .withName("sandbag")
                .withModelClassName("Sandbag")
                .withTextureName("sandbag")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 0.5, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.SAND)
                .withName("sandbagwall")
                .withModelClassName("SandbagWall")
                .withTextureName("sandbag")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.ROCK)
                .withHardness(3.5F)
                .withName("crossgravestone")
                .withModelClassName("gravestones.CrossGravestone")
                .withTextureName("gravestone/crossgravestone")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.ROCK)
                .withHardness(3.5F)
                .withName("crossgravestone2")
                .withModelClassName("gravestones.CrossGravestone2")
                .withTextureName("gravestone/crossgravestone2")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.ROCK)
                .withHardness(3.5F)
                .withName("crossgravestone3")
                .withModelClassName("gravestones.CrossGravestone3")
                .withTextureName("gravestone/crossgravestone3")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.ROCK)
                .withHardness(3.5F)
                .withName("gravestoneskull")
                .withModelClassName("gravestones.GravestoneSkull")
                .withTextureName("gravestone/gravestoneskull")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.ROCK)
                .withHardness(3.5F)
                .withName("gravestone")
                .withModelClassName("gravestones.Gravestone")
                .withTextureName("gravestone/gravestone")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.WOOD)
                .withHardness(2)
                .withName("scarecrow")
                .withModelClassName("Scarecrow")
                .withTextureName("scarecrow")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 0f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.CLOTH)
                .withName("spookyghost")
                .withModelClassName("SpookyGhost")
                .withTextureName("ghost/spookyghost")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 1.05f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.CLOTH)
                .withName("spookyghost2")
                .withModelClassName("SpookyGhost")
                .withTextureName("ghost/spookyghost2")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 1.05f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.CLOTH)
                .withName("spookyghost3")
                .withModelClassName("SpookyGhost")
                .withTextureName("ghost/spookyghost3")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withPositioning(tileEntity -> {
                    GL11.glScalef(1f, 1f, 1f);
                    GL11.glTranslatef(0.5f, 1.05f, 0.5f);
                    GL11.glRotatef(-90F, 0f, 1f, 0f);
                }));

        props.add(new LootBoxConfiguration()
                .withMaterial(Material.IRON)
                .withHardness(22.5F)
                .withName("swat_truck")
                .withModelClassName("SwatTruck")
                .withTextureName("swat_truck")
                .withBoundingBox(facing -> AABBUtil.orientAABB(facing, new AxisAlignedBB(0, 0, 0, 1, 1, 1)))
                .withTransform(Transform.getZero().withScale(1.5F, 1.5F, 1.5F))
                .modern());

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
