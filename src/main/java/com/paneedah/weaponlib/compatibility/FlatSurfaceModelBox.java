package com.paneedah.weaponlib.compatibility;

import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.PositionTextureVertex;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class FlatSurfaceModelBox extends ModelBox {

    private static class TexturedQuad {
        private PositionTextureVertex[] vertexPositions;
        private boolean invertNormal;

        public TexturedQuad(PositionTextureVertex[] vertices) {
            vertexPositions = vertices;
        }

        public TexturedQuad(PositionTextureVertex[] vertices, int texcoordU1, int texcoordV1, int texcoordU2, int texcoordV2, float textureWidth, float textureHeight) {
            this(vertices);
            vertices[0] = vertices[0].setTexturePosition(0f, 0f);
            vertices[1] = vertices[1].setTexturePosition(1, 0f);
            vertices[2] = vertices[2].setTexturePosition(1, 1);
            vertices[3] = vertices[3].setTexturePosition(0f, 1);

        }

        public void flipFace() {
            PositionTextureVertex[] apositiontexturevertex = new PositionTextureVertex[vertexPositions.length];

            for (int i = 0; i < vertexPositions.length; ++i) {
                apositiontexturevertex[i] = vertexPositions[vertexPositions.length - i - 1];
            }

            vertexPositions = apositiontexturevertex;
        }

        @SideOnly(Side.CLIENT)
        public void draw(BufferBuilder renderer, float scale) {

            Vec3d vec3d = vertexPositions[1].vector3D.subtractReverse(vertexPositions[0].vector3D);
            Vec3d vec3d1 = vertexPositions[1].vector3D.subtractReverse(vertexPositions[2].vector3D);
            Vec3d vec3d2 = vec3d1.crossProduct(vec3d).normalize();
            float f = (float) vec3d2.x;
            float f1 = (float) vec3d2.y;
            float f2 = (float) vec3d2.z;

            if (invertNormal) {
                f = -f;
                f1 = -f1;
                f2 = -f2;
            }

            renderer.begin(7, DefaultVertexFormats.OLDMODEL_POSITION_TEX_NORMAL);

            for (int i = 0; i < 4; ++i) {
                PositionTextureVertex positiontexturevertex = vertexPositions[i];
                renderer.pos(positiontexturevertex.vector3D.x * (double) scale, positiontexturevertex.vector3D.y * (double) scale, positiontexturevertex.vector3D.z * (double) scale).tex(positiontexturevertex.texturePositionX, positiontexturevertex.texturePositionY).normal(f, f1, f2).endVertex();
            }

            Tessellator.getInstance().draw();
        }
    }

    /**
     * An array of 6 TexturedQuads, one for each face of a cube
     */
    private final TexturedQuad quad;

    public FlatSurfaceModelBox(ModelRenderer renderer, int par2, int par3,
                               float posX1, float posY1, float posZ1,
                               int sizeX, int sizeY, int sizeZ, float p_i1171_10_) {
        super(renderer, par2, par3, posX1, posY1, posZ1, sizeX, sizeY, sizeZ,
                p_i1171_10_);

        /**
         * The (x,y,z) vertex positions and (u,v) texture coordinates for each of the 8 points on a cube
         */
        PositionTextureVertex[] vertexPositions = new PositionTextureVertex[8];
        float adjX2 = posX1 + (float) sizeX;
        float adjY2 = posY1 + (float) sizeY;
        float adjZ2 = posZ1 + (float) sizeZ;
        posX1 -= p_i1171_10_;
        posY1 -= p_i1171_10_;
        adjX2 += p_i1171_10_;
        adjY2 += p_i1171_10_;
        adjZ2 += p_i1171_10_;

        if (renderer.mirror) {
            float f7 = adjX2;
            adjX2 = posX1;
            posX1 = f7;
        }

        PositionTextureVertex backLowerLeft = new PositionTextureVertex(posX1, posY1, adjZ2, 0.0F, 0.0F); // back lower left
        PositionTextureVertex backLowerRight = new PositionTextureVertex(adjX2, posY1, adjZ2, 0.0F, 8.0F); // back lower right
        PositionTextureVertex backUpperRight = new PositionTextureVertex(adjX2, adjY2, adjZ2, 8.0F, 8.0F); // back upper right
        PositionTextureVertex backUpperLeft = new PositionTextureVertex(posX1, adjY2, adjZ2, 8.0F, 0.0F); // back upper left

        vertexPositions[4] = backLowerLeft;
        vertexPositions[5] = backLowerRight;
        vertexPositions[6] = backUpperRight;
        vertexPositions[7] = backUpperLeft;

        quad = new TexturedQuad(new PositionTextureVertex[]{
                backUpperRight, backUpperLeft, backLowerLeft, backLowerRight},
                par2 + sizeZ + sizeX + sizeZ,
                par3 + sizeZ,
                par2 + sizeZ + sizeX + sizeZ + sizeX, par3 + sizeZ + sizeY,
                renderer.textureWidth,
                renderer.textureHeight);

        if (renderer.mirror) {
            quad.flipFace();
        }
    }

    @SideOnly(Side.CLIENT)
    public void render(BufferBuilder renderer, float scale) {
        quad.draw(renderer, scale);
    }
}
