package androidx.core.os;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: TraceCompat.java */
@Deprecated
/* loaded from: E:\78999\cookie_5123796.dex */
public final class t {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static long f2746;

    /* renamed from: ʼ, reason: contains not printable characters */
    private static Method f2747;

    /* renamed from: ʽ, reason: contains not printable characters */
    private static Method f2748;

    /* renamed from: ʾ, reason: contains not printable characters */
    private static Method f2749;

    /* renamed from: ʿ, reason: contains not printable characters */
    private static Method f2750;

    /* compiled from: TraceCompat.java */
    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static void m2445(String str) {
            Trace.beginSection(str);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static void m2446() {
            Trace.endSection();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f2746 = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f2747 = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f2748 = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f2749 = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f2750 = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e5) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e5);
            }
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static void m2443(String str) {
        a.m2445(str);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static void m2444() {
        a.m2446();
    }
}
