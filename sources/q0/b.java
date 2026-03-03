package q0;

import android.annotation.SuppressLint;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: Trace.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class b {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static long f10610;

    /* renamed from: ʼ, reason: contains not printable characters */
    private static Method f10611;

    /* renamed from: ʻ, reason: contains not printable characters */
    public static void m11460(String str) {
        c.m11465(str);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static void m11461() {
        c.m11466();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static void m11462(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: ʾ, reason: contains not printable characters */
    public static boolean m11463() {
        try {
            if (f10611 == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return m11464();
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private static boolean m11464() {
        try {
            if (f10611 == null) {
                f10610 = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f10611 = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f10611.invoke(null, Long.valueOf(f10610))).booleanValue();
        } catch (Exception e5) {
            m11462("isTagEnabled", e5);
            return false;
        }
    }
}
