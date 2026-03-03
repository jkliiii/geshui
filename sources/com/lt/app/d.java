package com.lt.app;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import g3.a0;
import j2.f;
import j2.h;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import n3.a1;
import n3.c0;
import n3.d0;
import n3.q0;
import n3.r;
import n3.t;
import n3.z1;

/* compiled from: WebHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class d {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static long f6733 = -1;

    /* renamed from: ʼ, reason: contains not printable characters */
    private static Map<String, String> f6734;

    /* renamed from: ʽ, reason: contains not printable characters */
    private static StringBuilder f6735;

    /* renamed from: ˆ, reason: contains not printable characters */
    static boolean m7995() {
        return false;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    static boolean m7996() {
        return false;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    static void m7997(Application application, Context context) {
        a1.m10738(application, context, new d0() { // from class: g3.w0
            @Override // n3.d0
            /* renamed from: ʻ */
            public final Object mo8739(Object obj) {
                return com.lt.app.d.m8005((Integer) obj);
            }
        });
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    static synchronized void m7998() {
        synchronized (d.class) {
            f6735 = null;
            f6734 = null;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    static void m7999(Application application) {
        a1.m10626(application, new d0() { // from class: g3.t0
            @Override // n3.d0
            /* renamed from: ʻ */
            public final Object mo8739(Object obj) {
                return com.lt.app.d.m8006((Integer) obj);
            }
        });
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    static void m8000(n3.d dVar, l3.a aVar, final t tVar) {
        q0 m10702;
        if (m7996() && !a1.m10620(dVar)) {
            if (tVar != null) {
                tVar.mo8743();
                return;
            }
            return;
        }
        if (aVar.m9729(3) && (m10702 = a1.m10702()) != null) {
            m10702.m10810(dVar);
        }
        if (com.t.m8144(dVar.getApplication(), new h.a() { // from class: g3.x0
        }) || tVar == null) {
            return;
        }
        tVar.mo8743();
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static synchronized void m8001(final f fVar) {
        String str;
        StringBuilder sb;
        synchronized (d.class) {
            if (fVar == null) {
                return;
            }
            l3.a m7827 = App.m7827();
            if (m7827 == null) {
                return;
            }
            if (f6735 == null) {
                f6735 = new StringBuilder(1024);
            }
            if (f6735.length() > 0) {
                fVar.mo7788(f6735.toString());
                Map<String, String> map = f6734;
                if (map != null && !map.isEmpty()) {
                    for (Map.Entry<String, String> entry : f6734.entrySet()) {
                        m8003(fVar, entry.getKey(), entry.getValue());
                    }
                }
                return;
            }
            f6735.append("!function(){var e=document,t=e.body;if(t&&!e.getElementById('_app_jt')){var n=e.createElement('script');n.id='_app_jt',t.appendChild(n)");
            f6735.append(",t.style.webkitTouchCallout='none'");
            if (App.m7815(14, true) && !m7827.m9728(10)) {
                f6735.append(",t.style.webkitUserSelect='none'");
            }
            if (!TextUtils.isEmpty(m7827.css)) {
                m8002("inject", z1.m10885(fVar.getContext(), "ym-inject.css"));
                StringBuilder sb2 = f6735;
                sb2.append(",(n=e.createElement('link')).href='");
                sb2.append(m7827.css);
                sb2.append("',n.rel='stylesheet',n.type='text/css',n.onerror=function(){");
                sb2.append("},t.appendChild(n)");
            }
            List<String> list = m7827.jss;
            int size = list != null ? list.size() : 0;
            if (size > 0) {
                if (m7827.m9729(29)) {
                    if (f6734 == null) {
                        f6734 = new HashMap(size);
                    }
                    long j5 = f6733;
                    long j6 = m7827.__t;
                    if (j5 != j6) {
                        f6733 = j6;
                        f6734.clear();
                    }
                    for (final String str2 : m7827.jss) {
                        if (!TextUtils.isEmpty(str2)) {
                            String str3 = f6734.get(str2);
                            if (str3 != null) {
                                m8003(fVar, str2, str3);
                            } else {
                                f6734.put(str2, BuildConfig.FLAVOR);
                                if (str2.startsWith("http://") || str2.startsWith("https://")) {
                                    str = str2;
                                } else {
                                    if (str2.startsWith("//")) {
                                        sb = new StringBuilder();
                                        sb.append("https:");
                                        sb.append(str2);
                                    } else {
                                        sb = new StringBuilder();
                                        sb.append("https://");
                                        sb.append(str2);
                                    }
                                    str = sb.toString();
                                }
                                r.m10821(str).m10832(new r.c() { // from class: g3.s0
                                    @Override // n3.r.c
                                    /* renamed from: ʻ */
                                    public final void mo8741(Object obj, Exception exc) {
                                        com.lt.app.d.m8007(str2, fVar, (String) obj, exc);
                                    }
                                });
                            }
                        }
                    }
                } else {
                    m8004("inject", z1.m10885(fVar.getContext(), "ym-inject.js"));
                    for (String str4 : m7827.jss) {
                        StringBuilder sb3 = f6735;
                        sb3.append(",(n=e.createElement('script')).src='");
                        sb3.append(str4);
                        sb3.append("',n.onerror=function(){");
                        sb3.append("},t.appendChild(n)");
                    }
                }
            }
            if (m7827.jsy > 0) {
                if (f6734 == null) {
                    f6734 = new HashMap(1);
                }
                String m10885 = z1.m10885(fVar.getContext(), "ym-bridge.js");
                f6734.put("ym", m10885);
                m8003(fVar, "ym", m10885);
            }
            f6735.append("}}();");
            f6735.trimToSize();
            fVar.mo7788(f6735.toString());
        }
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private static String m8002(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        String str3 = "_css_" + a0.m8707(str);
        return "(function(){var d = document;var e = d.head || d.body || d.documentElement;if (!e || d.getElementById('" + str3 + "')) return;var a = document.createElement('style'); a.id = '" + str3 + "'; Object.assign(a,{innerHTML:`" + str2.replaceAll("`", BuildConfig.FLAVOR) + "`}); e.appendChild(a);})();";
    }

    /* renamed from: י, reason: contains not printable characters */
    private static void m8003(f fVar, String str, String str2) {
        String m8004 = m8004(str, str2);
        if (TextUtils.isEmpty(m8004)) {
            return;
        }
        fVar.mo7788(m8004);
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private static String m8004(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        String str3 = "_js_" + a0.m8707(str);
        return "(function(){var d = document;var e = d.head || d.body || d.documentElement;if (!e || d.getElementById('" + str3 + "')) return;var a = d.createElement('script');a.id = '" + str3 + "';e.appendChild(a);" + str2 + "})();";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ٴ, reason: contains not printable characters */
    public static /* synthetic */ Boolean m8005(Integer num) {
        return Boolean.valueOf(App.m7815(num.intValue(), true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᐧ, reason: contains not printable characters */
    public static /* synthetic */ Boolean m8006(Integer num) {
        return Boolean.valueOf(App.m7815(num.intValue(), true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᴵ, reason: contains not printable characters */
    public static /* synthetic */ void m8007(String str, f fVar, String str2, Exception exc) {
        if (exc != null) {
            str2 = z1.m10885(fVar.getContext(), "ym-inject.js");
            str = "inject";
        }
        if (str2 == null) {
            str2 = BuildConfig.FLAVOR;
        }
        f6734.put(str, str2);
        m8003(fVar, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᵎ, reason: contains not printable characters */
    public static /* synthetic */ Boolean m8008(Integer num) {
        return Boolean.valueOf(App.m7815(num.intValue(), true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᵔ, reason: contains not printable characters */
    public static /* synthetic */ Boolean m8009(l3.a aVar, Integer num, Integer num2) {
        return Boolean.valueOf(aVar != null && (num.intValue() < 0 || aVar.m9728(num.intValue())) && (num2.intValue() < 0 || aVar.m9729(num2.intValue())));
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    public static void m8011(n3.d dVar, l3.a aVar) {
        m8012(dVar, aVar, false);
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public static void m8012(n3.d dVar, final l3.a aVar, boolean z5) {
        l3.f fVar;
        if (a1.m10621(dVar, new d0() { // from class: g3.u0
            @Override // n3.d0
            /* renamed from: ʻ */
            public final Object mo8739(Object obj) {
                return com.lt.app.d.m8008((Integer) obj);
            }
        }, new c0() { // from class: g3.v0
            @Override // n3.c0
            /* renamed from: ʻ, reason: contains not printable characters */
            public final Object mo8749(Object obj, Object obj2) {
                return com.lt.app.d.m8009(aVar, (Integer) obj, (Integer) obj2);
            }
        }) || z5 || aVar == null) {
            return;
        }
        if (aVar.sd > 0 || ((fVar = aVar.splash) != null && fVar.delay > 0)) {
            k3.f fVar2 = new k3.f();
            fVar2.m9532(aVar);
            fVar2.setCancelable(false);
            fVar2.show(dVar.m4043(), "splash");
        }
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    static void m8010(n3.d dVar, l3.a aVar) {
    }
}
