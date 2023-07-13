package com.paneedah.weaponlib;

import java.util.HashMap;
import java.util.Map;

public class ClassInfo {

    private static class MethodSignature {
        String name;
        String signature;

        MethodSignature(String name, String signature) {
            this.name = name;
            this.signature = signature;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((name == null) ? 0 : name.hashCode());
            result = prime * result + ((signature == null) ? 0 : signature.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            MethodSignature other = (MethodSignature) obj;
            if (name == null) {
                if (other.name != null)
                    return false;
            } else if (!name.equals(other.name))
                return false;
            if (signature == null) {
                return other.signature == null;
            } else return signature.equals(other.signature);
        }
    }

    private String notchClassName;
    private String MCpClassName;
    private Map<MethodSignature, String> notchMethodInfoMap = new HashMap<>();
    private Map<MethodSignature, String> notchSignatureMap = new HashMap<>();

    private Map<MethodSignature, String> MCpMethodInfoMap = new HashMap<>();

    private Map<String, String> notchFieldNameMap = new HashMap<>();
    private Map<String, String> notchFieldTypeMap = new HashMap<>();

    public ClassInfo(String MCpClassName, String notchClassName) {
        this.MCpClassName = MCpClassName;
        this.notchClassName = notchClassName;
    }
    
    public ClassInfo addFieldInfo(String MCpFieldName, String fieldType, String notchFieldName, String notchFieldType) {
        notchFieldNameMap.put(MCpFieldName, notchFieldName);
        notchFieldTypeMap.put(MCpFieldName, notchFieldType);
        return this;
    }

    public ClassInfo addMethodInfo(String MCpMethodName, String signature, String notchName) {
        notchMethodInfoMap.put(new MethodSignature(MCpMethodName, signature), notchName);
        return this;
    }
    
    public ClassInfo addMethodInfo2(String MCpMethodName, String signature, String notchName, String notchSignature) {
        notchMethodInfoMap.put(new MethodSignature(MCpMethodName, signature), notchName);
        notchSignatureMap.put(new MethodSignature(MCpMethodName, signature), notchSignature);
        return this;
    }
    
    public ClassInfo addMethodInfo(String genericMethodName, String MCpMethodName, String signature, String notchName) {
        MCpMethodInfoMap.put(new MethodSignature(genericMethodName, signature), MCpMethodName);
        notchMethodInfoMap.put(new MethodSignature(genericMethodName, signature), notchName);
        return this;
    }

    public boolean classMatches(String className) {
    	String normalizedClassName;
    	if (!className.equals("paulscode.sound.libraries.SourceLWJGLOpenAL")) {
    		normalizedClassName = className.replace('.', '/');
    	} else normalizedClassName = className;
        
        return MCpClassName.equals(normalizedClassName) || notchClassName.equals(normalizedClassName);
    }

    public boolean methodMatches(
            String expectedMcpMethodName,
            String expectedMcpMethodSignature,
            String methodOwnerClassName,
            String methodName,
            String methodSignature)
    {
    	
    
    	
    	/*
    	System.out.println("Checking @ " + methodName + " w/ expected  " + expectedMcpMethodName + " w/ expected sig " + expectedMcpMethodSignature);
    	System.out.println("Virtual method names & sigs -> " + methodName + " -> " + methodSignature);
    	System.out.println("MCP Class name: " + MCpClassName + " vs. " + methodOwnerClassName);
    	System.out.println("Notch class names: " + notchClassName + " vs. " + methodOwnerClassName);
       	*/
        if(!expectedMcpMethodSignature.equals(methodSignature) 
                && !methodSignature.equals(notchSignatureMap.get(new MethodSignature(expectedMcpMethodName, expectedMcpMethodSignature)))) {
            return false;
        }
        
  
      //  System.out.println("Passed first flag.");
        

        if(MCpClassName.equals(methodOwnerClassName)) {
            return expectedMcpMethodName.equals(methodName) 
                    || methodName.equals(MCpMethodInfoMap.get(new MethodSignature(expectedMcpMethodName, expectedMcpMethodSignature)));
        }
        
      //  System.out.println("Passed second flag.");
        

        if(!notchClassName.equals(methodOwnerClassName)) {
            return false;
        }
        
       // System.out.println("Passed third flag.");
        

        String notchMethodName = notchMethodInfoMap.get(new MethodSignature(expectedMcpMethodName, expectedMcpMethodSignature));
        return notchMethodName != null && methodName.equals(notchMethodName);
    }

    public String getNotchClassName() {
        return notchClassName;
    }
    
    public String getMcpClassName() {
        return MCpClassName;
    }

    public String getNotchMethodName(String MCpMethodName, String signature) {
        return notchMethodInfoMap.get(new MethodSignature(MCpMethodName, signature));
    }
    
    public String getNotchFieldName(String MCpFieldName) {
        return notchFieldNameMap.get(MCpFieldName);
    }
    
    public String getNotchFieldType(String MCpFieldName) {
        return notchFieldTypeMap.get(MCpFieldName);
    }

}
