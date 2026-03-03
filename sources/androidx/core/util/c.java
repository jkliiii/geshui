package androidx.core.util;

import java.util.Objects;

/* compiled from: ObjectsCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class c {

    /* compiled from: ObjectsCompat.java */
    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static boolean m2571(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static int m2572(Object... objArr) {
            return Objects.hash(objArr);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static boolean m2568(Object obj, Object obj2) {
        return a.m2571(obj, obj2);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static int m2569(Object... objArr) {
        return a.m2572(objArr);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static <T> T m2570(T t5, String str) {
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(str);
    }
}
