package androidx.core.util;

import java.util.Locale;

/* compiled from: Preconditions.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class h {
    /* renamed from: ʻ, reason: contains not printable characters */
    public static void m2577(boolean z5) {
        if (!z5) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static void m2578(boolean z5, Object obj) {
        if (!z5) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static int m2579(int i5, int i6, int i7, String str) {
        if (i5 < i6) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i6), Integer.valueOf(i7)));
        }
        if (i5 <= i7) {
            return i5;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i6), Integer.valueOf(i7)));
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static int m2580(int i5) {
        if (i5 >= 0) {
            return i5;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static int m2581(int i5, String str) {
        if (i5 >= 0) {
            return i5;
        }
        throw new IllegalArgumentException(str);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static int m2582(int i5, int i6) {
        if ((i5 & i6) == i5) {
            return i5;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i5) + ", but only 0x" + Integer.toHexString(i6) + " are allowed");
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public static <T> T m2583(T t5) {
        t5.getClass();
        return t5;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public static <T> T m2584(T t5, Object obj) {
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static void m2585(boolean z5, String str) {
        if (!z5) {
            throw new IllegalStateException(str);
        }
    }
}
