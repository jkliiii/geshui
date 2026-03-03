package f4;

import java.util.Arrays;

/* compiled from: Intrinsics.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class k {
    private k() {
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static boolean m8619(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static void m8620(Object obj) {
        if (obj == null) {
            m8628();
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static void m8621(Object obj, String str) {
        if (obj == null) {
            m8629(str);
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static void m8622(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) m8626(new NullPointerException(str + " must not be null")));
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static void m8623(Object obj, String str) {
        if (obj == null) {
            m8630(str);
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static int m8624(int i5, int i6) {
        if (i5 < i6) {
            return -1;
        }
        return i5 == i6 ? 0 : 1;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private static String m8625(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = k.class.getName();
        int i5 = 0;
        while (!stackTrace[i5].getClassName().equals(name)) {
            i5++;
        }
        while (stackTrace[i5].getClassName().equals(name)) {
            i5++;
        }
        StackTraceElement stackTraceElement = stackTrace[i5];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private static <T extends Throwable> T m8626(T t5) {
        return (T) m8627(t5, k.class.getName());
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    static <T extends Throwable> T m8627(T t5, String str) {
        StackTraceElement[] stackTrace = t5.getStackTrace();
        int length = stackTrace.length;
        int i5 = -1;
        for (int i6 = 0; i6 < length; i6++) {
            if (str.equals(stackTrace[i6].getClassName())) {
                i5 = i6;
            }
        }
        t5.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i5 + 1, length));
        return t5;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static void m8628() {
        throw ((NullPointerException) m8626(new NullPointerException()));
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static void m8629(String str) {
        throw ((NullPointerException) m8626(new NullPointerException(str)));
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private static void m8630(String str) {
        throw ((NullPointerException) m8626(new NullPointerException(m8625(str))));
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public static void m8631(String str) {
        throw ((v3.o) m8626(new v3.o(str)));
    }

    /* renamed from: י, reason: contains not printable characters */
    public static void m8632(String str) {
        m8631("lateinit property " + str + " has not been initialized");
    }
}
