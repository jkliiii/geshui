package com.google.gson;

import java.lang.reflect.Type;

/* loaded from: E:\78999\cookie_5123796.dex */
public interface JsonSerializer<T> {
    JsonElement serialize(T t5, Type type, JsonSerializationContext jsonSerializationContext);
}
