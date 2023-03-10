package com.paneedah.weaponlib.compatibility.graph;

import akka.japi.Pair;
import com.google.common.collect.ImmutableSet;
import com.google.common.reflect.ClassPath;
import com.google.common.reflect.ClassPath.ClassInfo;
import org.lwjgl.opengl.GLContext;
import scala.actors.threadpool.Arrays;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Make sure to enable
 * 
 * https://stackoverflow.com/questions/31129331/how-can-i-get-the-parameter-name-in-java-at-run-time
 * @author Jim Holden, 2022
 *
 */
public class CompatibilityClassGenerator {
	
	private boolean loaded = false;
	private ArrayList<Class<?>> classes = new ArrayList<>();
	private ArrayList<Class<?>> glClasses = new ArrayList<>();
	
	public CompatibilityClassGenerator() {
		
	}
	
	public void setup() {
		if(loaded) return;
		loaded = true;
		
		
		try {
			ImmutableSet<ClassInfo> i = ClassPath.from(ClassLoader.getSystemClassLoader()).getTopLevelClasses("org.lwjgl.opengl");
			for(ClassInfo classInfo : i) {
				String classInformationString = classInfo.toString();
				// Find OpenGL class
				Class<?> clazz = null;
				try {
					
					
					clazz = Class.forName(classInformationString);
				} catch(Error e) {
					continue;
				}
				
				if(isGLClass(clazz)) {
					glClasses.add(clazz);
				} else {
					classes.add(clazz);
				}
				
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean isGLClass(Class<?> clazz) {
		String simpleName = clazz.getSimpleName();
		if(simpleName.length() > 2 && Character.isDigit(simpleName.charAt(3))) {
			return true;
		}
		return false;
		
	}
	
	
	public ArrayList<StringBuilder> findMethods(String methodSearch) {
		return null;
		
		
	}
	
	public ArrayList<Pair<Class<?>, Method>> findStandardOpenGLMethod(String searchTerm) {

		ArrayList<Pair<Class<?>, Method>> array = new ArrayList<>();
		array.clear();
		for(Class<?> clazz : glClasses) {
			for(Method m : clazz.getMethods()) {
				if(m.getName().contains(searchTerm)) {
					array.add(new Pair<Class<?>, Method>(clazz, m));
				}
			}
		}
		
		return array;
	}
	
	public StringBuilder getIfStatementChecks(String name, String caseName) {
		String[] args = name.split("(?=\\p{Upper})");
		for(int i = 0; i < args.length; ++i) {
			args[i] = args[i].toLowerCase();
		}
		ArrayList<String> argList = (ArrayList<String>) Arrays.asList(args);
		for(String s : args) {
			argList.add(s);
		}
		
		
		Field[] fields = GLContext.getCapabilities().getClass().getFields();
		for(Field f : fields) {
			boolean shouldBreak = false;
			for(int i = 2; i < args.length; ++i) {
				if(f.getName().contains(argList.get(i))) {
					System.out.println("hi " + f.getName());
					shouldBreak = true;
				}
			}
			if(shouldBreak) break;
			System.out.println(f);
			//System.out.println(f.getName());
		}
		
		return null;
		
	}
	 
	public StringBuilder buildOutMethod(Pair<Class<?>, Method> original, String searchTerm) {
		HashMap<String, Pair<String, String>> methodNameMap = new HashMap<>();
		
		StringBuilder builder = new StringBuilder();
		builder.append("public static " + original.second().getReturnType().getSimpleName() + " " + original.second().getName());
		builder.append("(");
		
		StringBuilder parameterBuilder = new StringBuilder();
		
		parameterBuilder.append("(");
		java.lang.reflect.Parameter[] parameters = original.second().getParameters();
		for(int i = 0; i < parameters.length; ++i) {
			
			if(i == 0) {
				builder.append(parameters[i].getType().getSimpleName() + " " + parameters[i].getName());
				parameterBuilder.append(parameters[i].getName());
				
			} else {
				builder.append(", " + parameters[i].getType().getSimpleName() + " " + parameters[i].getName());
				parameterBuilder.append(", " + parameters[i].getName());
			}
		}
		
		
		
		ArrayList<Pair<Class<?>, Method>> methods = getExtensions(original, searchTerm);
		methods.add(original);
	
		
		parameterBuilder.append(")");
		builder.append(") {\n");
		builder.append("\tswitch(case) {");
		
		for(Pair<Class<?>, Method> pair : methods) {
			String genericName = pair.first().getSimpleName();
			builder.append("\n\t\tcase ");
			
			if(genericName.contains("ARB")) {
				builder.append("ARB:");
			} else if(genericName.contains("EXT")) {
				builder.append("EXT:");
			} else if(genericName.contains("APPLE")) {
				builder.append("APPLE:");
			} else {
				builder.append("NORMAL:");
			}
			
			if(!original.second().getReturnType().toString().equals("void")) {
				builder.append("\n\t\t\treturn " + genericName + "." + pair.second().getName() + parameterBuilder.toString() + ";");
			} else {
				builder.append("\n\t\t\t" + genericName + "." + pair.second().getName() + parameterBuilder.toString() + ";");
				builder.append("\n\t\t\tbreak;");
			}
			
		}
		
		
		builder.append("\n\t}");
		if(original.second().getReturnType().toString().equals("int")) {
			builder.append("\n\treturn 0;");
		} else if(original.second().getReturnType().toString().equals("boolean")) {
			builder.append("\n\treturn false;");
		} else {
			builder.append("\n\treturn;");
		}
		
		builder.append("\n}");
		return builder;
	}
	
	public boolean isMethodEquivalent(Method a, Method b) {
		if(!a.getReturnType().toString().equals(b.getReturnType().toString())) return false;
		if(a.getParameterCount() != b.getParameterCount()) return false;
		
		for(int i = 0; i < a.getParameterCount(); ++i) {
			if(!a.getParameters()[i].toString().equals(b.getParameters()[i].toString())) return false;
		}
		
		return true;
		
	}
	
	public ArrayList<Pair<Class<?>, Method>> getExtensions(Pair<Class<?>, Method> original, String search) {
		ArrayList<Pair<Class<?>, Method>> extensionsList = new ArrayList<>();
 		for(Class<?> clazz : this.classes) {
			for(Method m : clazz.getMethods()) {
				if(m.getName().contains(search)) {
				
					if(!isMethodEquivalent(m, original.second())) continue;
					extensionsList.add(new Pair<Class<?>, Method>(clazz, m));
				}
			
			}
		}
		
		return extensionsList;
		
	}
	
	/*
	public void search() {
		
		boolean useSearchTerm = false;
		
		
		String methodSearch = "glDrawRangeElementsBaseVertex";
		String searchTerm = "Instance";
		
		
		
		
		
		
		//Important data
		Class<?> returnType = null;
		String defaultReturn = "";
		
		String originalMethod = "";
		String originalClass = "";
		
		
		StringBuilder builder = new StringBuilder();
		
		
		
		StringBuilder paramBuilder = new StringBuilder();
		
		boolean breakOut = false;
		for(String glClass : glClasses) {
			try {
				Class<?> clazz = Class.forName(glClass);
				
				for(Method m : clazz.getMethods()) {
					if(m.getName().contains(methodSearch)) {
						//System.out.println("found in " + glClass.split("\\.")[3]);
						originalClass = clazz.getSimpleName();
						originalMethod = m.getName();
						
						returnType = 	m.getReturnType();
						defaultReturn = (String) m.getDefaultValue();
						builder.append("public static ");
						builder.append(returnType.getName() + " ");
						builder.append(methodSearch);
						
						paramBuilder.append("(");
						builder.append("(");
						boolean isFirst = true;
						for(java.lang.reflect.Parameter param : m.getParameters()) {
							if(isFirst) {
								paramBuilder.append(param.getName());
								builder.append(param.getType() + " " + param.getName());
							} else {
								paramBuilder.append(", " + param.getName());
								builder.append(", " + param.getType() + " " + param.getName());
							}
							
							isFirst = false;
							//System.out.println(param.getType() + " | " + param.getName());
						}
						builder.append(") {");
						paramBuilder.append(")");
						breakOut = true;
						break;
					}
				}
				if(breakOut) break;
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		boolean hasARB = false;
		
		boolean hasEXT = false;
		boolean hasAPPLE = false;
		// (TYPE, (CLASS, METHOD))
		HashMap<String, Pair<String, String>> methodNameMap = new HashMap<>();
		methodNameMap.put("NORMAL", new Pair<String, String>(originalClass, originalMethod));
		
		
		for(String classes : classes) {
			if(useSearchTerm) {
				if(!classes.contains(searchTerm)) {
					continue;
				}
				
			}
			
			try {
				Method[] methods = Class.forName(classes).getMethods();
				for(Method method : methods) {
					
					String className = classes.split("\\.")[3];
					if(!method.getName().contains(methodSearch)) continue;
					if(classes.contains("ARB")) {
						methodNameMap.put("ARB", new Pair<String, String>(className, method.getName()));
					} else if(classes.contains("EXT")) {
						methodNameMap.put("EXT", new Pair<String, String>(className, method.getName()));
					} else if(classes.contains("APPLE")) {
						methodNameMap.put("APPLE", new Pair<String, String>(className, method.getName()));
					}
					
				}
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
			
		}
		
		
		builder.append("\nswitch(case) {");
		
		
		for(Entry<String, Pair<String, String>> entry : methodNameMap.entrySet()) {
			builder.append("\n\tcase " + entry.getKey() + ":");
			builder.append("\n\t\treturn " + entry.getValue().first() + "." + entry.getValue().second());
			builder.append(paramBuilder.toString() + ";");
			
		}
		
		
		
		
		builder.append("\n\t}");
		
		if(!returnType.getName().equals("void")) {
			builder.append("\nreturn " + defaultReturn + ";");
		}
		builder.append("\n}");
		
		//System.out.println(returnType);
		System.out.println("\n" + builder.toString());
		
		
	}
	*/
	
	
	
	

}
