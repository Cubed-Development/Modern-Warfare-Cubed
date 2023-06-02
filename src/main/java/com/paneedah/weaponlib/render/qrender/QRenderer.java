package com.paneedah.weaponlib.render.qrender;

import akka.japi.Pair;
import com.paneedah.weaponlib.animation.MatrixHelper;
import net.minecraft.client.model.*;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.relauncher.ReflectionHelper;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector4f;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class QRenderer extends ModelRenderer {

	private int displayList;

	public boolean baked = false;

	public QRenderer(ModelBase model) {
		super(model);
	}
	
	public void bake(float scale) {
		ArrayList<Pair<Matrix4f, ModelRenderer>> list = new ArrayList<>();
		
		GL11.glPushMatrix();
		GL11.glLoadIdentity();
		preprocessTransforms(list, this, scale);
		GL11.glPopMatrix();
		
		compiler(list, scale);
		
		this.baked = true;
	}
	

	public void compiler(ArrayList<Pair<Matrix4f, ModelRenderer>> list, float scale) {
		this.displayList = GLAllocation.generateDisplayLists(1);
		GlStateManager.glNewList(this.displayList, 4864);
		BufferBuilder bufferbuilder = Tessellator.getInstance().getBuffer();

		for (Pair<Matrix4f, ModelRenderer> parents : list) {
			for (ModelBox b : parents.second().cubeList) {
				transformQuads(b, parents.first());
				b.render(bufferbuilder, scale);
			}
		}

		/*
		 * for (int i = 0; i < this.cubeList.size(); ++i) {
		 * ((ModelBox)this.cubeList.get(i)).render(bufferbuilder, scale); }
		 */

		GlStateManager.glEndList();
	}

	public void transformQuads(ModelBox box, Matrix4f mat) {
		Field fieldQuadList = ReflectionHelper.findField(ModelBox.class, "quadList", "field_78254_i");

		try {
			TexturedQuad[] quadList = (TexturedQuad[]) fieldQuadList.get(box);

			for (TexturedQuad quad : quadList)
				applyMatrixToQuad(quad, mat);

			fieldQuadList.set(box, quadList);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void preprocessTransforms(ArrayList<Pair<Matrix4f, ModelRenderer>> list, ModelRenderer re, float scale) {
		if (re.isHidden || !re.showModel)
			return;

		GL11.glPushMatrix();
		applyTransformations(re, scale);
		if (!(re.childModels == null)) {
			for (ModelRenderer child : re.childModels)
				preprocessTransforms(list, child, scale);
		}

		GL11.glScaled(scale, scale, scale);
		list.add(new Pair<Matrix4f, ModelRenderer>(MatrixHelper.captureMatrix(), re));
		GL11.glPopMatrix();
	}

	public void applyTransformations(ModelRenderer re, float scale) {
		GlStateManager.translate(re.offsetX, re.offsetY, re.offsetZ);

		if (re.rotateAngleX == 0.0F && re.rotateAngleY == 0.0F && re.rotateAngleZ == 0.0F) {
			if (re.rotationPointX == 0.0F && re.rotationPointY == 0.0F && re.rotationPointZ == 0.0F) {
				/*
				 * GlStateManager.callList(re.displayList);
				 * 
				 * if (re.childModels != null) { for (int k = 0; k < re.childModels.size(); ++k)
				 * { ((ModelRenderer)re.childModels.get(k)).render(scale); } }
				 */
			} else {
				GlStateManager.translate(re.rotationPointX * scale, re.rotationPointY * scale,
						re.rotationPointZ * scale);
				/*
				 * GlStateManager.callList(re.displayList);
				 * 
				 * 
				 * if (re.childModels != null) { for (int j = 0; j < re.childModels.size(); ++j)
				 * { //System.out.println("BITHC: " +re.childModels.size());
				 * ((ModelRenderer)re.childModels.get(j)).render(scale); } }
				 */

				// GlStateManager.translate(-re.rotationPointX * scale, -re.rotationPointY *
				// scale, -re.rotationPointZ * scale);
			}
		} else {
			// GlStateManager.pushMatrix();
			GlStateManager.translate(re.rotationPointX * scale, re.rotationPointY * scale, re.rotationPointZ * scale);

			if (re.rotateAngleZ != 0.0F) {
				GlStateManager.rotate(re.rotateAngleZ * (180F / (float) Math.PI), 0.0F, 0.0F, 1.0F);
			}

			if (re.rotateAngleY != 0.0F) {
				GlStateManager.rotate(re.rotateAngleY * (180F / (float) Math.PI), 0.0F, 1.0F, 0.0F);
			}

			if (re.rotateAngleX != 0.0F) {
				GlStateManager.rotate(re.rotateAngleX * (180F / (float) Math.PI), 1.0F, 0.0F, 0.0F);
			}

			/*
			 * // System.out.println("joe bama"); GlStateManager.callList(re.displayList);
			 * 
			 * if (re.childModels != null) { for (int i = 0; i < re.childModels.size(); ++i)
			 * { System.out.println("JNDD: "+ re.childModels.size());
			 * ((ModelRenderer)re.childModels.get(i)).render(scale); } }
			 */

			// GlStateManager.popMatrix();
		}
		// GlStateManager.translate(-re.offsetX, -re.offsetY, -re.offsetZ);
	}

	@Override
	public void render(float scale) {
		// look into how to remove this rescale normal thing -3k ns
		GlStateManager.enableRescaleNormal();
		GL11.glScalef(1/scale, 1/scale, 1/scale);
		
		if (!this.isHidden && showModel) {
			if (!this.baked)
				bake(scale);
			GlStateManager.callList(this.displayList);
		}
		
		GL11.glScalef(scale, scale, scale);
		GlStateManager.disableRescaleNormal();
	}

	public void applyMatrixToQuad(TexturedQuad quad, Matrix4f mat) {
		quad.vertexPositions[0] = applyMatrixToPTV(quad.vertexPositions[0], mat);
		quad.vertexPositions[1] = applyMatrixToPTV(quad.vertexPositions[1], mat);
		quad.vertexPositions[2] = applyMatrixToPTV(quad.vertexPositions[2], mat);
		quad.vertexPositions[3] = applyMatrixToPTV(quad.vertexPositions[3], mat);
	}

	public PositionTextureVertex applyMatrixToPTV(PositionTextureVertex vert, Matrix4f openGLMAT) {
		Vec3d v = vert.vector3D;
		Vector4f v3d = new Vector4f((float) v.x, (float) v.y, (float) v.z, 1.0f);

		// org.lwjgl.util.vector.Matrix4f openGLMAT = MatrixHelper.captureMatrix();
		Vector4f r = org.lwjgl.util.vector.Matrix4f.transform(openGLMAT, v3d, null);
		vert.vector3D = new Vec3d(r.x, r.y, r.z);
		return vert;

	}
}
