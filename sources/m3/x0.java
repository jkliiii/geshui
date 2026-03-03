package m3;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import com.google.gson.Gson;
import com.lt.app.App;
import h3.t1;
import j2.f;
import j2.g;
import java.util.ArrayList;
import java.util.List;
import m3.u;

/* compiled from: LTWebChromeClient.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class x0 implements j2.e {

    /* renamed from: ʻ, reason: contains not printable characters */
    private String f9317 = "webview_granted_permissions";

    /* renamed from: ʼ, reason: contains not printable characters */
    private final String[] f9318 = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};

    /* renamed from: ʽ, reason: contains not printable characters */
    private u f9319 = null;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final g1 f9320;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final j2.f f9321;

    /* compiled from: LTWebChromeClient.java */
    class b implements ValueCallback<Uri[]> {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ ValueCallback f9325;

        b(ValueCallback valueCallback) {
            this.f9325 = valueCallback;
        }

        @Override // android.webkit.ValueCallback
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void onReceiveValue(Uri[] uriArr) {
            try {
                this.f9325.onReceiveValue(uriArr);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    public x0(j2.f fVar, g1 g1Var) {
        this.f9321 = fVar;
        this.f9320 = g1Var;
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    private void m10088(Context context, List<String> list, final n3.f<Boolean> fVar) {
        if (!(context instanceof n3.d)) {
            fVar.mo8742(Boolean.TRUE);
            return;
        }
        String[] strArr = new String[list.size()];
        list.toArray(strArr);
        ((n3.d) context).m10766(new n3.e() { // from class: m3.r0
            @Override // n3.e
            /* renamed from: ʻ */
            public final void mo8748(Object obj, Object obj2) {
                fVar.mo8742((Boolean) obj);
            }
        }, strArr);
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    private void m10091(Context context) {
        if (this.f9319 == null) {
            this.f9319 = new u(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᵢ, reason: contains not printable characters */
    public static /* synthetic */ void m10092(GeolocationPermissions.Callback callback, String str, Boolean bool, Boolean bool2) {
        callback.invoke(str, bool.booleanValue(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ⁱ, reason: contains not printable characters */
    public static /* synthetic */ void m10093(j2.c cVar, boolean z5, String str) {
        if (z5) {
            cVar.mo7801();
        } else {
            cVar.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ﹳ, reason: contains not printable characters */
    public static /* synthetic */ void m10094(j2.c cVar, boolean z5, String str) {
        if (z5) {
            cVar.mo7801();
        } else {
            cVar.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ﹶ, reason: contains not printable characters */
    public static /* synthetic */ void m10095(PermissionRequest permissionRequest, String[] strArr, Boolean bool) {
        if (bool.booleanValue()) {
            permissionRequest.grant(strArr);
        } else {
            permissionRequest.deny();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ﾞ, reason: contains not printable characters */
    public static /* synthetic */ void m10096(ValueCallback valueCallback, Uri[] uriArr) {
        Uri uri = (uriArr == null || uriArr.length <= 0) ? null : uriArr[0];
        Log.d("DDD openFileChooser", uri != null ? uri.toString() : "NULL");
        valueCallback.onReceiveValue(uri);
    }

    @Override // j2.e
    /* renamed from: ʻ */
    public boolean mo9295(j2.f fVar, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        String[] strArr;
        Intent intent;
        if (this.f9320 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("SDK_INT: ");
            int i5 = Build.VERSION.SDK_INT;
            sb.append(i5);
            Log.d("LTAPP", sb.toString());
            Log.d("LTAPP", "fileChooserParams: " + new Gson().toJson(fileChooserParams));
            if (i5 < 21 || fileChooserParams == null) {
                strArr = null;
                intent = null;
            } else {
                strArr = fileChooserParams.getAcceptTypes();
                intent = fileChooserParams.createIntent();
                if (fileChooserParams.getMode() == 1) {
                    intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                }
                intent.putExtra("k_is_capture_enabled", fileChooserParams.isCaptureEnabled());
            }
            this.f9320.mo9965(valueCallback != null ? new b(valueCallback) : null, intent, strArr);
        }
        return true;
    }

    @Override // j2.e
    /* renamed from: ʼ */
    public boolean mo9296(j2.f fVar, boolean z5, boolean z6, Message message) {
        Context context = fVar.getContext();
        f.c lTHitTestResult = fVar.getLTHitTestResult();
        if (lTHitTestResult != null && TextUtils.isEmpty(lTHitTestResult.m9308()) && !App.m7827().m9728(17)) {
            com.lt.app.c.m7984(context, fVar.getUrl(), message);
            return true;
        }
        j2.f m7962 = com.lt.app.c.m7962(context);
        m7962.setTransportWebView(message.obj);
        m7962.setWebViewClient(new a(context, fVar));
        message.sendToTarget();
        return true;
    }

    @Override // j2.e
    /* renamed from: ʾ */
    public boolean mo9298(j2.f fVar, String str, String str2, final j2.c cVar) {
        m10091(fVar.getContext());
        if (this.f9319.m10069(str2, new u.b() { // from class: m3.q0
            @Override // m3.u.b
            /* renamed from: ʻ */
            public final void mo8745(boolean z5, String str3) {
                x0.m10094(cVar, z5, str3);
            }
        })) {
            return true;
        }
        cVar.cancel();
        return true;
    }

    @Override // j2.e
    /* renamed from: ʿ */
    public void mo9299(final PermissionRequest permissionRequest) {
        final String[] resources = permissionRequest.getResources();
        if (resources == null || resources.length == 0) {
            permissionRequest.grant(resources);
            return;
        }
        ArrayList arrayList = new ArrayList(resources.length);
        for (String str : resources) {
            if ("android.webkit.resource.AUDIO_CAPTURE".equals(str)) {
                arrayList.add("android.permission.RECORD_AUDIO");
            } else if ("android.webkit.resource.VIDEO_CAPTURE".equals(str)) {
                arrayList.add("android.permission.CAMERA");
            }
        }
        if (arrayList.isEmpty()) {
            permissionRequest.grant(resources);
        } else {
            m10088(this.f9321.getContext(), arrayList, new n3.f() { // from class: m3.t0
                @Override // n3.f
                /* renamed from: ʻ */
                public final void mo8742(Object obj) {
                    x0.m10095(permissionRequest, resources, (Boolean) obj);
                }
            });
        }
    }

    @Override // j2.e
    /* renamed from: ˈ */
    public void mo9301(final String str, final GeolocationPermissions.Callback callback) {
        Context context = this.f9321.getContext();
        if (context instanceof com.lt.app.b) {
            ((com.lt.app.b) context).m10766(new n3.e() { // from class: m3.p0
                @Override // n3.e
                /* renamed from: ʻ */
                public final void mo8748(Object obj, Object obj2) {
                    x0.m10092(callback, str, (Boolean) obj, (Boolean) obj2);
                }
            }, this.f9318);
        } else {
            callback.invoke(str, true, true);
        }
    }

    @Override // j2.e
    /* renamed from: ˊ */
    public void mo9303(j2.f fVar, String str) {
        g1 g1Var = this.f9320;
        if (g1Var != null) {
            g1Var.mo9970(fVar, str);
        }
    }

    @Override // j2.e
    /* renamed from: ˋ */
    public void mo9304(final ValueCallback<Uri> valueCallback, String str, String str2) {
        g1 g1Var = this.f9320;
        if (g1Var != null) {
            g1Var.mo9965(new ValueCallback() { // from class: m3.u0
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    x0.m10096(valueCallback, (Uri[]) obj);
                }
            }, null, new String[]{str});
        }
    }

    @Override // j2.e
    /* renamed from: ˎ */
    public void mo9305(j2.f fVar) {
        Context context = fVar.getContext();
        if (context instanceof Activity) {
            ((Activity) context).finish();
        }
    }

    @Override // j2.e
    /* renamed from: ˏ */
    public boolean mo9306(j2.f fVar, String str, String str2, final j2.c cVar) {
        m10091(fVar.getContext());
        if (this.f9319.m10067(str2, new u.b() { // from class: m3.s0
            @Override // m3.u.b
            /* renamed from: ʻ */
            public final void mo8745(boolean z5, String str3) {
                x0.m10093(cVar, z5, str3);
            }
        })) {
            return true;
        }
        cVar.cancel();
        return true;
    }

    @Override // j2.e
    /* renamed from: ˑ */
    public void mo9307(j2.f fVar, int i5) {
        g1 g1Var = this.f9320;
        if (g1Var != null) {
            g1Var.mo9969(fVar, i5);
        }
    }

    @Override // j2.e
    /* renamed from: ʽ */
    public void mo9297() {
    }

    @Override // j2.e
    /* renamed from: ˆ */
    public void mo9300() {
    }

    /* compiled from: LTWebChromeClient.java */
    class a implements j2.g {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ Context f9322;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ j2.f f9323;

        a(Context context, j2.f fVar) {
            this.f9322 = context;
            this.f9323 = fVar;
        }

        @Override // j2.g
        /* renamed from: ʾ */
        public boolean mo9315(j2.f fVar, j2.i iVar) {
            return false;
        }

        @Override // j2.g
        /* renamed from: ʿ */
        public void mo9316(j2.f fVar, j2.b bVar, String str, String str2) {
            if (bVar != null) {
                bVar.cancel();
            }
        }

        @Override // j2.g
        /* renamed from: ˆ */
        public void mo9317(j2.f fVar, final g.a aVar) {
            new AlertDialog.Builder(fVar.getContext()).setMessage(fVar.getContext().getString(2131820855, aVar.mo7799())).setNegativeButton(2131820854, new DialogInterface.OnClickListener() { // from class: m3.v0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i5) {
                    aVar.mo7798();
                }
            }).setPositiveButton(2131820853, new DialogInterface.OnClickListener() { // from class: m3.w0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i5) {
                    aVar.cancel();
                }
            }).setCancelable(false).create().show();
        }

        @Override // j2.g
        /* renamed from: ˈ */
        public boolean mo9318(j2.f fVar, j2.i iVar) {
            l3.d dVar;
            l3.d dVar2;
            String str = iVar.f8639;
            if (!com.lt.app.c.m7967(str)) {
                com.lt.app.c.m7978(this.f9322, str, this.f9323.getUrl(), false);
                return true;
            }
            String m9051 = t1.m9051(str);
            l3.a m7827 = App.m7827();
            if ("browser".equals(m9051) || !(m7827 == null || (dVar2 = m7827.page) == null || !dVar2.m9737(str))) {
                com.lt.app.c.m7978(this.f9322, str, this.f9323.getUrl(), true);
                return true;
            }
            if ("self".equals(m9051) || !(m7827 == null || (dVar = m7827.page) == null || !dVar.m9738(str))) {
                this.f9323.loadUrl(str, App.m7835().m7857(this.f9323.getUrl()));
                return true;
            }
            boolean m7815 = App.m7815(1, true);
            if (m7815) {
                t1 m9049 = t1.m9049(str);
                m7815 = m9049.f8378 ? m9049.f8379 : App.m7827().m9728(2);
            }
            if (!m7815 || App.m7827().m9728(17)) {
                this.f9323.loadUrl(str, App.m7835().m7857(this.f9323.getUrl()));
            } else {
                com.lt.app.c.m7978(this.f9322, str, this.f9323.getUrl(), false);
            }
            return true;
        }

        @Override // j2.g
        /* renamed from: ˊ */
        public WebResourceResponse mo9320(j2.f fVar, String str) {
            return null;
        }

        @Override // j2.g
        /* renamed from: ʻ */
        public void mo9312(j2.f fVar, String str) {
        }

        @Override // j2.g
        /* renamed from: ˉ */
        public void mo9319(j2.f fVar, String str) {
        }

        @Override // j2.g
        /* renamed from: ʼ */
        public void mo9313(j2.f fVar, String str, Bitmap bitmap) {
        }

        @Override // j2.g
        /* renamed from: ʽ */
        public void mo9314(j2.f fVar, String str, boolean z5) {
        }
    }
}
