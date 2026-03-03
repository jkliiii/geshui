package com.google.gson;

import com.google.gson.reflect.TypeToken;

/* loaded from: E:\78999\cookie_5123796.dex */
public interface TypeAdapterFactory {
    <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken);
}
