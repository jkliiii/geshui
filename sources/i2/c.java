package i2;

import android.text.TextUtils;
import android.util.Log;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: Logger.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class c {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static boolean f8557 = true;

    /* renamed from: ʻ, reason: contains not printable characters */
    public static void m9219(String str) {
        if (f8557) {
            Log.v("WebViewJavascriptBridge", m9221() + str);
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static String m9220(Class<?> cls) {
        return cls != null ? !TextUtils.isEmpty(cls.getSimpleName()) ? cls.getSimpleName() : m9220(cls.getEnclosingClass()) : BuildConfig.FLAVOR;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static String m9221() {
        String str = ":";
        String name = c.class.getName();
        boolean z5 = false;
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            if (z5) {
                try {
                    if (!stackTraceElement.getClassName().startsWith(name)) {
                        str = "[" + m9220(Class.forName(stackTraceElement.getClassName())) + str + stackTraceElement.getMethodName() + str + stackTraceElement.getLineNumber() + "]: ";
                        return str;
                    }
                    continue;
                } catch (ClassNotFoundException unused) {
                    continue;
                }
            } else if (stackTraceElement.getClassName().startsWith(name)) {
                z5 = true;
            }
        }
        return "[]: ";
    }
}
