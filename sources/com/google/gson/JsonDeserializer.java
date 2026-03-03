package com.google.gson;

import java.lang.reflect.Type;

/* loaded from: E:\78999\cookie_5123796.dex */
public interface JsonDeserializer<T> {
    T deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException;
}
