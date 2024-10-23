package com.paneedah.mwc.asm;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemBlock;
import net.minecraft.launchwrapper.IClassTransformer;
import org.objectweb.asm.*;
import org.objectweb.asm.util.TraceClassVisitor;

import java.io.File;
import java.io.PrintWriter;

public class MWCClassTransformer implements IClassTransformer {

    private static final ClassInfo playSoundClassInfo = ClassInfoProvider.getInstance()
            .getClassInfo("paulscode.sound.libraries.SourceLWJGLOpenAL");

    private static final ClassInfo entityRendererClassInfo = ClassInfoProvider.getInstance()
            .getClassInfo("net/minecraft/client/renderer/EntityRenderer");

    private static final ClassInfo renderBipedClassInfo = ClassInfoProvider.getInstance()
            .getClassInfo("net/minecraft/client/renderer/entity/RenderBiped");

    private static final ClassInfo modelBipedClassInfo = ClassInfoProvider.getInstance()
            .getClassInfo("net/minecraft/client/model/ModelBiped");

    private static final ClassInfo modelPlayerClassInfo = ClassInfoProvider.getInstance()
            .getClassInfo("net/minecraft/client/model/ModelPlayer");

    private static final ClassInfo renderLivingBaseClassInfo = ClassInfoProvider.getInstance()
            .getClassInfo("net/minecraft/client/renderer/entity/RenderLivingBase");

    private static final ClassInfo layerArmorBaseClassInfo = ClassInfoProvider.getInstance()
            .getClassInfo("net/minecraft/client/renderer/entity/layers/LayerArmorBase");

    private static final ClassInfo layerHeldItemClassInfo = ClassInfoProvider.getInstance()
            .getClassInfo("net/minecraft/client/renderer/entity/layers/LayerHeldItem");

    private static final ClassInfo entityPlayerSPClassInfo = ClassInfoProvider.getInstance()
            .getClassInfo("net/minecraft/client/entity/EntityPlayerSP");

    private static final ClassInfo entityPlayerMPClassInfo = ClassInfoProvider.getInstance()
            .getClassInfo("net/minecraft/entity/player/EntityPlayerMP");

    private static final ClassInfo inventoryChangeTriggerClassInfo = ClassInfoProvider.getInstance()
            .getClassInfo("net/minecraft/advancements/critereon/InventoryChangeTrigger");

    private static final ClassInfo entityPlayerClassInfo = ClassInfoProvider.getInstance()
            .getClassInfo("net/minecraft/entity/player/EntityPlayer");

    private static final ClassInfo entityLivingBaseClassInfo = ClassInfoProvider.getInstance()
            .getClassInfo("net/minecraft/entity/EntityLivingBase");

    private static final ClassInfo modelRendererClassInfo = ClassInfoProvider.getInstance()
            .getClassInfo("net/minecraft/client/model/ModelRenderer");

    private static class UpdateCameraAndRenderMethodVisitor extends MethodVisitor {

        public UpdateCameraAndRenderMethodVisitor(MethodVisitor mv) {
            super(Opcodes.ASM4, mv);
        }

        @Override
        public void visitMethodInsn(int opcode, String owner, String name, String desc, boolean itf) {
            if (entityPlayerSPClassInfo.methodMatches("turn", "(FF)V", owner, name, desc)) {
                mv.visitMethodInsn(Opcodes.INVOKESTATIC,
                        "com/paneedah/mwc/asm/Interceptors", "turn",
                        "(Lnet/minecraft/entity/player/EntityPlayer;FF)V", false);
            } else {
                super.visitMethodInsn(opcode, owner, name, desc, itf);
            }
        }
    }

    public static void collideWithPlayer(Entity entityIn) {
        System.out.println("Swapped");
    }

    private static class TestVisitor extends MethodVisitor {


        public TestVisitor(MethodVisitor mv) {
            super(Opcodes.ASM4, mv);
            System.out.println("HI I AM TEST VISIRO!");
        }

        @Override
        public void visitMethodInsn(int opcode, String owner, String name, String desc, boolean itf) {
            super.visitMethodInsn(opcode, owner, name, desc, itf);

        }

        @Override
        public void visitLineNumber(int line, Label start) {
            if (line == 2167) {

                mv.visitVarInsn(Opcodes.ALOAD, 0);
                mv.visitInsn(Opcodes.DUP);
                mv.visitFieldInsn(Opcodes.GETFIELD, "net/minecraft/entity/EntityLivingBase", "motionY", "D");
                //mv.visit
                mv.visitLdcInsn(Double.valueOf(0.07));
                mv.visitInsn(Opcodes.DADD);
                mv.visitFieldInsn(Opcodes.PUTFIELD, "net/minecraft/entity/EntityLivingBase", "motionY", "D");
                //mv.visitVarInsn(Opcodes.GOTO, 77);
                //mv.visitVarInsn(Opcodes.LDC, 0.1);
                // net/minecraft/entity/EntityLivingBase

            } else {
                super.visitLineNumber(line, start);
            }

            //System.out.println(line);
        }

        @Override
        public void visitJumpInsn(int opcode, Label label) {
            super.visitJumpInsn(opcode, label);

        }
    }

    public static void debugPrint(String fileName, String classFile, byte[] byteCode) {
        ClassReader reader = new ClassReader(byteCode);

        File f = new File(fileName);
        try {
            f.createNewFile();
        } catch (Exception ignored) {
        }

        PrintWriter pw = null;
        try {
            pw = new PrintWriter(f);
        } catch (Exception ignored) {
        }

        TraceClassVisitor tcv = new TraceClassVisitor(pw);
        reader.accept(tcv, 0);


    }

    public byte[] transform(String par1, String className, byte[] bytecode) {


        // https://blog.techno.fish/minecraft-forge-coremod-tutorial/
        // https://github.com/CreativeMD/CreativeCore/blob/1.12/src/main/java/com/creativemd/creativecore/transformer/CreativeTransformer.java

    	/*
    	if(className.equals("net.minecraft.entity.player.EntityPlayer")) {
    		System.out.println("FOUND ENTITY PLAYER CLASS!");
    		ClassNode node = new ClassNode();
    		ClassReader reader = new ClassReader(bytecode);
    		reader.accept(node, 0);

    		for (MethodNode method : node.methods) {
    			if(method.name.equals("collideWithPlayer")) {





    				//method.lin

    				System.out.println("FOUND COLLIDE W/ PLAYER METHOD!");
    				InsnList payload = new InsnList();

    				//payload.add(new VarInsnNode(Opcodes.ALOAD, 1));
    				//v.visitVarInsn(Opcodes.FLOAD, 1);

    				//payload.add(new VarInsnNode(Opcodes.FLOAD, 1));
    				Method other = null;
    				try {
						other = getClass().getDeclaredMethod("collideWithPlayer", Entity.class);
					} catch (NoSuchMethodException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SecurityException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

    				System.out.println("Payload intl. name: " + Type.getInternalName(getClass()));
    				System.out.println("Payload method descriptor: " + Type.getMethodDescriptor(other));

    				payload.add(new MethodInsnNode(Opcodes.INVOKESTATIC,
    						Type.getInternalName(getClass()), other.getName(),
    						Type.getMethodDescriptor(other), false));
    				//payload.add(new VarInsnNode(Opcodes.ASTORE, 1));


    				//method.instructions.clear();
    				method.
    				//method.instructions.insert(payload);

    			}
    		}


    		try {
				//Textifier.main(new String[] {className});
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

    		//TraceClassVisitor cw = new TraceClassVisitor(new PrintWriter(System.out));
    		//cw.
    		//cw.p.print(new PrintWriter(System.out));


    		ClassWriter writer = new ClassWriter(ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES);
    		node.accept(writer);
    		return writer.toByteArray();

    	}*/


        if ("net.minecraft.entity.EntityLivingBase".equals(className) || entityRendererClassInfo.classMatches(className) ||
                (renderBipedClassInfo != null && renderBipedClassInfo.classMatches(className)) ||
                (modelBipedClassInfo != null && modelBipedClassInfo.classMatches(className)) ||
                (modelPlayerClassInfo != null && modelPlayerClassInfo.classMatches(className)) ||
                (renderLivingBaseClassInfo != null && renderLivingBaseClassInfo.classMatches(className)) ||
                (layerArmorBaseClassInfo != null && layerArmorBaseClassInfo.classMatches(className)) ||
                (layerHeldItemClassInfo != null && layerHeldItemClassInfo.classMatches(className)) ||
                (entityPlayerSPClassInfo != null && entityPlayerSPClassInfo.classMatches(className)) ||
                (entityPlayerMPClassInfo != null && entityPlayerMPClassInfo.classMatches(className)) ||
                (entityLivingBaseClassInfo != null && entityLivingBaseClassInfo.classMatches(className)) ||
                (modelRendererClassInfo != null && modelRendererClassInfo.classMatches(className))
        ) {
            ClassReader cr = new ClassReader(bytecode);
            ClassWriter cw = new ClassWriter(cr, 1);
            CVTransform cv = new CVTransform(cw);
            cr.accept(cv, 0);
            byte[] array = cw.toByteArray();

            //	debugPrint("joe.txt", className, array);

            return array;
        } else {
            return bytecode;
        }
    }

    private static class SetupViewBobbingMethodVisitor extends MethodVisitor {

        public SetupViewBobbingMethodVisitor(MethodVisitor mv) {
            super(Opcodes.ASM4, mv);
        }

        @Override
        public void visitJumpInsn(int opcode, Label label) {
            super.visitJumpInsn(opcode, label);
            if (opcode == Opcodes.IFEQ) {
                mv.visitVarInsn(Opcodes.FLOAD, 1);
                mv.visitMethodInsn(Opcodes.INVOKESTATIC, "com/paneedah/mwc/asm/Interceptors", "setupViewBobbing", "(F)Z", false);
                mv.visitJumpInsn(Opcodes.IFEQ, label);
            }
        }
    }


    private static class SoundInterceptorMethodVistor extends MethodVisitor {

        private boolean visited;

        public SoundInterceptorMethodVistor(MethodVisitor mv) {

            super(Opcodes.ASM4, mv);

        }

        @Override
        public void visitJumpInsn(int opcode, Label label) {
            super.visitJumpInsn(opcode, label);
            // There are other if statements, replace only the very first one
            if (!visited && opcode == Opcodes.IFEQ) {
                String channelPath = "paulscode/sound/libraries/ChannelLWJGLOpenAL";


                mv.visitVarInsn(Opcodes.ALOAD, 0);
                mv.visitFieldInsn(Opcodes.GETFIELD, channelPath,
                        "channelOpenAL", "L" + channelPath + ";");
                mv.visitFieldInsn(Opcodes.GETFIELD, channelPath, "ALSource",
                        "Ljava/nio/IntBuffer;");
                mv.visitInsn(Opcodes.ICONST_0);
                mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/nio/IntBuffer", "get", "(I)I", false);

                mv.visitMethodInsn(Opcodes.INVOKESTATIC, "com/paneedah/weaponlib/compatibility/CoreSoundInterceptor", "onPlaySound", "(Lpaulscode/sound/Channel;)V", false);
                // mv.visitJumpInsn(Opcodes.IFEQ, label);
                visited = true;
            }
        }
    }


    private static class HurtCameraEffectMethodVisitor extends MethodVisitor {

        private boolean visited;

        public HurtCameraEffectMethodVisitor(MethodVisitor mv) {
            super(Opcodes.ASM4, mv);
        }

        @Override
        public void visitJumpInsn(int opcode, Label label) {
            super.visitJumpInsn(opcode, label);
            // There are other if statements, replace only the very first one
            if (!visited && opcode == Opcodes.IFEQ) {
                mv.visitVarInsn(Opcodes.FLOAD, 1);
                mv.visitMethodInsn(Opcodes.INVOKESTATIC, "com/paneedah/mwc/asm/Interceptors", "hurtCameraEffect", "(F)Z", false);
                mv.visitJumpInsn(Opcodes.IFEQ, label);
                visited = true;
            }
        }
    }


    private static class SetupCameraTransformMethodVisitor extends MethodVisitor {

        public SetupCameraTransformMethodVisitor(MethodVisitor mv) {
            super(Opcodes.ASM4, mv);
        }

        @SuppressWarnings({"deprecation"})
        public void visitMethodInsn(int opcode, String owner, String name, String desc) {
            if (entityRendererClassInfo.methodMatches("hurtCameraEffect", "(F)V", owner, name, desc)) {
                super.visitMethodInsn(opcode, owner, name, desc);
                mv.visitVarInsn(Opcodes.FLOAD, 1);
                mv.visitMethodInsn(184, "com/paneedah/mwc/asm/Interceptors",
                        "setupCameraTransformAfterHurtCameraEffect", "(F)V");
                return;
            }
            mv.visitMethodInsn(opcode, owner, name, desc);
        }

        @Override
        public void visitJumpInsn(int opcode, Label label) {
            super.visitJumpInsn(opcode, label);
            // There are other if statements, replace only the very first one
            if (opcode == Opcodes.IFLE) {
                mv.visitVarInsn(Opcodes.FLOAD, 1);
                mv.visitMethodInsn(Opcodes.INVOKESTATIC, "com/paneedah/mwc/asm/Interceptors", "nauseaCameraEffect", "(F)Z", false);
                mv.visitJumpInsn(Opcodes.IFEQ, label);
            }
        }
    }

    private static class RenderEquippedItemsMethodVisitor extends MethodVisitor {

        private final String itemBlockClassName = ItemBlock.class.getName().replace('.', '/');

        public RenderEquippedItemsMethodVisitor(MethodVisitor mv) {
            super(Opcodes.ASM4, mv);
        }

        @Override
        public void visitTypeInsn(int opcode, String type) {
            if (opcode == Opcodes.INSTANCEOF && type.equals(itemBlockClassName)) {
                mv.visitMethodInsn(Opcodes.INVOKESTATIC, "com/paneedah/mwc/asm/Interceptors", "is3dRenderableItem", "(Lnet/minecraft/item/Item;)Z", false);
            } else {
                super.visitTypeInsn(opcode, type);
            }
        }
    }

    @SuppressWarnings("unused")
    private static class RenderMethodVisitor extends MethodVisitor {

        public RenderMethodVisitor(MethodVisitor mv) {
            super(Opcodes.ASM4, mv);
        }

        @Override
        public void visitCode() {

            Label l0 = new Label();
            mv.visitLabel(l0);
            mv.visitVarInsn(Opcodes.ALOAD, 0);
            mv.visitVarInsn(Opcodes.ALOAD, 1);
            mv.visitVarInsn(Opcodes.FLOAD, 2);
            mv.visitVarInsn(Opcodes.FLOAD, 3);
            mv.visitVarInsn(Opcodes.FLOAD, 4);
            mv.visitVarInsn(Opcodes.FLOAD, 5);
            mv.visitVarInsn(Opcodes.FLOAD, 6);
            mv.visitVarInsn(Opcodes.FLOAD, 7);
            mv.visitMethodInsn(Opcodes.INVOKESTATIC, "com/paneedah/mwc/asm/Interceptors", "render", "(Lnet/minecraft/client/model/ModelBase;Lnet/minecraft/entity/Entity;FFFFFF)Z", false);
            Label l1 = new Label();
            mv.visitJumpInsn(Opcodes.IFNE, l1);
            Label l2 = new Label();
            mv.visitLabel(l2);
            mv.visitInsn(Opcodes.RETURN);
            mv.visitLabel(l1);
            mv.visitFrame(Opcodes.F_SAME, 0, null, 0, null);

            super.visitCode();
        }
    }

    private static class RenderHeldItemMethodVisitor extends MethodVisitor {

        private final boolean notchMode;

        public RenderHeldItemMethodVisitor(MethodVisitor mv, boolean notchMode) {
            super(Opcodes.ASM4, mv);
            this.notchMode = notchMode;
        }

        @Override
        public void visitVarInsn(int opcode, int var) {
            super.visitVarInsn(opcode, var);
            if (opcode == Opcodes.ALOAD && var == 0) {
                String fieldName = "livingEntityRenderer";
                if (notchMode) {
                    fieldName = layerHeldItemClassInfo.getNotchFieldName(fieldName);
                    //String notchFieldType = layerHeldItemClassInfo.getNotchFieldType(mcpFieldName);
                }

                mv.visitFieldInsn(Opcodes.GETFIELD, "net/minecraft/client/renderer/entity/layers/LayerHeldItem", fieldName, "Lnet/minecraft/client/renderer/entity/RenderLivingBase;");
                mv.visitVarInsn(Opcodes.ALOAD, 1);
                mv.visitVarInsn(Opcodes.ALOAD, 2);
                mv.visitVarInsn(Opcodes.ALOAD, 3);
            }
        }

        @Override
        public void visitMethodInsn(int opcode, String owner, String name, String desc, boolean itf) {
            if (layerHeldItemClassInfo.methodMatches("translateToHand", "(Lnet/minecraft/util/EnumHandSide;)V", owner, name, desc)) {
                mv.visitMethodInsn(Opcodes.INVOKESTATIC, "com/paneedah/mwc/asm/Interceptors", "positionItemSide", "(Lnet/minecraft/client/renderer/entity/RenderLivingBase;Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType;Lnet/minecraft/util/EnumHandSide;)V", false);
            } else {
                super.visitMethodInsn(opcode, owner, name, desc, itf);
            }
        }
    }

    private static class AttackEntityFromMethodVisitor extends MethodVisitor {

        public AttackEntityFromMethodVisitor(MethodVisitor mv) {
            super(Opcodes.ASM4, mv);
        }

        @Override
        public void visitLdcInsn(Object cst) {
            if (cst instanceof Float && cst.equals(Float.valueOf(0.4f))) {
                mv.visitVarInsn(Opcodes.ALOAD, 1);
                mv.visitMethodInsn(Opcodes.INVOKESTATIC, "com/paneedah/mwc/asm/ServerInterceptors", "getKnockback", "(Lnet/minecraft/util/DamageSource;)F", false);
            } else {
                super.visitLdcInsn(cst);
            }
        }
    }

    private static class CVTransform extends ClassVisitor {

        String classname;

        public CVTransform(ClassVisitor cv) {
            super(Opcodes.ASM4, cv);
        }

        public void visit(int version, int access, String name, String signature, String superName,
                          String[] interfaces) {
            classname = name;

            cv.visit(version, access, name, signature, superName, interfaces);
        }

        public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {

            //System.out.println("VISIT LOL 2");

            //	return new TestVisitor(cv.visitMethod(access, name, desc, signature, exceptions));


            if (entityRendererClassInfo.methodMatches("setupCameraTransform", "(FI)V", classname, name, desc)) {
                return new SetupCameraTransformMethodVisitor(cv.visitMethod(access, name, desc, signature, exceptions));
            } else if (entityRendererClassInfo.methodMatches("setupViewBobbing", "(F)V", classname, name, desc)) {
                return new SetupViewBobbingMethodVisitor(cv.visitMethod(access, name, desc, signature, exceptions));
            } else if (entityRendererClassInfo.methodMatches("hurtCameraEffect", "(F)V", classname, name, desc)) {

                return new HurtCameraEffectMethodVisitor(cv.visitMethod(access, name, desc, signature, exceptions));
            } else if (entityRendererClassInfo.methodMatches("updateCameraAndRender", "(FJ)V", classname, name, desc)) {
                return new UpdateCameraAndRenderMethodVisitor(cv.visitMethod(access, name, desc, signature, exceptions));
            } else if (renderBipedClassInfo != null
                    && renderBipedClassInfo.methodMatches("renderEquippedItems", "(Lnet/minecraft/entity/EntityLiving;F)V", classname, name, desc)) {
                return new RenderEquippedItemsMethodVisitor(cv.visitMethod(access, name, desc, signature, exceptions));
            } /* else if(modelBipedClassInfo != null
                    && modelBipedClassInfo.methodMatches("render", "(Lnet/minecraft/entity/Entity;FFFFFF)V", classname, name, desc)) {
                return new RenderMethodVisitor(cv.visitMethod(access, name, desc, signature, exceptions));
            } */ /*else if(modelPlayerClassInfo != null
                    && modelPlayerClassInfo.methodMatches("render", "(Lnet/minecraft/entity/Entity;FFFFFF)V", classname, name, desc)) {
                return new RenderMethodVisitor(cv.visitMethod(access, name, desc, signature, exceptions));
            } */ else if (layerHeldItemClassInfo != null
                    && layerHeldItemClassInfo.methodMatches("renderHeldItem", "(Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType;Lnet/minecraft/util/EnumHandSide;)V", classname, name, desc)) {
                return new RenderHeldItemMethodVisitor(cv.visitMethod(access, name, desc, signature, exceptions),
                        !name.equals("renderHeldItem"));
            } else if (entityLivingBaseClassInfo != null
                    && entityLivingBaseClassInfo.methodMatches("attackEntityFrom", "(Lnet/minecraft/util/DamageSource;F)Z", classname, name, desc)) {
                return new AttackEntityFromMethodVisitor(cv.visitMethod(access, name, desc, signature, exceptions));
            } else if (entityLivingBaseClassInfo != null
                    && entityLivingBaseClassInfo.methodMatches("attackEntityFrom", "(Lnet/minecraft/util/DamageSource;F)Z", classname, name, desc)) {
                return new AttackEntityFromMethodVisitor(cv.visitMethod(access, name, desc, signature, exceptions));
            } /*else if(playSoundClassInfo != null && playSoundClassInfo.methodMatches("play", "(Lpaulscode/sound/Channel;)V", classname, name, desc)) {
                return new SoundInterceptorMethodVistor(cv.visitMethod(access, name, desc, signature, exceptions));
            }*/

            return cv.visitMethod(access, name, desc, signature, exceptions);
        }
    }
}
