package i2;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import j2.f;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WVJBWebView.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class k extends WebView implements j2.f {

    /* renamed from: ʾ, reason: contains not printable characters */
    private ArrayList<i2.d> f8571;

    /* renamed from: ʿ, reason: contains not printable characters */
    private Map<String, e> f8572;

    /* renamed from: ˆ, reason: contains not printable characters */
    private Map<String, Object> f8573;

    /* renamed from: ˈ, reason: contains not printable characters */
    private long f8574;

    /* renamed from: ˉ, reason: contains not printable characters */
    private d f8575;

    /* renamed from: ˊ, reason: contains not printable characters */
    private String f8576;

    /* renamed from: ˋ, reason: contains not printable characters */
    private i2.b f8577;

    /* compiled from: WVJBWebView.java */
    class a extends e {

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ f.b f8578;

        a(f.b bVar) {
            this.f8578 = bVar;
        }

        @Override // i2.e
        /* renamed from: ʻ */
        public void mo9222(Object obj) {
            Object obj2;
            boolean z5;
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                z5 = jSONObject.optBoolean("ok");
                obj2 = jSONObject.opt("data");
            } else {
                obj2 = null;
                z5 = false;
            }
            this.f8578.mo8747(z5, obj2);
        }
    }

    /* compiled from: WVJBWebView.java */
    class b extends e {

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ String f8580;

        b(String str) {
            this.f8580 = str;
        }

        @Override // i2.e
        /* renamed from: ʼ */
        public void mo9223(Object obj, boolean z5) {
            i2.d dVar = new i2.d();
            dVar.f8561 = this.f8580;
            dVar.f8562 = obj;
            dVar.f8563 = z5;
            dVar.f8564 = this.f8565;
            k.this.m9225(dVar);
        }
    }

    /* compiled from: WVJBWebView.java */
    public interface c {
        /* renamed from: ʻ */
        void mo7775(String str);
    }

    public k(Context context) {
        super(context);
        this.f8571 = new ArrayList<>();
        this.f8572 = new HashMap();
        this.f8573 = null;
        this.f8574 = 0L;
        this.f8575 = new d(this, null);
        this.f8577 = null;
        mo7795();
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    private JSONObject m9224(i2.d dVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = dVar.f8559;
            if (str != null) {
                jSONObject.put("callbackId", str);
            }
            Object obj = dVar.f8558;
            if (obj != null) {
                jSONObject.put("data", obj);
            }
            String str2 = dVar.f8560;
            if (str2 != null) {
                jSONObject.put("handlerName", str2);
            }
            String str3 = dVar.f8561;
            if (str3 != null) {
                jSONObject.put("responseId", str3);
            }
            Object obj2 = dVar.f8562;
            if (obj2 != null) {
                jSONObject.put("responseData", obj2);
            }
            if (dVar.f8563) {
                jSONObject.put("keepResponseId", true);
            }
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʼʼ, reason: contains not printable characters */
    public void m9225(i2.d dVar) {
        ArrayList<i2.d> arrayList = this.f8571;
        if (arrayList != null) {
            arrayList.add(dVar);
        } else {
            m9243(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʽʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void m9235(String str) {
        if (TextUtils.isEmpty(str) || !str.trim().startsWith("[")) {
            return;
        }
        Log.d("processMessageQueue:", str);
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                i2.d m9238 = m9238(jSONArray.getJSONObject(i5));
                String str2 = m9238.f8561;
                if (str2 != null) {
                    e remove = this.f8572.remove(str2);
                    if (remove != null) {
                        remove.mo9222(m9238.f8562);
                    }
                } else {
                    String str3 = m9238.f8559;
                    b bVar = str3 != null ? new b(str3) : null;
                    i2.b bVar2 = this.f8577;
                    if (bVar2 == null || !bVar2.mo8806(m9238, bVar)) {
                        Log.e("WebViewJavascriptBridge", "No handler for message from JS:" + m9238.f8560);
                    }
                }
            }
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
    }

    /* renamed from: ʿʿ, reason: contains not printable characters */
    private void m9227(Object obj, e eVar, String str) {
        if (obj == null && TextUtils.isEmpty(str)) {
            return;
        }
        i2.d dVar = new i2.d();
        if (obj != null) {
            dVar.f8558 = obj;
        }
        if (eVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("java_cb_");
            long j5 = this.f8574 + 1;
            this.f8574 = j5;
            sb.append(j5);
            String sb2 = sb.toString();
            this.f8572.put(sb2, eVar);
            dVar.f8559 = sb2;
        }
        if (str != null) {
            dVar.f8560 = str;
        }
        m9225(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    public /* synthetic */ void m9233(c cVar, String str) {
        if (cVar != null) {
            if (str != null && str.startsWith("\"") && str.endsWith("\"")) {
                str = str.substring(1, str.length() - 1).replaceAll("\\\\\\\\", "\\\\").replaceAll("\\\\\"", "\"");
            }
            cVar.mo7775(str);
            return;
        }
        if (TextUtils.isEmpty(str) || "null".equals(str) || "undefined".equals(str)) {
            return;
        }
        m9235(str);
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    private String m9234(InputStream inputStream) {
        String str = BuildConfig.FLAVOR;
        try {
            Scanner useDelimiter = new Scanner(inputStream, "UTF-8").useDelimiter("\\A");
            if (useDelimiter.hasNext()) {
                str = useDelimiter.next();
            }
            inputStream.close();
        } catch (IOException e5) {
            e5.printStackTrace();
        }
        return str;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    private String m9236(String str) {
        return str.replace("\\", "\\\\").replace("\"", "\\\"").replace("'", "\\'").replace("\n", "\\n").replace("\r", "\\r").replace("\f", "\\f");
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    private void m9237(String str) {
        m9244(str, new c() { // from class: i2.j
            @Override // i2.k.c
            /* renamed from: ʻ */
            public final void mo7775(String str2) {
                this.f8570.m9240(str2);
            }
        });
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    private i2.d m9238(JSONObject jSONObject) {
        i2.d dVar = new i2.d();
        try {
            if (jSONObject.has("callbackId")) {
                dVar.f8559 = jSONObject.getString("callbackId");
            }
            if (jSONObject.has("data")) {
                dVar.f8558 = jSONObject.get("data");
            }
            if (jSONObject.has("handlerName")) {
                dVar.f8560 = jSONObject.getString("handlerName");
            }
            if (jSONObject.has("responseId")) {
                dVar.f8561 = jSONObject.getString("responseId");
            }
            if (jSONObject.has("responseData")) {
                dVar.f8562 = jSONObject.get("responseData");
            }
        } catch (JSONException e5) {
            e5.printStackTrace();
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ﾞ, reason: contains not printable characters */
    public static /* synthetic */ void m9239(i2.d dVar, String str) {
        dVar.f8564.mo8877(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public /* synthetic */ void m9240(String str) {
        if (TextUtils.isEmpty(str) || "null".equals(str) || "undefined".equals(str)) {
            return;
        }
        m9235(str);
    }

    @Override // j2.f
    public boolean getJsBridgeInjected() {
        return !TextUtils.isEmpty(this.f8576);
    }

    public abstract /* synthetic */ f.c getLTHitTestResult();

    public abstract /* synthetic */ String getUserAgent();

    public abstract /* synthetic */ View getViewEx();

    public abstract /* synthetic */ j2.e getWebChromeClientEx();

    public abstract /* synthetic */ void setDownloadListener(j2.a aVar);

    public abstract /* synthetic */ void setErrorUrl(String str);

    public abstract /* synthetic */ void setForceDark(Boolean bool);

    public abstract /* synthetic */ void setGeolocationEnabled(boolean z5);

    @Override // j2.f
    public void setLtHandler(i2.b bVar) {
        this.f8577 = bVar;
    }

    public abstract /* synthetic */ void setOnDoubleClickListener(f.d dVar);

    public abstract /* synthetic */ void setTransportWebView(Message message);

    public abstract /* synthetic */ void setTransportWebView(Object obj);

    public abstract /* synthetic */ void setVScrollListener(j2.d dVar);

    public abstract /* synthetic */ void setWebChromeClient(j2.e eVar);

    public abstract /* synthetic */ void setWebViewClient(j2.g gVar);

    @Override // j2.f
    /* renamed from: ˈ, reason: contains not printable characters */
    public void mo9241(String str, Object obj, f.b bVar) {
        if (getJsBridgeInjected()) {
            m9242(str, obj, bVar != null ? new a(bVar) : null);
        } else if (bVar != null) {
            bVar.mo8747(false, null);
        }
    }

    @Override // i2.a
    /* renamed from: ˊ */
    public void mo9217() {
        m9244("WebViewJavascriptBridge._fetchQueue()", new c() { // from class: i2.i
            @Override // i2.k.c
            /* renamed from: ʻ */
            public final void mo7775(String str) {
                this.f8569.m9235(str);
            }
        });
    }

    @Override // i2.a
    /* renamed from: ˎ */
    public void mo9218() {
        try {
            if (TextUtils.isEmpty(this.f8576)) {
                this.f8576 = m9234(getResources().getAssets().open("WebViewJavascriptBridge.js"));
            }
            m9237(this.f8576);
        } catch (IOException e5) {
            e5.printStackTrace();
        }
        ArrayList<i2.d> arrayList = this.f8571;
        if (arrayList != null) {
            Iterator<i2.d> it = arrayList.iterator();
            while (it.hasNext()) {
                m9243(it.next());
            }
            this.f8571 = null;
        }
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public void m9242(String str, Object obj, e eVar) {
        m9227(obj, eVar, str);
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public void m9243(final i2.d dVar) {
        String str;
        String m9236 = m9236(m9224(dVar).toString());
        if (TextUtils.isEmpty(dVar.f8559)) {
            str = "return \"\";";
        } else {
            str = "return [{\"responseId\":\"" + dVar.f8559 + "\",\"responseData\":{\"ok\":false}}];";
        }
        m9244("(function(){try {return WebViewJavascriptBridge._handleMessageFromJava('" + m9236 + "');}catch(e){ " + str + " }})()", dVar.f8564 == null ? null : new c() { // from class: i2.h
            @Override // i2.k.c
            /* renamed from: ʻ */
            public final void mo7775(String str2) {
                k.m9239(dVar, str2);
            }
        });
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    protected void m9244(String str, final c cVar) {
        if (!TextUtils.isEmpty(str) && str.startsWith("javascript:")) {
            str = str.substring(11);
        }
        super.evaluateJavascript(str, new ValueCallback() { // from class: i2.g
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                this.f8566.m9233(cVar, (String) obj);
            }
        });
    }

    /* renamed from: ﹳ */
    public void mo7795() {
        getSettings().setJavaScriptEnabled(true);
        addJavascriptInterface(this.f8575, "WebViewJavascriptBridgeInterface");
        getSettings().setSavePassword(false);
    }

    /* compiled from: WVJBWebView.java */
    private class d {

        /* renamed from: ʻ, reason: contains not printable characters */
        Map<String, c> f8582;

        private d() {
            this.f8582 = new HashMap();
        }

        @JavascriptInterface
        public void onResultForScript(String str, String str2) {
            c remove = this.f8582.remove(str);
            if (remove != null) {
                remove.mo7775(str2);
            }
        }

        /* synthetic */ d(k kVar, a aVar) {
            this();
        }
    }
}
