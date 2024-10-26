package com.paneedah.weaponlib.render;

import com.paneedah.weaponlib.animation.MatrixHelper;
import com.paneedah.weaponlib.render.bgl.instancing.InstancedAttribute;
import com.paneedah.weaponlib.render.bgl.instancing.ModelInstancedObject;
import com.paneedah.weaponlib.render.shells.ShellManager;
import com.paneedah.weaponlib.render.shells.ShellParticleSimulator.Shell;
import com.paneedah.weaponlib.render.shells.ShellParticleSimulator.Shell.Type;
import com.paneedah.weaponlib.shader.jim.Uniform;
import net.minecraft.util.math.BlockPos;
import org.lwjgl.opengl.GL20;
import org.lwjgl.util.vector.Quaternion;

import java.util.ArrayList;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

public class InstancedShellObject extends ModelInstancedObject<ShellManager> {
    private final Type type;

    public InstancedShellObject(Shell.Type type, String shader, WavefrontModel model, int renderMode, int maxCopies, InstancedAttribute... attribs) {
        super(shader, model, renderMode, maxCopies, attribs);
        this.type = type;
    }

    @Override
    protected void setupShader() {
        // TODO Auto-generated method stub
        super.setupShader();
        getRenderShader().withUniforms(new Uniform() {

            @Override
            public void apply(int shader) {
                GL20.glUniform1i(GL20.glGetUniformLocation(shader, "lightmap"), 1);
            }

        });
    }


    public void updateData(ArrayList<Shell> shells) {

        arrayPointer = 0;
        float[] data = new float[getInstanceDataLength() * getMaxObjects()];
        for (Shell sh : shells) {
            if (sh.getType() != type) {
                continue;
            }
            float iX = (float) MatrixHelper.solveLerp(sh.prevPos.x, sh.pos.x, MC.getRenderPartialTicks());
            float iY = (float) MatrixHelper.solveLerp(sh.prevPos.y, sh.pos.y, MC.getRenderPartialTicks());
            float iZ = (float) MatrixHelper.solveLerp(sh.prevPos.z, sh.pos.z, MC.getRenderPartialTicks());

            data[arrayPointer++] = iX;
            data[arrayPointer++] = iY;
            data[arrayPointer++] = iZ;

            double rX = MatrixHelper.solveLerp(sh.prevRot.x, sh.rot.x, MC.getRenderPartialTicks());
            double rY = MatrixHelper.solveLerp(sh.prevRot.y, sh.rot.y, MC.getRenderPartialTicks());
            double rZ = MatrixHelper.solveLerp(sh.prevRot.z, sh.rot.z, MC.getRenderPartialTicks());


            Quaternion quat = MatrixHelper.fromEulerAngles(Math.toRadians(rX), Math.toRadians(rY), Math.toRadians(rZ));

            data[arrayPointer++] = quat.w;
            data[arrayPointer++] = quat.x;
            data[arrayPointer++] = quat.y;
            data[arrayPointer++] = quat.z;

            int i = MC.world.getCombinedLight(new BlockPos(sh.pos.x, sh.pos.y, sh.pos.z), 0);
            float f = (float) (i & 65535);
            float f1 = (float) (i >> 16);


            data[arrayPointer++] = (f + 8) / 256f;
            data[arrayPointer++] = (f1 + 8) / 256f;


            //System.out.println((f/255f) + " | " + (f1/255f));
        }
        uploadToBuffer(data);

    }

}
