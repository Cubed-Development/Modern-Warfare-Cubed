package com.paneedah.weaponlib.render;

import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.TexturedQuad;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.relauncher.ReflectionHelper;
import org.lwjgl.util.vector.Matrix4f;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ModelRenderTool {

    public static Field quadListField = null;

    public static class VertexData {
        public Vec3d[] positions;
        public int[] positionsIndices;
        public float[] texCoords;


        public float[] vertexArray() {
            float[] verts = new float[positions.length * 3];
            for (int i = 0; i < positions.length; i++) {
                Vec3d pos = positions[i];
                verts[i * 3] = (float) pos.x;
                verts[i * 3 + 1] = (float) pos.y;
                verts[i * 3 + 2] = (float) pos.z;
            }
            return verts;
        }
    }

    public static VertexData compress(Triangle[] tris) {
        List<Vec3d> vertices = new ArrayList<Vec3d>(tris.length * 3);
        int[] indices = new int[tris.length * 3];
        float[] texCoords = new float[tris.length * 6];
        for (int i = 0; i < tris.length; i++) {
            Triangle tri = tris[i];
            double eps = 0.00001D;
            int idx = epsIndexOf(vertices, tri.p1.pos, eps);
            if (idx != -1) {
                indices[i * 3] = idx;
            } else {
                indices[i * 3] = vertices.size();
                vertices.add(tri.p1.pos);
            }

            idx = epsIndexOf(vertices, tri.p2.pos, eps);
            if (idx != -1) {
                indices[i * 3 + 1] = idx;
            } else {
                indices[i * 3 + 1] = vertices.size();
                vertices.add(tri.p2.pos);
            }

            idx = epsIndexOf(vertices, tri.p3.pos, eps);
            if (idx != -1) {
                indices[i * 3 + 2] = idx;
            } else {
                indices[i * 3 + 2] = vertices.size();
                vertices.add(tri.p3.pos);
            }

            texCoords[i * 6] = tri.p1.texX;
            texCoords[i * 6 + 1] = tri.p1.texY;
            texCoords[i * 6 + 2] = tri.p2.texX;
            texCoords[i * 6 + 3] = tri.p2.texY;
            texCoords[i * 6 + 4] = tri.p3.texX;
            texCoords[i * 6 + 5] = tri.p3.texY;
        }
        VertexData data = new VertexData();
        data.positions = vertices.toArray(new Vec3d[0]);
        //data.positionIndices = indices;
        data.texCoords = texCoords;
        return data;
    }

    public static boolean epsilonEquals(Vec3d a, Vec3d b, double eps) {
        double dx = Math.abs(a.x - b.x);
        double dy = Math.abs(a.y - b.y);
        double dz = Math.abs(a.z - b.z);

        return dx < eps && dy < eps && dz < eps;
    }

    private static int epsIndexOf(List<Vec3d> l, Vec3d vec, double eps) {
        for (int i = 0; i < l.size(); i++) {
            if (epsilonEquals(vec, l.get(i), eps)) {
                return i;
            }
        }
        return -1;
    }


    public static Triangle[] triangulate(ModelBox b, Matrix4f transform) {
        if (quadListField == null) {
            quadListField = ReflectionHelper.findField(ModelBox.class, "quadList", "field_78254_i");
        }
        TexturedQuad[] quadList;
        Triangle[] tris = new Triangle[12];
        try {
            quadList = (TexturedQuad[]) quadListField.get(b);
            int i = 0;
            for (TexturedQuad t : quadList) {
                Vec3d v0 = transformViaMatrix(t.vertexPositions[0].vector3D, transform);
                Vec3d v1 = transformViaMatrix(t.vertexPositions[1].vector3D, transform);
                Vec3d v2 = transformViaMatrix(t.vertexPositions[2].vector3D, transform);
                Vec3d v3 = transformViaMatrix(t.vertexPositions[3].vector3D, transform);
                float[] tex = new float[6];
                tex[0] = t.vertexPositions[0].texturePositionX;
                tex[1] = t.vertexPositions[0].texturePositionY;
                tex[2] = t.vertexPositions[1].texturePositionX;
                tex[3] = t.vertexPositions[1].texturePositionY;
                tex[4] = t.vertexPositions[2].texturePositionX;
                tex[5] = t.vertexPositions[2].texturePositionY;
                tris[i++] = new Triangle(v0, v1, v2, tex);
                tex = new float[6];
                tex[0] = t.vertexPositions[2].texturePositionX;
                tex[1] = t.vertexPositions[2].texturePositionY;
                tex[2] = t.vertexPositions[3].texturePositionX;
                tex[3] = t.vertexPositions[3].texturePositionY;
                tex[4] = t.vertexPositions[0].texturePositionX;
                tex[5] = t.vertexPositions[0].texturePositionY;
                tris[i++] = new Triangle(v2, v3, v0, tex);
            }
            return tris;
        } catch (IllegalArgumentException | IllegalAccessException e) {
        }
        throw new RuntimeException("Failed to get quads!");

    }

    public static Vec3d transformViaMatrix(Vec3d vec, Matrix4f mat) {
        if (mat != null) {
            double x = mat.m00 * vec.x + mat.m10 * vec.y + mat.m20 * vec.z + mat.m30;
            double y = mat.m01 * vec.x + mat.m11 * vec.y + mat.m21 * vec.z + mat.m31;
            double z = mat.m02 * vec.x + mat.m12 * vec.y + mat.m22 * vec.z + mat.m32;
            return new Vec3d(x, y, z);
        }
        return vec;
    }

    public static float[] transformViaMatrix(float x1, float y1, float z1, Matrix4f mat) {
        if (mat != null) {
            float x = mat.m00 * x1 + mat.m10 * y1 + mat.m20 * z1 + mat.m30;
            float y = mat.m01 * x1 + mat.m11 * y1 + mat.m21 * z1 + mat.m31;
            float z = mat.m02 * x1 + mat.m12 * y1 + mat.m22 * z1 + mat.m32;
            return new float[]{x, y, z};
        }
        return new float[]{x1, y1, z1};
    }

    public static float[] transformViaMatrix(float[] vec, Matrix4f mat) {
        if (mat != null) {
            float x = mat.m00 * vec[0] + mat.m10 * vec[1] + mat.m20 * vec[2] + mat.m30;
            float y = mat.m01 * vec[0] + mat.m11 * vec[1] + mat.m21 * vec[2] + mat.m31;
            float z = mat.m02 * vec[0] + mat.m12 * vec[1] + mat.m22 * vec[2] + mat.m32;
            return new float[]{x, y, z};
        }
        return vec;
    }


}
