package f4;

import e4.u;
import e4.v;
import e4.w;

/* compiled from: TypeIntrinsics.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class t {
    /* renamed from: ʻ, reason: contains not printable characters */
    public static Object m8645(Object obj, int i5) {
        if (obj != null && !m8647(obj, i5)) {
            m8650(obj, "kotlin.jvm.functions.Function" + i5);
        }
        return obj;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static int m8646(Object obj) {
        if (obj instanceof h) {
            return ((h) obj).mo8618();
        }
        if (obj instanceof e4.a) {
            return 0;
        }
        if (obj instanceof e4.l) {
            return 1;
        }
        if (obj instanceof e4.p) {
            return 2;
        }
        if (obj instanceof e4.q) {
            return 3;
        }
        if (obj instanceof e4.r) {
            return 4;
        }
        if (obj instanceof e4.s) {
            return 5;
        }
        if (obj instanceof e4.t) {
            return 6;
        }
        if (obj instanceof u) {
            return 7;
        }
        if (obj instanceof v) {
            return 8;
        }
        if (obj instanceof w) {
            return 9;
        }
        if (obj instanceof e4.b) {
            return 10;
        }
        if (obj instanceof e4.c) {
            return 11;
        }
        if (obj instanceof e4.d) {
            return 12;
        }
        if (obj instanceof e4.e) {
            return 13;
        }
        if (obj instanceof e4.f) {
            return 14;
        }
        if (obj instanceof e4.g) {
            return 15;
        }
        if (obj instanceof e4.h) {
            return 16;
        }
        if (obj instanceof e4.i) {
            return 17;
        }
        if (obj instanceof e4.j) {
            return 18;
        }
        if (obj instanceof e4.k) {
            return 19;
        }
        if (obj instanceof e4.m) {
            return 20;
        }
        if (obj instanceof e4.n) {
            return 21;
        }
        return obj instanceof e4.o ? 22 : -1;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static boolean m8647(Object obj, int i5) {
        return (obj instanceof v3.c) && m8646(obj) == i5;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private static <T extends Throwable> T m8648(T t5) {
        return (T) k.m8627(t5, t.class.getName());
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static ClassCastException m8649(ClassCastException classCastException) {
        throw ((ClassCastException) m8648(classCastException));
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static void m8650(Object obj, String str) {
        m8651((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public static void m8651(String str) {
        throw m8649(new ClassCastException(str));
    }
}
