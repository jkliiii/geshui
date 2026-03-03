package com.google.gson.internal;

import com.google.gson.stream.JsonReader;
import java.io.IOException;

/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class JsonReaderInternalAccess {
    public static JsonReaderInternalAccess INSTANCE;

    public abstract void promoteNameToValue(JsonReader jsonReader) throws IOException;
}
