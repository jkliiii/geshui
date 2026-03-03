package h3;

import android.content.Context;
import com.lt.app.App;
import com.lt.plugin.IWx;

/* compiled from: Wx.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class u2 {

    /* compiled from: Wx.java */
    public interface a {
        /* renamed from: ʻ */
        void mo8865(int i5, String str);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static boolean m9053() {
        IWx m10701 = n3.a1.m10701();
        return m10701 != null && m10701.m8036(App.m7835());
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static String m9055() {
        IWx m10701 = n3.a1.m10701();
        if (m10701 != null) {
            return m10701.m8034();
        }
        return null;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static boolean m9056() {
        return true;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static void m9057(Context context, String str, String str2, int i5, a aVar) {
        IWx m10701 = n3.a1.m10701();
        if (m10701 == null) {
            n3.z1.m10909(context, "No Configuration");
            if (aVar != null) {
                aVar.mo8865(1, "No Configuration");
                return;
            }
            return;
        }
        t3.a aVar2 = new t3.a();
        aVar2.f11287 = str;
        aVar2.f11288 = str2;
        aVar2.f11289 = i5;
        m10701.m8032(aVar2, context, aVar != null ? new t2(aVar) : null);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static void m9058(Context context, a aVar) {
        IWx m10701 = n3.a1.m10701();
        if (m10701 == null) {
            com.lt.app.c.m7959(context, 2131820659);
            if (aVar != null) {
                aVar.mo8865(100, context.getString(2131820659));
                return;
            }
            return;
        }
        if (App.m7815(11, true)) {
            m10701.m8037(context, aVar != null ? new t2(aVar) : null);
            return;
        }
        com.lt.app.c.m7959(context, 2131820688);
        if (aVar != null) {
            aVar.mo8865(100, context.getString(2131820688));
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public static void m9059(Context context, t3.b bVar, a aVar) {
        IWx m10701 = n3.a1.m10701();
        if (m10701 != null) {
            m10701.m8035(bVar, context, aVar != null ? new t2(aVar) : null);
            return;
        }
        n3.z1.m10909(context, "No Configuration");
        if (aVar != null) {
            aVar.mo8865(1, "No Configuration");
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public static void m9060(Context context, String str, String str2, a aVar) {
        IWx m10701 = n3.a1.m10701();
        if (m10701 == null) {
            n3.z1.m10909(context, "No Configuration");
            if (aVar != null) {
                aVar.mo8865(1, "No Configuration");
                return;
            }
            return;
        }
        t3.c cVar = new t3.c();
        cVar.f11292 = str;
        cVar.f11293 = str2;
        m10701.m8039(cVar, context, aVar != null ? new t2(aVar) : null);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static void m9061(String str, String str2, String str3, String str4, String str5, String str6, String str7, Context context, a aVar) {
        IWx m10701 = n3.a1.m10701();
        if (m10701 == null) {
            aVar.mo8865(100, "No Configuration");
            return;
        }
        if (!App.m7815(38, true)) {
            com.lt.app.c.m7959(context, 2131820688);
            if (aVar != null) {
                aVar.mo8865(100, context.getString(2131820688));
                return;
            }
            return;
        }
        t3.d dVar = new t3.d();
        dVar.f11294 = str;
        dVar.f11295 = str2;
        dVar.f11296 = str3;
        dVar.f11297 = str4;
        dVar.f11298 = str5;
        dVar.f11299 = str6;
        dVar.f11300 = str7;
        m10701.m8033(dVar, context, aVar != null ? new t2(aVar) : null);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static void m9062(Context context, String str, int i5, a aVar) {
        IWx m10701 = n3.a1.m10701();
        if (m10701 == null) {
            n3.z1.m10909(context, "No Configuration");
            if (aVar != null) {
                aVar.mo8865(1, "No Configuration");
                return;
            }
            return;
        }
        t3.f fVar = new t3.f();
        fVar.f11319 = str;
        fVar.f11320 = i5;
        m10701.m8031(fVar, context, aVar != null ? new t2(aVar) : null);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static void m9054() {
    }
}
