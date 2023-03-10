package com.paneedah.weaponlib.tile;

import net.minecraft.tileentity.TileEntity;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.util.HashMap;
import java.util.Map;

public class CustomTileEntityClassFactory implements Opcodes {

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

    private static CustomTileEntityClassFactory instance = new CustomTileEntityClassFactory();
    
    public static CustomTileEntityClassFactory getInstance() {
        return instance;
    }
        
    private Map<Class<?>, CustomTileEntityConfiguration<?>> entityConfigurations = new HashMap<>();
    
    @SuppressWarnings("unchecked")
    public <T extends TileEntity> Class<? extends T> generateEntitySubclass(Class<T> baseEntityClass,
            int entityId,
            CustomTileEntityConfiguration<?> configuration) {
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
    
    public CustomTileEntityConfiguration<?> getConfiguration(Class<?> entityClass) {
        return entityConfigurations.get(entityClass);
    }

    private byte[] generateClassBytecode(String className, Class<?> baseEntityClass) {

        ClassWriter cw = new ClassWriter(0);
        MethodVisitor mv;

        String baseClassResourceName = baseEntityClass.getName().replace('.', '/');

        String classResourceName = className.replace('.', '/');
        cw.visit(52, ACC_PUBLIC + ACC_SUPER, classResourceName, null, baseClassResourceName, null);

        {
            mv = cw.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
            mv.visitCode();
            Label l0 = new Label();
            mv.visitLabel(l0);
            mv.visitLineNumber(5, l0);
            mv.visitVarInsn(ALOAD, 0);
            mv.visitMethodInsn(INVOKESPECIAL, baseClassResourceName, "<init>", "()V", false);
            mv.visitInsn(RETURN);
            Label l1 = new Label();
            mv.visitLabel(l1);
            mv.visitLocalVariable("this", "L" + classResourceName + ";", null, l0, l1, 0);
            mv.visitMaxs(1, 1);
            mv.visitEnd();
        }
        cw.visitEnd();

        return cw.toByteArray();
    }
}