package com.paneedah.weaponlib.core;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.*;

import java.util.Iterator;
import java.util.ListIterator;

public class SpecialPatcher {
	
	
	public static byte[] transform(final String obfuscated, final String deobfuscated, byte[] bytes) {
		
		String starterThreadPath = "net.minecraft.client.audio.SoundManager$SoundSystemStarterThread";
		String soundManager = "net/minecraft/client/audio/SoundManager";
		if (obfuscated.equals(starterThreadPath)) {
			// Inside SoundManager.SoundSystemStarterThread
			InsnList toInject = new InsnList();
			toInject.add(new VarInsnNode(Opcodes.ALOAD, 0));
			toInject.add(new MethodInsnNode(Opcodes.INVOKESTATIC, "com/paneedah/weaponlib/compatibility/CoreSoundInterceptor", "init",
					"(Lpaulscode/sound/SoundSystem;)V", false));

			// Target method: Constructor
			bytes = patchMethodInClass(obfuscated, bytes, "<init>", "(L" + soundManager + ";)V", Opcodes.INVOKESPECIAL,
					AbstractInsnNode.METHOD_INSN, "<init>", null, -1, toInject, false, 0, 0, false, 0, -1);
		} else
		if (obfuscated.equals("paulscode.sound.libraries.SourceLWJGLOpenAL")) {
			// Inside SourceLWJGLOpenAL
			InsnList toInject = new InsnList();

			final String classPath = obfuscated.replace(".","/");
			String channelPath = "paulscode/sound/libraries/ChannelLWJGLOpenAL";
			if (obfuscated.equals("ovr.paulscode.sound.libraries.SourceLWJGLOpenAL"))
				channelPath = "ovr/"+channelPath;

			toInject.add(new VarInsnNode(Opcodes.ALOAD, 0));
			toInject.add(new FieldInsnNode(Opcodes.GETFIELD, classPath, "position",
					"Lpaulscode/sound/Vector3D;"));
			toInject.add(new FieldInsnNode(Opcodes.GETFIELD, "paulscode/sound/Vector3D", "x", "F"));
			toInject.add(new VarInsnNode(Opcodes.ALOAD, 0));
			toInject.add(new FieldInsnNode(Opcodes.GETFIELD, classPath, "position",
					"Lpaulscode/sound/Vector3D;"));
			toInject.add(new FieldInsnNode(Opcodes.GETFIELD, "paulscode/sound/Vector3D", "y", "F"));
			toInject.add(new VarInsnNode(Opcodes.ALOAD, 0));
			toInject.add(new FieldInsnNode(Opcodes.GETFIELD, classPath, "position",
					"Lpaulscode/sound/Vector3D;"));
			toInject.add(new FieldInsnNode(Opcodes.GETFIELD, "paulscode/sound/Vector3D", "z", "F"));
			toInject.add(new VarInsnNode(Opcodes.ALOAD, 0));
			toInject.add(new FieldInsnNode(Opcodes.GETFIELD, classPath,
					"channelOpenAL", "L"+channelPath+";"));
			toInject.add(new FieldInsnNode(Opcodes.GETFIELD, channelPath, "ALSource",
					"Ljava/nio/IntBuffer;"));
			toInject.add(new InsnNode(Opcodes.ICONST_0));
			toInject.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL, "java/nio/IntBuffer", "get", "(I)I", false));
			toInject.add(new MethodInsnNode(Opcodes.INVOKESTATIC, "com/paneedah/weaponlib/compatibility/CoreSoundInterceptor",
					"onPlaySound", "(FFFI)V", false));

			// Target method: play
			bytes = patchMethodInClass(obfuscated, bytes, "play", "(Lpaulscode/sound/Channel;)V", Opcodes.INVOKEVIRTUAL,
					AbstractInsnNode.METHOD_INSN, "play", null, -1, toInject, false, 0, 0, false, 0, -1);
		} 
		
		return bytes;
	}
	
	private static byte[] patchMethodInClass(String className, final byte[] bytes, final String targetMethod,
			final String targetMethodSignature, final int targetNodeOpcode, final int targetNodeType,
			final String targetInvocationMethodName, final String targetInvocationMethodSignature, final int targetVarNodeIndex,
			final InsnList instructionsToInject, final boolean insertBefore, final int nodesToDeleteBefore,
			final int nodesToDeleteAfter, final boolean deleteTargetNode, final int targetNodeOffset, final int targetNodeNumber) {
		log("Patching class : "+className);	

		final ClassNode classNode = new ClassNode();
		final ClassReader classReader = new ClassReader(bytes);
		classReader.accept(classNode, 0);
		final Iterator<MethodNode> methodIterator = classNode.methods.iterator();
		
		while (methodIterator.hasNext()) {
			final MethodNode m = methodIterator.next();
			//log("@" + m.name + " " + m.desc);

			if (m.name.equals(targetMethod) && m.desc.equals(targetMethodSignature)) {
				log("Inside target method: " + targetMethod);
				
				AbstractInsnNode targetNode = null;
				int targetNodeNb = 0;

				final ListIterator<AbstractInsnNode> nodeIterator = m.instructions.iterator();
				while (nodeIterator.hasNext()) {
					AbstractInsnNode currentNode = nodeIterator.next();
					//log(insnToString(currentNode).replace("\n", ""));
					if (currentNode.getOpcode() == targetNodeOpcode) {

						if (targetNodeType == AbstractInsnNode.METHOD_INSN) {
							if (currentNode.getType() == AbstractInsnNode.METHOD_INSN) {
								final MethodInsnNode method = (MethodInsnNode) currentNode;
								if (method.name.equals(targetInvocationMethodName)) {
									if (method.desc.equals(targetInvocationMethodSignature)
											|| targetInvocationMethodSignature == null) {
										log("Found target method invocation for injection: " + targetInvocationMethodName);
										targetNode = currentNode;
										if (targetNodeNumber >= 0 && targetNodeNb == targetNodeNumber) break;
										targetNodeNb++;
									}

								}
							}
						} else if (targetNodeType == AbstractInsnNode.VAR_INSN) {
							if (currentNode.getType() == AbstractInsnNode.VAR_INSN) {
								final VarInsnNode varnode = (VarInsnNode) currentNode;
								if (targetVarNodeIndex < 0 || varnode.var == targetVarNodeIndex) {
									log("Found target var node for injection: " + targetVarNodeIndex);
									targetNode = currentNode;
									if (targetNodeNumber >= 0 && targetNodeNb == targetNodeNumber) break;
									targetNodeNb++;
								}
							}
						} else {
							if (currentNode.getType() == targetNodeType) {
								log("Found target node for injection: " + targetNodeType);
								targetNode = currentNode;
								if (targetNodeNumber >= 0 && targetNodeNb == targetNodeNumber) break;
								targetNodeNb++;
							}
						}

					}
				}

				if (targetNode == null) {
					logError("Target node not found! " + className);
					break;
				}

				// Offset the target node by the supplied offset value
				if (targetNodeOffset > 0) {
					for (int i = 0; i < targetNodeOffset; i++) {
						targetNode = targetNode.getNext();
					}
				} else if (targetNodeOffset < 0) {
					for (int i = 0; i < -targetNodeOffset; i++) {
						targetNode = targetNode.getPrevious();
					}
				}

				// If we've found the target, inject the instructions!
				for (int i = 0; i < nodesToDeleteBefore; i++) {
					final AbstractInsnNode previousNode = targetNode.getPrevious();
					//log("Removing Node " + insnToString(previousNode).replace("\n", ""));
					log("Removing Node " + previousNode.getOpcode());
					m.instructions.remove(previousNode);
				}

				for (int i = 0; i < nodesToDeleteAfter; i++) {
					final AbstractInsnNode nextNode = targetNode.getNext();
					//log("Removing Node " + insnToString(nextNode).replace("\n", ""));
					log("Removing Node " + nextNode.getOpcode());
					m.instructions.remove(nextNode);
				}

				if (insertBefore) {
					m.instructions.insertBefore(targetNode, instructionsToInject);
				} else {
					m.instructions.insert(targetNode, instructionsToInject);
				}

				if (deleteTargetNode) {
					m.instructions.remove(targetNode);
				}

				break;
			}
		}
		log("Class finished : "+className);

		final ClassWriter writer = new ClassWriter(ClassWriter.COMPUTE_MAXS);
		classNode.accept(writer);
		return writer.toByteArray();
	}
	
	private static void logError(String string) {
		log(string);
		
	}

	public static void log(final String message) {
		System.out.println(message);
	}

}
