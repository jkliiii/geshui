package com.lt.app;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.widget.PopupWindow;
import android.widget.Toast;
import androidx.appcompat.app.b;
import androidx.core.app.r;
import com.t;
import h3.l;
import h3.q1;
import h3.r1;
import j2.f;
import j2.h;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import n3.a1;
import n3.d;
import n3.f;
import n3.i0;
import n3.z1;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: UiHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class c {

    /* renamed from: ʻ, reason: contains not printable characters */
    static Message f6725;

    /* compiled from: UiHelper.java */
    class a implements d.a {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ n3.d f6726;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ f f6727;

        a(n3.d dVar, f fVar) {
            this.f6726 = dVar;
            this.f6727 = fVar;
        }

        @Override // n3.d.a
        /* renamed from: ʻ, reason: contains not printable characters */
        public void mo7987(int i5, int i6, Intent intent) {
            if (i5 == 234) {
                this.f6726.m10768(null);
                this.f6727.mo8742(intent != null ? intent.getStringExtra("present_result") : BuildConfig.FLAVOR);
            }
        }
    }

    /* compiled from: UiHelper.java */
    class b implements f.d {
        b() {
        }

        @Override // j2.f.d
        /* renamed from: ʻ, reason: contains not printable characters */
        public void mo7988(j2.f fVar) {
            c.m7982(fVar);
        }
    }

    /* compiled from: UiHelper.java */
    /* renamed from: com.lt.app.c$c, reason: collision with other inner class name */
    class C0095c implements ValueCallback<String> {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ l3.a f6728;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ Context f6729;

        C0095c(l3.a aVar, Context context) {
            this.f6728 = aVar;
            this.f6729 = context;
        }

        @Override // android.webkit.ValueCallback
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void onReceiveValue(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONArray optJSONArray = jSONObject.optJSONArray("items");
                if (optJSONArray != null && optJSONArray.length() != 0) {
                    i0.a aVar = new i0.a();
                    aVar.f9764 = new ArrayList(optJSONArray.length());
                    int i5 = 0;
                    for (int i6 = 0; i6 < optJSONArray.length(); i6++) {
                        String optString = optJSONArray.optJSONObject(i6).optString("url");
                        if (!TextUtils.isEmpty(optString)) {
                            i0.b bVar = new i0.b();
                            bVar.f9766 = optString;
                            aVar.f9764.add(bVar);
                        }
                    }
                    if (aVar.f9764.size() == 0) {
                        return;
                    }
                    aVar.f9762 = jSONObject.optString("share_text");
                    if (this.f6728.m9728(28)) {
                        i5 = 1;
                    } else if (this.f6728.m9728(29)) {
                        i5 = 2;
                    }
                    aVar.f9759 = i5;
                    aVar.f9760 = this.f6728.m9728(25);
                    aVar.f9761 = this.f6728.m9728(26);
                    i0 m10651 = a1.m10651();
                    if (m10651 == null) {
                        c.m7959(this.f6729, 2131820778);
                    } else {
                        m10651.m10779(this.f6729, aVar);
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* compiled from: UiHelper.java */
    class d implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ Context f6730;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ int f6731;

        d(Context context, int i5) {
            this.f6730 = context;
            this.f6731 = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            Toast.makeText(this.f6730, this.f6731, 1).show();
        }
    }

    /* compiled from: UiHelper.java */
    class e implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ r1 f6732;

        e(r1 r1Var) {
            this.f6732 = r1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f6732.isShowing()) {
                this.f6732.dismiss();
            }
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static void m7958(Context context, String str, String str2, DialogInterface.OnDismissListener onDismissListener) {
        b.a aVar = new b.a(context);
        if (TextUtils.isEmpty(str)) {
            str = App.m7812(2131820712);
        }
        b.a positiveButton = aVar.setTitle(str).setMessage(str2).setCancelable(false).setPositiveButton(2131820779, (DialogInterface.OnClickListener) null);
        if (onDismissListener != null) {
            positiveButton = positiveButton.setOnDismissListener(onDismissListener);
        }
        positiveButton.create().show();
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public static void m7959(Context context, int i5) {
        if (context instanceof Activity) {
            ((Activity) context).runOnUiThread(new d(context, i5));
        } else {
            Toast.makeText(context, i5, 1).show();
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static void m7960(j2.f fVar, boolean z5) {
        Context context = fVar.getContext();
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setFlags(67108864);
        intent.addFlags(536870912);
        intent.putExtra("com.lt.app.k_loadhomepage", z5);
        context.startActivity(intent);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static boolean m7961(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return URLUtil.isHttpsUrl(str) || URLUtil.isHttpUrl(str) || str.startsWith("file://") || str.startsWith("ws:") || str.startsWith("fs://");
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static j2.f m7962(Context context) {
        j2.f m8142 = t.m8142(context, App.m7835().m7839());
        a1.m10627(m8142);
        l3.a m7827 = App.m7827();
        if (m7827.m9728(16) && (m8142 instanceof h)) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("standardFullScreen", false);
            bundle.putBoolean("supportLiteWnd", false);
            bundle.putInt("DefaultVideoScreen", 2);
            ((h) m8142).m9321(bundle);
        }
        m8142.mo7791(z1.m10885(context, "ym.js"));
        m8142.setDownloadListener(new l(context));
        m8142.setGeolocationEnabled(App.m7815(9, true));
        if (App.m7815(26, true) && m7827.m9728(30)) {
            m8142.setOnDoubleClickListener(new b());
        }
        return m8142;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static void m7963(Context context) {
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setFlags(67108864);
        intent.addFlags(536870912);
        intent.putExtra("_exit", true);
        context.startActivity(intent);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static Uri m7964(File file) {
        return z1.m10943(App.m7835(), file);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public static boolean m7965(Context context, int i5) {
        if (i5 == 1 || i5 == 2) {
            LocationManager locationManager = (LocationManager) context.getSystemService("location");
            if (locationManager == null) {
                return false;
            }
            return i5 == 1 ? locationManager.isProviderEnabled("gps") : locationManager.isProviderEnabled("network");
        }
        if (i5 == 3) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            return defaultAdapter != null && defaultAdapter.isEnabled();
        }
        if (i5 != 6) {
            return false;
        }
        return r.m1982(context).m1983();
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public static int m7966(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        return identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : z1.m10946(context, 24.0f);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static boolean m7967(String str) {
        return URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static void m7968(Context context) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", context.getPackageName(), null));
            context.startActivity(intent);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static void m7969(Context context) {
        Intent intent = new Intent();
        if (Build.VERSION.SDK_INT >= 26) {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        } else {
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        }
        try {
            context.startActivity(intent);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static void m7970(Context context, int i5) {
        String str;
        switch (i5) {
            case 1:
                str = "android.settings.LOCATION_SOURCE_SETTINGS";
                break;
            case 2:
                str = "android.settings.WIFI_SETTINGS";
                break;
            case 3:
                str = "android.settings.BLUETOOTH_SETTINGS";
                break;
            case 4:
                str = "android.settings.DISPLAY_SETTINGS";
                break;
            case 5:
                str = "android.settings.SOUND_SETTINGS";
                break;
            case 6:
                m7969(context);
                return;
            case 7:
                str = "android.settings.LOCALE_SETTINGS";
                break;
            case 8:
                str = "android.settings.NFC_SETTINGS";
                break;
            default:
                str = null;
                break;
        }
        if (TextUtils.isEmpty(str)) {
            str = "android.settings.SETTINGS";
        }
        try {
            context.startActivity(new Intent(str));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public static void m7971(String str, n3.d dVar, n3.f<String> fVar) {
        Intent intent = new Intent(dVar, (Class<?>) PresentActivity.class);
        intent.putExtra("present_model", str);
        dVar.m10768(new a(dVar, fVar));
        dVar.startActivityForResult(intent, 234);
    }

    /* renamed from: י, reason: contains not printable characters */
    public static void m7972(Application application) {
        ((AlarmManager) application.getSystemService("alarm")).set(0, System.currentTimeMillis() + 200, PendingIntent.getActivity(application.getApplicationContext(), 0, z1.m10942(application, null), 67108864));
        System.exit(0);
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private static void m7973(Activity activity, boolean z5) {
        Class<?> cls = activity.getWindow().getClass();
        try {
            Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i5 = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
            Class<?> cls3 = Integer.TYPE;
            Method method = cls.getMethod("setExtraFlags", cls3, cls3);
            Window window = activity.getWindow();
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(z5 ? i5 : 0);
            objArr[1] = Integer.valueOf(i5);
            method.invoke(window, objArr);
        } catch (Exception unused) {
        }
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    private static void m7974(Activity activity, boolean z5) {
        try {
            WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
            Field declaredField = WindowManager.LayoutParams.class.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON");
            Field declaredField2 = WindowManager.LayoutParams.class.getDeclaredField("meizuFlags");
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            int i5 = declaredField.getInt(null);
            int i6 = declaredField2.getInt(attributes);
            declaredField2.setInt(attributes, z5 ? i6 | i5 : (i5 ^ (-1)) & i6);
            activity.getWindow().setAttributes(attributes);
        } catch (Exception unused) {
        }
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public static void m7975(String str, n3.d dVar) {
        Intent intent = new Intent();
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        intent.putExtra("present_result", str);
        dVar.setResult(-1, intent);
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    public static boolean m7976(Context context, String str, q1 q1Var) {
        Intent intent;
        if (context == null) {
            return false;
        }
        if (m7961(str)) {
            intent = new Intent(context, (Class<?>) WebActivity.class);
        } else {
            intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(268435456);
        }
        try {
            intent.setData(Uri.parse(str));
            if (q1Var != null) {
                intent.putExtra("com.lt.app.k_options", q1Var.m9033());
            }
            context.startActivity(intent);
            return true;
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public static void m7977(Activity activity, boolean z5) {
        m7973(activity, !z5);
        m7974(activity, !z5);
        if (Build.VERSION.SDK_INT >= 23) {
            View decorView = activity.getWindow().getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z5 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
        }
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public static boolean m7978(Context context, String str, String str2, boolean z5) {
        Intent intent;
        if (context == null || TextUtils.isEmpty(str) || str.startsWith("about:")) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (z5 || !m7961(str)) {
            intent = new Intent("android.intent.action.VIEW");
        } else {
            intent = new Intent(context, (Class<?>) WebActivity.class);
            if (!TextUtils.isEmpty(str2)) {
                intent.putExtra("com.lt.app.k_referer", str2);
            }
        }
        try {
            intent.setData(parse);
            context.startActivity(intent);
            return true;
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public static void m7979(View view, int i5) {
        z1.m10903(view, i5);
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public static PopupWindow m7980(View view) {
        return m7981(view, 0);
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    public static PopupWindow m7981(View view, int i5) {
        l3.a m7827 = App.m7827();
        r1 m9034 = r1.m9034(view.getContext(), m7827 != null ? m7827.ls : 0);
        m9034.m9036(view);
        if (i5 > 0) {
            view.postDelayed(new e(m9034), i5);
        }
        return m9034;
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    public static boolean m7982(j2.f fVar) {
        Context context = fVar.getContext();
        if (!App.m7815(26, true)) {
            m7959(context, 2131820688);
            return false;
        }
        l3.a m7827 = App.m7827();
        fVar.evaluateJavascript(String.format(Locale.ROOT, "(function (w, h) {\n    var r = {\n        share_text: document.title + ' ' + location.href,\n        items: []\n    };\n    var imgs = document.getElementsByTagName('img');\n    for (var i = 0; i < imgs.length; i++) {\n        var img = imgs[i];\n        if ((img.width >= w) && (img.height >= h)) {\n            r.items.push({ url: img.src });\n        }\n    }\n    return r;\n})(%d, %d);", Integer.valueOf(m7827.m26w), Integer.valueOf(m7827.m26h)), new C0095c(m7827, context));
        return true;
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    static void m7983(Context context, Uri uri, Bundle bundle) {
        z1.m10905(context, uri, bundle);
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    public static void m7984(Context context, String str, Message message) {
        if (message == null) {
            return;
        }
        f6725 = message;
        Intent intent = new Intent(context, (Class<?>) WebActivity.class);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("com.lt.app.k_referer", str);
        }
        try {
            context.startActivity(intent);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    public static void m7985(Context context, String str) {
        m7986(context, str, false);
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public static void m7986(Context context, String str, boolean z5) {
        m7978(context, str, null, z5);
    }
}
