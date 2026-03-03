package com.google.gson;

import com.google.gson.stream.JsonReader;
import java.io.IOException;

/* loaded from: E:\78999\cookie_5123796.dex */
public interface ToNumberStrategy {
    Number readNumber(JsonReader jsonReader) throws IOException;
}
