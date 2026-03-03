package h3;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.net.Uri;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.URLUtil;
import android.widget.PopupWindow;
import android.widget.Toast;
import com.lt.app.App;
import com.lt.app.MainActivity;
import com.lt.app.WebActivity;
import h3.d0;
import h3.e;
import h3.j2;
import h3.p1;
import h3.u2;
import h3.z;
import j2.f;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.net.URL;
import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import n3.i0;
import n3.r;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w0.f;

/* compiled from: LTJsBridge.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class d0 {

    /* renamed from: ʾ, reason: contains not printable characters */
    public static String f8173;

    /* renamed from: ʼ, reason: contains not printable characters */
    private j2.f f8175;

    /* renamed from: ʽ, reason: contains not printable characters */
    private c f8176 = null;

    /* renamed from: ʻ, reason: contains not printable characters */
    private boolean f8174 = false;

    /* compiled from: LTJsBridge.java */
    class a implements i2.b {
        a() {
        }

        @Override // i2.b
        /* renamed from: ʻ, reason: contains not printable characters */
        public boolean mo8806(i2.d dVar, i2.e eVar) {
            return dVar != null && d0.this.m8799(dVar.f8560, dVar.f8558, eVar);
        }
    }

    /* compiled from: LTJsBridge.java */
    class b extends n3.s0 {

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ i2.e f8178;

        b(i2.e eVar) {
            this.f8178 = eVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ʽ, reason: contains not printable characters */
        public /* synthetic */ void m8808(String str) {
            this.f9983.mo8742(str);
        }

        @Override // n3.s0
        /* renamed from: ʻ, reason: contains not printable characters */
        public void mo8809(int i5, String str, boolean z5) {
            if (this.f9983 != null) {
                this.f8178.f8565 = new i2.f() { // from class: h3.e0
                    @Override // i2.f
                    /* renamed from: ʻ, reason: contains not printable characters */
                    public final void mo8877(String str2) {
                        this.f8211.m8808(str2);
                    }
                };
            }
            d0.this.m8795(i5, str, this.f8178, z5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LTJsBridge.java */
    class d extends n3.s0 {

        /* renamed from: ʼ, reason: contains not printable characters */
        private final i2.e f8199;

        d(i2.e eVar) {
            this.f8199 = eVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ʽ, reason: contains not printable characters */
        public /* synthetic */ void m8868(String str) {
            this.f9983.mo8742(str);
        }

        @Override // n3.s0
        /* renamed from: ʻ */
        public void mo8809(int i5, String str, boolean z5) {
            if (this.f9983 != null) {
                this.f8199.f8565 = new i2.f() { // from class: h3.k1
                    @Override // i2.f
                    /* renamed from: ʻ */
                    public final void mo8877(String str2) {
                        this.f8293.m8868(str2);
                    }
                };
            }
            d0.this.m8795(i5, str, this.f8199, z5);
        }
    }

    /* compiled from: LTJsBridge.java */
    private class e implements j2.f {

        /* renamed from: ʻ, reason: contains not printable characters */
        final i2.e f8201;

        e(i2.e eVar) {
            this.f8201 = eVar;
        }

        @Override // h3.j2.f
        /* renamed from: ʻ, reason: contains not printable characters */
        public void mo8869(int i5, boolean z5, String str) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("to", i5);
                jSONObject.put("message", App.m7812(z5 ? 2131820842 : 2131820837));
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
            d0.this.m8794(z5 ? 0 : 100, jSONObject.toString(), this.f8201);
        }
    }

    private d0() {
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static d0 m8793(j2.f fVar) {
        d0 d0Var = new d0();
        d0Var.m8804(fVar);
        return d0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˑ, reason: contains not printable characters */
    public void m8794(int i5, String str, i2.e eVar) {
        m8795(i5, str, eVar, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: י, reason: contains not printable characters */
    public void m8795(int i5, String str, i2.e eVar, boolean z5) {
        m8796((Activity) this.f8175.getContext(), i5, str, eVar, z5);
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public static void m8796(Activity activity, int i5, String str, final i2.e eVar, final boolean z5) {
        int i6;
        if (eVar == null) {
            return;
        }
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        if (i5 != 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errorCode", i5);
                jSONObject.put("errorMessage", str);
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
            str = jSONObject.toString();
            i6 = 0;
        } else {
            i6 = 1;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("success", i6);
            jSONObject2.put("text", str);
            final String jSONObject3 = jSONObject2.toString();
            Log.d("YM", "jsBridge back " + jSONObject3);
            activity.runOnUiThread(new Runnable() { // from class: h3.c0
                @Override // java.lang.Runnable
                public final void run() {
                    d0.m8800(eVar, jSONObject3, z5);
                }
            });
        } catch (JSONException e6) {
            e6.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ٴ, reason: contains not printable characters */
    public void m8797(Boolean bool, i2.e eVar) {
        m8794(0, bool.booleanValue() ? "true" : "false", eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᐧ, reason: contains not printable characters */
    public void m8798(Object obj, i2.e eVar) {
        m8795(0, n3.z1.m10907(obj), eVar, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᵎ, reason: contains not printable characters */
    public boolean m8799(String str, final Object obj, final i2.e eVar) {
        Log.d("YM", "jsBridge call " + str + "(" + obj + ")");
        if (!TextUtils.isEmpty(str) && (this.f8175.getContext() instanceof n3.d)) {
            if (obj == null) {
                try {
                    obj = new JSONObject();
                } catch (Exception e5) {
                    String str2 = str + " function not supported";
                    Toast.makeText(this.f8175.getContext(), str2, 1).show();
                    m8794(10, str2, eVar);
                    e5.printStackTrace();
                }
            }
            if (!(obj instanceof JSONObject)) {
                Toast.makeText(this.f8175.getContext(), "Parameter should be JSON object", 1).show();
                m8794(10, "Parameter should be JSON object", eVar);
                return false;
            }
            n3.d dVar = (n3.d) this.f8175.getContext();
            if (str.indexOf(".") > 0) {
                n3.a1.m10584(str, (JSONObject) obj, dVar, eVar == null ? null : new b(eVar), new n3.d0() { // from class: h3.a0
                    @Override // n3.d0
                    /* renamed from: ʻ */
                    public final Object mo8739(Object obj2) {
                        return d0.m8801((Integer) obj2);
                    }
                });
                return true;
            }
            final Method method = c.class.getMethod(str, JSONObject.class, i2.e.class);
            dVar.runOnUiThread(new Runnable() { // from class: h3.b0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8151.m8802(method, obj, eVar);
                }
            });
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᵔ, reason: contains not printable characters */
    public static /* synthetic */ void m8800(i2.e eVar, String str, boolean z5) {
        try {
            eVar.mo9223(str, z5);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᵢ, reason: contains not printable characters */
    public static /* synthetic */ Boolean m8801(Integer num) {
        return Boolean.valueOf(App.m7815(num.intValue(), true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ⁱ, reason: contains not printable characters */
    public /* synthetic */ void m8802(Method method, Object obj, i2.e eVar) {
        try {
            if (this.f8176 == null) {
                this.f8176 = new c(this, null);
            }
            method.invoke(this.f8176, obj, eVar);
        } catch (Exception e5) {
            m8794(99, e5.getMessage(), eVar);
            e5.printStackTrace();
        }
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public static d0 m8803(j2.f fVar) {
        d0 d0Var = new d0();
        d0Var.f8175 = fVar;
        return d0Var;
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    private void m8804(j2.f fVar) {
        if (this.f8175 != null) {
            return;
        }
        this.f8175 = fVar;
        fVar.setLtHandler(new a());
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public boolean m8805(j2.f fVar, String str, JSONObject jSONObject) {
        return m8799(str, jSONObject, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LTJsBridge.java */
    class c {

        /* renamed from: ʻ, reason: contains not printable characters */
        private i2.e f8180;

        /* compiled from: LTJsBridge.java */
        class a extends n3.s0 {

            /* renamed from: ʼ, reason: contains not printable characters */
            final /* synthetic */ i2.e f8182;

            a(i2.e eVar) {
                this.f8182 = eVar;
            }

            @Override // n3.s0
            /* renamed from: ʻ */
            public void mo8809(int i5, String str, boolean z5) {
                d0.this.m8794(i5, str, this.f8182);
            }
        }

        /* compiled from: LTJsBridge.java */
        class b extends n3.s0 {

            /* renamed from: ʼ, reason: contains not printable characters */
            final /* synthetic */ PopupWindow f8184;

            /* renamed from: ʽ, reason: contains not printable characters */
            final /* synthetic */ i2.e f8185;

            b(PopupWindow popupWindow, i2.e eVar) {
                this.f8184 = popupWindow;
                this.f8185 = eVar;
            }

            @Override // n3.s0
            /* renamed from: ʻ */
            public void mo8809(int i5, String str, boolean z5) {
                this.f8184.dismiss();
                d0.this.m8794(i5, str, this.f8185);
            }
        }

        /* compiled from: LTJsBridge.java */
        /* renamed from: h3.d0$c$c, reason: collision with other inner class name */
        class C0112c extends n3.s0 {

            /* renamed from: ʼ, reason: contains not printable characters */
            final /* synthetic */ i2.e f8187;

            C0112c(i2.e eVar) {
                this.f8187 = eVar;
            }

            @Override // n3.s0
            /* renamed from: ʻ */
            public void mo8809(int i5, String str, boolean z5) {
                d0.this.m8794(i5, str, this.f8187);
            }
        }

        /* compiled from: LTJsBridge.java */
        class d implements n3.f<String> {

            /* renamed from: ʻ, reason: contains not printable characters */
            final /* synthetic */ i2.e f8189;

            d(i2.e eVar) {
                this.f8189 = eVar;
            }

            @Override // n3.f
            /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public void mo8742(String str) {
                d0.this.m8794(TextUtils.isEmpty(str) ? 0 : 100, str, this.f8189);
            }
        }

        /* compiled from: LTJsBridge.java */
        class e implements u2.a {

            /* renamed from: ʻ, reason: contains not printable characters */
            final /* synthetic */ i2.e f8191;

            e(i2.e eVar) {
                this.f8191 = eVar;
            }

            @Override // h3.u2.a
            /* renamed from: ʻ, reason: contains not printable characters */
            public void mo8865(int i5, String str) {
                d0.this.m8794(i5, str, this.f8191);
            }
        }

        /* compiled from: LTJsBridge.java */
        class f implements u2.a {

            /* renamed from: ʻ, reason: contains not printable characters */
            final /* synthetic */ i2.e f8193;

            f(i2.e eVar) {
                this.f8193 = eVar;
            }

            @Override // h3.u2.a
            /* renamed from: ʻ */
            public void mo8865(int i5, String str) {
                d0.this.m8794(i5, str, this.f8193);
            }
        }

        /* compiled from: LTJsBridge.java */
        class g implements u2.a {

            /* renamed from: ʻ, reason: contains not printable characters */
            final /* synthetic */ i2.e f8195;

            g(i2.e eVar) {
                this.f8195 = eVar;
            }

            @Override // h3.u2.a
            /* renamed from: ʻ */
            public void mo8865(int i5, String str) {
                d0.this.m8795(i5, str, this.f8195, true);
            }
        }

        /* compiled from: LTJsBridge.java */
        class h implements n3.f<String> {

            /* renamed from: ʻ, reason: contains not printable characters */
            final /* synthetic */ i2.e f8197;

            h(i2.e eVar) {
                this.f8197 = eVar;
            }

            @Override // n3.f
            /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public void mo8742(String str) {
                d0.this.m8794(0, str, this.f8197);
            }
        }

        private c() {
            this.f8180 = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ʻʻ, reason: contains not printable characters */
        public /* synthetic */ void m8811(i2.e eVar, long j5) {
            d0.this.m8794(0, String.valueOf(j5), eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ʻʼ, reason: contains not printable characters */
        public /* synthetic */ void m8812(final i2.e eVar, int i5, final String str) {
            boolean z5 = i5 == 0;
            if (App.m7829(2130968577) && z5) {
                App.m7835().m7837(str, new n3.e() { // from class: h3.d1
                    @Override // n3.e
                    /* renamed from: ʻ */
                    public final void mo8748(Object obj, Object obj2) {
                        this.f8203.m8861(str, eVar, (String) obj, (Exception) obj2);
                    }
                });
                return;
            }
            d0 d0Var = d0.this;
            if (z5) {
                str = n3.z1.m10907(n3.z1.m10949(1).m10961("code", str).m10960());
            }
            d0Var.m8794(i5, str, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ʻʽ, reason: contains not printable characters */
        public /* synthetic */ void m8813(i2.e eVar, int i5, String str) {
            d0.this.m8794(i5, str, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ʻʾ, reason: contains not printable characters */
        public /* synthetic */ void m8814(i2.e eVar, int i5, String str) {
            d0.this.m8794(i5, str, eVar);
        }

        /* renamed from: ʻʿ, reason: contains not printable characters */
        private void m8815(final JSONArray jSONArray, final int i5, final i2.e eVar, final PopupWindow popupWindow) {
            if (i5 >= jSONArray.length()) {
                popupWindow.dismiss();
                d0.this.m8797(Boolean.TRUE, eVar);
                return;
            }
            final String optString = jSONArray.optString(i5);
            if (optString.startsWith("http://") || optString.startsWith("https://")) {
                n3.r.m10821(optString).m10829(new r.c() { // from class: h3.s0
                    @Override // n3.r.c
                    /* renamed from: ʻ */
                    public final void mo8741(Object obj, Exception exc) {
                        this.f8359.m8835(optString, popupWindow, eVar, jSONArray, i5, (byte[]) obj, exc);
                    }
                });
            } else {
                n3.z1.m10893(d0.this.f8175.getContext(), g3.a0.m8718(optString), new n3.f() { // from class: h3.t0
                    @Override // n3.f
                    /* renamed from: ʻ */
                    public final void mo8742(Object obj) {
                        this.f8373.m8839(popupWindow, eVar, jSONArray, i5, (Uri) obj);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ʼʼ, reason: contains not printable characters */
        public /* synthetic */ void m8817(i2.e eVar) {
            d0.this.m8794(0, null, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ʽʽ, reason: contains not printable characters */
        public /* synthetic */ void m8819(i2.e eVar, Bitmap bitmap) {
            d0.this.m8794(bitmap != null ? 0 : 1, n3.z1.m10949(1).m10961("base64", bitmap == null ? null : g3.a0.m8720(bitmap)).toString(), eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: ʾʾ, reason: contains not printable characters */
        public /* synthetic */ void m8821(PopupWindow popupWindow, Context context, i2.e eVar, l3.s sVar, Exception exc) {
            popupWindow.dismiss();
            if (exc != null || sVar == null) {
                String message = exc != null ? exc.getMessage() : "Network Error";
                Toast.makeText(context, message, 1).show();
                d0.this.m8794(60, message, eVar);
            } else {
                if (sVar.f12869e != 0 || sVar.f12868d == 0) {
                    Toast.makeText(context, sVar.f12870m, 1).show();
                    d0.this.m8794(60, sVar.f12870m, eVar);
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("orderString", ((l3.q) sVar.f12868d).orderString);
                    d0.this.f8176.aliPay(jSONObject, eVar);
                } catch (Exception unused) {
                    Toast.makeText(context, "System Error", 1).show();
                    d0.this.m8794(70, "System Error", eVar);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: ʿʿ, reason: contains not printable characters */
        public /* synthetic */ void m8823(PopupWindow popupWindow, Context context, i2.e eVar, l3.s sVar, Exception exc) {
            popupWindow.dismiss();
            if (exc != null || sVar == null) {
                String message = exc != null ? exc.getMessage() : "Network Error";
                Toast.makeText(context, message, 1).show();
                d0.this.m8794(60, message, eVar);
                return;
            }
            if (sVar.f12869e != 0 || sVar.f12868d == 0) {
                Toast.makeText(context, sVar.f12870m, 1).show();
                d0.this.m8794(60, sVar.f12870m, eVar);
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("appid", ((l3.r) sVar.f12868d).appid);
                jSONObject.put("partnerid", ((l3.r) sVar.f12868d).partnerid);
                jSONObject.put("prepayid", ((l3.r) sVar.f12868d).prepayid);
                jSONObject.put("noncestr", ((l3.r) sVar.f12868d).noncestr);
                jSONObject.put("package", ((l3.r) sVar.f12868d).package_);
                jSONObject.put("timestamp", ((l3.r) sVar.f12868d).timestamp);
                jSONObject.put("sign", ((l3.r) sVar.f12868d).sign);
                d0.this.f8176.wxPay(jSONObject, eVar);
            } catch (Exception unused) {
                Toast.makeText(context, "System Error", 1).show();
                d0.this.m8794(70, "System Error", eVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ˆˆ, reason: contains not printable characters */
        public /* synthetic */ void m8825(i2.e eVar, JSONObject jSONObject, String str) {
            if (jSONObject != null) {
                d0.this.m8794(0, jSONObject.toString(), eVar);
            } else {
                d0.this.m8794(1, str, eVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ˈˈ, reason: contains not printable characters */
        public /* synthetic */ void m8827(i2.e eVar, Uri uri) {
            d0.this.m8797(Boolean.valueOf(uri != null), eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ˉˉ, reason: contains not printable characters */
        public /* synthetic */ void m8829(i2.e eVar, Boolean bool, Boolean bool2) {
            d0.this.m8794(0, "{\"granted\":" + bool + ",\"neverAskAgain\":" + bool2 + "}", eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ˊˊ, reason: contains not printable characters */
        public /* synthetic */ void m8831(i2.e eVar, Uri uri) {
            d0.this.m8797(Boolean.valueOf(uri != null), eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ˋˋ, reason: contains not printable characters */
        public /* synthetic */ void m8833(PopupWindow popupWindow, String str, final i2.e eVar, byte[] bArr, Exception exc) {
            popupWindow.dismiss();
            n3.z1.m10895(d0.this.f8175.getContext(), bArr, n3.z1.m10899(d0.this.f8175.getContext().getContentResolver(), Uri.parse(str)), new n3.f() { // from class: h3.e1
                @Override // n3.f
                /* renamed from: ʻ */
                public final void mo8742(Object obj) {
                    this.f8212.m8827(eVar, (Uri) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ˎˎ, reason: contains not printable characters */
        public /* synthetic */ void m8835(String str, final PopupWindow popupWindow, final i2.e eVar, final JSONArray jSONArray, final int i5, byte[] bArr, Exception exc) {
            n3.z1.m10895(d0.this.f8175.getContext(), bArr, n3.z1.m10899(d0.this.f8175.getContext().getContentResolver(), Uri.parse(str)), new n3.f() { // from class: h3.f1
                @Override // n3.f
                /* renamed from: ʻ */
                public final void mo8742(Object obj) {
                    this.f8219.m8837(popupWindow, eVar, jSONArray, i5, (Uri) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ˏˏ, reason: contains not printable characters */
        public /* synthetic */ void m8837(PopupWindow popupWindow, i2.e eVar, JSONArray jSONArray, int i5, Uri uri) {
            if (uri != null) {
                m8815(jSONArray, i5 + 1, eVar, popupWindow);
            } else {
                popupWindow.dismiss();
                d0.this.m8797(Boolean.FALSE, eVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ˑˑ, reason: contains not printable characters */
        public /* synthetic */ void m8839(PopupWindow popupWindow, i2.e eVar, JSONArray jSONArray, int i5, Uri uri) {
            if (uri != null) {
                m8815(jSONArray, i5 + 1, eVar, popupWindow);
            } else {
                popupWindow.dismiss();
                d0.this.m8797(Boolean.FALSE, eVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: יי, reason: contains not printable characters */
        public /* synthetic */ void m8841(final i2.e eVar, Bitmap bitmap) {
            n3.z1.m10893(d0.this.f8175.getContext(), bitmap, new n3.f() { // from class: h3.c1
                @Override // n3.f
                /* renamed from: ʻ */
                public final void mo8742(Object obj) {
                    this.f8167.m8853(eVar, (Uri) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ــ, reason: contains not printable characters */
        public /* synthetic */ void m8843(PopupWindow popupWindow, Context context, i2.e eVar, JSONObject jSONObject, n3.n0 n0Var, l3.s sVar, Exception exc) {
            popupWindow.dismiss();
            if (exc != null || sVar == null) {
                String message = exc != null ? exc.getMessage() : "Network Error";
                Toast.makeText(context, message, 1).show();
                d0.this.m8794(60, message, eVar);
            } else {
                if (sVar.f12869e != 0 || sVar.f12868d == 0) {
                    Toast.makeText(context, sVar.f12870m, 1).show();
                    d0.this.m8794(60, sVar.f12870m, eVar);
                    return;
                }
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("tn", sVar.f12868d);
                    jSONObject2.put("seType", jSONObject.optString("seType"));
                    n0Var.pay(jSONObject2, (n3.d) d0.this.f8175.getContext(), new C0112c(eVar));
                } catch (Exception unused) {
                    Toast.makeText(context, "System Error", 1).show();
                    d0.this.m8794(70, "System Error", eVar);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ٴٴ, reason: contains not printable characters */
        public /* synthetic */ void m8845(l3.t tVar, i2.e eVar, String str) {
            m8847(str, tVar.needResult, eVar);
        }

        /* renamed from: ᐧᐧ, reason: contains not printable characters */
        private void m8847(String str, boolean z5, i2.e eVar) {
            if (!TextUtils.isEmpty(str)) {
                Context context = d0.this.f8175.getContext();
                vibrate(null, null);
                if (!z5) {
                    try {
                        com.lt.app.c.m7985(context, App.m7835().m7848(str));
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
            }
            d0.this.m8794(0, str, eVar);
        }

        /* renamed from: ᴵᴵ, reason: contains not printable characters */
        private void m8849(Object obj, i2.e eVar) {
            j2.m8915(obj, d0.this.f8175, eVar == null ? null : d0.this.new e(eVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ᵎᵎ, reason: contains not printable characters */
        public /* synthetic */ void m8851(w0.f fVar, i2.e eVar, Uri uri, String str) {
            fVar.dismiss();
            if (uri != null) {
                n3.z1.m10925(d0.this.f8175.getContext(), uri);
            }
            d0.this.m8797(Boolean.valueOf(uri != null), eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ᵔᵔ, reason: contains not printable characters */
        public /* synthetic */ void m8853(i2.e eVar, Uri uri) {
            d0.this.m8797(Boolean.valueOf(uri != null), eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ᵢᵢ, reason: contains not printable characters */
        public static /* synthetic */ void m8855(w0.f fVar, Long l5, Long l6) {
            fVar.m12478((int) (l6.longValue() / 1024));
            fVar.m12479((int) (l5.longValue() / 1024));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ⁱⁱ, reason: contains not printable characters */
        public /* synthetic */ void m8857(i2.e eVar, boolean z5, String str) {
            d0.this.m8795(0, str, eVar, z5);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ﹳﹳ, reason: contains not printable characters */
        public /* synthetic */ void m8859(l3.t tVar, i2.e eVar, String str) {
            m8847(str, tVar.needResult, eVar);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:11:0x001a
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1177)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0014 A[Catch: JSONException -> 0x001a, TRY_LEAVE, TryCatch #1 {JSONException -> 0x001a, blocks: (B:4:0x0004, B:6:0x000e, B:18:0x0014), top: B:3:0x0004 }] */
        /* JADX WARN: Type inference failed for: r1v2, types: [h3.d0] */
        /* renamed from: ﹶﹶ, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public /* synthetic */ void m8861(java.lang.Object r1, i2.e r2, java.lang.String r3, java.lang.Exception r4) {
            /*
                r0 = this;
                if (r4 != 0) goto L14
                if (r3 == 0) goto L14
                java.lang.String r4 = r3.trim()     // Catch: org.json.JSONException -> L1a
                boolean r4 = r4.isEmpty()     // Catch: org.json.JSONException -> L1a
                if (r4 != 0) goto L14
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1a
                r4.<init>(r3)     // Catch: org.json.JSONException -> L1a
                goto L1f
            L14:
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1a
                r4.<init>()     // Catch: org.json.JSONException -> L1a
                goto L1f
            L1a:
                org.json.JSONObject r4 = new org.json.JSONObject
                r4.<init>()
            L1f:
                java.lang.String r3 = "code"
                r4.put(r3, r1)     // Catch: java.lang.Exception -> L2e
                h3.d0 r1 = h3.d0.this     // Catch: java.lang.Exception -> L2e
                java.lang.String r3 = r4.toString()     // Catch: java.lang.Exception -> L2e
                r4 = 0
                h3.d0.m8790(r1, r4, r3, r2)     // Catch: java.lang.Exception -> L2e
            L2e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: h3.d0.c.m8861(java.lang.String, i2.e, java.lang.String, java.lang.Exception):void");
        }

        /* renamed from: ﾞﾞ, reason: contains not printable characters */
        private q1 m8863(JSONObject jSONObject) {
            q1 q1Var = new q1();
            int i5 = 0;
            q1Var.showTitle = jSONObject.has("showTitle") ? jSONObject.optBoolean("showTitle", true) ? 1 : 0 : -1;
            q1Var.titleColor = jSONObject.optString("titleColor");
            q1Var.titleText = jSONObject.optString("titleText");
            q1Var.titleTextColor = jSONObject.optString("titleTextColor");
            q1Var.fullScreen = jSONObject.has("fullScreen") ? jSONObject.optBoolean("fullScreen") ? 1 : 0 : -1;
            q1Var.statusBarColor = jSONObject.optString("statusBarColor");
            q1Var.statusBarBlackText = jSONObject.has("statusBarBlackText") ? jSONObject.optBoolean("statusBarBlackText") ? 1 : 0 : -1;
            q1Var.screenOrientation = jSONObject.has("screenOrientation") ? jSONObject.optInt("screenOrientation") : -1;
            if (!jSONObject.has("refresh")) {
                i5 = -1;
            } else if (jSONObject.optBoolean("refresh")) {
                i5 = 1;
            }
            q1Var.refresh = i5;
            return q1Var;
        }

        public void _isRoot(JSONObject jSONObject, i2.e eVar) {
            d0.this.m8797(Boolean.valueOf((d0.this.f8175.getContext() instanceof Activity) && ((Activity) d0.this.f8175.getContext()).isTaskRoot()), eVar);
        }

        public void action(JSONObject jSONObject, i2.e eVar) {
            ArrayList arrayList;
            JSONArray optJSONArray = jSONObject.optJSONArray("btns");
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(optJSONArray.length());
                for (int i5 = 0; i5 < optJSONArray.length(); i5++) {
                    arrayList.add(optJSONArray.optString(i5));
                }
            }
            new m3.m().m10043(arrayList, d0.this.f8175).show(((com.lt.app.b) d0.this.f8175.getContext()).m4043(), "action");
        }

        public void actionButton(JSONObject jSONObject, i2.e eVar) {
            m3.m.m10039(d0.this.f8175, jSONObject.optBoolean("visible") ? 1 : 0);
        }

        public void aliPay(JSONObject jSONObject, i2.e eVar) {
            if (!App.m7815(37, true)) {
                Toast.makeText(d0.this.f8175.getContext(), 2131820688, 0).show();
                return;
            }
            String optString = jSONObject.optString("orderString");
            if (TextUtils.isEmpty(optString)) {
                d0.this.m8794(100, "Missing Parameter orderString", eVar);
                return;
            }
            Activity activity = (Activity) d0.this.f8175.getContext();
            n3.x m10724 = n3.a1.m10724();
            if (m10724 == null) {
                com.lt.app.c.m7959(activity, 2131820778);
            } else {
                m10724.m10856(activity, optString, new d(eVar));
            }
        }

        public void appDownloads(JSONObject jSONObject, i2.e eVar) {
            d0.this.f8175.getContext().startActivity(new Intent("android.intent.action.VIEW_DOWNLOADS"));
        }

        public void appInfo(JSONObject jSONObject, i2.e eVar) {
            d0.this.m8794(0, App.m7835().m7844(d0.this.f8175.getContext() instanceof Activity ? (Activity) d0.this.f8175.getContext() : null).toString(), eVar);
        }

        public void appSettings(JSONObject jSONObject, i2.e eVar) {
            com.lt.app.c.m7968(d0.this.f8175.getContext());
        }

        public void backToHome(JSONObject jSONObject, i2.e eVar) {
            com.lt.app.c.m7960(d0.this.f8175, jSONObject.optBoolean("loadHomePage", false));
        }

        public void bottomSheet(JSONObject jSONObject, i2.e eVar) {
            i3.a aVar = (i3.a) n3.z1.m10872(jSONObject.toString(), i3.a.class);
            if (aVar == null) {
                return;
            }
            h3.b.m8779(aVar, d0.this.new d(eVar));
        }

        public void cacheSize(JSONObject jSONObject, final i2.e eVar) {
            if (App.m7815(6, true)) {
                z.m9100(new z.d() { // from class: h3.p0
                    @Override // h3.z.d
                    /* renamed from: ʻ, reason: contains not printable characters */
                    public final void mo8982(long j5) {
                        this.f8339.m8811(eVar, j5);
                    }
                });
            } else {
                Toast.makeText(d0.this.f8175.getContext(), 2131820688, 0).show();
            }
        }

        public void canGoBack(JSONObject jSONObject, i2.e eVar) {
            d0 d0Var = d0.this;
            d0Var.m8797(Boolean.valueOf(d0Var.f8175.canGoBack()), eVar);
        }

        public void canGoForward(JSONObject jSONObject, i2.e eVar) {
            d0 d0Var = d0.this;
            d0Var.m8797(Boolean.valueOf(d0Var.f8175.canGoForward()), eVar);
        }

        public void canLaunch(JSONObject jSONObject, i2.e eVar) {
            String optString = jSONObject.optString("u");
            if (TextUtils.isEmpty(optString)) {
                d0.this.m8797(Boolean.FALSE, eVar);
                return;
            }
            boolean z5 = false;
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(optString));
                if (intent.resolveActivity(d0.this.f8175.getContext().getPackageManager()) != null) {
                    z5 = true;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            d0.this.m8797(Boolean.valueOf(z5), eVar);
        }

        public void captureWebPage(JSONObject jSONObject, final i2.e eVar) {
            l3.a m7827 = App.m7827();
            e.a aVar = new e.a();
            aVar.f8207 = jSONObject.optBoolean("fullPage", m7827.m9729(22));
            aVar.f8208 = jSONObject.optBoolean("share", m7827.m9729(23));
            boolean optBoolean = jSONObject.optBoolean("needResult", false);
            aVar.f8209 = optBoolean;
            if (optBoolean) {
                aVar.f8210 = new n3.f() { // from class: h3.h1
                    @Override // n3.f
                    /* renamed from: ʻ */
                    public final void mo8742(Object obj) {
                        this.f8234.m8819(eVar, (Bitmap) obj);
                    }
                };
            }
            h3.e.m8872(d0.this.f8175, aVar);
        }

        public void checkCamera(JSONObject jSONObject, i2.e eVar) {
            int i5;
            boolean z5;
            boolean z6;
            CameraManager cameraManager;
            try {
            } catch (Exception e5) {
                e = e5;
                i5 = 0;
                z5 = false;
                z6 = false;
            }
            if (Build.VERSION.SDK_INT >= 21 && (cameraManager = (CameraManager) d0.this.f8175.getContext().getSystemService("camera")) != null) {
                String[] cameraIdList = cameraManager.getCameraIdList();
                i5 = cameraIdList != null ? cameraIdList.length : 0;
                if (i5 > 0) {
                    z5 = false;
                    z6 = false;
                    for (int i6 = 0; i6 < i5; i6++) {
                        try {
                            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(cameraIdList[i6]);
                            if (((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                                z5 = true;
                            } else if (((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                                z6 = true;
                            }
                        } catch (Exception e6) {
                            e = e6;
                            e.printStackTrace();
                            d0.this.m8794(0, n3.z1.m10949(3).m10961("count", Integer.valueOf(i5)).m10961("front", Boolean.valueOf(z5)).m10961("back", Boolean.valueOf(z6)).toString(), eVar);
                        }
                    }
                }
                d0.this.m8794(0, n3.z1.m10949(3).m10961("count", Integer.valueOf(i5)).m10961("front", Boolean.valueOf(z5)).m10961("back", Boolean.valueOf(z6)).toString(), eVar);
            }
            i5 = 0;
            z5 = false;
            z6 = false;
            d0.this.m8794(0, n3.z1.m10949(3).m10961("count", Integer.valueOf(i5)).m10961("front", Boolean.valueOf(z5)).m10961("back", Boolean.valueOf(z6)).toString(), eVar);
        }

        public void clearCache(JSONObject jSONObject, final i2.e eVar) {
            if (App.m7815(6, true)) {
                z.m9099(new z.c() { // from class: h3.b1
                    @Override // h3.z.c
                    /* renamed from: ʻ */
                    public final void mo8744() {
                        this.f8155.m8817(eVar);
                    }
                }, d0.this.f8175);
            } else {
                Toast.makeText(d0.this.f8175.getContext(), 2131820688, 0).show();
            }
        }

        public void clearCookie(JSONObject jSONObject, i2.e eVar) {
            d0.this.f8175.mo7792();
        }

        public void close(JSONObject jSONObject, i2.e eVar) {
            String optString = jSONObject.optString("f");
            if (!TextUtils.isEmpty(optString) && !URLUtil.isJavaScriptUrl(optString)) {
                optString = "javascript:" + optString;
            }
            d0.f8173 = optString;
            if (d0.this.f8175.getContext() instanceof Activity) {
                Activity activity = (Activity) d0.this.f8175.getContext();
                if ((activity instanceof WebActivity) && ((WebActivity) activity).m7938()) {
                    Log.d("YM", "主窗口不可 close，请使用 exit");
                } else {
                    activity.finish();
                }
            }
        }

        public void contactAll(JSONObject jSONObject, i2.e eVar) {
            if (!App.m7815(22, true)) {
                Toast.makeText(d0.this.f8175.getContext(), 2131820688, 0).show();
                return;
            }
            n3.z m10721 = n3.a1.m10721();
            if (m10721 == null) {
                n3.z1.m10912(d0.this.f8175.getContext(), BuildConfig.FLAVOR, "contactAll");
            } else {
                m10721.m10869((n3.d) d0.this.f8175.getContext(), new b(com.lt.app.c.m7980(d0.this.f8175.getViewEx()), eVar));
            }
        }

        public void contactOne(JSONObject jSONObject, i2.e eVar) {
            if (!App.m7815(22, true)) {
                Toast.makeText(d0.this.f8175.getContext(), 2131820688, 0).show();
                return;
            }
            n3.z m10721 = n3.a1.m10721();
            if (m10721 == null) {
                n3.z1.m10912(d0.this.f8175.getContext(), BuildConfig.FLAVOR, "contactOne");
            } else {
                m10721.m10870((n3.d) d0.this.f8175.getContext(), new a(eVar));
            }
        }

        public void debug(JSONObject jSONObject, i2.e eVar) {
            d0.this.f8174 = true;
        }

        public void deviceInfo(JSONObject jSONObject, i2.e eVar) {
            d0.this.m8794(0, n3.z1.m10907(g3.a0.m8725(d0.this.f8175.getContext())), eVar);
        }

        public void evalInNavbar(JSONObject jSONObject, i2.e eVar) {
            MainActivity mainActivity;
            String optString = jSONObject.optString("j");
            if (TextUtils.isEmpty(optString) || (mainActivity = MainActivity.f6674) == null) {
                return;
            }
            mainActivity.m7932(optString);
        }

        public void evalInToolbar(JSONObject jSONObject, i2.e eVar) {
            MainActivity mainActivity;
            String optString = jSONObject.optString("j");
            if (TextUtils.isEmpty(optString) || (mainActivity = MainActivity.f6674) == null) {
                return;
            }
            mainActivity.m7933(optString);
        }

        public void exit(JSONObject jSONObject, i2.e eVar) {
            if (jSONObject.optBoolean("k", false)) {
                System.exit(0);
            } else {
                com.lt.app.c.m7963(d0.this.f8175.getContext());
            }
        }

        public void getClipboardText(JSONObject jSONObject, i2.e eVar) {
            ClipboardManager clipboardManager = (ClipboardManager) d0.this.f8175.getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                return;
            }
            ClipData primaryClip = clipboardManager.getPrimaryClip();
            d0.this.m8794(0, (primaryClip == null || primaryClip.getItemCount() <= 0) ? null : primaryClip.getItemAt(0).coerceToText(d0.this.f8175.getContext()).toString(), eVar);
        }

        public void getDeviceId(JSONObject jSONObject, i2.e eVar) {
            d0.this.m8794(0, App.m7835().m7843(), eVar);
        }

        public void getInstallId(JSONObject jSONObject, i2.e eVar) {
            d0.this.m8794(0, App.m7835().m7859(), eVar);
        }

        public void getNavigationBar(JSONObject jSONObject, i2.e eVar) {
            d0.this.m8798(d0.this.f8175.getContext() instanceof com.lt.app.b ? ((com.lt.app.b) d0.this.f8175.getContext()).m7957().m8998() : null, eVar);
        }

        public void getOption(JSONObject jSONObject, i2.e eVar) {
            d0.this.m8798(d0.this.f8175.getContext() instanceof com.lt.app.b ? ((com.lt.app.b) d0.this.f8175.getContext()).m7957().m8999() : null, eVar);
        }

        public void getScreenOrientation(JSONObject jSONObject, i2.e eVar) {
            d0.this.m8798(d0.this.f8175.getContext() instanceof com.lt.app.b ? ((com.lt.app.b) d0.this.f8175.getContext()).m7957().m9000() : null, eVar);
        }

        public void getSettingState(JSONObject jSONObject, i2.e eVar) {
            d0.this.m8797(Boolean.valueOf(com.lt.app.c.m7965(d0.this.f8175.getContext(), jSONObject.optInt("w", 0))), eVar);
        }

        public void getStatusBar(JSONObject jSONObject, i2.e eVar) {
            d0.this.m8798(d0.this.f8175.getContext() instanceof com.lt.app.b ? ((com.lt.app.b) d0.this.f8175.getContext()).m7957().m9001() : null, eVar);
        }

        public void getTheme(JSONObject jSONObject, i2.e eVar) {
            d0.this.m8798(d0.this.f8175.getContext() instanceof com.lt.app.b ? ((com.lt.app.b) d0.this.f8175.getContext()).m7957().m9003() : null, eVar);
        }

        public void getTitleBar(JSONObject jSONObject, i2.e eVar) {
            d0.this.m8798(d0.this.f8175.getContext() instanceof com.lt.app.b ? ((com.lt.app.b) d0.this.f8175.getContext()).m7957().m9005() : null, eVar);
        }

        public void home(JSONObject jSONObject, i2.e eVar) {
            if (d0.this.f8175.getContext() instanceof Activity) {
                ((Activity) d0.this.f8175.getContext()).moveTaskToBack(true);
            }
        }

        public void launch(JSONObject jSONObject, i2.e eVar) {
            int i5;
            boolean z5 = false;
            if (jSONObject.has("a")) {
                String optString = jSONObject.optString("a");
                if (!TextUtils.isEmpty(optString) && com.lt.app.c.m7976(d0.this.f8175.getContext(), optString, null)) {
                    z5 = true;
                }
                d0.this.m8797(Boolean.valueOf(z5), eVar);
                return;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("b");
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                i5 = -1;
            } else {
                i5 = 0;
                while (i5 < optJSONArray.length()) {
                    String optString2 = optJSONArray.optString(i5);
                    if (!TextUtils.isEmpty(optString2) && com.lt.app.c.m7976(d0.this.f8175.getContext(), optString2, null)) {
                        break;
                    } else {
                        i5++;
                    }
                }
                i5 = -1;
            }
            d0.this.m8794(0, i5 + BuildConfig.FLAVOR, eVar);
        }

        public void launchPackage(JSONObject jSONObject, i2.e eVar) {
            boolean z5;
            String optString = jSONObject.optString("s");
            if (TextUtils.isEmpty(optString)) {
                return;
            }
            Intent launchIntentForPackage = d0.this.f8175.getContext().getPackageManager().getLaunchIntentForPackage(optString);
            if (launchIntentForPackage != null) {
                try {
                    d0.this.f8175.getContext().startActivity(launchIntentForPackage);
                    z5 = true;
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            } else {
                z5 = false;
            }
            d0.this.m8797(Boolean.valueOf(z5), eVar);
        }

        public void miniProgram(JSONObject jSONObject, i2.e eVar) {
            com.lt.app.c.m7971(jSONObject.toString(), (n3.d) d0.this.f8175.getContext(), new h(eVar));
        }

        public void net(JSONObject jSONObject, i2.e eVar) {
            i3.b bVar;
            if ((d0.this.f8175.getContext() instanceof n3.d) && (bVar = (i3.b) n3.z1.m10872(jSONObject.toString(), i3.b.class)) != null) {
                v.m9073((n3.d) d0.this.f8175.getContext(), false, bVar, eVar);
            }
        }

        public void netUploadFile(JSONObject jSONObject, i2.e eVar) {
            i3.b bVar;
            if ((d0.this.f8175.getContext() instanceof n3.d) && (bVar = (i3.b) n3.z1.m10872(jSONObject.toString(), i3.b.class)) != null) {
                v.m9073((n3.d) d0.this.f8175.getContext(), true, bVar, eVar);
            }
        }

        public void onAppEnterBackground(JSONObject jSONObject, i2.e eVar) {
            if (d0.this.f8175.getContext() instanceof y) {
                ((y) d0.this.f8175.getContext()).mo7948(eVar);
            }
        }

        public void onAppEnterForeground(JSONObject jSONObject, i2.e eVar) {
            if (d0.this.f8175.getContext() instanceof y) {
                ((y) d0.this.f8175.getContext()).mo7930(eVar);
            }
        }

        public void open(JSONObject jSONObject, i2.e eVar) {
            String optString = jSONObject.optString("url");
            if (TextUtils.isEmpty(optString)) {
                return;
            }
            q1 m8863 = m8863(jSONObject);
            m8863.url = null;
            if (!URLUtil.isValidUrl(optString)) {
                try {
                    optString = new URL(new URL(d0.this.f8175.getUrl()), optString).toString();
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
            com.lt.app.c.m7976(d0.this.f8175.getContext(), optString, m8863);
        }

        public void openInBrowser(JSONObject jSONObject, i2.e eVar) {
            String optString = jSONObject.optString("s");
            if (TextUtils.isEmpty(optString)) {
                return;
            }
            com.lt.app.c.m7986(d0.this.f8175.getContext(), optString, true);
        }

        public void openSetting(JSONObject jSONObject, i2.e eVar) {
            com.lt.app.c.m7970(d0.this.f8175.getContext(), jSONObject.optInt("w", 0));
        }

        public void pay(final JSONObject jSONObject, final i2.e eVar) {
            BigDecimal bigDecimal;
            final Context context = d0.this.f8175.getContext();
            int optInt = jSONObject.optInt("channel");
            if (optInt < 0 || optInt > 2) {
                Toast.makeText(context, "Parameter channel should be 0, 1 or 2", 1).show();
                d0.this.m8794(40, "Parameter channel should be 0, 1 or 2", eVar);
                return;
            }
            if (optInt == 0) {
                if (!App.m7829(2130968576)) {
                    Toast.makeText(context, 2131820798, 1).show();
                    d0.this.m8794(50, context.getString(2131820798), eVar);
                    return;
                } else if (!App.m7815(38, true)) {
                    Toast.makeText(context, 2131820688, 1).show();
                    d0.this.m8794(50, context.getString(2131820688), eVar);
                    return;
                }
            }
            if (optInt == 1 && !App.m7815(37, true)) {
                Toast.makeText(context, 2131820688, 1).show();
                d0.this.m8794(50, context.getString(2131820688), eVar);
                return;
            }
            if (optInt == 2 && !App.m7815(62, true)) {
                Toast.makeText(context, 2131820688, 1).show();
                d0.this.m8794(50, context.getString(2131820688), eVar);
                return;
            }
            String optString = jSONObject.optString("title");
            if (TextUtils.isEmpty(optString)) {
                Toast.makeText(context, "Missing Parameter title", 1).show();
                d0.this.m8794(40, "Missing Parameter title", eVar);
                return;
            }
            String optString2 = jSONObject.optString("orderid");
            if (TextUtils.isEmpty(optString2)) {
                Toast.makeText(context, "Missing Parameter orderid", 1).show();
                d0.this.m8794(40, "Missing Parameter orderid", eVar);
                return;
            }
            try {
                String optString3 = jSONObject.optString("amount");
                if (TextUtils.isEmpty(optString3)) {
                    optString3 = "0";
                }
                bigDecimal = new BigDecimal(optString3);
            } catch (Exception e5) {
                bigDecimal = new BigDecimal("0");
                e5.printStackTrace();
            }
            BigDecimal bigDecimal2 = bigDecimal;
            if (bigDecimal2.compareTo(new BigDecimal("0.01")) == -1) {
                Toast.makeText(context, "amount can not less than 0.01", 1).show();
                d0.this.m8794(40, "amount can not less than 0.01", eVar);
                return;
            }
            String optString4 = jSONObject.optString("attach");
            final PopupWindow m7980 = com.lt.app.c.m7980(d0.this.f8175.getViewEx());
            if (optInt == 0) {
                App.m7835().m7838(optString, optString2, bigDecimal2, optString4, new n3.e() { // from class: h3.y0
                    @Override // n3.e
                    /* renamed from: ʻ */
                    public final void mo8748(Object obj, Object obj2) {
                        this.f8417.m8823(m7980, context, eVar, (l3.s) obj, (Exception) obj2);
                    }
                });
                return;
            }
            if (optInt == 1) {
                App.m7835().m7850(optString, optString2, bigDecimal2, optString4, new n3.e() { // from class: h3.z0
                    @Override // n3.e
                    /* renamed from: ʻ */
                    public final void mo8748(Object obj, Object obj2) {
                        this.f8434.m8821(m7980, context, eVar, (l3.s) obj, (Exception) obj2);
                    }
                });
                return;
            }
            if (optInt != 2) {
                return;
            }
            final n3.n0 m10694 = n3.a1.m10694();
            if (m10694 != null) {
                App.m7835().m7858(optString, optString2, bigDecimal2, optString4, new n3.e() { // from class: h3.a1
                    @Override // n3.e
                    /* renamed from: ʻ */
                    public final void mo8748(Object obj, Object obj2) {
                        this.f8135.m8843(m7980, context, eVar, jSONObject, m10694, (l3.s) obj, (Exception) obj2);
                    }
                });
                return;
            }
            m7980.dismiss();
            Toast.makeText(context, "没有打包银联插件", 1).show();
            d0.this.m8794(40, "没有打包银联插件", eVar);
        }

        public void print(JSONObject jSONObject, i2.e eVar) {
            String mo7789 = d0.this.f8175.mo7789(jSONObject.optString("name"), jSONObject.optString("html"));
            d0.this.m8794(!TextUtils.isEmpty(mo7789) ? 1 : 0, mo7789, eVar);
        }

        public void progress(JSONObject jSONObject, i2.e eVar) {
            if (d0.this.f8175.getContext() instanceof w) {
                ((w) d0.this.f8175.getContext()).mo7868((l3.p) n3.z1.m10872(jSONObject.toString(), l3.p.class));
            }
        }

        public void qqLogin(JSONObject jSONObject, final i2.e eVar) {
            Context context = d0.this.f8175.getContext();
            n3.k0 m10655 = n3.a1.m10655();
            if (m10655 == null) {
                Toast.makeText(context, 2131820658, 1).show();
                return;
            }
            if (!App.m7815(12, true)) {
                Toast.makeText(d0.this.f8175.getContext(), 2131820688, 0).show();
            } else if (context instanceof com.lt.app.b) {
                m10655.m10795((n3.d) context, new n3.e() { // from class: h3.q0
                    @Override // n3.e
                    /* renamed from: ʻ */
                    public final void mo8748(Object obj, Object obj2) {
                        this.f8349.m8825(eVar, (JSONObject) obj, (String) obj2);
                    }
                });
            } else {
                d0.this.m8794(10, "System Error", eVar);
            }
        }

        public void requestPermissions(JSONObject jSONObject, final i2.e eVar) {
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("p");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                int length = optJSONArray.length();
                for (int i5 = 0; i5 < length; i5++) {
                    String optString = optJSONArray.optString(i5);
                    optString.hashCode();
                    switch (optString) {
                        case "ReadPhoneState":
                            arrayList.add("android.permission.READ_PHONE_STATE");
                            break;
                        case "ReadContacts":
                            arrayList.add("android.permission.READ_CONTACTS");
                            break;
                        case "WriteContacts":
                            arrayList.add("android.permission.WRITE_CONTACTS");
                            break;
                        case "WritePhotos":
                            if (Build.VERSION.SDK_INT <= 32) {
                                arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
                                break;
                            } else {
                                break;
                            }
                        case "Microphone":
                            arrayList.add("android.permission.RECORD_AUDIO");
                            break;
                        case "BlueTooth":
                            arrayList.add("android.permission.BLUETOOTH");
                            break;
                        case "PostNotifications":
                            arrayList.add("android.permission.POST_NOTIFICATIONS");
                            break;
                        case "ReadPhotos":
                            arrayList.add(n3.z1.m10882("android.permission.READ_EXTERNAL_STORAGE"));
                            break;
                        case "Location":
                            arrayList.add("android.permission.ACCESS_FINE_LOCATION");
                            arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
                            break;
                        case "Camera":
                            arrayList.add("android.permission.CAMERA");
                            break;
                    }
                }
            }
            if (arrayList.isEmpty() || !(d0.this.f8175.getContext() instanceof n3.d)) {
                d0.this.m8794(0, "{\"granted\":true,\"neverAskAgain\":false}", eVar);
                return;
            }
            String[] strArr = new String[arrayList.size()];
            arrayList.toArray(strArr);
            ((n3.d) d0.this.f8175.getContext()).m10766(new n3.e() { // from class: h3.j1
                @Override // n3.e
                /* renamed from: ʻ */
                public final void mo8748(Object obj, Object obj2) {
                    this.f8246.m8829(eVar, (Boolean) obj, (Boolean) obj2);
                }
            }, strArr);
        }

        public void restart(JSONObject jSONObject, i2.e eVar) {
            com.lt.app.c.m7972(App.m7835());
        }

        public void richAlert(JSONObject jSONObject, i2.e eVar) {
            i3.c cVar = (i3.c) n3.z1.m10872(jSONObject.toString(), i3.c.class);
            if (cVar == null) {
                return;
            }
            v1.m9079(cVar, d0.this.new d(eVar));
        }

        public void richDialog(JSONObject jSONObject, i2.e eVar) {
            i3.d dVar = (i3.d) n3.z1.m10872(jSONObject.toString(), i3.d.class);
            if (dVar == null) {
                return;
            }
            y1.m9097(dVar, d0.this.new d(eVar));
        }

        public void saveImageToAlbum(JSONObject jSONObject, final i2.e eVar) {
            final String optString = jSONObject.optString("i");
            if (TextUtils.isEmpty(optString)) {
                d0.this.m8797(Boolean.FALSE, eVar);
                return;
            }
            if (optString.startsWith("http://") || optString.startsWith("https://")) {
                final PopupWindow m7980 = com.lt.app.c.m7980(d0.this.f8175.getViewEx());
                n3.r.m10821(optString).m10829(new r.c() { // from class: h3.u0
                    @Override // n3.r.c
                    /* renamed from: ʻ */
                    public final void mo8741(Object obj, Exception exc) {
                        this.f8392.m8833(m7980, optString, eVar, (byte[]) obj, exc);
                    }
                });
            } else {
                n3.z1.m10893(d0.this.f8175.getContext(), g3.a0.m8718(optString), new n3.f() { // from class: h3.v0
                    @Override // n3.f
                    /* renamed from: ʻ */
                    public final void mo8742(Object obj) {
                        this.f8403.m8831(eVar, (Uri) obj);
                    }
                });
            }
        }

        public void saveImagesToAlbum(JSONObject jSONObject, i2.e eVar) {
            JSONArray optJSONArray = jSONObject.optJSONArray("i");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                d0.this.m8797(Boolean.FALSE, eVar);
            } else {
                m8815(optJSONArray, 0, eVar, com.lt.app.c.m7980(d0.this.f8175.getViewEx()));
            }
        }

        public void saveScreenshotToAlbum(JSONObject jSONObject, final i2.e eVar) {
            d0.this.f8175.mo7790(false, new f.a() { // from class: h3.i1
                @Override // j2.f.a
                /* renamed from: ʻ */
                public final void mo8781(Object obj) {
                    this.f8239.m8841(eVar, (Bitmap) obj);
                }
            });
        }

        public void saveVideoToAlbum(JSONObject jSONObject, final i2.e eVar) {
            String str;
            int lastIndexOf;
            String optString = jSONObject.optString("i");
            if (TextUtils.isEmpty(optString)) {
                d0.this.m8797(Boolean.FALSE, eVar);
                return;
            }
            if (!optString.startsWith("http://") && !optString.startsWith("https://")) {
                d0.this.m8797(Boolean.FALSE, eVar);
                return;
            }
            try {
                str = Uri.parse(optString).getPath();
            } catch (Exception unused) {
                str = null;
            }
            String substring = (TextUtils.isEmpty(str) || !str.endsWith(".mp4") || (lastIndexOf = str.lastIndexOf("/")) <= 0 || lastIndexOf >= str.length() + (-1)) ? null : str.substring(lastIndexOf + 1);
            if (TextUtils.isEmpty(substring)) {
                substring = System.currentTimeMillis() + ".mp4";
            }
            Uri m10896 = n3.z1.m10896(d0.this.f8175.getContext(), substring);
            final w0.f m12496 = new f.e(d0.this.f8175.getContext()).m12498(null).m12484(2131820804).m12495(false, 0, false).m12483(false).m12496();
            n3.z1.m10948(d0.this.f8175.getContext(), optString, m10896, new n3.e() { // from class: h3.m0
                @Override // n3.e
                /* renamed from: ʻ */
                public final void mo8748(Object obj, Object obj2) {
                    this.f8306.m8851(m12496, eVar, (Uri) obj, (String) obj2);
                }
            }, new n3.e() { // from class: h3.n0
                @Override // n3.e
                /* renamed from: ʻ */
                public final void mo8748(Object obj, Object obj2) {
                    d0.c.m8855(m12496, (Long) obj, (Long) obj2);
                }
            });
        }

        public void scan(JSONObject jSONObject, final i2.e eVar) {
            l3.t tVar = (l3.t) n3.z1.m10872(jSONObject.toString(), l3.t.class);
            if (tVar == null) {
                return;
            }
            final boolean m9743 = tVar.m9743();
            g3.a0.m8717((com.lt.app.b) d0.this.f8175.getContext(), tVar, tVar.needResult ? new n3.f() { // from class: h3.g1
                @Override // n3.f
                /* renamed from: ʻ */
                public final void mo8742(Object obj) {
                    this.f8229.m8857(eVar, m9743, (String) obj);
                }
            } : null);
        }

        public void scanFromAlbum(JSONObject jSONObject, final i2.e eVar) {
            final l3.t tVar = (l3.t) n3.z1.m10872(jSONObject.toString(), l3.t.class);
            if (tVar == null) {
                return;
            }
            g3.a0.m8730((com.lt.app.b) d0.this.f8175.getContext(), new n3.f() { // from class: h3.x0
                @Override // n3.f
                /* renamed from: ʻ */
                public final void mo8742(Object obj) {
                    this.f8411.m8859(tVar, eVar, (String) obj);
                }
            });
        }

        public void scanFromUrl(JSONObject jSONObject, final i2.e eVar) {
            final l3.t tVar = (l3.t) n3.z1.m10872(jSONObject.toString(), l3.t.class);
            if (tVar == null) {
                return;
            }
            g3.a0.m8731(tVar.imageUrl, d0.this.f8175.getViewEx(), new n3.f() { // from class: h3.r0
                @Override // n3.f
                /* renamed from: ʻ */
                public final void mo8742(Object obj) {
                    this.f8354.m8845(tVar, eVar, (String) obj);
                }
            });
        }

        public void setClipboardText(JSONObject jSONObject, i2.e eVar) {
            String optString = jSONObject.optString("text");
            ClipboardManager clipboardManager = (ClipboardManager) d0.this.f8175.getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                return;
            }
            clipboardManager.setPrimaryClip(ClipData.newPlainText(null, optString));
        }

        public void setMiniProgramResult(JSONObject jSONObject, i2.e eVar) {
            com.lt.app.c.m7975(jSONObject.optString("r"), (n3.d) d0.this.f8175.getContext());
        }

        public void setNavigationBar(JSONObject jSONObject, i2.e eVar) {
            if (d0.this.f8175.getContext() instanceof com.lt.app.b) {
                ((com.lt.app.b) d0.this.f8175.getContext()).m7957().m9007((p1.a) n3.z1.m10872(jSONObject.toString(), p1.a.class));
            }
            d0.this.m8794(0, null, eVar);
        }

        public void setOption(JSONObject jSONObject, i2.e eVar) {
            if (d0.this.f8175.getContext() instanceof com.lt.app.b) {
                ((com.lt.app.b) d0.this.f8175.getContext()).m7957().m9008((p1.b) n3.z1.m10872(jSONObject.toString(), p1.b.class));
            }
            d0.this.m8794(0, null, eVar);
        }

        public void setOptions(JSONObject jSONObject, i2.e eVar) {
            if (d0.this.f8175.getContext() instanceof WebActivity) {
                q1 m8863 = m8863(jSONObject);
                m8863.url = jSONObject.optString("url");
                ((WebActivity) d0.this.f8175.getContext()).m7942(m8863);
            }
        }

        public void setScreenOrientation(JSONObject jSONObject, i2.e eVar) {
            if (d0.this.f8175.getContext() instanceof com.lt.app.b) {
                ((com.lt.app.b) d0.this.f8175.getContext()).m7957().m9009((p1.c) n3.z1.m10872(jSONObject.toString(), p1.c.class));
            }
            d0.this.m8794(0, null, eVar);
        }

        public void setStatusBar(JSONObject jSONObject, i2.e eVar) {
            if (d0.this.f8175.getContext() instanceof com.lt.app.b) {
                ((com.lt.app.b) d0.this.f8175.getContext()).m7957().m9010((p1.d) n3.z1.m10872(jSONObject.toString(), p1.d.class));
            }
            d0.this.m8794(0, null, eVar);
        }

        public void setTheme(JSONObject jSONObject, i2.e eVar) {
            if (d0.this.f8175.getContext() instanceof com.lt.app.b) {
                ((com.lt.app.b) d0.this.f8175.getContext()).m7957().m9002((p1.e) n3.z1.m10872(jSONObject.toString(), p1.e.class));
            }
            d0.this.m8794(0, null, eVar);
        }

        public void setTitleBar(JSONObject jSONObject, i2.e eVar) {
            if (d0.this.f8175.getContext() instanceof com.lt.app.b) {
                ((com.lt.app.b) d0.this.f8175.getContext()).m7957().m9004((p1.f) n3.z1.m10872(jSONObject.toString(), p1.f.class));
            }
            d0.this.m8794(0, null, eVar);
        }

        public void share(JSONObject jSONObject, i2.e eVar) {
            j2.i iVar;
            int i5 = -1;
            if (jSONObject.length() > 0) {
                iVar = new j2.i();
                iVar.f8280 = jSONObject.optString("title");
                iVar.f8281 = jSONObject.optString("link");
                iVar.f8283 = jSONObject.optString("imgUrl");
                iVar.f8282 = jSONObject.optString("desc");
                i5 = jSONObject.optInt("to", -1);
            } else {
                iVar = null;
            }
            j2.m8909(i5, d0.this.f8175, iVar, eVar != null ? d0.this.new e(eVar) : null, false);
        }

        public void shareImage(JSONObject jSONObject, i2.e eVar) {
            j2.g gVar = new j2.g();
            gVar.f8270 = jSONObject.optInt("to", -1);
            gVar.f8271 = jSONObject.optString("imgUrl");
            m8849(gVar, eVar);
        }

        public void shareImages(JSONObject jSONObject, i2.e eVar) {
            if (!App.m7815(23, true)) {
                Toast.makeText(d0.this.f8175.getContext(), 2131820688, 0).show();
                return;
            }
            com.lt.app.b bVar = (com.lt.app.b) d0.this.f8175.getContext();
            n3.l0 m10672 = n3.a1.m10672();
            if (m10672 == null) {
                com.lt.app.c.m7959(d0.this.f8175.getContext(), 2131820778);
                return;
            }
            String optString = jSONObject.optString("text");
            JSONArray optJSONArray = jSONObject.optJSONArray("images");
            ArrayList arrayList = new ArrayList();
            for (int i5 = 0; optJSONArray != null && i5 < optJSONArray.length(); i5++) {
                arrayList.add(optJSONArray.optString(i5));
            }
            m10672.m10804(bVar, optString, arrayList);
        }

        public void shareMusic(JSONObject jSONObject, i2.e eVar) {
            j2.h hVar = new j2.h();
            hVar.f8272 = jSONObject.optInt("to", -1);
            hVar.f8273 = jSONObject.optString("title");
            hVar.f8274 = jSONObject.optString("desc");
            hVar.f8275 = jSONObject.optString("imgUrl");
            hVar.f8276 = jSONObject.optString("targetUrl");
            hVar.f8277 = jSONObject.optString("musicUrl");
            hVar.f8278 = jSONObject.optString("songAlbumUrl");
            hVar.f8279 = jSONObject.optString("songLyric");
            m8849(hVar, eVar);
        }

        public void shareQqMiniProgram(JSONObject jSONObject, i2.e eVar) {
            j2.j jVar = (j2.j) n3.z1.m10872(jSONObject.toString(), j2.j.class);
            if (jVar == null) {
                return;
            }
            m8849(jVar, eVar);
        }

        public void shareText(JSONObject jSONObject, i2.e eVar) {
            j2.k kVar = new j2.k();
            kVar.f8284 = jSONObject.optInt("to", -1);
            kVar.f8285 = jSONObject.optString("text");
            m8849(kVar, eVar);
        }

        public void shareVideo(JSONObject jSONObject, i2.e eVar) {
            j2.l lVar = new j2.l();
            lVar.f8286 = jSONObject.optInt("to", -1);
            lVar.f8287 = jSONObject.optString("title");
            lVar.f8288 = jSONObject.optString("desc");
            lVar.f8289 = jSONObject.optString("imgUrl");
            lVar.f8290 = jSONObject.optString("videoUrl");
            m8849(lVar, eVar);
        }

        public void shareWxMiniProgram(JSONObject jSONObject, i2.e eVar) {
            j2.m mVar = (j2.m) n3.z1.m10872(jSONObject.toString(), j2.m.class);
            if (mVar == null) {
                return;
            }
            m8849(mVar, eVar);
        }

        public void showImages(JSONObject jSONObject, i2.e eVar) {
            if (!App.m7815(26, true)) {
                Toast.makeText(d0.this.f8175.getContext(), 2131820688, 0).show();
                return;
            }
            n3.i0 m10651 = n3.a1.m10651();
            if (m10651 == null) {
                com.lt.app.c.m7959(d0.this.f8175.getContext(), 2131820778);
                return;
            }
            l3.a m7827 = App.m7827();
            i0.a aVar = new i0.a();
            if (jSONObject.has("screenOrientation")) {
                aVar.f9759 = jSONObject.optInt("screenOrientation", 0);
            } else {
                aVar.f9759 = m7827.m9728(28) ? 1 : m7827.m9728(29) ? 2 : 0;
            }
            if (jSONObject.has("save")) {
                aVar.f9760 = jSONObject.optBoolean("save");
            } else {
                aVar.f9760 = m7827.m9728(25);
            }
            if (jSONObject.has("share")) {
                aVar.f9761 = jSONObject.optBoolean("share");
            } else {
                aVar.f9761 = m7827.m9728(26);
            }
            if (jSONObject.has("share_text")) {
                aVar.f9762 = jSONObject.optString("share_text");
            } else {
                aVar.f9762 = d0.this.f8175.getTitle() + " " + d0.this.f8175.getUrl();
            }
            aVar.f9763 = jSONObject.optInt("startIndex", 0);
            aVar.f9765 = jSONObject.optInt("autoScrollInterval", 0);
            JSONArray optJSONArray = jSONObject.optJSONArray("items");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                aVar.f9764 = new ArrayList(optJSONArray.length());
                for (int i5 = 0; i5 < optJSONArray.length(); i5++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i5);
                    if (optJSONObject != null) {
                        i0.b bVar = new i0.b();
                        bVar.f9766 = optJSONObject.optString("url");
                        bVar.f9767 = optJSONObject.optString("text");
                        if (com.lt.app.c.m7967(bVar.f9766)) {
                            aVar.f9764.add(bVar);
                        }
                    }
                }
            }
            m10651.m10779(d0.this.f8175.getContext(), aVar);
        }

        public void showSplash(JSONObject jSONObject, i2.e eVar) {
            int i5;
            if (d0.this.f8175.getContext() instanceof n3.d) {
                com.lt.app.d.m8011((n3.d) d0.this.f8175.getContext(), App.m7827());
                i5 = 0;
            } else {
                i5 = 1;
            }
            d0.this.m8794(i5, null, eVar);
        }

        public void sidebarClose(JSONObject jSONObject, i2.e eVar) {
            if (m3.v.m10076() != null) {
                m3.v.m10076().m10079();
            }
        }

        public void sidebarHeader(JSONObject jSONObject, i2.e eVar) {
            if (m3.v.m10076() != null) {
                m3.v.m10076().m10080(jSONObject);
            }
        }

        public void sidebarIsOpen(JSONObject jSONObject, i2.e eVar) {
            d0.this.m8797(Boolean.valueOf(m3.v.m10076() != null && m3.v.m10076().m10081()), eVar);
        }

        public void sidebarOpen(JSONObject jSONObject, i2.e eVar) {
            if (m3.v.m10076() != null) {
                m3.v.m10076().m10082();
            }
        }

        public void sysShare(JSONObject jSONObject, i2.e eVar) {
            j2.m8937((l3.u) n3.z1.m10872(jSONObject.toString(), l3.u.class), d0.this.f8175.getContext(), eVar);
        }

        public void toast(JSONObject jSONObject, i2.e eVar) {
            String optString = jSONObject.optString("s");
            if (TextUtils.isEmpty(optString)) {
                return;
            }
            Toast.makeText(d0.this.f8175.getContext(), optString, 1).show();
        }

        public void uiActions(JSONObject jSONObject, i2.e eVar) {
            if (d0.this.f8175.getContext() instanceof y) {
                ((y) d0.this.f8175.getContext()).mo7947(jSONObject.optBoolean("b"));
            }
        }

        public void uiNavigation(JSONObject jSONObject, i2.e eVar) {
            if (d0.this.f8175.getContext() instanceof y) {
                ((y) d0.this.f8175.getContext()).mo7949(Boolean.valueOf(jSONObject.optBoolean("b")).booleanValue());
            }
        }

        public void uiRefresh(JSONObject jSONObject, i2.e eVar) {
            if (d0.this.f8175.getContext() instanceof y) {
                ((y) d0.this.f8175.getContext()).mo7946(jSONObject.optBoolean("b"));
            }
        }

        public void uiShare(JSONObject jSONObject, i2.e eVar) {
            if (d0.this.f8175.getContext() instanceof y) {
                ((y) d0.this.f8175.getContext()).mo7945(Boolean.valueOf(jSONObject.optBoolean("b")).booleanValue());
            }
        }

        public synchronized void upgrade(JSONObject jSONObject, i2.e eVar) {
            if (App.m7827() != null) {
                App m7835 = App.m7835();
                String m7842 = m7835.m7842("gu/?id=" + App.m7827().ltid);
                if (TextUtils.isEmpty(m7842)) {
                    n3.z1.m10909(m7835, m7835.getString(2131820808));
                } else {
                    l3.v vVar = (l3.v) n3.z1.m10872(jSONObject.toString(), l3.v.class);
                    new j(m7835, m7842).m8896((vVar == null || TextUtils.isEmpty(vVar.title)) ? m7835.getString(2131820777) : vVar.title, null);
                }
            }
        }

        public void vibrate(JSONObject jSONObject, i2.e eVar) {
            Vibrator vibrator = (Vibrator) d0.this.f8175.getContext().getSystemService("vibrator");
            if (vibrator != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    vibrator.vibrate(VibrationEffect.createOneShot(200L, -1));
                } else {
                    vibrator.vibrate(100L);
                }
            }
        }

        public void wxAppInstalled(JSONObject jSONObject, i2.e eVar) {
            d0.this.m8797(Boolean.valueOf(u2.m9053()), eVar);
        }

        public void wxLaunchMiniProgram(JSONObject jSONObject, i2.e eVar) {
            Context context = d0.this.f8175.getContext();
            if (!App.m7829(2130968576)) {
                Toast.makeText(context, 2131820798, 1).show();
                return;
            }
            if (!App.m7815(73, true)) {
                Toast.makeText(context, 2131820688, 1).show();
                return;
            }
            String optString = jSONObject.optString("user_name");
            if (!TextUtils.isEmpty(optString)) {
                u2.m9057(context, optString, jSONObject.optString("path"), jSONObject.optInt("type", 0), new g(eVar));
            } else {
                Toast.makeText(context, "Missing Parameter user_name", 1).show();
                d0.this.m8794(20, "Missing Parameter user_name", eVar);
            }
        }

        public void wxLogin(JSONObject jSONObject, final i2.e eVar) {
            com.lt.app.c.m7981(d0.this.f8175.getViewEx(), 2500);
            u2.m9058(d0.this.f8175.getContext(), new u2.a() { // from class: h3.w0
                @Override // h3.u2.a
                /* renamed from: ʻ */
                public final void mo8865(int i5, String str) {
                    this.f8408.m8812(eVar, i5, str);
                }
            });
        }

        public void wxOpenBusinessView(JSONObject jSONObject, final i2.e eVar) {
            Context context = d0.this.f8175.getContext();
            if (!App.m7829(2130968576)) {
                Toast.makeText(context, 2131820798, 1).show();
                return;
            }
            if (!App.m7815(222, true)) {
                Toast.makeText(context, 2131820688, 1).show();
                return;
            }
            t3.b bVar = new t3.b();
            String optString = jSONObject.optString("businessType");
            bVar.f11290 = optString;
            if (TextUtils.isEmpty(optString)) {
                Toast.makeText(context, "Missing Parameter businessType", 1).show();
                d0.this.m8794(20, "Missing Parameter businessType", eVar);
                return;
            }
            String optString2 = jSONObject.optString("query");
            bVar.f11291 = optString2;
            if (!TextUtils.isEmpty(optString2)) {
                u2.m9059(context, bVar, new u2.a() { // from class: h3.o0
                    @Override // h3.u2.a
                    /* renamed from: ʻ */
                    public final void mo8865(int i5, String str) {
                        this.f8320.m8813(eVar, i5, str);
                    }
                });
            } else {
                Toast.makeText(context, "Missing Parameter query", 1).show();
                d0.this.m8794(30, "Missing Parameter query", eVar);
            }
        }

        public void wxOpenCustomerServiceChat(JSONObject jSONObject, final i2.e eVar) {
            Context context = d0.this.f8175.getContext();
            if (!App.m7829(2130968576)) {
                Toast.makeText(context, 2131820798, 1).show();
                return;
            }
            if (!App.m7815(133, true)) {
                Toast.makeText(context, 2131820688, 1).show();
                return;
            }
            String optString = jSONObject.optString("corpId");
            if (TextUtils.isEmpty(optString)) {
                Toast.makeText(context, "Missing Parameter corpId", 1).show();
                d0.this.m8794(20, "Missing Parameter corpId", eVar);
                return;
            }
            String optString2 = jSONObject.optString("url");
            if (!TextUtils.isEmpty(optString2)) {
                u2.m9060(context, optString, optString2, new u2.a() { // from class: h3.l0
                    @Override // h3.u2.a
                    /* renamed from: ʻ */
                    public final void mo8865(int i5, String str) {
                        this.f8300.m8814(eVar, i5, str);
                    }
                });
            } else {
                Toast.makeText(context, "Missing Parameter url", 1).show();
                d0.this.m8794(30, "Missing Parameter url", eVar);
            }
        }

        public void wxOpenLaunchAppExtinfo(JSONObject jSONObject, i2.e eVar) {
            Context context = d0.this.f8175.getContext();
            if (!App.m7829(2130968576)) {
                Toast.makeText(context, 2131820798, 1).show();
            } else if (!App.m7815(118, true)) {
                Toast.makeText(context, 2131820688, 1).show();
            } else {
                d0.this.m8794(0, n3.z1.m10907(n3.z1.m10949(1).m10961("extinfo", u2.m9055()).m10960()), eVar);
            }
        }

        public void wxPay(JSONObject jSONObject, i2.e eVar) {
            Context context = d0.this.f8175.getContext();
            if (!App.m7829(2130968576)) {
                Toast.makeText(context, 2131820798, 1).show();
                d0.this.m8794(50, context.getString(2131820798), eVar);
                return;
            }
            if (!App.m7815(38, true)) {
                Toast.makeText(context, 2131820688, 0).show();
                return;
            }
            String optString = jSONObject.optString("appid");
            if (TextUtils.isEmpty(optString)) {
                d0.this.m8794(30, "Missing Parameter appid", eVar);
                return;
            }
            String optString2 = jSONObject.optString("partnerid");
            if (TextUtils.isEmpty(optString2)) {
                d0.this.m8794(40, "Missing Parameter partnerid", eVar);
                return;
            }
            String optString3 = jSONObject.optString("prepayid");
            if (TextUtils.isEmpty(optString3)) {
                d0.this.m8794(40, "Missing Parameter prepayid", eVar);
                return;
            }
            String optString4 = jSONObject.optString("noncestr");
            if (TextUtils.isEmpty(optString4)) {
                d0.this.m8794(40, "Missing Parameter noncestr", eVar);
                return;
            }
            String optString5 = jSONObject.optString("package");
            if (TextUtils.isEmpty(optString5)) {
                d0.this.m8794(40, "Missing Parameter package", eVar);
                return;
            }
            String optString6 = jSONObject.optString("timestamp");
            if (TextUtils.isEmpty(optString6)) {
                d0.this.m8794(40, "Missing Parameter timestamp", eVar);
                return;
            }
            String optString7 = jSONObject.optString("sign");
            if (TextUtils.isEmpty(optString7)) {
                d0.this.m8794(40, "Missing Parameter sign", eVar);
            } else {
                u2.m9061(optString, optString2, optString3, optString4, optString5, optString6, optString7, context, new e(eVar));
            }
        }

        public void wxSubscribeMsg(JSONObject jSONObject, i2.e eVar) {
            Context context = d0.this.f8175.getContext();
            if (!App.m7829(2130968576)) {
                Toast.makeText(context, 2131820798, 1).show();
                return;
            }
            if (!App.m7815(72, true)) {
                Toast.makeText(context, 2131820688, 1).show();
                return;
            }
            String optString = jSONObject.optString("template_id");
            if (TextUtils.isEmpty(optString)) {
                Toast.makeText(context, "Missing Parameter template_id", 1).show();
                d0.this.m8794(20, "Missing Parameter template_id", eVar);
                return;
            }
            int optInt = jSONObject.optInt("scene", 0);
            if (optInt >= 0 && optInt <= 10000) {
                u2.m9062(context, optString, optInt, new f(eVar));
            } else {
                Toast.makeText(context, "Parameter scene should be 0-10000", 1).show();
                d0.this.m8794(30, "Parameter scene should be 0-10000", eVar);
            }
        }

        /* synthetic */ c(d0 d0Var, a aVar) {
            this();
        }
    }
}
