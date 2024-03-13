package com.paneedah.mwc.tileentities;

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
import com.paneedah.weaponlib.tile.CustomTileEntityConfiguration;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import net.minecraft.block.material.Material;
import net.minecraft.client.resources.I18n;
import net.minecraftforge.fml.common.ProgressManager;
import org.lwjgl.opengl.GL11;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

import static com.paneedah.mwc.MWC.modContext;
import static com.paneedah.mwc.utils.ModReference.ID;
import static com.paneedah.mwc.utils.ModReference.LOG;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class TileEntities {

    // TODO: Move from positioning to transforming, if scale is before position do position * scale for example posX * scaleX

    // TODO: Modernize this by correctly placing the models instead of correcting them programatically

    public static void init() {
        new TurretBaseFactory().createTileEntity(modContext);

        final Queue<CustomTileEntityConfiguration> props = new ArrayDeque<>(Arrays.asList(

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("weapon_case")
                        .withModel(new WeaponCase(), "weapon_case")
                        .withBoundingBox(-0.65, 0, 0.15, 1.7, 0.3, 0.9)
                        .withTransform(new Transform()
                                .withPosition(0.42F, 0.66F, 0.3F)
                                .withScale(0.6F, 0.6F, 0.6F)
                        ),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("weapon_case_small")
                        .withModel(new WeaponCaseSmall(), "weapon_case_small")
                        .withBoundingBox(0.05, 0, 0.1, 0.9, 0.33, 0.77)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.6f, 0.6f, 0.6f);
                            GL11.glTranslatef(0.8f, 1.1f, 0.8f);
                        }),


                new CustomTileEntityConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("weapon_crate_russian")
                        .withModel(new WeaponCrateRussian(), "weapon_crate_russian")
                        .withBoundingBox(-0.47, 0, 0.03, 1.44, 0.54, 0.98)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.6f, 0.6f, 0.6f);
                            GL11.glTranslatef(0.8f, 1.15f, 0.75f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("ammunition_box")
                        .withModel(new AmmunitionBox(), "ammunition_box")
                        .withBoundingBox(0.15, 0, 0.35, 0.83, 0.5, 0.7)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.4f, 0.4f, 0.4f);
                            GL11.glTranslatef(1.2f, 2.5f, 1.1f);
                        }),


                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("weapon_locker")
                        .withModel(new WeaponLocker(), "weapon_locker")
                        .withBoundingBox(-0.375, 0, 0.05, 1.45, 1.825, 0.7)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.6f, 0.6f, 0.6f);
                            GL11.glTranslatef(0.4f, 1.15f, 0.6f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("fridge_open")
                        .withModel(new FridgeOpen(), "fridge")
                        .withBoundingBox(0.06, 0, 0.075, 0.94, 2.06, 1.02)
                        .withPositioning(tileEntity -> {
                            GL11.glTranslatef(0.55f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("fridge_closed")
                        .withModel(new FridgeClosed(), "fridge")
                        .withBoundingBox(0.06, 0, 0.075, 0.94, 2.06, 1.02)
                        .withPositioning(tileEntity -> {
                            GL11.glTranslatef(0.55f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("artillery_prop")
                        .withModel(new ArtilleryProp(), "artillery_prop")
                        .withBoundingBox(-0.3, 0, 0.1, 1.3, 1.5, 1.6)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.8f, 0.8f, 0.8f);
                            GL11.glTranslatef(0.55f, 0.6f, 0.55f);
                            GL11.glRotatef(90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.WOOD)
                        .withHardness(2)
                        .withName("supply_drop")
                        .withModel(new SupplyDrop(), "supply_drop")
                        .withBoundingBox(-0.3, 0, -0.6, 1.3, 1.2, 1.6)
                        .withTransform(Transform.getZero()
                                .withScale(0.5F, 0.5F, 0.5F)
                                .withPosition(0, 0.75F, 0))
                        .modern(),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("medical_crate")
                        .withModel(new MedicalCrate(), "medical_crate")
                        .withBoundingBox(0, 0, 0, 1, 0.5, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.6f, 0.6f, 0.6f);
                            GL11.glTranslatef(0.7f, 1.13f, 0.5f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("locker")
                        .withModel(new Locker(), "locker")
                        .withBoundingBox(0, 0, 0, 1, 2, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.5f, 0.5f, 0.5f);
                            GL11.glTranslatef(0.7f, 1.85f, 1f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("scp_locker")
                        .withModel(new SCPLocker(), "scp_locker")
                        .withBoundingBox(0, 0, 0, 1, 2, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.8f, 0.8f, 0.8f);
                            GL11.glTranslatef(0.5f, 0.45f, 0.6f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("barrel")
                        .withModel(new Barrel(), "barrel")
                        .withBoundingBox(0.125, 0, 0.125, 0.875, 1, 0.875)
                        .withTransform(Transform.getZero()
                                .withPosition(0, 0.375F, 0)
                                .withScale(0.75F, 0.75F, 0.75F))
                        .modern(),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("barrel_explosive")
                        .withModel(new Barrel(), "barrel_explosive")
                        .withBoundingBox(0.125, 0, 0.125, 0.875, 1, 0.875)
                        .withTransform(Transform.getZero()
                                .withPosition(0, 0.375F, 0)
                                .withScale(0.75F, 0.75F, 0.75F))
                        .modern(),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("pc")
                        .withModel(new PC(), "electronics/pc")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.9f, 0.9f, 0.9f);
                            GL11.glTranslatef(0.7f, 0.25f, 0.6f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("laptop")
                        .withModel(new Laptop(), "electronics/pc")
                        .withBoundingBox(0, 0, 0, 1, 0.5, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.7f, 0.7f, 0.7f);
                            GL11.glTranslatef(0.5f, 0.71f, 0.6f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("monitor")
                        .withModel(new Monitor(), "electronics/pc")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.9f, 0.9f, 0.9f);
                            GL11.glTranslatef(0.7f, 0.25f, 0.6f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("filing_cabinet")
                        .withModel(new FilingCabinet(), "filing_cabinet_opened")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("filing_cabinet_opened")
                        .withModel(new FilingCabinetOpened(), "filing_cabinet_opened")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("shelf_right")
                        .withModel(new ShelfRight(), "shelf")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("shelf_left")
                        .withModel(new ShelfLeft(), "shelf")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("shelf_top")
                        .withModel(new ShelfTop(), "shelf")
                        .withBoundingBox(0, 0, 0, 1, 0.2, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("tv")
                        .withModel(new TV(), "electronics/tv")
                        .withBoundingBox(0, 0, 0, 1, 2, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                // TODO: Ceiling TVs have a modeling issue on their back

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("tv_ceiling")
                        .withModel(new TVCeiling(), "electronics/tv_ceiling")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0.4f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("tv_ceiling_rotated")
                        .withModel(new TVCeiling(), "electronics/tv_ceiling")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0.4f, 0.5f);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("office_chair")
                        .withModel(new OfficeChair(), "office_chair")
                        .withBoundingBox(0, 0, 0, 1, 0.7, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("office_chair_2")
                        .withModel(new OfficeChair2(), "office_chair")
                        .withBoundingBox(0, 0, 0, 1, 0.7, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.WOOD)
                        .withHardness(2)
                        .withName("desk_corner")
                        .withModel(new DeskCorner(), "desks/desk")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1.07f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.WOOD)
                        .withHardness(2)
                        .withName("desk_corner_alt_1")
                        .withModel(new DeskCornerAlt1(), "desks/desk")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1.07f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.WOOD)
                        .withHardness(2)
                        .withName("desk_left")
                        .withModel(new DeskLeft(), "desks/desk")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.WOOD)
                        .withHardness(2)
                        .withName("desk_left_alt_1")
                        .withModel(new DeskLeftAlt1(), "desks/desk")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.WOOD)
                        .withHardness(2)
                        .withName("desk_middle")
                        .withModel(new DeskMiddle(), "desks/desk")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.WOOD)
                        .withHardness(2)
                        .withName("desk_middle_alt_1")
                        .withModel(new DeskMiddleAlt1(), "desks/desk_middle_alt_1")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.WOOD)
                        .withHardness(2)
                        .withName("desk_right")
                        .withModel(new DeskRight(), "desks/desk")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.WOOD)
                        .withHardness(2)
                        .withName("desk_right_alt_1")
                        .withModel(new DeskRightAlt1(), "desks/desk")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.WOOD)
                        .withHardness(2)
                        .withName("desk_shelf")
                        .withModel(new DeskShelf(), "desks/desk_shelf")
                        .withBoundingBox(0, 0, 0, 1, .6, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.WOOD)
                        .withHardness(2)
                        .withName("desk_shelf_alt_1")
                        .withModel(new DeskShelfAlt1(), "desks/desk_shelf_alt_1")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.WOOD)
                        .withHardness(2)
                        .withName("desk_shelf_alt_2")
                        .withModel(new DeskShelfAlt2(), "desks/desk_shelf")
                        .withBoundingBox(0, 0, 0, 1, .6, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.WOOD)
                        .withHardness(2)
                        .withName("desk_shelf_alt_3")
                        .withModel(new DeskShelfAlt3(), "desks/desk_shelf_alt_3")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("barrier")
                        .withModel(new Barrier(), "barrier")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1.1f, 1.2f, 1f);
                            GL11.glTranslatef(0.42f, -0.25f, 0.5f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("barrier_rotated")
                        .withModel(new Barrier(), "barrier")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1.1f, 1.2f, 1.1f);
                            GL11.glTranslatef(0.42f, -0.25f, 0.5f);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.WOOD)
                        .withHardness(2)
                        .withName("body_bag")
                        .withModel(new BodyBag(), "body_bag")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.9f, 0.9f, 0.9f);
                            GL11.glTranslatef(0.4f, 0.17F, 0.555f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.WOOD)
                        .withHardness(2)
                        .withName("body_hanging")
                        .withModel(new BodyHanging(), "body_hanging")
                        .withBoundingBox(0, -1, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.9f, 0.9f, 0.9f);
                            GL11.glTranslatef(0.5f, 1.8f, 0.55f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.WOOD)
                        .withHardness(2)
                        .withName("body_impaled")
                        .withModel(new BodyImpaled(), "body_impaled")
                        .withBoundingBox(0, 0, 0, 1, 3, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.9f, 0.9f, 0.9f);
                            GL11.glTranslatef(0.5f, 0.2f, 0.55f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("dumpster")
                        .withModel(new Dumpster(), "dumpster")
                        .withBoundingBox(-1.01, 0, 0.1, 1.01, 1.3, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.9f, 0.9f, 0.9f);
                            GL11.glTranslatef(0.6f, 0.2f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.WOOD)
                        .withHardness(2)
                        .withName("wooden_crate")
                        .withModel(new WoodenCrate(), "wooden_crate")
                        .withBoundingBox(0, 0, 0, 1, 1.06, 1)
                        .modern(),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.WOOD)
                        .withHardness(2)
                        .withName("wooden_crate_opened")
                        .withModel(new WoodenCrateOpened(), "wooden_crate_opened")
                        .withBoundingBox(0, 0, 0, 1, 1.06, 1)
                        .modern(),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("operating_table")
                        .withModel(new OperatingTable(), "operating_table")
                        .withBoundingBox(0, 0, -0.5, 1, 1.1, 1.5)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("operating_table_alt")
                        .withModel(new OperatingTableAlt(), "operating_table")
                        .withBoundingBox(0, 0, -0.5, 1, 1, 1.5)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("forklift")
                        .withModel(new Forklift(), "forklift")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1.5f, 1.5f, 1.5f);
                            GL11.glTranslatef(0.5f, -0.5f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("forklift_rotated")
                        .withModel(new Forklift(), "forklift")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1.5f, 1.5f, 1.5f);
                            GL11.glTranslatef(0.5f, -0.5f, 0.5f);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("forklift_alt")
                        .withModel(new ForkLiftAlt(), "forklift_alt")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("forklift_alt_rotated")
                        .withModel(new ForkLiftAlt(), "forklift_alt")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("trusses")
                        .withModel(new Trusses(), "trusses")
                        .withBoundingBox(0, 0.2, 0.4, 1, 0.4, 0.6)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("ceiling_lamp")
                        .withModel(new CeilingLamp(), "lights/ceiling_lamp")
                        .withBoundingBox(0, 0.5, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 1.8f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("ceiling_lamp_alt")
                        .withModel(new CeilingLampAlt(), "lights/ceiling_lamp_alt")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, -0.2f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("vent")
                        .withModel(new Vent(), "vent")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("vent_rotated")
                        .withModel(new Vent(), "vent")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 1f, 1.5f);
                            GL11.glRotatef(-90F, 1f, 0f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("vent_corner")
                        .withModel(new VentCorner(), "vent")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("vent_corner_rotated")
                        .withModel(new VentCorner(), "vent")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 1f, 1.5f);
                            GL11.glRotatef(-90F, 1f, 0f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("vent_corner_rotated_alt")
                        .withModel(new VentCorner(), "vent")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 1f, -0.5f);
                            GL11.glRotatef(90F, 1f, 0f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("vent_intersection")
                        .withModel(new VentIntersection(), "vent")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("vent_end")
                        .withModel(new VentEnd(), "vent")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("white_desk_left")
                        .withModel(new WhiteDeskLeft(), "shelf")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("white_desk_middle")
                        .withModel(new WhiteDeskMiddle(), "shelf")
                        .withBoundingBox(0, 0.95, 0, 1, 1, 0.8)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("white_desk_right")
                        .withModel(new WhiteDeskRight(), "shelf")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("trash_bin")
                        .withModel(new TrashBin(), "trash_bin")
                        .withBoundingBox(0.075, 0, 0.13, 0.94, 1.25, 0.63)
                        .modern(),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("trash_bin_rotated")
                        .withModel(new TrashBin(), "trash_bin")
                        .withBoundingBox(0.15, 0, 0, 1, 1.25, 0.87)
                        .withTransform(Transform.getZero().withRotation(0F, 45F, 0F))
                        .modern(),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("caution_sign")
                        .withModel(new CautionSign(), "caution_sign")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.8f, 0.8f, 0.8f);
                            GL11.glTranslatef(0.6f, 0.45f, 0.6f);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("electric_box")
                        .withModel(new ElectricBox(), "electronics/electric_box")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0.8f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("electric_box_opened")
                        .withModel(new ElectricBoxOpened(), "electronics/electric_box_opened")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0.8f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.WOOD)
                        .withHardness(2)
                        .withName("home_chair")
                        .withModel(new HomeChair(), "home_chair")
                        .withBoundingBox(0, 0, 0, 1, 0.7, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.WOOD)
                        .withHardness(2)
                        .withName("home_chair_rotated")
                        .withModel(new HomeChair(), "home_chair")
                        .withBoundingBox(0, 0, 0, 1, 0.7, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.WOOD)
                        .withHardness(2)
                        .withName("outdoor_chair")
                        .withModel(new OutdoorChair(), "outdoor_chair")
                        .withBoundingBox(0, 0, 0, 1, 0.7, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.WOOD)
                        .withHardness(2)
                        .withName("outdoor_chair_rotated")
                        .withModel(new OutdoorChair(), "outdoor_chair")
                        .withBoundingBox(0, 0, 0, 1, 0.7, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("vending_machine")
                        .withModel(new VendingMachine(), "electronics/vending_machine")
                        .withBoundingBox(0, 0, 0.1, 1, 2, 0.8)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.8f, 0.8f, 0.8f);
                            GL11.glTranslatef(0.55f, 0.4f, 0.62f);
                            GL11.glRotatef(180F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("server_rack_left")
                        .withModel(new ServerRackLeft(), "servers/server_rack_left")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("server_rack_empty_left")
                        .withModel(new ServerRackEmptyLeft(), "servers/server_rack_empty_right")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("server_rack_left_alt")
                        .withModel(new ServerRackLeftAlt(), "servers/server_rack_left_alt")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("server_rack_left_alt_2")
                        .withModel(new ServerRackLeftAlt2(), "servers/server_rack_left_alt_2")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("server_rack_left_alt_3")
                        .withModel(new ServerRackLeftAlt3(), "servers/server_rack_left_alt_3")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("server_rack_empty_right")
                        .withModel(new ServerRackEmptyRight(), "servers/server_rack_left_alt_3")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("server_rack_right")
                        .withModel(new ServerRackRight(), "servers/server_rack_left_alt_3")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("server_rack_right_alt")
                        .withModel(new ServerRackRightAlt(), "servers/server_rack_right_alt")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("server_rack_top_left")
                        .withModel(new ServerRackTop(), "servers/server_rack_left")
                        .withBoundingBox(0, 0, 0, 1, 0.3, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("server_rack_top_right")
                        .withModel(new ServerRackTopRight(), "servers/server_rack_right")
                        .withBoundingBox(0, 0, 0, 1, 0.3, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("floodlight_duel")
                        .withModel(new FloodlightDuel(), "lights/floodlight_duel")
                        .withBoundingBox(0, 0, 0, 1, 1.7, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.8f, 0.8f, 0.8f);
                            GL11.glTranslatef(0.65f, 0.35f, 0.65f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("floodlight_duel_rotated")
                        .withModel(new FloodlightDuel(), "lights/floodlight_duel")
                        .withBoundingBox(0, 0, 0, 1, 1.7, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.8f, 0.8f, 0.8f);
                            GL11.glTranslatef(0.65f, 0.35f, 0.65f);
                            GL11.glRotatef(45F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("floodlight")
                        .withModel(new Floodlight(), "lights/floodlight")
                        .withBoundingBox(0, 0, 0, 1, 0.75, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.9f, 0.9f, 0.9f);
                            GL11.glTranslatef(0.55f, 0.175f, 0.55f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("floodlight_rotated")
                        .withModel(new Floodlight(), "lights/floodlight")
                        .withBoundingBox(0, 0, 0, 1, 0.75, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.9f, 0.9f, 0.9f);
                            GL11.glTranslatef(0.55f, 0.175f, 0.55f);
                            GL11.glRotatef(45F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("radio")
                        .withModel(new Radio(), "electronics/radio")
                        .withBoundingBox(0.05, 0, 0.1, 0.9, 0.33, 0.77)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.7f, 0.7f, 0.7f);
                            GL11.glTranslatef(0.65f, 0.58f, 0.8f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("radio_rotated")
                        .withModel(new Radio(), "electronics/radio")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.7f, 0.7f, 0.7f);
                            GL11.glTranslatef(0.65f, 0.58f, 0.7f);
                            GL11.glRotatef(45F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("camera")
                        .withModel(new Camera(), "electronics/camera")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .modern(),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("camera_rotated")
                        .withModel(new Camera(), "electronics/camera")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> GL11.glRotatef(-45F, 0F, 1F, 0F))
                        .withTransform(Transform.getZero()
                                .withRotation(0F, -45F, 0F)
                                .withPosition(0F, 0F, -0.15F))
                        .modern(),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("propane_tank")
                        .withModel(new PropaneTank(), "propane_tank")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(0.6f, 0.6f, 0.6f);
                            GL11.glTranslatef(0.85f, 1f, 0.85f);
                            GL11.glRotatef(90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("floodlight_towable")
                        .withModel(new FloodlightTowable(), "lights/floodlight_towable")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.3f, 0f, 0.5f);
                            GL11.glRotatef(90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.SAND)
                        .withName("sandbag")
                        .withModel(new Sandbag(), "sandbag")
                        .withBoundingBox(0, 0, 0, 1, 0.5, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.SAND)
                        .withName("sandbag_wall")
                        .withModel(new SandbagWall(), "sandbag")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("gravestone")
                        .withModel(new Gravestone(), "gravestone/gravestone")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("gravestone_skull")
                        .withModel(new GravestoneSkull(), "gravestone/gravestone_skull")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("gravestone_cross")
                        .withModel(new CrossGravestone(), "gravestone/gravestone_cross")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("gravestone_cross_2")
                        .withModel(new CrossGravestone2(), "gravestone/gravestone_cross_2")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.ROCK)
                        .withHardness(3.5F)
                        .withName("gravestone_cross_3")
                        .withModel(new CrossGravestone3(), "gravestone/gravestone_cross_3")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.WOOD)
                        .withHardness(2)
                        .withName("scarecrow")
                        .withModel(new Scarecrow(), "scarecrow")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 0f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.CLOTH)
                        .withName("spooky_ghost")
                        .withModel(new SpookyGhost(), "ghost/spooky_ghost")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 1.05f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.CLOTH)
                        .withName("spooky_ghost_2")
                        .withModel(new SpookyGhost(), "ghost/spooky_ghost_2")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 1.05f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.CLOTH)
                        .withName("spooky_ghost_3")
                        .withModel(new SpookyGhost(), "ghost/spooky_ghost_3")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withPositioning(tileEntity -> {
                            GL11.glScalef(1f, 1f, 1f);
                            GL11.glTranslatef(0.5f, 1.05f, 0.5f);
                            GL11.glRotatef(-90F, 0f, 1f, 0f);
                        }),

                new CustomTileEntityConfiguration()
                        .withMaterial(Material.IRON)
                        .withHardness(22.5F)
                        .withName("swat_truck")
                        .withModel(new SwatTruck(), "swat_truck")
                        .withBoundingBox(0, 0, 0, 1, 1, 1)
                        .withTransform(new Transform().withScale(1.5F, 1.5F, 1.5F))
                        .modern()

        ));

        final ProgressManager.ProgressBar propsProgressBar = ProgressManager.push("Building Props", props.size());

        for (final CustomTileEntityConfiguration customTileEntityConfiguration : props) {
            final String name = I18n.format("tile." + ID + "_" + customTileEntityConfiguration.getName() + ".name");

            propsProgressBar.step(name);

            if (!customTileEntityConfiguration.isModern())
                LOG.debug("Non modern loot box configuration found: " + customTileEntityConfiguration.getName() + ". This may impact performance and should be modernized.");

            customTileEntityConfiguration.build(modContext);
        }

        LOG.debug("Built " + props.size() + " props");

        ProgressManager.pop(propsProgressBar);
    }
}
