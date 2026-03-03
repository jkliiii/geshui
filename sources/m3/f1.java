package m3;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.URLUtil;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.lt.app.App;
import j2.g;
import java.io.File;
import java.io.InputStream;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import m3.u;
import n3.z1;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: LTWebViewClient.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class f1 extends i2.l implements j2.g {

    /* renamed from: ʼ, reason: contains not printable characters */
    private final Map<String, String> f9211;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final g1 f9212;

    public f1(i2.a aVar, g1 g1Var) {
        super(aVar);
        this.f9212 = g1Var;
        HashMap hashMap = new HashMap(3);
        this.f9211 = hashMap;
        hashMap.put("Access-Control-Allow-Origin", "*");
        hashMap.put("Access-Control-Allow-Headers", "*");
        hashMap.put("Access-Control-Allow-Methods", "*");
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private boolean m10000(final j2.f fVar, String str) {
        Activity activity = (Activity) fVar.getContext();
        n3.x m10724 = n3.a1.m10724();
        return m10724 != null && m10724.m10857(activity, str, new n3.f() { // from class: m3.b1
            @Override // n3.f
            /* renamed from: ʻ */
            public final void mo8742(Object obj) {
                f1.m10006(fVar, (String) obj);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* renamed from: ٴ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m10001(j2.f r13, java.lang.String r14) {
        /*
            r12 = this;
            r0 = 40
            r1 = 1
            boolean r0 = com.lt.app.App.m7815(r0, r1)
            r2 = 0
            if (r0 != 0) goto Lb
            return r2
        Lb:
            l3.a r0 = com.lt.app.App.m7827()
            if (r0 == 0) goto L6f
            l3.a r0 = com.lt.app.App.m7827()
            r3 = 58
            boolean r0 = r0.m9728(r3)
            if (r0 != 0) goto L1e
            goto L6f
        L1e:
            boolean r0 = android.text.TextUtils.isEmpty(r14)     // Catch: java.lang.Exception -> L3e
            if (r0 != 0) goto L42
            boolean r0 = com.lt.app.c.m7967(r14)     // Catch: java.lang.Exception -> L3e
            if (r0 == 0) goto L42
            l3.a r0 = com.lt.app.App.m7827()     // Catch: java.lang.Exception -> L3e
            android.net.Uri r3 = android.net.Uri.parse(r14)     // Catch: java.lang.Exception -> L3e
            java.lang.String r3 = r3.getHost()     // Catch: java.lang.Exception -> L3e
            boolean r0 = r0.m9730(r3)     // Catch: java.lang.Exception -> L3e
            if (r0 == 0) goto L42
            r0 = 1
            goto L43
        L3e:
            r0 = move-exception
            r0.printStackTrace()
        L42:
            r0 = 0
        L43:
            if (r0 == 0) goto L6f
            n3.w r3 = n3.a1.m10722()
            if (r3 == 0) goto L6f
            android.content.Context r13 = r13.getContext()
            r4 = r13
            android.app.Activity r4 = (android.app.Activity) r4
            l3.a r13 = com.lt.app.App.m7827()
            r0 = 59
            boolean r13 = r13.m9728(r0)
            if (r13 == 0) goto L61
            n3.w$c r13 = n3.w.c.H5
            goto L63
        L61:
            n3.w$c r13 = n3.w.c.Native
        L63:
            r5 = r13
            n3.w$d r6 = n3.w.d.Url
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r7 = r14
            r3.m10853(r4, r5, r6, r7, r8, r9, r10, r11)
            return r1
        L6f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.f1.m10001(j2.f, java.lang.String):boolean");
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    private boolean m10002(j2.f fVar, String str) {
        if (!str.startsWith("jsbridge:")) {
            return false;
        }
        try {
            JSONArray jSONArray = new JSONArray(URLDecoder.decode(str.substring(9), "UTF-8"));
            if (jSONArray.length() <= 0) {
                return true;
            }
            h3.d0 m8803 = h3.d0.m8803(fVar);
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i5);
                if (optJSONObject != null) {
                    m8803.m8805(fVar, optJSONObject.optString("name"), optJSONObject.optJSONObject("data"));
                }
            }
            return true;
        } catch (Exception e5) {
            e5.printStackTrace();
            return true;
        }
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    private boolean m10003(j2.f fVar, String str) {
        if (TextUtils.isEmpty(str) || com.lt.app.c.m7961(str)) {
            return false;
        }
        l3.a m7827 = App.m7827();
        if (m7827 != null && !TextUtils.isEmpty(m7827.igs)) {
            try {
                if (g3.a0.m8709(m7827.igs, Uri.parse(str).getScheme())) {
                    return true;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        Activity activity = (Activity) fVar.getContext();
        if (str.startsWith("intent:")) {
            try {
                activity.startActivity(Intent.parseUri(str, 1));
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        } else {
            com.lt.app.c.m7986(activity, str, true);
        }
        return true;
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    private boolean m10004(j2.f fVar, String str) {
        n3.o0 m10696;
        return App.m7815(60, true) && App.m7827() != null && App.m7827().m9729(26) && (m10696 = n3.a1.m10696()) != null && m10696.m10807(fVar.getContext(), str);
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    private void m10005(final j2.f fVar, final j2.i iVar) {
        if (iVar.f8644 != -2) {
            return;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: m3.c1
            @Override // java.lang.Runnable
            public final void run() {
                f1.m10007(iVar, fVar);
            }
        }, 800L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᵢ, reason: contains not printable characters */
    public static /* synthetic */ void m10006(j2.f fVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        fVar.loadUrl(str, App.m7835().m7857(fVar.getUrl()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ⁱ, reason: contains not printable characters */
    public static /* synthetic */ void m10007(j2.i iVar, j2.f fVar) {
        fVar.mo7788(String.format("javascript:!function(){var n=new Image;function o(){n.src=\"https://www.baidu.com/favicon.ico?\"+ +new Date}n.onload=function(){location.replace(\"%s\")},n.onerror=function(){setTimeout(o,1200)},o()}();", iVar.f8639));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ﹳ, reason: contains not printable characters */
    public static /* synthetic */ void m10008(j2.b bVar, boolean z5, String str, String str2) {
        if (z5) {
            bVar.mo7797(str, str2);
        } else {
            bVar.cancel();
        }
    }

    @Override // j2.g
    /* renamed from: ʻ */
    public void mo9312(j2.f fVar, String str) {
        g1 g1Var = this.f9212;
        if (g1Var != null) {
            g1Var.mo9967(fVar, str);
        }
    }

    @Override // j2.g
    /* renamed from: ʼ */
    public void mo9313(j2.f fVar, String str, Bitmap bitmap) {
        Log.d("YM", "WebView 开始加载 " + str);
        g1 g1Var = this.f9212;
        if (g1Var != null) {
            g1Var.mo9968(fVar, str, bitmap);
        }
    }

    @Override // j2.g
    /* renamed from: ʾ */
    public boolean mo9315(j2.f fVar, j2.i iVar) {
        if (fVar != null && iVar != null && iVar.f8640) {
            Log.e("YM", "加载失败，Code:" + iVar.f8644 + " URL:" + iVar.f8639);
            String str = iVar.f8639;
            if (str != null && str.startsWith("http")) {
                l3.a m7827 = App.m7827();
                if (m7827 != null && !m7827.m9729(18)) {
                    if (iVar.f8644 >= 400 && !m7827.m9728(15)) {
                        m10005(fVar, iVar);
                        return false;
                    }
                    fVar.stopLoading();
                    fVar.setErrorUrl(iVar.f8639);
                    String m7812 = App.m7812(2131820780);
                    fVar.loadUrl((TextUtils.isEmpty(m7812) ? "file:///android_asset/e.html" : z1.m10888(fVar.getContext(), m7812)) + "?url=" + URLEncoder.encode(iVar.f8639), null);
                    m10005(fVar, iVar);
                    return true;
                }
                m10005(fVar, iVar);
            }
        }
        return false;
    }

    @Override // j2.g
    /* renamed from: ʿ */
    public void mo9316(j2.f fVar, final j2.b bVar, String str, String str2) {
        if (bVar == null) {
            return;
        }
        new u(fVar.getContext()).m10070(new u.a() { // from class: m3.a1
            @Override // m3.u.a
            /* renamed from: ʻ, reason: contains not printable characters */
            public final void mo9913(boolean z5, String str3, String str4) {
                f1.m10008(bVar, z5, str3, str4);
            }
        });
    }

    @Override // j2.g
    /* renamed from: ˆ */
    public void mo9317(j2.f fVar, final g.a aVar) {
        new AlertDialog.Builder(fVar.getContext()).setMessage(fVar.getContext().getString(2131820855, aVar.mo7799())).setNegativeButton(2131820854, new DialogInterface.OnClickListener() { // from class: m3.d1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                aVar.mo7798();
            }
        }).setPositiveButton(2131820853, new DialogInterface.OnClickListener() { // from class: m3.e1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                aVar.cancel();
            }
        }).setCancelable(false).create().show();
    }

    @Override // j2.g
    /* renamed from: ˈ */
    public boolean mo9318(j2.f fVar, j2.i iVar) {
        Log.d("YM", "准备加载 " + iVar.f8639);
        String str = iVar.f8639;
        if (str == null) {
            return false;
        }
        if (super.shouldOverrideUrlLoading((WebView) null, str)) {
            return true;
        }
        if (iVar.f8639.toLowerCase().startsWith("blob:")) {
            return false;
        }
        if (m10002(fVar, iVar.f8639)) {
            Log.d("YM", "jsBridge 处理 " + iVar.f8639);
            return true;
        }
        if (m10004(fVar, iVar.f8639)) {
            Log.d("YM", "播放视频 " + iVar.f8639);
            return true;
        }
        if (m10001(fVar, iVar.f8639)) {
            Log.d("YM", "阿里百川处理 " + iVar.f8639);
            return true;
        }
        if (m10003(fVar, iVar.f8639)) {
            Log.d("YM", "非 http(s) 处理 " + iVar.f8639);
            return true;
        }
        if (m10000(fVar, iVar.f8639)) {
            Log.d("YM", "支付宝 h5 支付处理 " + iVar.f8639);
            return true;
        }
        Log.d("YM", "WebView 加载 " + iVar.f8639);
        g1 g1Var = this.f9212;
        return g1Var != null && g1Var.mo9966(fVar, iVar);
    }

    @Override // j2.g
    /* renamed from: ˊ */
    public WebResourceResponse mo9320(j2.f fVar, String str) {
        String m9731;
        InputStream open;
        if (URLUtil.isHttpsUrl(str) || URLUtil.isHttpUrl(str)) {
            l3.a m7827 = App.m7827();
            if (m7827 == null) {
                return null;
            }
            if (App.m7835().m7846() && m7827.ruleFs == 0) {
                return null;
            }
            m9731 = App.m7827().m9731(str);
        } else {
            m9731 = str;
        }
        if (m9731 == null || !m9731.startsWith("fs://")) {
            return null;
        }
        Log.w("YM", str + " -> " + m9731);
        int indexOf = m9731.indexOf("?");
        String substring = indexOf > 0 ? m9731.substring(0, indexOf) : m9731;
        if (substring.startsWith("fs://www/")) {
            try {
                open = fVar.getContext().getAssets().open(substring.substring(5));
            } catch (Exception unused) {
                Log.w("YM", "not found " + substring);
                return null;
            }
        } else {
            File m10915 = z1.m10915(fVar.getContext(), substring);
            if (m10915 != null) {
                try {
                    open = fVar.getContext().getContentResolver().openInputStream(z1.m10943(fVar.getContext(), m10915));
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            } else {
                open = null;
            }
        }
        WebResourceResponse webResourceResponse = new WebResourceResponse(TextUtils.isEmpty(null) ? z1.m10878(m9731) : null, TextUtils.isEmpty(null) ? "utf-8" : null, open);
        webResourceResponse.setResponseHeaders(this.f9211);
        if (open == null) {
            Log.e("YM", "not found " + m9731);
            webResourceResponse.setStatusCodeAndReasonPhrase(404, "404:not found");
        }
        return webResourceResponse;
    }

    @Override // j2.g
    /* renamed from: ˉ */
    public void mo9319(j2.f fVar, String str) {
    }
}
