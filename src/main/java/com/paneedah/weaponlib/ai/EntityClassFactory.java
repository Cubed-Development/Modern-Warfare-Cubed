package com.paneedah.weaponlib.ai;

import net.minecraft.entity.Entity;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.util.HashMap;
import java.util.Map;

public class EntityClassFactory implements Opcodes {

    private static class EntityClassLoader extends ClassLoader {

        private byte[] rawClassBytes;
        private String className;

        public EntityClassLoader(String className, byte[] classBytes, ClassLoader parentClassLoader) {
            super(parentClassLoader);
            this.className = className;
            this.rawClassBytes = classBytes;
        }

        @Override
        public Class<?> findClass(String name) throws ClassNotFoundException {
            if (!className.equals(name)) {
                throw new ClassNotFoundException(name);
            }
            return defineClass(name, this.rawClassBytes, 0, this.rawClassBytes.length);
        }
    }

    private static EntityClassFactory instance = new EntityClassFactory();
    
    public static EntityClassFactory getInstance() {
        return instance;
    }
        
    private Map<Class<?>, EntityConfiguration> entityConfigurations = new HashMap<>();
    
    @SuppressWarnings("unchecked")
    public <T extends Entity> Class<? extends T> generateEntitySubclass(Class<T> baseEntityClass,
            int entityId,
            EntityConfiguration configuration) {
        String generatedClassName = baseEntityClass.getName() + entityId;
        Class<? extends T> generatedClass;
        try {
            generatedClass = (Class<? extends T>) new EntityClassLoader(generatedClassName, 
                    generateClassBytecode(generatedClassName, baseEntityClass),
                    baseEntityClass.getClassLoader()).loadClass(generatedClassName);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        entityConfigurations.put(generatedClass, configuration);
        return generatedClass;
    }
    
    public EntityConfiguration getConfiguration(Class<?> entityClass) {
        return entityConfigurations.get(entityClass);
    }

    private byte[] generateClassBytecode(String className, Class<?> baseEntityClass) {

        ClassWriter cw = new ClassWriter(0);
        MethodVisitor mv;

        String baseClassResourceName = baseEntityClass.getName().replace('.', '/');

        String classResourceName = className.replace('.', '/'); //baseClassResourceName + "Ext" + counter++;
        cw.visit(52, ACC_PUBLIC + ACC_SUPER, classResourceName, null, baseClassResourceName, null);

        // cw.visitSource("EntityCustomMobExt.java", null);

        {
            mv = cw.visitMethod(ACC_PUBLIC, "<init>", "(Lnet/minecraft/world/World;)V", null, null);
            mv.visitCode();
            Label l0 = new Label();
            mv.visitLabel(l0);
            mv.visitLineNumber(8, l0);
            mv.visitVarInsn(ALOAD, 0);
            mv.visitVarInsn(ALOAD, 1);
            mv.visitMethodInsn(INVOKESPECIAL, baseClassResourceName, "<init>", "(Lnet/minecraft/world/World;)V", false);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLineNumber(9, l1);
            mv.visitInsn(RETURN);
            Label l2 = new Label();
            mv.visitLabel(l2);
            mv.visitLocalVariable("this", "L" + classResourceName + ";", null, l0, l2, 0);
            mv.visitLocalVariable("worldIn", "Lnet/minecraft/world/World;", null, l0, l2, 1);
            mv.visitMaxs(2, 2);
            mv.visitEnd();
        }
        cw.visitEnd();

        return cw.toByteArray();
    }
}