package com.paneedah.weaponlib.render.qrender;

import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.PositionTextureVertex;
import net.minecraft.client.model.TexturedQuad;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector4f;

public class QBoxer extends ModelBox {

	private PositionTextureVertex[] vertexPositions;
	private TexturedQuad[] quadList;

	
	/*
	 * CONSTRUCTOR INFO
	 */
	public int texU;
	public int texV;
	public float x;
	public float y;
	public float z;
	public int dx;
	public int dy;
	public int dz;
	public float delta;
	public boolean mirror;


	
	
	
	public QBoxer(ModelRenderer renderer, int texU, int texV, float x, float y, float z, int dx, int dy, int dz,
			float delta, boolean mirror) {
		super(renderer, texU, texV, x, y, z, dx, dy, dz, delta, mirror);

		/*
        this.vertexPositions = new PositionTextureVertex[8];
        this.quadList = new TexturedQuad[6];
        float f = x + (float)dx;
        float f1 = y + (float)dy;
        float f2 = z + (float)dz;
        x = x - delta;
        y = y - delta;
        z = z - delta;
        f = f + delta;
        f1 = f1 + delta;
        f2 = f2 + delta;

        if (mirror)
        {
            float f3 = f;
            f = x;
            x = f3;
        }

        PositionTextureVertex positiontexturevertex7 = new PositionTextureVertex(x, y, z, 0.0F, 0.0F);
        PositionTextureVertex positiontexturevertex = new PositionTextureVertex(f, y, z, 0.0F, 8.0F);
        PositionTextureVertex positiontexturevertex1 = new PositionTextureVertex(f, f1, z, 8.0F, 8.0F);
        PositionTextureVertex positiontexturevertex2 = new PositionTextureVertex(x, f1, z, 8.0F, 0.0F);
        PositionTextureVertex positiontexturevertex3 = new PositionTextureVertex(x, y, f2, 0.0F, 0.0F);
        PositionTextureVertex positiontexturevertex4 = new PositionTextureVertex(f, y, f2, 0.0F, 8.0F);
        PositionTextureVertex positiontexturevertex5 = new PositionTextureVertex(f, f1, f2, 8.0F, 8.0F);
        PositionTextureVertex positiontexturevertex6 = new PositionTextureVertex(x, f1, f2, 8.0F, 0.0F);
        
        
        applyMatrixTransforms(positiontexturevertex, openGLMAT);
        applyMatrixTransforms(positiontexturevertex1, openGLMAT);
        applyMatrixTransforms(positiontexturevertex2, openGLMAT);
        applyMatrixTransforms(positiontexturevertex3, openGLMAT);
        applyMatrixTransforms(positiontexturevertex4, openGLMAT);
        applyMatrixTransforms(positiontexturevertex5, openGLMAT);
        applyMatrixTransforms(positiontexturevertex6, openGLMAT);
        applyMatrixTransforms(positiontexturevertex7, openGLMAT);
        
        this.vertexPositions[0] = positiontexturevertex7;
        this.vertexPositions[1] = positiontexturevertex;
        this.vertexPositions[2] = positiontexturevertex1;
        this.vertexPositions[3] = positiontexturevertex2;
        this.vertexPositions[4] = positiontexturevertex3;
        this.vertexPositions[5] = positiontexturevertex4;
        this.vertexPositions[6] = positiontexturevertex5;
        this.vertexPositions[7] = positiontexturevertex6;
        this.quadList[0] = new TexturedQuad(new PositionTextureVertex[] {positiontexturevertex4, positiontexturevertex, positiontexturevertex1, positiontexturevertex5}, texU + dz + dx, texV + dz, texU + dz + dx + dz, texV + dz + dy, renderer.textureWidth, renderer.textureHeight);
        this.quadList[1] = new TexturedQuad(new PositionTextureVertex[] {positiontexturevertex7, positiontexturevertex3, positiontexturevertex6, positiontexturevertex2}, texU, texV + dz, texU + dz, texV + dz + dy, renderer.textureWidth, renderer.textureHeight);
        this.quadList[2] = new TexturedQuad(new PositionTextureVertex[] {positiontexturevertex4, positiontexturevertex3, positiontexturevertex7, positiontexturevertex}, texU + dz, texV, texU + dz + dx, texV + dz, renderer.textureWidth, renderer.textureHeight);
        this.quadList[3] = new TexturedQuad(new PositionTextureVertex[] {positiontexturevertex1, positiontexturevertex2, positiontexturevertex6, positiontexturevertex5}, texU + dz + dx, texV + dz, texU + dz + dx + dx, texV, renderer.textureWidth, renderer.textureHeight);
        this.quadList[4] = new TexturedQuad(new PositionTextureVertex[] {positiontexturevertex, positiontexturevertex7, positiontexturevertex2, positiontexturevertex1}, texU + dz, texV + dz, texU + dz + dx, texV + dz + dy, renderer.textureWidth, renderer.textureHeight);
        this.quadList[5] = new TexturedQuad(new PositionTextureVertex[] {positiontexturevertex3, positiontexturevertex4, positiontexturevertex5, positiontexturevertex6}, texU + dz + dx + dz, texV + dz, texU + dz + dx + dz + dx, texV + dz + dy, renderer.textureWidth, renderer.textureHeight);

        if (mirror)
        {
            for (TexturedQuad texturedquad : this.quadList)
            {
                texturedquad.flipFace();
            }
        }*/
	}
	
	


	
	public void applyMatrixTransforms(PositionTextureVertex vert, Matrix4f openGLMAT) {
		Vec3d v = vert.vector3D;
		Vector4f v3d = new Vector4f((float) v.x, (float) v.y, (float) v.z, 1.0f);
		
		
		//org.lwjgl.util.vector.Matrix4f openGLMAT = MatrixHelper.captureMatrix();
		Vector4f r = org.lwjgl.util.vector.Matrix4f.transform(openGLMAT, v3d, null);
		vert.vector3D = new Vec3d(r.x, r.y, r.z);
		
	}

}
