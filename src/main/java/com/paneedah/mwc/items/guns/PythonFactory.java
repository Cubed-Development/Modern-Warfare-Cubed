package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.weapons.Python;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.Attachments;
import com.paneedah.mwc.weapons.AuxiliaryAttachments;
import com.paneedah.mwc.weapons.Bullets;
import com.paneedah.weaponlib.Weapon;
import com.paneedah.weaponlib.WeaponRenderer;
import com.paneedah.mwc.rendering.Transform;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

public class PythonFactory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
				.withName("Python")
				.withAmmoCapacity(6)
				.withFireRate(0.2f)
				.withRecoil(6f)
				.withZoom(0.9f)
				.withConfigGroup(GunConfigurationGroup.HANDGUN)
				.withMaxShots(1)
				.withMuzzlePosition(new Vec3d(-.15, -0.8, -4.3))
				.withShootSound("python")
				.withReloadSound("revolver_reload")
				.withReloadIterationSound("revolver_insert_bullet")
				.withAllReloadIterationsCompletedSound("revolver_load_complete")
				.withReloadingTime(25)
				.withFlashIntensity(0.5f)
				.withFlashScale(() -> 0.6f)
				.withFlashOffsetX(() -> 0.1f)
				.withFlashOffsetY(() -> 0.15f)
				.withInaccuracy(2)
				.withShellCasingEjectEnabled(false)
				.withCreativeTab(MWC.WEAPONS_TAB)
				.useNewSystem()
				.withRecoilParam(new RecoilParam(
						85.0,
						13.125,
						50.0,
						0.3625,
						0.325,
						0.0,
						0.0,
						1.0
				))

				.withCompatibleAttachment(AuxiliaryAttachments.PythonChamber, true, (model) -> {
				})
				.withCompatibleAttachment(AuxiliaryAttachments.RevolverSpeedLoader, true, (model) -> {
				})
				.withCompatibleAttachment(AuxiliaryAttachments.RevolverSpeedLoaderBullets, true, (model) -> {
				})
				.withCompatibleAttachment(Attachments.DanWessonLaser, () -> {
					GL11.glTranslatef(-0.3F, -0.7F, -3.0F);
					GL11.glScaled(0.9F, 0.9F, 0.9F);
				})
				.withCompatibleBullet(Bullets.Bullet357, (model) -> {
				})
				.withTextureNames("Python")
				.withRenderer(new WeaponRenderer.Builder()
						.withModel(new Python())

						.withEntityPositioning(itemStack -> {
							GL11.glScaled(0.4F, 0.4F, 0.4F);
							GL11.glTranslatef(0, 0f, 3f);
							GL11.glRotatef(0F, 0f, 0f, 4f);
						})
						.withInventoryPositioning(itemStack -> {
							GL11.glScaled(0.35F, 0.35F, 0.35F);
							GL11.glTranslatef(0, 0.8f, 0);
							GL11.glRotatef(-120F, -0.5f, 7f, 3f);
						})
						.withThirdPersonPositioning((renderContext) -> {
							GL11.glScaled(0.5F, 0.5F, 0.5F);
							GL11.glTranslatef(-1.8F, -1F, 2F);
							GL11.glRotatef(-45F, 0f, 1f, 0f);
							GL11.glRotatef(70F, 1f, 0f, 0f);
						})

						.withFirstPersonPositioning(
								new Transform()
										.withPosition(-0.945000f, 4.065000f, -7.845000f)
										.withRotation(0.000000f, 1.000000f, 0.681469f)
										.withPivotPoint(-0.12000000357627871F, -0.36000001072883614F, 0.040000001192092904F)
										.withScale(3.0F, 3.0F, 3.0F)
						)

						.withFirstPersonHandPositioning(


								new Transform()
										.withPosition(1.370000f, 1.025000f, 2.140000f)
										.withBBRotation(-12.9672F, -29.0825F, 67.8433F)
										.withScale(3, 3, 4)
										.withPivotPoint(0, 0, 0),


								new Transform()
										.withPosition(-0.320000f, 0.260000f, 1.920000f)
										.withBBRotation(10.0931F, 10.9576F, -10.0294F)
										.withScale(3, 3, 3.5F)
										.withPivotPoint(0, 0, 0)

						)

						.setupModernAnimations("taurus", Attachments.P226Slide)
						.setupCustomKeyedPart(AuxiliaryAttachments.PythonChamber, "taurus", "chamber")
						.setupCustomKeyedPart(AuxiliaryAttachments.RevolverSpeedLoader, "taurus", "loader")
						.setupCustomKeyedPart(AuxiliaryAttachments.RevolverSpeedLoaderBullets, "taurus", "bullets")

						.withFirstPersonPositioningZooming((renderContext) -> {
							GL11.glTranslatef(0.188F, -0.295F, -1.3F);
						})

						.withFirstPersonPositioningModifying((renderContext) -> {
							new Transform()
									.withPosition(-0.945000f, 3.625000f, -7.165000f)
									.withRotation(-4.041486f, -30.854630f, -19.420376f)
									.withPivotPoint(-0.120000f, -0.360000f, 0.040000f)
									.withScale(3.000000f, 3.000000f, 3.000000f)
									.applyTransformations();
						})
						.withFirstPersonPositioningModifyingAlt((renderContext) -> {
							new Transform()
									.withPosition(-0.945000f, 3.625000f, -7.885000f)
									.withRotation(-4.041486f, -45.595835f, -21.768277f)
									.withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
									.withScale(3.000000f, 3.000000f, 3.000000f)
									.applyTransformations();
						})

						.withFirstPersonHandPositioningModifying(
								(renderContext) -> {
									new Transform()
											.withPosition(2.770000f, 1.225000f, 0.140000f)
											.withRotation(73.670132f, -70.659155f, 41.991085f)
											.withScale(2.6F, 2.6F, 4.0F)
											.withPivotPoint(0.000000f, 0.000000f, 0.000000f)
											.applyTransformations();
								},
								(renderContext) -> {
									new Transform()
											.withPosition(-0.320000f, 0.140000f, 2.040000f)
											.withBBRotation(10.0931F, 10.9576F, -10.0294F)
											.withScale(3, 3, 3.5F)
											.withPivotPoint(0, 0, 0)
											.applyTransformations();
								})

						.withFirstPersonHandPositioningModifyingAlt(
								(renderContext) -> {
									new Transform()
											.withPosition(2.770000f, 1.225000f, 0.140000f)
											.withRotation(73.670132f, -70.659155f, 41.991085f)
											.withScale(2.6F, 2.6F, 4.0F)
											.withPivotPoint(0.000000f, 0.000000f, 0.000000f)
											.applyTransformations();
								},
								(renderContext) -> {
									new Transform()
											.withPosition(-0.320000f, 0.140000f, 2.040000f)
											.withBBRotation(10.0931F, 10.9576F, -10.0294F)
											.withScale(3, 3, 3.5F)
											.withPivotPoint(0, 0, 0)
											.applyTransformations();
								})

						.build())
				.withSpawnEntityDamage(10f)
				.withSpawnEntityGravityVelocity(0.016f)


				.build(MWC.modContext);
	}
}