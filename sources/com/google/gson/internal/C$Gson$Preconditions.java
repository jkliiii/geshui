package com.google.gson.internal;

/* renamed from: com.google.gson.internal.$Gson$Preconditions, reason: invalid class name */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class C$Gson$Preconditions {
    private C$Gson$Preconditions() {
        throw new UnsupportedOperationException();
    }

    public static void checkArgument(boolean z5) {
        if (!z5) {
            throw new IllegalArgumentException();
        }
    }

    public static <T> T checkNotNull(T t5) {
        t5.getClass();
        return t5;
    }
}
