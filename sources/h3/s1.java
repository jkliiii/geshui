package h3;

import android.text.TextUtils;
import com.lt.app.App;
import java.io.InputStream;

/* compiled from: LogSniffer.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class s1 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static Thread f8365;

    /* renamed from: ʼ, reason: contains not printable characters */
    private static InputStream f8366;

    /* renamed from: ʼ, reason: contains not printable characters */
    public static void m9038() {
        InputStream inputStream = f8366;
        if (inputStream != null) {
            try {
                inputStream.close();
                f8366 = null;
            } catch (Exception unused) {
            }
        }
        Thread thread = f8365;
        if (thread != null) {
            thread.interrupt();
            f8365 = null;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static void m9039(String str) {
        String m10603 = n3.a1.m10603(App.m7835(), "gate/log/");
        if (TextUtils.isEmpty(m10603)) {
            return;
        }
        n3.r.m10827(m10603, n3.r.m10817().m10839("sys", str)).m10831();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static void m9037() {
    }
}
