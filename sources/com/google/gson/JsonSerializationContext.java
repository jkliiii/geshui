package com.google.gson;

import java.lang.reflect.Type;

/* loaded from: E:\78999\cookie_5123796.dex */
public interface JsonSerializationContext {
    JsonElement serialize(Object obj);

    JsonElement serialize(Object obj, Type type);
}
