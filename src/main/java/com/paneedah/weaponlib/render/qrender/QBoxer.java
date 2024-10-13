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

    }


    public void applyMatrixTransforms(PositionTextureVertex vert, Matrix4f openGLMAT) {
        Vec3d v = vert.vector3D;
        Vector4f v3d = new Vector4f((float) v.x, (float) v.y, (float) v.z, 1.0f);


        //org.lwjgl.util.vector.Matrix4f openGLMAT = MatrixHelper.captureMatrix();
        Vector4f r = org.lwjgl.util.vector.Matrix4f.transform(openGLMAT, v3d, null);
        vert.vector3D = new Vec3d(r.x, r.y, r.z);

    }

}
