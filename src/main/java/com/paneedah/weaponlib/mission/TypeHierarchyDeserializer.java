package com.paneedah.weaponlib.mission;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;


public class TypeHierarchyDeserializer<T> implements JsonDeserializer<T> {
    private static final String TYPE_ELEMENT_NAME = "type";
    private Map<String, Class<? extends T>> typeRegistry;
 
    public TypeHierarchyDeserializer() {
        this.typeRegistry = new HashMap<>();
    }
 
    public TypeHierarchyDeserializer<T> registerType(Class<? extends T> typeClass) {
        typeRegistry.put(typeClass.getSimpleName(), typeClass);
        return this;
    }
 
    public T deserialize(JsonElement jsonElement, Type typeOfT, JsonDeserializationContext context) {
        JsonObject actionObject = jsonElement.getAsJsonObject();
        JsonElement actionTypeElement = actionObject.get(TYPE_ELEMENT_NAME);
 
        Class<? extends T> actionType = typeRegistry.get(actionTypeElement.getAsString());
        return context.deserialize(actionObject, actionType);
    }
}
