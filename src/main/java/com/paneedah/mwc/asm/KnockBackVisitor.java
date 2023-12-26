package com.paneedah.mwc.asm;

import net.minecraft.launchwrapper.IClassTransformer;
import org.objectweb.asm.*;

public final class KnockBackVisitor extends ClassVisitor implements IClassTransformer {

    public KnockBackVisitor() {
        super(Opcodes.ASM5);
    }
    public KnockBackVisitor(ClassWriter classWriter) {
        super(Opcodes.ASM5, classWriter);
    }

    @Override
    public byte[] transform(String name, String transformedName, byte[] basicClass) {
        if (transformedName.equals("net.minecraftforge.event.entity.living.LivingKnockBackEvent")) {
            ClassReader classReader = new ClassReader(basicClass);
            ClassWriter classWriter = new ClassWriter(ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES);

            classReader.accept(new KnockBackVisitor(classWriter), ClassReader.EXPAND_FRAMES);
            return classWriter.toByteArray();
        }
        return basicClass;
    }

    @Override
    public void visitEnd() {
        MethodVisitor mv = cv.visitMethod(Opcodes.ACC_PUBLIC, "isCanceled", "()Z", null, null);
        mv.visitCode();

        /*  New Code
            @Override
            public boolean isCanceled() { return !knockbackOnHit && getOriginalAttacker() instanceof EntityProjectile; }
         */
        Label l = new Label();
        mv.visitFieldInsn(Opcodes.GETSTATIC, "com/paneedah/weaponlib/config/ModernConfigManager", "knockbackOnHit", "Z");
        mv.visitJumpInsn(Opcodes.IFNE, l);
        mv.visitVarInsn(Opcodes.ALOAD, 0);

        mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "net/minecraftforge/event/entity/living/LivingKnockBackEvent", "getOriginalAttacker", "()Lnet/minecraft/entity/Entity;", false);
        mv.visitTypeInsn(Opcodes.INSTANCEOF, "com/paneedah/weaponlib/EntityProjectile");
        mv.visitJumpInsn(Opcodes.IFEQ, l);
        mv.visitInsn(Opcodes.ICONST_1);

        Label l1 = new Label();
        mv.visitJumpInsn(Opcodes.GOTO, l1);

        mv.visitLabel(l);
        mv.visitInsn(Opcodes.ICONST_0);
        mv.visitLabel(l1);
        mv.visitInsn(Opcodes.IRETURN);
        mv.visitMaxs(1, 1);
        mv.visitEnd();
        super.visitEnd();
    }
}
